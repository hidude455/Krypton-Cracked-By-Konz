/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_2818
 *  net.minecraft.class_6574
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6Q;
import dev.krypton._6c_0;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._7J;
import dev.krypton._7T;
import dev.krypton._8B;
import dev.krypton._8h;
import dev.krypton._95;
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
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2818;
import net.minecraft.class_6574;

public class _6R
extends _6x_0 {
    private final _6e_0 cfr_renamed_2;
    private final double[] cfr_renamed_6;
    private class_6574 cfr_renamed_9;
    private ExecutorService cfr_renamed_7;
    private HashSet cfr_renamed_1;
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

    private void cfr_renamed_126(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x1067F08849A4L;
        long l5 = l3 ^ 0x67F081E6D57EL;
        String string = _8h.cfr_renamed_4();
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite = _6R.d("m", (Object)_6R.d("t", (Object)objectArray2, 961351359867594165L, (long)l2), 957468177787701447L, (long)l2);
        while (_6R.d("m", (Object)callSite, 958225289159033852L, (long)l2) != false) {
            class_2818 class_28182 = (class_2818)_6R.d("m", (Object)callSite, 960967465154081650L, (long)l2);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = class_28182;
            objectArray3[0] = l5;
            _6R.d("m", (Object)this, (Object)objectArray3, 960403047188307686L, (long)l2);
            if (string == null) continue;
        }
    }

    private void cfr_renamed_305(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_2818 class_28182 = (class_2818)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x19E9F16C8FBAL;
        _6R.d("m", (Object)_6R.d("\u00aa", (Object)this, 5257388200117210038L, (long)l2), () -> this.cfr_renamed_2(l3, class_28182), 5255638783935514749L, (long)l2);
    }

    public _6R(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4ED1561498F0L;
        long l5 = l3 ^ 0x5111C5307782L;
        long l6 = l3 ^ 0xE85A4F245C6L;
        super((int)_6R.c("b", 25321, (long)(0x6CBED5478F347422L ^ l2)), -1, (_4r)((Object)_6R.d("O", 3588877454118790869L, (long)l2)), l4);
        this.cfr_renamed_2 = new _6e_0((int)_6R.c("b", 8627, (long)(0x2DDAA9444B7FB77BL ^ l2)), l6, "");
        double[] dArray = new double[_6R.c("b", 5426, (long)(0x25F2556398183F5L ^ l2))];
        dArray[0] = 1.0;
        dArray[1] = 0.875;
        dArray[2] = 0.75;
        dArray[3] = 0.625;
        dArray[4] = 0.5;
        dArray[5] = 0.375;
        dArray[_6R.c("b", 27054, (long)(0x1BD2932BC1707F6DL ^ l2))] = 0.25;
        dArray[_6R.c("b", 374, (long)(0x1FE79CCBF07497BCL ^ l2))] = 0.125;
        this.cfr_renamed_6 = dArray;
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6R.d("\u00aa", (Object)this, 3587848937125248387L, (long)l2)};
        objectArray[0] = l5;
        _6R.d("m", (Object)this, (Object)objectArray, 3588039477730541358L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        a.init(_6R.class, 46);
                        _6R.b = dev.krypton.l.a(-254676602640003011L, 2123555089102393408L, MethodHandles.lookup().lookupClass()).a(175398180167178L);
                        _6R.m = new Object[95];
                        _6R.n = new String[95];
                        _6R.b();
                        _6R.f = new HashMap<K, V>(13);
                        var11 = _6R.b ^ 63701032956179L;
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u001c]:Rlk@\u0087\u00f7\u0080:\u001eS\n\n\u00a4\u00104G\u00f6\u0082h\u00f1\u00ef*\u009e\u0099l\u00c0w\u00b0d[";
                        var19_6 = "\u001c]:Rlk@\u0087\u00f7\u0080:\u001eS\n\n\u00a4\u00104G\u00f6\u0082h\u00f1\u00ef*\u009e\u0099l\u00c0w\u00b0d[".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl24:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6R.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00dd8\u0016\u00afV\u00f2\u00a9\u00bf\u0006y_\u0011\u0085\u00d98p\u00f4\u0098\u00f3\u00e4\u0082\u00db\u00f5-(\u00a21v\u009b\u00fc\u00fa}El\u009bI\u00e9:\u00cb\u0018q\u00bc&\u00a7\u00d5bC\u00a5\u00c4\u0002n\u007f\u00c1\u00a4\b%<P\u00e5\u00eb\u00b0\u00f2\u00da\u00bd\u0088";
                            var19_6 = "\u00dd8\u0016\u00afV\u00f2\u00a9\u00bf\u0006y_\u0011\u0085\u00d98p\u00f4\u0098\u00f3\u00e4\u0082\u00db\u00f5-(\u00a21v\u009b\u00fc\u00fa}El\u009bI\u00e9:\u00cb\u0018q\u00bc&\u00a7\u00d5bC\u00a5\u00c4\u0002n\u007f\u00c1\u00a4\b%<P\u00e5\u00eb\u00b0\u00f2\u00da\u00bd\u0088".length();
                            var16_7 = 24;
                            var15_8 = -1;
lbl38:
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
lbl43:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _6R.b(var21_9).intern();
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
lbl55:
                        // 1 sources

                        ** continue;
                    }
                }
                _6R.d = var20_3;
                _6R.e = new String[4];
                _6R.l = new HashMap<K, V>(13);
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
                var4_14 = "\u00cc\r`\u00e4\u00f9\u009f\u00e8O1'=[\u00bd\u000b\u00b0\u001fGt\u00c7\u00c3(c\u0081qbv\u0016%\u00b0\u001a\u00aa=\u00c9S\u00cd\u00f7{S\u0013G\u0094\u001f\u00c6\u00fe\u00ca\u00152\u00a6{\u00dd\u00d7\u00b3\u00ee\f[\u00f0. A\u00b6\u00b82\u00cb|*\u00e2\u00dec\u00ca\u001f*\u00e1";
                var5_15 = "\u00cc\r`\u00e4\u00f9\u009f\u00e8O1'=[\u00bd\u000b\u00b0\u001fGt\u00c7\u00c3(c\u0081qbv\u0016%\u00b0\u001a\u00aa=\u00c9S\u00cd\u00f7{S\u0013G\u0094\u001f\u00c6\u00fe\u00ca\u00152\u00a6{\u00dd\u00d7\u00b3\u00ee\f[\u00f0. A\u00b6\u00b82\u00cb|*\u00e2\u00dec\u00ca\u001f*\u00e1".length();
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
lbl82:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "q\u0003\u0084JT3\u001e\u00aa\u0085I[\u0004\u0089\u00b2\u0004\u00c3";
                    var5_15 = "q\u0003\u0084JT3\u001e\u00aa\u0085I[\u0004\u0089\u00b2\u0004\u00c3".length();
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
lbl95:
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
lbl108:
                // 1 sources

                ** continue;
            }
        }
        _6R.j = var6_12;
        _6R.k = new Integer[11];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_6R.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 28;
            case 2 -> 54;
            case 3 -> 8;
            case 4 -> 29;
            case 5 -> 41;
            case 6 -> 15;
            case 7 -> 16;
            case 8 -> 3;
            case 9 -> 0;
            case 10 -> 24;
            case 11 -> 22;
            case 12 -> 10;
            case 13 -> 49;
            case 14 -> 34;
            case 15 -> 11;
            case 16 -> 35;
            case 17 -> 21;
            case 18 -> 18;
            case 19 -> 31;
            case 20 -> 9;
            case 21 -> 48;
            case 22 -> 23;
            case 23 -> 60;
            case 24 -> 37;
            case 25 -> 46;
            case 26 -> 27;
            case 27 -> 32;
            case 28 -> 17;
            case 29 -> 40;
            case 30 -> 5;
            case 31 -> 1;
            case 32 -> 12;
            case 33 -> 13;
            case 34 -> 30;
            case 35 -> 55;
            case 36 -> 38;
            case 37 -> 51;
            case 38 -> 62;
            case 39 -> 42;
            case 40 -> 58;
            case 41 -> 59;
            case 42 -> 2;
            case 43 -> 19;
            case 44 -> 33;
            case 45 -> 44;
            case 46 -> 43;
            case 47 -> 45;
            case 48 -> 50;
            case 49 -> 4;
            case 50 -> 7;
            case 51 -> 25;
            case 52 -> 6;
            case 53 -> 39;
            case 54 -> 47;
            case 55 -> 52;
            case 56 -> 36;
            case 57 -> 14;
            case 58 -> 56;
            case 59 -> 57;
            case 60 -> 61;
            case 61 -> 63;
            case 62 -> 53;
            default -> 20;
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
        _6R.n[n3] = new String(cArray);
        return n3;
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
        m[0] = "S,TvKKN9V7N\u0017\u0001\u001b";
        objectArray[1] = "qZM^o\u001aoRW\u0011\t\u000ehShZ5";
        objectArray[2] = ")\u0016W{i~)\u0016@'eq3]@9ed4,\u0011c<'";
        objectArray[3] = ".\u000fJY\u007f\u0005.\u000f]\u0005s\n4D]\u001bs\u001f35\fE&T";
        objectArray[4] = "\u00193\u000e\b?gl\u0013\u0005\u0007.(\r\u001d\u000e\f*ry";
        objectArray[5] = Boolean.TYPE;
        _6R.n[5] = "java/lang/Boolean";
        objectArray[6] = "w;{\u001cNDw;l@BKmpl^B^j\u0001=\n\u0012\u0015";
        objectArray[7] = "\rc\u0004# \u007f\rc\u0013\u007f,p\u0017(\u0013a,e\u0010YA4\u007f%";
        objectArray[8] = "\u0016D\u0000:u@\u0016D\u0017fyO\f\u000f\u0017xyZ\u000b~F&,\u001f";
        objectArray[9] = Integer.TYPE;
        _6R.n[9] = "java/lang/Integer";
        objectArray[10] = "h8J}{\u0017u-H<~K?i";
        objectArray[11] = "<VhP6cIvc_',(xhT#v\\";
        objectArray[12] = Void.TYPE;
        _6R.n[12] = "java/lang/Void";
        objectArray[13] = "\u000f\u0003\u000e\u0017@:\u0004\f\u001fX!4\u000f\u0007\u001b\u0002";
        objectArray[14] = "^\b\u001dQ[|C\u001d\u001f\u0010^ \r9";
        objectArray[15] = "?55C;\u0002J\u0015>L*M+\u001b5G.\u0017_";
        objectArray[16] = "\u001f@\u0018L4E\u0001H\u0002\u0003y_\u001bB\u001b_hU\u001bU@hbU\u0016T\u001aBhc\u0010S\u0018DyU";
        objectArray[17] = "U\u0001)X4\u001bK\t3\u0017V\u0007L\u0014";
        objectArray[18] = "O7f-\u007fp:\u0017m\"n?[\u0019f)je/";
        objectArray[19] = "4Aw\u0014\tq4A`H\u0005~.\n`V\u0005k){1\fS*";
        objectArray[20] = "BS\u000b^e}BS\u001c\u0002irX\u0018\u001c\u001cig_iLA8";
        objectArray[21] = "\u000f\u0006$\"\n\u0007\u000f\u00063~\u0006\b\u0015M3`\u0006\u001d\u0012<f?_";
        objectArray[22] = "^z!\u0012g1Co#Sbm\fg";
        objectArray[23] = "/\u0006\u0005mnc1\u000e\u001f\"\tb \u0015\u0012x/d";
        objectArray[24] = "aL\u001a[\nm|Y\u0018\u001a\u000f11o";
        objectArray[25] = "L@A(\u0003T9`J'\u0012\u001bXnA,\u0016A,";
        objectArray[26] = "&\r\"e[\"-\u00023*';\"\u00025f\u0019+";
        objectArray[27] = "\u000e\\\r\t\u001a6\u0010T\u0017FW,\n^\u000e\u001aF&\nIU.A7\u0011O\u001e";
        objectArray[28] = "\u0018\u0004I}\u0011@\u0005\u0011K<\u0014\u001cJ\u0004";
        objectArray[29] = "\t\"Lnqv\u00147N/t*Y5";
        objectArray[30] = "V\u0000}\u0016\u0006\u000e# v\u0019\u0017AB.}\u0012\u0013\u001b6";
        objectArray[31] = "\te\f\ta\u000f|E\u0007\u0006p@\u001dK\f\rt\u001ai";
        objectArray[32] = "}b%\u0004{e}b2Xwjg)2Fw\u007f`Xf\u001e ";
        objectArray[33] = "[>^ih][>I5dRAuI+dGF\u0004\u001f\u007f4\r";
        objectArray[34] = "YK`KyEYKw\u0017uJC\u0000w\tu_Dq\"P#\u0018";
        objectArray[35] = "9CsZ\fjLcxU\u001d%-ms^\u0019\u007fY";
        objectArray[36] = "J\f\bS\u0007UA\u0003\u0019\u001czMR\u0004\u0010U";
        objectArray[37] = ":\\H#u\r:\\_\u007fy\u0002 \u0017_ay\u0017'f\n;/S";
        objectArray[38] = "-\u0016G(\u0018q&\u0019Vgzr)\u0010";
        objectArray[39] = Long.TYPE;
        _6R.n[39] = "java/lang/Long";
        objectArray[40] = "\r0\u001dw#g\u00138\u00078n}\t2\u001ed\u007fw\t%ESuw\u0004$\u001fy\u007fa";
        objectArray[41] = "\u0001w8_Y\ttW3PHF\u0015Y8[L\u001ca";
        objectArray[42] = Float.TYPE;
        _6R.n[42] = "java/lang/Float";
        objectArray[43] = "<\u001c";
        objectArray[44] = "k=1$H?v(3eMc6 ";
        objectArray[45] = "<^\u0015wO.!K\u00176JrlP";
        objectArray[46] = "\u0001EM(?\u007fteF'.0\u0015kM,*ja";
        objectArray[47] = "9h+\u0004L1:3ph\u0018M&oq\u0010C*;2.";
        objectArray[48] = "\u0002Ga\u0007qG\u0001\u001c:k*lfZh\u0015kB\u0005NtSd;VYf\u0012nC\u0017Ud[\u0014";
        objectArray[49] = "\u0002^y+R\u001fTCj,,\u0014\bEx}K\u0010\u000e~cn,\u0004\u0001Sev@\u0012\u0007@m\u0011";
        objectArray[50] = "\u0016H_}\u001e+\u000b\u0015\u0000\u0005\u001f(\u0000D\u001a\u0005D0\u000fT\u001a}\u0005<\r\u001d`";
        objectArray[51] = "il+_\u001br?q8Xey~`3\u0004\u0019\u0002b6']Z`}pm\necsg$\u0014Xocl+e";
        objectArray[52] = "vA\b\u0001\f! \u0014\u001cRa{wQ\u0003X\rI#\u0014^\u0005Z\u001e$A\u001dF\u000ege\u0010\u0004@a";
        objectArray[53] = "\u0000/~C<^^&yIB\\\b#zV.n^o&\u000b{9\u0002ob\t;UT`#\fB";
        objectArray[54] = "y6\u001be\u001d\u0019er\u0015p\"=fgFt\"\u0018:;A0]\u0004~5T";
        objectArray[55] = "\u000f*k@{NR7\u007fD\u001f\u0014^*tJs&\nl,\u0015#q\u000enoK#LT0mK\u001f";
        objectArray[56] = "fc\u001dB\u0019yv>\u0019\u0003yqdrY>H'ccOZBzwk%";
        objectArray[57] = "VJPT,\u0014\u0000E\u0011QU\u001d\\\u0006H\u000b9/\nJ\u0014Uex\u000f\u0016V\u0015:\u0001NGO\u0013UF]\u0004Q\u0003,\u0007\f\u001dWlk\u0014O\u0003G\u0015*EV\u0005(\t%\u001cC\u0004OW,\u001bIz";
        objectArray[58] = "\n6VgY1\tm\r\u000b\u0003M\tdK3E!_k\n6";
        objectArray[59] = "\u00144WA_'\u001d5VAoe\u0004/\u0016K+z\u000b:m^\u0001g\u001f*\u001dGRo\u000fU\u0017EP-\u0002o\u0002G\u0000`m";
        objectArray[60] = "=*uDA&a<n\u0006qc\u0002>r\u0003\u000e$a*nE\u0001]2=|\u0004\u000b%s1~Mq";
        objectArray[61] = "w\u001274!\bp\u000476@R\u0017\u0004k!?\u0015t\u0010wg0l|\u0012l>'\u0000j\u0014\u007f6@";
        objectArray[62] = "a5<a\\\u0001&y;-$\u0002v6X|B\u000b\u007f$_}^\tr%NmI\u000ff5dg$\u000e}49cTX`'>\u001d";
        objectArray[63] = "\u0012}adqUWi).M\u001d,\u0005$z3R\u0015f0fu]l5't4W\u0014t+v}-";
        objectArray[64] = "QX\u0003Jl*RY\u0002\u000b\th?\\\fEv(\\H\u0010\u0003yQ\u000f_\u0002Bs)NS\u0000\u000b\t";
        objectArray[65] = ">G 8X\u001e9\u0018:ja\u0014>Y>a\r&c\u0019o9aO?['i\u0018\u000enB!\u0006_\u001d-\\1\u007f\u001eL4Z^:\u001d\u000e>Aag\u0000\u001a:%";
        objectArray[66] = "Pm\u0006\bG9\n3\u0004\b{a\u0000)\u001d\t\u0017S]nG^{:\u0001+\u0004\u0001\u0002{P2\u0002n";
        objectArray[67] = "6D\nB-e5E\u000b\u0003H#X@\u0005M7g;T\u0019\u000b8\u001ehC\u000bJ2f)O\t\u0003H";
        objectArray[68] = "W+Z\u0018%I[1\u0005\u0005YNf*\u0007\u0003&\f\u0005>\u001bE)u_8\u0014\u0007 \f\roTBY";
        objectArray[69] = "t\u00115'u\u001f&Fub\f\u0003 \u0000*:`1wBpe0fw\u00164'5\u001avLp7\f";
        objectArray[70] = ", 6lfy:&%d\u0001t;$'d}r=I2l9i''\"1=(G";
        objectArray[71] = "a9\u0003$\u0004]bbXH_!fc\u0003r\u001dG8`\u00173";
        objectArray[72] = "\u0019J\u0000mx>\t\u0017\u0004,\u0018*\u001bN_ouPFWZhb(\u0007[X!\u0018";
        objectArray[73] = "7X\f\\y0*\u0005S$r+!GZXt-LRR\u001co7\"B\u000f\u0018.W";
        objectArray[74] = "U(z!:sVs!M`\u000fN&a2&lZ:'=_4N%~5f`I5tM";
        objectArray[75] = "\u000e5GhK\u000b\rn\u001c\u0004\u0014\u0016j(NzQ\u000e\t<R<^wZ+@}T\u000f\u001b'B4.";
        objectArray[76] = "u\u0004<\u0014We`\u0003.\u00169wy\u00031\u0001n 'Tim\\s'\u0004']Z}a\u0015";
        objectArray[77] = "\u0012k\u0016s!\u0006Lh\u00022]\\q,\u001f7\"\u0019\u00128\u0003q-`\t=\t;\"\u0010\u0010n\u0001+]";
        objectArray[78] = "$<+7\\K1;952Y(;&\"e\u000ewf}N_U7h{!X\n-:";
        objectArray[79] = "$\u000bpr^_~Urrb\fx^ox5S \u00032\u0014\\\u000egJdm\u001d_~L";
        objectArray[80] = "\u0007h+?\n(\u0003wt&6w[b\u007f:a#\n?+f6#PqaoJ\"\n5q";
        objectArray[81] = " C4\u0016py0\u001e0W\u0010w&YJ\u0007`kO\u0019s\u0005qovMt\u0015{\u0017";
        objectArray[82] = "2v&C\u000bP/\"/\u0013n\u000f&24\u0015\u0002=p~hHWj,~,J\u0017\u0006zqmOn";
        objectArray[83] = "JQ\u00184\u001d\u0007\u0010\u000f\u001a4!_\u001a\u0015\u00035MmGRYl!\u0004\u001b\u0017\u001a=XEJ\u000e\u001cR";
        objectArray[84] = "~ke\u0011&\u001a\u007f\"<\u0013\u001c6T\u0000\u0017b]:Q\u001a\u001cc\u001c\u001f-dg\u0016z\u001ed=e";
        objectArray[85] = "N(\br\u0019\u0016\u00185\u001bug\u0007_\u0015\u00155\u001b\nC1\u0013H\\\u0019K/\rq\b\u001e[%u";
        objectArray[86] = "`\u0007qD-vc\u0006p\u0005H4\u000e\u0011x\\1cr\u0004\u007fN3";
        objectArray[87] = "c\u0013.\u001a$Q=\u001a)\u0010ZSk\u001f*\u000f6a:XrUe6z\u00036\u0011&G;\u001e5\u0019Z";
        objectArray[88] = "}L_\u0015\u0004z'\u0012]\u00158)!\u0019@\u001fovyD\u001cs\u0006+>\rK\nGz'\u000b";
        objectArray[89] = "-eQx|<*:K*E6-{O!)\u0004p<\u001e}Em,yV)<,}`PF{?>~@?:n'x/}:<!\u007f\u0016)=,+\u0007";
        objectArray[90] = "9FtTV5o\u0013`\u0007;o8V\u007f\rW]l\u0013\"P\u0007\nkFa\u0013Ts*\u0017x\u0015;";
        objectArray[91] = "U\u00070]o%V\\k16Y[\u0003(\u000bt)\r\u001e;\f";
        objectArray[92] = "\u001cro*\u0015e\u0001/0R\u0016n\u000b\u0017ab\u0015c\rsk?\u0001kg,/=\u001ez^x(-\u0014\u0002";
        objectArray[93] = "\u0003kIT8M\u00000\u00128f1\u001brRA,T\b{J\\";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "\u0014\u0005-o\u0006\u0011B\nlj\u007f\u0018\u001eI50\u0013*H\u0005dfB}\u000b[/%\u0000\r\u0012\b'5\u007f\u0018\u0003Q')\u0018F\nV-W";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6R.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == 'T' || c == 'O' || c == '\u00ff') {
                field = _6R.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6R.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6R.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2719;
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
                throw new RuntimeException("dev/krypton/6R", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6R.k[n2] = n3;
        }
        return k[n2];
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6R" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _6R.e(l2, l3);
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
                String string2 = _6R.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6R.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6R.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6R.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6R.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6R.f(937510377721606L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6R.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6R.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6R.f(937510377721606L, 0L);
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
            int n = _6R.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _6R.m[n] = clazz = Class.forName(_6R.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6R.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6R.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6R.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6R.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/6R" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6R" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3632;
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
                throw new RuntimeException("dev/krypton/6R", exception);
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
            _6R.e[n2] = _6R.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _6R.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _6R.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _6R.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _6R.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6R.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6R.c(clazz3, string2, clazz2)) != null) {
                    _6R.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6R.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6R.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6R.f(937510377721606L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    @_3i_0
    public void cfr_renamed_2(_6c_0 c_0) {
        long l2;
        long l3 = l2 = b ^ 0xD9A1A13EF68L;
        long l4 = l3 ^ 0x5CD5E39D3DF3L;
        long l5 = l3 ^ 0x4ADD9624CF69L;
        String string = _8h.cfr_renamed_4();
        CallSite callSite = _6R.d("m", (Object)_6R.d("\u00aa", (Object)this, 9198249983622485977L, (long)l2), 9205112789133961177L, (long)l2);
        while (_6R.d("m", (Object)callSite, 9203420168977756425L, (long)l2) != false) {
            CallSite callSite2;
            class_1923 class_19232;
            block5: {
                block6: {
                    class_19232 = (class_1923)_6R.d("m", (Object)callSite, 9197295891931464071L, (long)l2);
                    try {
                        try {
                            callSite2 = _6R.d("m", (Object)_6R.d("\u00aa", (Object)_6R.d("\u00aa", (Object)this, 9203372235120723477L, (long)l2), 9205010582223996372L, (long)l2), (int)_6R.d("\u00aa", (Object)class_19232, 9204946233967848974L, (long)l2), (int)_6R.d("\u00aa", (Object)class_19232, 9204038541817368365L, (long)l2), 9203978619754354929L, (long)l2);
                            if (string != null) break block5;
                            if (callSite2 != false) break block6;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _6R.a(numberFormatException);
                        }
                        _6R.d("m", (Object)callSite, 9205154818544072310L, (long)l2);
                        if (string == null) continue;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _6R.a(numberFormatException);
                    }
                }
                callSite2 = _6R.d("m", (Object)class_19232, 9203567210065029403L, (long)l2);
            }
            double d = (double)callSite2;
            double d2 = (double)_6R.d("m", (Object)class_19232, 9204772021537024750L, (long)l2);
            double d3 = d + 16.0;
            double d4 = d2 + 16.0;
            _8B b = new _8B(0, (int)_6R.c("b", 10188, (long)(0x5CCC19D451147F7AL ^ l2)), l4, 0, (int)_6R.c("b", 25891, (long)(0x52CDC85814633D93L ^ l2)));
            Object[] objectArray = new Object[11];
            objectArray[10] = l5;
            objectArray[9] = 0;
            objectArray[8] = _6R.d("O", 9196600450037146710L, (long)l2);
            objectArray[7] = b;
            objectArray[6] = b;
            objectArray[5] = d4;
            objectArray[4] = (double)63.1f;
            objectArray[3] = d3;
            objectArray[2] = d2;
            objectArray[1] = 63.0;
            objectArray[0] = d;
            _6R.d("m", (Object)c_0.cfr_renamed_7, (Object)objectArray, 9197078932413398735L, (long)l2);
            if (string == null) continue;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void cfr_renamed_2(long l2, class_2818 class_28182) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x43C61B041070L;
        long l5 = l3 ^ 0xC4105C73ACFL;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 48);
        int n3 = (int)(l5 << 48 >>> 48);
        long l6 = l3 ^ 0x4F6298B17B6FL;
        long l7 = l3 ^ 0x695C186C33A3L;
        CallSite callSite = _6R.d("m", (Object)class_28182, 6310021539124998578L, (long)l2);
        CallSite callSite2 = _6R.d("m", (Object)callSite, 6307445995929780522L, (long)l2);
        String string = _8h.cfr_renamed_4();
        CallSite callSite22 = _6R.d("m", (Object)callSite, 6308632991877432031L, (long)l2);
        _7T t = new _7T(n, (char)n2, n3);
        CallSite callSite3 = callSite2;
        block8: while (true) {
            void var18_15;
            int n4 = var18_15;
            block9: while (n4 < callSite2 + _6R.c("b", 29425, (long)(0x1618F2FA4E10274L ^ l2))) {
                String string2;
                CallSite callSite4 = callSite22;
                block10: while (true) {
                    CallSite callSite5 = callSite4;
                    block11: while (callSite5 < callSite22 + _6R.c("b", 29149, (long)(0x6AF2408F730A015FL ^ l2))) {
                        n4 = 1;
                        block12: while (string == null) {
                            int n5 = n4;
                            while (n5 < _6R.c("b", 27523, (long)(0x5F275BBB1DA09B00L ^ l2))) {
                                String string3;
                                block16: {
                                    block17: {
                                        block19: {
                                            block20: {
                                                block18: {
                                                    Object[] objectArray = new Object[4];
                                                    objectArray[3] = l4;
                                                    objectArray[2] = (int)callSite4;
                                                    objectArray[1] = n5;
                                                    objectArray[0] = (int)var18_15;
                                                    CallSite callSite6 = _6R.d("m", (Object)_6R.d("m", (Object)t, (Object)objectArray, 6308821998672326147L, (long)l2), 6308750551130410624L, (long)l2);
                                                    try {
                                                        string3 = string;
                                                        if (l2 < 0L) break block16;
                                                        if (string3 != null) break block17;
                                                        Object[] objectArray2 = new Object[4];
                                                        objectArray2[3] = (int)callSite4;
                                                        objectArray2[2] = n5;
                                                        objectArray2[1] = (int)var18_15;
                                                        objectArray2[0] = l6;
                                                        callSite5 = _6R.d("m", (Object)this, (Object)objectArray2, 6309207304419534216L, (long)l2);
                                                        if (string != null) continue block11;
                                                        if (l2 < 0L) continue block12;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw _6R.a(numberFormatException);
                                                    }
                                                    try {
                                                        try {
                                                            if (callSite5 == false && callSite6 == _6R.d("O", 6307424629436150663L, (long)l2)) break block18;
                                                            break block19;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw _6R.a(numberFormatException);
                                                        }
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw _6R.a(numberFormatException);
                                                    }
                                                }
                                                try {
                                                    Object object = _6R.d("m", (Object)_6R.d("\u00aa", (Object)this, 6311672326371852264L, (long)l2), (Object)callSite, 6308233330220375483L, (long)l2);
                                                    if (l2 > 0L) {
                                                        if (object == false) break block20;
                                                        object = 289;
                                                    }
                                                    Object[] objectArray = new Object[3];
                                                    objectArray[2] = (String)((Object)_6R.a("d", 13550, (long)(0x4F7C40C5CE325541L ^ l2))) + (int)callSite2 + (String)((Object)_6R.a("d", 20077, (long)(0x2EFE3EAECE692FC3L ^ l2))) + (int)callSite22;
                                                    objectArray[1] = l7;
                                                    objectArray[0] = _6R.a("d", (int)object, (long)(0xFD970BAC9AE08DL ^ l2));
                                                    _6R.d("t", (Object)objectArray, 6310525452901728922L, (long)l2);
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw _6R.a(numberFormatException);
                                                }
                                            }
                                            return;
                                        }
                                        ++n5;
                                    }
                                    string3 = string;
                                }
                                if (string3 == null) continue;
                            }
                            ++callSite4;
                            string2 = string;
                            if (l2 < 0L) continue block8;
                            if (string2 == null) continue block10;
                        }
                        continue block9;
                    }
                    break;
                }
                {
                    ++var18_15;
                    if (l2 < 0L) break block8;
                    string2 = string;
                    if (string2 == null) continue block8;
                    break;
                }
            }
            break;
        }
    }

    @_3i_0
    public void cfr_renamed_7(_6Q q) {
        long l2 = b ^ 0x65087415D8DEL;
        long l3 = l2 ^ 0x5E51FA6B903DL;
        CallSite callSite = _6R.d("m", (Object)_6R.d("\u00aa", (Object)_6R.d("\u00aa", (Object)this, 5192257686398726563L, (long)l2), 5190588549248479842L, (long)l2), (int)_6R.d("m", (Object)q.cfr_renamed_5, 5194363521461908542L, (long)l2), (int)_6R.d("m", (Object)q.cfr_renamed_5, 5192003057133140020L, (long)l2), 5191314212793682947L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = callSite;
        objectArray[0] = l3;
        _6R.d("m", (Object)this, (Object)objectArray, 5194674411802844069L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_8(_7J j) {
        long l2 = b ^ 0x6402F05CD841L;
        _6R.d("m", (Object)_6R.d("\u00aa", (Object)this, 5228633231749849328L, (long)l2), 5226588339375610858L, (long)l2);
    }

    private boolean boolean_7(Object[] objectArray) {
        double d;
        block12: {
            block13: {
                String string;
                int n;
                int n2;
                int n3;
                long l2;
                block11: {
                    int n4;
                    block10: {
                        block8: {
                            block9: {
                                l2 = (Long)objectArray[0];
                                n3 = (Integer)objectArray[1];
                                n2 = (Integer)objectArray[2];
                                n = (Integer)objectArray[3];
                                l2 = b ^ l2;
                                string = _8h.cfr_renamed_4();
                                try {
                                    try {
                                        n4 = n2;
                                        if (string != null) break block8;
                                        if (n4 < _6R.c("b", 11405, (long)(0x444DDE1FC7CCB7A1L ^ l2))) break block9;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw _6R.a(numberFormatException);
                                    }
                                    return false;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw _6R.a(numberFormatException);
                                }
                            }
                            n4 = n2;
                        }
                        try {
                            if (string != null) break block10;
                            if (n4 > 0) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw _6R.a(numberFormatException);
                        }
                        n4 = 1;
                    }
                    return n4 != 0;
                }
                CallSite callSite = _6R.d("\u00aa", (Object)this, -4890603039275167480L, (long)l2)[n2];
                CallSite callSite2 = _6R.d("m", (Object)_6R.d("\u00aa", (Object)this, -4883923678067192636L, (long)l2), (int)n3, (int)n2, (int)n, -4884092968654518735L, (long)l2);
                try {
                    double d2 = (double)_6R.d("m", (Object)callSite2, -4889882810638511885L, (long)l2) - callSite;
                    d = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                    if (string != null) break block12;
                    if (d >= 0) break block13;
                }
                catch (NumberFormatException numberFormatException) {
                    throw _6R.a(numberFormatException);
                }
                d = 1.0;
                break block12;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6R.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_6R.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6R.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

