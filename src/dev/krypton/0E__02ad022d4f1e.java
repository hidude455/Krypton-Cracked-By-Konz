/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._8B;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface _0E {
    public static final long b = l.a(-8599843512100121243L, -6458992453426235300L, MethodHandles.lookup().lookupClass()).a(73498131583708L);
    public static final Object[] i = new Object[26];
    public static final String[] j = new String[26];

    default public double double_1(Object[] objectArray) {
        String string = (String)objectArray[0];
        double d = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d2 = (Double)objectArray[3];
        _8B b = (_8B)objectArray[4];
        long l3 = (l2 = _0E.b ^ l2) ^ 0x2229AECB9960L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = false;
        objectArray2[4] = b;
        objectArray2[3] = d2;
        objectArray2[2] = d;
        objectArray2[1] = string;
        objectArray2[0] = l3;
        return (double)_0E.c("\u00fd", (Object)this, (Object)objectArray2, 1941561231423880020L, (long)l2);
    }

    default public void void_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x37C7FF2E3A45L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = true;
        objectArray2[1] = false;
        objectArray2[0] = 1.0;
        _0E.c("\u00fd", (Object)this, (Object)objectArray2, 6607900428885377026L, (long)l2);
    }

    static {
        _0E.a();
    }

    public double double_9(Object[] var1);

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0E.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0E.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0E.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0E.b(classArray[j], string, clazz2);
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
            int n = _0E.a(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0E.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _0E.a(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0E.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0E.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0E.a(clazz3, string2, clazz2)) != null) {
                    _0E.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0E.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0E.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0E.b(1174816587091511L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0E" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l2, long l3) {
        int n = _0E.a(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0E.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0E.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0E.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0E.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0E.b(1174816587091511L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0E.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0E.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0E.b(1174816587091511L, 0L);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "XN\u0016mb3E[\u0014,go\fn";
        objectArray[1] = "\"H\u0018\u001f\"yWh\u0013\u0010366f\u0018\u001b7lB";
        objectArray[2] = Double.TYPE;
        _0E.j[2] = "java/lang/Double";
        objectArray[3] = "#D1\u00068qVd:\t)>7j1\u0002-dC";
        objectArray[4] = "&\u0015f\",`-\u001awmQx>\u001d~$";
        objectArray[5] = Integer.TYPE;
        _0E.j[5] = "java/lang/Integer";
        objectArray[6] = "O^\tj\u0014x:~\u0002e\u00057[p\tn\u0001m/";
        objectArray[7] = Void.TYPE;
        _0E.j[7] = "java/lang/Void";
        objectArray[8] = "\u001cY\u0005\u0010\u0013h\u0001L\u0007Q\u00164N\t";
        objectArray[9] = "\u0003`d9\rH\u001eufx\b\u0014^w";
        objectArray[10] = "Lhu\u0005-,Q}wD(p\u0018E";
        objectArray[11] = "<=\u0006@\u001cj!(\u0004\u0001\u00196h\u0019";
        objectArray[12] = "k\tj%UDv\u001chdP\u0018<=";
        objectArray[13] = Long.TYPE;
        _0E.j[13] = "java/lang/Long";
        objectArray[14] = Boolean.TYPE;
        _0E.j[14] = "java/lang/Boolean";
        objectArray[15] = "O\u0000n)\u0013\u0002: e&\u0002M[.n-\u0006\u0017/";
        objectArray[16] = "\u0002L5^[|\tC$\u0011:r\u0002H K";
        objectArray[17] = "/p\u001bU:#f2\u0014S\u0006wy&\u001aQf\u0013/ L\u0010vnvy\u001fL\u0006";
        objectArray[18] = "|F18\u0001\u0004(\u0002i;c\u000fA\u0004w8^G*Td}\u0007";
        objectArray[19] = "\u001elM\u001bMe\u0012wZy\b\u0014\u001be\u001aAOy\u0019`\u001f\u00036.J0^\tSl\u001c7\\y";
        objectArray[20] = "xd\u0017P\u0016!t\u007f\u00002]P}m@\n\u0014=\u007fhEHmj,8\u0004B\b(z?\u00062";
        objectArray[21] = "\u001c&Y\\lk\u0014!\u0000D\u0002k,o\u0010\u0013}?\u0016g\u0017Je";
        objectArray[22] = "Pg\r-mb\\|\u001aO.\u0013UnZwo~Wk_5\u0016.\fcZr\u007fbMm\nO";
        objectArray[23] = "mel\u001eoI=v)G\u001d\u0018S(?\u001a%\u001an$m\u001dc\":'$LwB!z,L\u001d";
        objectArray[24] = "Z`3PLqV{$2\u0006\u0000_id\nNm]laH7:\u000e< BRxX;\"2";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "\u001f\u0001g\u0016\u0001vGX\u007fZpw \b1\u0013\u001e'\u0019]9T\u0001";
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 33;
            case 1 -> 28;
            case 2 -> 9;
            case 3 -> 31;
            case 4 -> 42;
            case 5 -> 15;
            case 6 -> 20;
            case 7 -> 56;
            case 8 -> 36;
            case 9 -> 58;
            case 10 -> 11;
            case 11 -> 39;
            case 12 -> 29;
            case 13 -> 22;
            case 14 -> 19;
            case 15 -> 4;
            case 16 -> 45;
            case 17 -> 54;
            case 18 -> 53;
            case 19 -> 1;
            case 20 -> 34;
            case 21 -> 52;
            case 22 -> 8;
            case 23 -> 38;
            case 24 -> 0;
            case 25 -> 35;
            case 26 -> 37;
            case 27 -> 17;
            case 28 -> 26;
            case 29 -> 47;
            case 30 -> 23;
            case 31 -> 44;
            case 32 -> 25;
            case 33 -> 6;
            case 34 -> 49;
            case 35 -> 55;
            case 36 -> 2;
            case 37 -> 32;
            case 38 -> 14;
            case 39 -> 51;
            case 40 -> 10;
            case 41 -> 43;
            case 42 -> 46;
            case 43 -> 16;
            case 44 -> 57;
            case 45 -> 40;
            case 46 -> 27;
            case 47 -> 7;
            case 48 -> 63;
            case 49 -> 12;
            case 50 -> 50;
            case 51 -> 21;
            case 52 -> 60;
            case 53 -> 24;
            case 54 -> 3;
            case 55 -> 41;
            case 56 -> 18;
            case 57 -> 61;
            case 58 -> 62;
            case 59 -> 5;
            case 60 -> 13;
            case 61 -> 30;
            case 62 -> 59;
            default -> 48;
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
        _0E.j[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0E.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            if (c == '\u00f2' || c == 'e' || c == '\u00e5' || c == 'm') {
                field = _0E.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0E.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    default public double double_0(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        boolean bl = (Boolean)objectArray[2];
        long l3 = (l2 = b ^ l2) ^ 0x737BD842DD7AL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = bl;
        objectArray2[2] = (int)_0E.c("\u00fd", string, 7279512379788407095L, (long)l2);
        objectArray2[1] = l3;
        objectArray2[0] = string;
        return (double)_0E.c("\u00fd", (Object)this, (Object)objectArray2, 7279867887978336734L, (long)l2);
    }

    public void void_0(Object[] var1);

    public double cfr_renamed_2(Object[] var1);

    default public void cfr_renamed_3(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x44B88A55AD03L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = false;
        objectArray2[1] = false;
        objectArray2[0] = d;
        _0E.c("\u00fd", (Object)this, (Object)objectArray2, -3677882812496160956L, (long)l2);
    }

    public static _0E cfr_renamed_6(Object[] objectArray) {
        CallSite callSite;
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x3A55C7802328L;
        try {
            callSite = _0E.c("\u00fd", (Object)_0E.c("\u00e5", -1250920958346549438L, (long)l2), (long)l3, -1251272530846042257L, (long)l2) != false ? _0E.c("\u00e5", -1251710611980213425L, (long)l2) : _0E.c("\u00e5", -1251403620533914206L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _0E.a(matchException);
        }
        return callSite;
    }

    default public void void_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x475F1D8E3D22L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = false;
        objectArray2[1] = false;
        objectArray2[0] = 1.0;
        _0E.c("\u00fd", (Object)this, (Object)objectArray2, 6689124139686250341L, (long)l2);
    }

    default public double double_4(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x77819A62BC4AL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = false;
        objectArray2[2] = (int)_0E.c("\u00fd", string, 303431169997328391L, (long)l2);
        objectArray2[1] = l3;
        objectArray2[0] = string;
        return (double)_0E.c("\u00fd", (Object)this, (Object)objectArray2, 303796971072172270L, (long)l2);
    }

    public boolean boolean_5(Object[] var1);

    default public double double_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x71ED3B63BEABL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = false;
        objectArray2[0] = l3;
        return (double)_0E.c("\u00fd", (Object)this, (Object)objectArray2, 9020535689220381861L, (long)l2);
    }

    public void cfr_renamed_9(Object[] var1);

    public void void_8(Object[] var1);

    public double double_8(Object[] var1);

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0E.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

