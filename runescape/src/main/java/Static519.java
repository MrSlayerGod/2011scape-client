import com.jagex.graphics.Renderer;
import com.jagex.sign.SignLink;
import com.jagex.game.runetek6.client.GameShell;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.ToolkitType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)I")
    public static int autosetup() {
        @Pc(5) boolean local5 = false;
        @Pc(7) boolean local7 = false;
        @Pc(9) boolean local9 = false;
        if (GameShell.signLink.signed && !GameShell.signLink.microsoftjava) {
            local5 = true;
            if (SystemInfo.instance.totalMemory < 512 && SystemInfo.instance.totalMemory != 0) {
                local5 = false;
            }
            if (SignLink.osNameLower.startsWith("win")) {
                local9 = true;
                local7 = true;
            } else {
                local7 = true;
            }
        }
        if (Static698.aBoolean792) {
            local7 = false;
        }
        if (Static78.aBoolean139) {
            local9 = false;
        }
        if (Static449.aBoolean511) {
            local5 = false;
        }
        if (!local5 && !local7 && !local9) {
            return Static625.method8337();
        }
        @Pc(82) int local82 = -1;
        @Pc(84) int local84 = -1;
        @Pc(86) int local86 = -1;
        if (local5) {
            try {
                local82 = Static363.profileToolkit(1000, 2);
            } catch (@Pc(95) Exception local95) {
            }
        }
        if (local9) {
            try {
                local86 = Static363.profileToolkit(1000, 3);
                if (ClientOptions.instance.toolkit.getValue() == ToolkitType.D3D) {
                    @Pc(114) Renderer local114 = Toolkit.active.renderer();
                    @Pc(119) long local119 = local114.driverVersion & 0xFFFFFFFFFFFFL;
                    @Pc(122) int local122 = local114.vendor;
                    if (local122 == 4318) {
                        local7 &= local119 >= 64425238954L;
                    } else if (local122 == 4098) {
                        local7 &= local119 >= 60129613779L;
                    }
                }
            } catch (@Pc(161) Exception local161) {
            }
        }
        if (local7) {
            try {
                local84 = Static363.profileToolkit(1000, 1);
            } catch (@Pc(171) Exception local171) {
            }
        }
        if (local82 == -1 && local84 == -1 && local86 == -1) {
            return Static625.method8337();
        }
        local84 = (int) ((float) local84 * 1.1F);
        local86 = (int) ((float) local86 * 1.1F);
        if (local82 > local86 && local82 > local84) {
            return Static611.method8228(local82);
        } else if (local86 > local84) {
            return Static399.method5571(3, local86);
        } else {
            return Static399.method5571(1, local84);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z")
    public static boolean method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        if (Static280.method4087(arg2, arg1)) {
            return Static77.method1560(arg2, arg1) | (arg1 & 0x9000) != 0 | Static433.method5601(arg2, arg1) ? true : (arg2 & 0x37) == 0 & (Static526.method7073(arg2, arg1) | (arg1 & 0x2000) != 0 | Static220.method3197(arg1, arg2));
        } else {
            return false;
        }
    }
}
