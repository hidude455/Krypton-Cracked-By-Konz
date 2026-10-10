/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1113
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_3414
 *  net.minecraft.class_368
 *  net.minecraft.class_368$class_369
 *  net.minecraft.class_374
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dev.krypton;

import dev.krypton._0p;
import dev.krypton._9M;
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
import net.minecraft.class_1113;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import net.minecraft.class_368;
import net.minecraft.class_374;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class _9q
implements class_368 {
    private static final int cfr_renamed_251;
    private static final int cfr_renamed_5;
    private static final class_2960 cfr_renamed_9;
    private static final long cfr_renamed_4;
    private static final class_1113 cfr_renamed_6;
    @NotNull
    private final class_2561 cfr_renamed_1;
    @Nullable
    private final class_2561 cfr_renamed_2;
    @Nullable
    private final class_1799 cfr_renamed_0;
    @Nullable
    private final class_1113 cfr_renamed_248;
    private final long cfr_renamed_31;
    private boolean cfr_renamed_8;
    private long cfr_renamed_3;
    private class_368.class_369 cfr_renamed_7;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    private _9q(_0p p, byte by, int n, int n2) {
        long l2 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ a;
        _9q.c("Q", (Object)this, (long)_9q.b("a", 12961, (long)(0x720BE98B9F1173DAL ^ l2)), -6032656798309103027L, (long)l2);
        _9q.c("Q", (Object)this, (class_368.class_369)_9q.c("\u00f5", -6032819968505236450L, (long)l2), -6033958889899772307L, (long)l2);
        this.cfr_renamed_1 = _9q.c("\u00db", (Object)p, -6032583840894516056L, (long)l2);
        this.cfr_renamed_2 = _9q.c("\u00db", (Object)p, -6033765442459228960L, (long)l2);
        this.cfr_renamed_0 = _9q.c("\u00db", (Object)p, -6033133965064635442L, (long)l2);
        this.cfr_renamed_248 = _9q.c("\u00db", (Object)p, -6034255755304851058L, (long)l2);
        this.cfr_renamed_31 = (long)_9q.c("\u00db", (Object)p, -6034137313086895464L, (long)l2);
    }

    public class_368.class_369 method_61988() {
        long l2 = a ^ 0x51E701D15833L;
        return _9q.c("\u00db", (Object)this, 6705034353954604835L, (long)l2);
    }

    public void method_61989(class_374 class_3742, long l2) {
        block13: {
            _9q q;
            long l3;
            block12: {
                CallSite callSite;
                _9q q2;
                int n;
                block10: {
                    block11: {
                        l3 = a ^ 0x6F7C72B4492EL;
                        n = _9M.cfr_renamed_3();
                        try {
                            try {
                                q2 = this;
                                if (n != 0) break block10;
                                if (_9q.c("\u00db", (Object)q2, 5482164299631831582L, (long)l3) != _9q.b("a", 14125, (long)(0x28535F343AA1604L ^ l3))) break block11;
                            }
                            catch (MatchException matchException) {
                                throw _9q.a(matchException);
                            }
                            _9q.c("Q", (Object)this, (long)l2, 5482164299631831582L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _9q.a(matchException);
                        }
                    }
                    q2 = this;
                }
                try {
                    callSite = l2 - _9q.c("\u00db", (Object)this, 5482164299631831582L, (long)l3) >= _9q.c("\u00db", (Object)this, 5481304557856464079L, (long)l3) ? _9q.c("\u00f5", 5482046002884924493L, (long)l3) : _9q.c("\u00f5", 5482575641721561776L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _9q.a(matchException);
                }
                try {
                    try {
                        _9q.c("Q", (Object)q2, (class_368.class_369)callSite, 5480933124326315582L, (long)l3);
                        q = this;
                        if (n != 0) break block12;
                        if (_9q.c("\u00db", (Object)q, 5483035383799510300L, (long)l3) != false) break block13;
                    }
                    catch (MatchException matchException) {
                        throw _9q.a(matchException);
                    }
                    _9q.c("\u00f2", (Object)_9q.c("\u00f2", (Object)_9q.c("\u00f5", 5481657446576687756L, (long)l3), 5481616734316606562L, (long)l3), (Object)_9q.c("\u00db", (Object)this, 5482867720423067809L, (long)l3), 5482844873744350522L, (long)l3);
                    q = this;
                }
                catch (MatchException matchException) {
                    throw _9q.a(matchException);
                }
            }
            _9q.c("Q", (Object)q, (boolean)_9q.a("y", 25038, (long)(0x42CC921775B63A92L ^ l3)), 5483035383799510300L, (long)l3);
        }
    }

    public void method_1986(class_332 class_3322, class_327 class_3272, long l2) {
        block11: {
            class_332 class_3323;
            long l3;
            block10: {
                _9q q;
                block8: {
                    CallSite callSite;
                    CallSite callSite2;
                    int n;
                    block9: {
                        CallSite callSite3;
                        l3 = a ^ 0x614F2F382DE8L;
                        n = _9M.cfr_renamed_3();
                        try {
                            _9q.c("\u00f2", (Object)class_3322, (Object)_9q.c("\u00f5", 2941407996743449756L, (long)l3), (Object)_9q.c("\u00f5", 2941982419156136734L, (long)l3), 0, 0, (int)_9q.c("\u00f2", (Object)this, 2944560027296022917L, (long)l3), (int)_9q.c("\u00f2", (Object)this, 2941213347325069408L, (long)l3), 2944763975607814383L, (long)l3);
                            callSite3 = _9q.c("\u00db", (Object)this, 2942730610436116305L, (long)l3) != null ? _9q.a("y", 13214, (long)(0x6889623A95868C08L ^ l3)) : _9q.a("y", 32380, (long)(0x5AEF6E752BEC41E1L ^ l3));
                        }
                        catch (MatchException matchException) {
                            throw _9q.a(matchException);
                        }
                        callSite2 = callSite3;
                        callSite = _9q.a("y", 11278, (long)(0x396EC8017B8D139CL ^ l3));
                        try {
                            q = this;
                            if (n != 0) break block8;
                            if (_9q.c("\u00db", (Object)q, 2941939351716765313L, (long)l3) == null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _9q.a(matchException);
                        }
                        _9q.c("\u00f2", (Object)class_3322, (Object)class_3272, (Object)_9q.c("\u00db", (Object)this, 2941939351716765313L, (long)l3), (int)callSite2, (int)_9q.a("y", 12160, (long)(0x267D4EA0A63F1017L ^ l3)), (int)_9q.c("\u00f5", 2941902333685232362L, (long)l3), (boolean)false, 2941521656693807784L, (long)l3);
                        callSite = _9q.a("y", 31648, (long)(0x442F6484F712C431L ^ l3));
                    }
                    try {
                        class_3323 = class_3322;
                        if (n != 0) break block10;
                        _9q.c("\u00f2", (Object)class_3323, (Object)class_3272, (Object)_9q.c("\u00db", (Object)this, 2944603778972070562L, (long)l3), (int)callSite2, (int)callSite, (int)_9q.c("\u00f5", 2941824351674416681L, (long)l3), (boolean)false, 2941521656693807784L, (long)l3);
                        q = this;
                    }
                    catch (MatchException matchException) {
                        throw _9q.a(matchException);
                    }
                }
                try {
                    if (_9q.c("\u00db", (Object)q, 2942730610436116305L, (long)l3) == null) break block11;
                    class_3323 = class_3322;
                }
                catch (MatchException matchException) {
                    throw _9q.a(matchException);
                }
            }
            _9q.c("\u00f2", (Object)class_3323, (Object)_9q.c("\u00db", (Object)this, 2942730610436116305L, (long)l3), (int)_9q.a("y", 21515, (long)(0x1058524C5A3D6B92L ^ l3)), (int)_9q.a("y", 24632, (long)(0x21FA9A9E0D35FA7L ^ l3)), 2943048173069790094L, (long)l3);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        block17: {
                            _9q.a = l.a(924385631705529490L, -7143289570199527871L, MethodHandles.lookup().lookupClass()).a(168533524777501L);
                            var26 = _9q.a ^ 32049839292713L;
                            var28_1 = var26 ^ 10268640612638L;
                            _9q.h = new Object[60];
                            _9q.i = new String[60];
                            _9q.a();
                            var23_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var26 >>> 56);
                            for (var24_3 = 1; var24_3 < 8; ++var24_3) {
                                v2 = v2;
                                v2[var24_3] = (byte)(var26 << var24_3 * 8 >>> 56);
                            }
                            break block17;
lbl18:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var23_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var25_5 = var23_2.doFinal(" \u00e7\u00ed@c\u0007e\u00a2\u0095\u0015\u00e7\u0000\u00d8\u00d9W\u00fd\u00e1\u00d4\u00a5\u0014_\u0086[\u00bf".getBytes("ISO-8859-1"));
                        ** while (true)
                        var22_4 = _9q.a(var25_5).intern();
                        _9q.d = new HashMap<K, V>(13);
                        var11_6 = Cipher.getInstance("DES/CBC/NoPadding");
                        v3 = SecretKeyFactory.getInstance("DES");
                        v4 = new byte[8];
                        v5 = v4;
                        v4[0] = (byte)(var26 >>> 56);
                        for (var12_7 = 1; var12_7 < 8; ++var12_7) {
                            v5 = v5;
                            v5[var12_7] = (byte)(var26 << var12_7 * 8 >>> 56);
                        }
                        var11_6.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                        var17_8 = new long[15];
                        var14_9 = 0;
                        var15_10 = "\u00b3)+p\u00b8\u00f73O\u0085\u0085\u0088B\u0088Q\u0095E\u00d7\u00edC;F\u008e(\u00a6\u001f\u00bc`?\u00d9C\u0088\u0082~J\f\u008ex\u00e4f\u00c8\u00ae\u0007\u00af\u00bf\u009d\u00d25\u0080\u00afX\u00a3\u00a7\u00e4\u00ca\u00c6B\u0005\u00c3^\u0017\u00c6H\u00afgWF\u008fr\u0094'\u00bc\u00ab7\u00f8\u00a0a\u00f5\u00f2\u00a5\u009bs\u0086\u00d4\u00eee+-7\u00a7$WX\u00bd6\u00b9\u0094\u0092\u00b0\u00d0\u00e3`\u0012\u0013\u0093";
                        var16_11 = "\u00b3)+p\u00b8\u00f73O\u0085\u0085\u0088B\u0088Q\u0095E\u00d7\u00edC;F\u008e(\u00a6\u001f\u00bc`?\u00d9C\u0088\u0082~J\f\u008ex\u00e4f\u00c8\u00ae\u0007\u00af\u00bf\u009d\u00d25\u0080\u00afX\u00a3\u00a7\u00e4\u00ca\u00c6B\u0005\u00c3^\u0017\u00c6H\u00afgWF\u008fr\u0094'\u00bc\u00ab7\u00f8\u00a0a\u00f5\u00f2\u00a5\u009bs\u0086\u00d4\u00eee+-7\u00a7$WX\u00bd6\u00b9\u0094\u0092\u00b0\u00d0\u00e3`\u0012\u0013\u0093".length();
                        var13_12 = 0;
                        while (true) {
                            var18_13 = var15_10.substring(var13_12, var13_12 += 8).getBytes("ISO-8859-1");
                            v6 = var17_8;
                            v7 = var14_9++;
                            v8 = ((long)var18_13[0] & 255L) << 56 | ((long)var18_13[1] & 255L) << 48 | ((long)var18_13[2] & 255L) << 40 | ((long)var18_13[3] & 255L) << 32 | ((long)var18_13[4] & 255L) << 24 | ((long)var18_13[5] & 255L) << 16 | ((long)var18_13[6] & 255L) << 8 | (long)var18_13[7] & 255L;
                            v9 = -1;
                            break block13;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            v6[v7] = v10;
                            if (var13_12 < var16_11) ** continue;
                            var15_10 = "`p\u0013\u0004w\u0016\u00fe0_V\u00d1\u000e\u008bx\u00f9^";
                            var16_11 = "`p\u0013\u0004w\u0016\u00fe0_V\u00d1\u000e\u008bx\u00f9^".length();
                            var13_12 = 0;
                            while (true) {
                                var18_13 = var15_10.substring(var13_12, var13_12 += 8).getBytes("ISO-8859-1");
                                v6 = var17_8;
                                v7 = var14_9++;
                                v8 = ((long)var18_13[0] & 255L) << 56 | ((long)var18_13[1] & 255L) << 48 | ((long)var18_13[2] & 255L) << 40 | ((long)var18_13[3] & 255L) << 32 | ((long)var18_13[4] & 255L) << 24 | ((long)var18_13[5] & 255L) << 16 | ((long)var18_13[6] & 255L) << 8 | (long)var18_13[7] & 255L;
                                v9 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl62:
                        // 1 sources

                        while (true) {
                            v6[v7] = v10;
                            if (var13_12 < var16_11) ** continue;
                            break block14;
                            break;
                        }
                    }
                    var19_14 = v8;
                    var21_15 = var11_6.doFinal(new byte[]{(byte)(var19_14 >>> 56), (byte)(var19_14 >>> 48), (byte)(var19_14 >>> 40), (byte)(var19_14 >>> 32), (byte)(var19_14 >>> 24), (byte)(var19_14 >>> 16), (byte)(var19_14 >>> 8), (byte)var19_14});
                    v10 = ((long)var21_15[0] & 255L) << 56 | ((long)var21_15[1] & 255L) << 48 | ((long)var21_15[2] & 255L) << 40 | ((long)var21_15[3] & 255L) << 32 | ((long)var21_15[4] & 255L) << 24 | ((long)var21_15[5] & 255L) << 16 | ((long)var21_15[6] & 255L) << 8 | (long)var21_15[7] & 255L;
                    switch (v9) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl75:
                        // 1 sources

                        ** continue;
                    }
                }
                _9q.b = var17_8;
                _9q.c = new Integer[15];
                _9q.g = new HashMap<K, V>(13);
                var0_16 = Cipher.getInstance("DES/CBC/NoPadding");
                v11 = SecretKeyFactory.getInstance("DES");
                v12 = new byte[8];
                v13 = v12;
                v12[0] = (byte)(var26 >>> 56);
                for (var1_17 = 1; var1_17 < 8; ++var1_17) {
                    v13 = v13;
                    v13[var1_17] = (byte)(var26 << var1_17 * 8 >>> 56);
                }
                var0_16.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
                var6_18 = new long[3];
                var3_19 = 0;
                var4_20 = "\u001a?\u009cW\u00b7\u0019]\u00b7\u001c\u0090\u000e\u0019-\u00d9\u00f9\u00a09\u000b\u0091\u000f\u008e\u00e0Go";
                var5_21 = "\u001a?\u009cW\u00b7\u0019]\u00b7\u001c\u0090\u000e\u0019-\u00d9\u00f9\u00a09\u000b\u0091\u000f\u008e\u00e0Go".length();
                var2_22 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    var6_18[v14] = ((long)var10_25[0] & 255L) << 56 | ((long)var10_25[1] & 255L) << 48 | ((long)var10_25[2] & 255L) << 40 | ((long)var10_25[3] & 255L) << 32 | ((long)var10_25[4] & 255L) << 24 | ((long)var10_25[5] & 255L) << 16 | ((long)var10_25[6] & 255L) << 8 | (long)var10_25[7] & 255L;
                    if (var2_22 < var5_21) ** continue;
                    break block16;
                    break;
                }
            }
            var7_23 = var4_20.substring(var2_22, var2_22 += 8).getBytes("ISO-8859-1");
            v14 = var3_19++;
            var8_24 = ((long)var7_23[0] & 255L) << 56 | ((long)var7_23[1] & 255L) << 48 | ((long)var7_23[2] & 255L) << 40 | ((long)var7_23[3] & 255L) << 32 | ((long)var7_23[4] & 255L) << 24 | ((long)var7_23[5] & 255L) << 16 | ((long)var7_23[6] & 255L) << 8 | (long)var7_23[7] & 255L;
            var10_25 = var0_16.doFinal(new byte[]{(byte)(var8_24 >>> 56), (byte)(var8_24 >>> 48), (byte)(var8_24 >>> 40), (byte)(var8_24 >>> 32), (byte)(var8_24 >>> 24), (byte)(var8_24 >>> 16), (byte)(var8_24 >>> 8), (byte)var8_24});
            ** while (true)
        }
        _9q.e = var6_18;
        _9q.f = new Long[3];
        _9q.cfr_renamed_4 = (long)_9q.b("a", (int)28550, (long)(var26 ^ 6038281740434196138L));
        v15 = new Object[5];
        v15[4] = (int)_9q.a("y", (int)2462, (long)(1799048904650873547L ^ var26));
        v15[3] = (int)_9q.a("y", (int)14141, (long)(7141889794994594912L ^ var26));
        v15[2] = (int)_9q.a("y", (int)18016, (long)(6875133122627310911L ^ var26));
        v15[1] = var28_1;
        v15[0] = (int)_9q.a("y", (int)25506, (long)(7306376519854272760L ^ var26));
        _9q.cfr_renamed_251 = (int)_9q.c("X", (Object)v15, (long)4906422094400038483L, (long)var26);
        v16 = new Object[5];
        v16[4] = (int)_9q.a("y", (int)7406, (long)(1450894921446248375L ^ var26));
        v16[3] = (int)_9q.a("y", (int)26846, (long)(7341614259595066250L ^ var26));
        v16[2] = (int)_9q.a("y", (int)26846, (long)(7341614259595066250L ^ var26));
        v16[1] = var28_1;
        v16[0] = (int)_9q.a("y", (int)11168, (long)(4048856191097174257L ^ var26));
        _9q.cfr_renamed_5 = (int)_9q.c("X", (Object)v16, (long)4906422094400038483L, (long)var26);
        _9q.cfr_renamed_9 = _9q.c("X", var22_4, (long)4904745471339780005L, (long)var26);
        _9q.cfr_renamed_6 = _9q.c("X", (Object)((class_3414)_9q.c("\u00f2", (Object)_9q.c("\u00f5", (long)4905866455118795895L, (long)var26), (long)4908021311916231407L, (long)var26)), (float)1.2f, (float)1.0f, (long)4904914902463022154L, (long)var26);
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

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1746;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/9q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _9q.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _9q.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6D35;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/9q", exception);
            }
            long l5 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            _9q.f[n2] = l5;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = _9q.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l2, long l3) {
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
            case 0 -> 18;
            case 1 -> 42;
            case 2 -> 60;
            case 3 -> 48;
            case 4 -> 59;
            case 5 -> 54;
            case 6 -> 32;
            case 7 -> 34;
            case 8 -> 28;
            case 9 -> 62;
            case 10 -> 11;
            case 11 -> 36;
            case 12 -> 35;
            case 13 -> 9;
            case 14 -> 47;
            case 15 -> 26;
            case 16 -> 50;
            case 17 -> 13;
            case 18 -> 14;
            case 19 -> 29;
            case 20 -> 39;
            case 21 -> 12;
            case 22 -> 63;
            case 23 -> 1;
            case 24 -> 58;
            case 25 -> 17;
            case 26 -> 49;
            case 27 -> 31;
            case 28 -> 41;
            case 29 -> 3;
            case 30 -> 2;
            case 31 -> 24;
            case 32 -> 10;
            case 33 -> 0;
            case 34 -> 37;
            case 35 -> 6;
            case 36 -> 30;
            case 37 -> 57;
            case 38 -> 23;
            case 39 -> 46;
            case 40 -> 45;
            case 41 -> 56;
            case 42 -> 22;
            case 43 -> 4;
            case 44 -> 7;
            case 45 -> 15;
            case 46 -> 25;
            case 47 -> 20;
            case 48 -> 19;
            case 49 -> 44;
            case 50 -> 51;
            case 51 -> 43;
            case 52 -> 33;
            case 53 -> 27;
            case 54 -> 21;
            case 55 -> 38;
            case 56 -> 16;
            case 57 -> 5;
            case 58 -> 53;
            case 59 -> 40;
            case 60 -> 61;
            case 61 -> 55;
            case 62 -> 8;
            default -> 52;
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
        _9q.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "H{ukx6Unw*}j\u0015o";
        objectArray[1] = Boolean.TYPE;
        _9q.i[1] = "java/lang/Boolean";
        objectArray[2] = "axc&r\\axtz~S{3td~F|B$>'\u0011lqv{lj<+.";
        objectArray[3] = Long.TYPE;
        _9q.i[3] = "java/lang/Long";
        objectArray[4] = "`sq]\u0013^}fs\u001c\u0016\u00026";
        objectArray[5] = "`yv 2D`ya|>Kz2ab>^}C1?o";
        objectArray[6] = "+\u0000%\u0010\u0012\\+\u00002L\u001eS1K2R\u001eF6:`\u000fK\u0001";
        objectArray[7] = "gHW\u0017\u001c(gH@K\u0010'}\u0003@U\u00102zr\u0012\b@r";
        objectArray[8] = "\u0002U\u007f,\u000bG\u0002Uhp\u0007H\u0018\u001ehn\u0007]\u001fo:3R\u001eHSgc\u0015]3\u0001:7W\u0016";
        objectArray[9] = "M\u0014T3\u000ftM\u0014Co\u0003{W_Cq\u0003nP.\u0016%Z-\u0007\u0012L|\u0011n|G\u0018%Q";
        objectArray[10] = "N\u0011N\")\u0006E\u001e_mH\bN\u0015[7";
        objectArray[11] = "C{5v/s^n77*/\u001f\\";
        objectArray[12] = "@R\u000f\u00103;5r\u0004\u001f\"tT|\u000f\u0014&. ";
        objectArray[13] = Integer.TYPE;
        _9q.i[13] = "java/lang/Integer";
        objectArray[14] = "4\u0015\u0013\u001f4E4\u0015\u0004C8J.^\u0004]8_)/U\bo\u001c";
        objectArray[15] = "Wbc:r/\\mru\u000f7Oj{<";
        objectArray[16] = "yg\u0019=\u0011:yg\u000ea\u001d5c,\u000e\u007f\u001d d]^'Md";
        objectArray[17] = "v\u001c)nt#v\u001c>2x,lW>,x9k&lq)s";
        objectArray[18] = "\u0006wY1f\u0005\u0006wNmj\n\u001c<Nsj\u001f\u001bM\u001e+:X";
        objectArray[19] = Float.TYPE;
        _9q.i[19] = "java/lang/Float";
        objectArray[20] = "p6[KBMp6L\u0017NBj}L\tNWm\f\u001dP\u0019\u0015";
        objectArray[21] = "Ch}fcGChj:oHY#j$o]^R8x9\u0017\u0014";
        objectArray[22] = "b%\u007f\u0019A)k+|P\u0002$m+hR\u001f\"/:{GI*h$w\u0019~#o.wE|/q/~^B#";
        objectArray[23] = "\u0002n\u0015\u0010jv\u0002n\u0002Lfy\u0018%\u0002Rfl\u001fTR\r5";
        objectArray[24] = Void.TYPE;
        _9q.i[24] = "java/lang/Void";
        objectArray[25] = "MC>/[\u0015MC)sW\u001aW\b)mW\u000fPyy3\u0001";
        objectArray[26] = "Cx.\u0017\u0017?Cx9K\u001b0Y39U\u001b%^Bk\u000eCo";
        objectArray[27] = "n\b\u0003\\&Ys\u001d\u0001\u001d#\u0005:\u001d";
        objectArray[28] = "3\u00026K'b0\u001dm6+^d\fq\ntds\u001b5U";
        objectArray[29] = "&9<5tz%&gH,+`<a$\u001e|-d:yIwp1d4\"{%!gH";
        objectArray[30] = "\u0016^n#\b\u0005\u0000Tq.4\\\u0014NvuXnD\b)*\n9\u0017Q'\"ORERv*4PH\u000e.r\u000fA\u0007\n-\u0012\u0005U\u0014Pjy\t\u0000\u0004S\u0016#XT\u001bN}/\rD\u00182'~Y[\u0005Y++IXy\u0003z\u007fVE\u0012\u000f/oU9\u0016Md\u007fK@@O/-4";
        objectArray[31] = "\t=\\)\u00197Y)\u0004-a#P#\u0018\u001bZt\u0006F^=Y!M~\u001as\\'7";
        objectArray[32] = ")Z 3mS?P?>Q\n+J8e=8{\u000fd9`o&Seh,R*Gb`Q\u0002-Kdlk\u0015:\u000f;\u0002`\u0003+T$ilV;WX3=\u0002$J3?h\u0012'6in<\r:]e;,\u000eFH#`3R=]bkQ\u00009D5}(V;\u000fg\u0002";
        objectArray[33] = "._!\u0006,t(\u0002d\u001a\u0017&u\nz\u0007@r._/k-p+\n%W+-n\u0016";
        objectArray[34] = "\u0005TKoy\u0012\\R[4CQg\u0003I+\u007f\u0007]\u0014^o ";
        objectArray[35] = "73ug,{4,.\u001a+G7,. .(o6p}";
        objectArray[36] = "?\u0011t%&m<\u000e/X&<\u0005E\"5y-nIw%z";
        objectArray[37] = "\u001c\fq\\\u001f\fE\na\u0007%J~W)\u0006[\u0011\u001bOd\u000bW";
        objectArray[38] = "\u00138\\\u000e\u0006\u0016\u0010'\u0007s\u0005*D6\u001bOU\u0010S!_\u0010";
        objectArray[39] = "{KK\u000fHMxT\u0010rLqpB\u001c\u0010\t\u001a|\u0017\f\u0013";
        objectArray[40] = "\u001c\u0018_Lm/\rW[O\rq\u0018U\u0003\u0013aCK\u0011]I1\u0014\u001cX\b\u000e=u\u001f\u0015\n\u0013\r}D\u0015[\u00146l\u000b\u0011Xt";
        objectArray[41] = "{,\u001cM\u0018N}qYQ#\u001c yGLtH{-\u001b \u0019J~y\u0018\u001c\u001f\u0017;e";
        objectArray[42] = "?08w{a9#hzF\u007fn&i\u007f*M?j6#F'h1yw;#`=8\u0018x lavz?$=\"\t";
        objectArray[43] = "F-\f_-+AlV\nAw@l\r]-E\u0011/P\u0005AyV.RU3sMt\b:-{G-]C.mGnmV(x\u0010 \u0014U>xS\u0010\u0006\u0007 wA)\u0001Fz\"-";
        objectArray[44] = "(PvP\u001a\u001c+O--BMnU+Ap\u001a#\rq\u0015'\u0011~X.QL\u001d+H--";
        objectArray[45] = "\u0010\u000f{9\u001e\u001b\u0013\u0010 D\u001eg*W*/SHWS\"#\u0012";
        objectArray[46] = "#?3\u0001T]%\"0\u0014)Y//7\u0014~\nprcC)Y-sc\u0003B\u000b.\"k";
        objectArray[47] = "\"r\u00159WD!mNDWxflM&W\u0003s-F";
        objectArray[48] = "O\u00168$N\rOY+01\u000bpT#8VN\u0019\rbi\b5A\b46M^M]$51";
        objectArray[49] = "]>)^6E^!r#7y]c,N0E[>iR";
        objectArray[50] = "cQ\"\u001aJe:W2Ap'\u0001\u0006 ^Lp;\u00117\u001a\u0013";
        objectArray[51] = "\u001b1UT\u007f2\u0018.\u000e)r\u000e@e\fW$kX(\u0001[";
        objectArray[52] = "G\u0003\u0004Q#h\u001e\u0005\u0014\n\u0019(%\u0003\u0017\t#,J[\rW~";
        objectArray[53] = "\"h=\u0005AZ{n-^{\u001d@o?W\u000bN=k7[J";
        objectArray[54] = "\"`\u001cz2`4j\u0003w\u000e9 p\u0004,b\u000bp5Xq1\\,=\u00075h94p\n9\u000em!a\u00067eatq\u0005K?0 n\u0018 3e0md$q. s\u001drser\f";
        objectArray[55] = "|+Eb@\u0013\u007f4\u001e\u001f@QFt\u0005~G\u0010),\u001f \u001a";
        objectArray[56] = "Z(nv\u0013QOs5tbPQz:v5\u0007\f(d'b\u0000K+;b\u001dP_s?";
        objectArray[57] = "\u0010G\u0011\u001f/\u0013\u0013XJb-/C\u0013\u0017Zr\u0014R\\\u0013Y";
        objectArray[58] = "*<(r<trwct\u0005!KG*qu)n$ve5a";
        Object[] objectArray2 = objectArray;
        objectArray[59] = "PE~\u0005-\u0002\fQ>MS\u0004\u0006]nS?6R\u001d>\u000fS]\u0001\u0010a\t([\u0012@l4";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _9q.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _9q.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _9q.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9q.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _9q.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _9q.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9q.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9q.a(clazz3, string2, clazz2)) != null) {
                    _9q.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9q.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9q.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9q.b(705300878543092L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9q.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9q.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _9q.a(l2, l3);
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
                clazz3 = _9q.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9q.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9q.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9q.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9q.b(705300878543092L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9q.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9q.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9q.b(705300878543092L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00db' || c == 'Q' || c == '\u00f5' || c == '\u00d1') {
                field = _9q.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9q.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9q.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_9q.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(_9q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

