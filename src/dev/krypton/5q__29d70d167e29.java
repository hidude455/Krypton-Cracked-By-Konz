/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 *  net.minecraft.class_1820
 *  net.minecraft.class_2202
 *  net.minecraft.class_2211
 *  net.minecraft.class_2397
 *  net.minecraft.class_2680
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6Y;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
import dev.krypton._9r;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_1820;
import net.minecraft.class_2202;
import net.minecraft.class_2211;
import net.minecraft.class_2397;
import net.minecraft.class_2680;

/*
 * Renamed from dev.krypton.5q
 */
public class _5q_0
extends _6x_0 {
    private final _9r cfr_renamed_7;
    private final _92 cfr_renamed_1;
    private boolean cfr_renamed_8;
    private int cfr_renamed_3;
    private int cfr_renamed_6;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _5q_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x98B799CC046L;
        long l5 = l3 ^ 0x19EB4B55B9D5L;
        long l6 = l3 ^ 0x23F6904DB917L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x5FB3EEDF482FL;
        long l9 = l3 ^ 0x40737DFBA75DL;
        long l10 = l3 ^ 0xAC7BF292C8BL;
        super((int)_5q_0.a("x", 31201, (long)(0x3AA52E2AA65C0AF7L ^ l2)), -1, (_4r)((Object)_5q_0.c("\u00c1", -2229775669182853269L, (long)l2)), l8);
        this.cfr_renamed_7 = new _9r((int)_5q_0.a("x", 31176, (long)(0x33044D960DE20ADAL ^ l2)), true, l4);
        this.cfr_renamed_1 = new _92((int)_5q_0.a("x", 18045, (long)(0x52CC531E5C52B56DL ^ l2)), 1.0, l5, 100.0, 5.0, 1.0);
        CallSite callSite = _5q_0.c("\u00a3", (Object)this, -2227624761711884914L, (long)l2);
        CallSite callSite2 = _5q_0.c("\u00a3", (Object)this, -2230521216681106390L, (long)l2);
        _5q_0.c("L", (Object)callSite2, -2230728963509533220L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5q_0.c("\u00cf", (Object)callSite, (Object)objectArray, -2228068215587323124L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5q_0.c("\u00a3", (Object)this, -2230521216681106390L, (long)l2), _5q_0.c("\u00a3", (Object)this, -2227624761711884914L, (long)l2)};
        objectArray2[0] = l9;
        _5q_0.c("\u00cf", (Object)this, (Object)objectArray2, -2231027784420534264L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _5q_0.b = l.a(756911867643716187L, -1030921821084331896L, MethodHandles.lookup().lookupClass()).a(193901606267930L);
                _5q_0.j = new Object[77];
                _5q_0.k = new String[77];
                _5q_0.b();
                _5q_0.f = new HashMap<K, V>(13);
                var0 = _5q_0.b ^ 109603928257751L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "2\u00fbe\u00a6\u00f4\u00bc?%H\u00fe\u008a\u00d7d\u00c5\u00a7\u0013l\u00a4\u00e7^\u00d3\u00a3R\u0088\u00078\u00f6U\u00e59\u00f1\u0016\u00c8t`\u00de|&\u0088\u00b0";
                var7_6 = "2\u00fbe\u00a6\u00f4\u00bc?%H\u00fe\u008a\u00d7d\u00c5\u00a7\u0013l\u00a4\u00e7^\u00d3\u00a3R\u0088\u00078\u00f6U\u00e59\u00f1\u0016\u00c8t`\u00de|&\u0088\u00b0".length();
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
                    var6_5 = "\u00c3\u00acX\u00b0lxx\u0085^E\u00ca\u00c6\u00c2[\u0015\u0089";
                    var7_6 = "\u00c3\u00acX\u00b0lxx\u0085^E\u00ca\u00c6\u00c2[\u0015\u0089".length();
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
        _5q_0.d = var8_3;
        _5q_0.e = new Integer[7];
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
            case 0 -> 56;
            case 1 -> 60;
            case 2 -> 44;
            case 3 -> 26;
            case 4 -> 1;
            case 5 -> 45;
            case 6 -> 11;
            case 7 -> 12;
            case 8 -> 3;
            case 9 -> 19;
            case 10 -> 20;
            case 11 -> 21;
            case 12 -> 48;
            case 13 -> 23;
            case 14 -> 43;
            case 15 -> 55;
            case 16 -> 41;
            case 17 -> 42;
            case 18 -> 8;
            case 19 -> 63;
            case 20 -> 37;
            case 21 -> 27;
            case 22 -> 13;
            case 23 -> 17;
            case 24 -> 34;
            case 25 -> 30;
            case 26 -> 50;
            case 27 -> 49;
            case 28 -> 5;
            case 29 -> 61;
            case 30 -> 53;
            case 31 -> 6;
            case 32 -> 46;
            case 33 -> 32;
            case 34 -> 54;
            case 35 -> 29;
            case 36 -> 24;
            case 37 -> 18;
            case 38 -> 15;
            case 39 -> 0;
            case 40 -> 4;
            case 41 -> 14;
            case 42 -> 22;
            case 43 -> 36;
            case 44 -> 38;
            case 45 -> 16;
            case 46 -> 40;
            case 47 -> 10;
            case 48 -> 62;
            case 49 -> 51;
            case 50 -> 25;
            case 51 -> 59;
            case 52 -> 28;
            case 53 -> 47;
            case 54 -> 2;
            case 55 -> 58;
            case 56 -> 31;
            case 57 -> 57;
            case 58 -> 35;
            case 59 -> 9;
            case 60 -> 52;
            case 61 -> 7;
            case 62 -> 39;
            default -> 33;
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
        _5q_0.k[n3] = new String(cArray);
        return n3;
    }

    public static boolean boolean_9(Object[] objectArray) {
        Object object;
        block18: {
            block20: {
                block19: {
                    long l2 = (Long)objectArray[0];
                    class_1799 class_17992 = (class_1799)objectArray[1];
                    l2 = b ^ l2;
                    int n = _7C.cfr_renamed_9();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        object = _5q_0.c("\u00cf", (Object)class_17992, (Object)_5q_0.c("\u00c1", -5336894914181366813L, (long)l2), -5336777939098978572L, (long)l2);
                                                        if (n == 0) break block18;
                                                        if (object != false) break block19;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5q_0.a(matchException);
                                                    }
                                                    object = _5q_0.c("\u00cf", (Object)class_17992, (Object)_5q_0.c("\u00c1", -5338537363528292073L, (long)l2), -5336777939098978572L, (long)l2);
                                                    if (n == 0) break block18;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5q_0.a(matchException);
                                                }
                                                if (object != false) break block19;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5q_0.a(matchException);
                                            }
                                            object = _5q_0.c("\u00cf", (Object)class_17992, (Object)_5q_0.c("\u00c1", -5336930012821976409L, (long)l2), -5336777939098978572L, (long)l2);
                                            if (n == 0) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5q_0.a(matchException);
                                        }
                                        if (object != false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5q_0.a(matchException);
                                    }
                                    object = _5q_0.c("\u00cf", (Object)class_17992, (Object)_5q_0.c("\u00c1", -5338809770289073730L, (long)l2), -5336777939098978572L, (long)l2);
                                    if (n == 0) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw _5q_0.a(matchException);
                                }
                                if (object != false) break block19;
                            }
                            catch (MatchException matchException) {
                                throw _5q_0.a(matchException);
                            }
                            object = _5q_0.c("\u00cf", (Object)class_17992, -5338518933290236527L, (long)l2) instanceof class_1820;
                            if (n == 0) break block18;
                        }
                        catch (MatchException matchException) {
                            throw _5q_0.a(matchException);
                        }
                        if (object == false) break block20;
                    }
                    catch (MatchException matchException) {
                        throw _5q_0.a(matchException);
                    }
                }
                object = true;
                break block18;
            }
            object = false;
        }
        return (boolean)object;
    }

    @_3i_0
    public void cfr_renamed_1(_9o o) {
        block16: {
            _5q_0 q_0;
            long l2;
            block14: {
                l2 = b ^ 0x740AF8F05D0CL;
                long l3 = l2 ^ 0x770953C0413CL;
                int n = _7C.cfr_renamed_3();
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                q_0 = this;
                                                if (n != 0) break block14;
                                                if (_5q_0.c("\u00a3", (Object)q_0, 9161405904964003085L, (long)l2) > 0) break block15;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5q_0.a(matchException);
                                            }
                                            q_0 = this;
                                            if (n != 0) break block14;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5q_0.a(matchException);
                                        }
                                        if (_5q_0.c("\u00a3", (Object)q_0, 9167952695985039022L, (long)l2) == false) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5q_0.a(matchException);
                                    }
                                    q_0 = this;
                                    if (n != 0) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw _5q_0.a(matchException);
                                }
                                if (_5q_0.c("\u00a3", (Object)q_0, 9160799278747947335L, (long)l2) == -1) break block15;
                            }
                            catch (MatchException matchException) {
                                throw _5q_0.a(matchException);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l3;
                            objectArray[0] = (int)_5q_0.c("\u00a3", (Object)this, 9160799278747947335L, (long)l2);
                            _5q_0.c("L", (Object)objectArray, 9167467245729556159L, (long)l2);
                            _5q_0.c("O", (Object)this, (boolean)_5q_0.a("x", 18279, (long)(0x7EC6B5A99AC8AA5DL ^ l2)), 9167952695985039022L, (long)l2);
                            if (n == 0) break block16;
                        }
                        catch (MatchException matchException) {
                            throw _5q_0.a(matchException);
                        }
                    }
                    q_0 = this;
                }
                catch (MatchException matchException) {
                    throw _5q_0.a(matchException);
                }
            }
            _5q_0.c("O", (Object)q_0, (int)(_5q_0.c("\u00a3", (Object)q_0, 9161405904964003085L, (long)l2) - true), 9161405904964003085L, (long)l2);
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == 'O' || c == '\u00c1' || c == 'H') {
                field = _5q_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5q_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = j;
        j[0] = "O\n\u0012p^\rO\n\u0005,R\u0002UA\u00052R\u0017R0Uj\u000b]";
        objectArray[1] = " 0\u0016\u0004\") 0\u0001X.&:{\u0001F.3=\nT\u0012yr";
        objectArray[2] = "+\u0017R+39+\u0017Ew?61\\Ei?#6-\u00172gi";
        objectArray[3] = Boolean.TYPE;
        _5q_0.k[3] = "java/lang/Boolean";
        objectArray[4] = ":\u0005\"QV\u000e:\u00055\rZ\u0001 N5\u0013Z\u0014'?gH\u0002U";
        objectArray[5] = "HK\"wwNHK5+{AR\u000055{TUqdo\"\u0017";
        objectArray[6] = ");\u000e\u0016[');\u0019JW(3p\u0019TW=4\u0001H\n\u0002v";
        objectArray[7] = Float.TYPE;
        _5q_0.k[7] = "java/lang/Float";
        objectArray[8] = "\u0007\u0003\u001c\u000eq\b\u001a\u0016\u001eOtTV\u0017";
        objectArray[9] = ":i\u0002.YyOI\t!H6.G\u0002*LlZ";
        objectArray[10] = "[)Dq\u001e^[)S-\u0012QAbS3\u0012DF\u0013\u0003kK\u0006";
        objectArray[11] = "\u00053f\u000b\n=\u001b;|DB=\u00011d\u0003K&A\u0002b\u000f@!\f3d\u000f";
        objectArray[12] = "\u001f\u0003c\u0001X,\u0014\frN9\"\u001f\u0007v\u0014";
        objectArray[13] = Integer.TYPE;
        _5q_0.k[13] = "java/lang/Integer";
        objectArray[14] = "m*7v,mp?57)10=";
        objectArray[15] = "P:av#\u001dM/c7&A\rm";
        objectArray[16] = Long.TYPE;
        _5q_0.k[16] = "java/lang/Long";
        objectArray[17] = "I\u007f\u000e\u0012\u001fS<_\u0005\u001d\u000e\u001c]Q\u000e\u0016\nF)";
        objectArray[18] = "\\\\|i.3)|wf?|Hr|m;&<";
        objectArray[19] = "K_\u0014f4\u0017VJ\u0016'1K\u0017@";
        objectArray[20] = ".#C\u0001{5[\u0003H\u000ejz:\rC\u0005n N";
        objectArray[21] = Void.TYPE;
        _5q_0.k[21] = "java/lang/Void";
        objectArray[22] = "YRhX,/YR\u007f\u0004  C\u0019\u007f\u001a 5Dh/Gq";
        objectArray[23] = "?\rxs{P?\ro/w_%Fo1wJ\"7;i ";
        objectArray[24] = "!\u001a`b\u0003\u0005!\u001aw>\u000f\n;Qw \u000f\u001f< \"\u007fV";
        objectArray[25] = "Mt`FNQPab\u0007K\r\u001fi";
        objectArray[26] = "\u0015bI+sE\u0015b^w\u007fJ\u000f)^i\u007f_\bX\u000e4+";
        objectArray[27] = "TV:uO*TV-)C%N\u001d-7C0Il}k\u0016";
        objectArray[28] = "G,@ N\u0007G,W|B\b]gWbB\u001dZ\u0016\u00058\u0015_";
        objectArray[29] = "=\u001at\u0002ctH:\u007f\rr;)4t\u0006va]";
        objectArray[30] = Double.TYPE;
        _5q_0.k[30] = "java/lang/Double";
        objectArray[31] = "~\u001aee+2~\u001ar9'=dQr''(c #xuc";
        objectArray[32] = "zN-t):g[/5,f'\u001e";
        objectArray[33] = "\u001c\u0017\u0003\tF\u0005i7\b\u0006WJ\b9\u0003\rS\u0010|";
        objectArray[34] = "&\u0003Xg\u0001=;\u0016Z&\u0004av\u0014";
        objectArray[35] = "\u00071\u0019*#,r\u0011\u0012%2c\u0013\u001f\u0019.69g";
        objectArray[36] = "-BEc\u001e 3J_,\u007f7-FPvC";
        objectArray[37] = "\u0005\u0012b\t@\u000bDZ7\u0015:SRT2\u0013Va\u0000\u0019hH:\n\u0003Nl\u001eX\tMUot\u0007[BB3\u0017\u000b\f_MR";
        objectArray[38] = "\\9&>f:X\u007f~8\u00181b2(zq`\u00079'is";
        objectArray[39] = "SY2\u000b\u0016sW\u001fj\rhsm\u0004eL\u0015!\u0010\ruI\u0017BW\u00044T\u000e|R\u0003qNh";
        objectArray[40] = "\u001eH\u007fJ\u001bGHN#2\u0014_NA\"eF\u0004\u001d\u001cr2C\u0001E\u001cs\u0002AEX\u001c";
        objectArray[41] = "&y@(\u001aYx.^c#s\u0001EmZEQ&l\u001f5\u001b\u00068'";
        objectArray[42] = "\r0;q*VLxnmP\u000eZvkk<<\f363kk\u000e5m5m[\fqp5PQP2ijnTWws\f";
        objectArray[43] = "%@8R\u0012\u0014sFd*\u001d\fuIe}OW&\u00143*JR~\u00144\u001aH\u0016c\u0014";
        objectArray[44] = "\u001bZD\u0014\u000f{M\\\u0018l\u0000cKS\u0019;R8\u0018\u000eLlW=@\u000eH\\Uy]\u000e";
        objectArray[45] = "N\u000f\u001dG\u0002E\u001e\u0011\u0017\u001fhLL\u001d\fB\u0004~\u001fYP\u001ah\u0013\u001bQ\u0011_URS\u0004\r%";
        objectArray[46] = "M\u0007CK\u000eN\u000e\u0013\u001d\u0014b\u001a\u0012\u001bAE5MNJ\u0015\u0010bML\u0010\u001c\u0014RO\b\r\u001c";
        objectArray[47] = "bMV7_\u0003f\u000b\u000e1!\t\\FXsHY9MW`J";
        objectArray[48] = "?\u0012D\f/\u001c`\f\u0013T\u0011J?\u0010KYF\u001dnM\u00115s\u001aa\u001cS\\!Mg\f";
        objectArray[49] = "\u001aOm/\fyH\u0018k?pu\u0015\r2)\u001cGBJn~I\u0010B\u0016j,\u0016.G\u0011/6p}\t\u001f/#\u000br@\f2N";
        objectArray[50] = "\u0018{\u0015NH{Y3@R2#O=ET^\u0011\u001dp\u001d\u00022}K~BRJ!Y8F3";
        objectArray[51] = "\u0018\u0016-\u000f\u0012EN\u0010qw\u001d]H\u001fp O\u0006\u001bB'wJ\u0003CB!GHG^B";
        objectArray[52] = "&\u0004NJ`y\"B\u0016L\u001eu\u0018Y\u0019\rc+eP\t\baH\"YH\u0015xv'^\r\u000f\u001e";
        objectArray[53] = "j\"{\u0014 X`bs\u0012J_e7v\u001d\u001d\b:k*q+^oc,It@8;";
        objectArray[54] = "J\u001bU\u0003\u0003?\u0015\u0001T\u0013z=*\u001c^\u0018\u0007gW\u0015N\u001d\u0005\u0004G\nY\u001f\u0017\u007fHCJ\u0002z";
        objectArray[55] = "\u007fw#<\u00063)q\u007fD\t+/~~\u0013[p|#/D^u$#/t\\19#";
        objectArray[56] = "IkffGX\u0016&!1'_xp|9_\n\u0016qc$WeB} :A[Gze '";
        objectArray[57] = "\u0010\u007fyZh#\u0012&:\u0016\u000f#\u001e9k\u0001c\u0011Ny0V\u000fwC<b\rj|L/`f5|C8q[t4\u0016$\u000b";
        objectArray[58] = "S(\u000fGqGN?\u0001\u0000\u001bPF>B[aGm Y|fNOG\u000fJyEA*\u000fC*\u0015+wOXt@FwF\u000b$*";
        objectArray[59] = "o&p\u0016\\3lhk\u001564>fvOZ\u0006i$/\u0016\nQj%p\u0011\u000baham\u00116k4\"tN\bn3gn(";
        objectArray[60] = "#bh\u0012At/:s\u001e*)!yc\u001aF\u001b|>9E*(=}lEC>>i|}\u0016p*;i\u001f\u0015>18\u0003";
        objectArray[61] = "ga\u001a\rl$d/\u0001\u000e\u0006#6!\u001cTj\u0011acF\u000b:Fgm\u001cQd k>L^\u0006";
        objectArray[62] = "Px>\u0002!\u0006\u00110k\u001e[^\u0007>n\u00187lUs5A[\nZ;g\u0014>\u0001U(e\u007f";
        objectArray[63] = "\u0014c\u0002/\u0007,\u0010%Z)y!*hMlG}\u00177\u0000+\u0010";
        objectArray[64] = "\"\fmd\u000f\u0018|Nk=0HG\u0013z$M\u0017:\u001aj!Ot\"\fmd\u000f\u0018|Nk=0";
        objectArray[65] = "XX\n$-gR\u0018\u0002\"G`WM\u0007-\u00107\t\u001a_A(`GB\t-x~M\u001a";
        objectArray[66] = "R\u001e6\u001bow\u0013Vc\u0007\u0015/\u0005Xf\u0001y\u001dW\u0015?W\u0015{X]o\rppWNmf";
        objectArray[67] = "{5\f\u0005{nqu\u0004\u0003\u0011it \u0001\fF>+}Z`~`~\"\u000eXr8e.";
        objectArray[68] = "P\"NPQS\u000f8O@(Q0,TXM\u0002Y&\u0014PK";
        objectArray[69] = "\"&:Qwk&`bW\tg\u001c&cTk<\"#d\u0011q";
        objectArray[70] = "-~enU])8=h+]\u0013-&(Z\\r-75\u0015";
        objectArray[71] = "^\u000e+.{\u001e\u000e\u0010!v\u0011\u0017\\\u001c:+}%\nYgp!rRZ(pv\u0017P\u0003k<\u0011";
        objectArray[72] = "\u001f1\u0000},\u0013^yUaVKHwPg:y\u001a:\r9V\u0012\u0019m\u000ej4\u0011Wv\r\u0000lI\u001diV>iNXs0";
        objectArray[73] = "A{\u0015k\u0015_Aj\b$%\u0003(a\u0007`X]Uh\u0017eZ>\u00196\u0017sN[\u00129\u0004q%";
        objectArray[74] = "B\u0013u'\u0012sFU-!ly|N\"`\u0011!\u0001G2e\u0013B\u001fXq`\u0006#\u0001S%\"l";
        objectArray[75] = "HNGeG[\u001bO\u001c#9[\u001aM_\u001e\tW\u0015YIs\t^F\t#$^\u001f\u0015P\u001d!YZ\u000f6";
        Object[] objectArray2 = objectArray;
        objectArray[76] = "\r9\u0018\"p[\u0004/H)\u000eXa:A:s\u0003\u001c3Q?q`\f,F=c\u001b\u0003eU \u000e";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5q_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
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
            throw new RuntimeException("dev/krypton/5q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5q_0.e(l2, l3);
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
                clazz3 = _5q_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5q_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5q_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5q_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5q_0.f(907100716978411L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5q_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5q_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5q_0.f(907100716978411L, 0L);
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
            int n = _5q_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5q_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5q_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5q_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5q_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5q_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1210;
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
                throw new RuntimeException("dev/krypton/5q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5q_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5q_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5q_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5q_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5q_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5q_0.c(clazz3, string2, clazz2)) != null) {
                    _5q_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5q_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5q_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5q_0.f(907100716978411L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double double_3(Object[] var0) {
        block45: {
            block48: {
                block46: {
                    block47: {
                        block44: {
                            block42: {
                                block43: {
                                    block41: {
                                        var4_1 = (class_1799)var0[0];
                                        var1_2 = (Long)var0[1];
                                        var5_3 = (class_2680)var0[2];
                                        var3_4 = (Predicate)var0[3];
                                        var6_5 = (var1_2 = _5q_0.b ^ var1_2) ^ 86419642596403L;
                                        var8_6 = _7C.cfr_renamed_9();
                                        try {
                                            try {
                                                v0 /* !! */  = _5q_0.c("\u00cf", (Object)var3_4, (Object)var4_1, (long)-6061064363252039008L, (long)var1_2);
                                                if (var8_6 == 0) break block41;
                                                if (v0 /* !! */  != false) {
                                                }
                                                ** GOTO lbl37
                                            }
                                            catch (MatchException v1) {
                                                throw _5q_0.a(v1);
                                            }
                                            v2 = new Object[2];
                                            v2[1] = var4_1;
                                            v2[0] = var6_5;
                                            v0 /* !! */  = _5q_0.c("L", (Object)v2, (long)-6054526924923543027L, (long)var1_2);
                                        }
                                        catch (MatchException v3) {
                                            throw _5q_0.a(v3);
                                        }
                                    }
                                    try {
                                        try {
                                            v4 = var8_6;
                                            if (var1_2 > 0L) {
                                                if (v4 == 0) break block42;
                                                if (v0 /* !! */  != false) break block43;
                                            }
                                            ** GOTO lbl46
                                        }
                                        catch (MatchException v5) {
                                            throw _5q_0.a(v5);
                                        }
lbl37:
                                        // 2 sources

                                        return -1.0;
                                    }
                                    catch (MatchException v6) {
                                        throw _5q_0.a(v6);
                                    }
                                }
                                v0 /* !! */  = _5q_0.c("\u00cf", (Object)var4_1, (Object)var5_3, (long)-6061271162647303002L, (long)var1_2);
                            }
                            try {
                                try {
                                    v4 = var8_6;
lbl46:
                                    // 2 sources

                                    if (var1_2 > 0L) {
                                        if (v4 == 0) break block44;
                                        if (v0 /* !! */  != false) break block45;
                                    }
                                    ** GOTO lbl63
                                }
                                catch (MatchException v7) {
                                    throw _5q_0.a(v7);
                                }
                                v0 /* !! */  = _5q_0.c("\u00cf", (Object)var4_1, (Object)_5q_0.c("\u00c1", (long)-6054222134257461649L, (long)var1_2), (long)-6054323898072946463L, (long)var1_2);
                            }
                            catch (MatchException v8) {
                                throw _5q_0.a(v8);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        v4 = var8_6;
lbl63:
                                        // 2 sources

                                        if (v4 == 0) break block46;
                                        if (v0 /* !! */  != false) {
                                        }
                                        ** GOTO lbl96
                                    }
                                    catch (MatchException v9) {
                                        throw _5q_0.a(v9);
                                    }
                                    v0 /* !! */  = (CallSite)(_5q_0.c("\u00cf", (Object)var5_3, (long)-6052994256572227418L, (long)var1_2) instanceof class_2211);
                                    v10 = var8_6;
                                    if (var1_2 > 0L) {
                                        if (v10 == 0) break block47;
                                    }
                                    ** GOTO lbl89
                                }
                                catch (MatchException v11) {
                                    throw _5q_0.a(v11);
                                }
                                if (v0 /* !! */  != false) break block45;
                            }
                            catch (MatchException v12) {
                                throw _5q_0.a(v12);
                            }
                            v0 /* !! */  = (CallSite)(_5q_0.c("\u00cf", (Object)var5_3, (long)-6052994256572227418L, (long)var1_2) instanceof class_2202);
                        }
                        catch (MatchException v13) {
                            throw _5q_0.a(v13);
                        }
                    }
                    try {
                        try {
                            v10 = var8_6;
lbl89:
                            // 2 sources

                            if (var1_2 > 0L) {
                                if (v10 == 0) break block46;
                                if (v0 /* !! */  != false) break block45;
                            }
                            ** GOTO lbl106
                        }
                        catch (MatchException v14) {
                            throw _5q_0.a(v14);
                        }
lbl96:
                        // 2 sources

                        v0 /* !! */  = (CallSite)(_5q_0.c("\u00cf", (Object)var4_1, (long)-6053812547249710204L, (long)var1_2) instanceof class_1820);
                    }
                    catch (MatchException v15) {
                        throw _5q_0.a(v15);
                    }
                }
                try {
                    block49: {
                        try {
                            try {
                                try {
                                    v10 = var8_6;
lbl106:
                                    // 2 sources

                                    if (v10 == 0) break block48;
                                    if (v0 /* !! */  == false) break block49;
                                }
                                catch (MatchException v16) {
                                    throw _5q_0.a(v16);
                                }
                                v0 /* !! */  = (CallSite)(_5q_0.c("\u00cf", (Object)var5_3, (long)-6052994256572227418L, (long)var1_2) instanceof class_2397);
                                if (var1_2 <= 0L || var8_6 == 0) break block48;
                            }
                            catch (MatchException v17) {
                                throw _5q_0.a(v17);
                            }
                            if (v0 /* !! */  != false) break block45;
                        }
                        catch (MatchException v18) {
                            throw _5q_0.a(v18);
                        }
                    }
                    v0 /* !! */  = _5q_0.c("\u00cf", (Object)var5_3, (Object)_5q_0.c("\u00c1", (long)-6054087708669323524L, (long)var1_2), (long)-6053145023483509115L, (long)var1_2);
                }
                catch (MatchException v19) {
                    throw _5q_0.a(v19);
                }
            }
            try {
                if (v0 /* !! */  == false) {
                    return -1.0;
                }
            }
            catch (MatchException v20) {
                throw _5q_0.a(v20);
            }
        }
        var9_7 = 0.0;
        return var9_7 += (double)(_5q_0.c("\u00cf", (Object)var4_1, (Object)var5_3, (long)-6054696804124210625L, (long)var1_2) * 1000.0f);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_6(_6Y var1_1) {
        block42: {
            block41: {
                block39: {
                    block40: {
                        block37: {
                            block35: {
                                block32: {
                                    v0 = var2_2 = _5q_0.b ^ 52307452302434L;
                                    var4_3 = v0 ^ 22557923590034L;
                                    var6_4 = v0 ^ 79943772309314L;
                                    var8_5 = v0 ^ 97051898323335L;
                                    var10_6 = v0 ^ 49003096770642L;
                                    var12_7 = v0 ^ 29679035298102L;
                                    var15_8 = _5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)_5q_0.c("\u00a3", (Object)this, (long)3915100202328166601L, (long)var2_2), (long)3915023593000909781L, (long)var2_2), (Object)var1_1.cfr_renamed_8, (long)3912259429513226266L, (long)var2_2);
                                    v1 = _7C.cfr_renamed_3();
                                    var16_9 = _5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)_5q_0.c("\u00a3", (Object)this, (long)3915100202328166601L, (long)var2_2), (long)3914885437373061207L, (long)var2_2), (long)3913456846381269613L, (long)var2_2);
                                    var17_10 = -1.0;
                                    _5q_0.c("O", (Object)this, (int)_5q_0.a("x", (int)7669, (long)(5774747512963021218L ^ var2_2)), (long)3913603819476375593L, (long)var2_2);
                                    var14_12 = v1;
                                    for (var19_11 = 0; var19_11 < _5q_0.a("x", (int)13027, (long)(7282445277034157746L ^ var2_2)); ++var19_11) {
                                        block34: {
                                            block33: {
                                                var20_13 = _5q_0.c("\u00cf", (Object)_5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)_5q_0.c("\u00a3", (Object)this, (long)3915100202328166601L, (long)var2_2), (long)3914885437373061207L, (long)var2_2), (long)3915301881990258672L, (long)var2_2), (int)var19_11, (long)3912014700162132676L, (long)var2_2);
                                                v2 = new Object[4];
                                                v2[3] = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 4(long net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((_5q_0)this, (long)var12_7);
                                                v2[2] = var15_8;
                                                v2[1] = var4_3;
                                                v2[0] = var20_13;
                                                var21_14 = _5q_0.c("L", (Object)v2, (long)3915458828358955562L, (long)var2_2);
                                                try {
                                                    try {
                                                        cfr_temp_0 = var21_14 - 0.0;
                                                        v3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                        if (var14_12 != 0) break block32;
                                                        if (var14_12 != 0) break block33;
                                                    }
                                                    catch (MatchException v4) {
                                                        throw _5q_0.a(v4);
                                                    }
                                                    if (v3 < 0) {
                                                        continue;
                                                    }
                                                }
                                                catch (MatchException v5) {
                                                    throw _5q_0.a(v5);
                                                }
                                                try {
                                                    v6 = var21_14;
                                                    if (var14_12 != 0) break block34;
                                                    cfr_temp_1 = v6 - var17_10;
                                                    v7 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                }
                                                catch (MatchException v8) {
                                                    throw _5q_0.a(v8);
                                                }
                                            }
                                            if (v7 <= 0) continue;
                                            v6 = var21_14;
                                        }
                                        var17_10 = (double)v6;
                                        _5q_0.c("O", (Object)this, (int)var19_11, (long)3913603819476375593L, (long)var2_2);
                                        if (var14_12 == 0) continue;
                                    }
                                    v3 = _5q_0.c("\u00a3", (Object)this, (long)3913603819476375593L, (long)var2_2);
                                }
                                try {
                                    block36: {
                                        try {
                                            try {
                                                try {
                                                    if (var14_12 != 0) break block35;
                                                    if (v3 == -1) break block36;
                                                }
                                                catch (MatchException v9) {
                                                    throw _5q_0.a(v9);
                                                }
                                                v10 = new Object[4];
                                                v10[3] = (Predicate<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 4(long net.minecraft.class_1799 ), (Lnet/minecraft/class_1799;)Z)((_5q_0)this, (long)var12_7);
                                                v10[2] = var15_8;
                                                v10[1] = var4_3;
                                                v10[0] = var16_9;
                                                cfr_temp_2 = var17_10 - _5q_0.c("L", (Object)v10, (long)3915458828358955562L, (long)var2_2);
                                                v3 = (reference)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                                if (var14_12 != 0) break block37;
                                            }
                                            catch (MatchException v11) {
                                                throw _5q_0.a(v11);
                                            }
                                            if (v3 <= 0) {
                                            }
                                            ** GOTO lbl112
                                        }
                                        catch (MatchException v12) {
                                            throw _5q_0.a(v12);
                                        }
                                    }
                                    v13 = new Object[2];
                                    v13[1] = var16_9;
                                    v13[0] = var6_4;
                                    v3 = _5q_0.c("\u00cf", (Object)this, (Object)v13, (long)3911672392733014663L, (long)var2_2);
                                }
                                catch (MatchException v14) {
                                    throw _5q_0.a(v14);
                                }
                            }
                            try {
                                block38: {
                                    try {
                                        try {
                                            try {
                                                if (var14_12 != 0) break block37;
                                                if (v3 != false) break block38;
                                            }
                                            catch (MatchException v15) {
                                                throw _5q_0.a(v15);
                                            }
                                            v16 = new Object[2];
                                            v16[1] = var16_9;
                                            v16[0] = var8_5;
                                            v17 = _5q_0.c("L", (Object)v16, (long)3913039882814062521L, (long)var2_2);
                                            if (var14_12 != 0) break block39;
                                        }
                                        catch (MatchException v18) {
                                            throw _5q_0.a(v18);
                                        }
                                        if (v17 != false) break block40;
                                    }
                                    catch (MatchException v19) {
                                        throw _5q_0.a(v19);
                                    }
                                }
                                v3 = _5q_0.c("\u00a3", (Object)this, (long)3913603819476375593L, (long)var2_2);
                            }
                            catch (MatchException v20) {
                                throw _5q_0.a(v20);
                            }
                        }
                        v21 = new Object[2];
                        v21[1] = var10_6;
                        v21[0] = (int)v3;
                        _5q_0.c("L", (Object)v21, (long)3915661602544709585L, (long)var2_2);
                    }
                    var16_9 = _5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)_5q_0.c("\u00a3", (Object)this, (long)3915100202328166601L, (long)var2_2), (long)3914885437373061207L, (long)var2_2), (long)3913456846381269613L, (long)var2_2);
                    v22 = new Object[2];
                    v22[1] = var16_9;
                    v22[0] = var6_4;
                    v17 = _5q_0.c("\u00cf", (Object)this, (Object)v22, (long)3911672392733014663L, (long)var2_2);
                }
                try {
                    try {
                        if (var14_12 != 0) break block41;
                        if (v17 == false) break block42;
                    }
                    catch (MatchException v23) {
                        throw _5q_0.a(v23);
                    }
                    v24 = new Object[2];
                    v24[1] = var16_9;
                    v24[0] = var8_5;
                    v17 = _5q_0.c("L", (Object)v24, (long)3913039882814062521L, (long)var2_2);
                }
                catch (MatchException v25) {
                    throw _5q_0.a(v25);
                }
            }
            try {
                if (v17 != false) {
                    _5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)_5q_0.c("\u00a3", (Object)_5q_0.c("\u00a3", (Object)this, (long)3915100202328166601L, (long)var2_2), (long)3911737588060833299L, (long)var2_2), (long)3911379110218801413L, (long)var2_2), (boolean)false, (long)3911496128668296837L, (long)var2_2);
                    var1_1.void_8();
                }
            }
            catch (MatchException v26) {
                throw _5q_0.a(v26);
            }
        }
    }

    private boolean cfr_renamed_7(long l2, class_1799 class_17992) {
        Object object;
        block2: {
            block3: {
                long l3 = (l2 = b ^ l2) ^ 0x5012C28D9452L;
                int n = _7C.cfr_renamed_9();
                try {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = class_17992;
                    objectArray[0] = l3;
                    object = _5q_0.c("\u00cf", (Object)this, (Object)objectArray, 2691206404679051671L, (long)l2);
                    if (n == 0) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _5q_0.a(matchException);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean boolean_5(Object[] objectArray) {
        reference v1;
        block11: {
            block10: {
                int n;
                long l2;
                class_1799 class_17992;
                long l3;
                block9: {
                    l3 = (Long)objectArray[0];
                    class_17992 = (class_1799)objectArray[1];
                    long l4 = l3 = b ^ l3;
                    l2 = l4 ^ 0x6379EE3D1E9FL;
                    long l5 = l4 ^ 0x3CFBE27E5EAFL;
                    n = _7C.cfr_renamed_9();
                    try {
                        try {
                            v1 = _5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)this, -7840856040909875698L, (long)l3), (long)l5, -7841224363989434824L, (long)l3);
                            if (n == 0) break block9;
                            if (v1 == false) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _5q_0.a(matchException);
                        }
                        v1 = _5q_0.c("\u00cf", (Object)class_17992, -7840784648183425079L, (long)l3) - _5q_0.c("\u00cf", (Object)class_17992, -7840489478505052815L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5q_0.a(matchException);
                    }
                }
                try {
                    try {
                        Object object = n;
                        if (l3 > 0L) {
                            if (object == 0) break block11;
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l2;
                            object = _5q_0.c("\u00cf", (Object)class_17992, -7840784648183425079L, (long)l3) * _5q_0.c("\u00cf", (Object)_5q_0.c("\u00a3", (Object)this, -7840251105478182998L, (long)l3), (Object)objectArray2, -7840175315904263524L, (long)l3) / _5q_0.a("x", 5143, (long)(0x5226648D5E91526L ^ l3));
                        }
                        if (v1 >= object) break block10;
                    }
                    catch (MatchException matchException) {
                        throw _5q_0.a(matchException);
                    }
                    v1 = (reference)true;
                    break block11;
                }
                catch (MatchException matchException) {
                    throw _5q_0.a(matchException);
                }
            }
            v1 = (reference)false;
        }
        return (boolean)v1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5q_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5q_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

