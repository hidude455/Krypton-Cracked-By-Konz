/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import com.google.gson.JsonObject;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _6 {
    private JsonObject cfr_renamed_1;
    private static boolean cfr_renamed_5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public native void void_1(Object[] var1);

    private native JsonObject com_google_gson_JsonObject_1(Object[] var1);

    public native List java_util_List_1(Object[] var1);

    public native void cfr_renamed_98(Object[] var1);

    private native void cfr_renamed_354(Object[] var1);

    public native void cfr_renamed_355(Object[] var1);

    public native void cfr_renamed_10(Object[] var1);

    public native void cfr_renamed_50(Object[] var1);

    public native void cfr_renamed_356(Object[] var1);

    public native void cfr_renamed_95(Object[] var1);

    private native void cfr_renamed_357(Object[] var1);

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a.b3478b03966d6fbad.a.init(_6.class, 0);
                        _6.a = l.a(-8417606685303455821L, -7988461809304930225L, MethodHandles.lookup().lookupClass()).a(44720563731472L);
                        _6.h = new Object[109];
                        _6.i = new String[109];
                        _6.a();
                        _6.d = new HashMap<K, V>(13);
                        _6.cfr_renamed_6(false);
                        var11 = _6.a ^ 60769771654228L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[15];
                        var18_4 = 0;
                        var17_5 = "+2\u009d\u00fd\u00ab\u0092+\u00fcQ`L\u0092S\u00b2\u001c8M\u00a8,\u00f0\u00c1\u00b2)h\u00804u\u00bb\u0098\u00dd\u009b\u0005\u0010\u0097c\u0019\u00cb\u00ce\u0014]\u0004\u00d8\u00e04M4:6\"\u0010\u001ca \u008eo\u00a3\u0090\u00b1\f\u00fe>\u00b7\u00ea\u000f\u00e3f\u0010o\u00aeol\u00c00\u00b3\u00fa\u0014\u0003sS\u00de\u008c>\u00f7\u00189\u009fLv\u00a2[q\u00c0_\u00dbT\u00bf1\u00a6,Q\u00d9OY\u00db^\u00bb\u0017\u00df\u0010\t\u00e3\u009733\u0014\u00a6\u009c\u0011p\u00f7\u00b2\u00b4\t]: A\b\u001c\u00cb.Kk\u00b0\u00b3,UF\u00a8\u00a2\u009c\u00f6 L\u009d&\u0014\u00f7O\u00ec\u0010E\u00d8\u00dd\u00ac7s\u00b5 2\u00ae\u00be\u009cl0X\u0089\u009b\u00beo\u00b7\u001d\tH/\u00a8h\b\u00ba\u0018\u0095\u00ad6\u00a3\u00e8\u00fc4Y\u009eg\u00e8\u0018\u0095\u00d5\u00cbJ\u00f0\u000ez\u00d6fJb@\u00c2\u00da!\u0006j\u00afFm\u00c8\u00b3\u0093\u00c5\u0018\u00a04>8\u00d1\u0097\u0013S\u00df\u00d2&\u0094\u00be\u0012\u001c\u00e4\u001f\u00ab\u00a8<e\r\u00cd\u00e9 q\u0017\u0000\u0080\u00aem\u00e6dU\u0093\u00de\u0016\u0087\u00dc\u00e2\u0083\u0013\u0099'\u00f3G\u00a3d%o\u001fM\u0006\u00b6\u00e3\u0013W\u0010\u00d2\u00d6\u00e2\u009fQNz\u0096\u0095\u00efP\u00c8sC\u00f3N\u0010\u00a7\u00de\b\u00b6'\u0080f|\u00c33\u009c3v\u00bf\u00c5\u009d";
                        var19_6 = "+2\u009d\u00fd\u00ab\u0092+\u00fcQ`L\u0092S\u00b2\u001c8M\u00a8,\u00f0\u00c1\u00b2)h\u00804u\u00bb\u0098\u00dd\u009b\u0005\u0010\u0097c\u0019\u00cb\u00ce\u0014]\u0004\u00d8\u00e04M4:6\"\u0010\u001ca \u008eo\u00a3\u0090\u00b1\f\u00fe>\u00b7\u00ea\u000f\u00e3f\u0010o\u00aeol\u00c00\u00b3\u00fa\u0014\u0003sS\u00de\u008c>\u00f7\u00189\u009fLv\u00a2[q\u00c0_\u00dbT\u00bf1\u00a6,Q\u00d9OY\u00db^\u00bb\u0017\u00df\u0010\t\u00e3\u009733\u0014\u00a6\u009c\u0011p\u00f7\u00b2\u00b4\t]: A\b\u001c\u00cb.Kk\u00b0\u00b3,UF\u00a8\u00a2\u009c\u00f6 L\u009d&\u0014\u00f7O\u00ec\u0010E\u00d8\u00dd\u00ac7s\u00b5 2\u00ae\u00be\u009cl0X\u0089\u009b\u00beo\u00b7\u001d\tH/\u00a8h\b\u00ba\u0018\u0095\u00ad6\u00a3\u00e8\u00fc4Y\u009eg\u00e8\u0018\u0095\u00d5\u00cbJ\u00f0\u000ez\u00d6fJb@\u00c2\u00da!\u0006j\u00afFm\u00c8\u00b3\u0093\u00c5\u0018\u00a04>8\u00d1\u0097\u0013S\u00df\u00d2&\u0094\u00be\u0012\u001c\u00e4\u001f\u00ab\u00a8<e\r\u00cd\u00e9 q\u0017\u0000\u0080\u00aem\u00e6dU\u0093\u00de\u0016\u0087\u00dc\u00e2\u0083\u0013\u0099'\u00f3G\u00a3d%o\u001fM\u0006\u00b6\u00e3\u0013W\u0010\u00d2\u00d6\u00e2\u009fQNz\u0096\u0095\u00efP\u00c8sC\u00f3N\u0010\u00a7\u00de\b\u00b6'\u0080f|\u00c33\u009c3v\u00bf\u00c5\u009d".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl25:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00ce\u00f1\u00ab\u00c5\u00d8?\u009erGhz\u00dc\u0018c\u0088S\u00d4^\u0082\u009c\u0013\u00dc;P\u0096\u0011}\u00f7hpT= \u00e6W\u00d0j\u00e6\u008fnP\u00e9\u009c\u007fMW1\n\u00f5k\u0000f\u008fP\u00cb\u001e\u009c\u00d5?\u00d7\u0088\u0016\u00c0\u00e5\u000f";
                            var19_6 = "\u00ce\u00f1\u00ab\u00c5\u00d8?\u009erGhz\u00dc\u0018c\u0088S\u00d4^\u0082\u009c\u0013\u00dc;P\u0096\u0011}\u00f7hpT= \u00e6W\u00d0j\u00e6\u008fnP\u00e9\u009c\u007fMW1\n\u00f5k\u0000f\u008fP\u00cb\u001e\u009c\u00d5?\u00d7\u0088\u0016\u00c0\u00e5\u000f".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl39:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl44:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl56:
                        // 1 sources

                        ** continue;
                    }
                }
                _6.b = var20_3;
                _6.c = new String[15];
                _6.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[11];
                var3_13 = 0;
                var4_14 = "\f\u0096\u0015gv\u00f8s\u0081G\u00f4\u00b6\u00b9\u00ec\u00baL\u00a8MN\u00f5\u00a0\u00a0\u00f5\u00eca\u00d5\u00af\u00cb\u00f0\u00e4\u00b0J4\u00ed1\u001cg\u00bb\u0093n\u0000\u00c0M\u00d0\u00b7_\u000e\u00dc\u00ca$\u009dB\u00b00\u00a2D\u0010\u00d9\u00ca\u001cM\u00bc\u009d`A\u00d1\u0015[\u00daJ3\u0097\u0083";
                var5_15 = "\f\u0096\u0015gv\u00f8s\u0081G\u00f4\u00b6\u00b9\u00ec\u00baL\u00a8MN\u00f5\u00a0\u00a0\u00f5\u00eca\u00d5\u00af\u00cb\u00f0\u00e4\u00b0J4\u00ed1\u001cg\u00bb\u0093n\u0000\u00c0M\u00d0\u00b7_\u000e\u00dc\u00ca$\u009dB\u00b00\u00a2D\u0010\u00d9\u00ca\u001cM\u00bc\u009d`A\u00d1\u0015[\u00daJ3\u0097\u0083".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl83:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00a1v\u0098\u0099\u0005\u00dd\\nSm4\u00e4=\u00f4n,";
                    var5_15 = "\u00a1v\u0098\u0099\u0005\u00dd\\nSm4\u00e4=\u00f4n,".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl96:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl109:
                // 1 sources

                ** continue;
            }
        }
        _6.e = var6_12;
        _6.f = new Integer[11];
    }

    private native void void_9(Object[] var1);

    public native int int_9(Object[] var1);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field b(Class var0, String var1, Class var2);

    private static native Class b(long var0, long var2);

    private static native int b(int var0, long var1);

    private static native int b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native String a(int var0, long var1);

    private static native void a();

    private static native int a(long var0, long var2);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field a(Class var0, String var1, Class var2);

    private static native String a(byte[] var0);

    private static native Exception a(Exception var0);

    public native String java_lang_String_0(Object[] var1);

    public native void void_0(Object[] var1);

    private native void cfr_renamed_2(Object[] var1);

    public native void cfr_renamed_358(Object[] var1);

    public native void cfr_renamed_3(Object[] var1);

    public static native boolean cfr_renamed_3();

    public static native void cfr_renamed_6(boolean var0);

    private native String java_lang_String_3(Object[] var1);

    public native void void_3(Object[] var1);

    public native List java_util_List_3(Object[] var1);

    public native void cfr_renamed_7(Object[] var1);

    public native void cfr_renamed_8(Object[] var1);

    public native void cfr_renamed_9(Object[] var1);

    public static native boolean cfr_renamed_9();

    public native void cfr_renamed_0(Object[] var1);
}

