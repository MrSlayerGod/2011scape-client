import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int anInt5586;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)Z")
    public static boolean method5011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z")
    public static boolean method5012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        return (arg1 & 0x800) != 0;
    }
}
