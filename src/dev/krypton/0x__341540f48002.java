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

public class _0x {
    static final int[] cfr_renamed_1;
    private static final Object[] a;
    private static final String[] b;

    static {
        long l2 = l.a(9014565349407342358L, 9035530245231010405L, MethodHandles.lookup().lookupClass()).a(125943412428368L) ^ 0x1DAA38EDE036L;
        a = new Object[11];
        b = new String[11];
        _0x.a();
        cfr_renamed_1 = new int[((CallSite)_0x.a("J", -1847633743121705161L, (long)l2)).length];
        try {
            _0x.a("\u00ee", -1848522152633862873L, (long)l2)[_0x.a("\u00f9", (Object)_0x.a("\u00ee", -1847783051460373111L, (long)l2), -1848494743350149053L, (long)l2)] = (CallSite)true;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _0x.a("\u00ee", -1848522152633862873L, (long)l2)[_0x.a("\u00f9", (Object)_0x.a("\u00ee", -1847850212908911949L, (long)l2), -1848494743350149053L, (long)l2)] = (CallSite)2;
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
            int n = _0x.a(l2, l3);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                _0x.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0x.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0x.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0x.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0x.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _0x.a(l2, l3);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = _0x.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0x.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0x.a(clazz3, string2, clazz2)) != null) {
                    _0x.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0x.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0x.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0x.b(380383167853150L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0x.a(l2, l3);
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
                clazz3 = _0x.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0x.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0x.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0x.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0x.b(380383167853150L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0x.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0x.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0x.b(380383167853150L, 0L);
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
            if (c == 'T' || c == '\u00c9' || c == '\u00ee' || c == '\u00ce') {
                field = _0x.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0x.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0x.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0x" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 37;
            case 1 -> 14;
            case 2 -> 7;
            case 3 -> 13;
            case 4 -> 6;
            case 5 -> 38;
            case 6 -> 41;
            case 7 -> 33;
            case 8 -> 11;
            case 9 -> 50;
            case 10 -> 61;
            case 11 -> 8;
            case 12 -> 39;
            case 13 -> 18;
            case 14 -> 57;
            case 15 -> 45;
            case 16 -> 48;
            case 17 -> 32;
            case 18 -> 46;
            case 19 -> 53;
            case 20 -> 1;
            case 21 -> 2;
            case 22 -> 40;
            case 23 -> 47;
            case 24 -> 63;
            case 25 -> 21;
            case 26 -> 10;
            case 27 -> 60;
            case 28 -> 55;
            case 29 -> 17;
            case 30 -> 27;
            case 31 -> 19;
            case 32 -> 29;
            case 33 -> 24;
            case 34 -> 3;
            case 35 -> 43;
            case 36 -> 9;
            case 37 -> 36;
            case 38 -> 35;
            case 39 -> 51;
            case 40 -> 49;
            case 41 -> 31;
            case 42 -> 22;
            case 43 -> 20;
            case 44 -> 12;
            case 45 -> 23;
            case 46 -> 4;
            case 47 -> 54;
            case 48 -> 16;
            case 49 -> 58;
            case 50 -> 25;
            case 51 -> 34;
            case 52 -> 0;
            case 53 -> 30;
            case 54 -> 44;
            case 55 -> 28;
            case 56 -> 62;
            case 57 -> 59;
            case 58 -> 15;
            case 59 -> 42;
            case 60 -> 5;
            case 61 -> 52;
            case 62 -> 26;
            default -> 56;
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
        _0x.b[n3] = new String(cArray);
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
        a[0] = "7|Yx=\u001c7|N$1\u0013-7N:1\u0006*F\u001ccfQ:uL%#*h,\u0015";
        objectArray[1] = Integer.TYPE;
        _0x.b[1] = "java/lang/Integer";
        objectArray[2] = "{TPNx9MqPNoeA~J\u0005o{AkMt=\"\u0016<]GmdSG\u000f\u001e4,";
        objectArray[3] = "\u0016\u0014Nu%c\u000b\u0001L4 ?B\t";
        objectArray[4] = "T%";
        objectArray[5] = "|DB]\u0012ZwKS\u0012sT|@WH";
        objectArray[6] = "W\u0006[*a\u0002\u0003W\\Xv\u0015P\n_1uoL\u0010^a}\nP\u0015\u0007X";
        objectArray[7] = "?\n\u0007f\u0013#jU\u00014zs\u0005\u000eFk\u0007}<XFk\u0015";
        objectArray[8] = ";\u0000F\r9OoQA\u007f'C=\tH(p\u001bkV$\u0014$@\"\u001dI@uG";
        objectArray[9] = "?\u001b\t\u0004P\fkJ\u000evN\u00009\u0012\u0007!\u0019XoIk\u001dM\u0003&\u0006\u0006I\u001c\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "NK \u00076?\u001a\u001a'u8;A[/\u000eFkTZ>\u0011+i\u0018^;u";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0x.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

