import com.jagex.Constants;
import com.jagex.SignLink;
import com.jagex.SignedResource;
import com.jagex.core.util.JagException;
import com.jagex.core.util.JavaScript;
import com.jagex.core.util.SystemTimer;
import com.jagex.core.util.TimeUtils;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

@OriginalClass("client!kh")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "[F")
    public static final float[] aFloatArray15 = new float[16384];

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "[F")
    public static final float[] aFloatArray14 = new float[16384];

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Ljava/applet/Applet;")
    public static Applet loaderApplet;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Z")
    public boolean aBoolean157 = false;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Z")
    public boolean errored = false;

    static {
        @Pc(433) double local433 = 3.834951969714103E-4D;
        for (@Pc(435) int local435 = 0; local435 < 16384; local435++) {
            aFloatArray15[local435] = (float) Math.sin(local433 * (double) local435);
            aFloatArray14[local435] = (float) Math.cos((double) local435 * local433);
        }
    }

    @OriginalMember(owner = "client!kh", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
        loaderApplet = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
    public void method1632(@OriginalArg(1) boolean arg0) {
        synchronized (this) {
            if (Static250.aBoolean311) {
                return;
            }
            Static250.aBoolean311 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (loaderApplet != null) {
            loaderApplet.destroy();
        }
        try {
            this.method1633();
        } catch (@Pc(42) Exception local42) {
        }
        if (this.aBoolean157) {
            try {
                jagmisc.quit();
            } catch (@Pc(48) Throwable local48) {
            }
            this.aBoolean157 = false;
        }
        Static307.method4480();
        Static501.method6714();
        if (Static434.aCanvas7 != null) {
            try {
                Static434.aCanvas7.removeFocusListener(this);
                Static434.aCanvas7.getParent().remove(Static434.aCanvas7);
            } catch (@Pc(68) Exception local68) {
            }
        }
        if (SignLink.instance != null) {
            try {
                SignLink.instance.stop();
            } catch (@Pc(76) Exception local76) {
            }
        }
        this.method1637();
        if (Static353.aFrame10 != null) {
            Static353.aFrame10.setVisible(false);
            Static353.aFrame10.dispose();
            Static353.aFrame10 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "(I)V")
    protected abstract void method1633();

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Z")
    public final boolean method1634() {
        return Static14.loadNativeLibrary("jagmisc");
    }

    @OriginalMember(owner = "client!kh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIIIZLjava/lang/String;I)V")
    protected final void method1635(@OriginalArg(3) int arg0, @OriginalArg(6) String arg1) {
        try {
            Constants.sourceApplet = null;
            Constants.clientBuild = 667;
            Static680.anInt10289 = 1024;
            Static52.anInt1059 = 1024;
            Static241.anInt3962 = 0;
            Static134.anInt10329 = 0;
            Static380.anInt5979 = 768;
            Static54.anInt1084 = 768;
            Static149.anGameShell = this;
            Static353.aFrame10 = new Frame();
            Static353.aFrame10.setTitle("Jagex");
            Static353.aFrame10.setResizable(true);
            Static353.aFrame10.addWindowListener(this);
            Static353.aFrame10.setVisible(true);
            Static353.aFrame10.toFront();
            @Pc(54) Insets local54 = Static353.aFrame10.getInsets();
            Static353.aFrame10.setSize(Static52.anInt1059 + local54.left + local54.right, local54.bottom + local54.top + Static54.anInt1084);
            SignLink.aSignLink_4 = SignLink.instance = new SignLink(arg0, arg1, 37, true);
            @Pc(88) SignedResource local88 = SignLink.instance.startThread(this, 1);
            while (local88.status == 0) {
                TimeUtils.sleep(10L);
            }
        } catch (@Pc(103) Exception local103) {
            JagException.sendTrace(local103, (String) null);
        }
    }

    @OriginalMember(owner = "client!kh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    @Override
    public final URL getCodeBase() {
        if (Static353.aFrame10 == null) {
            return loaderApplet == null || loaderApplet == this ? super.getCodeBase() : loaderApplet.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    @Override
    public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
        Static206.aBoolean268 = true;
        Static664.aBoolean759 = true;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
    protected abstract void method1637();

    @OriginalMember(owner = "client!kh", name = "start", descriptor = "()V")
    @Override
    public final void start() {
        if (Static149.anGameShell == this && !Static250.aBoolean311) {
            Static604.aLong278 = 0L;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)V")
    protected final void error(@OriginalArg(0) String arg0) {
        if (this.errored) {
            return;
        }

        this.errored = true;
        System.out.println("error_game_" + arg0);
        try {
            JavaScript.call("loggedout", loaderApplet);
        } catch (@Pc(31) Throwable ignored) {
            /* empty */
        }

        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (@Pc(62) Exception ignored) {
            /* empty */
        }
    }

    @OriginalMember(owner = "client!kh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
    public void method1639() {
        @Pc(6) long local6 = SystemTimer.safetime();
        @Pc(17) long local17 = Static475.aLongArray16[Static708.anInt10644];
        Static475.aLongArray16[Static708.anInt10644] = local6;
        if (local17 != 0L && local17 < local6) {
            @Pc(40) int local40 = (int) (local6 - local17);
            Static652.currentFps = ((local40 >> 1) + 32000) / local40;
        }
        Static708.anInt10644 = Static708.anInt10644 + 1 & 0x1F;
        if (Static169.anInt2850++ > 50) {
            Static664.aBoolean759 = true;
            Static169.anInt2850 -= 50;
            Static434.aCanvas7.setSize(Static680.anInt10289, Static380.anInt5979);
            Static434.aCanvas7.setVisible(true);
            if (Static353.aFrame10 != null && Static316.fsframe == null) {
                @Pc(86) Insets local86 = Static353.aFrame10.getInsets();
                Static434.aCanvas7.setLocation(local86.left + Static134.anInt10329, Static241.anInt3962 + local86.top);
            } else {
                Static434.aCanvas7.setLocation(Static134.anInt10329, Static241.anInt3962);
            }
        }
        this.method1650();
    }

    @OriginalMember(owner = "client!kh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    protected final void method1640(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(6) int arg3) {
        try {
            if (Static149.anGameShell == null) {
                Constants.sourceApplet = loaderApplet;
                Static680.anInt10289 = arg0;
                Static52.anInt1059 = arg0;
                Constants.clientBuild = 667;
                Static134.anInt10329 = 0;
                Static380.anInt5979 = arg3;
                Static54.anInt1084 = arg3;
                Static241.anInt3962 = 0;
                Static149.anGameShell = this;
                SignLink.aSignLink_4 = SignLink.instance = new SignLink(arg1, arg2, 37, loaderApplet != null);
                @Pc(80) SignedResource local80 = SignLink.instance.startThread(this, 1);
                while (local80.status == 0) {
                    TimeUtils.sleep(10L);
                }
            } else {
                Static426.anInt941++;
                if (Static426.anInt941 >= 3) {
                    this.error("alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (@Pc(92) Throwable local92) {
            JagException.sendTrace(local92, (String) null);
            this.error("crash");
        }
    }

    @OriginalMember(owner = "client!kh", name = "run", descriptor = "()V")
    @Override
    public final void run() {
        try {
            if (SignLink.javaVendor != null) {
                @Pc(10) String local10 = SignLink.javaVendor.toLowerCase();
                if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
                    @Pc(29) String local29 = SignLink.javaVersion;
                    if (local29.equals("1.1") || local29.startsWith("1.1.") || local29.equals("1.2") || local29.startsWith("1.2.")) {
                        this.error("wrongjava");
                        return;
                    }
                } else if (local10.indexOf("ibm") != -1 && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
                    this.error("wrongjava");
                    return;
                }
            }
            if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.")) {
                @Pc(114) int local114 = 2;
                @Pc(116) int local116 = 0;
                while (local114 < SignLink.javaVersion.length()) {
                    @Pc(124) char local124 = SignLink.javaVersion.charAt(local114);
                    if (local124 < '0' || local124 > '9') {
                        break;
                    }
                    local114++;
                    local116 = local124 + local116 * 10 - 48;
                }
                if (local116 >= 5) {
                    Static463.aBoolean531 = true;
                }
            }
            @Pc(168) Applet local168 = Static149.anGameShell;
            if (loaderApplet != null) {
                local168 = loaderApplet;
            }
            @Pc(174) Method local174 = SignLink.setFocusCycleRoot;
            if (local174 != null) {
                try {
                    local174.invoke(local168, Boolean.TRUE);
                } catch (@Pc(188) Throwable local188) {
                }
            }
            Static418.method7859();
            Static148.method2429();
            this.method1641();
            this.method1647();
            Static600.aClass27_1 = Static570.method7550();
            while (Static604.aLong278 == 0L || SystemTimer.safetime() < Static604.aLong278) {
                Static32.anInt776 = Static600.aClass27_1.method5598(Static324.aLong164);
                for (@Pc(213) int local213 = 0; local213 < Static32.anInt776; local213++) {
                    this.method1646();
                }
                this.method1639();
                Static61.method1312(SignLink.instance, Static434.aCanvas7);
            }
        } catch (@Pc(254) ThreadDeath local254) {
            throw local254;
        } catch (@Pc(257) Throwable local257) {
            JagException.sendTrace(local257, this.method1648());
            this.error("crash");
        } finally {
            @Pc(275) Object local275 = null;
            this.method1632(true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    @Override
    public final AppletContext getAppletContext() {
        if (Static353.aFrame10 == null) {
            return loaderApplet == null || loaderApplet == this ? super.getAppletContext() : loaderApplet.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    @Override
    public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
        if (Static149.anGameShell != this || Static250.aBoolean311) {
            return;
        }
        Static664.aBoolean759 = true;
        if (Static463.aBoolean531 && SystemTimer.safetime() - Static149.aLong96 > 1000L) {
            @Pc(28) Rectangle local28 = arg0.getClipBounds();
            if (local28 == null || Static52.anInt1059 <= local28.width && local28.height >= Static54.anInt1084) {
                Static723.aBoolean827 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!kh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!kh", name = "stop", descriptor = "()V")
    @Override
    public final void stop() {
        if (Static149.anGameShell == this && !Static250.aBoolean311) {
            Static604.aLong278 = SystemTimer.safetime() + 4000L;
        }
    }

    @OriginalMember(owner = "client!kh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)V")
    public synchronized void method1641() {
        if (Static434.aCanvas7 != null) {
            Static434.aCanvas7.removeFocusListener(this);
            Static434.aCanvas7.getParent().setBackground(Color.black);
            Static434.aCanvas7.getParent().remove(Static434.aCanvas7);
        }
        @Pc(30) Container local30;
        if (Static316.fsframe != null) {
            local30 = Static316.fsframe;
        } else if (Static353.aFrame10 != null) {
            local30 = Static353.aFrame10;
        } else if (loaderApplet == null) {
            local30 = Static149.anGameShell;
        } else {
            local30 = loaderApplet;
        }
        local30.setLayout((LayoutManager) null);
        Static434.aCanvas7 = new Canvas_Sub1(this);
        local30.add(Static434.aCanvas7);
        Static434.aCanvas7.setSize(Static680.anInt10289, Static380.anInt5979);
        Static434.aCanvas7.setVisible(true);
        if (local30 == Static353.aFrame10) {
            @Pc(74) Insets local74 = Static353.aFrame10.getInsets();
            Static434.aCanvas7.setLocation(Static134.anInt10329 + local74.left, local74.top + Static241.anInt3962);
        } else {
            Static434.aCanvas7.setLocation(Static134.anInt10329, Static241.anInt3962);
        }
        Static434.aCanvas7.addFocusListener(this);
        Static434.aCanvas7.requestFocus();
        Static91.aBoolean750 = true;
        Static206.aBoolean268 = true;
        Static664.aBoolean759 = true;
        Static723.aBoolean827 = false;
        Static149.aLong96 = SystemTimer.safetime();
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)Z")
    protected final boolean method1643() {
        @Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
        if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
            return true;
        } else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
            return true;
        } else if (local16.equals("stellardawn.com") || local16.endsWith(".stellardawn.com")) {
            return true;
        } else if (local16.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
                local16 = local16.substring(0, local16.length() - 1);
            }
            if (local16.endsWith("192.168.1.")) {
                return true;
            } else {
                this.error("invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
    public final boolean method1644() {
        return Static14.loadNativeLibrary("jaclib");
    }

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "(I)V")
    protected abstract void method1645();

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public void method1646() {
        @Pc(6) long local6 = SystemTimer.safetime();
        @Pc(10) long local10 = Static221.aLongArray18[Static392.anInt6142];
        Static221.aLongArray18[Static392.anInt6142] = local6;
        @Pc(31) boolean local31;
        if (local10 == 0L || local10 >= local6) {
            local31 = false;
        } else {
            local31 = true;
        }
        Static392.anInt6142 = Static392.anInt6142 + 1 & 0x1F;
        synchronized (this) {
            Static91.aBoolean750 = Static206.aBoolean268;
        }
        this.method1645();
    }

    @OriginalMember(owner = "client!kh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    @Override
    public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
        Static206.aBoolean268 = false;
    }

    @OriginalMember(owner = "client!kh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    @Override
    public final String getParameter(@OriginalArg(0) String arg0) {
        if (Static353.aFrame10 == null) {
            return loaderApplet == null || loaderApplet == this ? super.getParameter(arg0) : loaderApplet.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
    protected abstract void method1647();

    @OriginalMember(owner = "client!kh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!kh", name = "destroy", descriptor = "()V")
    @Override
    public final void destroy() {
        if (Static149.anGameShell == this && !Static250.aBoolean311) {
            Static604.aLong278 = SystemTimer.safetime();
            TimeUtils.sleep(5000L);
            SignLink.aSignLink_4 = null;
            this.method1632(false);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Ljava/lang/String;")
    public String method1648() {
        return null;
    }

    @OriginalMember(owner = "client!kh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    @Override
    public final void update(@OriginalArg(0) Graphics arg0) {
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    protected abstract void method1650();

    @OriginalMember(owner = "client!kh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    @Override
    public final URL getDocumentBase() {
        if (Static353.aFrame10 == null) {
            return loaderApplet == null || loaderApplet == this ? super.getDocumentBase() : loaderApplet.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z")
    public final boolean method1651() {
        return Static14.loadNativeLibrary("jagtheora");
    }

    @OriginalMember(owner = "client!kh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    @Override
    public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
    }
}
