import com.jagex.graphics.Exception_Sub1;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Rectangle;

public final class Static700 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
    public static void method9148(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
        if (Static448.anInt6796 == 1) {
            Static74.aToolkit_4.method8011(arg1, arg0, Static2.anInt45, Static312.anInt5001);
        } else {
            Static74.aToolkit_4.method8011(arg1, arg0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)Z")
    public static boolean method9150(@OriginalArg(0) int arg0) {
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
    public static void method9152() {
        Static563.method7461();
        for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
            Static577.A_COLLISION_MAP_ARRAY_1[local16].method2467();
        }
        Static244.method3512();
        Static352.method5180();
        VideoTypeList.method1084();
        System.gc();
        Toolkit.active.ya();
    }

}
