/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  net.minecraft.class_11280
 *  org.joml.Matrix4f
 */
package dev.krypton;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import dev.krypton._8I;
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
import org.joml.Matrix4f;

public class _8L {
    public static final int cfr_renamed_6;
    private static final _8I cfr_renamed_8;
    private static final class_11280 cfr_renamed_4;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(634457118755958856L, -2521219139681355416L, MethodHandles.lookup().lookupClass()).a(275620655595325L);
        long l2 = a ^ 0x6BD507B14642L;
        b = new Object[19];
        c = new String[19];
        _8L.a();
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
        byte[] byArray3 = cipher.doFinal("3\u0080\u001b\"\u009a\u00dbBJ\u00a0\u001a\u00df\u00ae\u00f4?+6\u0087,$F\u00ba\u00bc\u00aa\u001e".getBytes("ISO-8859-1"));
        String string = _8L.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = -156017185523118926L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                long l4 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                cfr_renamed_6 = (int)_8L.a("\u00dd", (Object)_8L.a("\u00dd", (Object)_8L.a("\u00dd", (Object)new Std140SizeCalculator(), -844894898893998872L, (long)l2), -844894898893998872L, (long)l2), -846311996174985398L, (long)l2);
                cfr_renamed_8 = new _8I();
                cfr_renamed_4 = new class_11280(string, (int)_8L.a("N", -846198312892156005L, (long)l2), (int)l4);
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8L.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8L.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8L.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8L.b(classArray[j], string, clazz2);
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
            int n = _8L.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _8L.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _8L.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _8L.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8L.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8L.a(clazz3, string2, clazz2)) != null) {
                    _8L.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8L.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8L.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8L.b(639582576827022L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8L.a(l2, l3);
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
                clazz3 = _8L.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8L.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8L.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8L.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8L.b(639582576827022L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8L.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8L.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8L.b(639582576827022L, 0L);
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
            if (c == '\u00e1' || c == '\u00fa' || c == 'N' || c == 'r') {
                field = _8L.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8L.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/8L" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = _8L.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            case 0 -> 50;
            case 1 -> 25;
            case 2 -> 17;
            case 3 -> 13;
            case 4 -> 61;
            case 5 -> 19;
            case 6 -> 34;
            case 7 -> 37;
            case 8 -> 58;
            case 9 -> 52;
            case 10 -> 14;
            case 11 -> 41;
            case 12 -> 62;
            case 13 -> 32;
            case 14 -> 55;
            case 15 -> 45;
            case 16 -> 51;
            case 17 -> 46;
            case 18 -> 60;
            case 19 -> 7;
            case 20 -> 57;
            case 21 -> 8;
            case 22 -> 20;
            case 23 -> 56;
            case 24 -> 10;
            case 25 -> 43;
            case 26 -> 63;
            case 27 -> 9;
            case 28 -> 24;
            case 29 -> 31;
            case 30 -> 59;
            case 31 -> 38;
            case 32 -> 26;
            case 33 -> 5;
            case 34 -> 36;
            case 35 -> 49;
            case 36 -> 15;
            case 37 -> 53;
            case 38 -> 54;
            case 39 -> 0;
            case 40 -> 12;
            case 41 -> 6;
            case 42 -> 1;
            case 43 -> 11;
            case 44 -> 35;
            case 45 -> 30;
            case 46 -> 16;
            case 47 -> 33;
            case 48 -> 47;
            case 49 -> 28;
            case 50 -> 23;
            case 51 -> 40;
            case 52 -> 21;
            case 53 -> 18;
            case 54 -> 27;
            case 55 -> 2;
            case 56 -> 48;
            case 57 -> 39;
            case 58 -> 42;
            case 59 -> 22;
            case 60 -> 29;
            case 61 -> 3;
            case 62 -> 44;
            default -> 4;
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
        _8L.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0006\u001biHuO\u000f\u0015j\u00016B\t\u0015~\u0003+DK\u0016q\u0000~E\u0017\u0007*5lDT@45qZ\u00007e\n{U\t\u0015p\tj";
        objectArray[1] = Integer.TYPE;
        _8L.c[1] = "java/lang/Integer";
        objectArray[2] = "U\u001fn>\u0011fH\nl\u007f\u0014:\t6";
        objectArray[3] = "a\u0011`2:\u001c|\u0004bs?@==";
        objectArray[4] = "\u0005oA6M \u0007q\bUF;\u0018t^,A";
        objectArray[5] = "b\t>fP b\t):\\/xB)$\\:\u007f3{y\u000fq<";
        objectArray[6] = "bp\n,2\u001ebp\u001dp>\u0011x;\u001dn>\u0004\u007fJO3mO<1\u001dn>\u0004\u007fJO3mO=";
        objectArray[7] = "=\u000bu z\u00024\u0005vi9\u000f2\u0005bk$\tp\u0006mhq\b,\u00176Ig\u0018\u001c\u0011~hr\u001f\r\bqmr";
        objectArray[8] = Void.TYPE;
        _8L.c[8] = "java/lang/Void";
        objectArray[9] = "b\u0019B`)\fi\u0016S/H\u0002b\u001dWu";
        objectArray[10] = "\u0011&a_/\u000e\u0016*}IO_(~*]2_L'j\u000f%";
        objectArray[11] = "t\u0000R\u0005\u0004Ev\u0010\u0015CfA\"\r\u000e\u001e\nspHWA\\$s\u001a^\u0010]_tA\u0017\u0004f\u0019t\u000b\u001e\u0013\u001bV*OQy";
        objectArray[12] = "A|pvdE\u0018<\"aY\u001c{vq35\u0011\u00053xpg";
        objectArray[13] = "XF>u\u0004LPC\"\u0017[\u001bO;~&\r\u0007RQ,hQ\u00173";
        objectArray[14] = "*|7_9G-p+IY\u0010\u0013'|\b(Jyu2T8";
        objectArray[15] = "\u00177x\u0001\u0016\u0015Nw*\u0016+I-=yDGASxp\u0007\u0015";
        objectArray[16] = "qEie@BsU.#\"F'H5~Ntu\rl!\u001a#wJ7w[\\1\u000bd\"\"";
        objectArray[17] = "\u0019\bc?c6\u0011\r\u007f]+q\u000e0s!obr\u001eg$1<H\u0016b8S";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "n=V=3\u007fi1J+S+Wd]o/q6fM(i";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static GpuBufferSlice cfr_renamed_7(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        Matrix4f matrix4f2 = (Matrix4f)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        _8L.a("\u00fa", (Object)_8L.a("N", 5501642047160725425L, (long)l2), (Matrix4f)matrix4f, 5501346187107101432L, (long)l2);
        _8L.a("\u00fa", (Object)_8L.a("N", 5501642047160725425L, (long)l2), (Matrix4f)matrix4f2, 5501247188725365017L, (long)l2);
        return _8L.a("\u00dd", (Object)_8L.a("N", 5503350154449865239L, (long)l2), (Object)_8L.a("N", 5501642047160725425L, (long)l2), 5501609652103086339L, (long)l2);
    }

    public static void cfr_renamed_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _8L.a("\u00dd", (Object)_8L.a("N", -8735644890492796788L, (long)l2), -8735736265516157787L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8L.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

