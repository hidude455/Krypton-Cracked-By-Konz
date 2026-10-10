/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._06;
import dev.krypton._4;
import dev.krypton._8o;
import dev.krypton._9d;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8D {
    public static final int cfr_renamed_8;
    public static final int cfr_renamed_3;
    public static final int cfr_renamed_6;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    private _8D() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-6256434344334530276L, -8666445665480435495L, MethodHandles.lookup().lookupClass()).a(66833808183560L);
        b = new Object[40];
        c = new String[40];
        _8D.a();
        long l2 = a ^ 0x1DE5A7CBEFCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0000iP^\u00bdS\u00dc\u0097\u00ecZ\u00de]\u00b2wc\u00d6\"\rv\u00e9 \u0003\u0084!";
        int n2 = "\u0000iP^\u00bdS\u00dc\u0097\u00ecZ\u00de]\u00b2wc\u00d6\"\rv\u00e9 \u0003\u0084!".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        cfr_renamed_6 = (int)lArray[1];
        cfr_renamed_8 = (int)lArray[2];
        cfr_renamed_3 = (int)lArray[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static double cfr_renamed_1(Object[] objectArray) {
        double d;
        Object object;
        block31: {
            int n;
            block20: {
                double d2 = (Double)objectArray[0];
                long l2 = (Long)objectArray[1];
                double d3 = (Double)objectArray[2];
                double[] dArray = (double[])objectArray[3];
                int n2 = (Integer)objectArray[4];
                long l3 = (l2 = a ^ l2) ^ 0x371D16CFDE1L;
                object = Double.MAX_VALUE;
                int n3 = 0;
                int n4 = 0;
                String string = _4.cfr_renamed_3();
                while (n4 < n2) {
                    String string2;
                    block26: {
                        block27: {
                            block28: {
                                int n5;
                                block29: {
                                    block30: {
                                        double d4;
                                        int n6;
                                        double d5;
                                        double d6;
                                        double d7;
                                        double d8;
                                        block24: {
                                            block25: {
                                                String string3;
                                                block21: {
                                                    block22: {
                                                        block23: {
                                                            d8 = dArray[n4 * 4];
                                                            d7 = dArray[n4 * 4 + 1];
                                                            d6 = dArray[n4 * 4 + 2];
                                                            d5 = dArray[n4 * 4 + 3];
                                                            Object[] objectArray2 = new Object[7];
                                                            objectArray2[6] = l3;
                                                            objectArray2[5] = d5;
                                                            objectArray2[4] = d6;
                                                            objectArray2[3] = d7;
                                                            objectArray2[2] = d8;
                                                            objectArray2[1] = d3;
                                                            objectArray2[0] = d2;
                                                            CallSite callSite = _8D.a("l", (Object)objectArray2, 5749588420718561985L, (long)l2);
                                                            try {
                                                                try {
                                                                    n = callSite == object ? 0 : (callSite < object ? -1 : 1);
                                                                    if (l2 <= 0L || string == null) break block20;
                                                                    string3 = string;
                                                                    if (l2 <= 0L) break block21;
                                                                    if (string3 == null) break block22;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _8D.a(matchException);
                                                                }
                                                                if (n >= 0) break block23;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _8D.a(matchException);
                                                            }
                                                            object = callSite;
                                                        }
                                                        n6 = d7 == d3 ? 0 : (d7 < d3 ? -1 : 1);
                                                    }
                                                    string3 = string;
                                                }
                                                if (string3 != null) {
                                                    n6 = n6 <= 0 ? 1 : 0;
                                                }
                                                try {
                                                    d4 = d5 == d3 ? 0 : (d5 < d3 ? -1 : 1);
                                                    if (string == null) break block24;
                                                    if (d4 > 0) break block25;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8D.a(matchException);
                                                }
                                                d4 = 1.0;
                                                break block24;
                                            }
                                            d4 = 0.0;
                                        }
                                        if (n6 == d4) break block28;
                                        double d9 = d8 + (d3 - d7) * (d6 - d8) / (d5 - d7);
                                        try {
                                            try {
                                                try {
                                                    string2 = string;
                                                    if (l2 < 0L) break block26;
                                                    if (string2 == null) break block27;
                                                    if (!(d9 > d2)) break block28;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _8D.a(matchException);
                                                }
                                                n5 = n3;
                                                if (string == null) break block29;
                                            }
                                            catch (MatchException matchException) {
                                                throw _8D.a(matchException);
                                            }
                                            if (n5) break block30;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8D.a(matchException);
                                        }
                                        n5 = 1;
                                        break block29;
                                    }
                                    n5 = 0;
                                }
                                n3 = n5;
                            }
                            ++n4;
                        }
                        string2 = string;
                    }
                    if (string2 != null) continue;
                }
                if (l2 < 0L) break block31;
                n = n3;
            }
            if (n != 0) {
                d = object;
                return d;
            }
        }
        d = -object;
        return d;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8D.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8D.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8D.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8D.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8D.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8D.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8D.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8D.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8D.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8D.a(clazz3, string2, clazz2)) != null) {
                    _8D.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8D.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8D.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8D.b(1266425684398224L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8D.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8D.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8D.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8D.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8D.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8D.b(1266425684398224L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8D.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8D.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8D.b(1266425684398224L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8D" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
        MethodHandle methodHandle = _8D.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == '\u00ca' || c == '\u00ff' || c == '\u00d9') {
                field = _8D.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8D.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 9;
            case 1 -> 0;
            case 2 -> 19;
            case 3 -> 33;
            case 4 -> 50;
            case 5 -> 8;
            case 6 -> 12;
            case 7 -> 5;
            case 8 -> 23;
            case 9 -> 51;
            case 10 -> 39;
            case 11 -> 15;
            case 12 -> 27;
            case 13 -> 45;
            case 14 -> 37;
            case 15 -> 16;
            case 16 -> 49;
            case 17 -> 48;
            case 18 -> 7;
            case 19 -> 32;
            case 20 -> 36;
            case 21 -> 30;
            case 22 -> 26;
            case 23 -> 43;
            case 24 -> 62;
            case 25 -> 28;
            case 26 -> 57;
            case 27 -> 3;
            case 28 -> 63;
            case 29 -> 18;
            case 30 -> 40;
            case 31 -> 55;
            case 32 -> 35;
            case 33 -> 11;
            case 34 -> 14;
            case 35 -> 58;
            case 36 -> 29;
            case 37 -> 42;
            case 38 -> 17;
            case 39 -> 31;
            case 40 -> 6;
            case 41 -> 10;
            case 42 -> 47;
            case 43 -> 21;
            case 44 -> 52;
            case 45 -> 46;
            case 46 -> 59;
            case 47 -> 44;
            case 48 -> 22;
            case 49 -> 54;
            case 50 -> 53;
            case 51 -> 4;
            case 52 -> 1;
            case 53 -> 56;
            case 54 -> 2;
            case 55 -> 60;
            case 56 -> 41;
            case 57 -> 13;
            case 58 -> 25;
            case 59 -> 61;
            case 60 -> 34;
            case 61 -> 38;
            case 62 -> 20;
            default -> 24;
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
        _8D.c[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "p3\u001fuNV{<\u000e:-[n:";
        objectArray[1] = Double.TYPE;
        _8D.c[1] = "java/lang/Double";
        objectArray[2] = "\"\u001f\u000er.K?\n\f3+\u0017~>";
        objectArray[3] = "gz\u007fb\"\u0012\u0012Ztm3]sT\u007ff7\u0007\u0007";
        objectArray[4] = ",,o!04Y\fd.!{8\u0002o%%!L";
        objectArray[5] = "i\u000b";
        objectArray[6] = "GE\u00054\u0010EZP\u0007u\u0015\u0019\u0013\u0014";
        objectArray[7] = " ,";
        objectArray[8] = ")\"<gMm47>&H1u(";
        objectArray[9] = Integer.TYPE;
        _8D.c[9] = "java/lang/Integer";
        objectArray[10] = "\u0010$\u001a\u0004\u000ete\u0004\u0011\u000b\u001f;\u0004\n\u001a\u0000\u001bap";
        objectArray[11] = "e6\tn,kx#\u000b/)787";
        objectArray[12] = "-6t@^\r0#v\u0001[Qye";
        objectArray[13] = Long.TYPE;
        _8D.c[13] = "java/lang/Long";
        objectArray[14] = "=dYW\u000e\bHDRX\u001fG)JYS\u001b\u001d]";
        objectArray[15] = "H\n";
        objectArray[16] = "|d/\u001aH\u0019LZ2\u000fJXI\u0006{K\u0005";
        objectArray[17] = "(U\u0007\u001eD5#Z\u0016Q%;(Q\u0012\u000b";
        objectArray[18] = "Ci)\u001f9$\u001cc \u0003Kc\u007f6%\u000f+fCq(\u000f._";
        objectArray[19] = "P^\u001aWu+\u000fT\u0013K\u0007`lQ\u0000D65\u0014E\u0016L<P";
        objectArray[20] = "\rI@~FY[\u000bB`xtqug\u0007EBSH\u001dd\u0013\u0000QV";
        objectArray[21] = "y\u000bG\u0018 E&\u0001N\u0004R\u0004ESAYiQ(\u000bF](>";
        objectArray[22] = "B86/\u0016\u001f\u001d2?3dU~c.3\u001dZ\u001d5l1\u0003d";
        objectArray[23] = "CtkP0b\u0015l1Y^4z{j\u0015!;@))\u00145\u0005C~=Kg9\u0004s=N^";
        objectArray[24] = "qcT\u007fyl2s\n$\u00169N \u0004rv0rg\trs";
        objectArray[25] = "<p\u001c\t\"%mcKJNz\f+J].|0lG]+E";
        objectArray[26] = "R\np,<d\u0003\u0019'oP<bQ&x0=^\u0016+x5\u0004";
        objectArray[27] = "`Ci\n#[4Ri5h\u0003wL\u007f5+\beJ*\tl\u0005eO\u0013\u0004}Y`\u001biM\u007f\u0004h*";
        objectArray[28] = "$N\f0!2r\f\u000e.\u001f\nEl(\nRQ$N\f0!2r\f\u000e.";
        objectArray[29] = "~mALE(/~\u0016\u000f)uN6\u0017\u0018Iqrq\u001a\u0018LH";
        objectArray[30] = "VlpR*r\u0000t*[D*ocq\u0017;+U12\u0016/\u0015Tj9N'-\u000bir\u0018D";
        objectArray[31] = "|1Pz`g*)\ns\u000e;E>Q?q>\u007fl\u0012>e\u0000|;\u0006a7<;6\u0006d\u000e";
        objectArray[32] = "rqmG\u0013V$i7N}\tK~l\u0002\u0002\u000fq,/\u0003\u00161r{;\\D\r5v;Y}";
        objectArray[33] = "\ryx5B3Ni&n-l2=\"i\u00169_e%mW";
        objectArray[34] = "'s\u0010\u000b7ndcNPX6\u0018`V\u0005in`t@\rc";
        objectArray[35] = "\u001c!O\u0014\u001cc_1\u0011Os?#f\u000b\u0015\n8@0I\u0017\u0014";
        objectArray[36] = "J(SH-\u0015\u001b;\u0004\u000bAOzs\u0005\u001c!LF4\b\u001c$u";
        objectArray[37] = "\u0004\u0019j :OP\bj\u001fp\t\u0014\f\u0010&g\u001f\u000eI,aj\u001f\u000bp)sd\u0010WLn~d\u0015n";
        objectArray[38] = "\u001bS{*D\u0005J@,i(\\+[9lU\u0001H\u000f8,\u0018e";
        Object[] objectArray2 = objectArray;
        objectArray[39] = ",%\u0006\u0014R-x4\u0006+\u0006{6LEG\fr\u007fp\u0002J\fwFu\u0010D\u0003+z2\u001dD\u0006\u0012\u007f \u0013KZ.8-\u0013Nc";
    }

    private static double cfr_renamed_4(Object[] objectArray) {
        Object object;
        block8: {
            double d;
            double d2;
            block9: {
                double d3 = (Double)objectArray[0];
                double d4 = (Double)objectArray[1];
                double[] dArray = (double[])objectArray[2];
                int n = (Integer)objectArray[3];
                long l2 = (Long)objectArray[4];
                double d5 = (Double)objectArray[5];
                long l3 = (l2 = a ^ l2) ^ 0x19B5A48EC15AL;
                Object object2 = Double.MAX_VALUE;
                int n2 = 0;
                String string = _4.cfr_renamed_3();
                block4: while (n2 < n) {
                    d2 = dArray[n2 * 4];
                    do {
                        String string2;
                        block6: {
                            block7: {
                                block10: {
                                    double d6 = d2;
                                    double d7 = dArray[n2 * 4 + 1];
                                    double d8 = dArray[n2 * 4 + 2];
                                    double d9 = dArray[n2 * 4 + 3];
                                    Object[] objectArray2 = new Object[7];
                                    objectArray2[6] = l3;
                                    objectArray2[5] = d9;
                                    objectArray2[4] = d8;
                                    objectArray2[3] = d7;
                                    objectArray2[2] = d6;
                                    objectArray2[1] = d4;
                                    objectArray2[0] = d3;
                                    CallSite callSite = _8D.a("l", (Object)objectArray2, 8318639928091293306L, (long)l2);
                                    try {
                                        try {
                                            string2 = string;
                                            if (l2 < 0L) break block6;
                                            if (string2 == null) break block7;
                                            object = callSite;
                                            if (l2 < 0L) break block8;
                                            d = object2;
                                            if (string == null) break block9;
                                        }
                                        catch (MatchException matchException) {
                                            throw _8D.a(matchException);
                                        }
                                        if (!(object < d)) break block10;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8D.a(matchException);
                                    }
                                    object2 = callSite;
                                }
                                ++n2;
                            }
                            string2 = string;
                        }
                        if (string2 != null) continue block4;
                        d2 = d5;
                    } while (l2 < 0L);
                }
                d = object2;
            }
            object = d2 - d;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    private static double cfr_renamed_6(Object[] var0) {
        block16: {
            block17: {
                block18: {
                    block14: {
                        block15: {
                            block13: {
                                var1_1 = (Double)var0[0];
                                var3_2 = (Double)var0[1];
                                var5_3 = (Double)var0[2];
                                var7_4 = (Double)var0[3];
                                var9_5 = (Double)var0[4];
                                var11_6 = (Double)var0[5];
                                var13_7 = (Long)var0[6];
                                var13_7 = _8D.a ^ var13_7;
                                var16_8 = var9_5 - var5_3;
                                var18_9 = var11_6 - var7_4;
                                var20_10 = var16_8 * var16_8 + var18_9 * var18_9;
                                var15_11 = _4.cfr_renamed_3();
                                try {
                                    v0 = var20_10;
                                    v1 = 1.0E-12;
                                    if (var15_11 == null) break block13;
                                    if (v0 < v1) {
                                    }
                                    ** GOTO lbl28
                                }
                                catch (MatchException v2) {
                                    throw _8D.a(v2);
                                }
                                v0 = 0.0;
                                if (var13_7 < 0L) ** GOTO lbl29
                                var22_12 = v0;
                                try {
                                    if (var15_11 != null) break block14;
lbl28:
                                    // 2 sources

                                    v0 = (var1_1 - var5_3) * var16_8 + (var3_2 - var7_4) * var18_9;
lbl29:
                                    // 2 sources

                                    v1 = var20_10;
                                }
                                catch (MatchException v3) {
                                    throw _8D.a(v3);
                                }
                            }
                            var22_12 = v0 / v1;
                            try {
                                cfr_temp_0 = var22_12 - 0.0;
                                v4 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                if (var15_11 == null) break block15;
                                if (v4 < 0) {
                                }
                                ** GOTO lbl50
                            }
                            catch (MatchException v5) {
                                throw _8D.a(v5);
                            }
                            v6 = 0.0;
                            if (var13_7 < 0L) break block18;
                            var22_12 = v6;
                            try {
                                try {
                                    if (var15_11 != null) break block14;
lbl50:
                                    // 2 sources

                                    v7 = var22_12;
                                    if (var13_7 <= 0L) break block16;
                                    v8 = 1.0;
                                    if (var15_11 == null) break block17;
                                }
                                catch (MatchException v9) {
                                    throw _8D.a(v9);
                                }
                                cfr_temp_1 = v7 - v8;
                                v4 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                            }
                            catch (MatchException v10) {
                                throw _8D.a(v10);
                            }
                        }
                        if (v4 > 0) {
                            var22_12 = 1.0;
                        }
                    }
                    v6 = var5_3;
                }
                v8 = var22_12 * var16_8;
            }
            v7 = v6 + v8;
        }
        var24_13 = v7;
        var26_14 = var7_4 + var22_12 * var18_9;
        var28_15 = var1_1 - var24_13;
        var30_16 = var3_2 - var26_14;
        return (double)_8D.a("l", (double)(var28_15 * var28_15 + var30_16 * var30_16), (long)7733024378113667824L, (long)var13_7);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static byte[] cfr_renamed_9(Object[] var0) {
        block50: {
            block48: {
                block49: {
                    block46: {
                        block47: {
                            var1_1 = (_06)var0[0];
                            var6_2 = (Integer)var0[1];
                            var2_3 = (Integer)var0[2];
                            var3_4 = (Integer)var0[3];
                            var4_5 = (Long)var0[4];
                            v0 = var4_5 = _8D.a ^ var4_5;
                            var7_6 = v0 ^ 68249158470169L;
                            var9_7 = v0 ^ 40501730014882L;
                            var11_8 = _4.cfr_renamed_3();
                            try {
                                try {
                                    v1 = ((CallSite)_8D.a("\u00cc", (Object)var1_1, (long)6922848294524683778L, (long)var4_5)).length;
                                    if (var11_8 == null) break block46;
                                    if (v1 != 0) break block47;
                                }
                                catch (MatchException v2) {
                                    throw _8D.a(v2);
                                }
                                return new byte[var6_2 * var6_2];
                            }
                            catch (MatchException v3) {
                                throw _8D.a(v3);
                            }
                        }
                        v1 = var3_4;
                    }
                    try {
                        if (var11_8 == null) break block48;
                        if (v1 >= 1) break block49;
                    }
                    catch (MatchException v4) {
                        throw _8D.a(v4);
                    }
                    var3_4 = 1;
                }
                v1 = var6_2;
            }
            var12_9 = (double)v1 - 2.0 * (double)var2_3;
            var14_10 = var12_9 / _8D.a("l", (double)_8D.a("\u00cc", (Object)var1_1, (long)6925960466418915002L, (long)var4_5), (double)_8D.a("\u00cc", (Object)var1_1, (long)6922692861299280157L, (long)var4_5), (long)6922784696056359131L, (long)var4_5);
            var16_11 = ((double)var6_2 - _8D.a("\u00cc", (Object)var1_1, (long)6925960466418915002L, (long)var4_5) * var14_10) * 0.5 - _8D.a("\u00cc", (Object)var1_1, (long)6925475758090358757L, (long)var4_5) * var14_10;
            var18_12 = ((double)var6_2 - _8D.a("\u00cc", (Object)var1_1, (long)6922692861299280157L, (long)var4_5) * var14_10) * 0.5 - _8D.a("\u00cc", (Object)var1_1, (long)6925720435176479717L, (long)var4_5) * var14_10;
            var20_13 = new _9d[((CallSite)_8D.a("\u00cc", (Object)var1_1, (long)6922848294524683778L, (long)var4_5)).length];
            for (var21_14 = 0; var21_14 < ((CallSite)_8D.a("\u00cc", (Object)var1_1, (long)6922848294524683778L, (long)var4_5)).length; ++var21_14) {
                block62: {
                    block51: {
                        block52: {
                            var22_16 = _8D.a("\u00cc", (Object)var1_1, (long)6922848294524683778L, (long)var4_5)[var21_14];
                            var23_18 = _8D.a("\u00cc", (Object)var22_16, (long)6925982273049567041L, (long)var4_5);
                            var24_19 = new double[var23_18 * 4];
                            v5 = 0;
                            if (var11_8 == null) break block50;
                            var25_22 = v5;
                            block25: while (var25_22 < var23_18) {
                                try {
                                    var24_19[var25_22 * 4] = (double)(_8D.a("\u00cc", (Object)var22_16, (long)6926461656940293758L, (long)var4_5)[var25_22 * 4] * var14_10 + var16_11);
                                    var24_19[var25_22 * 4 + 1] = (double)(_8D.a("\u00cc", (Object)var22_16, (long)6926461656940293758L, (long)var4_5)[var25_22 * 4 + 1] * var14_10 + var18_12);
                                    var24_19[var25_22 * 4 + 2] = (double)(_8D.a("\u00cc", (Object)var22_16, (long)6926461656940293758L, (long)var4_5)[var25_22 * 4 + 2] * var14_10 + var16_11);
                                    var24_19[var25_22 * 4 + 3] = (double)(_8D.a("\u00cc", (Object)var22_16, (long)6926461656940293758L, (long)var4_5)[var25_22 * 4 + 3] * var14_10 + var18_12);
                                    ++var25_22;
                                    do {
                                        v6 = var11_8;
                                        if (var4_5 > 0L) {
                                            if (v6 == null) break block51;
                                            v6 = var11_8;
                                        }
                                        if (v6 != null) continue block25;
                                    } while (var4_5 <= 0L);
                                    break;
                                }
                                catch (MatchException v7) {
                                    throw _8D.a(v7);
                                }
                            }
                            try {
                                try {
                                    v8 = var22_16;
                                    if (var11_8 == null) break block52;
                                    if (_8D.a("\u00cc", (Object)v8, (long)6926192119822198160L, (long)var4_5) != _8D.a("\u00ff", (long)6925514977748003778L, (long)var4_5)) break block51;
                                }
                                catch (MatchException v9) {
                                    throw _8D.a(v9);
                                }
                                v8 = var22_16;
                            }
                            catch (MatchException v10) {
                                throw _8D.a(v10);
                            }
                        }
                        v11 /* !! */  = _8D.a("\u00cc", (Object)v8, (long)6926477971039457391L, (long)var4_5) * var14_10 * 0.5;
                        break block62;
                    }
                    v11 /* !! */  = (reference)0.0;
                }
                var25_21 /* !! */  = (double)v11 /* !! */ ;
                var20_13[var21_14] = new _9d((_8o)_8D.a("\u00cc", (Object)var22_16, (long)6926192119822198160L, (long)var4_5), var25_21 /* !! */ , var24_19, (int)var23_18);
                if (var11_8 != null) continue;
            }
            v5 = var6_2;
            if (var4_5 > 0L) {
                v5 = v5 * var6_2;
            }
        }
        var21_15 = new byte[v5];
        var22_17 = 2.0 * (double)var2_3;
        var24_20 = var3_4;
        var25_21 /* !! */  = 1.0 / (double)var24_20;
        var27_23 = var25_21 /* !! */  * 0.5;
        var29_24 = 1.0 / (double)(var24_20 * var24_20);
        var31_25 = 0;
        block27: while (true) {
            v12 = var31_25;
            block28: while (v12 < var6_2) {
                var32_26 = 0;
                block29: while (true) {
                    v13 = var32_26;
                    block30: while (v13 < var6_2) {
                        var33_27 = 0.0;
                        v12 = 0;
                        v14 = var11_8;
                        while (v14 != null) {
                            block60: {
                                block61: {
                                    block59: {
                                        var35_28 = v12;
                                        block32: while (true) {
                                            v15 = var35_28;
                                            block33: while (v15 < var24_20) {
                                                var36_30 = (double)var31_25 + var27_23 + (double)var35_28 * var25_21 /* !! */ ;
                                                v13 = 0;
                                                if (var11_8 == null) continue block30;
                                                var38_32 = v13;
                                                while (var38_32 < var24_20) {
                                                    block53: {
                                                        block54: {
                                                            var39_33 = (double)var32_26 + var27_23 + (double)var38_32 * var25_21 /* !! */ ;
                                                            var41_34 /* !! */  = -Infinity;
                                                            var43_35 = var20_13;
                                                            var44_36 = var43_35.length;
                                                            v15 = 0;
                                                            if (var11_8 == null) continue block33;
                                                            var45_37 = v15;
                                                            while (var45_37 < var44_36) {
                                                                block56: {
                                                                    block57: {
                                                                        block58: {
                                                                            block55: {
                                                                                var46_38 = var43_35[var45_37];
                                                                                try {
                                                                                    try {
                                                                                        v16 = var11_8;
                                                                                        if (var4_5 < 0L) break block53;
                                                                                        if (v16 == null) break block54;
                                                                                        if (_8D.a("e", (Object)var46_38, (long)6923022870588160977L, (long)var4_5) != _8D.a("\u00ff", (long)6926107258512794578L, (long)var4_5)) break block55;
                                                                                    }
                                                                                    catch (MatchException v17) {
                                                                                        throw _8D.a(v17);
                                                                                    }
                                                                                    v18 = new Object[5];
                                                                                    v18[4] = (int)_8D.a("e", (Object)var46_38, (long)6922927388418194411L, (long)var4_5);
                                                                                    v18[3] = _8D.a("e", (Object)var46_38, (long)6923125532167398821L, (long)var4_5);
                                                                                    v18[2] = var36_30;
                                                                                    v18[1] = var9_7;
                                                                                    v18[0] = var39_33;
                                                                                    v19 = _8D.a("l", (Object)v18, (long)6926134471265052121L, (long)var4_5);
                                                                                }
                                                                                catch (MatchException v20) {
                                                                                    throw _8D.a(v20);
                                                                                }
                                                                            }
                                                                            v21 = new Object[6];
                                                                            v21[5] = (double)_8D.a("e", (Object)var46_38, (long)6925810815141529013L, (long)var4_5);
                                                                            v21[4] = var7_6;
                                                                            v21[3] = (int)_8D.a("e", (Object)var46_38, (long)6922927388418194411L, (long)var4_5);
                                                                            v21[2] = _8D.a("e", (Object)var46_38, (long)6923125532167398821L, (long)var4_5);
                                                                            v21[1] = var36_30;
                                                                            v21[0] = var39_33;
                                                                            v19 = _8D.a("l", (Object)v21, (long)6923005922269831763L, (long)var4_5);
                                                                            var47_39 = v19;
                                                                            try {
                                                                                v22 = var11_8;
                                                                                if (var4_5 <= 0L) break block56;
                                                                                if (v22 == null) break block57;
                                                                                if (!(var47_39 > var41_34 /* !! */ )) break block58;
                                                                            }
                                                                            catch (MatchException v23) {
                                                                                throw _8D.a(v23);
                                                                            }
                                                                            var41_34 /* !! */  = (double)var47_39;
                                                                        }
                                                                        ++var45_37;
                                                                    }
                                                                    v22 = var11_8;
                                                                }
                                                                if (v22 != null) continue;
                                                            }
                                                            var33_27 += var41_34 /* !! */ ;
                                                            if (var4_5 >= 0L) {
                                                                ++var38_32;
                                                            }
                                                        }
                                                        v16 = var11_8;
                                                    }
                                                    if (v16 != null) continue;
                                                }
                                                ++var35_28;
                                                v24 = var11_8;
                                                if (var4_5 <= 0L) continue block27;
                                                if (v24 != null) continue block32;
                                            }
                                            break;
                                        }
                                        var35_29 = var33_27 * var29_24;
                                        var37_31 = 0.5 + var35_29 / var22_17;
                                        try {
                                            cfr_temp_0 = var37_31 - 0.0;
                                            v25 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                            v14 = var11_8;
                                            if (var4_5 < 0L) continue;
                                            if (v14 == null) break block59;
                                            if (v25 < 0) {
                                            }
                                            ** GOTO lbl207
                                        }
                                        catch (MatchException v26) {
                                            throw _8D.a(v26);
                                        }
                                        var37_31 = 0.0;
                                        try {
                                            try {
                                                v27 = var11_8;
                                                if (var4_5 < 0L) continue block29;
                                                if (v27 != null) break block60;
lbl207:
                                                // 2 sources

                                                v28 = var37_31;
                                                if (var11_8 == null) break block61;
                                            }
                                            catch (MatchException v29) {
                                                throw _8D.a(v29);
                                            }
                                            cfr_temp_1 = v28 - 1.0;
                                            v30 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                        }
                                        catch (MatchException v31) {
                                            throw _8D.a(v31);
                                        }
                                    }
                                    if (v30 <= 0) break block60;
                                    v28 = 1.0;
                                }
                                var37_31 = v28;
                            }
                            var21_15[var31_25 * var6_2 + var32_26] = (byte)((int)_8D.a("l", (double)(var37_31 * 255.0), (long)6925852448535726010L, (long)var4_5));
                            ++var32_26;
                            v27 = var11_8;
                            if (v27 != null) continue block29;
                        }
                        continue block28;
                    }
                    break;
                }
                {
                    ++var31_25;
                    if (var4_5 <= 0L) break block27;
                    v24 = var11_8;
                    if (v24 != null) continue block27;
                    break;
                }
            }
            break;
        }
        return var21_15;
    }

    public static byte[] cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _06 var3_2 = (_06)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        long l3 = (l2 = a ^ l2) ^ 0x1C4A5AA5A931L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l3;
        objectArray2[3] = 2;
        objectArray2[2] = n2;
        objectArray2[1] = n;
        objectArray2[0] = var3_2;
        return _8D.a("l", (Object)objectArray2, 1178235269781810199L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8D.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

