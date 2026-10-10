/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._8f_0;
import dev.krypton._92;
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
import net.minecraft.class_1657;

public class _5e
extends _6x_0 {
    private final _92 cfr_renamed_8;
    private final _9r cfr_renamed_9;
    private static final long b = l.a(-6351338808223721729L, -4651202332592016232L, MethodHandles.lookup().lookupClass()).a(15163784919593L);
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _5e(long l2, char c) {
        long l3;
        long l4 = l3 = (l2 << 16 | (long)c << 48 >>> 48) ^ b;
        long l5 = l4 ^ 0x40B372F3F3A6L;
        long l6 = l4 ^ 0x50D3403A8A35L;
        long l7 = l4 ^ 0x168BE5B07BCFL;
        long l8 = l4 ^ 0x94B769494BDL;
        super((int)_5e.a("h", 11968, (long)(0x3D3AE9A425DDB801L ^ l3)), -1, (_4r)((Object)_5e.c("s", -3251493899959836191L, (long)l3)), l7);
        this.cfr_renamed_8 = new _92((int)_5e.a("h", 31773, (long)(0x5617EE5ABC9FEADDL ^ l3)), 0.0, l6, 2.0, 0.5, 0.05);
        this.cfr_renamed_9 = new _9r((int)_5e.a("h", 22747, (long)(0x20679CC396B1CE18L ^ l3)), true, l5);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5e.c("\u00e1", (Object)this, -3251436487039099762L, (long)l3), _5e.c("\u00e1", (Object)this, -3251319673696277625L, (long)l3)};
        objectArray[0] = l8;
        _5e.c("w", (Object)this, (Object)objectArray, -3251307328464671048L, (long)l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new Object[23];
        k = new String[23];
        _5e.b();
        f = new HashMap(13);
        long l2 = b ^ 0x3C818C22FC2L;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0005\u00df\u000eVlH\u00d6\u00ea\u008a\u009d;\u00b8\u000b\u00fc\u000f\u0094\u00b5\u0007\u00a7B\u000bF\u00ff\u00d5";
        int n2 = "\u0005\u00df\u000eVlH\u00d6\u00ea\u008a\u009d;\u00b8\u000b\u00fc\u000f\u0094\u00b5\u0007\u00a7B\u000bF\u00ff\u00d5".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 1;
            case 2 -> 24;
            case 3 -> 14;
            case 4 -> 47;
            case 5 -> 48;
            case 6 -> 41;
            case 7 -> 7;
            case 8 -> 12;
            case 9 -> 38;
            case 10 -> 50;
            case 11 -> 42;
            case 12 -> 3;
            case 13 -> 2;
            case 14 -> 60;
            case 15 -> 4;
            case 16 -> 30;
            case 17 -> 45;
            case 18 -> 16;
            case 19 -> 21;
            case 20 -> 23;
            case 21 -> 43;
            case 22 -> 17;
            case 23 -> 57;
            case 24 -> 9;
            case 25 -> 44;
            case 26 -> 26;
            case 27 -> 37;
            case 28 -> 61;
            case 29 -> 28;
            case 30 -> 18;
            case 31 -> 63;
            case 32 -> 13;
            case 33 -> 49;
            case 34 -> 36;
            case 35 -> 55;
            case 36 -> 39;
            case 37 -> 53;
            case 38 -> 20;
            case 39 -> 6;
            case 40 -> 46;
            case 41 -> 10;
            case 42 -> 32;
            case 43 -> 5;
            case 44 -> 27;
            case 45 -> 22;
            case 46 -> 25;
            case 47 -> 19;
            case 48 -> 35;
            case 49 -> 0;
            case 50 -> 40;
            case 51 -> 58;
            case 52 -> 31;
            case 53 -> 33;
            case 54 -> 59;
            case 55 -> 54;
            case 56 -> 34;
            case 57 -> 8;
            case 58 -> 11;
            case 59 -> 52;
            case 60 -> 56;
            case 61 -> 29;
            case 62 -> 62;
            default -> 51;
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
        _5e.k[n3] = new String(cArray);
        return n3;
    }

    public double double_9(Object[] objectArray) {
        _5e e2;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = b ^ l3;
                l2 = l4 ^ 0x47297AE9351EL;
                long l5 = l4 ^ 0x6D5E1402C54AL;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        e2 = this;
                        if (wArray != null) break block4;
                        if (_5e.c("w", (Object)_5e.c("\u00e1", (Object)e2, 630993352041334447L, (long)l3), (long)l5, 630666475774840335L, (long)l3) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5e.a(matchException);
                    }
                    return 0.0;
                }
                catch (MatchException matchException) {
                    throw _5e.a(matchException);
                }
            }
            e2 = this;
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (double)_5e.c("w", (Object)_5e.c("\u00e1", (Object)e2, 631017806415851942L, (long)l3), (Object)objectArray2, 630621402110037317L, (long)l3);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "w\u0010{=m.j\u0005y|hr&\u0010";
        objectArray[1] = "q\u001f:&\u0001$l\n8g\u0004x,\b";
        objectArray[2] = "\u0016U&rSj\u000b@$3V6K\u0002";
        objectArray[3] = "l*G*+k\u0019\nL%:$x\u0004G.>~\f";
        objectArray[4] = Double.TYPE;
        _5e.k[4] = "java/lang/Double";
        objectArray[5] = Long.TYPE;
        _5e.k[5] = "java/lang/Long";
        objectArray[6] = Boolean.TYPE;
        _5e.k[6] = "java/lang/Boolean";
        objectArray[7] = "\u0006P =o:\r_1r\u0007:\u0003P\"";
        objectArray[8] = Float.TYPE;
        _5e.k[8] = "java/lang/Float";
        objectArray[9] = "fV|^\u0004\u0000fJ|\u0015\u0007\u001f~Ai\u0015\u0013^hWv^\u001a\u0019qMu^\u001e\u001ecAx\u0004\u001e\u001fg\nx\u0011\u001b\u001ckEx\u001bY3hHw\u0012\u0016\u0013bmu\u0016\u0018\"lPn\u0002\u0019\u0011kH~";
        objectArray[10] = "c\u001dy\u0011\r1h\u0012h^l?c\u0019l\u0004";
        objectArray[11] = Void.TYPE;
        _5e.k[11] = "java/lang/Void";
        objectArray[12] = "\u0018 _A\n;\u00055]\u0000\u000fgH7";
        objectArray[13] = "M.]$C=P;_eFa\u001f3";
        objectArray[14] = "\u0011~\u0019\u000700d^\u0012\b!\u007f\u0005P\u0019\u0003%%q";
        objectArray[15] = "\u0000\u000b\u001cK\u0010KZU_\t.PS\u0016x\u001cRVD\f|\u0018JVSj\u001dL\\L^U\u001f\u001e\u0013V>UE\u0010@\u0011T\u0010E\u0000M+";
        objectArray[16] = "XI\u0013wlXTR\u0003)\u0012\u0017\fL\u0002yU\u0007e\u0015\u001amr\u0002TXGq`iXI\u0013wlXTR\u0003)\u0012";
        objectArray[17] = "\u007fO\u0000\u0007Pj0C\u0003\u001e1\u001b\b`%4mP\u007fO\u0000\u0007Pj0C\u0003\u001e";
        objectArray[18] = "$TQv\u001e5yM\u0003\nON6L\u0003v\tt?G\u0000";
        objectArray[19] = "X\u0014g\u0013\f(\u0005\r5o_S\u0002\u0014b\tY8\u0006Nc\u001d";
        objectArray[20] = "J]\u0006'(\u0014\u0018\u0000\u001a+A\u001c{\r\u0013u0H\u0015N\u0000\u007f{%D[\u000b*{O\u0001[\u001b'A";
        objectArray[21] = "`:')a$d`&=ZuYid~+\"7*wt`Ob4x!awb!p&Z";
        Object[] objectArray2 = objectArray;
        objectArray[22] = "YU\u001bhrrP^\u0018\u00141H\u0013P\u000fhzwF\u001fKx\u000btGHOdt3M\u0014\t\u0014";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == '\u00e6' || c == 's' || c == '\u00cc') {
                field = _5e.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5e.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5e.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            throw new RuntimeException("dev/krypton/5e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _5e.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5e.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5e.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5e.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5e.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5e.f(727821274672146L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5e.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5e.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5e.f(727821274672146L, 0L);
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
            int n = _5e.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5e.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5e.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5e.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5e.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5e.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x4425;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])f.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5e", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5e.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5e.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5e.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5e.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5e.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5e.c(clazz3, string2, clazz2)) != null) {
                    _5e.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5e.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5e.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5e.f(727821274672146L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_7(_8f_0 f_0) {
        block5: {
            _8f_0 f_02;
            long l2;
            long l3;
            block4: {
                l3 = b ^ 0x445A156BE1D3L;
                l2 = l3 ^ 0x3B579A872AFBL;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        f_02 = f_0;
                        if (wArray != null) break block4;
                        if (!(f_02.cfr_renamed_1 instanceof class_1657)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5e.a(matchException);
                    }
                    f_02 = f_0;
                }
                catch (MatchException matchException) {
                    throw _5e.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _5e.c("w", (Object)f_02.cfr_renamed_3, (Object)_5e.c("\u00ca", (float)((float)_5e.c("w", (Object)_5e.c("\u00e1", (Object)this, 1667650335049707075L, (long)l3), (Object)objectArray, 1667764165351641760L, (long)l3)), 1667556823206196144L, (long)l3), 1667317076745875563L, (long)l3);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5e.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5e.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

