/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._6W;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;

public class _01
extends HashSet {
    final _6W cfr_renamed_3;
    private static final long a = l.a(8614241514867101010L, 8172161609209913872L, MethodHandles.lookup().lookupClass()).a(75364317585397L);
    private static final Object[] b = new Object[16];
    private static final String[] c = new String[16];

    _01(_6W w, long l2) {
        l2 = a ^ l2;
        this.cfr_renamed_3 = w;
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6066140929157326842L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065760593219986773L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065250194165525831L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065704156337937322L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6066301045231435194L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065479588163220729L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065412047679406583L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065553028508855740L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6066089442295919887L, (long)l2), -6065617152845917259L, (long)l2);
        _01.a("\u00a4", (Object)this, (Object)_01.a("A", -6065345804327050273L, (long)l2), -6065617152845917259L, (long)l2);
    }

    static {
        _01.a();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _01.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _01.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _01.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _01.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _01.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _01.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _01.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _01.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _01.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _01.a(clazz3, string2, clazz2)) != null) {
                    _01.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _01.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _01.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _01.b(231345706363065L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _01.a(l2, l3);
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
                clazz3 = _01.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _01.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _01.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _01.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _01.b(231345706363065L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _01.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _01.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _01.b(231345706363065L, 0L);
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
            if (c == 'Y' || c == 'u' || c == 'A' || c == 'B') {
                field = _01.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _01.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _01.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/01" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
            case 0 -> 30;
            case 1 -> 32;
            case 2 -> 4;
            case 3 -> 33;
            case 4 -> 44;
            case 5 -> 46;
            case 6 -> 51;
            case 7 -> 28;
            case 8 -> 50;
            case 9 -> 56;
            case 10 -> 25;
            case 11 -> 63;
            case 12 -> 16;
            case 13 -> 38;
            case 14 -> 61;
            case 15 -> 20;
            case 16 -> 24;
            case 17 -> 40;
            case 18 -> 2;
            case 19 -> 13;
            case 20 -> 41;
            case 21 -> 47;
            case 22 -> 3;
            case 23 -> 49;
            case 24 -> 18;
            case 25 -> 31;
            case 26 -> 19;
            case 27 -> 11;
            case 28 -> 23;
            case 29 -> 8;
            case 30 -> 26;
            case 31 -> 37;
            case 32 -> 29;
            case 33 -> 5;
            case 34 -> 43;
            case 35 -> 12;
            case 36 -> 62;
            case 37 -> 58;
            case 38 -> 22;
            case 39 -> 36;
            case 40 -> 7;
            case 41 -> 14;
            case 42 -> 53;
            case 43 -> 42;
            case 44 -> 48;
            case 45 -> 6;
            case 46 -> 34;
            case 47 -> 15;
            case 48 -> 35;
            case 49 -> 57;
            case 50 -> 59;
            case 51 -> 9;
            case 52 -> 39;
            case 53 -> 17;
            case 54 -> 52;
            case 55 -> 21;
            case 56 -> 27;
            case 57 -> 10;
            case 58 -> 1;
            case 59 -> 54;
            case 60 -> 55;
            case 61 -> 60;
            case 62 -> 0;
            default -> 45;
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
        _01.c[n3] = new String(cArray);
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
        Object[] objectArray = b;
        b[0] = "\u0013\u0014{)3l\u0013\u0014lu?c\t_lk?v\u000e.=5j3";
        objectArray[1] = "],ar\u0014h],v.\u0018gGgv0\u0018r@\u0016'nM9";
        objectArray[2] = "Y?Kq\u001e\u0003D*I0\u001b_\rk";
        objectArray[3] = "L?8\u0011\u0004~G0)^epL;-\u0004";
        objectArray[4] = Boolean.TYPE;
        _01.c[4] = "java/lang/Boolean";
        objectArray[5] = "'xr2}h'aH!\"j)k\u001fv}<v<Hvsd};v0sm&";
        objectArray[6] = ":1&t\n}:(\u001cgU\u007f4\"K0\f)it\u001c0\u0004q`r\"v\u0004x;";
        objectArray[7] = "|\u001ardz[|\u0003Hw%Yr\t\u001f |\f-YH tW&Yvft^}";
        objectArray[8] = "X?\u0007\u001a<PX&=\tcRV,j^:\u0003\u0002}=^2\\\u0002|\u0003\u00182UY";
        objectArray[9] = "\u00058r9\t3\u0005!H*V1\u000b+\u001f}\tgT{H}\u0007?_{v;\u00076\u0004";
        objectArray[10] = "AgxUf!A~BF9#Ot\u0015\u0011fu\u0011(B\u0011h-\u001b$|Wh$@";
        objectArray[11] = "x/\u001b\u00101bx6!\u0003n`v<vT70,h!T?n\"l\u001f\u0012?gy";
        objectArray[12] = "Q\u007f]\u0006G>Qfg\u0015\u0018<_l0BAh\u000b9gBI2\u000b<Y\u0004I;P";
        objectArray[13] = "\u001b\u001f\u000f\u001cV\u001f\u001b\u00065\u000f\t\u001d\u0015\fbXPLM[5XX\u0013A\\\u000b\u001eX\u001a\u001a";
        objectArray[14] = "$ 6*Qn$9\f9\u000el*3[nW;~e\fn_b~c2(_k%";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "e?\u000fg\\L1)\nt?J0(r4V\u001bb>JcSDmDI?BY8|\u00152FY\\";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_01.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

