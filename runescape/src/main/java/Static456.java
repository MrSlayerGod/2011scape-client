import com.jagex.core.datastruct.key.IterableHashTable;
import com.jagex.graphics.skybox.SkyBox;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!gm;")
    public static SkyBox aSkyBox_3;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int anInt6929;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!ss;")
    public static final Class345 aClass345_85 = new Class345(30, -1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
    public static void method6228(@OriginalArg(1) boolean arg0) {
        if (arg0) {
            if (Static377.anInt5930 != -1) {
                Static347.method5094(Static377.anInt5930);
            }
            for (@Pc(21) Node_Sub4 local21 = (Node_Sub4) Static548.aIterableHashTable_40.first(); local21 != null; local21 = (Node_Sub4) Static548.aIterableHashTable_40.next()) {
                if (!local21.isLinked()) {
                    local21 = (Node_Sub4) Static548.aIterableHashTable_40.first();
                    if (local21 == null) {
                        break;
                    }
                }
                Static449.method6115(false, true, local21);
            }
            Static377.anInt5930 = -1;
            Static548.aIterableHashTable_40 = new IterableHashTable(8);
            Static656.method6692();
            Static377.anInt5930 = Static523.graphicsDefaults.login_interface;
            Static640.method8435(false);
            InterfaceManager.redrawAll();
            Static472.method6414(Static377.anInt5930);
        }
        Static300.method4389();
        Static461.aBoolean529 = false;
        Static242.method3502();
        Static442.anInt6699 = -1;
        Static115.method2136(StaticWallDecor.lb);
        Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 = new Class8_Sub2_Sub1_Sub2_Sub1();
        Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 = Static501.mapHeight * 512 / 2;
        Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 = Static720.mapWidth * 512 / 2;
        Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] = Static720.mapWidth / 2;
        Static110.anInt2186 = 0;
        Static170.anInt2864 = 0;
        Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0] = Static501.mapHeight / 2;
        if (Static511.anInt7645 == 2) {
            Static110.anInt2186 = Static709.anInt10667 << 9;
            Static170.anInt2864 = Static121.anInt2333 << 9;
        } else {
            Static583.method7659();
        }
        Static218.method3187();
    }
}
