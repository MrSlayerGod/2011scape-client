import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.io.IOException;
import java.io.OutputStream;

@OriginalClass("client!jp")
public final class OutputStream_Sub1 extends OutputStream {

    @OriginalMember(owner = "client!jp", name = "write", descriptor = "(I)V")
    @Override
    public void write(@OriginalArg(0) int arg0) throws IOException {
        throw new IOException();
    }
}
