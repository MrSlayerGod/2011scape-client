import com.jagex.graphics.Sprite;
import org.openrs2.deob.annotation.OriginalMember;

import java.util.Calendar;
import java.util.TimeZone;

public final class Static459 {

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "Lclient!lja;")
    public static ConnectionInfo aConnectionInfo_2;

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "Lclient!st;")
    public static Sprite aSprite_31;

    @OriginalMember(owner = "client!oia", name = "t", descriptor = "Z")
    public static final boolean aBoolean523 = false;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "Lclient!lga;")
    public static final ServerProt A_SERVER_PROT___175 = new ServerProt(110, -1);

    @OriginalMember(owner = "client!oia", name = "y", descriptor = "Lclient!ss;")
    public static final ClientProt A_CLIENT_PROT___87 = new ClientProt(70, -1);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "Ljava/util/Calendar;")
    public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
}
