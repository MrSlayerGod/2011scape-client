package rs2.client.loading.library;

import com.jagex.core.io.FileCache;
import com.jagex.core.io.Files;
import com.jagex.js5.js5;
import com.jagex.sign.SignLink;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import rs2.client.ClientInfo;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Hashtable;

public final class LibraryManager {

    private static boolean debug = false;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static final Hashtable libraries = new Hashtable();

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable nativeLibraries = new Hashtable();

    // $FF: synthetic field
    @OriginalMember(owner = "client!cu", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class aClass6;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!sb;")
    public static js5 dlls;

    @OriginalMember(owner = "client!cu", name = "Y", descriptor = "Lclient!vq;")
    public static SignLink signLink;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Ljava/lang/String;")
    public static String path;

    @OriginalMember(owner = "client!qla", name = "a", descriptor = "(ILclient!sb;Lclient!vq;)V")
    public static void init(@OriginalArg(1) js5 dlls, @OriginalArg(2) SignLink signLink) {
        LibraryManager.dlls = dlls;
        LibraryManager.signLink = signLink;

        path = "";

        if (ClientInfo.osName.startsWith("win")) {
            path = path + "windows/";
        } else if (ClientInfo.osName.startsWith("linux")) {
            path = path + "linux/";
        } else if (ClientInfo.osName.startsWith("mac")) {
            path = path + "macos/";
        }

        if (LibraryManager.signLink.microsoftjava) {
            path = path + "msjava/";
        } else if (ClientInfo.osArch.startsWith("amd64") || ClientInfo.osArch.startsWith("x86_64")) {
            path = path + "x86_64/";
        } else if (ClientInfo.osArch.startsWith("i386") || ClientInfo.osArch.startsWith("i486") || ClientInfo.osArch.startsWith("i586") || ClientInfo.osArch.startsWith("x86")) {
            path = path + "x86/";
        } else if (ClientInfo.osArch.startsWith("ppc")) {
            path = path + "ppc/";
        } else {
            path = path + "universal/";
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static int loadLibrary(@OriginalArg(1) String name) {
        if (!signLink.signed) {
            return -1;
        } else if (libraries.containsKey(name)) {
            return 100;
        } else {
            @Pc(22) String nameWithExtension = addNativeFileExtension(name);
            if (nameWithExtension == null) {
                if (debug) {
                    System.out.println("Unsupported operating system: " + signLink.osNameLower);
                }

                return -1;
            }

            @Pc(36) String fileName = path + nameWithExtension;

            if (!dlls.fileExists(fileName, "")) {
                if (debug) {
                    System.out.println("Library download failed (library doesn\'t exist): " + fileName);
                }

                return -1;
            }

            if (dlls.requestgroupdownload(fileName)) {
                // j.info("retrieving " + fileName);

                @Pc(62) byte[] data = dlls.getfile(fileName, "");
                @Pc(68) File file;
                try {
                    file = FileCache.get(nameWithExtension);
                } catch (@Pc(70) RuntimeException ignored) {
                    return -1;
                }

                if (data == null || file == null) {
                    return -1;
                }

                @Pc(80) boolean same = true;
                @Pc(84) byte[] old = Files.read(file);
                if (old != null && old.length == data.length) {
                    for (@Pc(99) int i = 0; i < old.length; i++) {
                        if (data[i] != old[i]) {
                            same = false;
                            break;
                        }
                    }
                } else {
                    same = false;
                }

                try {
                    if (!same) {
                        signLink.writeFile(file, data);
                    }
                } catch (@Pc(145) Throwable ignored) {
                    return -1;
                }

                if (debug) {
                    System.out.println("Registered library " + name + ": " + file.getPath());
                }

                putLibrary(file, name);
                return 100;
            } else {
                return dlls.completePercentage(fileName);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String addNativeFileExtension(@OriginalArg(1) String name) {
        if (ClientInfo.osName.startsWith("win")) {
            return name + ".dll";
        } else if (ClientInfo.osName.startsWith("linux")) {
            return "lib" + name + ".so";
        } else if (ClientInfo.osName.startsWith("mac")) {
            return "lib" + name + ".dylib";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
    public static void putLibrary(@OriginalArg(0) File file, @OriginalArg(1) String name) {
        libraries.put(name, file);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static boolean isLoaded(@OriginalArg(0) String name) {
        return libraries.containsKey(name);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Z")
    public static boolean loadNative(@OriginalArg(0) Class libraryClazz, @OriginalArg(2) String name) {
        @Pc(15) Class nativeClazz = (Class) nativeLibraries.get(name);

        // Check if the native library is already loaded
        if (nativeClazz != null) {
            if (debug) {
                System.out.println("Native library already loaded in another class loader: " + signLink.osNameLower);
            }
            return nativeClazz.getClassLoader() == libraryClazz.getClassLoader();
        }

        @Pc(31) File file = null;

        // Retrieve the file associated with the library name
        if (file == null) {
            file = (File) libraries.get(name);
        }

        if (file != null) {
            try {
                // Resolve the canonical path of the library file
                file = new File(file.getCanonicalPath());

                // Securely load the native library using System.load()
                System.load(file.getPath());

                // Register the loaded library
                nativeLibraries.put(name, libraryClazz);

                if (debug) {
                    System.out.println("Loaded " + name);
                }

                return true; // Successfully loaded the library

            } catch (@Pc(120) UnsatisfiedLinkError e) {
                // Handle errors related to loading the native library
                if (debug) {
                    System.out.println(name + " load failed");
                    e.printStackTrace();
                }
            } catch (@Pc(130) Throwable throwable) {
                // Handle any other unexpected errors
                if (debug) {
                    System.out.println("Unexpected error while loading " + name);
                    throwable.printStackTrace();
                }
            }
        }

        return false; // Return false if the library could not be loaded
    }

    static Class getClass(String name) {
        Class instance;
        try {
            instance = Class.forName(name);
        } catch (ClassNotFoundException ex) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
        }
        return instance;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static boolean isNativeLoaded(@OriginalArg(0) String arg0) {
        return nativeLibraries.containsKey(arg0);
    }

    private LibraryManager() {
        /* empty */
    }
}
