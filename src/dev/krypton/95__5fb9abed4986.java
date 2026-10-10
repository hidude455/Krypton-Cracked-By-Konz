/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
package dev.krypton;

import com.google.gson.JsonElement;
import dev.krypton._8j;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _95 {
    private final byte cfr_renamed_5;
    private final List cfr_renamed_6;
    private byte cfr_renamed_0;
    private Supplier cfr_renamed_1;
    private boolean cfr_renamed_9;
    private static final long b = dev.krypton.l.a(-1628911467225855181L, -3381591824394940899L, MethodHandles.lookup().lookupClass()).a(97210603414636L);
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] l;
    private static final String[] m;

    public String java_lang_String_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x71D94D4F79CL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = (int)_95.d("f", (Object)this, 5286766513864434348L, (long)l2);
        objectArray2[0] = (int)_95.d("f", (Object)this, 5286872257098768910L, (long)l2);
        return _95.d("\u00d3", (Object)objectArray2, 5286328308971285745L, (long)l2);
    }

    public _95(short s, int n, int n2, int n3) {
        long l2 = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x5FF72BB0426DL;
        this.cfr_renamed_6 = new ArrayList();
        _95.d("\u00c9", (Object)this, () -> _95.cfr_renamed_1(l3), 4437182299560435459L, (long)l2);
        _95.d("\u00c9", (Object)this, (boolean)_95.b("r", 17722, (long)(0x3323C29BF3E5CBF4L ^ l2)), 4438008585656775773L, (long)l2);
        this.cfr_renamed_5 = (byte)n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        l = new Object[32];
        m = new String[32];
        _95.a();
        h = new HashMap(13);
        long l2 = b ^ 0x6C7D9B4227DEL;
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
        String string = "Q\u00ccw!\u0085\u00be7J \u00b8R\u00a0\u00ca\r\u000e\u00eb";
        int n2 = "Q\u00ccw!\u0085\u00be7J \u00b8R\u00a0\u00ca\r\u000e\u00eb".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[2];
    }

    public byte byte_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (byte)_95.d("f", (Object)this, 1953009227636453608L, (long)l2);
    }

    private static Boolean cfr_renamed_1(long l2) {
        l2 = b ^ l2;
        return _95.d("\u00d3", (boolean)true, 80377276868382758L, (long)l2);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _95.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _95.b(classArray[j], string, clazz2);
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
            int n = _95.a(l2, l3);
            object = l[n];
            try {
                if (!(object instanceof String)) break block2;
                _95.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/95" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _95.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x335F;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/95", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _95.g[n2] = n3;
        }
        return g[n2];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _95.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _95.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _95.a(l2, l3);
        Object object = l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = _95.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _95.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _95.a(clazz3, string2, clazz2)) != null) {
                    _95.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _95.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _95.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _95.b(392776959268823L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/95" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l2, long l3) {
        int n = _95.a(l2, l3);
        Object object = l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = _95.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _95.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _95.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _95.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _95.b(392776959268823L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _95.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _95.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _95.b(392776959268823L, 0L);
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

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 59;
            case 1 -> 13;
            case 2 -> 47;
            case 3 -> 9;
            case 4 -> 38;
            case 5 -> 7;
            case 6 -> 63;
            case 7 -> 44;
            case 8 -> 49;
            case 9 -> 50;
            case 10 -> 55;
            case 11 -> 56;
            case 12 -> 10;
            case 13 -> 4;
            case 14 -> 40;
            case 15 -> 58;
            case 16 -> 30;
            case 17 -> 46;
            case 18 -> 3;
            case 19 -> 19;
            case 20 -> 39;
            case 21 -> 33;
            case 22 -> 41;
            case 23 -> 0;
            case 24 -> 34;
            case 25 -> 52;
            case 26 -> 20;
            case 27 -> 25;
            case 28 -> 36;
            case 29 -> 32;
            case 30 -> 45;
            case 31 -> 1;
            case 32 -> 16;
            case 33 -> 48;
            case 34 -> 24;
            case 35 -> 15;
            case 36 -> 5;
            case 37 -> 43;
            case 38 -> 14;
            case 39 -> 61;
            case 40 -> 23;
            case 41 -> 18;
            case 42 -> 53;
            case 43 -> 62;
            case 44 -> 27;
            case 45 -> 60;
            case 46 -> 8;
            case 47 -> 29;
            case 48 -> 37;
            case 49 -> 22;
            case 50 -> 26;
            case 51 -> 57;
            case 52 -> 11;
            case 53 -> 35;
            case 54 -> 28;
            case 55 -> 12;
            case 56 -> 6;
            case 57 -> 54;
            case 58 -> 21;
            case 59 -> 51;
            case 60 -> 42;
            case 61 -> 31;
            case 62 -> 17;
            default -> 2;
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
        _95.m[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\u0010f\u0007\u001c+\u000e\rs\u0005].RM6";
        objectArray[1] = Boolean.TYPE;
        _95.m[1] = "java/lang/Boolean";
        objectArray[2] = "#1iel\"=9s*$\"'3km-9g\u0003jt2; 5m";
        objectArray[3] = "\u0000\u000f>,\u0006I\u001e\u0007$cdU\u0019\u001a";
        objectArray[4] = "\u0010E\u001cd$w\u000eM\u0006+Cv\u001fV\u000bqep";
        objectArray[5] = "\u0019\u0015\u00135UO\u0012\u001a\u0002z4A\u0019\u0011\u0006 ";
        objectArray[6] = "y\u0013oXghr\u001c~\u0017\u001bq}\u001cx[%a";
        objectArray[7] = Void.TYPE;
        _95.m[7] = "java/lang/Void";
        objectArray[8] = "---jK:08/+Nf|\u007f";
        objectArray[9] = "ayO8:i\u0014YD7+&uWO</|\u0001";
        objectArray[10] = "cI\u0013( t}A\tgmngK\u0010;|dg\\K\nalyD\u0000=oceM#<zt{M";
        objectArray[11] = Byte.TYPE;
        _95.m[11] = "java/lang/Byte";
        objectArray[12] = "\"^Kp4n)QZ?Xm'SXpt";
        objectArray[13] = "|$^?j@\t\u0004U0{\u000fh\n^;\u007fU\u001c";
        objectArray[14] = "R\u0003\u0004%\u001c0Y\f\u0015ja(J\u000b\u001c#";
        objectArray[15] = ">P-h2\u0007Kp&g#H*~-l'\u0012^";
        objectArray[16] = "\u0005gRa6![u\\%\\#ChYu %E\u0005\u0018->\"\u0000a\\ '+?";
        objectArray[17] = "QYC[\u0011\u0006FQ\u0001)\u001c{\u0002I\u0018EB\u0007\u0006]\nP";
        objectArray[18] = "b\u0005$`!\u001d5\u0000'7\u001aY;\u001f`f]IRB'iuU,Bel#'b\u0005$`!\u001d5\u0000'7\u001a";
        objectArray[19] = "LG&\u0000\u001dU\r\u0002'[p\u0018qRsPN@\u001dGcYO)N_wV\u001d\u0018\u0010Dp\u0003p";
        objectArray[20] = "DMJ~9%\u001a_D:S/\u0012C;8-vA\u001f@h1z\u0018/\u000291)\fQ\u0002{4\u007f~";
        objectArray[21] = "\n\u001b\"\u0000!~N\u0016;\t\u001e|\\Z<`%d\u0001\u0015p\u001bux\rL@";
        objectArray[22] = "y\u001a\u001f\u0010\u007f\f=\u0017\u0006\u0019@\b+P;\u001d0\u0014B\u0012G\u0012/\u001a<\u0012\u0005\u0017yh";
        objectArray[23] = "1!\u000e/Mqpd\u000ft 5\f4[\u007f\u001ed`!Kv\u001f\re7Jo]|2<Tq ";
        objectArray[24] = "1vU\u0003cf&~\u0017qd\u001ba~\u001d\f5x?l\u0013H";
        objectArray[25] = "i\u001cN5\bk(YOne)T\t\u001be[~8\u001c\u000blZ\u0017=\n\nu\u0018fj\u0001\u0014ke";
        objectArray[26] = "q|%TWhftg&T\u0015\",~I\u0019k\"n{\u001f";
        objectArray[27] = "J0\\2Yn\u001d5_eb>\u001d)\u00014\u000b2$'\u0001$\u000fTCt\u00076\u0010*C6\u0002`b";
        objectArray[28] = "\u001d^zrR/\u0018Vj=n8\\A\u0005\u007f^?XM`\"\u001c:D'";
        objectArray[29] = "\u0001k:f\u001d2\u0016cx\u0014\u0018O[1ff]3\ny=s";
        objectArray[30] = "h\u000by\u001cp0\u007f\u0003;n|M2Q%\u001c01c\u0019~\t";
        Object[] objectArray2 = objectArray;
        objectArray[31] = ";B]aW\u0018?VOt8\u000boD?6FT=\bDfZXd8";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _95.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == '\u00c9' || c == 'n' || c == '\u00db') {
                field = _95.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _95.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public _95 dev_krypton_95_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _95.d("\u00c9", (Object)this, (boolean)_95.b("r", 15686, (long)(0x5AFAC35FE80090D1L ^ l2)), 2219862887285167877L, (long)l2);
        return this;
    }

    public _95 cfr_renamed_3(Runnable runnable) {
        long l2 = b ^ 0x675AF63757A0L;
        _95.d("\u00d8", (Object)_95.d("f", (Object)this, 2973059873409527169L, (long)l2), (Object)runnable, 2972783584482224306L, (long)l2);
        return this;
    }

    public void void_2(Object[] objectArray) {
        byte by = ((Integer)objectArray[0]).intValue();
        long l2 = (Long)objectArray[1];
        l2 = b ^ l2;
        _95.d("\u00c9", (Object)this, (byte)by, 4428393043539072548L, (long)l2);
    }

    public boolean boolean_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (boolean)_95.d("f", (Object)this, 6591815085802181297L, (long)l2);
    }

    protected void void_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        String string = _8j.cfr_renamed_3();
        CallSite callSite = _95.d("\u00d8", (Object)_95.d("f", (Object)this, 7963308533671176768L, (long)l2), 7962735482938812551L, (long)l2);
        while (_95.d("\u00d8", (Object)callSite, 7962587282302135449L, (long)l2) != false) {
            Runnable runnable = (Runnable)((Object)_95.d("\u00d8", (Object)callSite, 7962402683315185047L, (long)l2));
            _95.d("\u00d8", (Object)runnable, 7963014349620074193L, (long)l2);
            if (string == null) continue;
        }
    }

    public void void_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0xF491B322925L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)_95.d("f", (Object)this, 943282612422026981L, (long)l2);
        objectArray2[1] = l3;
        objectArray2[0] = (int)_95.d("f", (Object)this, 943458925999236679L, (long)l2);
        _95.d("\u00d3", (Object)objectArray2, 942588866332693962L, (long)l2);
    }

    public _95 dev_krypton_95_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        Supplier supplier = (Supplier)objectArray[2];
        long l3 = (l2 << 8 | (long)n << 56 >>> 56) ^ b;
        _95.d("\u00c9", (Object)this, (Supplier)supplier, 2806632302573405284L, (long)l3);
        return this;
    }

    public abstract boolean boolean_5(Object[] var1);

    public String java_lang_String_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x700E2A175BB0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)_95.d("f", (Object)this, -1748988971589546936L, (long)l2);
        objectArray2[1] = (int)_95.d("f", (Object)this, -1748883604031091478L, (long)l2);
        objectArray2[0] = l3;
        return _95.d("\u00d3", (Object)objectArray2, -1748728508058722051L, (long)l2);
    }

    public boolean boolean_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (boolean)_95.d("\u00d8", (Object)((Boolean)((Object)_95.d("\u00d8", (Object)_95.d("f", (Object)this, 727620645425211534L, (long)l2), 728075639345980306L, (long)l2))), 728318037779922971L, (long)l2);
    }

    public abstract void void_7(Object[] var1);

    public abstract void void_8(Object[] var1);

    public abstract JsonElement com_google_gson_JsonElement_8(Object[] var1);

    public byte byte_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (byte)_95.d("f", (Object)this, -4742942349469444739L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_95.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_95.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

