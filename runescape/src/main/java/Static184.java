import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

    @OriginalMember(owner = "client!fma", name = "a", descriptor = "(IIII)Lclient!cg;")
    public static PathingEntity method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(13) Tile local13 = Static334.activeTiles[arg2][arg0][arg1];
        if (local13 == null) {
            return null;
        }
        @Pc(20) PathingEntity local20 = null;
        @Pc(22) int local22 = -1;
        for (@Pc(31) PositionEntityNode local31 = local13.head; local31 != null; local31 = local31.node) {
            @Pc(35) PositionEntity local35 = local31.entity;
            if (local35 instanceof PathingEntity) {
                @Pc(41) PathingEntity local41 = (PathingEntity) local35;
                @Pc(51) int local51 = local41.getSize() * 256 + 252 - 256;
                @Pc(59) int local59 = local41.x - local51 >> 9;
                @Pc(66) int local66 = local41.z - local51 >> 9;
                @Pc(74) int local74 = local41.x + local51 >> 9;
                @Pc(82) int local82 = local41.z + local51 >> 9;
                if (local59 <= arg0 && arg1 >= local66 && arg0 <= local74 && arg1 <= local82) {
                    @Pc(120) int local120 = (local74 + 1 - arg0) * (local82 + (1 - arg1));
                    if (local120 > local22) {
                        local20 = local41;
                        local22 = local120;
                    }
                }
            }
        }
        return local20;
    }
}
