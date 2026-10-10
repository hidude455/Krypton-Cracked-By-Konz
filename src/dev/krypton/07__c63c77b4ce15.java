/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._0j;
import dev.krypton._0t;
import dev.krypton._4w;
import dev.krypton.l;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _07
extends _0j {
    private final Path cfr_renamed_5;
    private static final long a = l.a(1254357226505638729L, -3776902979715934078L, MethodHandles.lookup().lookupClass()).a(19743920545854L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] h;
    private static final String[] i;

    public _07(_0t t, Path path) {
        super(t);
        this.cfr_renamed_5 = path;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new Object[14];
        i = new String[14];
        _07.b();
        e = new HashMap(13);
        long l2 = a ^ 0x5F4394A240C5L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "3mg\u00edG\u00ac\u00034\u00ec\u00f9\u00bf\u0091\u00c6r\u0019-P\u00b1\u0095\u00c2\u00fb\u001d ib<\u00ca\u00fb\u008d\u008c\u00bc\u00b3\u00d2\u00f5\u0093\u00de\u0081\u00f2\u009d\u00f2\u00d1[\u00b3\"}K\u00fd$\u00d7\u00d4e\u009fy\u00e6\u00f4\u00c1\u00e7\u00b7945\u00ea\b:\u0089\u00d4\u009bke#\u00c7\u00cd\\s\u0015\u00a6\u0089\u00e8Ez\u00be*\u00b0\u0001\u00d4|Jq\u00d7\u00da\u000e\u00ed%S\u0087D<8\u0095w\u00f4<\u0080\u0082\u0093rs_%G\u00ed\u00e6\u00a5A|zt|&x@\u00b7 \u0014R\u00af\u00ca\u0080Y{ \u00c1\u000f\u00ed$\u00db\u00fb\u0096\u00a3\u00f7\u00e3\u00b9\u007f<b?\u00d7\u00eek\u00ba\u00ea\u001b\u00f0\u00de";
        int n2 = "3mg\u00edG\u00ac\u00034\u00ec\u00f9\u00bf\u0091\u00c6r\u0019-P\u00b1\u0095\u00c2\u00fb\u001d ib<\u00ca\u00fb\u008d\u008c\u00bc\u00b3\u00d2\u00f5\u0093\u00de\u0081\u00f2\u009d\u00f2\u00d1[\u00b3\"}K\u00fd$\u00d7\u00d4e\u009fy\u00e6\u00f4\u00c1\u00e7\u00b7945\u00ea\b:\u0089\u00d4\u009bke#\u00c7\u00cd\\s\u0015\u00a6\u0089\u00e8Ez\u00be*\u00b0\u0001\u00d4|Jq\u00d7\u00da\u000e\u00ed%S\u0087D<8\u0095w\u00f4<\u0080\u0082\u0093rs_%G\u00ed\u00e6\u00a5A|zt|&x@\u00b7 \u0014R\u00af\u00ca\u0080Y{ \u00c1\u000f\u00ed$\u00db\u00fb\u0096\u00a3\u00f7\u00e3\u00b9\u007f<b?\u00d7\u00eek\u00ba\u00ea\u001b\u00f0\u00de".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _07.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public String toString() {
        long l2 = a ^ 0x37C200C999D9L;
        return super.toString() + (String)((Object)_07.a("b", 20757, (long)(0x440CD66D73AA7ABL ^ l2))) + _07.c("\u00e3", (Object)this, 6933755414368133368L, (long)l2).toString() + ")";
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 1;
            case 2 -> 61;
            case 3 -> 3;
            case 4 -> 48;
            case 5 -> 50;
            case 6 -> 40;
            case 7 -> 13;
            case 8 -> 9;
            case 9 -> 51;
            case 10 -> 45;
            case 11 -> 8;
            case 12 -> 17;
            case 13 -> 62;
            case 14 -> 16;
            case 15 -> 14;
            case 16 -> 31;
            case 17 -> 6;
            case 18 -> 25;
            case 19 -> 0;
            case 20 -> 44;
            case 21 -> 30;
            case 22 -> 58;
            case 23 -> 5;
            case 24 -> 29;
            case 25 -> 12;
            case 26 -> 63;
            case 27 -> 23;
            case 28 -> 27;
            case 29 -> 21;
            case 30 -> 11;
            case 31 -> 39;
            case 32 -> 38;
            case 33 -> 26;
            case 34 -> 47;
            case 35 -> 33;
            case 36 -> 36;
            case 37 -> 53;
            case 38 -> 4;
            case 39 -> 35;
            case 40 -> 55;
            case 41 -> 19;
            case 42 -> 7;
            case 43 -> 57;
            case 44 -> 56;
            case 45 -> 54;
            case 46 -> 59;
            case 47 -> 20;
            case 48 -> 28;
            case 49 -> 32;
            case 50 -> 10;
            case 51 -> 43;
            case 52 -> 49;
            case 53 -> 18;
            case 54 -> 24;
            case 55 -> 37;
            case 56 -> 2;
            case 57 -> 22;
            case 58 -> 60;
            case 59 -> 46;
            case 60 -> 34;
            case 61 -> 15;
            case 62 -> 42;
            default -> 41;
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
        _07.i[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _07.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = h;
        h[0] = "NS~Py[E\\o\u001f\u0004CV[fV";
        objectArray[1] = "{lJV`\u000epc[\u0019\u0001\u0000{h_C";
        objectArray[2] = "\u0019|hw\u0013a\u0004ij6\u0016=NF";
        objectArray[3] = "]p:`kZ(P1oz\u0015I^:d~O=";
        objectArray[4] = "H bb*nMo]mtrV\u0012`qafO";
        objectArray[5] = "\n0h{xU\t>0|?W\u0005\u007fN{\"S";
        objectArray[6] = "X\u0014}7z9][M?85";
        objectArray[7] = "o\u001e\u0018S>9r\u000b\u001a\u0012;e;L";
        objectArray[8] = Boolean.TYPE;
        _07.i[8] = "java/lang/Boolean";
        objectArray[9] = "ea+\u0013u\n0b!ii\\;$'.y5fg)\u001bq\tdg&T\u0017\u000fg80\u000b(Zd2J";
        objectArray[10] = "}h\u0017a8l<1\\vS,@j\u0016shh<0\u001dz,";
        objectArray[11] = "5\u001c\u0002S$)p\u001a\u001c@].y\u0005\u001f_&C4\u0019\r@-%l_ZB]";
        objectArray[12] = "\u0006)g>>X\\+2uEV?c9# \fS4j\"=g\u0005&mq8\bN+31E";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u001b,\\x(\u0006A'U<U\u0006@XS'8z\u001bnT3,\u0010^hJ U";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == '\u00f1' || c == 'U' || c == 'a') {
                field = _07.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _07.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/07" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _07.e(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = _07.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _07.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _07.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _07.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _07.f(120131484365561L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _07.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _07.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _07.f(120131484365561L, 0L);
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
            int n = _07.e(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _07.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _07.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _07.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _07.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _07.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/07" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1685;
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
                throw new RuntimeException("dev/krypton/07", exception);
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
            _07.d[n2] = _07.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _07.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Field g(long l2, long l3) {
        int n = _07.e(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _07.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _07.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _07.c(clazz3, string2, clazz2)) != null) {
                    _07.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _07.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _07.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _07.f(120131484365561L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public InputStream cfr_renamed_7(Object[] objectArray) {
        CallSite callSite;
        block10: {
            CallSite callSite2;
            block11: {
                CallSite callSite3;
                _4w[] wArray;
                long l2;
                long l3;
                block8: {
                    block9: {
                        l3 = (Long)objectArray[0];
                        l2 = l3 ^ 0x4D71667C0715L;
                        wArray = _0j.cfr_renamed_1();
                        try {
                            try {
                                callSite3 = _07.c("m", (Object)_07.c("\u00e3", (Object)this, -58273975488069647L, (long)l3), -58222496237171131L, (long)l3);
                                if (wArray == null) break block8;
                                if (_07.c("m", (Object)callSite3, -58353489920422673L, (long)l3) != false) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _07.a(runtimeException);
                            }
                            throw new RuntimeException((String)((Object)_07.a("b", 27694, (long)(0xFF272F2C6E20598L ^ l3))));
                        }
                        catch (RuntimeException runtimeException) {
                            throw _07.a(runtimeException);
                        }
                    }
                    callSite3 = _07.c("m", (Object)_07.c("\u00e3", (Object)this, -58273975488069647L, (long)l3), -58222496237171131L, (long)l3);
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = callSite3;
                callSite2 = _07.c("k", (Object)objectArray2, -58135003313301696L, (long)l3);
                try {
                    try {
                        callSite = callSite2;
                        if (wArray == null) break block10;
                        if (callSite != null) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _07.a(runtimeException);
                    }
                    throw new RuntimeException((String)((Object)_07.a("b", 11545, (long)(0x390F043B1B1044ACL ^ l3))) + (String)((Object)_07.c("k", (Object)_07.c("\u00e3", (Object)this, -58273975488069647L, (long)l3), -58497323806547479L, (long)l3)) + ".");
                }
                catch (RuntimeException runtimeException) {
                    throw _07.a(runtimeException);
                }
            }
            callSite = callSite2;
        }
        return callSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_07.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_07.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

