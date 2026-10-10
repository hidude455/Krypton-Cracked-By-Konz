/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
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
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _4p {
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    private static int cfr_renamed_7;
    private static final long a;
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    public _4p(int n, char c, char c2, int n2, int n3) {
        long l2 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n3 << 32 >>> 32) ^ a;
        _4p.a("f", (Object)this, (int)n, -2106408514994640702L, (long)l2);
        _4p.a("f", (Object)this, (int)n2, -2106153194016451586L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-5539629538205369828L, -3978119648421800577L, MethodHandles.lookup().lookupClass()).a(267179220172643L);
        c = new Object[5];
        d = new String[5];
        _4p.a();
        long l2 = a ^ 0x5BBC5375339DL;
        _4p.cfr_renamed_8(68);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = -5268878313274548054L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        Object object2;
        block19: {
            CallSite callSite;
            block18: {
                Object object3;
                int n;
                long l2;
                block16: {
                    l2 = a ^ 0x23DA5AF874C2L;
                    n = _4p.cfr_renamed_7();
                    try {
                        try {
                            object3 = this;
                            if (n != 0) break block16;
                            if (object3 == object) {
                                return true;
                            }
                        }
                        catch (MatchException matchException) {
                            throw _4p.a(matchException);
                        }
                    }
                    catch (MatchException matchException) {
                        throw _4p.a(matchException);
                    }
                    object3 = object;
                }
                try {
                    boolean bl = object3 instanceof _4p;
                    if (n != 0) return bl;
                    if (!bl) return false;
                }
                catch (MatchException matchException) {
                    throw _4p.a(matchException);
                }
                _4p p = (_4p)object;
                if (n != 0) {
                    return false;
                }
                try {
                    try {
                        try {
                            object2 = _4p.a("i", (Object)this, -4514086248006825124L, (long)l2);
                            callSite = _4p.a("i", (Object)p, -4514086248006825124L, (long)l2);
                            if (n != 0) break block18;
                            if (object2 != callSite) break block19;
                        }
                        catch (MatchException matchException) {
                            throw _4p.a(matchException);
                        }
                        object2 = _4p.a("i", (Object)this, -4513937026081787808L, (long)l2);
                        if (n != 0) return (boolean)object2;
                    }
                    catch (MatchException matchException) {
                        throw _4p.a(matchException);
                    }
                    callSite = _4p.a("i", (Object)p, -4513937026081787808L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _4p.a(matchException);
                }
            }
            if (object2 == callSite) {
                object2 = true;
                return (boolean)object2;
            }
        }
        object2 = false;
        return (boolean)object2;
    }

    public int hashCode() {
        long l2 = a ^ 0x5F59C1BE6A34L;
        return (int)(_4p.a("i", (Object)this, -2329272524949039702L, (long)l2) * (int)b + _4p.a("i", (Object)this, -2329140890352783722L, (long)l2));
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4p.a(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _4p.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4p.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4p.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4p.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4p.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _4p.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _4p.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4p.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4p.a(clazz3, string2, clazz2)) != null) {
                    _4p.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4p.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4p.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4p.b(204165683794464L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4p.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4p.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4p.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4p.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4p.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4p.b(204165683794464L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4p.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4p.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4p.b(204165683794464L, 0L);
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
            if (c == 'i' || c == 'f' || c == 'a' || c == '\u00c6') {
                field = _4p.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'i' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4p.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4p.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4p" + " : " + string + " : " + methodType.toString(), exception);
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
        Object[] objectArray = c;
        c[0] = "\u0017dk(\u0002@\nqii\u0007\u001cGq";
        objectArray[1] = Integer.TYPE;
        _4p.d[1] = "java/lang/Integer";
        objectArray[2] = "\u001d \u000f\u001dK\r\u0016/\u001eR*\u0003\u001d$\u001a\b";
        objectArray[3] = "+1Z[\u0010\u001b&:\u0011`Ef#;R\\\u0016\u0001h+B\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "$\n[W0A)\u0001\u0010lj<,\u0000SP6[g\u0010C\u0012";
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 52;
            case 2 -> 19;
            case 3 -> 0;
            case 4 -> 57;
            case 5 -> 6;
            case 6 -> 27;
            case 7 -> 38;
            case 8 -> 55;
            case 9 -> 3;
            case 10 -> 7;
            case 11 -> 47;
            case 12 -> 54;
            case 13 -> 4;
            case 14 -> 40;
            case 15 -> 33;
            case 16 -> 12;
            case 17 -> 25;
            case 18 -> 59;
            case 19 -> 56;
            case 20 -> 18;
            case 21 -> 14;
            case 22 -> 35;
            case 23 -> 11;
            case 24 -> 5;
            case 25 -> 2;
            case 26 -> 26;
            case 27 -> 23;
            case 28 -> 49;
            case 29 -> 50;
            case 30 -> 29;
            case 31 -> 53;
            case 32 -> 17;
            case 33 -> 34;
            case 34 -> 51;
            case 35 -> 48;
            case 36 -> 31;
            case 37 -> 36;
            case 38 -> 21;
            case 39 -> 32;
            case 40 -> 8;
            case 41 -> 39;
            case 42 -> 1;
            case 43 -> 30;
            case 44 -> 10;
            case 45 -> 15;
            case 46 -> 63;
            case 47 -> 13;
            case 48 -> 43;
            case 49 -> 22;
            case 50 -> 60;
            case 51 -> 45;
            case 52 -> 28;
            case 53 -> 16;
            case 54 -> 37;
            case 55 -> 62;
            case 56 -> 41;
            case 57 -> 20;
            case 58 -> 42;
            case 59 -> 24;
            case 60 -> 61;
            case 61 -> 58;
            case 62 -> 44;
            default -> 9;
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
        _4p.d[n3] = new String(cArray);
        return n3;
    }

    public static int cfr_renamed_2() {
        return cfr_renamed_7;
    }

    public static int cfr_renamed_7() {
        int n = _4p.cfr_renamed_2();
        if (n == 0) {
            return 17;
        }
        return 0;
    }

    public static void cfr_renamed_8(int n) {
        cfr_renamed_7 = n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4p.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

