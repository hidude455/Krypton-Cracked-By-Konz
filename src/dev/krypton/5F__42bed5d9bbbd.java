/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_2661
 */
package dev.krypton;

import dev.krypton._39;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._66;
import dev.krypton._6e_0;
import dev.krypton._6o_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
import dev.krypton._9r;
import dev.krypton.l;
import java.io.IOException;
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
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_2661;

public class _5F
extends _6x_0 {
    private final _92 cfr_renamed_4;
    private final _6e_0 cfr_renamed_1;
    private final _9r cfr_renamed_7;
    private int cfr_renamed_6;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    public _5F(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x75A999E8F05FL;
        long l5 = l3 ^ 0x64500FA1CA2FL;
        long l6 = l3 ^ 0x65C9AB2189CCL;
        long l7 = l3 ^ 0x23910EAB7836L;
        long l8 = l3 ^ 0x3C519D8F9744L;
        long l9 = l3 ^ 0x63C5FC4DA500L;
        super((int)_5F.c("d", 8496, (long)(0x1F0FB375BE9DE2F3L ^ l2)), -1, (_4r)((Object)_5F.d("\u00dc", -3382049033761248139L, (long)l2)), l7);
        this.cfr_renamed_4 = new _92((int)_5F.c("d", 8466, (long)(0x5D073B875408E2D4L ^ l2)), 5.0, l6, 360.0, 50.0, 1.0);
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        this.cfr_renamed_1 = _5F.d("\u00e8", (Object)new _6e_0((int)_5F.c("d", 23406, (long)(0xE5233E019F218ACL ^ l2)), l9, ""), (Object)objectArray, -3383337576368513894L, (long)l2);
        this.cfr_renamed_7 = new _9r((int)_5F.c("d", 6182, (long)(0x1E31F4634101DBE7L ^ l2)), true, l4);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5F.d("\u00f0", (Object)this, -3381404576713452579L, (long)l2), _5F.d("\u00f0", (Object)this, -3383719416656999840L, (long)l2), _5F.d("\u00f0", (Object)this, -3382247528773658080L, (long)l2)};
        objectArray2[0] = l8;
        _5F.d("\u00e8", (Object)this, (Object)objectArray2, -3383035588617843392L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _5F.b = dev.krypton.l.a(5823709745754804310L, 4626567030849046105L, MethodHandles.lookup().lookupClass()).a(1583732181501L);
                        _5F.m = new Object[95];
                        _5F.n = new String[95];
                        _5F.b();
                        _5F.f = new HashMap<K, V>(13);
                        var11 = _5F.b ^ 112606076542562L;
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
                        var20_3 = new String[13];
                        var18_4 = 0;
                        var17_5 = "\u00b7\u0095r\u0013\u0010;\u0013B\u0092\u00c4^\u00a0v\u000f\u00ceSj~\u000e\u0017\u00e6\u00da\u000b\u00c5\u00de\\\u0099\u0000\u0095)\u0094\u00da\u00d2\u00c9\u00fa(@\u00fb;\u00bc\u00eb\u00b6\u00ee_DI\u0097#\u0096\u0090a3/\u00a6F9 6\u00a5=P\u00f8F\u0088\u000fgI\u007f\u00af\u00b1T\u0000\u00da=\u0087l\u009ds\u00d4:ZH\u0006&\u0016\u000bi\u0000: q\u0010\u00f8f[33\u0007@x\u00df\u0016~\u00ba\u00c1\u00d7Hwh\u00980b#\u0092mx\u00c0|\u00b2&\u0098\u0084(c\u00bc\u0017\u00a5c\u000e\u00d5\u0096p\u00ce\u0091\u001d\u000e:\u0082e\u0003\u00d2I`\u0089(\u0081\u0004\u0003\u001b\u00a2\u00f8\u00acek;\u00a8<b3x\u00feiv0\u00cd\u00f7\u000be\u00e6\u0083B\u00eb:\u000b\u00d5%\u001e\u00b1\u00ea\u0097A\u00cf\u0017\u009au\u00e2\u00e9\u00e1'\u00fe\u00f3\u00edU\u008c\u0005\u00e8\u00c9\b\u00c6Gp\u00c3q\u0080\u00c2\u00ccs\u00f0\u00f9\u00e9\u00d6\u00c0\u0010V\u00c6#Y~\u0014Q\u00ae\u001e;T\u009e]\u00eb\u0081\u008e\u0010\u0011\u00d5\u00a0$M@\u0097sQqt\u00ac\u00d3\u00f1\u00f8c\u0018\u00802\u008b\u000ec\u00a0\u00c3\u009e\u00e1\u00fdA\u00f7BQE\t\u0095jE\u00e1\u00c9\u00acR\u00d3 R\u0083\u00a35\u0007]\u00d1{(\u0086\u00c1\u00c4\u00af\u00e4\u0004p)-XN\u00b5j\u008b\u00b6Z\u00e3T\u0015\u001e\u00db\u00f1= \u00a2\u00c1\u000e\u00b1\u0017\u0007\u0019\u00adya\u0012c#\u00ad\u0094\u009a\u00d3\u00abO\u00d3\u0013\u00c9\u0096\u00fd0\u00c7\u00fa\u00deW\u001c\u00f7\u0001\u0018\rq\u00d5y\u00b5\u0003R\u0011`\u0002\u009fS\u00f3\u00d6i\u00e5}\u0002~,0\r}M";
                        var19_6 = "\u00b7\u0095r\u0013\u0010;\u0013B\u0092\u00c4^\u00a0v\u000f\u00ceSj~\u000e\u0017\u00e6\u00da\u000b\u00c5\u00de\\\u0099\u0000\u0095)\u0094\u00da\u00d2\u00c9\u00fa(@\u00fb;\u00bc\u00eb\u00b6\u00ee_DI\u0097#\u0096\u0090a3/\u00a6F9 6\u00a5=P\u00f8F\u0088\u000fgI\u007f\u00af\u00b1T\u0000\u00da=\u0087l\u009ds\u00d4:ZH\u0006&\u0016\u000bi\u0000: q\u0010\u00f8f[33\u0007@x\u00df\u0016~\u00ba\u00c1\u00d7Hwh\u00980b#\u0092mx\u00c0|\u00b2&\u0098\u0084(c\u00bc\u0017\u00a5c\u000e\u00d5\u0096p\u00ce\u0091\u001d\u000e:\u0082e\u0003\u00d2I`\u0089(\u0081\u0004\u0003\u001b\u00a2\u00f8\u00acek;\u00a8<b3x\u00feiv0\u00cd\u00f7\u000be\u00e6\u0083B\u00eb:\u000b\u00d5%\u001e\u00b1\u00ea\u0097A\u00cf\u0017\u009au\u00e2\u00e9\u00e1'\u00fe\u00f3\u00edU\u008c\u0005\u00e8\u00c9\b\u00c6Gp\u00c3q\u0080\u00c2\u00ccs\u00f0\u00f9\u00e9\u00d6\u00c0\u0010V\u00c6#Y~\u0014Q\u00ae\u001e;T\u009e]\u00eb\u0081\u008e\u0010\u0011\u00d5\u00a0$M@\u0097sQqt\u00ac\u00d3\u00f1\u00f8c\u0018\u00802\u008b\u000ec\u00a0\u00c3\u009e\u00e1\u00fdA\u00f7BQE\t\u0095jE\u00e1\u00c9\u00acR\u00d3 R\u0083\u00a35\u0007]\u00d1{(\u0086\u00c1\u00c4\u00af\u00e4\u0004p)-XN\u00b5j\u008b\u00b6Z\u00e3T\u0015\u001e\u00db\u00f1= \u00a2\u00c1\u000e\u00b1\u0017\u0007\u0019\u00adya\u0012c#\u00ad\u0094\u009a\u00d3\u00abO\u00d3\u0013\u00c9\u0096\u00fd0\u00c7\u00fa\u00deW\u001c\u00f7\u0001\u0018\rq\u00d5y\u00b5\u0003R\u0011`\u0002\u009fS\u00f3\u00d6i\u00e5}\u0002~,0\r}M".length();
                        var16_7 = 56;
                        var15_8 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _5F.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "&w\u008b\u000b\u008e\u007f\u008d\u00ee\u0013\u009c\u0006\u000f\u00fdG\t>\u00dd@\u00dfQ\u0095KY\u008f\u00f3\u00c2P+\u00c6\\\u0004P\u008a\u0096\u0012\b\u0098\u0007\u0002e\u00d0\u00fd\u00b6\u00ba;o\u00ff\u0089l\u00d6\u00cdi\u00d4\u00eb\u00c6\u00edf5\u00ac\u00be\u00e6\u00bf\u00f1\u00da\u0010a\u00db\u008e_g\u0096\u00cfX{?d\u0005ZY\u00fe1";
                            var19_6 = "&w\u008b\u000b\u008e\u007f\u008d\u00ee\u0013\u009c\u0006\u000f\u00fdG\t>\u00dd@\u00dfQ\u0095KY\u008f\u00f3\u00c2P+\u00c6\\\u0004P\u008a\u0096\u0012\b\u0098\u0007\u0002e\u00d0\u00fd\u00b6\u00ba;o\u00ff\u0089l\u00d6\u00cdi\u00d4\u00eb\u00c6\u00edf5\u00ac\u00be\u00e6\u00bf\u00f1\u00da\u0010a\u00db\u008e_g\u0096\u00cfX{?d\u0005ZY\u00fe1".length();
                            var16_7 = 64;
                            var15_8 = -1;
lbl37:
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
lbl42:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _5F.b(var21_9).intern();
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
lbl54:
                        // 1 sources

                        ** continue;
                    }
                }
                _5F.d = var20_3;
                _5F.e = new String[13];
                _5F.l = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "GrW\u00e9S\u0015p\u00cfv/\u000esO\u0002\u00c2)\u00c9R\u008b\u009f\u00ae\u0089\u007f[";
                var5_15 = "GrW\u00e9S\u0015p\u00cfv/\u000esO\u0002\u00c2)\u00c9R\u008b\u009f\u00ae\u0089\u007f[".length();
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
lbl81:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u0089\u0011\u0088@\u0001\b\u00d7\u00bf\u00f8\u00a8\u00a0\u00a8\u00c8?\u00bf\u00e1";
                    var5_15 = "\u0089\u0011\u0088@\u0001\b\u00d7\u00bf\u00f8\u00a8\u00a0\u00a8\u00c8?\u00bf\u00e1".length();
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
lbl94:
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
lbl107:
                // 1 sources

                ** continue;
            }
        }
        _5F.j = var6_12;
        _5F.k = new Integer[5];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5F.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 11;
            case 1 -> 53;
            case 2 -> 42;
            case 3 -> 41;
            case 4 -> 4;
            case 5 -> 43;
            case 6 -> 6;
            case 7 -> 36;
            case 8 -> 5;
            case 9 -> 13;
            case 10 -> 33;
            case 11 -> 0;
            case 12 -> 34;
            case 13 -> 56;
            case 14 -> 57;
            case 15 -> 22;
            case 16 -> 9;
            case 17 -> 16;
            case 18 -> 58;
            case 19 -> 30;
            case 20 -> 19;
            case 21 -> 29;
            case 22 -> 23;
            case 23 -> 40;
            case 24 -> 18;
            case 25 -> 26;
            case 26 -> 63;
            case 27 -> 31;
            case 28 -> 50;
            case 29 -> 7;
            case 30 -> 17;
            case 31 -> 10;
            case 32 -> 28;
            case 33 -> 14;
            case 34 -> 55;
            case 35 -> 60;
            case 36 -> 21;
            case 37 -> 25;
            case 38 -> 27;
            case 39 -> 38;
            case 40 -> 62;
            case 41 -> 49;
            case 42 -> 37;
            case 43 -> 12;
            case 44 -> 52;
            case 45 -> 8;
            case 46 -> 44;
            case 47 -> 20;
            case 48 -> 59;
            case 49 -> 51;
            case 50 -> 61;
            case 51 -> 24;
            case 52 -> 45;
            case 53 -> 39;
            case 54 -> 1;
            case 55 -> 48;
            case 56 -> 2;
            case 57 -> 15;
            case 58 -> 46;
            case 59 -> 35;
            case 60 -> 47;
            case 61 -> 54;
            case 62 -> 3;
            default -> 32;
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
        _5F.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f0' || c == 't' || c == '\u00dc' || c == 'C') {
                field = _5F.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5F.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5F.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "&w?W^Z;b=\u0016[\u0006q+";
        objectArray[1] = "Q9-0)y$\u0019&?86E\u0017-4<l1";
        objectArray[2] = "CS$~\\N^F&?Y\u0012\u0012p";
        objectArray[3] = Integer.TYPE;
        _5F.n[3] = "java/lang/Integer";
        objectArray[4] = "km`2\u0012M`bq}uUd~w1PD";
        objectArray[5] = ")C8O,$7K\"\u0000K%&P/Zm#";
        objectArray[6] = ".\u0010\u0019L!j3\u0005\u001b\r$6|:";
        objectArray[7] = "Txa\u000e\u0001-!Xj\u0001\u0010b@Va\n\u001484";
        objectArray[8] = Void.TYPE;
        _5F.n[8] = "java/lang/Void";
        objectArray[9] = "> T\u0011\u007fX (N^2B:\"W\u0002#H:5\f3>@$-G\u00040O8$d\u0005%X&$";
        objectArray[10] = "bX\u0005:LxiW\u0014u0afW\u00129\u000eq";
        objectArray[11] = "U\u000ba\u007fF\u0016^\u0004p0'\u0018U\u000ftj";
        objectArray[12] = "*\u0011B\u0011'\u0016*\u0011UM+\u00190ZUS+\f7+\u0001\u000b|";
        objectArray[13] = "T;a|CkT;v OdNpv>OqI\u0001'f\u001d";
        objectArray[14] = "c\u001d`IbIc\u001dw\u0015nFyVw\u000bnS~'\"T;";
        objectArray[15] = "+q;E\u0018% ~*\nr&4r!A";
        objectArray[16] = Double.TYPE;
        _5F.n[16] = "java/lang/Double";
        objectArray[17] = "(zs\u007f=U]Zxp,\u001a<Ts{(@H";
        objectArray[18] = "M4M]c\u0011M4Z\u0001o\u001eW\u007fZ\u001fo\u000bP\u000e\bA7O";
        objectArray[19] = "|\u000fR2ZF\t/Y=K\th!R6OS\u001c";
        objectArray[20] = "b\u0019\u0001\u0002,j\u00179\n\r=%v7\u0001\u00069\u007f\u0002";
        objectArray[21] = "6D!+!m+Q#j$1kS";
        objectArray[22] = "\u0001bwn\t\u001d\u001cwu/\fA\\5";
        objectArray[23] = "q\u001eNLK2\u0004>ECZ}e0NH^'\u0011";
        objectArray[24] = Long.TYPE;
        _5F.n[24] = "java/lang/Long";
        objectArray[25] = Boolean.TYPE;
        _5F.n[25] = "java/lang/Boolean";
        objectArray[26] = "x\u000f/z\u0010[\r/$u\u0001\u0014l!/~\u0005N\u0018";
        objectArray[27] = "}HxAw\u0003}Ho\u001d{\fg\u0003o\u0003{\u0019`r=Y/]";
        objectArray[28] = "\u000e\u0003;}_\u0017\u000e\u0003,!S\u0018\u0014H,?S\r\u00139}f\u0004O";
        objectArray[29] = "T\u0016~n\u000ea_\u0019o!syL\u001efh";
        objectArray[30] = "^riM7d^r~\u0011;kD9~\u000f;~CH+Pb";
        objectArray[31] = "\nB]xs\u001d\u0017W_9vAX\u0011";
        objectArray[32] = "R#%\u0015\r|'\u0003.\u001a\u001c3F\r%\u0011\u0018i2";
        objectArray[33] = "V\u0006\t\u001ao_V\u0006\u001eFcPLM\u001eXcEK<O\u00024\u0007";
        objectArray[34] = "\u0006zuk\u0014<\u0006zb7\u00183\u001c1b)\u0018&\u001b@3vJm";
        objectArray[35] = "\u0012C\u000ftFu\u000fV\r5C)@C";
        objectArray[36] = "\u000f\u0006c<t\u0005\u000f\u0006t`x\n\u0015Mt~x\u001f\u0012<\" ,\\";
        objectArray[37] = "U~?c\u0005\u001cU~(?\t\u0013O5(!\t\u0006HDx|X";
        objectArray[38] = "\u0016\u0018(<\u0015\u0000c8#3\u0004O\u00026(8\u0000\u0015v";
        objectArray[39] = "IOB=L[<oI2]\u0014]aB9YN)";
        objectArray[40] = "J\\\u001dX\u0005kWI\u001f\u0019\u00007\u001c";
        objectArray[41] = "0\u000foE_\u0000-\u001am\u0004Z\\dX";
        objectArray[42] = "\u0017\u001db\bwX\n\b`Ir\u0004E\u0000";
        objectArray[43] = "\"R\tvO\b?G\u000b7JT~u";
        objectArray[44] = "\r8\\\u001dy\"x\u0018W\u0012hm\u0019\u0016\\\u0019l7m";
        objectArray[45] = "&\u001fgu'1S?lz6~21gq2$F";
        objectArray[46] = "?\"w\u00026d\"7uC38o5";
        objectArray[47] = "#V\ty\u0005<Vv\u0002v\u0014s7x\t}\u0010)C";
        objectArray[48] = "J16*\u0011o?\u0011=%\u0000 ^\u001f6.\u0004z*";
        objectArray[49] = "j%\u0005\u001d6\u001c<eC`=lqr\u0007\u0004k\u0001e{\u0006\u001a\u0007\u0007<b\u0002QwQ|$\u007f";
        objectArray[50] = "a\u0014(@\u000ek3\neRm(XU;\u000e\b#cR4@T";
        objectArray[51] = "&Y~;7xy_!#\t!a\r;(u'g`z$j2#\u0007#\"w\"\u001d";
        objectArray[52] = "\u0012\"O\u0018|~S<\u0007\u001bMz.+U\u001c)*C?\\\u001d7F\u0010eS\bq:DeP\u0016M";
        objectArray[53] = "/-/B\u001a@p?3EyVl7\u0018Y\bJzQn\u001b\u0013]i8iC\u0000\u0017\u0011o-\\\u0019O}0?@\u001e,";
        objectArray[54] = "\u0019\u0004\u0006M\u0004D]DH\u00124g&.|qJSVI\u0007\u0017\u000e\u0013\u0018\u0016";
        objectArray[55] = "aAq\u001fX@8Gl\u000ffA7TnmYV<Mm\u001f\u0001[`E\u0012";
        objectArray[56] = "a\u000f\u0011@FR-\n\\\\'\b<\r@WK:nJ\u0019\u0000\u0016m`\u001aLP\u001a\u0000=MY\n'";
        objectArray[57] = "\u0016\u0007-m93Z\u0002`qXbG\u0014xq\u000f7\u0017E \u001di~\u001f\teofc_\u001b";
        objectArray[58] = "\u0011RFW2LC\u0018\u0017KU\n\u0011LUH\u0012\u001axB\u0017\\.\n\u0015XOLot\u0011RFW2LC\u0018\u0017KU";
        objectArray[59] = "KTn7]\u000f\u001d\u0014(JQ\u007fP\u0003l.\u0000\u0012D\nm0l\u0014\u001d\u0013i{\u001cB]U\u0014";
        objectArray[60] = "bE=SSHlE \u0004?_c\u0001'\bSm1F~_\u000e:?\u0016+\u000f\u0002WbA>U?";
        objectArray[61] = "4:\u0006\u0000w9bz@}wI/m\u0004\u0019*$;d\u0005\u0007F\"b}\u0001L6t\";|";
        objectArray[62] = "\b\u0005d\u0004^s^E\"yT\u0003\u0013Rf\u001d\u0003n\u0007[g\u0003oh^BcH\u001f>\u001e\u0004\u001e";
        objectArray[63] = "WY_iiM\u0005G\u0012{\n\tnONkdLR\u001c\u0014~2";
        objectArray[64] = "M^k3Y4^\u001fj%#a1\u001fp7G4\\\u000by6YX\u000fQv#\u001f$[Qu=#";
        objectArray[65] = "\u001c\u0013P5\r\u0002CUJ?wXr\u001eA5\u0013\u000e\u001f\nH4\rb\u0018QR6\t\u000f\u0002\tBww";
        objectArray[66] = "o\u0013K\u000bwg<I^]\u000ea\u0002\u001f\\Z56f\rC\u000b2[b\u0013[\u00182'mL\u0003Y\u000e";
        objectArray[67] = ")NlL\u0014vhP$O%u\u0015GvHA\"xS\u007fI_N+\tp\\\u00192\u007f\tsB%";
        objectArray[68] = "\u0007\u0015<y_\u0005\u0017\u0017a\"=\u0004\bSc}Q6X\u0013<%=\u0003\u001aVqzC\u0011\b\u001ez\u001a";
        objectArray[69] = "/=za-^??':O_ {%e#mp7y?OY)a)<>@0u:\u0002";
        objectArray[70] = "Ei\u001c>kuA}Hk\u0019`Kg\u0011auR\u001f+H?#\u0005\u001d\"N|'=B$\u0011d\u0019";
        objectArray[71] = "\u001e?\u0003y&>\u0010&E|@9z,\u0016c$k\u00178\u001fb:\u0007\u001a?\u001cf|{\u0015`D'@";
        objectArray[72] = "M?\u00072CM_-O9#\\B<%<YRI/~#GUC~\u000f:^AP@";
        objectArray[73] = "\\Y3\u0018f\u0017SDs\n\u001f\u0000\u0000Wj\u000fs2P\u00115X&e\bUz\u0017b\\\u0012Iu\u0006\u001f[SGfTc\u000fSDxh";
        objectArray[74] = "~H%\u000f^\nfW$\u0001!\u000buE+\u0003M9!\u0001qZ\u001an\"Xw\u0001\u0011U%W9]!";
        objectArray[75] = "jJO'xJ8T\u00025\u001b\u0003SVFki\f+V\u00011!";
        objectArray[76] = "\"\f\u0011x\bD0\u001eYsh_-\u000f\bm\u0004m|HT5P:#\u0017\u000efVK:\u000e\u001auhByCRh\u0005H}\u000bR\n";
        objectArray[77] = "+TG$7I3\u0017Q/SH2BD)\u0004\u001fl\u0015\u001cEcXb_Az/]/C";
        objectArray[78] = "\\\u0017s ^`\\P)h`$;\u001c'*\u0004tV\b.+\u001a\u0018X\b+>^iA\u0011?-`";
        objectArray[79] = "Q,pVQ8\f{e\fl0\r;|Q\u0000\u0002Y\u007f&\fld\u000b+|\u000b\u00019\\>&6\u0006j\u0019<b[\u001c2\t}\u001c";
        objectArray[80] = "\u0014\u0011\u0011q\u0001&\fR\u0007ze'\r\u0007\u0012|2pRZI\u0010\u0006;\u0001R\u0004`\u0002/U\u0007";
        objectArray[81] = "_CP\u0004\u000bMFZD\u00175R[]S\u0001I<_CP\u0004\u000bMFZD\u00175LV_R\u0004XX_^LhVXZK\b\u0019OANX6";
        objectArray[82] = "\u0018-Qq>~A+La\u0000yJ3tnpe#(Qc}%_'\u000e;<\u0019";
        objectArray[83] = "\u0001\u001eL4OHDZO}*\u000e9 ]2@\u000f\u001f_\u0018vCF";
        objectArray[84] = "[j1KSv\u001e.2\u000260LT \u001dJ{Kl#\u001a\u000es";
        objectArray[85] = "n}%S(J}<$ER\u001f\u00124/H3B},l^8";
        objectArray[86] = "q0w21va2*iSw~v(6?E)6uhn\u0012u{&:,vmd'4S";
        objectArray[87] = "h8\u001ac\u001dtq!\u000ep#dp\u0011\u0019w_t\u000b<\u001fo^9w3@7\u001f\u0005";
        objectArray[88] = "5b\u007f\u0001Q\r-}~\u000f.\f>oq\rB>j++T\u0016iir-\u000f\u001eRn}cS.";
        objectArray[89] = "Qv|7\u0006\u000b\u0010h447\u0003m\u007ff3S_\u0000ko2M3S1`'\u000bO\u00071c97";
        objectArray[90] = "K}rPjySbs^\u0015x@p|\\yJ\u00144&\u0005)\u001d\u0017m ^%&\u0010bn\u0002\u0015";
        objectArray[91] = "k>E{B\u0010ky\u001f3|Q\f5\u0011q\u0018\u0004a!\u0018p\u0006hk>E{B\u0010ky\u001f3|";
        objectArray[92] = "^Jl'X(B\r$->(k4i!GlD\buf\u000ff";
        objectArray[93] = "nJg\u0015M^mM#\u001d&[\u0015Tq\u001fB\nx@x\u001e\\fi\u0015j\u001b\\\nzTk\r&";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "a1*\bi93/g\u001a\nyX$%\u0001r;8{c\u001bx";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5F.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x12DF;
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
                throw new RuntimeException("dev/krypton/5F", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5F.k[n2] = n3;
        }
        return k[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _5F.e(l2, l3);
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
                String string2 = _5F.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5F.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5F.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5F.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5F.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5F.f(808663571991594L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5F.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5F.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5F.f(808663571991594L, 0L);
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
            int n = _5F.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5F.m[n] = clazz = Class.forName(_5F.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5F.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5F.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5F.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5F.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5F.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1AB9;
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
                throw new RuntimeException("dev/krypton/5F", exception);
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
            _5F.e[n2] = _5F.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _5F.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5F.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5F.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5F.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5F.c(clazz3, string2, clazz2)) != null) {
                    _5F.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5F.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5F.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5F.f(808663571991594L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_4(_9o o) {
        _5F f;
        int n;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        block31: {
            block32: {
                block30: {
                    CallSite callSite;
                    block29: {
                        long l15 = l14 = b ^ 0x208D80778730L;
                        l13 = l15 ^ 0x4B562E9D5A16L;
                        l12 = l15 ^ 0x250ED4FF93B7L;
                        l11 = l15 ^ 0x5321CB5FF33FL;
                        l10 = l15 ^ 0x27D67D680628L;
                        l9 = l15 ^ 0x7A04835EE095L;
                        l8 = l15 ^ 0x94E4CC1E2A5L;
                        l7 = l15 ^ 0x1B86782F62FBL;
                        l6 = l15 ^ 0x1DABE5191BAEL;
                        l5 = l15 ^ 0x52C58FFE8CAEL;
                        l4 = l15 ^ 0x778443B7C976L;
                        l3 = l15 ^ 0x37DC8BF2EBFAL;
                        l2 = l15 ^ 0x3074F895D75BL;
                        n = _7C.cfr_renamed_3();
                        try {
                            try {
                                try {
                                    callSite = _5F.d("\u00f0", (Object)this, 2765277711971225780L, (long)l14);
                                    if (n != 0) break block29;
                                    if (_5F.d("\u00f0", (Object)callSite, 2766938383005375161L, (long)l14) == null) return;
                                }
                                catch (MatchException matchException) {
                                    throw _5F.a(matchException);
                                }
                                f = this;
                                if (n != 0) break block30;
                            }
                            catch (MatchException matchException) {
                                throw _5F.a(matchException);
                            }
                            callSite = _5F.d("\u00f0", (Object)f, 2765277711971225780L, (long)l14);
                        }
                        catch (MatchException matchException) {
                            throw _5F.a(matchException);
                        }
                    }
                    try {
                        if (_5F.d("\u00f0", (Object)callSite, 2765614233736436281L, (long)l14) == null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _5F.a(matchException);
                    }
                    f = this;
                }
                try {
                    try {
                        if (n != 0) break block31;
                        if (_5F.d("\u00f0", (Object)f, 2772479211395652314L, (long)l14) <= 0) break block32;
                    }
                    catch (MatchException matchException) {
                        throw _5F.a(matchException);
                    }
                    _5F f2 = this;
                    _5F.d("t", (Object)f2, (int)(_5F.d("\u00f0", (Object)f2, 2772479211395652314L, (long)l14) - true), 2772479211395652314L, (long)l14);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5F.a(matchException);
                }
            }
            f = this;
        }
        CallSite callSite = _5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)_5F.d("\u00f0", (Object)f, 2765277711971225780L, (long)l14), 2766938383005375161L, (long)l14), 2772892667590637575L, (long)l14);
        CallSite callSite2 = _5F.d("\u00e8", (Object)_5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)_5F.d("\u00f0", (Object)this, 2765277711971225780L, (long)l14), 2765614233736436281L, (long)l14), 2766549174539364588L, (long)l14), 2772430194344376688L, (long)l14);
        while (_5F.d("\u00e8", (Object)callSite2, 2765748709029408106L, (long)l14) != false) {
            class_1657 class_16572;
            class_1297 class_12972;
            block35: {
                CallSite callSite3;
                block34: {
                    class_1297 class_12973;
                    block33: {
                        class_12972 = (class_1297)_5F.d("\u00e8", (Object)callSite2, 2772159175893084458L, (long)l14);
                        try {
                            class_12973 = class_12972;
                            if (n != 0) break block33;
                            if (!(class_12973 instanceof class_1657)) continue;
                        }
                        catch (MatchException matchException) {
                            throw _5F.a(matchException);
                        }
                        class_12973 = class_12972;
                    }
                    class_16572 = (class_1657)class_12973;
                    try {
                        if (class_12972 == _5F.d("\u00f0", (Object)_5F.d("\u00f0", (Object)this, 2765277711971225780L, (long)l14), 2766938383005375161L, (long)l14)) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _5F.a(matchException);
                    }
                    try {
                        try {
                            callSite3 = _5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)this, 2772694865349354677L, (long)l14), (long)l3, 2766839486077779441L, (long)l14);
                            if (n != 0) break block34;
                            if (callSite3 == false) break block35;
                        }
                        catch (MatchException matchException) {
                            throw _5F.a(matchException);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = _66.class;
                        objectArray[0] = l4;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l8;
                        objectArray2[0] = class_16572;
                        callSite3 = _5F.d("\u00e8", (Object)((_66)((Object)_5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)_5F.d("\u00dc", 2765660168321075712L, (long)l14), 2765300296255229026L, (long)l14), (Object)objectArray, 2765815721246937693L, (long)l14))), (Object)objectArray2, 2766502842751681511L, (long)l14);
                    }
                    catch (MatchException matchException) {
                        throw _5F.a(matchException);
                    }
                }
                if (callSite3 != false) continue;
            }
            CallSite callSite4 = _5F.d("\u00e8", (Object)callSite, (Object)_5F.d("\u00e8", (Object)class_12972, 2772612492984858690L, (long)l14), 2767056620065592618L, (long)l14);
            try {
                Object[] objectArray = new Object[1];
                objectArray[0] = l6;
                if (callSite4 > _5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)this, 2766015183674326280L, (long)l14), (Object)objectArray, 2766675335509454196L, (long)l14)) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw _5F.a(matchException);
            }
            CallSite callSite5 = _5F.d("\u00e8", (Object)_5F.d("\u00e8", (Object)class_16572, 2766446837850704358L, (long)l14), 2767315288332160275L, (long)l14);
            CallSite callSite6 = _5F.d("s", (String)((Object)_5F.a("t", 20299, (long)(0x7A2E8A7A699F387L ^ l14))) + (String)((Object)callSite5) + (String)((Object)_5F.a("t", 13667, (long)(0x2B259944F5A589ABL ^ l14))), 2766985233912222914L, (long)l14);
            _5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)_5F.d("\u00f0", (Object)_5F.d("\u00f0", (Object)this, 2765277711971225780L, (long)l14), 2766938383005375161L, (long)l14), 2772838236896103934L, (long)l14), (Object)new class_2661((class_2561)callSite6), 2767201911339595394L, (long)l14);
            _5F.d("t", (Object)this, (int)_5F.c("d", 8908, (long)(0x2EC2071323D11664L ^ l14)), 2772479211395652314L, (long)l14);
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            CallSite callSite7 = _5F.d("\u00e8", (Object)_5F.d("\u00f0", (Object)this, 2767346467364351304L, (long)l14), (Object)objectArray, 2767138569562594925L, (long)l14);
            try {
                if (_5F.d("\u00e8", (Object)callSite7, 2765408245099343995L, (long)l14) != false) {
                    continue;
                }
            }
            catch (MatchException matchException) {
                throw _5F.a(matchException);
            }
            CallSite callSite8 = _5F.d("\u00e8", (Object)class_16572, 2765454793688506811L, (long)l14);
            String string = (String)((Object)_5F.a("t", 20011, (long)(0x6FD5198D1410F2ECL ^ l14))) + (String)((Object)_5F.d("\u00e8", (Object)class_16572, 2766352267053370033L, (long)l14)) + (String)((Object)_5F.a("t", 18283, (long)(0x575A52065AF4FBA0L ^ l14)));
            _6o_0 o_0 = new _6o_0((String)((Object)callSite7));
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l9;
            objectArray3[0] = _5F.a("t", 26885, (long)(0x4F08AA3E90D4D5CAL ^ l14));
            _5F.d("\u00e8", (Object)o_0, (Object)objectArray3, 2772091290946572935L, (long)l14);
            _39 var41_27 = new _39();
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = _5F.a("t", 23538, (long)(0x10A3C3087015E734L ^ l14));
            objectArray4[0] = l2;
            _5F.d("\u00e8", (Object)var41_27, (Object)objectArray4, 2772961453165207539L, (long)l14);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = _5F.d("\u00dc", 2765885986898925107L, (long)l14);
            objectArray5[0] = l11;
            _5F.d("\u00e8", (Object)var41_27, (Object)objectArray5, 2772787778082626796L, (long)l14);
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l13;
            objectArray6[0] = string;
            _5F.d("\u00e8", (Object)var41_27, (Object)objectArray6, 2772301520594746873L, (long)l14);
            Object[] objectArray7 = new Object[4];
            objectArray7[3] = true;
            objectArray7[2] = callSite5;
            objectArray7[1] = l12;
            objectArray7[0] = _5F.a("t", 17713, (long)(0x68C810B83CBEF9F4L ^ l14));
            _5F.d("\u00e8", (Object)var41_27, (Object)objectArray7, 2772541209601954350L, (long)l14);
            Object[] objectArray8 = new Object[4];
            objectArray8[3] = true;
            objectArray8[2] = _5F.d("s", (Object)_5F.a("t", 8983, (long)(0x22CE6305914C1FDAL ^ l14)), (Object)new Object[]{_5F.d("s", (double)callSite4, 2773053149650316997L, (long)l14)}, 2765525966942081427L, (long)l14);
            objectArray8[1] = l12;
            objectArray8[0] = _5F.a("t", 26002, (long)(0x17E86D1F7A95D956L ^ l14));
            _5F.d("\u00e8", (Object)var41_27, (Object)objectArray8, 2772541209601954350L, (long)l14);
            CallSite callSite9 = _5F.d("\u00e8", (Object)callSite8, 2766147666884807151L, (long)l14);
            CallSite callSite10 = _5F.d("\u00e8", (Object)callSite8, 2766311443080377302L, (long)l14);
            CallSite callSite11 = _5F.d("\u00e8", (Object)callSite8, 2767392577958788231L, (long)l14);
            Object[] objectArray9 = new Object[4];
            objectArray9[3] = false;
            objectArray9[2] = (String)((Object)_5F.a("t", 4742, (long)(0x7170040439EB2E46L ^ l14))) + (int)callSite11 + (String)((Object)_5F.a("t", 23061, (long)(0x730EFD61AEAE66DCL ^ l14))) + (int)callSite10 + (String)((Object)_5F.a("t", 31870, (long)(0x4F8B6E91DA1040B4L ^ l14))) + (int)callSite9;
            objectArray9[1] = l12;
            objectArray9[0] = _5F.a("t", 7419, (long)(0x4B1C9B264D97A035L ^ l14));
            _5F.d("\u00e8", (Object)var41_27, (Object)objectArray9, 2772541209601954350L, (long)l14);
            Object[] objectArray10 = new Object[2];
            objectArray10[1] = l7;
            objectArray10[0] = var41_27;
            _5F.d("\u00e8", (Object)o_0, (Object)objectArray10, 2766809717342458484L, (long)l14);
            _5F.d("s", () -> _5F.cfr_renamed_7(l5, o_0), 2771989031368124224L, (long)l14);
            return;
        }
    }

    private static void cfr_renamed_7(long l2, _6o_0 o_0) {
        long l3 = (l2 = b ^ l2) ^ 0x5080E37485FCL;
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            _5F.d("\u00e8", (Object)o_0, (Object)objectArray, 830925098670891986L, (long)l2);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5F.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5F.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5F.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

