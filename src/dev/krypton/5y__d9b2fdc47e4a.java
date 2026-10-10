/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6j_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
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

/*
 * Renamed from dev.krypton.5y
 */
public class _5y_0
extends _6x_0 {
    private boolean cfr_renamed_8;
    private boolean cfr_renamed_9;
    private boolean cfr_renamed_4;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _5y_0(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x1A3382378C4FL;
        super((int)_5y_0.a("h", 24477, (long)(0x64419D22E77988CDL ^ l2)), -1, (_4r)((Object)_5y_0.c("p", 2693874065256995341L, (long)l2)), l3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5y_0.b = l.a(-7877772372305799947L, 7041322723526067703L, MethodHandles.lookup().lookupClass()).a(194651814942119L);
                _5y_0.j = new Object[52];
                _5y_0.k = new String[52];
                _5y_0.b();
                _5y_0.f = new HashMap<K, V>(13);
                var0 = _5y_0.b ^ 48164676489345L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "#\u00a9S\u00c2F\\7\u007f\u00a5\u009c\u008a\u0003\u00d30\u00b9\u008cj\u00c0\u00d4\u000by\b2c";
                var7_6 = "#\u00a9S\u00c2F\\7\u007f\u00a5\u009c\u008a\u0003\u00d30\u00b9\u008cj\u00c0\u00d4\u000by\b2c".length();
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
                    var6_5 = "\u001ev\u00ac\u00efs\u00cbh\u00c5\u00cb\u00f8A~\u00db\u0096v\u0007";
                    var7_6 = "\u001ev\u00ac\u00efs\u00cbh\u00c5\u00cb\u00f8A~\u00db\u0096v\u0007".length();
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
        _5y_0.d = var8_3;
        _5y_0.e = new Integer[5];
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
            case 0 -> 49;
            case 1 -> 12;
            case 2 -> 16;
            case 3 -> 54;
            case 4 -> 28;
            case 5 -> 47;
            case 6 -> 0;
            case 7 -> 46;
            case 8 -> 7;
            case 9 -> 38;
            case 10 -> 56;
            case 11 -> 13;
            case 12 -> 2;
            case 13 -> 37;
            case 14 -> 33;
            case 15 -> 39;
            case 16 -> 30;
            case 17 -> 40;
            case 18 -> 17;
            case 19 -> 11;
            case 20 -> 18;
            case 21 -> 43;
            case 22 -> 21;
            case 23 -> 26;
            case 24 -> 1;
            case 25 -> 44;
            case 26 -> 23;
            case 27 -> 29;
            case 28 -> 41;
            case 29 -> 61;
            case 30 -> 5;
            case 31 -> 24;
            case 32 -> 50;
            case 33 -> 59;
            case 34 -> 51;
            case 35 -> 55;
            case 36 -> 4;
            case 37 -> 42;
            case 38 -> 19;
            case 39 -> 60;
            case 40 -> 22;
            case 41 -> 63;
            case 42 -> 3;
            case 43 -> 27;
            case 44 -> 45;
            case 45 -> 34;
            case 46 -> 6;
            case 47 -> 15;
            case 48 -> 57;
            case 49 -> 8;
            case 50 -> 62;
            case 51 -> 36;
            case 52 -> 35;
            case 53 -> 53;
            case 54 -> 25;
            case 55 -> 9;
            case 56 -> 52;
            case 57 -> 31;
            case 58 -> 32;
            case 59 -> 20;
            case 60 -> 48;
            case 61 -> 14;
            case 62 -> 10;
            default -> 58;
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
        _5y_0.k[n3] = new String(cArray);
        return n3;
    }

    @_3i_0
    public void cfr_renamed_1(_6j_0 j_0) {
        block13: {
            _5y_0 y_0;
            long l2;
            block15: {
                CallSite callSite;
                block14: {
                    int n;
                    block12: {
                        l2 = b ^ 0x140E20ADC3E3L;
                        n = _7C.cfr_renamed_9();
                        CallSite callSite2 = _5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 3648766155707114901L, (long)l2), 3648599573788351984L, (long)l2), 3652386639481394039L, (long)l2);
                        try {
                            try {
                                callSite = _5y_0.c("F", (Object)_5y_0.c("F", (Object)callSite2, 3648002135889554035L, (long)l2), (Object)_5y_0.c("p", 3648114023891211187L, (long)l2), 3648180579125733454L, (long)l2);
                                if (n == 0) break block12;
                                if (callSite == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _5y_0.a(matchException);
                            }
                            callSite = _5y_0.c("F", (Object)_5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 3648766155707114901L, (long)l2), 3648599573788351984L, (long)l2), (Object)_5y_0.c("p", 3652160541910837514L, (long)l2), 3649088614616472314L, (long)l2), (Object)_5y_0.c("p", 3648636957442040315L, (long)l2), 3652055130027635601L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _5y_0.a(matchException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block14;
                                if (callSite == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _5y_0.a(matchException);
                            }
                            y_0 = this;
                            if (n == 0) break block15;
                        }
                        catch (MatchException matchException) {
                            throw _5y_0.a(matchException);
                        }
                        callSite = _5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)y_0, 3648766155707114901L, (long)l2), 3648599573788351984L, (long)l2), 3648206809617661460L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _5y_0.a(matchException);
                    }
                }
                if (callSite != false) break block13;
                y_0 = this;
            }
            _5y_0.c("\u00ea", (Object)y_0, (boolean)_5y_0.a("h", 18462, (long)(0x5D763AAFC08D0880L ^ l2)), 3651875974981750924L, (long)l2);
        }
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u000ffa\u0001\u0016/\u0012sc@\u0013s_q";
        objectArray[1] = "\u001dz\r\u001c%\u0014\u001dz\u001a@)\u001b\u00071\u001a^)\u000e\u0000@N\u0006~";
        objectArray[2] = Boolean.TYPE;
        _5y_0.k[2] = "java/lang/Boolean";
        objectArray[3] = "N\u0005-{\u0019MN\u0005:'\u0015BTN:9\u0015WS?jdD";
        objectArray[4] = "u\u0015yRPNh\u0000{\u0013U\u0012$\t";
        objectArray[5] = "r9\\\n\u001f\u0004r9KV\u0013\u000bhrKH\u0013\u001eo\u0003\u0019\u001cB_";
        objectArray[6] = "}p\u001a?3\u0000}p\rc?\u000fg;\r}?\u001a`J_&g[";
        objectArray[7] = "\u001dk\u0002C\u000b\u007f\u001dk\u0015\u001f\u0007p\u0007 \u0015\u0001\u0007e\u0000QGZ_/";
        objectArray[8] = "\\]\t\r\rA\\]\u001eQ\u0001NF\u0016\u001eO\u0001[AgL\u0010P\u001c";
        objectArray[9] = "sM\u001cE]FnX\u001e\u0004X\u001a!P";
        objectArray[10] = "~+\u00123c-u$\u0003|\u0002#~/\u0007&";
        objectArray[11] = "2x\u0001^\u0003p2x\u0016\u0002\u000f\u007f(3\u0016\u001c\u000fj/BDBX!";
        objectArray[12] = "\u001b\u0010G\u000f)E\u001b\u0010PS%J\u0001[PM%_\u0006*\u0007\u0012s";
        objectArray[13] = "QW>Ul\"LB<\u0014i~\rH";
        objectArray[14] = "tW%e\u0015R\u0001w.j\u0004\u001d`y%a\u0000G\u0014";
        objectArray[15] = "QB#K-GQB4\u0017!HK\t4\t!]LxfSv\u001f";
        objectArray[16] = Integer.TYPE;
        _5y_0.k[16] = "java/lang/Integer";
        objectArray[17] = "5:\u0017\u0016\\J5:\u0000JPE/q\u0000TPP(\u0000P\b\u0005";
        objectArray[18] = "\u001a\u0016\td/1\u001a\u0016\u001e8#>\u0000]\u001e&#+\u0007,N|umP\u0010\u0011+1++@M|";
        objectArray[19] = "\t6R=\u0000b\t6Ea\fm\u0013}E\u007f\fx\u0014\f\u0010 [";
        objectArray[20] = Void.TYPE;
        _5y_0.k[20] = "java/lang/Void";
        objectArray[21] = "5k{\u000eO05klRC?/ lLC*(Q<\u0011\u0017";
        objectArray[22] = "\u007fEgMxf\u007fEp\u0011tie\u000ep\u000ft|b\u007f\"U 8";
        objectArray[23] = "jZ\u001a)\u001b\u0013jZ\ru\u0017\u001cp\u0011\rk\u0017\tw`_5@C";
        objectArray[24] = "\u0014`A_\u0012\u001bKj\u000e@h\u0014@w\u0011V\u0004&\u00133L\u0001hNHmOT\u000f\rLl\u00101";
        objectArray[25] = "jA?g^e2V?{':P\u0003.&\u001bhjGl-Z";
        objectArray[26] = "4\u001b\u0015\"0W \u0002\u0010\\\u000eg\t4k:/X,\u0004\u001a.6]";
        objectArray[27] = " \n\u001b2\"\u0010~AXv@\u0012pL\u0004k, &\tY3|w!T\u0005w-\u0012z\n\u0006s@No\u0001Xcz\n-\n\u0019\f";
        objectArray[28] = ":\\IQy\bl\u000fIE\u0005\u000b=\u0018WYi9n[\n\u0005?n:TT\u000ex\tl\u000b\bR\u0005";
        objectArray[29] = "\u001f\u0014\n\u000eeaY_\u0017C\u0015n@C\u0011RB>\u0018\u0011I>+:^\u001e\u0005_mqCS";
        objectArray[30] = "-u\u001d62>r\u007fR)H1ybM?$\u0003*&\u0011gHi.a\u0013:/7e\"WX";
        objectArray[31] = "\u0002\f\u007f\u0016\u001bOT_\u007f\u0002gL\u0005Ha\u001e\u000b~V\r=HY)\u0002\u0004bI\u001aNT[>\u0015gD\u0002\u000e=\u0016_LRM~y";
        objectArray[32] = "L0B\u0006O \u0012{\u0001B-\"\u001cv]_A\u0010N;\u0005\t-{\u0015kFUH KhB8";
        objectArray[33] = "abIb\u0013\u0011'dT=\"\u0002:iJ4uUe5\u0016XO\u00167\u007fG<\u0012\u0001$n";
        objectArray[34] = "r=]\\\u001fSv T\u000e'\u00054\"P\u0004\\hr=]\\\u001fSv T\u000e'Q?n\u0005\u000f\u001d\u0015}eD`";
        objectArray[35] = "\u0013\\)O1\u000e\u0014\u001c8G\u0000\u0007I@.FWY\u0016\u0016{*<\rIV'OgSJR";
        objectArray[36] = "7|@\u0014\u0010.jkS\u0005y$;kH\u0003.sk>\u0017o\u0012!>\u007f\u0013RD)6m";
        objectArray[37] = "\u0001 xS\t|^*7LssU7(Z\u001fA\u0006rr\rs/JztRIk\bq5=";
        objectArray[38] = "\u0001v#f&[Ya#z_\u0006;42'cV\u0001pp,\"";
        objectArray[39] = "\u001du\u0004}h\u0019B\u007fKb\u0012\u0016IbTt~$\u001e\"\u0004)\"s\u001dl\u0005/}IY.\u000en\u0012";
        objectArray[40] = "q,\u001e\u001f\u0001G7*\u0003@0T*'\u001dIg\u0003tpE%\tQ{$\u0003OV[4;";
        objectArray[41] = "yk2na`?m/1Ps\"`18\u0007$|0hT`\u007f 38)+!\u007fg";
        objectArray[42] = "$M;2U\u001e)Hb1h\u001b\u0015\u0012'4R\\.Y\"nV&,Qjj\u0007\u001ch\u0013a+h";
        objectArray[43] = "\u0012\u001e{^'$\u0015^jV\u0016-H\u0002|WAs\u0019T#;*'H\u0014u^qyK\u0010";
        objectArray[44] = "\u001eBip\u0002JHJab=\u0012\u0018UmnQ L\u001578=\u001c\u0004Cbi^J\u0005\u0015o\t";
        objectArray[45] = "Xsx\u0001MS\u001eb>\u001c+\u0003f5e\u0007\u0011\u000b\u001bsc\u001aN";
        objectArray[46] = "XiF\u000eMz\u001eo[Q|i\u0003bEX+>]1\u00184\u0010f\u001bf[\t\u0006>\u000eu";
        objectArray[47] = "g!0Ym,1)8KRta64G>F5vm\u001eRz} ;@1,|v6 kc=v;\u001a/!67TM8+0%lEhhsJ";
        objectArray[48] = "'Bg-<W\u007fUg1E\r\u001d\u0000vlyZ'D4g8";
        objectArray[49] = "<\u0017\u0013\t=3c\u001d\\\u0016G<h\u0000C\u0000+\u000e;E\u001aWGg?\u0003\u0013\u0017&!t\u001e^gzczBA\u0000$(9\u0006#";
        objectArray[50] = "m/@t{*2%\u000fk\u0001%98\u0010}m\u0017o}M&1@>|\u000eu}&h/\u000ea\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[51] = "hqh\u000e~p~)}\u001d\u0004(ilq\u0000h\u001a>!(V\u0004#\u007f x\th|jkjg;(b.t\u0000x,cq\u0011\ber?{u\ryw{\u0010";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d8' || c == '\u00ea' || c == 'p' || c == '\u00c0') {
                field = _5y_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5y_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5y_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5y" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _5y_0.e(l2, l3);
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
                clazz3 = _5y_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5y_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5y_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5y_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5y_0.f(766175144716743L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5y_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5y_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5y_0.f(766175144716743L, 0L);
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
            int n = _5y_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5y_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5y_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5y_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5y_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5y_0.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7235;
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
                throw new RuntimeException("dev/krypton/5y", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5y_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5y_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5y_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5y_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5y_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5y_0.c(clazz3, string2, clazz2)) != null) {
                    _5y_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5y_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5y_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5y_0.f(766175144716743L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_6(_9o o) {
        block31: {
            CallSite callSite;
            long l2;
            block36: {
                CallSite callSite2;
                int n;
                block32: {
                    block33: {
                        CallSite callSite3;
                        CallSite callSite4;
                        block34: {
                            block35: {
                                long l3;
                                block30: {
                                    block28: {
                                        block29: {
                                            _5y_0 y_0;
                                            block26: {
                                                block27: {
                                                    l2 = b ^ 0x2F5B30BECC60L;
                                                    l3 = l2 ^ 0x50710DB21491L;
                                                    n = _7C.cfr_renamed_3();
                                                    try {
                                                        try {
                                                            y_0 = this;
                                                            if (n != 0) break block26;
                                                            if (_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)y_0, 4404588783588141590L, (long)l2), 4404844051164953835L, (long)l2) == null) break block27;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5y_0.a(matchException);
                                                        }
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5y_0.a(matchException);
                                                    }
                                                }
                                                y_0 = this;
                                            }
                                            try {
                                                try {
                                                    callSite2 = _5y_0.c("\u00d8", (Object)y_0, 4406623580963820518L, (long)l2);
                                                    if (n != 0) break block28;
                                                    if (callSite2 == false) break block29;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5y_0.a(matchException);
                                                }
                                                _5y_0.c("\u00ea", (Object)this, (boolean)_5y_0.a("h", 29867, (long)(0x5D505A865D533BB1L ^ l2)), 4406623580963820518L, (long)l2);
                                                _5y_0.c("\u00f5", (Object)_5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4405434206362724292L, (long)l2), 4405157334749693167L, (long)l2), 4404654076479430564L, (long)l2), (boolean)false, 4404667176026474764L, (long)l2);
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5y_0.a(matchException);
                                            }
                                        }
                                        callSite2 = _5y_0.c("\u00d8", (Object)this, 4408226394748821263L, (long)l2);
                                    }
                                    try {
                                        try {
                                            if (n != 0) break block30;
                                            if (callSite2 == false) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5y_0.a(matchException);
                                        }
                                        callSite2 = _5y_0.c("\u00d8", (Object)this, 4405359170452748367L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw _5y_0.a(matchException);
                                    }
                                }
                                try {
                                    if (n != 0) break block32;
                                    if (callSite2 == false) break block33;
                                }
                                catch (MatchException matchException) {
                                    throw _5y_0.a(matchException);
                                }
                                callSite4 = _5y_0.c("F", (Object)_5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4404897216462377587L, (long)l2), 4406740236502678503L, (long)l2), 4408036203708226743L, (long)l2);
                                try {
                                    try {
                                        try {
                                            callSite3 = _5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4404897216462377587L, (long)l2);
                                            if (n != 0) break block34;
                                            if (_5y_0.c("F", (Object)_5y_0.c("F", (Object)callSite3, 4408136837570813172L, (long)l2), (Object)_5y_0.c("p", 4405522319875447856L, (long)l2), 4408337525566061586L, (long)l2) != false) break block35;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5y_0.a(matchException);
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = _5y_0.c("p", 4405522319875447856L, (long)l2);
                                        objectArray[0] = l3;
                                        if (_5y_0.c("\u00f5", (Object)objectArray, 4405026773792148118L, (long)l2) != false) break block35;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5y_0.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _5y_0.a(matchException);
                                }
                            }
                            _5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4404789594947709665L, (long)l2), (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4404897216462377587L, (long)l2), (Object)_5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4404897216462377587L, (long)l2), 4408262979388882353L, (long)l2), 4406690058255595366L, (long)l2);
                            callSite3 = _5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4404897216462377587L, (long)l2);
                        }
                        _5y_0.c("F", (Object)_5y_0.c("F", (Object)callSite3, 4406740236502678503L, (long)l2), (int)callSite4, 4408085249665186065L, (long)l2);
                        _5y_0.c("\u00ea", (Object)this, (boolean)_5y_0.a("h", 10245, (long)(0x12D6522FBDCCE71BL ^ l2)), 4405359170452748367L, (long)l2);
                        _5y_0.c("\u00ea", (Object)this, (boolean)_5y_0.a("h", 10245, (long)(0x12D6522FBDCCE71BL ^ l2)), 4408226394748821263L, (long)l2);
                        return;
                    }
                    try {
                        callSite = _5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2);
                        if (n != 0) break block36;
                        callSite2 = _5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)callSite, 4404897216462377587L, (long)l2), 4405279976360318111L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _5y_0.a(matchException);
                    }
                }
                try {
                    block37: {
                        try {
                            if (callSite2 == false) break block37;
                            _5y_0.c("\u00f5", (Object)_5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2), 4405434206362724292L, (long)l2), 4405157334749693167L, (long)l2), 4404654076479430564L, (long)l2), (boolean)true, 4404667176026474764L, (long)l2);
                            _5y_0.c("\u00ea", (Object)this, (boolean)_5y_0.a("h", 4554, (long)(0x6D61F03F35B2DED6L ^ l2)), 4406623580963820518L, (long)l2);
                            if (n == 0) break block31;
                        }
                        catch (MatchException matchException) {
                            throw _5y_0.a(matchException);
                        }
                    }
                    callSite = _5y_0.c("\u00d8", (Object)this, 4404588783588141590L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _5y_0.a(matchException);
                }
            }
            _5y_0.c("\u00f5", (Object)_5y_0.c("F", (Object)_5y_0.c("\u00d8", (Object)_5y_0.c("\u00d8", (Object)callSite, 4405434206362724292L, (long)l2), 4405157334749693167L, (long)l2), 4404654076479430564L, (long)l2), (boolean)true, 4404667176026474764L, (long)l2);
            _5y_0.c("\u00ea", (Object)this, (boolean)_5y_0.a("h", 4554, (long)(0x6D61F03F35B2DED6L ^ l2)), 4406623580963820518L, (long)l2);
            _5y_0.c("\u00ea", (Object)this, (boolean)_5y_0.a("h", 4554, (long)(0x6D61F03F35B2DED6L ^ l2)), 4405359170452748367L, (long)l2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5y_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5y_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

