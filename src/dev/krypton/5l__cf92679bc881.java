/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1792
 *  net.minecraft.class_3965
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6C;
import dev.krypton._6G;
import dev.krypton._6x_0;
import dev.krypton._95;
import dev.krypton._96;
import dev.krypton._9m_0;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;
import net.minecraft.class_3965;

/*
 * Renamed from dev.krypton.5l
 */
public class _5l_0
extends _6x_0 {
    private final _9r cfr_renamed_9;
    private final _9m_0 cfr_renamed_0;
    private final _9r cfr_renamed_7;
    private final _9r cfr_renamed_1;
    private final _96 cfr_renamed_3;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _5l_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x7EFA87CEA00L;
        long l5 = l3 ^ 0x4A8E0F1C2AB7L;
        long l6 = l3 ^ 0x51D73F3F6269L;
        long l7 = l3 ^ 0x4E17AC1B8D1BL;
        long l8 = l3 ^ 0x1FCD19D72BA4L;
        super((int)_5l_0.a("k", 4890, (long)(0x756A05EEDD90E40L ^ l2)), -1, (_4r)((Object)_5l_0.c("\u00da", -3797557038555520365L, (long)l2)), l6);
        this.cfr_renamed_9 = new _9r((int)_5l_0.a("k", 22226, (long)(0x1E22EE7807DC4B8EL ^ l2)), true, l4);
        this.cfr_renamed_0 = new _9m_0((int)_5l_0.a("k", 19726, (long)(0x29E10FDDA9E2D053L ^ l2)), l5, (class_1792)_5l_0.c("\u00da", -3796671500436428774L, (long)l2));
        this.cfr_renamed_7 = new _9r((int)_5l_0.a("k", 7335, (long)(0x3CA57B8A6201FCL ^ l2)), true, l4);
        this.cfr_renamed_1 = new _9r((int)_5l_0.a("k", 11336, (long)(0x1D4368C99405B110L ^ l2)), false, l4);
        this.cfr_renamed_3 = new _96(l8, (int)_5l_0.a("k", 18898, (long)(0x580A2E56C07CD48BL ^ l2)), new HashSet());
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5l_0.c("P", (Object)this, -3797730168746007980L, (long)l2), _5l_0.c("P", (Object)this, -3798380172214501971L, (long)l2), _5l_0.c("P", (Object)this, -3797776071271212375L, (long)l2), _5l_0.c("P", (Object)this, -3798005417939430743L, (long)l2), _5l_0.c("P", (Object)this, -3798111240433920559L, (long)l2)};
        objectArray[0] = l7;
        _5l_0.c("\u00cc", (Object)this, (Object)objectArray, -3798707640481129181L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5l_0.b = l.a(8978155832273734911L, -3283625503571158582L, MethodHandles.lookup().lookupClass()).a(178322082883080L);
                _5l_0.j = new Object[57];
                _5l_0.k = new String[57];
                _5l_0.b();
                _5l_0.f = new HashMap<K, V>(13);
                var0 = _5l_0.b ^ 73217360787354L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u0097oQ?\b\u00fc\u00d3\u00e8D<!yg\u00f6\u00a3c\rc\u00b3\u00dcT\u00bb\u0011b\u0003\u0004\u000f\u00cd\u00db\u000f/\u0098";
                var7_6 = "\u0097oQ?\b\u00fc\u00d3\u00e8D<!yg\u00f6\u00a3c\rc\u00b3\u00dcT\u00bb\u0011b\u0003\u0004\u000f\u00cd\u00db\u000f/\u0098".length();
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
                    var6_5 = "\u00ecx\u00a4\u00ac\u00ad\u00dc\u00f3{\u00f5\bT\u00a3\u00bc\u00c8\u0016\u00bf";
                    var7_6 = "\u00ecx\u00a4\u00ac\u00ad\u00dc\u00f3{\u00f5\bT\u00a3\u00bc\u00c8\u0016\u00bf".length();
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
        _5l_0.d = var8_3;
        _5l_0.e = new Integer[6];
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
            case 0 -> 57;
            case 1 -> 31;
            case 2 -> 63;
            case 3 -> 18;
            case 4 -> 24;
            case 5 -> 59;
            case 6 -> 13;
            case 7 -> 53;
            case 8 -> 21;
            case 9 -> 36;
            case 10 -> 20;
            case 11 -> 30;
            case 12 -> 52;
            case 13 -> 38;
            case 14 -> 37;
            case 15 -> 2;
            case 16 -> 56;
            case 17 -> 32;
            case 18 -> 0;
            case 19 -> 44;
            case 20 -> 49;
            case 21 -> 17;
            case 22 -> 1;
            case 23 -> 51;
            case 24 -> 29;
            case 25 -> 27;
            case 26 -> 43;
            case 27 -> 62;
            case 28 -> 28;
            case 29 -> 61;
            case 30 -> 46;
            case 31 -> 42;
            case 32 -> 34;
            case 33 -> 14;
            case 34 -> 58;
            case 35 -> 60;
            case 36 -> 16;
            case 37 -> 8;
            case 38 -> 7;
            case 39 -> 50;
            case 40 -> 40;
            case 41 -> 45;
            case 42 -> 5;
            case 43 -> 47;
            case 44 -> 12;
            case 45 -> 35;
            case 46 -> 54;
            case 47 -> 33;
            case 48 -> 22;
            case 49 -> 48;
            case 50 -> 55;
            case 51 -> 15;
            case 52 -> 9;
            case 53 -> 4;
            case 54 -> 39;
            case 55 -> 6;
            case 56 -> 11;
            case 57 -> 10;
            case 58 -> 23;
            case 59 -> 25;
            case 60 -> 19;
            case 61 -> 26;
            case 62 -> 41;
            default -> 3;
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
        _5l_0.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == 'C' || c == '\u00da' || c == '\u00e8') {
                field = _5l_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5l_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5l_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "A&>c2#A&)?>,[m)!>9\\\u001cx{gz";
        objectArray[1] = "|\u0002\u001eR(\u0018|\u0002\t\u000e$\u0017fI\t\u0010$\u0002a8XNqI";
        objectArray[2] = "\u0010rt`\u0018\u0016\rgv!\u001dJM!";
        objectArray[3] = "0\b\u001endeE(\u0015au*$&\u001ejqpP";
        objectArray[4] = "9Y\u0000R\u0000M'Q\u001a\u001d}]'";
        objectArray[5] = "}3)n9\u0017v<8!X\u0019}7<{";
        objectArray[6] = Boolean.TYPE;
        _5l_0.k[6] = "java/lang/Boolean";
        objectArray[7] = "\r\u0011]p\u0019\u0004\r\u0011J,\u0015\u000b\u0017ZJ2\u0015\u001e\u0010+\u001aoD";
        objectArray[8] = "b\u0011~)lqb\u0011iu`~xZik`k\u007f+<49";
        objectArray[9] = "\u0007YcYuw\u0007Yt\u0005yx\u001d\u0012t\u001bym\u001ac%D!";
        objectArray[10] = "\u001fW\u0017&\u001bA\u001fW\u0000z\u0017N\u0005\u001c\u0000d\u0017[\u0002mQ;O\f\u0012^\u0002{\u0005wC\u0006S";
        objectArray[11] = "z@*MIlgU(\fL0+I";
        objectArray[12] = "j05\u0000\u000f\u001ew%7A\nB7'";
        objectArray[13] = "p^\u0019t\u0001\u0017mK\u001b5\u0004K\"C";
        objectArray[14] = "w[W*\\\\w[@vPSm\u0010@hPFja\u0010=\u0007\u0000";
        objectArray[15] = "\n\t7cXa\n\t ?Tn\u0010B !T{\u00173q~\u00060";
        objectArray[16] = "#\u0014X\rWJV4S\u0002F\u00057:X\tB_C";
        objectArray[17] = Long.TYPE;
        _5l_0.k[17] = "java/lang/Long";
        objectArray[18] = "WCt!hEJVv`m\u0019\u0000I";
        objectArray[19] = "^F";
        objectArray[20] = Integer.TYPE;
        _5l_0.k[20] = "java/lang/Integer";
        objectArray[21] = "|\\\u001d\u000f\u0007y|\\\nS\u000bvf\u0017\nM\u000bcaf^\u0015\\";
        objectArray[22] = "w\b\n]sKj\u001d\b\u001cv\u0017*\u0000";
        objectArray[23] = "08Z\u001b6.E\u0018Q\u0014'a$\u0016Z\u001f#;P";
        objectArray[24] = "}?Nc\f_}?Y?\u0000PgtY!\u0000E`\u0005\u000bzX\u0004";
        objectArray[25] = "|=I/\u0015N|=^s\u0019Afv^m\u0019Ta\u0007\f6A\u001e";
        objectArray[26] = "\u001d\u001d0\u0016!4\u001d\u001d'J-;\u0007V'T-.\u0000'u\u0000|o";
        objectArray[27] = "z\u0002\u0014-H\u0018g\u0017\u0016lMD*\u0015";
        objectArray[28] = "l4ebc/\u0019\u0014nmr`x\u001aefv:\f";
        objectArray[29] = Void.TYPE;
        _5l_0.k[29] = "java/lang/Void";
        objectArray[30] = ",\b7 5\fq[d*ZSiTgw3P\u0013U6-j\baV{c74";
        objectArray[31] = "GW|3Yh\u0005Dc!\"1~Do?I`\u000fJn,\u0018\u000eEH(-A4\u0014Z(r\"";
        objectArray[32] = "\u0014$a\u000f`X@,<\u0012\u0010\\$,*\u001al\u001dBn9\u0005~";
        objectArray[33] = "i6_9cD8u\n/\u001fEi6R8sw:r\u000e`\u001f@drO1'\u001bv%@_";
        objectArray[34] = "\u001a^\u0000\u0017TRNV]\n$]*_QRYTK^H\tX";
        objectArray[35] = "(\u0018F\u001d\u0002\u0014qK\u001a\u001a?\u0011,]\u001f\u0003S#x\u001e@[\u0000t(P\u0015\u0002Y\u00101XO\u001e?";
        objectArray[36] = "\u0007\u007f*\u0002jwSww\u001f\u001ar7,m\tq'F\"l\u001a I\u000b$|G#-\\!!D\u001a";
        objectArray[37] = "&: Q\u0013`}(w^}=+&xK\u0011\u000fyk \u001d}8|# M@`(6&,";
        objectArray[38] = "t|@bXR t\u001d\u007f(SD}\u0011'UT%|\b|T";
        objectArray[39] = "G|\"\u0001\u0014\u0002\u0013t\u007f\u001cd\u0000w}sD\u0019\u0004\u0016|j\u001f\u0018";
        objectArray[40] = "+Ftti#!\u0005zu\u0017e\u001a\u001efy|2k\u0010gj-\\y\u0019vo&ac\u0005zn\u0017";
        objectArray[41] = "\u00149\u0014\u001f\u0015s\u0015 O\u001e-($9\u0014\fG`B8\u001a\u0012P\u0012\u00188F\\\u0014vO=\u001b_-";
        objectArray[42] = "t#a\u0003*?6d\"\bC!'bs^/\u0013z%)\u0001C-;tu_'43.i9\u007f+*ptB\"z*\u001e";
        objectArray[43] = "5-8i\u001dBh~kcr\u0014kpm4%C1&3XMJ;,f`\u0010\u0019h&";
        objectArray[44] = "\u001e\u0014jw7gJ\u001c7jGi.K)t=cAO)t{";
        objectArray[45] = "#@ki#m:\na/NmH^a6,>9Qnn7";
        objectArray[46] = "k5\u0011mmd6d\u0011\u0003or+:\u0016o]%i`I?\ng*;\u000fcen>*q";
        objectArray[47] = "\u000fCkA\u001d2\b\u0015`Hp&SCu\u0014'q\r\u0014-x\u001d4_Hm\u001cLw\n^";
        objectArray[48] = "UMt\u0001+=QMtG\u0011n;Vq\u000bz<JXp\u0018+R[\u000euCpo\u0003Z`E\u0011";
        objectArray[49] = "TQ_#\u0012p\u0005C_|q!\bY\u0019(\u0010,\u0014?^0\u000e(^\u0005\u0005|A{o\u0003\u000f-Os\u000bT\npLJ";
        objectArray[50] = "4u4 \u001ao3#?)w{hu*u ,7(q\u0019I({\"'b\u000bo8)";
        objectArray[51] = "3D\u0001#N\r=OX%u\u0010`A]!\u0019\"4\u0002\u0002vNu2\r\fw\u001aMo^_}u";
        objectArray[52] = "8-*\u001f@)i?*@#rx\u000eu\u0005_b\u0003\u007fz\u0011\u001d*g(\u007fL\u001e\u0013";
        objectArray[53] = "(\u0001<]oE/W7T\u0002Qt\u0001\"\bU\u0006*R{d<F)\t}\u001c2Mp\u000f";
        objectArray[54] = "\u0007~eB\u001f\u001d\r=kCa[6ygEX\u000fL~1NQ";
        objectArray[55] = "\u0014bH\\&f\u0005&]MH4\u00142W]\u001fjLa\t1(`\fgR\fp4\u0019a";
        Object[] objectArray2 = objectArray;
        objectArray[56] = "}=y:q,/759\u0012[X\u0013\rON\u0010}=y:q,/759";
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
            throw new RuntimeException("dev/krypton/5l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5l_0.e(l2, l3);
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
                clazz3 = _5l_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5l_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5l_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5l_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5l_0.f(403147167328953L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5l_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5l_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5l_0.f(403147167328953L, 0L);
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
            int n = _5l_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5l_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5l_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5l_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5l_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5l_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x561B;
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
                throw new RuntimeException("dev/krypton/5l", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5l_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5l_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5l_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5l_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5l_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5l_0.c(clazz3, string2, clazz2)) != null) {
                    _5l_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5l_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5l_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5l_0.f(403147167328953L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean boolean_3(Object[] objectArray) {
        Object object;
        block6: {
            block7: {
                boolean bl;
                block9: {
                    block8: {
                        long l2 = (Long)objectArray[0];
                        long l3 = l2 = b ^ l2;
                        long l4 = l3 ^ 0x6527C59D23BCL;
                        long l5 = l3 ^ 0x6FD89EF2504DL;
                        _4w[] wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                try {
                                    object = _5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)this, -1280534067761641691L, (long)l2), (long)l4, -1280917666615343109L, (long)l2);
                                    if (wArray != null) break block6;
                                    if (object == false) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw _5l_0.a(matchException);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l5;
                                if (_5l_0.c("\u00cc", (Object)_5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)_5l_0.c("P", (Object)this, -1279399637155375423L, (long)l2), -1281044981999819030L, (long)l2), -1280355669180379423L, (long)l2), -1280635158628892723L, (long)l2) != _5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)this, -1281255543988528932L, (long)l2), (Object)objectArray2, -1279285669744822837L, (long)l2)) break block8;
                            }
                            catch (MatchException matchException) {
                                throw _5l_0.a(matchException);
                            }
                            bl = true;
                            break block9;
                        }
                        catch (MatchException matchException) {
                            throw _5l_0.a(matchException);
                        }
                    }
                    bl = false;
                }
                return bl;
            }
            object = true;
        }
        return (boolean)object;
    }

    @_3i_0
    public void cfr_renamed_6(_6G g) {
        block25: {
            block29: {
                CallSite callSite;
                CallSite callSite2;
                long l2;
                long l3;
                block28: {
                    _5l_0 l_0;
                    _4w[] wArray;
                    block27: {
                        CallSite callSite3;
                        block26: {
                            _5l_0 l_02;
                            long l4;
                            block24: {
                                block22: {
                                    block23: {
                                        long l5 = l3 = b ^ 0x1F31D0F0EEFFL;
                                        l2 = l5 ^ 0x72DAEB3327F6L;
                                        l4 = l5 ^ 0x7CA3BADCE8ABL;
                                        long l6 = l5 ^ 0x21CA6C2800CCL;
                                        wArray = _3s.cfr_renamed_5();
                                        try {
                                            try {
                                                l_02 = this;
                                                if (wArray != null) break block22;
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l6;
                                                if (_5l_0.c("\u00cc", (Object)l_02, (Object)objectArray, 2678837727015960798L, (long)l3) != false) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5l_0.a(matchException);
                                            }
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5l_0.a(matchException);
                                        }
                                    }
                                    l_02 = this;
                                }
                                try {
                                    try {
                                        if (wArray != null) break block24;
                                        if (_5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)_5l_0.c("P", (Object)l_02, 2677866387029286358L, (long)l3), 2677811682425856156L, (long)l3), 2677657384556275109L, (long)l3) != _5l_0.c("\u00da", 2679307204636503469L, (long)l3)) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5l_0.a(matchException);
                                    }
                                    l_02 = this;
                                }
                                catch (MatchException matchException) {
                                    throw _5l_0.a(matchException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        callSite3 = _5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)l_02, 2678724996656004303L, (long)l3), (long)l4, 2679181835767844076L, (long)l3);
                                        if (wArray != null) break block26;
                                        if (callSite3 == false) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5l_0.a(matchException);
                                    }
                                    l_0 = this;
                                    if (wArray != null) break block27;
                                }
                                catch (MatchException matchException) {
                                    throw _5l_0.a(matchException);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l2;
                                callSite3 = _5l_0.c("\u00cc", (Object)_5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)l_0, 2678548811861818295L, (long)l3), (Object)objectArray, 2676241349978405297L, (long)l3), 2677741522739902732L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw _5l_0.a(matchException);
                            }
                        }
                        if (callSite3 != false) break block29;
                        l_0 = this;
                    }
                    callSite2 = _5l_0.c("P", (Object)_5l_0.c("P", (Object)l_0, 2677866387029286358L, (long)l3), 2677811682425856156L, (long)l3);
                    try {
                        try {
                            callSite = callSite2;
                            if (wArray != null) break block28;
                            if (!(callSite instanceof class_3965)) break block29;
                        }
                        catch (MatchException matchException) {
                            throw _5l_0.a(matchException);
                        }
                        callSite = callSite2;
                    }
                    catch (MatchException matchException) {
                        throw _5l_0.a(matchException);
                    }
                }
                class_3965 class_39652 = (class_3965)callSite;
                callSite2 = _5l_0.c("\u00cc", (Object)_5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)_5l_0.c("P", (Object)this, 2677866387029286358L, (long)l3), 2677547546242230022L, (long)l3), (Object)_5l_0.c("\u00cc", (Object)class_39652, 2678779184675934743L, (long)l3), 2679224153582558416L, (long)l3), 2679536050256836969L, (long)l3);
                try {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    if (_5l_0.c("\u00cc", (Object)_5l_0.c("\u00cc", (Object)_5l_0.c("P", (Object)this, 2678548811861818295L, (long)l3), (Object)objectArray, 2676241349978405297L, (long)l3), (Object)callSite2, 2677477844384495433L, (long)l3) != false) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _5l_0.a(matchException);
                }
            }
            g.void_8();
        }
    }

    /*
     * Exception decompiling
     */
    @_3i_0
    public void cfr_renamed_0(_6C var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 11[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5l_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5l_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

