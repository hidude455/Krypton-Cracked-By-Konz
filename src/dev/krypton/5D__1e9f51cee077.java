/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_4174
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
import dev.krypton.l;
import dev.krypton.mixin._8E;
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
import net.minecraft.class_4174;

public class _5D
extends _6x_0 {
    private static final int cfr_renamed_0;
    private static final int cfr_renamed_7;
    private final _92 cfr_renamed_3;
    private final _92 cfr_renamed_2;
    public boolean cfr_renamed_8;
    private int cfr_renamed_9;
    private int cfr_renamed_1;
    private int cfr_renamed_4;
    private int cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    private void cfr_renamed_275(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l2 = b ^ l2;
        _5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)_5D.c("i", (Object)this, 2129923421599058182L, (long)l2), 2129470250244574730L, (long)l2), 2129904625268601775L, (long)l2), (boolean)bl, 2128813345774959854L, (long)l2);
    }

    private void cfr_renamed_255(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x7793519A8B8L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = n;
        _5D.c("\u00f5", (Object)objectArray2, -7584392939228263156L, (long)l2);
        _5D.c("\u00de", (Object)this, (int)n, -7592516058587966733L, (long)l2);
    }

    private void cfr_renamed_189(Object[] objectArray) {
        _5D d;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                long l3 = l2 = b ^ l2;
                long l4 = l3 ^ 0x2A4EA591F78L;
                long l5 = l3 ^ 0x7183CB569457L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l5;
                objectArray2[0] = (int)_5D.c("i", (Object)this, 3535546181718504770L, (long)l2);
                _5D.c("\u00ca", (Object)this, (Object)objectArray2, 3537506801091079539L, (long)l2);
                int n = _7C.cfr_renamed_9();
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = true;
                objectArray3[0] = l4;
                _5D.c("\u00ca", (Object)this, (Object)objectArray3, 3536922421244742180L, (long)l2);
                int n2 = n;
                try {
                    try {
                        d = this;
                        if (n2 == 0) break block4;
                        if (_5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)d, 3535694507838694808L, (long)l2), 3536166487294933738L, (long)l2), 3536790194647154872L, (long)l2) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5D.a(matchException);
                    }
                    ((_8E)((Object)_5D.c("i", (Object)this, 3535694507838694808L, (long)l2))).invokeDoItemUse();
                }
                catch (MatchException matchException) {
                    throw _5D.a(matchException);
                }
            }
            d = this;
        }
        _5D.c("\u00de", (Object)d, (boolean)_5D.a("v", 27338, (long)(0x5651330E40E8EAA8L ^ l2)), 3537395202766427683L, (long)l2);
    }

    private void cfr_renamed_153(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x4BAB6105E6EAL;
        _5D.c("\u00de", (Object)this, (int)_5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)this, -2009367263757553516L, (long)l2), -2008894751667769370L, (long)l2), -2009171626167497011L, (long)l2), -2010129780857457141L, (long)l2), -2009025433777805811L, (long)l2);
        _5D.c("\u00de", (Object)this, (int)_5D.a("v", 16223, (long)(0x61EF96DF7F8B6A3BL ^ l2)), -2016723839270873622L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _5D.c("\u00ca", (Object)this, (Object)objectArray2, -2009779914029809892L, (long)l2);
    }

    public _5D(int n, int n2, byte by) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        long l4 = l3 ^ 0x54DF6BDF482CL;
        long l5 = l3 ^ 0x1287CE55B9D6L;
        long l6 = l3 ^ 0xD475D7156A4L;
        super((int)_5D.a("v", 31982, (long)(0x6BE4715910C4DD66L ^ l2)), -1, (_4r)((Object)_5D.c("C", 1221682500125494440L, (long)l2)), l5);
        this.cfr_renamed_3 = new _92((int)_5D.a("v", 32300, (long)(0xE52129A2B285FA0L ^ l2)), 0.0, l4, 19.0, 17.0, 1.0);
        this.cfr_renamed_2 = new _92((int)_5D.a("v", 17696, (long)(0x2B2414192C9164ABL ^ l2)), 0.0, l4, 19.0, 19.0, 1.0);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5D.c("i", (Object)this, 1221498711390294683L, (long)l2), _5D.c("i", (Object)this, 1221166762660556297L, (long)l2)};
        objectArray[0] = l6;
        _5D.c("\u00ca", (Object)this, (Object)objectArray, 1222412562173237357L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5D.class, 62);
                _5D.b = l.a(4351552864066649681L, 4485152312718507974L, MethodHandles.lookup().lookupClass()).a(172615463548604L);
                _5D.j = new Object[68];
                _5D.k = new String[68];
                _5D.b();
                _5D.f = new HashMap<K, V>(13);
                var0 = _5D.b ^ 34322837685501L;
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
                var6_5 = "\u0080!\u00d2\u00f8T\u0096\u0093 o\u00f9\u000f\u0093\u00d1\u00db\u009b]\u008e%2\u009d\u00147\u00d9\u0016\u0005\u0095\u009f\u00a1$\u00e2\u0083\u00ae]\u00f4`\u0087T\u00fbwx\u0097\u0092\u00a5\u009c\u00b7^t\u00b5\u00a7\u00f0V\u00bf\u009c0\u008c\u0092\u00b8\u00d4o.\u000e\u007f;\u00c1s\u009am\u00dc\u00f7}\u00e6\u00e2";
                var7_6 = "\u0080!\u00d2\u00f8T\u0096\u0093 o\u00f9\u000f\u0093\u00d1\u00db\u009b]\u008e%2\u009d\u00147\u00d9\u0016\u0005\u0095\u009f\u00a1$\u00e2\u0083\u00ae]\u00f4`\u0087T\u00fbwx\u0097\u0092\u00a5\u009c\u00b7^t\u00b5\u00a7\u00f0V\u00bf\u009c0\u008c\u0092\u00b8\u00d4o.\u000e\u007f;\u00c1s\u009am\u00dc\u00f7}\u00e6\u00e2".length();
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
                    var6_5 = "\u00c6\u00eb\u00c36\u0095\u0011-\u0011\u00cc\u0013\u00ce\u00f7\u00ff\b\u008f\f";
                    var7_6 = "\u00c6\u00eb\u00c36\u0095\u0011-\u0011\u00cc\u0013\u00ce\u00f7\u00ff\b\u008f\f".length();
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
        _5D.d = var8_3;
        _5D.e = new Integer[11];
        _5D.cfr_renamed_7 = (int)_5D.a("v", (int)28586, (long)(var0 ^ 8975988725741627854L));
        _5D.cfr_renamed_0 = (int)_5D.a("v", (int)15204, (long)(var0 ^ 5518119737022774539L));
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
            case 0 -> 34;
            case 1 -> 55;
            case 2 -> 48;
            case 3 -> 43;
            case 4 -> 63;
            case 5 -> 44;
            case 6 -> 53;
            case 7 -> 19;
            case 8 -> 8;
            case 9 -> 2;
            case 10 -> 40;
            case 11 -> 24;
            case 12 -> 23;
            case 13 -> 49;
            case 14 -> 0;
            case 15 -> 4;
            case 16 -> 26;
            case 17 -> 56;
            case 18 -> 37;
            case 19 -> 22;
            case 20 -> 21;
            case 21 -> 28;
            case 22 -> 3;
            case 23 -> 30;
            case 24 -> 33;
            case 25 -> 61;
            case 26 -> 36;
            case 27 -> 39;
            case 28 -> 5;
            case 29 -> 35;
            case 30 -> 45;
            case 31 -> 47;
            case 32 -> 59;
            case 33 -> 54;
            case 34 -> 12;
            case 35 -> 32;
            case 36 -> 9;
            case 37 -> 10;
            case 38 -> 50;
            case 39 -> 51;
            case 40 -> 57;
            case 41 -> 25;
            case 42 -> 16;
            case 43 -> 46;
            case 44 -> 42;
            case 45 -> 13;
            case 46 -> 62;
            case 47 -> 7;
            case 48 -> 52;
            case 49 -> 60;
            case 50 -> 6;
            case 51 -> 29;
            case 52 -> 41;
            case 53 -> 31;
            case 54 -> 11;
            case 55 -> 58;
            case 56 -> 15;
            case 57 -> 20;
            case 58 -> 14;
            case 59 -> 27;
            case 60 -> 17;
            case 61 -> 1;
            case 62 -> 38;
            default -> 18;
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
        _5D.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = " \tdCE\u007f=\u001cf\u0002@#p\u001e";
        objectArray[1] = "\u0006HG'^>\u001b]Ef[bWi";
        objectArray[2] = "O_\u001e([\u0000RJ\u001ci^\\\u0012\b";
        objectArray[3] = "8M}et\u001d%X\u007f$qAjP";
        objectArray[4] = "?\u0001lR4AJ!g]%\u000e+/lV!T_";
        objectArray[5] = Void.TYPE;
        _5D.k[5] = "java/lang/Void";
        objectArray[6] = "\u00077888\\\u00077/d4S\u001d|/z4F\u001a\r\u007f'e";
        objectArray[7] = "zV*\u0014\u001cYzV=H\u0010V`\u001d=V\u0010Cglm\nE";
        objectArray[8] = Boolean.TYPE;
        _5D.k[8] = "java/lang/Boolean";
        objectArray[9] = "*\u000fH_x *\u000f_\u0003t/0D_\u001dt:75\u000f@ ";
        objectArray[10] = "I?89/6<\u001f36>y]\u00118=:#)";
        objectArray[11] = Integer.TYPE;
        _5D.k[11] = "java/lang/Integer";
        objectArray[12] = " o\u0018\u0000\u001b5UO\u0013\u000f\nz4A\u0018\u0004\u000e @";
        objectArray[13] = "+U\u0014(\\4+U\u0003tP;1\u001e\u0003jP.6oW2\u0007";
        objectArray[14] = Float.TYPE;
        _5D.k[14] = "java/lang/Float";
        objectArray[15] = "\u0001R\t\r3Ftr\u0002\u0002\"\t\u0015|\t\t&Sa";
        objectArray[16] = "-JSR84-JD\u000e4;7\u0001D\u00104.0p\u0016Keo";
        objectArray[17] = "cr\u0002n\u0007y\u0016R\ta\u00166w\\\u0002j\u0012l\u0003";
        objectArray[18] = "RB[8{f'bP7j)Fl[<ns2";
        objectArray[19] = "sV$\rvtsV3Qz{i\u001d3Oznnla\u0015-,";
        objectArray[20] = "p&pX\u00104p&g\u0004\u001c;jmg\u001a\u001c.m\u001c5ADd";
        objectArray[21] = "w;\u001au\u0007tw;\r)\u000b{mp\r7\u000bnj\u0001WhY,";
        objectArray[22] = "6s;C:\u0003=|*\f[\r6w.V";
        objectArray[23] = "0P#W\u007f@Ep(Xn\u000f$~#SjUP";
        objectArray[24] = "c\u0003Mb\u0015\r\u0016#Fm\u0004Bw-Mf\u0000\u0018\u0003";
        objectArray[25] = "Y\u00079(Sv,'2'B9M)9,Fc9";
        objectArray[26] = "tr?Rq#tr(\u000e},n9(\u0010}9iHrO/~";
        objectArray[27] = "4ur=`w)`p|e+hj";
        objectArray[28] = "5bd\u0012\u0015\u0014@Bo\u001d\u0004[!Ld\u0016\u0000\u0001U";
        objectArray[29] = "2u*[RK2u=\u0007^D(>=\u0019^Q/OjD\b\u0016";
        objectArray[30] = "Y0>1qyY0)m}vC{)s}cD\ns,.#";
        objectArray[31] = "lM,N1\tlM;\u0012=\u0006v\u0006;\f=\u0013qwiWeR";
        objectArray[32] = "ZQt/\u007fg\u001bJ5)\u0018?\u0006Lm-t\rU\b6p\u00183R_k2\"0\u000e_<J";
        objectArray[33] = "_\u0001\b\u0011YhL\u001c\u001a \u0018\u0013\u001d\u0014\u0018JLyK\u0019\u001a\u0019";
        objectArray[34] = "4\"\u00038vE'?\u0011\t1sK%\u0003ogAw?\u0007vv>w~\u0018iaDv:Ei\n";
        objectArray[35] = "\u0017c[Ko\u0007\u0004~Iz*\u001ahd[\u001c~\u0003T~_\u0005o|T?@\u001ax\u0006U{\u001d\u001a\u0013";
        objectArray[36] = "z\u000bVCra&IRZ\u001b1~\u0016\u0010q!f(Jh\u0019k$y\u0013\u0017\u001c%jds";
        objectArray[37] = "LY.e,\u000bC\\=\u001eQprtQ{rNR\u0007ktw]";
        objectArray[38] = "F)\u000f4!=P3Kk\u001ceG)\u0010npW\u0014jM2&\u0000\u0015%\u000ei|\u007f\u0010k@t\u001c";
        objectArray[39] = "c'\r\na\\p:\u001f;#'~<\u0015Vb\u001bd8\fG\u001d\u0018l<\u0013[b\u001d\"r\u000e;";
        objectArray[40] = "x=\u000e\b\\B9&O\u000e;\u001a$ \u0017\nW(weNP;B92\u001d\u0004Q\u001440Nm";
        objectArray[41] = "D?\u001277G\u00050D1\r_\u0014(\u0019iamCoE>4:D$\u0017ddP\u0012)\u00157\r\u0006@1\u0019ew\u0007\u0004l\u0019\u000e";
        objectArray[42] = "\bN,&\u0018B\u001bS>\u0017_KwI,q\tFKS(h\u00189K\u00127w\u000fCJVjwd";
        objectArray[43] = "\r\u0002`@\u0003_X\u0017n\u0016~\u0007\n\u0004k@\u00125XE;\u0019~]\u0017\u0006kG\u0001XYHv'";
        objectArray[44] = "k^}\n\u001c\">SxK!<bKz\u0016M\u000e2\u0007$@\u001dYa\re\u001d\u001d;n\fhO!7n^zJ\\)bLzq";
        objectArray[45] = "\n@3~\u0019AK[rx~\u0019V]*|\u0012+\u0004\u001av'~\u0016AJ-fCCTD{\u001b";
        objectArray[46] = "\u000282my\u0011\u0001vos\u0002\u0006\u0003:4vn4Qwl \u0002\u0007\u0010%n s\u0013\u000b7?\u0011";
        objectArray[47] = "\u0012\u001dSr\u0015\u0004SB\u0003wwO(\u0018\u001dz\u001a\t\u0014\u0002\u0019c\u000bv\u0014C\u0006|\u001c\f\u0015\u0007[|w";
        objectArray[48] = "j%/.\u0000y5q./`*7w/!7}h+sM^$9u;u\u001ez&j";
        objectArray[49] = "y.}IQ0j3ox\u0014\u0006\u0006)}\u001e@4:3y\u0007QK:rf\u0018F1;6;\u0018-";
        objectArray[50] = "\u007f$\\\u0004Vfk?NUgrv&_Y\u000b@&e\u0004\u0002X\u0017\u007f3XEZl*>]\u0004g";
        objectArray[51] = "1\u0007p?zY'\u001d4`G\u00010\u0007oe+3`G42G[-\u0005ob8^cKr\u0002+\u001a;\u0007tp(Tf\u0019\u000f";
        objectArray[52] = ")\u001aUk\"\u0016*T\buY\u0001(\u0018Sp53xT\r&ed+^L{e\u0006$_A)Y\n$\rS,$\u0014(\u001fS\u0017";
        objectArray[53] = "\u0015v\nA]#\u0006k\u0018p\u001eX\bm\u0012\u001d^d\u0012i\u000b\f!e\u001a}\u001e\u0019K3\u0017\u007fMp";
        objectArray[54] = "MiJ`\td^tXQD\u001f\r|J1\u0015`\b2\u0004,";
        objectArray[55] = "j\u001c\u0001L3\f5H\u0000MS_7N\u0001C\u0004\bi\u0019Y/bP/F\u0002\u0012#Kn@";
        objectArray[56] = "iC,OJFz^>~\r=)V,\u001eVB,\u0018b\u0003";
        objectArray[57] = "\r_l\bl\u001eL\u0000<\r\u000eU7\u0004c\u0002m\f\n[7\u0003l";
        objectArray[58] = "8+V8\t,+6D\tOW~4L7O<?<M{";
        objectArray[59] = "U]ZrN\u001f\u0014F\u001bt)G\t@CpEu_\u0005\u001e+\u0019\"\b@\\*\u0014\u001f\u001eZ\u0018u)";
        objectArray[60] = "\u001e2Fdp\r\r/TU5Ga5F3a\t]/B*pv]n]5g\f\\*\u00005\f";
        objectArray[61] = "\u0018J2P-#\u000bW aoX^U(_k3\u001f])\u0013";
        objectArray[62] = "?~\u0003c^H\u007f \u001c|.\u001e`s\b`yI0&P\f\u0013\u001bj'VqR\u0014<!";
        objectArray[63] = "y]\u0002\u0007\u0003?j@\u00106@D9H\u0002V\u001f;<\u0006LK";
        objectArray[64] = ")\u001e\u000f\fC>:\u0003\u001d=\u0007Ei\u000b\u000f]_:lEA@";
        objectArray[65] = "SQNOv,\f\u001cO\t\u001b+S\fPYLx\nY\u000b\b\u001b+\b\u001eX\ty$\t\u0013\n";
        objectArray[66] = "_wF/h\u0018\u001e\u007fGcRNfo\\w?\fZuXn.sY}\\q2\f\\3\u0012lR";
        Object[] objectArray2 = objectArray;
        objectArray[67] = "\u0014\b!b/1\u001c^!3\u00103v[3o}tJA7vl\u000bJ\u0000(i{qKDui\u0010";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'i' || c == '\u00de' || c == 'C' || c == 'Q') {
                field = _5D.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'i' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5D.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5D.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5D" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5D.e(l2, l3);
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
                clazz3 = _5D.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5D.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5D.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5D.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5D.f(1575000208646945L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5D.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5D.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5D.f(1575000208646945L, 0L);
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
            int n = _5D.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5D.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5D.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5D.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5D.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5D.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5D.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3177;
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
                throw new RuntimeException("dev/krypton/5D", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5D.e[n2] = n3;
        }
        return e[n2];
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
            throw new RuntimeException("dev/krypton/5D" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _5D.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5D.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5D.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5D.c(clazz3, string2, clazz2)) != null) {
                    _5D.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5D.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5D.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5D.f(1575000208646945L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void cfr_renamed_21(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x6809AC14DE27L;
        long l5 = l3 ^ 0x1B2E8D1B5508L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = (int)_5D.c("i", (Object)this, -1130987498427125154L, (long)l2);
        _5D.c("\u00ca", (Object)this, (Object)objectArray2, -1132420989313733588L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = false;
        objectArray3[0] = l4;
        _5D.c("\u00ca", (Object)this, (Object)objectArray3, -1131873971702756485L, (long)l2);
        _5D.c("\u00de", (Object)this, (boolean)_5D.a("v", 2140, (long)(0x7ED0BFFD70FC4962L ^ l2)), -1132601856802056324L, (long)l2);
        _5D.c("\u00de", (Object)this, (int)_5D.a("v", 2140, (long)(0x7ED0BFFD70FC4962L ^ l2)), -1130325967108603463L, (long)l2);
    }

    private int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        int n = -1;
        Object object = -1;
        int n2 = _7C.cfr_renamed_9();
        int n3 = 0;
        while (n3 < _5D.a("v", 18850, (long)(0x5C8E76BEDC4DD1FBL ^ l2))) {
            int n4;
            block8: {
                block9: {
                    block10: {
                        class_4174 class_41742;
                        block6: {
                            class_4174 class_41743;
                            block7: {
                                CallSite callSite = _5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)this, -6258577365692842580L, (long)l2), -6258135648594599202L, (long)l2), -6258412385044577291L, (long)l2), (int)n3, -6257846722660245726L, (long)l2), -6259764390004809255L, (long)l2);
                                class_41743 = (class_4174)_5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)callSite, -6257774215735136620L, (long)l2), (Object)_5D.c("C", -6252350129708073278L, (long)l2), -6259899967525487110L, (long)l2);
                                try {
                                    class_41742 = class_41743;
                                    if (n2 == 0) break block6;
                                    if (class_41742 != null) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _5D.a(matchException);
                                }
                                if (l2 > 0L) break block10;
                            }
                            class_41742 = class_41743;
                        }
                        CallSite callSite = _5D.c("\u00ca", (Object)class_41742, -6259344464301065150L, (long)l2);
                        try {
                            n4 = n2;
                            if (l2 <= 0L) break block8;
                            if (n4 == 0) break block9;
                            if (callSite <= object) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _5D.a(matchException);
                        }
                        n = n3;
                        object = callSite;
                    }
                    ++n3;
                }
                n4 = n2;
            }
            if (n4 != 0) continue;
        }
        return n;
    }

    /*
     * Unable to fully structure code
     */
    @_3i_0
    public void cfr_renamed_2(_9o var1_1) {
        block46: {
            block48: {
                block47: {
                    block38: {
                        block41: {
                            block42: {
                                block43: {
                                    block45: {
                                        block44: {
                                            block39: {
                                                block40: {
                                                    block36: {
                                                        block37: {
                                                            v0 = var2_2 = _5D.b ^ 87372839360563L;
                                                            var4_3 = v0 ^ 45534093652248L;
                                                            var6_4 = v0 ^ 32587756234867L;
                                                            var8_5 = v0 ^ 130902750374188L;
                                                            var10_6 = v0 ^ 126978720496672L;
                                                            var12_7 = v0 ^ 59635549292346L;
                                                            var14_8 = v0 ^ 80625727180445L;
                                                            var16_9 = _7C.cfr_renamed_9();
                                                            try {
                                                                try {
                                                                    v1 = _5D.c("i", (Object)this, (long)-6063198586277740263L, (long)var2_2);
                                                                    if (var16_9 == 0) break block36;
                                                                    if (v1 <= 0) break block37;
                                                                }
                                                                catch (MatchException v2) {
                                                                    throw _5D.a(v2);
                                                                }
                                                                v3 = this;
                                                                _5D.c("\u00de", (Object)v3, (int)(_5D.c("i", (Object)v3, (long)-6063198586277740263L, (long)var2_2) - true), (long)-6063198586277740263L, (long)var2_2);
                                                                return;
                                                            }
                                                            catch (MatchException v4) {
                                                                throw _5D.a(v4);
                                                            }
                                                        }
                                                        v1 = _5D.c("i", (Object)this, (long)-6062580783328867095L, (long)var2_2);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var16_9 == 0) break block38;
                                                                    if (v1 != false) {
                                                                    }
                                                                    ** GOTO lbl126
                                                                }
                                                                catch (MatchException v5) {
                                                                    throw _5D.a(v5);
                                                                }
                                                                v6 = this;
                                                                _5D.c("\u00de", (Object)v6, (int)(_5D.c("i", (Object)v6, (long)-6069421836744467924L, (long)var2_2) + true), (long)-6069421836744467924L, (long)var2_2);
                                                                v7 = _5D.c("i", (Object)this, (long)-6069421836744467924L, (long)var2_2);
                                                                if (var16_9 == 0) break block39;
                                                            }
                                                            catch (MatchException v8) {
                                                                throw _5D.a(v8);
                                                            }
                                                            if (v7 < _5D.a("v", (int)25104, (long)(6600440415891093685L ^ var2_2))) break block40;
                                                        }
                                                        catch (MatchException v9) {
                                                            throw _5D.a(v9);
                                                        }
                                                        v10 = new Object[1];
                                                        v10[0] = var6_4;
                                                        _5D.c("\u00ca", (Object)this, (Object)v10, (long)-6063532888345839371L, (long)var2_2);
                                                        _5D.c("\u00de", (Object)this, (int)_5D.a("v", (int)17826, (long)(3076312672572464900L ^ var2_2)), (long)-6063198586277740263L, (long)var2_2);
                                                        return;
                                                    }
                                                    catch (MatchException v11) {
                                                        throw _5D.a(v11);
                                                    }
                                                }
                                                try {
                                                    v12 = this;
                                                    if (var16_9 == 0) break block41;
                                                    v13 = new Object[1];
                                                    v13[0] = var12_7;
                                                    v7 = _5D.c("\u00ca", (Object)v12, (Object)v13, (long)-6063981874124452575L, (long)var2_2);
                                                }
                                                catch (MatchException v14) {
                                                    throw _5D.a(v14);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (v7 != false) {
                                                        v15 = this;
                                                        if (var16_9 == 0) break block42;
                                                    }
                                                    ** GOTO lbl115
                                                }
                                                catch (MatchException v16) {
                                                    throw _5D.a(v16);
                                                }
                                                if (_5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)v15, (long)-6063120824279957678L, (long)var2_2), (long)-6063880875805220832L, (long)var2_2), (long)-6063039544489131765L, (long)var2_2), (int)_5D.c("i", (Object)this, (long)-6063269710087884920L, (long)var2_2), (long)-6063587550215709220L, (long)var2_2), (Object)_5D.c("C", (long)-6069350233623036868L, (long)var2_2), (long)-6064092679592947109L, (long)var2_2) == null) break block43;
                                            }
                                            catch (MatchException v17) {
                                                throw _5D.a(v17);
                                            }
                                            v18 = new Object[1];
                                            v18[0] = var4_3;
                                            var17_10 = _5D.c("\u00ca", (Object)this, (Object)v18, (long)-6062753094413106370L, (long)var2_2);
                                            try {
                                                try {
                                                    if (var16_9 == 0) break block44;
                                                    if (var17_10 != -1) break block45;
                                                }
                                                catch (MatchException v19) {
                                                    throw _5D.a(v19);
                                                }
                                                v20 = new Object[1];
                                                v20[0] = var6_4;
                                                _5D.c("\u00ca", (Object)this, (Object)v20, (long)-6063532888345839371L, (long)var2_2);
                                            }
                                            catch (MatchException v21) {
                                                throw _5D.a(v21);
                                            }
                                        }
                                        return;
                                    }
                                    v22 = new Object[2];
                                    v22[1] = var14_8;
                                    v22[0] = (int)var17_10;
                                    _5D.c("\u00ca", (Object)this, (Object)v22, (long)-6062540648982153287L, (long)var2_2);
                                }
                                v15 = this;
                            }
                            try {
                                v23 = new Object[1];
                                v23[0] = var8_5;
                                _5D.c("\u00ca", (Object)v15, (Object)v23, (long)-6062426240644288294L, (long)var2_2);
                                if (var16_9 != 0) break block46;
lbl115:
                                // 2 sources

                                v12 = this;
                            }
                            catch (MatchException v24) {
                                throw _5D.a(v24);
                            }
                        }
                        try {
                            v25 = new Object[1];
                            v25[0] = var6_4;
                            _5D.c("\u00ca", (Object)v12, (Object)v25, (long)-6063532888345839371L, (long)var2_2);
                            if (var16_9 != 0) break block46;
lbl126:
                            // 2 sources

                            v26 = new Object[1];
                            v26[0] = var12_7;
                            v1 = _5D.c("\u00ca", (Object)this, (Object)v26, (long)-6063981874124452575L, (long)var2_2);
                        }
                        catch (MatchException v27) {
                            throw _5D.a(v27);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var16_9 == 0) break block47;
                                if (v1 == false) break block46;
                            }
                            catch (MatchException v28) {
                                throw _5D.a(v28);
                            }
                            v29 = new Object[1];
                            v29[0] = var4_3;
                            _5D.c("\u00de", (Object)this, (int)_5D.c("\u00ca", (Object)this, (Object)v29, (long)-6062753094413106370L, (long)var2_2), (long)-6063269710087884920L, (long)var2_2);
                            v30 = this;
                            if (var16_9 == 0) break block48;
                        }
                        catch (MatchException v31) {
                            throw _5D.a(v31);
                        }
                        v1 = _5D.c("i", (Object)v30, (long)-6063269710087884920L, (long)var2_2);
                    }
                    catch (MatchException v32) {
                        throw _5D.a(v32);
                    }
                }
                try {
                    if (v1 == -1) break block46;
                    v30 = this;
                }
                catch (MatchException v33) {
                    throw _5D.a(v33);
                }
            }
            v34 = new Object[1];
            v34[0] = var10_6;
            _5D.c("\u00ca", (Object)v30, (Object)v34, (long)-6063730162736744948L, (long)var2_2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean boolean_7(Object[] var1_1) {
        block24: {
            block23: {
                block25: {
                    block22: {
                        block20: {
                            block21: {
                                block18: {
                                    block19: {
                                        var2_2 = (Long)var1_1[0];
                                        v0 = var2_2 = _5D.b ^ var2_2;
                                        var4_3 = v0 ^ 88564434748868L;
                                        var6_4 = v0 ^ 137531793363638L;
                                        var8_5 = _7C.cfr_renamed_3();
                                        try {
                                            v1 = new Object[1];
                                            v1[0] = var6_4;
                                            cfr_temp_0 = _5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)this, (long)-2375914477929198706L, (long)var2_2), (long)-2376566218693929732L, (long)var2_2), (long)-2377520069534788781L, (long)var2_2) - (float)_5D.c("\u00ca", (Object)_5D.c("i", (Object)this, (long)-2375710379371864721L, (long)var2_2), (Object)v1, (long)-2370594100686052846L, (long)var2_2);
                                            v2 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                            if (var8_5 != 0) break block18;
                                            if (v2 /* !! */  > 0) break block19;
                                        }
                                        catch (MatchException v3) {
                                            throw _5D.a(v3);
                                        }
                                        v2 /* !! */  = (reference)true;
                                        break block18;
                                    }
                                    v2 /* !! */  = (reference)false;
                                }
                                var9_6 /* !! */  = v2 /* !! */ ;
                                try {
                                    try {
                                        v4 /* !! */  = _5D.c("\u00ca", (Object)_5D.c("\u00ca", (Object)_5D.c("i", (Object)_5D.c("i", (Object)this, (long)-2375914477929198706L, (long)var2_2), (long)-2376566218693929732L, (long)var2_2), (long)-2377320064801352802L, (long)var2_2), (long)-2376849396327512529L, (long)var2_2);
                                        v5 /* !! */  = var8_5;
                                        if (var2_2 >= 0L) {
                                            if (v5 /* !! */  != 0) break block20;
                                            v6 = new Object[1];
                                            v6[0] = var6_4;
                                            v5 /* !! */  = (int)_5D.c("\u00ca", (Object)_5D.c("i", (Object)this, (long)-2376192136837750275L, (long)var2_2), (Object)v6, (long)-2370594100686052846L, (long)var2_2);
                                        }
                                        if (v4 /* !! */  > v5 /* !! */ ) break block21;
                                    }
                                    catch (MatchException v7) {
                                        throw _5D.a(v7);
                                    }
                                    v4 /* !! */  = (CallSite)true;
                                    break block20;
                                }
                                catch (MatchException v8) {
                                    throw _5D.a(v8);
                                }
                            }
                            v4 /* !! */  = (CallSite)false;
                        }
                        var10_7 /* !! */  = v4 /* !! */ ;
                        try {
                            try {
                                v9 = new Object[1];
                                v9[0] = var4_3;
                                v10 /* !! */  = _5D.c("\u00ca", (Object)this, (Object)v9, (long)-2377689722264930334L, (long)var2_2);
                                v11 = var8_5;
                                if (var2_2 > 0L) {
                                    if (v11 != 0) break block22;
                                    if (v10 /* !! */  == -1) break block23;
                                }
                                ** GOTO lbl70
                            }
                            catch (MatchException v12) {
                                throw _5D.a(v12);
                            }
                            v10 /* !! */  = var9_6 /* !! */ ;
                        }
                        catch (MatchException v13) {
                            throw _5D.a(v13);
                        }
                    }
                    try {
                        try {
                            try {
                                v11 = var8_5;
lbl70:
                                // 2 sources

                                if (v11 != 0) break block24;
                                if (v10 /* !! */  != false) break block25;
                            }
                            catch (MatchException v14) {
                                throw _5D.a(v14);
                            }
                            v10 /* !! */  = var10_7 /* !! */ ;
                            if (var8_5 != 0) break block24;
                        }
                        catch (MatchException v15) {
                            throw _5D.a(v15);
                        }
                        if (v10 /* !! */  == false) break block23;
                    }
                    catch (MatchException v16) {
                        throw _5D.a(v16);
                    }
                }
                v10 /* !! */  = (reference)true;
                break block24;
            }
            v10 /* !! */  = (reference)false;
        }
        return (boolean)v10 /* !! */ ;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5D.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5D.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

