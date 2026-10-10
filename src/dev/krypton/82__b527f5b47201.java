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

public class _82
extends Enum {
    public static final _82 IDLE;
    public static final _82 CIRCLING;
    public static final _82 STRIKING;
    private static final _82[] cfr_renamed_1;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _82() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-4374958640814970699L, 2915853186295220778L, MethodHandles.lookup().lookupClass()).a(266706783463574L);
        long l2 = a ^ 0x6D383AA5191BL;
        b = new Object[13];
        c = new String[13];
        _82.a();
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00cc\u00e8\u0001\u00e6\u00c6\u0003b\ni(\u0014rr\u0016e\u00d2\u00104z\u0081\u0010\u001f\u00d8\u00a8\u00d3\u0087,-6\u00a7\u00bf\u0017\u00e5\b\u00e3L\u0085\t\u00d3\u00ef\u0093\u008b";
        int n2 = "\u00cc\u00e8\u0001\u00e6\u00c6\u0003b\ni(\u0014rr\u0016e\u00d2\u00104z\u0081\u0010\u001f\u00d8\u00a8\u00d3\u0087,-6\u00a7\u00bf\u0017\u00e5\b\u00e3L\u0085\t\u00d3\u00ef\u0093\u008b".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _82.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                IDLE = new _82(stringArray[2], 0);
                CIRCLING = new _82(stringArray[1], 1);
                STRIKING = new _82(stringArray[0], 2);
                cfr_renamed_1 = _82.a("\u00e5", -7424779298293409442L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _82[] values() {
        long l2 = a ^ 0x222A25F8EB0BL;
        return (_82[])((Enum)((Object)_82.a("\u00e8", 7703246960509588839L, (long)l2))).clone();
    }

    public static _82 valueOf(String string) {
        long l2 = a ^ 0x5E86F4886C04L;
        return (_82)((Object)_82.a("\u00e5", _82.class, (Object)string, -1303299588915970000L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _82.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _82.b(classArray[j], string, clazz2);
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
            int n = _82.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _82.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _82.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _82.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _82.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _82.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _82.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _82.a(clazz3, string2, clazz2)) != null) {
                    _82.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _82.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _82.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _82.b(481321004270705L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _82.a(l2, l3);
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
                clazz3 = _82.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _82.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _82.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _82.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _82.b(481321004270705L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _82.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _82.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _82.b(481321004270705L, 0L);
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
            if (c == '\u00e1' || c == '\u00f6' || c == '\u00e8' || c == 'r') {
                field = _82.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _82.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _82.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/82" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 61;
            case 1 -> 59;
            case 2 -> 10;
            case 3 -> 38;
            case 4 -> 9;
            case 5 -> 54;
            case 6 -> 3;
            case 7 -> 8;
            case 8 -> 12;
            case 9 -> 49;
            case 10 -> 35;
            case 11 -> 19;
            case 12 -> 6;
            case 13 -> 55;
            case 14 -> 25;
            case 15 -> 1;
            case 16 -> 37;
            case 17 -> 47;
            case 18 -> 50;
            case 19 -> 46;
            case 20 -> 56;
            case 21 -> 13;
            case 22 -> 57;
            case 23 -> 29;
            case 24 -> 33;
            case 25 -> 36;
            case 26 -> 51;
            case 27 -> 41;
            case 28 -> 32;
            case 29 -> 14;
            case 30 -> 22;
            case 31 -> 17;
            case 32 -> 0;
            case 33 -> 20;
            case 34 -> 4;
            case 35 -> 23;
            case 36 -> 18;
            case 37 -> 28;
            case 38 -> 31;
            case 39 -> 24;
            case 40 -> 5;
            case 41 -> 40;
            case 42 -> 39;
            case 43 -> 45;
            case 44 -> 60;
            case 45 -> 15;
            case 46 -> 42;
            case 47 -> 48;
            case 48 -> 7;
            case 49 -> 63;
            case 50 -> 21;
            case 51 -> 16;
            case 52 -> 26;
            case 53 -> 11;
            case 54 -> 44;
            case 55 -> 52;
            case 56 -> 62;
            case 57 -> 53;
            case 58 -> 30;
            case 59 -> 58;
            case 60 -> 43;
            case 61 -> 2;
            case 62 -> 34;
            default -> 27;
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
        _82.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = ">0\b\u0016<\u000b#%\nW9Wbg";
        objectArray[1] = "j\u001c.}\u0010iZ\"3h\u0012(_~r*]";
        objectArray[2] = "\u0003y-ti\u000b3G0akJ6\u001bq#$";
        objectArray[3] = "\u0005<K;xq\u000e3Zt\u0013s\u001a0";
        objectArray[4] = "8R\u0015\u0003e|3]\u0004L\b|3@\u0010";
        objectArray[5] = "r.l\u001ac/y!}U\u001e7j&t\u001c";
        objectArray[6] = "CtZ>W\u000eH{Kq6\u0000CpO+";
        objectArray[7] = "_\"\"\u0011\\|[t#pV\u0004Z')@\u0017z\u000e8gLm";
        objectArray[8] = "Td\u0001c{|P2\u0000\u0002\u0011X2B9C\fKh?\u001dy+5\u0010;Kx";
        objectArray[9] = "6f\u001dQ+o20\u001c0QVPJ\"q\\X\n=\u0001K{&r9WJ";
        objectArray[10] = "\u000f(\\G(vD U\u0004O1\\-E\u001b\b!5sB\u00072!Wy\u0006\u0004vO\u000e3\u0002KwqN.J\u0019OuT-\t\u0011v>\\$Jv";
        objectArray[11] = "!\u0010k&)c%FjGYWY:\u0010{\u007f`|Fh\u007f)a";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "y\r{'e\u0010}[zFeh|\bpv.\u0016(\u0017>z";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _82[] cfr_renamed_6() {
        long l2 = a ^ 0x294F6254DA9CL;
        return new _82[]{_82.a("\u00e8", 6589192323879373648L, (long)l2), _82.a("\u00e8", 6589051210538548030L, (long)l2), _82.a("\u00e8", 6589168437314845803L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_82.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

