/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8m_0;
import dev.krypton._95;
import dev.krypton._9B;
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
import net.minecraft.class_11909;

public class _0_
extends _0v {
    private final _9B cfr_renamed_1;
    private static final long a = l.a(4991876948595788976L, -248139406369039478L, MethodHandles.lookup().lookupClass()).a(2210788482929L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public _0_(_4t t, _95 var2_2, char c, int n, char c2, int n2) {
        long l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x72549B37F3EFL;
        int n3 = (int)(l3 >>> 48);
        int n4 = (int)(l3 << 16 >>> 32);
        int n5 = (int)(l3 << 48 >>> 48);
        super((short)n3, t, var2_2, n2, n4, (char)n5);
        this.cfr_renamed_1 = (_9B)var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[43];
        j = new String[43];
        _0_.b();
        e = new HashMap(13);
        long l2 = a ^ 0x789E762D47F4L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00ae\u00fcY\u000b\u00c8\u0003(f0*p\u0081_\u000fU\u00a6\u0010\u0081\u00dd\u0004a\u00b3b\u00b74\u00b5A\b\u00c7\u00f2\u00b0\n\u00d8";
        int n2 = "\u00ae\u00fcY\u000b\u00c8\u0003(f0*p\u0081_\u000fU\u00a6\u0010\u0081\u00dd\u0004a\u00b3b\u00b74\u00b5A\b\u00c7\u00f2\u00b0\n\u00d8".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0_.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
            case 0 -> 61;
            case 1 -> 26;
            case 2 -> 32;
            case 3 -> 35;
            case 4 -> 44;
            case 5 -> 14;
            case 6 -> 60;
            case 7 -> 21;
            case 8 -> 20;
            case 9 -> 56;
            case 10 -> 49;
            case 11 -> 0;
            case 12 -> 51;
            case 13 -> 29;
            case 14 -> 6;
            case 15 -> 37;
            case 16 -> 62;
            case 17 -> 16;
            case 18 -> 43;
            case 19 -> 59;
            case 20 -> 30;
            case 21 -> 46;
            case 22 -> 53;
            case 23 -> 22;
            case 24 -> 7;
            case 25 -> 48;
            case 26 -> 39;
            case 27 -> 24;
            case 28 -> 52;
            case 29 -> 23;
            case 30 -> 57;
            case 31 -> 47;
            case 32 -> 11;
            case 33 -> 33;
            case 34 -> 42;
            case 35 -> 13;
            case 36 -> 27;
            case 37 -> 10;
            case 38 -> 58;
            case 39 -> 9;
            case 40 -> 8;
            case 41 -> 41;
            case 42 -> 3;
            case 43 -> 2;
            case 44 -> 63;
            case 45 -> 18;
            case 46 -> 40;
            case 47 -> 19;
            case 48 -> 25;
            case 49 -> 31;
            case 50 -> 15;
            case 51 -> 45;
            case 52 -> 12;
            case 53 -> 38;
            case 54 -> 34;
            case 55 -> 5;
            case 56 -> 1;
            case 57 -> 50;
            case 58 -> 28;
            case 59 -> 54;
            case 60 -> 17;
            case 61 -> 55;
            case 62 -> 4;
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
        _0_.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == 'Y' || c == 'C' || c == 'V') {
                field = _0_.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0_.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = "]\u001c~$67]\u001cix:8GWif:-@&;;bn\n";
        objectArray[1] = Integer.TYPE;
        _0_.j[1] = "java/lang/Integer";
        objectArray[2] = "Q*\u0000>olL?\u0002\u007fj0\u00059";
        objectArray[3] = "\u0011\u00123$\u0005\u0017d28+\u0014X\u0005<3 \u0010\u0002q";
        objectArray[4] = Boolean.TYPE;
        _0_.j[4] = "java/lang/Boolean";
        objectArray[5] = "}13[CW`$1\u001aF\u000b)\u000b";
        objectArray[6] = "?\u0012z\u001b\u0006l\"\u0007xZ\u00030b5";
        objectArray[7] = Double.TYPE;
        _0_.j[7] = "java/lang/Double";
        objectArray[8] = "6\\X,\u0010k+IZm\u00157`";
        objectArray[9] = "`X\u001dD\u0004L`X\n\u0018\bCz\u0013\n\u0006\bV}bZ[Y";
        objectArray[10] = "K\u0015,iIVK\u0015;5EYQ^;+ELV/lt\u0013";
        objectArray[11] = Void.TYPE;
        _0_.j[11] = "java/lang/Void";
        objectArray[12] = "\u000f\u0002\u0010gP!z\"\u001bhAn\u001b,\u0010cE4o";
        objectArray[13] = "7q\u0005:PK<~\u0014u-S/y\u001d<";
        objectArray[14] = "1`!uo\u0001,u#4j]m2";
        objectArray[15] = "yI;Wtx\fi0Xe7mg;Sam\u0019";
        objectArray[16] = "99$U\u001c(L\u0019/Z\rg-\u0017$Q\t=Y";
        objectArray[17] = "!&\u0000 v(<3\u0002ast}\u0001";
        objectArray[18] = "D:__h#1\u001aTPylP\u0014_[}6$";
        objectArray[19] = "D?\t!\u0013\u0014Z7\u0013nn\u0004Z";
        objectArray[20] = "iA\r-:\t\u001ca\u0006\"+F}o\r)/\u001c\t";
        objectArray[21] = "\n-;\fAm\u007f\r0\u0003P\"\u001e\u0003;\bTxj";
        objectArray[22] = "Y\u001d\u0018\r\u001a6,=\u0013\u0002\u000byM3\u0018\t\u000f#9";
        objectArray[23] = "KHe:1d@GtuPjKLp/";
        objectArray[24] = "[k~*Z?\u000bj\u007f\u0010\u000fm\u0017o$|=?W5\u007f-j\u007fVf9z\u0014>S6C";
        objectArray[25] = "j\n\u0019~\u001c%nGV>r~S\u0019_7\b~.\u0019N4\u001eO,JN<\u00181mO\u001eF";
        objectArray[26] = "\u0013\u001fQ\u0012!\fR\u0000^]Z\u0003K\u001e@O\u001d\u0013\"\u0005\u0000K \u0017\\D\u0005\u001bZLG\u0016\rY+\rX\u0019B\"";
        objectArray[27] = "\u000eA<+lU\u001f\u0006*g\u0000Pg\u0010*fz]\u001a\u0010;ellZG#pl\n\f\u0003,s\u0000";
        objectArray[28] = ",My,%\u0016(\u00006lKF\u0015^?e1Mh^.f'|j\r.n!\u0002+\b~\u0014";
        objectArray[29] = "Y\u0019YEY(]T\u0016\u00057\u007f[d\f@Xx\u0004ZY\u000f\\{";
        objectArray[30] = "\u001e]\r3p\u0019\u001a\u0010Bs\u001eN'NKzdBZNZyrs\u001cLYb!\u0003\u0018PAm\u001e";
        objectArray[31] = "#\u0010x\b\u001b9yH{\u0011`j\u0018Ma\n\u00068vKb\u001a\u0005";
        objectArray[32] = " MQ\u0005\u0004\u001e&NA\u0006gL\u001cAB\u0012\u001dAaAS\u0011\u000bpp@\u000bR\u0005\u0000\"^\u0004\tg";
        objectArray[33] = "\u0012/A9\fi\u0016b\u000eyb=+<\u0007p\u00182V<\u0016s\u000e\u0003To\u0016{\b}\u0015jF\u0001";
        objectArray[34] = "\u0017JgK\u0017&GKfqL~BV\rM\u0018(\u0017.gHV~KH1\fY}'";
        objectArray[35] = "\u000f\rT?}\u0011]\u0013[d\u001f\u001a\u0002\u0010\b\u000e`\\\n\u0018\u000fp!YZb";
        objectArray[36] = "fd:hK7b)u(%a_f99_7!'<i";
        objectArray[37] = "\u0016\u0000\u0002l(+LB\u0018&\u0016)pxZishA\u0017\u0005xlw";
        objectArray[38] = "\r@/\u001e\u001ek]A.$E3X\\E\u0018\u0011e\f$/\u001d_3QByYP0=";
        objectArray[39] = "N~;[R]J3t\u001b<\bwm}\u0012F\u0006\nml\u0011P7\b>l\u0019VII;<c";
        objectArray[40] = "\u001c \t%B\u007f\rg\u001fi.vuq\u001fhTw\bq\u000ekBFH&\u0016~B \u001eb\u0019}.";
        objectArray[41] = "\"]E\u0004+g&\u0010\nDE7\u001bKFS\u007fi%\u001e\tW|";
        Object[] objectArray2 = objectArray;
        objectArray[42] = ")6Z\u0000T|v'E\u001f>vz5_\u001fRD.t\u0007G>,tvV@P*uwAx\u0001n|8UDX/k%?";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0_.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            throw new RuntimeException("dev/krypton/0_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0_.e(l2, l3);
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
                clazz3 = _0_.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0_.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0_.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0_.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0_.f(1654845037023241L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0_.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0_.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0_.f(1654845037023241L, 0L);
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
            int n = _0_.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0_.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0_.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0_.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0_.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0_.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7468;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _0_.d[n2] = _0_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0_.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Field g(long l2, long l3) {
        int n = _0_.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0_.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0_.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0_.c(clazz3, string2, clazz2)) != null) {
                    _0_.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0_.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0_.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0_.f(1654845037023241L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0_ _;
        long l2;
        boolean bl;
        block7: {
            class_11909 class_119093;
            block8: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x38FE182DFE1L;
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            _ = this;
                            class_119092 = class_119093;
                            if (bl2) break block7;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_0_.c("b", (Object)class_119093, 5514061922737368187L, (long)l3);
                            objectArray2[0] = (double)_0_.c("b", (Object)class_119092, 5513807082081329207L, (long)l3);
                            if (_0_.c("b", (Object)_, (Object)objectArray2, 5515772762112415504L, (long)l3) == false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _0_.a(matchException);
                        }
                        if (_0_.c("b", (Object)class_119093, 5515345602757526345L, (long)l3) == false) {
                        }
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw _0_.a(matchException);
                    }
                    _0_.c("b", (Object)_0_.c("C", 5513878118467053647L, (long)l3), (Object)new _8m_0(this, l5, (_9B)((Object)_0_.c("I", (Object)this, 5515702174228107134L, (long)l3))), 5514370566445071561L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0_.a(matchException);
                }
            }
            _ = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    @Override
    protected void void_8(Object[] objectArray) {
        _87 var3_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x538DF2D376DEL;
        long l6 = l3 ^ 0x764D0226F048L;
        long l7 = l3 ^ 0x570C24C53811L;
        long l8 = l3 ^ 0x28CDF26D8FF8L;
        long l9 = l3 ^ 0x7238D2000367L;
        long l10 = l3 ^ 0x4A7C3F174665L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        reference var22_14 = _0_.c("b", (Object)this, (Object)objectArray2, 7739562491826804347L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l10;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l9;
        reference var23_15 = _0_.c("b", (Object)this, (Object)objectArray3, 7739971229626239787L, (long)l2) + _0_.c("b", (Object)this, (Object)objectArray4, 7739171603728617370L, (long)l2) + _0_.c("I", (Object)this, 7739751305077458022L, (long)l2) + _0_.c("b", (Object)this, (Object)objectArray5, 7738955304905162646L, (long)l2) / 2;
        reference var24_16 = var23_15 - 4;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l8;
        CallSite callSite = _0_.c("b", (Object)_0_.c("b", (Object)_0_.c("I", (Object)this, 7739422712747157650L, (long)l2), (Object)objectArray6, 7739454581807560912L, (long)l2), 7739653033950560026L, (long)l2);
        Object[] objectArray7 = new Object[5];
        objectArray7[4] = _0_.c("C", 7740131933442256672L, (long)l2);
        objectArray7[3] = (double)var24_16;
        objectArray7[2] = (double)var22_14;
        objectArray7[1] = _0_.a("e", 20433, (long)(0x7CAFF3A1F4A550D8L ^ l2));
        objectArray7[0] = l7;
        _0_.c("b", (Object)var3_2, (Object)objectArray7, 7739105559398594166L, (long)l2);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l6;
        objectArray8[0] = _0_.a("e", 30815, (long)(0x4F5F0BAF38B2E757L ^ l2));
        double d = (double)var22_14 + _0_.c("b", (Object)var3_2, (Object)objectArray8, 7740014938072399156L, (long)l2);
        Object[] objectArray9 = new Object[5];
        objectArray9[4] = _0_.c("I", (Object)this, 7739270457668567424L, (long)l2);
        objectArray9[3] = (double)var24_16;
        objectArray9[2] = d;
        objectArray9[1] = _0_.c("\u00e6", (int)callSite, 7739027059843061373L, (long)l2);
        objectArray9[0] = l7;
        _0_.c("b", (Object)var3_2, (Object)objectArray9, 7739105559398594166L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

