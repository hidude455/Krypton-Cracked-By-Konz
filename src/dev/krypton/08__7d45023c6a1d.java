/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4D;
import dev.krypton._4t;
import dev.krypton._6e_0;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._95;
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
import net.minecraft.class_11909;

public class _08
extends _0v {
    private static final _8B cfr_renamed_4;
    private static final _8B cfr_renamed_6;
    private static final _8B cfr_renamed_8;
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_0;
    private static final float cfr_renamed_10 = 5.0f;
    private static final float cfr_renamed_9 = 10.0f;
    private static final float cfr_renamed_5 = 50.0f;
    private static final int cfr_renamed_11;
    private final _6e_0 cfr_renamed_1;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    public _08(long l2, _4t t, _95 var4_3, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x5F68E76F84F6L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var4_3, n, n3, (char)n4);
        this.cfr_renamed_1 = (_6e_0)var4_3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _08.a = l.a(7183339646332112783L, 3045661181288363120L, MethodHandles.lookup().lookupClass()).a(203924702111682L);
                    v0 = var20 = _08.a ^ 60370883263853L;
                    var22_1 = v0 ^ 19465719310444L;
                    var24_2 = v0 ^ 131706456270333L;
                    _08.n = new Object[78];
                    _08.o = new String[78];
                    _08.b();
                    _08.e = new HashMap<K, V>(13);
                    var11_3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var20 >>> 56);
                    for (var12_4 = 1; var12_4 < 8; ++var12_4) {
                        v3 = v3;
                        v3[var12_4] = (byte)(var20 << var12_4 * 8 >>> 56);
                    }
                    var11_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                    var18_5 = new String[2];
                    var16_6 = 0;
                    var15_7 = "Z\u0002 f\u0094\u00fc!\u0016\u008dH\u00af\u00ef\u00ddQ!u\u0010\u00ee\u00d3\u00a1\u00cas\u0001\u00c7\u00cb\u0006S\u00db~2\u00a5>\u000f";
                    var17_8 = "Z\u0002 f\u0094\u00fc!\u0016\u008dH\u00af\u00ef\u00ddQ!u\u0010\u00ee\u00d3\u00a1\u00cas\u0001\u00c7\u00cb\u0006S\u00db~2\u00a5>\u000f".length();
                    var14_9 = 16;
                    var13_10 = -1;
lbl26:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var18_5[var16_6++] = _08.a(var19_11).intern();
                        if ((var13_10 += var14_9) < var17_8) {
                            var14_9 = var15_7.charAt(var13_10);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v4 = ++var13_10;
                    var19_11 = var11_3.doFinal(var15_7.substring(v4, v4 + var14_9).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _08.c = var18_5;
                _08.d = new String[2];
                _08.k = new HashMap<K, V>(13);
                var0_12 = Cipher.getInstance("DES/CBC/NoPadding");
                v5 = SecretKeyFactory.getInstance("DES");
                v6 = new byte[8];
                v7 = v6;
                v6[0] = (byte)(var20 >>> 56);
                for (var1_13 = 1; var1_13 < 8; ++var1_13) {
                    v7 = v7;
                    v7[var1_13] = (byte)(var20 << var1_13 * 8 >>> 56);
                }
                var0_12.init(2, (Key)v5.generateSecret(new DESKeySpec(v7)), new IvParameterSpec(new byte[8]));
                var6_14 = new long[18];
                var3_15 = 0;
                var4_16 = "_d\u009c\u00b6''\u00cb\r?\u00e3\u00cfG\u00d33Y\u00b2k\u00afQ\u00eb\u00e5\u00f9\"\u00de\u00f8\u0014Wy\u00c8B.\u00f8tr\u0096\u0015\u0013\u00f7\u008d-:\u0017\u00f6\u00fc\u00de\u009a\u0098\u00f9`c\u0015\u0091iW\u0018\u0095zM\u00a4\u00a20\u009c\u00ed\u00d6\u00bc\u00d5\u00a9y4/Q\u001f\u008c\u008ay\u009bF\u0005t\u00a6j\u00a7\u00e7uD)\u00c8v\"\u0016\u00b0\u00e8&\u009f>1t\u000f\u00e3E\u00cc\u00a6fq\u0099\u00df\u0014\u00cb\u009d\u00c5|>\u00fa.\t\u008eF\u00a4\u00fc\u00a8\u00c5|\u00fa\u00e2/\u00f2\u00fd/";
                var5_17 = "_d\u009c\u00b6''\u00cb\r?\u00e3\u00cfG\u00d33Y\u00b2k\u00afQ\u00eb\u00e5\u00f9\"\u00de\u00f8\u0014Wy\u00c8B.\u00f8tr\u0096\u0015\u0013\u00f7\u008d-:\u0017\u00f6\u00fc\u00de\u009a\u0098\u00f9`c\u0015\u0091iW\u0018\u0095zM\u00a4\u00a20\u009c\u00ed\u00d6\u00bc\u00d5\u00a9y4/Q\u001f\u008c\u008ay\u009bF\u0005t\u00a6j\u00a7\u00e7uD)\u00c8v\"\u0016\u00b0\u00e8&\u009f>1t\u000f\u00e3E\u00cc\u00a6fq\u0099\u00df\u0014\u00cb\u009d\u00c5|>\u00fa.\t\u008eF\u00a4\u00fc\u00a8\u00c5|\u00fa\u00e2/\u00f2\u00fd/".length();
                var2_18 = 0;
                while (true) {
                    var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                    v8 = var6_14;
                    v9 = var3_15++;
                    v10 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                    v11 = -1;
                    break block13;
                    break;
                }
lbl64:
                // 1 sources

                while (true) {
                    v8[v9] = v12;
                    if (var2_18 < var5_17) ** continue;
                    var4_16 = "\u00e2\r\u00d9\u0016f\u00ee8}t\u00a9\u009b\u00b9r\u00b5\u00ea\u0083";
                    var5_17 = "\u00e2\r\u00d9\u0016f\u00ee8}t\u00a9\u009b\u00b9r\u00b5\u00ea\u0083".length();
                    var2_18 = 0;
                    while (true) {
                        var7_19 = var4_16.substring(var2_18, var2_18 += 8).getBytes("ISO-8859-1");
                        v8 = var6_14;
                        v9 = var3_15++;
                        v10 = ((long)var7_19[0] & 255L) << 56 | ((long)var7_19[1] & 255L) << 48 | ((long)var7_19[2] & 255L) << 40 | ((long)var7_19[3] & 255L) << 32 | ((long)var7_19[4] & 255L) << 24 | ((long)var7_19[5] & 255L) << 16 | ((long)var7_19[6] & 255L) << 8 | (long)var7_19[7] & 255L;
                        v11 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v8[v9] = v12;
                    if (var2_18 < var5_17) ** continue;
                    break block14;
                    break;
                }
            }
            var8_20 = v10;
            var10_21 = var0_12.doFinal(new byte[]{(byte)(var8_20 >>> 56), (byte)(var8_20 >>> 48), (byte)(var8_20 >>> 40), (byte)(var8_20 >>> 32), (byte)(var8_20 >>> 24), (byte)(var8_20 >>> 16), (byte)(var8_20 >>> 8), (byte)var8_20});
            v12 = ((long)var10_21[0] & 255L) << 56 | ((long)var10_21[1] & 255L) << 48 | ((long)var10_21[2] & 255L) << 40 | ((long)var10_21[3] & 255L) << 32 | ((long)var10_21[4] & 255L) << 24 | ((long)var10_21[5] & 255L) << 16 | ((long)var10_21[6] & 255L) << 8 | (long)var10_21[7] & 255L;
            switch (v11) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl90:
                // 1 sources

                ** continue;
            }
        }
        _08.i = var6_14;
        _08.j = new Integer[18];
        _08.cfr_renamed_11 = (int)_08.c("b", (int)17393, (long)(var20 ^ 8840405108183441898L));
        _08.cfr_renamed_4 = new _8B((int)_08.c("b", (int)29617, (long)(1913700026675106210L ^ var20)), (int)_08.c("b", (int)1788, (long)(6533076616781882597L ^ var20)), var22_1, (int)_08.c("b", (int)25405, (long)(5499810639495332150L ^ var20)), (int)_08.c("b", (int)26212, (long)(3462588168826946683L ^ var20)));
        _08.cfr_renamed_6 = new _8B((int)_08.c("b", (int)5856, (long)(406799824843109620L ^ var20)), (int)_08.c("b", (int)1205, (long)(5740563005758695103L ^ var20)), var22_1, (int)_08.c("b", (int)11770, (long)(1563894832254701547L ^ var20)), (int)_08.c("b", (int)14944, (long)(177123567748503672L ^ var20)));
        _08.cfr_renamed_8 = new _8B((int)_08.c("b", (int)15441, (long)(3831842964115971652L ^ var20)), (int)_08.c("b", (int)29323, (long)(3139358739907055767L ^ var20)), var22_1, (int)_08.c("b", (int)29323, (long)(3139358739907055767L ^ var20)), (int)_08.c("b", (int)1788, (long)(6533076616781882597L ^ var20)));
        _08.cfr_renamed_2 = new _8B((int)_08.c("b", (int)29323, (long)(3139358739907055767L ^ var20)), (int)_08.c("b", (int)29323, (long)(3139358739907055767L ^ var20)), var22_1, (int)_08.c("b", (int)29323, (long)(3139358739907055767L ^ var20)), (int)_08.c("b", (int)27441, (long)(7313410867458574639L ^ var20)));
        _08.cfr_renamed_0 = new _8B((int)_08.c("b", (int)1508, (long)(2438074339562645492L ^ var20)), var24_2, (int)_08.c("b", (int)12878, (long)(5500969256633290840L ^ var20)), (int)_08.c("b", (int)11294, (long)(2200936074091318793L ^ var20)));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _08.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 6;
            case 1 -> 54;
            case 2 -> 18;
            case 3 -> 49;
            case 4 -> 16;
            case 5 -> 56;
            case 6 -> 31;
            case 7 -> 32;
            case 8 -> 36;
            case 9 -> 7;
            case 10 -> 12;
            case 11 -> 13;
            case 12 -> 9;
            case 13 -> 55;
            case 14 -> 45;
            case 15 -> 20;
            case 16 -> 26;
            case 17 -> 23;
            case 18 -> 44;
            case 19 -> 22;
            case 20 -> 37;
            case 21 -> 50;
            case 22 -> 0;
            case 23 -> 8;
            case 24 -> 42;
            case 25 -> 60;
            case 26 -> 29;
            case 27 -> 59;
            case 28 -> 33;
            case 29 -> 57;
            case 30 -> 40;
            case 31 -> 51;
            case 32 -> 21;
            case 33 -> 2;
            case 34 -> 3;
            case 35 -> 41;
            case 36 -> 28;
            case 37 -> 15;
            case 38 -> 58;
            case 39 -> 19;
            case 40 -> 52;
            case 41 -> 27;
            case 42 -> 17;
            case 43 -> 46;
            case 44 -> 35;
            case 45 -> 4;
            case 46 -> 25;
            case 47 -> 1;
            case 48 -> 5;
            case 49 -> 62;
            case 50 -> 14;
            case 51 -> 24;
            case 52 -> 34;
            case 53 -> 30;
            case 54 -> 48;
            case 55 -> 10;
            case 56 -> 39;
            case 57 -> 43;
            case 58 -> 47;
            case 59 -> 61;
            case 60 -> 53;
            case 61 -> 63;
            case 62 -> 38;
            default -> 11;
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
        _08.o[n3] = new String(cArray);
        return n3;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/08" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fb' || c == 'I' || c == '\u00e6' || c == '\u00c9') {
                field = _08.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fb' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _08.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _08.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "\u0014\u0003X$\u0014-\u001f\fIki5\f\u000b@\"";
        objectArray[1] = Integer.TYPE;
        _08.o[1] = "java/lang/Integer";
        objectArray[2] = "C`m~?#^uo?:\u007f\u0014K";
        objectArray[3] = "z\u0016\u0001~;Ng\u0003\u0003?>\u0012.\u0005";
        objectArray[4] = "\nkQi\u0010T\u007fKZf\u0001\u001b\u001eEQm\u0005Aj";
        objectArray[5] = "\u0003\f3\u0003i\u0016\u001e\u00191BlJ_^";
        objectArray[6] = "?b1\u0017itJB:\u0018x;+L1\u0013|a_";
        objectArray[7] = Double.TYPE;
        _08.o[7] = "java/lang/Double";
        objectArray[8] = "\"3|ln!W\u0013wc\u007fn6\u001d|h{4B";
        objectArray[9] = "\u0012\u000e8lZ\u0001\u000f\u001b:-_]FS";
        objectArray[10] = "3\u0001}\u0001K\u001a.\u0014\u007f@NFo&";
        objectArray[11] = "+C\u000f:+\u00016V\r{.]yC";
        objectArray[12] = "x\u0003\u000f\u0003`/e\u0016\rBes,#";
        objectArray[13] = "@rm\u000f\u000205Rf\u0000\u0013\u007fT\\m\u000b\u0017% ";
        objectArray[14] = Void.TYPE;
        _08.o[14] = "java/lang/Void";
        objectArray[15] = "\\<^\u0012L=)\u001cU\u001d]rH\u0012^\u0016Y(<";
        objectArray[16] = "}3bhm1\b\u0013ig|~i\u001dblx$\u001d";
        objectArray[17] = "M\u0006*<Tb8&!3E-Y(*8Aw-";
        objectArray[18] = "1\u0011\bS6\u0007:\u001e\u0019\u001cU\n/\u0018";
        objectArray[19] = Float.TYPE;
        _08.o[19] = "java/lang/Float";
        objectArray[20] = ";Y8yN\u0006Ny3v_I/w8}[\u0013[";
        objectArray[21] = "\u0017\n\\\u0004\bN\n\u001f^E\r\u0012JZ";
        objectArray[22] = "l\fgDpn\u0019,lKa!x\"g@e{\f";
        objectArray[23] = "\u000bhq\n'(\u0016}sK\"tV5";
        objectArray[24] = "L\u0001?\u0012\u0005\f9!4\u001d\u0014CX/?\u0016\u0010\u0019,";
        objectArray[25] = "Y7\u000f\"&p,\u0017\u0004-7?M\u0019\u000f&3e9";
        objectArray[26] = "G\u0014\u0002:}\u001224\t5l]S:\u0002>h\u0007'";
        objectArray[27] = "U\u007f+E2d _ J#+AQ+A'q5";
        objectArray[28] = "B\u00040l4\u00197$;c%VV*0h!\f\"";
        objectArray[29] = Boolean.TYPE;
        _08.o[29] = "java/lang/Boolean";
        objectArray[30] = "Tr-A8\u0010!R&N)_@\\-E-\u00054";
        objectArray[31] = "`l@Y\u0002d\u0015LKV\u0013+tB@]\u0017q\u0000";
        objectArray[32] = "\u000bm\u000f\u0010T\u007f~M\u0004\u001fE0\u001fC\u000f\u0014Ajk";
        objectArray[33] = "d\u00157T;Z\u00115<[*\u0015p;7P.O\u0004";
        objectArray[34] = "\u0004\t#sT2q)(|E}\u0010'#wA'd";
        objectArray[35] = "\bJ(x~6\bJ?$r9\u0012\u0001?:r,\u0015pmg*o_";
        objectArray[36] = "}{e $ `nga!|+";
        objectArray[37] = "#XRJ\u000bI#XE\u0016\u0007F9\u0013E\b\u0007S>b\u0015UV";
        objectArray[38] = "l'wi4Yl'`58Vvl`+8Cq\u001d7tn";
        objectArray[39] = "T<\u001apCi_3\u000b?\"gT8\u000fe";
        objectArray[40] = "('E\u0016\nw$|\u0011Ci\u007f\"1\u001c@\u0005MpqF\u001bT\u001av|\u001cX\u0014h#,A\\i";
        objectArray[41] = "GC\u0013\u00056$\u001aZH\u001bG}~\u0007SC<<\u0017ZJ\u0018\"";
        objectArray[42] = "\u0014H<\u0007g*\\^4\u0012\u001fw.Ik\u0016.>Q@6\u0012pF\u0017\u001el\u0017b4BN1\u0013\u001f";
        objectArray[43] = "I(jB4!\u0014*eZIruwaXx;\n~<\\&CI`j@7,\u0004 |II";
        objectArray[44] = "\u0017\u0006\bpe\nJ\u0004\u0007h\u0018T+Y\u0003j)\u0010TP^nwh\u0011\u0000\\}z\u0018JC_\u0014";
        objectArray[45] = "}+\u001b\u0007f82iA\r\u0005hChA[j7?0\u001d\u0005\u007f";
        objectArray[46] = "Z\u0018T)\u000b{\u0001[W@\rf\u0006H\u0010 i2QG\u0013=\u001bg\u0001\u001a\u0017@";
        objectArray[47] = "HnQOe \u0007,\u000bE\u0006qv\"\u0004\t|&\u001d)E\u0016w";
        objectArray[48] = "-5\u001eVy4a?\u0003H\u0000c\u001d?\u0007T1'b6ZPo_,\"\u000fQ}&%c]\u0010\u0000";
        objectArray[49] = "L\u0013i$5a\u0003Q3.V?rP3x9n\u000e\bo&,";
        objectArray[50] = "d2LZ+,,$DOS}^3\u001bKb8!:FO<@gd\u001cJ.224ANS";
        objectArray[51] = "P\u0019nm\u0015#\u0018\u000ffxmqj\u00189|\\7\u0015\u0011dx\u0002OSO>}\u0010=\u0006\u001fcym";
        objectArray[52] = "M,L\u0007\u001e\u000e\u0005:D\u0012f]w-\u001b\u0016W\u001a\b$F\u0012\tbNz\u001c\u0017\u001b\u0010\u001b*A\u0013f";
        objectArray[53] = "\bFyF9%\u0016N.KI9\u001d]'M%\u000bI\u001c\u007f\u0015I%\u000f\u001e+Cr3\u0001Y(*x'\u001fZ:SqfM\u001bG";
        objectArray[54] = "\u0012\u000boz77C\\|,Fc\u0017F\u000e/-x\u0015Vn/ 8\u001f6b(8m\u001eVb%xg~Ze=-f\u001eZh}'\u0006";
        objectArray[55] = "H|r.Hv\u0013?qGQ{\u001886=K`\u001dCsvJy\u000f1&&\u0017}rz{'U{\u0000/+zQ\u0006H|r.Hv\u0013?qG";
        objectArray[56] = ".d/T\"\u0002a&u^AX\u0010~#\u0010p\u001aow~\u0014.b*'|\u0007#\u0012qd\u007fn";
        objectArray[57] = "C4YpAbRm\u0004n}\".6^~LgQ?\u0003z\u0012\u001f\u0014o\u0001i\u001foO,\u0002\u0000";
        objectArray[58] = "\u0002\u0018(!_ MZr+<}<[r}S/@\u0003.#F";
        objectArray[59] = "d\\ZA}Ij\u000b\u0001T\u0006\u000f\u000bS\u0006U7HtZ[Qi0:N\u000eP{I3\u000f\\\u0011\u0006";
        objectArray[60] = "-kHSX&&*WX>q\u001d3SW\u000f5b:\u000eSQM'j\f@\\=|)\u000f)";
        objectArray[61] = "G\u001dDnV0\b_\u001ed5ky^\u001e2Z?\u0005\u0006BlO";
        objectArray[62] = "q56j8\u0010>wl`[HOvl64\u001f3.0h!";
        objectArray[63] = "\u001e_R\u0016}{C]]\u000e\u0000%\"\u0000Y\f1a]\t\u0004\bo\u0019\u001e\u0017R\u0014~vSWD\u001d\u0000";
        objectArray[64] = "\u0012i\u0015U-jZ\u007f\u001d@U<(hBDd~Wa\u001f@:\u0006\u0011?EE(tDo\u0018AU";
        objectArray[65] = "\t+\u0013,NvA=\u001b96'\bL\u001crPu\\0D.\u000e`";
        objectArray[66] = ";%ms_\u0016w/pm&M\u000b/tq\u0017\u0005t&)uI}:2|t[\u00043s.5&";
        objectArray[67] = "k\u001e\u001e\u0007\u001f\u00060]\u001dn\u001c\r\u001cD^\u0012\fv2K\u001f\u0000\u0010M`KI\u001f}";
        objectArray[68] = "\u0011W\u0005o`.YA\rz\u0018\u007f+VR~):T_\u000fzwBHZ\fnuy\u001aZZq\u0018";
        objectArray[69] = "F\u001fvgpq\u001b\u0006-y\u0001'\u0004b-{\u007f)\u0007\u001d$&{w\u007fS0sze\u0006Zq!;\u0018";
        objectArray[70] = "\u001d\u0012S(*\u001d\u0011I\u0007}I\u001b\u001d\u001d\u0012NuOKHj%8\u001c\u001c\u0006\u0005hx\n\u0015x";
        objectArray[71] = "QSBD\u0011T\u0019EJQi\u0004k\rCK\u0016E\u0019X\u0013\u0016\u0012";
        objectArray[72] = "m1\u001a~\u001e_!;\u0007`g\u000f];\u0003|VL\"2^x\b4m1\u001a~\u001e_!;\u0007`g";
        objectArray[73] = "%gN\u0006\fg=`\u0004\u0013we\u0006YL\rI0- R\u0005\u001e=";
        objectArray[74] = "m\u0018\u0004mj,aCP8\t*m\u0017E\u000b5~;C=`x-l\fR-8;er";
        objectArray[75] = "_\u00163n{N\u0002\u0014<v\u0006\u001ccI8t7T\u001c@epi,_^3lxC\u0012\u001e%e\u0006";
        objectArray[76] = "z$/]d\u000f22'H\u001cY@|.Ts\f<$r\nf";
        Object[] objectArray2 = objectArray;
        objectArray[77] = "\r\f~<i(P\u0015%\"\u0018x4\u0017$9)9K\u001ey=wA\u0005\n,<e8\fK~}\u0018";
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _08.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/08" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4828;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/08", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _08.j[n2] = n3;
        }
        return j[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _08.e(l2, l3);
        Object object = _08.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = _08.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _08.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _08.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _08.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _08.f(2777669146442639L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _08.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _08.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _08.f(2777669146442639L, 0L);
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
            int n = _08.e(l2, l3);
            object = _08.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _08.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _08.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _08.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _08.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _08.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _08.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6A38;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/08", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _08.d[n2] = _08.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (j >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/08" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _08.e(l2, l3);
        Object object = _08.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _08.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _08.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _08.c(clazz3, string2, clazz2)) != null) {
                    _08.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _08.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _08.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _08.f(2777669146442639L, 0L);
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
        _08 v1;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x3B13E0A45E26L;
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            v1 = this;
                            class_119092 = class_119093;
                            if (bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_08.e("\u00d1", (Object)class_119093, 5521100978229445844L, (long)l3);
                            objectArray2[0] = (double)_08.e("\u00d1", (Object)class_119092, 5520802872718942879L, (long)l3);
                            if (_08.e("\u00d1", (Object)v1, (Object)objectArray2, 5520685865933511525L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _08.a(matchException);
                        }
                        if (_08.e("\u00d1", (Object)class_119093, 5514202699320177710L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _08.a(matchException);
                    }
                    _08.e("\u00d1", (Object)_08.e("\u00e6", 5520871501948409970L, (long)l3), (Object)new _4D((_6e_0)((Object)_08.e("\u00fb", (Object)this, 5514557127176461034L, (long)l3)), l5), 5512687772254977529L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _08.a(matchException);
                }
            }
            v1 = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    private String java_lang_String_2(Object[] objectArray) {
        Object object;
        block4: {
            long l2;
            String string;
            block5: {
                string = (String)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        object = string;
                        if (!bl) break block4;
                        if (_08.e("\u00d1", (Object)object, 806673751031181346L, (long)l2) > _08.c("b", 11044, (long)(0x39B06525A9F16831L ^ l2))) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _08.a(matchException);
                    }
                    return string;
                }
                catch (MatchException matchException) {
                    throw _08.a(matchException);
                }
            }
            object = (String)((Object)_08.e("\u00d1", string, 0, (int)_08.c("b", 24382, (long)(0x27C3E845644A9C24L ^ l2)), 808301753336877862L, (long)l2)) + (String)((Object)_08.a("y", 27082, (long)(0x2CC2C89C9A8088C9L ^ l2)));
        }
        return object;
    }

    @Override
    protected void void_8(Object[] objectArray) {
        CallSite callSite;
        double d;
        double d2;
        CallSite callSite2;
        _87 v36;
        CallSite callSite3;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        CallSite callSite4;
        CallSite callSite5;
        float f;
        reference var53_26;
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
        int n;
        int n2;
        _87 var7_2;
        block8: {
            long l17;
            block9: {
                var7_2 = (_87)objectArray[0];
                n2 = (Integer)objectArray[1];
                n = (Integer)objectArray[2];
                l16 = (Long)objectArray[3];
                float f2 = ((Float)objectArray[4]).floatValue();
                long l18 = l16;
                long l19 = l18 ^ 0x7D5CBD7F4B3DL;
                l15 = l18 ^ 0x58144273CC5CL;
                l17 = l18 ^ 0x48EC003BF705L;
                l14 = l18 ^ 0x764D0226F048L;
                l13 = l18 ^ 0x332099301D7CL;
                l12 = l18 ^ 0x570C24C53811L;
                l11 = l18 ^ 0x7238D2000367L;
                l10 = l18 ^ 0x310130337E2AL;
                long l20 = l18 ^ 0x2AF2DB09C70AL;
                l9 = l18 ^ 0x538DF2D376DEL;
                long l21 = l18 ^ 0x2F94A102B012L;
                l8 = l18 ^ 0x4C3749C28209L;
                l7 = l18 ^ 0x16D0603ED0FFL;
                l6 = l18 ^ 0x2942C15F9E3FL;
                l5 = l18 ^ 0x6C6533DC12C4L;
                l4 = l18 ^ 0x22B6A7D81325L;
                long l22 = l18 ^ 0x4A7C3F174665L;
                l3 = l18 ^ 0x34D41487C3D7L;
                l2 = l18 ^ 0x88823B1F239L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l20;
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l22;
                var53_26 = _08.e("\u00d1", (Object)this, (Object)objectArray2, 7740911535957797660L, (long)l16) + _08.e("\u00d1", (Object)this, (Object)objectArray3, 7741710473796905938L, (long)l16) + _08.e("\u00fb", (Object)this, 7742236989494666382L, (long)l16);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l21;
                f = (float)_08.e("\u00d1", (Object)var7_2, (Object)objectArray4, 7740279079989890233L, (long)l16);
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l19;
                callSite5 = _08.e("\u00d1", (Object)_08.e("\u00fb", (Object)this, 7740529328263707910L, (long)l16), (Object)objectArray5, 7741442445618322461L, (long)l16);
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        callSite4 = callSite5;
                        if (!bl) break block8;
                        if (_08.e("\u00d1", (Object)callSite4, 7741944568525640936L, (long)l16) == false) break block9;
                    }
                    catch (MatchException matchException) {
                        throw _08.a(matchException);
                    }
                    callSite4 = _08.a("y", 29278, (long)(0x589449D30B887306L ^ l16));
                    break block8;
                }
                catch (MatchException matchException) {
                    throw _08.a(matchException);
                }
            }
            Object[] objectArray6 = new Object[2];
            objectArray6[1] = l17;
            objectArray6[0] = callSite5;
            callSite4 = _08.e("\u00d1", (Object)this, (Object)objectArray6, 7741184712898202768L, (long)l16);
        }
        CallSite callSite6 = callSite4;
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l14;
        objectArray7[0] = callSite6;
        float f3 = (float)_08.e("\u00d1", (Object)var7_2, (Object)objectArray7, 7742477238545314090L, (long)l16);
        CallSite callSite7 = _08.e("\u00c6", (float)(f3 + 20.0f), 50.0f, 7740985575581385330L, (long)l16);
        float f4 = f + 8.0f;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l9;
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l7;
        float f5 = (float)(_08.e("\u00d1", (Object)this, (Object)objectArray8, 7740810948254526085L, (long)l16) + _08.e("\u00d1", (Object)this, (Object)objectArray9, 7740708378868470795L, (long)l16)) - callSite7 - 5.0f;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l11;
        float f6 = (float)var53_26 + ((float)_08.e("\u00d1", (Object)this, (Object)objectArray10, 7740144898048833041L, (long)l16) - f4) / 2.0f;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l9;
        float f7 = f5 - (float)_08.e("\u00d1", (Object)this, (Object)objectArray11, 7740810948254526085L, (long)l16) - 10.0f;
        Object[] objectArray12 = new Object[1];
        objectArray12[0] = l2;
        Object[] objectArray13 = new Object[3];
        objectArray13[2] = (double)f7;
        objectArray13[1] = _08.e("\u00d1", (Object)_08.e("\u00fb", (Object)this, 7740529328263707910L, (long)l16), (Object)objectArray12, 7741230683104671913L, (long)l16);
        objectArray13[0] = l3;
        CallSite callSite8 = _08.e("\u00d1", (Object)var7_2, (Object)objectArray13, 7740333457057040502L, (long)l16);
        Object[] objectArray14 = new Object[1];
        objectArray14[0] = l9;
        Object[] objectArray15 = new Object[5];
        objectArray15[4] = _08.e("\u00e6", 7742533773979029186L, (long)l16);
        objectArray15[3] = (double)(var53_26 + _08.c("b", 6605, (long)(0x72F214B99D11BA85L ^ l16)));
        objectArray15[2] = (double)(_08.e("\u00d1", (Object)this, (Object)objectArray14, 7740810948254526085L, (long)l16) + 5);
        objectArray15[1] = callSite8;
        objectArray15[0] = l12;
        _08.e("\u00d1", (Object)var7_2, (Object)objectArray15, 7741648468787736736L, (long)l16);
        Object[] objectArray16 = new Object[3];
        objectArray16[2] = l8;
        objectArray16[1] = (double)n;
        objectArray16[0] = (double)n2;
        CallSite callSite9 = _08.e("\u00d1", (Object)this, (Object)objectArray16, 7742018297065487497L, (long)l16);
        try {
            Object[] objectArray17 = new Object[1];
            objectArray17[0] = l6;
            _08.e("\u00d1", (Object)_08.e("\u00e6", 7740125245599848508L, (long)l16), (Object)objectArray17, 7742078927825401506L, (long)l16);
            Object[] objectArray18 = new Object[1];
            objectArray18[0] = l10;
            Object[] objectArray19 = new Object[1];
            objectArray19[0] = l13;
            _08.e("\u00d1", (Object)_08.e("\u00c6", (Object)objectArray18, 7742261449550457520L, (long)l16), (Object)objectArray19, 7741870793311161969L, (long)l16);
            d10 = f5;
            d9 = f6;
            d8 = f5 + callSite7;
            d7 = f6 + f4;
            d6 = 5.0;
            d5 = 5.0;
            d4 = 5.0;
            d3 = 5.0;
            callSite3 = callSite9 != false ? _08.e("\u00e6", 7741489486477103979L, (long)l16) : _08.e("\u00e6", 7741600649063088538L, (long)l16);
        }
        catch (MatchException matchException) {
            throw _08.a(matchException);
        }
        Object[] objectArray20 = new Object[14];
        objectArray20[13] = false;
        objectArray20[12] = 1.0;
        objectArray20[11] = l5;
        objectArray20[10] = _08.e("\u00e6", 7740645300373693404L, (long)l16);
        objectArray20[9] = _08.e("\u00e6", 7741269177226606380L, (long)l16);
        objectArray20[8] = callSite3;
        objectArray20[7] = d3;
        objectArray20[6] = d4;
        objectArray20[5] = d5;
        objectArray20[4] = d6;
        objectArray20[3] = d7;
        objectArray20[2] = d8;
        objectArray20[1] = d9;
        objectArray20[0] = d10;
        _08.e("\u00c6", (Object)objectArray20, 7741387682459464712L, (long)l16);
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l10;
        Object[] objectArray22 = new Object[1];
        objectArray22[0] = l15;
        _08.e("\u00d1", (Object)_08.e("\u00c6", (Object)objectArray21, 7742261449550457520L, (long)l16), (Object)objectArray22, 7740582130703019198L, (long)l16);
        Object[] objectArray23 = new Object[1];
        objectArray23[0] = l4;
        _08.e("\u00d1", (Object)_08.e("\u00e6", 7740125245599848508L, (long)l16), (Object)objectArray23, 7742664240910645311L, (long)l16);
        float f8 = f6 + f4 / 2.0f;
        float f9 = f8 - f / 2.0f + 1.0f;
        float f10 = f5 + (callSite7 - f3) / 2.0f;
        try {
            v36 = var7_2;
            callSite2 = callSite6;
            d2 = f10;
            d = f9;
            callSite = _08.e("\u00d1", (Object)callSite5, 7741944568525640936L, (long)l16) != false ? _08.e("\u00e6", 7740413998372403846L, (long)l16) : _08.e("\u00fb", (Object)this, 7741799414250625751L, (long)l16);
        }
        catch (MatchException matchException) {
            throw _08.a(matchException);
        }
        CallSite callSite10 = callSite;
        double d11 = d;
        double d12 = d2;
        CallSite callSite11 = callSite2;
        Object[] objectArray24 = new Object[5];
        objectArray24[4] = callSite10;
        objectArray24[3] = d11;
        objectArray24[2] = d12;
        objectArray24[1] = callSite11;
        objectArray24[0] = l12;
        _08.e("\u00d1", (Object)v36, (Object)objectArray24, 7741648468787736736L, (long)l16);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_08.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_08.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_08.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

