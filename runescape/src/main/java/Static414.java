import com.jagex.IndexedImage;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.LocalisedText;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "Lclient!wp;")
    public static IndexedImage aIndexedImage_2;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "[F")
    public static final float[] aFloatArray43 = new float[2];

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZLclient!ca;I)V")
    public static void method5696(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg1) {
        if (Static594.anInt8777 >= 400) {
            return;
        }
        if (arg1 != Static556.self) {
            @Pc(177) String local177;
            if (arg1.anInt1436 == 0) {
                @Pc(63) boolean local63 = true;
                if (Static556.self.anInt1471 != -1 && arg1.anInt1471 != -1) {
                    @Pc(91) int local91 = Static556.self.anInt1471 < arg1.anInt1471 ? Static556.self.anInt1471 : arg1.anInt1471;
                    @Pc(98) int local98 = Static556.self.anInt1444 - arg1.anInt1444;
                    if (local98 < 0) {
                        local98 = -local98;
                    }
                    if (local98 > local91) {
                        local63 = false;
                    }
                }
                @Pc(129) String local129 = ModeGame.STELLAR_DAWN == Static392.aModeGame_4 ? LocalisedText.RATING.localise(Static51.language) : LocalisedText.LEVEL.localise(Static51.language);
                if (arg1.anInt1444 >= arg1.anInt1437) {
                    local177 = arg1.method1424(false) + (local63 ? Static693.method9009(Static556.self.anInt1444, arg1.anInt1444) : "<col=ffffff>") + " (" + local129 + arg1.anInt1444 + ")";
                } else {
                    local177 = arg1.method1424(false) + (local63 ? Static693.method9009(Static556.self.anInt1444, arg1.anInt1444) : "<col=ffffff>") + " (" + local129 + arg1.anInt1444 + "+" + (arg1.anInt1437 - arg1.anInt1444) + ")";
                }
            } else if (arg1.anInt1436 == -1) {
                local177 = arg1.method1424(false);
            } else {
                local177 = arg1.method1424(false) + " (" + LocalisedText.SKILL.localise(Static51.language) + arg1.anInt1436 + ")";
            }
            if (Static156.aBoolean223 && !arg0 && (Static717.anInt10822 & 0x8) != 0) {
                Static416.method5707(false, -1, (long) arg1.anInt10740, 0, 0, Static153.aString27, 44, true, Static369.anInt4263, Static128.aString108 + " -> <col=ffffff>" + local177, (long) arg1.anInt10740, false);
            }
            if (arg0) {
                Static416.method5707(true, 0, 0L, 0, 0, "<col=cccccc>" + local177, -1, false, -1, "", (long) arg1.anInt10740, false);
            } else {
                for (@Pc(318) int local318 = 7; local318 >= 0; local318--) {
                    if (Static297.aStringArray24[local318] != null) {
                        @Pc(325) short local325 = 0;
                        if (Static392.aModeGame_4 == ModeGame.RUNESCAPE && Static297.aStringArray24[local318].equalsIgnoreCase(LocalisedText.ATTACK.localise(Static51.language))) {
                            if (Static324.aBoolean388 && Static556.self.anInt1444 < arg1.anInt1444) {
                                local325 = 2000;
                            }
                            if (Static556.self.anInt1433 == 0 || arg1.anInt1433 == 0) {
                                if (arg1.aBoolean125) {
                                    local325 = 2000;
                                }
                            } else if (arg1.anInt1433 == Static556.self.anInt1433) {
                                local325 = 2000;
                            } else {
                                local325 = 0;
                            }
                        } else if (Static601.aBooleanArray28[local318]) {
                            local325 = 2000;
                        }
                        @Pc(403) short local403 = (short) (local325 + Static187.aShortArray52[local318]);
                        @Pc(416) int local416 = Static147.anIntArray227[local318] == -1 ? Static39.anInt950 : Static147.anIntArray227[local318];
                        Static416.method5707(false, -1, (long) arg1.anInt10740, 0, 0, Static297.aStringArray24[local318], local403, true, local416, "<col=ffffff>" + local177, (long) arg1.anInt10740, false);
                    }
                }
            }
            if (!arg0) {
                for (@Pc(484) DoublyLinkedNode_Sub2_Sub16 local484 = (DoublyLinkedNode_Sub2_Sub16) Static693.A_DEQUE___79.first(); local484 != null; local484 = (DoublyLinkedNode_Sub2_Sub16) Static693.A_DEQUE___79.next()) {
                    if (local484.anInt7314 == 58) {
                        local484.aString88 = "<col=ffffff>" + local177;
                        return;
                    }
                }
            }
        } else if (Static156.aBoolean223 && (Static717.anInt10822 & 0x10) != 0) {
            Static416.method5707(false, -1, 0L, 0, 0, Static153.aString27, 4, true, Static369.anInt4263, Static128.aString108 + " -> <col=ffffff>" + LocalisedText.SELF.localise(Static51.language), (long) arg1.anInt10740, false);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
    public static void method5697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        if (Static392.aModeGame_4 == ModeGame.STELLAR_DAWN) {
            if (!Static147.method2419(0, arg0, 1, false, arg1, 0, -2, 1)) {
                Static147.method2419(0, arg0, 1, false, arg1, 0, -3, 1);
            }
        } else if (!Static147.method2419(0, arg0, 1, false, arg1, 0, -3, 1)) {
            Static147.method2419(0, arg0, 1, false, arg1, 0, -2, 1);
        }
    }
}
