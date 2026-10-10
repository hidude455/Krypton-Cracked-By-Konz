/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

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

public class _9F
extends Enum {
    public static final _9F Paged;
    public static final _9F Simple;
    private static final _9F[] cfr_renamed_2;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9F() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-9221644018951472118L, 5307321235277032127L, MethodHandles.lookup().lookupClass()).a(267094257931645L);
        long l2 = a ^ 0x70DC4CD3EED2L;
        b = new Object[12];
        c = new String[12];
        _9F.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00e3\u0098\u0019\u00e5`g\u00af9\b\u00af\u0014\u009c\u0019\u0016I\u008dR";
        int n2 = "\u00e3\u0098\u0019\u00e5`g\u00af9\b\u00af\u0014\u009c\u0019\u0016I\u008dR".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _9F.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Paged = new _9F(stringArray[0], 0);
                Simple = new _9F(stringArray[1], 1);
                cfr_renamed_2 = _9F.a("\u00f4", -9159373616413226092L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _9F[] values() {
        long l2 = a ^ 0x6B882A7FAF72L;
        return (_9F[])((Enum)((Object)_9F.a("I", -4521407711846703621L, (long)l2))).clone();
    }

    public static _9F valueOf(String string) {
        long l2 = a ^ 0x6FA05C77FC4L;
        return (_9F)((Object)_9F.a("\u00f4", _9F.class, (Object)string, 1294083015924231140L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9F.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9F.b(classArray[j], string, clazz2);
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
            int n = _9F.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9F.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9F.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9F.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9F.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9F.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9F.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9F.a(clazz3, string2, clazz2)) != null) {
                    _9F.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9F.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9F.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9F.b(458427859595403L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9F.a(l2, l3);
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
                clazz3 = _9F.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9F.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9F.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9F.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9F.b(458427859595403L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9F.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9F.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9F.b(458427859595403L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00ea' || c == 'I' || c == '\u00f6') {
                field = _9F.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9F.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9F.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9F" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 13;
            case 1 -> 32;
            case 2 -> 56;
            case 3 -> 11;
            case 4 -> 38;
            case 5 -> 2;
            case 6 -> 19;
            case 7 -> 52;
            case 8 -> 28;
            case 9 -> 6;
            case 10 -> 10;
            case 11 -> 46;
            case 12 -> 5;
            case 13 -> 23;
            case 14 -> 55;
            case 15 -> 15;
            case 16 -> 21;
            case 17 -> 40;
            case 18 -> 26;
            case 19 -> 49;
            case 20 -> 51;
            case 21 -> 24;
            case 22 -> 34;
            case 23 -> 35;
            case 24 -> 48;
            case 25 -> 44;
            case 26 -> 50;
            case 27 -> 9;
            case 28 -> 45;
            case 29 -> 61;
            case 30 -> 17;
            case 31 -> 39;
            case 32 -> 36;
            case 33 -> 57;
            case 34 -> 8;
            case 35 -> 47;
            case 36 -> 30;
            case 37 -> 4;
            case 38 -> 1;
            case 39 -> 29;
            case 40 -> 37;
            case 41 -> 63;
            case 42 -> 14;
            case 43 -> 33;
            case 44 -> 54;
            case 45 -> 31;
            case 46 -> 12;
            case 47 -> 16;
            case 48 -> 0;
            case 49 -> 59;
            case 50 -> 22;
            case 51 -> 27;
            case 52 -> 7;
            case 53 -> 60;
            case 54 -> 18;
            case 55 -> 20;
            case 56 -> 25;
            case 57 -> 53;
            case 58 -> 62;
            case 59 -> 58;
            case 60 -> 43;
            case 61 -> 42;
            case 62 -> 41;
            default -> 3;
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
        _9F.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0016K;\u0002\u0014\"\u001dD*M\u007f \tG";
        objectArray[1] = "2d\u000bj})9k\u001a%\u0010)9v\u000e";
        objectArray[2] = "\u0012\u000e\u0003tb!\u0019\u0001\u0012;\u001f9\n\u0006\u001br";
        objectArray[3] = "<0)Av_!%+\u0000s\u0003a\u0013";
        objectArray[4] = "\u0013'p:xR#\u0019m/z\u0013&E-\u00195";
        objectArray[5] = ".y\u0014\u001dW)\u001eG\t\bUh\u001b\u001bI>\u001a";
        objectArray[6] = "\u0013:>#\u0012\n\u00185/ls\u0004\u0013>+6";
        objectArray[7] = "Z#_Wb8\\p\u0013\u0003\u00069`q\u001dFe|\\-RAa";
        objectArray[8] = "\r\u00123Fg]\u000bA\u007f\u0012\u0003]7@qW`\u0019\u000b\u001c>Pdb";
        objectArray[9] = ".e\u001b6c/(6Wb\u0007H}cF6\u0007*}<G>8,.p\u0013";
        objectArray[10] = "U|\u001e$\u0003!V,CCC5R`N\u0004S\\JrI\u007fT6\ngAC\u0004-XzH;MfIv# \\aQ#^#\f<6";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "x.,#\u001bt~}`w\u007f\u0010#\"d+\u0012Kx.,#\u001bt~}`w";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _9F[] cfr_renamed_9() {
        long l2 = a ^ 0x14F1D65D7795L;
        return new _9F[]{_9F.a("I", 1847740229547724052L, (long)l2), _9F.a("I", 1847882420046028671L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9F.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

