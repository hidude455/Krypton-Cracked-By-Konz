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
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8u;
import dev.krypton._90;
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

public class _0Q
extends _0v {
    private final _90 cfr_renamed_0;
    private final _8B cfr_renamed_4;
    private final float cfr_renamed_9;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    public _0Q(long l2, _4t t, _95 var4_3, int n) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x2F56D4CCFA1EL;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x28E58759D73L;
        super((short)n2, t, var4_3, n, n3, (char)n4);
        this.cfr_renamed_4 = new _8B((int)_0Q.c("j", 11096, (long)(0xC1DF279BA14DC10L ^ l2)), l5, (int)_0Q.c("j", 30408, (long)(0x6C70655B6D0C8189L ^ l2)), (int)_0Q.c("j", 13167, (long)(0x7D7CD5E23450C42DL ^ l2)));
        this.cfr_renamed_9 = 4.0f;
        this.cfr_renamed_0 = (_90)var4_3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _0Q.a = l.a(-7773581791077736135L, -9017532833205649075L, MethodHandles.lookup().lookupClass()).a(92363264285921L);
                    _0Q.n = new Object[48];
                    _0Q.o = new String[48];
                    _0Q.b();
                    _0Q.e = new HashMap<K, V>(13);
                    var11 = _0Q.a ^ 6885446816499L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u00a8y\u0089]\u00ac\u0015\u00dd\tR\u00bc\u00c9*<\u00a3w;\u0010\u00c3\u00a6\u00f1^s\u00b6\u00ba5\u0092\u001b\u00fd}\u00c2\u00b9\u00f64";
                    var19_6 = "\u00a8y\u0089]\u00ac\u0015\u00dd\tR\u00bc\u00c9*<\u00a3w;\u0010\u00c3\u00a6\u00f1^s\u00b6\u00ba5\u0092\u001b\u00fd}\u00c2\u00b9\u00f64".length();
                    var16_7 = 16;
                    var15_8 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = _0Q.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _0Q.c = var20_3;
                _0Q.d = new String[2];
                _0Q.k = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u0002\u00b6\u00a8V\u0090c0\u0016<\u008dV\u0097o\u00c4\u00d0|\u00e3\u0015\u00f5\u00f2\u00f6\u009d+\u00fe\u00b0\u00f4\u00dd0\u00c1*\u009b\u00c6\u00f3<F\b\u008d\u009d\u0012\r\u0005\u00bc%\u00a5\u0088\u00a5W\u0097\u00dfg\u00e6\u00a5\u0083w\u00fc}";
                var5_15 = "\u0002\u00b6\u00a8V\u0090c0\u0016<\u008dV\u0097o\u00c4\u00d0|\u00e3\u0015\u00f5\u00f2\u00f6\u009d+\u00fe\u00b0\u00f4\u00dd0\u00c1*\u009b\u00c6\u00f3<F\b\u008d\u009d\u0012\r\u0005\u00bc%\u00a5\u0088\u00a5W\u0097\u00dfg\u00e6\u00a5\u0083w\u00fc}".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl61:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "w\u00ecV\u0013W\u00d0\u00e0\u00ff\u00c5\u00cb\u0010\u00f8'b\u00c5\u00da";
                    var5_15 = "w\u00ecV\u0013W\u00d0\u00e0\u00ff\u00c5\u00cb\u0010\u00f8'b\u00c5\u00da".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl87:
                // 1 sources

                ** continue;
            }
        }
        _0Q.i = var6_12;
        _0Q.j = new Integer[9];
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _0Q.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 32;
            case 1 -> 49;
            case 2 -> 14;
            case 3 -> 47;
            case 4 -> 0;
            case 5 -> 42;
            case 6 -> 44;
            case 7 -> 1;
            case 8 -> 35;
            case 9 -> 7;
            case 10 -> 39;
            case 11 -> 43;
            case 12 -> 22;
            case 13 -> 26;
            case 14 -> 34;
            case 15 -> 53;
            case 16 -> 16;
            case 17 -> 30;
            case 18 -> 45;
            case 19 -> 20;
            case 20 -> 31;
            case 21 -> 55;
            case 22 -> 2;
            case 23 -> 59;
            case 24 -> 57;
            case 25 -> 10;
            case 26 -> 61;
            case 27 -> 21;
            case 28 -> 18;
            case 29 -> 29;
            case 30 -> 6;
            case 31 -> 27;
            case 32 -> 51;
            case 33 -> 23;
            case 34 -> 62;
            case 35 -> 11;
            case 36 -> 52;
            case 37 -> 12;
            case 38 -> 63;
            case 39 -> 17;
            case 40 -> 25;
            case 41 -> 5;
            case 42 -> 38;
            case 43 -> 54;
            case 44 -> 13;
            case 45 -> 3;
            case 46 -> 9;
            case 47 -> 60;
            case 48 -> 24;
            case 49 -> 15;
            case 50 -> 56;
            case 51 -> 33;
            case 52 -> 41;
            case 53 -> 48;
            case 54 -> 46;
            case 55 -> 37;
            case 56 -> 58;
            case 57 -> 40;
            case 58 -> 50;
            case 59 -> 36;
            case 60 -> 8;
            case 61 -> 19;
            case 62 -> 28;
            default -> 4;
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
        _0Q.o[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == 'g' || c == '\u00fb' || c == 'b') {
                field = _0Q.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0Q.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0Q.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "u]\"@\\\u0017hH \u0001YK)\u000f";
        objectArray[1] = "-\u001co{u\u0006X<dtdI92o\u007f`\u0013M";
        objectArray[2] = Void.TYPE;
        _0Q.o[2] = "java/lang/Void";
        objectArray[3] = "@7\u007f\u0016b)]\"}Wgu\u0014$";
        objectArray[4] = "o\u0014;&3=\u001a40)\"r{:;\"&(\u000f";
        objectArray[5] = Integer.TYPE;
        _0Q.o[5] = "java/lang/Integer";
        objectArray[6] = "\u00157|1Q=\b\"~pTaHg";
        objectArray[7] = "=3E8?mH\u0013N7.\")\u001dE<*x]";
        objectArray[8] = " \u007fp\u001f\u0003P+paP~H8wh\u0019";
        objectArray[9] = "|aZo\u001a\u0015atX.\u001fI(U";
        objectArray[10] = "1vD'G1,cFfBmmQ";
        objectArray[11] = "qG01s\u0004\u0004g;>bKei05f\u0011\u0011";
        objectArray[12] = Double.TYPE;
        _0Q.o[12] = "java/lang/Double";
        objectArray[13] = "u\u001b;G\u0001o\u0000;0H\u0010 a5;C\u0014z\u0015";
        objectArray[14] = "\u0016?\u0007\t\u0006]\u000b*\u0005H\u0003\u0001Kj";
        objectArray[15] = "\u001f\u001e,Q\tJj>'^\u0018\u0005\u000b0,U\u001c_\u007f";
        objectArray[16] = "\fXn\u000bC\u007f\u0012PtD>o\u0012";
        objectArray[17] = "G'\r\u0005i 2\u0007\u0006\nxoS\t\r\u0001|5'";
        objectArray[18] = "/k,G\u00147ZK'H\u0005x;E,C\u0001\"O";
        objectArray[19] = "2A3:-^Ga85<\u0011&o3>8KR";
        objectArray[20] = "8x6XQ}8x!\u0004]r\"3!\u001a]g%BsG\u0005$o";
        objectArray[21] = "/0RtQOZ\u0010Y{@\u0000;\u001eRpDZO";
        objectArray[22] = Boolean.TYPE;
        _0Q.o[22] = "java/lang/Boolean";
        objectArray[23] = "\u000f7&\u0018tB\u0012\"$Yq\u001eY";
        objectArray[24] = "m\"\"VnFm\"5\nbIwi5\u0014b\\p\u0018eI3";
        objectArray[25] = "\n\u001eNc)\u000b\n\u001eY?%\u0004\u0010UY!%\u0011\u0017$\u000e~s";
        objectArray[26] = "*xWY!\u001a!wF\u0016@\u0014*|BL";
        objectArray[27] = "gh\u0010\u0000t6{m\u0013b'4\u00058W\u0006z-y9\u0015RwW<6\u0002\u0004bja7\u0012\t\u0018";
        objectArray[28] = "v\u000b\u00114iDk\u0000\u001d|VJv\u0016L!:x$V\u0016zk/ \u0017V&oLt[IxV";
        objectArray[29] = "HQ bm?\u0000\u00112.\u000f2r\u000fqvmy\u000e\u000e3\"`\u0003I\u001c1r6`\u001dP.,\u000f";
        objectArray[30] = "\u007f9V@hdx;I\u000e\n C/\u0013Zhg?.Q\u000ee\u001d~'PD2',,\u0017_\n";
        objectArray[31] = "]J}:(@\u001cUd\"J\u0013c\u000fh pJ\u001a^b{w";
        objectArray[32] = "5\u0001'\u000e\u000e5)\u0004$l^T9\u0005>\u000e\u0018(8Gj\u0003bd6X>\u0000X&'D9l";
        objectArray[33] = "~\u0016\u0015\u0003?y6V\u0007O]\u007fDHD\u0017??8I\u0006C2E\u007f[\u0004\u0013d&+\u0017\u001bM]";
        objectArray[34] = "t\u0000CJMg<@Q\u0006/fu0\u0017WMa/IF]\u0016f";
        objectArray[35] = "\u0017\u0000\u0006w\\9FG\tt =&\u0017C*BzZ\u0016\u0001~O\u0000L\u0018\u00045Y9\u0017\u0019\u001a. ";
        objectArray[36] = "ofB;no'&Pw\fnU8\u0013/n))9Q{cS;(Du<5$nQ1\f";
        objectArray[37] = "\u000eomg\u007f\u000fF/\u007f+\u001d\r41<s\u007fIH0~'r3\u000f\"|w$P[nc)\u001d";
        objectArray[38] = "R%\u0002U\u000f@\t$\u001cNv\u0002Y6\u0012.M\u0004B$FM\u0019H]z\u007f";
        objectArray[39] = "w !K\u0006 j+-\u00039 }$dn\u0005t+q\u001c\tX,~-&KI0yA";
        objectArray[40] = "m\\?LaK%\u001c-\u0000\u0003KWW)FcN4\u0003eY=";
        objectArray[41] = "\u0015X6RXF]\u0018$\u001e:E/\u0006gFX\u0000S\u0007%\u0012Uz\u0014\u0015'B\u0003\u0019@Y8\u001c:";
        objectArray[42] = "#k\rg<fu,Mu^o\u0017RRf;hvoF/nn";
        objectArray[43] = "kaxPn\tvjt\u0018Q\tae=um]71E\u00120\u0005bl\u007fP!\u0019e\u0000";
        objectArray[44] = "^!o-){B$lOu\u001aR%v-?fSg\" E*]xv#\u007fhLdqO";
        objectArray[45] = "%bk\u0010z\u001fm\"y\\\u0018\u0019\u001fmm\u0002\"Bf<gY%";
        objectArray[46] = "C\u00009M\\\"\u0002\u001f U>y}K8J\u00075D\u001a\u007fE\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[47] = "\f}kE\u001b-\u00184>C!u\u000eqn\u001cMGZ06D!p\u000623\tNp\b7u{\u0018p\fktFEq\u001cf\u000e";
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0Q" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0Q.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x25FC;
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
                throw new RuntimeException("dev/krypton/0Q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0Q.j[n2] = n3;
        }
        return j[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _0Q.e(l2, l3);
        Object object = _0Q.n[n];
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
                clazz3 = _0Q.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0Q.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0Q.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0Q.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0Q.f(1871548722924155L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0Q.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0Q.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0Q.f(1871548722924155L, 0L);
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
            int n = _0Q.e(l2, l3);
            object = _0Q.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _0Q.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0Q.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0Q.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0Q.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0Q.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0Q.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x483F;
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
                throw new RuntimeException("dev/krypton/0Q", exception);
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
            _0Q.d[n2] = _0Q.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _0Q.e(l2, l3);
        Object object = _0Q.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _0Q.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0Q.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0Q.c(clazz3, string2, clazz2)) != null) {
                    _0Q.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0Q.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0Q.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0Q.f(1871548722924155L, 0L);
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
        _0Q q;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x7D7F12B3E1D1L;
                int n = (int)(l5 >>> 32);
                int n2 = (int)(l5 << 32 >>> 48);
                int n3 = (int)(l5 << 48 >>> 48);
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            q = this;
                            class_119092 = class_119093;
                            if (bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_0Q.e("Y", (Object)class_119093, 5514290149884032014L, (long)l3);
                            objectArray2[0] = (double)_0Q.e("Y", (Object)class_119092, 5513977463834878055L, (long)l3);
                            if (_0Q.e("Y", (Object)q, (Object)objectArray2, 5513941884649100800L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0Q.a(matchException);
                        }
                        if (_0Q.e("Y", (Object)class_119093, 5515591429609032774L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0Q.a(matchException);
                    }
                    _0Q.e("Y", (Object)_0Q.e("\u00fb", 5514375034757397605L, (long)l3), (Object)new _8u(n, n2, this, (char)n3, (_90)((Object)_0Q.e("\u00ed", (Object)this, 5514654003644296256L, (long)l3))), 5514565506299030449L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0Q.a(matchException);
                }
            }
            q = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    @Override
    protected void void_8(Object[] objectArray) {
        Object object;
        _87 var7_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x37A57738306AL;
        long l6 = l3 ^ 0x538DF2D376DEL;
        long l7 = l3 ^ 0x764D0226F048L;
        long l8 = l3 ^ 0x570C24C53811L;
        long l9 = l3 ^ 0x7F2CE5EAB728L;
        long l10 = l3 ^ 0xDDCE291293EL;
        long l11 = l3 ^ 0x7238D2000367L;
        long l12 = l3 ^ 0x4A7C3F174665L;
        long l13 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        reference var28_17 = _0Q.e("Y", (Object)this, (Object)objectArray2, 7739793286531659949L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l12;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l11;
        reference var29_18 = _0Q.e("Y", (Object)this, (Object)objectArray3, 7740115026190081485L, (long)l2) + _0Q.e("Y", (Object)this, (Object)objectArray4, 7739531223207079014L, (long)l2) + _0Q.e("\u00ed", (Object)this, 7740063759365355086L, (long)l2) + _0Q.e("Y", (Object)this, (Object)objectArray5, 7739263337350050850L, (long)l2) / 2;
        reference var30_19 = var29_18 - _0Q.c("j", 23065, (long)(0x2DA5F7767D2F1486L ^ l2));
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l13;
        CallSite callSite = _0Q.e("Y", (Object)_0Q.e("\u00ed", (Object)this, 7740485503215094700L, (long)l2), (Object)objectArray6, 7739308618552422142L, (long)l2);
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = _0Q.e("\u00fb", 7740354246293405096L, (long)l2);
        objectArray7[3] = (double)var30_19;
        objectArray7[2] = (double)var28_17;
        objectArray7[1] = (String)((Object)callSite) + ":";
        objectArray7[0] = l8;
        _0Q.e("Y", (Object)var7_2, (Object)objectArray7, 7739490989756458733L, (long)l2);
        String string = (String)((Object)callSite) + (String)((Object)_0Q.a("l", 11763, (long)(0xB1F949920F8EADL ^ l2)));
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l7;
        objectArray8[0] = string;
        double d = (double)var28_17 + _0Q.e("Y", (Object)var7_2, (Object)objectArray8, 7740343702511277345L, (long)l2) + 5.0;
        CallSite callSite2 = _0Q.c("j", 28385, (long)(0x14C84C6F2654A07DL ^ l2));
        CallSite callSite3 = _0Q.c("j", 4791, (long)(0x7998683C041DC2EL ^ l2));
        reference var37_25 = var29_18 - callSite3 / 2;
        Object[] objectArray9 = new Object[10];
        objectArray9[9] = 4.0;
        objectArray9[8] = 4.0;
        objectArray9[7] = 4.0;
        objectArray9[6] = 4.0;
        objectArray9[5] = l9;
        objectArray9[4] = (double)(var37_25 + callSite3);
        objectArray9[3] = d + (double)callSite2;
        objectArray9[2] = (double)var37_25;
        objectArray9[1] = d;
        objectArray9[0] = _0Q.e("\u00ed", (Object)this, 7739395243155118119L, (long)l2);
        _0Q.e("Y", (Object)var7_2, (Object)objectArray9, 7739101457156275483L, (long)l2);
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l5;
        CallSite callSite4 = _0Q.e("Y", (Object)_0Q.e("Y", (Object)_0Q.e("\u00ed", (Object)this, 7740485503215094700L, (long)l2), (Object)objectArray10, 7739709682481729481L, (long)l2), 7739897134749380125L, (long)l2);
        String string2 = (int)callSite4 + (String)((Object)_0Q.a("l", 3733, (long)(0x190C8CF2353EADCAL ^ l2)));
        try {
            object = callSite4 > 0 ? _0Q.e("\u00ed", (Object)this, 7739599199088577292L, (long)l2) : new _8B((int)_0Q.c("j", 1553, (long)(0x15F65747C4EC4889L ^ l2)), (int)_0Q.c("j", 3608, (long)(0x31896B1040AC4082L ^ l2)), l10, (int)_0Q.c("j", 3608, (long)(0x31896B1040AC4082L ^ l2)), (int)_0Q.c("j", 13696, (long)(0x673899FC1693FB1BL ^ l2)));
        }
        catch (MatchException matchException) {
            throw _0Q.a(matchException);
        }
        Object object2 = object;
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l7;
        objectArray11[0] = string2;
        CallSite callSite5 = _0Q.e("Y", (Object)var7_2, (Object)objectArray11, 7740343702511277345L, (long)l2);
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = object2;
        objectArray12[3] = (double)(var37_25 + 4);
        objectArray12[2] = d + (double)(callSite2 / 2) - callSite5 / 2.0;
        objectArray12[1] = string2;
        objectArray12[0] = l8;
        _0Q.e("Y", (Object)var7_2, (Object)objectArray12, 7739490989756458733L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0Q.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0Q.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0Q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

