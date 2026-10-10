/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_2583
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._5f_0;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._8F;
import dev.krypton._95;
import dev.krypton._9j_0;
import dev.krypton._9o;
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
import net.minecraft.class_2583;

/*
 * Renamed from dev.krypton.5p
 */
public class _5p_0
extends _6x_0 {
    private static final class_2583 cfr_renamed_2;
    private final _6e_0 cfr_renamed_8;
    private final _6e_0 cfr_renamed_0;
    private final _9j_0 cfr_renamed_4;
    private final _9r cfr_renamed_3;
    private boolean cfr_renamed_9;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    private void cfr_renamed_54(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l2;
        block16: {
            _5f_0 f_0;
            _5f_0 f_02;
            int n;
            long l3;
            long l4;
            long l5;
            long l6;
            block17: {
                l2 = (Long)objectArray[0];
                long l7 = l2 = b ^ l2;
                l6 = l7 ^ 0x3702B5D65E36L;
                long l8 = l7 ^ 0x19B7FA652841L;
                l5 = l7 ^ 0x41E46199EE8AL;
                long l9 = l7 ^ 0x7E801646A9A3L;
                l4 = l7 ^ 0x62AD73496E2AL;
                long l10 = l7 ^ 0x49E5C4BAE71FL;
                long l11 = l7 ^ 0x9BD0CFFC593L;
                l3 = l7 ^ 0x384AFD527B89L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l8;
                callSite2 = _5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("a", (Object)this, 580341800293213552L, (long)l2), (Object)objectArray2, 580213725376811633L, (long)l2), 578854379958275018L, (long)l2);
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l8;
                callSite = _5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("a", (Object)this, 581572321463448129L, (long)l2), (Object)objectArray3, 580213725376811633L, (long)l2), 578854379958275018L, (long)l2), 580775539251556960L, (long)l2);
                n = _8F.cfr_renamed_8();
                try {
                    if (_5p_0.d("\u00e8", (Object)callSite2, 580688475364033175L, (long)l2) != false) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw _5p_0.a(matchException);
                }
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l9;
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = _5f_0.class;
                objectArray5[0] = l10;
                f_02 = (_5f_0)((Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("W", 580623189101031953L, (long)l2), (Object)objectArray4, 579067865881429835L, (long)l2), (Object)objectArray5, 579223472847046511L, (long)l2));
                try {
                    try {
                        if (_5p_0.d("\u00e8", (Object)_5p_0.d("a", (Object)this, 581100058852739201L, (long)l2), (long)l11, 581730718746150961L, (long)l2) == false) break block16;
                        f_0 = f_02;
                        if (n != 0) break block17;
                    }
                    catch (MatchException matchException) {
                        throw _5p_0.a(matchException);
                    }
                    if (f_0 == null) break block16;
                }
                catch (MatchException matchException) {
                    throw _5p_0.a(matchException);
                }
                f_0 = f_02;
            }
            if (_5p_0.d("\u00e8", (Object)f_0, 582053215867336336L, (long)l2) != false) {
                reference v14;
                block19: {
                    double d;
                    Object object;
                    block20: {
                        reference v12;
                        reference var26_17;
                        reference var24_15;
                        block18: {
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l5;
                            objectArray6[0] = callSite;
                            var24_15 = _5p_0.d("\u00c8", (Object)objectArray6, 581885770075656564L, (long)l2);
                            Object[] objectArray7 = new Object[1];
                            objectArray7[0] = l4;
                            Object[] objectArray8 = new Object[2];
                            objectArray8[1] = l5;
                            objectArray8[0] = _5p_0.d("\u00e8", (Object)f_02, (Object)objectArray7, 581322711447689554L, (long)l2);
                            var26_17 = _5p_0.d("\u00c8", (Object)objectArray8, 581885770075656564L, (long)l2);
                            try {
                                try {
                                    try {
                                        reference v12 = var24_15 - 0.0;
                                        v12 = v12 == 0 ? 0 : (v12 > 0 ? 1 : -1);
                                        if (l2 < 0L || n != 0) break block18;
                                        if (v12 <= 0) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5p_0.a(matchException);
                                    }
                                    v14 = var26_17;
                                    if (l2 <= 0L) break block19;
                                    object = 0.0;
                                    if (n != 0) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw _5p_0.a(matchException);
                                }
                                reference v12 = v14 - object;
                                v12 = v12 == 0 ? 0 : (v12 > 0 ? 1 : -1);
                            }
                            catch (MatchException matchException) {
                                throw _5p_0.a(matchException);
                            }
                        }
                        try {
                            if (v12 <= 0) break block16;
                            d = 0.0;
                            object = var26_17 - var24_15;
                        }
                        catch (MatchException matchException) {
                            throw _5p_0.a(matchException);
                        }
                    }
                    v14 = _5p_0.d("\u00c8", (double)d, (double)object, 581841118372684747L, (long)l2);
                }
                reference var28_18 = v14;
                Object[] objectArray9 = new Object[2];
                objectArray9[1] = l3;
                objectArray9[0] = (double)var28_18;
                Object[] objectArray10 = new Object[2];
                objectArray10[1] = l6;
                objectArray10[0] = _5p_0.d("\u00e8", (Object)this, (Object)objectArray9, 582678131978634077L, (long)l2);
                _5p_0.d("\u00e8", (Object)f_02, (Object)objectArray10, 582874714731939052L, (long)l2);
            }
        }
        CallSite callSite3 = _5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00c8", 579046514122058689L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00c8", (Object)_5p_0.a("l", 18711, (long)(0x1DACB3C3B4CE6E22L ^ l2)), 579871357784783830L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("W", 583180877311325494L, (long)l2), (Object)_5p_0.d("W", 581192947493729424L, (long)l2), 581004788117661701L, (long)l2), 578968113768204782L, (long)l2), 582853908736466324L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00c8", (String)((Object)callSite2) + " ", 579871357784783830L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("W", 583180877311325494L, (long)l2), (Object)_5p_0.d("\u00c8", (int)_5p_0.c("z", 12536, (long)(0x226B331664CBE1AL ^ l2)), 580939789567702074L, (long)l2), 582987328848756079L, (long)l2), 578968113768204782L, (long)l2), 582853908736466324L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00c8", "$" + (String)((Object)callSite), 579871357784783830L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("W", 583180877311325494L, (long)l2), (Object)_5p_0.d("\u00c8", (int)_5p_0.c("z", 13778, (long)(0xF97D00D0516BB31L ^ l2)), 580939789567702074L, (long)l2), 582987328848756079L, (long)l2), 578968113768204782L, (long)l2), 582853908736466324L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00c8", ".", 579871357784783830L, (long)l2), (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("W", 578714993574312030L, (long)l2), (Object)_5p_0.d("W", 581192947493729424L, (long)l2), 581004788117661701L, (long)l2), (Object)_5p_0.d("\u00c8", (boolean)false, 579978739054748300L, (long)l2), 581616337663417891L, (long)l2), 578968113768204782L, (long)l2), 582853908736466324L, (long)l2);
        _5p_0.d("\u00e8", (Object)_5p_0.d("a", (Object)_5p_0.d("a", (Object)this, 580570592280568745L, (long)l2), 580113178584719049L, (long)l2), (Object)callSite3, (boolean)false, 583050287845327813L, (long)l2);
    }

    public _5p_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x72498C482A6BL;
        long l5 = l3 ^ 0x24711B0BA202L;
        long l6 = l3 ^ 0x3BB1882F4D70L;
        long l7 = l3 ^ 0x14815D3EDD5FL;
        int n = (int)(l7 >>> 32);
        int n2 = (int)(l7 << 32 >>> 56);
        int n3 = (int)(l7 << 40 >>> 40);
        long l8 = l3 ^ 0x6425E9ED7F34L;
        super((int)_5p_0.c("z", 31981, (long)(0x31C6CB9F000AF13FL ^ l2)), -1, (_4r)((Object)_5p_0.d("W", 809266477203861735L, (long)l2)), l5);
        this.cfr_renamed_8 = new _6e_0((int)_5p_0.c("z", 22908, (long)(0x38505FACD135D4ACL ^ l2)), l8, "");
        this.cfr_renamed_0 = new _6e_0((int)_5p_0.c("z", 5606, (long)(0x16819E6E2FA21835L ^ l2)), l8, "1");
        this.cfr_renamed_4 = new _9j_0((int)_5p_0.c("z", 467, (long)(0x7EB26328D4B20C0BL ^ l2)), n, (byte)n2, -1, n3, false);
        this.cfr_renamed_3 = new _9r((int)_5p_0.c("z", 22293, (long)(0x3911A6198A805AC1L ^ l2)), false, l4);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5p_0.d("a", (Object)this, 808591238995093061L, (long)l2), _5p_0.d("a", (Object)this, 803699336025551220L, (long)l2), _5p_0.d("a", (Object)this, 809868821646599094L, (long)l2), _5p_0.d("a", (Object)this, 803052321866140596L, (long)l2)};
        objectArray[0] = l6;
        _5p_0.d("\u00e8", (Object)this, (Object)objectArray, 803821385654462068L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _5p_0.b = dev.krypton.l.a(3678508622797528319L, -1959468764482178813L, MethodHandles.lookup().lookupClass()).a(249823895445559L);
                        var20 = _5p_0.b ^ 76985704483290L;
                        _5p_0.m = new Object[87];
                        _5p_0.n = new String[87];
                        _5p_0.b();
                        _5p_0.f = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[11];
                        var16_4 = 0;
                        var15_5 = ";\u00d4\"\u00abG\u00900\u00e1\u0014\u008f\u00fa\u00baJ\u0017\u0005\u0085\u0010\u00d0~\u00d0\u00e9\u00f6\u0099BT\u008fu\u0087\u00a3\u0019\u00ebx\u00cc\u0010;\u00c4\u00c9g\u0097^\u0001\u001b\u00a6\u009f?\u00cb\u00c9+\u0015\u009f\u0010\u00a7\u00aaZ\t\u00bc\u00b0\u00fek\u0005\u00e1\u00f7XZ\u00bb\f\u001b\u0018E\u0006\u00c6\f\u00fb\u0099+#\u00c9\b\u00bb\u00c3vw\u00ab0\u0014\u00eb\u00a1BvT\u00fa\u0089\u0010\u00ed\u0017\u00ae\u0013T\u0017[\u00cd\u00c0\u00e2!\u00bf\u00f5J\u00d7\u00e5\u0010Qs\u009a\u00d1!\u00e3\u007f\u0098\u00caz\u00a4\u00c7\u00b7u`\u009e\u0010\f3\u00e6\u001c\t\u00eakt\u00c3\u0093\u00fbo!\u00c9.v\u0010hA.\u0018E?\u00ef\u001e\u009f\u00fb\u0006\u00e3\u00c3l\u00f8\u00c0";
                        var17_6 = ";\u00d4\"\u00abG\u00900\u00e1\u0014\u008f\u00fa\u00baJ\u0017\u0005\u0085\u0010\u00d0~\u00d0\u00e9\u00f6\u0099BT\u008fu\u0087\u00a3\u0019\u00ebx\u00cc\u0010;\u00c4\u00c9g\u0097^\u0001\u001b\u00a6\u009f?\u00cb\u00c9+\u0015\u009f\u0010\u00a7\u00aaZ\t\u00bc\u00b0\u00fek\u0005\u00e1\u00f7XZ\u00bb\f\u001b\u0018E\u0006\u00c6\f\u00fb\u0099+#\u00c9\b\u00bb\u00c3vw\u00ab0\u0014\u00eb\u00a1BvT\u00fa\u0089\u0010\u00ed\u0017\u00ae\u0013T\u0017[\u00cd\u00c0\u00e2!\u00bf\u00f5J\u00d7\u00e5\u0010Qs\u009a\u00d1!\u00e3\u007f\u0098\u00caz\u00a4\u00c7\u00b7u`\u009e\u0010\f3\u00e6\u001c\t\u00eakt\u00c3\u0093\u00fbo!\u00c9.v\u0010hA.\u0018E?\u00ef\u001e\u009f\u00fb\u0006\u00e3\u00c3l\u00f8\u00c0".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _5p_0.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u009cozm\u008e\u001fA~(\u00aa\bv\u0002C\u00fa\u008c\u0010\u00eb\u00cc.\u00dcMu\u00c8\u0003\u00f5\u0004I8\u00f6E}\u0001";
                            var17_6 = "\u009cozm\u008e\u001fA~(\u00aa\bv\u0002C\u00fa\u008c\u0010\u00eb\u00cc.\u00dcMu\u00c8\u0003\u00f5\u0004I8\u00f6E}\u0001".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl37:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = _5p_0.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl54:
                        // 1 sources

                        ** continue;
                    }
                }
                _5p_0.d = var18_3;
                _5p_0.e = new String[11];
                _5p_0.l = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u00c2\u00aa\u007fst\u009bAs\u00a8e\u0006\u009d\u00b0\u00e5\u00c4=\u00efw\u0097;\u00b7e*,s\u00fb\u00ddf~?i]\u0091\u001e>\u00ea6\u00eeT\u0014@\u008e\u00ad\u0007\u00b4U\u0097\u00e3\u009d\u0013pF\u00f2R\u00e3?";
                var5_15 = "\u00c2\u00aa\u007fst\u009bAs\u00a8e\u0006\u009d\u00b0\u00e5\u00c4=\u00efw\u0097;\u00b7e*,s\u00fb\u00ddf~?i]\u0091\u001e>\u00ea6\u00eeT\u0014@\u008e\u00ad\u0007\u00b4U\u0097\u00e3\u009d\u0013pF\u00f2R\u00e3?".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl81:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "0V\u0014m\u00dd\u00ec\u001d\u0086\u00c9\u0093\u00ee\fr\u0080S\u00c4";
                    var5_15 = "0V\u0014m\u00dd\u00ec\u001d\u0086\u00c9\u0093\u00ee\fr\u0080S\u00c4".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl107:
                // 1 sources

                ** continue;
            }
        }
        _5p_0.j = var6_12;
        _5p_0.k = new Integer[9];
        _5p_0.cfr_renamed_2 = _5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("\u00e8", (Object)_5p_0.d("W", (long)-2580158560037852057L, (long)var20), (Object)_5p_0.d("\u00c8", (boolean)false, (long)-2579134480592537931L, (long)var20), (long)-2578463822880506147L, (long)var20), (Object)_5p_0.d("\u00c8", (boolean)false, (long)-2579134480592537931L, (long)var20), (long)-2581902102778410470L, (long)var20), (Object)_5p_0.d("\u00c8", (boolean)false, (long)-2579134480592537931L, (long)var20), (long)-2579303776345557636L, (long)var20), (Object)_5p_0.d("\u00c8", (boolean)false, (long)-2579134480592537931L, (long)var20), (long)-2582719755430705861L, (long)var20), (Object)_5p_0.d("\u00c8", (boolean)false, (long)-2579134480592537931L, (long)var20), (long)-2578928170199848416L, (long)var20);
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5p_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 57;
            case 2 -> 5;
            case 3 -> 32;
            case 4 -> 38;
            case 5 -> 55;
            case 6 -> 23;
            case 7 -> 14;
            case 8 -> 2;
            case 9 -> 4;
            case 10 -> 17;
            case 11 -> 28;
            case 12 -> 19;
            case 13 -> 37;
            case 14 -> 48;
            case 15 -> 61;
            case 16 -> 25;
            case 17 -> 20;
            case 18 -> 33;
            case 19 -> 15;
            case 20 -> 3;
            case 21 -> 16;
            case 22 -> 43;
            case 23 -> 58;
            case 24 -> 27;
            case 25 -> 1;
            case 26 -> 22;
            case 27 -> 59;
            case 28 -> 0;
            case 29 -> 45;
            case 30 -> 7;
            case 31 -> 13;
            case 32 -> 12;
            case 33 -> 50;
            case 34 -> 34;
            case 35 -> 35;
            case 36 -> 63;
            case 37 -> 29;
            case 38 -> 26;
            case 39 -> 52;
            case 40 -> 51;
            case 41 -> 36;
            case 42 -> 49;
            case 43 -> 39;
            case 44 -> 40;
            case 45 -> 18;
            case 46 -> 60;
            case 47 -> 9;
            case 48 -> 24;
            case 49 -> 54;
            case 50 -> 46;
            case 51 -> 56;
            case 52 -> 44;
            case 53 -> 62;
            case 54 -> 6;
            case 55 -> 42;
            case 56 -> 53;
            case 57 -> 31;
            case 58 -> 30;
            case 59 -> 21;
            case 60 -> 11;
            case 61 -> 10;
            case 62 -> 47;
            default -> 8;
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
        _5p_0.n[n3] = new String(cArray);
        return n3;
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

    private static void b() {
        Object[] objectArray = m;
        m[0] = "\u0017q6\u001a.9\nd4[+eFd";
        objectArray[1] = "\u0010OR'\u00173eoY(\u0006|\u0004aR#\u0002&p";
        objectArray[2] = Void.TYPE;
        _5p_0.n[2] = "java/lang/Void";
        objectArray[3] = "t\u0003.=RAt\u00039a^NnH9\u007f^[i9i\"\u000f";
        objectArray[4] = "f;+|/>f;< #1|p<>#${\u0001hft";
        objectArray[5] = "\nYo\fZ\u001f\u0017LmM_CXD";
        objectArray[6] = "ibf\u0010\u007fDtwdQz\u00184m";
        objectArray[7] = "w|9q_S\u0002\\2~N\u001ccR9uJF\u0017";
        objectArray[8] = Integer.TYPE;
        _5p_0.n[8] = "java/lang/Integer";
        objectArray[9] = Boolean.TYPE;
        _5p_0.n[9] = "java/lang/Boolean";
        objectArray[10] = "#w0\u0013j~>b2Ro\"~Y";
        objectArray[11] = "\u007fB\u001f?u\u0011\nb\u00140d^kl\u001f;`\u0004\u001f";
        objectArray[12] = "2X`ls8/Mb-vd`X";
        objectArray[13] = "\u001fRV yV\u0002GTa|\nOE";
        objectArray[14] = "=\f&I8s \u0019$\b=/`\u001b";
        objectArray[15] = "gw`Ha^\u0012WkGp\u0011sY`LtK\u0007";
        objectArray[16] = "\u001c\u0003U\\tc\u0017\fD\u0013\t{\u0004\u000bMZ";
        objectArray[17] = "\u00010\r)&=t\u0010\u0006&7r\u0015\u001e\r-3(a";
        objectArray[18] = "g\u0019w{Iul\u0016f4#vx\u001am\u007f";
        objectArray[19] = Double.TYPE;
        _5p_0.n[19] = "java/lang/Double";
        objectArray[20] = "\u0000\u0003\u001fi\u001fB\u000b\f\u000e&}A\u0004\u0005";
        objectArray[21] = Long.TYPE;
        _5p_0.n[21] = "java/lang/Long";
        objectArray[22] = "62\u001b\u00133&C\u0012\u0010\u001c\"i\"\u001c\u001b\u0017&3V";
        objectArray[23] = "l\u0003O\u0013slq\u0016MRv0=\u0000";
        objectArray[24] = "z\u000fU\"\u0004F\u000f/^-\u0015\tn!U&\u0011S\u001a";
        objectArray[25] = "p#e(A\u0019p#rtM\u0016jhrjM\u0003m\u0019$4\u0019@";
        objectArray[26] = "\u0005\u0016o\u0000\u007f\n\u0005\u0016x\\s\u0005\u001f]xBs\u0010\u0018,)\u001b$R";
        objectArray[27] = "RiGhR\u0005RiP4^\nH\"P*^\u001fOS\u0001s\u0007_";
        objectArray[28] = "E\u007fnQd E\u007fy\rh/_4y\u0013h:XE/M<x";
        objectArray[29] = "\u0004\u001d\u0012Q\u0013y\u0004\u001d\u0005\r\u001fv\u001eV\u0005\u0013\u001fc\u0019'WMJ";
        objectArray[30] = "s\u007f!]?B\u0006_*R.\rgQ!Y*W\u0013";
        objectArray[31] = "\f6 \u0002\u001eG\u000791MrD\t;3\u0002^";
        objectArray[32] = "a4]l\u0007z|!_-\u0002&1\u0000";
        objectArray[33] = "%r0q\u001a\u001aPR;~\u000bU1\\0u\u000f\u000fE";
        objectArray[34] = "y\u0012zQ\u007fKr\u001dk\u001e\u001cFg\u001b";
        objectArray[35] = "\u0011\u001c0\u0017Q>d<;\u0018@q\u000520\u0013D+q";
        objectArray[36] = "{\u000f\u0012=s0f\u001a\u0010|vl-";
        objectArray[37] = "AXb8(\u00014xi79NUvb<=\u0014!";
        objectArray[38] = "E8E~\\%X-G?Yy\u0011o";
        objectArray[39] = "@V\u001f/C-5v\u0014 RbTx\u001f+V8 ";
        objectArray[40] = "\u0018W\u0011Oh(\u0013X\u0000\u0000\t&\u0018S\u0004Z";
        objectArray[41] = "c#B\u00184H`=Lr7%w-L\u0016rEd:H\u001c\nO=zMOi]n:\u0011r";
        objectArray[42] = "/|z>\r:1.%;wa\u001cE`:\u0015:8%s-\u00110@|~:M?*=\"(H^";
        objectArray[43] = "\u0016r/Z>\u001bFt2T\u0004\u0004\u001bi5Yh6O-e\u0003>a\u0017w5\u0003o\r\u0013l6D\u0004\u0001\u0011o1\u0004~Q\u0017r?>";
        objectArray[44] = "\u000b,{h\f\\[bm?oD]o|`\u0003v\u000f(!<o@Rs!l\u0003DIpf\u0007QCS/\u007f{\u0014Y\b-\u001c>\u000bO\nrv\u007fW]\u000f\u0013";
        objectArray[45] = "Iy\u0011\u0002k\u001f\u001a{\u001aFU\u000bFn\u0014_99\u0011-K\u0000nnIb\u000b\u0000k\u0010Wi\n\u0000U\f@wN\u0006$_B|\n8";
        objectArray[46] = "hl\u000bkabkr\u0005\u0001a\u000fdg\u0002;a~7e\t\u007f";
        objectArray[47] = "\u001a\f2*Oz\u0013M+;wx\u001fS7*0hv[/x\u0010a\u0007T-:\u001a\u0006\u001a\f2*Oz\u0013M+;w";
        objectArray[48] = "v#\r:Fiu=\u0003PB\u0004)1\u0010*\u001ffr}Z>";
        objectArray[49] = "M-Q\u0000%\u0015\u001e/ZD\u001b\u0001B:T]w3\u0016~\u0005\u0005$dLxQPr^\u0010,[\u0003\u001b\u0006D#\u000e\u0004jUF(J:";
        objectArray[50] = "\u0016U~\u0013$jJ\u0001t@M>\u0014\u0006\u007f\u0015\u001aiM[#y.n\u0010\u0001rCr:\u001aR";
        objectArray[51] = "8\b\u000b7SEm\u000e\u0002'+\u0001\u0004O\u0014(OGd\\\u0003,E?:\u000f\u0006#SGzO\u000b:+";
        objectArray[52] = "]>\u0011f\u0019{ClNcc$2}\u001fn\u0007gRn\bj\r\u001fX7Ho^|Jd\b3c";
        objectArray[53] = "{M J*q(O+\u000e\u0014etZ%\u0017xW\"\u0018|L,\u0000}G>\t%jhDyK\u0014brC\u007fNe1pH;p";
        objectArray[54] = "L\"9%\u0003\u0000O<7O\u0002m\u001c 6s^\u0011Y:mq";
        objectArray[55] = "o'HL \rmeBUL\u0016j=\u000eZ\u000b\u0006\u00034\bFq\u0001l4OY>ho'HL \rmeBUL";
        objectArray[56] = "@i\u0014D5o\u0013k\u001f\u0000\u000b{O~\u0011\u0019gI\u001b:@A;\u001eFc\n\u0007:tS`ME\u000b|IgK@z/Kl\u000f~";
        objectArray[57] = "-iB\u000f[3.wLeU^sr\u0010\u000f\fd&f\u0014\u0007";
        objectArray[58] = "&v\u001eHE2~tJC5q\u001doHXQ0}|_\\[H$qH\u0000T\"e-Z\u00055";
        objectArray[59] = "w\u0015\\H\re,Y\u0016\\j=F\nVCWn)\n\u0011\\\u0018\u0007x\u0005N\u000e\t{=\u001f\u0015\fj";
        objectArray[60] = "8Y\u0014\b\bPfST\u001ds\u0004]H\u000b\u0016\u0017A=[\u001c\u0012\u001d91WZ\u0013\u0014H>U\u0018\u0019s";
        objectArray[61] = "<T\u0007Q*qgSQG@%3_hD%\u007f=H\u0019K'=7/\u0004M\u007f'=^\u000bO=-ZC\r\u0017''+L\u000fU-@";
        objectArray[62] = "P\u001dY \"\u001b\b\u001f\r+RPk@\u00031n\u0002\u0017\u0005\u0019jla";
        objectArray[63] = "0\u0003\u0004\u0018{y3\u001d\nr|W^\u0019\u0006\u0010!l>\n\u0011\u0014+\u0014g\u0007\u0006H$~&[\u0014ME";
        objectArray[64] = "N#O9\u0000\u0016[ \b{1\u0002C&I-v\u0012*|V#\r\u001fV9Lx\u000f|N#O9\u0000\u0016[ \b{1";
        objectArray[65] = "\u000b[5s;_\u000f@64PV\u0007E5)<dV\u0002iqh3\u0000\tl-mP\u0012Z,qPS\rC1t*\u0003\u000b^?N";
        objectArray[66] = "tOo\u0017DJ*E3\u0014tB/Oh\u001d#\u0015q\u00180qO\u0013)Mo\f\u001f]?\u001a";
        objectArray[67] = "u~'yW\u0003&|,=i\u0017zi\"$\u0005%,+{\u007fPrst9:X\u0018fw~xi\u0010|px}\u0018C~{<C";
        objectArray[68] = "\u0014_7]\u001a\u0006AK3Us\u0000$^gU\u0017DDMpQ\u001d<N\u00140TN_\\Gp\bs";
        objectArray[69] = "\u000f]C\u0000\b<\\_HD6(\u0000JF]Z\u001aV\u000e\u0017\u0001\u0006M\tW]C\u0007'\u001cT\u001a\u00016/\u0006S\u001c\u0004G|\u0004XX:";
        objectArray[70] = "=weVv7>ik<uZcl7V!`6x3^";
        objectArray[71] = "NO\n\u0013P%\\\u001cJOm(C\u0005V\u0019\u0011FNO\n\u0013P%\\\u001cJOm<J\u001dW\b\r/]\u0019]p\u0007v\u001d\u001c\u000e\u0013\u0015%]@3";
        objectArray[72] = "UcA8@e[`\u0015-2U#L'\u000f2(\r1\u0011!N&\u000ee\u0004";
        objectArray[73] = "4H\f5\u0012.gJ\u0007q,:;_\th@\bo\u001bX?\u0016_2B\u0012v\u001d5'AU4,==FS1]n?M\u0017\u000f";
        objectArray[74] = "\u0010\nL\u0016b\u0018\u0011\u000e\rGRB+h\u000e\u001ah\u0015X\u000b\u000f\u001e)D";
        objectArray[75] = "q\u0004\u0014cQu)\u0006@h!6J]ArG?,\u0003K.D";
        objectArray[76] = "i}/\u0000\u000e({.o\\37d\u0010n\u001b^1H$m\u000e3!3tu^P3`4)c";
        objectArray[77] = "<hUa0\u0010.;\u0015=\r\u0012-\u0015\tzq\u0002Vf\u000ea1\u0010*#\u0014:3s";
        objectArray[78] = "W1\u001eV\n\u001cI:\u001fV4\u0007X=\u0001\tX5\u000f~^W\u000bb\u000b{\u001d\u0007L\u001aK;\u0010\u001e4\u0000E>YPJ\u001eN?Yn";
        objectArray[79] = "tI\u0010\u001d\u000b;/G@YdbJB\u0011@\u0000**Q\u0006D\nRtZ\u001c\u001e\u0007.1@G\u001cd";
        objectArray[80] = "wUp\u007f\u001d\u001ctK~\u0015\u001bq%\bmh[\u000bp\u000edx";
        objectArray[81] = "bnT\u0014kF1l_PUYahUB\u0002\r<>\u000f\u0016UUk`\u000b\u0010$\u0006ikO";
        objectArray[82] = "m-8zuD=+%tO[`6\"y#i4rr u>o!'$qO<#,`O^j0&$5\u000el-(\u001e";
        objectArray[83] = "E&\u0000anAWu@=S^Uw\\\u00029\u0012\u0016u\u0004a+AV)9";
        objectArray[84] = "r)\u0000s@Zs-A\"p\u0002\n1T\u007f\u0014Aj\"C{\u001e9s4@-\bT;{Tqp";
        objectArray[85] = "G;cyY4C `>2=K%c#^\u000f\u001ab?{\tXF>y \b\"\u00168d.2";
        Object[] objectArray2 = objectArray;
        objectArray[86] = "<\u001co+b\u0002tS{w\u001aRE\u0019{y~\u0017%\nl}to~\u0000-ij\u0015&\u0002yb\u001a";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'a' || c == '\u00e3' || c == 'W' || c == 'V') {
                field = _5p_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'a' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5p_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5p_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5p_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5p" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6F9;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])l.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5p", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5p_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _5p_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = _5p_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5p_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5p_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5p_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5p_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5p_0.f(2858402429314376L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5p_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5p_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5p_0.f(2858402429314376L, 0L);
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
            int n = _5p_0.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5p_0.m[n] = clazz = Class.forName(_5p_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5p_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5p_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5p_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5p_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5p_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2F2D;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])f.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/5p", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            _5p_0.e[n2] = _5p_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Field g(long l2, long l3) {
        int n = _5p_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5p_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5p_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5p_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5p_0.c(clazz3, string2, clazz2)) != null) {
                    _5p_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5p_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5p_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5p_0.f(2858402429314376L, 0L);
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
        block19: {
            block17: {
                block18: {
                    block15: {
                        block16: {
                            v0 = var2_2 = _5p_0.b ^ 20443250192844L;
                            var4_3 = v0 ^ 67395413344463L;
                            var6_4 = v0 ^ 134962721743694L;
                            var8_5 = v0 ^ 71428075452880L;
                            var10_6 = _8F.cfr_renamed_8();
                            try {
                                try {
                                    v1 = this;
                                    if (var10_6 != 0) break block15;
                                    if (_5p_0.d("a", (Object)_5p_0.d("a", (Object)v1, (long)2603538248015990662L, (long)var2_2), (long)2604136126467388134L, (long)var2_2) != null) break block16;
                                }
                                catch (MatchException v2) {
                                    throw _5p_0.a(v2);
                                }
                                return;
                            }
                            catch (MatchException v3) {
                                throw _5p_0.a(v3);
                            }
                        }
                        v1 = this;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (var10_6 != 0) break block17;
                                    v4 = new Object[1];
                                    v4[0] = var4_3;
                                    v5 = new Object[2];
                                    v5[1] = var6_4;
                                    v5[0] = (int)_5p_0.d("\u00e8", (Object)_5p_0.d("a", (Object)v1, (long)2605185058417659052L, (long)var2_2), (Object)v4, (long)2611981181543002866L, (long)var2_2);
                                    if (_5p_0.d("\u00c8", (Object)v5, (long)2603230125179073724L, (long)var2_2) != false) {
                                    }
                                    ** GOTO lbl59
                                }
                                catch (MatchException v6) {
                                    throw _5p_0.a(v6);
                                }
                                v7 = this;
                                if (var10_6 != 0) break block18;
                            }
                            catch (MatchException v8) {
                                throw _5p_0.a(v8);
                            }
                            if (_5p_0.d("a", (Object)v7, (long)2611737454057428773L, (long)var2_2) != false) break block19;
                        }
                        catch (MatchException v9) {
                            throw _5p_0.a(v9);
                        }
                        _5p_0.d("\u00e3", (Object)this, (boolean)_5p_0.c("z", (int)13055, (long)(5824262625870680116L ^ var2_2)), (long)2611737454057428773L, (long)var2_2);
                        v7 = this;
                    }
                    catch (MatchException v10) {
                        throw _5p_0.a(v10);
                    }
                }
                try {
                    v11 = new Object[1];
                    v11[0] = var8_5;
                    _5p_0.d("\u00e8", (Object)v7, (Object)v11, (long)2611108014942377218L, (long)var2_2);
                    if (var10_6 == 0) break block19;
lbl59:
                    // 2 sources

                    v1 = this;
                }
                catch (MatchException v12) {
                    throw _5p_0.a(v12);
                }
            }
            _5p_0.d("\u00e3", (Object)v1, (boolean)_5p_0.c("z", (int)24338, (long)(760476013827882461L ^ var2_2)), (long)2611737454057428773L, (long)var2_2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String java_lang_String_5(Object[] objectArray) {
        CallSite callSite;
        double d;
        long l2;
        double d2;
        block35: {
            block37: {
                int n;
                block36: {
                    int n2;
                    block29: {
                        block30: {
                            CallSite callSite2;
                            double d3;
                            double d4;
                            block31: {
                                d2 = (Double)objectArray[0];
                                l2 = (Long)objectArray[1];
                                l2 = b ^ l2;
                                n2 = _8F.cfr_renamed_7();
                                try {
                                    double d5 = d2 - 1.0E12;
                                    d = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                    if (n2 == 0) break block29;
                                    if (d < 0) break block30;
                                }
                                catch (MatchException matchException) {
                                    throw _5p_0.a(matchException);
                                }
                                d4 = d2 / 1.0E12;
                                try {
                                    double d6 = d4 - (double)((long)d4);
                                    d3 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                                    if (l2 < 0L) break block31;
                                    if (d3 == false) {
                                        callSite2 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", 8074, (long)(0x6F8805F4E9EC96CBL ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (long)((long)d4), 2767443957964128258L, (long)l2)}, 2773073918569376617L, (long)l2);
                                        return callSite2;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _5p_0.a(matchException);
                                }
                                d3 = 11650;
                            }
                            callSite2 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", (int)d3, (long)(0x5E1208B680F924C6L ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (double)d4, 2765745938506408690L, (long)l2)}, 2773073918569376617L, (long)l2);
                            return callSite2;
                        }
                        double d7 = d2 - 1.0E9;
                        d = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                    }
                    n = n2;
                    if (l2 >= 0L) {
                        if (n != 0) {
                            if (d >= 0) {
                                CallSite callSite3;
                                double d8;
                                double d9;
                                block32: {
                                    d9 = d2 / 1.0E9;
                                    try {
                                        double d10 = d9 - (double)((long)d9);
                                        d8 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                        if (l2 <= 0L) break block32;
                                        if (d8 == false) {
                                            callSite3 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", 32553, (long)(0x73CE2C00A8A2F66EL ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (long)((long)d9), 2767443957964128258L, (long)l2)}, 2773073918569376617L, (long)l2);
                                            return callSite3;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw _5p_0.a(matchException);
                                    }
                                    d8 = 10968;
                                }
                                callSite3 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", (int)d8, (long)(0x5B5BF118D9C82396L ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (double)d9, 2765745938506408690L, (long)l2)}, 2773073918569376617L, (long)l2);
                                return callSite3;
                            }
                            double d11 = d2 - 1000000.0;
                            d = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        }
                        n = n2;
                    }
                    if (l2 <= 0L) break block36;
                    if (n != 0) {
                        if (d >= 0) {
                            CallSite callSite4;
                            double d12;
                            double d13;
                            block33: {
                                d13 = d2 / 1000000.0;
                                try {
                                    double d14 = d13 - (double)((long)d13);
                                    d12 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                    if (l2 <= 0L) break block33;
                                    if (d12 == false) {
                                        callSite4 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", 23002, (long)(0x46B8FFAE6E31509CL ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (long)((long)d13), 2767443957964128258L, (long)l2)}, 2773073918569376617L, (long)l2);
                                        return callSite4;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _5p_0.a(matchException);
                                }
                                d12 = 243;
                            }
                            callSite4 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", (int)d12, (long)(0x6CDA4FCDA86389BEL ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (double)d13, 2765745938506408690L, (long)l2)}, 2773073918569376617L, (long)l2);
                            return callSite4;
                        }
                        double d15 = d2 - 1000.0;
                        d = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                    }
                    if (l2 <= 0L) break block37;
                    n = n2;
                }
                if (n != 0) {
                    if (d >= 0) {
                        CallSite callSite5;
                        double d16;
                        double d17;
                        block34: {
                            d17 = d2 / 1000.0;
                            try {
                                double d18 = d17 - (double)((long)d17);
                                d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                if (l2 < 0L) break block34;
                                if (d16 == false) {
                                    callSite5 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", 15082, (long)(0x611E42E95709B3AFL ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (long)((long)d17), 2767443957964128258L, (long)l2)}, 2773073918569376617L, (long)l2);
                                    return callSite5;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _5p_0.a(matchException);
                            }
                            d16 = 17249;
                        }
                        callSite5 = _5p_0.d("\u00c8", (Object)_5p_0.a("l", (int)d16, (long)(0x4A31410D5994A2EL ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (double)d17, 2765745938506408690L, (long)l2)}, 2773073918569376617L, (long)l2);
                        return callSite5;
                    }
                    double d19 = d2 - (double)((long)d2);
                    d = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                }
            }
            try {
                if (l2 <= 0L) break block35;
                if (d == false) {
                    callSite = _5p_0.d("\u00c8", (Object)_5p_0.a("l", 5126, (long)(0x3230A1346A789D46L ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (long)((long)d2), 2767443957964128258L, (long)l2)}, 2773073918569376617L, (long)l2);
                    return callSite;
                }
            }
            catch (MatchException matchException) {
                throw _5p_0.a(matchException);
            }
            d = 1813;
        }
        callSite = _5p_0.d("\u00c8", (Object)_5p_0.a("l", (int)d, (long)(0x5AEB273512610E57L ^ l2)), (Object)new Object[]{_5p_0.d("\u00c8", (double)d2, 2765745938506408690L, (long)l2)}, 2773073918569376617L, (long)l2);
        return callSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5p_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5p_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5p_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

