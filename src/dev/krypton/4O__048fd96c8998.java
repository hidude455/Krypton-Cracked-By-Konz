/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  java.lang.MatchException
 *  net.minecraft.class_11280
 */
package dev.krypton;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import dev.krypton._0S;
import dev.krypton._0m;
import dev.krypton._4w;
import dev.krypton._8B;
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

public class _4O {
    public static final int cfr_renamed_2;
    private static final _0S cfr_renamed_0;
    private static final class_11280 cfr_renamed_3;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = l.a(1570769815286057357L, 8443827540507309975L, MethodHandles.lookup().lookupClass()).a(3375385399952L);
        long l2 = a ^ 0x55D596819A42L;
        b = new Object[33];
        c = new String[33];
        _4O.a();
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
        byte[] byArray3 = cipher.doFinal("p\u00c0\u0090\u0016>[\u008f\u00dd\u0002Z\u007f\u00db\u00b2zdw\u000b\u00dd\u00b9\u0083\u00c8\u0016\u00baI".getBytes("ISO-8859-1"));
        String string = _4O.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l3 = 1588811428828082665L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                long l4 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                cfr_renamed_2 = (int)_4O.a("e", (Object)_4O.a("e", (Object)_4O.a("e", (Object)_4O.a("e", (Object)_4O.a("e", (Object)_4O.a("e", (Object)_4O.a("e", (Object)new Std140SizeCalculator(), 5333747197654571941L, (long)l2), 5333747197654571941L, (long)l2), 5333747197654571941L, (long)l2), 5333747197654571941L, (long)l2), 5333747197654571941L, (long)l2), 5333747197654571941L, (long)l2), 5334426404003157523L, (long)l2);
                cfr_renamed_0 = new _0S();
                cfr_renamed_3 = new class_11280(string, (int)_4O.a("H", 5332821917224823289L, (long)l2), (int)l4);
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4O.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4O.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4O.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4O.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _4O.a(l2, l3);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                _4O.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _4O.a(l2, l3);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = _4O.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4O.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4O.a(clazz3, string2, clazz2)) != null) {
                    _4O.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4O.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4O.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4O.b(730824824745831L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4O.a(l2, l3);
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
                clazz3 = _4O.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4O.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4O.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4O.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4O.b(730824824745831L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4O.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4O.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4O.b(730824824745831L, 0L);
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
            if (c == 'g' || c == 'v' || c == 'H' || c == 'S') {
                field = _4O.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4O.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/4O" + " : " + string + " : " + methodType.toString(), exception);
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
        MethodHandle methodHandle = _4O.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 51;
            case 1 -> 61;
            case 2 -> 0;
            case 3 -> 52;
            case 4 -> 15;
            case 5 -> 33;
            case 6 -> 59;
            case 7 -> 26;
            case 8 -> 28;
            case 9 -> 13;
            case 10 -> 16;
            case 11 -> 45;
            case 12 -> 49;
            case 13 -> 2;
            case 14 -> 37;
            case 15 -> 7;
            case 16 -> 11;
            case 17 -> 12;
            case 18 -> 53;
            case 19 -> 38;
            case 20 -> 23;
            case 21 -> 47;
            case 22 -> 42;
            case 23 -> 5;
            case 24 -> 8;
            case 25 -> 62;
            case 26 -> 32;
            case 27 -> 17;
            case 28 -> 46;
            case 29 -> 24;
            case 30 -> 18;
            case 31 -> 41;
            case 32 -> 54;
            case 33 -> 58;
            case 34 -> 21;
            case 35 -> 4;
            case 36 -> 3;
            case 37 -> 50;
            case 38 -> 19;
            case 39 -> 48;
            case 40 -> 10;
            case 41 -> 40;
            case 42 -> 35;
            case 43 -> 39;
            case 44 -> 27;
            case 45 -> 20;
            case 46 -> 36;
            case 47 -> 25;
            case 48 -> 9;
            case 49 -> 31;
            case 50 -> 60;
            case 51 -> 34;
            case 52 -> 43;
            case 53 -> 30;
            case 54 -> 55;
            case 55 -> 56;
            case 56 -> 29;
            case 57 -> 1;
            case 58 -> 6;
            case 59 -> 22;
            case 60 -> 57;
            case 61 -> 63;
            case 62 -> 14;
            default -> 44;
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
        _4O.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "A\u0019-\u000fvo\\\f/Ns3\u00113";
        objectArray[1] = Integer.TYPE;
        _4O.c[1] = "java/lang/Integer";
        objectArray[2] = "\u0007'\u0002\rRR\u000e)\u0001D\u0011_\b)\u0015F\fYJ*\u001aEYX\u0016;ApKYU|_pVG\u0001\u000b\u000eO\\H\b)\u001bLM";
        objectArray[3] = "\rr\r\u0010TR\rr\u001aLX]\u00179\u001aRXH\u0010HH\u000f\u000b\u0003S";
        objectArray[4] = Void.TYPE;
        _4O.c[4] = "java/lang/Void";
        objectArray[5] = "3\u0018pF\u001de.\rr\u0007\u00189g.";
        objectArray[6] = Float.TYPE;
        _4O.c[6] = "java/lang/Float";
        objectArray[7] = "r,%\u0006\u0018\u001co9'G\u001d@.\u000b";
        objectArray[8] = "?FlG{F?F{\u001bwI%\r{\u0005w\\\"|)X$\u0017a\u0007{\u0005w\\\"|)X$\u0017`";
        objectArray[9] = "}(Ws\u0013Lt&T:PAr&@8MG0%O;\u0018Fl4\u0014\u001a\u000eV\\2\\;\u001bQM+S>\u001b";
        objectArray[10] = "h2KWe8c=Z\u0018\u00046h6^B";
        objectArray[11] = "\fA\b\tHhVM_r\u0013PF\u0019\u0017\u0011O>UW\u001c";
        objectArray[12] = "\u0005\u0001h!c\u000e\u0004\\-`[CF=o>6\u001dIOb cB";
        objectArray[13] = "\u0013:z,|7\u0012g?mD{/:#<'7]7=ix";
        objectArray[14] = "Lf\u0012JF\fM;W\u000b~FpfKZ\u001d\f\u0002kU\u000fB";
        objectArray[15] = "(V_k*))\u000b\u001a*\u0012f\u0014W\u000bhv$+SYv\"";
        objectArray[16] = "\u000eI\u0003h{_\u000f\u0014F)C\u0012\bu\u0004w.LB\u0007\ti{\u0013";
        objectArray[17] = "2#h^&Y3~-\u001f\u001e\u0011\u000e#1N}Y|./\u001b\"";
        objectArray[18] = "\bJ&e{7]N=j\n=\\JE{4 RT+hz+1";
        objectArray[19] = "\u001b>H\u0003\u001eP\u001ac\rB&\u001d'>\u0011\u0013EPU3\u000fF\u001a";
        objectArray[20] = "He\t#\u000e\u000bI8Lb6KteP3U\u000b\u0006hNf\n";
        objectArray[21] = "~zM\u001f;9\u007f'\b^\u0003rBz\u0014\u000f`90w\nZ?";
        objectArray[22] = "#I=wkdyEj\f4\\)A:6t,cW9s";
        objectArray[23] = "u)sw\u000f\"tt667kI('tS/v,uj\u0007";
        objectArray[24] = "\u000b$[}B<A2X88)\\6Q T\u001b\u000es\b\u007f\u0000L\n&\u000f|\b*PqUw8";
        objectArray[25] = "=kw_rcholP\u0003~ykJVh:\u0004.hXgwa{lCh\u0006";
        objectArray[26] = ";\u0005+wl\u001aq\u0013(2\u0016\u000fl\u0017!*z=>Rxu,j<\t%1y\u0006jV9 \u0016T~\u0011z4\u007f[l\tyM";
        objectArray[27] = "$&\n\u0007;i%{OF\u0003$d\u001a\r\u0018nzhh\u0000\u0006;%";
        objectArray[28] = "@$2Y\u0011(\u001a(e\"D\u0010L~d_L`M#!\u001e";
        objectArray[29] = "LM\\{^!M\u0010\u0019:f`pM\u0005k\u0005!\u0002@\u001b>Z";
        objectArray[30] = " ?KR\u0007\u001d!b\u000e\u0013?Pb\u0003M@A\ta<I\u0012_]";
        objectArray[31] = "~~\tF\u0018n\u007f#L\u0007 #,B\u000eYM}20\u0003G\u0018\"";
        Object[] objectArray2 = objectArray;
        objectArray[32] = "THZ\u0000\u0002`U\u0015\u001fA:.hH\u0003\u0010Y`\u001aE\u001dE\u0006";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _4O.a("e", (Object)_4O.a("H", 876434864896754625L, (long)l2), 876547018025449939L, (long)l2);
    }

    public static GpuBufferSlice com_mojang_blaze3d_buffers_GpuBufferSlice_5(Object[] objectArray) {
        CallSite callSite;
        block10: {
            boolean bl;
            block12: {
                block11: {
                    float f;
                    CallSite callSite2;
                    boolean bl2;
                    long l2;
                    block8: {
                        block9: {
                            float f2 = ((Float)objectArray[0]).floatValue();
                            float f3 = ((Float)objectArray[1]).floatValue();
                            float f4 = ((Float)objectArray[2]).floatValue();
                            float f5 = ((Float)objectArray[3]).floatValue();
                            float f6 = ((Float)objectArray[4]).floatValue();
                            float f7 = ((Float)objectArray[5]).floatValue();
                            float f8 = ((Float)objectArray[6]).floatValue();
                            float f9 = ((Float)objectArray[7]).floatValue();
                            l2 = (Long)objectArray[8];
                            _8B b = (_8B)objectArray[9];
                            _8B b2 = (_8B)objectArray[10];
                            _8B b3 = (_8B)objectArray[11];
                            float f10 = ((Float)objectArray[12]).floatValue();
                            float f11 = ((Float)objectArray[13]).floatValue();
                            float f12 = ((Float)objectArray[14]).floatValue();
                            boolean bl3 = (Boolean)objectArray[15];
                            l2 = a ^ l2;
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f2, -6146317926934833593L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f3, -6145549801250250201L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f4, -6145869430289451581L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f5, -6145090625919094614L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f6, -6145279838211307517L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f7, -6146513901765343509L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f8, -6145947738245504516L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f9, -6146275730156505734L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (_8B)b, -6145860565340170589L, (long)l2);
                            boolean bl4 = _0m.cfr_renamed_7();
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (_8B)b2, -6145216154426325191L, (long)l2);
                            _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (_8B)b3, -6146417379729667635L, (long)l2);
                            bl2 = bl4;
                            try {
                                try {
                                    _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f10, -6146211797078895384L, (long)l2);
                                    _4O.a("v", (Object)_4O.a("H", -6145347424143661436L, (long)l2), (float)f11, -6146141418240583343L, (long)l2);
                                    callSite2 = _4O.a("H", -6145347424143661436L, (long)l2);
                                    f = f12;
                                    if (!bl2) break block8;
                                    _4O.a("v", (Object)callSite2, (float)f, -6146484403819129173L, (long)l2);
                                    callSite2 = _4O.a("H", -6145347424143661436L, (long)l2);
                                    if (!bl3) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw _4O.a(matchException);
                                }
                                f = 1.0f;
                                break block8;
                            }
                            catch (MatchException matchException) {
                                throw _4O.a(matchException);
                            }
                        }
                        f = 0.0f;
                    }
                    try {
                        try {
                            _4O.a("v", (Object)callSite2, (float)f, -6145417097379180079L, (long)l2);
                            callSite = _4O.a("e", (Object)_4O.a("H", -6145783939381795491L, (long)l2), (Object)_4O.a("H", -6145347424143661436L, (long)l2), -6145458918375012692L, (long)l2);
                            if (_4w.cfr_renamed_8() != null) break block10;
                            if (!bl2) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _4O.a(matchException);
                        }
                        bl = false;
                        break block12;
                    }
                    catch (MatchException matchException) {
                        throw _4O.a(matchException);
                    }
                }
                bl = true;
            }
            _0m.cfr_renamed_5(bl);
        }
        return callSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4O.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

