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

public class _4S
extends Enum {
    public static final _4S Crosshair;
    public static final _4S Feet;
    public static final _4S Center;
    private static final _4S[] cfr_renamed_1;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4S() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(1881460536641807906L, 780536139546821695L, MethodHandles.lookup().lookupClass()).a(144194939524359L);
        long l2 = a ^ 0x6595DB7802FBL;
        b = new Object[13];
        c = new String[13];
        _4S.a();
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
        String string = "\u0094 )\ry9\u00e3\u00d5O\u00da\u00c4fgJ\u001f\t\b\u00b5\u001d\u009e\u0098{\u00c5\u00d9\u0016\b\u00e7<w\u00a0\u0088~\u00eb\u00d2";
        int n2 = "\u0094 )\ry9\u00e3\u00d5O\u00da\u00c4fgJ\u001f\t\b\u00b5\u001d\u009e\u0098{\u00c5\u00d9\u0016\b\u00e7<w\u00a0\u0088~\u00eb\u00d2".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _4S.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Crosshair = new _4S(stringArray[0], 0);
                Feet = new _4S(stringArray[2], 1);
                Center = new _4S(stringArray[1], 2);
                cfr_renamed_1 = _4S.a("y", -2020550758324300461L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _4S[] values() {
        long l2 = a ^ 0x6E4F704C0EB7L;
        return (_4S[])((Enum)((Object)_4S.a("\u00fc", -1172895387378383703L, (long)l2))).clone();
    }

    public static _4S valueOf(String string) {
        long l2 = a ^ 0x741ADA652FD0L;
        return (_4S)((Object)_4S.a("y", _4S.class, (Object)string, -3540118068511846782L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4S.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4S.b(classArray[j], string, clazz2);
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
            int n = _4S.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4S.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4S.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4S.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4S.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4S.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4S.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4S.a(clazz3, string2, clazz2)) != null) {
                    _4S.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4S.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4S.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4S.b(466956171314049L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4S.a(l2, l3);
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
                clazz3 = _4S.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4S.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4S.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4S.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4S.b(466956171314049L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4S.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4S.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4S.b(466956171314049L, 0L);
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
            if (c == 'k' || c == '\u00fe' || c == '\u00fc' || c == 'G') {
                field = _4S.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4S.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4S.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4S" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 49;
            case 1 -> 58;
            case 2 -> 8;
            case 3 -> 51;
            case 4 -> 0;
            case 5 -> 24;
            case 6 -> 13;
            case 7 -> 29;
            case 8 -> 25;
            case 9 -> 40;
            case 10 -> 32;
            case 11 -> 16;
            case 12 -> 52;
            case 13 -> 35;
            case 14 -> 56;
            case 15 -> 44;
            case 16 -> 3;
            case 17 -> 38;
            case 18 -> 47;
            case 19 -> 12;
            case 20 -> 41;
            case 21 -> 11;
            case 22 -> 31;
            case 23 -> 54;
            case 24 -> 30;
            case 25 -> 14;
            case 26 -> 7;
            case 27 -> 33;
            case 28 -> 21;
            case 29 -> 17;
            case 30 -> 23;
            case 31 -> 28;
            case 32 -> 19;
            case 33 -> 1;
            case 34 -> 34;
            case 35 -> 20;
            case 36 -> 22;
            case 37 -> 15;
            case 38 -> 42;
            case 39 -> 4;
            case 40 -> 18;
            case 41 -> 59;
            case 42 -> 36;
            case 43 -> 48;
            case 44 -> 55;
            case 45 -> 10;
            case 46 -> 27;
            case 47 -> 37;
            case 48 -> 63;
            case 49 -> 5;
            case 50 -> 60;
            case 51 -> 57;
            case 52 -> 61;
            case 53 -> 26;
            case 54 -> 9;
            case 55 -> 62;
            case 56 -> 46;
            case 57 -> 50;
            case 58 -> 43;
            case 59 -> 39;
            case 60 -> 53;
            case 61 -> 6;
            case 62 -> 2;
            default -> 45;
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
        _4S.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0013:hi8&\u000e/j(=zC\f";
        objectArray[1] = "\f1{U\u0001p\u0007>j\u001ajr\u0013=";
        objectArray[2] = ";\u000bt/2w0\u0004e`_w0\u0019q";
        objectArray[3] = ",\u0015\u0014'ae'\u001a\u0005h\u001c}4\u001d\f!";
        objectArray[4] = "U\u001f/jCke!2\u007fA*`}\u007f\\\u000e";
        objectArray[5] = "\u0014VT-1\u0005$hI83D!4\u0004\u001b|";
        objectArray[6] = "\u0018\u0016w[M1\u0013\u0019f\u0014,?\u0018\u0012bN";
        objectArray[7] = "FHl<\t\u0004F\u0005k\u0004s\u0017A\u0003kdQ\f\\xp4DU\u0017\u0011pyC";
        objectArray[8] = "\\&\u0016fpd\\k\u0011^p\r\u0007v\u0012!8j\u0001y\u0018d";
        objectArray[9] = "I&6r7JIk1JMNOj'0\u0006C\u0019jr{oCTm";
        objectArray[10] = "\u0001`nXgt\u0001-i`h\u001dZ0j\u001f/z\\?`ZV";
        objectArray[11] = "\u001fuMP?F\u0004\"Zo=H\ndI(-!T \u001dV/[^#\u0018QC\u001b\u0014|M\u0017)\\\u0012'Io2M\u0007&X\b)\u001a\u0010\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "e0e[\r:e}bcr>h|\u0019\u0003\f/=1p\u0003A(";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _4S[] cfr_renamed_2() {
        long l2 = a ^ 0x45D38182D11BL;
        return new _4S[]{_4S.a("\u00fc", 3465218694033020264L, (long)l2), _4S.a("\u00fc", 3464422018117080803L, (long)l2), _4S.a("\u00fc", 3464756824045904343L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4S.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

