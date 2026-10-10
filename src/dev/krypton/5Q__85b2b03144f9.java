/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._41;
import dev.krypton._4r;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._7J;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
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
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_639;
import net.minecraft.class_642;

public class _5Q
extends _6x_0 {
    private final _92 cfr_renamed_3;
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_7;
    private final _6e_0 cfr_renamed_4;
    private class_639 cfr_renamed_8;
    private class_642 cfr_renamed_6;
    private int cfr_renamed_0;
    private static final long b;
    private static final String d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    public class_642 net_minecraft_class_642_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return _5Q.c("\u00f2", (Object)this, 2408384509531927887L, (long)l2);
    }

    public boolean boolean_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x8FDA73B8471L;
        return (boolean)_5Q.c("p", (Object)_5Q.c("\u00f2", (Object)this, 5328975898173073384L, (long)l2), (long)l3, 5329281299734035144L, (long)l2);
    }

    public _5Q(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4F32A28734EBL;
        long l5 = l3 ^ 0x5F52904E4D78L;
        long l6 = l3 ^ 0x654F4B564DBAL;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x190A35C4BC82L;
        long l9 = l3 ^ 0x6CAA6E053F0L;
        long l10 = l3 ^ 0x4C7E6432D826L;
        long l11 = l3 ^ 0x595EC72261B4L;
        super((int)_5Q.a("k", 8006, (long)(0x7144AE1A3A6740BBL ^ l2)), -1, (_4r)((Object)_5Q.c("\u00b5", 1562279439526725825L, (long)l2)), l8);
        this.cfr_renamed_3 = new _92((int)_5Q.a("k", 16554, (long)(0x396BF9A291C21F52L ^ l2)), 3.5, l5, 60.0, 0.0, 0.1);
        this.cfr_renamed_2 = new _9r((int)_5Q.a("k", 22463, (long)(0x4B20EDE9DA190841L ^ l2)), false, l4);
        this.cfr_renamed_7 = new _9r((int)_5Q.a("k", 859, (long)(0x4D11F69C15235CA1L ^ l2)), false, l4);
        this.cfr_renamed_4 = new _6e_0((int)_5Q.a("k", 11264, (long)(0x7284F29E14F2F3FBL ^ l2)), l11, d);
        _5Q.c("\u00f3", (Object)this, (int)_5Q.a("k", 26259, (long)(0x57949F7B919E396AL ^ l2)), 1558616952959019241L, (long)l2);
        CallSite callSite = _5Q.c("\u00f2", (Object)this, 1562378388348354364L, (long)l2);
        CallSite callSite2 = _5Q.c("\u00f2", (Object)this, 1558712738735550628L, (long)l2);
        _5Q.c("H", (Object)callSite2, 1558901524587459566L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5Q.c("p", (Object)callSite, (Object)objectArray, 1562516957352655669L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5Q.c("\u00f2", (Object)this, 1558464854141137988L, (long)l2), _5Q.c("\u00f2", (Object)this, 1559116128053115839L, (long)l2), _5Q.c("\u00f2", (Object)this, 1558712738735550628L, (long)l2), _5Q.c("\u00f2", (Object)this, 1562378388348354364L, (long)l2)};
        objectArray2[0] = l9;
        _5Q.c("p", (Object)this, (Object)objectArray2, 1559299830007186676L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                block12: {
                    _5Q.b = dev.krypton.l.a(3683767473698826561L, 5595636263524370087L, MethodHandles.lookup().lookupClass()).a(6556507462247L);
                    _5Q.k = new Object[46];
                    _5Q.l = new String[46];
                    _5Q.b();
                    var11 = _5Q.b ^ 72840476565774L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    break block12;
lbl16:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var15_3 = var13_1.doFinal("\u00a04\u00e9\u00ae\u00dcIf8".getBytes("ISO-8859-1"));
                ** while (true)
                _5Q.d = _5Q.b(var15_3).intern();
                _5Q.j = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/NoPadding");
                v3 = SecretKeyFactory.getInstance("DES");
                v4 = new byte[8];
                v5 = v4;
                v4[0] = (byte)(var11 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v5 = v5;
                    v5[var1_5] = (byte)(var11 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                var6_6 = new long[8];
                var3_7 = 0;
                var4_8 = "9\u0004\u00e6Q\u00d0\u00daO+\u0013]\u000b\u0091\u00a9\u00cc6\u000e\u009b\u00cd\u0091\u00bbN;\u00c0\u00b4\u00933\u008f\n\f^1\u00ee\u0005\u00e2Fs}\u00b3H\u00f3WP\u00910w1\u000e\"";
                var5_9 = "9\u0004\u00e6Q\u00d0\u00daO+\u0013]\u000b\u0091\u00a9\u00cc6\u000e\u009b\u00cd\u0091\u00bbN;\u00c0\u00b4\u00933\u008f\n\f^1\u00ee\u0005\u00e2Fs}\u00b3H\u00f3WP\u00910w1\u000e\"".length();
                var2_10 = 0;
                while (true) {
                    var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                    v6 = var6_6;
                    v7 = var3_7++;
                    v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                    v9 = -1;
                    break block10;
                    break;
                }
lbl47:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    var4_8 = "p-\u00cc\u00b8:\u00c9W\u00aa:\u000b\u00e0l\u00bc\u0018\u0011\u00cf";
                    var5_9 = "p-\u00cc\u00b8:\u00c9W\u00aa:\u000b\u00e0l\u00bc\u0018\u0011\u00cf".length();
                    var2_10 = 0;
                    while (true) {
                        var7_11 = var4_8.substring(var2_10, var2_10 += 8).getBytes("ISO-8859-1");
                        v6 = var6_6;
                        v7 = var3_7++;
                        v8 = ((long)var7_11[0] & 255L) << 56 | ((long)var7_11[1] & 255L) << 48 | ((long)var7_11[2] & 255L) << 40 | ((long)var7_11[3] & 255L) << 32 | ((long)var7_11[4] & 255L) << 24 | ((long)var7_11[5] & 255L) << 16 | ((long)var7_11[6] & 255L) << 8 | (long)var7_11[7] & 255L;
                        v9 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v6[v7] = v10;
                    if (var2_10 < var5_9) ** continue;
                    break block11;
                    break;
                }
            }
            var8_12 = v8;
            var10_13 = var0_4.doFinal(new byte[]{(byte)(var8_12 >>> 56), (byte)(var8_12 >>> 48), (byte)(var8_12 >>> 40), (byte)(var8_12 >>> 32), (byte)(var8_12 >>> 24), (byte)(var8_12 >>> 16), (byte)(var8_12 >>> 8), (byte)var8_12});
            v10 = ((long)var10_13[0] & 255L) << 56 | ((long)var10_13[1] & 255L) << 48 | ((long)var10_13[2] & 255L) << 40 | ((long)var10_13[3] & 255L) << 32 | ((long)var10_13[4] & 255L) << 24 | ((long)var10_13[5] & 255L) << 16 | ((long)var10_13[6] & 255L) << 8 | (long)var10_13[7] & 255L;
            switch (v9) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        _5Q.e = var6_6;
        _5Q.f = new Integer[8];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 19;
            case 1 -> 40;
            case 2 -> 3;
            case 3 -> 1;
            case 4 -> 13;
            case 5 -> 18;
            case 6 -> 14;
            case 7 -> 27;
            case 8 -> 9;
            case 9 -> 47;
            case 10 -> 0;
            case 11 -> 11;
            case 12 -> 61;
            case 13 -> 57;
            case 14 -> 4;
            case 15 -> 53;
            case 16 -> 62;
            case 17 -> 33;
            case 18 -> 44;
            case 19 -> 21;
            case 20 -> 52;
            case 21 -> 34;
            case 22 -> 38;
            case 23 -> 35;
            case 24 -> 48;
            case 25 -> 58;
            case 26 -> 36;
            case 27 -> 26;
            case 28 -> 17;
            case 29 -> 24;
            case 30 -> 10;
            case 31 -> 56;
            case 32 -> 45;
            case 33 -> 59;
            case 34 -> 15;
            case 35 -> 22;
            case 36 -> 54;
            case 37 -> 30;
            case 38 -> 31;
            case 39 -> 63;
            case 40 -> 60;
            case 41 -> 20;
            case 42 -> 25;
            case 43 -> 16;
            case 44 -> 50;
            case 45 -> 55;
            case 46 -> 41;
            case 47 -> 28;
            case 48 -> 29;
            case 49 -> 7;
            case 50 -> 43;
            case 51 -> 23;
            case 52 -> 49;
            case 53 -> 32;
            case 54 -> 8;
            case 55 -> 2;
            case 56 -> 46;
            case 57 -> 42;
            case 58 -> 12;
            case 59 -> 37;
            case 60 -> 39;
            case 61 -> 6;
            case 62 -> 5;
            default -> 51;
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
        _5Q.l[n3] = new String(cArray);
        return n3;
    }

    public double double_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x318B405FB017L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (double)_5Q.c("p", (Object)_5Q.c("\u00f2", (Object)this, -8231014391449523167L, (long)l2), (Object)objectArray2, -8230730588280234393L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_1(_9o o) {
        block22: {
            CallSite callSite;
            CallSite callSite2;
            int n;
            long l2;
            block19: {
                block20: {
                    block18: {
                        _5Q q;
                        long l3;
                        block17: {
                            CallSite callSite3;
                            block15: {
                                block16: {
                                    l2 = b ^ 0x4572D3E1AC1AL;
                                    l3 = l2 ^ 0x6C164E2EAE06L;
                                    n = _7C.cfr_renamed_9();
                                    try {
                                        callSite3 = _5Q.c("\u00f2", (Object)this, -8191095826395647205L, (long)l2);
                                        if (n == 0) break block15;
                                        if (callSite3 >= 0) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5Q.a(matchException);
                                    }
                                    return;
                                }
                                try {
                                    q = this;
                                    if (n == 0) break block17;
                                    callSite3 = _5Q.c("\u00f2", (Object)q, -8191095826395647205L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw _5Q.a(matchException);
                                }
                            }
                            try {
                                if (callSite3 > 0) {
                                    _5Q q2 = this;
                                    _5Q.c("\u00f3", (Object)q2, (int)(_5Q.c("\u00f2", (Object)q2, -8191095826395647205L, (long)l2) - true), -8191095826395647205L, (long)l2);
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _5Q.a(matchException);
                            }
                            _5Q.c("\u00f3", (Object)this, (int)_5Q.a("k", 116, (long)(0x70EE842822C6C47AL ^ l2)), -8191095826395647205L, (long)l2);
                            q = this;
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l3;
                        callSite2 = _5Q.c("p", (Object)_5Q.c("\u00f2", (Object)q, -8188495478908345138L, (long)l2), (Object)objectArray, -8188147050687010551L, (long)l2);
                        try {
                            try {
                                if (_5Q.c("\u00f2", (Object)_5Q.c("\u00f2", (Object)this, -8191152233560367230L, (long)l2), -8188285492391412803L, (long)l2) == null) break block18;
                                callSite = _5Q.c("p", (Object)callSite2, -8191333116784883667L, (long)l2);
                                if (n == 0) break block19;
                            }
                            catch (MatchException matchException) {
                                throw _5Q.a(matchException);
                            }
                            if (callSite == false) break block20;
                        }
                        catch (MatchException matchException) {
                            throw _5Q.a(matchException);
                        }
                    }
                    return;
                }
                callSite = _5Q.c("p", (Object)callSite2, (Object)"/", -8190942484721819756L, (long)l2);
            }
            try {
                block21: {
                    try {
                        if (callSite == false) break block21;
                        _5Q.c("p", (Object)_5Q.c("\u00f2", (Object)_5Q.c("\u00f2", (Object)_5Q.c("\u00f2", (Object)this, -8191152233560367230L, (long)l2), -8188285492391412803L, (long)l2), -8188443608293211780L, (long)l2), (Object)_5Q.c("p", (Object)callSite2, 1, -8188232908937483681L, (long)l2), -8188643909876283916L, (long)l2);
                        if (n != 0) break block22;
                    }
                    catch (MatchException matchException) {
                        throw _5Q.a(matchException);
                    }
                }
                _5Q.c("p", (Object)_5Q.c("\u00f2", (Object)_5Q.c("\u00f2", (Object)_5Q.c("\u00f2", (Object)this, -8191152233560367230L, (long)l2), -8188285492391412803L, (long)l2), -8188443608293211780L, (long)l2), (Object)callSite2, -8191460674742417885L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _5Q.a(matchException);
            }
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
        Object[] objectArray = k;
        k[0] = "4E)olJ)P+.i\u0016eq";
        objectArray[1] = "\u0014)\u0007\u0016\u0014\\\t<\u0005W\u0011\u0000I~";
        objectArray[2] = "$j&N?\u0012QJ-A.]0D&J*\u0007D";
        objectArray[3] = Double.TYPE;
        _5Q.l[3] = "java/lang/Double";
        objectArray[4] = "P\u00063\r/AP\u0006$Q#NJM$O#[M<q\u0017p";
        objectArray[5] = "\\&\u0019\u0005T)\\&\u000eYX&Fm\u000eGX3A\u001c^\u001a\t";
        objectArray[6] = "P\u0011R\"v.P\u0011E~z!JZE`z4M+\u00118-";
        objectArray[7] = "#\u0002k[\u0018;(\rz\u0014e#;\ns]";
        objectArray[8] = Integer.TYPE;
        _5Q.l[8] = "java/lang/Integer";
        objectArray[9] = "f.\u0015,\u001e {;\u0017m\u001b|4.";
        objectArray[10] = ":!<k\u007f^O\u00017dn\u0011.\u000f<ojKZ";
        objectArray[11] = "x:_\u001dE\u0014x:HAI\u001bbqH_I\u000ee\u0000\u001d\u0000\u001c";
        objectArray[12] = Void.TYPE;
        _5Q.l[12] = "java/lang/Void";
        objectArray[13] = "@jgSgD]\u007fe\u0012b\u0018\u0012w";
        objectArray[14] = Boolean.TYPE;
        _5Q.l[14] = "java/lang/Boolean";
        objectArray[15] = "55\u007fP.x55h\f\"w/~h\u0012\"b(\u000f=Mz";
        objectArray[16] = "\u001a}\u0018\u0006nn\u0007h\u001aGk2G-";
        objectArray[17] = ">Q(kxwKq#di8*\u007f(omb^";
        objectArray[18] = "i\u001ez\u0007]Wt\u000bxFX\u000b9\t";
        objectArray[19] = "\\ ^\u0015H@A5\\TM\u001c\u00017";
        objectArray[20] = "\u0004;oR- q\u001bd]<o\u0010\u0015oV85d";
        objectArray[21] = "]N*XV\\CF0\u00177K]J?M\u000b";
        objectArray[22] = "\u0005\u0019P\u0017\u001c=\u000e\u0016AX}3\u0005\u001dE\u0002";
        objectArray[23] = Long.TYPE;
        _5Q.l[23] = "java/lang/Long";
        objectArray[24] = "\u0006R9R?-\b\r0IQ,l\u000f,T)oU\fcK=\u0010\u0006R9R?-\b\r0IQ";
        objectArray[25] = "vW#$\u0017,.Qd,i:,E}1>mr\u0012%]U)p\u0016f?\rh|V";
        objectArray[26] = "\u00049gFU\u001dC0jP'\u0018E#!Q]\u0002^&Z\u0010C\u001c@vdSI\u000f@If]\u001a\bJ7!T\u0017\u001e8";
        objectArray[27] = "o\tO)+p-\f\u0017y\u0013+Q\u001aTqkhh\u0019\u001bn\u007f\u0017m\u0006\u0016{ai*\u000f\u001bm\u0013";
        objectArray[28] = "eKYB>\u0000 JWMR\u001f7G]H>-f\u0006\u0002\u0014jzfK\u0000D \u0004!B\rRRJ:D\u0003H,\n3_Q/";
        objectArray[29] = "Rk\u001adO\u001f[u\u001fatgxK-\u001a\u001fYEn]'\u0016G@k";
        objectArray[30] = "o\"xDZZuex;\u001cd0#|\u0002\u001c\u0003r&$R";
        objectArray[31] = "\r7t\u0012eqUvxR\u001a}P'-@M(\u0000vu,%cU'%V`b[(";
        objectArray[32] = "\nvlV\u0016,\u0002sr_(g;/v\u0003Q CwpDY";
        objectArray[33] = "G5\u0012T/)]r\u0012+a\u0017\u001b/\rSn)X%\u001eS";
        objectArray[34] = "&\u0010~\u001aXG<W~e\u001ay+Pl\\T\u001a;\u001ee\u000b";
        objectArray[35] = "\u0007K%x\u0002R@B(npWGRbo\u000bsZGx\u0013L\\\u0006Pjm\u000bU\u000bF\u0018zLHFE~-\t\u0010P;";
        objectArray[36] = "?\u00113v7Iz\u0010=y[Vm\u001d7|7d<\\h!j3<\u0011jp)M{\u0018gf[\u0003`\u001ei|%Ci\u0005;\u001b";
        objectArray[37] = "-<W]\u0018F7{W\"]xv2\u0007\u001d\u0017\u0017*%\rR";
        objectArray[38] = "\u0001$\u0003&\u0006\u0010F-\u000e0t\u000fF\u0019[5\b\u001f==\u0002)\t\u0010[jGq\u001fn";
        objectArray[39] = ":ibWd\n .b( 4$f\u007fU!\u000e+x:";
        objectArray[40] = "\u0015~?~?5\u000f9?\u0001\u007f\u000b\u0018>-83h\bp$o";
        objectArray[41] = "Oe??\u0002\u000bU\"?@A5Gegq\u0001OHbo<";
        objectArray[42] = ")]&M?>!X8D\u0001u\u0018S<Cy3!Ps\\mL(_<\u001cf2hV'N\u0001";
        objectArray[43] = "x{\u0007wEHweB\nDrku\u001br\u0001Kh:\u0004f~Hfc\u001c6\u000eNw;G\n";
        objectArray[44] = "'\u001c[Q\u0018Y7RR\u0006j\u0000KML\u0006\u0011G{DCUU:\"\u001eM\u0015\u0014\\u[\u0015\u0003j";
        Object[] objectArray2 = objectArray;
        objectArray[45] = "E\u000e$EjsAC7\b\u0006{FG:\u0015|lmY!2{eO>)\u000exnGX!\u0019<{+P=\nimMX*N|\u0001";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5Q.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == '\u00f3' || c == '\u00b5' || c == '\u00cd') {
                field = _5Q.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5Q.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Method h(long l2, long l3) {
        int n = _5Q.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5Q.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5Q.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5Q.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5Q.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5Q.f(1602034260914691L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5Q.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5Q.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5Q.f(1602034260914691L, 0L);
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
            int n = _5Q.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _5Q.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5Q.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5Q.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5Q.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5Q.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4A50;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5Q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5Q.f[n2] = n3;
        }
        return f[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5Q.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5Q.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _5Q.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5Q.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5Q.c(clazz3, string2, clazz2)) != null) {
                    _5Q.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5Q.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5Q.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5Q.f(1602034260914691L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public class_639 net_minecraft_class_639_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return _5Q.c("\u00f2", (Object)this, -5655588031387818504L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_3(_41 var1_1) {
        long l2 = b ^ 0x7C996B59CC99L;
        _5Q.c("\u00f3", (Object)this, (class_639)var1_1.cfr_renamed_9(), -1237842289335272791L, (long)l2);
        _5Q.c("\u00f3", (Object)this, (class_642)var1_1.cfr_renamed_1(), -1238074440132003086L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_7(_7J j) {
        _5Q q;
        long l2;
        block7: {
            CallSite callSite;
            block5: {
                int n;
                long l3;
                block6: {
                    long l4 = l2 = b ^ 0x400FFC8AF5E6L;
                    l3 = l4 ^ 0x696B6145F7FAL;
                    long l5 = l4 ^ 0x796197DF1A28L;
                    n = _7C.cfr_renamed_3();
                    try {
                        callSite = _5Q.c("p", (Object)_5Q.c("\u00f2", (Object)this, -2904929624387964246L, (long)l2), (long)l5, -2905920691291036527L, (long)l2);
                        if (n != 0) break block5;
                        if (callSite != false) break block6;
                    }
                    catch (MatchException matchException) {
                        throw _5Q.a(matchException);
                    }
                    return;
                }
                try {
                    q = this;
                    if (n != 0) break block7;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    callSite = _5Q.c("p", (Object)_5Q.c("p", (Object)_5Q.c("\u00f2", (Object)q, -2909154100787675854L, (long)l2), (Object)objectArray, -2908798835142151947L, (long)l2), -2905230145976561199L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5Q.a(matchException);
                }
            }
            if (callSite != false) {
                return;
            }
            q = this;
        }
        _5Q.c("\u00f3", (Object)q, (int)_5Q.a("k", 7392, (long)(0x656CA931097B0111L ^ l2)), -2904992443031360793L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5Q.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5Q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

