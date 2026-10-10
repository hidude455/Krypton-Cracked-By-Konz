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

/*
 * Renamed from dev.krypton.9f
 */
public class _9f_0
extends Enum {
    public static final _9f_0 Spotify;
    public static final _9f_0 SoundCloud;
    private static final _9f_0[] cfr_renamed_8;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9f_0() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(7309861877988873957L, 5895736951646456374L, MethodHandles.lookup().lookupClass()).a(158328136663391L);
        long l2 = a ^ 0x4ABA3A3CD1C9L;
        b = new Object[12];
        c = new String[12];
        _9f_0.a();
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
        String string = "\u0085K\u00ffo\u008cM\u0092\u00f9\u0010\u00c8\u00e8\u008f\u00fc\u00a2\u0097J\u001b\u0001\u00d2\u0087m\u00c64-\u00d1";
        int n2 = "\u0085K\u00ffo\u008cM\u0092\u00f9\u0010\u00c8\u00e8\u008f\u00fc\u00a2\u0097J\u001b\u0001\u00d2\u0087m\u00c64-\u00d1".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _9f_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Spotify = new _9f_0(stringArray[0], 0);
                SoundCloud = new _9f_0(stringArray[1], 1);
                cfr_renamed_8 = _9f_0.a("S", -8447407069650491990L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _9f_0[] values() {
        long l2 = a ^ 0x581542D0CC7BL;
        return (_9f_0[])((Enum)((Object)_9f_0.a("\u00ba", -7532841350400580761L, (long)l2))).clone();
    }

    public static _9f_0 valueOf(String string) {
        long l2 = a ^ 0x568D3C96EAF0L;
        return (_9f_0)((Object)_9f_0.a("S", _9f_0.class, (Object)string, -5620967148507807851L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9f_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9f_0.b(classArray[j], string, clazz2);
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
            int n = _9f_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9f_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9f_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9f_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9f_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9f_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9f_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9f_0.a(clazz3, string2, clazz2)) != null) {
                    _9f_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9f_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9f_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9f_0.b(438553180220218L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9f_0.a(l2, l3);
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
                clazz3 = _9f_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9f_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9f_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9f_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9f_0.b(438553180220218L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9f_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9f_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9f_0.b(438553180220218L, 0L);
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
            if (c == 'T' || c == 'd' || c == '\u00ba' || c == 'C') {
                field = _9f_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9f_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9f_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9f" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 18;
            case 1 -> 37;
            case 2 -> 9;
            case 3 -> 60;
            case 4 -> 39;
            case 5 -> 50;
            case 6 -> 6;
            case 7 -> 23;
            case 8 -> 52;
            case 9 -> 0;
            case 10 -> 8;
            case 11 -> 19;
            case 12 -> 17;
            case 13 -> 21;
            case 14 -> 26;
            case 15 -> 22;
            case 16 -> 51;
            case 17 -> 56;
            case 18 -> 35;
            case 19 -> 29;
            case 20 -> 45;
            case 21 -> 25;
            case 22 -> 27;
            case 23 -> 53;
            case 24 -> 59;
            case 25 -> 3;
            case 26 -> 57;
            case 27 -> 41;
            case 28 -> 28;
            case 29 -> 47;
            case 30 -> 12;
            case 31 -> 7;
            case 32 -> 31;
            case 33 -> 40;
            case 34 -> 30;
            case 35 -> 44;
            case 36 -> 38;
            case 37 -> 54;
            case 38 -> 49;
            case 39 -> 48;
            case 40 -> 20;
            case 41 -> 10;
            case 42 -> 42;
            case 43 -> 1;
            case 44 -> 63;
            case 45 -> 4;
            case 46 -> 14;
            case 47 -> 33;
            case 48 -> 16;
            case 49 -> 58;
            case 50 -> 2;
            case 51 -> 32;
            case 52 -> 55;
            case 53 -> 46;
            case 54 -> 34;
            case 55 -> 36;
            case 56 -> 43;
            case 57 -> 15;
            case 58 -> 61;
            case 59 -> 11;
            case 60 -> 13;
            case 61 -> 62;
            case 62 -> 5;
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
        _9f_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = ".`\u0016)9I3u\u0014h<\u0015sc";
        objectArray[1] = "\u00022%3AV2\f8&C\u00177Px0\f";
        objectArray[2] = "h#@{@BX\u001d]nB\u0003]A\u001dx\r";
        objectArray[3] = "8_1#2@3P lYB'S";
        objectArray[4] = "6G}$N\u0004=Hlk#\u0004=Ux";
        objectArray[5] = "G8*qxIL7;>\u0005Q_02w";
        objectArray[6] = "E|>\u000b\u0004bNs/DelEx+\u001e";
        objectArray[7] = "\nX6R\"W[Tm.}h\f\\0J(\u000bYYaGG";
        objectArray[8] = "}w_\b!',{\u0004t\u001f`&7Y\u001a5\u0018}w_\b!',{\u0004";
        objectArray[9] = "!IZ~\u000eCfV\u0006?iXrC\u0019n.H\u001b\u001d\u001b?\n\\'C\u00168\r& E\u0005i\nA\"M\r>i\u001cu\u0019\u0019d\f[jEX\u0003";
        objectArray[10] = "\u001b\u0003X\u0000EtJ\u000f\u0003|{,ZYS7D,ZS?@\u001c,[Z\u0000\u0011\u0010w";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "`\u0017\u0017/Ca1\u001bLS\u001b^f\u0013\u00117I=3\u0016@:";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _9f_0[] cfr_renamed_3() {
        long l2 = a ^ 0x22EA0B2A7AAL;
        return new _9f_0[]{_9f_0.a("\u00ba", -241934372650087167L, (long)l2), _9f_0.a("\u00ba", -241836043510813983L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9f_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

