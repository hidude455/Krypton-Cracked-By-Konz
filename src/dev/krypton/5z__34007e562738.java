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
import dev.krypton._5y_0;
import dev.krypton._6V;
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

/*
 * Renamed from dev.krypton.5z
 */
public class _5z_0
extends _6x_0 {
    private final _9j_0 cfr_renamed_8;
    private final _92 cfr_renamed_1;
    private final _9r cfr_renamed_4;
    private final _92 cfr_renamed_0;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_9;
    private int cfr_renamed_6;
    private int cfr_renamed_2;
    private int cfr_renamed_445;
    private int cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_223(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block4: {
            block5: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = b ^ l4;
                l3 = l5 ^ 0x4A25D3D33A98L;
                l2 = l5 ^ 0x6ED346F766C7L;
                long l6 = l5 ^ 0x6BD73631D56EL;
                int n = _7C.cfr_renamed_3();
                try {
                    try {
                        callSite = _5z_0.c("\u00a5", (Object)this, 6396662532522270893L, (long)l4);
                        if (n != 0) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        if (callSite >= _5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)this, 6402934118938261835L, (long)l4), (Object)objectArray2, 6396270733212818218L, (long)l4)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5z_0.a(matchException);
                    }
                    _5z_0 z_0 = this;
                    _5z_0.c("\u00da", (Object)z_0, (int)(_5z_0.c("\u00a5", (Object)z_0, 6396662532522270893L, (long)l4) + true), 6396662532522270893L, (long)l4);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5z_0.a(matchException);
                }
            }
            callSite = _5z_0.c("\u00a5", (Object)this, 6403808239501286743L, (long)l4);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = (int)callSite;
        _5z_0.c("\u00d3", (Object)objectArray3, 6396432969472814520L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        _5z_0.c("\u00c1", (Object)this, (Object)objectArray4, 6395142861014622502L, (long)l4);
    }

    private void cfr_renamed_446(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5z_0.c("\u00da", (Object)this, (int)_5z_0.a("k", 4374, (long)(0x3BDE73DA8C3028CDL ^ l2)), -6429536795061492916L, (long)l2);
        _5z_0.c("\u00da", (Object)this, (int)_5z_0.a("k", 22791, (long)(0x601A08BD797BE0D0L ^ l2)), -6423905005746963225L, (long)l2);
        _5z_0.c("\u00da", (Object)this, (int)_5z_0.a("k", 14102, (long)(0x2ED74861133B0ECCL ^ l2)), -6422461422936678730L, (long)l2);
        _5z_0.c("\u00da", (Object)this, (int)_5z_0.a("k", 8968, (long)(0x49968995BA989AD0L ^ l2)), -6429760426915042410L, (long)l2);
        _5z_0.c("\u00da", (Object)this, (boolean)_5z_0.a("k", 14102, (long)(0x2ED74861133B0ECCL ^ l2)), -6429121877989042695L, (long)l2);
        _5z_0.c("\u00da", (Object)this, (boolean)_5z_0.a("k", 14102, (long)(0x2ED74861133B0ECCL ^ l2)), -6430839648122419347L, (long)l2);
    }

    public _5z_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x3EC4AE20ABA9L;
        long l5 = l3 ^ 0x2EA49CE9D23AL;
        long l6 = l3 ^ 0x14B947F1D2F8L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x68FC396323C0L;
        long l9 = l3 ^ 0x773CAA47CCB2L;
        long l10 = l3 ^ 0x580C7F565C9DL;
        int n2 = (int)(l10 >>> 32);
        int n3 = (int)(l10 << 32 >>> 56);
        int n4 = (int)(l10 << 40 >>> 40);
        long l11 = l3 ^ 0x3D8868954764L;
        super((int)_5z_0.a("k", 24067, (long)(0x3D8A4B157332CBFDL ^ l2)), -1, (_4r)((Object)_5z_0.c("N", -8439507235831985791L, (long)l2)), l8);
        this.cfr_renamed_8 = new _9j_0(3, n2, (byte)n3, -1, n4, false);
        this.cfr_renamed_1 = new _92((int)_5z_0.a("k", 32661, (long)(0x4295E28ECCEEA6AL ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_4 = new _9r((int)_5z_0.a("k", 5072, (long)(0x468561D86B4B062CL ^ l2)), true, l4);
        this.cfr_renamed_0 = new _92((int)_5z_0.a("k", 18139, (long)(0x52BBEBB8E1185323L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        CallSite callSite = _5z_0.c("\u00a5", (Object)this, -8439249317332718735L, (long)l2);
        CallSite callSite2 = _5z_0.c("\u00a5", (Object)this, -8432781271679620257L, (long)l2);
        _5z_0.c("\u00d3", (Object)callSite2, -8438095904610041542L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l11);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5z_0.c("\u00c1", (Object)callSite, (Object)objectArray, -8432104015681086444L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5z_0.c("\u00a5", (Object)this, -8432174087438014742L, (long)l2), _5z_0.c("\u00a5", (Object)this, -8432632710405515957L, (long)l2), _5z_0.c("\u00a5", (Object)this, -8432781271679620257L, (long)l2), _5z_0.c("\u00a5", (Object)this, -8439249317332718735L, (long)l2)};
        objectArray2[0] = l9;
        _5z_0.c("\u00c1", (Object)this, (Object)objectArray2, -8437882840067853158L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5z_0.class, 66);
                _5z_0.b = l.a(-3618730950379108979L, 5491207293747027938L, MethodHandles.lookup().lookupClass()).a(224253525584491L);
                _5z_0.j = new Object[90];
                _5z_0.k = new String[90];
                _5z_0.b();
                _5z_0.f = new HashMap<K, V>(13);
                var0 = _5z_0.b ^ 28266540207588L;
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
                var6_5 = "\u00a0\u00ee.\u00aaC\u008c?A\u00d3\u0098(\u00ec\u0099\u00c7\u0003 \u00cay\u00f9\u00bf\u00ef>\u0015\u00a9k>\u00c4\u00da\u00a2K\u00eb\u00d7\u00bae\u00eb\"\u00f2\u00f8\u001f\u00dc1\u00f04\u009c\u000fX\u00d24\u001c\u00bc\u0014R\u0099J\f\u00a5\u0097\u0090F\u00d0|\u009a\u00f4=";
                var7_6 = "\u00a0\u00ee.\u00aaC\u008c?A\u00d3\u0098(\u00ec\u0099\u00c7\u0003 \u00cay\u00f9\u00bf\u00ef>\u0015\u00a9k>\u00c4\u00da\u00a2K\u00eb\u00d7\u00bae\u00eb\"\u00f2\u00f8\u001f\u00dc1\u00f04\u009c\u000fX\u00d24\u001c\u00bc\u0014R\u0099J\f\u00a5\u0097\u0090F\u00d0|\u009a\u00f4=".length();
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
                    var6_5 = "_\u00f8\u00a7n\u00cfc\u00a3\u00b8\u0090\u00875u8\u00a6\u0014\u001e";
                    var7_6 = "_\u00f8\u00a7n\u00cfc\u00a3\u00b8\u0090\u00875u8\u00a6\u0014\u001e".length();
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
        _5z_0.d = var8_3;
        _5z_0.e = new Integer[10];
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
            case 0 -> 61;
            case 1 -> 3;
            case 2 -> 35;
            case 3 -> 49;
            case 4 -> 26;
            case 5 -> 45;
            case 6 -> 16;
            case 7 -> 13;
            case 8 -> 48;
            case 9 -> 34;
            case 10 -> 63;
            case 11 -> 38;
            case 12 -> 59;
            case 13 -> 56;
            case 14 -> 53;
            case 15 -> 55;
            case 16 -> 17;
            case 17 -> 18;
            case 18 -> 31;
            case 19 -> 25;
            case 20 -> 42;
            case 21 -> 41;
            case 22 -> 15;
            case 23 -> 47;
            case 24 -> 54;
            case 25 -> 12;
            case 26 -> 27;
            case 27 -> 21;
            case 28 -> 62;
            case 29 -> 7;
            case 30 -> 28;
            case 31 -> 51;
            case 32 -> 50;
            case 33 -> 23;
            case 34 -> 10;
            case 35 -> 44;
            case 36 -> 22;
            case 37 -> 32;
            case 38 -> 4;
            case 39 -> 0;
            case 40 -> 14;
            case 41 -> 29;
            case 42 -> 2;
            case 43 -> 39;
            case 44 -> 58;
            case 45 -> 24;
            case 46 -> 57;
            case 47 -> 20;
            case 48 -> 36;
            case 49 -> 6;
            case 50 -> 30;
            case 51 -> 19;
            case 52 -> 43;
            case 53 -> 33;
            case 54 -> 37;
            case 55 -> 8;
            case 56 -> 60;
            case 57 -> 5;
            case 58 -> 40;
            case 59 -> 1;
            case 60 -> 52;
            case 61 -> 46;
            case 62 -> 11;
            default -> 9;
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
        _5z_0.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\\6>\u0007omA#<Fj1\r)";
        objectArray[1] = Integer.TYPE;
        _5z_0.k[1] = "java/lang/Integer";
        objectArray[2] = Boolean.TYPE;
        _5z_0.k[2] = "java/lang/Boolean";
        objectArray[3] = "9\u0000\t3\u0015J9\u0000\u001eo\u0019E#K\u001eq\u0019P$:D.J\u0010";
        objectArray[4] = "\u0001\u0002]}S\t\u0001\u0002J!_\u0006\u001bIJ?_\u0013\u001c8\u0010`\rQ";
        objectArray[5] = "w\u001eb'sow\u001eu{\u007f`mUue\u007fuj$'?(7";
        objectArray[6] = "&\u0006QM?\u0011&\u0006F\u00113\u001e<MF\u000f3\u000b;<\u0014TkA";
        objectArray[7] = "5l\u0004\u000f\u001f95l\u0013S\u00136/'\u0013M\u0013#(VA\u0016Kb";
        objectArray[8] = "X\u0005\u0012^h\"X\u0005\u0005\u0002d-BN\u0005\u001cd8E?WC5\u007f";
        objectArray[9] = "y=A\u001f5]y=VC9RcvV]9Gd\u0007\u0002\u0005n";
        objectArray[10] = "1POS_3,EM\u0012Zol_";
        objectArray[11] = "R|\u001bf5N'\\\u0010i$\u0001FR\u001bb [2";
        objectArray[12] = "\u000b\u001c,K\u0007s\u0016\t.\n\u0002/V\u000b";
        objectArray[13] = Long.TYPE;
        _5z_0.k[13] = "java/lang/Long";
        objectArray[14] = "]l\u0003&vz]l\u0014zzuG'\u0014dz`@VF0+!";
        objectArray[15] = "J0\u0007I<:W%\u0005\b9f\u0018-";
        objectArray[16] = "?A&W\u007f[Ja-Xn\u0014+o&SjN_";
        objectArray[17] = Void.TYPE;
        _5z_0.k[17] = "java/lang/Void";
        objectArray[18] = "o\n\u0000z[\u001ad\u0005\u00115:\u0014o\u000e\u0015o";
        objectArray[19] = "DrQYE\u0018DrF\u0005I\u0017^9F\u001bI\u0002YH\u0016F\u0018";
        objectArray[20] = "a\u0018r[g>a\u0018e\u0007k1{Se\u0019k$|\"2F=";
        objectArray[21] = "M<oi\u000edP)m(\u000b8\u0011#";
        objectArray[22] = "-\u0010\u0013Z\reX0\u0018U\u001c*9>\u0013^\u0018pM";
        objectArray[23] = "bP\b&z^\u0017p\u0003)k\u0011v~\b\"oK\u0002";
        objectArray[24] = "f]]\u001c#n{H_]&2;\n";
        objectArray[25] = "X\n\u0002j;kE\u001f\u0000+>7\u000e";
        objectArray[26] = "`:`\\A\u0002}/b\u001dD^4m";
        objectArray[27] = "@BB>\bF@BUb\u0004IZ\tU|\u0004\\]x\u0007\"S\u0017";
        objectArray[28] = "W4!_RoW46\u0003^`M\u007f6\u001d^uJ\u000ecB\t";
        objectArray[29] = "\u0000yJ7\u0015\u001a\u001dlHv\u0010F]W";
        objectArray[30] = "O4lD/,:\u0014gK>c[\u001al@:9/";
        objectArray[31] = "4q\tTdb4q\u001e\bhm.:\u001e\u0016hx)KDI:?";
        objectArray[32] = "0\u007fBrsuE_I}b:$QBvf`P";
        objectArray[33] = "\u0001\u0000J\rp[t A\u0002a\u0014\u0015.J\teNa";
        objectArray[34] = "}R;\u0013Y3}R,OU<g\u0019,QU)`h~\u000b\u0001m";
        objectArray[35] = "\t[k\u0010JH\t[|LFG\u0013\u0010|RFR\u0014a.\f\u0011\u0018";
        objectArray[36] = "\f\u001d\u0004+t\u0002\u0011\b\u0006jq^QM";
        objectArray[37] = "E\u0005Avul0%Jyd#Q+Ar`y%";
        objectArray[38] = "W\u0015\u0006\u001dL'J\u0000\u0004\\I{\u0007\u0002";
        objectArray[39] = "\\e\u0015\u001f\u0011\u0014)E\u001e\u0010\u0000[HK\u0015\u001b\u0004\u0001<";
        objectArray[40] = "C`X0Sg]hB\u007f2pCdM%\u000e";
        objectArray[41] = "4{a\u0017\u0017VA[j\u0018\u0006\u0019 Ua\u0013\u0002CT";
        objectArray[42] = "fA&1\u001f\u00151J2\\\u001eu`\u00039?L\u0019l\u0012\u007f3";
        objectArray[43] = "!g7V\u0018[{lmQu\u0001v\u007fm\u000e\u00193&<=ROd ?2\b\u0014\u0007$21\u0005u]y~i\u0003\t\u0001tari";
        objectArray[44] = "\u0002BL)=\u0000UIXD3`R\u0010W f\u001c\u000e\u001dH;";
        objectArray[45] = "\u0006~ZyJS\u0006}A17_Pa[g[m\u0002&\n97\u0006]r_aZ\u0003Gb\u000b\u0000";
        objectArray[46] = "3:\u00060\u0018>qx@(z\u001b\u000b\u001cvK\u0003#q<_+Aa7$";
        objectArray[47] = "SD\u001dP\tMSG\u0006\u0018tA\u0005[\u001cN\u0018sV\u0018A\u0012N$Q\u0016LN\u001eZ\u0016\u001e\u0007Ct";
        objectArray[48] = "\u0005U\u0010TID\u0000O\u0000\u0000(LTI\u001fWD~\u0002\fB\u000f\u0014)\u0004\u000b\u0006\fM\u0018_H\u000fS(\u0010[H\u001bZTLVW\u00000";
        objectArray[49] = "Y:>bk\u007f]jhc\tj\u0006gkn^:^53\u000274Vjmy3d\u0000k";
        objectArray[50] = "*93XW6ux~V4jy9oCXX*}3\u001b43t*kEY6n:?$";
        objectArray[51] = "s'\u001d\u001bA*|%\u0014H\"tL`\r\u0018S/(j\u000eK]Ju*_\u0010H42\"\u0014\u001d\"";
        objectArray[52] = ">|rxuqiwf\u0015~\u0011n.iq.m2#vj";
        objectArray[53] = "[$\u001aq\u0001s^>\n%`{\n8\u0015r\fIXuM$`#Y=IpQx\u001a4\u0016\u0015";
        objectArray[54] = "\u0017t^X<FL7W\u0007Y\u0012G6G\u00035 \u0017u\u001cXfw\u0010.\u001d[4HJ%G\\Y";
        objectArray[55] = "\u0016\u001cl3\u0001RB\u001b{vyW\u007f\u0019p \b\u000b\u001b\u0013ss\u0006n\u0014^\u007f)\u0002Q\u0000\r{%y";
        objectArray[56] = "\u000f\u007f|TY=Vf#X%{?4pXU<\u000fy,\u000eJA\u0006ga\u0000O=Zj~\u001b%";
        objectArray[57] = "r\u0017\u0001&\t.dO\u0005,q9zE\n)&g%\u0013_ELib\u0014\u000bt\u0017*kK";
        objectArray[58] = "\u007fX=K-}<T.\\VjiJ8[,}BT#|+t`3.Z0wu\\$^h(\u0004X%\\1akR!\u0004n\u0010";
        objectArray[59] = "(J\u0010*+<\u007fA\u0004G&\\xKF p\"?C\r-";
        objectArray[60] = "\u007f:-F\u0013J+=:\u0003kG\u0016}1G\u000f\u001cj!<X\u0014v";
        objectArray[61] = "ycw &,.hcM+2\u0010(s\"f)t\"pqhL{o|+lso<x'\u0017";
        objectArray[62] = "[\u0015\bt8\u0014\f\u001e\u001c\u00197t\u000b\u0014^~c\nL\u001c\u0015s";
        objectArray[63] = "\b\u0011\u00145!g\r\u000b\u0004a@oY\r\u001b6,]\tAE`|\n\u000fMD0!i\u000b@G=@aT\u0017\u001c /kPOCQ";
        objectArray[64] = ".C]z**q\u0002\u0010tIv}C\u0001a%D.\u0006[6I*rB\u0005l5v\u007f]\u001e\u0006";
        objectArray[65] = "\u0007?o\u0005)\b\u0011)j\u001b\u0014Z\u007f)4\ne\u0003\u001b#7Ykf\u0007?o\u0005)\b\u0011)j\u001b\u0014";
        objectArray[66] = "fQYBk\u0016rA\u0004AW\u0007kQ[\u0013\u0000P5\u0006\u0003\u007fi\u00156@\\F6T{N";
        objectArray[67] = "e\u000b\\K\u0005|q\u001b\u0001H9mh\u000b^\u001an:6[\u0007vU|o\b\\\tPb9\u001f";
        objectArray[68] = "9b>04%je:tS(Tz>a\"p0p=2,\u0015mc!j9i1n>qS";
        objectArray[69] = "C'\u0000m\fQ\u0014,\u0014\u0000\u0001c*l\u0004oLTNf\u0007<B1A+\u000bfF\u000eUx\u000fj=";
        objectArray[70] = "/2\u0002j\u001f'x9\u0016\u0007\u0013Gy>\u0016kM'v<\u001f8";
        objectArray[71] = "~BYo\u0000rh\u001a]exev\u0010R`/;'F\r\fE5nAS=\u001evg\u001e";
        objectArray[72] = "\\\fg56\u0018\u000b\u0007sX6xZNx;e\u0014V_>7";
        objectArray[73] = "=o50|N-(= \u0013O\u001e\u00164%r\u001a2.$bz\n";
        objectArray[74] = "v>6mdNfy>}\u000bOzG6kjHo=gc2\r";
        objectArray[75] = "\u0010`=Hh'Dg*\r\u0010\"yr.R-'\u0006f>\u000f.";
        objectArray[76] = "w{=]\u007fdv84Y\u0010dwo9_G7&:m3qsvl2]p0\u007fh";
        objectArray[77] = "ME\u001dxr_YU@{NN@E\u001f)\u0019\u0019\u001e\u0016BE,QCK\u0014<.Z\u001b\u0019";
        objectArray[78] = "7!>\u007f1i`**\u0012;\tg hujw (#x";
        objectArray[79] = "\u0005]J\u0018'gRV^u.\u0007\\\u0017LEj{\u0005\u000e\u0013I";
        objectArray[80] = "p7O\u0006?h/v\u0002\b\\4#7\u0013\u001d0\u0006prJJ\\o~z\u0013\u0018'k.,\u0012z`1!/\u0012\u0017e+1{s";
        objectArray[81] = "vVrO--)\u0017?ANq%V.T\"Cs\u0013s\u000f~\u0014sI/J3}sJ4\u0002N";
        objectArray[82] = "\u00148\ngR\u001a\u00151\u0014n5Gw$\u0018sD\u0012\u0013.\u001b JwN=\u0007x_\u000b\u00120\u0018c5";
        objectArray[83] = "BE\u000e\u0016V\u0013\u0015N\u001a{_4+LYK\u0000\u0019U\u000bQ\u0000\r";
        objectArray[84] = "\u001dH\u0007ed:\u001c\\B!\u0018:\u0018A\u001e5OiA\u0014Ed\u0018oE\u0013\u001b8{kH\u0010\u0016";
        objectArray[85] = "\u001aPMJ#Y\u0016A\u000bFA\buYVF0P\u0011SU\u0015>5L\u0013\u0004N+K\u000b\u001bOCA";
        objectArray[86] = "\u00049'DRD\u0005-b\u0000.D\u00010>\u0014y\u0017\\dkF.\u0011\\b;\u0019M\u0015Qa6";
        objectArray[87] = " R3\u000b\rYsU7OjQMJ3Z\u001b\f)@0\t\u0015i&\r<S\u0011V2^8_j";
        objectArray[88] = "\u0015iu\u0018\u001bfDa-]b!txvI\u0013y\u0010ru\u001a\u001d\u001c\u001d}jZ\u001a Iz}\u001fb";
        Object[] objectArray2 = objectArray;
        objectArray[89] = "Q5\u001f^b\u0019S>G\f\r\u0005^8\u001dZa7\tuD\f\r\u0007\u000f:\u0004E4\u0000^~\u0014=l\u0019S*\u0012SmZZ.}Zc_\u000f$\u001c\u0001c\u000f\u000fD";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00da' || c == 'N' || c == '\u00dd') {
                field = _5z_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5z_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5z_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5z" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5z_0.e(l2, l3);
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
                clazz3 = _5z_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5z_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5z_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5z_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5z_0.f(1268535050589096L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5z_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5z_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5z_0.f(1268535050589096L, 0L);
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
            int n = _5z_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5z_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5z_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5z_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5z_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5z_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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
            throw new RuntimeException("dev/krypton/5z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1F14;
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
                throw new RuntimeException("dev/krypton/5z", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5z_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5z_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5z_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5z_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5z_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5z_0.c(clazz3, string2, clazz2)) != null) {
                    _5z_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5z_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5z_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5z_0.f(1268535050589096L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_2(_6V v) {
        CallSite callSite;
        block7: {
            long l2;
            block8: {
                l2 = b ^ 0x23F87FF1D1F4L;
                int n = _7C.cfr_renamed_9();
                try {
                    try {
                        callSite = _5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, 1541904583327924433L, (long)l2), 1542366381757130132L, (long)l2), 1548002286151629267L, (long)l2), (Object)_5z_0.c("N", 1547367816834537372L, (long)l2), 1547898352270605225L, (long)l2);
                        if (n == 0) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _5z_0.a(matchException);
                    }
                    _5z_0.c("\u00da", (Object)this, (boolean)_5z_0.a("k", 32218, (long)(0x571A1925726CF7B1L ^ l2)), 1548137925105939664L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5z_0.a(matchException);
                }
            }
            callSite = _5z_0.c("\u00a5", (Object)this, 1547514931988453419L, (long)l2);
        }
        try {
            if (callSite > 0) {
                v.void_8();
            }
        }
        catch (MatchException matchException) {
            throw _5z_0.a(matchException);
        }
    }

    @Override
    public native void cfr_renamed_2();

    @_3i_0
    public void cfr_renamed_2(_9o o) {
        block76: {
            _5z_0 z_0;
            long l2;
            long l3;
            block85: {
                CallSite callSite;
                int n;
                long l4;
                block83: {
                    long l5;
                    block84: {
                        block81: {
                            block82: {
                                long l6;
                                block79: {
                                    block80: {
                                        block77: {
                                            long l7;
                                            block78: {
                                                block75: {
                                                    block72: {
                                                        _5z_0 z_02;
                                                        block70: {
                                                            block71: {
                                                                block73: {
                                                                    long l8;
                                                                    long l9;
                                                                    long l10;
                                                                    block68: {
                                                                        block69: {
                                                                            block66: {
                                                                                block67: {
                                                                                    long l11 = l3 = b ^ 0x2E0536C64DD2L;
                                                                                    l10 = l11 ^ 0x652739F5ADADL;
                                                                                    l4 = l11 ^ 0x418C75F11503L;
                                                                                    l9 = l11 ^ 0x22D3FB4FCE2CL;
                                                                                    l2 = l11 ^ 0x167FD4CEEB18L;
                                                                                    l6 = l11 ^ 0x378D312C04EEL;
                                                                                    l8 = l11 ^ 0x2857F52A6652L;
                                                                                    l5 = l11 ^ 0x680F3D6F44DEL;
                                                                                    l7 = l11 ^ 0x1242E834A0EBL;
                                                                                    n = _7C.cfr_renamed_3();
                                                                                    try {
                                                                                        try {
                                                                                            z_02 = this;
                                                                                            if (n != 0) break block66;
                                                                                            if (_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)z_02, -8555713452763947785L, (long)l3), -8556276946088039601L, (long)l3) == null) break block67;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5z_0.a(matchException);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5z_0.a(matchException);
                                                                                    }
                                                                                }
                                                                                z_02 = this;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (n != 0) break block68;
                                                                                    if (_5z_0.c("\u00a5", (Object)z_02, -8547852584491203571L, (long)l3) <= 0) break block69;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5z_0.a(matchException);
                                                                                }
                                                                                _5z_0 z_03 = this;
                                                                                _5z_0.c("\u00da", (Object)z_03, (int)(_5z_0.c("\u00a5", (Object)z_03, -8547852584491203571L, (long)l3) - true), -8547852584491203571L, (long)l3);
                                                                                return;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5z_0.a(matchException);
                                                                            }
                                                                        }
                                                                        z_02 = this;
                                                                    }
                                                                    try {
                                                                        block74: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (n != 0) break block70;
                                                                                                        if (_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)z_02, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3) == null) break block71;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _5z_0.a(matchException);
                                                                                                    }
                                                                                                    Object[] objectArray = new Object[1];
                                                                                                    objectArray[0] = l10;
                                                                                                    Object[] objectArray2 = new Object[2];
                                                                                                    objectArray2[1] = l9;
                                                                                                    objectArray2[0] = (int)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)this, -8556641583788006064L, (long)l3), (Object)objectArray, -8548441656894185834L, (long)l3);
                                                                                                    callSite = _5z_0.c("\u00d3", (Object)objectArray2, -8555269476824503076L, (long)l3);
                                                                                                    if (n != 0) break block72;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _5z_0.a(matchException);
                                                                                                }
                                                                                                if (callSite == false) break block71;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5z_0.a(matchException);
                                                                                            }
                                                                                            Object[] objectArray = new Object[2];
                                                                                            objectArray[1] = _5y_0.class;
                                                                                            objectArray[0] = l8;
                                                                                            callSite = _5z_0.c("\u00c1", (Object)((_5y_0)((Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("N", -8555918789909391276L, (long)l3), -8555824621683192879L, (long)l3), (Object)objectArray, -8554803917137981466L, (long)l3))), -8548393826305063320L, (long)l3);
                                                                                            if (n != 0) break block73;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5z_0.a(matchException);
                                                                                        }
                                                                                        if (callSite != false) break block74;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5z_0.a(matchException);
                                                                                    }
                                                                                    callSite = _5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), -8556497305607410865L, (long)l3);
                                                                                    if (n != 0) break block72;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5z_0.a(matchException);
                                                                                }
                                                                                if (callSite == false) break block71;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5z_0.a(matchException);
                                                                            }
                                                                        }
                                                                        callSite = _5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), (Object)_5z_0.c("N", -8548536248608603020L, (long)l3), -8555413893537461416L, (long)l3), (Object)_5z_0.c("N", -8556594289288941099L, (long)l3), -8548623032942860401L, (long)l3);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5z_0.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (n != 0) break block72;
                                                                                                if (callSite == false) break block71;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5z_0.a(matchException);
                                                                                            }
                                                                                            callSite = _5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), -8555321278866407788L, (long)l3), -8549391298005818987L, (long)l3), (Object)_5z_0.c("N", -8548017731797201990L, (long)l3), -8548623032942860401L, (long)l3);
                                                                                            if (n != 0) break block72;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5z_0.a(matchException);
                                                                                        }
                                                                                        if (callSite != false) break block71;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5z_0.a(matchException);
                                                                                    }
                                                                                    callSite = _5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), -8548511462610901515L, (long)l3), -8548817714344949250L, (long)l3), -8548787606973767472L, (long)l3), (Object)_5z_0.c("N", -8555648008894050130L, (long)l3), -8549021932601123637L, (long)l3);
                                                                                    if (n != 0) break block72;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5z_0.a(matchException);
                                                                                }
                                                                                if (callSite != false) break block71;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5z_0.a(matchException);
                                                                            }
                                                                            z_02 = this;
                                                                            if (n != 0) break block70;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5z_0.a(matchException);
                                                                        }
                                                                        if (_5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)z_02, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), -8548511462610901515L, (long)l3), (Object)_5z_0.c("N", -8555537828680863848L, (long)l3), -8548156511639375493L, (long)l3) != null) break block71;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5z_0.a(matchException);
                                                                    }
                                                                    _5z_0.c("\u00da", (Object)this, (boolean)_5z_0.a("k", 4883, (long)(0x278A2E8147AF0554L ^ l3)), -8548922676701857182L, (long)l3);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5z_0.a(matchException);
                                                                }
                                                            }
                                                            z_02 = this;
                                                        }
                                                        callSite = _5z_0.c("\u00a5", (Object)z_02, -8548922676701857182L, (long)l3);
                                                    }
                                                    try {
                                                        try {
                                                            if (n != 0) break block75;
                                                            if (callSite == false) break block76;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5z_0.a(matchException);
                                                        }
                                                        callSite = _5z_0.c("\u00a5", (Object)this, -8548190601283351337L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5z_0.a(matchException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (n != 0) break block77;
                                                        if (callSite != -1) break block78;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5z_0.a(matchException);
                                                    }
                                                    _5z_0.c("\u00da", (Object)this, (int)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), -8555321278866407788L, (long)l3), -8549270739694806394L, (long)l3), -8548190601283351337L, (long)l3);
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5z_0.a(matchException);
                                                }
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = _5z_0.c("N", -8548017731797201990L, (long)l3);
                                            objectArray[0] = l7;
                                            callSite = _5z_0.c("\u00d3", (Object)objectArray, -8556835516629466615L, (long)l3);
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block79;
                                                if (callSite != false) break block80;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5z_0.a(matchException);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l2;
                                            _5z_0.c("\u00c1", (Object)this, (Object)objectArray, -8556768001691799386L, (long)l3);
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5z_0.a(matchException);
                                        }
                                    }
                                    callSite = _5z_0.c("\u00a5", (Object)this, -8556065480165878916L, (long)l3);
                                }
                                try {
                                    try {
                                        if (n != 0) break block81;
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l6;
                                        if (callSite >= _5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)this, -8555976463087921423L, (long)l3), (Object)objectArray, -8555640765081105750L, (long)l3)) break block82;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5z_0.a(matchException);
                                    }
                                    _5z_0 z_04 = this;
                                    _5z_0.c("\u00da", (Object)z_04, (int)(_5z_0.c("\u00a5", (Object)z_04, -8556065480165878916L, (long)l3) + true), -8556065480165878916L, (long)l3);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _5z_0.a(matchException);
                                }
                            }
                            callSite = _5z_0.c("\u00a5", (Object)this, -8549491527048992522L, (long)l3);
                        }
                        try {
                            try {
                                if (n != 0) break block83;
                                if (callSite != false) break block84;
                            }
                            catch (MatchException matchException) {
                                throw _5z_0.a(matchException);
                            }
                            _5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556172850162948884L, (long)l3), (Object)_5z_0.c("\u00a5", (Object)_5z_0.c("\u00a5", (Object)this, -8555713452763947785L, (long)l3), -8556386361344198222L, (long)l3), (Object)_5z_0.c("N", -8556225170862728226L, (long)l3), -8554792248386678978L, (long)l3);
                            _5z_0.c("\u00da", (Object)this, (boolean)_5z_0.a("k", 4883, (long)(0x278A2E8147AF0554L ^ l3)), -8549491527048992522L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _5z_0.a(matchException);
                        }
                    }
                    try {
                        z_0 = this;
                        if (n != 0) break block85;
                        callSite = _5z_0.c("\u00c1", (Object)_5z_0.c("\u00a5", (Object)z_0, -8556017287121721115L, (long)l3), (long)l5, -8548103983824963537L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5z_0.a(matchException);
                    }
                }
                try {
                    block86: {
                        try {
                            if (callSite == false) break block86;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _5z_0.c("\u00c1", (Object)this, (Object)objectArray, -8548283051221635780L, (long)l3);
                            if (n == 0) break block76;
                        }
                        catch (MatchException matchException) {
                            throw _5z_0.a(matchException);
                        }
                    }
                    z_0 = this;
                }
                catch (MatchException matchException) {
                    throw _5z_0.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _5z_0.c("\u00c1", (Object)z_0, (Object)objectArray, -8556768001691799386L, (long)l3);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5z_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5z_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

