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

public class _8V {
    static final int[] cfr_renamed_4;
    private static final Object[] a;
    private static final String[] b;

    static {
        long l2 = l.a(7812090378409199861L, -4932274946287537325L, MethodHandles.lookup().lookupClass()).a(22864086495365L) ^ 0x607B2180FC89L;
        a = new Object[11];
        b = new String[11];
        _8V.a();
        cfr_renamed_4 = new int[((CallSite)_8V.a("\u00c0", -3426102850524231119L, (long)l2)).length];
        try {
            _8V.a("r", -3425067521758220441L, (long)l2)[_8V.a("\u00cc", (Object)_8V.a("r", -3425909852386215513L, (long)l2), -3425033730892561302L, (long)l2)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _8V.a("r", -3425067521758220441L, (long)l2)[_8V.a("\u00cc", (Object)_8V.a("r", -3426020369664025673L, (long)l2), -3425033730892561302L, (long)l2)] = (CallSite)2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8V.a(l2, l3);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                _8V.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8V.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8V.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8V.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8V.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8V.a(l2, l3);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = _8V.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8V.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8V.a(clazz3, string2, clazz2)) != null) {
                    _8V.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8V.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8V.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8V.b(392967078890453L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8V.a(l2, l3);
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
                clazz3 = _8V.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8V.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8V.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8V.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8V.b(392967078890453L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8V.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8V.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8V.b(392967078890453L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00ce' || c == 'r' || c == 'p') {
                field = _8V.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8V.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8V.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8V" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 58;
            case 1 -> 29;
            case 2 -> 10;
            case 3 -> 18;
            case 4 -> 27;
            case 5 -> 26;
            case 6 -> 21;
            case 7 -> 7;
            case 8 -> 53;
            case 9 -> 30;
            case 10 -> 50;
            case 11 -> 62;
            case 12 -> 23;
            case 13 -> 55;
            case 14 -> 5;
            case 15 -> 24;
            case 16 -> 44;
            case 17 -> 49;
            case 18 -> 11;
            case 19 -> 52;
            case 20 -> 40;
            case 21 -> 9;
            case 22 -> 42;
            case 23 -> 56;
            case 24 -> 46;
            case 25 -> 38;
            case 26 -> 60;
            case 27 -> 57;
            case 28 -> 14;
            case 29 -> 28;
            case 30 -> 33;
            case 31 -> 36;
            case 32 -> 61;
            case 33 -> 1;
            case 34 -> 37;
            case 35 -> 3;
            case 36 -> 48;
            case 37 -> 63;
            case 38 -> 8;
            case 39 -> 19;
            case 40 -> 35;
            case 41 -> 4;
            case 42 -> 22;
            case 43 -> 2;
            case 44 -> 41;
            case 45 -> 43;
            case 46 -> 12;
            case 47 -> 54;
            case 48 -> 47;
            case 49 -> 31;
            case 50 -> 25;
            case 51 -> 51;
            case 52 -> 32;
            case 53 -> 13;
            case 54 -> 45;
            case 55 -> 0;
            case 56 -> 34;
            case 57 -> 16;
            case 58 -> 17;
            case 59 -> 6;
            case 60 -> 20;
            case 61 -> 59;
            case 62 -> 15;
            default -> 39;
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
        _8V.b[n3] = new String(cArray);
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

    private static void a() {
        Object[] objectArray = a;
        a[0] = "8$\u001d\u0012u,1*\u001e[6!7*\nY+'u?\u0015Dl6).\u0003\u0012L&#?\u0005N}\u000549\u001d]l";
        objectArray[1] = Integer.TYPE;
        _8V.b[1] = "java/lang/Integer";
        objectArray[2] = "\u0004\u001d-h\u001f\u0013\u0019\b/)\u001aOX.";
        objectArray[3] = "fp";
        objectArray[4] = "\u0013M,yb&%n%waofc#wum{eabjp<t=s|&\u001cd7bzz-G dbi<:";
        objectArray[5] = "l'e\u000e_Cg(tA>Ml#p\u001b";
        objectArray[6] = "L-\u0002k!2\u001b6Sp@kufW6%<\u0004c\bjy";
        objectArray[7] = "Y\u0000W\r@o\u0013[\u000fcGn\u000eX\n\nD\u0014[\u0000\f\u0019_d\u0019\u0002\u0016\\ ";
        objectArray[8] = "\u001ee\u001a\\\u0012~T>B2\flA!LIr>\u001d&BX\u0012i\u00192\u001f2";
        objectArray[9] = ";$kX7zq\u007f36\rLL-P\rn:n}+G5b";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "tv]@B[>-\u0005.xo\u0005\u0006V.\u0019\u0019t!\u0006USB,";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8V.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

