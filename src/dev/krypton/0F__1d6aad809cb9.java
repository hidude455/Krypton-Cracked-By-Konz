/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._95;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public class _0F
extends _0v {
    private static final _8B cfr_renamed_4;
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_12;
    private static final float cfr_renamed_5 = 4.0f;
    private static final int cfr_renamed_1;
    private final _9r cfr_renamed_8;
    private float cfr_renamed_9;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    @Override
    public void cfr_renamed_5(Object[] objectArray) {
        float f;
        _0F f2;
        long l2 = (Long)objectArray[0];
        long l3 = l2;
        long l4 = l3 ^ 0L;
        long l5 = l3 ^ 0xAED4C413368L;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            super.cfr_renamed_5(objectArray2);
            f2 = this;
            f = _0F.c("x", (Object)_0F.c("\u00d8", (Object)this, -74848239627137973L, (long)l2), (long)l5, -78112736560518408L, (long)l2) != false ? 1.0f : 0.0f;
        }
        catch (MatchException matchException) {
            throw _0F.a(matchException);
        }
        _0F.c("s", (Object)f2, (float)f, -77947947304935560L, (long)l2);
    }

    public _0F(_4t t, long l2, _95 var4_3, int n) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x5F84461E5EFFL;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x74AB18113BD2L;
        boolean bl = _02.cfr_renamed_3();
        super((short)n2, t, var4_3, n, n3, (char)n4);
        _0F f = this;
        float f2 = 0.0f;
        if (bl) {
            try {
                _0F.c("s", (Object)f, (float)f2, -697657139824748606L, (long)l2);
                this.cfr_renamed_8 = (_9r)var4_3;
                f = this;
                f2 = _0F.c("x", (Object)_0F.c("\u00d8", (Object)this, -699065462572055311L, (long)l2), (long)l5, -698055025679637950L, (long)l2) != false ? 1.0f : 0.0f;
            }
            catch (MatchException matchException) {
                throw _0F.a(matchException);
            }
        }
        _0F.c("s", (Object)f, (float)f2, -697657139824748606L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _0F.a = l.a(5056460377132609925L, 6031858186477340172L, MethodHandles.lookup().lookupClass()).a(156437211874105L);
                var11 = _0F.a ^ 80378508286470L;
                var13_1 = var11 ^ 44437675247021L;
                _0F.i = new Object[79];
                _0F.j = new String[79];
                _0F.b();
                _0F.e = new HashMap<K, V>(13);
                var0_2 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_3 = 1; var1_3 < 8; ++var1_3) {
                    v2 = v2;
                    v2[var1_3] = (byte)(var11 << var1_3 * 8 >>> 56);
                }
                var0_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_4 = new long[14];
                var3_5 = 0;
                var4_6 = "sC,T\u000b\u00f7N(\b\u008cj\u00c1\u00d3\u00e7H\u0087\u00b64\\d\u0000E\u00a1 Ja{\u0013\u00e9\u00cd\u00fa\u0003\u0090\u00a8\u00af\u00db\u00ad\u00bf\u0018Tf\u0017|~X~a \u007f\u0017\u00d5\u00cd\u008d\u00e4N\u00da\u0015_\u0087\u00a0\u00b7\u008d-\u0093\u00e1+\u001e\u00ea\u00ba\u00ab\u00d4\u00de|\u00dc\u0088\u00c1\u001a\u000f\u00c9\u00d9\u00d9*F\u00f1(u\u0098\u00ba\u00c3\u00f0\u0015)]\u0082\u008b\u0090";
                var5_7 = "sC,T\u000b\u00f7N(\b\u008cj\u00c1\u00d3\u00e7H\u0087\u00b64\\d\u0000E\u00a1 Ja{\u0013\u00e9\u00cd\u00fa\u0003\u0090\u00a8\u00af\u00db\u00ad\u00bf\u0018Tf\u0017|~X~a \u007f\u0017\u00d5\u00cd\u008d\u00e4N\u00da\u0015_\u0087\u00a0\u00b7\u008d-\u0093\u00e1+\u001e\u00ea\u00ba\u00ab\u00d4\u00de|\u00dc\u0088\u00c1\u001a\u000f\u00c9\u00d9\u00d9*F\u00f1(u\u0098\u00ba\u00c3\u00f0\u0015)]\u0082\u008b\u0090".length();
                var2_8 = 0;
                while (true) {
                    var7_9 = var4_6.substring(var2_8, var2_8 += 8).getBytes("ISO-8859-1");
                    v3 = var6_4;
                    v4 = var3_5++;
                    v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl31:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_8 < var5_7) ** continue;
                    var4_6 = "\u001fq\u0081\u0002\u008c>E\u00a8\u00f00\u00e1\u00b8\\\u00d3\u00a7A";
                    var5_7 = "\u001fq\u0081\u0002\u008c>E\u00a8\u00f00\u00e1\u00b8\\\u00d3\u00a7A".length();
                    var2_8 = 0;
                    while (true) {
                        var7_9 = var4_6.substring(var2_8, var2_8 += 8).getBytes("ISO-8859-1");
                        v3 = var6_4;
                        v4 = var3_5++;
                        v5 = ((long)var7_9[0] & 255L) << 56 | ((long)var7_9[1] & 255L) << 48 | ((long)var7_9[2] & 255L) << 40 | ((long)var7_9[3] & 255L) << 32 | ((long)var7_9[4] & 255L) << 24 | ((long)var7_9[5] & 255L) << 16 | ((long)var7_9[6] & 255L) << 8 | (long)var7_9[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_8 < var5_7) ** continue;
                    break block9;
                    break;
                }
            }
            var8_10 = v5;
            var10_11 = var0_2.doFinal(new byte[]{(byte)(var8_10 >>> 56), (byte)(var8_10 >>> 48), (byte)(var8_10 >>> 40), (byte)(var8_10 >>> 32), (byte)(var8_10 >>> 24), (byte)(var8_10 >>> 16), (byte)(var8_10 >>> 8), (byte)var8_10});
            v7 = ((long)var10_11[0] & 255L) << 56 | ((long)var10_11[1] & 255L) << 48 | ((long)var10_11[2] & 255L) << 40 | ((long)var10_11[3] & 255L) << 32 | ((long)var10_11[4] & 255L) << 24 | ((long)var10_11[5] & 255L) << 16 | ((long)var10_11[6] & 255L) << 8 | (long)var10_11[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl57:
                // 1 sources

                ** continue;
            }
        }
        _0F.c = var6_4;
        _0F.d = new Integer[14];
        _0F.cfr_renamed_1 = (int)_0F.a("g", (int)4534, (long)(var11 ^ 5344784969233261416L));
        _0F.cfr_renamed_4 = new _8B((int)_0F.a("g", (int)8932, (long)(8644810564208349234L ^ var11)), (int)_0F.a("g", (int)21818, (long)(349349060773554152L ^ var11)), var13_1, (int)_0F.a("g", (int)14322, (long)(289626409770370342L ^ var11)), (int)_0F.a("g", (int)28551, (long)(5546940276716576095L ^ var11)));
        _0F.cfr_renamed_2 = new _8B((int)_0F.a("g", (int)20177, (long)(1013318920381840397L ^ var11)), (int)_0F.a("g", (int)6501, (long)(6806602572479032242L ^ var11)), var13_1, (int)_0F.a("g", (int)6501, (long)(6806602572479032242L ^ var11)), (int)_0F.a("g", (int)21818, (long)(349349060773554152L ^ var11)));
        _0F.cfr_renamed_12 = new _8B((int)_0F.a("g", (int)6501, (long)(6806602572479032242L ^ var11)), (int)_0F.a("g", (int)6501, (long)(6806602572479032242L ^ var11)), var13_1, (int)_0F.a("g", (int)6501, (long)(6806602572479032242L ^ var11)), (int)_0F.a("g", (int)31646, (long)(6691172606101064005L ^ var11)));
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
            case 0 -> 22;
            case 1 -> 20;
            case 2 -> 63;
            case 3 -> 9;
            case 4 -> 43;
            case 5 -> 51;
            case 6 -> 4;
            case 7 -> 10;
            case 8 -> 21;
            case 9 -> 39;
            case 10 -> 0;
            case 11 -> 35;
            case 12 -> 53;
            case 13 -> 27;
            case 14 -> 30;
            case 15 -> 56;
            case 16 -> 29;
            case 17 -> 2;
            case 18 -> 55;
            case 19 -> 47;
            case 20 -> 49;
            case 21 -> 57;
            case 22 -> 40;
            case 23 -> 26;
            case 24 -> 5;
            case 25 -> 3;
            case 26 -> 46;
            case 27 -> 19;
            case 28 -> 11;
            case 29 -> 15;
            case 30 -> 45;
            case 31 -> 61;
            case 32 -> 54;
            case 33 -> 24;
            case 34 -> 41;
            case 35 -> 13;
            case 36 -> 59;
            case 37 -> 36;
            case 38 -> 28;
            case 39 -> 16;
            case 40 -> 18;
            case 41 -> 17;
            case 42 -> 42;
            case 43 -> 25;
            case 44 -> 33;
            case 45 -> 58;
            case 46 -> 32;
            case 47 -> 14;
            case 48 -> 62;
            case 49 -> 50;
            case 50 -> 7;
            case 51 -> 6;
            case 52 -> 23;
            case 53 -> 1;
            case 54 -> 38;
            case 55 -> 8;
            case 56 -> 60;
            case 57 -> 12;
            case 58 -> 48;
            case 59 -> 31;
            case 60 -> 34;
            case 61 -> 37;
            case 62 -> 44;
            default -> 52;
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
        _0F.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d8' || c == 's' || c == 'k' || c == 'w') {
                field = _0F.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0F.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0F.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "W\u001a3O4BJ\u000f1\u000e1\u001e\u00039";
        objectArray[1] = "\tE{\u001f@\u0016\u0014Py^EJTR";
        objectArray[2] = Float.TYPE;
        _0F.j[2] = "java/lang/Float";
        objectArray[3] = Long.TYPE;
        _0F.j[3] = "java/lang/Long";
        objectArray[4] = Boolean.TYPE;
        _0F.j[4] = "java/lang/Boolean";
        objectArray[5] = "\\!)\t'B\\!>U+MFj>K+XA\u001bl\u0016s\u001b\u000b";
        objectArray[6] = Integer.TYPE;
        _0F.j[6] = "java/lang/Integer";
        objectArray[7] = "$\t|\u001fdvQ)w\u0010u90'|\u001bqcD";
        objectArray[8] = Void.TYPE;
        _0F.j[8] = "java/lang/Void";
        objectArray[9] = "K0q\rr\rV%sLwQ\u001f#";
        objectArray[10] = "\u001d1\u0015Hm h\u0011\u001eG|o\t\u001f\u0015Lx5}";
        objectArray[11] = Double.TYPE;
        _0F.j[11] = "java/lang/Double";
        objectArray[12] = "M\u0010?h \nP\u0005=)%V\u001a;";
        objectArray[13] = "RYo\u001aCc'yd\u0015R,Fwo\u001eVv2";
        objectArray[14] = ",\u0002`KIS1\u0017b\nL\u000fp%";
        objectArray[15] = "\u0002~\u0002et\u0015w^\tjeZ\u0016P\u0002aa\u0000b";
        objectArray[16] = "f\t\u000b8\u007f\u001b{\u001c\tyzG2)";
        objectArray[17] = "bO%\u0015u*\u0017o.\u001adeva%\u0011`?\u0002";
        objectArray[18] = "E\\c\u0015\u0018K0|h\u001a\t\u0004Qrc\u0011\r^%";
        objectArray[19] = "\u007f\u0006\\*gS\n&W%v\u001ck(\\.rF\u001f";
        objectArray[20] = "I\u001c\u0014\u0017}e<<\u001f\u0018l*]2\u0014\u0013hp)";
        objectArray[21] = "j'SVZ@\u001f\u0007XYK\u000f~\tSROU\n";
        objectArray[22] = "PZ\u001fp&YMO\u001d1#\u0005\f\b";
        objectArray[23] = "e\u000eV5EA\u0010.]:T\u000eq V1PT\u0005";
        objectArray[24] = "\u0011-yjg}\f8{+b!L}";
        objectArray[25] = "NT\u0003'\u0010Y;t\b(\u0001\u0016Zz\u0003#\u0005L.";
        objectArray[26] = " \u001b!Gk)+\u00140\b\u001618\u00139A";
        objectArray[27] = "\u001d-kI\u00005\u00008i\b\u0005i@p";
        objectArray[28] = "7!b6\u001e{B\u0001i9\u000f4#\u000fb2\u000bnW";
        objectArray[29] = "\u000fkU?B:\u0004dDp!7\u0011b";
        objectArray[30] = "r2WJ\u001ch\u0007\u0012\\E\r'f\u001cWN\t}\u0012";
        objectArray[31] = "\u00136\u000e*a>f\u0016\u0005%pq\u0007\u0018\u000e.t+s";
        objectArray[32] = "2\bpc\t\u0016G({l\u0018Y&&pg\u001c\u0003R";
        objectArray[33] = "8B\u0007k\u001aTMb\fd\u000b\u001b,l\u0007o\u000fAX";
        objectArray[34] = "Dy`st\u001d1Yk|eRPW`wa\b$";
        objectArray[35] = "=)]A\u001f=H\tVN\u000er)\u0007]E\n(]";
        objectArray[36] = "Z+~*`\u0016/\u000bu%qYN\u0005~.u\u0003:";
        objectArray[37] = ",\u000b<\u0005\f51\u001e>D\ti|\u001a";
        objectArray[38] = "T-EnrUT-R2~ZNfR,~OI\u0017\u0000q&\f\u0002";
        objectArray[39] = "KlUlDP>L^cU\u001f_BUhQE+";
        objectArray[40] = "r\u007f,[W6yp=\u001468r{9N";
        objectArray[41] = "j\rO\u0007H\u00152\u0016QG$\n<\u0014K]H8nT\u0011\u0006\u0019om\u0011PA\u001b\u0003*\f\u0012G$";
        objectArray[42] = "G\\r\u00140K\u0013Nn\u0017RKw\u0013cFn\u0019GGqZm";
        objectArray[43] = "$\\\u0005`\u0019`$\u001d\u00003!?\u001a_\u00125]mhC\u000f<\u0018\u000e&\\\u0011v\u001ebaASp!";
        objectArray[44] = "B\u001a\\,i1\u001aDQ.\u00185+\\O(dlY@R!!\u000f\u0017_Lk'cPB\u000em\u0018";
        objectArray[45] = "\u0010\u001e\u0006\u0005xm\u0014\u0015[n%\u001d\u001bP\\Rj#C\u000eQP";
        objectArray[46] = ">~\u001c\u0019x30kHE\u0011lTiZ\u001bm3&uG\u0012(PiqEA)+hy@G\u0011";
        objectArray[47] = "Wc\u0014mv\rH~\u001fmMSk\u001eV?uW\u0014{S<)\u0000";
        objectArray[48] = "qU1^h!)\u000b<\\\u0019.\u0018\u0013\"Ze|j\u000f?S \u001f$\u0010!\u0019&sc\rc\u001f\u0019";
        objectArray[49] = "\u000b\u00103AMz\u000f\u001bn*\u0011\nP\u0002:HNhR\feN";
        objectArray[50] = "LhfF\u0013}L)c\u0015+-rkq\u0013Wp\u0000wl\u001a\u0012\u0013NhrP\u0014\u007f\tu0V+";
        objectArray[51] = "p]F3ebb\u0007\u001el\u001fvdD\u00173sD6\u0004Mn/\u00135A\f/ \u007fr\\N)\u001f";
        objectArray[52] = "a\u000e\u001b\u000e0\u0017 P\u0000g7t%]\u0003\u00047\rq\u000e\u0000\u001f\rOqT\\\\hJr\b\u000bg";
        objectArray[53] = "9sQQiY92T\u0002Q\b\u0007pF\u0004-Tul[\rh7;sEGn[|n\u0007AQ";
        objectArray[54] = "Y)<\u0013\n\u0007\u0001w1\u0011{\t0o/\u0017\u0007ZBs2\u001eB9\fl,TDUKqnR{";
        objectArray[55] = "\u0013^Su\u001d1\u0013\u001fV&%o-\u001cR \u001ddH\u0019Q|J";
        objectArray[56] = "c^*E*\u0014\"\u00001,*wgDmPt\u0005{Yd\u0015\u0017J\u007f[7\u0014lKw^1,";
        objectArray[57] = "\tP*nnt\\T6<T2\u0004(1(lq\u0004Z-5e4g\u0015)765\u001c\u0014!20\r";
        objectArray[58] = "-zu<\u0010\u0011l$nU\u0015r)`2)N\u00005};l-O1\u007fhmVN9znU";
        objectArray[59] = "!y;\u0013@\u0000~s7G1_A8$\u0011M\u00013$9\u0018\bb %.QQ]-,6O1";
        objectArray[60] = "\u007fGtOif{L)$2\u0016t\t.\u0018{(,W#\u001a";
        objectArray[61] = "f=tPN^|)lU\u007f\u001a\u0004-v\u000b\u0003Fv1k\u0002F%95iQG^8=lW\u007f";
        objectArray[62] = "F>9\u001a2*\u0007`\"s>IB$~\u000fl;^9wJ\u000frVd~HjwU8)s";
        objectArray[63] = "2k-I}))~/V\u00038;~Q\fci3e3\u000em65\u0005hU;31gj[d5Q";
        objectArray[64] = "=8\u00105)1h<\fg\u0013tS:\t3o+!&\u0014:*Hcp\u000fdk,0;\u000ez\u0013";
        objectArray[65] = "k\u0003h.ZqkBm}b%U\u0000\u007f{\u001e|'\u001cbr[\u001fi\u0003|8]s.\u001e>>b";
        objectArray[66] = "\b\u0005\u0005\u000eW_\bD\u0000]o\f\r|\u0003_\u0004\rGB[\u0001\t\u000f";
        objectArray[67] = "@\u0019L?\u001f}N\f\u0018cv.*\u000e\n=\n}X\u0012\u00174O\u001e\u0017\u0016\u0015gNe\u0016\u001e\u0010av";
        objectArray[68] = "\u0013\u0013&6\bq\u0017\u0018{]UFq\b+6WpOPu;U";
        objectArray[69] = "s4\u0014*\bRw?IAV\"o$Z(VA.zA";
        objectArray[70] = "}&p8\u001b6}guk#eC%gm_;19zd\u001aXx1'm\u0018=}2{:#";
        objectArray[71] = "\u0012}pv4U\u0012<u%\f\u0000,|bb0\u0000Nc\u007fi0";
        objectArray[72] = "S9,\u0011(}\u000b\"2QDl\u000f90{x8YlH\u001cty\u0007$,O?x\u0019\\";
        objectArray[73] = "S\tU\u000425\u0007\u001bI\u0007P:\u0018vA@hy\u0000\u0004]]a<cKY_2=\u0018JQZ4\u0005";
        objectArray[74] = "-`\u0010!P\u0001-!\u0015rhS\u0013%\u00067\u0013P\u007fb\u001bu\u0015";
        objectArray[75] = "p\b\u0007i\u0014\u001a(\u0013\u0019)x\u000b,\b\u001b\u0003D_z\\cdH\u001e$\u0015\u00077\u0003\u001f:m";
        objectArray[76] = "d\u001a\u0002K_'j\u000fV\u00176\u007f\u000e\rDIJ'|\u0011Y@\u000fDd\u001a\u0002K_'j\u000fV\u00176";
        objectArray[77] = "LEa~\n5L\u0004d-2arU2x\u000e*L\rlu\f";
        Object[] objectArray2 = objectArray;
        objectArray[78] = "`\n\u0006\u0001_-4\u0018\u001a\u0002=$P\u000f\u0010\u0005A~\"\u0013\r\f\u0004\u001dm\u0017\u000f_\u0005fl\u001f\nY=";
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0F.e(l2, l3);
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
                clazz3 = _0F.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0F.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0F.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0F.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0F.f(2859563108711642L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0F.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0F.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0F.f(2859563108711642L, 0L);
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
            int n = _0F.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0F.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0F.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0F.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0F.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0F.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x352D;
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
                throw new RuntimeException("dev/krypton/0F", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0F.d[n2] = n3;
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0F.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _0F.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0F.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0F.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0F.c(clazz3, string2, clazz2)) != null) {
                    _0F.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0F.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0F.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0F.f(2859563108711642L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0F f;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x672A49A3DA19L;
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            f = this;
                            class_119092 = class_119093;
                            if (bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_0F.c("x", (Object)class_119093, 5521028628301320051L, (long)l3);
                            objectArray2[0] = (double)_0F.c("x", (Object)class_119092, 5520941660744924200L, (long)l3);
                            if (_0F.c("x", (Object)f, (Object)objectArray2, 5520784194318035709L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0F.a(matchException);
                        }
                        if (_0F.c("x", (Object)class_119093, 5514115034834834528L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0F.a(matchException);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l5;
                    _0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 5520626184570256928L, (long)l3), (Object)objectArray3, 5513232522884814342L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0F.a(matchException);
                }
            }
            f = this;
            class_119092 = class_119093;
        }
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l2;
        objectArray4[1] = bl;
        objectArray4[0] = class_119092;
        super.void_6(objectArray4);
    }

    @Override
    public void void_4(Object[] objectArray) {
        block12: {
            _0F f;
            long l2;
            class_11908 class_119082;
            block10: {
                block11: {
                    class_119082 = (class_11908)objectArray[0];
                    long l3 = (Long)objectArray[1];
                    long l4 = l3;
                    long l5 = l4 ^ 0x458C2AADC2C5L;
                    long l6 = l4 ^ 0x3EEB5B0058F1L;
                    l2 = l4 ^ 0L;
                    boolean bl = _02.cfr_renamed_2();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        f = this;
                                        if (bl) break block10;
                                        if (_0F.c("\u00d8", (Object)f, 6379259212523159895L, (long)l3) == false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0F.a(matchException);
                                    }
                                    if (l3 <= 0L) break block12;
                                    f = this;
                                    if (bl) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw _0F.a(matchException);
                                }
                                if (_0F.c("\u00d8", (Object)_0F.c("\u00d8", (Object)f, 6384865863488405717L, (long)l3), 6377579132356131810L, (long)l3) == false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _0F.a(matchException);
                            }
                            if (_0F.c("x", (Object)class_119082, 6378950962766218954L, (long)l3) != _0F.a("g", 15224, (long)(0x396D8DF8D8CE56DBL ^ l3))) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _0F.a(matchException);
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = (boolean)_0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 6384740817837468198L, (long)l3), (Object)objectArray2, 6378743764530727787L, (long)l3);
                        objectArray3[0] = l6;
                        _0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 6384740817837468198L, (long)l3), (Object)objectArray3, 6378335550436229401L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _0F.a(matchException);
                    }
                }
                f = this;
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = class_119082;
            super.void_4(objectArray4);
        }
    }

    @Override
    protected void void_8(Object[] objectArray) {
        reference v4;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        long l15;
        long l16;
        long l17;
        _87 var2_2;
        block7: {
            long l18;
            long l19;
            block8: {
                float f;
                var2_2 = (_87)objectArray[0];
                int n = (Integer)objectArray[1];
                int n2 = (Integer)objectArray[2];
                l17 = (Long)objectArray[3];
                float f2 = ((Float)objectArray[4]).floatValue();
                long l20 = l17;
                l16 = l20 ^ 0x58144273CC5CL;
                l15 = l20 ^ 0x332099301D7CL;
                l14 = l20 ^ 0x570C24C53811L;
                l13 = l20 ^ 0x58FD0C4EDE34L;
                l12 = l20 ^ 0xDDCE291293EL;
                l11 = l20 ^ 0x7238D2000367L;
                l10 = l20 ^ 0x310130337E2AL;
                l19 = l20 ^ 0x2AF2DB09C70AL;
                l9 = l20 ^ 0x7A6C12932174L;
                l8 = l20 ^ 0x538DF2D376DEL;
                l7 = l20 ^ 0x7F2CE5EAB728L;
                l6 = l20 ^ 0x2942C15F9E3FL;
                l5 = l20 ^ 0x6C6533DC12C4L;
                l4 = l20 ^ 0x22B6A7D81325L;
                long l21 = l20 ^ 0x6D564BE5A6EFL;
                l18 = l20 ^ 0x4A7C3F174665L;
                l3 = l20 ^ 0x88823B1F239L;
                l2 = l20 ^ 0x203A80591513L;
                boolean bl = _02.cfr_renamed_2();
                try {
                    f = _0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 7742094953342474700L, (long)l17), (long)l21, 7740873409009352575L, (long)l17) != false ? 1.0f : 0.0f;
                }
                catch (MatchException matchException) {
                    throw _0F.a(matchException);
                }
                float f3 = f;
                try {
                    try {
                        _0F f4 = this;
                        _0F.c("s", (Object)f4, (float)(_0F.c("\u00d8", (Object)f4, 7740691027569117951L, (long)l17) + (f3 - _0F.c("\u00d8", (Object)this, 7740691027569117951L, (long)l17)) * 0.25f), 7740691027569117951L, (long)l17);
                        reference v4 = _0F.c("\u00cd", (float)(_0F.c("\u00d8", (Object)this, 7740691027569117951L, (long)l17) - f3), 7741619010402841374L, (long)l17) - 0.005f;
                        v4 = v4 == 0 ? 0 : (v4 < 0 ? -1 : 1);
                        if (bl) break block7;
                        if (v4 >= 0) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _0F.a(matchException);
                    }
                    _0F.c("s", (Object)this, (float)f3, 7740691027569117951L, (long)l17);
                }
                catch (MatchException matchException) {
                    throw _0F.a(matchException);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l19;
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l18;
            v4 = _0F.c("x", (Object)this, (Object)objectArray2, 7740916431273893678L, (long)l17) + _0F.c("x", (Object)this, (Object)objectArray3, 7741769504675494068L, (long)l17) + _0F.c("\u00d8", (Object)this, 7742391612325488193L, (long)l17);
        }
        reference var46_27 = v4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l8;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l11;
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = _0F.c("k", 7742656881568986421L, (long)l17);
        objectArray7[3] = (double)(var46_27 + _0F.c("x", (Object)this, (Object)objectArray6, 7740262032232582348L, (long)l17) / 2 - _0F.a("g", 25044, (long)(0x3F6471A4D1A8BF98L ^ l17)));
        objectArray7[2] = (double)(_0F.c("x", (Object)this, (Object)objectArray5, 7740749706926273227L, (long)l17) + _0F.a("g", 22486, (long)(0x771F8713341B8998L ^ l17)));
        objectArray7[1] = _0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 7742094953342474700L, (long)l17), (Object)objectArray4, 7741379926681062290L, (long)l17);
        objectArray7[0] = l14;
        _0F.c("x", (Object)var2_2, (Object)objectArray7, 7741726231739878419L, (long)l17);
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l8;
        reference var47_28 = _0F.c("x", (Object)this, (Object)objectArray8, 7740749706926273227L, (long)l17) + _0F.a("g", 11530, (long)(0x192B9B537F357340L ^ l17));
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l11;
        reference var48_29 = var46_27 + (_0F.c("x", (Object)this, (Object)objectArray9, 7740262032232582348L, (long)l17) - _0F.a("g", 8534, (long)(0x73E8FEB67140FF16L ^ l17))) / 2 + true;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l6;
        _0F.c("x", (Object)_0F.c("k", 7740163844494646629L, (long)l17), (Object)objectArray10, 7742391006388661412L, (long)l17);
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l10;
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l15;
        _0F.c("x", (Object)_0F.c("\u00cd", (Object)objectArray11, 7742556732190343809L, (long)l17), (Object)objectArray12, 7741904001677638488L, (long)l17);
        Object[] objectArray13 = new Object[14];
        objectArray13[13] = false;
        objectArray13[12] = 1.0;
        objectArray13[11] = l5;
        objectArray13[10] = _0F.c("k", 7741984843497253831L, (long)l17);
        objectArray13[9] = _0F.c("k", 7740416462273448484L, (long)l17);
        objectArray13[8] = _0F.c("k", 7741452971980746056L, (long)l17);
        objectArray13[7] = 4.0;
        objectArray13[6] = 4.0;
        objectArray13[5] = 4.0;
        objectArray13[4] = 4.0;
        objectArray13[3] = (double)(var48_29 + _0F.a("g", 13463, (long)(0x44C6DD81CF47EAD1L ^ l17)));
        objectArray13[2] = (double)(var47_28 + _0F.a("g", 13463, (long)(0x44C6DD81CF47EAD1L ^ l17)));
        objectArray13[1] = (double)var48_29;
        objectArray13[0] = (double)var47_28;
        _0F.c("\u00cd", (Object)objectArray13, 7741537976606679338L, (long)l17);
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l10;
        Object[] objectArray15 = new Object[1];
        objectArray15[0] = l16;
        _0F.c("x", (Object)_0F.c("\u00cd", (Object)objectArray14, 7742556732190343809L, (long)l17), (Object)objectArray15, 7740480629610384622L, (long)l17);
        Object[] objectArray16 = new Object[1];
        objectArray16[0] = l4;
        _0F.c("x", (Object)_0F.c("k", 7740163844494646629L, (long)l17), (Object)objectArray16, 7742718873399527877L, (long)l17);
        if (_0F.c("\u00d8", (Object)this, 7740691027569117951L, (long)l17) > 0.01f) {
            Object[] objectArray17 = new Object[1];
            objectArray17[0] = l2;
            Object[] objectArray18 = new Object[1];
            objectArray18[0] = l9;
            Object[] objectArray19 = new Object[1];
            objectArray19[0] = l13;
            _8B b = new _8B((int)_0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 7741873553242230953L, (long)l17), (Object)objectArray17, 7741019729410826421L, (long)l17), (int)_0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 7741873553242230953L, (long)l17), (Object)objectArray18, 7740612627809427963L, (long)l17), l12, (int)_0F.c("x", (Object)_0F.c("\u00d8", (Object)this, 7741873553242230953L, (long)l17), (Object)objectArray19, 7740294158409923653L, (long)l17), (int)(220.0f * _0F.c("\u00d8", (Object)this, 7740691027569117951L, (long)l17)));
            Object[] objectArray20 = new Object[10];
            objectArray20[9] = 4.0;
            objectArray20[8] = 4.0;
            objectArray20[7] = 4.0;
            objectArray20[6] = 4.0;
            objectArray20[5] = l7;
            objectArray20[4] = (double)(var48_29 + _0F.a("g", 13463, (long)(0x44C6DD81CF47EAD1L ^ l17)));
            objectArray20[3] = (double)(var47_28 + _0F.a("g", 13463, (long)(0x44C6DD81CF47EAD1L ^ l17)));
            objectArray20[2] = (double)var48_29;
            objectArray20[1] = (double)var47_28;
            objectArray20[0] = b;
            _0F.c("x", (Object)var2_2, (Object)objectArray20, 7741259494518271700L, (long)l17);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0F.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0F.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

