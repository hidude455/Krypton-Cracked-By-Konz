/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.krypton._8j;
import dev.krypton._95;
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

public class _9H
extends _95 {
    private final int cfr_renamed_3;
    private final int cfr_renamed_1;
    private int cfr_renamed_7;
    private int cfr_renamed_6;
    private static final long a = l.a(1854103645951634796L, -911697563463126135L, MethodHandles.lookup().lookupClass()).a(268125148825776L);
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public _9H(long l2, int n, char c) {
        long l3 = (l2 << 16 | (long)c << 48 >>> 48) ^ a;
        long l4 = l3 ^ 0x2E2C19AA0853L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        this.cfr_renamed_3 = (int)_9H.a("p", 16523, (long)(0x120AB97F29E37553L ^ l3));
        this.cfr_renamed_1 = (int)_9H.a("p", 1045, (long)(0x1292641850F5B1CCL ^ l3));
        _9H.c("\u00fb", (Object)this, (int)_9H.a("p", 1045, (long)(0x1292641850F5B1CCL ^ l3)), 5414616343278995435L, (long)l3);
        _9H.c("\u00fb", (Object)this, (int)_9H.a("p", 1045, (long)(0x1292641850F5B1CCL ^ l3)), 5413948028554438932L, (long)l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[26];
        j = new String[26];
        _9H.b();
        e = new HashMap(13);
        long l2 = a ^ 0x1FE9A545A386L;
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
        String string = ">\u000fmZ\u00c2V\u00ac\u0081\u00d0\t\u0016\u009d\u00c9\u00faP\u00ee";
        int n2 = ">\u000fmZ\u00c2V\u00ac\u0081\u00d0\t\u0016\u009d\u00c9\u00faP\u00ee".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
    }

    private static int e(long l2, long l3) {
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
            case 0 -> 11;
            case 1 -> 23;
            case 2 -> 39;
            case 3 -> 55;
            case 4 -> 41;
            case 5 -> 47;
            case 6 -> 16;
            case 7 -> 31;
            case 8 -> 8;
            case 9 -> 51;
            case 10 -> 49;
            case 11 -> 56;
            case 12 -> 42;
            case 13 -> 13;
            case 14 -> 57;
            case 15 -> 20;
            case 16 -> 43;
            case 17 -> 50;
            case 18 -> 1;
            case 19 -> 12;
            case 20 -> 25;
            case 21 -> 60;
            case 22 -> 30;
            case 23 -> 52;
            case 24 -> 58;
            case 25 -> 40;
            case 26 -> 18;
            case 27 -> 7;
            case 28 -> 32;
            case 29 -> 62;
            case 30 -> 28;
            case 31 -> 63;
            case 32 -> 36;
            case 33 -> 34;
            case 34 -> 35;
            case 35 -> 59;
            case 36 -> 29;
            case 37 -> 61;
            case 38 -> 15;
            case 39 -> 0;
            case 40 -> 27;
            case 41 -> 38;
            case 42 -> 24;
            case 43 -> 45;
            case 44 -> 26;
            case 45 -> 17;
            case 46 -> 4;
            case 47 -> 54;
            case 48 -> 10;
            case 49 -> 46;
            case 50 -> 53;
            case 51 -> 6;
            case 52 -> 22;
            case 53 -> 2;
            case 54 -> 3;
            case 55 -> 19;
            case 56 -> 33;
            case 57 -> 14;
            case 58 -> 48;
            case 59 -> 37;
            case 60 -> 9;
            case 61 -> 5;
            case 62 -> 44;
            default -> 21;
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
        _9H.j[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "\u000b>9k,,\u0016+;*)pV\u0013";
        objectArray[1] = Integer.TYPE;
        _9H.j[1] = "java/lang/Integer";
        objectArray[2] = "?sP6x=\"fRw}ab#";
        objectArray[3] = "pAaC4Q\u0005ajL%\u001edoaG!D\u0010";
        objectArray[4] = Void.TYPE;
        _9H.j[4] = "java/lang/Void";
        objectArray[5] = "([v3*_$SwxcW8[u3\u0007C$ZT\u007f'U(@";
        objectArray[6] = "p!'\u0014:E{.6[G]h)?\u0012";
        objectArray[7] = Boolean.TYPE;
        _9H.j[7] = "java/lang/Boolean";
        objectArray[8] = "B\u0017_i\\C77TfM\fV9_mIV\"";
        objectArray[9] = "Iz\n[\"aEr\u000b\u0010kiYz\t[\u000f}E{\"\u0019 cO{\u0013";
        objectArray[10] = "h{_JS6ctN\u00053/oxLY";
        objectArray[11] = "\u0001\u000b:p[\u000f\n\u0004+?<\r\u001f\u000f+t\u0007";
        objectArray[12] = "N{\u0004\u0018\t^Et\u0015WhPN\u007f\u0011\r";
        objectArray[13] = "f+&0d?:3'.\u0014&4*Ms*(6-.){>lQptt<93|.j ]";
        objectArray[14] = "\u0018L)Q\u0005\u000b\u0012P61Bi\u001eXiXE\u0005EA$]|R\u0012N$Z\u0002\b^J31";
        objectArray[15] = "XP\rL\u0018vRL\u0012,]\u0014\u0018CMF\u000bf\u0019[\u0003";
        objectArray[16] = "H\"%Wi@\t9xQ\u0015D\r\u0000<[sb\u001c *Wi%Ky'FqGG#9Z\u0015";
        objectArray[17] = "\u007f`^~,Z#x_`\\J(vm{;[)`Ip\\\u001fzt^}?E+b\u0004\u0001cG%vD{ ]:&5:mM6qK`!I!\u001a";
        objectArray[18] = "=2 dc;}|/\"\u0013}k' 6Tm\u00028\"dyip9:*\u0013<s>b++|=1$[";
        objectArray[19] = "/&1\tegn=l\u000f\u0019m|:\u001a\u0019XdmF(\u001d&h{4)\u0005h\u0002";
        objectArray[20] = "-\u0010LN2g'\fS.q\u0005m\u0003\fD!wl\u001bB";
        objectArray[21] = "\u0016E\u000052X\u001cY\u001fUp:VV@?!HWN\u000e";
        objectArray[22] = "6v\u0018G+Lk9E\u0005\u0016\u0007\u000f9\u0000A\u007f\u0005cb\u0019\fz<45\u0016\f}Bny\u0012\u001b\u0016";
        objectArray[23] = "s0oUMu2+2S1\u007f ,DEsk*6JTS}&,\r\u0005K{2 tYSz,P";
        objectArray[24] = "z^?9\"k&F>'R},XTzl|*X7 =jp$j&0y=A+=m\u007fA";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "\u0013Q{n$\u0011\u0019Md\u000elsSB;d7\u0001RZu";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9H.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'a' || c == '\u00fb' || c == 'W' || c == 'y') {
                field = _9H.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'a' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9H.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Method h(long l2, long l3) {
        int n = _9H.e(l2, l3);
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
                clazz3 = _9H.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9H.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9H.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9H.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9H.f(903293897382463L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9H.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9H.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9H.f(903293897382463L, 0L);
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
            int n = _9H.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _9H.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9H.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9H.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9H.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9H.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _9H.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7EFE;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/9H", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _9H.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _9H.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _9H.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9H.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9H.c(clazz3, string2, clazz2)) != null) {
                    _9H.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9H.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9H.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9H.f(903293897382463L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l3 = (l2 = a ^ l2) ^ 0x3151735F930CL;
        _9H.c("\u00fb", (Object)this, (int)n, -8976085215894466655L, (long)l2);
        _9H.c("\u00fb", (Object)this, (int)n2, -8977877608125750946L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9H.c("C", (Object)this, (Object)objectArray2, -8977657639072145732L, (long)l2);
    }

    public int int_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9H.c("a", (Object)this, 4527573141643352520L, (long)l2);
    }

    public int int_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9H.c("a", (Object)this, 6263231894411780601L, (long)l2);
    }

    public int int_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9H.c("a", (Object)this, -7517897408806439523L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean boolean_5(Object[] objectArray) {
        Object object;
        block8: {
            CallSite callSite;
            block7: {
                long l2 = (Long)objectArray[0];
                String string = _8j.cfr_renamed_3();
                try {
                    try {
                        try {
                            object = _9H.c("a", (Object)this, 6337311751855233853L, (long)l2);
                            callSite = _9H.c("a", (Object)this, 6337777331903672553L, (long)l2);
                            if (string != null) break block7;
                            if (object != callSite) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _9H.a(matchException);
                        }
                        object = _9H.c("a", (Object)this, 6337697835495978434L, (long)l2);
                        if (string != null) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw _9H.a(matchException);
                    }
                    callSite = _9H.c("a", (Object)this, 6338568417973346533L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _9H.a(matchException);
                }
            }
            if (object == callSite) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    @Override
    public void void_7(Object[] objectArray) {
        block13: {
            Object object;
            Object object2;
            long l2;
            long l3;
            block16: {
                block17: {
                    Object object3;
                    CallSite callSite;
                    String string;
                    block14: {
                        block15: {
                            JsonElement jsonElement;
                            block12: {
                                JsonElement jsonElement2 = (JsonElement)objectArray[0];
                                l3 = (Long)objectArray[1];
                                l2 = l3 ^ 0x1C0DC0BA60D1L;
                                string = _8j.cfr_renamed_3();
                                try {
                                    try {
                                        jsonElement = jsonElement2;
                                        if (string != null) break block12;
                                        if (_9H.c("C", (Object)jsonElement, -1466463893925705611L, (long)l3) == false) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw _9H.a(matchException);
                                    }
                                    jsonElement = jsonElement2;
                                }
                                catch (MatchException matchException) {
                                    throw _9H.a(matchException);
                                }
                            }
                            callSite = _9H.c("C", (Object)jsonElement, -1465977980546317153L, (long)l3);
                            try {
                                try {
                                    object3 = _9H.c("C", (Object)callSite, (Object)"x", -1467751453986258016L, (long)l3);
                                    if (string != null) break block14;
                                    if (object3 == false) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw _9H.a(matchException);
                                }
                                object3 = _9H.c("C", (Object)_9H.c("C", (Object)callSite, (Object)"x", -1467003487256204445L, (long)l3), -1466208127351021137L, (long)l3);
                                break block14;
                            }
                            catch (MatchException matchException) {
                                throw _9H.a(matchException);
                            }
                        }
                        object3 = -1;
                    }
                    object2 = object3;
                    try {
                        try {
                            object = _9H.c("C", (Object)callSite, (Object)"y", -1467751453986258016L, (long)l3);
                            if (string != null) break block16;
                            if (object == false) break block17;
                        }
                        catch (MatchException matchException) {
                            throw _9H.a(matchException);
                        }
                        object = _9H.c("C", (Object)_9H.c("C", (Object)callSite, (Object)"y", -1467003487256204445L, (long)l3), -1466208127351021137L, (long)l3);
                        break block16;
                    }
                    catch (MatchException matchException) {
                        throw _9H.a(matchException);
                    }
                }
                object = -1;
            }
            Object object4 = object;
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = (int)object4;
            objectArray2[1] = (int)object2;
            objectArray2[0] = l2;
            _9H.c("C", (Object)this, (Object)objectArray2, -1467726529254758064L, (long)l3);
        }
    }

    public int int_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9H.c("a", (Object)this, -5065768862620338819L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        JsonObject jsonObject = new JsonObject();
        _9H.c("C", (Object)jsonObject, (Object)"x", (Object)_9H.c("\u00f9", (int)_9H.c("a", (Object)this, -4042888423366341845L, (long)l2), -4043222235034089368L, (long)l2), -4043268177794303951L, (long)l2);
        _9H.c("C", (Object)jsonObject, (Object)"y", (Object)_9H.c("\u00f9", (int)_9H.c("a", (Object)this, -4043555671932181036L, (long)l2), -4043222235034089368L, (long)l2), -4043268177794303951L, (long)l2);
        return jsonObject;
    }

    public boolean boolean_8(Object[] objectArray) {
        Object object;
        block8: {
            block7: {
                String string;
                block6: {
                    long l2 = (Long)objectArray[0];
                    l2 = a ^ l2;
                    string = _8j.cfr_renamed_3();
                    try {
                        try {
                            object = _9H.c("a", (Object)this, 4728666413683592528L, (long)l2);
                            if (string != null) break block6;
                            if (object < 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _9H.a(matchException);
                        }
                        object = _9H.c("a", (Object)this, 4726871822160421807L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _9H.a(matchException);
                    }
                }
                try {
                    if (string != null) break block8;
                    if (object < 0) break block7;
                }
                catch (MatchException matchException) {
                    throw _9H.a(matchException);
                }
                object = true;
                break block8;
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x4B8C2EA3470L;
        _9H.c("\u00fb", (Object)this, (int)_9H.c("a", (Object)this, 2599797948578874121L, (long)l2), 2599350920941414621L, (long)l2);
        _9H.c("\u00fb", (Object)this, (int)_9H.c("a", (Object)this, 2600554966158332677L, (long)l2), 2599735906404304418L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9H.c("C", (Object)this, (Object)objectArray2, 2599920694867130816L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9H.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_9H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

