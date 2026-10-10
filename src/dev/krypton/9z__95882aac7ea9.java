/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  3B
 */
package dev.krypton;

import dev.krypton._32;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.krypton.9z
 */
public class _9z_0
implements _9 {
    private final _9 cfr_renamed_4;
    private float cfr_renamed_9;
    private static final long a = l.a(2544463912246572210L, 7709428892742921858L, MethodHandles.lookup().lookupClass()).a(148524530128813L);
    private static final Object[] b = new Object[9];
    private static final String[] c = new String[9];

    @Override
    public void cfr_renamed_5() {
        long l2 = a ^ 0x425881024DC6L;
        _9z_0.a("I", (Object)this, 4075834243669997136L, (long)l2).cfr_renamed_5();
    }

    public _9z_0(_9 var1_1, long l2) {
        l2 = a ^ l2;
        _9z_0.a("H", (Object)this, 1.0f, 8828373368289065253L, (long)l2);
        this.cfr_renamed_4 = var1_1;
    }

    static {
        _9z_0.a();
    }

    @Override
    public void cfr_renamed_1(_3B b) throws _91 {
        long l2 = a ^ 0x7896C2A9365CL;
        _9z_0.a("I", (Object)this, 4830813635548401098L, (long)l2).cfr_renamed_1(b);
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9z_0.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9z_0.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9z_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9z_0.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9z_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9z_0.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9z_0.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9z_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9z_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9z_0.a(clazz3, string2, clazz2)) != null) {
                    _9z_0.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9z_0.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9z_0.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9z_0.b(318762827952590L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9z_0.a(l2, l3);
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
                clazz3 = _9z_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9z_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9z_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9z_0.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9z_0.b(318762827952590L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9z_0.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9z_0.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9z_0.b(318762827952590L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9z_0.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == 'H' || c == '\u00f1' || c == 'v') {
                field = _9z_0.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9z_0.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static _91 a(_91 var0) {
        return var0;
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
            case 0 -> 59;
            case 1 -> 14;
            case 2 -> 6;
            case 3 -> 42;
            case 4 -> 61;
            case 5 -> 27;
            case 6 -> 4;
            case 7 -> 31;
            case 8 -> 22;
            case 9 -> 25;
            case 10 -> 10;
            case 11 -> 55;
            case 12 -> 48;
            case 13 -> 21;
            case 14 -> 60;
            case 15 -> 8;
            case 16 -> 32;
            case 17 -> 46;
            case 18 -> 57;
            case 19 -> 18;
            case 20 -> 37;
            case 21 -> 9;
            case 22 -> 23;
            case 23 -> 24;
            case 24 -> 56;
            case 25 -> 52;
            case 26 -> 35;
            case 27 -> 19;
            case 28 -> 29;
            case 29 -> 33;
            case 30 -> 45;
            case 31 -> 28;
            case 32 -> 20;
            case 33 -> 38;
            case 34 -> 41;
            case 35 -> 43;
            case 36 -> 44;
            case 37 -> 34;
            case 38 -> 47;
            case 39 -> 16;
            case 40 -> 39;
            case 41 -> 11;
            case 42 -> 50;
            case 43 -> 51;
            case 44 -> 15;
            case 45 -> 12;
            case 46 -> 40;
            case 47 -> 63;
            case 48 -> 0;
            case 49 -> 58;
            case 50 -> 7;
            case 51 -> 36;
            case 52 -> 3;
            case 53 -> 54;
            case 54 -> 53;
            case 55 -> 17;
            case 56 -> 2;
            case 57 -> 13;
            case 58 -> 30;
            case 59 -> 5;
            case 60 -> 1;
            case 61 -> 26;
            case 62 -> 62;
            default -> 49;
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
        _9z_0.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\\ d\u0011G@W/u^$MB)";
        objectArray[1] = Float.TYPE;
        _9z_0.c[1] = "java/lang/Float";
        objectArray[2] = "j+>d\u001bjw><%\u001e674";
        objectArray[3] = "R";
        objectArray[4] = "Mg\u0005\rcTFh\u0014B\u0002ZMc\u0010\u0018";
        objectArray[5] = "#SI,8OuB@R9G?>Vc9M X\u0010l1.4\u000fH13Hr\u0000@R'\u001f*]B4a\u0010\">";
        objectArray[6] = "6qd5(\f6}g&WO\u000fl'-4\u001fi*(%";
        objectArray[7] = ")O\u0004qV\u0011\u007f^\r\u000fW\u0011#\"\u001b>W\u0013*D]1_p>\u0013\u0005l]\u0016x\u001c\r\u000fIA A\u000fi\u000fN(\"";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "\b6^M\u0004l\b:]^{(1jF\tGlJ:^_\u001f";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_4(short[] var1_1, int var2_2, int var3_3) throws _91 {
        block11: {
            block9: {
                block10: {
                    var4_4 = _9z_0.a ^ 126443849262751L;
                    var6_5 = _32.cfr_renamed_2();
                    try {
                        v0 = this;
                        if (var6_5 == 0) break block9;
                        if (_9z_0.a("I", (Object)v0, (long)6037852220109246571L, (long)var4_4) < 1.0f) {
                        }
                        ** GOTO lbl25
                    }
                    catch (_91 v1) {
                        throw _9z_0.a(v1);
                    }
                    var7_6 = new short[var3_3];
                    for (var8_7 = 0; var8_7 < var3_3; ++var8_7) {
                        try {
                            var7_6[var8_7] = (short)((float)var1_1[var2_2 + var8_7] * _9z_0.a("I", (Object)this, (long)6037852220109246571L, (long)var4_4));
                            if (var6_5 != 0) {
                                if (var6_5 != 0) continue;
                                break;
                            }
                            break block10;
                        }
                        catch (_91 v2) {
                            throw _9z_0.a(v2);
                        }
                    }
                    _9z_0.a("I", (Object)this, (long)6037485413510733065L, (long)var4_4).cfr_renamed_4(var7_6, 0, var3_3);
                }
                try {
                    if (var6_5 != 0) break block11;
lbl25:
                    // 2 sources

                    v0 = _9z_0.a("I", (Object)this, (long)6037485413510733065L, (long)var4_4);
                }
                catch (_91 v3) {
                    throw _9z_0.a(v3);
                }
            }
            v0.cfr_renamed_4(var1_1, var2_2, var3_3);
        }
    }

    public void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        l2 = a ^ l2;
        _9z_0.a("H", (Object)this, (float)_9z_0.a("\u00d1", 0.0f, (float)_9z_0.a("\u00d1", 1.0f, (float)f, 1459598999177212361L, (long)l2), 1459470022104690182L, (long)l2), 1459709445318973408L, (long)l2);
    }

    @Override
    public boolean cfr_renamed_6() {
        long l2 = a ^ 0x721EF26BF614L;
        return _9z_0.a("I", (Object)this, -8988492301039104638L, (long)l2).cfr_renamed_6();
    }

    @Override
    public int int_8() {
        long l2 = a ^ 0x7271CFFA4A6AL;
        return _9z_0.a("I", (Object)this, 4556646180832588284L, (long)l2).int_8();
    }

    @Override
    public void void_8() {
        long l2 = a ^ 0x15F5C59E53DBL;
        _9z_0.a("I", (Object)this, 2777896384245704781L, (long)l2).void_8();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9z_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

