/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;

/*
 * Renamed from dev.krypton.6x
 */
public abstract class _6x_0 {
    private final List cfr_renamed_2;
    private final List cfr_renamed_4;
    private final byte cfr_renamed_0;
    private final _4r cfr_renamed_3;
    protected class_310 cfr_renamed_5;
    private boolean cfr_renamed_8;
    private boolean cfr_renamed_9;
    private int cfr_renamed_6;
    private static final long a;
    private static final String c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static final Object[] p;
    private static final String[] q;

    public native void cfr_renamed_5();

    public native void void_1(Object[] var1);

    public _6x_0(int n, int n2, _4r r, long l2) {
        _4w[] wArray;
        block7: {
            block8: {
                l2 = a ^ l2;
                this.cfr_renamed_2 = new ArrayList();
                this.cfr_renamed_4 = new ArrayList();
                wArray = _4r.cfr_renamed_2();
                try {
                    try {
                        _6x_0.e("G", (Object)this, (class_310)_6x_0.e("\u00c3", -1302464378651908229L, (long)l2), -1302353031224388204L, (long)l2);
                        if (wArray != null) break block7;
                        if ((n & _6x_0.b("t", 5018, (long)(0x41FB8DFB495D1C3L ^ l2))) == 0) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw _6x_0.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(c + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _6x_0.a(illegalArgumentException);
                }
            }
            this.cfr_renamed_0 = (byte)n;
            _6x_0.e("G", (Object)this, (boolean)_6x_0.b("t", 3845, (long)(0x45E8585540074D5DL ^ l2)), -1302390681786444704L, (long)l2);
            _6x_0.e("G", (Object)this, (int)n2, -1303392087258239939L, (long)l2);
            this.cfr_renamed_3 = r;
        }
        try {
            if (l2 > 0L && wArray != null) {
                _4w.cfr_renamed_8(new String[4]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _6x_0.a(illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a.b3478b03966d6fbad.a.init(_6x_0.class, 13);
        a = l.a(2722898543535918614L, -7930243885141324366L, MethodHandles.lookup().lookupClass()).a(106261266113067L);
        p = new Object[57];
        q = new String[57];
        _6x_0.a();
        long l2 = a ^ 0x351D0FC645F2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u0098\u00b2h\u00cb\u007fb\u00a7\u0096\u007fwW{\u00a7\u00ff\u00b7p\u0096\u00bf\u00c2\u0019\"\u008aa\u0098\u00cbU\u00e3$\u00f3\u008fA\u009b\u0001\u00df2M\u00be ;p".getBytes("ISO-8859-1"));
        c = _6x_0.a(byArray3).intern();
        i = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray5 = byArray5;
            byArray5[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00c8\u0014\r\\l}]o\u0096\\\u00b53\u00a7\u00b4\u00b05";
        int n2 = "\u00c8\u0014\r\\l}]o\u0096\\\u00b53\u00a7\u00b4\u00b05".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        g = lArray;
        h = new Integer[2];
    }

    private static native CallSite e(MethodHandles.Lookup var0, String var1, MethodType var2);

    public native String java_lang_String_9(Object[] var1);

    public native boolean cfr_renamed_1();

    public native int int_9(Object[] var1);

    public native void void_9(Object[] var1);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native int b(int var0, long var1);

    private static native Class b(long var0, long var2);

    private static native Field b(Class var0, String var1, Class var2);

    private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native void a();

    private static native Field a(Class var0, String var1, Class var2);

    private static native int a(long var0, long var2);

    private static native String a(byte[] var0);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native IllegalArgumentException a(IllegalArgumentException var0);

    public native void void_0(Object[] var1);

    public native void void_6(Object[] var1);

    public native void cfr_renamed_2();

    public native void void_2(Object[] var1);

    public native void void_3(Object[] var1);

    public native _4r dev_krypton_4r_4(Object[] var1);

    private native void void_4(Object[] var1);

    public native String java_lang_String_4(Object[] var1);

    public native void void_5(Object[] var1);

    public native List java_util_List_5(Object[] var1);

    protected native void void_7(Object[] var1);

    public native void void_8(Object[] var1);

    public native boolean boolean_8(Object[] var1);
}

