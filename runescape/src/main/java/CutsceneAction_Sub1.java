import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class CutsceneAction_Sub1 extends CutsceneAction {

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    protected final int anInt10558;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    protected final int anInt10556;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    protected final int anInt10560;

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!ge;)V")
    public CutsceneAction_Sub1(@OriginalArg(0) Packet arg0) {
        super(arg0);
        this.anInt10558 = arg0.g2();
        this.anInt10556 = arg0.g2();
        this.anInt10560 = arg0.g1();
    }
}
