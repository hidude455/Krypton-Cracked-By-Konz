/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._0j;
import dev.krypton._0t;
import dev.krypton._4w;
import dev.krypton.l;
import java.io.InputStream;
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

public class _0k
extends _0j {
    private final String cfr_renamed_1;
    private static final long a = l.a(-1951913566653969205L, 227072584897793681L, MethodHandles.lookup().lookupClass()).a(120208531887113L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] h;
    private static final String[] i;

    public _0k(_0t t, String string) {
        super(t);
        this.cfr_renamed_1 = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new Object[8];
        i = new String[8];
        _0k.b();
        e = new HashMap(13);
        long l2 = a ^ 0x1C31F7F61ED5L;
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
        String string = "\u00dd\u00e6\u00d4&\u00b7ab\u0001\u00e1`\u00bb;\u00d8a\u00aa\u00f7\u001f\n\u00db\u00e8\u008az\u00d1M\u00bdC\u00de\u00b9\u00f8\u00b5\u00f1\n8\u00c3/\u00a0\u0097\u00bez\u00a4\u0093d\u00deg\tE\u008f\u00b9\u00d1\u00a0N+\u00decq\u0095U\u00ea\u0084\u009b\u00b3.\u00ed\u0083\u007f\u0002+\u00c2H\u009a\u00c4p:q\u00a7]\u00af\u0016k\u00e7vX\u00d6\u00f1h?,G\u000e";
        int n2 = "\u00dd\u00e6\u00d4&\u00b7ab\u0001\u00e1`\u00bb;\u00d8a\u00aa\u00f7\u001f\n\u00db\u00e8\u008az\u00d1M\u00bdC\u00de\u00b9\u00f8\u00b5\u00f1\n8\u00c3/\u00a0\u0097\u00bez\u00a4\u0093d\u00deg\tE\u008f\u00b9\u00d1\u00a0N+\u00decq\u0095U\u00ea\u0084\u009b\u00b3.\u00ed\u0083\u007f\u0002+\u00c2H\u009a\u00c4p:q\u00a7]\u00af\u0016k\u00e7vX\u00d6\u00f1h?,G\u000e".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0k.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public String toString() {
        long l2 = a ^ 0x5B820AD1DD73L;
        return super.toString() + (String)((Object)_0k.a("s", 23924, (long)(0x6B439BFB25009E7DL ^ l2)));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 4;
            case 1 -> 24;
            case 2 -> 17;
            case 3 -> 11;
            case 4 -> 6;
            case 5 -> 2;
            case 6 -> 43;
            case 7 -> 59;
            case 8 -> 25;
            case 9 -> 19;
            case 10 -> 23;
            case 11 -> 36;
            case 12 -> 35;
            case 13 -> 51;
            case 14 -> 61;
            case 15 -> 14;
            case 16 -> 15;
            case 17 -> 32;
            case 18 -> 21;
            case 19 -> 8;
            case 20 -> 27;
            case 21 -> 42;
            case 22 -> 9;
            case 23 -> 52;
            case 24 -> 39;
            case 25 -> 48;
            case 26 -> 49;
            case 27 -> 54;
            case 28 -> 3;
            case 29 -> 58;
            case 30 -> 50;
            case 31 -> 45;
            case 32 -> 34;
            case 33 -> 62;
            case 34 -> 0;
            case 35 -> 41;
            case 36 -> 56;
            case 37 -> 31;
            case 38 -> 12;
            case 39 -> 47;
            case 40 -> 30;
            case 41 -> 28;
            case 42 -> 22;
            case 43 -> 63;
            case 44 -> 20;
            case 45 -> 7;
            case 46 -> 26;
            case 47 -> 18;
            case 48 -> 16;
            case 49 -> 46;
            case 50 -> 37;
            case 51 -> 1;
            case 52 -> 57;
            case 53 -> 40;
            case 54 -> 53;
            case 55 -> 13;
            case 56 -> 5;
            case 57 -> 60;
            case 58 -> 33;
            case 59 -> 55;
            case 60 -> 38;
            case 61 -> 29;
            case 62 -> 44;
            default -> 10;
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
        _0k.i[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0k.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = h;
        h[0] = "2o\bJ/H/z\n\u000b*\u0014fa";
        objectArray[1] = "\u0006 \u001b\u000e \u000f\r/\nA]\u0017\u001e(\u0003\b";
        objectArray[2] = "SK1\t\u007f^N^3Hz\u0002\u0004q";
        objectArray[3] = "5@\u00135M]@`\u0018:\\\u0012!n\u00131XHU";
        objectArray[4] = "(x=M5n-7\u0002Bkr6J?^~f/";
        objectArray[5] = "C\u001am u)H\u0015|o\u0014'C\u001ex5";
        objectArray[6] = "P\u001a\u000en\u0013s\u0000A\u0011'\u007f)iB\u0014x\u0007b\bI\u000fi\r\u0010R@\u001a{\u0005+\u0002\u001eOn\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "KuV'\u000fk\u0010%PN\u0003\u001b\u0011 J(\f}O \u0017#";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e0' || c == '\u00f5' || c == 'Y' || c == '\u00e7') {
                field = _0k.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0k.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            throw new RuntimeException("dev/krypton/0k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0k.e(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0k.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0k.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0k.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0k.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0k.f(406165994417992L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0k.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0k.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0k.f(406165994417992L, 0L);
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
            int n = _0k.e(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _0k.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0k.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0k.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0k.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0k.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3B01;
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
                throw new RuntimeException("dev/krypton/0k", exception);
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
            _0k.d[n2] = _0k.a(((Cipher)objectArray[0]).doFinal(byArray2));
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0k.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _0k.e(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _0k.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0k.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0k.c(clazz3, string2, clazz2)) != null) {
                    _0k.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0k.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0k.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0k.f(406165994417992L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public InputStream cfr_renamed_7(Object[] objectArray) {
        CallSite callSite;
        block4: {
            CallSite callSite2;
            block5: {
                long l2 = (Long)objectArray[0];
                long l3 = l2 ^ 0xBC373E627ACL;
                _4w[] wArray = _0j.cfr_renamed_1();
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = _0k.c("\u00e0", (Object)this, -57555030366429905L, (long)l2);
                objectArray2[0] = l3;
                callSite2 = _0k.c("\u00f3", (Object)objectArray2, -57464152322214524L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        if (wArray == null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _0k.a(runtimeException);
                    }
                    throw new RuntimeException((String)((Object)_0k.a("s", 6601, (long)(0x3B400FD7A2365DFBL ^ l2))) + (String)((Object)_0k.c("\u00e0", (Object)this, -57555030366429905L, (long)l2)) + ".");
                }
                catch (RuntimeException runtimeException) {
                    throw _0k.a(runtimeException);
                }
            }
            callSite = callSite2;
        }
        return callSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0k.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

