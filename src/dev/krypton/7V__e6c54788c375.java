/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 */
package dev.krypton;

import dev.krypton._87;
import dev.krypton._8B;
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
import net.minecraft.class_11905;
import net.minecraft.class_11908;

public class _7V {
    private static final int cfr_renamed_5;
    private static final _8B cfr_renamed_0;
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_4;
    private String cfr_renamed_382;
    private int cfr_renamed_383;
    private int cfr_renamed_1;
    private boolean cfr_renamed_8;
    private int cfr_renamed_7;
    private String cfr_renamed_188;
    private Runnable cfr_renamed_9;
    private long cfr_renamed_3;
    private boolean cfr_renamed_6;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void void_1(Object[] var1_1) {
        block16: {
            block18: {
                block17: {
                    block15: {
                        var2_2 = (Long)var1_1[0];
                        var8_3 = (_87)var1_1[1];
                        var4_4 = (Double)var1_1[2];
                        var6_5 = (Double)var1_1[3];
                        v0 = var2_2 = _7V.a ^ var2_2;
                        var9_6 = v0 ^ 102108191574510L;
                        var11_7 = v0 ^ 92169387750807L;
                        var13_8 = v0 ^ 138112401342903L;
                        var15_9 = v0 ^ 120058325439774L;
                        var17_10 = v0 ^ 85015230749086L;
                        var19_11 = _9M.cfr_renamed_3();
                        try {
                            v1 = new Object[1];
                            v1[0] = var17_10;
                            v2 /* !! */  = _7V.b("\u00e0", (Object)this, (Object)v1, (long)5965472837226731830L, (long)var2_2);
                            if (var19_11 != 0) break block15;
                            if (v2 /* !! */  != false) {
                            }
                            ** GOTO lbl97
                        }
                        catch (MatchException v3) {
                            throw _7V.a(v3);
                        }
                        var20_12 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, (long)5967945777674770747L, (long)var2_2), (int)_7V.b("\u00ee", (Object)this, (long)5968024739647890440L, (long)var2_2), (long)5966008128230314293L, (long)var2_2);
                        var21_14 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, (long)5967945777674770747L, (long)var2_2), (int)_7V.b("\u00ee", (Object)this, (long)5968024739647890440L, (long)var2_2), (long)5966421216825406323L, (long)var2_2);
                        var22_16 = _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)5966551066783848220L, (long)var2_2), (int)0, (int)var20_12, (long)5965189462038099872L, (long)var2_2);
                        var23_17 = _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)5966551066783848220L, (long)var2_2), (int)var20_12, (int)var21_14, (long)5965189462038099872L, (long)var2_2);
                        var24_18 = _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)5966551066783848220L, (long)var2_2), (int)var21_14, (long)5965435376115743387L, (long)var2_2);
                        v4 = new Object[2];
                        v4[1] = var9_6;
                        v4[0] = var22_16;
                        var25_19 = _7V.b("\u00e0", (Object)var8_3, (Object)v4, (long)5967738087555936115L, (long)var2_2);
                        v5 = new Object[2];
                        v5[1] = var9_6;
                        v5[0] = var23_17;
                        var27_20 = _7V.b("\u00e0", (Object)var8_3, (Object)v5, (long)5967738087555936115L, (long)var2_2);
                        try {
                            v6 = new Object[5];
                            v6[4] = _7V.b("\u00df", (long)5967561069435300317L, (long)var2_2);
                            v6[3] = var6_5;
                            v6[2] = var4_4;
                            v6[1] = var22_16;
                            v6[0] = var13_8;
                            _7V.b("\u00e0", (Object)var8_3, (Object)v6, (long)5969179538813075274L, (long)var2_2);
                            v7 = new Object[3];
                            v7[2] = 1;
                            v7[1] = (int)_7V.a("n", (int)11933, (long)(171932170596358986L ^ var2_2));
                            v7[0] = var11_7;
                            v8 = new Object[6];
                            v8[5] = _7V.b("B", (Object)v7, (long)5965866844010719750L, (long)var2_2);
                            v8[4] = var6_5 + 14.0;
                            v8[3] = var4_4 + var25_19 + var27_20;
                            v8[2] = var6_5 - 2.0;
                            v8[1] = var15_9;
                            v8[0] = var4_4 + var25_19;
                            _7V.b("\u00e0", (Object)var8_3, (Object)v8, (long)5965751622611538742L, (long)var2_2);
                            v9 = new Object[5];
                            v9[4] = _7V.b("\u00df", (long)5967798333790995637L, (long)var2_2);
                            v9[3] = var6_5;
                            v9[2] = var4_4 + var25_19;
                            v9[1] = var23_17;
                            v9[0] = var13_8;
                            _7V.b("\u00e0", (Object)var8_3, (Object)v9, (long)5969179538813075274L, (long)var2_2);
                            v10 = new Object[5];
                            v10[4] = _7V.b("\u00df", (long)5967561069435300317L, (long)var2_2);
                            v10[3] = var6_5;
                            v10[2] = var4_4 + var25_19 + var27_20;
                            v10[1] = var24_18;
                            v10[0] = var13_8;
                            _7V.b("\u00e0", (Object)var8_3, (Object)v10, (long)5969179538813075274L, (long)var2_2);
                            v2 /* !! */  = (CallSite)var19_11;
                            if (var2_2 < 0L) break block15;
                            if (v2 /* !! */  == false) break block16;
lbl97:
                            // 2 sources

                            v11 = new Object[5];
                            v11[4] = _7V.b("\u00df", (long)5967561069435300317L, (long)var2_2);
                            v11[3] = var6_5;
                            v11[2] = var4_4;
                            v11[1] = _7V.b("\u00ee", (Object)this, (long)5966551066783848220L, (long)var2_2);
                            v11[0] = var13_8;
                            _7V.b("\u00e0", (Object)var8_3, (Object)v11, (long)5969179538813075274L, (long)var2_2);
                            v2 /* !! */  = _7V.b("\u00ee", (Object)this, (long)5966467707141476064L, (long)var2_2);
                        }
                        catch (MatchException v12) {
                            throw _7V.a(v12);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var19_11 != 0) break block17;
                                if (v2 /* !! */  == false) break block16;
                            }
                            catch (MatchException v13) {
                                throw _7V.a(v13);
                            }
                            v14 = this;
                            if (var19_11 != 0) break block18;
                        }
                        catch (MatchException v15) {
                            throw _7V.a(v15);
                        }
                        v2 /* !! */  = _7V.b("\u00ee", (Object)v14, (long)5968608431781130131L, (long)var2_2);
                    }
                    catch (MatchException v16) {
                        throw _7V.a(v16);
                    }
                }
                if (v2 /* !! */  == false) break block16;
                v14 = this;
            }
            var20_13 = _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v14, (long)5966551066783848220L, (long)var2_2), (int)0, (int)_7V.b("\u00ee", (Object)this, (long)5968024739647890440L, (long)var2_2), (long)5965189462038099872L, (long)var2_2);
            v17 = new Object[2];
            v17[1] = var9_6;
            v17[0] = var20_13;
            var21_15 = var4_4 + _7V.b("\u00e0", (Object)var8_3, (Object)v17, (long)5967738087555936115L, (long)var2_2);
            v18 = new Object[6];
            v18[5] = _7V.b("\u00df", (long)5967561069435300317L, (long)var2_2);
            v18[4] = var6_5 + 14.0;
            v18[3] = var21_15 + 1.0;
            v18[2] = var6_5 - 2.0;
            v18[1] = var15_9;
            v18[0] = var21_15;
            _7V.b("\u00e0", (Object)var8_3, (Object)v18, (long)5965751622611538742L, (long)var2_2);
        }
    }

    public boolean boolean_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (boolean)_7V.b("\u00ee", (Object)this, 3782495442280753235L, (long)l2);
    }

    public void cfr_renamed_36(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        int n = (Integer)objectArray[1];
        l2 = a ^ l2;
        _7V.b("\u00c7", (Object)this, (int)n, 8507322873828599226L, (long)l2);
    }

    private void cfr_renamed_378(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                int n = _9M.cfr_renamed_0();
                try {
                    try {
                        callSite = _7V.b("\u00ee", (Object)this, -7770425244715005295L, (long)l2);
                        if (n == 0) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7V.a(matchException);
                    }
                    callSite = _7V.b("\u00ee", (Object)this, -7770425244715005295L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            _7V.b("\u00e0", (Object)callSite, -7770575599697513029L, (long)l2);
        }
    }

    private void cfr_renamed_384(Object[] objectArray) {
        block2: {
            CallSite callSite;
            long l2;
            long l3;
            long l4;
            block3: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = a ^ l4;
                l3 = l5 ^ 0x860C9023BFFL;
                l2 = l5 ^ 0x2A2711EF48F2L;
                long l6 = l5 ^ 0x98C717C61F3L;
                int n = _9M.cfr_renamed_3();
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l6;
                    callSite = _7V.b("\u00e0", (Object)this, (Object)objectArray2, 3072819638237225307L, (long)l4);
                    if (n != 0) break block2;
                    if (callSite != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
                return;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            _7V.b("\u00e0", (Object)this, (Object)objectArray3, 3073429807560956677L, (long)l4);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l3;
            callSite = _7V.b("\u00e0", (Object)this, (Object)objectArray4, 3073022131372562646L, (long)l4);
        }
    }

    public void cfr_renamed_385(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x72D2D869EA8DL;
        _7V.b("\u00c7", (Object)this, (String)"", -2976296561304497309L, (long)l2);
        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", 2876, (long)(0x3D73BC364CD6BA99L ^ l2)), -2977496730247946121L, (long)l2);
        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", 1180, (long)(0x381C6E76508BB535L ^ l2)), -2977715471655936700L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _7V.b("\u00e0", (Object)this, (Object)objectArray2, -2976058633307412826L, (long)l2);
    }

    private void cfr_renamed_386(Object[] objectArray) {
        CallSite callSite;
        long l2;
        block2: {
            block3: {
                l2 = (Long)objectArray[0];
                long l3 = (l2 = a ^ l2) ^ 0x555F159B810EL;
                int n = _9M.cfr_renamed_3();
                try {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l3;
                    callSite = _7V.b("\u00e0", (Object)this, (Object)objectArray2, -3865911481986023002L, (long)l2);
                    if (n != 0) break block2;
                    if (callSite != false) break block3;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
                return;
            }
            callSite = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, -3872392964804034133L, (long)l2), (int)_7V.b("\u00ee", (Object)this, -3872331603610026856L, (long)l2), -3865323482133280347L, (long)l2);
        }
        CallSite callSite2 = callSite;
        CallSite callSite3 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, -3872392964804034133L, (long)l2), (int)_7V.b("\u00ee", (Object)this, -3872331603610026856L, (long)l2), -3864963206040392733L, (long)l2);
        CallSite callSite4 = _7V.b("\u00e0", (Object)_7V.b("\u00e0", (Object)_7V.b("B", -3872196242321198877L, (long)l2), -3872994097731885356L, (long)l2), -3865781679991856724L, (long)l2);
        _7V.b("B", (long)callSite4, (Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -3864815702152343668L, (long)l2), (int)callSite2, (int)callSite3, -3866194900729614544L, (long)l2), -3872156290150514033L, (long)l2);
    }

    public void cfr_renamed_387(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _7V.b("\u00c7", (Object)this, (boolean)_7V.a("n", 20391, (long)(0x2A2759503433C66CL ^ l2)), -1234938696063151205L, (long)l2);
        _7V.b("\u00c7", (Object)this, (long)_7V.b("B", -1235163000869843792L, (long)l2), -1236130872704522221L, (long)l2);
    }

    public void cfr_renamed_388(Object[] objectArray) {
        block13: {
            _7V v;
            double d;
            double d2;
            long l2;
            long l3;
            _87 var12_2;
            block11: {
                var12_2 = (_87)objectArray[0];
                double d3 = (Double)objectArray[1];
                l3 = (Long)objectArray[2];
                double d4 = (Double)objectArray[3];
                double d5 = (Double)objectArray[4];
                double d6 = (Double)objectArray[5];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x182EBDF8ADB7L;
                long l6 = l4 ^ 0xE3DADF8104FL;
                long l7 = l4 ^ 0x261D6CD79F76L;
                l2 = l4 ^ 0x555146FB9F7L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                _7V.b("\u00e0", (Object)this, (Object)objectArray2, 4840571189588331543L, (long)l3);
                Object[] objectArray3 = new Object[10];
                objectArray3[9] = 5.0;
                objectArray3[8] = 5.0;
                objectArray3[7] = 5.0;
                objectArray3[6] = 5.0;
                objectArray3[5] = l7;
                objectArray3[4] = d4 + d6;
                objectArray3[3] = d3 + d5;
                objectArray3[2] = d4;
                objectArray3[1] = d3;
                objectArray3[0] = _7V.b("\u00df", 4842009543684014653L, (long)l3);
                _7V.b("\u00e0", (Object)var12_2, (Object)objectArray3, 4841449249087272229L, (long)l3);
                d2 = d3 + 10.0;
                int n = _9M.cfr_renamed_3();
                d = d4 + (d6 - 14.0) / 2.0;
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    try {
                                        v = this;
                                        if (n != 0) break block11;
                                        if (_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v, 4842778297769527012L, (long)l3), 4841140339168442863L, (long)l3) == false) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw _7V.a(matchException);
                                    }
                                    v = this;
                                    if (n != 0) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw _7V.a(matchException);
                                }
                                if (l3 < 0L) break block11;
                                if (_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v, 4841170438693673157L, (long)l3), 4841140339168442863L, (long)l3) == false) {
                                }
                                break block12;
                            }
                            catch (MatchException matchException) {
                                throw _7V.a(matchException);
                            }
                            Object[] objectArray4 = new Object[5];
                            objectArray4[4] = _7V.b("\u00df", 4840688338597464828L, (long)l3);
                            objectArray4[3] = d;
                            objectArray4[2] = d2;
                            objectArray4[1] = _7V.b("\u00ee", (Object)this, 4841170438693673157L, (long)l3);
                            objectArray4[0] = l6;
                            _7V.b("\u00e0", (Object)var12_2, (Object)objectArray4, 4841011757681782450L, (long)l3);
                            if (n == 0) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _7V.a(matchException);
                        }
                    }
                    v = this;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = d;
            objectArray5[2] = d2;
            objectArray5[1] = var12_2;
            objectArray5[0] = l2;
            _7V.b("\u00e0", (Object)v, (Object)objectArray5, 4840820791479666921L, (long)l3);
        }
    }

    public _7V(String string, int n, int n2, byte by, int n3) {
        long l2 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ a;
        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", 1180, (long)(0x381C7990A243B4F4L ^ l2)), -2923944015197152123L, (long)l2);
        _7V.b("\u00c7", (Object)this, (boolean)_7V.a("n", 20140, (long)(0x539929FA73A0FED3L ^ l2)), -2921901862081639586L, (long)l2);
        _7V.b("\u00c7", (Object)this, (String)"", -2924720701833098109L, (long)l2);
        _7V.b("\u00c7", (Object)this, (boolean)_7V.a("n", 20391, (long)(0x2A27725A0852FFDAL ^ l2)), -2924324043389359571L, (long)l2);
        _7V.b("\u00c7", (Object)this, (String)string, -2921985217231940958L, (long)l2);
        _7V.b("\u00c7", (Object)this, (int)n3, -2924108576331905855L, (long)l2);
        _7V.b("\u00c7", (Object)this, (int)_7V.b("\u00e0", string, -2923824484410336914L, (long)l2), -2923722806323109450L, (long)l2);
    }

    public _7V(long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x5EFD95D35157L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 40);
        int n3 = (int)(l3 << 56 >>> 56);
        this("", n, n2, (byte)n3, (int)_7V.a("n", 3158, (long)(0x73A4FD01F6E9C578L ^ l2)));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    _7V.a = l.a(-8138736572732842302L, -4348329594411856481L, MethodHandles.lookup().lookupClass()).a(176469407872745L);
                    v0 = var16 = _7V.a ^ 16336154734709L;
                    var18_1 = v0 ^ 74187700623908L;
                    var20_2 = v0 ^ 40700457015221L;
                    _7V.f = new Object[96];
                    _7V.g = new String[96];
                    _7V.a();
                    _7V.d = new HashMap<K, V>(13);
                    var5_3 = Cipher.getInstance("DES/CBC/NoPadding");
                    v1 = SecretKeyFactory.getInstance("DES");
                    v2 = new byte[8];
                    v3 = v2;
                    v2[0] = (byte)(var16 >>> 56);
                    for (var6_4 = 1; var6_4 < 8; ++var6_4) {
                        v3 = v3;
                        v3[var6_4] = (byte)(var16 << var6_4 * 8 >>> 56);
                    }
                    var5_3.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                    var11_5 = new long[31];
                    var8_6 = 0;
                    var9_7 = "\u00c5\u00d4\u009d\u000b-^\u0017Y\u0088jl\u0085p\u00f80_\u00a8\u008e\u001f\u0005\u00d6\u00e7\u008a?\u00d7\u0004\\\u00d6j\u00a6\r\u000b\u00bf\u00e3\u0019OI\u00fd\u0094T\u00d9\u009c\u00d9.\u008a\u00dd\u001f\u00cc\u00fd\u0007\u00df\u00ff\u00dc\u009d+\u00f3\u00e6\u00b4\u0080~&HH\u0002_X\u00d3\\\u00f53\u008f\u0013\u0013\u00db1\u00b4\u00a8\u00cc.\u000f\u001a\u00d2\u00fc6V\u00c8G,#\u00fa\u001c\u00c4\u00f2MZ\u00be\u00d3\u00a3\u0011\u00c9ax\u000f?X\u0001\u00e6\u00d9\u009d\u0011s\u00a5N\u00f9\u00fe\u00b1\u0003\u00d0\bH\r\f@=\u00a8\u00a6\u0015\u000bx @\u00f2 \u00bc\u00c2\u00db\u00f2\u00daOmy\u008e\u00f5\u0094\u00d1\u00c6\u00f3\rB\u00d4J\u001c\u00a2\u008d\u00b2\u0098~\u0095\u00d6=4\u0002r\u00ec\u0099A\u00a4\u00f6\u00e2#\u00d8\u0007|\u008b\u00be\fm\u0097\u00d1\u00b9:\u0002(\u001a\u00bb\u00be\u00d1\u00bb\u009eK\u00feo6*\u00a8\u00e6\u0003q\u00c6\u00c0\u0005S\u00f1\u00b1M?\u00c3\u0003\u009e~[\u00cd[X\u0086\u000f\u00e0)=\u009d\r\u00a2\u0016\u0014\u0091\u00a7\f\u00cc\u00a8U\u0005\u00b6";
                    var10_8 = "\u00c5\u00d4\u009d\u000b-^\u0017Y\u0088jl\u0085p\u00f80_\u00a8\u008e\u001f\u0005\u00d6\u00e7\u008a?\u00d7\u0004\\\u00d6j\u00a6\r\u000b\u00bf\u00e3\u0019OI\u00fd\u0094T\u00d9\u009c\u00d9.\u008a\u00dd\u001f\u00cc\u00fd\u0007\u00df\u00ff\u00dc\u009d+\u00f3\u00e6\u00b4\u0080~&HH\u0002_X\u00d3\\\u00f53\u008f\u0013\u0013\u00db1\u00b4\u00a8\u00cc.\u000f\u001a\u00d2\u00fc6V\u00c8G,#\u00fa\u001c\u00c4\u00f2MZ\u00be\u00d3\u00a3\u0011\u00c9ax\u000f?X\u0001\u00e6\u00d9\u009d\u0011s\u00a5N\u00f9\u00fe\u00b1\u0003\u00d0\bH\r\f@=\u00a8\u00a6\u0015\u000bx @\u00f2 \u00bc\u00c2\u00db\u00f2\u00daOmy\u008e\u00f5\u0094\u00d1\u00c6\u00f3\rB\u00d4J\u001c\u00a2\u008d\u00b2\u0098~\u0095\u00d6=4\u0002r\u00ec\u0099A\u00a4\u00f6\u00e2#\u00d8\u0007|\u008b\u00be\fm\u0097\u00d1\u00b9:\u0002(\u001a\u00bb\u00be\u00d1\u00bb\u009eK\u00feo6*\u00a8\u00e6\u0003q\u00c6\u00c0\u0005S\u00f1\u00b1M?\u00c3\u0003\u009e~[\u00cd[X\u0086\u000f\u00e0)=\u009d\r\u00a2\u0016\u0014\u0091\u00a7\f\u00cc\u00a8U\u0005\u00b6".length();
                    var7_9 = 0;
                    while (true) {
                        var12_10 = var9_7.substring(var7_9, var7_9 += 8).getBytes("ISO-8859-1");
                        v4 = var11_5;
                        v5 = var8_6++;
                        v6 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
                        v7 = -1;
                        break block10;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        v4[v5] = v8;
                        if (var7_9 < var10_8) ** continue;
                        var9_7 = "\u00e89@m\u00c83\u00cf\u00d5{U\r\u0096\u00de\u0089B\u0084";
                        var10_8 = "\u00e89@m\u00c83\u00cf\u00d5{U\r\u0096\u00de\u0089B\u0084".length();
                        var7_9 = 0;
                        while (true) {
                            var12_10 = var9_7.substring(var7_9, var7_9 += 8).getBytes("ISO-8859-1");
                            v4 = var11_5;
                            v5 = var8_6++;
                            v6 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
                            v7 = 0;
                            break block10;
                            break;
                        }
                        break;
                    }
lbl45:
                    // 1 sources

                    while (true) {
                        v4[v5] = v8;
                        if (var7_9 < var10_8) ** continue;
                        break block11;
                        break;
                    }
                }
                var13_11 = v6;
                var15_12 = var5_3.doFinal(new byte[]{(byte)(var13_11 >>> 56), (byte)(var13_11 >>> 48), (byte)(var13_11 >>> 40), (byte)(var13_11 >>> 32), (byte)(var13_11 >>> 24), (byte)(var13_11 >>> 16), (byte)(var13_11 >>> 8), (byte)var13_11});
                v8 = ((long)var15_12[0] & 255L) << 56 | ((long)var15_12[1] & 255L) << 48 | ((long)var15_12[2] & 255L) << 40 | ((long)var15_12[3] & 255L) << 32 | ((long)var15_12[4] & 255L) << 24 | ((long)var15_12[5] & 255L) << 16 | ((long)var15_12[6] & 255L) << 8 | (long)var15_12[7] & 255L;
                switch (v7) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl58:
                    // 1 sources

                    ** continue;
                }
            }
            _7V.b = var11_5;
            _7V.c = new Integer[31];
            _7V.cfr_renamed_5 = (int)_7V.a("n", (int)4860, (long)(var16 ^ 8198452173336538511L));
            var0_13 = Cipher.getInstance("DES/CBC/NoPadding");
            v9 = SecretKeyFactory.getInstance("DES");
            v10 = new byte[8];
            v11 = v10;
            v10[0] = (byte)(var16 >>> 56);
            for (var1_14 = 1; var1_14 < 8; ++var1_14) {
                v11 = v11;
                v11[var1_14] = (byte)(var16 << var1_14 * 8 >>> 56);
            }
            break block12;
lbl73:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_13.init(2, (Key)v9.generateSecret(new DESKeySpec(v11)), new IvParameterSpec(new byte[8]));
        var2_15 = -182074065563563919L;
        var4_16 = var0_13.doFinal(new byte[]{(byte)(var2_15 >>> 56), (byte)(var2_15 >>> 48), (byte)(var2_15 >>> 40), (byte)(var2_15 >>> 32), (byte)(var2_15 >>> 24), (byte)(var2_15 >>> 16), (byte)(var2_15 >>> 8), (byte)var2_15});
        ** while (true)
        _7V.e = ((long)var4_16[0] & 255L) << 56 | ((long)var4_16[1] & 255L) << 48 | ((long)var4_16[2] & 255L) << 40 | ((long)var4_16[3] & 255L) << 32 | ((long)var4_16[4] & 255L) << 24 | ((long)var4_16[5] & 255L) << 16 | ((long)var4_16[6] & 255L) << 8 | (long)var4_16[7] & 255L;
        _7V.cfr_renamed_0 = new _8B((int)_7V.a("n", (int)27308, (long)(5480352962203620811L ^ var16)), (int)_7V.a("n", (int)29002, (long)(6534940268064837169L ^ var16)), var18_1, (int)_7V.a("n", (int)14823, (long)(5131406413382305433L ^ var16)), (int)_7V.a("n", (int)12659, (long)(4355657403970604574L ^ var16)));
        _7V.cfr_renamed_2 = new _8B((int)_7V.a("n", (int)31971, (long)(3191015361680704387L ^ var16)), var20_2, (int)_7V.a("n", (int)72, (long)(21210140478897976L ^ var16)), (int)_7V.a("n", (int)72, (long)(21210140478897976L ^ var16)));
        _7V.cfr_renamed_4 = new _8B((int)_7V.a("n", (int)7968, (long)(1447233660304515139L ^ var16)), (int)_7V.a("n", (int)5941, (long)(5785250449002784855L ^ var16)), var18_1, (int)_7V.a("n", (int)915, (long)(666947179975015658L ^ var16)), (int)_7V.a("n", (int)373, (long)(8354834347573673500L ^ var16)));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean boolean_9(Object[] var1_1) {
        block27: {
            block28: {
                block29: {
                    block30: {
                        block31: {
                            block24: {
                                block25: {
                                    block26: {
                                        block22: {
                                            block23: {
                                                var2_2 = (Long)var1_1[0];
                                                var4_3 = (class_11905)var1_1[1];
                                                v0 = var2_2 = _7V.a ^ var2_2;
                                                var5_4 = v0 ^ 82334316058552L;
                                                var7_5 = v0 ^ 125531431447885L;
                                                var9_6 = v0 ^ 24187741282516L;
                                                var11_7 = _9M.cfr_renamed_3();
                                                try {
                                                    try {
                                                        v1 /* !! */  = _7V.b("\u00ee", (Object)this, (long)7748300673805645738L, (long)var2_2);
                                                        if (var11_7 != 0) break block22;
                                                        if (v1 /* !! */  != false) break block23;
                                                    }
                                                    catch (MatchException v2) {
                                                        throw _7V.a(v2);
                                                    }
                                                    return false;
                                                }
                                                catch (MatchException v3) {
                                                    throw _7V.a(v3);
                                                }
                                            }
                                            v4 = new Object[1];
                                            v4[0] = var7_5;
                                            _7V.b("\u00e0", (Object)this, (Object)v4, (long)7753786403328971121L, (long)var2_2);
                                            v5 = new Object[1];
                                            v5[0] = var9_6;
                                            v1 /* !! */  = _7V.b("\u00e0", (Object)this, (Object)v5, (long)7747252791109689468L, (long)var2_2);
                                        }
                                        try {
                                            v6 /* !! */  = var11_7;
                                            if (var2_2 < 0L) ** GOTO lbl81
                                            if (v6 /* !! */  != 0) break block24;
                                            if (v1 /* !! */  != false) {
                                            }
                                            ** GOTO lbl66
                                        }
                                        catch (MatchException v7) {
                                            throw _7V.a(v7);
                                        }
                                        var12_8 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, (long)7753016840405901425L, (long)var2_2), (int)_7V.b("\u00ee", (Object)this, (long)7753217568997875010L, (long)var2_2), (long)7746715160560658559L, (long)var2_2);
                                        var13_9 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, (long)7753016840405901425L, (long)var2_2), (int)_7V.b("\u00ee", (Object)this, (long)7753217568997875010L, (long)var2_2), (long)7748061429615315513L, (long)var2_2);
                                        var14_10 = (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7748208107259047510L, (long)var2_2), (int)0, (int)var12_8, (long)7746970468119482090L, (long)var2_2) + (String)_7V.b("\u00e0", (Object)var4_3, (long)7746801089753499843L, (long)var2_2) + (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7748208107259047510L, (long)var2_2), (int)var13_9, (long)7747074764207178705L, (long)var2_2);
                                        try {
                                            try {
                                                v8 = var11_7;
                                                if (var2_2 > 0L) {
                                                    if (v8 != 0) break block25;
                                                    if (_7V.b("\u00e0", var14_10, (long)7753037788272485786L, (long)var2_2) <= _7V.b("\u00ee", (Object)this, (long)7755011004997105717L, (long)var2_2)) break block26;
                                                }
                                                ** GOTO lbl64
                                            }
                                            catch (MatchException v9) {
                                                throw _7V.a(v9);
                                            }
                                            return true;
                                        }
                                        catch (MatchException v10) {
                                            throw _7V.a(v10);
                                        }
                                    }
                                    _7V.b("\u00c7", (Object)this, (String)var14_10, (long)7748208107259047510L, (long)var2_2);
                                    _7V.b("\u00c7", (Object)this, (int)(var12_8 + true), (long)7753217568997875010L, (long)var2_2);
                                    _7V.b("\u00c7", (Object)this, (int)_7V.a("n", (int)1180, (long)(4043201421893109760L ^ var2_2)), (long)7753016840405901425L, (long)var2_2);
                                }
                                try {
                                    try {
                                        v8 = var11_7;
lbl64:
                                        // 2 sources

                                        if (var2_2 < 0L) break block27;
                                        if (v8 == 0) break block28;
lbl66:
                                        // 2 sources

                                        v11 = this;
                                        v12 /* !! */  = var11_7;
                                        if (var2_2 <= 0L) break block29;
                                        if (v12 /* !! */  != 0) break block30;
                                    }
                                    catch (MatchException v13) {
                                        throw _7V.a(v13);
                                    }
                                    v1 /* !! */  = _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v11, (long)7748208107259047510L, (long)var2_2), (long)7753037788272485786L, (long)var2_2);
                                }
                                catch (MatchException v14) {
                                    throw _7V.a(v14);
                                }
                            }
                            try {
                                block32: {
                                    if (var2_2 < 0L) break block32;
                                    v6 /* !! */  = (int)_7V.b("\u00ee", (Object)this, (long)7755011004997105717L, (long)var2_2);
lbl81:
                                    // 2 sources

                                    if (v1 /* !! */  < v6 /* !! */ ) break block31;
                                    v1 /* !! */  = (CallSite)true;
                                }
                                return (boolean)v1 /* !! */ ;
                            }
                            catch (MatchException v15) {
                                throw _7V.a(v15);
                            }
                        }
                        _7V.b("\u00c7", (Object)this, (String)((String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7748208107259047510L, (long)var2_2), (int)0, (int)_7V.b("\u00ee", (Object)this, (long)7753217568997875010L, (long)var2_2), (long)7746970468119482090L, (long)var2_2) + (String)_7V.b("\u00e0", (Object)var4_3, (long)7746801089753499843L, (long)var2_2) + (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7748208107259047510L, (long)var2_2), (int)_7V.b("\u00ee", (Object)this, (long)7753217568997875010L, (long)var2_2), (long)7747074764207178705L, (long)var2_2)), (long)7748208107259047510L, (long)var2_2);
                        v16 = this;
                    }
                    v11 = v16;
                    v12 /* !! */  = (int)(_7V.b("\u00ee", (Object)v16, (long)7753217568997875010L, (long)var2_2) + true);
                }
                _7V.b("\u00c7", (Object)v11, (int)v12 /* !! */ , (long)7753217568997875010L, (long)var2_2);
            }
            v17 = new Object[1];
            v17[0] = var5_4;
            _7V.b("\u00e0", (Object)this, (Object)v17, (long)7748392873166019475L, (long)var2_2);
            v8 = 1;
        }
        return (boolean)v8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void void_9(Object[] objectArray) {
        block17: {
            long l2;
            long l3;
            block18: {
                CallSite callSite;
                block15: {
                    String string;
                    block16: {
                        _7V v;
                        int n;
                        block10: {
                            block11: {
                                int n2;
                                block12: {
                                    block13: {
                                        String string2;
                                        CallSite callSite2;
                                        block14: {
                                            l3 = (Long)objectArray[0];
                                            long l4 = l3 = a ^ l3;
                                            l2 = l4 ^ 0x6F5A66EEE2C8L;
                                            long l5 = l4 ^ 0x304430FD95A4L;
                                            n = _9M.cfr_renamed_3();
                                            callSite = _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)_7V.b("B", -2384278785669094327L, (long)l3), -2383905850060901504L, (long)l3), -2382228043123397657L, (long)l3);
                                            try {
                                                v = this;
                                                if (n != 0) break block10;
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l5;
                                                if (_7V.b("\u00e0", (Object)v, (Object)objectArray2, -2381312497581255412L, (long)l3) == false) break block11;
                                            }
                                            catch (MatchException matchException) {
                                                throw _7V.a(matchException);
                                            }
                                            callSite2 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, -2384627386881387263L, (long)l3), (int)_7V.b("\u00ee", (Object)this, -2384422943017392078L, (long)l3), -2381847993404990193L, (long)l3);
                                            CallSite callSite3 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, -2384627386881387263L, (long)l3), (int)_7V.b("\u00ee", (Object)this, -2384422943017392078L, (long)l3), -2380573059956867255L, (long)l3);
                                            string2 = (String)((Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -2380416821321950426L, (long)l3), 0, (int)callSite2, -2381593708711396454L, (long)l3)) + (String)((Object)callSite) + (String)((Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -2380416821321950426L, (long)l3), (int)callSite3, -2381552320313690463L, (long)l3));
                                            try {
                                                n2 = n;
                                                if (l3 < 0L) break block12;
                                                if (n2 != 0) break block13;
                                                if (_7V.b("\u00e0", string2, -2384524675185192726L, (long)l3) <= _7V.b("\u00ee", (Object)this, -2382561638069875387L, (long)l3)) break block14;
                                            }
                                            catch (MatchException matchException) {
                                                throw _7V.a(matchException);
                                            }
                                            string2 = _7V.b("\u00e0", string2, 0, (int)_7V.b("\u00ee", (Object)this, -2382561638069875387L, (long)l3), -2381593708711396454L, (long)l3);
                                        }
                                        _7V.b("\u00c7", (Object)this, (String)string2, -2380416821321950426L, (long)l3);
                                        _7V.b("\u00c7", (Object)this, (int)_7V.b("B", (int)(callSite2 + _7V.b("\u00e0", (Object)callSite, -2384524675185192726L, (long)l3)), (int)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -2380416821321950426L, (long)l3), -2384524675185192726L, (long)l3), -2381847993404990193L, (long)l3), -2384422943017392078L, (long)l3);
                                        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", 1180, (long)(0x381C73FEEE0CBD70L ^ l3)), -2384627386881387263L, (long)l3);
                                    }
                                    if (l3 < 0L) break block17;
                                    n2 = n;
                                }
                                if (n2 == 0) break block18;
                            }
                            v = this;
                        }
                        string = (String)((Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v, -2380416821321950426L, (long)l3), 0, (int)_7V.b("\u00ee", (Object)this, -2384422943017392078L, (long)l3), -2381593708711396454L, (long)l3)) + (String)((Object)callSite) + (String)((Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -2380416821321950426L, (long)l3), (int)_7V.b("\u00ee", (Object)this, -2384422943017392078L, (long)l3), -2381552320313690463L, (long)l3));
                        try {
                            Object object = n;
                            if (l3 >= 0L) {
                                if (object != 0) break block15;
                                object = _7V.b("\u00e0", string, -2384524675185192726L, (long)l3);
                            }
                            if (object <= _7V.b("\u00ee", (Object)this, -2382561638069875387L, (long)l3)) break block16;
                        }
                        catch (MatchException matchException) {
                            throw _7V.a(matchException);
                        }
                        string = _7V.b("\u00e0", string, 0, (int)_7V.b("\u00ee", (Object)this, -2382561638069875387L, (long)l3), -2381593708711396454L, (long)l3);
                    }
                    _7V.b("\u00c7", (Object)this, (String)string, -2380416821321950426L, (long)l3);
                }
                _7V.b("\u00c7", (Object)this, (int)_7V.b("B", (int)(_7V.b("\u00ee", (Object)this, -2384422943017392078L, (long)l3) + _7V.b("\u00e0", (Object)callSite, -2384524675185192726L, (long)l3)), (int)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -2380416821321950426L, (long)l3), -2384524675185192726L, (long)l3), -2381847993404990193L, (long)l3), -2384422943017392078L, (long)l3);
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            _7V.b("\u00e0", (Object)this, (Object)objectArray3, -2380161231832142109L, (long)l3);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7V" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _7V.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _7V.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _7V.a(l2, l3);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                _7V.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _7V.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _7V.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _7V.a(l2, l3);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = _7V.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _7V.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _7V.a(clazz3, string2, clazz2)) != null) {
                    _7V.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _7V.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _7V.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _7V.b(3019239950838480L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _7V.a(l2, l3);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = _7V.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _7V.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _7V.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _7V.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _7V.b(3019239950838480L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _7V.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _7V.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _7V.b(3019239950838480L, 0L);
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

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6719;
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
                throw new RuntimeException("dev/krypton/7V", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _7V.c[n2] = n3;
        }
        return c[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0003d ]6L\bk1\u0012KT\u001bl8[";
        objectArray[1] = Integer.TYPE;
        _7V.g[1] = "java/lang/Integer";
        objectArray[2] = "8\u0014?Q\u0004[3\u001b.\u001egV&\u001d";
        objectArray[3] = "\u0002S\b&)N\u001fF\ng,\u0012Q`";
        objectArray[4] = Boolean.TYPE;
        _7V.g[4] = "java/lang/Boolean";
        objectArray[5] = "\bMO\u0007(Q}mD\b9\u001e\u001ccO\u0003=Dh";
        objectArray[6] = "Zo9Jx\u001cGz;\u000b}@\u0006=";
        objectArray[7] = "\u007f1';,8\n\u0011,4=wk\u001f'?9-\u001f";
        objectArray[8] = Void.TYPE;
        _7V.g[8] = "java/lang/Void";
        objectArray[9] = "%jK.9JPJ@!(\u00051DK*,_E";
        objectArray[10] = Double.TYPE;
        _7V.g[10] = "java/lang/Double";
        objectArray[11] = "J\u0000s\u0017g>W\u0015qVbb\u0017,";
        objectArray[12] = "\u000b1O\u0019pb~\u0011D\u0016a-\u001f\u001fO\u001dewk";
        objectArray[13] = "a\u000bw+El|\u001euj@0=,";
        objectArray[14] = "Lk\u0014\n\u000b\u00159K\u001f\u0005\u001aZXE\u0014\u000e\u001e\u0000,";
        objectArray[15] = Character.TYPE;
        _7V.g[15] = "java/lang/Character";
        objectArray[16] = "\nhh\u000f\u0002?\u0001gy@o;\u0001{\u007f\rX6\u0012";
        objectArray[17] = "6)\u0019\u0000\byC\t\u0012\u000f\u00196\"\u0007\u0019\u0004\u001dlV";
        objectArray[18] = "l?P6\u0000F\u0019\u001f[9\u0011\tx\u0011P2\u0015S\f";
        objectArray[19] = "N~uX\u0012q;^~W\u0003>ZPu\\\u0007d.";
        objectArray[20] = "\fq\u001f\\\n2\u0007~\u000e\u0013w'\u0015d\fP";
        objectArray[21] = Long.TYPE;
        _7V.g[21] = "java/lang/Long";
        objectArray[22] = "M.D\u0005\fAF!UJpXI!S\u0006NH";
        objectArray[23] = ";8U\u001d[TN\u0018^\u0012J\u001b/\u0016U\u0019NA[";
        objectArray[24] = "V\u000bI\u0011Xf#+B\u001eI)B%I\u0015Ms6";
        objectArray[25] = "(:FgB$]\u001aMhSk<\u0014FcW1H";
        objectArray[26] = ",_\u000e3R\u0012Y\u007f\u0005<C]8q\u000e7G\u0007L";
        objectArray[27] = "\\\u007f<P`\r)_7_qBHQ<Tu\u0018<";
        objectArray[28] = ":,tW\t(O\f\u007fX\u0018g.\u0002tS\u001c=Z";
        objectArray[29] = "p.]\r_\u0001p.JQS\u000ejeJOS\u001bm\u0014\u0018\u0012\u000bX&";
        objectArray[30] = "0h\u0001v\u0018qEH\ny\t>$F\u0001r\rdP";
        objectArray[31] = "BWU_Q\\7w^P@\u0013VyU[DI\"";
        objectArray[32] = "jHc\\H4\u001fhhSY{~fcX]!\n";
        objectArray[33] = "x1\"\u0006hpx15Zd\u007fbz5Ddje\u000be\u00195";
        objectArray[34] = "?j\u0007tas?j\u0010(m|%!\u00106mi\"P@j5";
        objectArray[35] = ">Pq0D!>PflH.$\u001bfrH;#j4.\u001dy";
        objectArray[36] = "F\u000b\t\u0001$\fC\u001e\u0002\u0001/\u0017O\u000e@h\u0004=~";
        objectArray[37] = "\u000e](F0Q\u0005R9\t]U\u0005N\rBoH\u0001R=B";
        objectArray[38] = "7Ih\njJ7I\u007fVfE-\u0002\u007fHfP*s*\u00106\u0014";
        objectArray[39] = "\t~\u0010zz^\u0014k\u0012;\u007f\u0002_";
        objectArray[40] = "2ZDq0OGzO~!\u0000&tDu%ZR";
        objectArray[41] = "\u00152F-93\u00152Qq5<\u000fyQo5)\b\b\u00032mjN";
        objectArray[42] = "YLl\u001eg(RC}Q\u0006&YHy\u000b";
        objectArray[43] = "T3@io;\u0012w\u0005o\u0014c\u0004?\u007f/)?]u\u000f<u7m5Bl$<\u001d&\u001ed\u0014|PvOodo\f~\u007f";
        objectArray[44] = "twv<F{1<n=+$N}q:W&+&t#\u0010";
        objectArray[45] = "\u0000b-+\tQE)5*d\f@R6!\u000fR^+?v\u0004";
        objectArray[46] = "w\tY3\"l2BA2O>19_%)w}\u0005\u001e&qeM\u0007\u001e,42'H^:3\u000e";
        objectArray[47] = "01\u000fJ^%*p\u0016O=z,a\u0019xPi\u000bb\u00177Prsp\\E[wt}fM\u0000,x5\u0016^\\$Hu[\u000e\r/8f\u0007\u0006=";
        objectArray[48] = "N.g\u0014\"\"\u000be\u007f\u0015Opt/yB!:Huu\u0017*";
        objectArray[49] = "E\u00106\f[c\u0000[.\r61! 0\u001aPxO\u001cq\u0019\bj\u007f\u001eq\u0013M=\u0015Q1\u0005J\u0001";
        objectArray[50] = "\t\u0017k;%)GV66\\sN(+/:0\u0005\u0014j,b\"5\u0016j&'u_Y*0 I";
        objectArray[51] = "hu9\u0000\"\u000bsq1\u0017A\u0017cm?\f-%7-aSA\u0015iz>\u000f8\u001c>q_";
        objectArray[52] = "=G\u0015+\u0000#l]Z4yt\u0002LP/\u0000x>\rSw\u0012H3T\u0010'\u0003tiXE,y";
        objectArray[53] = "t\u0010\u0006\u0007.\n1[\u001e\u0006CUNZ\u0001\f:Xr\u001b\u0002T(ht[\u0011\u0016|\r/^\bQC";
        objectArray[54] = "!oLl\u000e\\g+\tju\u0004yus*HX()\u00039\u0014P\u0018iNiE[hz\u0012au\u001b%*Cj\u0005\by\"s";
        objectArray[55] = "\\zT\u001a%(\u00191L\u001bHz\u0005JR\f.3Vv\u0013\u000fv!ft\u0013\u00053v\f;S\u00134J";
        objectArray[56] = "s4\u0013vK\u0001=uN{2^,\u000bSbT\u0018\u007f7\u0012a\f\nO5\u0012kI]%zR}Na";
        objectArray[57] = "[\\;*^YMNl7/]M_f<Co\u001f\u001f<a\u00118GDm:KAN\u0013f[";
        objectArray[58] = "?RNIy@6\u0005E(fD2NYR|_75_\u0015$\tbELI,9\"\b\u001c\u0018'I1T\u0014(z^3TAQs\t85";
        objectArray[59] = ")\u0014\u000ea)\u000fl_\u0016`D]\u0013^\tj=]/\u001f\n2/m)_\u0019p{\brZ\u00007D";
        objectArray[60] = "|'\u0015p@I9l\rq-\u0013Fm\u0012{T\u001bz,\u0011#F+<*P-\u0017[/vX\u001d";
        objectArray[61] = ".}2LuW'*9-jS#a%WpH&\u001a#\u0010(\u001esj0L ..}2LuW'*9-";
        objectArray[62] = ":N5!\u0007Q\u007f\u0005- j\u000f\u0000\u00042*\u0013\u0003<E1r\u00013:\u0005\"0UVa\u0000;wj";
        objectArray[63] = "\u0000HFS.QXOE\u001bK\u000b\nM\u001c\u0005'9[\rMZK\u0003\u0000\n\u0003X9\b\u0005\r\u000eb";
        objectArray[64] = "\u001f0|)\"\u0000\u0016gwH-\u0019\u0011-^4F\u0003En'r6\u0010\u0019f\u0017!;C\u0006(q&yF\u0007W";
        objectArray[65] = "WQ$uu:\u0012\u001a<t\u0018am\u001b#~ahQZ &sXSZ*c$2\u001c\u001a<d\u0018";
        objectArray[66] = "tZ5\u0002\u001a\u0018 \u0018!K|\u0002e%7\u000e\u0000\u000ed& >\u001d\f\u007f\u001dZ\u001b\u0001Y`\u001e<\u001cC\\aa`\t\u0017\u001f!\u0004;\f\u000eX\u001e";
        objectArray[67] = "\"KN\u0010:\u0014l\n\u0013\u001dCH\u001e\u000e\u000f\u0019:D\"O\fA(t \u0006I\u001e3\u000e`\u000b\t\u001bC";
        objectArray[68] = "H\u0005A\u000b`#\rNY\n\r~25Z\u0001f \u0016LSVm";
        objectArray[69] = "m<nA3Jdke 6HG>}\\&30 n\\hVk%w\u001bW";
        objectArray[70] = "\u0014\u0003SdA~QHKe, .IToU,\u0012\bW7G\u001cT\u000e\u00169\u0016lGR\u001e\t";
        objectArray[71] = "\u001b9Q$X\u0013\u00101V{!\u001c\u0003&[.vOXt\u0004~!H\u0019 C}D\u0013\u001c9\u0004";
        objectArray[72] = "i`/A`;yy=L\u0019<zm]\u001e\"4|77Qb\"{\u000b";
        objectArray[73] = "n_\u0005i\u001e\u001cv\u0019\u00193t\njB\u0019[H^<\u0018avIX=\u001d\u0011e\u0015P\r";
        objectArray[74] = "C!\u000e|PH\u0006j\u0016}=\u0015y\u007f\u0019c\\S\u0004o\u0000qQ";
        objectArray[75] = "(\u0011D~\u0005QmZ\\\u007fh\b\u0012\u001bCx\u0014\fw@FaS";
        objectArray[76] = "L36L\u000f\u0016\tx.MbHvyw\u0018RN\u0006j+\u0010";
        objectArray[77] = ",J\u001d^\u0015\u0011i\u0001\u0005_xN\u0016\u0000\u001aU\u0001C*A\u0019\r\u0013s(A\u0013HD\u0019g\u0001\u0005Ox";
        objectArray[78] = "s 58906k-9TmIj23-bu+1k?Rw+;.h88k-)T";
        objectArray[79] = "Uv\u000fm\u001aD\u0010=\u0017lw\u001eow\u0011;\u0019\\S-\u001dn\u0012";
        objectArray[80] = "\"4\u000fwve+c\u0004\u0016vq#<\u0018v\u0012fxjT,bu$bd";
        objectArray[81] = "l\u001b\bbq\u0010)P\u0010c\u001cCVQI6,H&B\u0015>";
        objectArray[82] = "\u0007(\u0006t&NBc\u001euK\u0013[\u0018\u0000$r\u001c\u0007h\u0013xz";
        objectArray[83] = "KR\u001c>\u0011\u0007S\u0014\u0000d{\u001fEV\u0018<\u0017-\u0017\u0016BaKzR\u0017AkA\nAKI[";
        objectArray[84] = "Z\u0005b{UJN\t1znKQ\u0013i!\u0002y\u0005R4\u007fnHV\u00044}\n\\ZW5F";
        objectArray[85] = "VGT\b\u0005\u000eL\u0006M\rfQJ\u0017B.\u000bBe\u001d\\\r\fYG\u0003Q.\u001aDO\u001fRu\u000bY\u0015\u0006\u0007\u0007\u0000\\\u0012\u000b=\fY\\HGX\u0015\u000f\u0001Wy\u0003N\u0014E\u0012\u0013L\u000e\u0002B.";
        objectArray[86] = "CUv2\\\u0004PKd%?\u0012R]p9Y\u0005sFo9z\u0018KCk/?\u0014H\u001cunM\u001fM\u001bxT";
        objectArray[87] = "V\u0002L9\u001cr\u0013IT8q!lHK2\b P\tHj\u001a\u0010R\tB/Mz\u001dIT(q";
        objectArray[88] = ")\u0005j\u0016\u000eQlNr\u0017c\t\u0013Xq@\u001c\taStG\u0011";
        objectArray[89] = "m\"dO}\u001by.7NF\u001af4o\u0015*(1r1B}\u007fl15C#@466\u000bF";
        objectArray[90] = "\u001ew\u0010\u001fZ-[<\b\u001e7\u007fbG\u0016\tQ6\u0014{W\n\t$$yW\u0000LsN6\u0017\u0016KO";
        objectArray[91] = "?.WEq\b+\"\u0004DJ\u00028)X\u0014\u001dUf{\u0000x,\b?/_\u00017\f78";
        objectArray[92] = "\u0016f\u0018\u0012\u0011sS-\u0000\u0013|/,g\u0006D\u0012k\u0010=\n\u0011\u0019";
        objectArray[93] = "!(\u0015\u0004j$d*\u0019Z\u0014q\u0000O\u0014U\u007fu`+\u0000Y,t";
        objectArray[94] = "*sgj\"ed2:g[5\u00166&c\"5*w%;0\u0005(>`d+\u007fh3 a[";
        Object[] objectArray2 = objectArray;
        objectArray[95] = "Zu$Z\u0000\r\u0000yqQz\r\"\u0017.VA_\u0011+tZ\u0014T";
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 62;
            case 1 -> 6;
            case 2 -> 36;
            case 3 -> 48;
            case 4 -> 61;
            case 5 -> 2;
            case 6 -> 0;
            case 7 -> 44;
            case 8 -> 34;
            case 9 -> 50;
            case 10 -> 59;
            case 11 -> 28;
            case 12 -> 60;
            case 13 -> 15;
            case 14 -> 21;
            case 15 -> 1;
            case 16 -> 22;
            case 17 -> 46;
            case 18 -> 45;
            case 19 -> 56;
            case 20 -> 35;
            case 21 -> 18;
            case 22 -> 11;
            case 23 -> 37;
            case 24 -> 7;
            case 25 -> 55;
            case 26 -> 27;
            case 27 -> 31;
            case 28 -> 4;
            case 29 -> 57;
            case 30 -> 3;
            case 31 -> 17;
            case 32 -> 53;
            case 33 -> 47;
            case 34 -> 52;
            case 35 -> 32;
            case 36 -> 13;
            case 37 -> 25;
            case 38 -> 10;
            case 39 -> 8;
            case 40 -> 19;
            case 41 -> 23;
            case 42 -> 49;
            case 43 -> 41;
            case 44 -> 42;
            case 45 -> 40;
            case 46 -> 12;
            case 47 -> 54;
            case 48 -> 33;
            case 49 -> 30;
            case 50 -> 24;
            case 51 -> 5;
            case 52 -> 14;
            case 53 -> 16;
            case 54 -> 63;
            case 55 -> 26;
            case 56 -> 39;
            case 57 -> 9;
            case 58 -> 38;
            case 59 -> 43;
            case 60 -> 51;
            case 61 -> 29;
            case 62 -> 20;
            default -> 58;
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
        _7V.g[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7V" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _7V.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == '\u00c7' || c == '\u00df' || c == 'r') {
                field = _7V.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _7V.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _7V.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    /*
     * Exception decompiling
     */
    private int int_0(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    public void void_0(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _7V.b("\u00c7", (Object)this, (boolean)bl, 9035678693984100680L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean boolean_0(Object[] var1_1) {
        block179: {
            block177: {
                block178: {
                    block169: {
                        block170: {
                            block171: {
                                block172: {
                                    block176: {
                                        block173: {
                                            block174: {
                                                block175: {
                                                    block161: {
                                                        block162: {
                                                            block163: {
                                                                block164: {
                                                                    block168: {
                                                                        block165: {
                                                                            block166: {
                                                                                block167: {
                                                                                    block152: {
                                                                                        block153: {
                                                                                            block156: {
                                                                                                block157: {
                                                                                                    block159: {
                                                                                                        block160: {
                                                                                                            block158: {
                                                                                                                block154: {
                                                                                                                    block155: {
                                                                                                                        block143: {
                                                                                                                            block144: {
                                                                                                                                block147: {
                                                                                                                                    block148: {
                                                                                                                                        block150: {
                                                                                                                                            block151: {
                                                                                                                                                block149: {
                                                                                                                                                    block145: {
                                                                                                                                                        block146: {
                                                                                                                                                            block139: {
                                                                                                                                                                block141: {
                                                                                                                                                                    block142: {
                                                                                                                                                                        block140: {
                                                                                                                                                                            block135: {
                                                                                                                                                                                block137: {
                                                                                                                                                                                    block138: {
                                                                                                                                                                                        block136: {
                                                                                                                                                                                            block131: {
                                                                                                                                                                                                block133: {
                                                                                                                                                                                                    block134: {
                                                                                                                                                                                                        block132: {
                                                                                                                                                                                                            block127: {
                                                                                                                                                                                                                block129: {
                                                                                                                                                                                                                    block130: {
                                                                                                                                                                                                                        block128: {
                                                                                                                                                                                                                            block125: {
                                                                                                                                                                                                                                block126: {
                                                                                                                                                                                                                                    block123: {
                                                                                                                                                                                                                                        block124: {
                                                                                                                                                                                                                                            var4_2 = (class_11908)var1_1[0];
                                                                                                                                                                                                                                            var2_3 = (Long)var1_1[1];
                                                                                                                                                                                                                                            v0 = var2_3 = _7V.a ^ var2_3;
                                                                                                                                                                                                                                            var5_4 = v0 ^ 138913816301545L;
                                                                                                                                                                                                                                            var7_5 = v0 ^ 123562216945344L;
                                                                                                                                                                                                                                            var9_6 = v0 ^ 106968250001452L;
                                                                                                                                                                                                                                            var11_7 = v0 ^ 5766020597696L;
                                                                                                                                                                                                                                            var13_8 = v0 ^ 51213129309088L;
                                                                                                                                                                                                                                            var15_9 = v0 ^ 24574186561877L;
                                                                                                                                                                                                                                            var17_10 = v0 ^ 43090041666127L;
                                                                                                                                                                                                                                            var19_11 = v0 ^ 90326565979597L;
                                                                                                                                                                                                                                            var21_12 = v0 ^ 16448349463856L;
                                                                                                                                                                                                                                            var23_13 = v0 ^ 60739151139175L;
                                                                                                                                                                                                                                            var25_14 = _9M.cfr_renamed_0();
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    v1 = _7V.b("\u00ee", (Object)this, (long)7466715410819382194L, (long)var2_3);
                                                                                                                                                                                                                                                    if (var25_14 == 0) break block123;
                                                                                                                                                                                                                                                    if (v1 != false) break block124;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (MatchException v2) {
                                                                                                                                                                                                                                                    throw _7V.a(v2);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (MatchException v3) {
                                                                                                                                                                                                                                                throw _7V.a(v3);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        v4 = new Object[1];
                                                                                                                                                                                                                                        v4[0] = var15_9;
                                                                                                                                                                                                                                        _7V.b("\u00e0", (Object)this, (Object)v4, (long)7458699670146342249L, (long)var2_3);
                                                                                                                                                                                                                                        v1 = _7V.b("\u00e0", (Object)var4_2, (long)7458217199051973150L, (long)var2_3);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var26_15 = v1;
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v5 = _7V.b("\u00e0", (Object)var4_2, (long)7459735464621222428L, (long)var2_3) & 1;
                                                                                                                                                                                                                                        if (var25_14 == 0) break block125;
                                                                                                                                                                                                                                        if (!v5) break block126;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (MatchException v6) {
                                                                                                                                                                                                                                        throw _7V.a(v6);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    v5 = true;
                                                                                                                                                                                                                                    break block125;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                v5 = false;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var27_16 = v5;
                                                                                                                                                                                                                            v7 = new Object[1];
                                                                                                                                                                                                                            v7[0] = var11_7;
                                                                                                                                                                                                                            var28_17 = _7V.b("B", (Object)v7, (long)7465132334540524799L, (long)var2_3);
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            v8 /* !! */  = var26_15;
                                                                                                                                                                                                                                            v9 /* !! */  = _7V.a("n", (int)4033, (long)(6039514063514242891L ^ var2_3));
                                                                                                                                                                                                                                            v10 = var25_14;
                                                                                                                                                                                                                                            if (var2_3 >= 0L) {
                                                                                                                                                                                                                                                if (v10 == 0) break block127;
                                                                                                                                                                                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block128;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            ** GOTO lbl95
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (MatchException v11) {
                                                                                                                                                                                                                                            throw _7V.a(v11);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        v8 /* !! */  = var28_17;
                                                                                                                                                                                                                                        v12 = var25_14;
                                                                                                                                                                                                                                        if (var2_3 < 0L) break block129;
                                                                                                                                                                                                                                        if (v12 == 0) break block130;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (MatchException v13) {
                                                                                                                                                                                                                                        throw _7V.a(v13);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (v8 /* !! */  == false) break block128;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (MatchException v14) {
                                                                                                                                                                                                                                    throw _7V.a(v14);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                _7V.b("\u00c7", (Object)this, (int)_7V.a("n", (int)28335, (long)(3617409692358766135L ^ var2_3)), (long)7458061928511564905L, (long)var2_3);
                                                                                                                                                                                                                                _7V.b("\u00c7", (Object)this, (int)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (long)7458021149174229378L, (long)var2_3), (long)7458121782032568666L, (long)var2_3);
                                                                                                                                                                                                                                return true;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (MatchException v15) {
                                                                                                                                                                                                                                throw _7V.a(v15);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v8 /* !! */  = var26_15;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v12 = 4407;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v9 /* !! */  = _7V.a("n", (int)v12, (long)(4309981621218480567L ^ var2_3));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            v10 = var25_14;
lbl95:
                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                            if (var2_3 > 0L) {
                                                                                                                                                                                                                                if (v10 == 0) break block131;
                                                                                                                                                                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block132;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            ** GOTO lbl132
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (MatchException v16) {
                                                                                                                                                                                                                            throw _7V.a(v16);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v8 /* !! */  = var28_17;
                                                                                                                                                                                                                        v17 = var25_14;
                                                                                                                                                                                                                        if (var2_3 <= 0L) break block133;
                                                                                                                                                                                                                        if (v17 == 0) break block134;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (MatchException v18) {
                                                                                                                                                                                                                        throw _7V.a(v18);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (v8 /* !! */  == false) break block132;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (MatchException v19) {
                                                                                                                                                                                                                    throw _7V.a(v19);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v20 = new Object[1];
                                                                                                                                                                                                                v20[0] = var19_11;
                                                                                                                                                                                                                _7V.b("\u00e0", (Object)this, (Object)v20, (long)7464852865870911034L, (long)var2_3);
                                                                                                                                                                                                                return true;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (MatchException v21) {
                                                                                                                                                                                                                throw _7V.a(v21);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v8 /* !! */  = var26_15;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v17 = 32013;
                                                                                                                                                                                                }
                                                                                                                                                                                                v9 /* !! */  = _7V.a("n", (int)v17, (long)(7522752751870770587L ^ var2_3));
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            v10 = var25_14;
lbl132:
                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                            if (var2_3 > 0L) {
                                                                                                                                                                                                                if (v10 == 0) break block135;
                                                                                                                                                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block136;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            ** GOTO lbl169
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (MatchException v22) {
                                                                                                                                                                                                            throw _7V.a(v22);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v8 /* !! */  = var28_17;
                                                                                                                                                                                                        v23 = var25_14;
                                                                                                                                                                                                        if (var2_3 <= 0L) break block137;
                                                                                                                                                                                                        if (v23 == 0) break block138;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (MatchException v24) {
                                                                                                                                                                                                        throw _7V.a(v24);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (v8 /* !! */  == false) break block136;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (MatchException v25) {
                                                                                                                                                                                                    throw _7V.a(v25);
                                                                                                                                                                                                }
                                                                                                                                                                                                v26 = new Object[1];
                                                                                                                                                                                                v26[0] = var21_12;
                                                                                                                                                                                                _7V.b("\u00e0", (Object)this, (Object)v26, (long)7465218188609852668L, (long)var2_3);
                                                                                                                                                                                                return true;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (MatchException v27) {
                                                                                                                                                                                                throw _7V.a(v27);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        v8 /* !! */  = var26_15;
                                                                                                                                                                                    }
                                                                                                                                                                                    v23 = 28773;
                                                                                                                                                                                }
                                                                                                                                                                                v9 /* !! */  = _7V.a("n", (int)v23, (long)(3339652213107716345L ^ var2_3));
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            v10 = var25_14;
lbl169:
                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                            if (var2_3 >= 0L) {
                                                                                                                                                                                                if (v10 == 0) break block139;
                                                                                                                                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block140;
                                                                                                                                                                                            }
                                                                                                                                                                                            ** GOTO lbl206
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v28) {
                                                                                                                                                                                            throw _7V.a(v28);
                                                                                                                                                                                        }
                                                                                                                                                                                        v8 /* !! */  = var28_17;
                                                                                                                                                                                        v29 = var25_14;
                                                                                                                                                                                        if (var2_3 < 0L) break block141;
                                                                                                                                                                                        if (v29 == 0) break block142;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v30) {
                                                                                                                                                                                        throw _7V.a(v30);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v8 /* !! */  == false) break block140;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v31) {
                                                                                                                                                                                    throw _7V.a(v31);
                                                                                                                                                                                }
                                                                                                                                                                                v32 = new Object[1];
                                                                                                                                                                                v32[0] = var23_13;
                                                                                                                                                                                _7V.b("\u00e0", (Object)this, (Object)v32, (long)7458523040003190310L, (long)var2_3);
                                                                                                                                                                                return true;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v33) {
                                                                                                                                                                                throw _7V.a(v33);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v8 /* !! */  = var26_15;
                                                                                                                                                                    }
                                                                                                                                                                    v29 = 30569;
                                                                                                                                                                }
                                                                                                                                                                v9 /* !! */  = _7V.a("n", (int)v29, (long)(7138204671507691506L ^ var2_3));
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            v10 = var25_14;
lbl206:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            if (var2_3 >= 0L) {
                                                                                                                                                                                if (v10 == 0) break block143;
                                                                                                                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block144;
                                                                                                                                                                            }
                                                                                                                                                                            ** GOTO lbl296
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v34) {
                                                                                                                                                                            throw _7V.a(v34);
                                                                                                                                                                        }
                                                                                                                                                                        v35 = new Object[1];
                                                                                                                                                                        v35[0] = var7_5;
                                                                                                                                                                        v36 /* !! */  = _7V.b("\u00e0", (Object)this, (Object)v35, (long)7465535901124154857L, (long)var2_3);
                                                                                                                                                                        v37 = var25_14;
                                                                                                                                                                        if (var2_3 > 0L) {
                                                                                                                                                                            if (v37 == 0) break block145;
                                                                                                                                                                        }
                                                                                                                                                                        ** GOTO lbl239
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v38) {
                                                                                                                                                                        throw _7V.a(v38);
                                                                                                                                                                    }
                                                                                                                                                                    if (v36 /* !! */  == false) break block146;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v39) {
                                                                                                                                                                    throw _7V.a(v39);
                                                                                                                                                                }
                                                                                                                                                                return true;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v40) {
                                                                                                                                                                throw _7V.a(v40);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v36 /* !! */  = _7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    v37 = var25_14;
lbl239:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    if (v37 == 0) break block147;
                                                                                                                                                                    if (v36 /* !! */  <= 0) break block148;
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v41) {
                                                                                                                                                                    throw _7V.a(v41);
                                                                                                                                                                }
                                                                                                                                                                v42 = var28_17;
                                                                                                                                                                if (var25_14 == 0) break block149;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v43) {
                                                                                                                                                                throw _7V.a(v43);
                                                                                                                                                            }
                                                                                                                                                            if (v42 != false) {
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl270
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v44) {
                                                                                                                                                            throw _7V.a(v44);
                                                                                                                                                        }
                                                                                                                                                        v45 = new Object[2];
                                                                                                                                                        v45[1] = var5_4;
                                                                                                                                                        v45[0] = (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                                                                                                        v42 = _7V.b("\u00e0", (Object)this, (Object)v45, (long)7465596681109476981L, (long)var2_3);
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v46) {
                                                                                                                                                        throw _7V.a(v46);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var29_18 = v42;
                                                                                                                                                try {
                                                                                                                                                    _7V.b("\u00c7", (Object)this, (String)((String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)0, (int)var29_18, (long)7465456261257757426L, (long)var2_3) + (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3), (long)7465638880260018121L, (long)var2_3)), (long)7466772790313624142L, (long)var2_3);
                                                                                                                                                    v47 = this;
                                                                                                                                                    if (var2_3 < 0L) break block150;
                                                                                                                                                    _7V.b("\u00c7", (Object)v47, (int)var29_18, (long)7458121782032568666L, (long)var2_3);
                                                                                                                                                    if (var25_14 != 0) break block151;
lbl270:
                                                                                                                                                    // 2 sources

                                                                                                                                                    _7V.b("\u00c7", (Object)this, (String)((String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)0, (int)(_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3) - true), (long)7465456261257757426L, (long)var2_3) + (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3), (long)7465638880260018121L, (long)var2_3)), (long)7466772790313624142L, (long)var2_3);
                                                                                                                                                    v48 = this;
                                                                                                                                                    _7V.b("\u00c7", (Object)v48, (int)(_7V.b("\u00ee", (Object)v48, (long)7458121782032568666L, (long)var2_3) - true), (long)7458121782032568666L, (long)var2_3);
                                                                                                                                                }
                                                                                                                                                catch (MatchException v49) {
                                                                                                                                                    throw _7V.a(v49);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v47 = this;
                                                                                                                                        }
                                                                                                                                        v50 = new Object[1];
                                                                                                                                        v50[0] = var13_8;
                                                                                                                                        _7V.b("\u00e0", (Object)v47, (Object)v50, (long)7466887033050535819L, (long)var2_3);
                                                                                                                                    }
                                                                                                                                    v36 /* !! */  = (CallSite)true;
                                                                                                                                }
                                                                                                                                return (boolean)v36 /* !! */ ;
                                                                                                                            }
                                                                                                                            v8 /* !! */  = var26_15;
                                                                                                                            v9 /* !! */  = _7V.a("n", (int)3024, (long)(988565138930600786L ^ var2_3));
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v10 = var25_14;
lbl296:
                                                                                                                                        // 2 sources

                                                                                                                                        if (var2_3 >= 0L) {
                                                                                                                                            if (v10 == 0) break block152;
                                                                                                                                            if (v8 /* !! */  != v9 /* !! */ ) break block153;
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl387
                                                                                                                                    }
                                                                                                                                    catch (MatchException v51) {
                                                                                                                                        throw _7V.a(v51);
                                                                                                                                    }
                                                                                                                                    v52 = new Object[1];
                                                                                                                                    v52[0] = var7_5;
                                                                                                                                    v53 /* !! */  = _7V.b("\u00e0", (Object)this, (Object)v52, (long)7465535901124154857L, (long)var2_3);
                                                                                                                                    v54 /* !! */  = var25_14;
                                                                                                                                    if (var2_3 > 0L) {
                                                                                                                                        if (v54 /* !! */  == 0) break block154;
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl329
                                                                                                                                }
                                                                                                                                catch (MatchException v55) {
                                                                                                                                    throw _7V.a(v55);
                                                                                                                                }
                                                                                                                                if (v53 /* !! */  == false) break block155;
                                                                                                                            }
                                                                                                                            catch (MatchException v56) {
                                                                                                                                throw _7V.a(v56);
                                                                                                                            }
                                                                                                                            return true;
                                                                                                                        }
                                                                                                                        catch (MatchException v57) {
                                                                                                                            throw _7V.a(v57);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v53 /* !! */  = _7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v54 /* !! */  = var25_14;
lbl329:
                                                                                                                                // 2 sources

                                                                                                                                if (var2_3 > 0L) {
                                                                                                                                    if (v54 /* !! */  == 0) break block156;
                                                                                                                                    v54 /* !! */  = (int)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (long)7458021149174229378L, (long)var2_3);
                                                                                                                                }
                                                                                                                                if (v53 /* !! */  >= v54 /* !! */ ) break block157;
                                                                                                                            }
                                                                                                                            catch (MatchException v58) {
                                                                                                                                throw _7V.a(v58);
                                                                                                                            }
                                                                                                                            v59 = var28_17;
                                                                                                                            if (var25_14 == 0) break block158;
                                                                                                                        }
                                                                                                                        catch (MatchException v60) {
                                                                                                                            throw _7V.a(v60);
                                                                                                                        }
                                                                                                                        if (v59 != false) {
                                                                                                                        }
                                                                                                                        ** GOTO lbl361
                                                                                                                    }
                                                                                                                    catch (MatchException v61) {
                                                                                                                        throw _7V.a(v61);
                                                                                                                    }
                                                                                                                    v62 = new Object[2];
                                                                                                                    v62[1] = (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                                                                    v62[0] = var9_6;
                                                                                                                    v59 = _7V.b("\u00e0", (Object)this, (Object)v62, (long)7459520621331205457L, (long)var2_3);
                                                                                                                }
                                                                                                                catch (MatchException v63) {
                                                                                                                    throw _7V.a(v63);
                                                                                                                }
                                                                                                            }
                                                                                                            var29_19 = v59;
                                                                                                            try {
                                                                                                                v64 = this;
                                                                                                                if (var2_3 < 0L) break block159;
                                                                                                                _7V.b("\u00c7", (Object)v64, (String)((String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)0, (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3), (long)7465456261257757426L, (long)var2_3) + (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)var29_19, (long)7465638880260018121L, (long)var2_3)), (long)7466772790313624142L, (long)var2_3);
                                                                                                                if (var25_14 != 0) break block160;
lbl361:
                                                                                                                // 2 sources

                                                                                                                _7V.b("\u00c7", (Object)this, (String)((String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)0, (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3), (long)7465456261257757426L, (long)var2_3) + (String)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (int)(_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3) + true), (long)7465638880260018121L, (long)var2_3)), (long)7466772790313624142L, (long)var2_3);
                                                                                                            }
                                                                                                            catch (MatchException v65) {
                                                                                                                throw _7V.a(v65);
                                                                                                            }
                                                                                                        }
                                                                                                        v64 = this;
                                                                                                    }
                                                                                                    v66 = new Object[1];
                                                                                                    v66[0] = var13_8;
                                                                                                    _7V.b("\u00e0", (Object)v64, (Object)v66, (long)7466887033050535819L, (long)var2_3);
                                                                                                }
                                                                                                v53 /* !! */  = (CallSite)true;
                                                                                            }
                                                                                            return (boolean)v53 /* !! */ ;
                                                                                        }
                                                                                        v8 /* !! */  = var26_15;
                                                                                        v9 /* !! */  = _7V.a("n", (int)11413, (long)(2397304281765587994L ^ var2_3));
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v10 = var25_14;
lbl387:
                                                                                                            // 2 sources

                                                                                                            if (var2_3 > 0L) {
                                                                                                                if (v10 == 0) break block161;
                                                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block162;
                                                                                                            }
                                                                                                            ** GOTO lbl451
                                                                                                        }
                                                                                                        catch (MatchException v67) {
                                                                                                            throw _7V.a(v67);
                                                                                                        }
                                                                                                        v68 = new Object[2];
                                                                                                        v68[1] = var27_16;
                                                                                                        v68[0] = var17_10;
                                                                                                        _7V.b("\u00e0", (Object)this, (Object)v68, (long)7460127807078912883L, (long)var2_3);
                                                                                                        v69 /* !! */  = _7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                                                        if (var25_14 == 0) break block163;
                                                                                                    }
                                                                                                    catch (MatchException v70) {
                                                                                                        throw _7V.a(v70);
                                                                                                    }
                                                                                                    if (v69 /* !! */  <= 0) break block164;
                                                                                                }
                                                                                                catch (MatchException v71) {
                                                                                                    throw _7V.a(v71);
                                                                                                }
                                                                                                v72 = this;
                                                                                                v73 = var28_17;
                                                                                                v74 = var25_14;
                                                                                                if (var2_3 <= 0L) break block165;
                                                                                                if (v74 == 0) break block166;
                                                                                            }
                                                                                            catch (MatchException v75) {
                                                                                                throw _7V.a(v75);
                                                                                            }
                                                                                            if (v73 == false) break block167;
                                                                                        }
                                                                                        catch (MatchException v76) {
                                                                                            throw _7V.a(v76);
                                                                                        }
                                                                                        v77 = new Object[2];
                                                                                        v77[1] = var5_4;
                                                                                        v77[0] = (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                                        v78 = _7V.b("\u00e0", (Object)this, (Object)v77, (long)7465596681109476981L, (long)var2_3);
                                                                                        break block168;
                                                                                    }
                                                                                    catch (MatchException v79) {
                                                                                        throw _7V.a(v79);
                                                                                    }
                                                                                }
                                                                                v73 = _7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                            }
                                                                            v74 = 1;
                                                                        }
                                                                        v78 = v73 - v74;
                                                                    }
                                                                    _7V.b("\u00c7", (Object)v72, (int)v78, (long)7458121782032568666L, (long)var2_3);
                                                                }
                                                                v69 /* !! */  = (CallSite)true;
                                                            }
                                                            return (boolean)v69 /* !! */ ;
                                                        }
                                                        v8 /* !! */  = var26_15;
                                                        v9 /* !! */  = _7V.a("n", (int)26829, (long)(3315011943954638924L ^ var2_3));
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v10 = var25_14;
lbl451:
                                                                            // 2 sources

                                                                            if (var2_3 >= 0L) {
                                                                                if (v10 == 0) break block169;
                                                                                if (v8 /* !! */  != v9 /* !! */ ) break block170;
                                                                            }
                                                                            ** GOTO lbl513
                                                                        }
                                                                        catch (MatchException v80) {
                                                                            throw _7V.a(v80);
                                                                        }
                                                                        v81 = new Object[2];
                                                                        v81[1] = var27_16;
                                                                        v81[0] = var17_10;
                                                                        _7V.b("\u00e0", (Object)this, (Object)v81, (long)7460127807078912883L, (long)var2_3);
                                                                        v82 /* !! */  = _7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                                        if (var25_14 == 0) break block171;
                                                                    }
                                                                    catch (MatchException v83) {
                                                                        throw _7V.a(v83);
                                                                    }
                                                                    if (v82 /* !! */  >= _7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (long)7458021149174229378L, (long)var2_3)) break block172;
                                                                }
                                                                catch (MatchException v84) {
                                                                    throw _7V.a(v84);
                                                                }
                                                                v85 = this;
                                                                v86 = var28_17;
                                                                v87 = var25_14;
                                                                if (var2_3 <= 0L) break block173;
                                                                if (v87 == 0) break block174;
                                                            }
                                                            catch (MatchException v88) {
                                                                throw _7V.a(v88);
                                                            }
                                                            if (v86 != false) {
                                                            }
                                                            break block175;
                                                        }
                                                        catch (MatchException v89) {
                                                            throw _7V.a(v89);
                                                        }
                                                        v90 = new Object[2];
                                                        v90[1] = (int)_7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                                        v90[0] = var9_6;
                                                        v91 = _7V.b("\u00e0", (Object)this, (Object)v90, (long)7459520621331205457L, (long)var2_3);
                                                        break block176;
                                                    }
                                                    catch (MatchException v92) {
                                                        throw _7V.a(v92);
                                                    }
                                                }
                                                v86 = _7V.b("\u00ee", (Object)this, (long)7458121782032568666L, (long)var2_3);
                                            }
                                            v87 = 1;
                                        }
                                        v91 = v86 + v87;
                                    }
                                    _7V.b("\u00c7", (Object)v85, (int)v91, (long)7458121782032568666L, (long)var2_3);
                                }
                                v82 /* !! */  = (CallSite)true;
                            }
                            return (boolean)v82 /* !! */ ;
                        }
                        v8 /* !! */  = var26_15;
                        v9 /* !! */  = _7V.a("n", (int)16693, (long)(567393625749078451L ^ var2_3));
                    }
                    try {
                        try {
                            if (var2_3 < 0L) break block177;
                            v10 = var25_14;
lbl513:
                            // 2 sources

                            if (v10 == 0) break block177;
                            if (v8 /* !! */  != v9 /* !! */ ) break block178;
                        }
                        catch (MatchException v93) {
                            throw _7V.a(v93);
                        }
                        v94 = new Object[2];
                        v94[1] = var27_16;
                        v94[0] = var17_10;
                        _7V.b("\u00e0", (Object)this, (Object)v94, (long)7460127807078912883L, (long)var2_3);
                        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", (int)2876, (long)(4428129662100442036L ^ var2_3)), (long)7458121782032568666L, (long)var2_3);
                        return true;
                    }
                    catch (MatchException v95) {
                        throw _7V.a(v95);
                    }
                }
                try {
                    v8 /* !! */  = var26_15;
                    v9 /* !! */  = (CallSite)var25_14;
                    if (var2_3 <= 0L) break block177;
                    if (v9 /* !! */  == false) break block179;
                    v9 /* !! */  = _7V.a("n", (int)27883, (long)(9207114659851380L ^ var2_3));
                }
                catch (MatchException v96) {
                    throw _7V.a(v96);
                }
            }
            try {
                if (v8 /* !! */  == v9 /* !! */ ) {
                    v97 = new Object[2];
                    v97[1] = var27_16;
                    v97[0] = var17_10;
                    _7V.b("\u00e0", (Object)this, (Object)v97, (long)7460127807078912883L, (long)var2_3);
                    _7V.b("\u00c7", (Object)this, (int)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, (long)7466772790313624142L, (long)var2_3), (long)7458021149174229378L, (long)var2_3), (long)7458121782032568666L, (long)var2_3);
                    return true;
                }
            }
            catch (MatchException v98) {
                throw _7V.a(v98);
            }
            v8 /* !! */  = (CallSite)false;
        }
        return (boolean)v8 /* !! */ ;
    }

    public int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_7V.b("\u00ee", (Object)this, 7329854966492664674L, (long)l2);
    }

    public void void_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _7V.b("\u00c7", (Object)this, (int)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, 4830199342222214873L, (long)l2), 4834377012857031957L, (long)l2), 4834487489587492301L, (long)l2);
        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", 1180, (long)(0x381C2CC86ECA208FL ^ l2)), 4834408798062037246L, (long)l2);
    }

    public void cfr_renamed_3(Object[] objectArray) {
        block5: {
            _7V v;
            String string;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                string = (String)objectArray[1];
                l2 = a ^ l2;
                _7V.b("\u00c7", (Object)this, (String)string, -5184084624683303457L, (long)l2);
                int n = _9M.cfr_renamed_0();
                _7V.b("\u00c7", (Object)this, (int)_7V.b("B", (int)_7V.b("\u00ee", (Object)this, -5183164934401667381L, (long)l2), (int)_7V.b("\u00e0", string, -5183337015785245165L, (long)l2), -5185726892278531082L, (long)l2), -5183164934401667381L, (long)l2);
                int n2 = n;
                try {
                    try {
                        v = this;
                        if (n2 == 0) break block4;
                        if (_7V.b("\u00ee", (Object)v, -5183226430882434056L, (long)l2) == -1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7V.a(matchException);
                    }
                    v = this;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            _7V.b("\u00c7", (Object)v, (int)_7V.b("B", (int)_7V.b("\u00ee", (Object)this, -5183226430882434056L, (long)l2), (int)_7V.b("\u00e0", string, -5183337015785245165L, (long)l2), -5185726892278531082L, (long)l2), -5183226430882434056L, (long)l2);
        }
    }

    public String java_lang_String_3(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _7V.b("\u00ee", (Object)this, -8674999722422779315L, (long)l2);
    }

    public void void_3(Object[] objectArray) {
        block13: {
            _7V v;
            long l2;
            double d;
            double d2;
            _87 var2_3;
            long l3;
            block11: {
                l3 = (Long)objectArray[0];
                var2_3 = (_87)objectArray[1];
                d2 = (Double)objectArray[2];
                d = (Double)objectArray[3];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x2D46F9ED55FDL;
                long l6 = l4 ^ 0x3B55E9EDE805L;
                l2 = l4 ^ 0x303D507A41BDL;
                int n = _9M.cfr_renamed_3();
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l5;
                                        _7V.b("\u00e0", (Object)this, (Object)objectArray2, -4942950515228871587L, (long)l3);
                                        v = this;
                                        if (n != 0) break block11;
                                        if (_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v, -4936169095212826962L, (long)l3), -4943516336662314587L, (long)l3) == false) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw _7V.a(matchException);
                                    }
                                    v = this;
                                    if (n != 0) break block11;
                                }
                                catch (MatchException matchException) {
                                    throw _7V.a(matchException);
                                }
                                if (l3 <= 0L) break block11;
                                if (_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)v, -4943404600546778993L, (long)l3), -4943516336662314587L, (long)l3) == false) {
                                }
                                break block12;
                            }
                            catch (MatchException matchException) {
                                throw _7V.a(matchException);
                            }
                            Object[] objectArray3 = new Object[5];
                            objectArray3[4] = _7V.b("\u00df", -4942804985077321034L, (long)l3);
                            objectArray3[3] = d;
                            objectArray3[2] = d2;
                            objectArray3[1] = _7V.b("\u00ee", (Object)this, -4943404600546778993L, (long)l3);
                            objectArray3[0] = l6;
                            _7V.b("\u00e0", (Object)var2_3, (Object)objectArray3, -4943668284784814344L, (long)l3);
                            if (n == 0) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _7V.a(matchException);
                        }
                    }
                    v = this;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            Object[] objectArray4 = new Object[4];
            objectArray4[3] = d;
            objectArray4[2] = d2;
            objectArray4[1] = var2_3;
            objectArray4[0] = l2;
            _7V.b("\u00e0", (Object)v, (Object)objectArray4, -4943763041571475293L, (long)l3);
        }
    }

    /*
     * Exception decompiling
     */
    private int int_4(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[DOLOOP]], but top level block is 3[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_4(Object[] objectArray) {
        Object object;
        block8: {
            Object object2;
            block7: {
                long l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                int n = _9M.cfr_renamed_0();
                try {
                    try {
                        try {
                            Object object2 = _7V.b("\u00ee", (Object)this, -2070709463036106582L, (long)l2);
                            object2 = -1;
                            if (n == 0) break block7;
                            if (object == object2) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _7V.a(matchException);
                        }
                        object = _7V.b("\u00ee", (Object)this, -2070709463036106582L, (long)l2);
                        if (n == 0) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw _7V.a(matchException);
                    }
                    object2 = _7V.b("\u00ee", (Object)this, -2070647270765947495L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            if (object != object2) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    public void void_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        Runnable runnable = (Runnable)objectArray[1];
        l2 = a ^ l2;
        _7V.b("\u00c7", (Object)this, (Runnable)runnable, -6054918712859691712L, (long)l2);
    }

    private static boolean boolean_5(Object[] objectArray) {
        Object object;
        long l2;
        block7: {
            CallSite callSite;
            block8: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                int n = _9M.cfr_renamed_0();
                callSite = _7V.b("\u00e0", (Object)_7V.b("\u00e0", (Object)_7V.b("\u00df", -4013787284538964072L, (long)l2), -4013539069723368231L, (long)l2), -4011393268047518815L, (long)l2);
                try {
                    try {
                        object = _7V.b("\u00df", -4014244077942883230L, (long)l2);
                        if (n == 0) break block7;
                        if (object == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw _7V.a(matchException);
                    }
                    object = _7V.b("B", (long)callSite, (int)_7V.a("n", 25261, (long)(0x5A055BB82F39CDF6L ^ l2)), -4012507952843860099L, (long)l2);
                    break block7;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            object = _7V.b("B", (long)callSite, (int)_7V.a("n", 24237, (long)(0x47FEFAB7EA0871FBL ^ l2)), -4012507952843860099L, (long)l2);
        }
        try {
            if (l2 > 0L) {
                object = object == true ? (Object)true : (Object)false;
            }
        }
        catch (MatchException matchException) {
            throw _7V.a(matchException);
        }
        return (boolean)object;
    }

    private void void_5(Object[] objectArray) {
        block4: {
            Object object;
            _7V v;
            CallSite callSite;
            long l2;
            block5: {
                block6: {
                    l2 = (Long)objectArray[0];
                    l2 = a ^ l2;
                    int n = _9M.cfr_renamed_0();
                    callSite = _7V.b("B", 5085567570125726968L, (long)l2);
                    try {
                        try {
                            if (callSite - _7V.b("\u00ee", (Object)this, 5084599767307649115L, (long)l2) <= e) break block4;
                            v = this;
                            object = _7V.b("\u00ee", (Object)this, 5085932619118427091L, (long)l2);
                            if (n == 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw _7V.a(matchException);
                        }
                        if (object != false) break block6;
                    }
                    catch (MatchException matchException) {
                        throw _7V.a(matchException);
                    }
                    object = true;
                    break block5;
                }
                object = false;
            }
            _7V.b("\u00c7", (Object)v, (boolean)object, 5085932619118427091L, (long)l2);
            _7V.b("\u00c7", (Object)this, (long)callSite, 5084599767307649115L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_9(Object[] var1_1) {
        block15: {
            block14: {
                block13: {
                    var2_2 = (Long)var1_1[0];
                    var4_3 = ((Boolean)var1_1[1]).booleanValue();
                    var2_2 = _7V.a ^ var2_2;
                    var5_4 = _9M.cfr_renamed_3();
                    try {
                        try {
                            try {
                                v0 /* !! */  = var4_3;
                                if (var5_4 != 0) break block13;
                                if (v0 /* !! */  != 0) {
                                }
                                ** GOTO lbl40
                            }
                            catch (MatchException v1) {
                                throw _7V.a(v1);
                            }
                            v2 = this;
                            v3 /* !! */  = var5_4;
                            if (var2_2 >= 0L) {
                                if (v3 /* !! */  != 0) break block14;
                            }
                            ** GOTO lbl38
                        }
                        catch (MatchException v4) {
                            throw _7V.a(v4);
                        }
                        v0 /* !! */  = (int)_7V.b("\u00ee", (Object)v2, (long)-5350265311157076439L, (long)var2_2);
                    }
                    catch (MatchException v5) {
                        throw _7V.a(v5);
                    }
                }
                try {
                    if (v0 /* !! */  != -1) break block15;
                    v2 = this;
                }
                catch (MatchException v6) {
                    throw _7V.a(v6);
                }
            }
            try {
                v3 /* !! */  = (int)_7V.b("\u00ee", (Object)this, (long)-5350060878034156774L, (long)var2_2);
lbl38:
                // 2 sources

                _7V.b("\u00c7", (Object)v2, (int)v3 /* !! */ , (long)-5350265311157076439L, (long)var2_2);
                if (var2_2 < 0L || var5_4 == 0) break block15;
lbl40:
                // 2 sources

                _7V.b("\u00c7", (Object)this, (int)_7V.a("n", (int)1180, (long)(4043216463738951256L ^ var2_2)), (long)-5350265311157076439L, (long)var2_2);
            }
            catch (MatchException v7) {
                throw _7V.a(v7);
            }
        }
    }

    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l2 = a ^ l2;
        _7V.b("\u00c7", (Object)this, (String)string, -947142348893001423L, (long)l2);
    }

    private boolean boolean_8(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                long l4 = l3 = a ^ l3;
                l2 = l4 ^ 0x28069B65856FL;
                long l5 = l4 ^ 0x7718CD76F203L;
                int n = _9M.cfr_renamed_3();
                try {
                    try {
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        callSite = _7V.b("\u00e0", (Object)this, (Object)objectArray2, -5092260858928303445L, (long)l3);
                        if (n != 0) break block4;
                        if (callSite != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7V.a(matchException);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw _7V.a(matchException);
                }
            }
            callSite = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, -5093750010813664602L, (long)l3), (int)_7V.b("\u00ee", (Object)this, -5093689188912246891L, (long)l3), -5091672861503571288L, (long)l3);
        }
        CallSite callSite2 = callSite;
        CallSite callSite3 = _7V.b("B", (int)_7V.b("\u00ee", (Object)this, -5093750010813664602L, (long)l3), (int)_7V.b("\u00ee", (Object)this, -5093689188912246891L, (long)l3), -5093071764810065682L, (long)l3);
        _7V.b("\u00c7", (Object)this, (String)((String)((Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -5093491053018284927L, (long)l3), 0, (int)callSite2, -5091980738786960323L, (long)l3)) + (String)((Object)_7V.b("\u00e0", (Object)_7V.b("\u00ee", (Object)this, -5093491053018284927L, (long)l3), (int)callSite3, -5092373172050030330L, (long)l3))), -5093491053018284927L, (long)l3);
        _7V.b("\u00c7", (Object)this, (int)callSite2, -5093689188912246891L, (long)l3);
        _7V.b("\u00c7", (Object)this, (int)_7V.a("n", 32174, (long)(0x3700A2E9D2E523EAL ^ l3)), -5093750010813664602L, (long)l3);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        _7V.b("\u00e0", (Object)this, (Object)objectArray3, -5093376957551851196L, (long)l3);
        return true;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_7V.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_7V.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

