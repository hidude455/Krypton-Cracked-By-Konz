/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _3I {
    public static final byte cfr_renamed_163;
    public static final byte cfr_renamed_6;
    public static final byte cfr_renamed_164;
    public static final byte cfr_renamed_165;
    public static final byte cfr_renamed_166;
    public static final byte cfr_renamed_167;
    public static final byte cfr_renamed_168;
    public static final byte cfr_renamed_3;
    public static final byte cfr_renamed_169;
    public static final byte cfr_renamed_170;
    public static final byte cfr_renamed_171;
    public static final byte cfr_renamed_172;
    public static final byte cfr_renamed_8;
    public static final byte cfr_renamed_2;
    public static final byte cfr_renamed_0;
    public static final byte cfr_renamed_173;
    public static final byte cfr_renamed_1;
    public static final byte cfr_renamed_142;
    public static final byte cfr_renamed_91;
    public static final byte cfr_renamed_174;
    public static final byte cfr_renamed_175;
    public static final byte cfr_renamed_176;
    public static final byte cfr_renamed_177;
    public static final byte cfr_renamed_5;
    public static final byte cfr_renamed_178;
    public static final byte cfr_renamed_179;
    public static final byte cfr_renamed_4;
    public static final byte cfr_renamed_180;
    public static final byte cfr_renamed_181;
    public static final byte cfr_renamed_80;
    public static final byte cfr_renamed_182;
    public static final byte cfr_renamed_7;
    public static final byte cfr_renamed_9;
    public static volatile byte[][] cfr_renamed_183;
    private static _4w[] cfr_renamed_184;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public static native byte[] cfr_renamed_5(Object[] var0);

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.b3478b03966d6fbad.a.init(_3I.class, 36);
                _3I.a = l.a(3384166622980353000L, 7281280319730931847L, MethodHandles.lookup().lookupClass()).a(242734916419899L);
                _3I.e = new Object[11];
                _3I.f = new String[11];
                _3I.a();
                _3I.d = new HashMap<K, V>(13);
                var0 = _3I.a ^ 125162514143652L;
                _3I.cfr_renamed_3(null);
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[35];
                var5_4 = 0;
                var6_5 = "\u00e0\u0002\u0088>\u00a3RS\u00b4\u00ea\u00c5\u00ba\u0081\u0098dJ\u001a\u00025n\u00c1\u00f9yn\u001d\u0015\u00b0\u00b8\u00e4\u00c1P\u00c7\u00d4\u00fb\u00c3\u00b2o#e\u0082\u00a7\u00ec5V|\u00822\u0003\u00d9e\u00b9\u001c\u00ab\u00ae\u00c9\u00e2\u00bd)\u001eVO\u00e2;\u008d\u00caG\u00f1\u00ec\"\u0006\u0088\u0081\u00d0\u00a3=j\u00d2\u0089b\u0084\u0080\u009d\u00fd_'\u0095T\u00ef[{\u00bb5L\u00b7\u00ecU\u00ea\u0084\u000e\u0081\u0090\u008f\u0002\u00a4\u00ef\u0010o\u00cf\u008f%v\rr~\u009bw\u00f4xy\u0091\u00e2f\u00cf\u00e1}\u009c\u00c9\u00fb\u008d\u0097\u00a5\u00b2)\u00a9\u0012\u00ac\u00ca \u001e\u0019\u0098\u00f9\u00c2i\u00cbY\u00bc\u001e \u00bf\u00ad\u00d0\u0014\u0080\u00e81\u008df\u007f\u00c7\u00f8\u00daT\u001dj\u00f4h\u009b\u0099\u008b\u001a\u00b4\u00f6\u00cd\u00c9\u0005\u00f7\n\u00ec\u008cD\u00f0\u0016\u00ce\u0001\u00dfV\u008c/\u00a6\u00ff\u00d6\u007f\u00f8\u00f5\u00da`\u00e2\u00ba\u00b0\u0019\u0016\u00c7\u0093\u00eb:oY\u00f8\u0018q[u\u00eb#;\u001e(\u00ea\b\u00ba\u00ed\u0013\u00ffD|\u00c8\u00d0\u00e6\u00be\u0091t\u00c4\u009c\u001c@\u0005\u00b5Kh\u00bb\u0087\u00b8Y\u0010>A\u00e9\u0081\u001f\u00d3\r%\u00dcda\u00a3p.>\u008c?\u00db\u00e3@";
                var7_6 = "\u00e0\u0002\u0088>\u00a3RS\u00b4\u00ea\u00c5\u00ba\u0081\u0098dJ\u001a\u00025n\u00c1\u00f9yn\u001d\u0015\u00b0\u00b8\u00e4\u00c1P\u00c7\u00d4\u00fb\u00c3\u00b2o#e\u0082\u00a7\u00ec5V|\u00822\u0003\u00d9e\u00b9\u001c\u00ab\u00ae\u00c9\u00e2\u00bd)\u001eVO\u00e2;\u008d\u00caG\u00f1\u00ec\"\u0006\u0088\u0081\u00d0\u00a3=j\u00d2\u0089b\u0084\u0080\u009d\u00fd_'\u0095T\u00ef[{\u00bb5L\u00b7\u00ecU\u00ea\u0084\u000e\u0081\u0090\u008f\u0002\u00a4\u00ef\u0010o\u00cf\u008f%v\rr~\u009bw\u00f4xy\u0091\u00e2f\u00cf\u00e1}\u009c\u00c9\u00fb\u008d\u0097\u00a5\u00b2)\u00a9\u0012\u00ac\u00ca \u001e\u0019\u0098\u00f9\u00c2i\u00cbY\u00bc\u001e \u00bf\u00ad\u00d0\u0014\u0080\u00e81\u008df\u007f\u00c7\u00f8\u00daT\u001dj\u00f4h\u009b\u0099\u008b\u001a\u00b4\u00f6\u00cd\u00c9\u0005\u00f7\n\u00ec\u008cD\u00f0\u0016\u00ce\u0001\u00dfV\u008c/\u00a6\u00ff\u00d6\u007f\u00f8\u00f5\u00da`\u00e2\u00ba\u00b0\u0019\u0016\u00c7\u0093\u00eb:oY\u00f8\u0018q[u\u00eb#;\u001e(\u00ea\b\u00ba\u00ed\u0013\u00ffD|\u00c8\u00d0\u00e6\u00be\u0091t\u00c4\u009c\u001c@\u0005\u00b5Kh\u00bb\u0087\u00b8Y\u0010>A\u00e9\u0081\u001f\u00d3\r%\u00dcda\u00a3p.>\u008c?\u00db\u00e3@".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0010\u00ce>I+\u00e1JZ\u00c8h\u00c81^\u0016\u0005\u00d9";
                    var7_6 = "\u0010\u00ce>I+\u00e1JZ\u00c8h\u00c81^\u0016\u0005\u00d9".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl57:
                // 1 sources

                ** continue;
            }
        }
        _3I.b = var8_3;
        _3I.c = new Integer[35];
        _3I.cfr_renamed_180 = (byte)_3I.a("t", (int)28491, (long)(var0 ^ 4764390128659832375L));
        _3I.cfr_renamed_178 = (byte)_3I.a("t", (int)21954, (long)(var0 ^ 8731080483708871843L));
        _3I.cfr_renamed_3 = (byte)_3I.a("t", (int)6875, (long)(var0 ^ 5165453510155103161L));
        _3I.cfr_renamed_170 = (byte)_3I.a("t", (int)30129, (long)(var0 ^ 3164017491954074833L));
        _3I.cfr_renamed_174 = (byte)_3I.a("t", (int)15780, (long)(var0 ^ 5024829665583975646L));
        _3I.cfr_renamed_9 = (byte)_3I.a("t", (int)23664, (long)(var0 ^ 414773577476287768L));
        _3I.cfr_renamed_0 = (byte)_3I.a("t", (int)13987, (long)(var0 ^ 3574365840477308892L));
        _3I.cfr_renamed_177 = (byte)_3I.a("t", (int)28955, (long)(var0 ^ 6780154102270263395L));
        _3I.cfr_renamed_1 = (byte)_3I.a("t", (int)28559, (long)(var0 ^ 6000611399178133236L));
        _3I.cfr_renamed_6 = (byte)_3I.a("t", (int)9485, (long)(var0 ^ 5026739137377424475L));
        _3I.cfr_renamed_168 = (byte)_3I.a("t", (int)18225, (long)(var0 ^ 927136082223478374L));
        _3I.cfr_renamed_166 = (byte)_3I.a("t", (int)2773, (long)(var0 ^ 6157955606717627302L));
        _3I.cfr_renamed_91 = (byte)_3I.a("t", (int)2911, (long)(var0 ^ 1822434077470292523L));
        _3I.cfr_renamed_172 = (byte)_3I.a("t", (int)25416, (long)(var0 ^ 194740126114714169L));
        _3I.cfr_renamed_179 = (byte)_3I.a("t", (int)20761, (long)(var0 ^ 2993500067867140172L));
        _3I.cfr_renamed_5 = (byte)_3I.a("t", (int)22581, (long)(var0 ^ 3842110995285682508L));
        _3I.cfr_renamed_182 = (byte)_3I.a("t", (int)20872, (long)(var0 ^ 9180927331823755500L));
        _3I.cfr_renamed_167 = (byte)_3I.a("t", (int)20449, (long)(var0 ^ 5338537996504809108L));
        _3I.cfr_renamed_171 = (byte)_3I.a("t", (int)18908, (long)(var0 ^ 3562025561812154544L));
        _3I.cfr_renamed_173 = (byte)_3I.a("t", (int)32585, (long)(var0 ^ 3048012902410522175L));
        _3I.cfr_renamed_181 = (byte)_3I.a("t", (int)31383, (long)(var0 ^ 8812906321408592874L));
        _3I.cfr_renamed_7 = (byte)_3I.a("t", (int)15540, (long)(var0 ^ 7507495894420344266L));
        _3I.cfr_renamed_163 = (byte)_3I.a("t", (int)32124, (long)(var0 ^ 6711202378651798549L));
        _3I.cfr_renamed_2 = (byte)_3I.a("t", (int)18253, (long)(var0 ^ 5742274084160681506L));
        _3I.cfr_renamed_169 = (byte)_3I.a("t", (int)7941, (long)(var0 ^ 9089645098866470510L));
        _3I.cfr_renamed_8 = (byte)_3I.a("t", (int)23735, (long)(var0 ^ 549649241313455577L));
        _3I.cfr_renamed_176 = (byte)_3I.a("t", (int)27279, (long)(var0 ^ 3820125076705221605L));
        _3I.cfr_renamed_80 = (byte)_3I.a("t", (int)24939, (long)(var0 ^ 8058103429075603462L));
        _3I.cfr_renamed_142 = (byte)_3I.a("t", (int)5221, (long)(var0 ^ 1173163346860500227L));
        _3I.cfr_renamed_4 = (byte)_3I.a("t", (int)5948, (long)(var0 ^ 2322482551345407577L));
        _3I.cfr_renamed_164 = (byte)_3I.a("t", (int)19749, (long)(var0 ^ 8957366901798353990L));
        _3I.cfr_renamed_165 = (byte)_3I.a("t", (int)31890, (long)(var0 ^ 2456866826084945397L));
        _3I.cfr_renamed_175 = (byte)_3I.a("t", (int)25288, (long)(var0 ^ 5495123474855007167L));
    }

    private static native Field b(Class var0, String var1, Class var2);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Class b(long var0, long var2);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native int a(long var0, long var2);

    private static native Field a(Class var0, String var1, Class var2);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native MatchException a(MatchException var0);

    private static native int a(int var0, long var1);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native void a();

    public static native void cfr_renamed_3(_4w[] var0);

    public static native _4w[] cfr_renamed_3();

    public static native byte cfr_renamed_7(Object[] var0);

    public static native String cfr_renamed_8(Object[] var0);
}

