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

public class _9T
extends Enum {
    public static final _9T ALWAYS;
    public static final _9T ON_POP;
    private final String cfr_renamed_0;
    private static final _9T[] cfr_renamed_5;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _9T() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_0 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _9T.a = l.a(-6083352282328458810L, -6117545212692095595L, MethodHandles.lookup().lookupClass()).a(40616690796911L);
                var9 = _9T.a ^ 59985313802783L;
                _9T.b = new Object[13];
                _9T.c = new String[13];
                _9T.a();
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
                var5_5 = "\u00c0\u00b1\u00b3]6\u0082^\u00f6\b\u008fl\u0010\u001b%s\u008f\u00f5";
                var7_6 = "\u00c0\u00b1\u00b3]6\u0082^\u00f6\b\u008fl\u0010\u001b%s\u008f\u00f5".length();
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
                    var0_3[var6_4++] = _9T.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = ">\u0084\u0010\u00df\u009b\u00dc\u00ebL\b\u001fw`;G\u00e67=";
                    var7_6 = ">\u0084\u0010\u00df\u009b\u00dc\u00ebL\b\u001fw`;G\u00e67=".length();
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
                    var0_3[var6_4++] = _9T.a(var8_9).intern();
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
        _9T.ALWAYS = new _9T(var0_3[3], 0, var0_3[2]);
        _9T.ON_POP = new _9T(var0_3[0], 1, var0_3[1]);
        _9T.cfr_renamed_5 = _9T.a("\u00d0", (long)-4212034873290173203L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x4C4A9E1223EDL;
        return _9T.a("\u00d1", (Object)((Object)this), -3712806314972105741L, (long)l2);
    }

    public static _9T[] values() {
        long l2 = a ^ 0x56D7673236FL;
        return (_9T[])((Enum)((Object)_9T.a("\u00e5", -3676272209040260970L, (long)l2))).clone();
    }

    public static _9T valueOf(String string) {
        long l2 = a ^ 0x9A75DE710E0L;
        return (_9T)((Object)_9T.a("\u00d0", _9T.class, (Object)string, -39048645794453534L, (long)l2));
    }

    private static _9T[] cfr_renamed_1() {
        long l2 = a ^ 0x4881789B28C6L;
        return new _9T[]{_9T.a("\u00e5", -4083941403865742726L, (long)l2), _9T.a("\u00e5", -4084235337015250028L, (long)l2)};
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9T.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9T.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9T.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9T.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9T.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9T.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9T.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9T.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9T.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9T.a(clazz3, string2, clazz2)) != null) {
                    _9T.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9T.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9T.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9T.b(461721852317644L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9T.a(l2, l3);
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
                clazz3 = _9T.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9T.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9T.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9T.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9T.b(461721852317644L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9T.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9T.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9T.b(461721852317644L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9T" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d1' || c == '\u00ef' || c == '\u00e5' || c == '\u00e3') {
                field = _9T.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9T.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _9T.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\nS\u000fc\u0004d\u0017F\r\"\u00018Wb";
        objectArray[1] = "+WP\u001d/f\u001biM\b-'\u001e5\r,b";
        objectArray[2] = "\u001d\u0010cuHx\u0016\u001fr:5`\u0005\u0018{s";
        objectArray[3] = "+\u000b=fWI\u001b5 sU\b\u001ei`W\u001a";
        objectArray[4] = "\r\u0018$\u000b>\u001c\u0006\u00175DU\u001e\u0012\u0014";
        objectArray[5] = "\u0017\u001cg\u0001K~\u001c\u0013vN&~\u001c\u000eb";
        objectArray[6] = ".WH^H\u007f%XY\u0011)q.S]K";
        objectArray[7] = "8\r\u000fG2j>\nO~\rS\t?p&Js4_\u000e\u00065u3\u001f";
        objectArray[8] = "-O\u0019a|\u0014+HYX=kqEM6z\u0004\"L\u001a<";
        objectArray[9] = "e\u0018^z\u001d\u0001c\u001f\u001eCU~9K\u0006*[Co\u0010\r.";
        objectArray[10] = "\u0015%F(q4\u0013\"\u0006\u00118KI/\u0012\u007fw$\u001a&Eu\t";
        objectArray[11] = "MZn8*\rK].\u0001\u001b6ty\u0007ZR\u0014A\boy-\u0012FH";
        Object[] objectArray2 = objectArray;
        objectArray[12] = ">z\u0006B\u0017.w*\u0005Vr+l!\u0002A5;\u0005yFE\u0013k<:A\u001d\u001bU?|\u001fELhi'\u0014Arn:<\u0011I\t'j?\u0005,";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 50;
            case 1 -> 45;
            case 2 -> 37;
            case 3 -> 21;
            case 4 -> 38;
            case 5 -> 51;
            case 6 -> 0;
            case 7 -> 61;
            case 8 -> 12;
            case 9 -> 4;
            case 10 -> 55;
            case 11 -> 56;
            case 12 -> 40;
            case 13 -> 20;
            case 14 -> 11;
            case 15 -> 41;
            case 16 -> 31;
            case 17 -> 25;
            case 18 -> 32;
            case 19 -> 2;
            case 20 -> 29;
            case 21 -> 54;
            case 22 -> 62;
            case 23 -> 18;
            case 24 -> 3;
            case 25 -> 36;
            case 26 -> 9;
            case 27 -> 34;
            case 28 -> 15;
            case 29 -> 28;
            case 30 -> 10;
            case 31 -> 14;
            case 32 -> 27;
            case 33 -> 49;
            case 34 -> 33;
            case 35 -> 13;
            case 36 -> 43;
            case 37 -> 35;
            case 38 -> 30;
            case 39 -> 53;
            case 40 -> 57;
            case 41 -> 8;
            case 42 -> 19;
            case 43 -> 44;
            case 44 -> 16;
            case 45 -> 46;
            case 46 -> 59;
            case 47 -> 26;
            case 48 -> 48;
            case 49 -> 60;
            case 50 -> 23;
            case 51 -> 39;
            case 52 -> 52;
            case 53 -> 6;
            case 54 -> 42;
            case 55 -> 17;
            case 56 -> 63;
            case 57 -> 58;
            case 58 -> 5;
            case 59 -> 24;
            case 60 -> 1;
            case 61 -> 22;
            case 62 -> 7;
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
        _9T.c[n3] = new String(cArray);
        return n3;
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
            return MethodHandles.lookup().findStatic(_9T.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

