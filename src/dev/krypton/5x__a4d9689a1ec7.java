/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6u_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9j_0;
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
import net.minecraft.class_1792;
import net.minecraft.class_1799;

/*
 * Renamed from dev.krypton.5x
 */
public class _5x_0
extends _6x_0 {
    private final _9j_0 cfr_renamed_1;
    private final _92 cfr_renamed_4;
    private final _9r cfr_renamed_8;
    private final _92 cfr_renamed_3;
    private final _9r cfr_renamed_444;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_7;
    private int cfr_renamed_9;
    private int cfr_renamed_2;
    private int cfr_renamed_6;
    private int cfr_renamed_240;
    private class_1799 cfr_renamed_247;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_312(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 12558, (long)(0x88D9A01EBF18ED3L ^ l2)), -2197533426324057601L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, null, -2195913912208983053L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 911, (long)(0x1A4F4EB729693C5BL ^ l2)), -2190091918524669261L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 911, (long)(0x1A4F4EB729693C5BL ^ l2)), -2196635995608477170L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 21621, (long)(0x72CD0293E4116BA2L ^ l2)), -2189934853156232665L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, (boolean)_5x_0.a("o", 911, (long)(0x1A4F4EB729693C5BL ^ l2)), -2190269665535574837L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, (boolean)_5x_0.a("o", 911, (long)(0x1A4F4EB729693C5BL ^ l2)), -2196158430651363032L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_139(Object[] var1_1) {
        block20: {
            block19: {
                block17: {
                    block15: {
                        block16: {
                            var2_2 = (Long)var1_1[0];
                            v0 = var2_2 = _5x_0.b ^ var2_2;
                            var4_3 = v0 ^ 123705262128664L;
                            var6_4 = v0 ^ 129218670366129L;
                            var8_5 = v0 ^ 28059364348945L;
                            var10_6 = v0 ^ 55749052711701L;
                            var12_7 = v0 ^ 52639247069358L;
                            var14_8 = _7C.cfr_renamed_3();
                            try {
                                try {
                                    v1 = this;
                                    if (var14_8 != 0) break block15;
                                    v2 = new Object[1];
                                    v2[0] = var6_4;
                                    if (_5x_0.c("D", (Object)v1, (long)-9221504281174412405L, (long)var2_2) >= _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)this, (long)-9214912774607843862L, (long)var2_2), (Object)v2, (long)-9214568023124995631L, (long)var2_2)) break block16;
                                }
                                catch (MatchException v3) {
                                    throw _5x_0.a(v3);
                                }
                                v4 = this;
                                _5x_0.c("\u00d3", (Object)v4, (int)(_5x_0.c("D", (Object)v4, (long)-9221504281174412405L, (long)var2_2) + true), (long)-9221504281174412405L, (long)var2_2);
                                return;
                            }
                            catch (MatchException v5) {
                                throw _5x_0.a(v5);
                            }
                        }
                        v1 = this;
                    }
                    try {
                        block18: {
                            try {
                                try {
                                    v6 = var14_8;
                                    if (var2_2 >= 0L) {
                                        if (v6 != 0) break block17;
                                        if (_5x_0.c("D", (Object)v1, (long)-9222296250957653386L, (long)var2_2) == null) break block18;
                                    }
                                    ** GOTO lbl60
                                }
                                catch (MatchException v7) {
                                    throw _5x_0.a(v7);
                                }
                                v8 = new Object[2];
                                v8[1] = var12_7;
                                v8[0] = (Predicate<class_1792>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 5(long net.minecraft.class_1792 ), (Lnet/minecraft/class_1792;)Z)((_5x_0)this, (long)var10_6);
                                _5x_0.c("Y", (Object)v8, (long)-9222887883307046659L, (long)var2_2);
                                if (var14_8 == 0) break block19;
                            }
                            catch (MatchException v9) {
                                throw _5x_0.a(v9);
                            }
                        }
                        v1 = this;
                    }
                    catch (MatchException v10) {
                        throw _5x_0.a(v10);
                    }
                }
                try {
                    try {
                        v6 = var14_8;
lbl60:
                        // 2 sources

                        if (v6 != 0) break block20;
                        if (_5x_0.c("D", (Object)v1, (long)-9221802516741017478L, (long)var2_2) == -1) break block19;
                    }
                    catch (MatchException v11) {
                        throw _5x_0.a(v11);
                    }
                    v12 = new Object[2];
                    v12[1] = var4_3;
                    v12[0] = (int)_5x_0.c("D", (Object)this, (long)-9221802516741017478L, (long)var2_2);
                    _5x_0.c("Y", (Object)v12, (long)-9214461878492186212L, (long)var2_2);
                }
                catch (MatchException v13) {
                    throw _5x_0.a(v13);
                }
            }
            v1 = this;
        }
        v14 = new Object[1];
        v14[0] = var8_5;
        _5x_0.c("\u00dd", (Object)v1, (Object)v14, (long)-9221888561799534986L, (long)var2_2);
    }

    public _5x_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x3840CE940A60L;
        long l5 = l3 ^ 0x2820FC5D73F3L;
        long l6 = l3 ^ 0x123D27457331L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x6E7859D78209L;
        long l9 = l3 ^ 0x71B8CAF36D7BL;
        long l10 = l3 ^ 0x5E881FE2FD54L;
        int n2 = (int)(l10 >>> 32);
        int n3 = (int)(l10 << 32 >>> 56);
        int n4 = (int)(l10 << 40 >>> 40);
        long l11 = l3 ^ 0x3B0C0821E6ADL;
        super((int)_5x_0.a("o", 21545, (long)(0x42D190AC74F5A155L ^ l2)), -1, (_4r)((Object)_5x_0.c("C", 3110679993548041167L, (long)l2)), l8);
        this.cfr_renamed_1 = new _9j_0((int)_5x_0.a("o", 19827, (long)(0x3F1A3CB84B45B806L ^ l2)), n2, (byte)n3, -1, n4, false);
        this.cfr_renamed_4 = new _92((int)_5x_0.a("o", 7261, (long)(0x4CA8F2D419AEE92AL ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        int n5 = _7C.cfr_renamed_9();
        this.cfr_renamed_8 = new _9r((int)_5x_0.a("o", 20121, (long)(0x3169DFFA81CBBBEFL ^ l2)), true, l4);
        this.cfr_renamed_3 = new _92((int)_5x_0.a("o", 23207, (long)(0x237AFA6D8B22AFD8L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_444 = new _9r((int)_5x_0.a("o", 27910, (long)(0x7FCDC028C94B187FL ^ l2)), false, l4);
        _5x_0.c("\u00d3", (Object)this, (boolean)_5x_0.a("o", 24329, (long)(0x2320A29E958A2A7BL ^ l2)), 3113062503535474274L, (long)l2);
        _5x_0.c("\u00d3", (Object)this, (boolean)_5x_0.a("o", 911, (long)(0x1A4F063AB8C8F6F2L ^ l2)), 3111113259074853761L, (long)l2);
        int n6 = n5;
        try {
            _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 911, (long)(0x1A4F063AB8C8F6F2L ^ l2)), 3112677343559411738L, (long)l2);
            _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 911, (long)(0x1A4F063AB8C8F6F2L ^ l2)), 3110496124856326311L, (long)l2);
            _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 911, (long)(0x1A4F063AB8C8F6F2L ^ l2)), 3112692503225165966L, (long)l2);
            _5x_0.c("\u00d3", (Object)this, (int)_5x_0.a("o", 32469, (long)(0x67BAB852DC0F8BAFL ^ l2)), 3110160437174967126L, (long)l2);
            _5x_0.c("\u00d3", (Object)this, null, 3111920701679874394L, (long)l2);
            CallSite callSite = _5x_0.c("D", (Object)this, 3112581832254351046L, (long)l2);
            CallSite callSite2 = _5x_0.c("D", (Object)this, 3111728243779825192L, (long)l2);
            _5x_0.c("Y", (Object)callSite2, 3110290202178682112L, (long)l2);
            Object[] objectArray = new Object[3];
            objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l11);
            objectArray[1] = (int)((byte)n);
            objectArray[0] = l7;
            _5x_0.c("\u00dd", (Object)callSite, (Object)objectArray, 3111507598474494883L, (long)l2);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = new _95[]{_5x_0.c("D", (Object)this, 3110811468548485314L, (long)l2), _5x_0.c("D", (Object)this, 3112891624489583559L, (long)l2), _5x_0.c("D", (Object)this, 3111728243779825192L, (long)l2), _5x_0.c("D", (Object)this, 3112581832254351046L, (long)l2), _5x_0.c("D", (Object)this, 3111243478343194481L, (long)l2)};
            objectArray2[0] = l9;
            _5x_0.c("\u00dd", (Object)this, (Object)objectArray2, 3109914360246563536L, (long)l2);
            if (n6 == 0) {
                _4w.cfr_renamed_8(new String[4]);
            }
        }
        catch (MatchException matchException) {
            throw _5x_0.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5x_0.class, 59);
                _5x_0.b = l.a(-4173808055553032189L, 2163200272270332024L, MethodHandles.lookup().lookupClass()).a(222415054234619L);
                _5x_0.j = new Object[73];
                _5x_0.k = new String[73];
                _5x_0.b();
                _5x_0.f = new HashMap<K, V>(13);
                var0 = _5x_0.b ^ 69061458866550L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "+R\u000bs?k\u00d4M>_jl\u00df\u00de\u00b7\"&\u00da[\u00aa\u00f0s8\u009c\u00b2\u0012\u000e\u0017\u00c3\u0095/x\u0096\u00d6\u00d8<\u0012\u00b7\u0004\u00f1\u00eaz@\u00cf\u00aeyH\u00a3\u001b\u00a8\u00b3\u00d3\u00e0\u00bdx\u00a5w\u00c9\u00d1\u0015\u00d6_\u008d\u00a9\u00a4\\\u00c4x\u009f\u00f6\u00b5\u00ba\u00d5\u00dd\u00a3\u00b3\u00bd\u0084\u0002q\u0001\bC\u00fbT\u00f2P\u000f";
                var7_6 = "+R\u000bs?k\u00d4M>_jl\u00df\u00de\u00b7\"&\u00da[\u00aa\u00f0s8\u009c\u00b2\u0012\u000e\u0017\u00c3\u0095/x\u0096\u00d6\u00d8<\u0012\u00b7\u0004\u00f1\u00eaz@\u00cf\u00aeyH\u00a3\u001b\u00a8\u00b3\u00d3\u00e0\u00bdx\u00a5w\u00c9\u00d1\u0015\u00d6_\u008d\u00a9\u00a4\\\u00c4x\u009f\u00f6\u00b5\u00ba\u00d5\u00dd\u00a3\u00b3\u00bd\u0084\u0002q\u0001\bC\u00fbT\u00f2P\u000f".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "&j\u00e7W&%\u0096\u00da\u00e2\u00e3\u00e7\u00ce\u00ed)S\u0095";
                    var7_6 = "&j\u00e7W&%\u0096\u00da\u00e2\u00e3\u00e7\u00ce\u00ed)S\u0095".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        _5x_0.d = var8_3;
        _5x_0.e = new Integer[13];
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
            case 0 -> 16;
            case 1 -> 25;
            case 2 -> 34;
            case 3 -> 18;
            case 4 -> 61;
            case 5 -> 54;
            case 6 -> 37;
            case 7 -> 1;
            case 8 -> 55;
            case 9 -> 47;
            case 10 -> 13;
            case 11 -> 24;
            case 12 -> 41;
            case 13 -> 43;
            case 14 -> 38;
            case 15 -> 27;
            case 16 -> 33;
            case 17 -> 40;
            case 18 -> 60;
            case 19 -> 20;
            case 20 -> 42;
            case 21 -> 46;
            case 22 -> 57;
            case 23 -> 58;
            case 24 -> 63;
            case 25 -> 49;
            case 26 -> 5;
            case 27 -> 0;
            case 28 -> 19;
            case 29 -> 62;
            case 30 -> 51;
            case 31 -> 12;
            case 32 -> 30;
            case 33 -> 3;
            case 34 -> 45;
            case 35 -> 59;
            case 36 -> 39;
            case 37 -> 36;
            case 38 -> 35;
            case 39 -> 26;
            case 40 -> 11;
            case 41 -> 48;
            case 42 -> 10;
            case 43 -> 2;
            case 44 -> 28;
            case 45 -> 23;
            case 46 -> 52;
            case 47 -> 6;
            case 48 -> 22;
            case 49 -> 44;
            case 50 -> 31;
            case 51 -> 9;
            case 52 -> 8;
            case 53 -> 17;
            case 54 -> 32;
            case 55 -> 4;
            case 56 -> 15;
            case 57 -> 14;
            case 58 -> 7;
            case 59 -> 56;
            case 60 -> 21;
            case 61 -> 53;
            case 62 -> 50;
            default -> 29;
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
        _5x_0.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'D' || c == '\u00d3' || c == 'C' || c == 'w') {
                field = _5x_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'D' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5x_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5x_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "%y \u001ad!8l\"[a}td";
        objectArray[1] = Integer.TYPE;
        _5x_0.k[1] = "java/lang/Integer";
        objectArray[2] = "\u001cB]!M\u0004\u001cBJ}A\u000b\u0006\tJcA\u001e\u0001x\u00188\u0019T";
        objectArray[3] = Boolean.TYPE;
        _5x_0.k[3] = "java/lang/Boolean";
        objectArray[4] = "=mC%3b xAd6>`=";
        objectArray[5] = "%\u00153M\u001d\u007fP58B\f01;3I\bjE";
        objectArray[6] = ";NkU \u0019&[i\u0014%EkY";
        objectArray[7] = ":.'[{I';%\u001a~\u0015g!";
        objectArray[8] = "KxmJ\raVmo\u000b\b=\u0016o";
        objectArray[9] = ",91\\[O1,3\u001d^\u0013~$";
        objectArray[10] = "m7q24o\u0018\u0017z=% y\u0019q6!z\r";
        objectArray[11] = Void.TYPE;
        _5x_0.k[11] = "java/lang/Void";
        objectArray[12] = "\u0007*\u0016c \u0016\u001a?\u0014\"%JZ}";
        objectArray[13] = "\u001d;Ti\u001b>\u00033N&z)\u001d?A|F";
        objectArray[14] = "Q+\u001c\u000e0xZ$\rAQvQ/\t\u001b";
        objectArray[15] = "aq\u0010$tz|d\u0012eq&=n";
        objectArray[16] = "*1A?B+_\u0011J0Sd>\u001fA;W>J";
        objectArray[17] = "n\u0000$\u0014Q\\\u001b /\u001b@\u0013z.$\u0010DI\u000e";
        objectArray[18] = ".Y\"\u0006[\u0005[y)\tJJ:w\"\u0002N\u0010N";
        objectArray[19] = "\u0001\u000fXc 9t/Sl1v\u0015!Xg5,a";
        objectArray[20] = "z\u001f\u001fHsX\u000f?\u0014Gb\u0017n1\u001fLfM\u001a";
        objectArray[21] = ")o\u0002#?Y)o\u0015\u007f3V3$\u0015a3C4UG<k\u0000\u007f";
        objectArray[22] = "\u0010y8@>t\u0010y/\u001c2{\n2/\u00022n\rC}Xe,";
        objectArray[23] = "\u0001\u0018\buU|\u0001\u0018\u001f)Ys\u001bS\u001f7Yf\u001c\"Ko\u000e";
        objectArray[24] = "HC\u001dAg\u0001=c\u0016NvN\\m\u001dEr\u0014(";
        objectArray[25] = Long.TYPE;
        _5x_0.k[25] = "java/lang/Long";
        objectArray[26] = "Ho]ORcHoJ\u0013^lR$J\r^yUU\u0018Y\u000f8";
        objectArray[27] = "8oH \u0014-8o_|\u0018\"\"$_b\u00187%U\r9@v";
        objectArray[28] = "o2R\u001f7\u001bo2EC;\u0014uyE];\u0001r\b\u0015\u0000j";
        objectArray[29] = "mj%>a\fmj2bm\u0003w!2|m\u0016pPe#;";
        objectArray[30] = "U%\u0011z\u0015/ \u0005\u001au\u0004`A\u000b\u0011~\u0000:5";
        objectArray[31] = "i&5-c!i&\"qo.sm\"oo;t\u001cp18p";
        objectArray[32] = "0hE]Z\u00130hR\u0001V\u001c*#R\u001fV\t-R\u0007@\u0001";
        objectArray[33] = "P=Co6\u0000P=T3:\u000fJvT-:\u001aM\u0007\u0006smP";
        objectArray[34] = "\b\u001d\u001fL\u0011S\b\u001d\b\u0010\u001d\\\u0012V\b\u000e\u001dI\u0015'ZTI\r";
        objectArray[35] = "\u000eR.\u0001.\u0011\u0013\u0005z9iu\u0016\u0001aR=\u0017\u0014[(";
        objectArray[36] = "+\u0012as87o\u0014~*S\nV#XCo%eHx;+#z\u0011";
        objectArray[37] = "/\n9\f\u0017r0\u001c(\u0012t',\u000e&\u0017\u0018\u0015\u007fM{KNB:\u00196\u001b\u001e 8C\u007fp";
        objectArray[38] = "D\u0003H\u0010j(YT\u001c(\"L\u001a\u0003\u0015M\"w\u0019C\u001c\u0014";
        objectArray[39] = "oAKI\u0006fjG\u000e\\j;mT\u0013K\u0006\t>\u0010O\u0013jg`EIN\u000fo=L\u0016,";
        objectArray[40] = "3\u0014\u001eK7>0T\u0017\u0012\u0006;\u000eHC\u0015gosFLLg\u0005uG\fElgw\u001dE.";
        objectArray[41] = "0>\u001b9?z-iO\u0001x&Sb\u001b:'t.l\u0014c'\u001el}El>/o{\\;F";
        objectArray[42] = "\u001a`7\" >\u0012=>}B>N|:\u007f.\f\u001c1b)B9\u001fyk&;\"Ha3\u0018";
        objectArray[43] = "\u000eb#wj?N6qb\u0015m0b%2t>Ml*ktT\u000f}{dme\f{b3\u0015";
        objectArray[44] = "\u0019\u00060DP!\u0004Qd|\u0017,zZ0GH/\u0007T?\u001eHEEEn\u0011QtFCwF)";
        objectArray[45] = "\u001a0J\u0015\u0019^G)\t^#\u0007'.\u001d\u0015^EI B\u0001S=\u001d+OWSRG<\u0018\u0014#";
        objectArray[46] = "HS,5p\nHXp5\u0001\r\u0014Hj){\u001a?Vq\u000e|\u0013\u001d1~$lH\u0007\n/7>\nyX{%>\tB\thw|w";
        objectArray[47] = ".A-\u0017 \t3\u0016y/d M\u0002y_2\u0007/\u0000#\u0016";
        objectArray[48] = "PKc3#\u001b\r\n3qL@jP17-\u0016\u0017^>n-|PKc3#\u001b\r\n3qL";
        objectArray[49] = "1'\t\u000fcB7e\u0017\fXI1u\u0015\u0004\u000f\u001ba @XXEla@V!^;y\u0018";
        objectArray[50] = "!6(\u0002R{-*/\f(*\">2\u001f\u007f}|ijsG-{6:KB+>#";
        objectArray[51] = "Q+\u000e\u0011\u001a^]7\t\u001f`\u000fR#\u0014\f7X\fsM`\u0003\u0000\n'\u0019\u0018\u0003_]7";
        objectArray[52] = "{ts1jt.dc*\u0016p\u0012},hw'os#1wM(|/jf\"rkx)\u0016";
        objectArray[53] = "8kz1= %<.\tyDf-|r~';4?9";
        objectArray[54] = "\u0000\u001duuX\u0001\u001dJ!M\u001c\u0002c\u001c* \u001b\u0007\u0006\u0014w)D";
        objectArray[55] = "\u000e6#n3~Nbq{L,00\u007fn=o\u000f<ci3";
        objectArray[56] = "qO'Em\u001a/\u00018@T\u0004t\\!Q\u0003W%\tu=0\u0014wI|MnZhL";
        objectArray[57] = "&\u0004wXn\u0011*\u0018pV\u0014@%\fmEC\u0017{_0)qEt\u0007lHxC$Q";
        objectArray[58] = "\\[\u0018\u0005/LA\fL=j(\u0005\u0006\u001b\u0004&G_\u0011LG";
        objectArray[59] = "e(U\u0004\fw>q\u000e\u0018u,n=T\u001e\u0019\u001e9z\nGHI9$\b@\u0005&c3_\u0003u";
        objectArray[60] = "%\u0007UP#A8P\u0001hg\u001dF\u0002\u0014Q!\u001f%_\r\u0012j";
        objectArray[61] = "h>n\u0016\bQm8+\u0003d\fj+6\u0014\b>9nnOd\ry5.J\u0014S7*+s[\u0012f:.BX\u0014\u007fmV";
        objectArray[62] = "\f}!0HT\t{d%$\t\u000ehy2H;X-$i\u0014l\rlf)G\\\u0012zw7$";
        objectArray[63] = "s^'sFe&N7h:f\u001aWx*[6gYws[\\ V{(J3zA,k:";
        objectArray[64] = "E$cR8\u0017Xs7j~s]w,\u0001+\u0011_-e";
        objectArray[65] = "hUn_~4u\u0002:g=P;\u0013+\u001b:<t\u00156\u0019";
        objectArray[66] = "$JfV`)-Qt\\\t,.Pr05xx\b\n\u001cb7\"_h\u001e8~I";
        objectArray[67] = "JX!8\tqW\u000fu\u0000K\u0015R\u000bnk\u001awPQ'";
        objectArray[68] = "\no_+MPEiB)p\u0001:u\u001al\u0011VG{\u00155\u0011<AzU<\u001a^C \u001cW";
        objectArray[69] = "MQ\u0001\bR[P\u0006U0\u0013?\u001e\u0017DL\u0016SQ\u0011YN";
        objectArray[70] = "n5V\u000boHsb\u00023&,7hU\nfCm\u007f\u0002I";
        objectArray[71] = "Z\"6K\u00160\u000f2&Pj13+i\u0012\u000bcN%fK\u000b\t\f47D\u00128\u000f2.\u0013j";
        Object[] objectArray2 = objectArray;
        objectArray[72] = "\r>l&J6\u00048<p/2\u0005)<'C\u0000Rdeq/1\u000bi!*Io\u001837@K)\n-e0\u0015g\u0015(\\&F6\u0015,b}\u001fm\tU";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5x" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _5x_0.e(l2, l3);
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
                clazz3 = _5x_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5x_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5x_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5x_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5x_0.f(1053388210786842L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5x_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5x_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5x_0.f(1053388210786842L, 0L);
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
            int n = _5x_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5x_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5x_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5x_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5x_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5x_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5E5C;
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
                throw new RuntimeException("dev/krypton/5x", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5x_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5x_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _5x_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5x_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5x_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5x_0.c(clazz3, string2, clazz2)) != null) {
                    _5x_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5x_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5x_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5x_0.f(1053388210786842L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    private boolean cfr_renamed_8(long l2, class_1792 class_17922) {
        boolean bl;
        l2 = b ^ l2;
        try {
            bl = class_17922 == _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)this, -683807311965459209L, (long)l2), -682929881850683690L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _5x_0.a(matchException);
        }
        return bl;
    }

    @_3i_0
    public void cfr_renamed_8(_6u_0 u_0) {
        block8: {
            Object object;
            Object object2;
            long l2;
            block7: {
                l2 = b ^ 0x2E4844CE3797L;
                long l3 = l2 ^ 0x38BCA851A6FFL;
                int n = _7C.cfr_renamed_3();
                try {
                    try {
                        object2 = _5x_0.c("\u00dd", (Object)u_0.cfr_renamed_1, -9073648560451498514L, (long)l2);
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l3;
                        object = _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)this, -9076200119902037533L, (long)l2), (Object)objectArray, -9076622675971219781L, (long)l2);
                        if (n != 0) break block7;
                        if (object2 != object) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _5x_0.a(matchException);
                    }
                    object2 = u_0.cfr_renamed_5;
                    object = true;
                }
                catch (MatchException matchException) {
                    throw _5x_0.a(matchException);
                }
            }
            try {
                if (object2 == object) {
                    _5x_0.c("\u00d3", (Object)this, (boolean)_5x_0.a("o", 1153, (long)(0x6D35FE22E123D8D8L ^ l2)), -9073944821244403901L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw _5x_0.a(matchException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_9(_9o o) {
        _5x_0 x_0;
        long l2;
        long l3;
        block68: {
            CallSite callSite;
            block64: {
                int n;
                long l4;
                block65: {
                    long l5;
                    block66: {
                        block67: {
                            block62: {
                                block63: {
                                    long l6;
                                    block60: {
                                        block61: {
                                            block58: {
                                                long l7;
                                                block59: {
                                                    block56: {
                                                        block57: {
                                                            block54: {
                                                                block55: {
                                                                    _5x_0 x_02;
                                                                    block53: {
                                                                        CallSite callSite2;
                                                                        block52: {
                                                                            block51: {
                                                                                long l8 = l3 = b ^ 0x2C5ABBACCCECL;
                                                                                l2 = l8 ^ 0x5D82DE584CE2L;
                                                                                l6 = l8 ^ 0x68045FEAF4C7L;
                                                                                l5 = l8 ^ 0x4075B692D67L;
                                                                                l4 = l8 ^ 0x378653A9B4F7L;
                                                                                l7 = l8 ^ 0x4DCB86F250C2L;
                                                                                n = _7C.cfr_renamed_3();
                                                                                try {
                                                                                    try {
                                                                                        callSite2 = _5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3);
                                                                                        if (n != 0) break block51;
                                                                                        if (_5x_0.c("D", (Object)callSite2, 8751781175007984638L, (long)l3) != null) return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5x_0.a(matchException);
                                                                                    }
                                                                                    callSite2 = _5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5x_0.a(matchException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (n != 0) break block52;
                                                                                        if (_5x_0.c("D", (Object)callSite2, 8751877466807855287L, (long)l3) == null) return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5x_0.a(matchException);
                                                                                    }
                                                                                    x_02 = this;
                                                                                    if (n != 0) break block53;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5x_0.a(matchException);
                                                                                }
                                                                                callSite2 = _5x_0.c("D", (Object)x_02, 8752079932953468894L, (long)l3);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5x_0.a(matchException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (_5x_0.c("D", (Object)callSite2, 8752196122714592413L, (long)l3) == null) {
                                                                                return;
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5x_0.a(matchException);
                                                                        }
                                                                        x_02 = this;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            callSite = _5x_0.c("D", (Object)x_02, 8748398258076367572L, (long)l3);
                                                                            if (n != 0) break block54;
                                                                            if (callSite <= 0) break block55;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5x_0.a(matchException);
                                                                        }
                                                                        _5x_0 x_03 = this;
                                                                        _5x_0.c("\u00d3", (Object)x_03, (int)(_5x_0.c("D", (Object)x_03, 8748398258076367572L, (long)l3) - true), 8748398258076367572L, (long)l3);
                                                                        return;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5x_0.a(matchException);
                                                                    }
                                                                }
                                                                callSite = _5x_0.c("D", (Object)this, 8748767087706088504L, (long)l3);
                                                            }
                                                            try {
                                                                if (n != 0) break block56;
                                                                if (callSite != false) break block57;
                                                                return;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5x_0.a(matchException);
                                                            }
                                                        }
                                                        callSite = _5x_0.c("D", (Object)this, 8751495706105202956L, (long)l3);
                                                    }
                                                    try {
                                                        try {
                                                            if (n != 0) break block58;
                                                            if (callSite != -1) break block59;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5x_0.a(matchException);
                                                        }
                                                        _5x_0.c("\u00d3", (Object)this, (int)_5x_0.c("\u00dd", (Object)_5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)_5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3), 8751877466807855287L, (long)l3), 8752737243653476720L, (long)l3), 8750823723380271882L, (long)l3), 8751495706105202956L, (long)l3);
                                                        _5x_0.c("\u00d3", (Object)this, (class_1799)_5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)_5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3), 8751877466807855287L, (long)l3), 8750947837008806547L, (long)l3), 8752130053239235328L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5x_0.a(matchException);
                                                    }
                                                }
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = _5x_0.c("C", 8751647389792337429L, (long)l3);
                                                objectArray[0] = l7;
                                                callSite = _5x_0.c("Y", (Object)objectArray, 8751996392505613075L, (long)l3);
                                            }
                                            try {
                                                try {
                                                    if (n != 0) break block60;
                                                    if (callSite != false) break block61;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5x_0.a(matchException);
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l5;
                                                _5x_0.c("\u00dd", (Object)this, (Object)objectArray, 8751436032046243584L, (long)l3);
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5x_0.a(matchException);
                                            }
                                        }
                                        callSite = _5x_0.c("D", (Object)this, 8748381945161562688L, (long)l3);
                                    }
                                    try {
                                        try {
                                            if (n != 0) break block62;
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l6;
                                            if (callSite >= _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)this, 8748588600158179741L, (long)l3), (Object)objectArray, 8748623490517493927L, (long)l3)) break block63;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5x_0.a(matchException);
                                        }
                                        _5x_0 x_04 = this;
                                        _5x_0.c("\u00d3", (Object)x_04, (int)(_5x_0.c("D", (Object)x_04, 8748381945161562688L, (long)l3) + true), 8748381945161562688L, (long)l3);
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5x_0.a(matchException);
                                    }
                                }
                                callSite = _5x_0.c("D", (Object)this, 8752439716779018715L, (long)l3);
                            }
                            try {
                                if (n != 0) break block64;
                                if (callSite != false) break block65;
                            }
                            catch (MatchException matchException) {
                                throw _5x_0.a(matchException);
                            }
                            CallSite callSite3 = _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)_5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3), 8752196122714592413L, (long)l3), (Object)_5x_0.c("D", (Object)_5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3), 8751877466807855287L, (long)l3), (Object)_5x_0.c("C", 8752269775087300833L, (long)l3), 8748932046847356184L, (long)l3);
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    callSite = _5x_0.c("\u00dd", (Object)callSite3, 8752376607172278717L, (long)l3);
                                                    if (n != 0) break block66;
                                                    if (callSite == false) break block67;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5x_0.a(matchException);
                                                }
                                                callSite = _5x_0.c("\u00dd", (Object)callSite3, 8752376607172278717L, (long)l3);
                                                if (n != 0) break block66;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5x_0.a(matchException);
                                            }
                                            if (callSite == false) break block67;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5x_0.a(matchException);
                                        }
                                        callSite = _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)this, 8752561157772789035L, (long)l3), (long)l4, 8751357772598141625L, (long)l3);
                                        if (n != 0) break block66;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5x_0.a(matchException);
                                    }
                                    if (callSite != false) break block67;
                                }
                                catch (MatchException matchException) {
                                    throw _5x_0.a(matchException);
                                }
                                _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)_5x_0.c("D", (Object)this, 8752079932953468894L, (long)l3), 8751877466807855287L, (long)l3), (Object)_5x_0.c("C", 8752269775087300833L, (long)l3), 8752493211347463271L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw _5x_0.a(matchException);
                            }
                        }
                        _5x_0.c("\u00d3", (Object)this, (boolean)_5x_0.a("o", 24264, (long)(0xCD00E07A01979E9L ^ l3)), 8752439716779018715L, (long)l3);
                        callSite = _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)this, 8751928748527565938L, (long)l3), (long)l4, 8751357772598141625L, (long)l3);
                    }
                    try {
                        try {
                            if (n != 0) break block64;
                            if (callSite != false) break block65;
                        }
                        catch (MatchException matchException) {
                            throw _5x_0.a(matchException);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l5;
                        _5x_0.c("\u00dd", (Object)this, (Object)objectArray, 8751436032046243584L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5x_0.a(matchException);
                    }
                }
                try {
                    x_0 = this;
                    if (n != 0) break block68;
                    callSite = _5x_0.c("\u00dd", (Object)_5x_0.c("D", (Object)x_0, 8751928748527565938L, (long)l3), (long)l4, 8751357772598141625L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _5x_0.a(matchException);
                }
            }
            if (callSite == false) return;
            x_0 = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _5x_0.c("\u00dd", (Object)x_0, (Object)objectArray, 8751101286652314182L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5x_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5x_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

