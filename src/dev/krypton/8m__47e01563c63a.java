/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.TextureFormat
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  java.lang.MatchException
 *  org.lwjgl.stb.STBTTPackRange
 *  org.lwjgl.stb.STBTTPackedchar
 *  org.lwjgl.stb.STBTTPackedchar$Buffer
 */
package dev.krypton;

import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import dev.krypton._0B;
import dev.krypton._0j;
import dev.krypton._4w;
import dev.krypton._6N;
import dev.krypton._8B;
import dev.krypton._9J;
import dev.krypton.l;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.stb.STBTTPackRange;
import org.lwjgl.stb.STBTTPackedchar;

public class _8m {
    private static final int cfr_renamed_4;
    public final _0B cfr_renamed_5;
    private final int cfr_renamed_6;
    private final float cfr_renamed_0;
    private final float cfr_renamed_1;
    private final Int2ObjectOpenHashMap cfr_renamed_8;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public double cfr_renamed_5(Object[] objectArray) {
        _6N n = (_6N)objectArray[0];
        String string = (String)objectArray[1];
        double d = (Double)objectArray[2];
        double d2 = (Double)objectArray[3];
        _8B b = (_8B)objectArray[4];
        long l2 = (Long)objectArray[5];
        double d3 = (Double)objectArray[6];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x69DAA537DF2AL;
        long l5 = l3 ^ 0x2B0DC34DB0AFL;
        long l6 = l3 ^ 0x4166A497360FL;
        long l7 = l3 ^ 0x188302F139A9L;
        long l8 = l3 ^ 0x4FBC45B8196FL;
        d2 += (double)(_8m.b("\u00d5", (Object)this, 1149721167215094872L, (long)l2) * _8m.b("\u00d5", (Object)this, 1149642355299911443L, (long)l2)) * d3;
        CallSite callSite = _8m.b("\u00a4", string, 1148075964138907445L, (long)l2);
        _4w[] wArray = _0j.cfr_renamed_1();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l6;
        objectArray2[1] = (int)(callSite * _8m.a("m", 21257, (long)(0x27ABD82BE6DF7758L ^ l2)));
        objectArray2[0] = (int)(callSite * 4);
        _8m.b("\u00a4", (Object)n, (Object)objectArray2, 1147937649807716549L, (long)l2);
        int n2 = 0;
        while (n2 < callSite) {
            _4w[] wArray2;
            block3: {
                block4: {
                    _9J j;
                    block5: {
                        CallSite callSite2 = _8m.b("\u00a4", string, (int)n2, 1148595077723362730L, (long)l2);
                        j = (_9J)((Object)_8m.b("\u00a4", (Object)_8m.b("\u00d5", (Object)this, 1148422920658490618L, (long)l2), (int)callSite2, 1148280565164795023L, (long)l2));
                        try {
                            wArray2 = wArray;
                            if (l2 <= 0L) break block3;
                            if (wArray2 == null) break block4;
                            if (j != null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw _8m.a(matchException);
                        }
                        j = (_9J)((Object)_8m.b("\u00a4", (Object)_8m.b("\u00d5", (Object)this, 1148422920658490618L, (long)l2), (int)_8m.a("m", 30855, (long)(0x55FB09265AA1DCD7L ^ l2)), 1148280565164795023L, (long)l2));
                    }
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = d2 + (double)_8m.b("\u00d5", (Object)j, 1147040704347965507L, (long)l2) * d3;
                    objectArray3[1] = d + (double)_8m.b("\u00d5", (Object)j, 1149223664623369506L, (long)l2) * d3;
                    objectArray3[0] = l4;
                    Object[] objectArray4 = new Object[3];
                    objectArray4[2] = (double)_8m.b("\u00d5", (Object)j, 1149953691301483260L, (long)l2);
                    objectArray4[1] = (double)_8m.b("\u00d5", (Object)j, 1147206311596203052L, (long)l2);
                    objectArray4[0] = l4;
                    Object[] objectArray5 = new Object[2];
                    objectArray5[1] = b;
                    objectArray5[0] = l7;
                    Object[] objectArray6 = new Object[1];
                    objectArray6[0] = l8;
                    Object[] objectArray7 = new Object[3];
                    objectArray7[2] = d2 + (double)_8m.b("\u00d5", (Object)j, 1147647654251944761L, (long)l2) * d3;
                    objectArray7[1] = d + (double)_8m.b("\u00d5", (Object)j, 1149223664623369506L, (long)l2) * d3;
                    objectArray7[0] = l4;
                    Object[] objectArray8 = new Object[3];
                    objectArray8[2] = (double)_8m.b("\u00d5", (Object)j, 1147820875039647293L, (long)l2);
                    objectArray8[1] = (double)_8m.b("\u00d5", (Object)j, 1147206311596203052L, (long)l2);
                    objectArray8[0] = l4;
                    Object[] objectArray9 = new Object[2];
                    objectArray9[1] = b;
                    objectArray9[0] = l7;
                    Object[] objectArray10 = new Object[1];
                    objectArray10[0] = l8;
                    Object[] objectArray11 = new Object[3];
                    objectArray11[2] = d2 + (double)_8m.b("\u00d5", (Object)j, 1147647654251944761L, (long)l2) * d3;
                    objectArray11[1] = d + (double)_8m.b("\u00d5", (Object)j, 1149031647519441159L, (long)l2) * d3;
                    objectArray11[0] = l4;
                    Object[] objectArray12 = new Object[3];
                    objectArray12[2] = (double)_8m.b("\u00d5", (Object)j, 1147820875039647293L, (long)l2);
                    objectArray12[1] = (double)_8m.b("\u00d5", (Object)j, 1148631723656578450L, (long)l2);
                    objectArray12[0] = l4;
                    Object[] objectArray13 = new Object[2];
                    objectArray13[1] = b;
                    objectArray13[0] = l7;
                    Object[] objectArray14 = new Object[1];
                    objectArray14[0] = l8;
                    Object[] objectArray15 = new Object[3];
                    objectArray15[2] = d2 + (double)_8m.b("\u00d5", (Object)j, 1147040704347965507L, (long)l2) * d3;
                    objectArray15[1] = d + (double)_8m.b("\u00d5", (Object)j, 1149031647519441159L, (long)l2) * d3;
                    objectArray15[0] = l4;
                    Object[] objectArray16 = new Object[3];
                    objectArray16[2] = (double)_8m.b("\u00d5", (Object)j, 1149953691301483260L, (long)l2);
                    objectArray16[1] = (double)_8m.b("\u00d5", (Object)j, 1148631723656578450L, (long)l2);
                    objectArray16[0] = l4;
                    Object[] objectArray17 = new Object[2];
                    objectArray17[1] = b;
                    objectArray17[0] = l7;
                    Object[] objectArray18 = new Object[1];
                    objectArray18[0] = l8;
                    Object[] objectArray19 = new Object[5];
                    objectArray19[4] = (int)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)n, (Object)objectArray15, 1150627949522196504L, (long)l2), (Object)objectArray16, 1150627949522196504L, (long)l2), (Object)objectArray17, 1149787132427003866L, (long)l2), (Object)objectArray18, 1146252293405679450L, (long)l2);
                    objectArray19[3] = (int)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)n, (Object)objectArray11, 1150627949522196504L, (long)l2), (Object)objectArray12, 1150627949522196504L, (long)l2), (Object)objectArray13, 1149787132427003866L, (long)l2), (Object)objectArray14, 1146252293405679450L, (long)l2);
                    objectArray19[2] = (int)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)n, (Object)objectArray7, 1150627949522196504L, (long)l2), (Object)objectArray8, 1150627949522196504L, (long)l2), (Object)objectArray9, 1149787132427003866L, (long)l2), (Object)objectArray10, 1146252293405679450L, (long)l2);
                    objectArray19[1] = (int)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)_8m.b("\u00a4", (Object)n, (Object)objectArray3, 1150627949522196504L, (long)l2), (Object)objectArray4, 1150627949522196504L, (long)l2), (Object)objectArray5, 1149787132427003866L, (long)l2), (Object)objectArray6, 1146252293405679450L, (long)l2);
                    objectArray19[0] = l5;
                    _8m.b("\u00a4", (Object)n, (Object)objectArray19, 1149546463812180658L, (long)l2);
                    d += (double)_8m.b("\u00d5", (Object)j, 1147483449671667147L, (long)l2) * d3;
                    ++n2;
                }
                wArray2 = wArray;
            }
            if (wArray2 != null) continue;
        }
        return d;
    }

    /*
     * Unable to fully structure code
     */
    public _8m(ByteBuffer var1_1, int var2_2, long var3_3) {
        block18: {
            block14: {
                v0 = var3_3 = _8m.a ^ var3_3;
                var5_4 = v0 ^ 1843745129327L;
                v1 = v0 ^ 104567121956763L;
                var7_5 = v1 >>> 8;
                var9_6 = (int)(v1 << 56 >>> 56);
                super();
                this.cfr_renamed_8 = new Int2ObjectOpenHashMap();
                this.cfr_renamed_6 = var2_2;
                var11_7 = _8m.b("G", (long)3389836244533688846L, (long)var3_3);
                _8m.b("G", (Object)var11_7, (Object)var1_1, (long)3392610501972288733L, (long)var3_3);
                var12_8 = _8m.b("G", (int)_8m.a("m", (int)783, (long)(8954807041987315640L ^ var3_3)), (long)3392910723910277016L, (long)var3_3);
                v2 = new STBTTPackedchar.Buffer[_8m.a("m", (int)26029, (long)(6231696108045394176L ^ var3_3))];
                v2[0] = _8m.b("G", (int)_8m.a("m", (int)24417, (long)(557406126970919888L ^ var3_3)), (long)3392218956027922616L, (long)var3_3);
                v2[1] = _8m.b("G", (int)_8m.a("m", (int)16879, (long)(7583313708663096663L ^ var3_3)), (long)3392218956027922616L, (long)var3_3);
                v2[2] = _8m.b("G", (int)_8m.a("m", (int)3737, (long)(5022929524153551392L ^ var3_3)), (long)3392218956027922616L, (long)var3_3);
                v2[3] = _8m.b("G", (int)_8m.a("m", (int)7078, (long)(1141625274139320074L ^ var3_3)), (long)3392218956027922616L, (long)var3_3);
                v2[4] = _8m.b("G", (int)_8m.a("m", (int)15857, (long)(3745565208644893005L ^ var3_3)), (long)3392218956027922616L, (long)var3_3);
                v2[5] = _8m.b("G", (int)1, (long)3392218956027922616L, (long)var3_3);
                var13_9 = v2;
                var14_10 = _8m.b("G", (long)3390041308398994519L, (long)var3_3);
                _8m.b("G", (Object)var14_10, (Object)var12_8, (int)_8m.a("m", (int)7549, (long)(280273158530308555L ^ var3_3)), (int)_8m.a("m", (int)25152, (long)(2451401372050777851L ^ var3_3)), (int)0, (int)1, (long)3390166315504234132L, (long)var3_3);
                var15_11 = _8m.b("G", (int)var13_9.length, (long)3392690957640502700L, (long)var3_3);
                _8m.b("\u00a4", (Object)var15_11, (Object)_8m.b("\u00a4", (Object)_8m.b("G", (long)3393033082647747577L, (long)var3_3), (float)var2_2, (int)_8m.a("m", (int)15955, (long)(3401506485671377633L ^ var3_3)), null, (int)_8m.a("m", (int)14291, (long)(536574679111480167L ^ var3_3)), (Object)var13_9[0], (byte)2, (byte)2, (long)3389069081556326174L, (long)var3_3), (long)3389274787311051806L, (long)var3_3);
                _8m.b("\u00a4", (Object)var15_11, (Object)_8m.b("\u00a4", (Object)_8m.b("G", (long)3393033082647747577L, (long)var3_3), (float)var2_2, (int)_8m.a("m", (int)32111, (long)(5086747828772829653L ^ var3_3)), null, (int)_8m.a("m", (int)3142, (long)(2391594770082466040L ^ var3_3)), (Object)var13_9[1], (byte)2, (byte)2, (long)3389069081556326174L, (long)var3_3), (long)3389274787311051806L, (long)var3_3);
                v3 = _0j.cfr_renamed_1();
                _8m.b("\u00a4", (Object)var15_11, (Object)_8m.b("\u00a4", (Object)_8m.b("G", (long)3393033082647747577L, (long)var3_3), (float)var2_2, (int)_8m.a("m", (int)4465, (long)(1886335044553971162L ^ var3_3)), null, (int)_8m.a("m", (int)5571, (long)(5540372260005941609L ^ var3_3)), (Object)var13_9[2], (byte)2, (byte)2, (long)3389069081556326174L, (long)var3_3), (long)3389274787311051806L, (long)var3_3);
                _8m.b("\u00a4", (Object)var15_11, (Object)_8m.b("\u00a4", (Object)_8m.b("G", (long)3393033082647747577L, (long)var3_3), (float)var2_2, (int)_8m.a("m", (int)12396, (long)(8824066718521636049L ^ var3_3)), null, (int)_8m.a("m", (int)31664, (long)(6972507853874626319L ^ var3_3)), (Object)var13_9[3], (byte)2, (byte)2, (long)3389069081556326174L, (long)var3_3), (long)3389274787311051806L, (long)var3_3);
                _8m.b("\u00a4", (Object)var15_11, (Object)_8m.b("\u00a4", (Object)_8m.b("G", (long)3393033082647747577L, (long)var3_3), (float)var2_2, (int)_8m.a("m", (int)28035, (long)(933799264241346864L ^ var3_3)), null, (int)_8m.a("m", (int)4465, (long)(1886335044553971162L ^ var3_3)), (Object)var13_9[4], (byte)2, (byte)2, (long)3389069081556326174L, (long)var3_3), (long)3389274787311051806L, (long)var3_3);
                _8m.b("\u00a4", (Object)var15_11, (Object)_8m.b("\u00a4", (Object)_8m.b("G", (long)3393033082647747577L, (long)var3_3), (float)var2_2, (int)_8m.a("m", (int)7932, (long)(9021244863650863692L ^ var3_3)), null, (int)1, (Object)var13_9[5], (byte)2, (byte)2, (long)3389069081556326174L, (long)var3_3), (long)3389274787311051806L, (long)var3_3);
                _8m.b("\u00a4", (Object)var15_11, (long)3391777567760448470L, (long)var3_3);
                _8m.b("G", (Object)var14_10, (Object)var1_1, (int)0, (Object)var15_11, (long)3392448506327913664L, (long)var3_3);
                _8m.b("G", (Object)var14_10, (long)3391582051866124383L, (long)var3_3);
                this.cfr_renamed_5 = new _0B((int)_8m.a("m", (int)25152, (long)(2451401372050777851L ^ var3_3)), var7_5, (int)_8m.a("m", (int)25152, (long)(2451401372050777851L ^ var3_3)), (byte)var9_6, (TextureFormat)_8m.b("\u00ce", (long)3392268115813679593L, (long)var3_3), (FilterMode)_8m.b("\u00ce", (long)3392132104598171378L, (long)var3_3), (FilterMode)_8m.b("\u00ce", (long)3392132104598171378L, (long)var3_3));
                v4 = new Object[2];
                v4[1] = var5_4;
                v4[0] = var12_8;
                _8m.b("\u00a4", (Object)_8m.b("\u00d5", (Object)this, (long)3392664479532512158L, (long)var3_3), (Object)v4, (long)3392768973678945802L, (long)var3_3);
                this.cfr_renamed_0 = (float)_8m.b("G", (Object)var11_7, (float)var2_2, (long)3393397126739306896L, (long)var3_3);
                var10_12 = v3;
                var16_13 = _8m.b("G", (long)3391958665600142824L, (long)var3_3);
                try {
                    var17_15 = _8m.b("\u00a4", (Object)var16_13, (int)1, (long)3390648263763978552L, (long)var3_3);
                    _8m.b("G", (Object)var11_7, (Object)var17_15, null, null, (long)3390352357871731391L, (long)var3_3);
                    this.cfr_renamed_1 = (float)_8m.b("\u00a4", (Object)var17_15, (int)0, (long)3391755563190698580L, (long)var3_3);
                    v5 = var16_13;
                    if (var10_12 == null) break block14;
                }
                catch (Throwable var17_16) {
                    block15: {
                        try {
                            if (var3_3 < 0L) break block15;
                            v6 = var16_13;
                            if (var10_12 != null) {
                                if (v6 == null) break block15;
                            }
                            ** GOTO lbl72
                        }
                        catch (Throwable v7) {
                            throw _8m.a(v7);
                        }
                        try {
                            v6 = var16_13;
lbl72:
                            // 2 sources

                            _8m.b("\u00a4", (Object)v6, (long)3391394771601648308L, (long)var3_3);
                        }
                        catch (Throwable var18_17) {
                            _8m.b("\u00a4", (Object)var17_16, (Object)var18_17, (long)3390920738087561838L, (long)var3_3);
                        }
                    }
                    throw var17_16;
                }
                if (v5 == null) break block18;
                v5 = var16_13;
            }
            _8m.b("\u00a4", (Object)v5, (long)3391394771601648308L, (long)var3_3);
        }
        var16_14 = 0;
        while (var16_14 < var13_9.length) {
            block16: {
                block17: {
                    var17_15 = var13_9[var16_14];
                    var18_18 = _8m.b("\u00a4", (Object)((STBTTPackRange)_8m.b("\u00a4", (Object)var15_11, (int)var16_14, (long)3390240759181905215L, (long)var3_3)), (long)3389770227516586314L, (long)var3_3);
                    var19_19 = 0;
                    block9: while (var19_19 < _8m.b("\u00a4", (Object)var17_15, (long)3389626215433744061L, (long)var3_3)) {
                        var20_20 = (STBTTPackedchar)_8m.b("\u00a4", (Object)var17_15, (int)var19_19, (long)3389191022329200014L, (long)var3_3);
                        var21_21 = 4.8828125E-4f;
                        var22_22 = 4.8828125E-4f;
                        try {
                            _8m.b("\u00a4", (Object)_8m.b("\u00d5", (Object)this, (long)3389317925465240579L, (long)var3_3), (int)(var19_19 + var18_18), (Object)new _9J((float)_8m.b("\u00a4", (Object)var20_20, (long)3389534259329167700L, (long)var3_3), (float)_8m.b("\u00a4", (Object)var20_20, (long)3391344126883795453L, (long)var3_3), (float)_8m.b("\u00a4", (Object)var20_20, (long)3391637939234680801L, (long)var3_3), (float)_8m.b("\u00a4", (Object)var20_20, (long)3391443358037237689L, (long)var3_3), (float)_8m.b("\u00a4", (Object)var20_20, (long)3389141802044026468L, (long)var3_3) * var21_21, (float)_8m.b("\u00a4", (Object)var20_20, (long)3389025056254396023L, (long)var3_3) * var22_22, (float)_8m.b("\u00a4", (Object)var20_20, (long)3392087366087363411L, (long)var3_3) * var21_21, (float)_8m.b("\u00a4", (Object)var20_20, (long)3393287515374091896L, (long)var3_3) * var22_22, (float)_8m.b("\u00a4", (Object)var20_20, (long)3389728769337930708L, (long)var3_3)), (long)3393091593782050946L, (long)var3_3);
                            ++var19_19;
                            do {
                                v8 = var10_12;
                                if (var3_3 <= 0L) break block16;
                                if (v8 == null) break block17;
                                if (var10_12 != null) continue block9;
                            } while (var3_3 < 0L);
                        }
                        catch (Throwable v9) {
                            throw _8m.a(v9);
                        }
                        _4w.cfr_renamed_8(new String[5]);
                        break;
                    }
                    ++var16_14;
                }
                v8 = var10_12;
            }
            if (v8 != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8m.a = l.a(6758324076774345347L, 2692856320173852582L, MethodHandles.lookup().lookupClass()).a(269986599011934L);
                _8m.e = new Object[96];
                _8m.f = new String[96];
                _8m.a();
                _8m.d = new HashMap<K, V>(13);
                var0 = _8m.a ^ 55069144913802L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "\u0093\u0093\u00ab\u00f8\u00cd`\u00eb!\u00daE\u00ff:\u00bb\u0096v\u00a8\u0001\u00a5\u001b\u0014\u00abW\f\u00d6!\u00bf\u009a\u00d9\u001d\u0012\u000e%n\u00fd\u00caz\u00fb\u00dal:\u00d4\u009dD\u00deh\u00bf\u009cb\n\u00a9\"8U\u0017^\u008b\u00d3\u00ca\u0018\u00ee\u0013h,\u007f \u00dcs\u00ca\u00d5\f\u00b3\u00b6\u001f\u00d7\u00d8]\u0096 O\u00a8\u00ec\u0089\u00ea\u0083&\u00c6D\u0087\u0092\u0090\u000f\u0007N\u0004\t\u00dd\n*Z\u0019V\u0080H\u00d1\u000fh\u0087\u0006\u00f4\u0095\u000b&*\u00f6\u00f2\u00c8\u00bee\u0014\u00c1\u008e\u008aS\u00a8\u00d1np\u00c2>b\u001e\u00bb.p\u0094\u00b9`\u0085\u0092W\u0017a+\u0092\u00fc\u0096\u00e1K\u0083\u00ca\u00d2\u001e\u00e9\u001c\u00df1\u001c]\u00c3\u00f9";
                var7_6 = "\u0093\u0093\u00ab\u00f8\u00cd`\u00eb!\u00daE\u00ff:\u00bb\u0096v\u00a8\u0001\u00a5\u001b\u0014\u00abW\f\u00d6!\u00bf\u009a\u00d9\u001d\u0012\u000e%n\u00fd\u00caz\u00fb\u00dal:\u00d4\u009dD\u00deh\u00bf\u009cb\n\u00a9\"8U\u0017^\u008b\u00d3\u00ca\u0018\u00ee\u0013h,\u007f \u00dcs\u00ca\u00d5\f\u00b3\u00b6\u001f\u00d7\u00d8]\u0096 O\u00a8\u00ec\u0089\u00ea\u0083&\u00c6D\u0087\u0092\u0090\u000f\u0007N\u0004\t\u00dd\n*Z\u0019V\u0080H\u00d1\u000fh\u0087\u0006\u00f4\u0095\u000b&*\u00f6\u00f2\u00c8\u00bee\u0014\u00c1\u008e\u008aS\u00a8\u00d1np\u00c2>b\u001e\u00bb.p\u0094\u00b9`\u0085\u0092W\u0017a+\u0092\u00fc\u0096\u00e1K\u0083\u00ca\u00d2\u001e\u00e9\u001c\u00df1\u001c]\u00c3\u00f9".length();
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
                    var6_5 = "N\u001b9\u00bc\u00eb\u00a9\u00f4\u00b7\u00afZ>*ih\u00d0;";
                    var7_6 = "N\u001b9\u00bc\u00eb\u00a9\u00f4\u00b7\u00afZ>*ih\u00d0;".length();
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
        _8m.b = var8_3;
        _8m.c = new Integer[22];
        _8m.cfr_renamed_4 = (int)_8m.a("m", (int)30804, (long)(var0 ^ 3864046725341483812L));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8m.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _8m.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8m.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _8m.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8m.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _8m.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8m.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _8m.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8m.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8m.a(clazz3, string2, clazz2)) != null) {
                    _8m.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _8m.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _8m.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8m.b(1324406286919116L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _8m.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8m.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _8m.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8m.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8m.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8m.b(1324406286919116L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _8m.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8m.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8m.b(1324406286919116L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8m.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == '\u00f8' || c == '\u00ce' || c == 'b') {
                field = _8m.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8m.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _8m.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ":\u001fn?WH?\ne?HK7CZEyk\u0001=hrPZ1\u000eapI";
        objectArray[1] = Short.TYPE;
        _8m.f[1] = "java/lang/Short";
        objectArray[2] = "g.pGn(b;{Gq&{(r\u0004,\u0012m1x\u001b{\f|=t\u0002";
        objectArray[3] = Integer.TYPE;
        _8m.f[3] = "java/lang/Integer";
        objectArray[4] = "i\fI7;gj\u0002\u0011\u001f{}A\u0018Y0p{";
        objectArray[5] = "o\u0004\u00111\u001cgd\u000b\u0000~fcw\n\u00101Pg`";
        objectArray[6] = Void.TYPE;
        _8m.f[6] = "java/lang/Void";
        objectArray[7] = "\u0017V\u0002QH=\u0012C\tQW>\u001a\n6+f\u001e\nQ\u0000\u000b]:\u001d";
        objectArray[8] = "\u001c\u0002+3\u0006\u0014\u0019\u0017 3\u0019\u0017\u0011^\u001fI(7' -~\u0001 \u001c\u001e8x\u0012\u0017";
        objectArray[9] = "U2YtsUV<\u0001W$OZ\u0011Zs;^M";
        objectArray[10] = Boolean.TYPE;
        _8m.f[10] = "java/lang/Boolean";
        objectArray[11] = "\rFpBjK\bS{BuH\u0000\u001aD8Dh6rx\u0002rU\fRx";
        objectArray[12] = Float.TYPE;
        _8m.f[12] = "java/lang/Float";
        objectArray[13] = "Y|_hw)\\iThh*T k\u0012Y\nb^Y%p\fW`_#";
        objectArray[14] = "XD\"[}\b]Q)[b\u000bU\u0018\u0016!S+cf$\u0016z-VX\"\u00105=BP#\u0010c";
        objectArray[15] = "\u0002^\u0011\rI7\u0007K\u001a\rV9\u001eX\u0013N\u000b\u0013\u0019^\u0003@Q";
        objectArray[16] = "\u0000\u0002\u0010\rS^\u0005\u0017\u001b\r}\\\t\u0016\u0012Qj]\u0006\u001c\u0004";
        objectArray[17] = "w,J;h5s1J*u50>\u0005=r)j1\b`o2j+J\u0007h(,\u0017\u0006$c?j\u0017\u0014+h\u0014\u007f+\f\u0003g,";
        objectArray[18] = "\b\u00175\u00042q\u0003\u0018$KS\u007f\b\u0013 \u0011";
        objectArray[19] = "\"lyYG\u0010?y{\u0018BL~d";
        objectArray[20] = "CK[Wg\u001b^^Y\u0016bG\u0017l";
        objectArray[21] = "v o$i;s5d$v8{|[^G\u0018M\u0002iin)}1`kwh['nl`>";
        objectArray[22] = "G2.+\u0017v2\u0012%$\u00069S\u001c./\u0002c'";
        objectArray[23] = "$x\u001cg\u0015[!m\u0017g\nU8~\u001e$W\u007f?x\u000e*\rn>l\u001d,\u000b";
        objectArray[24] = "G\u0007XWQ\tN\t[\u001e\u0012\u0004H\tO\u001c\u000f\u0002\n\u001cP\u0001H\u0013V\rFWz\u000fH\u001cP\u000bq\t@\r";
        objectArray[25] = "I\u0016.^{=@\u0018-\u001780F\u00189\u0015%6\u0004\r&\bb'X\u001c0^B7R\r6\u0002s\u0014E\u000b.\u0011b";
        objectArray[26] = "K(z3\u0016dN=q3\tjW.xpTPQ)ir\u0017QQ<{x\b";
        objectArray[27] = Byte.TYPE;
        _8m.f[27] = "java/lang/Byte";
        objectArray[28] = "\u0000tiiY%\u001dak(\\yR_";
        objectArray[29] = "\u0014D`3\u001c0adk<\r\u007f\u0000j`7\t%t";
        objectArray[30] = "$kl\f)_QKg\u00038\u00100El\b<JD";
        objectArray[31] = ";s\u00193J\u001d&f\u001brOAf\\";
        objectArray[32] = "Z+b4E~/\u000bi;T1N\u0005b0Pk:";
        objectArray[33] = "5\u0000\u0018>5?@ \u00131$p!.\u0018: *U";
        objectArray[34] = "\u001f1xo?5\u0014>i B-\u00079`i";
        objectArray[35] = Character.TYPE;
        _8m.f[35] = "java/lang/Character";
        objectArray[36] = "\u0001a\u001cxw<tA\u0017wfs\u0015O\u001c|b)a";
        objectArray[37] = "\u0019\u0006k9>4\u001e\u00197=\\jI\u001ak\"7NF\u0002\u000f\u007f3bX\u001bc =t\u0011~54akG\u0006c:3o ";
        objectArray[38] = "~\u000bd\u00049[<W|SU])\u0003_\u001f-L?\u0002\u007f\u00198XET`\u00023X*\u0016<\u001ad4y\rxZ<Qu\u0017>\bU";
        objectArray[39] = ")<q\u0005\u0017O91y\u0007w\u0007K+sYH\\->v\u0005\u0012>)<q\u0005\u0017O91y\u0007w";
        objectArray[40] = "\u001d37\u0001K<\r>?\u0003+p\u007f$5]\u0014/\u001910\u0001NMC>\"XB(O$d\n+";
        objectArray[41] = "a\u0011mWy\bu\u0005<I\u0007S\rH~\u001eg\u000es\u0002x\u0011f";
        objectArray[42] = "\u000f\f[Wn\u0014\u001b\u0018\nI\u0010NcUH\u001ep\u0012\u001d\u001fN\u0011q";
        objectArray[43] = "\u0006:\u0015fJ\u000f\u00167\u001dd*Ad-\u0017:\u0015\u001c\u00028\u0012fO~\u0006:\u0015fJ\u000f\u00167\u001dd*";
        objectArray[44] = "\u00066z]N8\u00049*QqzG5j]&YR4uk\u001cnZ9\u0016\u001fIz]2pP\u0000;T_(KO<\u0005 (E\u0003{;eyL\tdW:wZ@\u0001\u00010{Y\u0014m^>m\u0010q;T2nD\u001ddZ$'!KnV'sM\u0014`@n\u0016\u001eLxJnuO\u001apU_";
        objectArray[45] = "vP\u0014\u001f\u0018\u000bcC\u001b\u0012\"K\u0012\u0003\nFB\u0017lI\fIC";
        objectArray[46] = "}\u00122\u001d(M\u007f\u001db\u0011\u0017\u000f<\u0011\"\u001d@;-\u0007\u0010\u0006q\b\u001e>3\u001dm\u0015+\u0000^Q/\u001a!\u001b<[f\u00112{d\u0010*\u0010'\u00032\u001ex\u0014@A/\\s\u00138\u0017!\u000ewtz\nc\u0005p\f,\u00041\u0001\u0017H\"\u0007f\brD8A4a";
        objectArray[47] = "xL\u0005\u0010E+,\u001dC\u001d!z|\u000e=INxi\u0017Q\u0016@n rT\nC%{J\\\u0014N\u007f\u0011";
        objectArray[48] = "\nW\n<<\u0013\u001fD\u00051\u0006Rn\u0004\u0014ef\u000f\u0010N\u0012jg";
        objectArray[49] = "/O\u00177b\u0003%\u0006\u001c$\u0002\ne\u001a\u0010*oa/O\u00177b\u0003%\u0006\u001c$\u0002";
        objectArray[50] = "\u0003geGApL.$N,}G2w]A\u0016\u0003geGApL.$N,";
        objectArray[51] = "\u0017omK\u0005W\u0002|bF?\u001fs<s\u0012_K\rvu\u001d^";
        objectArray[52] = "l/=}\u0014U;b3$~Nh&4&\u001fYp^g\"\u0013]d28,\u0005\u0014\u0001";
        objectArray[53] = "`\tL6\u00122d\u001eZ\u0006S-o\t16_za\nO|Yu`g";
        objectArray[54] = "?*w;\u0017d|msduxoih!\"khrx:\u0019{Yxt1\u0018niru!\"whDi4\u0013yc\u0013)2\u0018nk\u007fv<\u000e'\u000e";
        objectArray[55] = "\u0001\t&a\u001bL\u0005\u001e0QZ]\f\u001927AY`W'aJY\u001e\u001d!nK4";
        objectArray[56] = "~onUX\u001fj{?K&I\u0012l|FI\u0014x}:QI";
        objectArray[57] = "\u001b\u0001nt\u001aOOP(y~\t\u000fCV~\u0007\u0013BUnv\u0019\u001e\u0018?9r\u0010M\u001dZhr\u001d\fr";
        objectArray[58] = "\u0006^/MpR\u0006G$Y\rF\u0000K/vq-ZM8GhA\u0005C.\u000e\rJ\u001cR*S5\u001c^\u001e8?";
        objectArray[59] = ">\fh\u0006[8+\u001fg\u000bavZ_v_\u0001$$\u0015pP\u0000";
        objectArray[60] = "B{K\u0014\u0006o\u0001<OKdf\u001e>/B\u0018-\u0013/Q\b\u001e\"\u0012B\u0015\u001d\te\u0016.J\u0013\u001f,sx^O\u0000z\u000b.P\u001d\u0004\u001dI-B\n\u0001q\u0016#TCdp\u0002\"\u001f\u0018\u0014'O,Fr\u0006tJ\"E\u001e\u000ep\u001f~/\u0010\r$\u0013(C\u0018\tqOB\u001eK\u0000{\u00110]\f\u0004$s";
        objectArray[61] = "0$w[\u0014;43akT{Qs5ZW)(3xW\u0018C";
        objectArray[62] = "cH\u0010%m\u000b4\u0005\u001e|\u0007\u0014cEp/h\u0016v\\\u001cpf\u0000?9\u0019leKd\u0001\u0011rh\u0011\u000e";
        objectArray[63] = "\u0002(\u001c6pZ\u0006?\n\u00061\u001ac\u007f^73H\u001a?\u0013:|\"";
        objectArray[64] = "U>(\u00133\u0017Q)>#sV4ij\u0012p\u0005M)'\u001f?o";
        objectArray[65] = ".D\u00073\u0005S>I\u000f1e\u0018LS\u0005oZ@*F\u00003\u0000\"pI\u0012j\fG|ST8e";
        objectArray[66] = "\u001bR1nnR\u0019]abQ\u0010ZQ!n\u00060MR9\u007f\u001f\f\\c<b<\u000ffV<}1\u0017&\u000be|0\u000bD\u0001,w#k\u0016Gmr<\u0015\\AbsQ[Z\u000b=\u007f/\u0011\\\u0004<\u0012";
        objectArray[67] = "f\u0012\u0015j37f\u000b\u001e~N,m\b\u0000d.H:\u0001\u0002`+$e\u000f\u0014)N";
        objectArray[68] = "\u000bY\u0011q>\u0013H\u001e\u0015.\\\n@\r\u001ck1a\u000bY\u0011q>\u0013H\u001e\u0015.\\";
        objectArray[69] = "O\u0015x9\u0014~@\u001a}&hm_\u001bx#\u0005LT\n|\u0015\u0015hK\u001bk_RiH\u000et3\rg^G\u0011a\u00028\u0018Hna\ft_v";
        objectArray[70] = "2o7]=\u0012#) ]]\u00175n]\b2\u0015 w1W<\u0003i\u00121\u000b2\u001e%qgU'@X";
        objectArray[71] = "y\u0000\u0018E$\u0010hF\u000fED\u0002n\u0001r\u0010+\u0017k\u0018\u001eO%\u0001\"}\u001e\u0013+\u001cn\u001eHM>B\u0013\u0011KE\"\u0007pG\u0015P|z";
        objectArray[72] = "\nJceT^I\rg:6GA\u001en\u007f[,\u0001\u001cj{S@^\u0012|26E\u0005Kdg\b\u0011T\ri\u0003";
        objectArray[73] = "],Y@EpI8\b^;\"1(]CQr\f&V\u0007^";
        objectArray[74] = "\u000b\u0014v\u0013IU\u001e\u0007y\u001es\u0018oGhJ\u0013I\u0011\rnE\u0012";
        objectArray[75] = "(\\O}f7&W\u000br\u000f:EO^*0h#Z[vj\nyUI/fouO\u000f}\u000f";
        objectArray[76] = "s}+WDrqr{[{02~;W,\u0013'\u007f$e\u001c-2N.M\u0014&5\u0014y\u0013\u0000-#r6ZA$N*-\u0015Fu1*#Y\u0001Kt{*S\u001e'+u<\u001a{\"p,$OEv!j)+Dv7evH\u0015 ?zG";
        objectArray[77] = "I9zhCv\\*uey<-jd1\u0019jS b>\u0018";
        objectArray[78] = "\u001aMi(]\u001c\u0018B9$b^[Ny(5dAEy\u001a\u0005C[$5l\fDGF?%\u0007W'\u001aoj_\u001bX\u001aa&\u0018%\u0018\u0019|%SFIOt:b";
        objectArray[79] = "\u0007;)e\u0019b\u0012(&h#)ch7<C~\u001d\"13B";
        objectArray[80] = "AmS=\f_S\"N?s!`\u0016c\u0013)eAmS=\f_S\"N?";
        objectArray[81] = "R>`=\u0011DV)v\rP\u00053i\"<RVJ)o1\u001d<";
        objectArray[82] = "/I)!7\u0007.V}\u007fT?\u0002|v\u00104\u001c \u0001%r5\u0003t_";
        objectArray[83] = "'~eauL#isQ/N+yd<D\u000e)}`4(Q'k)Q)E& r!~\b(y\u0018";
        objectArray[84] = "N)2Tf{[:=Y\\2*z,\r<gT0*\u0002=";
        objectArray[85] = "*i\u0013\u0010\u001d/~8U\u001dy\u007f'6Ss\u0018p$j\u0010\u0012\u0014+?<+";
        objectArray[86] = "Z3'\u0005YoO (\bc#>`9\\\u0003s@*?S\u0002";
        objectArray[87] = "foQDI~ap\r@+>#~^[s8$w5\u0001S!#u\u000e\u0006L}'\u0017";
        objectArray[88] = "!`\u000f;^\u0012#o_7aP`c\u001f;6sub\u0000\n\u0007G\u001c7[<\u0007Fzx\u0012}\u000e+ k\u001f\u007f\bN,qY-a";
        objectArray[89] = "&LP0\u0006\b6AX2fED[RlY\u001b\"NW0\u0003y~LT)\u0003\u0015!BB`f";
        objectArray[90] = "K(+\u0006>:\u001d&y\u0002Y-\u001c%\u0016X6/\t<z\u000789@Y,\r4:\u00145s\u0003\"sq";
        objectArray[91] = "&8\u0017HT\"\"/\u0001x\u0015=)8PxU&w6\u0007\u0006\u001f x7j";
        objectArray[92] = "F\u0013N\u007fQ\u0015B\u0004XO\u0011\nI\u00133\u007f\u001c]G\u0010M5\u001aRF}";
        objectArray[93] = "@X.:w\u001fTL\u007f$\tO,\u000b..q\u0011@T 88";
        objectArray[94] = "\u001f\u0013RirX\u001b\u0004DY2G\u0010\u0013\u0015Ys\\N\u001dB'9ZA\u001c/";
        Object[] objectArray2 = objectArray;
        objectArray[95] = "|#VJ8I{<\nNZ\u0019!<I[ZN''\n_?B=aX6";
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 53;
            case 2 -> 13;
            case 3 -> 59;
            case 4 -> 8;
            case 5 -> 7;
            case 6 -> 0;
            case 7 -> 10;
            case 8 -> 42;
            case 9 -> 49;
            case 10 -> 14;
            case 11 -> 21;
            case 12 -> 4;
            case 13 -> 24;
            case 14 -> 15;
            case 15 -> 54;
            case 16 -> 55;
            case 17 -> 28;
            case 18 -> 32;
            case 19 -> 2;
            case 20 -> 41;
            case 21 -> 56;
            case 22 -> 51;
            case 23 -> 17;
            case 24 -> 16;
            case 25 -> 26;
            case 26 -> 37;
            case 27 -> 35;
            case 28 -> 63;
            case 29 -> 36;
            case 30 -> 30;
            case 31 -> 6;
            case 32 -> 18;
            case 33 -> 22;
            case 34 -> 39;
            case 35 -> 50;
            case 36 -> 52;
            case 37 -> 1;
            case 38 -> 38;
            case 39 -> 58;
            case 40 -> 29;
            case 41 -> 60;
            case 42 -> 44;
            case 43 -> 45;
            case 44 -> 25;
            case 45 -> 47;
            case 46 -> 9;
            case 47 -> 62;
            case 48 -> 3;
            case 49 -> 12;
            case 50 -> 46;
            case 51 -> 48;
            case 52 -> 20;
            case 53 -> 43;
            case 54 -> 27;
            case 55 -> 11;
            case 56 -> 5;
            case 57 -> 31;
            case 58 -> 23;
            case 59 -> 33;
            case 60 -> 57;
            case 61 -> 40;
            case 62 -> 19;
            default -> 34;
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
        _8m.f[n3] = new String(cArray);
        return n3;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2BBF;
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
                throw new RuntimeException("dev/krypton/8m", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8m.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public double cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        int n = (Integer)objectArray[2];
        l2 = a ^ l2;
        double d = 0.0;
        int n2 = 0;
        _4w[] wArray = _0j.cfr_renamed_1();
        while (n2 < n) {
            _4w[] wArray2;
            block3: {
                block4: {
                    _9J j;
                    block5: {
                        CallSite callSite = _8m.b("\u00a4", string, (int)n2, -1940901421076414646L, (long)l2);
                        j = (_9J)((Object)_8m.b("\u00a4", (Object)_8m.b("\u00d5", (Object)this, -1941001015691903462L, (long)l2), (int)callSite, -1941145701179781521L, (long)l2));
                        try {
                            wArray2 = wArray;
                            if (l2 < 0L) break block3;
                            if (wArray2 == null) break block4;
                            if (j != null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw _8m.a(matchException);
                        }
                        j = (_9J)((Object)_8m.b("\u00a4", (Object)_8m.b("\u00d5", (Object)this, -1941001015691903462L, (long)l2), (int)_8m.a("m", 30855, (long)(0x55FB2075B8673637L ^ l2)), -1941145701179781521L, (long)l2));
                    }
                    d += (double)_8m.b("\u00d5", (Object)j, -1942028571139168469L, (long)l2);
                    ++n2;
                }
                wArray2 = wArray;
            }
            if (wArray2 != null) continue;
        }
        return d;
    }

    public int cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_8m.b("\u00d5", (Object)this, 1620198062481539918L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8m.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_8m.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

