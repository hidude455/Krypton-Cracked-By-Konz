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
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from dev.krypton.3f
 */
public class _3f_0
extends Record {
    private final double cfr_renamed_8;
    private final double cfr_renamed_5;
    private final double cfr_renamed_1;
    private final double cfr_renamed_6;
    private static final long a = l.a(-7231687824272920029L, -2819894030906991103L, MethodHandles.lookup().lookupClass()).a(49519649654186L);
    private static final Object[] b = new Object[7];
    private static final String[] c = new String[7];

    private _3f_0(double d, double d2, double d3, double d4) {
        this.cfr_renamed_8 = d;
        this.cfr_renamed_5 = d2;
        this.cfr_renamed_1 = d3;
        this.cfr_renamed_6 = d4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_3f_0.class, "5;1;9;3", "5", "1", "9", "3"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_3f_0.class, "5;1;9;3", "5", "1", "9", "3"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_3f_0.class, "5;1;9;3", "5", "1", "9", "3"}, this, object);
    }

    public double cfr_renamed_4() {
        long l2 = a ^ 0x7306559E3B64L;
        return (double)_3f_0.a("\u00e9", (Object)this, 8288571238266483329L, (long)l2);
    }

    public double cfr_renamed_3() {
        long l2 = a ^ 0x52859C1729DEL;
        return (double)_3f_0.a("\u00e9", (Object)this, 7042952868302592671L, (long)l2);
    }

    public double cfr_renamed_6() {
        long l2 = a ^ 0x1138AFF60FB2L;
        return (double)_3f_0.a("\u00e9", (Object)this, 5174759004648098069L, (long)l2);
    }

    public double cfr_renamed_9() {
        long l2 = a ^ 0x6B900D0D3680L;
        return (double)_3f_0.a("\u00e9", (Object)this, 9142973937250647257L, (long)l2);
    }

    static {
        _3f_0.a();
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
            case 0 -> 46;
            case 1 -> 61;
            case 2 -> 60;
            case 3 -> 49;
            case 4 -> 45;
            case 5 -> 32;
            case 6 -> 41;
            case 7 -> 37;
            case 8 -> 5;
            case 9 -> 58;
            case 10 -> 13;
            case 11 -> 18;
            case 12 -> 12;
            case 13 -> 9;
            case 14 -> 54;
            case 15 -> 14;
            case 16 -> 39;
            case 17 -> 47;
            case 18 -> 25;
            case 19 -> 59;
            case 20 -> 31;
            case 21 -> 4;
            case 22 -> 35;
            case 23 -> 40;
            case 24 -> 48;
            case 25 -> 33;
            case 26 -> 8;
            case 27 -> 52;
            case 28 -> 6;
            case 29 -> 57;
            case 30 -> 42;
            case 31 -> 11;
            case 32 -> 63;
            case 33 -> 43;
            case 34 -> 53;
            case 35 -> 28;
            case 36 -> 1;
            case 37 -> 30;
            case 38 -> 10;
            case 39 -> 0;
            case 40 -> 62;
            case 41 -> 7;
            case 42 -> 15;
            case 43 -> 50;
            case 44 -> 34;
            case 45 -> 38;
            case 46 -> 36;
            case 47 -> 3;
            case 48 -> 24;
            case 49 -> 55;
            case 50 -> 19;
            case 51 -> 21;
            case 52 -> 26;
            case 53 -> 44;
            case 54 -> 51;
            case 55 -> 17;
            case 56 -> 23;
            case 57 -> 27;
            case 58 -> 29;
            case 59 -> 56;
            case 60 -> 22;
            case 61 -> 16;
            case 62 -> 20;
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
        _3f_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = ";\nYiLx&\u001f[(I$l\t";
        objectArray[1] = Double.TYPE;
        _3f_0.c[1] = "java/lang/Double";
        objectArray[2] = "'!\u0005\u0017\n1,.\u0014Xk?'%\u0010\u0002";
        objectArray[3] = "da;<5|%hrSo\u0002f?f28><h{*";
        objectArray[4] = "M\u0001\u0011\u001a\u001dZ\f\bXuE$O_L\u0014\u0010\u0018\u0015\bQ\f";
        objectArray[5] = "\u00067`f\u000f}G>)\t]\u0003\u0004i=h\u0002?^> p";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\u0013\\\nYisRUC67\r\u0011\u0002WWd1KUJO";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3f_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _3f_0.b[n] = clazz = Class.forName(c[n]);
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
        Field field = _3f_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3f_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3f_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _3f_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3f_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3f_0.a(clazz3, string2, clazz2)) != null) {
                    _3f_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3f_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3f_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3f_0.b(209475199718368L, 0L);
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
        Method method = _3f_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3f_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _3f_0.a(l2, l3);
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
                clazz3 = _3f_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3f_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3f_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3f_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3f_0.b(209475199718368L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3f_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3f_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3f_0.b(209475199718368L, 0L);
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
            if (c == '\u00e9' || c == 'm' || c == '\u00c3' || c == '\u00ec') {
                field = _3f_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3f_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3f_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3f_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

