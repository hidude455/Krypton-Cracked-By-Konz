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

public class _9J
extends Record {
    private final float cfr_renamed_5;
    private final float cfr_renamed_4;
    private final float cfr_renamed_0;
    private final float cfr_renamed_6;
    private final float cfr_renamed_8;
    private final float cfr_renamed_1;
    private final float cfr_renamed_9;
    private final float cfr_renamed_3;
    private final float cfr_renamed_7;
    private static final long a = l.a(-715301706267513557L, -5353670880311864508L, MethodHandles.lookup().lookupClass()).a(208881945455536L);
    private static final Object[] b = new Object[12];
    private static final String[] c = new String[12];

    private _9J(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.cfr_renamed_5 = f;
        this.cfr_renamed_4 = f2;
        this.cfr_renamed_0 = f3;
        this.cfr_renamed_6 = f4;
        this.cfr_renamed_8 = f5;
        this.cfr_renamed_1 = f6;
        this.cfr_renamed_9 = f7;
        this.cfr_renamed_3 = f8;
        this.cfr_renamed_7 = f9;
    }

    static {
        _9J.a();
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_9J.class, "1;0;8;3;5;9;7;2;4", "1", "0", "8", "3", "5", "9", "7", "2", "4"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_9J.class, "1;0;8;3;5;9;7;2;4", "1", "0", "8", "3", "5", "9", "7", "2", "4"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_9J.class, "1;0;8;3;5;9;7;2;4", "1", "0", "8", "3", "5", "9", "7", "2", "4"}, this);
    }

    public float cfr_renamed_1() {
        long l2 = a ^ 0x1DF7E476EAC8L;
        return (float)_9J.a("B", (Object)this, 1350602895700159941L, (long)l2);
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9J.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _9J.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9J.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9J.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9J.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9J.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9J.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _9J.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9J.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9J.a(clazz3, string2, clazz2)) != null) {
                    _9J.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9J.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9J.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9J.b(148597573920164L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9J.a(l2, l3);
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
                clazz3 = _9J.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9J.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9J.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9J.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9J.b(148597573920164L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9J.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9J.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9J.b(148597573920164L, 0L);
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
            throw new RuntimeException("dev/krypton/9J" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9J.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == 'l' || c == 'W' || c == '\u00e4') {
                field = _9J.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9J.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "4\u0000p[G\u001f)\u0015r\u001aBCi/";
        objectArray[1] = Float.TYPE;
        _9J.c[1] = "java/lang/Float";
        objectArray[2] = "\t\u0001}\fdO\u0002\u000elC\u0005A\t\u0005h\u0019";
        objectArray[3] = "i\u0014\u0011Q\u0000Hu\u0005\u0014kH-zC[\u0019\u001a\u0012dCT";
        objectArray[4] = "]mG`T\u001eA|BZ\u0019{N:\r(NDP:\u0002";
        objectArray[5] = "\bj\bnf}\u0014{\rT-\u0018\u001b=B&|'\u0005=M";
        objectArray[6] = "%[@tE!9JEN\u0005D6\f\n<_{(\f\u0005";
        objectArray[7] = "FjA9\\jZ{D\u0003\u0015\u000fU=\u000bqF0K=\u0004";
        objectArray[8] = "\u00138@\bK\u001b\u000f)E2\u0001~\u0000o\n@QA\u001eo\u0005";
        objectArray[9] = "_\u0014-\u0014?/C\u0005(.pJLCg\\%uRCh";
        objectArray[10] = "cD/u'T\u007fU*Ok1p\u0013e==\u000en\u0013j";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "K\u0018\u0012\u000b4\u0003W\t\u00171ufXOXC.YFOW";
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
            case 0 -> 21;
            case 1 -> 35;
            case 2 -> 5;
            case 3 -> 59;
            case 4 -> 48;
            case 5 -> 8;
            case 6 -> 22;
            case 7 -> 18;
            case 8 -> 14;
            case 9 -> 36;
            case 10 -> 23;
            case 11 -> 60;
            case 12 -> 63;
            case 13 -> 44;
            case 14 -> 37;
            case 15 -> 12;
            case 16 -> 28;
            case 17 -> 55;
            case 18 -> 53;
            case 19 -> 19;
            case 20 -> 17;
            case 21 -> 27;
            case 22 -> 56;
            case 23 -> 6;
            case 24 -> 3;
            case 25 -> 51;
            case 26 -> 15;
            case 27 -> 20;
            case 28 -> 13;
            case 29 -> 25;
            case 30 -> 62;
            case 31 -> 61;
            case 32 -> 46;
            case 33 -> 1;
            case 34 -> 38;
            case 35 -> 40;
            case 36 -> 7;
            case 37 -> 24;
            case 38 -> 41;
            case 39 -> 10;
            case 40 -> 30;
            case 41 -> 29;
            case 42 -> 11;
            case 43 -> 47;
            case 44 -> 57;
            case 45 -> 54;
            case 46 -> 34;
            case 47 -> 50;
            case 48 -> 31;
            case 49 -> 0;
            case 50 -> 49;
            case 51 -> 26;
            case 52 -> 33;
            case 53 -> 16;
            case 54 -> 32;
            case 55 -> 4;
            case 56 -> 58;
            case 57 -> 9;
            case 58 -> 52;
            case 59 -> 39;
            case 60 -> 45;
            case 61 -> 2;
            case 62 -> 43;
            default -> 42;
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
        _9J.c[n3] = new String(cArray);
        return n3;
    }

    public float cfr_renamed_4() {
        long l2 = a ^ 0xB1BDAB174AFL;
        return (float)_9J.a("B", (Object)this, -8297453263987504967L, (long)l2);
    }

    public float cfr_renamed_2() {
        long l2 = a ^ 0x3859AF54CB4EL;
        return (float)_9J.a("B", (Object)this, 3691614772039199262L, (long)l2);
    }

    public float cfr_renamed_3() {
        long l2 = a ^ 0x45BA76C1ED2DL;
        return (float)_9J.a("B", (Object)this, 1538185184927414626L, (long)l2);
    }

    public float cfr_renamed_6() {
        long l2 = a ^ 0x356F7A4C62CCL;
        return (float)_9J.a("B", (Object)this, -7297818527480768898L, (long)l2);
    }

    public float cfr_renamed_7() {
        long l2 = a ^ 0x570DA5A3C3DEL;
        return (float)_9J.a("B", (Object)this, 4298854329815027108L, (long)l2);
    }

    public float cfr_renamed_8() {
        long l2 = a ^ 0x28EA3547F53BL;
        return (float)_9J.a("B", (Object)this, 958847927381015217L, (long)l2);
    }

    public float cfr_renamed_9() {
        long l2 = a ^ 0x31343F00B9F4L;
        return (float)_9J.a("B", (Object)this, 4720113495718490019L, (long)l2);
    }

    public float cfr_renamed_0() {
        long l2 = a ^ 0x3597F9AE3C2FL;
        return (float)_9J.a("B", (Object)this, -4298390872346561559L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9J.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

