import com.jagex.core.io.Packet;
import com.jagex.core.util.Arrays;
import com.jagex.graphics.EnvironmentLight;
import com.jagex.graphics.texture.TextureOp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Node_Sub1_Sub38 extends TextureOp {

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Z")
    public boolean aBoolean810 = true;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Z")
    public boolean aBoolean809 = true;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public Node_Sub1_Sub38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!ge;I)V")
    @Override
    public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
        if (arg2 == 0) {
            this.aBoolean809 = arg1.g1() == 1;
        } else if (arg2 == 1) {
            this.aBoolean810 = arg1.g1() == 1;
        } else if (arg2 == 2) {
            super.monochrome = arg1.g1() == 1;
        }
        if (arg0) {
            this.method9414(121);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[[I")
    @Override
    public int[][] method9414(@OriginalArg(0) int arg0) {
        @Pc(18) int[][] local18 = super.colourCache.get(arg0);
        if (super.colourCache.dirty) {
            @Pc(39) int[][] local39 = this.method9413(0, this.aBoolean810 ? EnvironmentLight.anInt7343 - arg0 : arg0);
            @Pc(43) int[] local43 = local39[0];
            @Pc(47) int[] local47 = local39[1];
            @Pc(51) int[] local51 = local39[2];
            @Pc(55) int[] local55 = local18[0];
            @Pc(59) int[] local59 = local18[1];
            @Pc(63) int[] local63 = local18[2];
            @Pc(68) int local68;
            if (this.aBoolean809) {
                for (local68 = 0; local68 < EnvironmentLight.anInt9289; local68++) {
                    local55[local68] = local43[EnvironmentLight.anInt8580 - local68];
                    local59[local68] = local47[EnvironmentLight.anInt8580 - local68];
                    local63[local68] = local51[EnvironmentLight.anInt8580 - local68];
                }
            } else {
                for (local68 = 0; local68 < EnvironmentLight.anInt9289; local68++) {
                    local55[local68] = local43[local68];
                    local59[local68] = local47[local68];
                    local63[local68] = local51[local68];
                }
            }
        }
        return local18;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[I")
    @Override
    public int[] monochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(11) int[] local11 = super.monochromeCache.get(arg1);
        if (arg0 < 107) {
            return null;
        }
        if (super.monochromeCache.dirty) {
            @Pc(37) int[] local37 = this.method9422(this.aBoolean810 ? EnvironmentLight.anInt7343 - arg1 : arg1, 0);
            if (this.aBoolean809) {
                for (@Pc(52) int local52 = 0; local52 < EnvironmentLight.anInt9289; local52++) {
                    local11[local52] = local37[EnvironmentLight.anInt8580 - local52];
                }
            } else {
                Arrays.copy(local37, 0, local11, 0, EnvironmentLight.anInt9289);
            }
        }
        return local11;
    }
}
