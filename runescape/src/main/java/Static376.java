import com.jagex.game.runetek6.client.GameShell;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "F")
    public static float aFloat113;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
    public static int[] npcGroups;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "[F")
    public static final float[] aFloatArray42 = new float[4];

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public static void method5313() {
        if (GameShell.cpucount <= 1) {
            ClientOptions.instance.update(2, ClientOptions.instance.cpuUsage);
        } else {
            ClientOptions.instance.update(4, ClientOptions.instance.cpuUsage);
        }
    }
}
