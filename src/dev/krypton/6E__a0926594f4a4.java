/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1792
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3O;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._69;
import dev.krypton._6W;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9T;
import dev.krypton._9o;
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
import net.minecraft.class_1792;

public class _6E
extends _6x_0 {
    private final _9E cfr_renamed_9;
    private final _92 cfr_renamed_2;
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

    @_3i_0
    public void cfr_renamed_5(_3O o) {
        _6E e2;
        long l2;
        long l3;
        block10: {
            block11: {
                _4w[] wArray;
                block8: {
                    block9: {
                        long l4 = l3 = b ^ 0x75181E377F4CL;
                        long l5 = l4 ^ 0x419F5653C9EBL;
                        l2 = l4 ^ 0x65902CFF13BCL;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                e2 = this;
                                if (wArray != null) break block8;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l5;
                                objectArray[0] = _6E.c("K", -7058506252476480807L, (long)l3);
                                if (_6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)e2, -7057508126155732124L, (long)l3), (Object)objectArray, -7059315437857627793L, (long)l3) != false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw _6E.a(matchException);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _6E.a(matchException);
                        }
                    }
                    e2 = this;
                }
                try {
                    try {
                        if (wArray != null) break block10;
                        if (_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)e2, -7057247700455345426L, (long)l3), -7059177238721794613L, (long)l3) != null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw _6E.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _6E.a(matchException);
                }
            }
            _6E.c("\u00e1", (Object)this, (boolean)_6E.a("m", 7042, (long)(0x3CBC50FB1C891CD1L ^ l3)), -7058438582765091177L, (long)l3);
            e2 = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _6E.c("\u00e1", (Object)e2, (int)_6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)this, -7059385430397631974L, (long)l3), (Object)objectArray, -7058141776297723219L, (long)l3), -7058773821849200485L, (long)l3);
    }

    public _6E(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x11FFDE50FB62L;
        long l5 = l3 ^ 0x49EDBED03F57L;
        long l6 = l3 ^ 0xFB51B5ACEADL;
        long l7 = l3 ^ 0x1075887E21DFL;
        super((int)_6E.a("m", 6524, (long)(0x57395D5EE2EAE7ADL ^ l2)), -1, (_4r)((Object)_6E.c("K", 7460220868259562665L, (long)l2)), l6);
        this.cfr_renamed_9 = new _9E((int)_6E.a("m", 5590, (long)(0x5856052382986B0EL ^ l2)), l4, (Enum)((Object)_6E.c("K", 7462194402810319230L, (long)l2)), _9T.class);
        this.cfr_renamed_2 = new _92((int)_6E.a("m", 309, (long)(0x7381CCF72CAB7FE1L ^ l2)), 0.0, l5, 5.0, 1.0, 1.0);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_6E.c("\u00da", (Object)this, 7461287087457628897L, (long)l2), _6E.c("\u00da", (Object)this, 7461732896664206239L, (long)l2)};
        objectArray[0] = l7;
        _6E.c("\u00e3", (Object)this, (Object)objectArray, 7461382517429998437L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_6E.class, 14);
                _6E.b = l.a(8444164983551448398L, 6285079185425817160L, MethodHandles.lookup().lookupClass()).a(167248409805423L);
                _6E.j = new Object[63];
                _6E.k = new String[63];
                _6E.b();
                _6E.f = new HashMap<K, V>(13);
                var0 = _6E.b ^ 48095669896825L;
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
                var6_5 = "\u0087\u00eddO\u00e1\u00d2\u00a6Dn\u00df\u00a7,\u0089E+\u00c8_\u001b\u0011TN\u00abC\u00f5\u00fbn\u00c3\u00a6\u0004%l\u0084\u00c79\u008e\u000f\u00a9X\u00f5\u00d7T\u00b1\u0097\u00ab\u009b:\u008a\u00e0\u00e7\u00c0\tm\u001d\u0010Q\u00fd\u00d2\u0091>\u00f6Z\u00fd\r_\u008e\u00dcZ\u00be\u00ff\b\u00be\u00b5";
                var7_6 = "\u0087\u00eddO\u00e1\u00d2\u00a6Dn\u00df\u00a7,\u0089E+\u00c8_\u001b\u0011TN\u00abC\u00f5\u00fbn\u00c3\u00a6\u0004%l\u0084\u00c79\u008e\u000f\u00a9X\u00f5\u00d7T\u00b1\u0097\u00ab\u009b:\u008a\u00e0\u00e7\u00c0\tm\u001d\u0010Q\u00fd\u00d2\u0091>\u00f6Z\u00fd\r_\u008e\u00dcZ\u00be\u00ff\b\u00be\u00b5".length();
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
                    var6_5 = "\u0005P\u00dbEM\u00cb\u0089\u00fc\u009d\u00f7\u00fe\u00a7\u00c0\\6\u00a8";
                    var7_6 = "\u0005P\u00dbEM\u00cb\u0089\u00fc\u009d\u00f7\u00fe\u00a7\u00c0\\6\u00a8".length();
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
        _6E.d = var8_3;
        _6E.e = new Integer[11];
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
            case 0 -> 0;
            case 1 -> 28;
            case 2 -> 41;
            case 3 -> 54;
            case 4 -> 47;
            case 5 -> 7;
            case 6 -> 21;
            case 7 -> 5;
            case 8 -> 43;
            case 9 -> 49;
            case 10 -> 62;
            case 11 -> 42;
            case 12 -> 13;
            case 13 -> 55;
            case 14 -> 23;
            case 15 -> 2;
            case 16 -> 31;
            case 17 -> 24;
            case 18 -> 44;
            case 19 -> 39;
            case 20 -> 34;
            case 21 -> 48;
            case 22 -> 45;
            case 23 -> 57;
            case 24 -> 33;
            case 25 -> 18;
            case 26 -> 58;
            case 27 -> 50;
            case 28 -> 53;
            case 29 -> 10;
            case 30 -> 14;
            case 31 -> 32;
            case 32 -> 3;
            case 33 -> 6;
            case 34 -> 12;
            case 35 -> 37;
            case 36 -> 22;
            case 37 -> 46;
            case 38 -> 56;
            case 39 -> 17;
            case 40 -> 4;
            case 41 -> 25;
            case 42 -> 20;
            case 43 -> 35;
            case 44 -> 38;
            case 45 -> 1;
            case 46 -> 26;
            case 47 -> 16;
            case 48 -> 15;
            case 49 -> 52;
            case 50 -> 30;
            case 51 -> 27;
            case 52 -> 59;
            case 53 -> 63;
            case 54 -> 8;
            case 55 -> 9;
            case 56 -> 19;
            case 57 -> 29;
            case 58 -> 36;
            case 59 -> 11;
            case 60 -> 61;
            case 61 -> 40;
            case 62 -> 60;
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
        _6E.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "C\u0017\u000ev'\u000e^\u0002\f7\"R\u00117";
        objectArray[1] = Boolean.TYPE;
        _6E.k[1] = "java/lang/Boolean";
        objectArray[2] = "-i?p\\E0|=1Y\u0019pX";
        objectArray[3] = "6j5GSA6j\"\u001b_N,!\"\u0005_[+Pp^\u000f\u001b";
        objectArray[4] = "\u001c\u0018\"iK#\u0001\r (N\u007fN*";
        objectArray[5] = "tKtpEm\u0001k\u007f\u007fT\"`ettPx\u0014";
        objectArray[6] = Integer.TYPE;
        _6E.k[6] = "java/lang/Integer";
        objectArray[7] = "\u000f3;&1=\u000f3,z=2\u0015x,d='\u0012\t~?em";
        objectArray[8] = "zqf:\u001e\u007fzqqf\u0012p`:qx\u0012egK##J$";
        objectArray[9] = "Br\u001e#T\u0006Br\t\u007fX\tX9\taX\u001c_H[;\u000f^";
        objectArray[10] = "\"jn*Vx?\u007flkS$pw";
        objectArray[11] = "\u00184GVr/m\u0014LYc`\f\u001aGRg:x";
        objectArray[12] = "\u000f=\u0000qE7\u0012(\u00020@kR\u001d";
        objectArray[13] = "\u0001cv.q\ttC}!`F\u0015Mv*d\u001ca";
        objectArray[14] = "G0l\u0011{)Z%nP~u\u001ag";
        objectArray[15] = "(J#&\"y(J4z.v2\u00014d.c5pd9\u007f";
        objectArray[16] = "\n4i\u0000Pz\n4~\\\\u\u0010\u007f~B\\`\u0017\u000e*\u001a\u000b";
        objectArray[17] = "PQWP%bPQ@\f)mJ\u001a@\u0012)xMk\u0012Fx9";
        objectArray[18] = "S*=z\u0019\u0019N??;\u001cE\u0005";
        objectArray[19] = "C~0\"d\n^k2caV\u0017)";
        objectArray[20] = "2\u0004\nEtEG$\u0001Je\n&*\nAaPR";
        objectArray[21] = "<\u001d]u\u001b\u0002<\u001dJ)\u0017\r&VJ7\u0017\u0018!'\u001fh@";
        objectArray[22] = "\u0006I=w $\u0006I*+,+\u001c\u0002*5,>\u001bsxn}~";
        objectArray[23] = "+!\u0001<\fB64\u0003}\t\u001ey}";
        objectArray[24] = "SXV\u0000\t:&x]\u000f\u0018uGvV\u0004\u001c/3";
        objectArray[25] = Void.TYPE;
        _6E.k[25] = "java/lang/Void";
        objectArray[26] = "g!;>Wtg!,b[{}j,|[nz\u001b~&\u000f*";
        objectArray[27] = "\u000fw\u001c+\u0014TzW\u0017$\u0005\u001b\u001bY\u001c/\u0001Ao";
        objectArray[28] = "hu+wz5\u001dU xkz|[+so \b";
        objectArray[29] = "\u0015\u0007OA<\u000b\b\u0012M\u00009WE\u0010";
        objectArray[30] = "m6wA\u0002\u000f\u0018\u0016|N\u0013@y\u0018wE\u0017\u001a\r";
        objectArray[31] = "}QI{8]v^X4YS}U\\n";
        objectArray[32] = "!\u0014\u0016\u001e\b~~\u001blS9`~JP\u000b@\"}L";
        objectArray[33] = "^\u0017\u0007o@0\u0018[^f)\r!2e\u0011qJ^\u0017\u0007o@0\u0018[^f";
        objectArray[34] = "E,;jh\u0010\u001e-\u007f/\f\u0002\u001e%a|[S@y<\u00106\bA2alm\t\u0005w";
        objectArray[35] = "\b%T\u0016^\u000f\\}\nBn\t3xW@\u001eEH-\u0013\u0012\u00145O#V\u0015\u000bL\r P)";
        objectArray[36] = "s\u001eAT%=5R\u0018]L\u000e\u000e32<\u0017Gs\u001eAT%=5R\u0018]";
        objectArray[37] = " U%\u0014R\u001c\u007fZ__cB'Jd\u0006\u0001\u0013\"\f3";
        objectArray[38] = "v\u0015Snl.9\u0015F|\u0006)&QHyj\u001bp\u0014\u0015!:LvKEow|{\u001dQx\u00060t\u0013\u0014{\u007frw\u0015(";
        objectArray[39] = "%''\u000f5~j'2\u001d_yuc<\u00183K'.dN_!~r-\u000eo,(f:\u007f";
        objectArray[40] = "\u0010inc\u000b\\S0\u007f&0\u0003/m>s@JT8z!J:Ow{aA_\u00169jc0";
        objectArray[41] = "\u0017\u0006\u00074;[D_R3QCD\u001c\u000em=q\u0014\\U:Q\u001aN\u001fUh3KKY\u0002\nl\u001eR\u0010\u0004h#\u001eG\u0002n";
        objectArray[42] = "VN\u000bM\u001dw\u0015\u0017\u001a\b& iR[\n\u001at\u0010\u0010X\f&";
        objectArray[43] = "n\u0019#vo?1\u0016Y=^91\u0010)v%luB#\u0006b:qB;d3?7\u0015Y";
        objectArray[44] = "q'g\u001f=M<a:\tE\u0002@{a\u00125C;.%@?3< `G J~#f{";
        objectArray[45] = "\bXK[\u001fmWW1\u0015.fXDP\u0010Ec\u0003JU";
        objectArray[46] = "*?@I\u001a>1-\u001e_k\"\"1\u001c]<u|fD1\u0001'|0\u0011U\u0000<'9";
        objectArray[47] = "\u0002nn\u0019\u0018cX<`Kct\b>m\u001b4*Sc9w^|\u0004\"xGS*\u00105";
        objectArray[48] = "h~LM\u0018uckJ\u0019#%@\u001b\\LXx8rWY^,";
        objectArray[49] = "L!>k&\u001aG48?\u001dJKD)1yB]9)s#\r";
        objectArray[50] = "I>yG*:\u00161\u0003\u000b\u001b<\u00167sG`iRey7'?VeaUv:\u00102\u0003";
        objectArray[51] = "\u0000w\u000eh\u0015TC.\u001f-.\u000b?~\u0002)VCMe\u0010w@";
        objectArray[52] = "S\u0001oy\u001c\u0011H\u00131om\r[\u000f3m:Z\u0005\\n\u0001\u0000\u001eB\u0012&j\u001f\u001bG\r";
        objectArray[53] = "h]\u001a\u001cGjiFA\u0015.`c[A\u001cy1?\u000f\u001fp@a`\\XASbzX";
        objectArray[54] = "W\u0015Zux\u001b[\u0011Cu\u001aG8L\u0002'j\u000bC\u0019Fu`{D\u0017\u0003r\u007f\u0002\u0006\u0014\u0005N";
        objectArray[55] = ".@^[VFqO$\u0014g\u0015v\u0019@S\u0019X0DV";
        objectArray[56] = "Gj~*H \\-?0\"Pc\u0012\r\u0005~\u001bGj~*H \\-?0";
        objectArray[57] = "\u0013Mrei-\u0012V)l\u0000,\u0014Z-nl\u001eF\u001dq7\u0000)\u0007\\6xepIM4\t";
        objectArray[58] = "\u0004(g`\u0012&\u00053<i{'\u0003?8k\u0017\u0015Uze0KBP%12\u0011?\u0003|d5{";
        objectArray[59] = "}d>{\u0000=ba;dq3}e&l\u001d\u0001*(~5qjwf}i\u0013;r *\u000bM1o\"$i\u001c4)uF7\u0016)+{$f\u0013o|\u0019|oO,te'n\u000bi\u0010x!;\u001a;l&/`\rVpg<p\u00003))-rq";
        objectArray[60] = "\t\u001f!K)\u001c\fD/N\u0012J`KbCb\u0007\u001b\u001e&\u0011hw\\H\"\u0011p\u0015\rMdF\u0012";
        objectArray[61] = "N^WZ)\u0003]]M^T\\A\\Q\\\u0003\r\u001f\u000f\u000e0hU_\nWR9P\u0019]";
        Object[] objectArray2 = objectArray;
        objectArray[62] = "}+ acb}iz.\u0019\"\u0011q{9ioj$?kc\u001f.u+)\"ym,:l\u0019";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00e1' || c == 'K' || c == '\u00d5') {
                field = _6E.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6E.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6E.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6E" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _6E.e(l2, l3);
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
                clazz3 = _6E.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6E.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6E.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6E.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6E.f(2208899682307897L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6E.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6E.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6E.f(2208899682307897L, 0L);
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
            int n = _6E.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6E.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6E.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6E.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6E.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6E.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/6E" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1957;
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
                throw new RuntimeException("dev/krypton/6E", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6E.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6E.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _6E.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6E.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6E.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6E.c(clazz3, string2, clazz2)) != null) {
                    _6E.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6E.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6E.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6E.f(2208899682307897L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_4(_9o o) {
        block62: {
            CallSite callSite;
            long l2;
            long l3;
            long l4;
            block63: {
                CallSite callSite2;
                _4w[] wArray;
                block60: {
                    long l5;
                    block61: {
                        block59: {
                            block58: {
                                _6E e2;
                                block50: {
                                    block51: {
                                        block56: {
                                            CallSite callSite3;
                                            block57: {
                                                CallSite callSite4;
                                                block54: {
                                                    block55: {
                                                        block52: {
                                                            block53: {
                                                                CallSite callSite5;
                                                                block48: {
                                                                    long l6;
                                                                    block49: {
                                                                        Object object;
                                                                        long l7;
                                                                        block46: {
                                                                            long l8;
                                                                            block47: {
                                                                                Object object2;
                                                                                long l9;
                                                                                block44: {
                                                                                    block45: {
                                                                                        long l10 = l4 = b ^ 0x13F531FBA748L;
                                                                                        l5 = l10 ^ 0x4383B91D6FB6L;
                                                                                        l6 = l10 ^ 0x2772799F11EFL;
                                                                                        l7 = l10 ^ 0x332DA22D65D3L;
                                                                                        l9 = l10 ^ 0x508E84E3D28BL;
                                                                                        l3 = l10 ^ 0x60C7F0780C81L;
                                                                                        l2 = l10 ^ 0x37D0333CBB8L;
                                                                                        l8 = l10 ^ 0x1CA7C735A904L;
                                                                                        wArray = _3s.cfr_renamed_5();
                                                                                        try {
                                                                                            try {
                                                                                                object2 = this;
                                                                                                if (wArray != null) break block44;
                                                                                                if (_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)object2, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4) != null) break block45;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _6E.a(matchException);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _6E.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    Object[] objectArray = new Object[2];
                                                                                    objectArray[1] = _69.class;
                                                                                    objectArray[0] = l8;
                                                                                    object2 = _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("K", 5047189249049156134L, (long)l4), 5047199401191313556L, (long)l4), (Object)objectArray, 5046436039968300347L, (long)l4);
                                                                                }
                                                                                _69 var19_11 = (_69)object2;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                object = var19_11;
                                                                                                if (wArray != null) break block46;
                                                                                                if (_6E.c("\u00e3", (Object)object, 5047852790184929344L, (long)l4) == false) break block47;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _6E.a(matchException);
                                                                                            }
                                                                                            object = var19_11;
                                                                                            if (wArray != null) break block46;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _6E.a(matchException);
                                                                                        }
                                                                                        Object[] objectArray = new Object[1];
                                                                                        objectArray[0] = l9;
                                                                                        if (_6E.c("\u00e3", (Object)object, (Object)objectArray, 5047032971520842897L, (long)l4) == false) break block47;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _6E.a(matchException);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _6E.a(matchException);
                                                                                }
                                                                            }
                                                                            Object[] objectArray = new Object[2];
                                                                            objectArray[1] = _6W.class;
                                                                            objectArray[0] = l8;
                                                                            object = _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("K", 5047189249049156134L, (long)l4), 5047199401191313556L, (long)l4), (Object)objectArray, 5046436039968300347L, (long)l4);
                                                                        }
                                                                        _6W w = (_6W)object;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    callSite5 = _6E.c("\u00e3", (Object)w, 5047852790184929344L, (long)l4);
                                                                                    if (wArray != null) break block48;
                                                                                    if (callSite5 == false) break block49;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _6E.a(matchException);
                                                                                }
                                                                                Object[] objectArray = new Object[1];
                                                                                objectArray[0] = l7;
                                                                                callSite5 = _6E.c("\u00e3", (Object)w, (Object)objectArray, 5048531464814204798L, (long)l4);
                                                                                if (wArray != null) break block48;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _6E.a(matchException);
                                                                            }
                                                                            if (callSite5 == false) break block49;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _6E.a(matchException);
                                                                        }
                                                                        return;
                                                                    }
                                                                    try {
                                                                        e2 = this;
                                                                        if (wArray != null) break block50;
                                                                        Object[] objectArray = new Object[2];
                                                                        objectArray[1] = l6;
                                                                        objectArray[0] = _6E.c("K", 5048327491346291421L, (long)l4);
                                                                        callSite5 = _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)e2, 5047082921949844320L, (long)l4), (Object)objectArray, 5047445497386400107L, (long)l4);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _6E.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (callSite5 == false) break block51;
                                                                        callSite4 = _6E.c("\u00da", (Object)this, 5048259671852113555L, (long)l4);
                                                                        if (wArray != null) break block52;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _6E.a(matchException);
                                                                    }
                                                                    if (callSite4 != false) break block53;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _6E.a(matchException);
                                                                }
                                                                return;
                                                            }
                                                            callSite4 = _6E.c("\u00da", (Object)this, 5048065100411748511L, (long)l4);
                                                        }
                                                        try {
                                                            try {
                                                                if (wArray != null) break block54;
                                                                if (callSite4 <= 0) break block55;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _6E.a(matchException);
                                                            }
                                                            _6E e3 = this;
                                                            _6E.c("\u00e1", (Object)e3, (int)(_6E.c("\u00da", (Object)e3, 5048065100411748511L, (long)l4) - true), 5048065100411748511L, (long)l4);
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6E.a(matchException);
                                                        }
                                                    }
                                                    _6E.c("\u00e1", (Object)this, (boolean)_6E.a("m", 10101, (long)(0x7217036AE983F821L ^ l4)), 5048259671852113555L, (long)l4);
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = _6E.c("K", 5047646510896633162L, (long)l4);
                                                    objectArray[0] = l5;
                                                    callSite4 = _6E.c("\u00e3", (Object)this, (Object)objectArray, 5047326942216067825L, (long)l4);
                                                }
                                                callSite3 = callSite4;
                                                try {
                                                    try {
                                                        if (wArray != null) break block56;
                                                        if (callSite3 != -1) break block57;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6E.a(matchException);
                                                    }
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6E.a(matchException);
                                                }
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = (int)callSite3;
                                            objectArray[0] = l3;
                                            _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5046887882597879313L, (long)l4), (int)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046977020936727484L, (long)l4), 5046399886875935083L, (long)l4), (int)_6E.c("R", (Object)objectArray, 5047920591590788243L, (long)l4), (int)_6E.a("m", 16800, (long)(0x7233E5BB2A4B9EFAL ^ l4)), (Object)_6E.c("K", 5048455798676181773L, (long)l4), (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046809099031250657L, (long)l4);
                                            _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046678895453917925L, (long)l4);
                                        }
                                        return;
                                    }
                                    e2 = this;
                                }
                                CallSite callSite6 = _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)e2, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046732664939218012L, (long)l4);
                                CallSite callSite7 = _6E.c("\u00e3", (Object)callSite6, (int)_6E.a("m", 423, (long)(0x3A8B418DC48F5EFFL ^ l4)), 5047799320589398983L, (long)l4);
                                try {
                                    try {
                                        if (wArray != null) break block58;
                                        if (_6E.c("\u00e3", (Object)callSite7, 5048221032135031862L, (long)l4) != _6E.c("K", 5047646510896633162L, (long)l4)) break block59;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6E.a(matchException);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l2;
                                    _6E.c("\u00e1", (Object)this, (int)_6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)this, 5047515623070374430L, (long)l4), (Object)objectArray, 5046309350220571305L, (long)l4), 5048065100411748511L, (long)l4);
                                }
                                catch (MatchException matchException) {
                                    throw _6E.a(matchException);
                                }
                            }
                            return;
                        }
                        try {
                            try {
                                callSite2 = _6E.c("\u00da", (Object)this, 5048065100411748511L, (long)l4);
                                if (wArray != null) break block60;
                                if (callSite2 <= 0) break block61;
                            }
                            catch (MatchException matchException) {
                                throw _6E.a(matchException);
                            }
                            _6E e4 = this;
                            _6E.c("\u00e1", (Object)e4, (int)(_6E.c("\u00da", (Object)e4, 5048065100411748511L, (long)l4) - true), 5048065100411748511L, (long)l4);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _6E.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = _6E.c("K", 5047646510896633162L, (long)l4);
                    objectArray[0] = l5;
                    callSite2 = _6E.c("\u00e3", (Object)this, (Object)objectArray, 5047326942216067825L, (long)l4);
                }
                callSite = callSite2;
                try {
                    try {
                        if (wArray != null) break block62;
                        if (callSite != -1) break block63;
                    }
                    catch (MatchException matchException) {
                        throw _6E.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _6E.a(matchException);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = (int)callSite;
            objectArray[0] = l3;
            _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5046887882597879313L, (long)l4), (int)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046977020936727484L, (long)l4), 5046399886875935083L, (long)l4), (int)_6E.c("R", (Object)objectArray, 5047920591590788243L, (long)l4), (int)_6E.a("m", 423, (long)(0x3A8B418DC48F5EFFL ^ l4)), (Object)_6E.c("K", 5048455798676181773L, (long)l4), (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046809099031250657L, (long)l4);
            _6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, 5047400994525571818L, (long)l4), 5047591109693945295L, (long)l4), 5046678895453917925L, (long)l4);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _6E.c("\u00e1", (Object)this, (int)_6E.c("\u00e3", (Object)_6E.c("\u00da", (Object)this, 5047515623070374430L, (long)l4), (Object)objectArray2, 5046309350220571305L, (long)l4), 5048065100411748511L, (long)l4);
        }
    }

    private static int int_3(Object[] objectArray) {
        int n;
        block4: {
            int n2;
            block5: {
                long l2 = (Long)objectArray[0];
                n2 = (Integer)objectArray[1];
                l2 = b ^ l2;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        n = n2;
                        if (wArray != null) break block4;
                        if (n >= _6E.a("m", 26292, (long)(0x267995668308D429L ^ l2))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _6E.a(matchException);
                    }
                    return (int)(_6E.a("m", 28292, (long)(0x2DD04565ECEADC18L ^ l2)) + n2);
                }
                catch (MatchException matchException) {
                    throw _6E.a(matchException);
                }
            }
            n = n2;
        }
        return n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int int_4(Object[] var1_1) {
        block13: {
            block11: {
                block12: {
                    var3_2 = (Long)var1_1[0];
                    var2_3 = (class_1792)var1_1[1];
                    var3_2 = _6E.b ^ var3_2;
                    var5_4 = _3s.cfr_renamed_5();
                    try {
                        try {
                            v0 = _6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, (long)-3966915754024639469L, (long)var3_2), (long)-3965997767663699146L, (long)var3_2);
                            if (var5_4 != null) break block11;
                            if (v0 != null) break block12;
                        }
                        catch (MatchException v1) {
                            throw _6E.a(v1);
                        }
                        return -1;
                    }
                    catch (MatchException v2) {
                        throw _6E.a(v2);
                    }
                }
                v0 = _6E.c("\u00da", (Object)_6E.c("\u00da", (Object)this, (long)-3966915754024639469L, (long)var3_2), (long)-3965997767663699146L, (long)var3_2);
            }
            var6_5 = _6E.c("\u00e3", (Object)v0, (long)-3967442799774430555L, (long)var3_2);
            var7_6 = 0;
            while (var7_6 < _6E.a("m", (int)29745, (long)(6370334369334240665L ^ var3_2))) {
                block15: {
                    block14: {
                        try {
                            try {
                                v3 /* !! */  = (int)_6E.c("\u00e3", (Object)_6E.c("\u00e3", (Object)var6_5, (int)var7_6, (long)-3966486096293659330L, (long)var3_2), (Object)var2_3, (long)-3965461194865752658L, (long)var3_2);
                                v4 = var5_4;
                                if (var3_2 > 0L) {
                                    if (v4 != null) break block13;
                                    v4 = var5_4;
                                }
                                if (v4 != null) break block14;
                            }
                            catch (MatchException v5) {
                                throw _6E.a(v5);
                            }
                            if (v3 /* !! */  == 0) break block15;
                        }
                        catch (MatchException v6) {
                            throw _6E.a(v6);
                        }
                        v7 = var7_6;
                    }
                    return v7;
                }
                ++var7_6;
lbl43:
                // 2 sources

                ** while (var5_4 != null)
lbl44:
                // 1 sources

            }
lbl45:
            // 2 sources

            if (var3_2 <= 0L) ** GOTO lbl43
            v3 /* !! */  = -1;
        }
        return v3 /* !! */ ;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6E.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6E.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

