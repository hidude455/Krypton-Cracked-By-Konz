/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;

public class _91
extends Exception {
    private Throwable cfr_renamed_4;

    public _91(String string, Throwable throwable) {
        super(string);
        this.cfr_renamed_4 = throwable;
    }

    public _91(String string) {
        super(string);
    }

    public _91() {
    }

    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream printStream) {
        if (this.cfr_renamed_4 == null) {
            super.printStackTrace(printStream);
        } else {
            this.cfr_renamed_4.printStackTrace();
        }
    }

    public Throwable cfr_renamed_1() {
        return this.cfr_renamed_4;
    }
}

