/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._08;
import dev.krypton._0D;
import dev.krypton._0F;
import dev.krypton._0L;
import dev.krypton._0N;
import dev.krypton._0O;
import dev.krypton._0Q;
import dev.krypton._0U;
import dev.krypton._0Z;
import dev.krypton._0_;
import dev.krypton._0c;
import dev.krypton._0g;
import dev.krypton._0q_0;
import dev.krypton._0w;
import dev.krypton._0y;
import dev.krypton._0z_0;
import dev.krypton._4t;
import dev.krypton._6X;
import dev.krypton._6e_0;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._90;
import dev.krypton._92;
import dev.krypton._94;
import dev.krypton._95;
import dev.krypton._96;
import dev.krypton._97;
import dev.krypton._9B;
import dev.krypton._9E;
import dev.krypton._9i;
import dev.krypton._9j_0;
import dev.krypton._9k_0;
import dev.krypton._9m_0;
import dev.krypton._9r;
import dev.krypton._9t_0;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public abstract class _0v {
    static protected final _8B cfr_renamed_3;
    static protected final _8B cfr_renamed_2;
    static protected final float cfr_renamed_5 = 0.25f;
    private static final Map cfr_renamed_1;
    public _4t cfr_renamed_6;
    public _95 cfr_renamed_38;
    public int cfr_renamed_7;
    public boolean cfr_renamed_0;
    public _8B cfr_renamed_39;
    protected float cfr_renamed_9;
    int cfr_renamed_40;
    int cfr_renamed_31;
    int cfr_renamed_41;
    int cfr_renamed_8;
    private _8B cfr_renamed_4;
    private static final long b;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] l;
    private static final String[] m;

    public void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _0v.d("\u00db", (Object)this, null, -74771815715508480L, (long)l2);
        _0v.d("\u00db", (Object)this, null, -75582306766057814L, (long)l2);
        _0v.d("\u00db", (Object)this, 0.0f, -76063528732955491L, (long)l2);
    }

    private static _0v cfr_renamed_5(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x6B35487A9C19L;
        return new _0g(t, l3, var3_2, n);
    }

    private static _0v cfr_renamed_42(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x38B5C7E41138L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        return new _0_(t, var3_2, (char)n2, n3, (char)n4, n);
    }

    private static _0v cfr_renamed_43(int n, short s, char c, _4t t, _95 var4_4, int n2) {
        long l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x5C574AA89E89L;
        return new _0N(t, var4_4, l3, n2);
    }

    private static _0v cfr_renamed_44(int n, short s, short s2, _4t t, _95 var4_4, int n2) {
        long l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x604FD9F29252L;
        return new _0U(l3, t, var4_4, n2);
    }

    private static _0v cfr_renamed_45(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0xAA4D26D7E8FL;
        return new _0F(t, l3, var3_2, n);
    }

    private static _0v cfr_renamed_46(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x7E3DD62B5CE0L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 48);
        int n4 = (int)(l3 << 48 >>> 48);
        return new _0L(n2, t, (char)n3, var3_2, (short)n4, n);
    }

    public _0v(short s, _4t t, _95 var3_3, int n, int n2, char c) {
        long l2;
        long l3 = l2 = ((long)s << 48 | (long)n2 << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x20482B37AC26L;
        long l5 = l3 ^ 0x593702ED1DF2L;
        long l6 = l3 ^ 0x1C6A9000BBD3L;
        long l7 = l3 ^ 0x7882223E684BL;
        long l8 = l3 ^ 0x40C6CF292D49L;
        _0v.d("\u00db", (Object)this, 0.0f, 25519245351227958L, (long)l2);
        _0v.d("\u00db", (Object)this, (_4t)t, 25743159120992134L, (long)l2);
        _0v.d("\u00db", (Object)this, (_95)var3_3, 26250295246263585L, (long)l2);
        _0v.d("\u00db", (Object)this, (int)n, 26397966816999260L, (long)l2);
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        _0v.d("\u00db", (Object)this, (int)_0v.d("\u00e4", (Object)this, (Object)objectArray, 26901363659341239L, (long)l2), 25971301681427969L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l8;
        _0v.d("\u00db", (Object)this, (int)(_0v.d("\u00e4", (Object)this, (Object)objectArray2, 18656612830578895L, (long)l2) + _0v.d("\u00e4", (Object)this, (Object)objectArray3, 26138914564601815L, (long)l2) + n), 18581054781403409L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l5;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l6;
        _0v.d("\u00db", (Object)this, (int)(_0v.d("\u00e4", (Object)this, (Object)objectArray4, 26901363659341239L, (long)l2) + _0v.d("\u00e4", (Object)this, (Object)objectArray5, 18528327974999071L, (long)l2)), 25921399530234839L, (long)l2);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l4;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l8;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l7;
        _0v.d("\u00db", (Object)this, (int)(_0v.d("\u00e4", (Object)this, (Object)objectArray6, 18656612830578895L, (long)l2) + _0v.d("\u00e4", (Object)this, (Object)objectArray7, 26138914564601815L, (long)l2) + n + _0v.d("\u00e4", (Object)this, (Object)objectArray8, 20255622542768025L, (long)l2)), 18132318521152699L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _0v.b = dev.krypton.l.a(8754642192726799480L, -4271446774565937676L, MethodHandles.lookup().lookupClass()).a(228563891799055L);
                v0 = var11 = _0v.b ^ 9574187245060L;
                var13_1 = v0 ^ 99870742997104L;
                v1 = v0 ^ 88439239687222L;
                var15_2 = (int)(v1 >>> 56);
                var16_3 = v1 << 8 >>> 8;
                var18_4 = v0 ^ 87788859823986L;
                var20_5 = v0 ^ 131119692991267L;
                v2 = v0 ^ 61650440809539L;
                var22_6 = (int)(v2 >>> 32);
                var23_7 = (int)(v2 << 32 >>> 48);
                var24_8 = (int)(v2 << 48 >>> 48);
                var25_9 = v0 ^ 139775950615732L;
                v3 = v0 ^ 44051999240045L;
                var27_10 = v3 >>> 32;
                var29_11 = (int)(v3 << 32 >>> 32);
                var30_12 = v0 ^ 22682017203524L;
                var32_13 = v0 ^ 129515382962823L;
                v4 = v0 ^ 131760351588936L;
                var34_14 = (int)(v4 >>> 32);
                var35_15 = (int)(v4 << 32 >>> 48);
                var36_16 = (int)(v4 << 48 >>> 48);
                var37_17 = v0 ^ 7113345164473L;
                var39_18 = v0 ^ 54375095579991L;
                v5 = v0 ^ 94172241500216L;
                var41_19 = (int)(v5 >>> 32);
                var42_20 = (int)(v5 << 32 >>> 48);
                var43_21 = (int)(v5 << 48 >>> 48);
                var44_22 = v0 ^ 48354474644935L;
                var46_23 = v0 ^ 48010929292950L;
                var48_24 = v0 ^ 90998196179139L;
                var50_25 = v0 ^ 27888902535461L;
                _0v.l = new Object[95];
                _0v.m = new String[95];
                _0v.a();
                _0v.h = new HashMap<K, V>(13);
                var0_26 = Cipher.getInstance("DES/CBC/NoPadding");
                v6 = SecretKeyFactory.getInstance("DES");
                v7 = new byte[8];
                v8 = v7;
                v7[0] = (byte)(var11 >>> 56);
                for (var1_27 = 1; var1_27 < 8; ++var1_27) {
                    v8 = v8;
                    v8[var1_27] = (byte)(var11 << var1_27 * 8 >>> 56);
                }
                var0_26.init(2, (Key)v6.generateSecret(new DESKeySpec(v8)), new IvParameterSpec(new byte[8]));
                var6_28 = new long[8];
                var3_29 = 0;
                var4_30 = "\u00e7\u00dd\u009b\u00a0}\u0017ScT$h\u009eE\u00e1\u00ce\u000e\u00ad]\u00a5\u0004&\u00bb\u008f\u00964z\u008bW-\u00a4\u00ca,v\u00df\u00a1\u00ad\u008f\u008a\u00b5\u00bd\u00ca[\u00ec\u00ee\u00e0\u0014\u00fa\u00ae";
                var5_31 = "\u00e7\u00dd\u009b\u00a0}\u0017ScT$h\u009eE\u00e1\u00ce\u000e\u00ad]\u00a5\u0004&\u00bb\u008f\u00964z\u008bW-\u00a4\u00ca,v\u00df\u00a1\u00ad\u008f\u008a\u00b5\u00bd\u00ca[\u00ec\u00ee\u00e0\u0014\u00fa\u00ae".length();
                var2_32 = 0;
                while (true) {
                    var7_33 = var4_30.substring(var2_32, var2_32 += 8).getBytes("ISO-8859-1");
                    v9 = var6_28;
                    v10 = var3_29++;
                    v11 = ((long)var7_33[0] & 255L) << 56 | ((long)var7_33[1] & 255L) << 48 | ((long)var7_33[2] & 255L) << 40 | ((long)var7_33[3] & 255L) << 32 | ((long)var7_33[4] & 255L) << 24 | ((long)var7_33[5] & 255L) << 16 | ((long)var7_33[6] & 255L) << 8 | (long)var7_33[7] & 255L;
                    v12 = -1;
                    break block8;
                    break;
                }
lbl65:
                // 1 sources

                while (true) {
                    v9[v10] = v13;
                    if (var2_32 < var5_31) ** continue;
                    var4_30 = "\u0005\u0016\u00db\u0094\u008ca\u00e3\u00de\rH\u00f5\u00cc\u009cU\u0091\u00fc";
                    var5_31 = "\u0005\u0016\u00db\u0094\u008ca\u00e3\u00de\rH\u00f5\u00cc\u009cU\u0091\u00fc".length();
                    var2_32 = 0;
                    while (true) {
                        var7_33 = var4_30.substring(var2_32, var2_32 += 8).getBytes("ISO-8859-1");
                        v9 = var6_28;
                        v10 = var3_29++;
                        v11 = ((long)var7_33[0] & 255L) << 56 | ((long)var7_33[1] & 255L) << 48 | ((long)var7_33[2] & 255L) << 40 | ((long)var7_33[3] & 255L) << 32 | ((long)var7_33[4] & 255L) << 24 | ((long)var7_33[5] & 255L) << 16 | ((long)var7_33[6] & 255L) << 8 | (long)var7_33[7] & 255L;
                        v12 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v9[v10] = v13;
                    if (var2_32 < var5_31) ** continue;
                    break block9;
                    break;
                }
            }
            var8_34 = v11;
            var10_35 = var0_26.doFinal(new byte[]{(byte)(var8_34 >>> 56), (byte)(var8_34 >>> 48), (byte)(var8_34 >>> 40), (byte)(var8_34 >>> 32), (byte)(var8_34 >>> 24), (byte)(var8_34 >>> 16), (byte)(var8_34 >>> 8), (byte)var8_34});
            v13 = ((long)var10_35[0] & 255L) << 56 | ((long)var10_35[1] & 255L) << 48 | ((long)var10_35[2] & 255L) << 40 | ((long)var10_35[3] & 255L) << 32 | ((long)var10_35[4] & 255L) << 24 | ((long)var10_35[5] & 255L) << 16 | ((long)var10_35[6] & 255L) << 8 | (long)var10_35[7] & 255L;
            switch (v12) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl91:
                // 1 sources

                ** continue;
            }
        }
        _0v.f = var6_28;
        _0v.g = new Integer[8];
        _0v.cfr_renamed_3 = new _8B((int)_0v.b("d", (int)10349, (long)(434863149132981351L ^ var11)), var50_25, (int)_0v.b("d", (int)22630, (long)(7990518804085888105L ^ var11)), (int)_0v.b("d", (int)22630, (long)(7990518804085888105L ^ var11)));
        _0v.cfr_renamed_2 = new _8B((int)_0v.b("d", (int)2849, (long)(8567352360460912431L ^ var11)), (int)_0v.b("d", (int)31195, (long)(4751675941966837206L ^ var11)), var25_9, (int)_0v.b("d", (int)31195, (long)(4751675941966837206L ^ var11)), (int)_0v.b("d", (int)6740, (long)(5410340025052206684L ^ var11)));
        _0v.cfr_renamed_1 = new HashMap<K, V>();
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9r.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 1Q(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var20_5), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _92.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 1o(int short char dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((int)var22_6, (short)((short)var23_7), (char)((char)var24_8)), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9E.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 5(long int dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var27_10, (int)var29_11), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9j_0.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 1(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var18_4), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _6e_0.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 13(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var39_18), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _6X.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 1G(int short short dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((int)var34_14, (short)((short)var35_15), (short)((short)var36_16)), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9k_0.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 1t(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var37_17), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9m_0.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 0(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var30_12), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _90.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 4(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var46_23), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9t_0.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 8(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var13_1), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _96.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 6(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var32_13), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9B.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 1N(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var48_24), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _9i.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 3(long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((long)var44_22), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _94.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 2(byte long dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((byte)((byte)var15_2), (long)var16_3), (long)3955750943066701212L, (long)var11);
        _0v.d("\u00e4", (Object)_0v.d("y", (long)3955809019113041542L, (long)var11), _97.class, (Object)(_0Z)LambdaMetafactory.metafactory(null, null, null, (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;, 7(int short char dev.krypton.4t dev.krypton.95 int ), (Ldev/krypton/4t;Ldev/krypton/95;I)Ldev/krypton/0v;)((int)var41_19, (short)((short)var42_20), (char)((char)var43_21)), (long)3955750943066701212L, (long)var11);
    }

    public static _0v dev_krypton_0v_9(Object[] objectArray) {
        CallSite callSite;
        block4: {
            block3: {
                _0Z z;
                long l2;
                int n;
                _95 var3_2;
                _4t t;
                block2: {
                    t = (_4t)objectArray[0];
                    var3_2 = (_95)objectArray[1];
                    n = (Integer)objectArray[2];
                    l2 = (Long)objectArray[3];
                    l2 = b ^ l2;
                    boolean bl = _02.cfr_renamed_2();
                    _0Z z2 = (_0Z)((Object)_0v.d("\u00e4", (Object)_0v.d("y", 7256019042218130641L, (long)l2), var3_2.getClass(), 7256386047936899664L, (long)l2));
                    try {
                        z = z2;
                        if (bl) break block2;
                        if (z == null) break block3;
                    }
                    catch (MatchException matchException) {
                        throw _0v.b(matchException);
                    }
                    z = z2;
                }
                callSite = _0v.d("\u00e4", (Object)z, (Object)t, (Object)var3_2, (int)n, 7253227768095886680L, (long)l2);
                break block4;
            }
            callSite = null;
        }
        return callSite;
    }

    public void void_9(Object[] objectArray) {
        class_11909 class_119092 = (class_11909)objectArray[0];
        long l2 = (Long)objectArray[1];
    }

    public int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x26C1A12BACA5L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, -4540119882311182557L, (long)l2), -4541093998522655343L, (long)l2), (Object)objectArray2, -4546964770294431080L, (long)l2);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0v.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0v.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0v.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _0v.a(l2, l3);
            object = l[n];
            try {
                if (!(object instanceof String)) break block2;
                _0v.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _0v.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0v.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3AE5;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0v", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0v.g[n2] = n3;
        }
        return g[n2];
    }

    private static Field c(long l2, long l3) {
        int n = _0v.a(l2, l3);
        Object object = l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = _0v.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0v.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0v.a(clazz3, string2, clazz2)) != null) {
                    _0v.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0v.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0v.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0v.b(1238643362712543L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _0v.a(l2, l3);
        Object object = l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0v.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0v.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0v.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0v.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0v.b(1238643362712543L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0v.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0v.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0v.b(1238643362712543L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0v" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00db' || c == 'y' || c == '\u00ee') {
                field = _0v.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0v.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 15;
            case 1 -> 0;
            case 2 -> 19;
            case 3 -> 35;
            case 4 -> 24;
            case 5 -> 61;
            case 6 -> 41;
            case 7 -> 60;
            case 8 -> 4;
            case 9 -> 16;
            case 10 -> 6;
            case 11 -> 17;
            case 12 -> 20;
            case 13 -> 54;
            case 14 -> 40;
            case 15 -> 47;
            case 16 -> 59;
            case 17 -> 51;
            case 18 -> 11;
            case 19 -> 49;
            case 20 -> 22;
            case 21 -> 57;
            case 22 -> 62;
            case 23 -> 37;
            case 24 -> 25;
            case 25 -> 28;
            case 26 -> 63;
            case 27 -> 26;
            case 28 -> 3;
            case 29 -> 7;
            case 30 -> 58;
            case 31 -> 1;
            case 32 -> 36;
            case 33 -> 42;
            case 34 -> 33;
            case 35 -> 29;
            case 36 -> 52;
            case 37 -> 12;
            case 38 -> 18;
            case 39 -> 9;
            case 40 -> 53;
            case 41 -> 48;
            case 42 -> 32;
            case 43 -> 38;
            case 44 -> 45;
            case 45 -> 13;
            case 46 -> 44;
            case 47 -> 34;
            case 48 -> 30;
            case 49 -> 55;
            case 50 -> 23;
            case 51 -> 46;
            case 52 -> 2;
            case 53 -> 27;
            case 54 -> 50;
            case 55 -> 31;
            case 56 -> 39;
            case 57 -> 43;
            case 58 -> 14;
            case 59 -> 10;
            case 60 -> 5;
            case 61 -> 8;
            case 62 -> 21;
            default -> 56;
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
        _0v.m[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "?ms\u001aw \"xq[r|k~";
        objectArray[1] = "g;bgXWz.`&]\u000b7*";
        objectArray[2] = "i0\u007f}\u007f\u001at%}<zF5\"";
        objectArray[3] = "^$\\\\\u0015\u0019+\u0004WS\u0004VJ\n\\X\u0000\f>";
        objectArray[4] = Integer.TYPE;
        _0v.m[4] = "java/lang/Integer";
        objectArray[5] = "2Yf\u001aE&Gym\u0015Ti&wf\u001eP3R";
        objectArray[6] = "v\u000eq,F]\u0003.z#W\u0012b q(SH\u0016";
        objectArray[7] = Float.TYPE;
        _0v.m[7] = "java/lang/Float";
        objectArray[8] = "N\u0007b0)B;'i?8\rZ)b4<W.";
        objectArray[9] = ".\u0012%'\u0002<[2.(\u0013s:<%#\u0017)N";
        objectArray[10] = "L\u0017F#N;97M,_tX9F'[.,";
        objectArray[11] = ":O52:p'Z7s?,g\u001f";
        objectArray[12] = "\u0018~\u0010\u0018\u001c_m^\u001b\u0017\r\u0010\fP\u0010\u001c\tJx";
        objectArray[13] = "9A\u000b1?B$T\tp:\u001edm";
        objectArray[14] = "JH\u000e\u000e D?h\u0005\u00011\u000b^f\u000e\n5Q*";
        objectArray[15] = "L8s\r<uQ-qL9)\u0010\u001f";
        objectArray[16] = ")G\fg(_7O\u0016(JC0R";
        objectArray[17] = "_g\u0007\u0010U/Th\u0016_4!_c\u0012\u0005";
        objectArray[18] = "YC|i9\u0015,cwf(ZMm|m,\u00009";
        objectArray[19] = "6\tLO7vC)G@&9\"'LK\"cV";
        objectArray[20] = "}zb<&s\bZi37<iTb83f\u001d";
        objectArray[21] = "au\u0001?n\u0004\u0014U\n0\u007fKu[\u0001;{\u0011\u0001";
        objectArray[22] = "!ivEd\u0018TI}JuW5GvAq\rA";
        objectArray[23] = "H\u001d|;\u0014-==w4\u0005b\\3|?\u00018(";
        objectArray[24] = Void.TYPE;
        _0v.m[24] = "java/lang/Void";
        objectArray[25] = "u\u0014^g\u00152\u00004Uh\u0004}a:^c\u0000'\u0015";
        objectArray[26] = "J\u0013R\u0001\bUW\u0006P@\r\t\u0016A";
        objectArray[27] = "\u001bcJ&R#nCA)Cl\u000fMJ\"G6{";
        objectArray[28] = "q\u0007M|nyl\u0012O=k%!3";
        objectArray[29] = "e`l$\u0013*\u0010@g+\u0002eqNl \u0006?\u0005";
        objectArray[30] = Double.TYPE;
        _0v.m[30] = "java/lang/Double";
        objectArray[31] = "AwwCF}4W|LW2UYwGSh!";
        objectArray[32] = ",V1A=%Yv:N,j8x1E(0L";
        objectArray[33] = "\u001d<@;`ch\u001cK4q,\t\u0012@?uv}";
        objectArray[34] = Boolean.TYPE;
        _0v.m[34] = "java/lang/Boolean";
        objectArray[35] = "5/[+GO@\u000fP$V\u0000!\u0001[/RZU";
        objectArray[36] = "1C>\u0011>*Dc5\u001e/e%m>\u0015+?Q";
        objectArray[37] = "\u0014\u000f<DhWa/7Ky\u0018\u0000!<@}Bt";
        objectArray[38] = "3T\u000b\u0003X:Ft\u0000\fIu'z\u000b\u0007M/S";
        objectArray[39] = "6 dP\u0001\u000f+5f\u0011\u0004S`";
        objectArray[40] = "<2\u0019\u0010\u0017(!'\u001bQ\u0012ta\u001a";
        objectArray[41] = "k\u00171^\u0004\n\u001e7:Q\u0015E\u007f91Z\u0011\u001f\u000b";
        objectArray[42] = "\fQ\u001eyL\u0013\u0007^\u000f61\u000b\u0014Y\u0006\u007f";
        objectArray[43] = "{3EJW<\u000e\u0013NEFso\u001dENB)\u001b";
        objectArray[44] = ",;bc\u001c\u001c23x,\u007f\b6";
        objectArray[45] = "\u0017\u0003\u0002*aP\n\u0016\u0000kd\fC<";
        objectArray[46] = "kg#=a^woa#\u0013]\u0011~(:*\u000es4}\"~";
        objectArray[47] = "\u000bL\u000b\u001c,Z@L\u0015\u007fa6G\tX@1V\u0004\u001a\\OP\fI\u0012\u0018\u0013i\u0007FI\u0005\u007f";
        objectArray[48] = "^f\u0004\u001ci3\u0015f\u001a\u007f._\u0012#W@t?Q0SO\u0015?U9\n\u001em<\u0017`\u000f\u007f";
        objectArray[49] = "\u0010r\u001aK\u0004Z[r\u0004(E6\u001a;\u0013W\u0014\u000f\u00114HJ";
        objectArray[50] = "AM:\u0005\u000e\u0017GXa\u0006a\u0013(_|]^HH\u001coYQ)\u0012Qg\u001d\r\u0010\u0019^<\u0000a";
        objectArray[51] = "}Rx@.~yTiYQuG\u0016k\u0019n/'Ux\u001daN}\u0018pY=wv\u0017+DQ";
        objectArray[52] = "\f5{jR \u00143u<<e\u0016\fe}\u0003`\fl&n\u0007oml\"g^>\u0015o`>[_";
        objectArray[53] = "S7\u000bwCD\u0000n\u0001s>Ab/\u000fw\u0001\u001c\u0002l\u001cs\u000e}\u000b=I/QC\r(\u0012,>";
        objectArray[54] = "\u001c\r[Q3A\u001b\u0019Y\u0005\u000e\u001d~\fN\u000b1C\u001eO]\u000f>\"\u001aN\n\u000f~M\u0018\u0013]T\u000e";
        objectArray[55] = "Y)G`j-\u0012)Y\u0003+A\u0015l\u0014<w!V\u007f\u00103\u0016{\u001bwTo/p\u0014,I\u0003";
        objectArray[56] = "\u0006\u0007\u000frGJM\u0007\u0011\u0011\u0006X6\u0006\u0011tDJ\u000f\r\u001e/Y";
        objectArray[57] = "ED\u0014`~\u0018\u000eD\n\u0003=t\t\u0001G<c\u0014J\u0012C3\u0002N\u0007\u001a\u0007o;E\bA\u001a\u0003";
        objectArray[58] = "o<\u001c\u0013z\\sc\u000eu %{2\u0003\u001b%Xl&\u0005\b";
        objectArray[59] = "\bm_[\u0003J\u0007w\u001a_gX\u0018v LX\rEuDL]\\\u001b\nK\u0018]\u0007\nnK\u001d\fYu";
        objectArray[60] = "\u001f-3\u0003s$\u00198h\u0000\u001c*v?u[#{\u0016|f_,\u001aL1n\u001bp#G>5\u0006\u001c";
        objectArray[61] = "<4\u0010:bww4\u000eY \u001beaD>q%ct\u001f=";
        objectArray[62] = "dW]=S\u0007/WC^\u001ek)\u000bN\"K\u0016&\u0011\u000b&";
        objectArray[63] = "B\u0007Y1\u0003:M\u001d\u001c5g?B\u001c&&X}\u000f\u001fB&],Q`Mr]w@\u0004Mw\f)?\u000b\u0019wW8[\u000b\u001c&\tG";
        objectArray[64] = "\\;bO5q\u0017;|,t`l:|I6qU1s\u0012+";
        objectArray[65] = "\\[6\u0010Fw\u0017[(s\u0007qlZ(\u0016EwUQ'MX";
        objectArray[66] = "\u0010m\u0010\u0005Q\u0013\bk\u001eS?\\\u0017T\u000e\u0012\u0000S\u00104M\u0001\u0004\\q4I\b]\r\t7\u000bQXl";
        objectArray[67] = "A\u0012<K<\u0010\n\u0012\"(z|\rWo\u0017!\u001cNDk\u0018@F\u0003L/DyM\f\u00172(";
        objectArray[68] = "\u0000S\tVd0KS\u00175%g0\u0001\u000b\r\u007f3\u000e\u0007\u001eV|";
        objectArray[69] = "m.j\b]\b&.tk\u001c\b]*x\rE[ oi\u0004]";
        objectArray[70] = "\u000e~Yvb\u0007D+A\"\t^u3\\p6\u0004\u0015pOt9e\u0015tF-h\u001d\u00166\u001f(\t";
        objectArray[71] = "/^_&\u0012ld^AER\u0000%\u0017V:\u00029.\u0018\r'";
        objectArray[72] = "\u001el}f\u0001\u000b\u001ajl\u007f~\u0001$(n?AZDk};N;\u001e&u\u007f\u0012\u0002\u0015).b~";
        objectArray[73] = "0a^\u0013oX,>Lu:!tsG\ng\u0018\u007f|\u001c\u0017";
        objectArray[74] = "\u0014'T4^\r\u00033R'e\u0011\u0018%Z*\"\u001e~\"\b`U\u000f\u001a\"\r1\u000bpD;R%\tIO4\t8e";
        objectArray[75] = "\u001e\u0005N5\u0000;U\u0005PVLWR@\u001di\u001d7\u0011S\u0019f|7\u0015Z@7\u00044W\u0003EV";
        objectArray[76] = "Q%\u000b\u0006\u000b\u001aW0P\u0005d\u001c87M^[EXt^ZT$\u00029V\u001e\b\u001d\t6\r\u0003d";
        objectArray[77] = "BcN9=IDv\u0015:RF+q\bam\u0016K2\u001bebw\u0011\u007f\u0013!>N\u001apH<R";
        objectArray[78] = "\u0014\u0018\t$!1_\u0018\u0017Gc]X]Zx<=\u001bN^w]gVF\u001a+dlY\u001d\u0007G";
        objectArray[79] = "8\u0000NCp+$_\\%(R|X_Ckbx^NZ";
        objectArray[80] = "Q\u000b%l.#\u001a\u000b;\u000fjO\b^qh=q\u000eK*k";
        objectArray[81] = "*\u0001?\\Xha\u0001!?\u001c\u0004fDl\u0000Ed%Wh\u000f$d!^1^\\gc\u00074?";
        objectArray[82] = "\\@3\u000b+:\u0017@-hkV\u0010\u0005`W66S\u0016dXWl\u001e\u001e \u0004ng\u0011E=h";
        objectArray[83] = "loLi 9'oR\nlU:&Xa>4%=Yk";
        objectArray[84] = "!;_\u007f^hrbU{#k\u0010#[\u007f\u001c0p`H{\u0013Qy1\u001d'Lo\u007f$F$#";
        objectArray[85] = "T\u007fx6s\u0011Rj#5\u001c\u0014=m>n#N].-j,/\u0007c%.p\u0016\fl~3\u001c";
        objectArray[86] = "Zq\u001f\u001c%6Md\\NNj$t\u0002Q(4]h]CNoZl\u0006\u00123*Ke\u001e-t\"Au\u000e\u0014\u007f-\u001ahb\u001du<Gv\u000eVu\"$";
        objectArray[87] = "\fE%@\u001e@\bC4YaJY}.T\u0019\u001bT\u001c1O\u0018\u0011";
        objectArray[88] = "e@+R\f@aF:KsI_\u00048\u000bL\u0011?G+\u000fCpe\n#K\u001fIn\u0005xVs";
        objectArray[89] = "g\u000e)vW\u001c{\u0006kh%\u001e^lih\u001f[oWu`]E";
        objectArray[90] = "\u0011n\u001cel\nZn\u0002\u0006/f\u001ciKa}\u001dCo\u0015e";
        objectArray[91] = "Rc\\C|V\u0017rU[C\u0012maD\u0018|J\r\"W\u001cs+\u0011 W\u0017|DQ#X[C";
        objectArray[92] = "\u001cy\u007fWh4Wya4)XP<,\u000bu8\u0013/(\u0004\u0014>^:xVu!E;r4";
        objectArray[93] = "\u001b\u000e3(P[P\u000e-K\u00177UU#-HNI\n1";
        Object[] objectArray2 = objectArray;
        objectArray[94] = "\r\u001e\u0019k;\u0012\t\u0018\brD\u001f7Z\n2{CW\u0019\u00196t\"\rT\u0011r(\u001b\u0006[JoD";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _0v.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static _0v cfr_renamed_47(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0xA500C179058L;
        return new _08(l3, t, var3_2, n);
    }

    private static _0v cfr_renamed_4(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x2CB8AA398B7FL;
        return new _0q_0(t, var3_2, l3, n);
    }

    public void void_0(Object[] objectArray) {
        block8: {
            CallSite callSite;
            long l2;
            long l3;
            long l4;
            int n;
            int n2;
            block7: {
                n2 = (Integer)objectArray[0];
                n = (Integer)objectArray[1];
                l4 = (Long)objectArray[2];
                long l5 = l4 = b ^ l4;
                l3 = l5 ^ 0x4E8958671344L;
                long l6 = l5 ^ 0x1B029C0A8548L;
                l2 = l5 ^ 0x7B16D50B2578L;
                boolean bl = _02.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[3];
                        objectArray2[2] = l6;
                        objectArray2[1] = (double)n;
                        objectArray2[0] = (double)n2;
                        callSite = _0v.d("\u00e4", (Object)this, (Object)objectArray2, 7797543335632926281L, (long)l4);
                        if (!bl) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _0v.b(matchException);
                    }
                    callSite = _0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, 7797464658981157867L, (long)l4), 7796472985950007641L, (long)l4), 7797067233869113398L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _0v.b(matchException);
                }
            }
            try {
                if (callSite == false) {
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l2;
                    Object[] objectArray4 = new Object[4];
                    objectArray4[3] = n + _0v.b("d", 6740, (long)(0x4B15465F43EBCC97L ^ l4));
                    objectArray4[2] = n2 + _0v.b("d", 7963, (long)(0x4CCAE2561858C9DBL ^ l4));
                    objectArray4[1] = l3;
                    objectArray4[0] = _0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)this, 7795765100078528844L, (long)l4), (Object)objectArray3, 7797862831814427657L, (long)l4);
                    _0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)_0v.d("y", 7797740029507737675L, (long)l4), 7794319931591163479L, (long)l4), (Object)objectArray4, 7795982197645916598L, (long)l4);
                }
            }
            catch (MatchException matchException) {
                throw _0v.b(matchException);
            }
        }
    }

    private static _0v cfr_renamed_2(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x69B5077AA69CL;
        return new _0D(t, var3_2, l3, n);
    }

    public void void_6(Object[] objectArray) {
        class_11909 class_119092 = (class_11909)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l2 = (Long)objectArray[2];
    }

    public int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x5A830CCE4A20L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, -5384228517616278886L, (long)l2), -5385202737988933592L, (long)l2), (Object)objectArray2, -5385673425864430432L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void void_2(Object[] var1_1) {
        block32: {
            block31: {
                block29: {
                    block30: {
                        block27: {
                            block24: {
                                block25: {
                                    block26: {
                                        block23: {
                                            block21: {
                                                var2_2 = (Long)var1_1[0];
                                                v0 = var2_2;
                                                var4_3 = v0 ^ 58466245822005L;
                                                var6_4 = v0 ^ 9521558701857L;
                                                var8_5 = v0 ^ 12677808876132L;
                                                var10_6 = v0 ^ 46428458203233L;
                                                var12_7 = v0 ^ 139741477326699L;
                                                var14_8 = v0 ^ 91252952789830L;
                                                var16_9 = v0 ^ 123195338085802L;
                                                var18_10 = _02.cfr_renamed_3();
                                                try {
                                                    block22: {
                                                        try {
                                                            try {
                                                                v1 = this;
                                                                if (var18_10 == 0) break block21;
                                                                if (_0v.d("\u00ed", (Object)v1, (long)-8277212366139032200L, (long)var2_2) != null) break block22;
                                                            }
                                                            catch (MatchException v2) {
                                                                throw _0v.b(v2);
                                                            }
                                                            _0v.d("\u00db", (Object)this, (_8B)new _8B(0, 0, var12_7, 0, 0), (long)-8277212366139032200L, (long)var2_2);
                                                            v3 /* !! */  = var18_10;
                                                            if (var2_2 > 0L) {
                                                                if (v3 /* !! */  != 0) break block23;
                                                            }
                                                            ** GOTO lbl47
                                                        }
                                                        catch (MatchException v4) {
                                                            throw _0v.b(v4);
                                                        }
                                                    }
                                                    v1 = this;
                                                }
                                                catch (MatchException v5) {
                                                    throw _0v.b(v5);
                                                }
                                            }
                                            v6 = new Object[1];
                                            v6[0] = var16_9;
                                            _0v.d("\u00db", (Object)v1, (_8B)new _8B(0, 0, var12_7, 0, (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)this, (long)-8277212366139032200L, (long)var2_2), (Object)v6, (long)-8275850626379632498L, (long)var2_2)), (long)-8277212366139032200L, (long)var2_2);
                                        }
                                        try {
                                            try {
                                                v7 = new Object[1];
                                                v7[0] = var16_9;
                                                v3 /* !! */  = (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)this, (long)-8277212366139032200L, (long)var2_2), (Object)v7, (long)-8275850626379632498L, (long)var2_2);
lbl47:
                                                // 2 sources

                                                v8 /* !! */  = 31365;
                                                v9 = 5600201903724547414L ^ var2_2;
                                                if (var2_2 <= 0L) break block24;
                                                v8 /* !! */  = (int)_0v.b("d", (int)v8 /* !! */ , (long)v9);
                                                if (var18_10 == 0) break block25;
                                                if (v3 /* !! */  == v8 /* !! */ ) break block26;
                                            }
                                            catch (MatchException v10) {
                                                throw _0v.b(v10);
                                            }
                                            v11 = new Object[4];
                                            v11[3] = _0v.d("\u00ed", (Object)this, (long)-8277212366139032200L, (long)var2_2);
                                            v11[2] = (int)_0v.b("d", (int)15436, (long)(5988156714428631962L ^ var2_2));
                                            v11[1] = Float.valueOf(0.05f);
                                            v11[0] = var4_3;
                                            _0v.d("\u00db", (Object)this, (_8B)_0v.d("\u00ea", (Object)v11, (long)-8277496564165962262L, (long)var2_2), (long)-8277212366139032200L, (long)var2_2);
                                        }
                                        catch (MatchException v12) {
                                            throw _0v.b(v12);
                                        }
                                    }
                                    v3 /* !! */  = (int)_0v.b("d", (int)31195, (long)(4751675976420445705L ^ var2_2));
                                    v8 /* !! */  = (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, (long)-8277038621228328193L, (long)var2_2), (long)-8269802636859576990L, (long)var2_2), (Object)this, (long)-8275411484380684903L, (long)var2_2);
                                }
                                v9 = var8_5;
                            }
                            v13 = new Object[3];
                            v13[2] = v8 /* !! */ ;
                            v13[1] = v3 /* !! */ ;
                            v13[0] = v9;
                            var19_11 = _0v.d("\u00ea", (Object)v13, (long)-8270834092053503825L, (long)var2_2);
                            try {
                                block28: {
                                    try {
                                        try {
                                            v14 = this;
                                            if (var18_10 == 0) break block27;
                                            if (_0v.d("\u00ed", (Object)v14, (long)-8276404376097481518L, (long)var2_2) != null) break block28;
                                        }
                                        catch (MatchException v15) {
                                            throw _0v.b(v15);
                                        }
                                        v16 = new Object[1];
                                        v16[0] = var14_8;
                                        v17 = new Object[1];
                                        v17[0] = var6_4;
                                        v18 = new Object[1];
                                        v18[0] = var10_6;
                                        _0v.d("\u00db", (Object)this, (_8B)new _8B((int)_0v.d("\u00e4", (Object)var19_11, (Object)v16, (long)-8270178555270266835L, (long)var2_2), (int)_0v.d("\u00e4", (Object)var19_11, (Object)v17, (long)-8275919865856342129L, (long)var2_2), var12_7, (int)_0v.d("\u00e4", (Object)var19_11, (Object)v18, (long)-8270321422943352078L, (long)var2_2), 0), (long)-8276404376097481518L, (long)var2_2);
                                        v19 /* !! */  = var18_10;
                                        if (var2_2 <= 0L) break block29;
                                        if (v19 /* !! */  != 0) break block30;
                                    }
                                    catch (MatchException v20) {
                                        throw _0v.b(v20);
                                    }
                                }
                                v14 = this;
                            }
                            catch (MatchException v21) {
                                throw _0v.b(v21);
                            }
                        }
                        v22 = new Object[1];
                        v22[0] = var14_8;
                        v23 = new Object[1];
                        v23[0] = var6_4;
                        v24 = new Object[1];
                        v24[0] = var10_6;
                        v25 = new Object[1];
                        v25[0] = var16_9;
                        _0v.d("\u00db", (Object)v14, (_8B)new _8B((int)_0v.d("\u00e4", (Object)var19_11, (Object)v22, (long)-8270178555270266835L, (long)var2_2), (int)_0v.d("\u00e4", (Object)var19_11, (Object)v23, (long)-8275919865856342129L, (long)var2_2), var12_7, (int)_0v.d("\u00e4", (Object)var19_11, (Object)v24, (long)-8270321422943352078L, (long)var2_2), (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)this, (long)-8276404376097481518L, (long)var2_2), (Object)v25, (long)-8275850626379632498L, (long)var2_2)), (long)-8276404376097481518L, (long)var2_2);
                    }
                    v19 /* !! */  = (int)_0v.b("d", (int)31195, (long)(4751675976420445705L ^ var2_2));
                }
                var20_12 = v19 /* !! */ ;
                try {
                    try {
                        v26 = this;
                        if (var18_10 == 0) break block31;
                        v27 = new Object[1];
                        v27[0] = var16_9;
                        if (_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)v26, (long)-8276404376097481518L, (long)var2_2), (Object)v27, (long)-8275850626379632498L, (long)var2_2) == var20_12) break block32;
                    }
                    catch (MatchException v28) {
                        throw _0v.b(v28);
                    }
                    v26 = this;
                }
                catch (MatchException v29) {
                    throw _0v.b(v29);
                }
            }
            v30 = new Object[4];
            v30[3] = _0v.d("\u00ed", (Object)this, (long)-8276404376097481518L, (long)var2_2);
            v30[2] = var20_12;
            v30[1] = Float.valueOf(0.05f);
            v30[0] = var4_3;
            _0v.d("\u00db", (Object)v26, (_8B)_0v.d("\u00ea", (Object)v30, (long)-8277496564165962262L, (long)var2_2), (long)-8276404376097481518L, (long)var2_2);
        }
    }

    private static _0v cfr_renamed_3(byte by, long l2, _4t t, _95 var4_3, int n) {
        long l3 = ((long)by << 56 | l2 << 8 >>> 8) ^ b;
        long l4 = l3 ^ 0x195CB05138ACL;
        return new _0w(t, l4, var4_3, n);
    }

    public int int_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        return (int)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, -8792019050773343711L, (long)l2), -8792900969485186514L, (long)l2);
    }

    private static _0v cfr_renamed_6(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x29EC1F3F3631L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 48);
        int n4 = (int)(l3 << 32 >>> 32);
        return new _0z_0(t, (char)n2, (short)n3, var3_2, n, n4);
    }

    private void cfr_renamed_6(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        double d2 = (Double)objectArray[2];
        long l3 = (l2 = b ^ l2) ^ 0x58E492EFB9B0L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = d2;
        objectArray2[0] = d;
        _0v.d("\u00db", (Object)this, (boolean)_0v.d("\u00e4", (Object)this, (Object)objectArray2, 5822648267157555889L, (long)l2), 5822548586036503595L, (long)l2);
    }

    public void void_4(Object[] objectArray) {
        class_11908 class_119082 = (class_11908)objectArray[0];
        long l2 = (Long)objectArray[1];
    }

    protected int int_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x3A221FD85F01L;
        long l5 = l3 ^ 0x5AACFBC6DE6EL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        return (int)(_0v.d("\u00e4", (Object)this, (Object)objectArray2, -908229052608447512L, (long)l2) + _0v.d("\u00e4", (Object)this, (Object)objectArray3, -901908091778366224L, (long)l2) + _0v.d("\u00ed", (Object)this, -902177166303394693L, (long)l2));
    }

    private static _0v cfr_renamed_7(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x2D9B10C3DAC9L;
        return new _0Q(l3, t, var3_2, n);
    }

    private static _0v cfr_renamed_8(long l2, int n, _4t t, _95 var4_3, int n2) {
        long l3 = (l2 << 32 | (long)n << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x15637700CCC6L;
        return new _0y(t, var4_3, l4, n2);
    }

    public int int_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x7BE31B1C604CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, 1397846435174122683L, (long)l2), 1396872322116800009L, (long)l2), (Object)objectArray2, 1398080445849960263L, (long)l2);
    }

    public void void_5(Object[] objectArray) {
        block23: {
            _0v v;
            long l2;
            float f;
            int n;
            long l3;
            int n2;
            _87 var5_2;
            block21: {
                block22: {
                    float f2;
                    float f3;
                    boolean bl;
                    long l4;
                    long l5;
                    long l6;
                    long l7;
                    long l8;
                    long l9;
                    long l10;
                    block20: {
                        block19: {
                            CallSite callSite;
                            block18: {
                                Object object;
                                double d;
                                double d2;
                                double d3;
                                double d4;
                                _87 v9;
                                long l11;
                                long l12;
                                block24: {
                                    block17: {
                                        CallSite callSite2;
                                        long l13;
                                        block16: {
                                            var5_2 = (_87)objectArray[0];
                                            n2 = (Integer)objectArray[1];
                                            l3 = (Long)objectArray[2];
                                            n = (Integer)objectArray[3];
                                            f = ((Float)objectArray[4]).floatValue();
                                            long l14 = l3 = b ^ l3;
                                            l13 = l14 ^ 0x754E67F8A1E9L;
                                            l10 = l14 ^ 0x24D2BFA54C90L;
                                            l2 = l14 ^ 0x7C2FB3EB92A4L;
                                            l9 = l14 ^ 0x71F3517ABB9AL;
                                            l8 = l14 ^ 0x3B8E1A66BE1CL;
                                            l12 = l14 ^ 0x744FEAF7950DL;
                                            l7 = l14 ^ 0x6830533004FFL;
                                            long l15 = l14 ^ 0x243F8D1201F3L;
                                            long l16 = l14 ^ 0xE1761EB91C3L;
                                            l6 = l14 ^ 0x7EE0EE3A215BL;
                                            long l17 = l14 ^ 0x203C92EEA241L;
                                            l5 = l14 ^ 0x643A178B3D0L;
                                            long l18 = l14 ^ 0x67D983F73D0BL;
                                            long l19 = l14 ^ 0x2FA24138E47AL;
                                            l11 = l14 ^ 0x3018FA2910ADL;
                                            long l20 = l14 ^ 0x6AFFD3D5425BL;
                                            l4 = l14 ^ 0x5C1533B287B7L;
                                            Object[] objectArray2 = new Object[3];
                                            objectArray2[2] = (double)n;
                                            objectArray2[1] = l15;
                                            objectArray2[0] = (double)n2;
                                            _0v.d("\u00e4", (Object)this, (Object)objectArray2, -448017065049859388L, (long)l3);
                                            Object[] objectArray3 = new Object[3];
                                            objectArray3[2] = l18;
                                            objectArray3[1] = n;
                                            objectArray3[0] = n2;
                                            _0v.d("\u00e4", (Object)this, (Object)objectArray3, -445792527639548341L, (long)l3);
                                            boolean bl2 = _02.cfr_renamed_2();
                                            Object[] objectArray4 = new Object[1];
                                            objectArray4[0] = l19;
                                            _0v.d("\u00db", (Object)this, (int)_0v.d("\u00e4", (Object)this, (Object)objectArray4, -443635140993317825L, (long)l3), -444675111261925495L, (long)l3);
                                            Object[] objectArray5 = new Object[1];
                                            objectArray5[0] = l17;
                                            _0v.d("\u00db", (Object)this, (int)_0v.d("\u00e4", (Object)this, (Object)objectArray5, -445613222910702546L, (long)l3), -447415695243097959L, (long)l3);
                                            bl = bl2;
                                            try {
                                                try {
                                                    Object[] objectArray6 = new Object[1];
                                                    objectArray6[0] = l19;
                                                    Object[] objectArray7 = new Object[1];
                                                    objectArray7[0] = l20;
                                                    _0v.d("\u00db", (Object)this, (int)(_0v.d("\u00e4", (Object)this, (Object)objectArray6, -443635140993317825L, (long)l3) + _0v.d("\u00e4", (Object)this, (Object)objectArray7, -447644170007433833L, (long)l3)), -444622756684670369L, (long)l3);
                                                    Object[] objectArray8 = new Object[1];
                                                    objectArray8[0] = l16;
                                                    _0v.d("\u00db", (Object)this, (int)(_0v.d("\u00ed", (Object)this, -447415695243097959L, (long)l3) + _0v.d("\u00e4", (Object)this, (Object)objectArray8, -445996048842207727L, (long)l3)), -448075546274976461L, (long)l3);
                                                    v9 = var5_2;
                                                    d4 = (double)_0v.d("\u00ed", (Object)this, -444675111261925495L, (long)l3);
                                                    d3 = (double)_0v.d("\u00ed", (Object)this, -447415695243097959L, (long)l3);
                                                    d2 = (double)_0v.d("\u00ed", (Object)this, -444622756684670369L, (long)l3);
                                                    d = (double)_0v.d("\u00ed", (Object)this, -448075546274976461L, (long)l3);
                                                    callSite2 = _0v.d("\u00ed", (Object)this, -445748755226392183L, (long)l3);
                                                    if (bl) break block16;
                                                    if (callSite2 == null) break block17;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _0v.b(matchException);
                                                }
                                                callSite2 = _0v.d("\u00ed", (Object)this, -445748755226392183L, (long)l3);
                                            }
                                            catch (MatchException matchException) {
                                                throw _0v.b(matchException);
                                            }
                                        }
                                        Object[] objectArray9 = new Object[1];
                                        objectArray9[0] = l13;
                                        object = _0v.d("\u00e4", (Object)callSite2, (Object)objectArray9, -445559626802865634L, (long)l3);
                                        break block24;
                                    }
                                    object = 0;
                                }
                                Object[] objectArray10 = new Object[6];
                                objectArray10[5] = object;
                                objectArray10[4] = l12;
                                objectArray10[3] = d;
                                objectArray10[2] = d2;
                                objectArray10[1] = d3;
                                objectArray10[0] = d4;
                                _0v.d("\u00e4", (Object)v9, (Object)objectArray10, -444494395405723223L, (long)l3);
                                f3 = f * 0.05f;
                                try {
                                    try {
                                        Object[] objectArray11 = new Object[3];
                                        objectArray11[2] = l11;
                                        objectArray11[1] = (double)n;
                                        objectArray11[0] = (double)n2;
                                        callSite = _0v.d("\u00e4", (Object)this, (Object)objectArray11, -444911592052694100L, (long)l3);
                                        if (l3 <= 0L || bl) break block18;
                                        if (callSite == false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0v.b(matchException);
                                    }
                                    callSite = _0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, -445007741776794098L, (long)l3), -443734555139431236L, (long)l3), -445411830593438253L, (long)l3);
                                }
                                catch (MatchException matchException) {
                                    throw _0v.b(matchException);
                                }
                            }
                            try {
                                if (callSite != false) break block19;
                                f2 = 1.0f;
                                break block20;
                            }
                            catch (MatchException matchException) {
                                throw _0v.b(matchException);
                            }
                        }
                        f2 = 0.0f;
                    }
                    float f4 = f2;
                    try {
                        try {
                            try {
                                Object[] objectArray12 = new Object[5];
                                objectArray12[4] = (double)f3;
                                objectArray12[3] = l7;
                                objectArray12[2] = 0.25;
                                objectArray12[1] = (double)f4;
                                objectArray12[0] = (double)_0v.d("\u00ed", (Object)this, -445048174519948354L, (long)l3);
                                _0v.d("\u00db", (Object)this, (float)((float)_0v.d("\u00ea", (Object)objectArray12, -447592089963020681L, (long)l3)), -445048174519948354L, (long)l3);
                                v = this;
                                if (bl) break block21;
                                if (_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)v, -445007741776794098L, (long)l3), -443734555139431236L, (long)l3), -445411830593438253L, (long)l3) != false) break block22;
                            }
                            catch (MatchException matchException) {
                                throw _0v.b(matchException);
                            }
                            if (l3 <= 0L) break block23;
                            v = this;
                            if (bl) break block21;
                        }
                        catch (MatchException matchException) {
                            throw _0v.b(matchException);
                        }
                        if (!(_0v.d("\u00ed", (Object)v, -445048174519948354L, (long)l3) > 0.001f)) break block22;
                    }
                    catch (MatchException matchException) {
                        throw _0v.b(matchException);
                    }
                    Object[] objectArray13 = new Object[1];
                    objectArray13[0] = l4;
                    Object[] objectArray14 = new Object[1];
                    objectArray14[0] = l5;
                    Object[] objectArray15 = new Object[1];
                    objectArray15[0] = l10;
                    Object[] objectArray16 = new Object[1];
                    objectArray16[0] = l6;
                    _8B b = new _8B((int)_0v.d("\u00e4", (Object)_0v.d("y", -447217217039143320L, (long)l3), (Object)objectArray13, -447155433674148644L, (long)l3), (int)_0v.d("\u00e4", (Object)_0v.d("y", -447217217039143320L, (long)l3), (Object)objectArray14, -443876892031863938L, (long)l3), l9, (int)_0v.d("\u00e4", (Object)_0v.d("y", -447217217039143320L, (long)l3), (Object)objectArray15, -447856853258338813L, (long)l3), (int)((float)_0v.d("\u00e4", (Object)_0v.d("y", -447217217039143320L, (long)l3), (Object)objectArray16, -443803194123500417L, (long)l3) * _0v.d("\u00ed", (Object)this, -445048174519948354L, (long)l3)));
                    Object[] objectArray17 = new Object[6];
                    objectArray17[5] = b;
                    objectArray17[4] = (double)_0v.d("\u00ed", (Object)this, -448075546274976461L, (long)l3);
                    objectArray17[3] = (double)_0v.d("\u00ed", (Object)this, -444622756684670369L, (long)l3);
                    objectArray17[2] = (double)_0v.d("\u00ed", (Object)this, -447415695243097959L, (long)l3);
                    objectArray17[1] = l8;
                    objectArray17[0] = (double)_0v.d("\u00ed", (Object)this, -444675111261925495L, (long)l3);
                    _0v.d("\u00e4", (Object)var5_2, (Object)objectArray17, -447735603131918524L, (long)l3);
                }
                v = this;
            }
            Object[] objectArray18 = new Object[5];
            objectArray18[4] = Float.valueOf(f);
            objectArray18[3] = l2;
            objectArray18[2] = n;
            objectArray18[1] = n2;
            objectArray18[0] = var5_2;
            _0v.d("\u00e4", (Object)v, (Object)objectArray18, -444008758191854891L, (long)l3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean boolean_5(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var2_2 = (Double)var1_1[0];
                            var4_3 = (Double)var1_1[1];
                            var6_4 = (Long)var1_1[2];
                            v0 = var6_4 = _0v.b ^ var6_4;
                            var8_5 = v0 ^ 46207256751597L;
                            var10_6 = v0 ^ 91780746140729L;
                            var12_7 = v0 ^ 24347299871256L;
                            var14_8 = v0 ^ 126222614276480L;
                            var16_9 = v0 ^ 81950442351746L;
                            var18_10 = _02.cfr_renamed_2();
                            try {
                                try {
                                    v1 = new Object[1];
                                    v1[0] = var10_6;
                                    cfr_temp_0 = var2_2 - (double)_0v.d("\u00e4", (Object)this, (Object)v1, (long)4725570046465358972L, (long)var6_4);
                                    v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var18_10) break block16;
                                    if (v2 <= 0) break block17;
                                }
                                catch (MatchException v3) {
                                    throw _0v.b(v3);
                                }
                                v4 = new Object[1];
                                v4[0] = var10_6;
                                v5 = new Object[1];
                                v5[0] = var12_7;
                                cfr_temp_1 = var2_2 - (double)(_0v.d("\u00e4", (Object)this, (Object)v4, (long)4725570046465358972L, (long)var6_4) + _0v.d("\u00e4", (Object)this, (Object)v5, (long)4722825911568897492L, (long)var6_4));
                                v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v6) {
                                throw _0v.b(v6);
                            }
                        }
                        try {
                            try {
                                v7 = var18_10;
                                if (var6_4 >= 0L) {
                                    if (v7) break block18;
                                    if (v2 >= 0) break block17;
                                }
                                ** GOTO lbl62
                            }
                            catch (MatchException v8) {
                                throw _0v.b(v8);
                            }
                            v9 = new Object[1];
                            v9[0] = var16_9;
                            v10 = new Object[1];
                            v10[0] = var8_5;
                            cfr_temp_2 = var4_3 - (double)(_0v.d("\u00ed", (Object)this, (long)4726178721613166231L, (long)var6_4) + _0v.d("\u00e4", (Object)this, (Object)v9, (long)4726483253224519196L, (long)var6_4) + _0v.d("\u00e4", (Object)this, (Object)v10, (long)4722378636178671876L, (long)var6_4));
                            v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v11) {
                            throw _0v.b(v11);
                        }
                    }
                    try {
                        try {
                            v7 = var18_10;
lbl62:
                            // 2 sources

                            if (var6_4 > 0L) {
                                if (v7) break block19;
                                if (v2 <= 0) break block17;
                            }
                            ** GOTO lbl86
                        }
                        catch (MatchException v12) {
                            throw _0v.b(v12);
                        }
                        v13 = new Object[1];
                        v13[0] = var16_9;
                        v14 = new Object[1];
                        v14[0] = var8_5;
                        v15 = new Object[1];
                        v15[0] = var14_8;
                        cfr_temp_3 = var4_3 - (double)(_0v.d("\u00ed", (Object)this, (long)4726178721613166231L, (long)var6_4) + _0v.d("\u00e4", (Object)this, (Object)v13, (long)4726483253224519196L, (long)var6_4) + _0v.d("\u00e4", (Object)this, (Object)v14, (long)4722378636178671876L, (long)var6_4) + _0v.d("\u00e4", (Object)this, (Object)v15, (long)4723427392267613778L, (long)var6_4));
                        v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v16) {
                        throw _0v.b(v16);
                    }
                }
                try {
                    v7 = var18_10;
lbl86:
                    // 2 sources

                    if (v7) break block20;
                    if (v2 >= 0) break block17;
                }
                catch (MatchException v17) {
                    throw _0v.b(v17);
                }
                v2 = (double)true;
                break block20;
            }
            v2 = (double)false;
        }
        return (boolean)v2;
    }

    private static _0v cfr_renamed_9(int n, short s, char c, _4t t, _95 var4_4, int n2) {
        long l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        long l3 = l2 ^ 0x244C92060D45L;
        return new _0c(t, l3, var4_4, n2);
    }

    public int int_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x21961C821C3CL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return (int)_0v.d("\u00e4", (Object)_0v.d("\u00ed", (Object)_0v.d("\u00ed", (Object)this, 329635576727638862L, (long)l2), 330895668177525244L, (long)l2), (Object)objectArray2, 329420298026891644L, (long)l2);
    }

    public void void_7(Object[] objectArray) {
        class_11909 class_119092 = (class_11909)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
    }

    protected abstract void void_8(Object[] var1);

    private static _0v cfr_renamed_0(long l2, _4t t, _95 var3_2, int n) {
        long l3 = (l2 = b ^ l2) ^ 0x58DB0FEF1941L;
        return new _0O(t, var3_2, l3, n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0v.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0v.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

