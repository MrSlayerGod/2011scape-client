import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int anInt779 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method881() {
        CutsceneManager.state = 4;
        Static322.anIntArrayArray265 = null;
        Static421.aBoolean480 = false;
        Static518.aClass2_Sub21_18 = null;
        Static298.method4385();
        ConnectionManager.GAME.send(ClientMessage.create(Static45.A_CLIENT_PROT___5, ConnectionManager.GAME.cipher));
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)[Lclient!wk;")
    public static Class403[] method882() {
        return new Class403[]{Static555.aClass403_14, Static710.aClass403_13, Static169.aClass403_1};
    }
}
