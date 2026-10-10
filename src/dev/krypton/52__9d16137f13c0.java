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

public class _52
extends Enum {
    public static final _52 Opcode;
    public static final _52 Length;
    public static final _52 Data;
    private static final _52[] cfr_renamed_7;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static _52[] values() {
        long l2 = a ^ 0x747B4B0B32CFL;
        return (_52[])((Enum)((Object)_52.a("\u00f0", -2769569598261221524L, (long)l2))).clone();
    }

    public static _52 valueOf(String string) {
        long l2 = a ^ 0x1562E254F24CL;
        return (_52)((Object)_52.a("J", _52.class, (Object)string, 1806535466161091253L, (long)l2));
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _52() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    private static _52[] cfr_renamed_8() {
        long l2 = a ^ 0x5818FC84C256L;
        return new _52[]{_52.a("\u00f0", 2956913811297759332L, (long)l2), _52.a("\u00f0", 2956979251109901048L, (long)l2), _52.a("\u00f0", 2957362408971235346L, (long)l2)};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(5199379769295320366L, -4601880768761645297L, MethodHandles.lookup().lookupClass()).a(201520476867011L);
        long l2 = a ^ 0x52D8BBB29D4DL;
        b = new Object[13];
        c = new String[13];
        _52.a();
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
        String string = "\u00c7D\u00a2\u0004!E\u00fcD\b\u00de\u0006\u0014sW.11\b\u0099;\u00dfs\u0097c\u00b7U";
        int n2 = "\u00c7D\u00a2\u0004!E\u00fcD\b\u00de\u0006\u0014sW.11\b\u0099;\u00dfs\u0097c\u00b7U".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _52.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Opcode = new _52(stringArray[2], 0);
                Length = new _52(stringArray[0], 1);
                Data = new _52(stringArray[1], 2);
                cfr_renamed_7 = _52.a("J", 8508116828364052443L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
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
            case 0 -> 8;
            case 1 -> 26;
            case 2 -> 3;
            case 3 -> 37;
            case 4 -> 31;
            case 5 -> 23;
            case 6 -> 7;
            case 7 -> 47;
            case 8 -> 20;
            case 9 -> 49;
            case 10 -> 42;
            case 11 -> 14;
            case 12 -> 16;
            case 13 -> 0;
            case 14 -> 59;
            case 15 -> 62;
            case 16 -> 12;
            case 17 -> 53;
            case 18 -> 13;
            case 19 -> 5;
            case 20 -> 18;
            case 21 -> 60;
            case 22 -> 61;
            case 23 -> 30;
            case 24 -> 32;
            case 25 -> 39;
            case 26 -> 19;
            case 27 -> 50;
            case 28 -> 34;
            case 29 -> 51;
            case 30 -> 46;
            case 31 -> 6;
            case 32 -> 9;
            case 33 -> 43;
            case 34 -> 35;
            case 35 -> 63;
            case 36 -> 52;
            case 37 -> 57;
            case 38 -> 4;
            case 39 -> 28;
            case 40 -> 1;
            case 41 -> 41;
            case 42 -> 21;
            case 43 -> 29;
            case 44 -> 33;
            case 45 -> 40;
            case 46 -> 45;
            case 47 -> 25;
            case 48 -> 58;
            case 49 -> 44;
            case 50 -> 11;
            case 51 -> 54;
            case 52 -> 48;
            case 53 -> 55;
            case 54 -> 36;
            case 55 -> 10;
            case 56 -> 22;
            case 57 -> 38;
            case 58 -> 2;
            case 59 -> 24;
            case 60 -> 27;
            case 61 -> 56;
            case 62 -> 15;
            default -> 17;
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
        _52.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "@\\\u0011O=[KS\u0000\u0000VY_P";
        objectArray[1] = "\u0016hUM\u0017\n\u001dgD\u0002z\n\u001dzP";
        objectArray[2] = "\u0012J\u001c\u0018W\u0007\u0019E\rW*\u001f\nB\u0004\u001e";
        objectArray[3] = ":\u0013}\u0013\u0014\t'\u0006\u007fR\u0011UkD";
        objectArray[4] = "\u001a\f\u001aD\u0005\n*2\u0007Q\u0007K/nK\u0013H";
        objectArray[5] = "K\u0017f8:\u0012{){-8S~u7ow";
        objectArray[6] = "tO~>\u001bi\u007f@oqzgtKk+";
        objectArray[7] = "\u0003\u001c<`d\u0014\u0002@4m\u000e)PQe\u00074T\tJfv5\b\u0001G";
        objectArray[8] = "k+\u0006gA&jw\u000ej+\u0013<|Y|KWk+\u0006gA&jw\u000ej";
        objectArray[9] = "eoZ`N\u0010d3Rm$&'5\rkIaeoZ`N\u0010d3Rm";
        objectArray[10] = "w>]iX;vbUd2wM4\u001ci\f807\u0002pSJ";
        objectArray[11] = "Pr+F!=Q.#KKpjxjFu>\u0017{t_*";
        Object[] objectArray2 = objectArray;
        objectArray[12] = ">.\\z,\u000b;o\u0006Aj\b:.\u000f\u0006zagk\\-%\u001bdb\u0002.\u0014X&j\u001e,rZ.8]At\u001c`hZ+q]:S";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _52.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _52.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _52.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _52.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _52.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _52.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _52.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _52.a(clazz3, string2, clazz2)) != null) {
                    _52.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _52.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _52.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _52.b(433263774575656L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _52.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _52.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _52.a(l2, l3);
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
                clazz3 = _52.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _52.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _52.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _52.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _52.b(433263774575656L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _52.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _52.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _52.b(433263774575656L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'U' || c == '\u00e6' || c == '\u00f0' || c == '\u00f1') {
                field = _52.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'U' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _52.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _52.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/52" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_52.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

