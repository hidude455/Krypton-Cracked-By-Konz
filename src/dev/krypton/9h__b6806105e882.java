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
 * Renamed from dev.krypton.9h
 */
public class _9h_0
extends Enum {
    public static final _9h_0 Sell;
    public static final _9h_0 Order;
    private final String cfr_renamed_5;
    private static final _9h_0[] cfr_renamed_6;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9h_0() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_5 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _9h_0.a = l.a(151992803048146332L, 8628322345912652317L, MethodHandles.lookup().lookupClass()).a(165942372265047L);
                var9 = _9h_0.a ^ 67119263528720L;
                _9h_0.b = new Object[13];
                _9h_0.c = new String[13];
                _9h_0.a();
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "\u0096V.(\u000e,\u0011S\bn\u00c3\u0094_m\u0010\u0000\u00cd";
                var7_6 = "\u0096V.(\u000e,\u0011S\bn\u00c3\u0094_m\u0010\u0000\u00cd".length();
                var4_7 = 8;
                var3_8 = -1;
lbl22:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _9h_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "n\u00c3\u0094_m\u0010\u0000\u00cd\b\u0096V.(\u000e,\u0011S";
                    var7_6 = "n\u00c3\u0094_m\u0010\u0000\u00cd\b\u0096V.(\u000e,\u0011S".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl36:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = _9h_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        _9h_0.Sell = new _9h_0(var0_3[1], 0, var0_3[2]);
        _9h_0.Order = new _9h_0(var0_3[3], 1, var0_3[0]);
        _9h_0.cfr_renamed_6 = _9h_0.a("\u00c2", (long)-7396473090166843412L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x4EFA92AE3146L;
        return _9h_0.a("\u00d5", (Object)((Object)this), -6985888778780321169L, (long)l2);
    }

    public static _9h_0[] values() {
        long l2 = a ^ 0x19A123407A02L;
        return (_9h_0[])((Enum)((Object)_9h_0.a("\u00ff", -3149222185809555084L, (long)l2))).clone();
    }

    public static _9h_0 valueOf(String string) {
        long l2 = a ^ 0x560A9D80872BL;
        return (_9h_0)((Object)_9h_0.a("\u00c2", _9h_0.class, (Object)string, 2981925024446356871L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9h_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9h_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9h_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9h_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9h_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9h_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9h_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9h_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9h_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9h_0.a(clazz3, string2, clazz2)) != null) {
                    _9h_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9h_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9h_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9h_0.b(435638840480342L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9h_0.a(l2, l3);
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
                clazz3 = _9h_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9h_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9h_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9h_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9h_0.b(435638840480342L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9h_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9h_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9h_0.b(435638840480342L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == '\u00ce' || c == '\u00ff' || c == '\u00dd') {
                field = _9h_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9h_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9h_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 29;
            case 1 -> 17;
            case 2 -> 57;
            case 3 -> 10;
            case 4 -> 0;
            case 5 -> 41;
            case 6 -> 21;
            case 7 -> 61;
            case 8 -> 13;
            case 9 -> 54;
            case 10 -> 33;
            case 11 -> 36;
            case 12 -> 4;
            case 13 -> 11;
            case 14 -> 19;
            case 15 -> 5;
            case 16 -> 37;
            case 17 -> 20;
            case 18 -> 58;
            case 19 -> 35;
            case 20 -> 12;
            case 21 -> 48;
            case 22 -> 14;
            case 23 -> 32;
            case 24 -> 26;
            case 25 -> 62;
            case 26 -> 49;
            case 27 -> 39;
            case 28 -> 3;
            case 29 -> 53;
            case 30 -> 2;
            case 31 -> 25;
            case 32 -> 6;
            case 33 -> 42;
            case 34 -> 52;
            case 35 -> 43;
            case 36 -> 34;
            case 37 -> 50;
            case 38 -> 63;
            case 39 -> 30;
            case 40 -> 1;
            case 41 -> 45;
            case 42 -> 16;
            case 43 -> 47;
            case 44 -> 44;
            case 45 -> 23;
            case 46 -> 55;
            case 47 -> 8;
            case 48 -> 56;
            case 49 -> 31;
            case 50 -> 15;
            case 51 -> 60;
            case 52 -> 7;
            case 53 -> 59;
            case 54 -> 27;
            case 55 -> 24;
            case 56 -> 46;
            case 57 -> 9;
            case 58 -> 22;
            case 59 -> 28;
            case 60 -> 18;
            case 61 -> 51;
            case 62 -> 40;
            default -> 38;
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
        _9h_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "D)qb-+Y<s#(w\u0019$";
        objectArray[1] = "\u007fQ$L#yOo9Y!8J3yAn";
        objectArray[2] = "g\\):6\u0014lS8u]\u0016xP";
        objectArray[3] = "<7zD@\t78k\u000b-\t7%\u007f";
        objectArray[4] = "\u0013X\"d\rI\u0018W3+pQ\u000bP:b";
        objectArray[5] = "\u0002z#mj\u000b2D>xhJ7\u0018~`'";
        objectArray[6] = "1W\u0011OWG:X\u0000\u00006I1S\u0004Z";
        objectArray[7] = "`P3\u0018\b_w\u0016NCz\u0015yQ2\u0014FMv\u0014 ";
        objectArray[8] = "\u000e^\u001aKbV\u0019\u0018g\u0014\u0010\u001c\u0017_\u001bG,D\u0018\u001a\t+";
        objectArray[9] = "\u0019SSl\u0014I\u000e\u0015.W\u000b\\\u0007hT7\u001bX\u0011\u0019Cq";
        objectArray[10] = "\b\u0001tX'\u000e\u001fG\t\u007f/\u0013\u001f@\tBn\u0002\u0012HxU(";
        objectArray[11] = "<)t\\l0u~wLR#l 5P\u00153\u0005~$^6fw}s\u0005=]>z$O8f> u[Rdhx)\u0003?-?{9=";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "x;\u0000j7]o}}3E\u0017<l\u000f`~\u0017f=\u001b";
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static _9h_0[] cfr_renamed_9() {
        long l2 = a ^ 0x50543D9401C0L;
        return new _9h_0[]{_9h_0.a("\u00ff", -5797698394460220748L, (long)l2), _9h_0.a("\u00ff", -5797664375371503186L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9h_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

