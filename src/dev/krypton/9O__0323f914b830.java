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
 * Renamed from dev.krypton.9O
 */
public class _9o_0
extends Enum {
    public static final _9o_0 WANDERING_TRADER;
    public static final _9o_0 VILLAGER;
    public static final _9o_0 ZOMBIE_VILLAGER;
    public static final _9o_0 LLAMA;
    public static final _9o_0 PILLAGER;
    private static final _9o_0[] cfr_renamed_1;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static _9o_0[] values() {
        long l2 = a ^ 0x742E82854126L;
        return (_9o_0[])((Enum)((Object)_9o_0.a("\u00e2", -6154458678841484063L, (long)l2))).clone();
    }

    public static _9o_0 valueOf(String string) {
        long l2 = a ^ 0x7D02B0CD0CCEL;
        return (_9o_0)((Object)_9o_0.a("\u00c9", _9o_0.class, (Object)string, -1765630211208559788L, (long)l2));
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9o_0() {
        void cfr_renamed_27;
        void cfr_renamed_28;
    }

    private static _9o_0[] cfr_renamed_2() {
        long l2 = a ^ 0xD74ADE11BCEL;
        return new _9o_0[]{_9o_0.a("\u00e2", -1117169361611554933L, (long)l2), _9o_0.a("\u00e2", -1117214794991754562L, (long)l2), _9o_0.a("\u00e2", -1117341401973482227L, (long)l2), _9o_0.a("\u00e2", -1117397354582125090L, (long)l2), _9o_0.a("\u00e2", -1116972471420269479L, (long)l2)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _9o_0.a = l.a(-5994774910150178954L, -2246073600817229695L, MethodHandles.lookup().lookupClass()).a(162449465605333L);
                var9 = _9o_0.a ^ 105465772311034L;
                _9o_0.b = new Object[15];
                _9o_0.c = new String[15];
                _9o_0.a();
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
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "\u0098\u0082\u0099?\u0088\u0012?\u0012\u00e1\u008e\b\u00029\u00eeJ\u00b6\u0010\u00ef\u000b.\u009f\u00c9J0$7\u0016\u00bd\u00ff}\u00e2\u00b7\u0097\b\u0016l\u0013\u00d3\u008e\u0088\u00f4\u00fa";
                var7_6 = "\u0098\u0082\u0099?\u0088\u0012?\u0012\u00e1\u008e\b\u00029\u00eeJ\u00b6\u0010\u00ef\u000b.\u009f\u00c9J0$7\u0016\u00bd\u00ff}\u00e2\u00b7\u0097\b\u0016l\u0013\u00d3\u008e\u0088\u00f4\u00fa".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = _9o_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "TA\u00f2\u0002\u0011\u00e1\u00c0\u00df\u007f\u00e1\u00fa\u00d5\u00e6L\u007f\u00f9\u0018\u0090\u00be\u00c2G\u0095\u0080\u00d0\u008aI\u00cb\u00aaF\u00bb\u00b4\u00abz\bW\u00a7\u007f\u00a1\u0013[|";
                    var7_6 = "TA\u00f2\u0002\u0011\u00e1\u00c0\u00df\u007f\u00e1\u00fa\u00d5\u00e6L\u007f\u00f9\u0018\u0090\u00be\u00c2G\u0095\u0080\u00d0\u008aI\u00cb\u00aaF\u00bb\u00b4\u00abz\bW\u00a7\u007f\u00a1\u0013[|".length();
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
                    var0_3[var6_4++] = _9o_0.a(var8_9).intern();
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
        _9o_0.WANDERING_TRADER = new _9o_0(var0_3[4], 0);
        _9o_0.VILLAGER = new _9o_0(var0_3[0], 1);
        _9o_0.ZOMBIE_VILLAGER = new _9o_0(var0_3[1], 2);
        _9o_0.LLAMA = new _9o_0(var0_3[2], 3);
        _9o_0.PILLAGER = new _9o_0(var0_3[3], 4);
        _9o_0.cfr_renamed_1 = _9o_0.a("\u00c9", (long)-1564538629895096164L, (long)var9);
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
            case 1 -> 27;
            case 2 -> 48;
            case 3 -> 60;
            case 4 -> 40;
            case 5 -> 9;
            case 6 -> 43;
            case 7 -> 55;
            case 8 -> 19;
            case 9 -> 34;
            case 10 -> 11;
            case 11 -> 42;
            case 12 -> 32;
            case 13 -> 22;
            case 14 -> 51;
            case 15 -> 41;
            case 16 -> 31;
            case 17 -> 38;
            case 18 -> 13;
            case 19 -> 50;
            case 20 -> 62;
            case 21 -> 35;
            case 22 -> 46;
            case 23 -> 45;
            case 24 -> 6;
            case 25 -> 8;
            case 26 -> 25;
            case 27 -> 56;
            case 28 -> 23;
            case 29 -> 14;
            case 30 -> 4;
            case 31 -> 39;
            case 32 -> 10;
            case 33 -> 49;
            case 34 -> 63;
            case 35 -> 5;
            case 36 -> 3;
            case 37 -> 30;
            case 38 -> 0;
            case 39 -> 16;
            case 40 -> 26;
            case 41 -> 47;
            case 42 -> 53;
            case 43 -> 54;
            case 44 -> 21;
            case 45 -> 12;
            case 46 -> 24;
            case 47 -> 44;
            case 48 -> 1;
            case 49 -> 61;
            case 50 -> 59;
            case 51 -> 33;
            case 52 -> 29;
            case 53 -> 37;
            case 54 -> 58;
            case 55 -> 20;
            case 56 -> 7;
            case 57 -> 28;
            case 58 -> 57;
            case 59 -> 52;
            case 60 -> 36;
            case 61 -> 15;
            case 62 -> 17;
            default -> 2;
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
        _9o_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "a)kR\u0018dj&z\u001dsf~%";
        objectArray[1] = "\u001dS:33>\u0016\\+|^>\u0016A?";
        objectArray[2] = "?8\u0003;$`47\u0012tYx'0\u001b=";
        objectArray[3] = "\t4at[!\u0014!c5^}T\u001e";
        objectArray[4] = "/lQ@\u0019N\u001fRLU\u001b\u000f\u001a\u000e\fjT";
        objectArray[5] = "c%\u0014!iWS\u001b\t4k\u0016VGI\u000b$";
        objectArray[6] = "H,\u0012}\u0002\u0011C#\u00032c\u001fH(\u0007h";
        objectArray[7] = ".z#=\u0018j,a5&b/\u0014(%?Xm.od|\u0003\u0011";
        objectArray[8] = "J`pXi\u0001H{fC\u0013>4@Hm\u0013@\u0019tq^hB\u0002bj";
        objectArray[9] = "u*\u001fW^0w1\tL$\u0019\b\u0006(ji\u001c\u0011\u0002&om\u0004\u0002\u0019b\u0011M639\u0019\u0013V (";
        objectArray[10] = "32`\u007f2:1)vdHp\t`f}r=3''>)";
        objectArray[11] = "|](q{U~F>j\u0001p\u0007p\u0011DNc\u001c4od|R<Om\u007fjI";
        objectArray[12] = "c+ww\u001e7a0ald\u0013\u0010\u0004FF>\r\u001f\r]W>\u0005\u0015\u000fP\u000b^%$>pp\\>2%";
        objectArray[13] = "g/.{Vomot\u0018L{i+s_\\\u0012pjxfHj1n\"\u0018\u000b|l/t|Xb32\u001erK\"n2cx\u000bx\r";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\u00152p-K\u0015\u0017)f616n\u001fI\u0018~#u[78L\u0012U 5#Z\t";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9o_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9o_0.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _9o_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9o_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9o_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9o_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9o_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9o_0.a(clazz3, string2, clazz2)) != null) {
                    _9o_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9o_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9o_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9o_0.b(473615494852915L, 0L);
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
        Method method = _9o_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9o_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _9o_0.a(l2, l3);
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
                clazz3 = _9o_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9o_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9o_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9o_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9o_0.b(473615494852915L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9o_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9o_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9o_0.b(473615494852915L, 0L);
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
            if (c == 'A' || c == '\u00d2' || c == '\u00e2' || c == '\u00fc') {
                field = _9o_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'A' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9o_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9o_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

