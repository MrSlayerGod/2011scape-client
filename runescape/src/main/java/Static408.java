import com.jagex.ServerProt;
import com.jagex.game.runetek6.config.meltype.MapElementType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___162 = new ServerProt(102, -1);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method5632() {
        client.aClient1.load_jagmisc();
        Static524.aServerConnection_3.clear();
        Static524.aServerConnection_3.anInt3646 = 0;
        Static249.anInt4008 = 0;
        Static524.aServerConnection_3.antepenultimateProt = null;
        Static524.aServerConnection_3.penultimateProt = null;
        Static524.aServerConnection_3.aServerProt_92 = null;
        Static524.aServerConnection_3.bitPacket.pos = 0;
        Static102.method2022();
        Static251.anInt4036 = 0;
        Static723.aString129 = null;
        FriendsList.count = 0;
        Static91.aClanSettings_9 = null;
        Static128.aClanSettings_8 = null;
        FriendChat.count = 0;
        FriendChat.users = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!el;)Z")
    public static boolean method5634(@OriginalArg(1) MapElementType arg0) {
        if (arg0 == null) {
            return false;
        } else if (!arg0.aBoolean214) {
            return false;
        } else if (!arg0.variableTest(WorldMap.varDomain)) {
            return false;
        } else if (Static268.A_HASH_TABLE___22.get(arg0.id) == null) {
            return Static232.A_HASH_TABLE___18.get(arg0.category) == null;
        } else {
            return false;
        }
    }
}
