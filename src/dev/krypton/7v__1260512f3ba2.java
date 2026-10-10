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
 * Renamed from dev.krypton.7v
 */
public class _7v_0
extends Enum {
    public static final _7v_0 Left;
    public static final _7v_0 Right;
    private final String cfr_renamed_2;
    private static final _7v_0[] cfr_renamed_8;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _7v_0() {
        void var3_1;
        void cfr_renamed_27;
        void cfr_renamed_28;
        this.cfr_renamed_2 = var3_1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _7v_0.a = l.a(6547736007441133527L, 4108543083893305813L, MethodHandles.lookup().lookupClass()).a(87965549633499L);
                var9 = _7v_0.a ^ 87130256785750L;
                _7v_0.b = new Object[13];
                _7v_0.c = new String[13];
                _7v_0.a();
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
                var5_5 = "\u008d\u0081\u00aaV\u008e5\u001e\u00f1\b7\u0096\u00bc\u00b5\u001e\u00bd\u00a3\u00b9";
                var7_6 = "\u008d\u0081\u00aaV\u008e5\u001e\u00f1\b7\u0096\u00bc\u00b5\u001e\u00bd\u00a3\u00b9".length();
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
                    var0_3[var6_4++] = _7v_0.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "7\u0096\u00bc\u00b5\u001e\u00bd\u00a3\u00b9\b\u008d\u0081\u00aaV\u008e5\u001e\u00f1";
                    var7_6 = "7\u0096\u00bc\u00b5\u001e\u00bd\u00a3\u00b9\b\u008d\u0081\u00aaV\u008e5\u001e\u00f1".length();
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
                    var0_3[var6_4++] = _7v_0.a(var8_9).intern();
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
        _7v_0.Left = new _7v_0(var0_3[1], 0, var0_3[2]);
        _7v_0.Right = new _7v_0(var0_3[3], 1, var0_3[0]);
        _7v_0.cfr_renamed_8 = _7v_0.a("\u00b5", (long)5586469844630714449L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x519DC788FC3DL;
        return _7v_0.a("l", (Object)((Object)this), -1085406635141584860L, (long)l2);
    }

    public static _7v_0[] values() {
        long l2 = a ^ 0x6B574AEE1263L;
        return (_7v_0[])((Enum)((Object)_7v_0.a("X", 2212078999073277576L, (long)l2))).clone();
    }

    public static _7v_0 valueOf(String string) {
        long l2 = a ^ 0x2E9324781508L;
        return (_7v_0)((Object)_7v_0.a("\u00b5", _7v_0.class, (Object)string, 1862312914080694122L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _7v_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _7v_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _7v_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _7v_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _7v_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _7v_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _7v_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _7v_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _7v_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _7v_0.a(clazz3, string2, clazz2)) != null) {
                    _7v_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _7v_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _7v_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _7v_0.b(462117731865789L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _7v_0.a(l2, l3);
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
                clazz3 = _7v_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _7v_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _7v_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _7v_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _7v_0.b(462117731865789L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _7v_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _7v_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _7v_0.b(462117731865789L, 0L);
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
            throw new RuntimeException("dev/krypton/7v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == '\u00f0' || c == 'X' || c == '\u00e5') {
                field = _7v_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _7v_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _7v_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 58;
            case 1 -> 37;
            case 2 -> 1;
            case 3 -> 2;
            case 4 -> 19;
            case 5 -> 27;
            case 6 -> 30;
            case 7 -> 33;
            case 8 -> 39;
            case 9 -> 55;
            case 10 -> 11;
            case 11 -> 7;
            case 12 -> 16;
            case 13 -> 38;
            case 14 -> 48;
            case 15 -> 15;
            case 16 -> 57;
            case 17 -> 63;
            case 18 -> 8;
            case 19 -> 52;
            case 20 -> 51;
            case 21 -> 36;
            case 22 -> 6;
            case 23 -> 21;
            case 24 -> 35;
            case 25 -> 40;
            case 26 -> 62;
            case 27 -> 49;
            case 28 -> 17;
            case 29 -> 28;
            case 30 -> 46;
            case 31 -> 24;
            case 32 -> 44;
            case 33 -> 42;
            case 34 -> 41;
            case 35 -> 54;
            case 36 -> 60;
            case 37 -> 14;
            case 38 -> 25;
            case 39 -> 22;
            case 40 -> 47;
            case 41 -> 13;
            case 42 -> 4;
            case 43 -> 31;
            case 44 -> 53;
            case 45 -> 0;
            case 46 -> 23;
            case 47 -> 10;
            case 48 -> 26;
            case 49 -> 61;
            case 50 -> 34;
            case 51 -> 32;
            case 52 -> 5;
            case 53 -> 45;
            case 54 -> 9;
            case 55 -> 3;
            case 56 -> 12;
            case 57 -> 20;
            case 58 -> 50;
            case 59 -> 29;
            case 60 -> 59;
            case 61 -> 56;
            case 62 -> 18;
            default -> 43;
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
        _7v_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "/J(\u0011iB2_*Pl\u001e|Y";
        objectArray[1] = "\">x_V\u0005\u0012\u0000eJTD\u0017\\+L\u001b";
        objectArray[2] = "\u000e$\u00055s\t>\u001a\u0018 qH;FV&>";
        objectArray[3] = "@\u001dT\u000101K\u0012EN[3_\u0011";
        objectArray[4] = "\u001a\u00169v#n\u0011\u0019(9Nn\u0011\u0004<";
        objectArray[5] = "\"#X\u0002Yd),IM$|:+@\u0004";
        objectArray[6] = "\u0016D;\u00142\\\u001dK*[SR\u0016@.\u0001";
        objectArray[7] = "\\\f;kXv\u0013\u0010+\u0016\u0018O]Q3p\u001a$\\\n*r";
        objectArray[8] = "&9 W*ti%0*hM\".v\u0014j|jl9\u0011T";
        objectArray[9] = "EokNCA\ns{3g\u0019\u0017j~3\u0000\u001d\u0011w|\nO\u0001\u0001";
        objectArray[10] = "-\u0015\u0006\u0002\u001a\"b\t\u0016\u007f v~\foB\u0001rm\u000eV\r\u001db";
        objectArray[11] = "F\u0000\u0012\u0011Q\u001e\t\u001c\u0002l\u0012'B\u0017DR\u0011\u0016\nU\u000bW";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "Z\u001b|:\t\u001b\u001bN>#6T\t\u001a{)qD`Em.\u0006D^\u001568U*\\Fg\"\nA]\u001d~ 6\u0010\u0005\u0004x{\u0007QPFaD";
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

    private static _7v_0[] cfr_renamed_7() {
        long l2 = a ^ 0x138AAEB9FBD9L;
        return new _7v_0[]{_7v_0.a("X", -646015634545521750L, (long)l2), _7v_0.a("X", -646237224198624516L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_7v_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

