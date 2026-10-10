/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._4r;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._95;
import dev.krypton._9r;
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

/*
 * Renamed from dev.krypton.5o
 */
public class _5o_0
extends _6x_0 {
    private final _6e_0 cfr_renamed_8;
    private final _9r cfr_renamed_0;
    private static final long b = dev.krypton.l.a(5590282987286173648L, -2233363410472733105L, MethodHandles.lookup().lookupClass()).a(261796572550585L);
    private static final String d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    public boolean boolean_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x48CC72944B46L;
        return (boolean)_5o_0.c("\u00d5", (Object)_5o_0.c("o", (Object)this, -8734053568990486285L, (long)l2), (long)l3, -8733229099053060996L, (long)l2);
    }

    public _5o_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4E7901BCB80BL;
        long l5 = l3 ^ 0x184196FF3062L;
        long l6 = l3 ^ 0x78105DBDF10L;
        long l7 = l3 ^ 0x58156419ED54L;
        super((int)_5o_0.a("d", 9374, (long)(0x59AF5F3B4442F7EFL ^ l2)), -1, (_4r)((Object)_5o_0.c("\u00ef", -7400201053279706380L, (long)l2)), l5);
        this.cfr_renamed_8 = new _6e_0((int)_5o_0.a("d", 454, (long)(0x5EE9F769982852B5L ^ l2)), l7, d);
        this.cfr_renamed_0 = new _9r((int)_5o_0.a("d", 3533, (long)(0x47DE1A87CA1CDEBDL ^ l2)), false, l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5o_0.c("o", (Object)this, -7401074305954106572L, (long)l2), _5o_0.c("o", (Object)this, -7400982690925904013L, (long)l2)};
        objectArray[0] = l6;
        _5o_0.c("\u00d5", (Object)this, (Object)objectArray, -7400857517376044507L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        k = new Object[18];
        l = new String[18];
        _5o_0.b();
        long l2 = b ^ 0xC2E7239BFE4L;
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
        byte[] byArray3 = cipher.doFinal("\u00ca\u0016\u009cI\u000b\u00c9q\u0080".getBytes("ISO-8859-1"));
        d = _5o_0.b(byArray3).intern();
        j = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray5 = byArray5;
            byArray5[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0088\u00e3\u001c\u00de\r\u00cf\u0094\u00c3\u00c1\u0095\u00e5H\u0091\u00a6W\u001f\u008f+}\u00fe`\u00ac[\u00ad";
        int n2 = "\u0088\u00e3\u001c\u00de\r\u00cf\u0094\u00c3\u00c1\u0095\u00e5H\u0091\u00a6W\u001f\u008f+}\u00fe`\u00ac[\u00ad".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        e = lArray;
        f = new Integer[3];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 59;
            case 1 -> 19;
            case 2 -> 26;
            case 3 -> 6;
            case 4 -> 31;
            case 5 -> 53;
            case 6 -> 14;
            case 7 -> 54;
            case 8 -> 25;
            case 9 -> 34;
            case 10 -> 43;
            case 11 -> 50;
            case 12 -> 46;
            case 13 -> 9;
            case 14 -> 39;
            case 15 -> 51;
            case 16 -> 40;
            case 17 -> 1;
            case 18 -> 2;
            case 19 -> 12;
            case 20 -> 5;
            case 21 -> 60;
            case 22 -> 0;
            case 23 -> 3;
            case 24 -> 37;
            case 25 -> 52;
            case 26 -> 24;
            case 27 -> 48;
            case 28 -> 8;
            case 29 -> 22;
            case 30 -> 27;
            case 31 -> 17;
            case 32 -> 38;
            case 33 -> 57;
            case 34 -> 63;
            case 35 -> 62;
            case 36 -> 49;
            case 37 -> 4;
            case 38 -> 18;
            case 39 -> 33;
            case 40 -> 36;
            case 41 -> 21;
            case 42 -> 23;
            case 43 -> 61;
            case 44 -> 7;
            case 45 -> 15;
            case 46 -> 29;
            case 47 -> 11;
            case 48 -> 42;
            case 49 -> 32;
            case 50 -> 47;
            case 51 -> 16;
            case 52 -> 44;
            case 53 -> 55;
            case 54 -> 20;
            case 55 -> 30;
            case 56 -> 10;
            case 57 -> 28;
            case 58 -> 13;
            case 59 -> 56;
            case 60 -> 58;
            case 61 -> 45;
            case 62 -> 41;
            default -> 35;
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
        _5o_0.l[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = k;
        k[0] = "JcUb\u0003\u0002WvW#\u0006^\u001bi";
        objectArray[1] = ". 5[\u00046357\u001a\u0001j| ";
        objectArray[2] = "mGsp\u0006+\u0018gx\u007f\u0017dyist\u0013>\r";
        objectArray[3] = "J\u000f\u0003\"7MA\u0000\u0012mJUR\u0007\u001b$";
        objectArray[4] = "O(lc\u007fcR=n\"z?\u0012?";
        objectArray[5] = "PK\u0012V>[M^\u0010\u0017;\u0007\u0000\\";
        objectArray[6] = "{1RDSWf$P\u0005V\u000b),";
        objectArray[7] = ",c`2YJYCk=H\u00058M`6L_L";
        objectArray[8] = Void.TYPE;
        _5o_0.l[8] = "java/lang/Void";
        objectArray[9] = Long.TYPE;
        _5o_0.l[9] = "java/lang/Long";
        objectArray[10] = Boolean.TYPE;
        _5o_0.l[10] = "java/lang/Boolean";
        objectArray[11] = "3\u0004&iw\u00038\u000b7&\u0016\r3\u00003|";
        objectArray[12] = "x\u0004`.xF\"\r#V{\u007fb\u001fp'x\u0014c\n\"";
        objectArray[13] = "3:Yr\u0007.i3\u001a\n\t\u0017k'G{\\,6(Aq";
        objectArray[14] = "/;SB\u0013\u007f..\u00013\u0011\u0014j\"U\\\u001ck?.\u0003\b-.m)WC\u0017x;)\u00023";
        objectArray[15] = "1J[@oXjV[\f\u000f\f\r\u0016E\u0011`\u0004rCIG450[RD6\u000eiIMD\u000f";
        objectArray[16] = "\u000e\u0013(\u001b3U_Qk\u0013Vit:Xwm^\u000e\rv\u000e<\u001cM\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "\u001e\u001f;g9\u0007C\u0010=m\\\u0006%L<+1\u0006W\f6fl<\u001aL;y\"\u0002N\u00151)\\";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == '\u00fe' || c == '\u00ef' || c == 'R') {
                field = _5o_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5o_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static String b(byte[] byArray) {
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5o_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5o" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _5o_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5o_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5o_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5o_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5o_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5o_0.f(783132792833054L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5o_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5o_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5o_0.f(783132792833054L, 0L);
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
            int n = _5o_0.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _5o_0.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5o_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5o_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5o_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5o_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4A38;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5o", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5o_0.f[n2] = n3;
        }
        return f[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5o" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5o_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5o_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _5o_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5o_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5o_0.c(clazz3, string2, clazz2)) != null) {
                    _5o_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5o_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5o_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5o_0.f(783132792833054L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String java_lang_String_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x14C8258B68F6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _5o_0.c("\u00d5", (Object)_5o_0.c("o", (Object)this, 5235526747709858518L, (long)l2), (Object)objectArray2, 5235694272170483336L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5o_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5o_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

