import com.jagex.graphics.PointLight;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public abstract class Class8_Sub2_Sub5 extends Renderable {

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIII)V")
    public Class8_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        super.x = arg0;
        super.aByte143 = (byte) arg4;
        super.anInt10691 = arg1;
        super.z = arg2;
        super.level = (byte) arg3;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BLclient!ha;)Z")
    @Override
    public final boolean method9284(@OriginalArg(0) byte arg0, @OriginalArg(1) Toolkit arg1) {
        @Pc(15) Class286 local15 = Static467.method6351(super.level, super.x >> Static52.anInt1066, super.z >> Static52.anInt1066);
        if (arg0 == 59) {
            return local15 != null && local15.aPositionEntity.aBoolean815 ? Static282.method3976(local15.aPositionEntity.method9286(2) + this.method9286(2), super.level, super.x >> Static52.anInt1066, super.z >> Static52.anInt1066) : Static588.method7714(super.z >> Static52.anInt1066, super.level, super.x >> Static52.anInt1066);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "(I)Z")
    @Override
    public final boolean method9275() {
        return Static258.aBooleanArrayArray3[(super.x >> Static52.anInt1066) + Static35.anInt813 - Static403.anInt6246][Static35.anInt813 + (super.z >> Static52.anInt1066) - Static550.anInt8271];
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
    @Override
    public final void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Toolkit arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Renderable arg6) {
        if (arg4 >= 101) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "([Lclient!lca;I)I")
    @Override
    public final int method9288(@OriginalArg(0) PointLight[] arg0) {
        return this.method9277(arg0, super.z >> Static52.anInt1066, super.x >> Static52.anInt1066);
    }

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "(I)V")
    @Override
    public final void method9280(@OriginalArg(0) int arg0) {
        if (arg0 == 27811) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "(I)Z")
    @Override
    public final boolean method9290(@OriginalArg(0) int arg0) {
        if (arg0 != 0) {
            this.method9284((byte) -87, null);
        }
        return false;
    }
}
