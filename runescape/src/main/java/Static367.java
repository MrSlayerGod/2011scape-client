import com.jagex.collect.ref.ReferenceCache;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!ok;")
    public static final Class278[] aClass278Array1 = new Class278[16];

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method5267() {
        @Pc(1) ReferenceCache local1 = Static354.A_WEIGHTED_CACHE___120;
        synchronized (Static354.A_WEIGHTED_CACHE___120) {
            Static354.A_WEIGHTED_CACHE___120.reset();
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method5268() {
        Static129.anInt2409 = -1;
        Static430.aLong209 = 0L;
        Static319.aString51 = "";
    }
}
