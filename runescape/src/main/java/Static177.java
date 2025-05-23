import com.jagex.graphics.EnvironmentLight;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "D")
    public static double aDouble12;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "[[B")
    public static byte[][] aByteArrayArray5;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object anObject6;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "Lclient!hc;")
    public static final CutsceneActionType A_CUTSCENE_ACTION_TYPE___13 = new CutsceneActionType(32);

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IBIIIII)V")
    public static void addLocationOccluder(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
        if (arg0 != 8 && arg0 != 16) {
            @Pc(163) Tile local163 = Static334.activeTiles[arg4][arg3][arg2];
            if (local163 == null) {
                local163 = new Tile(arg4);
            }
            if (arg0 == 1) {
                local163.aShort86 = (short) arg1;
                local163.aShort84 = (short) arg5;
            } else if (arg0 == 2) {
                local163.aShort83 = (short) arg5;
                local163.aShort85 = (short) arg1;
            }
            if (Static442.aBoolean499) {
                Static416.method5705();
            }
            return;
        }
        @Pc(22) int local22;
        @Pc(26) int local26;
        @Pc(30) int local30;
        @Pc(34) int local34;
        @Pc(42) int local42;
        @Pc(54) int local54;
        if (arg0 != 8) {
            local22 = Static340.anInt5586 + (arg3 << EnvironmentLight.anInt1066);
            local26 = local22 - Static340.anInt5586;
            local30 = arg2 << EnvironmentLight.anInt1066;
            local34 = local30 + Static340.anInt5586;
            local42 = Static706.floor[arg4].getHeight(arg3 + 1, arg2);
            local54 = Static706.floor[arg4].getHeight(arg3, arg2 + 1);
            Static285.aLocOccluderArray1[Static150.anInt2634++] = new LocOccluder(arg0, arg4, local22, local26, local26, local22, local42, local54, local54 - arg5, local42 - arg5, local30, local34, local34, local30);
            return;
        }
        local22 = arg3 << EnvironmentLight.anInt1066;
        local26 = Static340.anInt5586 + local22;
        local30 = arg2 << EnvironmentLight.anInt1066;
        local34 = local30 + Static340.anInt5586;
        local42 = Static706.floor[arg4].getHeight(arg3, arg2);
        local54 = Static706.floor[arg4].getHeight(arg3 - -1, arg2 + 1);
        Static285.aLocOccluderArray1[Static150.anInt2634++] = new LocOccluder(arg0, arg4, local22, local26, local26, local22, local42, local54, local54 - arg5, -arg5 + local42, local30, local34, local34, local30);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIILclient!tla;Lclient!tla;)V")
    public static void setWallDecor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) WallDecor arg3, @OriginalArg(4) WallDecor arg4) {
        @Pc(4) Tile local4 = Static347.getTile(arg0, arg1, arg2);
        if (local4 == null) {
            return;
        }
        local4.wallDecor = arg3;
        local4.wallDecor2 = arg4;
        @Pc(22) int local22 = Static246.ground == Static693.underwaterGround ? 1 : 0;
        if (!arg3.isStationary()) {
            arg3.nextEntity = Static468.dynamicEntities[local22];
            Static468.dynamicEntities[local22] = arg3;
        } else if (arg3.isTransparent(0)) {
            arg3.nextEntity = Static398.transparentStationaryEntities[local22];
            Static398.transparentStationaryEntities[local22] = arg3;
        } else {
            arg3.nextEntity = Static576.opaqueStationaryEntities[local22];
            Static576.opaqueStationaryEntities[local22] = arg3;
            Static75.hasOpaqueStationaryEntities = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.isStationary()) {
            if (arg4.isTransparent(0)) {
                arg4.nextEntity = Static398.transparentStationaryEntities[local22];
                Static398.transparentStationaryEntities[local22] = arg4;
                return;
            }
            arg4.nextEntity = Static576.opaqueStationaryEntities[local22];
            Static576.opaqueStationaryEntities[local22] = arg4;
            Static75.hasOpaqueStationaryEntities = true;
            return;
        }
        arg4.nextEntity = Static468.dynamicEntities[local22];
        Static468.dynamicEntities[local22] = arg4;
    }
}
