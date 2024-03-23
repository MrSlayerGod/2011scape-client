import com.jagex.core.datastruct.key.Node;
import com.jagex.core.datastruct.key.IterableHashTable;
import com.jagex.core.datastruct.key.IntNode;
import com.jagex.core.datastruct.key.StringNode;
import com.jagex.core.io.Packet;
import com.jagex.core.stringtools.general.Cp1252;
import com.jagex.core.stringtools.general.StringTools;
import com.jagex.math.IntMath;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class53 {

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!av;")
    public IterableHashTable aIterableHashTable_9;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public int anInt1142;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public int anInt1144;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "C")
    public char aChar1;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Ljava/lang/Object;")
    public Object anObject3;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "C")
    public char aChar2;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Ljava/lang/String;")
    public String aString5 = "null";

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public boolean method1221(@OriginalArg(0) String arg0) {
        if (this.anObject3 == null) {
            return false;
        }
        if (this.aIterableHashTable_9 == null) {
            this.method1226();
        }
        for (@Pc(30) Node_Sub46 local30 = (Node_Sub46) this.aIterableHashTable_9.get(StringTools.longHash(arg0)); local30 != null; local30 = (Node_Sub46) this.aIterableHashTable_9.nextWithSameKey()) {
            if (local30.aString100.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!ge;)V")
    public void decode(@OriginalArg(1) Packet arg0) {
        while (true) {
            @Pc(12) int local12 = arg0.g1();
            if (local12 == 0) {
                return;
            }
            this.method1234(local12, arg0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lclient!nw;")
    public Node_Sub40 method1223(@OriginalArg(1) int arg0) {
        if (this.anObject3 == null) {
            return null;
        } else {
            if (this.aIterableHashTable_9 == null) {
                this.method1236();
            }
            return (Node_Sub40) this.aIterableHashTable_9.get(arg0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public void method1226() {
        @Pc(58) Node_Sub46 local58;
        if (this.anObject3 instanceof IterableHashTable) {
            @Pc(203) IterableHashTable local203 = (IterableHashTable) this.anObject3;
            this.aIterableHashTable_9 = new IterableHashTable(local203.getBucketCount());
            @Pc(218) IterableHashTable local218 = new IterableHashTable(local203.getBucketCount());
            for (@Pc(223) StringNode local223 = (StringNode) local203.first(); local223 != null; local223 = (StringNode) local203.next()) {
                @Pc(229) long local229 = StringTools.longHash(local223.value);
                @Pc(235) Node_Sub46 local235;
                for (local235 = (Node_Sub46) local218.get(local229); local235 != null && !local235.aString100.equals(local223.value); local235 = (Node_Sub46) local218.nextWithSameKey()) {
                }
                if (local235 == null) {
                    local235 = new Node_Sub46(local223.value, 0);
                    local218.put(local229, local235);
                }
                local235.anInt8241++;
            }
            for (@Pc(283) StringNode local283 = (StringNode) local203.first(); local283 != null; local283 = (StringNode) local203.next()) {
                @Pc(289) long local289 = StringTools.longHash(local283.value);
                @Pc(296) Node_Sub26 local296;
                for (local296 = (Node_Sub26) this.aIterableHashTable_9.get(local289); local296 != null && !local296.aString47.equals(local283.value); local296 = (Node_Sub26) this.aIterableHashTable_9.nextWithSameKey()) {
                }
                for (local58 = (Node_Sub46) local218.get(local289); local58 != null && !local58.aString100.equals(local283.value); local58 = (Node_Sub46) local218.nextWithSameKey()) {
                }
                @Pc(339) int local339 = local58.anInt8241--;
                if (local296 == null) {
                    local296 = new Node_Sub26(local283.value, local339);
                    this.aIterableHashTable_9.put(local289, local296);
                }
                local296.anIntArray318[local296.anIntArray318.length - local339] = (int) local283.key;
            }
            return;
        }
        @Pc(21) String[] local21 = (String[]) this.anObject3;
        @Pc(26) int local26 = IntMath.nextPow2(local21.length);
        this.aIterableHashTable_9 = new IterableHashTable(local26);
        @Pc(37) IterableHashTable local37 = new IterableHashTable(local26);
        for (@Pc(39) int local39 = 0; local39 < local21.length; local39++) {
            if (local21[local39] != null) {
                @Pc(48) String local48 = local21[local39];
                @Pc(52) long local52 = StringTools.longHash(local48);
                for (local58 = (Node_Sub46) local37.get(local52); local58 != null && !local58.aString100.equals(local48); local58 = (Node_Sub46) local37.nextWithSameKey()) {
                }
                if (local58 == null) {
                    local58 = new Node_Sub46(local48, 0);
                    local37.put(local52, local58);
                }
                local58.anInt8241++;
            }
        }
        for (@Pc(103) int local103 = 0; local103 < local21.length; local103++) {
            if (local21[local103] != null) {
                @Pc(112) String local112 = local21[local103];
                @Pc(116) long local116 = StringTools.longHash(local112);
                @Pc(123) Node_Sub26 local123;
                for (local123 = (Node_Sub26) this.aIterableHashTable_9.get(local116); local123 != null && !local123.aString47.equals(local112); local123 = (Node_Sub26) this.aIterableHashTable_9.nextWithSameKey()) {
                }
                @Pc(143) Node_Sub46 local143;
                for (local143 = (Node_Sub46) local37.get(local116); local143 != null && !local143.aString100.equals(local112); local143 = (Node_Sub46) local37.nextWithSameKey()) {
                }
                @Pc(164) int local164 = local143.anInt8241--;
                if (local123 == null) {
                    local123 = new Node_Sub26(local112, local164);
                    this.aIterableHashTable_9.put(local116, local123);
                }
                local123.anIntArray318[local123.anIntArray318.length - local164] = local103;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
    public int method1227(@OriginalArg(0) int arg0) {
        if (this.anObject3 == null) {
            return this.anInt1142;
        } else if (this.anObject3 instanceof IterableHashTable) {
            @Pc(30) IntNode local30 = (IntNode) ((IterableHashTable) this.anObject3).get(arg0);
            return local30 == null ? this.anInt1142 : local30.value;
        } else {
            @Pc(43) Integer[] local43 = (Integer[]) this.anObject3;
            if (arg0 >= 0 && arg0 < local43.length) {
                @Pc(66) Integer local66 = local43[arg0];
                return local66 == null ? this.anInt1142 : local66;
            } else {
                return this.anInt1142;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
    public int method1228() {
        return this.anInt1144;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)Ljava/lang/String;")
    public String method1229(@OriginalArg(1) int arg0) {
        if (this.anObject3 == null) {
            return this.aString5;
        } else if (this.anObject3 instanceof IterableHashTable) {
            @Pc(31) StringNode local31 = (StringNode) ((IterableHashTable) this.anObject3).get(arg0);
            return local31 == null ? this.aString5 : local31.value;
        } else {
            @Pc(44) String[] local44 = (String[]) this.anObject3;
            if (arg0 >= 0 && local44.length > arg0) {
                @Pc(64) String local64 = local44[arg0];
                return local64 == null ? this.aString5 : local64;
            } else {
                return this.aString5;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)Z")
    public boolean method1233(@OriginalArg(1) int arg0) {
        if (this.anObject3 == null) {
            return false;
        } else {
            if (this.aIterableHashTable_9 == null) {
                this.method1236();
            }
            return this.aIterableHashTable_9.get(arg0) != null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!ge;)V")
    public void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) Packet arg1) {
        if (arg0 == 1) {
            this.aChar2 = Cp1252.decodeChar(arg1.g1b());
        } else if (arg0 == 2) {
            this.aChar1 = Cp1252.decodeChar(arg1.g1b());
        } else if (arg0 == 3) {
            this.aString5 = arg1.gjstr();
        } else if (arg0 == 4) {
            this.anInt1142 = arg1.g4();
        } else {
            @Pc(69) int local69;
            if (arg0 == 5 || arg0 == 6) {
                this.anInt1144 = arg1.g2();
                @Pc(62) IterableHashTable local62 = new IterableHashTable(IntMath.nextPow2(this.anInt1144));
                for (@Pc(64) int local64 = 0; local64 < this.anInt1144; local64++) {
                    local69 = arg1.g4();
                    @Pc(79) Node local79;
                    if (arg0 == 5) {
                        local79 = new StringNode(arg1.gjstr());
                    } else {
                        local79 = new IntNode(arg1.g4());
                    }
                    local62.put(local69, local79);
                }
                this.anObject3 = local62;
            } else {
                @Pc(114) int local114;
                @Pc(131) int local131;
                if (arg0 == 7) {
                    local114 = arg1.g2();
                    this.anInt1144 = arg1.g2();
                    @Pc(124) String[] local124 = new String[local114];
                    for (local69 = 0; local69 < this.anInt1144; local69++) {
                        local131 = arg1.g2();
                        local124[local131] = arg1.gjstr();
                    }
                    this.anObject3 = local124;
                } else if (arg0 == 8) {
                    local114 = arg1.g2();
                    this.anInt1144 = arg1.g2();
                    @Pc(164) Integer[] local164 = new Integer[local114];
                    for (local69 = 0; local69 < this.anInt1144; local69++) {
                        local131 = arg1.g2();
                        local164[local131] = Integer.valueOf(arg1.g4());
                    }
                    this.anObject3 = local164;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
    public void method1236() {
        @Pc(101) int local101;
        if (this.anObject3 instanceof IterableHashTable) {
            @Pc(16) IterableHashTable local16 = (IterableHashTable) this.anObject3;
            this.aIterableHashTable_9 = new IterableHashTable(local16.getBucketCount());
            @Pc(31) IterableHashTable local31 = new IterableHashTable(local16.getBucketCount());
            @Pc(45) IntNode local45;
            for (@Pc(36) IntNode local36 = (IntNode) local16.first(); local36 != null; local36 = (IntNode) local16.next()) {
                local45 = (IntNode) local31.get(local36.value);
                if (local45 == null) {
                    local45 = new IntNode(0);
                    local31.put(local36.value, local45);
                }
                local45.value++;
            }
            for (local45 = (IntNode) local16.first(); local45 != null; local45 = (IntNode) local16.next()) {
                @Pc(87) Node_Sub40 local87 = (Node_Sub40) this.aIterableHashTable_9.get(local45.value);
                local101 = ((IntNode) local31.get(local45.value)).value--;
                if (local87 == null) {
                    local87 = new Node_Sub40(local101);
                    this.aIterableHashTable_9.put(local45.value, local87);
                }
                local87.anIntArray531[local87.anIntArray531.length - local101] = (int) local45.key;
            }
            return;
        }
        @Pc(140) Integer[] local140 = (Integer[]) this.anObject3;
        @Pc(145) int local145 = IntMath.nextPow2(local140.length);
        this.aIterableHashTable_9 = new IterableHashTable(local145);
        @Pc(156) IterableHashTable local156 = new IterableHashTable(local145);
        @Pc(168) int local168;
        for (@Pc(158) int local158 = 0; local158 < local140.length; local158++) {
            if (local140[local158] != null) {
                local168 = local140[local158];
                @Pc(175) IntNode local175 = (IntNode) local156.get(local168);
                if (local175 == null) {
                    local175 = new IntNode(0);
                    local156.put(local168, local175);
                }
                local175.value++;
            }
        }
        for (local168 = 0; local168 < local140.length; local168++) {
            if (local140[local168] != null) {
                local101 = local140[local168];
                @Pc(223) Node_Sub40 local223 = (Node_Sub40) this.aIterableHashTable_9.get(local101);
                @Pc(236) int local236 = ((IntNode) local156.get(local101)).value--;
                if (local223 == null) {
                    local223 = new Node_Sub40(local236);
                    this.aIterableHashTable_9.put(local101, local223);
                }
                local223.anIntArray531[local223.anIntArray531.length - local236] = local168;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!hu;")
    public Node_Sub26 method1237(@OriginalArg(0) String arg0) {
        if (this.anObject3 == null) {
            return null;
        }
        if (this.aIterableHashTable_9 == null) {
            this.method1226();
        }
        @Pc(26) Node_Sub26 local26;
        for (local26 = (Node_Sub26) this.aIterableHashTable_9.get(StringTools.longHash(arg0)); local26 != null && !local26.aString47.equals(arg0); local26 = (Node_Sub26) this.aIterableHashTable_9.nextWithSameKey()) {
        }
        return local26;
    }
}
