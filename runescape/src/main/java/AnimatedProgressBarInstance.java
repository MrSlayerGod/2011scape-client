import com.jagex.graphics.HorizontalAlignment;
import com.jagex.graphics.VerticalAlignment;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import rs2.client.loading.screen.op.instance.FancyProgressBarInstance;
import rs2.client.loading.screen.op.LoadingScreenOpType;

@OriginalClass("client!fw")
public final class AnimatedProgressBarInstance extends FancyProgressBarInstance {

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    public final int speed;

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!wk;Lclient!ek;IIIIIIIIIIIIII)V")
    public AnimatedProgressBarInstance(@OriginalArg(0) HorizontalAlignment arg0, @OriginalArg(1) VerticalAlignment arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int speed) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.speed = speed;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)Lclient!kda;")
    @Override
    public LoadingScreenOpType type() {
        return LoadingScreenOpType.ANIMATED_PROGRESS_BAR;
    }
}
