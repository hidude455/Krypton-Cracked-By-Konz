/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_1792
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6q_0;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9j_0;
import dev.krypton._9o;
import dev.krypton._9r;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1792;

/*
 * Renamed from dev.krypton.5u
 */
public class _5u_0
extends _6x_0 {
    private final _9E cfr_renamed_3;
    private final _9j_0 cfr_renamed_4;
    private final _9r cfr_renamed_1;
    private final _92 cfr_renamed_7;
    private int cfr_renamed_9;
    private int cfr_renamed_6;
    private boolean cfr_renamed_8;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    private void cfr_renamed_429(Object[] objectArray) {
        Object[] objectArray2;
        _5u_0 u_0;
        long l2;
        block11: {
            long l3;
            block12: {
                Object object;
                CallSite callSite;
                long l4;
                block9: {
                    _4w[] wArray;
                    block10: {
                        l2 = (Long)objectArray[0];
                        long l5 = l2 = b ^ l2;
                        l4 = l5 ^ 0x197C847CB1C9L;
                        long l6 = l5 ^ 0x1C78F4BA0260L;
                        l3 = l5 ^ 0x6F190F2FE820L;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                callSite = _5u_0.c("E", (Object)this, -8082284231842817072L, (long)l2);
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l6;
                                object = _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, -8084143335493191370L, (long)l2), (Object)objectArray3, -8084792962931473241L, (long)l2);
                                if (wArray != null) break block9;
                                if (callSite >= object) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _5u_0.a(matchException);
                            }
                            _5u_0 u_02 = this;
                            _5u_0.c("\u00fb", (Object)u_02, (int)(_5u_0.c("E", (Object)u_02, -8082284231842817072L, (long)l2) + true), -8082284231842817072L, (long)l2);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _5u_0.a(matchException);
                        }
                    }
                    try {
                        u_0 = this;
                        objectArray2 = wArray;
                        if (l2 <= 0L) break block11;
                        if (objectArray2 != null) break block12;
                        callSite = _5u_0.c("E", (Object)u_0, -8082716809453286924L, (long)l2);
                        object = -1;
                    }
                    catch (MatchException matchException) {
                        throw _5u_0.a(matchException);
                    }
                }
                try {
                    if (callSite != object) {
                        Object[] objectArray4 = new Object[2];
                        objectArray4[1] = l4;
                        objectArray4[0] = (int)_5u_0.c("E", (Object)this, -8082716809453286924L, (long)l2);
                        _5u_0.c("\u00a3", (Object)objectArray4, -8084681495924538013L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw _5u_0.a(matchException);
                }
                u_0 = this;
            }
            Object[] objectArray5 = new Object[1];
            objectArray2 = objectArray5;
            objectArray5[0] = l3;
        }
        _5u_0.c("\u00e3", (Object)u_0, (Object)objectArray2, -8083414952446370938L, (long)l2);
    }

    private void cfr_renamed_175(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5u_0.c("\u00fb", (Object)this, (int)_5u_0.a("y", 6653, (long)(0x3B6897728B3E2903L ^ l2)), 8160308725654009631L, (long)l2);
        _5u_0.c("\u00fb", (Object)this, (int)_5u_0.a("y", 21254, (long)(0x4A880160F22E3FFL ^ l2)), 8160139069327762747L, (long)l2);
        _5u_0.c("\u00fb", (Object)this, (boolean)_5u_0.a("y", 21254, (long)(0x4A880160F22E3FFL ^ l2)), 8158396413189726989L, (long)l2);
    }

    public _5u_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x2D61BC133111L;
        long l5 = l3 ^ 0x6513EE5A8CB7L;
        long l6 = l3 ^ 0x7573DC93F524L;
        long l7 = l3 ^ 0x4F6E078BF5E6L;
        long l8 = l7 >>> 8;
        int n = (int)(l7 << 56 >>> 56);
        long l9 = l3 ^ 0x332B791904DEL;
        long l10 = l3 ^ 0x37ACFF8B3245L;
        long l11 = l3 ^ 0x2CEBEA3DEBACL;
        long l12 = l3 ^ 0x3DB3F2C7B83L;
        int n2 = (int)(l12 >>> 32);
        int n3 = (int)(l12 << 32 >>> 56);
        int n4 = (int)(l12 << 40 >>> 40);
        long l13 = l3 ^ 0x665F28EF607AL;
        super((int)_5u_0.a("y", 28796, (long)(0xE67091D16569C42L ^ l2)), -1, (_4r)((Object)_5u_0.c("r", -5916085121476488444L, (long)l2)), l9);
        this.cfr_renamed_3 = new _9E((int)_5u_0.a("y", 19, (long)(0x39B7C1C0E36EC26L ^ l2)), l4, (Enum)((Object)_5u_0.c("r", -5910458847684139743L, (long)l2)), _6q_0.class);
        this.cfr_renamed_4 = new _9j_0((int)_5u_0.a("y", 27563, (long)(0x46F1449AAA138791L ^ l2)), n2, (byte)n3, -1, n4, false);
        this.cfr_renamed_1 = new _9r((int)_5u_0.a("y", 669, (long)(0x2FA912C44C906EA9L ^ l2)), true, l5);
        this.cfr_renamed_7 = new _92((int)_5u_0.a("y", 14831, (long)(0x6F96FC8B01DCD5D3L ^ l2)), 0.0, l6, 3.0, 0.0, 1.0);
        _5u_0.c("\u00fb", (Object)this, (int)_5u_0.a("y", 10080, (long)(0xC2535A110D74B5DL ^ l2)), -5909199593804698658L, (long)l2);
        _5u_0.c("\u00fb", (Object)this, (boolean)_5u_0.a("y", 5833, (long)(0x585DA47656DE7AF2L ^ l2)), -5910691274830282804L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> this.cfr_renamed_9(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l8;
        _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, -5908833140091566261L, (long)l2), (Object)objectArray, -5910719529063344333L, (long)l2);
        CallSite callSite = _5u_0.c("E", (Object)this, -5916181995049706724L, (long)l2);
        CallSite callSite2 = _5u_0.c("E", (Object)this, -5916122900286138611L, (long)l2);
        _5u_0.c("\u00a3", (Object)callSite2, -5910510063740969852L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l13);
        objectArray2[1] = (int)((byte)n);
        objectArray2[0] = l8;
        _5u_0.c("\u00e3", (Object)callSite, (Object)objectArray2, -5910719529063344333L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = new _95[]{_5u_0.c("E", (Object)this, -5910370807052172670L, (long)l2), _5u_0.c("E", (Object)this, -5908833140091566261L, (long)l2), _5u_0.c("E", (Object)this, -5916122900286138611L, (long)l2), _5u_0.c("E", (Object)this, -5916181995049706724L, (long)l2)};
        objectArray3[0] = l11;
        _5u_0.c("\u00e3", (Object)this, (Object)objectArray3, -5909043659657771430L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5u_0.class, 60);
                _5u_0.b = l.a(3394110314857300551L, 8785319866624643013L, MethodHandles.lookup().lookupClass()).a(180863210289665L);
                _5u_0.j = new Object[74];
                _5u_0.k = new String[74];
                _5u_0.b();
                _5u_0.f = new HashMap<K, V>(13);
                var0 = _5u_0.b ^ 119878453995061L;
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
                var6_5 = "p\u00d8\u0019\u001c+\u0096AM\u0091\u00ff\u00ac\u0091d\u00b5\u0097\u00a1\u00beO\u00d1\u0000\u00f5\u0082+\u00c80F\u009ab\u0093\u00bbD\n\u0018\u0006\u0019h\u00d9\u0083\u00cb\u0007\u00f1\u008d\u00aaK?\u00fa\f\u00c3 EvE6\u00cdE\u001d}\u009ay;X\u008f\u00a4\u00e9";
                var7_6 = "p\u00d8\u0019\u001c+\u0096AM\u0091\u00ff\u00ac\u0091d\u00b5\u0097\u00a1\u00beO\u00d1\u0000\u00f5\u0082+\u00c80F\u009ab\u0093\u00bbD\n\u0018\u0006\u0019h\u00d9\u0083\u00cb\u0007\u00f1\u008d\u00aaK?\u00fa\f\u00c3 EvE6\u00cdE\u001d}\u009ay;X\u008f\u00a4\u00e9".length();
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
                    var6_5 = "\u0099--\u00cd\u00d8+D_\u001e\u00f3Ft\u00db\u009e\u00ef\u00c2";
                    var7_6 = "\u0099--\u00cd\u00d8+D_\u001e\u00f3Ft\u00db\u009e\u00ef\u00c2".length();
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
        _5u_0.d = var8_3;
        _5u_0.e = new Integer[10];
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
            case 0 -> 16;
            case 1 -> 19;
            case 2 -> 36;
            case 3 -> 38;
            case 4 -> 41;
            case 5 -> 52;
            case 6 -> 42;
            case 7 -> 54;
            case 8 -> 61;
            case 9 -> 22;
            case 10 -> 62;
            case 11 -> 34;
            case 12 -> 57;
            case 13 -> 21;
            case 14 -> 7;
            case 15 -> 8;
            case 16 -> 23;
            case 17 -> 47;
            case 18 -> 29;
            case 19 -> 49;
            case 20 -> 55;
            case 21 -> 24;
            case 22 -> 13;
            case 23 -> 25;
            case 24 -> 46;
            case 25 -> 45;
            case 26 -> 43;
            case 27 -> 6;
            case 28 -> 32;
            case 29 -> 44;
            case 30 -> 26;
            case 31 -> 48;
            case 32 -> 15;
            case 33 -> 59;
            case 34 -> 12;
            case 35 -> 14;
            case 36 -> 27;
            case 37 -> 50;
            case 38 -> 18;
            case 39 -> 51;
            case 40 -> 9;
            case 41 -> 37;
            case 42 -> 56;
            case 43 -> 33;
            case 44 -> 40;
            case 45 -> 31;
            case 46 -> 30;
            case 47 -> 0;
            case 48 -> 5;
            case 49 -> 58;
            case 50 -> 2;
            case 51 -> 4;
            case 52 -> 63;
            case 53 -> 60;
            case 54 -> 1;
            case 55 -> 20;
            case 56 -> 28;
            case 57 -> 10;
            case 58 -> 3;
            case 59 -> 11;
            case 60 -> 53;
            case 61 -> 35;
            case 62 -> 17;
            default -> 39;
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
        _5u_0.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = ";cGK\u0002#&vE\n\u0007\u007fjs";
        objectArray[1] = Integer.TYPE;
        _5u_0.k[1] = "java/lang/Integer";
        objectArray[2] = Boolean.TYPE;
        _5u_0.k[2] = "java/lang/Boolean";
        objectArray[3] = "Cq\u0012Z\u001b56Q\u0019U\nzW_\u0012^\u000e #";
        objectArray[4] = Void.TYPE;
        _5u_0.k[4] = "java/lang/Void";
        objectArray[5] = ":4m\u0000Ft'!oAC(gc";
        objectArray[6] = "CR\u0013{_\u00066r\u0018tNIW|\u0013\u007fJ\u0013#";
        objectArray[7] = "w\u0002gH\u0017\u0016j\u0017e\t\u0012J+\u001d";
        objectArray[8] = "FU\u0006#e\u00053u\r,tJR{\u0006'p\u0010&";
        objectArray[9] = "@hQ<Z\u000b]}S}_W\u001d8";
        objectArray[10] = "V\"\\\u0001F1#\u0002W\u000eW~B\f\\\u0005S$6";
        objectArray[11] = "PPX4\u0002\u007fMEZu\u0007#\r_";
        objectArray[12] = "7HO[zo*]M\u001a\u007f3jh";
        objectArray[13] = "\u0015JN\u007f(\u0003\b_L>-_H]";
        objectArray[14] = "\u0012G\u0004t\u000e\u000f\u000fR\u00065\u000bSBP";
        objectArray[15] = "c:LQz\u0002~/N\u0010\u007f^1'";
        objectArray[16] = "?\fZmN6J,Qb_y+\"Zi[#_";
        objectArray[17] = "eXe\u001cv\u0011{P\u007fS\u0017\u0006e\\p\t+";
        objectArray[18] = "Sv\u0017R\u001aiXy\u0006\u001d{gSr\u0002G";
        objectArray[19] = "%[/BV\u00028N-\u0003S^wO";
        objectArray[20] = "mU\u0003\rHc\u0018u\b\u0002Y,y{\u0003\t]v\r";
        objectArray[21] = "\\k\u0019\u0014#\u001aWd\b[O\u0019Yf\n\u0014c";
        objectArray[22] = "f\bG\tXPf\bPUT_|CPKTJ{2\u0005\u0014\u0003";
        objectArray[23] = "|>\u0007\t\u0015\u0002|>\u0010U\u0019\rfu\u0010K\u0019\u0018a\u0004B\u0011M\\";
        objectArray[24] = "\u0007dKH@D\u0007d\\\u0014LK\u001d/\\\nL^\u001a^\u000eT\u0014\u001a";
        objectArray[25] = "\u0002H7lNvwh<c_9\u0016f7h[cb";
        objectArray[26] = "<bE\u001e5X<bRB9W&)R\\9B!X\u0000\u0006n\u0000";
        objectArray[27] = "u\u001d8IxU\u0000=3Fi\u001aa38Mm@\u0015";
        objectArray[28] = Long.TYPE;
        _5u_0.k[28] = "java/lang/Long";
        objectArray[29] = "o\u0000P_L@o\u0000G\u0003@OuKG\u001d@Zr:\u0017@\u0011";
        objectArray[30] = "#\u0011o![1>\u0004m`^ms2";
        objectArray[31] = "\u0019\u0001\u001a}\u007f\u001cl!\u0011rnS\r/\u001ayj\ty";
        objectArray[32] = "M9/:\u000e$M98f\u0002+Wr8x\u0002>P\u0003l U";
        objectArray[33] = "H^\frA*=~\u0007}Pe\\p\fvT?(";
        objectArray[34] = "^h\u0002G\u0017%Ug\u0013\b|'Ad";
        objectArray[35] = "%P%8R>%P2d^1?\u001b2z^$8j`$\to";
        objectArray[36] = "):%H\u001e~4/'\t\u001b\"t\u0014";
        objectArray[37] = "M->|Ou8\r5s^:Y\u0003>xZ`-";
        objectArray[38] = "bu{kpt\u0017Upda;v[{oea\u0002";
        objectArray[39] = "c\u0002\u000el=\n`\u001e\u0000#D\u0016`\u001f\u0000{($7RY,D\u001co\u0012\u001a`;\fm\u0000\u001b\u001c$Bp^\u0010{#\u00196\u0004`&:\fa\t\u0018dy\u001epc";
        objectArray[40] = "]z\u0011\u0014&.W`ApzM3rA\f.lNm\u0013\u0015z\u0010\tuP\u001c!hK6B\rK";
        objectArray[41] = "aloes+fhm/NTds)6*\u0011aloes+fhm/";
        objectArray[42] = "{`x\u0006U/qz(b\u0000\u0011%x8\u001bEii~x\u0019";
        objectArray[43] = "E'z9x2O=*]*\f\u0012h46s3B+&1";
        objectArray[44] = "E2\u001bY8XH<\u0018W]TI!CY1f\u001ab\u001e\u0005g1\u001dcSU;\u000eM AR]";
        objectArray[45] = ">]\u0018k\t=4GH\u000f_\u0003i\u0012Vd\u0002<9QDc";
        objectArray[46] = "\u0005\u0006eZ\f\u0006I\u0000%Xq@5\u0016u_\u0014\u0002H\t'F@~\fQkH\u0017A\\\u0012yOq";
        objectArray[47] = "u4v}\u000fu 3|{3\"\u001fuq>Vgbj#'\u0002\u001b%r`.Ycg1r?3";
        objectArray[48] = "\u001dtf;y\u0007\u0017n6_)9Jzg-+A\u0015n$d";
        objectArray[49] = "N*\u0011\u001d\u001e&@,\tAfn\u007fs\u0011W\u001d/\u0019~\u0014B\u001eTFnM^Y,\u0019z\u000e\u0017f";
        objectArray[50] = "\b\u007f\u0004^?'\u0003/\\\u0004X-\u000ej@U\":%t[r%3\u0007\u0013Q\u000e2*\u0001u\rF?4c\u007f\u0007^%5\u0005#OS;W";
        objectArray[51] = "H\"\u001at;cO&\u0018>\u0006\u0010Y'F+o%E0!\"\u007fb\u001ef\u001b%{`T";
        objectArray[52] = "\u0011 KB.\u0011\u000b%\u0018\u0001I\u001e\u00135M\u0013\u001eILi\u0013\u007f)A\u000feY\u0018.\u001aI?";
        objectArray[53] = "K\"j\u0001LSP(/\u0003<\u0001(*<\u0007YCU5n\u001e\r?\u0011,m\t\u0003GN8.@<";
        objectArray[54] = "j\u000f\u00153\u0010[<\f\u00164kRZ\u0018\u0004$\u000e\u001f'\u0007V=Zcc\u001eU*T\u001b<\n\u0016ck";
        objectArray[55] = "}:\u0006\u001e\u00046)|AF|qC:U\u0001\u00191>%\u0007\u0018MM}:\u0006\u001e\u00046)|AF|";
        objectArray[56] = "k&!s|\f='6%\u0011\u0011o<$&V\u0001\u0006a&tcP~>27*ok&!s|\f='6%\u0011";
        objectArray[57] = "\u0016fK\u001e*<\fc\u0018]M3\u0014sMO\u001adJ$\u0015#(2\u0015zCD,e\u0015|";
        objectArray[58] = "hb*+S\t>a),(\u0000Xu;<MM%ji%\u00191?19}\u0016O9~,/(";
        objectArray[59] = "pI\"t@`zSr\u0010\u001c\u001a\u001eArlH\"c^ u\u001c^$Fc|G&f\u0005qm-";
        objectArray[60] = "\u000evG(Q{\u0004l\u0017L\u0006EPi\u0006'G}\u0006j\u0005 ";
        objectArray[61] = "}CG$cPmAU%\u001fJ\u007f]V9sx,\u0019\ro\u001f\u0016m\u001eDagIy]\r^";
        objectArray[62] = "\u001a2\u00152GwO5\u001f4{ pi\u0004oF~\u0011s\u0001<\u0005";
        objectArray[63] = "akc0Ez<>u#9/gc}1n|66)]^$|cef\u0003qjp";
        objectArray[64] = "\u001f\u001b\u0012\t(4\u0005\u001eAJO;\u001d\u000e\u0014X\u0018lC]I4!4\u0012\u0013\tM\"(\u001c\\";
        objectArray[65] = "U\u0004T\u007f3d_\u001e\u0004\u001bbZ\u0000\n\u0004t<;[N\u001ag";
        objectArray[66] = "\u0010cHB\fZ\u001ay\u0018&PdO)\u0015\u0017\u0019\u0016A/\rK";
        objectArray[67] = "s&j0\u0018\u0007\"nlgr-\u0005\u0013A@.fs&j0\u0018\u0007\"nlg";
        objectArray[68] = "^?mt_\u000bZhmr5\tV,mwY;\u0005i5,5\u000b^*`l\u000eV\u000b<s\u0010\u000f\u0012D<ghMQV-\r";
        objectArray[69] = "Q5%\u0011E\u0001Ub%\u0017/\u0003Y&%\u0012C1\u000fcxI\u001ffU5}\u0012J\u000fX;~\u001c/";
        objectArray[70] = ">Fc/&O>N28F\u001fFPb!#S;O08w/\u007fV3/yW BpfF";
        objectArray[71] = "G{2,}M\u001fj+2LO{p?5)\t\u0006om,}uBvn;s\r\u001db-rL";
        objectArray[72] = "tn?]\u0007&/*!NezOh?N\u0000;2wmWTGv/!Y\u0003x&l3^e";
        Object[] objectArray2 = objectArray;
        objectArray[73] = "M\\20S!\u0015M+.b!qW?)\u0007e\fHm0S\u0019KP.9\ba\t\u0013<(b";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == '\u00fb' || c == 'r' || c == 't') {
                field = _5u_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5u_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5u_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5u" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5u_0.e(l2, l3);
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
                clazz3 = _5u_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5u_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5u_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5u_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5u_0.f(1326850153687460L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5u_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5u_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5u_0.f(1326850153687460L, 0L);
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
            int n = _5u_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5u_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5u_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5u_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5u_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5u_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/5u" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x41C8;
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
                throw new RuntimeException("dev/krypton/5u", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5u_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5u_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5u_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5u_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5u_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5u_0.c(clazz3, string2, clazz2)) != null) {
                    _5u_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5u_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5u_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5u_0.f(1326850153687460L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_6(_9o var1_1) {
        block79: {
            block81: {
                block80: {
                    block78: {
                        block76: {
                            block77: {
                                block74: {
                                    block75: {
                                        block73: {
                                            block72: {
                                                block71: {
                                                    block70: {
                                                        block69: {
                                                            block67: {
                                                                block68: {
                                                                    block66: {
                                                                        block64: {
                                                                            block65: {
                                                                                v0 = var2_2 = _5u_0.b ^ 35131457769640L;
                                                                                var4_3 = v0 ^ 123631013896863L;
                                                                                var6_4 = v0 ^ 61047928045854L;
                                                                                var8_5 = v0 ^ 40544665981360L;
                                                                                var10_6 = v0 ^ 8612209696631L;
                                                                                var12_7 = v0 ^ 55233241027913L;
                                                                                var14_8 = v0 ^ 137821510716396L;
                                                                                var16_9 = v0 ^ 132753297143491L;
                                                                                var18_10 = _3s.cfr_renamed_5();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v1 /* !! */  = _5u_0.c("E", (Object)this, (long)-8759753492083354534L, (long)var2_2);
                                                                                                if (var18_10 != null) break block64;
                                                                                                if (v1 /* !! */  == false) break block65;
                                                                                            }
                                                                                            catch (MatchException v2) {
                                                                                                throw _5u_0.a(v2);
                                                                                            }
                                                                                            v1 /* !! */  = _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, (long)-8758464886570533733L, (long)var2_2), (long)var14_8, (long)-8759703958527604631L, (long)var2_2);
                                                                                            if (var18_10 != null) break block64;
                                                                                        }
                                                                                        catch (MatchException v3) {
                                                                                            throw _5u_0.a(v3);
                                                                                        }
                                                                                        if (v1 /* !! */  == false) break block65;
                                                                                    }
                                                                                    catch (MatchException v4) {
                                                                                        throw _5u_0.a(v4);
                                                                                    }
                                                                                    v5 = new Object[1];
                                                                                    v5[0] = var10_6;
                                                                                    _5u_0.c("\u00e3", (Object)this, (Object)v5, (long)-8761453986731070898L, (long)var2_2);
                                                                                    return;
                                                                                }
                                                                                catch (MatchException v6) {
                                                                                    throw _5u_0.a(v6);
                                                                                }
                                                                            }
                                                                            v1 /* !! */  = (CallSite)false;
                                                                        }
                                                                        var19_11 /* !! */  = v1 /* !! */ ;
                                                                        try {
                                                                            v7 = new Object[1];
                                                                            v7[0] = var12_7;
                                                                            v8 = _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, (long)-8760558906770577132L, (long)var2_2), (Object)v7, (long)-8760140511971676273L, (long)var2_2);
                                                                            v9 = _5u_0.c("r", (long)-8759554085903413577L, (long)var2_2);
                                                                            if (var18_10 != null) break block66;
                                                                            if (v8 == v9) {
                                                                            }
                                                                            ** GOTO lbl57
                                                                        }
                                                                        catch (MatchException v10) {
                                                                            throw _5u_0.a(v10);
                                                                        }
                                                                        var19_11 /* !! */  = (CallSite)true;
                                                                        try {
                                                                            try {
                                                                                if (var18_10 == null) break block67;
lbl57:
                                                                                // 2 sources

                                                                                v11 = this;
                                                                                if (var18_10 != null) break block68;
                                                                            }
                                                                            catch (MatchException v12) {
                                                                                throw _5u_0.a(v12);
                                                                            }
                                                                            v13 = new Object[1];
                                                                            v13[0] = var12_7;
                                                                            v8 = _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)v11, (long)-8760558906770577132L, (long)var2_2), (Object)v13, (long)-8760140511971676273L, (long)var2_2);
                                                                            v9 = _5u_0.c("r", (long)-8761367704450238896L, (long)var2_2);
                                                                        }
                                                                        catch (MatchException v14) {
                                                                            throw _5u_0.a(v14);
                                                                        }
                                                                    }
                                                                    if (v8 != v9) break block67;
                                                                    v11 = this;
                                                                }
                                                                v15 = new Object[1];
                                                                v15[0] = var4_3;
                                                                v16 = new Object[2];
                                                                v16[1] = var6_4;
                                                                v16[0] = (int)_5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)v11, (long)-8761330216106300195L, (long)var2_2), (Object)v15, (long)-8761549644936114102L, (long)var2_2);
                                                                var19_11 /* !! */  = _5u_0.c("\u00a3", (Object)v16, (long)-8758757531166398251L, (long)var2_2);
                                                            }
                                                            try {
                                                                if (var19_11 /* !! */  == false) {
                                                                    return;
                                                                }
                                                            }
                                                            catch (MatchException v17) {
                                                                throw _5u_0.a(v17);
                                                            }
                                                            try {
                                                                try {
                                                                    v18 = _5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8760062013052883475L, (long)var2_2);
                                                                    if (var18_10 != null) break block69;
                                                                    if (v18 != null) {
                                                                    }
                                                                    ** GOTO lbl121
                                                                }
                                                                catch (MatchException v19) {
                                                                    throw _5u_0.a(v19);
                                                                }
                                                                v18 = _5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8760062013052883475L, (long)var2_2);
                                                            }
                                                            catch (MatchException v20) {
                                                                throw _5u_0.a(v20);
                                                            }
                                                        }
                                                        var21_12 = v18;
                                                        try {
                                                            try {
                                                                v21 = var21_12;
                                                                if (var18_10 != null) break block70;
                                                                if (v21 instanceof class_1657) {
                                                                }
                                                                ** GOTO lbl121
                                                            }
                                                            catch (MatchException v22) {
                                                                throw _5u_0.a(v22);
                                                            }
                                                            v21 = var21_12;
                                                        }
                                                        catch (MatchException v23) {
                                                            throw _5u_0.a(v23);
                                                        }
                                                    }
                                                    var20_13 = (class_1657)v21;
                                                    try {
                                                        if (var18_10 == null) break block71;
lbl121:
                                                        // 3 sources

                                                        return;
                                                    }
                                                    catch (MatchException v24) {
                                                        throw _5u_0.a(v24);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        v25 = _5u_0.c("\u00e3", (Object)var20_13, (long)-8760542890061076687L, (long)var2_2);
                                                        if (var18_10 != null) break block72;
                                                        if (v25 == false) break block73;
                                                    }
                                                    catch (MatchException v26) {
                                                        throw _5u_0.a(v26);
                                                    }
                                                    v27 = new Object[2];
                                                    v27[1] = var8_5;
                                                    v27[0] = var20_13;
                                                    v25 = _5u_0.c("\u00a3", (Object)v27, (long)-8759967443029494780L, (long)var2_2);
                                                }
                                                catch (MatchException v28) {
                                                    throw _5u_0.a(v28);
                                                }
                                            }
                                            try {
                                                if (var18_10 != null) break block74;
                                                if (v25 == false) break block75;
                                            }
                                            catch (MatchException v29) {
                                                throw _5u_0.a(v29);
                                            }
                                        }
                                        return;
                                    }
                                    v25 = _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, (long)-8758464886570533733L, (long)var2_2), (long)var14_8, (long)-8759703958527604631L, (long)var2_2);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var18_10 != null) break block76;
                                                if (v25 == false) break block77;
                                            }
                                            catch (MatchException v30) {
                                                throw _5u_0.a(v30);
                                            }
                                            v25 = _5u_0.c("E", (Object)this, (long)-8761659336805302200L, (long)var2_2);
                                            if (var18_10 != null) break block76;
                                        }
                                        catch (MatchException v31) {
                                            throw _5u_0.a(v31);
                                        }
                                        if (v25 != -1) break block77;
                                    }
                                    catch (MatchException v32) {
                                        throw _5u_0.a(v32);
                                    }
                                    _5u_0.c("\u00fb", (Object)this, (int)_5u_0.c("\u00e3", (Object)_5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8760266702253195296L, (long)var2_2), (long)-8758865986955826056L, (long)var2_2), (long)-8761743239259374152L, (long)var2_2), (long)-8761659336805302200L, (long)var2_2);
                                }
                                catch (MatchException v33) {
                                    throw _5u_0.a(v33);
                                }
                            }
                            v34 = new Object[2];
                            v34[1] = var16_9;
                            v34[0] = (Predicate<class_1792>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 5(net.minecraft.class_1792 ), (Lnet/minecraft/class_1792;)Z)();
                            v25 = _5u_0.c("\u00a3", (Object)v34, (long)-8758707190997666365L, (long)var2_2);
                        }
                        try {
                            try {
                                if (var18_10 != null) break block78;
                                if (v25 == false) break block79;
                            }
                            catch (MatchException v35) {
                                throw _5u_0.a(v35);
                            }
                            _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8758614369414763122L, (long)var2_2), (Object)_5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8760266702253195296L, (long)var2_2), (Object)_5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8760062013052883475L, (long)var2_2), (long)-8760962785932713571L, (long)var2_2);
                            _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)_5u_0.c("E", (Object)this, (long)-8760417356667140928L, (long)var2_2), (long)-8760266702253195296L, (long)var2_2), (Object)_5u_0.c("r", (long)-8760365465991094360L, (long)var2_2), (long)-8758883634573295877L, (long)var2_2);
                            v25 = _5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, (long)-8758464886570533733L, (long)var2_2), (long)var14_8, (long)-8759703958527604631L, (long)var2_2);
                        }
                        catch (MatchException v36) {
                            throw _5u_0.a(v36);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var18_10 != null) break block80;
                                if (v25 == false) break block79;
                            }
                            catch (MatchException v37) {
                                throw _5u_0.a(v37);
                            }
                            v38 = this;
                            if (var18_10 != null) break block81;
                        }
                        catch (MatchException v39) {
                            throw _5u_0.a(v39);
                        }
                        v25 = _5u_0.c("E", (Object)v38, (long)-8761659336805302200L, (long)var2_2);
                    }
                    catch (MatchException v40) {
                        throw _5u_0.a(v40);
                    }
                }
                try {
                    if (v25 == -1) break block79;
                    _5u_0.c("\u00fb", (Object)this, (boolean)_5u_0.a("y", (int)26274, (long)(1399129221844967693L ^ var2_2)), (long)-8759753492083354534L, (long)var2_2);
                    v38 = this;
                }
                catch (MatchException v41) {
                    throw _5u_0.a(v41);
                }
            }
            _5u_0.c("\u00fb", (Object)v38, (int)_5u_0.a("y", (int)21254, (long)(335774196040602792L ^ var2_2)), (long)-8761247351482510740L, (long)var2_2);
        }
    }

    private static boolean cfr_renamed_8(class_1792 class_17922) {
        return class_17922 instanceof class_1743;
    }

    private Boolean cfr_renamed_9(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x130864F1DE93L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _5u_0.c("r", -8542963858627102392L, (long)l2);
        return _5u_0.c("\u00a3", (boolean)_5u_0.c("\u00e3", (Object)_5u_0.c("E", (Object)this, -8542154442468743668L, (long)l2), (Object)objectArray, -8541475946830049941L, (long)l2), -8541861369475096831L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5u_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5u_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

