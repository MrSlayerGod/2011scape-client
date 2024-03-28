import com.jagex.graphics.Sprite;
import com.jagex.graphics.Toolkit;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class90_Sub3 extends Class90 {

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!st;")
    public Sprite aSprite_28;

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!gha;)V")
    public Class90_Sub3(@OriginalArg(0) js5 arg0, @OriginalArg(1) js5 arg1, @OriginalArg(2) Class138_Sub2 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    @Override
    public void init() {
        super.init();
        this.aSprite_28 = Loading.sprite(((Class138_Sub2) super.aClass138_5).anInt3438, super.aJs5_109);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZIBI)V")
    @Override
    protected void method7751(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
        Toolkit.active.outlineRect(arg0 - 2, arg1, super.aClass138_5.anInt4418 + 4, super.aClass138_5.anInt4413 - -2, ((Class138_Sub2) super.aClass138_5).anInt3439, 0);
        Toolkit.active.outlineRect(arg0 - 1, arg1 - -1, super.aClass138_5.anInt4418 + 2, super.aClass138_5.anInt4413, 0, 0);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)Z")
    @Override
    public boolean ready() {
        return super.ready() ? super.aJs5_109.fileready(((Class138_Sub2) super.aClass138_5).anInt3438) : false;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZI)V")
    @Override
    protected void method7753(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
        @Pc(13) int local13 = this.method7752() * super.aClass138_5.anInt4418 / 10000;
        @Pc(24) int[] local24 = new int[4];
        Toolkit.active.K(local24);
        Toolkit.active.KA(arg0, arg1 + 2, arg0 - -local13, arg1 + super.aClass138_5.anInt4413);
        this.aSprite_28.renderTiled(arg0, arg1 + 2, super.aClass138_5.anInt4418, super.aClass138_5.anInt4413);
        Toolkit.active.KA(local24[0], local24[1], local24[2], local24[3]);
    }
}
