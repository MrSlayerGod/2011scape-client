import com.jagex.core.io.Packet;
import com.jagex.graphics.EnvironmentLight;
import com.jagex.graphics.texture.TextureOp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Node_Sub1_Sub16 extends TextureOp {

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public Node_Sub1_Sub16() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
    @Override
    public int[] monochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(11) int[] local11 = super.monochromeCache.get(arg1);
        if (super.monochromeCache.dirty) {
            @Pc(21) int[] local21 = this.method9422(arg1, 0);
            for (@Pc(23) int local23 = 0; local23 < EnvironmentLight.anInt9289; local23++) {
                local11[local23] = 4096 - local21[local23];
            }
        }
        return arg0 <= 107 ? null : local11;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)[[I")
    @Override
    public int[][] method9414(@OriginalArg(0) int arg0) {
        @Pc(18) int[][] local18 = super.colourCache.get(arg0);
        if (super.colourCache.dirty) {
            @Pc(28) int[][] local28 = this.method9413(0, arg0);
            @Pc(32) int[] local32 = local28[0];
            @Pc(36) int[] local36 = local28[1];
            @Pc(40) int[] local40 = local28[2];
            @Pc(44) int[] local44 = local18[0];
            @Pc(48) int[] local48 = local18[1];
            @Pc(52) int[] local52 = local18[2];
            for (@Pc(54) int local54 = 0; local54 < EnvironmentLight.anInt9289; local54++) {
                local44[local54] = 4096 - local32[local54];
                local48[local54] = 4096 - local36[local54];
                local52[local54] = 4096 - local40[local54];
            }
        }
        return local18;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!ge;I)V")
    @Override
    public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
        if (arg0) {
            Static341.method5033(111);
        }
        if (arg2 == 0) {
            super.monochrome = arg1.g1() == 1;
        }
    }
}
