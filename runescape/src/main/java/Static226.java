import com.jagex.Class67;
import com.jagex.collect.Deque;
import com.jagex.graphics.TextureSource;
import com.jagex.graphics.Toolkit;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

import java.awt.Canvas;

public final class Static226 {

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!pu;")
    public static Class67 aClass67_9;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[Lclient!bl;")
    public static Class46[] aClass46Array7;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!sia;")
    public static final Deque A_DEQUE___58 = new Deque();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Canvas;IILclient!d;ILclient!sb;I)Lclient!ha;")
    public static synchronized Toolkit method7982(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) TextureSource arg3, @OriginalArg(5) int arg4, @OriginalArg(6) js5 arg5, @OriginalArg(7) int arg6) {
        if (arg4 == 0) {
            return Static643.method8443(arg6, arg3, arg1, arg0);
        } else if (arg4 == 2) {
            return Static587.method7698(arg3, arg6, arg1, arg0);
        } else if (arg4 == 1) {
            return Static206.method3093(arg3, arg0, arg2);
        } else if (arg4 == 5) {
            return Static256.method3637(arg2, arg5, arg3, arg0);
        } else if (arg4 == 3) {
            return Static733.method7618(arg5, arg2, arg3, arg0);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FIFF)F")
    public static float method7999(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
        return arg1 + (arg0 - arg1) * arg2;
    }
}
