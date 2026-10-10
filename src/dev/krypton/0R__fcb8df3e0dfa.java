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

public class _0R
extends Enum {
    public static final _0R Head;
    public static final _0R Chest;
    public static final _0R Legs;
    private final String cfr_renamed_4;
    private static final _0R[] cfr_renamed_3;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _0R() {
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
                _0R.a = l.a(4592083553539983887L, -2543870801692555609L, MethodHandles.lookup().lookupClass()).a(259789824081403L);
                var9 = _0R.a ^ 59456382394766L;
                _0R.b = new Object[14];
                _0R.c = new String[14];
                _0R.a();
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
                var0_3 = new String[6];
                var6_4 = 0;
                var5_5 = "\u008e\u00e2\u00c8\u0097\u00db8\u00f1_\b\u00a0\u0007\u00d65\u0010\u00b1Lr\b\u00b4\f\u00f1~\u00043\u00b9'\b\u00b4\f\u00f1~\u00043\u00b9'";
                var7_6 = "\u008e\u00e2\u00c8\u0097\u00db8\u00f1_\b\u00a0\u0007\u00d65\u0010\u00b1Lr\b\u00b4\f\u00f1~\u00043\u00b9'\b\u00b4\f\u00f1~\u00043\u00b9'".length();
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
                    var0_3[var6_4++] = _0R.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u008e\u00e2\u00c8\u0097\u00db8\u00f1_\b\u00a0\u0007\u00d65\u0010\u00b1Lr";
                    var7_6 = "\u008e\u00e2\u00c8\u0097\u00db8\u00f1_\b\u00a0\u0007\u00d65\u0010\u00b1Lr".length();
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
                    var0_3[var6_4++] = _0R.a(var8_9).intern();
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
        _0R.Head = new _0R(var0_3[2], 0, var0_3[3]);
        _0R.Chest = new _0R(var0_3[5], 1, var0_3[1]);
        _0R.Legs = new _0R(var0_3[4], 2, var0_3[0]);
        _0R.cfr_renamed_3 = _0R.a("\u00fb", (long)-6783010521881740643L, (long)var9);
    }

    public String toString() {
        long l2 = a ^ 0x67BFD2ACC5CBL;
        return _0R.a("\u00eb", (Object)((Object)this), 404020554921527854L, (long)l2);
    }

    public static _0R[] values() {
        long l2 = a ^ 0x60B8A7F3D777L;
        return (_0R[])((Enum)((Object)_0R.a("\u00ef", 1668311012889587550L, (long)l2))).clone();
    }

    public static _0R valueOf(String string) {
        long l2 = a ^ 0x19D0433E782L;
        return (_0R)((Object)_0R.a("\u00fb", _0R.class, (Object)string, 2869558424087157840L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0R.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _0R.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0R.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0R.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0R.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0R.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0R.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _0R.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0R.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0R.a(clazz3, string2, clazz2)) != null) {
                    _0R.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0R.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0R.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0R.b(443378514829452L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0R.a(l2, l3);
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
                clazz3 = _0R.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0R.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0R.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0R.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0R.b(443378514829452L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0R.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0R.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0R.b(443378514829452L, 0L);
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
            throw new RuntimeException("dev/krypton/0R" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00eb' || c == 'P' || c == '\u00ef' || c == '\u00db') {
                field = _0R.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0R.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'R' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0R.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 7;
            case 1 -> 23;
            case 2 -> 14;
            case 3 -> 50;
            case 4 -> 40;
            case 5 -> 43;
            case 6 -> 10;
            case 7 -> 55;
            case 8 -> 42;
            case 9 -> 61;
            case 10 -> 37;
            case 11 -> 59;
            case 12 -> 58;
            case 13 -> 34;
            case 14 -> 9;
            case 15 -> 28;
            case 16 -> 47;
            case 17 -> 2;
            case 18 -> 29;
            case 19 -> 49;
            case 20 -> 32;
            case 21 -> 16;
            case 22 -> 52;
            case 23 -> 38;
            case 24 -> 4;
            case 25 -> 22;
            case 26 -> 56;
            case 27 -> 36;
            case 28 -> 30;
            case 29 -> 54;
            case 30 -> 1;
            case 31 -> 39;
            case 32 -> 27;
            case 33 -> 17;
            case 34 -> 53;
            case 35 -> 8;
            case 36 -> 3;
            case 37 -> 63;
            case 38 -> 20;
            case 39 -> 57;
            case 40 -> 24;
            case 41 -> 51;
            case 42 -> 62;
            case 43 -> 44;
            case 44 -> 15;
            case 45 -> 33;
            case 46 -> 19;
            case 47 -> 18;
            case 48 -> 60;
            case 49 -> 31;
            case 50 -> 0;
            case 51 -> 35;
            case 52 -> 41;
            case 53 -> 13;
            case 54 -> 21;
            case 55 -> 26;
            case 56 -> 25;
            case 57 -> 11;
            case 58 -> 46;
            case 59 -> 12;
            case 60 -> 5;
            case 61 -> 45;
            case 62 -> 6;
            default -> 48;
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
        _0R.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "0\u000f\u0018F\u0005#-\u001a\u001a\u0007\u0000\u007fd8";
        objectArray[1] = "{s\u0012Z\f?KM\u000fO\u000e~N\u0011FmA";
        objectArray[2] = "\tY5\u001a*\u001d9g(\u000f(\\<;a-g";
        objectArray[3] = "\u0019y|CR?\u0012vm\f9=\u0006u";
        objectArray[4] = "\\+B0U5W$S\u007f85W9G";
        objectArray[5] = "\u0012{@`J$\u0019tQ/7<\nsXf";
        objectArray[6] = "\u000f\u001f\"\u001e\u0010e\u0004\u00103Qqk\u000f\u001b7\u000b";
        objectArray[7] = "^)9.{@^&2I//\u0005m 3oUE5&1\u0014";
        objectArray[8] = "E\u0011l&\u001arE\u001egAM\u001d\u001f\u0016p|\u0010yF\u001f\u007f>";
        objectArray[9] = "\u0000@OF=\u0002\u0000OD!hm[\u0004V[)\u0017\u001b\\PY";
        objectArray[10] = "\u000fOV1;%T\u001dU1^)\\\u001aF#\u001995E\u000b.3<Y\u0017]u/W\u000e\u0007^s;3W\u000eQ1^m\u0004\u0013D+,6V\u0010DN";
        objectArray[11] = "5{6kJ;5t=\fn49~3\fD*-b cD%&";
        objectArray[12] = "L\u0004|%0\u0011L\u000bwB\u001f\u0013D\u0016\u0005#!\u0007J\u0015j#.\f";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "0\u0013\u000f\u0003AP0\u001c\u0004djR>\u0016v\u0005PF6\u0002\u0019\u0005_M";
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

    private static _0R[] cfr_renamed_6() {
        long l2 = a ^ 0x70C59F338A0EL;
        return new _0R[]{_0R.a("\u00ef", 5359099482747797615L, (long)l2), _0R.a("\u00ef", 5358913761738695001L, (long)l2), _0R.a("\u00ef", 5359015547187685385L, (long)l2)};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0R.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

