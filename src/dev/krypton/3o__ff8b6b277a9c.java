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

/*
 * Renamed from dev.krypton.3o
 */
public class _3o_0 {
    static final int[] cfr_renamed_7;
    private static final Object[] a;
    private static final String[] b;

    static {
        long l2 = l.a(6329477183590572002L, 6273199310398090127L, MethodHandles.lookup().lookupClass()).a(18054178862943L) ^ 0x2DFE3D403B06L;
        a = new Object[11];
        b = new String[11];
        _3o_0.a();
        cfr_renamed_7 = new int[((CallSite)_3o_0.a("m", 7774103377533079452L, (long)l2)).length];
        try {
            _3o_0.a("\u00e8", 7773466712636571112L, (long)l2)[_3o_0.a("\u00c8", (Object)_3o_0.a("\u00e8", 7774175677347929166L, (long)l2), 7773400943498123230L, (long)l2)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _3o_0.a("\u00e8", 7773466712636571112L, (long)l2)[_3o_0.a("\u00c8", (Object)_3o_0.a("\u00e8", 7774329952386081487L, (long)l2), 7773400943498123230L, (long)l2)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (b[n3] != null) {
            return n3;
        }
        Object object = a[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 50;
            case 1 -> 43;
            case 2 -> 35;
            case 3 -> 62;
            case 4 -> 27;
            case 5 -> 5;
            case 6 -> 48;
            case 7 -> 40;
            case 8 -> 57;
            case 9 -> 6;
            case 10 -> 22;
            case 11 -> 0;
            case 12 -> 63;
            case 13 -> 59;
            case 14 -> 51;
            case 15 -> 45;
            case 16 -> 41;
            case 17 -> 14;
            case 18 -> 12;
            case 19 -> 4;
            case 20 -> 11;
            case 21 -> 19;
            case 22 -> 30;
            case 23 -> 9;
            case 24 -> 3;
            case 25 -> 8;
            case 26 -> 1;
            case 27 -> 13;
            case 28 -> 38;
            case 29 -> 36;
            case 30 -> 31;
            case 31 -> 42;
            case 32 -> 16;
            case 33 -> 52;
            case 34 -> 44;
            case 35 -> 26;
            case 36 -> 47;
            case 37 -> 29;
            case 38 -> 58;
            case 39 -> 7;
            case 40 -> 33;
            case 41 -> 55;
            case 42 -> 15;
            case 43 -> 32;
            case 44 -> 18;
            case 45 -> 24;
            case 46 -> 23;
            case 47 -> 61;
            case 48 -> 60;
            case 49 -> 49;
            case 50 -> 37;
            case 51 -> 25;
            case 52 -> 34;
            case 53 -> 46;
            case 54 -> 2;
            case 55 -> 54;
            case 56 -> 10;
            case 57 -> 28;
            case 58 -> 21;
            case 59 -> 17;
            case 60 -> 56;
            case 61 -> 39;
            case 62 -> 53;
            default -> 20;
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
        _3o_0.b[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "^(\u0007\u0016)}C=\u0005W,!\t\"";
        objectArray[1] = "&\u0018";
        objectArray[2] = "u\bf\u0006\u0006\u0002u\bqZ\n\roCqD\n\u0018h2 \u001bROx\u0001s[\u00184)Y\"";
        objectArray[3] = Integer.TYPE;
        _3o_0.b[3] = "java/lang/Integer";
        objectArray[4] = "y))t\u0002RO\f)t\u0015\u000eC\u00033?\u0015\u0010C\u00164NDO\u001bA$}\u0017\u000fQ:u%FG";
        objectArray[5] = "\f&%\u0006~K\u0007)4I\u001fE\f\"0\u0013";
        objectArray[6] = "b.A|,\no0V\u001c!zq;Gpw\u0005qmW";
        objectArray[7] = "@qOL0n\u001bx]\nYw\u0003xB\u00170ty.Z\u000egk\u0019l\u001f\u001c8\u0010";
        objectArray[8] = "Kn<{U\u0002\u0010g.=<\u0012\u0013f4*kEI0kF\u0005\u0019\u001e698^\u0010\fp";
        objectArray[9] = "h150E/38'v,/80$`WQk* `\\h!7%g,";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "\u001d]=.biFT/h\u000byEU5\u007f\\.\u001f\u0003k\u00132rH\u00058mi{ZC";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3o_0.a(l2, l3);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                _3o_0.a[n] = clazz = Class.forName(b[n]);
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
        Field field = _3o_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3o_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3o_0.a(l2, l3);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = _3o_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3o_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3o_0.a(clazz3, string2, clazz2)) != null) {
                    _3o_0.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3o_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3o_0.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3o_0.b(378396787963717L, 0L);
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
        Method method = _3o_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3o_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _3o_0.a(l2, l3);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = _3o_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3o_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3o_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3o_0.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3o_0.b(378396787963717L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3o_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3o_0.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3o_0.b(378396787963717L, 0L);
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
            if (c == 'f' || c == '\u00e5' || c == '\u00e8' || c == 'u') {
                field = _3o_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3o_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'm' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3o_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

