import com.jagex.core.datastruct.key.IterableHashTable;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int anInt2153;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "[Lclient!pq;")
    public static Class297_Sub1[] aClass297_Sub1Array1;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "Lclient!av;")
    public static final IterableHashTable A_HASH_TABLE___11 = new IterableHashTable(4);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!ha;)V")
    public static void method2046(@OriginalArg(1) Toolkit arg0) {
        if (Static643.anInt9604 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 && (Static334.activeTiles != null && Static484.method6494(arg0, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144))) {
            Static643.anInt9604 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII)V")
    public static void method2048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        Static180.anInt3001 = arg0 - Static30.anInt5655;
        Static558.anInt3181 = arg1 - Static30.anInt5648;
    }
}
