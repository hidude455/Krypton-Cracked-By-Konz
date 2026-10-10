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
 * Renamed from dev.krypton.4o
 */
public class _4o_0
extends Enum {
    public static final _4o_0 Tpa;
    public static final _4o_0 Tpahere;
    private final String cfr_renamed_5;
    private static final _4o_0[] cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _4o_0() {
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
                _4o_0.a = l.a(9124443937639067370L, 8625338387930489494L, MethodHandles.lookup().lookupClass()).a(7513652197147L);
                var9 = _4o_0.a ^ 30531620373349L;
                _4o_0.b = new Object[13];
                _4o_0.c = new String[13];
                _4o_0.a();
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
                var5_5 = "\u001b[\u00dd\u00e5\u0097\u0019bq\b\u00e7\u00f1\u00b0\u0093U\tc'";
                var7_6 = "\u001b[\u00dd\u00e5\u0097\u0019bq\b\u00e7\u00f1\u00b0\u0093U\tc'".length();
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
                    var0_3[var6_4++] = _4o_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u008e\t\u00b4\u00c6\u00f6\u00d1[\u00ed\u001f\r\u00c3}x<\u00ef\u00f4\b\u001b[\u00dd\u00e5\u0097\u0019bq";
                    var7_6 = "\u008e\t\u00b4\u00c6\u00f6\u00d1[\u00ed\u001f\r\u00c3}x<\u00ef\u00f4\b\u001b[\u00dd\u00e5\u0097\u0019bq".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = _4o_0.a(var8_9).intern();
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
        _4o_0.Tpa = new _4o_0(var0_3[3], 0, var0_3[0]);
        _4o_0.Tpahere = new _4o_0(var0_3[1], 1, var0_3[2]);
        _4o_0.cfr_renamed_4 = _4o_0.a("\u00a3", (long)-8446173680915632112L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x4BF1BFC851AEL;
        return _4o_0.a("\u00f2", (Object)((Object)this), -2881223413083579500L, (long)l2);
    }

    public static _4o_0[] values() {
        long l2 = a ^ 0x4FBC91174BB7L;
        return (_4o_0[])((Enum)((Object)_4o_0.a("V", -4460247599837064760L, (long)l2))).clone();
    }

    public static _4o_0 valueOf(String string) {
        long l2 = a ^ 0x4D40CCE7CF2L;
        return (_4o_0)((Object)_4o_0.a("\u00a3", _4o_0.class, (Object)string, -765638793357264491L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4o_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4o_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4o_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4o_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4o_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4o_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4o_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4o_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4o_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4o_0.a(clazz3, string2, clazz2)) != null) {
                    _4o_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4o_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4o_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4o_0.b(428101541342817L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4o_0.a(l2, l3);
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
                clazz3 = _4o_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4o_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4o_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4o_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4o_0.b(428101541342817L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4o_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4o_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4o_0.b(428101541342817L, 0L);
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
            throw new RuntimeException("dev/krypton/4o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == '\u00df' || c == 'V' || c == '\u00c2') {
                field = _4o_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4o_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'j' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4o_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 26;
            case 1 -> 9;
            case 2 -> 16;
            case 3 -> 29;
            case 4 -> 4;
            case 5 -> 40;
            case 6 -> 43;
            case 7 -> 56;
            case 8 -> 1;
            case 9 -> 13;
            case 10 -> 55;
            case 11 -> 10;
            case 12 -> 53;
            case 13 -> 12;
            case 14 -> 19;
            case 15 -> 50;
            case 16 -> 58;
            case 17 -> 41;
            case 18 -> 31;
            case 19 -> 3;
            case 20 -> 5;
            case 21 -> 51;
            case 22 -> 24;
            case 23 -> 62;
            case 24 -> 35;
            case 25 -> 49;
            case 26 -> 30;
            case 27 -> 32;
            case 28 -> 7;
            case 29 -> 23;
            case 30 -> 21;
            case 31 -> 52;
            case 32 -> 48;
            case 33 -> 37;
            case 34 -> 46;
            case 35 -> 20;
            case 36 -> 38;
            case 37 -> 18;
            case 38 -> 63;
            case 39 -> 28;
            case 40 -> 14;
            case 41 -> 27;
            case 42 -> 0;
            case 43 -> 22;
            case 44 -> 25;
            case 45 -> 33;
            case 46 -> 17;
            case 47 -> 57;
            case 48 -> 2;
            case 49 -> 36;
            case 50 -> 39;
            case 51 -> 15;
            case 52 -> 42;
            case 53 -> 54;
            case 54 -> 59;
            case 55 -> 45;
            case 56 -> 11;
            case 57 -> 44;
            case 58 -> 60;
            case 59 -> 8;
            case 60 -> 61;
            case 61 -> 34;
            case 62 -> 6;
            default -> 47;
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
        _4o_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "cm5\u000ba\u007f~x7Jd#3g";
        objectArray[1] = "Ds-AnuO|<\u000e\u0013m\\{5G";
        objectArray[2] = "Ry\\$\u0012`YvMkybMu";
        objectArray[3] = "Z\u001eI\u0006bWQ\u0011XI\u000fWQ\fL";
        objectArray[4] = "\u0002$3 \r\r2\u001a.5\u000fL7Fc*@";
        objectArray[5] = ">\u001a\u00192\u000fV\u000e$\u0004'\r\u0017\u000bxI8B";
        objectArray[6] = "llkl\u0019Pgcz#x^lh~y";
        objectArray[7] = "GJP2\u001aX\u0017\u0019P\r)I\u0013\u0016Tw\u00181GJP2\u001aX\u0017\u0019P";
        objectArray[8] = "\u0002\u0013F=E\u0010R@F\u0002v\u0001V/\u0012>CFPFBmC";
        objectArray[9] = "O)l\bwX\u001fzl7 1N/d\b&R\u0016\u007f:E";
        objectArray[10] = "\u0003\u0000.W\u001efSS.hH\u000fB\u0004z\u0005\u0011k\u0006[ ";
        objectArray[11] = "b\u0000#<\u001bb=Q{<dm2\u000b:h#}[U*{\u001c~\"\r|w\u000f\u0013'Wzh\u0004wc\b \u0005]|?V8t\u0002-gVG";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "9=\\2?\\in\\\rk58;T2nV`k\n\u007fP";
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

    private static _4o_0[] cfr_renamed_6() {
        long l2 = a ^ 0x3F756CBFBFAEL;
        return new _4o_0[]{_4o_0.a("V", 3892010951932566951L, (long)l2), _4o_0.a("V", 3891360604964074053L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

