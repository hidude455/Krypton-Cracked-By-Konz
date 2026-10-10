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

public class _8F
extends Enum {
    public static final _8F Spawner;
    public static final _8F Order;
    private static final _8F[] cfr_renamed_1;
    private static int cfr_renamed_6;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _8F() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-1638098213513598081L, -211881840846584290L, MethodHandles.lookup().lookupClass()).a(101154079024876L);
        long l2 = a ^ 0x4490945B4322L;
        b = new Object[12];
        c = new String[12];
        _8F.a();
        if (_8F.cfr_renamed_7() == 0) {
            _8F.cfr_renamed_1(121);
        }
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
        String string = "\u00a5b\u00c4\u008btXwc\b\u00a6\u0088\u0002\u00a6\u00a2M\u008c\u009c";
        int n2 = "\u00a5b\u00c4\u008btXwc\b\u00a6\u0088\u0002\u00a6\u00a2M\u008c\u009c".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _8F.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                Spawner = new _8F(stringArray[1], 0);
                Order = new _8F(stringArray[0], 1);
                cfr_renamed_1 = _8F.a("\u00c1", -5883867190347511150L, (long)l2);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static _8F[] values() {
        long l2 = a ^ 0x3F0081D30629L;
        return (_8F[])((Enum)((Object)_8F.a("\u00c6", -1489590761632188104L, (long)l2))).clone();
    }

    public static _8F valueOf(String string) {
        long l2 = a ^ 0x320CAA341F5EL;
        return (_8F)((Object)_8F.a("\u00c1", _8F.class, (Object)string, -998487615540567607L, (long)l2));
    }

    public static void cfr_renamed_1(int n) {
        cfr_renamed_6 = n;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8F.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8F.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8F.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8F.b(classArray[j], string, clazz2);
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
            int n = _8F.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8F.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _8F.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8F.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8F.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8F.a(clazz3, string2, clazz2)) != null) {
                    _8F.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8F.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8F.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8F.b(480076370206576L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8F.a(l2, l3);
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
                clazz3 = _8F.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8F.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8F.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8F.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8F.b(480076370206576L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8F.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8F.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8F.b(480076370206576L, 0L);
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
            if (c == '\u00ed' || c == '\u00e1' || c == '\u00c6' || c == '\u00e5') {
                field = _8F.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8F.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8F" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = _8F.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 5;
            case 1 -> 26;
            case 2 -> 42;
            case 3 -> 48;
            case 4 -> 49;
            case 5 -> 44;
            case 6 -> 25;
            case 7 -> 56;
            case 8 -> 11;
            case 9 -> 53;
            case 10 -> 36;
            case 11 -> 59;
            case 12 -> 60;
            case 13 -> 19;
            case 14 -> 31;
            case 15 -> 13;
            case 16 -> 9;
            case 17 -> 29;
            case 18 -> 27;
            case 19 -> 57;
            case 20 -> 32;
            case 21 -> 52;
            case 22 -> 7;
            case 23 -> 10;
            case 24 -> 62;
            case 25 -> 55;
            case 26 -> 23;
            case 27 -> 21;
            case 28 -> 14;
            case 29 -> 16;
            case 30 -> 6;
            case 31 -> 15;
            case 32 -> 24;
            case 33 -> 41;
            case 34 -> 20;
            case 35 -> 40;
            case 36 -> 17;
            case 37 -> 35;
            case 38 -> 8;
            case 39 -> 4;
            case 40 -> 18;
            case 41 -> 39;
            case 42 -> 37;
            case 43 -> 1;
            case 44 -> 43;
            case 45 -> 54;
            case 46 -> 50;
            case 47 -> 33;
            case 48 -> 47;
            case 49 -> 0;
            case 50 -> 30;
            case 51 -> 3;
            case 52 -> 34;
            case 53 -> 28;
            case 54 -> 2;
            case 55 -> 12;
            case 56 -> 22;
            case 57 -> 46;
            case 58 -> 58;
            case 59 -> 45;
            case 60 -> 63;
            case 61 -> 51;
            case 62 -> 38;
            default -> 61;
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
        _8F.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\b\u001e\u0003d\u0003n\u0015\u000b\u0001%\u00062T=";
        objectArray[1] = "20\">^a\u0002\u000e?+\\ \u0007R~\u001d\u0013";
        objectArray[2] = "xEfBn1H{{WlpM':a#";
        objectArray[3] = "QSJ\u000b\u0005qZ\\[DnsN_";
        objectArray[4] = "IkfV\u0017eBdw\u0019zeByc";
        objectArray[5] = "wm=fT\u0004|b,))\u001coe%`";
        objectArray[6] = "40@4&V??Q{GX44U!";
        objectArray[7] = "\u0001\u0003Z\u0018\t9^\u0001B}t=PV[}\u000e\u007fG^\u001b\u0003Q}_";
        objectArray[8] = "\u001b\n-\u0017\u00106D\b5rq0OM0\u001fPH\u001b\n-\u0017\u00106D\b5";
        objectArray[9] = "\u0007W\u0010&q4XU\bCpJ\u0003\u000f\f.)wD\u0013W!K";
        objectArray[10] = "\u0005j0kO4Zh(\u000eDJ\u00012,c\u0017wF.wl";
        Object[] objectArray2 = objectArray;
        objectArray[11] = " V\u0006\u001f^Z!\u0015E\reCs\u000eG\u000b\"S\u001aPD\u001b_^b\u0012]\u0005\u0017=!\u000bH\u0004\u001b]z\u000fK\u001ae\u0007&VC]\u0002\u0006e\u0015Qf";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _8F[] cfr_renamed_6() {
        long l2 = a ^ 0x467F09D40D35L;
        return new _8F[]{_8F.a("\u00c6", -2283544737229878979L, (long)l2), _8F.a("\u00c6", -2284204227962238042L, (long)l2)};
    }

    public static int cfr_renamed_7() {
        return cfr_renamed_6;
    }

    public static int cfr_renamed_8() {
        int n = _8F.cfr_renamed_7();
        if (n == 0) {
            return 98;
        }
        return 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8F.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

