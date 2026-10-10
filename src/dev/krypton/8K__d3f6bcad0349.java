/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 */
package dev.krypton;

import dev.krypton._4z;
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
import net.minecraft.class_332;
import net.minecraft.class_408;

public class _8K {
    private static String cfr_renamed_5;
    private static int cfr_renamed_0;
    private static int cfr_renamed_7;
    private static boolean cfr_renamed_9;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8K.a = l.a(5169976929644258388L, -745189445342845444L, MethodHandles.lookup().lookupClass()).a(58323819075365L);
                var11 = _8K.a ^ 123315088079497L;
                _8K.e = new Object[53];
                _8K.f = new String[53];
                _8K.a();
                _8K.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[6];
                var3_4 = 0;
                var4_5 = "\u00e9\u0012,\u00e3\u00c0\u0086\u00d9\u00b5\u00d0\u008c\u00dc\u00bc\u0080\u0091\u009b\u009a\u00f9c\u00c8\u0015\u00d1\u00e1*\u00ff\u009b\u0084v\u00c2\u00b7~\u009d\u00da";
                var5_6 = "\u00e9\u0012,\u00e3\u00c0\u0086\u00d9\u00b5\u00d0\u008c\u00dc\u00bc\u0080\u0091\u009b\u009a\u00f9c\u00c8\u0015\u00d1\u00e1*\u00ff\u009b\u0084v\u00c2\u00b7~\u009d\u00da".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "N>\u00de\u00fb\u0003`\u0089\u0017\u0080\u00e3;\u0081=E\u00c6\u00f3";
                    var5_6 = "N>\u00de\u00fb\u0003`\u0089\u0017\u0080\u00e3;\u0081=E\u00c6\u00f3".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        _8K.b = var6_3;
        _8K.c = new Integer[6];
        _8K.b("V", null, (long)-3305830974469916120L, (long)var11);
        _8K.b("V", (int)_8K.a("z", (int)28213, (long)(14079877526550062L ^ var11)), (long)-3308682866308075927L, (long)var11);
        _8K.b("V", (int)_8K.a("z", (int)14883, (long)(4098471138205114938L ^ var11)), (long)-3309937731275217719L, (long)var11);
        _8K.b("V", (boolean)_8K.a("z", (int)14883, (long)(4098471138205114938L ^ var11)), (long)-3308960581027557081L, (long)var11);
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8K.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _8K.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8K.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8K.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8K.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8K.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8K.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _8K.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8K.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8K.a(clazz3, string2, clazz2)) != null) {
                    _8K.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8K.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8K.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8K.b(772518111437558L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8K.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8K.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8K.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8K.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8K.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8K.b(772518111437558L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8K.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8K.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8K.b(772518111437558L, 0L);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8K.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8K.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == '\u00cc' || c == '\u00c2' || c == 'V') {
                field = _8K.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8K.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8K" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 56;
            case 2 -> 22;
            case 3 -> 59;
            case 4 -> 24;
            case 5 -> 32;
            case 6 -> 16;
            case 7 -> 37;
            case 8 -> 10;
            case 9 -> 43;
            case 10 -> 23;
            case 11 -> 60;
            case 12 -> 2;
            case 13 -> 46;
            case 14 -> 35;
            case 15 -> 34;
            case 16 -> 39;
            case 17 -> 61;
            case 18 -> 49;
            case 19 -> 5;
            case 20 -> 41;
            case 21 -> 40;
            case 22 -> 51;
            case 23 -> 50;
            case 24 -> 38;
            case 25 -> 55;
            case 26 -> 7;
            case 27 -> 42;
            case 28 -> 1;
            case 29 -> 45;
            case 30 -> 63;
            case 31 -> 36;
            case 32 -> 9;
            case 33 -> 47;
            case 34 -> 3;
            case 35 -> 28;
            case 36 -> 44;
            case 37 -> 26;
            case 38 -> 27;
            case 39 -> 14;
            case 40 -> 54;
            case 41 -> 21;
            case 42 -> 31;
            case 43 -> 8;
            case 44 -> 18;
            case 45 -> 58;
            case 46 -> 53;
            case 47 -> 62;
            case 48 -> 12;
            case 49 -> 33;
            case 50 -> 0;
            case 51 -> 29;
            case 52 -> 25;
            case 53 -> 13;
            case 54 -> 19;
            case 55 -> 17;
            case 56 -> 57;
            case 57 -> 4;
            case 58 -> 11;
            case 59 -> 20;
            case 60 -> 48;
            case 61 -> 52;
            case 62 -> 6;
            default -> 30;
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
        _8K.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "?\u000b\u0000([\u0001\"\u001e\u0002i^]c%";
        objectArray[1] = "iK>F\nPbD/\twHqC&@";
        objectArray[2] = Integer.TYPE;
        _8K.f[2] = "java/lang/Integer";
        objectArray[3] = Boolean.TYPE;
        _8K.f[3] = "java/lang/Boolean";
        objectArray[4] = "\u0001]Fh\u0012U\nRW'qX\u001fT";
        objectArray[5] = "V_y\u0013A\tSJr\u0013J\u0012_Z0za8n";
        objectArray[6] = Long.TYPE;
        _8K.f[6] = "java/lang/Long";
        objectArray[7] = "E{5k!8E{\"7-7_0\")-\"XArt~";
        objectArray[8] = Double.TYPE;
        _8K.f[8] = "java/lang/Double";
        objectArray[9] = "LO\u0007)3\u0016RG\u001dfT\u0017C\\\u0010<r\u0011";
        objectArray[10] = "\u007f\u0001(V)Tt\u000e9\u0019HZ\u007f\u0005=C";
        objectArray[11] = "\t\fZ\u0018bG\u0014\u0019XYg\u001bY\u0013";
        objectArray[12] = "l|}Vqg\u0019\\vY`(xR}Rdr\f";
        objectArray[13] = "=\u007f\u0000y_M#w\u001a6<Y'";
        objectArray[14] = "\u0003XFyL\u001a\u001dP\\61\n\u001d";
        objectArray[15] = "\u0016Lz1Y\u0015\u0016LmmU\u001a\f\u0007msU\u000f\u000bv?/\u0000M";
        objectArray[16] = "\u0001?)^[D\u0001?>\u0002WK\u001bt>\u001cW^\u001c\u0005nC\u0004";
        objectArray[17] = Void.TYPE;
        _8K.f[17] = "java/lang/Void";
        objectArray[18] = "h%Zw&S\u001d\u0005Qx7\u001c|\u000bZs3F\b";
        objectArray[19] = "L)r\u000e`)9\ty\u0001qfX\u0007r\nu<,";
        objectArray[20] = "g'2\u0011,Ug'%M Z}l%S Oz\u001du\u000eq";
        objectArray[21] = "f{\u0014\u0013&u\u0013[\u001f\u001c7:rU\u0014\u00173`\u0006";
        objectArray[22] = ")\ngD[/\\*lKJ`=$g@N:I";
        objectArray[23] = "]3G'q\u000f@&EftS\u000b";
        objectArray[24] = "\u001ay^\r\t \u001ayIQ\u0005/\u00002IO\u0005:\u0007C\u001e\u0010S";
        objectArray[25] = "\nw^'m\u0016AaYpT\u0015Yu&x$IR~L-?\b@\u0005\u001f1m\u0012KoJ*,\u00000<Vx6\u000bZiM9$p";
        objectArray[26] = "\u001c\u0015\u0016R\u0005LN\u001dSOuHC\u001eT~\u0018[b\u0017VJ\u0018mZ\fWV\u0013'\u001b\u001aIXM]H\u0012\u0011]u\u001eWIIJ\u001fKL\b[1LW\u001e\u0012P[\u0019L_\u0000+";
        objectArray[27] = "p_;H\u0017\u0018}U9NuA J&R\u0019st\b~\tu\u00195\\%H\u0014\u0019.W45";
        objectArray[28] = "1Ju&\u001by2B7{!ybTq\u0018\u001e{r\u001d}%X&o\u001e\r";
        objectArray[29] = "$Iij!AqJkP~'$\tj-(CeHv2";
        objectArray[30] = "%\u007f.\u0012\\He\"2\u0016?E\u0015 7N\u000eDg5$\u0016Dt$\u007f1\u0015@Do!wW?";
        objectArray[31] = "\u001e/h'\u0002p\u000fih?r*\u000b~m+\u000e,\r\u0013),\nuMu*$H(w";
        objectArray[32] = "t\u0001,`F:?\u0017+7\u007f9/\u0015T?\u000fe,\b>j\u0014$>smvF>5\u00198m\u0007,NJ$?\u001d'$\u001f?~\u000f\\";
        objectArray[33] = "UBB]f#\u0002\u0011D\u0000^=QS\u001d[2\u000f\u0000\u0013M\u0002^aL\u0016\u001fG44WW\r<";
        objectArray[34] = "(:c0<X}9a\nf>(1>h!T}*\u007fz";
        objectArray[35] = "\u0000kF9AWK5\u0000{>\b\\&<>Z\u001a\b*\u0001x\u0007\u0007\u000bZ\u0003eC^AgE8^]1";
        objectArray[36] = "P}td;9\u000b9xlD2Wy)`(\u0000\u00008s6xW\u0003upe?=Vn1wDnJ<+|.;Q}9\u0007}'\u0003g2m(<BuI>4nX~#k//J\u0005pw}5Ao%l<':nrx;4Wu%l%W";
        objectArray[37] = "\u000f !q\t\rO}=uj\t?\u007f8-[\u0001Mj+u\u00111\u0005*-*\rP]j -j";
        objectArray[38] = "ak\u0006\bZXla\u0004\u000e8\u00011~\u001b\u0012T3e<CN8Y$h\u0018\bYY?c\tu";
        objectArray[39] = "#PBo\u0006Lc\r^keO\u0013\u000f[3T@a\u001aHk\u001ep\"P]h\u001a@i\u000e\u001b*e";
        objectArray[40] = ">~ZY2Ri-\\\u0004\nL:o\u0005_f~k/T\u0000\n\u0015=q\f\u0000pF5)\t8";
        objectArray[41] = ":?*<NN0ps.%R6c,(r\u0005h3uDE\u00041h:?_\u0005>t";
        objectArray[42] = "\tZ\u0003\u0013\u001f\t\nRAN%\u000f^O=@U\u00137\u000e@DA\bVV\u0000IFo";
        objectArray[43] = "!L[wb2+\u0003\u0002e\t.-\u0010]c^ysG\b\u000f4)1\u0000[39#3\u0006";
        objectArray[44] = "\u0012\u0003|5B}\u0018L%')j\u0012N~*EXE\b }\u0012\u000f\u0016_!,\u0011tA\f'q)";
        objectArray[45] = "Qwmi4\r\u0004toSok\u0006pjbb\u0019\u0013c2(RQSem43\t\u0013hjS";
        objectArray[46] = "\u0017=SU\u000e\\@nU\b6B\u0013,\fSZpBmT\u000e6\u001e\u000ei\u000eO\\K\u0015(\u001c4";
        objectArray[47] = "\u001bFFVXn[\u001bZR;b+\u0019_\n\nbY\fLR@R@L\\\u0016X?[\u001bH\b;";
        objectArray[48] = "$\u0017\u000bU\u0000Iq\u0014\toY/'W\u0006\u000b\u0001N\u007f\u0017\u000b\f";
        objectArray[49] = "c\u001c\u000fo4Qj\u001b\u000fcJ\u0016Ww\u0002>(Wg\u0005\bqqE";
        objectArray[50] = "\by\u0006[\u0018h_*\u0000\u0006 v\fhY]LD](\b\u0007 *\u0011-[AJ\u007f\nlI:";
        objectArray[51] = "\u0000l@A\u0011NK2\u0006\u0003n\u001d\\,a\u0014\u0012~XaE\u001c\u001eEI'E\u0004n";
        Object[] objectArray2 = objectArray;
        objectArray[52] = "\u000eg\t]6?[d\u000bg`Y\u000elT\u0005+3[w\u0015\u0017";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4A00;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/8K", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8K.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cfr_renamed_7(Object[] var0) {
        block93: {
            block95: {
                block94: {
                    block79: {
                        block78: {
                            block85: {
                                block87: {
                                    block88: {
                                        block86: {
                                            block98: {
                                                block92: {
                                                    block91: {
                                                        block97: {
                                                            block90: {
                                                                block89: {
                                                                    block76: {
                                                                        block77: {
                                                                            block74: {
                                                                                block75: {
                                                                                    block72: {
                                                                                        block73: {
                                                                                            var1_1 = (class_332)var0[0];
                                                                                            var2_2 = (Long)var0[1];
                                                                                            v0 = var2_2 = _8K.a ^ var2_2;
                                                                                            var4_3 = v0 ^ 12533736863250L;
                                                                                            var6_4 = v0 ^ 70046459820013L;
                                                                                            var8_5 = v0 ^ 24975227645668L;
                                                                                            var10_6 = v0 ^ 138834339311001L;
                                                                                            var12_7 = v0 ^ 66269608189315L;
                                                                                            var14_8 = _4z.cfr_renamed_4();
                                                                                            try {
                                                                                                try {
                                                                                                    v1 = new Object[1];
                                                                                                    v1[0] = var6_4;
                                                                                                    v2 = _8K.b("\u00e1", (Object)v1, (long)-4915675545350000541L, (long)var2_2);
                                                                                                    if (var14_8 != null) break block72;
                                                                                                    if (v2 != false) break block73;
                                                                                                }
                                                                                                catch (MatchException v3) {
                                                                                                    throw _8K.a(v3);
                                                                                                }
                                                                                                _8K.b("V", null, (long)-4916743881304386573L, (long)var2_2);
                                                                                                return;
                                                                                            }
                                                                                            catch (MatchException v4) {
                                                                                                throw _8K.a(v4);
                                                                                            }
                                                                                        }
                                                                                        v2 = _8K.b("\u00d6", (Object)_8K.b("\u00d6", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915591428118781858L, (long)var2_2), (long)-4914823555765578218L, (long)var2_2);
                                                                                    }
                                                                                    var15_9 = v2;
                                                                                    var16_10 = _8K.b("\u00d6", (Object)_8K.b("\u00d6", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915591428118781858L, (long)var2_2), (long)-4915399072863698393L, (long)var2_2);
                                                                                    var17_11 = _8K.b("\u00d6", (Object)_8K.b("\u00c1", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915228851848170854L, (long)var2_2), (long)-4914861391040722719L, (long)var2_2) / (double)_8K.b("\u00d6", (Object)_8K.b("\u00d6", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915591428118781858L, (long)var2_2), (long)-4913432744934209382L, (long)var2_2);
                                                                                    var19_12 = _8K.b("\u00d6", (Object)_8K.b("\u00c1", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915228851848170854L, (long)var2_2), (long)-4916345834364142733L, (long)var2_2) / (double)_8K.b("\u00d6", (Object)_8K.b("\u00d6", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915591428118781858L, (long)var2_2), (long)-4913432744934209382L, (long)var2_2);
                                                                                    try {
                                                                                        try {
                                                                                            v5 /* !! */  = _8K.b("\u00e1", (long)_8K.b("\u00d6", (Object)_8K.b("\u00d6", (Object)_8K.b("\u00c2", (long)-4913701432519356659L, (long)var2_2), (long)-4915591428118781858L, (long)var2_2), (long)-4915278229893187717L, (long)var2_2), (int)0, (long)-4916275005743746425L, (long)var2_2);
                                                                                            if (var14_8 != null) break block74;
                                                                                            if (v5 /* !! */  != true) break block75;
                                                                                        }
                                                                                        catch (MatchException v6) {
                                                                                            throw _8K.a(v6);
                                                                                        }
                                                                                        v5 /* !! */  = (CallSite)true;
                                                                                        break block74;
                                                                                    }
                                                                                    catch (MatchException v7) {
                                                                                        throw _8K.a(v7);
                                                                                    }
                                                                                }
                                                                                v5 /* !! */  = (CallSite)false;
                                                                            }
                                                                            var21_13 = v5 /* !! */ ;
                                                                            v8 = new Object[1];
                                                                            v8[0] = var12_7;
                                                                            var22_14 = _8K.b("\u00e1", (Object)v8, (long)-4914928366002652337L, (long)var2_2);
                                                                            v9 = new Object[1];
                                                                            v9[0] = var8_5;
                                                                            var23_15 = _8K.b("\u00e1", (Object)v9, (long)-4916573511142649003L, (long)var2_2);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v10 = var21_13;
                                                                                                    if (var14_8 != null) break block76;
                                                                                                    if (v10 == false) break block77;
                                                                                                }
                                                                                                catch (MatchException v11) {
                                                                                                    throw _8K.a(v11);
                                                                                                }
                                                                                                v10 = _8K.b("\u00c2", (long)-4913613418672457476L, (long)var2_2);
                                                                                                if (var14_8 != null) break block76;
                                                                                            }
                                                                                            catch (MatchException v12) {
                                                                                                throw _8K.a(v12);
                                                                                            }
                                                                                            if (v10 != false) break block77;
                                                                                        }
                                                                                        catch (MatchException v13) {
                                                                                            throw _8K.a(v13);
                                                                                        }
                                                                                        if (_8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2) != null) break block77;
                                                                                    }
                                                                                    catch (MatchException v14) {
                                                                                        throw _8K.a(v14);
                                                                                    }
                                                                                    v15 = new Object[3];
                                                                                    v15[2] = var10_6;
                                                                                    v15[1] = (double)var19_12;
                                                                                    v15[0] = (double)var17_11;
                                                                                    v10 = _8K.b("\u00e1", (Object)v15, (long)-4915089095080889944L, (long)var2_2);
                                                                                    if (var2_2 < 0L || var14_8 != null) break block76;
                                                                                }
                                                                                catch (MatchException v16) {
                                                                                    throw _8K.a(v16);
                                                                                }
                                                                                if (v10 != false) break block77;
                                                                            }
                                                                            catch (MatchException v17) {
                                                                                throw _8K.a(v17);
                                                                            }
                                                                            var24_16 /* !! */  = (int[])_8K.b("\u00d6", (Object)_8K.b("\u00d6", (Object)var22_14, (long)-4913566721011074988L, (long)var2_2), (long)-4916599124382795870L, (long)var2_2);
                                                                            while (_8K.b("\u00d6", (Object)var24_16 /* !! */ , (long)-4915146408830023074L, (long)var2_2) != false) {
                                                                                block84: {
                                                                                    block83: {
                                                                                        block82: {
                                                                                            block81: {
                                                                                                block80: {
                                                                                                    var25_17 /* !! */  = (int[])((String)_8K.b("\u00d6", (Object)var24_16 /* !! */ , (long)-4916726289155004443L, (long)var2_2));
                                                                                                    var26_19 = (int[])_8K.b("\u00d6", (Object)var22_14, (Object)var25_17 /* !! */ , (long)-4914670361440150453L, (long)var2_2);
                                                                                                    var27_22 = (int[])_8K.b("\u00d6", (Object)var23_15, (Object)var25_17 /* !! */ , (long)-4914670361440150453L, (long)var2_2);
                                                                                                    try {
                                                                                                        try {
                                                                                                            v18 = var26_19;
                                                                                                            if (var2_2 <= 0L) break block78;
                                                                                                            v19 = var14_8;
                                                                                                            if (var2_2 > 0L) {
                                                                                                                if (v19 != null) break block79;
                                                                                                                v19 = var14_8;
                                                                                                            }
                                                                                                            if (v19 != null) break block80;
                                                                                                        }
                                                                                                        catch (MatchException v20) {
                                                                                                            throw _8K.a(v20);
                                                                                                        }
                                                                                                        if (v18 == null) continue;
                                                                                                    }
                                                                                                    catch (MatchException v21) {
                                                                                                        throw _8K.a(v21);
                                                                                                    }
                                                                                                    v22 = var27_22;
                                                                                                }
                                                                                                if (v22 == null) continue;
                                                                                                try {
                                                                                                    try {
                                                                                                        cfr_temp_0 = var17_11 - (double)var26_19[0];
                                                                                                        v23 /* !! */  = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                        v24 = var14_8;
                                                                                                        if (var2_2 < 0L) ** GOTO lbl144
                                                                                                        if (v24 != null) break block81;
                                                                                                        if (v23 /* !! */  >= 0) {
                                                                                                        }
                                                                                                        ** GOTO lbl196
                                                                                                    }
                                                                                                    catch (MatchException v25) {
                                                                                                        throw _8K.a(v25);
                                                                                                    }
                                                                                                    cfr_temp_1 = var17_11 - (double)(var26_19[0] + var27_22[0]);
                                                                                                    v23 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                                                }
                                                                                                catch (MatchException v26) {
                                                                                                    throw _8K.a(v26);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v24 = var14_8;
lbl144:
                                                                                                    // 2 sources

                                                                                                    if (var2_2 < 0L) ** GOTO lbl160
                                                                                                    if (v24 != null) break block82;
                                                                                                    if (v23 /* !! */  < 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl196
                                                                                                }
                                                                                                catch (MatchException v27) {
                                                                                                    throw _8K.a(v27);
                                                                                                }
                                                                                                cfr_temp_2 = var19_12 - (double)var26_19[1];
                                                                                                v23 /* !! */  = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                                                            }
                                                                                            catch (MatchException v28) {
                                                                                                throw _8K.a(v28);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                v24 = var14_8;
lbl160:
                                                                                                // 2 sources

                                                                                                if (var2_2 < 0L) ** GOTO lbl177
                                                                                                if (v24 != null) break block83;
                                                                                                if (v23 /* !! */  >= 0) {
                                                                                                }
                                                                                                ** GOTO lbl196
                                                                                            }
                                                                                            catch (MatchException v29) {
                                                                                                throw _8K.a(v29);
                                                                                            }
                                                                                            cfr_temp_3 = var19_12 - (double)(var26_19[1] + var27_22[1]);
                                                                                            v23 /* !! */  = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                                                                                        }
                                                                                        catch (MatchException v30) {
                                                                                            throw _8K.a(v30);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var2_2 <= 0L) break block84;
                                                                                            v24 = var14_8;
lbl177:
                                                                                            // 2 sources

                                                                                            if (v24 != null) break block84;
                                                                                            if (v23 /* !! */  < 0) {
                                                                                            }
                                                                                            ** GOTO lbl196
                                                                                        }
                                                                                        catch (MatchException v31) {
                                                                                            throw _8K.a(v31);
                                                                                        }
                                                                                        _8K.b("V", (String)var25_17 /* !! */ , (long)-4916743881304386573L, (long)var2_2);
                                                                                        _8K.b("V", (int)((int)var17_11 - var26_19[0]), (long)-4913900852668577870L, (long)var2_2);
                                                                                        v23 /* !! */  = (reference)((int)var19_12 - var26_19[1]);
                                                                                    }
                                                                                    catch (MatchException v32) {
                                                                                        throw _8K.a(v32);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block96: {
                                                                                        _8K.b("V", (int)v23 /* !! */ , (long)-4914590027488965358L, (long)var2_2);
                                                                                        v33 = var14_8;
                                                                                        if (var2_2 >= 0L) {
                                                                                            if (v33 == null) break;
                                                                                        }
                                                                                        break block96;
lbl196:
                                                                                        // 5 sources

                                                                                        v33 = var14_8;
                                                                                    }
                                                                                    if (v33 == null) continue;
                                                                                    break;
                                                                                }
                                                                                catch (MatchException v34) {
                                                                                    throw _8K.a(v34);
                                                                                }
                                                                            }
                                                                        }
                                                                        v10 = var21_13;
                                                                    }
                                                                    try {
                                                                        if (v10 == false) {
                                                                            _8K.b("V", null, (long)-4916743881304386573L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    catch (MatchException v35) {
                                                                        throw _8K.a(v35);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v18 = _8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2);
                                                                                v36 = var14_8;
                                                                                if (var2_2 > 0L) {
                                                                                    if (v36 != null) break block85;
                                                                                    if (v18 == null) break block86;
                                                                                }
                                                                                ** GOTO lbl283
                                                                            }
                                                                            catch (MatchException v37) {
                                                                                throw _8K.a(v37);
                                                                            }
                                                                            if (var2_2 <= 0L) break block87;
                                                                            v38 = var21_13;
                                                                            if (var14_8 != null) break block88;
                                                                        }
                                                                        catch (MatchException v39) {
                                                                            throw _8K.a(v39);
                                                                        }
                                                                        if (v38 == false) break block86;
                                                                    }
                                                                    catch (MatchException v40) {
                                                                        throw _8K.a(v40);
                                                                    }
                                                                    var24_16 /* !! */  = (int[])_8K.b("\u00d6", (Object)var23_15, (Object)_8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2), (long)-4914670361440150453L, (long)var2_2);
                                                                    try {
                                                                        v41 = var24_16 /* !! */ ;
                                                                        if (var14_8 != null) break block89;
                                                                        if (v41 == null) break block90;
                                                                    }
                                                                    catch (MatchException v42) {
                                                                        throw _8K.a(v42);
                                                                    }
                                                                    v41 = var24_16 /* !! */ ;
                                                                }
                                                                v43 /* !! */  = v41[0];
                                                                break block97;
                                                            }
                                                            v43 /* !! */  = (int)_8K.a("z", (int)20213, (long)(1610663285374271283L ^ var2_2));
                                                        }
                                                        var25_18 = v43 /* !! */ ;
                                                        try {
                                                            v44 = var24_16 /* !! */ ;
                                                            if (var14_8 != null) break block91;
                                                            if (v44 == null) break block92;
                                                        }
                                                        catch (MatchException v45) {
                                                            throw _8K.a(v45);
                                                        }
                                                        v44 = var24_16 /* !! */ ;
                                                    }
                                                    v46 /* !! */  = v44[1];
                                                    break block98;
                                                }
                                                v46 /* !! */  = (int)_8K.a("z", (int)31681, (long)(3170272929467337222L ^ var2_2));
                                            }
                                            var26_20 = v46 /* !! */ ;
                                            var27_23 = _8K.b("\u00e1", (int)0, (int)_8K.b("\u00e1", (int)(var15_9 - var25_18), (int)((int)var17_11 - _8K.b("\u00c2", (long)-4913900852668577870L, (long)var2_2)), (long)-4914745510585487305L, (long)var2_2), (long)-4916512251392619714L, (long)var2_2);
                                            var28_25 /* !! */  = (int)_8K.b("\u00e1", (int)0, (int)_8K.b("\u00e1", (int)(var16_10 - var26_20), (int)((int)var19_12 - _8K.b("\u00c2", (long)-4914590027488965358L, (long)var2_2)), (long)-4914745510585487305L, (long)var2_2), (long)-4916512251392619714L, (long)var2_2);
                                            v47 = new Object[4];
                                            v47[3] = var4_3;
                                            v47[2] = var28_25 /* !! */ ;
                                            v47[1] = (int)var27_23;
                                            v47[0] = _8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2);
                                            _8K.b("\u00e1", (Object)v47, (long)-4915513863206724176L, (long)var2_2);
                                        }
                                        v38 = var21_13;
                                    }
                                    _8K.b("V", (boolean)v38, (long)-4913613418672457476L, (long)var2_2);
                                }
                                v18 = _8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2);
                            }
                            try {
                                try {
                                    v36 = var14_8;
lbl283:
                                    // 2 sources

                                    if (v36 != null) break block78;
                                    if (v18 == null) break block93;
                                }
                                catch (MatchException v48) {
                                    throw _8K.a(v48);
                                }
                                v18 = _8K.b("\u00d6", (Object)var22_14, (Object)_8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2), (long)-4914670361440150453L, (long)var2_2);
                            }
                            catch (MatchException v49) {
                                throw _8K.a(v49);
                            }
                        }
                        v50 = (int[])v18;
                    }
                    var24_16 /* !! */  = v50;
                    var25_17 /* !! */  = (int[])_8K.b("\u00d6", (Object)var23_15, (Object)_8K.b("\u00c2", (long)-4916743881304386573L, (long)var2_2), (long)-4914670361440150453L, (long)var2_2);
                    try {
                        v51 = var24_16 /* !! */ ;
                        v52 = var14_8;
                        if (var2_2 > 0L) {
                            if (v52 != null) break block94;
                            if (v51 == null) break block93;
                        }
                        ** GOTO lbl311
                    }
                    catch (MatchException v53) {
                        throw _8K.a(v53);
                    }
                    v51 = var25_17 /* !! */ ;
                }
                try {
                    v52 = var14_8;
lbl311:
                    // 2 sources

                    if (v52 != null) break block95;
                    if (v51 == null) break block93;
                }
                catch (MatchException v54) {
                    throw _8K.a(v54);
                }
                v51 = var24_16 /* !! */ ;
            }
            var26_21 = v51[0];
            var27_24 = var24_16 /* !! */ [1];
            var28_25 /* !! */  = var25_17 /* !! */ [0];
            var29_26 = var25_17 /* !! */ [1];
            _8K.b("\u00d6", (Object)var1_1, (int)var26_21, (int)var27_24, (int)(var26_21 + var28_25 /* !! */ ), (int)(var27_24 + 1), (int)_8K.a("z", (int)17326, (long)(8209539953178948205L ^ var2_2)), (long)-4915021912591480396L, (long)var2_2);
            _8K.b("\u00d6", (Object)var1_1, (int)var26_21, (int)(var27_24 + var29_26 - 1), (int)(var26_21 + var28_25 /* !! */ ), (int)(var27_24 + var29_26), (int)_8K.a("z", (int)12809, (long)(5725859169288504264L ^ var2_2)), (long)-4915021912591480396L, (long)var2_2);
            _8K.b("\u00d6", (Object)var1_1, (int)var26_21, (int)var27_24, (int)(var26_21 + 1), (int)(var27_24 + var29_26), (int)_8K.a("z", (int)12809, (long)(5725859169288504264L ^ var2_2)), (long)-4915021912591480396L, (long)var2_2);
            _8K.b("\u00d6", (Object)var1_1, (int)(var26_21 + var28_25 /* !! */  - 1), (int)var27_24, (int)(var26_21 + var28_25 /* !! */ ), (int)(var27_24 + var29_26), (int)_8K.a("z", (int)12809, (long)(5725859169288504264L ^ var2_2)), (long)-4915021912591480396L, (long)var2_2);
        }
    }

    public static boolean cfr_renamed_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _8K.b("\u00c1", (Object)_8K.b("\u00c2", -6578794190783770511L, (long)l2), -6578214711864012830L, (long)l2) instanceof class_408;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8K.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8K.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

