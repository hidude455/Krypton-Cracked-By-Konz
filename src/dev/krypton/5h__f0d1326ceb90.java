/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1657
 *  net.minecraft.class_490
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3x;
import dev.krypton._4r;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9j_0;
import dev.krypton._9o;
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
import net.minecraft.class_490;

/*
 * Renamed from dev.krypton.5h
 */
public class _5h_0
extends _6x_0 {
    private final _9j_0 cfr_renamed_7;
    private final _92 cfr_renamed_3;
    private final _92 cfr_renamed_2;
    private int cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _5h_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x52548972A16L;
        long l5 = l3 ^ 0x437DED1DDBECL;
        long l6 = l3 ^ 0x5CBD7E39349EL;
        long l7 = l3 ^ 0x738DAB28A4B1L;
        int n = (int)(l7 >>> 32);
        int n2 = (int)(l7 << 32 >>> 56);
        int n3 = (int)(l7 << 40 >>> 40);
        super((int)_5h_0.a("t", 24341, (long)(0x77404E08D87B97D7L ^ l2)), -1, (_4r)((Object)_5h_0.c("\u00f3", 8268745391258753507L, (long)l2)), l5);
        this.cfr_renamed_7 = new _9j_0((int)_5h_0.a("t", 20300, (long)(0x3A0EF5197740078AL ^ l2)), n, (byte)n2, (int)_5h_0.a("t", 9583, (long)(0x13988C4165E2EDA8L ^ l2)), n3, false);
        this.cfr_renamed_3 = new _92((int)_5h_0.a("t", 26002, (long)(0x283AD85FA3F7AD56L ^ l2)), 1.0, l4, 15.0, 0.0, 1.0);
        this.cfr_renamed_2 = new _92((int)_5h_0.a("t", 7481, (long)(0x26E7ECC90F9855FCL ^ l2)), 1.0, l4, 15.0, 0.0, 1.0);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5h_0.c("\u00cf", (Object)this, 8273108572795155279L, (long)l2), _5h_0.c("\u00cf", (Object)this, 8269390157077712658L, (long)l2), _5h_0.c("\u00cf", (Object)this, 8269313600747147382L, (long)l2)};
        objectArray[0] = l6;
        _5h_0.c("\u00df", (Object)this, (Object)objectArray, 8272891230365600443L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5h_0.b = l.a(-6873129464820712504L, 8897470689101731059L, MethodHandles.lookup().lookupClass()).a(218268248837711L);
                _5h_0.j = new Object[37];
                _5h_0.k = new String[37];
                _5h_0.b();
                _5h_0.f = new HashMap<K, V>(13);
                var0 = _5h_0.b ^ 110267187219952L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "|Ks.\u009f\u00f5\nZ\u00a3\u00f9\u0081k;5w3\u00e85\u00e7\u00d4!\u0006#R";
                var7_6 = "|Ks.\u009f\u00f5\nZ\u00a3\u00f9\u0081k;5w3\u00e85\u00e7\u00d4!\u0006#R".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "G\u00da\u00eb\u008bj>}\u00ed\u008c\u00d6\u00b3\u0081\u0085\u00b16\u009a";
                    var7_6 = "G\u00da\u00eb\u008bj>}\u00ed\u008c\u00d6\u00b3\u0081\u0085\u00b16\u009a".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _5h_0.d = var8_3;
        _5h_0.e = new Integer[5];
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
            case 0 -> 39;
            case 1 -> 21;
            case 2 -> 35;
            case 3 -> 7;
            case 4 -> 17;
            case 5 -> 62;
            case 6 -> 36;
            case 7 -> 20;
            case 8 -> 33;
            case 9 -> 22;
            case 10 -> 59;
            case 11 -> 31;
            case 12 -> 55;
            case 13 -> 12;
            case 14 -> 37;
            case 15 -> 16;
            case 16 -> 40;
            case 17 -> 51;
            case 18 -> 49;
            case 19 -> 52;
            case 20 -> 15;
            case 21 -> 11;
            case 22 -> 19;
            case 23 -> 8;
            case 24 -> 41;
            case 25 -> 14;
            case 26 -> 58;
            case 27 -> 63;
            case 28 -> 2;
            case 29 -> 0;
            case 30 -> 34;
            case 31 -> 28;
            case 32 -> 50;
            case 33 -> 5;
            case 34 -> 47;
            case 35 -> 1;
            case 36 -> 48;
            case 37 -> 53;
            case 38 -> 57;
            case 39 -> 24;
            case 40 -> 4;
            case 41 -> 54;
            case 42 -> 18;
            case 43 -> 30;
            case 44 -> 42;
            case 45 -> 44;
            case 46 -> 29;
            case 47 -> 46;
            case 48 -> 6;
            case 49 -> 27;
            case 50 -> 38;
            case 51 -> 43;
            case 52 -> 61;
            case 53 -> 25;
            case 54 -> 32;
            case 55 -> 45;
            case 56 -> 9;
            case 57 -> 10;
            case 58 -> 26;
            case 59 -> 23;
            case 60 -> 3;
            case 61 -> 60;
            case 62 -> 56;
            default -> 13;
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
        _5h_0.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "Z)<\u001av\u0014G<>[sH\u000b$";
        objectArray[1] = Integer.TYPE;
        _5h_0.k[1] = "java/lang/Integer";
        objectArray[2] = "#\t=\u0010lV>\u001c?Qi\n~^";
        objectArray[3] = "\u001am]d\u0004\u0012\u0007x_%\u0001NGb";
        objectArray[4] = "w\u00046\u001d\b<w\u0004!A\u00043mO!_\u0004&j>q\u0002U";
        objectArray[5] = "_6\u001e|\u001e\\_6\t \u0012SE}\t>\u0012FB\f]fE";
        objectArray[6] = "6OT{\u0001\u0004+ZV:\u0004XjP";
        objectArray[7] = "\u0007(5\u001e;\u001fr\b>\u0011*P\u0013\u00065\u001a.\ng";
        objectArray[8] = Void.TYPE;
        _5h_0.k[8] = "java/lang/Void";
        objectArray[9] = "\u0006L\u001a\u001dQX\u0006L\rA]W\u001c\u0007\r_]B\u001bv_\u000b\f\u0003";
        objectArray[10] = "<seVW\u0011<sr\n[\u001e&8r\u0014[\u000b!I O\u0003J";
        objectArray[11] = "bamY}8baz\u0005q7x*z\u001bq\"\u007f[-D'";
        objectArray[12] = "t9r\bQTi,pIT\b&$";
        objectArray[13] = "k&E43 \u001e\u0006N;\"o\u007f\bE0&5\u000b";
        objectArray[14] = "\f\u001fmm\u0005'\u0011\no,\u0000{Q1";
        objectArray[15] = "~BI&s1\u000bbB)b~jlI\"f$\u001e";
        objectArray[16] = Boolean.TYPE;
        _5h_0.k[16] = "java/lang/Boolean";
        objectArray[17] = "\u000egG/\u0016b{GL \u0007-\u001aIG+\u0003wn";
        objectArray[18] = "u$\fN\bHh1\u000e\u000f\r\u0014%3";
        objectArray[19] = "zZ\u001a[\u0001V\u000fz\u0011T\u0010\u0019nt\u001a_\u0014C\u001a";
        objectArray[20] = "\u001d\u000fG\u001abH\u0016\u0000VU\u0003F\u001d\u000bR\u000f";
        objectArray[21] = "\u0001HT\r+u]\b\u0002o\u007fE\u0001DYU5\"E\u0004JU";
        objectArray[22] = "\r\u001b>N+\u001eQ[h,z.\u000e\u0013)N#\u0012OP0T";
        objectArray[23] = "M\fOP}>\u0011L\u00192.\u000eNXJL#j\u001a\u0002UX";
        objectArray[24] = "\u0013G64 }\u0019\u0010i$\u001alI\u00127\"M;\u0017EoN!dQ\u0006#-u;\u0011\u0010";
        objectArray[25] = "Bn~!f2Ern&\u0014h~g~am3\u0012lepsTCnnxjh\u001b5tp\u0014";
        objectArray[26] = "W$J\u0011\f\u0004\u000f8Y\u0019~\u0017\b/_\u0007)ISr\u000bkABU G\u001a\u001eD\u0017.";
        objectArray[27] = "EO\"\u000beFO\u0018}\u001b_W\u001f\u001a#\u001d\b\u0000AJzqo\u0004O\r+\u0016f_\u001b\u001c";
        objectArray[28] = "a\u001d\f3f\f6_Zk\u0017 K<v\t|\u001f;]L`+]m\u0005";
        objectArray[29] = "Yz(i\u0018o\u0001f;aj|\u0006q=\u007f=\"Y'e\u0013U)[~%b\n/\u0019p";
        objectArray[30] = "\u0000+\u0012?#-\u0001kG;Iu0l\u0010c3vOfG<#";
        objectArray[31] = "s\u0002^\u0012\u000fW'XA\u0006>\rI\n\\\u0017GT%\u0001G\u0006Y3pZVVOT4\u001aEV>";
        objectArray[32] = "\u001932M_r\f|?\b`%poo\r\u0019r\u001cdt\u001c\u0007\u0015\u001acs\u000f\t~O:p\u0016`";
        objectArray[33] = "snf!,3r.3%FkC~<c?5/u'r!R~w,z8n&,6rF";
        objectArray[34] = "<j9?>f`*o]kV?b.?6j~!7%";
        objectArray[35] = "uM;)\u0017j4\u000e\"3pkO\u0019+0\t1#\u00120!\u0017VvI!q\u000112\t2qp";
        Object[] objectArray2 = objectArray;
        objectArray[36] = "qT\u0017\u0007$\u000f{\u0003H\u0017\u001e\u0015'\u0010\u0012\u001ar'sQJB\u001e@w]\b\u0011yI,\t\u0019}#\u0015:\u000e\fA{N \u0006r";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cf' || c == '\u00e6' || c == '\u00f3' || c == 'T') {
                field = _5h_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cf' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5h_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5h_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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
            throw new RuntimeException("dev/krypton/5h" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5h_0.e(l2, l3);
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
                clazz3 = _5h_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5h_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5h_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5h_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5h_0.f(1434695886174280L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5h_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5h_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5h_0.f(1434695886174280L, 0L);
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
            int n = _5h_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5h_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5h_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5h_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5h_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5h_0.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5h" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3A01;
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
                throw new RuntimeException("dev/krypton/5h", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5h_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5h_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5h_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5h_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5h_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5h_0.c(clazz3, string2, clazz2)) != null) {
                    _5h_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5h_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5h_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5h_0.f(1434695886174280L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    @_3i_0
    public void cfr_renamed_4(_9o var1_1) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        block13: {
                            block14: {
                                v0 = var2_2 = _5h_0.b ^ 87076625127034L;
                                var4_3 = v0 ^ 111863715940578L;
                                var6_4 = v0 ^ 37699339103075L;
                                var8_5 = v0 ^ 60573095354785L;
                                var10_6 = v0 ^ 105202830451496L;
                                var12_7 = _7C.cfr_renamed_9();
                                try {
                                    try {
                                        v1 = this;
                                        if (var12_7 == 0) break block13;
                                        v2 = new Object[1];
                                        v2[0] = var4_3;
                                        v3 = new Object[2];
                                        v3[1] = var6_4;
                                        v3[0] = (int)_5h_0.c("\u00df", (Object)_5h_0.c("\u00cf", (Object)v1, (long)7790099758020497071L, (long)var2_2), (Object)v2, (long)7789522521627882079L, (long)var2_2);
                                        if (_5h_0.c("W", (Object)v3, (long)7788447736605781922L, (long)var2_2) != false) break block14;
                                    }
                                    catch (MatchException v4) {
                                        throw _5h_0.a(v4);
                                    }
                                    return;
                                }
                                catch (MatchException v5) {
                                    throw _5h_0.a(v5);
                                }
                            }
                            v1 = this;
                        }
                        var14_8 = _5h_0.c("\u00cf", (Object)_5h_0.c("\u00cf", (Object)v1, (long)7789450648352871912L, (long)var2_2), (long)7789203506553151008L, (long)var2_2);
                        try {
                            if (var12_7 == 0) break block15;
                            if (var14_8 instanceof class_490) {
                            }
                            ** GOTO lbl40
                        }
                        catch (MatchException v6) {
                            throw _5h_0.a(v6);
                        }
                        var13_9 = (class_490)var14_8;
                        try {
                            if (var12_7 != 0) break block16;
lbl40:
                            // 2 sources

                            _5h_0.c("\u00df", (Object)_5h_0.c("\u00cf", (Object)this, (long)7789450648352871912L, (long)var2_2), (Object)new _3x((class_1657)_5h_0.c("\u00cf", (Object)_5h_0.c("\u00cf", (Object)this, (long)7789450648352871912L, (long)var2_2), (long)7788977702258411743L, (long)var2_2)), (long)7788703364723044739L, (long)var2_2);
                        }
                        catch (MatchException v7) {
                            throw _5h_0.a(v7);
                        }
                    }
                    return;
                }
                try {
                    try {
                        v8 = this;
                        if (var12_7 == 0) break block17;
                        if (_5h_0.c("\u00cf", (Object)v8, (long)7789893502110272337L, (long)var2_2) <= 0) break block18;
                    }
                    catch (MatchException v9) {
                        throw _5h_0.a(v9);
                    }
                    v8 = this;
                }
                catch (MatchException v10) {
                    throw _5h_0.a(v10);
                }
            }
            _5h_0.c("\u00e6", (Object)v8, (int)(_5h_0.c("\u00cf", (Object)v8, (long)7789893502110272337L, (long)var2_2) - true), (long)7789893502110272337L, (long)var2_2);
            return;
        }
        v11 = new Object[1];
        v11[0] = var8_5;
        v12 = new Object[4];
        v12[3] = (int)_5h_0.c("\u00df", (Object)_5h_0.c("\u00cf", (Object)this, (long)7788556602697428374L, (long)var2_2), (Object)v11, (long)7788639008791621365L, (long)var2_2);
        v12[2] = var13_9;
        v12[1] = var10_6;
        v12[0] = _5h_0.c("\u00f3", (long)7789147868466652689L, (long)var2_2);
        _5h_0.c("W", (Object)v12, (long)7789110187597662867L, (long)var2_2);
        v13 = new Object[1];
        v13[0] = var8_5;
        v14 = new Object[4];
        v14[3] = (int)_5h_0.c("\u00df", (Object)_5h_0.c("\u00cf", (Object)this, (long)7790022376787710411L, (long)var2_2), (Object)v13, (long)7788639008791621365L, (long)var2_2);
        v14[2] = var13_9;
        v14[1] = var10_6;
        v14[0] = _5h_0.c("\u00f3", (long)7789376812789438780L, (long)var2_2);
        _5h_0.c("W", (Object)v14, (long)7789110187597662867L, (long)var2_2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5h_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5h_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

