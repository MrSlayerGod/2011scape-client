import com.jagex.graphics.Mesh;
import com.jagex.graphics.Model;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Trig1;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "Lclient!ka;")
    public static Model aModel_6;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "Lclient!st;")
    public static Sprite aSprite;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!st;")
    public static Sprite aSprite_25;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "[I")
    public static final int[] anIntArray418 = new int[4];

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
    public static void method5049() {
        aModel_6 = null;
        aSprite_25 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ha;)V")
    public static void method5051(@OriginalArg(0) Toolkit arg0) {
        if (aModel_6 != null) {
            return;
        }
        @Pc(8) Mesh local8 = new Mesh(580, 1104, 1);
        local8.addSphericalSpace();
        local8.addVertex(0, 128, 0);
        local8.addVertex(0, -128, 0);
        for (@Pc(37) int local37 = 0; local37 <= 24; local37++) {
            @Pc(44) int local44 = local37 * 8192 / 24;
            @Pc(48) int local48 = Trig1.SIN[local44];
            @Pc(52) int local52 = Trig1.COS[local44];
            @Pc(61) int local61;
            @Pc(67) int local67;
            @Pc(75) int local75;
            @Pc(83) int local83;
            for (@Pc(54) int local54 = 1; local54 < 24; local54++) {
                local61 = local54 * 8192 / 24;
                local67 = Trig1.COS[local61] >> 7;
                local75 = Trig1.SIN[local61] * local48 >> 21;
                local83 = Trig1.SIN[local61] * local52 >> 21;
                local8.addVertex(-local75, local67, local83);
            }
            if (local37 > 0) {
                local61 = local37 * 23 + 2;
                local67 = local61 - 23;
                local8.addFace(0, local61, local67, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
                for (local75 = 1; local75 < 23; local75++) {
                    local83 = local67 + 1;
                    @Pc(130) int local130 = local61 + 1;
                    local8.addFace(local67, local61, local83, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
                    local8.addFace(local83, local61, local130, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
                    local67 = local83;
                    local61 = local130;
                }
                local8.addFace(local61, 1, local67, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
            }
        }
        local8.maxVertex = local8.vertexCount;
        local8.faceGroup = null;
        local8.vertexGroup = null;
        local8.facePriorities = null;
        aModel_6 = arg0.createModel(local8, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!ha;)V")
    public static void method5058(@OriginalArg(0) Toolkit arg0) {
        if (aSprite_25 != null) {
            return;
        }
        @Pc(4) int[] local4 = new int[16384];
        @Pc(7) int[] local7 = new int[16384];
        for (@Pc(9) int local9 = 0; local9 < 64; local9++) {
            @Pc(14) int local14 = 64 - local9;
            @Pc(18) int local18 = local14 * local14;
            @Pc(24) int local24 = 128 - local9 - 1;
            @Pc(28) int local28 = local9 * 128;
            @Pc(32) int local32 = local24 * 128;
            for (@Pc(34) int local34 = 0; local34 < 64; local34++) {
                @Pc(39) int local39 = 64 - local34;
                @Pc(43) int local43 = local39 * local39;
                @Pc(49) int local49 = 128 - local34 - 1;
                @Pc(59) int local59 = 256 - (local43 + local18 << 8) / 4096;
                local59 = local59 * 16 * 192 / 1536;
                if (local59 < 0) {
                    local59 = 0;
                } else if (local59 > 255) {
                    local59 = 255;
                }
                @Pc(81) int local81 = local59 / 2;
                local7[local28 + local34] = local7[local28 + local49] = local7[local32 + local34] = local7[local32 + local49] = (local59 | 0xFF00) << 16;
                local4[local28 + local34] = local4[local28 + local49] = local4[local32 + local34] = local4[local32 + local49] = 127 - local81 << 24 | 0xFFFFFF;
            }
        }
        aSprite_25 = arg0.createSprite(128, 128, 128, local7);
        aSprite = arg0.createSprite(128, 128, 128, local4);
    }
}
