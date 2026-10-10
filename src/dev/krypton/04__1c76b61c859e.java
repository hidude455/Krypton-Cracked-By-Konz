/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._8o;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

public class _04
extends Record {
    private final _8o cfr_renamed_4;
    private final double cfr_renamed_7;
    private final double[] cfr_renamed_0;
    private final int cfr_renamed_3;
    private static final long a = l.a(1453339548337263387L, 8041195906140836668L, MethodHandles.lookup().lookupClass()).a(230004995705501L);
    private static final Object[] b = new Object[10];
    private static final String[] c = new String[10];

    public _04(_8o o, double d, double[] dArray, int n) {
        this.cfr_renamed_4 = o;
        this.cfr_renamed_7 = d;
        this.cfr_renamed_0 = dArray;
        this.cfr_renamed_3 = n;
    }

    static {
        _04.a();
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_04.class, "0;4;8;2", "0", "4", "8", "2"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_04.class, "0;4;8;2", "0", "4", "8", "2"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_04.class, "0;4;8;2", "0", "4", "8", "2"}, this);
    }

    public _8o cfr_renamed_1() {
        long l2 = a ^ 0x1EE14DC1B14CL;
        return _04.a("\u00a4", (Object)this, -5314743706360304912L, (long)l2);
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _04.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _04.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _04.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _04.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _04.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _04.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _04.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _04.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _04.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _04.a(clazz3, string2, clazz2)) != null) {
                    _04.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _04.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _04.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _04.b(373540693756742L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _04.a(l2, l3);
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
                clazz3 = _04.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _04.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _04.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _04.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _04.b(373540693756742L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _04.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _04.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _04.b(373540693756742L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/04" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a4' || c == '\u00cd' || c == '\u00f6' || c == '\u00fa') {
                field = _04.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _04.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 's' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
        MethodHandle methodHandle = _04.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 56;
            case 1 -> 40;
            case 2 -> 51;
            case 3 -> 54;
            case 4 -> 52;
            case 5 -> 30;
            case 6 -> 48;
            case 7 -> 50;
            case 8 -> 49;
            case 9 -> 23;
            case 10 -> 44;
            case 11 -> 17;
            case 12 -> 16;
            case 13 -> 15;
            case 14 -> 10;
            case 15 -> 33;
            case 16 -> 29;
            case 17 -> 61;
            case 18 -> 32;
            case 19 -> 42;
            case 20 -> 62;
            case 21 -> 1;
            case 22 -> 11;
            case 23 -> 34;
            case 24 -> 7;
            case 25 -> 14;
            case 26 -> 22;
            case 27 -> 53;
            case 28 -> 8;
            case 29 -> 0;
            case 30 -> 19;
            case 31 -> 27;
            case 32 -> 9;
            case 33 -> 45;
            case 34 -> 31;
            case 35 -> 36;
            case 36 -> 4;
            case 37 -> 37;
            case 38 -> 24;
            case 39 -> 21;
            case 40 -> 60;
            case 41 -> 63;
            case 42 -> 38;
            case 43 -> 25;
            case 44 -> 26;
            case 45 -> 58;
            case 46 -> 12;
            case 47 -> 35;
            case 48 -> 59;
            case 49 -> 5;
            case 50 -> 41;
            case 51 -> 3;
            case 52 -> 18;
            case 53 -> 43;
            case 54 -> 47;
            case 55 -> 20;
            case 56 -> 2;
            case 57 -> 39;
            case 58 -> 6;
            case 59 -> 57;
            case 60 -> 55;
            case 61 -> 28;
            case 62 -> 13;
            default -> 46;
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
        _04.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "_l\fq\u0016LBy\u000e0\u0013\u0010\u000b=";
        objectArray[1] = "I\u0016";
        objectArray[2] = Double.TYPE;
        _04.c[2] = "java/lang/Double";
        objectArray[3] = "k\u0017\u001d?\bIv\u0002\u001f~\r\u00157\u001d";
        objectArray[4] = Integer.TYPE;
        _04.c[4] = "java/lang/Integer";
        objectArray[5] = "S\u001crRvdX\u0013c\u001d\u0017jS\u0018gG";
        objectArray[6] = "\u0000xH?3wP{\u000bZr\rP\u007f\n8/1V.Q!";
        objectArray[7] = "^H)w8Z\u000eKj\u0012\u007f \f\u0014l+=AHM(/";
        objectArray[8] = "\u0011\u0011hpP;A\u0012+\u0015\u001dAA\u001d%$H>C\u0016|x";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "cWOeL>3T\f\u0000\tD0\u0000]\u007f\n63^Ml";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public int cfr_renamed_3() {
        long l2 = a ^ 0x13610F2D802EL;
        return (int)_04.a("\u00a4", (Object)this, -8692041186640378817L, (long)l2);
    }

    public double cfr_renamed_7() {
        long l2 = a ^ 0x34E661CCD423L;
        return (double)_04.a("\u00a4", (Object)this, -3219280924221709492L, (long)l2);
    }

    public double[] cfr_renamed_0() {
        long l2 = a ^ 0x1AB064BEA3E7L;
        return _04.a("\u00a4", (Object)this, -6587227678020832444L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_04.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

