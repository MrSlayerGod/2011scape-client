import com.jagex.core.datastruct.key.Node;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Node_Sub37 extends Node {

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public int anInt6187 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int anInt6186 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public int anInt6185 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int anInt6191 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public int anInt6184 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int anInt6190 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public int anInt6195 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public int anInt6192 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lclient!fu;")
    public final MapElementListEntry entry;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!fu;)V")
    public Node_Sub37(@OriginalArg(0) MapElementListEntry arg0) {
        this.entry = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)Z")
    public boolean method5553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
        if (arg0 >= this.anInt6195 && arg0 <= this.anInt6190 && arg1 >= this.anInt6186 && arg1 <= this.anInt6191) {
            return true;
        } else {
            return arg0 >= this.anInt6192 && arg0 <= this.anInt6185 && arg1 >= this.anInt6184 && arg1 <= this.anInt6187;
        }
    }
}
