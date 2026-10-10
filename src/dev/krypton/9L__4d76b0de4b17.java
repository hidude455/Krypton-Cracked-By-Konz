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

public class _9L
extends Enum {
    public static final _9L Box;
    public static final _9L Rect;
    private static final _9L[] cfr_renamed_7;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    private static _9L[] cfr_renamed_5() {
        long l2 = a ^ 0x2CCC44456E7BL;
        return new _9L[]{_9L.a("\u00e1", 8959084565485738653L, (long)l2), _9L.a("\u00e1", 8959289335504228144L, (long)l2)};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9L() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(6609585996491725673L, 8852313256546239846L, MethodHandles.lookup().lookupClass()).a(153311861200115L);
        long l2 = a ^ 0x64317FD2276L;
        b = new Object[12];
        c = new String[12];
        _9L.a();
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
        String string = "\u00ff\u00d5\u00ed\u00ab\u00d9\u00d7\u008e\u00db\b\u00b6\u00da\u00a0\u00e9\u00038\u0092H";
        int n2 = "\u00ff\u00d5\u00ed\u00ab\u00d9\u00d7\u008e\u00db\b\u00b6\u00da\u00a0\u00e9\u00038\u0092H".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _9L.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Box = new _9L(stringArray[1], 0);
                Rect = new _9L(stringArray[0], 1);
                cfr_renamed_7 = _9L.a("X", 3483691536372321685L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _9L[] values() {
        long l2 = a ^ 0x4504966DE588L;
        return (_9L[])((Enum)((Object)_9L.a("\u00e1", -601900696993811097L, (long)l2))).clone();
    }

    public static _9L valueOf(String string) {
        long l2 = a ^ 0x42EE893C315AL;
        return (_9L)((Object)_9L.a("X", _9L.class, (Object)string, 2554674892031357566L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9L.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9L.b(classArray[j], string, clazz2);
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
            int n = _9L.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9L.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9L.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9L.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9L.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9L.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9L.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9L.a(clazz3, string2, clazz2)) != null) {
                    _9L.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9L.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9L.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9L.b(483531387866631L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9L.a(l2, l3);
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
                clazz3 = _9L.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9L.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9L.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9L.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9L.b(483531387866631L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9L.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9L.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9L.b(483531387866631L, 0L);
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
        MethodHandle methodHandle = _9L.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9L" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == 'a' || c == '\u00e1' || c == '\u00c5') {
                field = _9L.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9L.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            case 0 -> 41;
            case 1 -> 28;
            case 2 -> 8;
            case 3 -> 23;
            case 4 -> 43;
            case 5 -> 6;
            case 6 -> 44;
            case 7 -> 40;
            case 8 -> 9;
            case 9 -> 52;
            case 10 -> 42;
            case 11 -> 21;
            case 12 -> 60;
            case 13 -> 34;
            case 14 -> 35;
            case 15 -> 5;
            case 16 -> 36;
            case 17 -> 27;
            case 18 -> 29;
            case 19 -> 4;
            case 20 -> 12;
            case 21 -> 0;
            case 22 -> 58;
            case 23 -> 49;
            case 24 -> 14;
            case 25 -> 16;
            case 26 -> 20;
            case 27 -> 19;
            case 28 -> 31;
            case 29 -> 17;
            case 30 -> 48;
            case 31 -> 54;
            case 32 -> 57;
            case 33 -> 63;
            case 34 -> 7;
            case 35 -> 33;
            case 36 -> 56;
            case 37 -> 50;
            case 38 -> 32;
            case 39 -> 2;
            case 40 -> 46;
            case 41 -> 25;
            case 42 -> 1;
            case 43 -> 53;
            case 44 -> 55;
            case 45 -> 61;
            case 46 -> 38;
            case 47 -> 11;
            case 48 -> 47;
            case 49 -> 18;
            case 50 -> 3;
            case 51 -> 37;
            case 52 -> 10;
            case 53 -> 51;
            case 54 -> 13;
            case 55 -> 45;
            case 56 -> 15;
            case 57 -> 59;
            case 58 -> 62;
            case 59 -> 24;
            case 60 -> 26;
            case 61 -> 39;
            case 62 -> 30;
            default -> 22;
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
        _9L.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "Kn{[=/V{y\u001a8s\u0016G";
        objectArray[1] = ")^u\u0007%\f\u0019`h\u0012'M\u001c<(.h";
        objectArray[2] = "@E\u001aN\t=KJ\u000b\u0001b?_I";
        objectArray[3] = "o,O8Z^d#^w7^d>J";
        objectArray[4] = "\u0000\u001b\u001c\f;b\u000b\u0014\rCFz\u0018\u0013\u0004\n";
        objectArray[5] = "<.9(7S\f\u0010$=5\u0012\tLd\u0001z";
        objectArray[6] = "QpQTq&Z\u007f@\u001b\u0010(QtDA";
        objectArray[7] = "iK\u001a\u001ff-l\r\u0014rb\u001ciR\u000b\u001b=#.YM\u0017";
        objectArray[8] = "HNdl\u001a\u001eM\bj\u0001hH\u000351zLBK\u00044<B";
        objectArray[9] = "*\u000em]\u0015'h\u001f>\u001dy!z\u0018~\t>1\u0013Fn\bE6-Fe\b\u0003_(Ds\u0000\u000b4#\u0000>\u000byfa\u0012:\b\u0001$pAzd";
        objectArray[10] = "\u0005[Q>s.\u0000\u001d_Sr\u001f\u0005B@:( BI\u00066K";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "<\r\u000bU`h9K\u00058\u00024l\ne\u0003#7jNT\u0006e9";
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
            return MethodHandles.lookup().findStatic(_9L.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

