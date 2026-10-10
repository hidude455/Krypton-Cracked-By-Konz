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
import dev.krypton._6x_0;
import dev.krypton._7C;
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

public class _5U
extends _6x_0 {
    private final _9j_0 cfr_renamed_350;
    private final _92 cfr_renamed_4;
    private final _9r cfr_renamed_0;
    private final _92 cfr_renamed_6;
    private final _9r cfr_renamed_7;
    private boolean cfr_renamed_9;
    private boolean cfr_renamed_8;
    private int cfr_renamed_3;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_315(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5U.c("\u00fd", (Object)this, (int)_5U.a("n", 25732, (long)(0x2DB14F1362569408L ^ l2)), 3148113926237139922L, (long)l2);
        _5U.c("\u00fd", (Object)this, (int)_5U.a("n", 18125, (long)(0x456450906375B647L ^ l2)), 3148882484460488941L, (long)l2);
        _5U.c("\u00fd", (Object)this, (int)_5U.a("n", 7479, (long)(0x708CFA4FAABFEDB9L ^ l2)), 3148741295837973203L, (long)l2);
        _5U.c("\u00fd", (Object)this, (boolean)_5U.a("n", 7479, (long)(0x708CFA4FAABFEDB9L ^ l2)), 3148197635164119136L, (long)l2);
        _5U.c("\u00fd", (Object)this, (boolean)_5U.a("n", 7479, (long)(0x708CFA4FAABFEDB9L ^ l2)), 3149481512973034436L, (long)l2);
    }

    private void cfr_renamed_316(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block4: {
            block5: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = b ^ l4;
                l3 = l5 ^ 0x5D6FE2B78023L;
                long l6 = l5 ^ 0x586B9271338AL;
                l2 = l5 ^ 0x1911CA4563A6L;
                int n = _7C.cfr_renamed_3();
                try {
                    try {
                        callSite = _5U.c("t", (Object)this, -4738404914943287460L, (long)l4);
                        if (n != 0) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        if (callSite >= _5U.c("\u00df", (Object)_5U.c("t", (Object)this, -4738172299053441649L, (long)l4), (Object)objectArray2, -4745276497551532276L, (long)l4)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5U.a(matchException);
                    }
                    _5U u = this;
                    _5U.c("\u00fd", (Object)u, (int)(_5U.c("t", (Object)u, -4738404914943287460L, (long)l4) + true), -4738404914943287460L, (long)l4);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5U.a(matchException);
                }
            }
            callSite = _5U.c("t", (Object)this, -4738060874638252451L, (long)l4);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        _5U.c("\u00c9", (Object)objectArray3, -4745317843014849303L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        _5U.c("\u00df", (Object)this, (Object)objectArray4, -4740024098560206731L, (long)l4);
    }

    public _5U(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x732538696D45L;
        long l5 = l3 ^ 0x63450AA014D6L;
        long l6 = l3 ^ 0x5958D1B81414L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x251DAF2AE52CL;
        long l9 = l3 ^ 0x3ADD3C0E0A5EL;
        long l10 = l3 ^ 0x15EDE91F9A71L;
        int n2 = (int)(l10 >>> 32);
        int n3 = (int)(l10 << 32 >>> 56);
        int n4 = (int)(l10 << 40 >>> 40);
        long l11 = l3 ^ 0x7069FEDC8188L;
        super((int)_5U.a("n", 16123, (long)(0x1EF25EC28F68A9CFL ^ l2)), -1, (_4r)((Object)_5U.c("Q", 5480863055435569241L, (long)l2)), l8);
        this.cfr_renamed_350 = new _9j_0((int)_5U.a("n", 20837, (long)(0x5C8DE69C0D4AC655L ^ l2)), n2, (byte)n3, -1, n4, false);
        this.cfr_renamed_4 = new _92((int)_5U.a("n", 18491, (long)(0x3293AA36D8E4DF02L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_0 = new _9r((int)_5U.a("n", 11598, (long)(0x19C6D17F150EBA75L ^ l2)), true, l4);
        this.cfr_renamed_6 = new _92((int)_5U.a("n", 30347, (long)(0x649E3AD8D2CF61B1L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_7 = new _9r((int)_5U.a("n", 4183, (long)(0x3658A6B6D3AA8761L ^ l2)), false, l4);
        CallSite callSite = _5U.c("t", (Object)this, 5479991128838909885L, (long)l2);
        CallSite callSite2 = _5U.c("t", (Object)this, 5479378755539375361L, (long)l2);
        _5U.c("\u00c9", (Object)callSite2, 5479487544702937578L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l11);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5U.c("\u00df", (Object)callSite, (Object)objectArray, 5479547244316128673L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5U.c("t", (Object)this, 5480584856980512266L, (long)l2), _5U.c("t", (Object)this, 5479760910796456085L, (long)l2), _5U.c("t", (Object)this, 5479378755539375361L, (long)l2), _5U.c("t", (Object)this, 5479991128838909885L, (long)l2), _5U.c("t", (Object)this, 5480461273216596841L, (long)l2)};
        objectArray2[0] = l9;
        _5U.c("\u00df", (Object)this, (Object)objectArray2, 5479829462171211305L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5U.class, 2);
                _5U.b = l.a(4825934382276502864L, 8928279780404156725L, MethodHandles.lookup().lookupClass()).a(161719848172276L);
                _5U.j = new Object[67];
                _5U.k = new String[67];
                _5U.b();
                _5U.f = new HashMap<K, V>(13);
                var0 = _5U.b ^ 34039801966594L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u001a}\u00a7r\u00f3\u000e\u00cc\u00ce\u008b\u00c4\u00abW0(\u0007i6O&\u00d9\u0000\u00a0\u0002\u00fb\u00bey\u00f5\u009e\u000f4~ob\u009f\u00a6[$\u00a6d\u00d5\u00b5\u0090\u009c\u00bdt\\\u00c8\t\u00fdb\t\u00c0a`SBk\u00eae\u00be\u00b7!\u0013>T\u0081\u00f07},\u0084)";
                var7_6 = "\u001a}\u00a7r\u00f3\u000e\u00cc\u00ce\u008b\u00c4\u00abW0(\u0007i6O&\u00d9\u0000\u00a0\u0002\u00fb\u00bey\u00f5\u009e\u000f4~ob\u009f\u00a6[$\u00a6d\u00d5\u00b5\u0090\u009c\u00bdt\\\u00c8\t\u00fdb\t\u00c0a`SBk\u00eae\u00be\u00b7!\u0013>T\u0081\u00f07},\u0084)".length();
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
                    var6_5 = "\u0003\u00b4a\u00b1\f)EFf\u009b/B\u008a#ca";
                    var7_6 = "\u0003\u00b4a\u00b1\f)EFf\u009b/B\u008a#ca".length();
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
        _5U.d = var8_3;
        _5U.e = new Integer[11];
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
            case 0 -> 17;
            case 1 -> 45;
            case 2 -> 33;
            case 3 -> 49;
            case 4 -> 43;
            case 5 -> 53;
            case 6 -> 59;
            case 7 -> 25;
            case 8 -> 42;
            case 9 -> 47;
            case 10 -> 54;
            case 11 -> 51;
            case 12 -> 26;
            case 13 -> 1;
            case 14 -> 8;
            case 15 -> 30;
            case 16 -> 13;
            case 17 -> 4;
            case 18 -> 41;
            case 19 -> 21;
            case 20 -> 6;
            case 21 -> 46;
            case 22 -> 63;
            case 23 -> 22;
            case 24 -> 36;
            case 25 -> 15;
            case 26 -> 48;
            case 27 -> 10;
            case 28 -> 23;
            case 29 -> 5;
            case 30 -> 50;
            case 31 -> 24;
            case 32 -> 52;
            case 33 -> 18;
            case 34 -> 16;
            case 35 -> 37;
            case 36 -> 62;
            case 37 -> 7;
            case 38 -> 44;
            case 39 -> 0;
            case 40 -> 9;
            case 41 -> 20;
            case 42 -> 56;
            case 43 -> 40;
            case 44 -> 27;
            case 45 -> 35;
            case 46 -> 55;
            case 47 -> 14;
            case 48 -> 3;
            case 49 -> 12;
            case 50 -> 38;
            case 51 -> 2;
            case 52 -> 57;
            case 53 -> 58;
            case 54 -> 31;
            case 55 -> 32;
            case 56 -> 61;
            case 57 -> 28;
            case 58 -> 34;
            case 59 -> 39;
            case 60 -> 19;
            case 61 -> 11;
            case 62 -> 60;
            default -> 29;
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
        _5U.k[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5U.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u0003\bwM+;\u001e\u001du\f.gR8";
        objectArray[1] = Integer.TYPE;
        _5U.k[1] = "java/lang/Integer";
        objectArray[2] = Boolean.TYPE;
        _5U.k[2] = "java/lang/Boolean";
        objectArray[3] = "\u0016\u0005&[|\"\u000b\u0010$\u001ay~KU";
        objectArray[4] = "$4&};\u0011Q\u0014-r*^0\u001a&y.\u0004D";
        objectArray[5] = "\r.\u001d?f\u0018\u0010;\u001f~cD]9";
        objectArray[6] = "\r\tag9N\u0010\u001cc&<\u0012P\u001e";
        objectArray[7] = "$NcL)\u00149[a\r,HyA";
        objectArray[8] = "\u001a3%\u0016q\u001f\u0007&'WtCGd";
        objectArray[9] = "8\\+%qT%I)dt\bjA";
        objectArray[10] = "WXll_\u000f\"xgcN@CvlhJ\u001a7";
        objectArray[11] = Void.TYPE;
        _5U.k[11] = "java/lang/Void";
        objectArray[12] = "6\u0013\u000eMA!(\u001b\u0014\u0002 66\u0017\u001bX\u001c";
        objectArray[13] = "\b.\u0014Y\u001c3\u0003!\u0005\u0016}=\b*\u0001L";
        objectArray[14] = "=\u0000\\\u001aDUH W\u0015U\u001a).\\\u001eQ@]";
        objectArray[15] = "b\u0016\u0005\u0012\r\\\u00176\u000e\u001d\u001c\u0013v8\u0005\u0016\u0018I\u0002";
        objectArray[16] = "LQ\u0001\u00070\u0000QD\u0003F5\\\u0010N";
        objectArray[17] = ",.\u0000c~.Y\u000e\u000bloa8\u0000\u0000gk;L";
        objectArray[18] = "Ruy\u0013\"7RunO.8H>nQ.-OO<\u000byo";
        objectArray[19] = "l<V\u007f\u0013vl<A#\u001fyvwA=\u001flq\u0006\u0013iN-";
        objectArray[20] = "u\no/[Tu\nxsW[oAxmWNh0*6\u000f\u000f";
        objectArray[21] = "\u0005\u007fuqj\u0019p_~~{V\u0011Quu\u007f\fe";
        objectArray[22] = Long.TYPE;
        _5U.k[22] = "java/lang/Long";
        objectArray[23] = "\fU>\u000b\u00166\fU)W\u001a9\u0016\u001e)I\u001a,\u0011oy\u0014K";
        objectArray[24] = "wX\f~l3wX\u001b\"`<m\u0013\u001b<`)jbOd7";
        objectArray[25] = "wDH4\u007f\u0017wD_hs\u0018m\u000f_vs\rj~\b)%";
        objectArray[26] = "\u0001OZPKmtoQ_Z\"\u0015aZT^xa";
        objectArray[27] = "5\u001e6`J)5\u001e!<F&/U!\"F3($s|\u0011x";
        objectArray[28] = "\u001dqc8<<\u001dqtd03\u0007:tz0&\u0000K!%g";
        objectArray[29] = "<\u0003r+\u0018X<\u0003ew\u0014W&Hei\u0014B!977C\b";
        objectArray[30] = "Y{(\u0004q(,[#\u000b`gMU(\u0000d=9";
        objectArray[31] = "[Y\u0004d\n\tFL\u0006%\u000fU\u0006w";
        objectArray[32] = "\u000e\\$E\u0017c{|/J\u0006,\u001ar$A\u0002vn";
        objectArray[33] = "\r)1<\u000f>\r)&`\u00031\u0017b&~\u0003$\u0010\u0013t$W`";
        objectArray[34] = "G6\u001c}}DN%\u001cL2#O X nR\u0010p\u0016'";
        objectArray[35] = "L!\u000bzpcI\"\b\"\u0014\u001f6\u0018%C/8\u0012z\nz*;\u0011\"";
        objectArray[36] = "?\u0014F\"bC6\u0007F\u0013)$7\u0002\u0002\u007fqUhRLx";
        objectArray[37] = "gE\u001f\u0011\u0013-uY\u0018\u0014-/a\\\u0002\u0015A\u001d2\u001f_I\u0017J5L]\u001eO;j\u001c\u0013\u0019-";
        objectArray[38] = "8>\u001ddOY1-\u001dU\u0002>5/\n6T@l\u007f\u0017o";
        objectArray[39] = "24!(|\u0001;'!\u0019=\f\u0003skcm\u0002?!\"gh";
        objectArray[40] = "T-,7wmG\"3-J|Y&+ \u001d\"\u0006psL'yJp$.qj\u0004$";
        objectArray[41] = "+#\u0017,\bF\"0\u0017\u001dH!#5Sq\u001bP|e\u001dv";
        objectArray[42] = "c.W7z)j=W\u00064Nk-T`4-<mRw";
        objectArray[43] = "\u000eU]-Q!\\\u001cY(5#3\u0001L#OzU\u001aC(\b\u001d\n\b\u0018!WlUXV&5";
        objectArray[44] = "*Ajk\u001f0#RjZVW&Yh\"Q9gIn7";
        objectArray[45] = "k\nJ\u0018cO?\rM\u0011\fOU\t\\Nv\u00113\u0012SE1veWY\u0019~\u001c;\u0005\f_\f";
        objectArray[46] = "DnB\\\u0004/\u001d>_\u0005nkxkO\\\u0005a\u0016uQA\tQA|VYQ2\u0016<PNn";
        objectArray[47] = "4\u0014_ASr=\u0007_p\u0019\u00158\f]\b\u001d{y\u001c[\u001d";
        objectArray[48] = "\u0003Q_\fnINQ\\\u000e\u0014L^FS\u0017n[uXH0iRW?\u001f\u001drY\rZGJmZ3\u000eE\u0010{\bVV\u0012\u000fx6";
        objectArray[49] = "QL\u001bM%\u0018\tG\u0003BKBk\u0018\u0014H1\u0019\r\u0003\u001bCv~QL\u001bM%\u0018\tG\u0003BK";
        objectArray[50] = "i:(\u001b#\nt:yD^_gk%O\t\b9<}#1@8j=\u0012c\u0000~x";
        objectArray[51] = "(\u0012q=QP5\u0012 b,\u0005&C|i{Rx\u0013%\u0005L\bvG|dR\b\"M";
        objectArray[52] = "\u0011c \u00021:\u0005>7]\\f{;3]&<\u001d <Va[B' Uc8\u0015g&B\\";
        objectArray[53] = "#\u0005Z\u0005?U*\u0016Z4px\u0012\u001aJZ4Ut\u0001EQs2\"DO\r<X|\u0016\u001aKN";
        objectArray[54] = "-9N\\\u0007=$*NmFZ (Y\u000e\u001c$yxDW";
        objectArray[55] = "\u001a\u001a\n\f\u001c~N\u001d\r\u0005s~$\u0013K]K:\u001f\u000eK\f\u0014";
        objectArray[56] = "#nGSV%?rX\u001222#xF\u0007ear-\u0012kS''-F\u0012O;8l";
        objectArray[57] = "nKQ8\u000e~sK\u0000gs+`\u001a\\l$|>I\u0001\u0000\u0011 y\u0013Ti\u000e/mI";
        objectArray[58] = "\u001d{0\u0004\u0013j\u001cgk\u000ecc\u0013\u007f`\u001b\u000fQD8>B^\u0006Gzx\u001a\\e\u0010:~\rc";
        objectArray[59] = "jbC;5@cqC\nzn[}Sd>@=f\\oy'k#V36M5q\u0003uD";
        objectArray[60] = "cg\u0006\u000bv\u0012jt\u0006::ukd\u0005\\8\u0016<$\u0003K";
        objectArray[61] = "VXOD\u0005!\u0004\u0018\tVyuTU\u0011O\u0015G\u0007\u0010I\u0014yqBLIL\u0000m^S\b(I+W\u0010\u0003B\u0017y\u0002Vq";
        objectArray[62] = "c7/v\u0013I1wido\u001da:q}\u0003/7\u007f,&_xg#lyQ\u001fu?k|o";
        objectArray[63] = "E}\u0012ryAPa\u00172\u0005\b!|\u001dm\u007f_Gg\u0012f88\u0018`\u000ee:[O \br\u0005";
        objectArray[64] = "N\u0000Q/\rW\u000f\u0010W:2\u0004s\u0007C9H^\u0015\u001cL2\u000f9J\u000e\u0017;PH\u0015^Y<2";
        objectArray[65] = "R\u0003\t\u0018dQF^\u001eG\t\b8[\u001aGsW^@\u0015L40\b\u0005\u001f\u0010{ZVWJV\t";
        Object[] objectArray2 = objectArray;
        objectArray[66] = "\u0019YKP >\u0006V_\nL2\u0016@SS \u0000A\r\n\u0005L1\u0012_\\\n|>\u001c\u0002^4-,\u001e\u0004WM10\u0001E3W4g\u0003L_V(<\t<";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 't' || c == '\u00fd' || c == 'Q' || c == '\u00e5') {
                field = _5U.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fd' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5U.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5U.e(l2, l3);
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
                clazz3 = _5U.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5U.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5U.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5U.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5U.f(949730533418101L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5U.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5U.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5U.f(949730533418101L, 0L);
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
            int n = _5U.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5U.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5U.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5U.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5U.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5U.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5U.a(n, l2);
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
            throw new RuntimeException("dev/krypton/5U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5B34;
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
                throw new RuntimeException("dev/krypton/5U", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5U.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _5U.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5U.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5U.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5U.c(clazz3, string2, clazz2)) != null) {
                    _5U.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5U.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5U.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5U.f(949730533418101L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_4(_9o o) {
        block47: {
            _5U u;
            long l2;
            long l3;
            block57: {
                CallSite callSite;
                int n;
                long l4;
                block51: {
                    long l5;
                    block52: {
                        _5U u2;
                        block56: {
                            block54: {
                                CallSite callSite2;
                                block55: {
                                    block53: {
                                        block50: {
                                            Object object;
                                            block48: {
                                                long l6;
                                                long l7;
                                                block49: {
                                                    block46: {
                                                        block44: {
                                                            block45: {
                                                                _5U u3;
                                                                long l8;
                                                                long l9;
                                                                block42: {
                                                                    block43: {
                                                                        long l10 = l3 = b ^ 0x38462188D20BL;
                                                                        l9 = l10 ^ 0x29F0C8C300DEL;
                                                                        l8 = l10 ^ 0x6E040A79635FL;
                                                                        l4 = l10 ^ 0x6473C6FF6C3EL;
                                                                        l7 = l10 ^ 0x7B5AC01AA99DL;
                                                                        l2 = l10 ^ 0x3A20982EF9B1L;
                                                                        l5 = l10 ^ 0x24D8CC59E9ADL;
                                                                        l6 = l10 ^ 0x5E9519020D98L;
                                                                        n = _7C.cfr_renamed_3();
                                                                        try {
                                                                            try {
                                                                                u3 = this;
                                                                                if (n != 0) break block42;
                                                                                if (_5U.c("t", (Object)_5U.c("t", (Object)u3, 2607480168577182157L, (long)l3), 2607162386258756770L, (long)l3) == null) break block43;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5U.a(matchException);
                                                                            }
                                                                            return;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5U.a(matchException);
                                                                        }
                                                                    }
                                                                    u3 = this;
                                                                }
                                                                try {
                                                                    try {
                                                                        Object[] objectArray = new Object[1];
                                                                        objectArray[0] = l9;
                                                                        Object[] objectArray2 = new Object[2];
                                                                        objectArray2[1] = l8;
                                                                        objectArray2[0] = (int)_5U.c("\u00df", (Object)_5U.c("t", (Object)u3, 2606359684427298351L, (long)l3), (Object)objectArray, 2605501418179938451L, (long)l3);
                                                                        callSite = _5U.c("\u00c9", (Object)objectArray2, 2606921486744072813L, (long)l3);
                                                                        if (n != 0) break block44;
                                                                        if (callSite == false) break block45;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5U.a(matchException);
                                                                    }
                                                                    _5U.c("\u00fd", (Object)this, (boolean)_5U.a("n", 29102, (long)(0x7DED4A7AA20F0EB9L ^ l3)), 2605570375854370808L, (long)l3);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5U.a(matchException);
                                                                }
                                                            }
                                                            callSite = _5U.c("t", (Object)this, 2605570375854370808L, (long)l3);
                                                        }
                                                        try {
                                                            try {
                                                                if (n != 0) break block46;
                                                                if (callSite == false) break block47;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5U.a(matchException);
                                                            }
                                                            callSite = _5U.c("t", (Object)this, 2605373674930912330L, (long)l3);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5U.a(matchException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            object = -1;
                                                            if (n != 0) break block48;
                                                            if (callSite != object) break block49;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5U.a(matchException);
                                                        }
                                                        _5U.c("\u00fd", (Object)this, (int)_5U.c("\u00df", (Object)_5U.c("\u00df", (Object)_5U.c("t", (Object)_5U.c("t", (Object)this, 2607480168577182157L, (long)l3), 2607271323196903195L, (long)l3), 2607016504200599712L, (long)l3), 2606236636772877129L, (long)l3), 2605373674930912330L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5U.a(matchException);
                                                    }
                                                }
                                                try {
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = _5U.c("Q", 2605414336638567865L, (long)l3);
                                                    objectArray[0] = l6;
                                                    _5U.c("\u00c9", (Object)objectArray, 2607393093190133668L, (long)l3);
                                                    callSite = _5U.c("t", (Object)this, 2606298364069644149L, (long)l3);
                                                    if (n != 0) break block50;
                                                    Object[] objectArray3 = new Object[1];
                                                    objectArray3[0] = l7;
                                                    object = _5U.c("\u00df", (Object)_5U.c("t", (Object)this, 2605703138302060720L, (long)l3), (Object)objectArray3, 2608225317906924827L, (long)l3);
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5U.a(matchException);
                                                }
                                            }
                                            try {
                                                if (callSite < object) {
                                                    _5U u4 = this;
                                                    _5U.c("\u00fd", (Object)u4, (int)(_5U.c("t", (Object)u4, 2606298364069644149L, (long)l3) + true), 2606298364069644149L, (long)l3);
                                                    return;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw _5U.a(matchException);
                                            }
                                            callSite = _5U.c("t", (Object)this, 2606820976541887580L, (long)l3);
                                        }
                                        try {
                                            if (n != 0) break block51;
                                            if (callSite != false) break block52;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5U.a(matchException);
                                        }
                                        CallSite callSite3 = _5U.c("\u00df", (Object)_5U.c("t", (Object)_5U.c("t", (Object)this, 2607480168577182157L, (long)l3), 2606497857864969409L, (long)l3), (Object)_5U.c("t", (Object)_5U.c("t", (Object)this, 2607480168577182157L, (long)l3), 2607271323196903195L, (long)l3), (Object)_5U.c("Q", 2606586237263088087L, (long)l3), 2608418820887350861L, (long)l3);
                                        try {
                                            try {
                                                callSite2 = _5U.c("\u00df", (Object)callSite3, 2606720656071504110L, (long)l3);
                                                if (n != 0) break block53;
                                                if (callSite2 == false) break block54;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5U.a(matchException);
                                            }
                                            callSite2 = _5U.c("\u00df", (Object)callSite3, 2606720656071504110L, (long)l3);
                                        }
                                        catch (MatchException matchException) {
                                            throw _5U.a(matchException);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (n != 0) break block55;
                                                if (callSite2 == false) break block54;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5U.a(matchException);
                                            }
                                            u2 = this;
                                            if (n != 0) break block56;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5U.a(matchException);
                                        }
                                        callSite2 = _5U.c("\u00df", (Object)_5U.c("t", (Object)u2, 2606412985083188044L, (long)l3), (long)l5, 2605881794979635676L, (long)l3);
                                    }
                                    catch (MatchException matchException) {
                                        throw _5U.a(matchException);
                                    }
                                }
                                try {
                                    if (callSite2 == false) {
                                        _5U.c("\u00df", (Object)_5U.c("t", (Object)_5U.c("t", (Object)this, 2607480168577182157L, (long)l3), 2607271323196903195L, (long)l3), (Object)_5U.c("Q", 2606586237263088087L, (long)l3), 2606751539789127487L, (long)l3);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _5U.a(matchException);
                                }
                            }
                            u2 = this;
                        }
                        _5U.c("\u00fd", (Object)u2, (boolean)_5U.a("n", 15301, (long)(0x6F97F3AC51B1C4D5L ^ l3)), 2606820976541887580L, (long)l3);
                    }
                    try {
                        u = this;
                        if (n != 0) break block57;
                        callSite = _5U.c("\u00df", (Object)_5U.c("t", (Object)u, 2607581174737567012L, (long)l3), (long)l5, 2605881794979635676L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5U.a(matchException);
                    }
                }
                try {
                    block58: {
                        try {
                            if (callSite == false) break block58;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _5U.c("\u00df", (Object)this, (Object)objectArray, 2606666871633429392L, (long)l3);
                            if (n == 0) break block47;
                        }
                        catch (MatchException matchException) {
                            throw _5U.a(matchException);
                        }
                    }
                    u = this;
                }
                catch (MatchException matchException) {
                    throw _5U.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _5U.c("\u00df", (Object)u, (Object)objectArray, 2607353301316698722L, (long)l3);
        }
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5U.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

