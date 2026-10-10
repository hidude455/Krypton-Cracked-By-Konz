/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._4r;
import dev.krypton._4t;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8w_0;
import dev.krypton._9M;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8Q
extends _8w_0 {
    private static final int cfr_renamed_1;
    private final _4r cfr_renamed_4;
    private static final long b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    @Override
    protected void void_1(Object[] objectArray) {
        block12: {
            boolean bl;
            block14: {
                block13: {
                    String string;
                    CallSite callSite;
                    boolean bl2;
                    CallSite callSite2;
                    long l2;
                    long l3;
                    long l4;
                    _87 var2_3;
                    block11: {
                        block10: {
                            int n = (Integer)objectArray[0];
                            var2_3 = (_87)objectArray[1];
                            int n2 = (Integer)objectArray[2];
                            int n3 = (Integer)objectArray[3];
                            int n4 = (Integer)objectArray[4];
                            int n5 = (Integer)objectArray[5];
                            float f = ((Float)objectArray[6]).floatValue();
                            long l5 = l4 = (long)n << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48;
                            long l6 = l5 ^ 0x159D131BAEEL;
                            l3 = l5 ^ 0x6664CBA7CDA8L;
                            l2 = l5 ^ 0x7FAF0AABDB4AL;
                            long l7 = l5 ^ 0x558E0BA3126BL;
                            long l8 = l5 ^ 0x419B738138B5L;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = (int)_8Q.c("G", (Object)_8Q.c("\u00ba", (Object)this, -777015159743997257L, (long)l4), -777220521224749250L, (long)l4);
                            objectArray2[1] = (int)_8Q.a("v", 32578, (long)(0x44C63E25CF22F9E2L ^ l4));
                            objectArray2[0] = l7;
                            callSite2 = _8Q.c("\u00c5", (Object)objectArray2, -778110267388781344L, (long)l4);
                            boolean bl3 = _8w_0.cfr_renamed_5();
                            CallSite callSite3 = _8Q.a("v", 147, (long)(0x337A8DEB323C063BL ^ l4));
                            reference var24_17 = _8Q.c("\u00ba", (Object)this, -777945094058720224L, (long)l4) + _8Q.a("v", 4583, (long)(0x9F6E0CE7A709743L ^ l4));
                            reference var25_18 = _8Q.c("\u00ba", (Object)this, -778459261665701465L, (long)l4) + 3;
                            Object[] objectArray3 = new Object[6];
                            objectArray3[5] = callSite2;
                            objectArray3[4] = (double)callSite3;
                            objectArray3[3] = (double)(var25_18 + 3);
                            objectArray3[2] = (double)(var24_17 + true);
                            objectArray3[1] = _8Q.c("\u00ba", (Object)_8Q.c("\u00ba", (Object)this, -777015159743997257L, (long)l4), -779119000562458827L, (long)l4);
                            objectArray3[0] = l6;
                            _8Q.c("G", (Object)var2_3, (Object)objectArray3, -778413273919632651L, (long)l4);
                            bl2 = bl3;
                            try {
                                try {
                                    if (_8Q.c("G", (Object)_8Q.c("K", -778717291805290050L, (long)l4), (long)l8, -778047148222466268L, (long)l4) == false) break block10;
                                    callSite = _8Q.c("K", -777238665848417371L, (long)l4);
                                    if (!bl2) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw _8Q.a(matchException);
                                }
                                if (callSite == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _8Q.a(matchException);
                            }
                            callSite = _8Q.c("K", -777238665848417371L, (long)l4);
                            break block11;
                        }
                        callSite = _8Q.c("K", -776920914095143470L, (long)l4);
                    }
                    CallSite callSite4 = callSite;
                    CallSite callSite5 = _8Q.c("\u00ba", (Object)_8Q.c("\u00ba", (Object)this, -777015159743997257L, (long)l4), -778154657578297081L, (long)l4);
                    reference var28_22 = _8Q.c("\u00ba", (Object)this, -777945094058720224L, (long)l4) + _8Q.a("v", 23081, (long)(0x13D3BC20E61D5C88L ^ l4));
                    reference var29_23 = _8Q.c("\u00ba", (Object)this, -778459261665701465L, (long)l4) + _8Q.a("v", 2344, (long)(0x1510A7B1D39F0F84L ^ l4));
                    try {
                        string = _8Q.c("\u00ba", (Object)this, -778676899147515092L, (long)l4) != false ? "-" : "+";
                    }
                    catch (MatchException matchException) {
                        throw _8Q.a(matchException);
                    }
                    String string2 = string;
                    reference var31_25 = _8Q.c("\u00ba", (Object)this, -777945094058720224L, (long)l4) + _8Q.c("\u00ba", (Object)this, -777391906133544139L, (long)l4) - _8Q.a("v", 5006, (long)(0x7A226218DCDA9529L ^ l4));
                    try {
                        try {
                            Object[] objectArray4 = new Object[3];
                            objectArray4[2] = () -> _8Q.cfr_renamed_6(l2, var2_3, (String)((Object)callSite5), (int)var28_22, (int)var29_23, (_8B)((Object)callSite2), string2, (int)var31_25);
                            objectArray4[1] = callSite4;
                            objectArray4[0] = l3;
                            _8Q.c("G", (Object)var2_3, (Object)objectArray4, -779011882245798061L, (long)l4);
                            if (_4w.cfr_renamed_8() != null) break block12;
                            if (!bl2) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _8Q.a(matchException);
                        }
                        bl = false;
                        break block14;
                    }
                    catch (MatchException matchException) {
                        throw _8Q.a(matchException);
                    }
                }
                bl = true;
            }
            _8w_0.cfr_renamed_0(bl);
        }
    }

    public _8Q(int n, int n2, int n3, long l2, int n4, _4r r, _9M m) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x5707919D5373L;
        long l5 = l3 ^ 0x5A0AF15CE550L;
        super(l4, n, n2, n3, m);
        this.cfr_renamed_4 = r;
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        _8Q.c("G", (Object)this, (Object)objectArray, -2943634755899651272L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8Q.b = l.a(9114525242545351216L, 1912483579924888010L, MethodHandles.lookup().lookupClass()).a(206502011819412L);
                _8Q.i = new Object[59];
                _8Q.j = new String[59];
                _8Q.b();
                _8Q.e = new HashMap<K, V>(13);
                var0 = _8Q.b ^ 22961026934297L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u001b\u001f\u00d6a\u00b8\u008e'\u0086\u001d`B\u00c0\u00e2\u00c5\u00e8V\u00e6\u00fc\u00df\u0004M1\u0086\u00d9m<Nv\u0002\u00e7\u0081A\u00d7\u00cc\u00ce\u0086\u00cd\u00b9\u00a83\u00f9\u00ae\u0093\u00bcZ\u00c5\u00f3\u00fbm\u0019R\u00e1*\u00d4.\u0086\u009a\u00e1\u00eb\u00c1\u00ddf\u0011.^J\u0001\b\u0011.5\u000b\u00bf\u0087\u0086\u001b\u00ab\u0006\u00c3\u00af!6\t\u00fad\u009f\u0084J";
                var7_6 = "\u001b\u001f\u00d6a\u00b8\u008e'\u0086\u001d`B\u00c0\u00e2\u00c5\u00e8V\u00e6\u00fc\u00df\u0004M1\u0086\u00d9m<Nv\u0002\u00e7\u0081A\u00d7\u00cc\u00ce\u0086\u00cd\u00b9\u00a83\u00f9\u00ae\u0093\u00bcZ\u00c5\u00f3\u00fbm\u0019R\u00e1*\u00d4.\u0086\u009a\u00e1\u00eb\u00c1\u00ddf\u0011.^J\u0001\b\u0011.5\u000b\u00bf\u0087\u0086\u001b\u00ab\u0006\u00c3\u00af!6\t\u00fad\u009f\u0084J".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00f5\u0087\u00de\u00a3oG]\u00b3\u0083\u0088\u0000\u00e8\\\u00a8\u00b6\u009d";
                    var7_6 = "\u00f5\u0087\u00de\u00a3oG]\u00b3\u0083\u0088\u0000\u00e8\\\u00a8\u00b6\u009d".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _8Q.c = var8_3;
        _8Q.d = new Integer[13];
        _8Q.cfr_renamed_1 = (int)_8Q.a("v", (int)22013, (long)(var0 ^ 7287816929191469695L));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 49;
            case 1 -> 37;
            case 2 -> 31;
            case 3 -> 32;
            case 4 -> 62;
            case 5 -> 47;
            case 6 -> 11;
            case 7 -> 36;
            case 8 -> 12;
            case 9 -> 28;
            case 10 -> 7;
            case 11 -> 17;
            case 12 -> 63;
            case 13 -> 35;
            case 14 -> 56;
            case 15 -> 52;
            case 16 -> 51;
            case 17 -> 5;
            case 18 -> 34;
            case 19 -> 29;
            case 20 -> 9;
            case 21 -> 53;
            case 22 -> 46;
            case 23 -> 58;
            case 24 -> 19;
            case 25 -> 23;
            case 26 -> 21;
            case 27 -> 25;
            case 28 -> 45;
            case 29 -> 48;
            case 30 -> 40;
            case 31 -> 14;
            case 32 -> 22;
            case 33 -> 0;
            case 34 -> 18;
            case 35 -> 15;
            case 36 -> 20;
            case 37 -> 10;
            case 38 -> 8;
            case 39 -> 41;
            case 40 -> 39;
            case 41 -> 30;
            case 42 -> 6;
            case 43 -> 54;
            case 44 -> 60;
            case 45 -> 13;
            case 46 -> 24;
            case 47 -> 42;
            case 48 -> 55;
            case 49 -> 50;
            case 50 -> 26;
            case 51 -> 4;
            case 52 -> 59;
            case 53 -> 43;
            case 54 -> 57;
            case 55 -> 1;
            case 56 -> 3;
            case 57 -> 44;
            case 58 -> 2;
            case 59 -> 38;
            case 60 -> 61;
            case 61 -> 33;
            case 62 -> 16;
            default -> 27;
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
        _8Q.j[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "_6\u001d\u0003\u000b\u007fB#\u001fB\u000e#\u0003d";
        objectArray[1] = "6\u0007\u0004\u0016#;C'\u000f\u00192t\")\u0004\u00126.V";
        objectArray[2] = Double.TYPE;
        _8Q.j[2] = "java/lang/Double";
        objectArray[3] = "td11@<iq3pE`(C";
        objectArray[4] = "\"[\f9mOW{\u00076|\u00006u\f=xZB";
        objectArray[5] = "\u0000{IE\f*\u001dnK\u0004\tvR+";
        objectArray[6] = "#T\u0017\u00139\u000e>A\u0015R<R~C";
        objectArray[7] = "e\u001bRTW\u0002x\u000eP\u0015R^9\t";
        objectArray[8] = Boolean.TYPE;
        _8Q.j[8] = "java/lang/Boolean";
        objectArray[9] = Integer.TYPE;
        _8Q.j[9] = "java/lang/Integer";
        objectArray[10] = "\u0001\t\u001d1\u0001Lt)\u0016>\u0010\u0003\u0015'\u001d5\u0014Ya";
        objectArray[11] = Void.TYPE;
        _8Q.j[11] = "java/lang/Void";
        objectArray[12] = "\u0013T<d\u0018k\u000eA>%\u001d7CC";
        objectArray[13] = "#*9\u0019\u0018\r(%(Ve\u0015;\"!\u001f";
        objectArray[14] = "`2>01L}'<q4\u00104\u001f";
        objectArray[15] = "Z\n\u001bix\u0005G\u001f\u0019(}Y\u000e.";
        objectArray[16] = "\u0017hMMzk\n}O\f\u007f7K\\";
        objectArray[17] = "|\u00065w\u0000Ca\u001376\u0005\u001f!*";
        objectArray[18] = "\u007f)Bvu1\n\tIyd~k\u0007Br`$\u001f";
        objectArray[19] = "[\u0012\u0001v\u0016bF\u0007\u00037\u0013>\f&";
        objectArray[20] = Long.TYPE;
        _8Q.j[20] = "java/lang/Long";
        objectArray[21] = "\b~\u0014t`[}^\u001f{q\u0014\u001cP\u0014puNh";
        objectArray[22] = "n6\u000e\f+\u0002s#\fM.^:a";
        objectArray[23] = "& \u0007Lq:S\u0000\fC`u2\u000e\u0007Hd/F";
        objectArray[24] = "-\"T3\u0007\r3*N|e\u001147";
        objectArray[25] = "~:JFbJc/H\u0007g\u0016.+";
        objectArray[26] = "Py$B\b\\%Y/M\u0019\u0013DW$F\u001dI0";
        objectArray[27] = "n\u001aA%Q2p\u0012[j63a\tV0\u00105";
        objectArray[28] = "8_TU O3PE\u001aAA8[A@";
        objectArray[29] = "c!2=`I~40|e\u00155";
        objectArray[30] = "\u001a\u0018zV|qo8qYm>\u000e6zRidz";
        objectArray[31] = "KJu\u0002!N>j~\r0\u0001_du\u00064[+";
        objectArray[32] = "TK\u001d\u001azL\u000f\\\u0010\u001c\u0014K,\"HK(\u0018\nMA\u0015)\u0019i\u001dT\u0016kK\u0015YA\u000eur";
        objectArray[33] = "G\f9\u0011p\\\u001c\u001b4\u0017\u001eRz[v\u0004fS\u0000\u000bw\u001cn";
        objectArray[34] = "S.&\u0001;IE,p9n.Z\u007fuS=AS!tR^\u0011F\"6\u0000\"US:(9";
        objectArray[35] = "\bGAQ^\u0017\fB\u0019\u00187\f\u0004\u0013}BP\u001a\u0019\u0014\u000f\u001c\t\n\u0005\u007f@R\u0006\u000e\u0004\u0016\u0002YO\u0015h";
        objectArray[36] = "r\u00182T/?,\u0004)WR$~\u0013?30%l\u0012(An||\u000eC";
        objectArray[37] = "\t\u001av\u0000(X@N{\u0002KFP\u0013+kzA\\\u001f'\u0011%\u001c]H";
        objectArray[38] = "_vOSG7\u000fjM\u00045p4~\u0013\u0005_/[wM\u0004^L\u000e Q\tQ+]wYY5";
        objectArray[39] = "Ac\u007f\\\u00027\u001eik\u0003b6}ti_Sp\u0013\"g\b\b\f@j(X\u000ee\u0002aaCb";
        objectArray[40] = "!z\b!\"th.\u0005#Amzq^Jpmt\u007fY0/0u(";
        objectArray[41] = " !\u0014,;46#B\u0014gkL/A(40#&\u001f)5Ss3\u001ckg/7&\u0004u^";
        objectArray[42] = "vTs\u0014tj(\\yGL7\u0018]3\u0011&owTm\u0010'\fx\u00005\\%~|\u0005m\u0015L";
        objectArray[43] = "\u0016,C\u001237\u0013+\\Q\u000buv/\u001b\u0014a,\u0019&E\u0015`OI3FW23\r&^I\u000b";
        objectArray[44] = "n\rSB!qj\b\u000b\u000bHbrX\u0015Z4dt5\u000eH9dsHPT\"g\u000e";
        objectArray[45] = "y\u001cc{NW:\fr~<YBB{!S\u0007y\u001dq5\f";
        objectArray[46] = "mG#hk16P.n\u00056P\u0013a2nc9Qj{u";
        objectArray[47] = "'\u007fM\u0004\u00013ycV\u0007|./\u007fz\u000e\f2F9NR\u0017\"/{E\u001b\fN";
        objectArray[48] = "l<O1>m7+B7PinUA%.+`/\u0011$6#";
        objectArray[49] = "\u0003}&\u001cYA\u000e\"-\f<A#@\u007fZ\u0006\u0003\u0005yr\u0005\r\u0013";
        objectArray[50] = "Jj~Wp`\u0005(a@O+{}xD2/\u0017.}E~";
        objectArray[51] = "h\u0017c=0;!Cn?S$\"\u001720:'XE,(+r\"\u0015-0#C";
        objectArray[52] = " :jO5Y68<wl>)k9\u001d3Q 58\u001cP\u0004v`b\u001c;\u0005v!}w";
        objectArray[53] = "Y(\u0014-;\u0003Qm\u0006+@F3$\tv+\u001dKm]{)";
        objectArray[54] = "?*\u001eK&*d=\u0013MH)\u0002#\u0016\u001c9}p'\u0013Dp";
        objectArray[55] = "\u001b\u0016@\"$}\u0006^U)O|wJ\u000em~-LWFxu";
        objectArray[56] = "3<m(YAh+`.7EnUc<I\u0007?/3=Q\u000f";
        objectArray[57] = "Z<\u001aB\rf\tk\u0012\u0012i8`bXN\u0003b\u000fk\u0006O\u0002\u0001Z<\u001aB\rf\tk\u0012\u0012i";
        Object[] objectArray2 = objectArray;
        objectArray[58] = "^x~6\flS'u&in= ~q\u00036R) p\u0002US)>tQ3\r!4'i";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8Q.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ba' || c == '\u00db' || c == 'K' || c == 'O') {
                field = _8Q.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ba' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8Q.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'G' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/8Q" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _8Q.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8Q.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8Q.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8Q.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8Q.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8Q.f(1999928262905006L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8Q.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8Q.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8Q.f(1999928262905006L, 0L);
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
            int n = _8Q.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _8Q.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _8Q.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8Q.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8Q.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8Q.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x739A;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8Q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8Q.d[n2] = n3;
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8Q.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _8Q.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _8Q.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8Q.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8Q.c(clazz3, string2, clazz2)) != null) {
                    _8Q.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8Q.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8Q.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8Q.f(1999928262905006L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public _8B dev_krypton_8B_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        long l3 = l2 ^ 0x4C39DE8CE68DL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n;
        objectArray2[1] = (int)_8Q.a("v", 32578, (long)(0x44C627921A0D0D04L ^ l2));
        objectArray2[0] = l3;
        return _8Q.c("\u00c5", (Object)objectArray2, 132154023210575878L, (long)l2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void cfr_renamed_409(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2;
        long l4 = l3 ^ 0x6F2CA144BE70L;
        long l5 = l3 ^ 0x468102376276L;
        long l6 = l3 ^ 0x341016A2FAAEL;
        long l7 = l3 ^ 0x4C3550DA5210L;
        CallSite callSite = _8Q.a("v", 19817, (long)(0x5ED6B26C10CF7D30L ^ l2));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = _8Q.c("\u00ba", (Object)this, -4340329901697356732L, (long)l2);
        ArrayList arrayList = new ArrayList(_8Q.c("G", (Object)_8Q.c("G", (Object)_8Q.c("K", -4340020548514288828L, (long)l2), (Object)objectArray2, -4339270956370575556L, (long)l2), (Object)objectArray3, -4340358830188616251L, (long)l2));
        CallSite callSite2 = _8Q.c("G", arrayList, -4340788487410091147L, (long)l2);
        boolean bl = _8w_0.cfr_renamed_4();
        while (_8Q.c("G", (Object)callSite2, -4340734352692819666L, (long)l2) != false) {
            void var13_8;
            _6x_0 x_0 = (_6x_0)((Object)_8Q.c("G", (Object)callSite2, -4341395861136510184L, (long)l2));
            _4t t = new _4t(this, x_0, l7, (int)var13_8);
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = true;
            objectArray4[0] = l6;
            _8Q.c("G", (Object)t, (Object)objectArray4, -4340459942973207381L, (long)l2);
            _8Q.c("G", (Object)_8Q.c("\u00ba", (Object)this, -4340068620495951367L, (long)l2), (Object)t, -4341006837707906504L, (long)l2);
            var13_8 += 30;
            if (!bl) continue;
        }
    }

    private static void cfr_renamed_6(long l2, _87 var2_1, String string, int n, int n2, _8B b, String string2, int n3) {
        long l3 = l2 = _8Q.b ^ l2;
        long l4 = l3 ^ 0x3D556E21DF0BL;
        long l5 = l3 ^ 0x6785A875CE24L;
        long l6 = l3 ^ 0x16E087FFBD24L;
        Object[] objectArray = new Object[5];
        objectArray[4] = new _8B(0, 0, l5, 0, (int)_8Q.a("v", 20493, (long)(0x5082EC200EFAFE8L ^ l2)));
        objectArray[3] = (double)(n2 + 1);
        objectArray[2] = (double)(n + 1);
        objectArray[1] = string;
        objectArray[0] = l4;
        _8Q.c("G", (Object)var2_1, (Object)objectArray, -8325093074742841300L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = _8Q.c("G", (Object)b, (Object)objectArray2, -8325998958808676794L, (long)l2);
        objectArray3[3] = (double)n2;
        objectArray3[2] = (double)n;
        objectArray3[1] = string;
        objectArray3[0] = l4;
        _8Q.c("G", (Object)var2_1, (Object)objectArray3, -8325093074742841300L, (long)l2);
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = new _8B((int)_8Q.a("v", 8852, (long)(0x1281EB9CDE55D76L ^ l2)), (int)_8Q.a("v", 15762, (long)(0x53BE22C7C50F4274L ^ l2)), l5, (int)_8Q.a("v", 15762, (long)(0x53BE22C7C50F4274L ^ l2)), (int)_8Q.a("v", 2211, (long)(0x39208F50C0D3F740L ^ l2)));
        objectArray4[3] = (double)n2;
        objectArray4[2] = (double)n3;
        objectArray4[1] = string2;
        objectArray4[0] = l4;
        _8Q.c("G", (Object)var2_1, (Object)objectArray4, -8325093074742841300L, (long)l2);
    }

    @Override
    public int int_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8Q.a("v", 19817, (long)(0x5ED6F6BCD55BD2B5L ^ l2));
    }

    public _4r dev_krypton_4r_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return _8Q.c("\u00ba", (Object)this, -5904741473076395634L, (long)l2);
    }

    @Override
    protected int int_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_8Q.a("v", 690, (long)(0x207A440C4AB7189L ^ l2));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8Q.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8Q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

