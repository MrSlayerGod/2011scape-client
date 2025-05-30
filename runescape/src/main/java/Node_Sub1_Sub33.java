import com.jagex.graphics.EnvironmentLight;
import com.jagex.graphics.texture.TextureOp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Node_Sub1_Sub33 extends TextureOp {

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
    public Node_Sub1_Sub33() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)[I")
    @Override
    public int[] monochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        if (arg0 <= 107) {
            this.monochromeOutput(49, -21);
        }
        return EnvironmentLight.anIntArray92;
    }
}
