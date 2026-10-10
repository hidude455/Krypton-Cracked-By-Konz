/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  3t
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._0e_0;
import dev.krypton._32;
import dev.krypton._3i_0;
import dev.krypton._4b_0;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._8W;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9z_0;
import dev.krypton.l;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.krypton.6i
 */
public class _6i_0
extends _6x_0 {
    public final _92 cfr_renamed_4;
    public final _9E cfr_renamed_3;
    private volatile _3k cfr_renamed_0;
    private _0e_0 cfr_renamed_1;
    private int cfr_renamed_6;
    private volatile _9z_0 cfr_renamed_9;
    private volatile boolean cfr_renamed_8;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    @Override
    public native void cfr_renamed_5();

    private void cfr_renamed_90(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x7A9F33645891L;
        long l5 = l3 ^ 0x249C35FC7F5CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        _6i_0.d("i", (Object)this, (Object)objectArray2, 8047593193066677110L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        _6i_0.d("i", (Object)this, (Object)objectArray3, 8047802690970797442L, (long)l2);
    }

    private void cfr_renamed_95(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        block7: {
            long l6;
            block8: {
                l5 = (Long)objectArray[0];
                long l7 = l5 = b ^ l5;
                l6 = l7 ^ 0x18975690C181L;
                l4 = l7 ^ 0x32362D614255L;
                l3 = l7 ^ 0x22D6CEA45CC0L;
                l2 = l7 ^ 0x1E2569A8DEDCL;
                int n = _32.cfr_renamed_4();
                try {
                    if (_6i_0.d("\u00ff", (Object)this, -3354580022580765841L, (long)l5) != false) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _6i_0.a((Exception)((Object)matchException));
                }
                callSite = _6i_0.d("R", -3353919581513598093L, (long)l5);
                try {
                    try {
                        if (n != 0) break block7;
                        if (callSite != null) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _6i_0.a((Exception)((Object)matchException));
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _6i_0.a((Exception)((Object)matchException));
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l6;
            _6i_0.d("i", (Object)this, (Object)objectArray2, -3354065355650892373L, (long)l5);
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        _0e_0 e_0 = (_0e_0)((Object)_6i_0.d("i", (Object)_6i_0.d("\u00ff", (Object)this, -3353477656176903958L, (long)l5), (Object)objectArray3, -3353892691696163959L, (long)l5));
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        CallSite callSite2 = _6i_0.d("i", (Object)_6i_0.d("\u00ff", (Object)this, -3353362656798523678L, (long)l5), (Object)objectArray4, -3354524540914228278L, (long)l5);
        _6i_0.d("v", (Object)this, (int)callSite2, -3353291984758742227L, (long)l5);
        _6i_0.d("v", (Object)this, (_0e_0)e_0, -3352692156533697405L, (long)l5);
        _6i_0.d("\u00c1", () -> this.cfr_renamed_4((String)((Object)callSite), e_0, l2, (int)callSite2), -3353029035016211807L, (long)l5);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_65(Object[] var1_1) {
        block5: {
            var2_2 = (Long)var1_1[0];
            var2_2 = _6i_0.b ^ var2_2;
            var5_3 = _6i_0.d("\u00ff", (Object)this, (long)-666649306792306628L, (long)var2_2);
            v0 = _32.cfr_renamed_2();
            _6i_0.d("v", (Object)this, null, (long)-666649306792306628L, (long)var2_2);
            var4_4 = v0;
            try {
                _6i_0.d("v", (Object)this, null, (long)-667051011997806897L, (long)var2_2);
                v1 = var5_3;
                if (var4_4 != 0) {
                    if (v1 == null) break block5;
                }
                ** GOTO lbl19
            }
            catch (Exception v2) {
                throw _6i_0.a(v2);
            }
            try {
                v1 = var5_3;
lbl19:
                // 2 sources

                v1.cfr_renamed_3();
            }
            catch (Exception var6_5) {
                // empty catch block
            }
        }
    }

    public _6i_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x5A8684DF56E6L;
        long l5 = l3 ^ 0x294E45F92D3L;
        long l6 = l3 ^ 0x44CC41D56329L;
        long l7 = l3 ^ 0x5B0CD2F18C5BL;
        super((int)_6i_0.c("a", 24646, (long)(0x3ADC867546F4BE4AL ^ l2)), -1, (_4r)((Object)_6i_0.d("R", -3886924541784229919L, (long)l2)), l6);
        this.cfr_renamed_4 = new _92((int)_6i_0.c("a", 29148, (long)(0x54F158DA7D392FD4L ^ l2)), 0.0, l5, 100.0, 50.0, 1.0);
        this.cfr_renamed_3 = new _9E((int)_6i_0.c("a", 21147, (long)(0x20BC0DA880160C91L ^ l2)), l4, (Enum)((Object)_6i_0.d("R", -3887846750499064085L, (long)l2)), _0e_0.class);
        _6i_0.d("v", (Object)this, (boolean)_6i_0.c("a", 3568, (long)(0x52B8EECB085653FEL ^ l2)), -3886800185913278446L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6i_0.d("\u00ff", (Object)this, -3887984703819307617L, (long)l2), _6i_0.d("\u00ff", (Object)this, -3887906951440784489L, (long)l2)};
        objectArray[0] = l7;
        _6i_0.d("i", (Object)this, (Object)objectArray, -3888825363948260799L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    a.init(_6i_0.class, 5);
                    _6i_0.b = dev.krypton.l.a(-6383898713057710466L, -2951708945421198395L, MethodHandles.lookup().lookupClass()).a(166169541877952L);
                    _6i_0.m = new Object[56];
                    _6i_0.n = new String[56];
                    _6i_0.b();
                    _6i_0.f = new HashMap<K, V>(13);
                    var11 = _6i_0.b ^ 114253421525168L;
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
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "\u009f9\u00c1~L\u001bj\u00b3!h\u00ba\u00fep)\u00fe\u007f\u0015;\u00fc\u00ba\u00e3\u009c<\u00ca\u0093\u0089\u00cb\u00fd#,\u00e0\u00ec-\u00d8\u00fe\u008e\u00b3\u0017\u0000\u00826\u00ba\u0007\u00bfp|\u00d1\u00c6\u00fa\u00ff\u008e\u00f6\u0013\u00f4\u00ca\u00c3\u00d1$+\u00f03\u00a6rR \u0099:/v#\u00e6?j\u000b\u00f9\u00b8\u00cc\u009e\u00bf=H\u001e\u00d0\u00e4\u008d\u00f3v\u0097\u00f5_\u0080\u00e5\u00ef\u00e60\u0002\u001c\u00dd\u0000\u0083\u0093\u00c7\u00d8\u0006^\u0089\u0087A!,\u00b9a\u00faS\u008b'X\u0001Z\u00a1Ho\u0098\u0085\u00f2.\u00b0uxj\u00caW\u00f7o\u00c2\u00e5\u00ec\u0003\u00fa\u0092_\u00b5\u00f0\u00b2\u00c7F\u00d3\u00e8\u0081_\u00c8\u0017(\u0018\u00bb\u00e4 p7Z\u00050'\u00fb\u008d\u00fc\u009f\u00981\u00a2\u008eH\u008f\u009a\u00c5\u00c8n\u00b0";
                    var19_6 = "\u009f9\u00c1~L\u001bj\u00b3!h\u00ba\u00fep)\u00fe\u007f\u0015;\u00fc\u00ba\u00e3\u009c<\u00ca\u0093\u0089\u00cb\u00fd#,\u00e0\u00ec-\u00d8\u00fe\u008e\u00b3\u0017\u0000\u00826\u00ba\u0007\u00bfp|\u00d1\u00c6\u00fa\u00ff\u008e\u00f6\u0013\u00f4\u00ca\u00c3\u00d1$+\u00f03\u00a6rR \u0099:/v#\u00e6?j\u000b\u00f9\u00b8\u00cc\u009e\u00bf=H\u001e\u00d0\u00e4\u008d\u00f3v\u0097\u00f5_\u0080\u00e5\u00ef\u00e60\u0002\u001c\u00dd\u0000\u0083\u0093\u00c7\u00d8\u0006^\u0089\u0087A!,\u00b9a\u00faS\u008b'X\u0001Z\u00a1Ho\u0098\u0085\u00f2.\u00b0uxj\u00caW\u00f7o\u00c2\u00e5\u00ec\u0003\u00fa\u0092_\u00b5\u00f0\u00b2\u00c7F\u00d3\u00e8\u0081_\u00c8\u0017(\u0018\u00bb\u00e4 p7Z\u00050'\u00fb\u008d\u00fc\u009f\u00981\u00a2\u008eH\u008f\u009a\u00c5\u00c8n\u00b0".length();
                    var16_7 = 80;
                    var15_8 = -1;
lbl24:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = _6i_0.b(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _6i_0.d = var20_3;
                _6i_0.e = new String[3];
                _6i_0.l = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "\u00a8mL\u00b3\u00c9\u00cb\u00adg\u00b9;\u0096\u001b\u00b6\u00b5\u00bbj\u0087\u0082\u0098\u0088\u00af\u00dbX\u009cG\u00b4\u00b3\u00e4l\u00d9\u00d5[\u00ba(\u00b7\u00bf\u0098|\t\u00de";
                var5_15 = "\u00a8mL\u00b3\u00c9\u00cb\u00adg\u00b9;\u0096\u001b\u00b6\u00b5\u00bbj\u0087\u0082\u0098\u0088\u00af\u00dbX\u009cG\u00b4\u00b3\u00e4l\u00d9\u00d5[\u00ba(\u00b7\u00bf\u0098|\t\u00de".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl62:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "G\u00cf\u0005\u00e9>\u0082e\u0085;\u00fa\u00a2<\u00ef\u0015\u001ei";
                    var5_15 = "G\u00cf\u0005\u00e9>\u0082e\u0085;\u00fa\u00a2<\u00ef\u0015\u001ei".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl88:
                // 1 sources

                ** continue;
            }
        }
        _6i_0.j = var6_12;
        _6i_0.k = new Integer[7];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_6i_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 18;
            case 2 -> 40;
            case 3 -> 48;
            case 4 -> 5;
            case 5 -> 41;
            case 6 -> 4;
            case 7 -> 21;
            case 8 -> 12;
            case 9 -> 42;
            case 10 -> 2;
            case 11 -> 44;
            case 12 -> 58;
            case 13 -> 61;
            case 14 -> 17;
            case 15 -> 20;
            case 16 -> 3;
            case 17 -> 47;
            case 18 -> 37;
            case 19 -> 35;
            case 20 -> 1;
            case 21 -> 16;
            case 22 -> 29;
            case 23 -> 15;
            case 24 -> 14;
            case 25 -> 24;
            case 26 -> 23;
            case 27 -> 59;
            case 28 -> 43;
            case 29 -> 36;
            case 30 -> 34;
            case 31 -> 25;
            case 32 -> 62;
            case 33 -> 45;
            case 34 -> 52;
            case 35 -> 39;
            case 36 -> 28;
            case 37 -> 56;
            case 38 -> 33;
            case 39 -> 22;
            case 40 -> 49;
            case 41 -> 31;
            case 42 -> 57;
            case 43 -> 46;
            case 44 -> 19;
            case 45 -> 8;
            case 46 -> 53;
            case 47 -> 32;
            case 48 -> 30;
            case 49 -> 51;
            case 50 -> 7;
            case 51 -> 50;
            case 52 -> 13;
            case 53 -> 54;
            case 54 -> 0;
            case 55 -> 60;
            case 56 -> 9;
            case 57 -> 6;
            case 58 -> 38;
            case 59 -> 26;
            case 60 -> 10;
            case 61 -> 11;
            case 62 -> 63;
            default -> 55;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l2 >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        _6i_0.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ff' || c == 'v' || c == 'R' || c == '\u00fb') {
                field = _6i_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6i_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (j >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "\u0015?h\u00177T\b*jV2\bG3";
        objectArray[1] = "fvxdQ_\u0013Vsk@\u0010rXx`DJ\u0006";
        objectArray[2] = Void.TYPE;
        _6i_0.n[2] = "java/lang/Void";
        objectArray[3] = Boolean.TYPE;
        _6i_0.n[3] = "java/lang/Boolean";
        objectArray[4] = "u'#A-Tz2{uQv";
        objectArray[5] = "U\u000bwRDyPDH]\u001aeK9uA\u000fqR";
        objectArray[6] = "}\u000f$>\u0010y`\u001a&\u007f\u0015% \u0010";
        objectArray[7] = "N)^\u000f\u001e\u0017;\tU\u0000\u000fXZ\u0007^\u000b\u000b\u0002.";
        objectArray[8] = "v\r^\u0003Ds}\u0002OL9fo\u0018M\u000f";
        objectArray[9] = "1\u001f;}zb4P\u001dn=e/-9n1j6";
        objectArray[10] = "d\nX\u0000(*o\u0005IOU2|\u0002@\u0006";
        objectArray[11] = "\u001c+j3\u0006-\u0001>hr\u0003qH+";
        objectArray[12] = "rO[Nw\"oZY\u000fr~ R";
        objectArray[13] = "k9\u00014(d\u001e\u0019\n;9+\u007f\u0017\u00010=q\u000b";
        objectArray[14] = "aV";
        objectArray[15] = "Hc*/xP=C! i\u001f\\M*+mE(";
        objectArray[16] = "\u001do\u0015#\"j\u0000z\u0017b'6@O";
        objectArray[17] = "\u000eQ7$\u001fV\u0013D5e\u001a\n^F";
        objectArray[18] = "ut\u0003@A9ha\u0001\u0001De(#";
        objectArray[19] = " _;NplU\u007f0Aa#4q;Jey@";
        objectArray[20] = "w<`\u0000L#\u0002\u001ck\u000f]lc\u0012`\u0004Y6\u0017";
        objectArray[21] = "uuIHJ ~zX\u0007!\"jy";
        objectArray[22] = "'<\u0014L:)R\u001c\u001fC+f3\u0012\u0014H/<G";
        objectArray[23] = Integer.TYPE;
        _6i_0.n[23] = "java/lang/Integer";
        objectArray[24] = "\u001e\nX;\u007fWk*S4n\u0018\n$X?jB~";
        objectArray[25] = Double.TYPE;
        _6i_0.n[25] = "java/lang/Double";
        objectArray[26] = "m3eQRp\u0018\u0013n^C?y\u001deUGe\r";
        objectArray[27] = "\b\u001epV\u001cl\u0016\u0016j\u0019Qv\f\u001csE@|\f\u000b(t]t\u0012\u0013cCS{\u000e\u001a@BFl\u0010\u001a";
        objectArray[28] = "o \u0002;f\u001bd/\u0013t\u001a\u0002k/\u00158$\u0012";
        objectArray[29] = "\u0010?Hc\u001d,\r*J\"\u0018pF";
        objectArray[30] = "\f_:\u001e^R\u0007P+Q?\\\f[/\u000b";
        objectArray[31] = ",'U\u007f si*\u0007\u0004mM(,\f|auh.Qd";
        objectArray[32] = "~:PKT\".\u007fP\u0006o#=nU \u0013>(jV{T!!3VC\u0012++e3";
        objectArray[33] = "@\u0015!X\u001by\u0012\u0004~Ua\u007f|\u0014-V\b|\u0007\u0019{I\\AE\u0016x\u000f\u001f>\u0016N$\u0001a";
        objectArray[34] = "E\fZ\u0005mMVMTX\u0001RY\u001ap\u001cpNO|[\n}J\u001b\u0016C\u0005kM$\u001dI\u0004cDA\u000e\b\n>(";
        objectArray[35] = "\u0011V\u001b\u001c{zT[Ig=~*Y\u0015\u0000nyQTC\u001f:D\u0013[@Yy;@\u0003\u001cW\u0007";
        objectArray[36] = "Z\u0002B\b%%\u001f\u000f\u0010sc\u001b\u000b\u0006\u0017C7t\b\u001d\u001c\u000b";
        objectArray[37] = "(\u0001Z#**m\f\bXn\u0014x\u001f\u00055,q+\u001e\u0002d";
        objectArray[38] = "XLTu<\u0000\u001dA\u0006\u000e{>\f\u0013\u0000n|\u0000\n_\u000eu";
        objectArray[39] = "@][M\b\u001d\u0000_\u0006U5n:bTYTB\u007f\u0007XSM\u0018GGZ\u000eU";
        objectArray[40] = "\u0006qdg'\u001fFs9\u007f\u001aAPqo\u001f$VU*ivwIFw\u0002";
        objectArray[41] = "YK.\u000b\u0004B\u0018\u0017<Eh\u0002iH`R\u0001\u0006\u0012E6MU;PJ5\u000b\u0016D\u0003\u0012i\u0005h";
        objectArray[42] = "L\u0019\u0015\u00190,\u001f\u0018\u0012HJs'\bD\u0013#t\\\u0005\u0012\fwIG\u0017\u001a\u001b%rH\n\u0011\u0010J";
        objectArray[43] = "C\u001ehZv!\u0002Bz\u0014\u001aes\u001d&\u0003se\b\u0010p\u001c'XJ\u001fsZd'\u0019G/T\u001a";
        objectArray[44] = "E<:!\u001b\u0012\u0004`(owZudxq\t\u0010\u0004! #Kk";
        objectArray[45] = "vcS~p\rl:RkMJ\u0015=@bs\u001e|n_q.";
        objectArray[46] = "%!g)4\u0004&:laZZO*<~3V4'jagk\".gh`R/tkwZ";
        objectArray[47] = ">6V:\u001a\u001aboQ<cE~)i{\u0005Rh7\u0015\u007f\u0001\u0019<";
        objectArray[48] = "sN.e\\mwJe1>i7I8rZwM\u0016/b\u0000z$E0q]\u0011tK:0@n'\u0013f>>";
        objectArray[49] = "7di\"\u001bJri;YXt0jk0\u001dLb{4=";
        objectArray[50] = "\u0000)Qnu\u001e\f/\f,Kh/V'R\u0017#\u0000)Qnu\u001e\f/\f,";
        objectArray[51] = "\u001d&\n$8qX+X_~\u0003&)\u00048-r]$R'yO\u001f+Qa:0Ls\roD";
        objectArray[52] = "\u00171c@vHR<1;7v\u0016b2Eq\u0007S:`\u0007";
        objectArray[53] = "_q{]Hg\fp|\f2?4`*W[?Om|H\u000f\u0002[0pP\u000e<]|~K2";
        objectArray[54] = "b\u007fX[L2'r\n \nIYpVGY1\"}\u0000X\r\f`r\u0003\u001eNs3*_\u00100";
        Object[] objectArray2 = objectArray;
        objectArray[55] = "';3;7Bb6a@{|--byw\rn4j>";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6i_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6i_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int j = 0; j < n; ++j) {
                if (classArray2[j] != classArray[j]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1408;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])l.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6i", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6i_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _6i_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _6i_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6i_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int j = 0; j < n5; ++j) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = _6i_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6i_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6i_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6i_0.f(2147067030671599L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6i_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6i_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6i_0.f(2147067030671599L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _6i_0.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _6i_0.m[n] = clazz = Class.forName(_6i_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6i_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6i_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6i_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6i_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _6i_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3FE2;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])f.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6i", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            _6i_0.e[n2] = _6i_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _6i_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _6i_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _6i_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6i_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6i_0.c(clazz3, string2, clazz2)) != null) {
                    _6i_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6i_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6i_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6i_0.f(2147067030671599L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_4(String var1_1, _0e_0 var2_2, long var3_3, int var5_4) {
        block19: {
            v0 = var3_3 = _6i_0.b ^ var3_3;
            var6_5 = v0 ^ 107129137784382L;
            var8_6 = v0 ^ 83289269021479L;
            var10_7 = v0 ^ 36981829896443L;
            var12_8 = _32.cfr_renamed_4();
            var13_9 = null;
            try {
                block20: {
                    block21: {
                        block22: {
                            block25: {
                                block27: {
                                    block26: {
                                        var14_10 = (String)_6i_0.a("h", (int)32661, (long)(6440775779998607768L ^ var3_3)) + var1_1 + (String)_6i_0.a("h", (int)29678, (long)(5750193446847391201L ^ var3_3)) + (String)_6i_0.d("i", (Object)var2_2, (long)-1592781797377798266L, (long)var3_3);
                                        var15_12 = new URL(var14_10);
                                        var16_14 = new _9z_0(_3t.cfr_renamed_0().cfr_renamed_4(), var6_5);
                                        v1 = new Object[2];
                                        v1[1] = Float.valueOf((float)var5_4 / 100.0f);
                                        v1[0] = var10_7;
                                        _6i_0.d("i", (Object)var16_14, (Object)v1, (long)-1592238920492849769L, (long)var3_3);
                                        var13_9 = new _3k((InputStream)_6i_0.d("i", (Object)var15_12, (long)-1592228316201101902L, (long)var3_3), var16_14);
                                        if (var12_8 != 0) break block25;
                                        if (_6i_0.d("\u00ff", (Object)this, (long)-1593575463508007937L, (long)var3_3) != false) ** GOTO lbl42
                                        break block26;
                                        catch (IOException v2) {
                                            throw _6i_0.a(v2);
                                        }
                                    }
                                    if (var3_3 <= 0L) break block19;
                                    v3 = this;
                                    if (var12_8 != 0) break block20;
                                    break block27;
                                    catch (IOException v4) {
                                        throw _6i_0.a(v4);
                                    }
                                }
                                try {
                                    block28: {
                                        if (var3_3 <= 0L) break block21;
                                        if (_6i_0.d("i", (Object)v3, (long)-1593048305964499614L, (long)var3_3) != false) break block22;
                                        break block28;
                                        catch (IOException v5) {
                                            throw _6i_0.a(v5);
                                        }
                                    }
                                    var13_9.cfr_renamed_3();
                                }
                                catch (IOException v6) {
                                    throw _6i_0.a(v6);
                                }
                            }
                            return;
                        }
                        var13_9.cfr_renamed_6(new _8W(this));
                        v7 = this;
                    }
                    _6i_0.d("v", (Object)v7, (_9z_0)var16_14, (long)-1593379189489774190L, (long)var3_3);
                    v3 = this;
                }
                _6i_0.d("v", (Object)v3, (_3k)var13_9, (long)-1593549350861387935L, (long)var3_3);
                var13_9.void_6();
            }
            catch (_91 | IOException var14_11) {
                block24: {
                    block23: {
                        try {
                            if (var3_3 <= 0L) break block23;
                            v8 = var13_9;
                            if (var12_8 == 0) {
                                if (v8 == null) break block23;
                            }
                            ** GOTO lbl71
                        }
                        catch (IOException v9) {
                            throw _6i_0.a(v9);
                        }
                        try {
                            v8 = var13_9;
lbl71:
                            // 2 sources

                            v8.cfr_renamed_3();
                        }
                        catch (Exception var15_13) {
                            // empty catch block
                        }
                    }
                    try {
                        try {
                            v10 = this;
                            if (var12_8 != 0) break block24;
                            if (_6i_0.d("\u00ff", (Object)v10, (long)-1593575463508007937L, (long)var3_3) != false) break block19;
                        }
                        catch (IOException v11) {
                            throw _6i_0.a(v11);
                        }
                        _6i_0.d("i", (Object)_6i_0.d("R", (long)-1592972446026122743L, (long)var3_3), (Object)_6i_0.a("h", (int)3050, (long)(4397162001318272486L ^ var3_3)), (long)-1593344338411990596L, (long)var3_3);
                        _6i_0.d("v", (Object)this, (boolean)_6i_0.c("a", (int)18076, (long)(135022823745665914L ^ var3_3)), (long)-1593575463508007937L, (long)var3_3);
                        v10 = this;
                    }
                    catch (IOException v12) {
                        throw _6i_0.a(v12);
                    }
                }
                v13 = new Object[2];
                v13[1] = false;
                v13[0] = var8_6;
                _6i_0.d("i", (Object)v10, (Object)v13, (long)-1592693040057703370L, (long)var3_3);
            }
        }
    }

    @Override
    public native void cfr_renamed_2();

    @_3i_0
    public void cfr_renamed_7(_4b_0 b_0) {
        block22: {
            CallSite callSite;
            long l2;
            long l3;
            long l4;
            block24: {
                _6i_0 i_0;
                int n;
                block23: {
                    long l5;
                    block20: {
                        long l6;
                        long l7;
                        block18: {
                            block19: {
                                long l8 = l4 = b ^ 0x3E92652784C4L;
                                l7 = l8 ^ 0x2411BDE9EB66L;
                                l6 = l8 ^ 0x6CB8A3ECF1A2L;
                                l3 = l8 ^ 0x7C584029EF37L;
                                l5 = l8 ^ 0x9AD22815F53L;
                                l2 = l8 ^ 0x279D37F8039CL;
                                n = _32.cfr_renamed_4();
                                try {
                                    try {
                                        i_0 = this;
                                        if (n != 0) break block18;
                                        if (_6i_0.d("i", (Object)i_0, 7098619959539873285L, (long)l4) != false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6i_0.a((Exception)((Object)matchException));
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _6i_0.a((Exception)((Object)matchException));
                                }
                            }
                            i_0 = this;
                        }
                        try {
                            block21: {
                                try {
                                    try {
                                        if (n != 0) break block20;
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l6;
                                        if (_6i_0.d("\u00ff", (Object)i_0, 7102043235209422708L, (long)l4) == _6i_0.d("i", (Object)_6i_0.d("\u00ff", (Object)this, 7098046126675200797L, (long)l4), (Object)objectArray, 7098740446698295422L, (long)l4)) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6i_0.a((Exception)((Object)matchException));
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l7;
                                    _6i_0.d("i", (Object)this, (Object)objectArray, 7097841640191127261L, (long)l4);
                                    if (n == 0) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw _6i_0.a((Exception)((Object)matchException));
                                }
                            }
                            i_0 = this;
                        }
                        catch (MatchException matchException) {
                            throw _6i_0.a((Exception)((Object)matchException));
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block23;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            if ((double)_6i_0.d("\u00ff", (Object)i_0, 7098209825041404122L, (long)l4) == _6i_0.d("i", (Object)_6i_0.d("\u00ff", (Object)this, 7097999433353858325L, (long)l4), (Object)objectArray, 7098450536359467390L, (long)l4)) break block22;
                        }
                        catch (MatchException matchException) {
                            throw _6i_0.a((Exception)((Object)matchException));
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l3;
                        _6i_0.d("v", (Object)this, (int)_6i_0.d("i", (Object)_6i_0.d("\u00ff", (Object)this, 7097999433353858325L, (long)l4), (Object)objectArray, 7099092746169192509L, (long)l4), 7098209825041404122L, (long)l4);
                        i_0 = this;
                    }
                    catch (MatchException matchException) {
                        throw _6i_0.a((Exception)((Object)matchException));
                    }
                }
                try {
                    try {
                        callSite = _6i_0.d("\u00ff", (Object)i_0, 7098843090925640437L, (long)l4);
                        if (n != 0) break block24;
                        if (callSite == null) break block22;
                    }
                    catch (MatchException matchException) {
                        throw _6i_0.a((Exception)((Object)matchException));
                    }
                    callSite = _6i_0.d("\u00ff", (Object)this, 7098843090925640437L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _6i_0.a((Exception)((Object)matchException));
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = Float.valueOf((float)_6i_0.d("i", (Object)_6i_0.d("\u00ff", (Object)this, 7097999433353858325L, (long)l4), (Object)objectArray, 7099092746169192509L, (long)l4) / 100.0f);
            objectArray2[0] = l2;
            _6i_0.d("i", (Object)callSite, (Object)objectArray2, 7097740207454514928L, (long)l4);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6i_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_6i_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_6i_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

