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
import dev.krypton._5D;
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

/*
 * Renamed from dev.krypton.5w
 */
public class _5w_0
extends _6x_0 {
    private final _9r cfr_renamed_7;
    private final _92 cfr_renamed_1;
    private final _92 cfr_renamed_2;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    public _5w_0(short s, int n, int n2) {
        long l2;
        long l3 = l2 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x4006816F2248L;
        long l5 = l3 ^ 0x5066B3A65BDBL;
        long l6 = l3 ^ 0x6A7B68BE5B19L;
        long l7 = l6 >>> 8;
        int n3 = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x163E162CAA21L;
        long l9 = l3 ^ 0x9FE85084553L;
        long l10 = l3 ^ 0x434A47DACE85L;
        super((int)_5w_0.a("e", 18311, (long)(0x2917B2BB3A1621AEL ^ l2)), -1, (_4r)((Object)_5w_0.c("\u00c5", 219960912400463017L, (long)l2)), l8);
        this.cfr_renamed_7 = new _9r((int)_5w_0.a("e", 20691, (long)(0x78BECA43058636F8L ^ l2)), true, l4);
        this.cfr_renamed_1 = new _92((int)_5w_0.a("e", 732, (long)(0x387DAB6CCB5964F6L ^ l2)), -180.0, l5, 180.0, 0.0, 0.1);
        this.cfr_renamed_2 = new _92((int)_5w_0.a("e", 13467, (long)(0x684976BD900752B3L ^ l2)), -180.0, l5, 180.0, 0.0, 0.1);
        CallSite callSite = _5w_0.c("n", (Object)this, 217119627734858831L, (long)l2);
        CallSite callSite2 = _5w_0.c("n", (Object)this, 219594759333079503L, (long)l2);
        _5w_0.c("\u00d3", (Object)callSite2, 216333541231964114L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n3);
        objectArray[0] = l7;
        _5w_0.c("X", (Object)callSite, (Object)objectArray, 219792016765050162L, (long)l2);
        CallSite callSite3 = _5w_0.c("n", (Object)this, 220022956167967783L, (long)l2);
        CallSite callSite4 = _5w_0.c("n", (Object)this, 219594759333079503L, (long)l2);
        _5w_0.c("\u00d3", (Object)callSite4, 216333541231964114L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> ((_9r)((Object)callSite4)).cfr_renamed_3(l10);
        objectArray2[1] = (int)((byte)n3);
        objectArray2[0] = l7;
        _5w_0.c("X", (Object)callSite3, (Object)objectArray2, 219792016765050162L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = new _95[]{_5w_0.c("n", (Object)this, 219594759333079503L, (long)l2), _5w_0.c("n", (Object)this, 217119627734858831L, (long)l2), _5w_0.c("n", (Object)this, 220022956167967783L, (long)l2)};
        objectArray3[0] = l9;
        _5w_0.c("X", (Object)this, (Object)objectArray3, 217295656938872786L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5w_0.class, 68);
                _5w_0.b = l.a(1535198685379466004L, -6834187417766099822L, MethodHandles.lookup().lookupClass()).a(13127663635145L);
                _5w_0.j = new Object[45];
                _5w_0.k = new String[45];
                _5w_0.b();
                _5w_0.f = new HashMap<K, V>(13);
                var0 = _5w_0.b ^ 55726404756026L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00aa\u00f2\u00c9V\u0014\u0098\u00dd\u00f7\u0012\u00c6\u00fft\u0005D\u00f9\u00ce";
                var7_6 = "\u00aa\u00f2\u00c9V\u0014\u0098\u00dd\u00f7\u0012\u00c6\u00fft\u0005D\u00f9\u00ce".length();
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
                    var6_5 = "wR\u001cl\u008dt\u00f1&\u00b1x\u0081\t+\u001c\u00be\u001b";
                    var7_6 = "wR\u001cl\u008dt\u00f1&\u00b1x\u0081\t+\u001c\u00be\u001b".length();
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
        _5w_0.d = var8_3;
        _5w_0.e = new Integer[4];
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
            case 0 -> 19;
            case 1 -> 31;
            case 2 -> 2;
            case 3 -> 41;
            case 4 -> 63;
            case 5 -> 1;
            case 6 -> 24;
            case 7 -> 10;
            case 8 -> 26;
            case 9 -> 38;
            case 10 -> 61;
            case 11 -> 59;
            case 12 -> 22;
            case 13 -> 20;
            case 14 -> 29;
            case 15 -> 15;
            case 16 -> 14;
            case 17 -> 27;
            case 18 -> 37;
            case 19 -> 44;
            case 20 -> 45;
            case 21 -> 4;
            case 22 -> 62;
            case 23 -> 48;
            case 24 -> 11;
            case 25 -> 17;
            case 26 -> 47;
            case 27 -> 52;
            case 28 -> 56;
            case 29 -> 25;
            case 30 -> 49;
            case 31 -> 36;
            case 32 -> 50;
            case 33 -> 0;
            case 34 -> 12;
            case 35 -> 58;
            case 36 -> 55;
            case 37 -> 35;
            case 38 -> 51;
            case 39 -> 28;
            case 40 -> 43;
            case 41 -> 34;
            case 42 -> 23;
            case 43 -> 5;
            case 44 -> 21;
            case 45 -> 40;
            case 46 -> 53;
            case 47 -> 8;
            case 48 -> 57;
            case 49 -> 42;
            case 50 -> 39;
            case 51 -> 32;
            case 52 -> 9;
            case 53 -> 6;
            case 54 -> 30;
            case 55 -> 3;
            case 56 -> 18;
            case 57 -> 54;
            case 58 -> 7;
            case 59 -> 33;
            case 60 -> 16;
            case 61 -> 46;
            case 62 -> 13;
            default -> 60;
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
        _5w_0.k[n3] = new String(cArray);
        return n3;
    }

    @_3i_0
    public void cfr_renamed_1(_9o o) {
        block20: {
            CallSite callSite;
            long l2;
            block18: {
                _5w_0 w_0;
                int n;
                long l3;
                block17: {
                    CallSite callSite2;
                    block15: {
                        long l4;
                        long l5;
                        block16: {
                            long l6 = l2 = b ^ 0x6FA28887B39L;
                            l5 = l6 ^ 0x72C09BFD50CAL;
                            l3 = l6 ^ 0x2B4E75F3928FL;
                            long l7 = l6 ^ 0x11592B1CEF1EL;
                            l4 = l6 ^ 0x5101E359CD92L;
                            long l8 = l6 ^ 0x3C4FB1C7ECF2L;
                            n = _7C.cfr_renamed_3();
                            Object[] objectArray = new Object[2];
                            objectArray[1] = _5D.class;
                            objectArray[0] = l7;
                            _5D d = (_5D)((Object)_5w_0.c("X", (Object)_5w_0.c("n", (Object)_5w_0.c("\u00c5", 6004442966039338L, (long)l2), 6133182271380813L, (long)l2), (Object)objectArray, 6246994710464813L, (long)l2));
                            try {
                                try {
                                    try {
                                        callSite2 = _5w_0.c("X", (Object)d, 6710358854417171L, (long)l2);
                                        if (n != 0) break block15;
                                        if (callSite2 == false) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5w_0.a(matchException);
                                    }
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l8;
                                    callSite2 = _5w_0.c("X", (Object)d, (Object)objectArray2, 7698671936903981L, (long)l2);
                                    if (n != 0) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw _5w_0.a(matchException);
                                }
                                if (callSite2 == false) break block16;
                            }
                            catch (MatchException matchException) {
                                throw _5w_0.a(matchException);
                            }
                            return;
                        }
                        try {
                            Object[] objectArray = new Object[3];
                            objectArray[2] = false;
                            objectArray[1] = l5;
                            objectArray[0] = true;
                            _5w_0.c("\u00d3", (Object)objectArray, 5771991110062019L, (long)l2);
                            w_0 = this;
                            if (n != 0) break block17;
                            callSite2 = _5w_0.c("X", (Object)_5w_0.c("n", (Object)w_0, 7663658525453016L, (long)l2), (long)l4, 6602889034229906L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _5w_0.a(matchException);
                        }
                    }
                    if (callSite2 == false) break block20;
                    w_0 = this;
                }
                CallSite callSite3 = _5w_0.c("X", (Object)_5w_0.c("n", (Object)_5w_0.c("n", (Object)w_0, 5676813989256595L, (long)l2), 7383164573273772L, (long)l2), 5913178978137045L, (long)l2);
                CallSite callSite4 = _5w_0.c("X", (Object)_5w_0.c("n", (Object)_5w_0.c("n", (Object)this, 5676813989256595L, (long)l2), 7383164573273772L, (long)l2), 6535270138326609L, (long)l2);
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                CallSite callSite5 = _5w_0.c("X", (Object)_5w_0.c("n", (Object)this, 7529443351443248L, (long)l2), (Object)objectArray, 7533064488189092L, (long)l2);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l3;
                callSite = _5w_0.c("X", (Object)_5w_0.c("n", (Object)this, 5716829245128536L, (long)l2), (Object)objectArray3, 7533064488189092L, (long)l2);
                try {
                    block19: {
                        try {
                            try {
                                if (n != 0) break block18;
                                if (callSite3 != callSite5) break block19;
                            }
                            catch (MatchException matchException) {
                                throw _5w_0.a(matchException);
                            }
                            if (callSite4 == callSite) break block20;
                        }
                        catch (MatchException matchException) {
                            throw _5w_0.a(matchException);
                        }
                    }
                    _5w_0.c("X", (Object)_5w_0.c("n", (Object)_5w_0.c("n", (Object)this, 5676813989256595L, (long)l2), 7383164573273772L, (long)l2), (float)callSite5, 7764803807463102L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5w_0.a(matchException);
                }
            }
            _5w_0.c("X", (Object)_5w_0.c("n", (Object)_5w_0.c("n", (Object)this, 5676813989256595L, (long)l2), 7383164573273772L, (long)l2), (float)callSite, 6066936727581372L, (long)l2);
        }
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "0-\\J!o0-K\u0016-`*fK\b-u-\u0017\u001bU|";
        objectArray[1] = "\u0016`q&FJ\u0016`fzJE\f+fdJP\u000bZ2<\u001d";
        objectArray[2] = ",\u000ew\u001e+]1\u001bu_.\u0001~\u0013";
        objectArray[3] = "c?Vp'Y~*T1\"\u00053\u001c";
        objectArray[4] = "LcAk:|9CJd+3XMAo/i,";
        objectArray[5] = Void.TYPE;
        _5w_0.k[5] = "java/lang/Void";
        objectArray[6] = "?u\u001c\u0006p\u001c\"`\u001eGu@ng";
        objectArray[7] = "hF\t#rnuS\u000bbw25Q";
        objectArray[8] = "\u001b\u0007.a0!\u0006\u0012, 5}FW";
        objectArray[9] = "mq3o[!\u0018Q8`Jny_3kN4\r";
        objectArray[10] = "T]\u001c\tt\u0018IH\u001eHqD\u0004J";
        objectArray[11] = ".p@K7R3eB\n2\u000es'";
        objectArray[12] = "\u0013\u0019V\u0016`pf9]\u0019q?\u00077V\u0012ues";
        objectArray[13] = "\u001b\"</c}\u0005*&`\u0002j\u001b&):>";
        objectArray[14] = "\b1s\u007fK?\u0003>b0*1\b5fj";
        objectArray[15] = "(n>\u001bq\u00035{<Zt_yO";
        objectArray[16] = "x!qd\u0013F\r\u0001zk\u0002\tl\u000fq`\u0006S\u0018";
        objectArray[17] = Boolean.TYPE;
        _5w_0.k[17] = "java/lang/Boolean";
        objectArray[18] = Float.TYPE;
        _5w_0.k[18] = "java/lang/Float";
        objectArray[19] = "4P\u0002QR\u0013Ap\t^C\\ ~\u0002UG\u0006T";
        objectArray[20] = "r*y\"$\u0006o?{c!Z$";
        objectArray[21] = "q\u0001Pk\u0016\u007fl\u0014R*\u0013#%V";
        objectArray[22] = Long.TYPE;
        _5w_0.k[22] = "java/lang/Long";
        objectArray[23] = "V\u0011\u0005\u0002'g#1\u000e\r6(B?\u0005\u00062r6";
        objectArray[24] = "0vt#\\\u001cbuh,7\u001b\f/`aP\\}vl`T";
        objectArray[25] = "[nFK{qS1JI\u000142c\nF:nBr\u0012Oc\u000bY5\u0007Gge\taD\u001d\u0001";
        objectArray[26] = "O9ak\u0014~\u0017o2iyj\u001bu1t\u0015XM7m.G\u000f\u001dtau\u0010q\u0017p6(y4\u0013n j\u0007jIi3\u0013";
        objectArray[27] = "\u001b\u0016A|l\t_\u0006\u00050\u000bK&\t\t#0\u0012V\u0018\u0011*iw\u001b\u0016A|l\t_\u0006\u00050\u000b";
        objectArray[28] = "\nS_`qz\u0000\u0006\u0000\u0007ar\n\f\u0003P6,]To>?#\u001f\u0005\u001efip\u001d";
        objectArray[29] = "0S3^\b\u001et\u0003wP3\"Ni\u0003n\f\u0006t\u0002s\u0017HV0\f";
        objectArray[30] = "H\u000e$8%6\u001a\r87N3t[~{r\u007f\u001a\fx~2";
        objectArray[31] = "3\u0002Eb(td\u0004@\"Z*\u0003PI=a\u007fsAQ48\u001ahC\b83dbG_eZ";
        objectArray[32] = "(sI\u000e\u0000?p%\u001a\fm+|?\u0019\u0011\u0001\u0019*}EKQNz>I\u0010\u00040p:\u001eMm";
        objectArray[33] = ".( `wk)&~1\u000e6\u0000Duf6e: rhh4";
        objectArray[34] = "Qm,\u0016\u0000X\t;\u007f\u0014mL\u0005!|\t\u0001~Sc SR)\u0003 ,\b\u0004W\t${Um\u0012\r:m\u0017\u0013LW=~n";
        objectArray[35] = ":x\u001cXp{=vB\t\t&;\u0014J\rv.<n\u0019Kj&";
        objectArray[36] = "\u00117wQL\u0005Ks'R)E(&s\u0002N\u0002A,&]";
        objectArray[37] = "/\u0003\u0016}\u0000\u0019}\u0000\nrk\u0013\u0013VL>WP}\u0001J;\u0017";
        objectArray[38] = "n0\f\u0011w`05R\u0000\u001bcT5\u001b\u001b ?$$\u0003\u0012yZo>\r\tb$1d\n\u001a\u001b";
        objectArray[39] = "N\u0017A\u0017nS\u0014S\u0011\u0014\u000b\u0013w\u0005\u000f\u00170O\u0007\u0014\u0017\u001ei*L\u000e\u0019\u0005rT\u0012T\u001e\u0016\u000b";
        objectArray[40] = "\"da}(Dz22\u007fEPv(1b)b jm8x5p)ac,Kz-6>E";
        objectArray[41] = "z)3\"^\u0012#%2&%YF56zU\u0013*!p'Bc-c3'C\r}7p}%";
        objectArray[42] = "q\u001cC\n4-9@\b\u001eE>-\\L\u0001?)\u0006BW&8 $%\u0000\u001a45#KR\u001c>&@\u0014K\u00114'.FM\u001b'D";
        objectArray[43] = "\u0006<<J\u001ez\\xlI{2?+;U\u0019eQ{o\u0016C\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[44] = "-\u007fo`\u0016a~9sh}&C.a2F~3?y;\u001f\u001bz</2\u0018b x\u007f1}";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'n' || c == 'j' || c == '\u00c5' || c == 'f') {
                field = _5w_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5w_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5w_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5w" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5w_0.e(l2, l3);
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
                clazz3 = _5w_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5w_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5w_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5w_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5w_0.f(992949205185235L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5w_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5w_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5w_0.f(992949205185235L, 0L);
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
            int n = _5w_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5w_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5w_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5w_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5w_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5w_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6522;
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
                throw new RuntimeException("dev/krypton/5w", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5w_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5w" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5w_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5w_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5w_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5w_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5w_0.c(clazz3, string2, clazz2)) != null) {
                    _5w_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5w_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5w_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5w_0.f(992949205185235L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5w_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5w_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

