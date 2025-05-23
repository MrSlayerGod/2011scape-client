import com.jagex.IndexedImage;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.ClippingMask;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.sw.SoftwareMemoryManager;
import com.jagex.graphics.sw.SoftwareObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class n extends Font implements SoftwareObject {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!ve;[Lclient!wp;[Lclient!st;)V")
    public n(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) FontMetrics arg2, @OriginalArg(3) IndexedImage[] arg3, @OriginalArg(4) Sprite[] arg4) {
        super(arg0, arg2);
        @Pc(7) byte[][] local7 = new byte[arg3.length][];
        @Pc(11) int[] local11 = new int[arg3.length];
        @Pc(15) int[] local15 = new int[arg3.length];
        @Pc(19) int[] local19 = new int[arg3.length];
        @Pc(23) int[] local23 = new int[arg3.length];
        for (@Pc(25) int local25 = 0; local25 < arg3.length; local25++) {
            local7[local25] = arg3[local25].raster;
            local11[local25] = arg3[local25].width;
            local15[local25] = arg3[local25].height;
            local19[local25] = arg3[local25].offX1;
            local23[local25] = arg3[local25].offY1;
        }
        this.S(arg0, arg1, local7, arg3[0].palette, local11, local15, local19, local23);
    }

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    protected native void fa(@OriginalArg(0) char c, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int colour, @OriginalArg(4) boolean shadow);

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLclient!aa;II)V")
    public native void PA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) ClippingMask arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Lclient!oa;Lclient!ya;[[B[I[I[I[I[I)V")
    public native void S(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public native void w(@OriginalArg(0) boolean arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
    @Override
    protected void renderSymbol(@OriginalArg(0) char c, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int colour, @OriginalArg(4) boolean shadow, @OriginalArg(5) ClippingMask mask, @OriginalArg(6) int offsetX, @OriginalArg(7) int offsetY) {
        this.PA(c, x, y, colour, shadow, mask, offsetX, offsetY);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    @Override
    public void finalize() {
        if (this.nativeid != 0L) {
            SoftwareMemoryManager.free(this);
        }
    }
}
