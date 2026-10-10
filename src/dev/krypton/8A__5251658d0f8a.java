/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  net.minecraft.class_11280
 */
package dev.krypton;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import dev.krypton._47;
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
import net.minecraft.class_11280;

public class _8A {
    public static final int cfr_renamed_9;
    private static final _47 cfr_renamed_8;
    private static final class_11280 cfr_renamed_2;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public static void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _8A.a("\u00f2", (Object)_8A.a("N", 778193074092500022L, (long)l2), 777548549150970777L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(-5257170059165924191L, -7760134057095044724L, MethodHandles.lookup().lookupClass()).a(242830213578934L);
        long l2 = a ^ 0x3F0437729B0AL;
        b = new Object[21];
        c = new String[21];
        _8A.a();
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
        byte[] byArray3 = cipher.doFinal("\u00c4\u008b\u00cd\u00a1\u0005\u00b8\u00e4j\u00c4q\u0091]\u00df\u00b1\u008eQ`zE\u00b5\u00e9?\u00d2h".getBytes("ISO-8859-1"));
        String string = _8A.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = -4132039024966015306L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                long l4 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                cfr_renamed_9 = (int)_8A.a("\u00f2", (Object)_8A.a("\u00f2", (Object)_8A.a("\u00f2", (Object)new Std140SizeCalculator(), -6216376471608183589L, (long)l2), -6216543447931685508L, (long)l2), -6215605172914760675L, (long)l2);
                cfr_renamed_8 = new _47();
                cfr_renamed_2 = new class_11280(string, (int)_8A.a("N", -6215770936358151906L, (long)l2), (int)l4);
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8A.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8A.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8A.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8A.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8A.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8A.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8A.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8A.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8A.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8A.a(clazz3, string2, clazz2)) != null) {
                    _8A.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8A.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8A.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8A.b(663592045583500L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8A.a(l2, l3);
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
                clazz3 = _8A.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8A.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8A.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8A.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8A.b(663592045583500L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8A.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8A.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8A.b(663592045583500L, 0L);
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
            throw new RuntimeException("dev/krypton/8A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8A.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00d8' || c == 'N' || c == '\u00fb') {
                field = _8A.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8A.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            case 0 -> 55;
            case 1 -> 21;
            case 2 -> 46;
            case 3 -> 9;
            case 4 -> 2;
            case 5 -> 45;
            case 6 -> 24;
            case 7 -> 48;
            case 8 -> 59;
            case 9 -> 33;
            case 10 -> 62;
            case 11 -> 23;
            case 12 -> 39;
            case 13 -> 54;
            case 14 -> 50;
            case 15 -> 60;
            case 16 -> 5;
            case 17 -> 6;
            case 18 -> 34;
            case 19 -> 37;
            case 20 -> 26;
            case 21 -> 58;
            case 22 -> 56;
            case 23 -> 13;
            case 24 -> 40;
            case 25 -> 14;
            case 26 -> 12;
            case 27 -> 30;
            case 28 -> 44;
            case 29 -> 42;
            case 30 -> 47;
            case 31 -> 38;
            case 32 -> 3;
            case 33 -> 41;
            case 34 -> 18;
            case 35 -> 29;
            case 36 -> 49;
            case 37 -> 25;
            case 38 -> 51;
            case 39 -> 1;
            case 40 -> 57;
            case 41 -> 27;
            case 42 -> 10;
            case 43 -> 61;
            case 44 -> 22;
            case 45 -> 0;
            case 46 -> 15;
            case 47 -> 4;
            case 48 -> 17;
            case 49 -> 43;
            case 50 -> 35;
            case 51 -> 32;
            case 52 -> 20;
            case 53 -> 11;
            case 54 -> 16;
            case 55 -> 19;
            case 56 -> 7;
            case 57 -> 28;
            case 58 -> 53;
            case 59 -> 52;
            case 60 -> 63;
            case 61 -> 8;
            case 62 -> 31;
            default -> 36;
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
        _8A.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "#\u0003wB<\u001e>\u0016u\u00039BsQ";
        objectArray[1] = Float.TYPE;
        _8A.c[1] = "java/lang/Float";
        objectArray[2] = "\u001bxsc[J\u0006mq\"^\u0016G\\";
        objectArray[3] = "W\u000ej8\f\u0003W\u000e}d\u0000\fME}z\u0000\u0019J4/'SR\t";
        objectArray[4] = "g?7VEeg? \nIj}t \u0014I\u007fz\u0005rI\u001a49~ \u0014I\u007fz\u0005rI\u001a48";
        objectArray[5] = "Oq5\u0016r\nF\u007f6_1\u0007@\u007f\"],\u0001\u0002|-^y\u0000^mv\u007fo\u0010nk>^z\u0017\u007fr1[z";
        objectArray[6] = "\fZq;B\u0000\u0005Trr\u0001\r\u0003Tfp\u001c\u000bAWisI\n\u001dF2F[\u000b^\u0001,FF\u0015\nv}yL\u001a\u0003Thz]";
        objectArray[7] = Integer.TYPE;
        _8A.c[7] = "java/lang/Integer";
        objectArray[8] = Void.TYPE;
        _8A.c[8] = "java/lang/Void";
        objectArray[9] = "S0?\u0005/8X?.JN6S4*\u0010";
        objectArray[10] = "Km\u001dB5H\u00146\u0007C\u0004O\u001c*\u0004^h}No]\u0001>*Jk^Ch\u0011\u00160^W\u0004\u0016J0\u001dCfM@)X9";
        objectArray[11] = "n\u007fP$\b%i|L\u0014ZWsaVpV%5n\n";
        objectArray[12] = "r}!\u0005B\t9`t\u00032NK #\u000f_\rq%b\u0002\u0003";
        objectArray[13] = "oD!-,\u000fhG=\u001dw}rZ'yr\u000f4U{";
        objectArray[14] = "\f1_\u001dGu\u000b9\u0019\u000by~]}$ZD`]}\u001e_\u0005m\u0001\u0001";
        objectArray[15] = "\u001b\u0016\"7F*P\u000bw16l\"L&5Mc@\u0013}/L";
        objectArray[16] = "\nRl+*\nAO9-ZO3V(1j\u0010AQ+-";
        objectArray[17] = "_\"rW;zX*4A\u0005f\u001enGIbw\u001f\u00125\u001d~d]v2\u00158rc";
        objectArray[18] = "\u000fN\u000b\u00141\u0012\bM\u0017$h`\u0012P\r@o\u0012T_Q";
        objectArray[19] = "j\u0006g]3\\m\u000e!K\r@+JBJf\u0002V\n,\\w\u00062\r$\u001aa8";
        Object[] objectArray2 = objectArray;
        objectArray[20] = "f\\K\u0014Nq9\u0007Q\u0015\u007fv1\u001bR\b\u0013Dc^\u000bWG\u0013a\u001fI\u0001@je\u0000H\u0005\u007f";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static GpuBufferSlice cfr_renamed_9(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        long l2 = (Long)objectArray[2];
        float f3 = ((Float)objectArray[3]).floatValue();
        l2 = a ^ l2;
        _8A.a("\u00d8", (Object)_8A.a("N", 7774166455073611638L, (long)l2), (float)f, 7774796333185261812L, (long)l2);
        _8A.a("\u00d8", (Object)_8A.a("N", 7774166455073611638L, (long)l2), (float)f2, 7774401291001762808L, (long)l2);
        _8A.a("\u00d8", (Object)_8A.a("N", 7774166455073611638L, (long)l2), (float)f3, 7774324127593939979L, (long)l2);
        return _8A.a("\u00f2", (Object)_8A.a("N", 7774541095276938526L, (long)l2), (Object)_8A.a("N", 7774166455073611638L, (long)l2), 7774859140320655708L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8A.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

