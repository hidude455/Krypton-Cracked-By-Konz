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

public class _4A
extends Enum {
    public static final _4A ALWAYS;
    public static final _4A ON_POP;
    private final String cfr_renamed_4;
    private static final _4A[] cfr_renamed_3;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4A() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_4 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4A.a = l.a(1382885674551849655L, 375833818167786577L, MethodHandles.lookup().lookupClass()).a(268426233969150L);
                var9 = _4A.a ^ 33380287012374L;
                _4A.b = new Object[13];
                _4A.c = new String[13];
                _4A.a();
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
                var5_5 = "<\u00a2\u00fe\u00e5\u000e\u0001\u009c\u0096\b\u0011xZ\u00ae\f\u00fd\u00f6\u00b9";
                var7_6 = "<\u00a2\u00fe\u00e5\u000e\u0001\u009c\u0096\b\u0011xZ\u00ae\f\u00fd\u00f6\u00b9".length();
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
                    var0_3[var6_4++] = _4A.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "ztL\u0007\u00a1\u0080\u009bP\b^\u0093>\u0093\u00df\u00f5$>";
                    var7_6 = "ztL\u0007\u00a1\u0080\u009bP\b^\u0093>\u0093\u00df\u00f5$>".length();
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
                    var0_3[var6_4++] = _4A.a(var8_9).intern();
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
        _4A.ALWAYS = new _4A(var0_3[3], 0, var0_3[1]);
        _4A.ON_POP = new _4A(var0_3[0], 1, var0_3[2]);
        _4A.cfr_renamed_3 = _4A.a("q", (long)5305911144010471109L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x52E27C3E9219L;
        return _4A.a("\u00dc", (Object)((Object)this), -8814134452672791829L, (long)l2);
    }

    public static _4A[] values() {
        long l2 = a ^ 0x53FB4A6E7015L;
        return (_4A[])((Enum)((Object)_4A.a("Y", 7467372544362187970L, (long)l2))).clone();
    }

    public static _4A valueOf(String string) {
        long l2 = a ^ 0x7A2ECD268DA5L;
        return (_4A)((Object)_4A.a("q", _4A.class, (Object)string, -7345278714294042220L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4A.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4A.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4A.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4A.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4A.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4A.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4A.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4A.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4A.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4A.a(clazz3, string2, clazz2)) != null) {
                    _4A.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4A.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4A.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4A.b(471112810476773L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4A.a(l2, l3);
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
                clazz3 = _4A.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4A.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4A.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4A.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4A.b(471112810476773L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4A.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4A.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4A.b(471112810476773L, 0L);
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
            throw new RuntimeException("dev/krypton/4A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dc' || c == 'F' || c == 'Y' || c == '\u00c3') {
                field = _4A.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4A.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4A.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 11;
            case 1 -> 26;
            case 2 -> 39;
            case 3 -> 24;
            case 4 -> 33;
            case 5 -> 4;
            case 6 -> 60;
            case 7 -> 42;
            case 8 -> 62;
            case 9 -> 56;
            case 10 -> 31;
            case 11 -> 51;
            case 12 -> 16;
            case 13 -> 40;
            case 14 -> 63;
            case 15 -> 50;
            case 16 -> 58;
            case 17 -> 45;
            case 18 -> 54;
            case 19 -> 52;
            case 20 -> 30;
            case 21 -> 48;
            case 22 -> 28;
            case 23 -> 7;
            case 24 -> 12;
            case 25 -> 25;
            case 26 -> 14;
            case 27 -> 44;
            case 28 -> 17;
            case 29 -> 46;
            case 30 -> 29;
            case 31 -> 2;
            case 32 -> 10;
            case 33 -> 9;
            case 34 -> 34;
            case 35 -> 41;
            case 36 -> 13;
            case 37 -> 1;
            case 38 -> 6;
            case 39 -> 23;
            case 40 -> 3;
            case 41 -> 55;
            case 42 -> 35;
            case 43 -> 32;
            case 44 -> 22;
            case 45 -> 19;
            case 46 -> 37;
            case 47 -> 15;
            case 48 -> 47;
            case 49 -> 27;
            case 50 -> 20;
            case 51 -> 18;
            case 52 -> 57;
            case 53 -> 43;
            case 54 -> 61;
            case 55 -> 59;
            case 56 -> 0;
            case 57 -> 38;
            case 58 -> 36;
            case 59 -> 21;
            case 60 -> 49;
            case 61 -> 8;
            case 62 -> 53;
            default -> 5;
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
        _4A.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\bv\u0012HH\u0000\u0015c\u0010\tM\\XR";
        objectArray[1] = ",`5O\u001dm\u001c^(Z\u001f,\u0019\u0002ekP";
        objectArray[2] = "\u0005\u0019|U\u007f_\u000e\u0016m\u001a\u0002G\u001d\u0011dS";
        objectArray[3] = "\u000e$v]>\r>\u001akH<L;F&ys";
        objectArray[4] = "#Qu)b*(^df\t(<]";
        objectArray[5] = "bu\u001aZq\\iz\u000b\u0015\u001c\\ig\u001f";
        objectArray[6] = "\u0005\u0016+_g)\u000e\u0019:\u0010\u0006'\u0005\u0012>J";
        objectArray[7] = "^)@Y\u007f'O'\\)H\fb_`r\u0001+\u0002gAWn:\f{";
        objectArray[8] = "z\u000b\u000f\u0018aEk\u0005\u0013h%*#\u0005N\u000ef@!_A\u0017";
        objectArray[9] = "*q|%W/;\u007f`U\u0016@s\u007f=3P*q%2*)";
        objectArray[10] = ";iJ{\u001eI*gV\u000bX&a*C6\u001a\u001a<&\u00035";
        objectArray[11] = "fx$\u001cN%wv8lw\fR\u001f\u001240):6%\u0012_84*";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "\u000f$D9n8Ee\\'\f\"]p\\&K24/_vh`HhK$t\\\rhYvv`Pd\u0019u\fg\u0004qS)h-EiMK";
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

    private static _4A[] cfr_renamed_9() {
        long l2 = a ^ 0x2EDA6B13C86L;
        return new _4A[]{_4A.a("Y", 3112517921193065686L, (long)l2), _4A.a("Y", 3112770936474144356L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4A.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

