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

public class _3l
extends Enum {
    public static final _3l Donut;
    public static final _3l Other;
    private static final _3l[] cfr_renamed_1;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _3l() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-6465371851982140297L, 7131014865360045589L, MethodHandles.lookup().lookupClass()).a(186762513653093L);
        long l2 = a ^ 0x2C0ED5FB4048L;
        b = new Object[12];
        c = new String[12];
        _3l.a();
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
        String string = "'jF\u00ad\u00b9X+t\b\u00a8\u0087*\u0080\u0016\u00cf\u00f4\u00a1";
        int n2 = "'jF\u00ad\u00b9X+t\b\u00a8\u0087*\u0080\u0016\u00cf\u00f4\u00a1".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _3l.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Donut = new _3l(stringArray[0], 0);
                Other = new _3l(stringArray[1], 1);
                cfr_renamed_1 = _3l.a("t", -1009407601496120481L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _3l[] values() {
        long l2 = a ^ 0x40D34362F3A4L;
        return (_3l[])((Enum)((Object)_3l.a("Y", 4760873802525607620L, (long)l2))).clone();
    }

    public static _3l valueOf(String string) {
        long l2 = a ^ 0x2DA126514CB7L;
        return (_3l)((Object)_3l.a("t", _3l.class, (Object)string, -215709296996761922L, (long)l2));
    }

    private static _3l[] cfr_renamed_1() {
        long l2 = a ^ 0x133720974CD1L;
        return new _3l[]{_3l.a("Y", -187152363571758988L, (long)l2), _3l.a("Y", -186913669664666999L, (long)l2)};
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3l.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3l.b(classArray[j], string, clazz2);
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
            int n = _3l.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3l.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3l.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3l.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3l.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3l.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3l.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3l.a(clazz3, string2, clazz2)) != null) {
                    _3l.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3l.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3l.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3l.b(476691850595073L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3l.a(l2, l3);
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
                clazz3 = _3l.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3l.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3l.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3l.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3l.b(476691850595073L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3l.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3l.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3l.b(476691850595073L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3l.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == 's' || c == 'Y' || c == 'f') {
                field = _3l.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3l.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            case 0 -> 56;
            case 1 -> 51;
            case 2 -> 43;
            case 3 -> 29;
            case 4 -> 3;
            case 5 -> 10;
            case 6 -> 25;
            case 7 -> 34;
            case 8 -> 19;
            case 9 -> 6;
            case 10 -> 17;
            case 11 -> 5;
            case 12 -> 1;
            case 13 -> 31;
            case 14 -> 59;
            case 15 -> 61;
            case 16 -> 2;
            case 17 -> 18;
            case 18 -> 14;
            case 19 -> 16;
            case 20 -> 7;
            case 21 -> 32;
            case 22 -> 13;
            case 23 -> 33;
            case 24 -> 40;
            case 25 -> 36;
            case 26 -> 44;
            case 27 -> 62;
            case 28 -> 15;
            case 29 -> 53;
            case 30 -> 22;
            case 31 -> 8;
            case 32 -> 0;
            case 33 -> 50;
            case 34 -> 35;
            case 35 -> 26;
            case 36 -> 46;
            case 37 -> 41;
            case 38 -> 11;
            case 39 -> 48;
            case 40 -> 38;
            case 41 -> 49;
            case 42 -> 20;
            case 43 -> 58;
            case 44 -> 63;
            case 45 -> 52;
            case 46 -> 55;
            case 47 -> 21;
            case 48 -> 47;
            case 49 -> 28;
            case 50 -> 12;
            case 51 -> 24;
            case 52 -> 27;
            case 53 -> 54;
            case 54 -> 42;
            case 55 -> 4;
            case 56 -> 45;
            case 57 -> 30;
            case 58 -> 39;
            case 59 -> 37;
            case 60 -> 57;
            case 61 -> 9;
            case 62 -> 23;
            default -> 60;
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
        _3l.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "T|\u001ew+tIi\u001c6.(\u0003u";
        objectArray[1] = "\u000f%\u001a.T'?\u001b\u0007;Vf:GM'\u0019";
        objectArray[2] = "1u2\nO>\u0001K/\u001fM\u007f\u0004\u0017e\u0003\u0002";
        objectArray[3] = "6f\f2\u0011z=i\u001d}zx)j";
        objectArray[4] = "$\u001f}\u000b\u0002w/\u0010lDow/\rx";
        objectArray[5] = "^\u0004)z!tU\u000b85\\lF\f1|";
        objectArray[6] = "\u0018ir\u0010y.\u0013fc_\u0018 \u0018mg\u0005";
        objectArray[7] = "oB0h\u0013ReM2QPo?\u001c;)\u0000\nk\t ,a";
        objectArray[8] = "`I*\u0005-kjF(<\u00131o\u0004&<6fy@(\u0001<i{";
        objectArray[9] = "-\u001fcL\u0001s'\u0010auBN}Ah\r\u0012+)Ts\b";
        objectArray[10] = "\n,\u001bplz^4\u000eu]}Y)\tx\u001am0w\b~8>\n7\u0016+c\u0003\u000b+\u0013qm:K7\u0014\u007f]9Q\"\u0011$$mI7\u0014\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "%S\u001c'0r/\\\u001e\u001e\u00053,\u000e\u0016\u001e+\u007f<Z\u001e#!p>";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

