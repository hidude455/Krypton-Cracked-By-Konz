/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._8i_0;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9o;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _5L
extends _6x_0 {
    private final _9E cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @Override
    public native void cfr_renamed_5();

    public _5L(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x5A0F6D2CFB16L;
        long l5 = l3 ^ 0x4445A826CED9L;
        long l6 = l3 ^ 0x5B853B0221ABL;
        super((int)_5L.a("f", 4463, (long)(0x67A46E1D6C9D9325L ^ l2)), -1, (_4r)((Object)_5L.c("k", 7491581349286299333L, (long)l2)), l5);
        this.cfr_renamed_7 = new _9E((int)_5L.a("f", 16216, (long)(0x32A89210E5413D13L ^ l2)), l4, (Enum)((Object)_5L.c("k", 7490946994734105090L, (long)l2)), _8i_0.class);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5L.c("\u00da", (Object)this, 7491508396955407352L, (long)l2)};
        objectArray[0] = l6;
        _5L.c("\u00a2", (Object)this, (Object)objectArray, 7491026617828885243L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a.init(_5L.class, 4);
        b = l.a(-5499109081971741110L, 2067085154416448598L, MethodHandles.lookup().lookupClass()).a(129684933047291L);
        j = new Object[30];
        k = new String[30];
        _5L.b();
        f = new HashMap(13);
        long l2 = b ^ 0x2C9F1D956C62L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00cb\u0005iIy\u0097H\u00b8\u0094Wi\u0082X^'^";
        int n2 = "\u00cb\u0005iIy\u0097H\u00b8\u0094Wi\u0082X^'^".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[2];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 22;
            case 1 -> 21;
            case 2 -> 8;
            case 3 -> 18;
            case 4 -> 34;
            case 5 -> 13;
            case 6 -> 49;
            case 7 -> 29;
            case 8 -> 30;
            case 9 -> 14;
            case 10 -> 23;
            case 11 -> 31;
            case 12 -> 45;
            case 13 -> 57;
            case 14 -> 32;
            case 15 -> 51;
            case 16 -> 15;
            case 17 -> 63;
            case 18 -> 61;
            case 19 -> 59;
            case 20 -> 54;
            case 21 -> 53;
            case 22 -> 1;
            case 23 -> 10;
            case 24 -> 26;
            case 25 -> 28;
            case 26 -> 25;
            case 27 -> 33;
            case 28 -> 9;
            case 29 -> 39;
            case 30 -> 20;
            case 31 -> 43;
            case 32 -> 7;
            case 33 -> 46;
            case 34 -> 24;
            case 35 -> 42;
            case 36 -> 19;
            case 37 -> 47;
            case 38 -> 12;
            case 39 -> 58;
            case 40 -> 27;
            case 41 -> 62;
            case 42 -> 11;
            case 43 -> 3;
            case 44 -> 36;
            case 45 -> 41;
            case 46 -> 37;
            case 47 -> 5;
            case 48 -> 17;
            case 49 -> 0;
            case 50 -> 6;
            case 51 -> 50;
            case 52 -> 40;
            case 53 -> 48;
            case 54 -> 35;
            case 55 -> 16;
            case 56 -> 2;
            case 57 -> 38;
            case 58 -> 52;
            case 59 -> 60;
            case 60 -> 55;
            case 61 -> 4;
            case 62 -> 44;
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
        _5L.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "6nG8506nPd9?,%Pz9*+T\u0000'm";
        objectArray[1] = "\u0018|3\u000e.\u0017\u0018|$R\"\u0018\u00027$L\"\r\u0005Ft\u0010w";
        objectArray[2] = "\u000b3\u007f\u0013X0\u000b3hOT?\u0011xhQT*\u0016\t8\f\u0005";
        objectArray[3] = "EAo\u000fr\u000bEAxS~\u0004_\nxM~\u0011X{,\u0015)";
        objectArray[4] = "M\u0013g%ISP\u0006edL\u000f\u001f\u000e";
        objectArray[5] = Boolean.TYPE;
        _5L.k[5] = "java/lang/Boolean";
        objectArray[6] = Void.TYPE;
        _5L.k[6] = "java/lang/Void";
        objectArray[7] = "\u0014\u001aB\u0005G<\t\u000f@DB`D\r";
        objectArray[8] = "\u000e\t\"{n\u0006\u0013\u001c :kZ_ ";
        objectArray[9] = "&rXml!;gZ,i}{R";
        objectArray[10] = "\u00153y~=\n`\u0013rq,E\u0001\u001dyz(\u001fu";
        objectArray[11] = "O_4M_\rRJ6\fZQ\u0013S";
        objectArray[12] = ".w\txg\u0012[W\u0002wv]:Y\t|r\u0007N";
        objectArray[13] = "*|\u0002e;M!s\u0013*PO5p";
        objectArray[14] = Integer.TYPE;
        _5L.k[14] = "java/lang/Integer";
        objectArray[15] = "\u0004Cbi%v\u000fLs&Dx\u0004Gw|";
        objectArray[16] = "#\n\u007fe/C:Xg\u0018=S%\u0005zOj\u0002xX\u0016!b\ryZ\u007f\"6N*";
        objectArray[17] = "X\u001d'\u0018TrAO?eFb^\u0012\"2\u00113\u000fGN\\\u0019<\u0002M'_M\u007fQ";
        objectArray[18] = "\u0012\u000e 6K\u001aP\u000f?`0\tJ\r#7g^\u0014Z{[\n\u0005O[ :L\u0018\u0011\r";
        objectArray[19] = ">Ky\u0017U\"`\bz\u001b4l\u0000\u0005yEZ%p\u000bhAS]1\u000ey\u0004Kfp\u0005)\u00124";
        objectArray[20] = "x8_IR| 2R[*Z\u0005\u0013v&\u0016o&'EENe+5";
        objectArray[21] = "*/\u0018;{Yw5_)DZ\u0017j\u001d%.\u0007h4^&\"";
        objectArray[22] = "~\u0010h%^[-\u0006f|$\u001aDRd IX9\u0010e?\u001f";
        objectArray[23] = "+qK 7\u00032#S]%\u0013-~N\nrBq&\"dzMq!Kg.\u000e\"";
        objectArray[24] = "/Hk9\rxd\t?}oue\u0015; \u0006v\u001f\u0010e=V/#\u001a\"!\u0006\u0012";
        objectArray[25] = "-1Jm\u0001\u00124cR\u0010\u0013\u0002+>OGDR\u007fa#)L\\waJ*\u0018\u001f$";
        objectArray[26] = "\u0011\u0017\n/(Z\u0012CI|\u0013VEZUy\u007fd\u0012\u001d\t.*3\u0013B^ac]WDJ \u0013\u000fAB\btrPI\u001cZ\u001e";
        objectArray[27] = "\bZjxf\u001fJ[u.\u001d\fPYiyJ[\u000f\u00055\u0015v\tXIqdo[@";
        objectArray[28] = "b(.Wo,1> \u000e\u0015mXc \r{,(m1\trTd:(\b\u007f5;2vZ\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[29] = "\u0002Pj\u0016]>I\u0011>R?\u001aU\u001b$\u0000E82QjX@6X\u001a+\f\u0004";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00f1' || c == 'k' || c == '\u00f5') {
                field = _5L.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5L.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5L.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5L" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _5L.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5L.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5L.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5L.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5L.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5L.f(1069847510163148L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5L.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5L.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5L.f(1069847510163148L, 0L);
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

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _5L.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5L.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5L.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5L.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5L.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5L.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5L" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x65B9;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5L", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5L.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5L.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5L.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5L.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5L.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5L.c(clazz3, string2, clazz2)) != null) {
                    _5L.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5L.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5L.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5L.f(1069847510163148L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Exception decompiling
     */
    @_3i_0
    public void cfr_renamed_3(_9o var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 7[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5L.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(_5L.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

