/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6D;
import dev.krypton._6p_0;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._94;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9r;
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

public class _65
extends _6x_0 {
    public static final _94 cfr_renamed_4;
    public static final _92 cfr_renamed_7;
    public static final _9r cfr_renamed_9;
    public static final _9r cfr_renamed_150;
    public static final _9r cfr_renamed_8;
    public static final _9r cfr_renamed_2;
    public static final _9r cfr_renamed_3;
    public static final _92 cfr_renamed_1;
    public static final _9E cfr_renamed_361;
    public static final _9r cfr_renamed_6;
    private final _9r cfr_renamed_0;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @_3i_0
    public native void cfr_renamed_5(_6p_0 var1);

    @Override
    public native void cfr_renamed_5();

    public _65(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4608BFCC9C96L;
        long l5 = l3 ^ 0x1030288F14FFL;
        long l6 = l3 ^ 0xFF0BBABFB8DL;
        super((int)_65.a("m", 15493, (long)(0x38CDF0BBEF782696L ^ l2)), (int)_65.a("m", 9313, (long)(0x8F07F36A30C3E61L ^ l2)), (_4r)((Object)_65.c("\u00d9", -4765917278838664981L, (long)l2)), l5);
        this.cfr_renamed_0 = new _9r((int)_65.a("m", 22936, (long)(0x589EF1E42339C39DL ^ l2)), true, l4);
        _95[] nullArray = new _95[_65.a("m", 14723, (long)(0x6BC8BFF156632395L ^ l2))];
        nullArray[0] = _65.c("\u00d9", -4768403690460247218L, (long)l2);
        nullArray[1] = _65.c("\u00d9", -4768482263901792352L, (long)l2);
        nullArray[2] = _65.c("s", (Object)this, -4765750713801239698L, (long)l2);
        nullArray[3] = _65.c("\u00d9", -4765088622532192251L, (long)l2);
        nullArray[4] = _65.c("\u00d9", -4765202572646663482L, (long)l2);
        nullArray[5] = _65.c("\u00d9", -4768333130139912423L, (long)l2);
        nullArray[_65.a("m", 5281, (long)(0x5922771E2ED68EA5L ^ l2))] = _65.c("\u00d9", -4768708796402446571L, (long)l2);
        nullArray[_65.a("m", 869, (long)(0x135AE78F38981970L ^ l2))] = _65.c("\u00d9", -4768780239657715734L, (long)l2);
        nullArray[_65.a("m", 27905, (long)(0x5173D6F677B2F719L ^ l2))] = _65.c("\u00d9", -4768239001923508617L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = nullArray;
        objectArray[0] = l6;
        _65.c("\u00f3", (Object)this, (Object)objectArray, -4765437699981461293L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_65.class, 50);
                _65.b = l.a(-6686885126082367598L, 3726175190018223192L, MethodHandles.lookup().lookupClass()).a(36826500127234L);
                v0 = var11 = _65.b ^ 101372236866589L;
                var13_1 = v0 ^ 43425793224895L;
                var15_2 = v0 ^ 122099623726361L;
                var17_3 = v0 ^ 140104961782922L;
                var19_4 = v0 ^ 84407890285024L;
                _65.j = new Object[45];
                _65.k = new String[45];
                _65.b();
                _65.f = new HashMap<K, V>(13);
                var0_5 = Cipher.getInstance("DES/CBC/NoPadding");
                v1 = SecretKeyFactory.getInstance("DES");
                v2 = new byte[8];
                v3 = v2;
                v2[0] = (byte)(var11 >>> 56);
                for (var1_6 = 1; var1_6 < 8; ++var1_6) {
                    v3 = v3;
                    v3[var1_6] = (byte)(var11 << var1_6 * 8 >>> 56);
                }
                var0_5.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var6_7 = new long[22];
                var3_8 = 0;
                var4_9 = ",\u0081M\u0007\u00c4\u0090n\u00f5\u0015\t+\b{\u0093\u0092( \u00a4\u001b\u0016\u00f5i\u009cr\u000e\u00f7Z\u00d9\u00e7b\u008e\u0087\u00de\u00c9<\u00d0\u00d6e\u00f6\u00fc\u00e6o7~\u00a8\u001f!O\u008c\u00b1\u00bb\u00ec\u008f\u00cb\u001c\u0084S\u0098I\u0019Mv\t^dM\u00068\u00ba\u00d3\u008f/\u00a4\u001d\u00c6iL\u00d1C\u00f3dv\u0011\u0091E\u008a6~\u0003\u00ea\u00a9\u0016\u00b6\u009eI\b\u00b5&\u0012k\u00d8\u0085\u00ef\u00cf\u00c3\u0011\u00ad\u00db\u00fc\u0017\u0093)f=\u00c5\u008e\u008c\u00af\u0086\u0006\u00a5\u00c2\u00e1F@\u00b2$Qz\u00d4\u0091\u00a3\u0098\u001e\u00ca\u00b3\u0081\u00b3\u0096L\u000e\u0099}G\u00a5\u00b3\u00a2\u00c1\u00ec\f\u00b2\u00d3\u00c3\u00ebQL\u00da\u00a2\u0088\u00e3";
                var5_10 = ",\u0081M\u0007\u00c4\u0090n\u00f5\u0015\t+\b{\u0093\u0092( \u00a4\u001b\u0016\u00f5i\u009cr\u000e\u00f7Z\u00d9\u00e7b\u008e\u0087\u00de\u00c9<\u00d0\u00d6e\u00f6\u00fc\u00e6o7~\u00a8\u001f!O\u008c\u00b1\u00bb\u00ec\u008f\u00cb\u001c\u0084S\u0098I\u0019Mv\t^dM\u00068\u00ba\u00d3\u008f/\u00a4\u001d\u00c6iL\u00d1C\u00f3dv\u0011\u0091E\u008a6~\u0003\u00ea\u00a9\u0016\u00b6\u009eI\b\u00b5&\u0012k\u00d8\u0085\u00ef\u00cf\u00c3\u0011\u00ad\u00db\u00fc\u0017\u0093)f=\u00c5\u008e\u008c\u00af\u0086\u0006\u00a5\u00c2\u00e1F@\u00b2$Qz\u00d4\u0091\u00a3\u0098\u001e\u00ca\u00b3\u0081\u00b3\u0096L\u000e\u0099}G\u00a5\u00b3\u00a2\u00c1\u00ec\f\u00b2\u00d3\u00c3\u00ebQL\u00da\u00a2\u0088\u00e3".length();
                var2_11 = 0;
                while (true) {
                    var7_12 = var4_9.substring(var2_11, var2_11 += 8).getBytes("ISO-8859-1");
                    v4 = var6_7;
                    v5 = var3_8++;
                    v6 = ((long)var7_12[0] & 255L) << 56 | ((long)var7_12[1] & 255L) << 48 | ((long)var7_12[2] & 255L) << 40 | ((long)var7_12[3] & 255L) << 32 | ((long)var7_12[4] & 255L) << 24 | ((long)var7_12[5] & 255L) << 16 | ((long)var7_12[6] & 255L) << 8 | (long)var7_12[7] & 255L;
                    v7 = -1;
                    break block8;
                    break;
                }
lbl35:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var2_11 < var5_10) ** continue;
                    var4_9 = "\u00db\u001c\n\u0087\u00d8\u008a\u000bU\u000f$\u00d1\u000f\u00db\u0006\u00ef\u00e2";
                    var5_10 = "\u00db\u001c\n\u0087\u00d8\u008a\u000bU\u000f$\u00d1\u000f\u00db\u0006\u00ef\u00e2".length();
                    var2_11 = 0;
                    while (true) {
                        var7_12 = var4_9.substring(var2_11, var2_11 += 8).getBytes("ISO-8859-1");
                        v4 = var6_7;
                        v5 = var3_8++;
                        v6 = ((long)var7_12[0] & 255L) << 56 | ((long)var7_12[1] & 255L) << 48 | ((long)var7_12[2] & 255L) << 40 | ((long)var7_12[3] & 255L) << 32 | ((long)var7_12[4] & 255L) << 24 | ((long)var7_12[5] & 255L) << 16 | ((long)var7_12[6] & 255L) << 8 | (long)var7_12[7] & 255L;
                        v7 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var2_11 < var5_10) ** continue;
                    break block9;
                    break;
                }
            }
            var8_13 = v6;
            var10_14 = var0_5.doFinal(new byte[]{(byte)(var8_13 >>> 56), (byte)(var8_13 >>> 48), (byte)(var8_13 >>> 40), (byte)(var8_13 >>> 32), (byte)(var8_13 >>> 24), (byte)(var8_13 >>> 16), (byte)(var8_13 >>> 8), (byte)var8_13});
            v8 = ((long)var10_14[0] & 255L) << 56 | ((long)var10_14[1] & 255L) << 48 | ((long)var10_14[2] & 255L) << 40 | ((long)var10_14[3] & 255L) << 32 | ((long)var10_14[4] & 255L) << 24 | ((long)var10_14[5] & 255L) << 16 | ((long)var10_14[6] & 255L) << 8 | (long)var10_14[7] & 255L;
            switch (v7) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl61:
                // 1 sources

                ** continue;
            }
        }
        _65.d = var6_7;
        _65.e = new Integer[22];
        _65.cfr_renamed_4 = new _94((int)_65.a("m", (int)20658, (long)(3293996046034361126L ^ var11)), (int)_65.a("m", (int)3316, (long)(8604347875358017380L ^ var11)), (int)_65.a("m", (int)26582, (long)(6118583890840284229L ^ var11)), (int)_65.a("m", (int)4176, (long)(5202374661543074780L ^ var11)), var19_4);
        _65.cfr_renamed_7 = new _92((int)_65.a("m", (int)22917, (long)(3477891105257476634L ^ var11)), 0.0, var17_3, 255.0, 170.0, 1.0);
        _65.cfr_renamed_9 = new _9r((int)_65.a("m", (int)16036, (long)(8035710748113843513L ^ var11)), false, var15_2);
        _65.cfr_renamed_150 = new _9r((int)_65.a("m", (int)22549, (long)(3380854219544155021L ^ var11)), false, var15_2);
        _65.cfr_renamed_8 = new _9r((int)_65.a("m", (int)10379, (long)(1118575697878524698L ^ var11)), true, var15_2);
        _65.cfr_renamed_2 = new _9r((int)_65.a("m", (int)18477, (long)(2391322014646879163L ^ var11)), true, var15_2);
        _65.cfr_renamed_3 = new _9r((int)_65.a("m", (int)23259, (long)(203208761565860174L ^ var11)), true, var15_2);
        _65.cfr_renamed_1 = new _92((int)_65.a("m", (int)24364, (long)(6300916744062882994L ^ var11)), 1.0, var17_3, 10.0, 5.0, 1.0);
        _65.cfr_renamed_361 = new _9E((int)_65.a("m", (int)13035, (long)(5239205375749929328L ^ var11)), var13_1, (Enum)_65.c("\u00d9", (long)3193823079367811568L, (long)var11), _6D.class);
        _65.cfr_renamed_6 = new _9r((int)_65.a("m", (int)5255, (long)(922353003472461577L ^ var11)), true, var15_2);
    }

    private static native int e(long var0, long var2);

    private static native Object b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native void b();

    private static native MethodHandle b(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Method c(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field c(Class var0, String var1, Class var2);

    private static native CallSite c(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Method h(long var0, long var2);

    private static native Class f(long var0, long var2);

    private static native Field d(Class var0, String var1, Class var2);

    private static native Method d(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native MatchException a(MatchException var0);

    private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native int a(int var0, long var1);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field g(long var0, long var2);

    @Override
    public native void cfr_renamed_2();
}

