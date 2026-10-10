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
import dev.krypton._0f_0;
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

public class _44 {
    public static final int cfr_renamed_6;
    private static final _0f_0 cfr_renamed_5;
    private static final class_11280 cfr_renamed_8;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(193695948551221928L, -3747540576823946700L, MethodHandles.lookup().lookupClass()).a(13167440392720L);
        long l2 = a ^ 0x52BBEE2D746FL;
        b = new Object[28];
        c = new String[28];
        _44.a();
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
        byte[] byArray3 = cipher.doFinal("\u00b1\f\u00b7l\u00d0iY!\u0097\"\u00150w\u0097V\u0004\u001d\u00b16\u0088l\u00ceO`\u00ef\u00c9\u0098z\u00c8\f*\u00a5".getBytes("ISO-8859-1"));
        String string = _44.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = 4368428825088660897L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                long l4 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                cfr_renamed_6 = (int)_44.a("\u00d0", (Object)_44.a("\u00d0", (Object)_44.a("\u00d0", (Object)_44.a("\u00d0", (Object)new Std140SizeCalculator(), 3985311538422988287L, (long)l2), 3985311538422988287L, (long)l2), 3985311538422988287L, (long)l2), 3983559660702420499L, (long)l2);
                cfr_renamed_5 = new _0f_0();
                cfr_renamed_8 = new class_11280(string, (int)_44.a("\u00e3", 3985488381013389248L, (long)l2), (int)l4);
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _44.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _44.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _44.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _44.b(classArray[j], string, clazz2);
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
            int n = _44.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _44.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _44.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _44.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _44.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _44.a(clazz3, string2, clazz2)) != null) {
                    _44.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _44.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _44.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _44.b(669846374060894L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _44.a(l2, l3);
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
                clazz3 = _44.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _44.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _44.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _44.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _44.b(669846374060894L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _44.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _44.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _44.b(669846374060894L, 0L);
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
            if (c == '\u00c6' || c == '\u00de' || c == '\u00e3' || c == '\u00f2') {
                field = _44.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _44.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '$' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/44" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = _44.a(lookup, mutableCallSite, string, methodType, l2, l3);
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
            case 0 -> 46;
            case 1 -> 59;
            case 2 -> 28;
            case 3 -> 42;
            case 4 -> 41;
            case 5 -> 7;
            case 6 -> 2;
            case 7 -> 11;
            case 8 -> 38;
            case 9 -> 12;
            case 10 -> 37;
            case 11 -> 60;
            case 12 -> 39;
            case 13 -> 33;
            case 14 -> 49;
            case 15 -> 36;
            case 16 -> 57;
            case 17 -> 35;
            case 18 -> 22;
            case 19 -> 55;
            case 20 -> 52;
            case 21 -> 48;
            case 22 -> 32;
            case 23 -> 13;
            case 24 -> 27;
            case 25 -> 34;
            case 26 -> 3;
            case 27 -> 63;
            case 28 -> 17;
            case 29 -> 50;
            case 30 -> 5;
            case 31 -> 19;
            case 32 -> 1;
            case 33 -> 56;
            case 34 -> 29;
            case 35 -> 15;
            case 36 -> 47;
            case 37 -> 61;
            case 38 -> 20;
            case 39 -> 25;
            case 40 -> 62;
            case 41 -> 45;
            case 42 -> 6;
            case 43 -> 40;
            case 44 -> 8;
            case 45 -> 30;
            case 46 -> 0;
            case 47 -> 9;
            case 48 -> 51;
            case 49 -> 18;
            case 50 -> 21;
            case 51 -> 43;
            case 52 -> 44;
            case 53 -> 16;
            case 54 -> 4;
            case 55 -> 53;
            case 56 -> 23;
            case 57 -> 31;
            case 58 -> 54;
            case 59 -> 24;
            case 60 -> 10;
            case 61 -> 58;
            case 62 -> 26;
            default -> 14;
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
        _44.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0005Q\u0013$Qi\u0018D\u0011eT5QR";
        objectArray[1] = Float.TYPE;
        _44.c[1] = "java/lang/Float";
        objectArray[2] = "\u001413qS-\t$10VqD`";
        objectArray[3] = "k\u0019@\u001aDRk\u0019WFH]qRWXHHv#\u0005\u0005\u001b\u00035";
        objectArray[4] = "\tP<D Z\tP+\u0018,U\u0013\u001b+\u0006,@\u0014jy[\u007f\u000bW\u0011+\u0006,@\u0014jy[\u007f\u000bV";
        objectArray[5] = "\u001f\u0007\u001cIlU\u0016\t\u001f\u0000/X\u0010\t\u000b\u00022^R\n\u0004\u0001g_\u000e\u001b_ qO>\u001d\u0017\u0001dH/\u0004\u0018\u0004d";
        objectArray[6] = Void.TYPE;
        _44.c[6] = "java/lang/Void";
        objectArray[7] = "`;|\u0014\u000fpi5\u007f]L}o5k_Q{-6d\\\u0004zq'?i\u0016{2`!i\u000bef\u0017pV\u0001jo5eU\u0010";
        objectArray[8] = Integer.TYPE;
        _44.c[8] = "java/lang/Integer";
        objectArray[9] = "f\u0010\b|%/m\u001f\u00193D!f\u0014\u001di";
        objectArray[10] = ";\u0014~ml\r>\u000f~W*\u007f \u0011n9kO7\n)";
        objectArray[11] = "nvW\u0003\n|'qYK2\"W1DX\u000bo)7[^X";
        objectArray[12] = "B8\u0016;?)\u000b?\u0018s\u0007s{.\u0005g=7\t+\u001eg";
        objectArray[13] = " \u0000\u0007P\u001b!uF\u0007]i q\u00026\r\u0017-e\u000e\rT\u0004$v~";
        objectArray[14] = "\u001bp\\)=[\u001ek\\\u0013|)\u0000uL}:\u0019\u0017n\u000b";
        objectArray[15] = "\u0010\u0005\u0018U\u001aB\u0015\u001e\u0018o\\\n{\u0016\u0012\u0013\tJK\u0001\tT";
        objectArray[16] = "y][)eM|F[\u0013!?bXK}b\u000fuC\f";
        objectArray[17] = "uFX J?<AVhrgL\u0006Vr\u000b,w_E{\u0018";
        objectArray[18] = "\r\u0013\u001c\u0007Ou\u000b\f\u001aT?nZ\f\u0017YS\\\bIN\u0006\u0007\u000b\u000b\u0014NWC{E\u0010\u0014\u0003?";
        objectArray[19] = "!\n)/?N$\u0011)\u0015r<:\u000f9{8\f-\u0014~";
        objectArray[20] = "m1L\u007f`!k.J,\u0010::.G!|\bhk\u001e~*_lmF!kn)<F9\u0010cm1Jy/1,\"]F";
        objectArray[21] = "\u000e1\u0005P-v\u000b*\u0005ja\u0004\u00154\u0015\u0004*4\u0002/R";
        objectArray[22] = ",<v\u0000uHyzv\r\u0007^m>\u0019\rl\u001a\u0010~9QgT~+\u007fQj&";
        objectArray[23] = "{[QAz\f~@Q{=~`^A\u0015}NwE\u0006";
        objectArray[24] = "\u0007\"b\u001f/\u0015\u00029b%mg\u001c'rK(W\u000b<5";
        objectArray[25] = ",;gv\u0011\u000e) gLQ|7>w\"\u0016L %0";
        objectArray[26] = "/R^EP\u0011*I^\u007f\u0015c4WN\u0011WS#L\t";
        Object[] objectArray2 = objectArray;
        objectArray[27] = "%H\u000fT3l S\u000fnp\u001e>M\u001f\u00004.)VX";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _44.a("\u00d0", (Object)_44.a("\u00e3", 4252979663412649504L, (long)l2), 4252518696703403148L, (long)l2);
    }

    public static GpuBufferSlice cfr_renamed_8(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f2 = ((Float)objectArray[1]).floatValue();
        long l2 = (Long)objectArray[2];
        float f3 = ((Float)objectArray[3]).floatValue();
        float f4 = ((Float)objectArray[4]).floatValue();
        float f5 = ((Float)objectArray[5]).floatValue();
        float f6 = ((Float)objectArray[6]).floatValue();
        float f7 = ((Float)objectArray[7]).floatValue();
        float f8 = ((Float)objectArray[8]).floatValue();
        float f9 = ((Float)objectArray[9]).floatValue();
        float f10 = ((Float)objectArray[10]).floatValue();
        float f11 = ((Float)objectArray[11]).floatValue();
        l2 = a ^ l2;
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f, -5671555875318828764L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f2, -5670617317838048368L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f3, -5672153729999975867L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f4, -5671255853989201740L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f5, -5672242750446455974L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f6, -5671383112997276019L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f7, -5672142334299563158L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f8, -5671632212708665539L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f9, -5670706298090277351L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f10, -5670882158057203231L, (long)l2);
        _44.a("\u00de", (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), (float)f11, -5672058749817428035L, (long)l2);
        return _44.a("\u00d0", (Object)_44.a("\u00e3", -5670971724459322263L, (long)l2), (Object)_44.a("\u00e3", -5670736486888116290L, (long)l2), -5671328015865889769L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_44.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

