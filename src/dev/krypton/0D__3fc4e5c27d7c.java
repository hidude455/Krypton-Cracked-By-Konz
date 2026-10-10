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
import dev.krypton._8C;
import dev.krypton._95;
import dev.krypton._96;
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
import net.minecraft.class_11909;

public class _0D
extends _0v {
    private final _96 cfr_renamed_0;
    private static final long a = l.a(-651777045022725413L, 8680216483037669734L, MethodHandles.lookup().lookupClass()).a(143008638947395L);
    private static final String c;
    private static final Object[] d;
    private static final String[] e;

    public _0D(_4t t, _95 var2_2, long l2, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x206DA42E5356L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var2_2, n, n3, (char)n4);
        this.cfr_renamed_0 = (_96)var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[46];
        e = new String[46];
        _0D.b();
        long l2 = a ^ 0x96800A63A43L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("+'\u00f7Y\u00f2\u001d\u000e\u0002".getBytes("ISO-8859-1"));
                c = _0D.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    private static int e(long l2, long l3) {
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
            case 0 -> 58;
            case 1 -> 3;
            case 2 -> 7;
            case 3 -> 21;
            case 4 -> 43;
            case 5 -> 14;
            case 6 -> 33;
            case 7 -> 4;
            case 8 -> 37;
            case 9 -> 35;
            case 10 -> 20;
            case 11 -> 27;
            case 12 -> 12;
            case 13 -> 53;
            case 14 -> 54;
            case 15 -> 46;
            case 16 -> 25;
            case 17 -> 16;
            case 18 -> 61;
            case 19 -> 6;
            case 20 -> 1;
            case 21 -> 41;
            case 22 -> 59;
            case 23 -> 56;
            case 24 -> 60;
            case 25 -> 26;
            case 26 -> 55;
            case 27 -> 39;
            case 28 -> 48;
            case 29 -> 34;
            case 30 -> 63;
            case 31 -> 36;
            case 32 -> 32;
            case 33 -> 49;
            case 34 -> 19;
            case 35 -> 42;
            case 36 -> 15;
            case 37 -> 11;
            case 38 -> 28;
            case 39 -> 47;
            case 40 -> 22;
            case 41 -> 50;
            case 42 -> 38;
            case 43 -> 44;
            case 44 -> 51;
            case 45 -> 10;
            case 46 -> 40;
            case 47 -> 5;
            case 48 -> 17;
            case 49 -> 18;
            case 50 -> 45;
            case 51 -> 23;
            case 52 -> 13;
            case 53 -> 0;
            case 54 -> 52;
            case 55 -> 9;
            case 56 -> 31;
            case 57 -> 57;
            case 58 -> 29;
            case 59 -> 62;
            case 60 -> 30;
            case 61 -> 8;
            case 62 -> 2;
            default -> 24;
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
        _0D.e[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = d;
        d[0] = "P,CsokP,T/cdJgT1cqM\u0016\u0006l;2\u0007";
        objectArray[1] = Integer.TYPE;
        _0D.e[1] = "java/lang/Integer";
        objectArray[2] = "_\u001e5O2dB\u000b7\u000e78\u000b?";
        objectArray[3] = ";DUlb\u0001&QW-g]f\u0017";
        objectArray[4] = "AY$f#h\\L&'&4\u0015J";
        objectArray[5] = "\\cpY/D)C{V>\u000bHMp]:Q<";
        objectArray[6] = Boolean.TYPE;
        _0D.e[6] = "java/lang/Boolean";
        objectArray[7] = Double.TYPE;
        _0D.e[7] = "java/lang/Double";
        objectArray[8] = "`*R0In}?PqL26";
        objectArray[9] = "&)#X<.&)4\u00040!<b4\u001a04;\u0013dGa";
        objectArray[10] = "\"w9x\u000fx\"w.$\u0003w8<.:\u0003b?MyeU";
        objectArray[11] = Void.TYPE;
        _0D.e[11] = "java/lang/Void";
        objectArray[12] = "oZ5 ij\u001az>/x%{t5$|\u007f\u000f";
        objectArray[13] = "3_~cVa.J|\"S=n\u000f";
        objectArray[14] = "\r;\f48=x\u001b\u0007;)r\u0019\u0015\f0-(m";
        objectArray[15] = "OzM\u0005\t\u0016Du\\Jt\u000eWrU\u0003";
        objectArray[16] = "-pTd\u0013HXP_k\u0002\u00079^T`\u0006]M";
        objectArray[17] = "+z\\N,w5rF\u0001Qg5";
        objectArray[18] = "4B,\u007f5\r)W.>0Qh\u0010";
        objectArray[19] = "kR#6\u0014\n\u001er(9\u0005E\u007f|#2\u0001\u001f\u000b";
        objectArray[20] = "Z(v<]e/\b}3L*N\u0006v8Hp:";
        objectArray[21] = ";FI\u000b^t&SKJ[(ga";
        objectArray[22] = "#P\n1>\fVp\u0001>/C7~\n5+\u0019C";
        objectArray[23] = "4QV7kNAq]8z\u0001 \u007fV3~[T";
        objectArray[24] = "\u0012N/[\u0000rgn$T\u0011=\u0006`/_\u0015gr";
        objectArray[25] = "a\u001d24K_j\u0012#{*Qa\u0019'!";
        objectArray[26] = ".:&oG\u0010;/sV\u0012A5\"$: \u0013ux\u007fkw\u0015r~)(\u0006\u0015'..V";
        objectArray[27] = "\u0012%\u0013\u001fl\u0005\u001b-\u0013\u0007\\\f+o_\\bMO+\u001dR3";
        objectArray[28] = "\u001b\u00184>\u0011\rDQ&da_ Av4\n\u0004QL7'\u0002n\u0019\u001az1\u001f\u001f\u0019O*6a";
        objectArray[29] = "zM P\u0000C4I%\u0006x\u0004K\u0016v\u0006\u0013S:\u001b7\u0015\u001b9\"\u0014%\u0004\t\u00064O\"\u0005x";
        objectArray[30] = "Y\u001eC|`\u001d\u001d\\M-\u0011FcBL-z\u0013\u0012O\r>ry\bM\u001a?l\u0017\u0011\\\u0002;\u0011";
        objectArray[31] = "\u001e\u0003#\u0010;U\bX$\u0011J\u0014\u001e\u0005=\u0010\r\u0004wX{A \u0014\u0006X.\u0011'j\u001e\u0003#\u0010;U\bX$\u0011J";
        objectArray[32] = "\u000f/f\u0017[e\u00038=\u0011:fd=0\u0018Q0\u00150q\u000bYZY<lN^`\u0016flN:";
        objectArray[33] = "}'\u0000]\u000b2\"n\u0012\u0007{kF~BW\u0010;7s\u0003D\u0018Q\u007f%NR\u0005 \u007fp\u001eU{";
        objectArray[34] = "\u0018)?\u0014\u001bnG`-Nk0\u0018\u0010 \u0003\fn]}<M\fq";
        objectArray[35] = "\u0019a\u001d\u0016}rF(\u000fL\r,\"8_\u001cf{S5\u001e\u000fn\u0011\u001ehRNt-\u001bg\u000b\u0001\r";
        objectArray[36] = "M(@Jv\u0001\u0012aR\u0010\u0006\\vq\u0002@m\b\u0007|CSebO*\u000eEx\u0013O\u007f^B\u0006";
        objectArray[37] = "57\u0018\u0007^# \"M>\u0005x77*\u0002Q.bO@_\u0002&6u\u000f\u0005\u0002&R";
        objectArray[38] = "t\u000b\u001eL6\u001em\u001a\u0006HK\u000b~\u0016\u00151rK#\u000e\u0006@r\u001es\tx";
        objectArray[39] = "YEE\u0012w1\u0006\fWH\u0007nbE\fKm,\u0013EY\u001bj";
        objectArray[40] = "ljaC+\u0004n2&\tSG\n\u000e`\u00194A0l$\fbF";
        objectArray[41] = "\u001enr\u0010:P\u000b{')a\u000b\u001cn@\u00155]H\u0016*HfU\u001d,e\u0012fUy";
        objectArray[42] = "_0\u0019\u0006\r\u001c\u0000y\u000b\\}@di[\f\u0016\u0015\u0015d\u001a\u001f\u001e\u007f]2W\t\u0003\u000e]g\u0007\u000e}";
        objectArray[43] = "HZt\\H\u000fDM/Z)\u0000#H\"SBZREc@J0\u001eI~\u0005M\nQ\u0013~\u0005)";
        objectArray[44] = ":S(d4>e\u001a:>Dg\u0001\u0007(f'#l\u001bff8";
        Object[] objectArray2 = objectArray;
        objectArray[45] = "{\u0019e~'\u0011?\f3yF\u0016(\u000fb&*$|N:~FLuI=#y\u000f9\u000f3Ay\bx\b?<\"\u000b(\b\u0002";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0D.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == 'M' || c == '\u00d8' || c == '\u00f3') {
                field = _0D.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0D.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'n' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static Method h(long l2, long l3) {
        int n = _0D.e(l2, l3);
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
                clazz3 = _0D.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0D.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0D.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0D.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0D.f(1760461389021004L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0D.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0D.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0D.f(1760461389021004L, 0L);
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
            int n = _0D.e(l2, l3);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                _0D.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0D.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0D.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0D.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0D.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0D" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _0D.e(l2, l3);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = _0D.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0D.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0D.c(clazz3, string2, clazz2)) != null) {
                    _0D.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0D.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0D.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0D.f(1760461389021004L, 0L);
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
        _0D d;
        long l2;
        boolean bl;
        block7: {
            class_11909 class_119093;
            block8: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0xA239397A5E5L;
                long l6 = l4 ^ 0xD9EB9630EB6L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            d = this;
                            class_119092 = class_119093;
                            if (!bl2) break block7;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l5;
                            objectArray2[1] = (double)_0D.a("n", (Object)class_119093, 5514117631979520754L, (long)l3);
                            objectArray2[0] = (double)_0D.a("n", (Object)class_119092, 5513821532809545909L, (long)l3);
                            if (_0D.a("n", (Object)d, (Object)objectArray2, 5513683558256480023L, (long)l3) == false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _0D.a(matchException);
                        }
                        if (_0D.a("n", (Object)class_119093, 5515501900853106754L, (long)l3) == false) {
                        }
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw _0D.a(matchException);
                    }
                    _0D.a("n", (Object)_0D.a("\u00d8", 5514174942842258464L, (long)l3), (Object)new _8C(this, l6, (_96)((Object)_0D.a("y", (Object)this, 5515367756411282096L, (long)l3))), 5514380067094606759L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0D.a(matchException);
                }
            }
            d = this;
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
        _87 var2_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x538DF2D376DEL;
        long l6 = l3 ^ 0x764D0226F048L;
        long l7 = l3 ^ 0x570C24C53811L;
        long l8 = l3 ^ 0x7238D2000367L;
        long l9 = l3 ^ 0x632F1A0A69B2L;
        long l10 = l3 ^ 0x4A7C3F174665L;
        long l11 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        reference var24_15 = _0D.a("n", (Object)this, (Object)objectArray2, 7739781278686214815L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l10;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l8;
        reference var25_16 = _0D.a("n", (Object)this, (Object)objectArray3, 7740191100471714803L, (long)l2) + _0D.a("n", (Object)this, (Object)objectArray4, 7739516333799596189L, (long)l2) + _0D.a("y", (Object)this, 7739959091435343352L, (long)l2) + _0D.a("n", (Object)this, (Object)objectArray5, 7739202764000304522L, (long)l2) / 2;
        reference var26_17 = var25_16 - 4;
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l9;
        CallSite callSite = _0D.a("n", (Object)_0D.a("n", (Object)_0D.a("y", (Object)this, 7739088326809650524L, (long)l2), (Object)objectArray6, 7739331752678996252L, (long)l2), 7739920308768382402L, (long)l2);
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l11;
        String string = (String)((Object)_0D.a("n", (Object)_0D.a("y", (Object)this, 7739088326809650524L, (long)l2), (Object)objectArray7, 7739287261295513687L, (long)l2)) + c;
        Object[] objectArray8 = new Object[5];
        objectArray8[4] = _0D.a("\u00d8", 7740338194611218543L, (long)l2);
        objectArray8[3] = (double)var26_17;
        objectArray8[2] = (double)var24_15;
        objectArray8[1] = string;
        objectArray8[0] = l7;
        _0D.a("n", (Object)var2_2, (Object)objectArray8, 7739447341373660000L, (long)l2);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l6;
        objectArray9[0] = string;
        double d = (double)var24_15 + _0D.a("n", (Object)var2_2, (Object)objectArray9, 7740241669266879541L, (long)l2);
        Object[] objectArray10 = new Object[5];
        objectArray10[4] = _0D.a("y", (Object)this, 7739638433509322191L, (long)l2);
        objectArray10[3] = (double)var26_17;
        objectArray10[2] = d;
        objectArray10[1] = _0D.a("\u00e1", (int)callSite, 7739408391717571727L, (long)l2);
        objectArray10[0] = l7;
        _0D.a("n", (Object)var2_2, (Object)objectArray10, 7739447341373660000L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0D.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

