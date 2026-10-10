/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_3966
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6C;
import dev.krypton._6x_0;
import dev.krypton._7C;
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
import net.minecraft.class_1657;
import net.minecraft.class_3966;

public class _5_
extends _6x_0 {
    private final _92 cfr_renamed_7;
    private final _9r cfr_renamed_0;
    private final _9r cfr_renamed_9;
    private _7C cfr_renamed_2;
    private boolean cfr_renamed_8;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    private void cfr_renamed_121(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x7274E0EE6839L;
        int n = (int)(l4 >>> 48);
        int n2 = (int)(l4 << 16 >>> 32);
        int n3 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x5E61E0A9F2C0L;
        long l6 = l3 ^ 0x2DB1E5B236DL;
        long l7 = l3 ^ 0x515566F69E6CL;
        long l8 = l3 ^ 0x789488F17C70L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        _5_.c("\u00a5", (Object)this, (Object)objectArray2, -5623864497200268196L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l6;
        _5_.c("M", (Object)this, (_7C)new _7C((char)n, n2, (class_1657)_5_.c("u", (Object)_5_.c("u", (Object)this, -5623767510458114507L, (long)l2), -5623388272483905088L, (long)l2), n3, (float)_5_.c("\u00a5", (Object)_5_.c("u", (Object)this, -5623576446644360063L, (long)l2), (Object)objectArray3, -5622272462860662232L, (long)l2), (boolean)_5_.c("\u00a5", (Object)_5_.c("u", (Object)this, -5622228300799194172L, (long)l2), (long)l8, -5622949767315857521L, (long)l2)), -5623214820384697675L, (long)l2);
        _5_.c("\u00a5", (Object)_5_.c("u", (Object)this, -5623214820384697675L, (long)l2), (int)_5_.a("g", 9587, (long)(0x33E104B8B1C6CABCL ^ l2)), -5624082421406083848L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l7;
        _5_.c("\u00a5", (Object)_5_.c("u", (Object)this, -5623214820384697675L, (long)l2), (Object)objectArray4, -5622680092754376381L, (long)l2);
        _5_.c("M", (Object)this, (boolean)_5_.a("g", 18405, (long)(0x1617A37A2221A82DL ^ l2)), -5623615339854603895L, (long)l2);
    }

    private void cfr_renamed_84(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            long l3;
            block4: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = b ^ l3) ^ 0xEEBD8B608L;
                int n = _7C.cfr_renamed_3();
                try {
                    try {
                        callSite = _5_.c("u", (Object)this, -372077311949776491L, (long)l3);
                        if (n != 0) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5_.a(matchException);
                    }
                    callSite = _5_.c("u", (Object)this, -372077311949776491L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _5_.a(matchException);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _5_.c("\u00a5", (Object)callSite, (Object)objectArray2, -372373493701237862L, (long)l3);
            _5_.c("M", (Object)this, null, -372077311949776491L, (long)l3);
        }
    }

    public _5_(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x260CA12A0002L;
        long l5 = l3 ^ 0x366C93E37991L;
        long l6 = l3 ^ 0x70343669886BL;
        long l7 = l3 ^ 0x6FF4A54D6719L;
        super((int)_5_.a("g", 30438, (long)(0x3469E22C4D24099DL ^ l2)), -1, (_4r)((Object)_5_.c("\u00fc", 2397638946695995942L, (long)l2)), l6);
        this.cfr_renamed_7 = new _92((int)_5_.a("g", 11796, (long)(0x17F4777BF2C05167L ^ l2)), 1.0, l5, 20.0, 20.0, 1.0);
        this.cfr_renamed_0 = new _9r((int)_5_.a("g", 5809, (long)(0x29A93D3D93FAE9C4L ^ l2)), true, l4);
        this.cfr_renamed_9 = new _9r((int)_5_.a("g", 13187, (long)(0x48A8168F02A24CF1L ^ l2)), true, l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5_.c("u", (Object)this, 2398825205665168446L, (long)l2), _5_.c("u", (Object)this, 2397754420757126011L, (long)l2), _5_.c("u", (Object)this, 2398433936055656531L, (long)l2)};
        objectArray[0] = l7;
        _5_.c("\u00a5", (Object)this, (Object)objectArray, 2398291932977561189L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5_.class, 51);
                _5_.b = l.a(8939905134713607778L, -3808759917547140910L, MethodHandles.lookup().lookupClass()).a(122050994245616L);
                _5_.j = new Object[51];
                _5_.k = new String[51];
                _5_.b();
                _5_.f = new HashMap<K, V>(13);
                var0 = _5_.b ^ 133064037194184L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u0012M|C\u00e7C\u001e*\u00ad\u0089\u00bf\u00eb\u00f1\u00f7\u00f8\u00a6\u00bbK`W`\u00e25\u00bd\u00f6\b&\u00ec(\u00c2\u00e8\u0087\u00dbUO\u0019\u00bc\u009e\u007f\u00abbd\u0097M3\u00ddO?\u0097\u0085\u00f8\u00cb\u00bf\u00b9\u00d6YD'C\u008d\u00e8@2\u00a9";
                var7_6 = "\u0012M|C\u00e7C\u001e*\u00ad\u0089\u00bf\u00eb\u00f1\u00f7\u00f8\u00a6\u00bbK`W`\u00e25\u00bd\u00f6\b&\u00ec(\u00c2\u00e8\u0087\u00dbUO\u0019\u00bc\u009e\u007f\u00abbd\u0097M3\u00ddO?\u0097\u0085\u00f8\u00cb\u00bf\u00b9\u00d6YD'C\u008d\u00e8@2\u00a9".length();
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
                    var6_5 = "E\u009c\u0002n\u0091\u00eceN\u0013\u0085\u0090\u008c\u00d9`IO";
                    var7_6 = "E\u009c\u0002n\u0091\u00eceN\u0013\u0085\u0090\u008c\u00d9`IO".length();
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
        _5_.d = var8_3;
        _5_.e = new Integer[10];
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
            case 0 -> 53;
            case 1 -> 7;
            case 2 -> 1;
            case 3 -> 17;
            case 4 -> 6;
            case 5 -> 60;
            case 6 -> 51;
            case 7 -> 20;
            case 8 -> 38;
            case 9 -> 29;
            case 10 -> 28;
            case 11 -> 37;
            case 12 -> 8;
            case 13 -> 46;
            case 14 -> 22;
            case 15 -> 13;
            case 16 -> 5;
            case 17 -> 3;
            case 18 -> 23;
            case 19 -> 21;
            case 20 -> 30;
            case 21 -> 35;
            case 22 -> 63;
            case 23 -> 44;
            case 24 -> 31;
            case 25 -> 18;
            case 26 -> 10;
            case 27 -> 34;
            case 28 -> 47;
            case 29 -> 9;
            case 30 -> 39;
            case 31 -> 11;
            case 32 -> 41;
            case 33 -> 27;
            case 34 -> 16;
            case 35 -> 48;
            case 36 -> 61;
            case 37 -> 2;
            case 38 -> 15;
            case 39 -> 24;
            case 40 -> 43;
            case 41 -> 62;
            case 42 -> 36;
            case 43 -> 50;
            case 44 -> 54;
            case 45 -> 26;
            case 46 -> 25;
            case 47 -> 55;
            case 48 -> 32;
            case 49 -> 52;
            case 50 -> 19;
            case 51 -> 58;
            case 52 -> 57;
            case 53 -> 0;
            case 54 -> 42;
            case 55 -> 12;
            case 56 -> 59;
            case 57 -> 45;
            case 58 -> 49;
            case 59 -> 14;
            case 60 -> 4;
            case 61 -> 33;
            case 62 -> 40;
            default -> 56;
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
        _5_.k[n3] = new String(cArray);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_1(_9o o) {
        _5_ _;
        long l2;
        long l3;
        block25: {
            block26: {
                CallSite callSite;
                block28: {
                    CallSite callSite2;
                    int n;
                    long l4;
                    block27: {
                        block24: {
                            CallSite callSite3;
                            block23: {
                                long l5 = l3 = b ^ 0x388A88AF41A8L;
                                l2 = l5 ^ 0x1BC2791BF057L;
                                l4 = l5 ^ 0x73791E4135C7L;
                                n = _7C.cfr_renamed_3();
                                try {
                                    try {
                                        try {
                                            callSite3 = _5_.c("u", (Object)this, -557506463259256958L, (long)l3);
                                            if (n != 0) break block23;
                                            if (_5_.c("u", (Object)callSite3, -557674751799093129L, (long)l3) == null) return;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5_.a(matchException);
                                        }
                                        _ = this;
                                        if (n != 0) break block24;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5_.a(matchException);
                                    }
                                    callSite3 = _5_.c("u", (Object)_, -557506463259256958L, (long)l3);
                                }
                                catch (MatchException matchException) {
                                    throw _5_.a(matchException);
                                }
                            }
                            try {
                                if (_5_.c("u", (Object)callSite3, -557625324071228264L, (long)l3) == null) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _5_.a(matchException);
                            }
                            _ = this;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n != 0) break block25;
                                        if (_5_.c("u", (Object)_, -557342129174147010L, (long)l3) != false) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5_.a(matchException);
                                    }
                                    callSite2 = _5_.c("u", (Object)this, -558068102970844414L, (long)l3);
                                    if (n != 0) break block27;
                                }
                                catch (MatchException matchException) {
                                    throw _5_.a(matchException);
                                }
                                if (callSite2 == null) return;
                            }
                            catch (MatchException matchException) {
                                throw _5_.a(matchException);
                            }
                            callSite2 = _5_.c("u", (Object)this, -558068102970844414L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _5_.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                callSite = _5_.c("\u00a5", (Object)callSite2, -558151805646143114L, (long)l3);
                                if (n != 0) break block28;
                                if (callSite == false) return;
                            }
                            catch (MatchException matchException) {
                                throw _5_.a(matchException);
                            }
                            _ = this;
                            if (n != 0) break block25;
                        }
                        catch (MatchException matchException) {
                            throw _5_.a(matchException);
                        }
                        callSite = _5_.c("\u00a5", (Object)_5_.c("u", (Object)_, -558265155867625125L, (long)l3), (long)l4, -558359389699467720L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5_.a(matchException);
                    }
                }
                if (callSite == false) return;
            }
            _ = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _5_.c("\u00a5", (Object)_, (Object)objectArray, -554079787508311965L, (long)l3);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "F \u0002p\nJ[5\u00001\u000f\u0016\u0015\u0006";
        objectArray[1] = "0^R\u0015-\u0003E~Y\u001a<L$pR\u00118\u0016P";
        objectArray[2] = Void.TYPE;
        _5_.k[2] = "java/lang/Void";
        objectArray[3] = "Arm\tXQ\\goH]\r\u0010H";
        objectArray[4] = "3A\u0019i%[.T\u001b( \u0007n\u0016";
        objectArray[5] = ".\u0018{\u001dw\u0015.\u0018lA{\u001a4Sl_{\u000f3\"<\u0002*";
        objectArray[6] = "hAs\r9,hAdQ5#r\ndO56u{0\u0017b";
        objectArray[7] = "m\u0002dWEv\u0018\"oXT9y,dSPc\r";
        objectArray[8] = Float.TYPE;
        _5_.k[8] = "java/lang/Float";
        objectArray[9] = "b\u0017cM.\u001a\u007f\u0002a\f+F?\u0000";
        objectArray[10] = "w\u0000\u001a\u001d`v\u0002 \u0011\u0012q9c.\u001a\u0019uc\u0017";
        objectArray[11] = "VSw\n8@#s|\u0005)\u000fB}w\u000e-U6";
        objectArray[12] = "\t\u001fs/yY\u0014\nqn|\u0005[\u0002";
        objectArray[13] = Boolean.TYPE;
        _5_.k[13] = "java/lang/Boolean";
        objectArray[14] = Integer.TYPE;
        _5_.k[14] = "java/lang/Integer";
        objectArray[15] = Long.TYPE;
        _5_.k[15] = "java/lang/Long";
        objectArray[16] = "~]\u00066F\"~]\u0011jJ-d\u0016\u0011tJ8cg@+\u0012";
        objectArray[17] = "8\u0000:\"F~8\u0000-~Jq\"K-`Jd%:}5\u001d!";
        objectArray[18] = "\u0006~.0*e\u0006~9l&j\u001c59r&\u007f\u001bDk,~;";
        objectArray[19] = "q\t\u0019k:tl\u001c\u001b*?(!\u001e";
        objectArray[20] = "N^Z|6M;~Qs'\u0002ZpZx#X.";
        objectArray[21] = "\u0004,#\u0012\u001a(\u0004,4N\u0016'\u001eg4P\u00162\u0019\u0016a\u000fO";
        objectArray[22] = "\u0011O>\u0005!Xdo5\n0\u0017\u0005a>\u00014Mq";
        objectArray[23] = "=6_HatH\u0016TGp;)\u0018_Lta]";
        objectArray[24] = "\n\u0019M9\u007fb\u0001\u0016\\v\u001el\n\u001dX,";
        objectArray[25] = "k&\u0007*\fv|7Uio\nF\u0000}\u0014\u000326eU-\u0014#d&";
        objectArray[26] = "u0Jq.R?6\foO\u001fNb\nh(@vc\u000fz\u007f/s|\tk4\u0013/tBfO";
        objectArray[27] = "\u001eGqY8wAV\u007f\r[\"$\u0019l^>w\\\u001do\u0014<";
        objectArray[28] = "CU8hRl\u0013\u001f>S\u0006\u0001\u001c\u001f,4Y9\u001d\u001a>c68\b\u001d4iOjJG9S";
        objectArray[29] = "/un0+S\u007f?h\u000b*Scetg\u0018\u0000'>)\u000brO&oh7.Gmb\u0013";
        objectArray[30] = "ie`\u001fwj6tnK\u00145\u0019\u0005q\u001a}h<=p\u001fo?S<e\u0018e5*n'Bh\u000f";
        objectArray[31] = "H\u0000\u0001\u0002G\u0014\u0018J\u00079M\u0018\u0015\u0014\u0010n\u001dCCM|\b\\\u0010\tO@[R\u0007\u0007";
        objectArray[32] = "at\u000e6W\u007fj{\u001c!%%QqM'BsipH5\u0015\u001cheO?\u001fe:'\u00152%";
        objectArray[33] = "R}E^'.V~\u000f\\Bllw\rW\"gV$C@|V].\u001dA>3Qu\u0010FB";
        objectArray[34] = "o\bn49\u000e0\u0019``ZTUVs3?\u000e-Rpy=";
        objectArray[35] = "\">\u0013pY5rt\u0015KS9\u007f*\u0002\u001c\u0003b/rnzB1cqR)L&m";
        objectArray[36] = "z=\u001a~ }*w\u001cE!}6-\u0000)\u0013+sqW|D!z-\u001d9!-! \u001aE";
        objectArray[37] = "W\t~\u001c|v\b\u0018pH\u001f-mYp^$w\u0000\t:X";
        objectArray[38] = "\u0003N\r\u0005AWS\u0004\u000b>@WO^\u0017Rr\u0004\u000b\u0005K>\u0018K\nT\u000b\u0002DCAYp\u0007^\u0002B\u0004\tU\u001cXO>";
        objectArray[39] = "z;\u001a1G_q4\b&5\u0001J>Y RSr?\\2\u0005<s*[8\u000fE!h\u000155";
        objectArray[40] = "_GK\bu\u000f\u0000VE\\\u0016Ve\u001c\bMf\u000b\u0018V\u000e\u000bx";
        objectArray[41] = "%p\\UK_u:Zn\u00132z:H\t@\n{?Z^/\u000bn8PTVY,b]n";
        objectArray[42] = "\u0019hoG_ZAiu\u00186[Cx`Oa\f\u001d/8#\nO\\~c\\NQ\u0018+";
        objectArray[43] = "\u0010M|<hWHLfc\u0001VJ]s4V\u0001\u0015\u0000(Xl]SSx)bF\u001a_";
        objectArray[44] = "\u0019\u0016OI\u0015kF\u0007A\u001dv4Lv^L\u001fiLN_I\r>#OJN\u00074Z\u001d\b\u0014\n\u000e";
        objectArray[45] = "{:Y>.Tp5K)\\\u000eKk]-8^$3\\7g";
        objectArray[46] = "`2kt-083q+D1:\"d|\u0013fdq=\u0010.:`5k)*/ -";
        objectArray[47] = "[g\u0013,w/\u0004v\u001dx\u0014wa6]sn6\u0004:\u0006~i";
        objectArray[48] = "'F 4Z\u0016w\f&\u000f[\u0016kV:ciF'\rm\u000f\u000f\u0004~Gb3\\\niI]6ECf\f$d\u0007\u0019k6";
        objectArray[49] = "u\u007fJ9\u001fE1a\u000elx_$yT5\u0014mv?\nkx\u00078<^)D[0wSREKpoOn\u0019C;b4";
        Object[] objectArray2 = objectArray;
        objectArray[50] = "\u0016\u0014!\u0000{bE\u0012.\u001fCc\u0011\u0017!\u0015/QET~By\u0006\u0017\u00148L>6\u0015\r#\u0011C";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'u' || c == 'M' || c == '\u00fc' || c == '\u00c7') {
                field = _5_.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'u' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5_.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5_.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5_" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _5_.e(l2, l3);
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
                clazz3 = _5_.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5_.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5_.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5_.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5_.f(1732733069784875L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5_.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5_.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5_.f(1732733069784875L, 0L);
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
            int n = _5_.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5_.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5_.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5_.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5_.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5_.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5_.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5E32;
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
                throw new RuntimeException("dev/krypton/5_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5_.e[n2] = n3;
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _5_.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5_.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5_.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5_.c(clazz3, string2, clazz2)) != null) {
                    _5_.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5_.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5_.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5_.f(1732733069784875L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_4(_6C var1_1) {
        block35: {
            block34: {
                block33: {
                    block32: {
                        block30: {
                            block31: {
                                block29: {
                                    var2_2 = _5_.b ^ 113670110991202L;
                                    var4_3 = var2_2 ^ 95510993205264L;
                                    var6_4 = _7C.cfr_renamed_9();
                                    try {
                                        try {
                                            v0 = this;
                                            if (var6_4 == 0) break block29;
                                            if (_5_.c("u", (Object)v0, (long)-1546133323795183160L, (long)var2_2) != null) {
                                            }
                                            ** GOTO lbl27
                                        }
                                        catch (MatchException v1) {
                                            throw _5_.a(v1);
                                        }
                                        v0 = this;
                                    }
                                    catch (MatchException v2) {
                                        throw _5_.a(v2);
                                    }
                                }
                                try {
                                    try {
                                        v3 = _5_.c("u", (Object)v0, (long)-1546694859907431096L, (long)var2_2);
                                        if (var6_4 == 0) break block30;
                                        if (_5_.c("u", (Object)v3, (long)-1546737776266409283L, (long)var2_2) != null) break block31;
                                    }
                                    catch (MatchException v4) {
                                        throw _5_.a(v4);
                                    }
lbl27:
                                    // 2 sources

                                    return;
                                }
                                catch (MatchException v5) {
                                    throw _5_.a(v5);
                                }
                            }
                            v3 = _5_.c("u", (Object)this, (long)-1546694859907431096L, (long)var2_2);
                        }
                        var8_5 = _5_.c("u", (Object)v3, (long)-1546471105264545536L, (long)var2_2);
                        try {
                            try {
                                v6 = var8_5;
                                if (var6_4 == 0) break block32;
                                if (v6 instanceof class_3966) {
                                }
                                ** GOTO lbl51
                            }
                            catch (MatchException v7) {
                                throw _5_.a(v7);
                            }
                            v6 = var8_5;
                        }
                        catch (MatchException v8) {
                            throw _5_.a(v8);
                        }
                    }
                    var7_7 = (class_3966)v6;
                    try {
                        if (var6_4 != 0) break block33;
lbl51:
                        // 2 sources

                        return;
                    }
                    catch (MatchException v9) {
                        throw _5_.a(v9);
                    }
                }
                try {
                    if (_5_.c("\u00a5", (Object)var7_7, (long)-1545025326525640523L, (long)var2_2) != _5_.c("u", (Object)this, (long)-1546133323795183160L, (long)var2_2)) {
                        return;
                    }
                }
                catch (MatchException v10) {
                    throw _5_.a(v10);
                }
                _5_.c("M", (Object)_5_.c("u", (Object)this, (long)-1546133323795183160L, (long)var2_2), (int)_5_.a("g", (int)21109, (long)(8593895216552076995L ^ var2_2)), (long)-1547634716647848665L, (long)var2_2);
                _5_.c("M", (Object)_5_.c("u", (Object)this, (long)-1546133323795183160L, (long)var2_2), (int)_5_.a("g", (int)30916, (long)(1811983597006441584L ^ var2_2)), (long)-1546271952939574262L, (long)var2_2);
                var8_6 = _5_.c("\u00a5", (Object)_5_.c("u", (Object)_5_.c("u", (Object)this, (long)-1546694859907431096L, (long)var2_2), (long)-1546737776266409283L, (long)var2_2), (float)0.5f, (long)-1545265635542116418L, (long)var2_2) * 4.0f;
                var9_8 = _5_.c("\u00a5", (Object)_5_.c("u", (Object)this, (long)-1546133323795183160L, (long)var2_2), (long)-1547792839042900005L, (long)var2_2) - var8_6;
                try {
                    try {
                        if (var6_4 == 0) break block34;
                        if (var9_8 <= 0.0f) {
                        }
                        ** GOTO lbl83
                    }
                    catch (MatchException v11) {
                        throw _5_.a(v11);
                    }
                    v12 = new Object[1];
                    v12[0] = var4_3;
                    _5_.c("\u00a5", (Object)_5_.c("u", (Object)this, (long)-1546133323795183160L, (long)var2_2), (float)_5_.c("\u00a5", (Object)_5_.c("u", (Object)this, (long)-1546882006753003524L, (long)var2_2), (Object)v12, (long)-1547838605052636843L, (long)var2_2), (long)-1545873302494772775L, (long)var2_2);
                }
                catch (MatchException v13) {
                    throw _5_.a(v13);
                }
            }
            try {
                if (var6_4 != 0) break block35;
lbl83:
                // 2 sources

                _5_.c("\u00a5", (Object)_5_.c("u", (Object)this, (long)-1546133323795183160L, (long)var2_2), (float)var9_8, (long)-1545873302494772775L, (long)var2_2);
            }
            catch (MatchException v14) {
                throw _5_.a(v14);
            }
        }
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

