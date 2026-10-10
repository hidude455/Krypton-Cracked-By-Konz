/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  09
 *  0W
 *  3B
 *  3t
 *  68
 *  6g
 *  99
 */
import java.io.InputStream;

public class _3k {
    private _6g cfr_renamed_1;
    private _3B cfr_renamed_5;
    private _9 cfr_renamed_8;
    private boolean cfr_renamed_4 = false;
    private boolean cfr_renamed_3 = false;
    private int cfr_renamed_2 = 0;
    private _8d cfr_renamed_6;

    public _8d cfr_renamed_5() {
        return this.cfr_renamed_6;
    }

    private _68 cfr_renamed_5(int n) {
        return this.cfr_renamed_5(this.cfr_renamed_8, n);
    }

    private _68 cfr_renamed_5(_9 var1_1, int n) {
        return new _68(this, n, var1_1.int_8());
    }

    public _3k(InputStream inputStream) throws _91 {
        this(inputStream, null);
    }

    public _3k(InputStream inputStream, _9 var2_2) throws _91 {
        this.cfr_renamed_1 = new _6g(inputStream);
        this.cfr_renamed_8 = var2_2 != null ? var2_2 : _3t.cfr_renamed_0().cfr_renamed_4();
        this.cfr_renamed_5 = new _3B();
        this.cfr_renamed_8.cfr_renamed_1(this.cfr_renamed_5);
    }

    protected boolean boolean_6() throws _91 {
        _09 var1_1 = this.cfr_renamed_1.cfr_renamed_9();
        if (var1_1 == null) {
            return false;
        }
        this.cfr_renamed_1.cfr_renamed_4();
        return true;
    }

    public void void_6() throws _91 {
        this.cfr_renamed_9(Integer.MAX_VALUE);
    }

    public synchronized void cfr_renamed_3() {
        _9 var1_1 = this.cfr_renamed_8;
        if (var1_1 != null) {
            this.cfr_renamed_4 = true;
            this.cfr_renamed_8 = null;
            var1_1.void_8();
            this.cfr_renamed_2 = var1_1.int_8();
            try {
                this.cfr_renamed_1.cfr_renamed_2();
            }
            catch (_99 var2_2) {
                // empty catch block
            }
        }
    }

    public void cfr_renamed_6(_8d d) {
        this.cfr_renamed_6 = d;
    }

    public boolean cfr_renamed_7(int n, int n2) throws _91 {
        boolean bl = true;
        int n3 = n;
        while (n3-- > 0 && bl) {
            bl = this.boolean_6();
        }
        return this.cfr_renamed_9(n2 - n);
    }

    public void void_5() {
        this.cfr_renamed_6.cfr_renamed_7(this.cfr_renamed_5(_68.cfr_renamed_1));
        this.cfr_renamed_3();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected boolean boolean_5() throws _91 {
        try {
            _9 var1_1 = this.cfr_renamed_8;
            if (var1_1 == null) {
                return false;
            }
            _09 var2_3 = this.cfr_renamed_1.cfr_renamed_9();
            if (var2_3 == null) {
                return false;
            }
            _0W w = (_0W)this.cfr_renamed_5.cfr_renamed_5(var2_3, this.cfr_renamed_1);
            _3k k = this;
            synchronized (k) {
                var1_1 = this.cfr_renamed_8;
                if (var1_1 != null) {
                    var1_1.cfr_renamed_4(w.cfr_renamed_6(), 0, w.cfr_renamed_1());
                }
            }
            this.cfr_renamed_1.cfr_renamed_4();
        }
        catch (RuntimeException runtimeException) {
            throw new _91("Exception decoding audio frame", runtimeException);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean cfr_renamed_9(int n) throws _91 {
        boolean bl = true;
        if (this.cfr_renamed_6 != null) {
            this.cfr_renamed_6.cfr_renamed_0(this.cfr_renamed_5(_68.cfr_renamed_6));
        }
        while (n-- > 0 && bl) {
            bl = this.boolean_5();
        }
        _9 var3_3 = this.cfr_renamed_8;
        if (var3_3 != null) {
            var3_3.cfr_renamed_5();
            _3k k = this;
            synchronized (k) {
                this.cfr_renamed_3 = !this.cfr_renamed_4;
                this.cfr_renamed_3();
            }
            if (this.cfr_renamed_6 != null) {
                this.cfr_renamed_6.cfr_renamed_7(this.cfr_renamed_5(var3_3, _68.cfr_renamed_1));
            }
        }
        return bl;
    }
}

