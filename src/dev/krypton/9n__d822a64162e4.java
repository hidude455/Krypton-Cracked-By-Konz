/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._4;
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

public class _9n {
    private double[] cfr_renamed_8;
    private int cfr_renamed_7;
    private static final long a = l.a(6078703246481343509L, -4150434603456234913L, MethodHandles.lookup().lookupClass()).a(189058264165047L);
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    private _9n(long l2) {
        l2 = a ^ l2;
        _9n.a("\u00e0", (Object)this, (double[])new double[(int)b], -43421958058552959L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = new Object[10];
        d = new String[10];
        _9n.a();
        long l2 = a ^ 0x1C941A4F8563L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = 7336262391830577241L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9n.a(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _9n.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9n.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9n.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9n.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9n.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9n.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _9n.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9n.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9n.a(clazz3, string2, clazz2)) != null) {
                    _9n.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9n.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9n.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9n.b(464234907951595L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _9n.a(l2, l3);
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
                clazz3 = _9n.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9n.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9n.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9n.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9n.b(464234907951595L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9n.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9n.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9n.b(464234907951595L, 0L);
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
            if (c == '\u00e8' || c == '\u00e0' || c == '\u00d9' || c == '\u00ba') {
                field = _9n.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9n.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/9n" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9n.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 4;
            case 1 -> 41;
            case 2 -> 59;
            case 3 -> 17;
            case 4 -> 18;
            case 5 -> 55;
            case 6 -> 60;
            case 7 -> 0;
            case 8 -> 56;
            case 9 -> 52;
            case 10 -> 30;
            case 11 -> 2;
            case 12 -> 19;
            case 13 -> 32;
            case 14 -> 50;
            case 15 -> 38;
            case 16 -> 54;
            case 17 -> 24;
            case 18 -> 33;
            case 19 -> 8;
            case 20 -> 16;
            case 21 -> 10;
            case 22 -> 36;
            case 23 -> 61;
            case 24 -> 11;
            case 25 -> 42;
            case 26 -> 27;
            case 27 -> 45;
            case 28 -> 25;
            case 29 -> 48;
            case 30 -> 20;
            case 31 -> 37;
            case 32 -> 57;
            case 33 -> 35;
            case 34 -> 62;
            case 35 -> 21;
            case 36 -> 47;
            case 37 -> 3;
            case 38 -> 63;
            case 39 -> 58;
            case 40 -> 7;
            case 41 -> 43;
            case 42 -> 1;
            case 43 -> 22;
            case 44 -> 5;
            case 45 -> 26;
            case 46 -> 23;
            case 47 -> 13;
            case 48 -> 39;
            case 49 -> 29;
            case 50 -> 9;
            case 51 -> 34;
            case 52 -> 51;
            case 53 -> 6;
            case 54 -> 14;
            case 55 -> 31;
            case 56 -> 12;
            case 57 -> 28;
            case 58 -> 46;
            case 59 -> 40;
            case 60 -> 53;
            case 61 -> 49;
            case 62 -> 44;
            default -> 15;
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
        _9n.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = ")0\bB\u0005 4%\n\u0003\u0000|t;";
        objectArray[1] = "zs";
        objectArray[2] = Integer.TYPE;
        _9n.d[2] = "java/lang/Integer";
        objectArray[3] = "CZ\u0013\u0014?~]R\t[Py[Z\u001c\u0006";
        objectArray[4] = "|=";
        objectArray[5] = "\u0006A";
        objectArray[6] = "v7M\u00156,}8\\ZW\"v3X\u0000";
        objectArray[7] = "jz&\"WVd<\u007fB\u001a?0$7.@Uj'?(";
        objectArray[8] = "^WBXB(P\u0011\u001b8\u000eA\u0006\u000bI^\u0002(G\u0019O\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "Rk\u001d\u001aFZQgC\u0016&H\u000f#\u0002=H#S9\u000b\u0016AI\t:\u0003\u0010&\u001a\b9\u0015JO[\u001a?Lz\u001dA\u00107\u0014\u0010GB\u00181s";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    void cfr_renamed_3(Object[] objectArray) {
        _9n n;
        long l2;
        double d;
        block4: {
            block5: {
                d = (Double)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                String string = _4.cfr_renamed_3();
                try {
                    try {
                        n = this;
                        if (string == null) break block4;
                        if (_9n.a("\u00e8", (Object)n, -7792819881314185583L, (long)l2) != ((CallSite)_9n.a("\u00e8", (Object)this, -7793017725932487363L, (long)l2)).length) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _9n.a(matchException);
                    }
                    _9n.a("\u00e0", (Object)this, (double[])_9n.a("\u00e1", (Object)_9n.a("\u00e8", (Object)this, -7793017725932487363L, (long)l2), (int)(_9n.a("\u00e8", (Object)this, -7792819881314185583L, (long)l2) * 2), -7792856786087478776L, (long)l2), -7793017725932487363L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _9n.a(matchException);
                }
            }
            n = this;
        }
        CallSite callSite = _9n.a("\u00e8", (Object)n, -7793017725932487363L, (long)l2);
        _9n n2 = this;
        CallSite callSite2 = _9n.a("\u00e8", (Object)n2, -7792819881314185583L, (long)l2);
        _9n.a("\u00e0", (Object)n2, (int)(callSite2 + true), -7792819881314185583L, (long)l2);
        callSite[callSite2] = (CallSite)d;
    }

    double[] cfr_renamed_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9n.a("\u00e1", (Object)_9n.a("\u00e8", (Object)this, 1932849027765122102L, (long)l2), (int)_9n.a("\u00e8", (Object)this, 1932378228655392666L, (long)l2), 1932411835435053827L, (long)l2);
    }

    int cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9n.a("\u00e8", (Object)this, -8953350973262029068L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9n.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

