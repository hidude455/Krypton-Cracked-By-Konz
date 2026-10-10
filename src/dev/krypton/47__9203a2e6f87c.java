/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11280$class_11281
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
import java.nio.ByteBuffer;
import net.minecraft.class_11280;

public class _47
implements class_11280.class_11281 {
    float cfr_renamed_0;
    float cfr_renamed_5;
    float cfr_renamed_6;
    private static final long a = l.a(7595651809806991932L, 1582048217675796071L, MethodHandles.lookup().lookupClass()).a(9770895904858L);
    private static final Object[] b = new Object[11];
    private static final String[] c = new String[11];

    public void method_71104(ByteBuffer byteBuffer) {
        long l2 = a ^ 0x7B8B2F06840L;
        _47.a("p", (Object)_47.a("p", (Object)_47.a("L", (Object)byteBuffer, 1021044415683521359L, (long)l2), (float)_47.a("b", (Object)this, 1020313065366002151L, (long)l2), (float)_47.a("b", (Object)this, 1020228112299451413L, (long)l2), 1020070151103632706L, (long)l2), (float)_47.a("b", (Object)this, 1020942749868136131L, (long)l2), 1021189813488218496L, (long)l2);
    }

    private _47() {
    }

    static {
        _47.a();
    }

    public boolean equals(Object object) {
        return false;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _47.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _47.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _47.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _47.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _47.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _47.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _47.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _47.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _47.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _47.a(clazz3, string2, clazz2)) != null) {
                    _47.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _47.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _47.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _47.b(312010013276239L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _47.a(l2, l3);
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
                clazz3 = _47.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _47.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _47.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _47.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _47.b(312010013276239L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _47.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _47.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _47.b(312010013276239L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _47.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00f6' || c == 'r' || c == 'Z') {
                field = _47.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _47.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/47" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "r\u0006F\u001b\u00133o\u0013DZ\u0016o\"T";
        objectArray[1] = Float.TYPE;
        _47.c[1] = "java/lang/Float";
        objectArray[2] = ":\u0004-\\Va3\n.\u0015\u0015l5\n:\u0017\bjw\t5\u0014]k+\u0018n!Ojh_p0Ng5\u000f%\u0000";
        objectArray[3] = "9Bi,V{:L1\u000f\u0001a6aj+\u001ep!";
        objectArray[4] = "\"F66ns)I'y\u000f}\"B##";
        objectArray[5] = ".X+Yq&*Tc\u0006\u0011>jT\u0005\u000bz|\u0017\u0011f\u0019/\u007fiA1\u000bxF.\u0015$X(8~B6\u000f\u0011\u007fgXd\u0006q{k\u0010;f";
        objectArray[6] = "i<DJm\fi|J7$36}X\t-Mf*J^";
        objectArray[7] = "A)7\u0011 \u000eAi9l`1\u001eh+R`ON?9\u0005";
        objectArray[8] = "j|\u0005\u0002N*npM].+5p\u0012wS$=a\u000f=\u0014)ii\u0004\u0006\u001ev!pu\u0004^:ll\u0015\u0000Rr3\f";
        objectArray[9] = "\u0002Alc\\Q\u0002\u0001b\u001e\u001en]\u0000p \u001c\u0010\rWbw";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "v!u\u000e7ar-=QWy2-KU0h3Q<\f(?v/l[:hOhuAha/ly\t7\u0001";
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
            case 0 -> 41;
            case 1 -> 51;
            case 2 -> 57;
            case 3 -> 21;
            case 4 -> 35;
            case 5 -> 20;
            case 6 -> 48;
            case 7 -> 27;
            case 8 -> 28;
            case 9 -> 24;
            case 10 -> 36;
            case 11 -> 7;
            case 12 -> 39;
            case 13 -> 14;
            case 14 -> 17;
            case 15 -> 13;
            case 16 -> 33;
            case 17 -> 11;
            case 18 -> 8;
            case 19 -> 4;
            case 20 -> 5;
            case 21 -> 29;
            case 22 -> 9;
            case 23 -> 15;
            case 24 -> 18;
            case 25 -> 43;
            case 26 -> 23;
            case 27 -> 30;
            case 28 -> 59;
            case 29 -> 44;
            case 30 -> 46;
            case 31 -> 34;
            case 32 -> 62;
            case 33 -> 0;
            case 34 -> 6;
            case 35 -> 25;
            case 36 -> 54;
            case 37 -> 56;
            case 38 -> 40;
            case 39 -> 38;
            case 40 -> 58;
            case 41 -> 42;
            case 42 -> 22;
            case 43 -> 32;
            case 44 -> 19;
            case 45 -> 37;
            case 46 -> 53;
            case 47 -> 63;
            case 48 -> 31;
            case 49 -> 3;
            case 50 -> 2;
            case 51 -> 47;
            case 52 -> 49;
            case 53 -> 45;
            case 54 -> 55;
            case 55 -> 60;
            case 56 -> 1;
            case 57 -> 10;
            case 58 -> 12;
            case 59 -> 52;
            case 60 -> 61;
            case 61 -> 16;
            case 62 -> 26;
            default -> 50;
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
        _47.c[n3] = new String(cArray);
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_47.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

