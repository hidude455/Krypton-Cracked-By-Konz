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
 * Renamed from dev.krypton.6q
 */
public class _6q_0
extends Enum {
    public static final _6q_0 Automatic;
    public static final _6q_0 Manual;
    private static final _6q_0[] cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _6q_0() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-5381410769059959318L, -7902608016326555064L, MethodHandles.lookup().lookupClass()).a(182692486694791L);
        long l2 = a ^ 0x3E4893EFD848L;
        b = new Object[12];
        c = new String[12];
        _6q_0.a();
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
        String string = "\u001c\u001eeS\u00b5=Y\u00aa\u009aQx\u0018]L\u00f4\t\b\u00d7\u008b\u00ac'\"B-\u0082";
        int n2 = "\u001c\u001eeS\u00b5=Y\u00aa\u009aQx\u0018]L\u00f4\t\b\u00d7\u008b\u00ac'\"B-\u0082".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _6q_0.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Automatic = new _6q_0(stringArray[0], 0);
                Manual = new _6q_0(stringArray[1], 1);
                cfr_renamed_4 = _6q_0.a("T", 7807884380051434883L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _6q_0[] values() {
        long l2 = a ^ 0x7C2E6D6A9F5FL;
        return (_6q_0[])((Enum)((Object)_6q_0.a("a", 3120969628501321622L, (long)l2))).clone();
    }

    public static _6q_0 valueOf(String string) {
        long l2 = a ^ 0x2C0C6FF0D8D7L;
        return (_6q_0)((Object)_6q_0.a("T", _6q_0.class, (Object)string, 7837602778569065687L, (long)l2));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _6q_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6q_0.b(classArray[j], string, clazz2);
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
            int n = _6q_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _6q_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6q_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6q_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _6q_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _6q_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6q_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6q_0.a(clazz3, string2, clazz2)) != null) {
                    _6q_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6q_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6q_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6q_0.b(427019962924513L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _6q_0.a(l2, l3);
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
                clazz3 = _6q_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6q_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6q_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6q_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6q_0.b(427019962924513L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6q_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6q_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6q_0.b(427019962924513L, 0L);
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
            if (c == '\u00e4' || c == '\u00d1' || c == 'a' || c == 'h') {
                field = _6q_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6q_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6q_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6q" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 53;
            case 1 -> 1;
            case 2 -> 63;
            case 3 -> 44;
            case 4 -> 55;
            case 5 -> 46;
            case 6 -> 28;
            case 7 -> 43;
            case 8 -> 20;
            case 9 -> 62;
            case 10 -> 56;
            case 11 -> 30;
            case 12 -> 12;
            case 13 -> 3;
            case 14 -> 11;
            case 15 -> 0;
            case 16 -> 9;
            case 17 -> 42;
            case 18 -> 19;
            case 19 -> 10;
            case 20 -> 51;
            case 21 -> 52;
            case 22 -> 48;
            case 23 -> 49;
            case 24 -> 47;
            case 25 -> 40;
            case 26 -> 8;
            case 27 -> 38;
            case 28 -> 25;
            case 29 -> 17;
            case 30 -> 18;
            case 31 -> 50;
            case 32 -> 35;
            case 33 -> 31;
            case 34 -> 29;
            case 35 -> 60;
            case 36 -> 26;
            case 37 -> 32;
            case 38 -> 61;
            case 39 -> 34;
            case 40 -> 36;
            case 41 -> 39;
            case 42 -> 6;
            case 43 -> 4;
            case 44 -> 13;
            case 45 -> 59;
            case 46 -> 14;
            case 47 -> 45;
            case 48 -> 7;
            case 49 -> 54;
            case 50 -> 58;
            case 51 -> 33;
            case 52 -> 24;
            case 53 -> 41;
            case 54 -> 22;
            case 55 -> 15;
            case 56 -> 5;
            case 57 -> 2;
            case 58 -> 16;
            case 59 -> 37;
            case 60 -> 21;
            case 61 -> 23;
            case 62 -> 27;
            default -> 57;
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
        _6q_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "[\u0014\u0001B\u0005ZF\u0001\u0003\u0003\u0000\u0006\t\u0000";
        objectArray[1] = "^pKkZ}nNV~X<k\u0012\u0019\u007f\u0017";
        objectArray[2] = "Yb\u000f\b2\fi\\\u0012\u001d0Ml\u0000]\u001c\u007f";
        objectArray[3] = "Qx\u001a@cbZw\u000b\u000f\b`Nt";
        objectArray[4] = "el4_tNnc%\u0010\u0019Nn~1";
        objectArray[5] = "\u001b\u0007?bk\u0000\u0010\b.-\u0016\u0018\u0003\u000f'd";
        objectArray[6] = "\u00067|Nr.\r8m\u0001\u0013 \u00063i[";
        objectArray[7] = "9\u000eC)\u001eRo\u0018GQH??QX)\u0012O?\u0006C#";
        objectArray[8] = "T\u0002)\t\u001fO\u0002\u0014-q4K\u000e\u0019&\u0015q\u001e\u000e\u00027\u001f\u001cH\u0018\u0006";
        objectArray[9] = "`\u001fo}\u0016\"6\tk\u0005EOf@t}\u001a?f\u0017owx";
        objectArray[10] = "9_\u001d\f|.}\\\u0010\u0017\u001d j^\u0001\u0004Z0\u0003\u0000\fWw<|J\u0006Sx^8X\u0003Xf?f\u000b\u001b\u0007\u001ddf[\u0019\bm eV\u0002i";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\fylf>PZoh\u001e\u0019@Lxow,\\[\u001f6x6E^r`n2";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _6q_0[] cfr_renamed_8() {
        long l2 = a ^ 0x74E3505D134AL;
        return new _6q_0[]{_6q_0.a("a", -6387861284521682559L, (long)l2), _6q_0.a("a", -6388043858706654858L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6q_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

