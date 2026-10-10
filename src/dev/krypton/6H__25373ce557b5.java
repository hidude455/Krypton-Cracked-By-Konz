/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1511
 *  net.minecraft.class_1621
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6j_0;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9j_0;
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
import net.minecraft.class_1511;
import net.minecraft.class_1621;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

public class _6H
extends _6x_0 {
    private final _9j_0 cfr_renamed_9;
    private final _9r cfr_renamed_1;
    private final _92 cfr_renamed_7;
    private final _92 cfr_renamed_3;
    private int cfr_renamed_6;
    private int cfr_renamed_4;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_372(Object[] objectArray) {
        block11: {
            _6H h;
            long l2;
            block10: {
                CallSite callSite;
                block8: {
                    _4w[] wArray;
                    block9: {
                        l2 = (Long)objectArray[0];
                        l2 = b ^ l2;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                callSite = _6H.c("\u00f6", (Object)this, -1417506988233863214L, (long)l2);
                                if (wArray != null) break block8;
                                if (callSite <= 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            _6H h2 = this;
                            _6H.c("$", (Object)h2, (int)(_6H.c("\u00f6", (Object)h2, -1417506988233863214L, (long)l2) - true), -1417506988233863214L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _6H.a(matchException);
                        }
                    }
                    try {
                        h = this;
                        if (wArray != null) break block10;
                        callSite = _6H.c("\u00f6", (Object)h, -1417104499311087222L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                }
                if (callSite <= 0) break block11;
                h = this;
            }
            _6H.c("$", (Object)h, (int)(_6H.c("\u00f6", (Object)h, -1417104499311087222L, (long)l2) - true), -1417104499311087222L, (long)l2);
        }
    }

    private void cfr_renamed_373(Object[] objectArray) {
        block9: {
            long l2;
            long l3;
            block11: {
                CallSite callSite;
                block10: {
                    class_3966 class_39662 = (class_3966)objectArray[0];
                    l3 = (Long)objectArray[1];
                    l2 = (l3 = b ^ l3) ^ 0x741159BB333DL;
                    _4w[] wArray = _3s.cfr_renamed_5();
                    try {
                        if (_6H.c("\u00f6", (Object)this, -4713553374688500919L, (long)l3) > 0) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                    callSite = _6H.c("\u00de", (Object)class_39662, -4714118324075996953L, (long)l3);
                    try {
                        try {
                            try {
                                if (wArray != null) break block9;
                                if (callSite instanceof class_1511) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            if (l3 < 0L) break block11;
                            if (callSite instanceof class_1621) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _6H.a(matchException);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                }
                _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -4714925111319329403L, (long)l3), -4713457082024211632L, (long)l3), (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -4714925111319329403L, (long)l3), -4715165318447753302L, (long)l3), (Object)callSite, -4715712037087770724L, (long)l3);
                _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -4714925111319329403L, (long)l3), -4715165318447753302L, (long)l3), (Object)_6H.c("\u00d1", -4714838309396204206L, (long)l3), -4713152119436892831L, (long)l3);
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _6H.c("$", (Object)this, (int)_6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)this, -4713771320163662328L, (long)l3), (Object)objectArray2, -4713931865075301266L, (long)l3), -4713553374688500919L, (long)l3);
        }
    }

    private void cfr_renamed_374(Object[] objectArray) {
        block12: {
            CallSite callSite;
            long l2;
            long l3;
            block10: {
                boolean bl;
                CallSite callSite2;
                block8: {
                    _4w[] wArray;
                    block11: {
                        block9: {
                            l3 = (Long)objectArray[0];
                            long l4 = l3 = b ^ l3;
                            l2 = l4 ^ 0x133B4608E33CL;
                            long l5 = l4 ^ 0x6C59E3CB1E93L;
                            wArray = _3s.cfr_renamed_5();
                            callSite2 = _6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -3243067437020190230L, (long)l3), -3242991758547218002L, (long)l3);
                            try {
                                bl = callSite2 instanceof class_3965;
                                if (wArray != null) break block8;
                                if (!bl) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            class_3965 class_39652 = (class_3965)callSite2;
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = class_39652;
                            objectArray2[0] = l5;
                            _6H.c("\u00de", (Object)this, (Object)objectArray2, -3250760179009787842L, (long)l3);
                            if (l3 < 0L) break block11;
                            if (wArray == null) break block12;
                        }
                        callSite2 = _6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -3243067437020190230L, (long)l3), -3242991758547218002L, (long)l3);
                    }
                    try {
                        callSite = callSite2;
                        if (wArray != null) break block10;
                        bl = callSite instanceof class_3966;
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                }
                if (!bl) break block12;
                callSite = callSite2;
            }
            class_3966 class_39662 = (class_3966)callSite;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = class_39662;
            _6H.c("\u00de", (Object)this, (Object)objectArray3, -3251170194946715100L, (long)l3);
        }
    }

    private void cfr_renamed_177(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _6H.c("$", (Object)this, (int)_6H.a("h", 2974, (long)(0x444670EEBC5017D4L ^ l2)), 5374859509946804497L, (long)l2);
        _6H.c("$", (Object)this, (int)_6H.a("h", 28646, (long)(0x7E87A83E307A73AAL ^ l2)), 5374544982098696009L, (long)l2);
    }

    public _6H(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x1C55D986367AL;
        long l5 = l3 ^ 0xC35EB4F4FE9L;
        long l6 = l3 ^ 0x4A6D4EC5BE13L;
        long l7 = l3 ^ 0x55ADDDE15161L;
        long l8 = l3 ^ 0x7A9D08F0C14EL;
        int n = (int)(l8 >>> 32);
        int n2 = (int)(l8 << 32 >>> 56);
        int n3 = (int)(l8 << 40 >>> 40);
        super((int)_6H.a("h", 25864, (long)(0x6ED750787480A4FFL ^ l2)), -1, (_4r)((Object)_6H.c("\u00d1", 1669928607912574192L, (long)l2)), l6);
        this.cfr_renamed_9 = new _9j_0((int)_6H.a("h", 5739, (long)(0x8E9F1936B01D79AL ^ l2)), n, (byte)n2, 1, n3, false);
        this.cfr_renamed_1 = new _9r(4, false, l4);
        this.cfr_renamed_7 = new _92((int)_6H.a("h", 6196, (long)(0x6D015FCF3101D9C6L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_3 = new _92((int)_6H.a("h", 5994, (long)(0x477493A9ECA95699L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6H.c("\u00f6", (Object)this, 1672245839156415716L, (long)l2), _6H.c("\u00f6", (Object)this, 1669327201511171522L, (long)l2), _6H.c("\u00f6", (Object)this, 1668651186034942059L, (long)l2), _6H.c("\u00f6", (Object)this, 1670665583851679666L, (long)l2)};
        objectArray[0] = l7;
        _6H.c("\u00de", (Object)this, (Object)objectArray, 1672865699244390066L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_6H.class, 27);
                _6H.b = l.a(-4113056847770742425L, 216759447499995124L, MethodHandles.lookup().lookupClass()).a(250087297529420L);
                _6H.j = new Object[95];
                _6H.k = new String[95];
                _6H.b();
                _6H.f = new HashMap<K, V>(13);
                var0 = _6H.b ^ 102368392036002L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u008em\u00b4yWO\u00feB\u00e9\u008c2!4l\u001b\tx\u00f3I\u009cm\u00e6\u00d9*`\u00037\u0099C\u008b\u00cb\u00b9";
                var7_6 = "\u008em\u00b4yWO\u00feB\u00e9\u008c2!4l\u001b\tx\u00f3I\u009cm\u00e6\u00d9*`\u00037\u0099C\u008b\u00cb\u00b9".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00a0\u00f5\u0018\u00e2\u00f51\u0015y\u00d6C\u00f1\u00c2.\u00f6\u0094\u00a5";
                    var7_6 = "\u00a0\u00f5\u0018\u00e2\u00f51\u0015y\u00d6C\u00f1\u00c2.\u00f6\u0094\u00a5".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        _6H.d = var8_3;
        _6H.e = new Integer[6];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 30;
            case 2 -> 40;
            case 3 -> 34;
            case 4 -> 38;
            case 5 -> 31;
            case 6 -> 5;
            case 7 -> 3;
            case 8 -> 42;
            case 9 -> 22;
            case 10 -> 56;
            case 11 -> 55;
            case 12 -> 54;
            case 13 -> 7;
            case 14 -> 27;
            case 15 -> 2;
            case 16 -> 62;
            case 17 -> 47;
            case 18 -> 20;
            case 19 -> 28;
            case 20 -> 32;
            case 21 -> 41;
            case 22 -> 43;
            case 23 -> 33;
            case 24 -> 35;
            case 25 -> 17;
            case 26 -> 8;
            case 27 -> 45;
            case 28 -> 51;
            case 29 -> 39;
            case 30 -> 61;
            case 31 -> 10;
            case 32 -> 52;
            case 33 -> 46;
            case 34 -> 57;
            case 35 -> 36;
            case 36 -> 24;
            case 37 -> 48;
            case 38 -> 1;
            case 39 -> 4;
            case 40 -> 12;
            case 41 -> 49;
            case 42 -> 23;
            case 43 -> 53;
            case 44 -> 9;
            case 45 -> 58;
            case 46 -> 60;
            case 47 -> 50;
            case 48 -> 15;
            case 49 -> 21;
            case 50 -> 29;
            case 51 -> 44;
            case 52 -> 59;
            case 53 -> 16;
            case 54 -> 0;
            case 55 -> 63;
            case 56 -> 26;
            case 57 -> 37;
            case 58 -> 25;
            case 59 -> 11;
            case 60 -> 19;
            case 61 -> 6;
            case 62 -> 18;
            default -> 14;
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
        _6H.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "E*g\u0005\u007f%X?eDzy\u0015\t";
        objectArray[1] = "\u0004\u0018\\]\u0016nq8WR\u0007!\u00106\\Y\u0003{d";
        objectArray[2] = Boolean.TYPE;
        _6H.k[2] = "java/lang/Boolean";
        objectArray[3] = "8\u007fB~\u0014S8\u007fU\"\u0018\\\"4U<\u0018I%E\u0007hI\b";
        objectArray[4] = "] \u0011H\t\u007f] \u0006\u0014\u0005pGk\u0006\n\u0005e@\u001aTQ]$";
        objectArray[5] = "k\u0014\n\u0001$>k\u0014\u001d](1q_\u001dC($v.M\u001ey";
        objectArray[6] = "41\u0004$`E41\u0013xlJ.z\u0013fl_)\u000bG>;";
        objectArray[7] = "*O\u0011LX\u0001*O\u0006\u0010T\u000e0\u0004\u0006\u000eT\u001b7uQQ\u0002";
        objectArray[8] = "KK>\u0005LsKK)Y@|Q\u0000)G@iVq{\u001c\u0018#";
        objectArray[9] = ";:\u001fv7\u0019&/\u001d72Ei\u0017";
        objectArray[10] = "b\u0003$U\u0011U\u0017#/Z\u0000\u001av-$Q\u0004@\u0002";
        objectArray[11] = Void.TYPE;
        _6H.k[11] = "java/lang/Void";
        objectArray[12] = "\" GkP%?5E*Uy\u007f7";
        objectArray[13] = "i\u0016\fSBtt\u0003\u000e\u0012G(;\u000b";
        objectArray[14] = Long.TYPE;
        _6H.k[14] = "java/lang/Long";
        objectArray[15] = "jU)9\\<\u001fu\"6Ms~{)=I)\n";
        objectArray[16] = "XU;|)s-u0s8<L{;x<f8";
        objectArray[17] = "j\u0000O\u0004\u0006lw\u0015ME\u000307\u000f";
        objectArray[18] = "? \u001c_2n\"5\u001e\u001e72o7";
        objectArray[19] = "m'\u0006k\u001aM\u0018\u0007\rd\u000b\u0002y\t\u0006o\u000fX\r";
        objectArray[20] = "GwTj \u0012ZbV+%N\u001a ";
        objectArray[21] = Integer.TYPE;
        _6H.k[21] = "java/lang/Integer";
        objectArray[22] = "KY=g\u0015tKY*;\u0019{Q\u0012*%\u0019nVc{zA";
        objectArray[23] = "\n\u000biog\u000f\n\u000b~3k\u0000\u0010@~-k\u0015\u00171.x<S";
        objectArray[24] = "N*\u0002gn6N*\u0015;b9Ta\u0015%b,S\u0010Dz0g";
        objectArray[25] = "@\u000ex|oj@\u000eo ceZEo>cp]4>`65";
        objectArray[26] = "\u0012#S\u0018+3\u0012#DD'<\bhDZ')\u000f\u0019\u0015\u0004rb";
        objectArray[27] = "%\bm(\u0006[%\bzt\nT?Czj\nA82+5R\u0016(\u0001xu\u0018myY)";
        objectArray[28] = "\u0001!%/'\\t\u0001. 6\u0013\u0015\u000f%+2Ia";
        objectArray[29] = "c2F\u0017?3\u0016\u0012M\u0018.|w\u001cF\u0013*&\u0003";
        objectArray[30] = "2\r\rW:7G-\u0006X+x&#\rS/\"R";
        objectArray[31] = "O%&\u001e\u0002w:\u0005-\u0011\u00138[\u000b&\u001a\u0017b/";
        objectArray[32] = "5kz8OP5kmdC_/ mzCJ(Q8%\u001a";
        objectArray[33] = "lL1\u0018i!lL&De.v\u0007&Ze;qvt\u0004=\u007f";
        objectArray[34] = ";^}nZO;^j2V@!\u0015j,VU&d;s\u000f";
        objectArray[35] = "\u0015Dtmmy\u000bLn\"\u000fe\fQ";
        objectArray[36] = ">l/Mn\u0011KL$B\u007f^*B/I{\u0004^";
        objectArray[37] = "-db*w\u001eXDi%fQ9Jb.b\u000bM";
        objectArray[38] = "^Z_X\u0004O+zTW\u0015\u0000Jt_\\\u0011Z>";
        objectArray[39] = ",0X\u007f\u0002\u0013Y\u0010Sp\u0013\\8\u001eX{\u0017\u0006L";
        objectArray[40] = "u^O0%zhKMq &(p";
        objectArray[41] = "7ImQaxBif^p7#gmUtmW";
        objectArray[42] = "BB6\u001b}ABB!GqNX\t!Yq[_xt\u0006&";
        objectArray[43] = "\b\n!\u001f.Z\b\n6C\"U\u0012A6]\"@\u00150d\u0007v\u0004";
        objectArray[44] = "|\u0003OcJA|\u0003X?FNfHX!F[a9\n\u007f\u0011\u0010";
        objectArray[45] = "U\nw\b[\u0000U\n`TW\u000fOA`JW\u001aH00\u001f\u0000_";
        objectArray[46] = "H\u00151^\t~C\u001a \u0011hpH\u0011$K";
        objectArray[47] = "+\u000b\u0000*$V=P\u0017\u0016'8?\u0011YmfZ(\u0015S,\u0018\u0001#\\\t'hG)\u0003Q\u0016";
        objectArray[48] = "fvuc\u001eowsdtgvw4|b\u000bD y%5gn!vxj\u0019}%!f\u0005\u0002mj'rd\u001f,|1\u001c:\u0019zt0w:\u0015zdH";
        objectArray[49] = "e\"\u001cR\u0011W r\u0010\u0002r\u00175O\u0000@B]%-\u0017DH\u001c[p\u0005T\u001c^0p\tT\f&";
        objectArray[50] = "/&wH&ljv{\u0018E%jKkZufo)|^\u007f'\u0011tnN+eztbN;\u001d";
        objectArray[51] = "n6Lr\u0000\u0014b4Pky\u0011?wPg\u0015#l3\f?yI*0Re\u0014\u00147e\b\u0000";
        objectArray[52] = "o\u000fgEL\u0017*_k\u0015/W5b{W\u001f\u001d/\u0000lS\u0015\\Q]~CA\u001e:]rCQf";
        objectArray[53] = "\u0016]\u000b\"cTS\r\u0007r\u0000\u0014(\u0000\u001d&0FDV\u0002/e";
        objectArray[54] = "QF8q%\fRD;q_M;C!{$\rYT%qesVA\" b\u0015VG6$_";
        objectArray[55] = "3wFSe=9d[\u0001\f(1fZY`\u001ae%\u0005\u00013M3}KLc/='FF\f";
        objectArray[56] = "\u0014<*VSd\u0018>6O*aE}6CFS\u00168o\u0019*=O16\u0015Z{Enn$";
        objectArray[57] = "n&p\u001e,2+v|NOyP0jA4=2'nKuCi,'\u0011~3/&xIO";
        objectArray[58] = "\u0001\u001c6_pZ\\\u0001c\u0005\u0015RQ\u0018mZy`\u0003U5\f\u0015\f\u0001\t5Lg\u000e\u0005Zj=";
        objectArray[59] = "t),$B\u007f/2.3, u\"'4{w,r\u007f`,/zs#$\u00142fp=";
        objectArray[60] = "t7Vs})sdG D+|%V\u007f(\u0019!b\r%D+o)Yv%6.?O\u0018#ua)K'9rxf6\u007f/.h7]\u007f+~ Y";
        objectArray[61] = "\u001d<Isu9\u00167\u0017r\u0018f,(\b#c!N?\f)\"_\u0013-\u001c}`4\u0013!\u001cm\u0018";
        objectArray[62] = ">[UwU+hD\\\"6}\u000eC\u0007|J|b\u0014\u0004x\nG7M\u000e'\u00077qGQ\u007f6";
        objectArray[63] = "*8\u001ai\f<oh\u00169ot+U\u0006{_6j7\u0011\u007fUw\u0014j\u0003o\u00015\u007fj\u000fo\u0011M";
        objectArray[64] = "ZcSz-\u001dL8DF*sNy\n=o\u0011Y}\u0000|\u0011JR4Zwa\fXk\u0002F";
        objectArray[65] = "NjNvZo\u000b:B&9\"pj\u0018}_f\u0000mJuH";
        objectArray[66] = "\u00046U(\u0002m\u001d?Ev`m\u00070^y7:]f\u0000\u0015\u0002h\t`X{\u001ba\u0019>";
        objectArray[67] = "~A*)9\u0006;\u0011&yZI@W0v!\t\"@4|`wyK}&k\u0007?A\"~Z";
        objectArray[68] = "?\u0017]I\u0012\r?\u0013\r\u0001|\u0007#1XH\u0000\u0017XEZ\u0000\u001cW(\u0003P_Df";
        objectArray[69] = "\u0012\t?D\u001aA\u0004R(x\u001b/\u0006\u0013f\u0003XM\u0011\u0017lB&\u0010\u0003\u00078\u0000M\u0010\u000f\u0007(x";
        objectArray[70] = "\\$z#I<R~w)&;^?k6J\t\n{1o\u001d^^:u:\u001b8^<a>&";
        objectArray[71] = "4h'\r{og`t\u001bDeois\u000e\u0013;5<.b\u007f6c<f\u0010}20c";
        objectArray[72] = " >\u0003r,Gjn\u001e{\u0013\u0017z3\u0005sD@$d]\u001f/Dg,\u0018\u007f#F{5";
        objectArray[73] = "@\u001ctF;\u0010\nLiO\u0004@\u001a\u0011rGS\u0017DA++9\u0016\u001d\u001fvN|\u001e\u0017D";
        objectArray[74] = "Q6j[W_Ve{\bn]Y$jW\u0002o\u000eb1\fQ8[?{B\u0001ZUevHn\u0001Shj\u0001\u001eGY720";
        objectArray[75] = "3E=x \u0019v\u00151(CW\rB$sy\u0012rA&py";
        objectArray[76] = "g\u0002HZn]-RUSQ\r=\u000fN[\u0006ZbR\u001574\r<\t\u0013P3^-Z";
        objectArray[77] = ">\u0011L\u0012\u0007\u001d5\u001a\u0012\u0013jB\u000fE\u0010\u0010\u0007D1\u000f@\r\u000e";
        objectArray[78] = "n^r\u0012Y\u001d$\u000eo\u001bfM4St\u00131\u001aj\u0000-\u007f\b[n\u0000j\u0014\bA>]";
        objectArray[79] = "\u0007\t\u0019;~9\u0011\u0016\u0005=\u0019,\u001b\u0006\u001b(N\u007fJSODd \u001c\u0014\u0018?r?\u0000\u0012";
        objectArray[80] = "]\u0003\r;_y\u0017S\u00102`)\u0007\u000e\u000b:7~Y]VV\u001cy\u000f\u0005\u0016*\r|\u001e\u0012";
        objectArray[81] = "2B|mX:w\u0012p=;s\fBb|PvjBdhT";
        objectArray[82] = "(Z\u0017gSa\"J\u001b`+W\u0004e2Uw\u001c(Z\u0017gSa\"J\u001b`";
        objectArray[83] = "2Ev\u0010)\u001e<\u001f{\u001aF\u00190^g\u0005*+d\u001a?Rz|2Ev\u0010)\u001e<\u001f{\u001aF";
        objectArray[84] = "\u0006`l9B\fC0`i!F8`r(J@^`t<N";
        objectArray[85] = ">&Lut\r0|A\u007f\u001b\n<=]`w8hy\u00079#o<8Cl&\t<>Wh\u001b";
        objectArray[86] = "\u0010J%N\fB\u0007\u0016e\u001av\u000bk\ri\u0014\rE\t\u001am\u001eL;R\u0011$DGK\u0014\u001b{\u001cv";
        objectArray[87] = "\u0010;O`@5\u001c9Sy90AzSuU\u0002\u0012?\u000b.9(N`LuB>Q|J\u0012\u0006+EhKy\u0006'Ex3";
        objectArray[88] = "]F\u0001+?6WU\u001cyV#_W\u001d!:\u0011\u000b\u0014BvmFP@\u0012{4(II\u0002%V";
        objectArray[89] = "GN$vN,\u0006Iq%39TR~!_\u000b\u0000\u0011!v\t\\\\Pn)]=A\u0011x?3";
        objectArray[90] = "t\u0017x26\u0016zMu8Y\u0011v\fi'5#\"H3~etv\tw+d\u0012v\u000fc/Y";
        objectArray[91] = ".\u0004K_98)VCHAuCNR\t:6!YV\u0003{H.LQR|..JEVA";
        objectArray[92] = ";\u001e\r\r,\u0019~N\u0001]OR\u0005\u001e[\u0006)\u0010u\u0019\t\u000e>";
        objectArray[93] = "m2o\u00007i6)m\u0017Y6l9d\u0010\u000ei<d?|8614|D%*2*";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "W0\u0014t\bR\u0012`\u0018$k\u00125]\bf[X\u0017?\u001fbQ\u0019ib\rr\u0005[\u0002b\u0001r\u0015#";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6H.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f6' || c == '$' || c == '\u00d1' || c == '\u00aa') {
                field = _6H.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '$' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6H.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/6H" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _6H.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = _6H.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6H.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6H.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6H.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6H.f(3305829604027588L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6H.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6H.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6H.f(3305829604027588L, 0L);
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
            int n = _6H.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6H.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6H.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6H.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6H.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6H.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x56CA;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/6H", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6H.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6H.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void cfr_renamed_375(Object[] objectArray) {
        block24: {
            _6H h;
            long l2;
            long l3;
            block25: {
                Object object;
                long l4;
                class_3965 class_39652;
                block23: {
                    Object object2;
                    CallSite callSite;
                    _4w[] wArray;
                    long l5;
                    block20: {
                        block22: {
                            block21: {
                                l3 = (Long)objectArray[0];
                                class_39652 = (class_3965)objectArray[1];
                                long l6 = l3 = b ^ l3;
                                l5 = l6 ^ 0x21E64A687237L;
                                l4 = l6 ^ 0x910606D9EB9L;
                                l2 = l6 ^ 0xB73FC78CE92L;
                                long l7 = l6 ^ 0x2F0609C927AL;
                                wArray = _3s.cfr_renamed_5();
                                try {
                                    if (_6H.c("\u00de", (Object)class_39652, 4844496787022758233L, (long)l3) != _6H.c("\u00d1", 4845224684589780496L, (long)l3)) {
                                        return;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _6H.a(matchException);
                                }
                                try {
                                    if (_6H.c("\u00f6", (Object)this, 4843631706038689982L, (long)l3) > 0) {
                                        return;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _6H.a(matchException);
                                }
                                callSite = _6H.c("\u00de", (Object)class_39652, 4837090538829056761L, (long)l3);
                                try {
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[3];
                                            objectArray2[2] = _6H.c("\u00d1", 4837963877287468530L, (long)l3);
                                            objectArray2[1] = callSite;
                                            objectArray2[0] = l7;
                                            object2 = _6H.c("\u00e9", (Object)objectArray2, 4845057151829614391L, (long)l3);
                                            if (wArray != null) break block20;
                                            if (object2 != false) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6H.a(matchException);
                                        }
                                        Object[] objectArray3 = new Object[3];
                                        objectArray3[2] = _6H.c("\u00d1", 4844283708416015956L, (long)l3);
                                        objectArray3[1] = callSite;
                                        objectArray3[0] = l7;
                                        object2 = _6H.c("\u00e9", (Object)objectArray3, 4845057151829614391L, (long)l3);
                                        if (wArray != null) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6H.a(matchException);
                                    }
                                    if (object2 == false) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw _6H.a(matchException);
                                }
                            }
                            object2 = true;
                            break block20;
                        }
                        object2 = false;
                    }
                    Object object3 = object2;
                    try {
                        try {
                            try {
                                object = object3;
                                if (l3 < 0L || wArray != null) break block23;
                                if (object == false) break block24;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            h = this;
                            if (wArray != null) break block25;
                        }
                        catch (MatchException matchException) {
                            throw _6H.a(matchException);
                        }
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = callSite;
                        objectArray4[0] = l5;
                        object = _6H.c("\u00de", (Object)h, (Object)objectArray4, 4837799363859773249L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                }
                try {
                    if (object == false) break block24;
                    Object[] objectArray5 = new Object[3];
                    objectArray5[2] = true;
                    objectArray5[1] = class_39652;
                    objectArray5[0] = l4;
                    _6H.c("\u00e9", (Object)objectArray5, 4844842048678309887L, (long)l3);
                    h = this;
                }
                catch (MatchException matchException) {
                    throw _6H.a(matchException);
                }
            }
            Object[] objectArray6 = new Object[1];
            objectArray6[0] = l2;
            _6H.c("$", (Object)h, (int)_6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)this, 4845159071662077054L, (long)l3), (Object)objectArray6, 4844677562079197633L, (long)l3), 4843631706038689982L, (long)l3);
        }
    }

    private static Field g(long l2, long l3) {
        int n = _6H.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6H.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6H.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6H.c(clazz3, string2, clazz2)) != null) {
                    _6H.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6H.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6H.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6H.f(3305829604027588L, 0L);
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
    public void cfr_renamed_4(_6j_0 j_0) {
        Object object;
        block28: {
            block30: {
                block29: {
                    class_3965 class_39652;
                    CallSite callSite;
                    _4w[] wArray;
                    long l2;
                    long l3;
                    block26: {
                        class_3965 class_39653;
                        block27: {
                            CallSite callSite2;
                            block25: {
                                CallSite callSite3;
                                block23: {
                                    block24: {
                                        l3 = b ^ 0x3059B7DE6E85L;
                                        l2 = l3 ^ 0x5971ACCC3081L;
                                        wArray = _3s.cfr_renamed_5();
                                        try {
                                            try {
                                                callSite3 = _6H.c("\u00f6", (Object)this, -2178303556385416495L, (long)l3);
                                                if (wArray != null) break block23;
                                                if (_6H.c("\u00de", (Object)_6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)callSite3, -2178481094553417474L, (long)l3), -2172273922544813587L, (long)l3), -2172754007689919429L, (long)l3) == _6H.c("\u00d1", -2177564816952126646L, (long)l3)) break block24;
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6H.a(matchException);
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw _6H.a(matchException);
                                        }
                                    }
                                    callSite3 = _6H.c("\u00f6", (Object)this, -2178303556385416495L, (long)l3);
                                }
                                callSite = _6H.c("\u00f6", (Object)callSite3, -2178116039212195179L, (long)l3);
                                try {
                                    try {
                                        callSite2 = callSite;
                                        if (wArray != null) break block25;
                                        if (!(callSite2 instanceof class_3965)) return;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6H.a(matchException);
                                    }
                                    callSite2 = callSite;
                                }
                                catch (MatchException matchException) {
                                    throw _6H.a(matchException);
                                }
                            }
                            class_39653 = (class_3965)callSite2;
                            try {
                                if (wArray != null) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            try {
                                try {
                                    class_39652 = class_39653;
                                    if (wArray != null) break block26;
                                    if (_6H.c("\u00de", (Object)class_39652, -2179663429171420254L, (long)l3) == _6H.c("\u00d1", -2177796443874710293L, (long)l3)) break block27;
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _6H.a(matchException);
                                }
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                        }
                        class_39652 = class_39653;
                    }
                    callSite = _6H.c("\u00de", (Object)class_39652, -2171975585773934590L, (long)l3);
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[3];
                                objectArray[2] = _6H.c("\u00d1", -2172779002682097911L, (long)l3);
                                objectArray[1] = callSite;
                                objectArray[0] = l2;
                                object = _6H.c("\u00e9", (Object)objectArray, -2177980462732558900L, (long)l3);
                                if (wArray != null) break block28;
                                if (object != false) break block29;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            Object[] objectArray = new Object[3];
                            objectArray[2] = _6H.c("\u00d1", -2179458699946779473L, (long)l3);
                            objectArray[1] = callSite;
                            objectArray[0] = l2;
                            object = _6H.c("\u00e9", (Object)objectArray, -2177980462732558900L, (long)l3);
                            if (wArray != null) break block28;
                        }
                        catch (MatchException matchException) {
                            throw _6H.a(matchException);
                        }
                        if (object == false) break block30;
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                }
                object = true;
                break block28;
            }
            object = false;
        }
        Object object2 = object;
        try {
            if (object2 == false) return;
            j_0.void_8();
            return;
        }
        catch (MatchException matchException) {
            throw _6H.a(matchException);
        }
    }

    @Override
    public native void cfr_renamed_2();

    private boolean boolean_6(Object[] objectArray) {
        Object object;
        block8: {
            block9: {
                long l2 = (Long)objectArray[0];
                long l3 = l2 = b ^ l2;
                long l4 = l3 ^ 0x1DFB64B89085L;
                long l5 = l3 ^ 0x5A0FA602F304L;
                long l6 = l3 ^ 0x7FB79FAA71A8L;
                _4w[] wArray = _3s.cfr_renamed_5();
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l4;
                CallSite callSite = _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)this, -5446070256878893437L, (long)l2), (Object)objectArray2, -5443505935320714794L, (long)l2);
                try {
                    try {
                        try {
                            try {
                                object = callSite;
                                if (wArray != null) break block8;
                                if (object == -1) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l5;
                            objectArray3[0] = (int)callSite;
                            object = _6H.c("\u00e9", (Object)objectArray3, -5445696492201433068L, (long)l2);
                            if (wArray != null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _6H.a(matchException);
                        }
                        if (object != false) break block9;
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                    Object[] objectArray4 = new Object[1];
                    objectArray4[0] = l6;
                    _6H.c("\u00de", (Object)this, (Object)objectArray4, -5443444357013834949L, (long)l2);
                    return false;
                }
                catch (MatchException matchException) {
                    throw _6H.a(matchException);
                }
            }
            object = true;
        }
        return (boolean)object;
    }

    private boolean boolean_2(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                class_2338 class_23382 = (class_2338)objectArray[1];
                l2 = b ^ l2;
                _4w[] wArray = _3s.cfr_renamed_5();
                callSite2 = _6H.c("\u00de", (Object)class_23382, -4729429394511524273L, (long)l2);
                try {
                    try {
                        callSite = _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -4730465269311011506L, (long)l2), -4730383045760006720L, (long)l2), (Object)callSite2, -4729926029335005784L, (long)l2);
                        if (wArray != null) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw _6H.a(matchException);
                }
            }
            callSite = _6H.c("\u00de", (Object)callSite2, -4730776307894328533L, (long)l2);
        }
        double d = (double)callSite;
        double d2 = (double)_6H.c("\u00de", (Object)callSite2, -4728836558594309661L, (long)l2);
        double d3 = (double)_6H.c("\u00de", (Object)callSite2, -4729863686977905059L, (long)l2);
        double d4 = d + 1.0;
        double d5 = d2 + 2.0;
        double d6 = d3 + 1.0;
        class_238 class_2382 = new class_238(d, d2, d3, d4, d5, d6);
        CallSite callSite3 = _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -4730465269311011506L, (long)l2), -4730383045760006720L, (long)l2), null, (Object)class_2382, -4735987187716751436L, (long)l2);
        return (boolean)_6H.c("\u00de", (Object)callSite3, -4730923119603439505L, (long)l2);
    }

    @_3i_0
    public void cfr_renamed_8(_9o o) {
        _6H h;
        long l2;
        long l3;
        block26: {
            block27: {
                _4w[] wArray;
                block25: {
                    CallSite callSite;
                    block23: {
                        long l4;
                        block24: {
                            block21: {
                                long l5;
                                block22: {
                                    _6H h2;
                                    long l6;
                                    long l7;
                                    block19: {
                                        block20: {
                                            long l8 = l3 = b ^ 0x1B4B898452AEL;
                                            l7 = l8 ^ 0x3E19FB145A61L;
                                            l5 = l8 ^ 0x1DDE3614BEEFL;
                                            l4 = l8 ^ 0x504490E3E6D7L;
                                            l2 = l8 ^ 0x1CCA11C18043L;
                                            l6 = l8 ^ 0x246202311072L;
                                            wArray = _3s.cfr_renamed_5();
                                            try {
                                                try {
                                                    h2 = this;
                                                    if (wArray != null) break block19;
                                                    if (_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)h2, -2454963831970502918L, (long)l3), -2454704655095706822L, (long)l3) == null) break block20;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6H.a(matchException);
                                                }
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6H.a(matchException);
                                            }
                                        }
                                        h2 = this;
                                    }
                                    try {
                                        try {
                                            try {
                                                callSite = _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)h2, -2454398299968780767L, (long)l3), (long)l6, -2453644291541515731L, (long)l3);
                                                if (wArray != null) break block21;
                                                if (callSite == false) break block22;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6H.a(matchException);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l7;
                                            callSite = _6H.c("\u00e9", (Object)objectArray, -2452592746076849646L, (long)l3);
                                            if (wArray != null) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6H.a(matchException);
                                        }
                                        if (callSite == false) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6H.a(matchException);
                                    }
                                    return;
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l5;
                                _6H.c("\u00de", (Object)this, (Object)objectArray, -2455917031808147265L, (long)l3);
                                callSite = _6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)this, -2454963831970502918L, (long)l3), -2454653186306771755L, (long)l3), -2453518349269450273L, (long)l3);
                            }
                            try {
                                if (wArray != null) break block23;
                                if (callSite == false) break block24;
                            }
                            catch (MatchException matchException) {
                                throw _6H.a(matchException);
                            }
                            return;
                        }
                        try {
                            h = this;
                            if (wArray != null) break block25;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            callSite = _6H.c("\u00de", (Object)h, (Object)objectArray, -2455107680957748639L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _6H.a(matchException);
                        }
                    }
                    if (callSite == false) {
                        return;
                    }
                    h = this;
                }
                try {
                    try {
                        if (wArray != null) break block26;
                        if (_6H.c("\u00de", (Object)_6H.c("\u00de", (Object)_6H.c("\u00f6", (Object)_6H.c("\u00f6", (Object)h, -2454963831970502918L, (long)l3), -2454653186306771755L, (long)l3), -2454000610483829306L, (long)l3), -2453343937775257584L, (long)l3) == _6H.c("\u00d1", -2455421377764380831L, (long)l3)) break block27;
                    }
                    catch (MatchException matchException) {
                        throw _6H.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _6H.a(matchException);
                }
            }
            h = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _6H.c("\u00de", (Object)h, (Object)objectArray, -2454389913219643123L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6H.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

