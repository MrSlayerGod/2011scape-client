import com.jagex.ChangeLocationRequest;
import com.jagex.core.constants.LocLayer;
import com.jagex.core.crypto.IsaacCipher;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

    @OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
    public static final int[] XP_TABLE = new int[120];

    // $FF: synthetic field
    @OriginalMember(owner = "client!jfa", name = "Mb", descriptor = "Ljava/lang/Class;")
    public static Class aClass10;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!hma;)V")
    public static void method4332(@OriginalArg(1) ChangeLocationRequest request) {
        if (Static334.activeTiles == null) {
            return;
        }

        @Pc(9) Location location = null;
        if (request.layer == LocLayer.WALL) {
            location = (Location) Static302.getWall(request.anInt4010, request.anInt4016, request.anInt4006);
        }
        if (request.layer == LocLayer.WALLDECOR) {
            location = (Location) Static114.getWallDecor(request.anInt4010, request.anInt4016, request.anInt4006);
        }
        if (request.layer == LocLayer.GROUND) {
            location = (Location) Static578.getEntity(request.anInt4010, request.anInt4016, request.anInt4006, aClass10 == null ? (aClass10 = getClass("Location")) : aClass10);
        }
        if (request.layer == LocLayer.GROUNDDECOR) {
            location = (Location) Static687.method8959(request.anInt4010, request.anInt4016, request.anInt4006);
        }

        if (location == null) {
            request.originalShape = 0;
            request.originalId = -1;
            request.originalRotation = 0;
        } else {
            request.originalId = location.getId();
            request.originalShape = location.getShape();
            request.originalRotation = location.getRotation();
        }
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

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
    public static boolean method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        return (Static139.method2358(arg0, arg1) | (arg0 & 0x2000) != 0 | Static401.method5575(arg0, arg1)) & Static279.method4074(arg1, arg0);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!ss;Lclient!iv;)Lclient!fk;")
    public static ClientMessage method4335(@OriginalArg(1) Class345 arg0, @OriginalArg(2) IsaacCipher arg1) {
        @Pc(6) ClientMessage local6 = Static119.method2174();
        local6.anInt2986 = arg0.anInt8827;
        local6.aClass345_32 = arg0;
        if (local6.anInt2986 == -1) {
            local6.buffer = new PacketBuffer(260);
        } else if (local6.anInt2986 == -2) {
            local6.buffer = new PacketBuffer(10000);
        } else if (local6.anInt2986 <= 18) {
            local6.buffer = new PacketBuffer(20);
        } else if (local6.anInt2986 <= 98) {
            local6.buffer = new PacketBuffer(100);
        } else {
            local6.buffer = new PacketBuffer(260);
        }
        local6.buffer.method7422(arg1);
        local6.buffer.method7418(local6.aClass345_32.method7826());
        local6.totalSize = 0;
        return local6;
    }

    static {
        @Pc(85) int local85 = 0;
        for (@Pc(87) int local87 = 0; local87 < 120; local87++) {
            @Pc(92) int local92 = local87 + 1;
            @Pc(105) int local105 = (int) (Math.pow(2.0D, (double) local92 / 7.0D) * 300.0D + (double) local92);
            local85 += local105;
            XP_TABLE[local87] = local85 / 4;
        }
    }
}
