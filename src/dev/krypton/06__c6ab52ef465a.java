/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._04;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

public class _06
extends Record {
    private final double cfr_renamed_4;
    private final double cfr_renamed_1;
    private final double cfr_renamed_5;
    private final double cfr_renamed_9;
    private final _04[] cfr_renamed_0;
    private static final long a = l.a(-6683618294712081009L, 3849820590170079046L, MethodHandles.lookup().lookupClass()).a(233936866555687L);
    private static final Object[] b = new Object[9];
    private static final String[] c = new String[9];

    public _04[] cfr_renamed_5() {
        long l2 = a ^ 0x1F2F7A714B6DL;
        return _06.a("\u00c0", (Object)this, -6215930262404933603L, (long)l2);
    }

    public _06(double d, double d2, double d3, double d4, _04[] nullArray) {
        this.cfr_renamed_4 = d;
        this.cfr_renamed_1 = d2;
        this.cfr_renamed_5 = d3;
        this.cfr_renamed_9 = d4;
        this.cfr_renamed_0 = nullArray;
    }

    static {
        _06.a();
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_06.class, "0;9;1;7;8", "0", "9", "1", "7", "8"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_06.class, "0;9;1;7;8", "0", "9", "1", "7", "8"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_06.class, "0;9;1;7;8", "0", "9", "1", "7", "8"}, this);
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _06.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _06.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _06.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _06.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _06.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _06.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _06.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _06.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _06.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _06.a(clazz3, string2, clazz2)) != null) {
                    _06.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _06.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _06.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _06.b(218927186955355L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _06.a(l2, l3);
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
                clazz3 = _06.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _06.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _06.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _06.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _06.b(218927186955355L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _06.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _06.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _06.b(218927186955355L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c0' || c == 'U' || c == '\u00ef' || c == '\u00ff') {
                field = _06.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c0' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _06.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/06" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _06.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 10;
            case 1 -> 21;
            case 2 -> 18;
            case 3 -> 11;
            case 4 -> 46;
            case 5 -> 57;
            case 6 -> 26;
            case 7 -> 63;
            case 8 -> 62;
            case 9 -> 36;
            case 10 -> 47;
            case 11 -> 17;
            case 12 -> 45;
            case 13 -> 28;
            case 14 -> 48;
            case 15 -> 51;
            case 16 -> 31;
            case 17 -> 56;
            case 18 -> 16;
            case 19 -> 50;
            case 20 -> 33;
            case 21 -> 41;
            case 22 -> 52;
            case 23 -> 6;
            case 24 -> 0;
            case 25 -> 20;
            case 26 -> 25;
            case 27 -> 49;
            case 28 -> 23;
            case 29 -> 43;
            case 30 -> 59;
            case 31 -> 61;
            case 32 -> 24;
            case 33 -> 39;
            case 34 -> 12;
            case 35 -> 37;
            case 36 -> 54;
            case 37 -> 42;
            case 38 -> 38;
            case 39 -> 32;
            case 40 -> 44;
            case 41 -> 1;
            case 42 -> 5;
            case 43 -> 30;
            case 44 -> 3;
            case 45 -> 8;
            case 46 -> 53;
            case 47 -> 29;
            case 48 -> 9;
            case 49 -> 4;
            case 50 -> 27;
            case 51 -> 55;
            case 52 -> 2;
            case 53 -> 40;
            case 54 -> 15;
            case 55 -> 35;
            case 56 -> 7;
            case 57 -> 13;
            case 58 -> 58;
            case 59 -> 19;
            case 60 -> 34;
            case 61 -> 60;
            case 62 -> 14;
            default -> 22;
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
        _06.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "px>sr\bmm<2wT$+";
        objectArray[1] = " S$\u0007a\u001d\u0010m9\u0012c\\\u00151pV,";
        objectArray[2] = Double.TYPE;
        _06.c[2] = "java/lang/Double";
        objectArray[3] = "5*S2:;>%B}[55.F'";
        objectArray[4] = "Svq\u001bK\u0014\u0016)6}OxW- \u001c@E\u0017pv@";
        objectArray[5] = "g4N6`v\"k\tPc\u001aco\u001f1k'#2Im";
        objectArray[6] = "\u0017{}jugR$:\f~\u000bQ~yf3jZ/ ";
        objectArray[7] = "b316q\u007f'lvP{\u0013fh`1z.&56m";
        Object[] objectArray2 = objectArray;
        objectArray[8] = ">U|BH\u000b{\n;$Jg:\u000e-ECZzS{\u0019";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public double cfr_renamed_4() {
        long l2 = a ^ 0x40A2D1AAF740L;
        return (double)_06.a("\u00c0", (Object)this, 1554410368903004302L, (long)l2);
    }

    public double cfr_renamed_3() {
        long l2 = a ^ 0x19E7C074FD4EL;
        return (double)_06.a("\u00c0", (Object)this, 2278575077127982339L, (long)l2);
    }

    public double cfr_renamed_8() {
        long l2 = a ^ 0x6F78429B4ECL;
        return (double)_06.a("\u00c0", (Object)this, 6214236999867443207L, (long)l2);
    }

    public double cfr_renamed_9() {
        long l2 = a ^ 0x75893374C683L;
        return (double)_06.a("\u00c0", (Object)this, 2617312077866260609L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_06.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

