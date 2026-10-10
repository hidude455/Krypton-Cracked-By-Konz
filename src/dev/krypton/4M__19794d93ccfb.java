/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 */
package dev.krypton;

import com.mojang.blaze3d.vertex.VertexFormatElement;
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

public abstract class _4M {
    public static final VertexFormatElement cfr_renamed_0;
    private static final long a;
    private static final String b;
    private static final long c;
    private static final Object[] d;
    private static final String[] e;

    private _4M() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(4502640558458625135L, 1162209038089491027L, MethodHandles.lookup().lookupClass()).a(13553719680013L);
        long l2 = a ^ 0x16A9392505D1L;
        long l3 = l2 ^ 0x4DBBCE980079L;
        d = new Object[12];
        e = new String[12];
        _4M.a();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("5\u00c9\u00b0\u009c\u00ea }\u0013\r\u00aaT\u009b\u0089\u00dc\u00c1X\u00d98\u0006\u00f3\"F\u00db\u00b8\u00a5\u00a3\u0093 \u00df\u00da\u0087\u0017\u007fE\u009d}t\u00d5\u0002,\u00d4\u00bb\u000b4\u00ebv\u0018\u00fa".getBytes("ISO-8859-1"));
        b = _4M.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l4 = -2341061453358996808L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l4 >>> 56), (byte)(l4 >>> 48), (byte)(l4 >>> 40), (byte)(l4 >>> 32), (byte)(l4 >>> 24), (byte)(l4 >>> 16), (byte)(l4 >>> 8), (byte)l4});
                c = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                cfr_renamed_0 = _4M.a("Y", (int)_4M.a("Y", (Object)objectArray, 8955622749545496111L, (long)l2), 0, (Object)_4M.a("\u00c0", 8956519542614236247L, (long)l2), (Object)_4M.a("\u00c0", 8955441494570207405L, (long)l2), 2, 8955604241304243599L, (long)l2);
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4M.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4M.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4M.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4M.b(classArray[j], string, clazz2);
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
            int n = _4M.a(l2, l3);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                _4M.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _4M.a(l2, l3);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = _4M.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4M.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4M.a(clazz3, string2, clazz2)) != null) {
                    _4M.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4M.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4M.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4M.b(435655934337851L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4M.a(l2, l3);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = _4M.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4M.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4M.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4M.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4M.b(435655934337851L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4M.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4M.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4M.b(435655934337851L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e2' || c == '\u00e1' || c == '\u00c0' || c == '\u00cf') {
                field = _4M.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4M.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _4M.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 63;
            case 2 -> 49;
            case 3 -> 2;
            case 4 -> 57;
            case 5 -> 29;
            case 6 -> 59;
            case 7 -> 42;
            case 8 -> 4;
            case 9 -> 61;
            case 10 -> 7;
            case 11 -> 31;
            case 12 -> 32;
            case 13 -> 5;
            case 14 -> 37;
            case 15 -> 11;
            case 16 -> 43;
            case 17 -> 12;
            case 18 -> 56;
            case 19 -> 46;
            case 20 -> 22;
            case 21 -> 40;
            case 22 -> 3;
            case 23 -> 15;
            case 24 -> 14;
            case 25 -> 35;
            case 26 -> 16;
            case 27 -> 50;
            case 28 -> 1;
            case 29 -> 39;
            case 30 -> 24;
            case 31 -> 36;
            case 32 -> 34;
            case 33 -> 45;
            case 34 -> 54;
            case 35 -> 25;
            case 36 -> 47;
            case 37 -> 53;
            case 38 -> 19;
            case 39 -> 48;
            case 40 -> 38;
            case 41 -> 51;
            case 42 -> 60;
            case 43 -> 41;
            case 44 -> 58;
            case 45 -> 26;
            case 46 -> 52;
            case 47 -> 21;
            case 48 -> 6;
            case 49 -> 62;
            case 50 -> 18;
            case 51 -> 20;
            case 52 -> 10;
            case 53 -> 30;
            case 54 -> 33;
            case 55 -> 44;
            case 56 -> 28;
            case 57 -> 0;
            case 58 -> 13;
            case 59 -> 8;
            case 60 -> 55;
            case 61 -> 27;
            case 62 -> 17;
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
        _4M.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "Y\\7\u0000:4PR4Iy9VR Kd?\u0014E?\\#>B\u001d\fK%/_K\u001cA%6[G\u001fB26_].";
        objectArray[1] = Integer.TYPE;
        _4M.e[1] = "java/lang/Integer";
        objectArray[2] = "U\u000e[r<6\\\u0000X;\u007f;Z\u0000L9b=\u0018\u0017S.%<NO`9#-S\u0019p3#4W\u0015s044S\u000fBx\u0004*W\u0006S";
        objectArray[3] = "\u0015L>erX\u001cB=,1U\u001aB).,SXU69kR\u000e\r\u0005.mC\u0013[\u0015$mZ\u0017W\u0016'zZ\u0013M'oKN\u0006F";
        objectArray[4] = "IK$fV\u0016T^&'SJ\u0019c";
        objectArray[5] = "h4\u001f\nX*\u001d\u0014\u0014\u0005Ie|\u001a\u001f\u000eM?\b";
        objectArray[6] = "\u0004f&_\u0003N\u000fi7\u0010b@\u0004b3J";
        objectArray[7] = "\u001a\"M>\u0017w\u0011t\u000f=-DdX=\\-0\u001d&J:P;KdI";
        objectArray[8] = "\tX|x\u0018EQG/p&|wz\u0004@gcv!|e\u001f@\u000e@$zLH";
        objectArray[9] = "\u0002PS\u0000^C\u0010TRr]P(\u0001k\u0000T\u001b\t\u0000U\u0017\u000b^i\u0006VJEH\u000b\u0014RK7";
        objectArray[10] = ";!x\u001a(A)%yh;N?};\u0014,YPn#R!Nny|\u0017AQ3& \u0005\u007fFlc@R|\u001an&=Y*Xm\u001cy\u0011xGn}!\u000e+OPn#R!Nny|\u0017AHm$2\u0001#Zi%@";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "\"'q=pLt}\u007f/N\u0015\u0019vf)6\u0016r-t;3/k.%0#\u0011|q`P";
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (j >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int cfr_renamed_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        int n = 0;
        while (_4M.a("Y", (int)n, 408200760415691551L, (long)l2) != null) {
            if (++n < (int)c) continue;
            throw new RuntimeException(b);
        }
        return n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4M.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

