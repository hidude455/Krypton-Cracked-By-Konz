/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1799
 *  net.minecraft.class_5321
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6C;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
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
import net.minecraft.class_1799;
import net.minecraft.class_5321;

public class _53
extends _6x_0 {
    private final _9r cfr_renamed_1;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_9;
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_0;
    private final _92 cfr_renamed_4;
    private boolean cfr_renamed_8;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_1(Object[] var1_1) {
        block43: {
            block45: {
                block44: {
                    block41: {
                        block42: {
                            block36: {
                                block37: {
                                    block38: {
                                        block40: {
                                            block39: {
                                                block34: {
                                                    block35: {
                                                        var2_2 = (Long)var1_1[0];
                                                        v0 = var2_2 = _53.b ^ var2_2;
                                                        var4_3 = v0 ^ 95514020504661L;
                                                        var6_4 = v0 ^ 74526340996558L;
                                                        var8_5 = _3s.cfr_renamed_5();
                                                        var9_6 = _53.c("\u00fd", (Object)_53.c("C", (Object)_53.c("C", (Object)this, (long)1176408729496855132L, (long)var2_2), (long)1175464817111833086L, (long)var2_2), (long)1174633791525625998L, (long)var2_2);
                                                        try {
                                                            try {
                                                                v1 = new Object[2];
                                                                v1[1] = var4_3;
                                                                v1[0] = var9_6;
                                                                v2 /* !! */  = _53.c("\u00fd", (Object)this, (Object)v1, (long)1176900335030157144L, (long)var2_2);
                                                                if (var8_5 != null) break block34;
                                                                if (v2 /* !! */  == false) break block35;
                                                            }
                                                            catch (MatchException v3) {
                                                                throw _53.a(v3);
                                                            }
                                                            return false;
                                                        }
                                                        catch (MatchException v4) {
                                                            throw _53.a(v4);
                                                        }
                                                    }
                                                    v2 /* !! */  = _53.c("\u00fd", (Object)_53.c("C", (Object)this, (long)1174416063104960277L, (long)var2_2), (long)var6_4, (long)1175268568567173295L, (long)var2_2);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var8_5 != null) break block36;
                                                                            if (v2 /* !! */  == false) break block37;
                                                                        }
                                                                        catch (MatchException v5) {
                                                                            throw _53.a(v5);
                                                                        }
                                                                        v2 /* !! */  = _53.c("\u00fd", (Object)_53.c("C", (Object)this, (long)1173848916661812276L, (long)var2_2), (long)var6_4, (long)1175268568567173295L, (long)var2_2);
                                                                        v6 = var8_5;
                                                                        if (var2_2 >= 0L) {
                                                                            if (v6 != null) break block36;
                                                                        }
                                                                        ** GOTO lbl84
                                                                    }
                                                                    catch (MatchException v7) {
                                                                        throw _53.a(v7);
                                                                    }
                                                                    if (v2 /* !! */  == false) break block37;
                                                                }
                                                                catch (MatchException v8) {
                                                                    throw _53.a(v8);
                                                                }
                                                                v9 /* !! */  = _53.c("\u00fd", (Object)var9_6, (Object)_53.c("x", (long)1174013867448541467L, (long)var2_2), (long)1174151357174923137L, (long)var2_2);
                                                                if (var8_5 != null) break block38;
                                                            }
                                                            catch (MatchException v10) {
                                                                throw _53.a(v10);
                                                            }
                                                            if (v9 /* !! */  != false) break block39;
                                                        }
                                                        catch (MatchException v11) {
                                                            throw _53.a(v11);
                                                        }
                                                        v9 /* !! */  = _53.c("\u00fd", (Object)var9_6, (Object)_53.c("x", (long)1173940054312394724L, (long)var2_2), (long)1174151357174923137L, (long)var2_2);
                                                        if (var8_5 != null) break block38;
                                                    }
                                                    catch (MatchException v12) {
                                                        throw _53.a(v12);
                                                    }
                                                    if (v9 /* !! */  == false) break block40;
                                                }
                                                catch (MatchException v13) {
                                                    throw _53.a(v13);
                                                }
                                            }
                                            v9 /* !! */  = (CallSite)true;
                                            break block38;
                                        }
                                        v9 /* !! */  = (CallSite)false;
                                    }
                                    return (boolean)v9 /* !! */ ;
                                }
                                v2 /* !! */  = _53.c("\u00fd", (Object)_53.c("C", (Object)this, (long)1174416063104960277L, (long)var2_2), (long)var6_4, (long)1175268568567173295L, (long)var2_2);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v6 = var8_5;
lbl84:
                                            // 2 sources

                                            if (v6 != null) break block41;
                                            if (v2 /* !! */  == false) break block42;
                                        }
                                        catch (MatchException v14) {
                                            throw _53.a(v14);
                                        }
                                        v2 /* !! */  = _53.c("\u00fd", (Object)var9_6, (Object)_53.c("x", (long)1174013867448541467L, (long)var2_2), (long)1174151357174923137L, (long)var2_2);
                                        v15 = var8_5;
                                        if (var2_2 > 0L) {
                                            if (v15 != null) break block41;
                                        }
                                        ** GOTO lbl111
                                    }
                                    catch (MatchException v16) {
                                        throw _53.a(v16);
                                    }
                                    if (v2 /* !! */  != false) break block42;
                                }
                                catch (MatchException v17) {
                                    throw _53.a(v17);
                                }
                                return false;
                            }
                            catch (MatchException v18) {
                                throw _53.a(v18);
                            }
                        }
                        v2 /* !! */  = _53.c("\u00fd", (Object)_53.c("C", (Object)this, (long)1173848916661812276L, (long)var2_2), (long)var6_4, (long)1175268568567173295L, (long)var2_2);
                    }
                    try {
                        try {
                            try {
                                v15 = var8_5;
lbl111:
                                // 2 sources

                                if (v15 != null) break block43;
                                if (v2 /* !! */  == false) break block44;
                            }
                            catch (MatchException v19) {
                                throw _53.a(v19);
                            }
                            v2 /* !! */  = _53.c("\u00fd", (Object)var9_6, (Object)_53.c("x", (long)1173940054312394724L, (long)var2_2), (long)1174151357174923137L, (long)var2_2);
                            if (var8_5 != null) break block43;
                        }
                        catch (MatchException v20) {
                            throw _53.a(v20);
                        }
                        if (v2 /* !! */  == false) break block45;
                    }
                    catch (MatchException v21) {
                        throw _53.a(v21);
                    }
                }
                v2 /* !! */  = (CallSite)true;
                break block43;
            }
            v2 /* !! */  = (CallSite)false;
        }
        return (boolean)v2 /* !! */ ;
    }

    @_3i_0
    public void cfr_renamed_5(_9o o) {
        block23: {
            _53 v9;
            long l2;
            long l3;
            block24: {
                CallSite callSite;
                _4w[] wArray;
                long l4;
                block22: {
                    _53 v4;
                    long l5;
                    block21: {
                        CallSite callSite2;
                        block19: {
                            block20: {
                                long l6 = l3 = b ^ 0x6A3A75F9C644L;
                                l2 = l6 ^ 0x7BB5AD3AF94L;
                                l4 = l6 ^ 0x79783603438DL;
                                l5 = l6 ^ 0x3C2854793C87L;
                                wArray = _3s.cfr_renamed_5();
                                try {
                                    try {
                                        callSite2 = _53.c("C", (Object)this, -1073529747637943531L, (long)l3);
                                        if (wArray != null) break block19;
                                        if (_53.c("C", (Object)callSite2, -1073809075028691360L, (long)l3) == null) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw _53.a(matchException);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw _53.a(matchException);
                                }
                            }
                            try {
                                v4 = this;
                                if (wArray != null) break block21;
                                callSite2 = _53.c("C", (Object)v4, -1073529747637943531L, (long)l3);
                            }
                            catch (MatchException matchException) {
                                throw _53.a(matchException);
                            }
                        }
                        try {
                            if (_53.c("C", (Object)callSite2, -1073711700617299785L, (long)l3) == null) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw _53.a(matchException);
                        }
                        v4 = this;
                    }
                    try {
                        try {
                            try {
                                callSite = _53.c("C", (Object)v4, -1080402901969644690L, (long)l3);
                                if (wArray != null) break block22;
                                if (callSite == false) break block23;
                            }
                            catch (MatchException matchException) {
                                throw _53.a(matchException);
                            }
                            v9 = this;
                            if (wArray != null) break block24;
                        }
                        catch (MatchException matchException) {
                            throw _53.a(matchException);
                        }
                        callSite = _53.c("\u00fd", (Object)_53.c("C", (Object)v9, -1074025819263590161L, (long)l3), (long)l5, -1079144922498649626L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _53.a(matchException);
                    }
                }
                try {
                    block25: {
                        try {
                            if (callSite == false) break block25;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _53.c("\u00fd", (Object)this, (Object)objectArray, -1073942001859371676L, (long)l3);
                            if (wArray == null) break block23;
                        }
                        catch (MatchException matchException) {
                            throw _53.a(matchException);
                        }
                    }
                    v9 = this;
                }
                catch (MatchException matchException) {
                    throw _53.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _53.c("\u00fd", (Object)v9, (Object)objectArray, -1078946590275904096L, (long)l3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void cfr_renamed_233(Object[] objectArray) {
        CallSite callSite;
        _4w[] wArray;
        long l2;
        long l3;
        block21: {
            l3 = (Long)objectArray[0];
            l2 = (l3 = b ^ l3) ^ 0x4C000FD20D88L;
            wArray = _3s.cfr_renamed_5();
            try {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = _53.c("x", 2611315206991295122L, (long)l3);
                objectArray2[0] = l2;
                callSite = _53.c("\u00d5", (Object)objectArray2, 2604201421874788218L, (long)l3);
                if (wArray != null) break block21;
                if (callSite != false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _53.a(matchException);
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = _53.c("x", 2611246804155979106L, (long)l3);
            objectArray3[0] = l2;
            callSite = _53.c("\u00d5", (Object)objectArray3, 2604201421874788218L, (long)l3);
        }
        _4w[] wArray2 = wArray;
        if (l3 > 0L) {
            if (wArray2 == null) {
                if (callSite != false) {
                    return;
                }
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = _53.c("x", 2609968889249355521L, (long)l3);
                objectArray4[0] = l2;
                callSite = _53.c("\u00d5", (Object)objectArray4, 2604201421874788218L, (long)l3);
            }
            wArray2 = wArray;
        }
        if (l3 > 0L) {
            if (wArray2 == null) {
                if (callSite != false) {
                    return;
                }
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = _53.c("x", 2611746226036833246L, (long)l3);
                objectArray5[0] = l2;
                callSite = _53.c("\u00d5", (Object)objectArray5, 2604201421874788218L, (long)l3);
            }
            wArray2 = wArray;
        }
        if (l3 >= 0L) {
            if (wArray2 == null) {
                if (callSite != false) {
                    return;
                }
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = _53.c("x", 2612044644874195277L, (long)l3);
                objectArray6[0] = l2;
                callSite = _53.c("\u00d5", (Object)objectArray6, 2604201421874788218L, (long)l3);
            }
            wArray2 = wArray;
        }
        if (l3 > 0L) {
            if (wArray2 == null) {
                if (callSite != false) {
                    return;
                }
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = _53.c("x", 2603187585131646403L, (long)l3);
                objectArray7[0] = l2;
                callSite = _53.c("\u00d5", (Object)objectArray7, 2604201421874788218L, (long)l3);
            }
            wArray2 = wArray;
        }
        if (wArray2 != null) return;
        if (callSite != false) {
            return;
        }
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = _53.c("x", 2610912058168751981L, (long)l3);
        objectArray8[0] = l2;
        callSite = _53.c("\u00d5", (Object)objectArray8, 2604201421874788218L, (long)l3);
    }

    private void cfr_renamed_234(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block4: {
            block5: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = b ^ l4;
                l3 = l5 ^ 0x730D3415DB55L;
                l2 = l5 ^ 0x1218463ABBDFL;
                long l6 = l5 ^ 0x171C36FC0876L;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        callSite = _53.c("C", (Object)this, -8801695386364164051L, (long)l4);
                        if (wArray != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        if (callSite >= _53.c("\u00fd", (Object)_53.c("C", (Object)this, -8807667247551150797L, (long)l4), (Object)objectArray2, -8801451889791341264L, (long)l4)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _53.a(matchException);
                    }
                    _53 v4 = this;
                    _53.c("z", (Object)v4, (int)(_53.c("C", (Object)v4, -8801695386364164051L, (long)l4) + true), -8801695386364164051L, (long)l4);
                    return;
                }
                catch (MatchException matchException) {
                    throw _53.a(matchException);
                }
            }
            callSite = _53.c("C", (Object)this, -8801623266723068205L, (long)l4);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = (int)callSite;
        _53.c("\u00d5", (Object)objectArray3, -8800737984455475958L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        _53.c("\u00fd", (Object)this, (Object)objectArray4, -8806864402830972575L, (long)l4);
    }

    private void cfr_renamed_235(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _53.c("z", (Object)this, (int)_53.a("b", 3116, (long)(0x23DB0A85D891A208L ^ l2)), 7620975156428040906L, (long)l2);
        _53.c("z", (Object)this, (int)_53.a("b", 5763, (long)(0x3F196CB41FE738A6L ^ l2)), 7621047619728516148L, (long)l2);
        _53.c("z", (Object)this, (boolean)_53.a("b", 23194, (long)(0x7D086A60CFB74B3L ^ l2)), 7627313527410838454L, (long)l2);
    }

    public _53(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x3F227737F4D6L;
        long l5 = l3 ^ 0x2F4245FE8D45L;
        long l6 = l3 ^ 0x155F9EE68D87L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x691AE0747CBFL;
        long l9 = l3 ^ 0x76DA735093CDL;
        long l10 = l3 ^ 0x3C6EB182181BL;
        super((int)_53.a("b", 9862, (long)(0x791CABBE139034E5L ^ l2)), -1, (_4r)((Object)_53.c("x", -3060590097809220471L, (long)l2)), l8);
        this.cfr_renamed_1 = new _9r(1, true, l4);
        this.cfr_renamed_3 = new _9r((int)_53.a("b", 14798, (long)(0x56AA3C34134F2BACL ^ l2)), false, l4);
        this.cfr_renamed_9 = new _9r((int)_53.a("b", 11699, (long)(0x11E95DF6E503FDDL ^ l2)), false, l4);
        this.cfr_renamed_2 = new _9r((int)_53.a("b", 11470, (long)(0x111B7B833AF33EA2L ^ l2)), false, l4);
        this.cfr_renamed_0 = new _9r((int)_53.a("b", 23083, (long)(0x7ABF064C14A1484CL ^ l2)), true, l4);
        this.cfr_renamed_4 = new _92((int)_53.a("b", 7372, (long)(0x6328831432578EA8L ^ l2)), 0.0, l5, 20.0, 1.0, 1.0);
        CallSite callSite = _53.c("C", (Object)this, -3055246232627554962L, (long)l2);
        CallSite callSite2 = _53.c("C", (Object)this, -3061238885808274317L, (long)l2);
        _53.c("\u00d5", (Object)callSite2, -3054936176736876842L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _53.c("\u00fd", (Object)callSite, (Object)objectArray, -3061101740724721152L, (long)l2);
        _95[] nullArray = new _95[_53.a("b", 13419, (long)(0x7BC06AC75413260EL ^ l2))];
        nullArray[0] = _53.c("C", (Object)this, -3060871650385346828L, (long)l2);
        nullArray[1] = _53.c("C", (Object)this, -3054642043353201520L, (long)l2);
        nullArray[2] = _53.c("C", (Object)this, -3055372898937830720L, (long)l2);
        nullArray[3] = _53.c("C", (Object)this, -3053679174061622815L, (long)l2);
        nullArray[4] = _53.c("C", (Object)this, -3061238885808274317L, (long)l2);
        nullArray[5] = _53.c("C", (Object)this, -3055246232627554962L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = nullArray;
        objectArray2[0] = l9;
        _53.c("\u00fd", (Object)this, (Object)objectArray2, -3055047213351803997L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_53.class, 39);
                _53.b = l.a(-116294464973860350L, 7076253215017204107L, MethodHandles.lookup().lookupClass()).a(172257267084931L);
                _53.j = new Object[82];
                _53.k = new String[82];
                _53.b();
                _53.f = new HashMap<K, V>(13);
                var0 = _53.b ^ 8515359065502L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u00f2\u0083\u00c8\u001ev\u000ev\u001fA@\u00d6^\u00d51\u00a8\u00db\u000e\u0018\u00f8i{xkY\u00d9\u00c5\u009d\u0084\u00cf\u0006?\u0088\u00b3\u0011{\u00d2\u00065ha \u009e3\u008em\u0017\u0081\u0003\u00b9*p\u0080\u00b4.\u00fa\u00afM\u00cd\u00c1\u00f1\u0098\u009e\u00ad\u00c9\u00aa\u00b4\u0085\u00ea\u00b9T\u0091\u00e1";
                var7_6 = "\u00f2\u0083\u00c8\u001ev\u000ev\u001fA@\u00d6^\u00d51\u00a8\u00db\u000e\u0018\u00f8i{xkY\u00d9\u00c5\u009d\u0084\u00cf\u0006?\u0088\u00b3\u0011{\u00d2\u00065ha \u009e3\u008em\u0017\u0081\u0003\u00b9*p\u0080\u00b4.\u00fa\u00afM\u00cd\u00c1\u00f1\u0098\u009e\u00ad\u00c9\u00aa\u00b4\u0085\u00ea\u00b9T\u0091\u00e1".length();
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
                    var6_5 = "\u00bf\u00d2\u001b\u00b7q\u00b3\u009dE\u0016s\u00bc+p\u00b2\u009d\u0011";
                    var7_6 = "\u00bf\u00d2\u001b\u00b7q\u00b3\u009dE\u0016s\u00bc+p\u00b2\u009d\u0011".length();
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
        _53.d = var8_3;
        _53.e = new Integer[11];
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
            case 0 -> 7;
            case 1 -> 10;
            case 2 -> 29;
            case 3 -> 32;
            case 4 -> 52;
            case 5 -> 17;
            case 6 -> 36;
            case 7 -> 57;
            case 8 -> 23;
            case 9 -> 41;
            case 10 -> 63;
            case 11 -> 27;
            case 12 -> 49;
            case 13 -> 60;
            case 14 -> 19;
            case 15 -> 28;
            case 16 -> 1;
            case 17 -> 44;
            case 18 -> 8;
            case 19 -> 58;
            case 20 -> 61;
            case 21 -> 16;
            case 22 -> 14;
            case 23 -> 45;
            case 24 -> 47;
            case 25 -> 18;
            case 26 -> 55;
            case 27 -> 31;
            case 28 -> 5;
            case 29 -> 24;
            case 30 -> 54;
            case 31 -> 48;
            case 32 -> 62;
            case 33 -> 33;
            case 34 -> 15;
            case 35 -> 37;
            case 36 -> 34;
            case 37 -> 46;
            case 38 -> 56;
            case 39 -> 13;
            case 40 -> 59;
            case 41 -> 6;
            case 42 -> 22;
            case 43 -> 53;
            case 44 -> 40;
            case 45 -> 30;
            case 46 -> 4;
            case 47 -> 35;
            case 48 -> 38;
            case 49 -> 2;
            case 50 -> 3;
            case 51 -> 12;
            case 52 -> 11;
            case 53 -> 39;
            case 54 -> 50;
            case 55 -> 42;
            case 56 -> 9;
            case 57 -> 51;
            case 58 -> 26;
            case 59 -> 0;
            case 60 -> 25;
            case 61 -> 43;
            case 62 -> 20;
            default -> 21;
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
        _53.k[n3] = new String(cArray);
        return n3;
    }

    @_3i_0
    public void cfr_renamed_1(_6C c) {
        _53 v12;
        long l2;
        block56: {
            block57: {
                _53 v28;
                long l3;
                block60: {
                    CallSite callSite;
                    _4w[] wArray;
                    long l4;
                    block58: {
                        long l5;
                        block54: {
                            block52: {
                                block53: {
                                    block50: {
                                        block51: {
                                            _53 v1;
                                            long l6;
                                            block48: {
                                                block49: {
                                                    long l7 = l2 = b ^ 0x40D5EF54679EL;
                                                    l6 = l7 ^ 0x58C1920577DFL;
                                                    l4 = l7 ^ 0x2759E8C079FDL;
                                                    l5 = l7 ^ 0x16C7CED49D5DL;
                                                    l3 = l7 ^ 0x2D444C9843ACL;
                                                    wArray = _3s.cfr_renamed_5();
                                                    try {
                                                        try {
                                                            v1 = this;
                                                            if (wArray != null) break block48;
                                                            if (_53.c("C", (Object)_53.c("C", (Object)v1, 5818690912923181775L, (long)l2), 5819567755269757293L, (long)l2) != null) break block49;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _53.a(matchException);
                                                        }
                                                        return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _53.a(matchException);
                                                    }
                                                }
                                                v1 = this;
                                            }
                                            try {
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l6;
                                                callSite = _53.c("\u00fd", (Object)v1, (Object)objectArray, 5825764902548401705L, (long)l2);
                                                if (wArray != null) break block50;
                                                if (callSite != false) break block51;
                                            }
                                            catch (MatchException matchException) {
                                                throw _53.a(matchException);
                                            }
                                            return;
                                        }
                                        callSite = _53.c("C", (Object)this, 5818936713594229704L, (long)l2);
                                    }
                                    try {
                                        try {
                                            if (wArray != null) break block52;
                                            if (callSite != -1) break block53;
                                        }
                                        catch (MatchException matchException) {
                                            throw _53.a(matchException);
                                        }
                                        _53.c("z", (Object)this, (int)_53.c("\u00fd", (Object)_53.c("\u00fd", (Object)_53.c("C", (Object)_53.c("C", (Object)this, 5818690912923181775L, (long)l2), 5819567755269757293L, (long)l2), 5819162348876081894L, (long)l2), 5825599920256392389L, (long)l2), 5818936713594229704L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw _53.a(matchException);
                                    }
                                }
                                callSite = _53.c("\u00fd", (Object)_53.c("C", (Object)this, 5819692892391816114L, (long)l2), (long)l5, 5826586471718490172L, (long)l2);
                            }
                            try {
                                block55: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (wArray != null) break block54;
                                                                    if (callSite == false) break block55;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _53.a(matchException);
                                                                }
                                                                callSite = _53.c("\u00fd", (Object)_53.c("C", (Object)this, 5826973573140644310L, (long)l2), (long)l5, 5826586471718490172L, (long)l2);
                                                                if (wArray != null) break block54;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _53.a(matchException);
                                                            }
                                                            if (callSite == false) break block55;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _53.a(matchException);
                                                        }
                                                        v12 = this;
                                                        if (wArray != null) break block56;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _53.a(matchException);
                                                    }
                                                    Object[] objectArray = new Object[2];
                                                    objectArray[1] = l4;
                                                    objectArray[0] = _53.c("x", 5827118728462500092L, (long)l2);
                                                    if (_53.c("\u00fd", (Object)v12, (Object)objectArray, 5818882181977250046L, (long)l2) != false) break block57;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _53.a(matchException);
                                                }
                                                v12 = this;
                                                if (wArray != null) break block56;
                                            }
                                            catch (MatchException matchException) {
                                                throw _53.a(matchException);
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l4;
                                            objectArray[0] = _53.c("x", 5827454004784466603L, (long)l2);
                                            if (_53.c("\u00fd", (Object)v12, (Object)objectArray, 5818882181977250046L, (long)l2) != false) break block57;
                                        }
                                        catch (MatchException matchException) {
                                            throw _53.a(matchException);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l3;
                                        _53.c("\u00fd", (Object)this, (Object)objectArray, 5819217624416527641L, (long)l2);
                                        if (wArray == null) break block57;
                                    }
                                    catch (MatchException matchException) {
                                        throw _53.a(matchException);
                                    }
                                }
                                callSite = _53.c("\u00fd", (Object)_53.c("C", (Object)this, 5819692892391816114L, (long)l2), (long)l5, 5826586471718490172L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw _53.a(matchException);
                            }
                        }
                        try {
                            try {
                                block59: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (wArray != null) break block58;
                                                    if (callSite == false) break block59;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _53.a(matchException);
                                                }
                                                v12 = this;
                                                if (wArray != null) break block56;
                                            }
                                            catch (MatchException matchException) {
                                                throw _53.a(matchException);
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l4;
                                            objectArray[0] = _53.c("x", 5827118728462500092L, (long)l2);
                                            if (_53.c("\u00fd", (Object)v12, (Object)objectArray, 5818882181977250046L, (long)l2) != false) break block57;
                                        }
                                        catch (MatchException matchException) {
                                            throw _53.a(matchException);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l3;
                                        _53.c("\u00fd", (Object)this, (Object)objectArray, 5819217624416527641L, (long)l2);
                                        if (wArray == null) break block57;
                                    }
                                    catch (MatchException matchException) {
                                        throw _53.a(matchException);
                                    }
                                }
                                v28 = this;
                                if (wArray != null) break block60;
                            }
                            catch (MatchException matchException) {
                                throw _53.a(matchException);
                            }
                            callSite = _53.c("\u00fd", (Object)_53.c("C", (Object)v28, 5826973573140644310L, (long)l2), (long)l5, 5826586471718490172L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _53.a(matchException);
                        }
                    }
                    try {
                        block61: {
                            try {
                                try {
                                    try {
                                        if (callSite == false) break block61;
                                        v12 = this;
                                        if (wArray != null) break block56;
                                    }
                                    catch (MatchException matchException) {
                                        throw _53.a(matchException);
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = _53.c("x", 5827454004784466603L, (long)l2);
                                    if (_53.c("\u00fd", (Object)v12, (Object)objectArray, 5818882181977250046L, (long)l2) != false) break block57;
                                }
                                catch (MatchException matchException) {
                                    throw _53.a(matchException);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l3;
                                _53.c("\u00fd", (Object)this, (Object)objectArray, 5819217624416527641L, (long)l2);
                                if (wArray == null) break block57;
                            }
                            catch (MatchException matchException) {
                                throw _53.a(matchException);
                            }
                        }
                        v28 = this;
                    }
                    catch (MatchException matchException) {
                        throw _53.a(matchException);
                    }
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                _53.c("\u00fd", (Object)v28, (Object)objectArray, 5819217624416527641L, (long)l2);
            }
            v12 = this;
        }
        _53.c("z", (Object)v12, (boolean)_53.a("b", 9238, (long)(0x42FFE75840143336L ^ l2)), 5826401895289320116L, (long)l2);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u0012\u0013Ai=D\u000f\u0006C(8\u0018N\f";
        objectArray[1] = "n\u001e(B\u001cZ\u001b>#M\r\u0015z0(F\tO\u000e";
        objectArray[2] = Boolean.TYPE;
        _53.k[2] = "java/lang/Boolean";
        objectArray[3] = ",B\u0013/\u0004i1W\u0011n\u00015}\u0014";
        objectArray[4] = "<S\\A7gIsWN&((}\\E\"r\\";
        objectArray[5] = Void.TYPE;
        _53.k[5] = "java/lang/Void";
        objectArray[6] = "\\\u000b'$V\u001a\\\u000b0xZ\u0015F@0fZ\u0000A1`;\u000b";
        objectArray[7] = ")Gvy&z)Ga%*u3\fa;*`4}5c}";
        objectArray[8] = ":gOnD6:gX2H9 ,X,H,']\nw\u0010f";
        objectArray[9] = "\u001dzr\u000f\u0015h\u001dzeS\u0019g\u00071eM\u0019r\u0000@0\u0019N3";
        objectArray[10] = "E4]c\u0000IX!_\"\u0005\u0015\u0018#";
        objectArray[11] = "\nY:^)&\nY-\u0002%)\u0010\u0012-\u001c%<\u0017c}D|v";
        objectArray[12] = "Y\u0012\u001a\u0018b]D\u0007\u0018Yg\u0001\u000b\u000f";
        objectArray[13] = Long.TYPE;
        _53.k[13] = "java/lang/Long";
        objectArray[14] = "FdW\u00064)3D\\\t%fRJW\u0002!<&";
        objectArray[15] = "\u00193,)-M\u0004&.h(\u0011Dc";
        objectArray[16] = "G88I^v2\u00183FO9S\u00168MKc'";
        objectArray[17] = ":\u0003@#to'\u0016Bbq3j\u0014";
        objectArray[18] = "\rV@j+\u0005\u0010CB+.YP\u0001";
        objectArray[19] = "IHQ=Dl<hZ2U#]fQ9Qy)";
        objectArray[20] = "\u0010\u0006j\u0011\u0013\u0004\u000e\u000ep^r\u0013\u0010\u0002\u007f\u0004N";
        objectArray[21] = "o)wxG{d&f7&uo-bm";
        objectArray[22] = "r0Dh\u001e\u000f\u0007\u0010Og\u000f@f\u001eDl\u000b\u001a\u0012";
        objectArray[23] = "c\u001anUOoc\u001ay\tC`yQy\u0017Cu~ .H\u0015";
        objectArray[24] = Integer.TYPE;
        _53.k[24] = "java/lang/Integer";
        objectArray[25] = "1XH\u0012\u0014c1X_N\u0018l+\u0013_P\u0018y,b\r\u0004I8";
        objectArray[26] = "3A\u007f,\u000by3Ahp\u0007v)\nhn\u0007c.{:5_\"";
        objectArray[27] = "MYKcA;8y@lPtYwKgT.-";
        objectArray[28] = ":\\S\u0019\u0000<O|X\u0016\u0011s.rS\u001d\u0015)Z";
        objectArray[29] = ".\u0006|K-z[&wD<5:(|O8oN";
        objectArray[30] = "Fw}2Cq[b\u007fsF-\u0016 ";
        objectArray[31] = "k\u0016M\u0019SU\u001e6F\u0016B\u001a\u007f8M\u001dF@\u000b";
        objectArray[32] = "*Z\u001cdRw_z\u0017kC8>t\u001c`GbJ";
        objectArray[33] = "s#0t\u0012ls#'(\u001ecih'6\u001evn\u0019ulI4";
        objectArray[34] = "\t;=Mbo|\u001b6Bs \u001d\u0015=Iwzi";
        objectArray[35] = "Q\u0001p\u0011\\\u000fQ\u0001gMP\u0000KJgSP\u0015L;5\u0007\bU";
        objectArray[36] = "PoU\u0016-RPoBJ!]J$BT!HMU\u0014\u000br\n";
        objectArray[37] = "7dyP\u0015RBDr_\u0004\u001d#JyT\u0000GW";
        objectArray[38] = ",!\u007f\u001f7Ot#l\n\u000bZ-\"j\u0003\\\nwt>S\u000bU,0u\u0015n\t-~~";
        objectArray[39] = "'!p:s\u000bm8}wJQ\u001d{q9,R!%mu&";
        objectArray[40] = "um`daQ-osq]Dtnux\n\u0014.8!+]Ku|jn8\u0017t2a";
        objectArray[41] = "A_\u001e\r/\u001f\u0015K\u001e\u000bOE\u0011X\u001d\u0013#wG\u001d@Kt BM\u0013\f)L\u001b\u001c\u0018\u0010O\u0019\u0000U\u001bJsG\u001c\u0019\u0011t";
        objectArray[42] = "\u0016\u0017\u0019*3\fB\u0003\u0019,SVF\u0010\u001a4?d\u0010UGlo3J\f\u0005()V\u0016\rK#S\nW\u001d\u001cmoTKQ\u0016S";
        objectArray[43] = "xL(n;dy\u0005 .\u000bos\u000123g] Boo1\n~L8042u\u001b+k\u000b";
        objectArray[44] = "~u,\u000fQ14l!BhoDonES-xp \u0000\u0017V}j \u001bVj#vl\u0011h";
        objectArray[45] = "\u001aB\u0010Wf\u001bP[\u001d\u001a_B \u001eT\u00185\u000e\u001c\u001a\u0007F6";
        objectArray[46] = "[2\u0019Iq7\u0002t\u0017P\ta\u0005'C\\^3^t\u001e\n\t1\r$_Veh\\/C";
        objectArray[47] = "t&\"\\G\u001f-`,E?I*3xIh\u001bq`%\u001c?\u0019\"0dCS@s;x";
        objectArray[48] = "d?\u0018\u000e:\f2`[\rFQ4}\u0007\u0006*cg9[^F\t\"b\u001e\u0001y]6b\u0018a";
        objectArray[49] = "m\u0007z.gEdR&?\u001aFk\u000fr=M\u00161^,i\u001aP`\u0002|6!\u00112\u0003\u007f";
        objectArray[50] = "{W\u001ec\r\u0015#U\rv1\u0000zT\u000b\u007ffP \u0002_#1\u000f{F\u0014iTSz\b\u001f";
        objectArray[51] = "I9)2(tL\";[t\u001ePmo`4\"O#*$O'U#1esyIo;[";
        objectArray[52] = ":\u0017[{b93B\u0007j\u001f:<\u001fShHedK\u0007\u0004g>=\u0018P?&l<\u001b";
        objectArray[53] = "If<[3G\u0003\u007f1\u0016\n\u001fs:x\u0014`RO>+Jc";
        objectArray[54] = "d`P*x\u0012<bC?D\u0007ecE6\u0013W?5\u0011dD\bdqZ !Te?Q";
        objectArray[55] = "\u001a\u000eM\u0007Y\u000eP\u0017@J`Q \u0006P\u001a\u0011\u0014\u0019VO\u001c\f";
        objectArray[56] = ">Sa%8vgU;:Y-\u000eV<{bo2Ir>&\u00145]n*i(`Ad(Y";
        objectArray[57] = "T\u0012Fu+\nPA\u0018vY\fk\u001a\u001fx+D\bZ\u0012{<6RW\nyg\n\fKFsY";
        objectArray[58] = "C=]\u0016r}\t$P[K\"3^Y[s!\u0002bF\u00156eyeR\t\"*E0N\u0003 \u001a";
        objectArray[59] = "\u001ad\u001b\u0002M\f\u0017}C\u000f+M\u001bb\u0006\u0004QZ0|\u001d#VS\u0012\u001b\u0016\u0003\u0010S\u0004gJ\u0005\u001a]vv\u001d^OE\n*\u001bTA7";
        objectArray[60] = "\u0016g \u0007&vNe3\u0012\u001ac\u0017d5\u001bM3M2`O\u001al\u0016v*\r\u007f0\u00178!";
        objectArray[61] = "_\u007fr6wB\u0007}a#KW^|g*\u001c\u0007\u0004*3wKX_nx<.\u0004^ s";
        objectArray[62] = "'l?S\tv&h5\u0016k,C,;RPg\u007f3u\u0017\u0014\u001cz)u\fU $59\u0006k";
        objectArray[63] = "Us*eI5\u001fj'(pho/n*\u001a S+=t\u0019";
        objectArray[64] = "O\u001d Z9#\u0005\u0004-\u0017\u0000tuAd\u0015j6IE7Ki";
        objectArray[65] = "$\u001agI\u0000~n\u0003j\u00049!'yc\u0004\u0001\"eE|JDf\u001eBhVP)\"\u0017t\\R\u0019";
        objectArray[66] = "_N3$/>RDm:Bk6Tlcy,\nK\"&=W_N3$/>RDm:B";
        objectArray[67] = "EG[]\u000e<\u000f^V\u00107cG$_\u0010\u000f`\u0004\u0018@^J$\u007f\u001fTB^kCJHH\\[";
        objectArray[68] = "v\bB?\u0016(0\u001aC,{y+\u001dI.,.uJ\u0011BF)5\u001fQz\u0010vv\u001c";
        objectArray[69] = "ht$U\u0013g.f%F~65a/D)ak1v(\u00114.vrH\u0007d;s";
        objectArray[70] = "XC)\b\u0017x]X;aM\u0012A\u0017oZ\u000b.^Y*\u001ep+DY1_LuX\u0015;a";
        objectArray[71] = "qmSVp$;t^\u001bIrK1\u0017\u0019#1w5DG ";
        objectArray[72] = "\u0010\u0013<B\u0007\"H\u0011/W;7\u0011\u0010)^lgKF}\u000f;8\u0010\u00026H^d\u0011L=";
        objectArray[73] = "CQ[3D\f\u001aW\u0001,%Ws\u0011A:X\u0003LWS;K";
        objectArray[74] = "T\u0011\u000eX2p\u001e\b\u0003\u0015\u000b/n\u000bL\u00120lR\u0014\u0002Wt\u0017W\u000e\u0002L5+\t\u0012NF\u000b";
        objectArray[75] = "S\u0017\\r\u000fkW\fIouK~-{F)\u0000S\u0017\\r\u000fkW\fIo";
        objectArray[76] = "R5\u001bjO(\u0018,\u0016'vsh6Wr\u0012pP=\u0000aI";
        objectArray[77] = "*\u001e\u0003:O}`\u0007\u000ewv!\u0010\u001dO\"\u0012%(\u0016\u00181I";
        objectArray[78] = "IM\u0000w\u0013\u0017\u001f\u0012CtoJ\u0019\u000f\u001f\u007f\u0003xOJB$_/\u0012B\u0005\"_A\u0013\u000b\rbo";
        objectArray[79] = "\u001a7EkkwJ(Cv\u0016sq.\u0015\"-5M1[giN\u0011f@~)v\u001a1S%\u0016";
        objectArray[80] = "`\u001bru.5*\u0002\u007f8\u0017nZ\u00010?,)f\u001e~zhRc\u0004~a)n=\u00182k\u0017";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "\u000eG\u0011\u0015=F\u000b\\\u0003|b,\u0017\u0013WG!\u0010\b]\u0012\u0003Z\u0017\u001cA\u0006LfB\u0000K\u0004|";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 'z' || c == 'x' || c == 'B') {
                field = _53.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'z' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _53.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _53.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/53" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _53.e(l2, l3);
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
                clazz3 = _53.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _53.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _53.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _53.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _53.f(1487007891617951L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _53.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _53.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _53.f(1487007891617951L, 0L);
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
            int n = _53.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _53.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _53.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _53.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _53.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _53.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _53.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x47F0;
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
                throw new RuntimeException("dev/krypton/53", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _53.e[n2] = n3;
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
            throw new RuntimeException("dev/krypton/53" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _53.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _53.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _53.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _53.c(clazz3, string2, clazz2)) != null) {
                    _53.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _53.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _53.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _53.f(1487007891617951L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean boolean_0(Object[] objectArray) {
        class_5321 class_53212 = (class_5321)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x4849CE0B11DDL;
        long l5 = l3 ^ 0x12009F29276L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = arg_0 -> this.cfr_renamed_8(l5, class_53212, arg_0);
        return (boolean)_53.c("\u00d5", (Object)objectArray2, 2193136862087818828L, (long)l2);
    }

    @Override
    public native void cfr_renamed_2();

    private boolean boolean_4(Object[] objectArray) {
        Object object;
        block26: {
            block28: {
                block27: {
                    class_1799 class_17992 = (class_1799)objectArray[0];
                    long l2 = (Long)objectArray[1];
                    l2 = b ^ l2;
                    _4w[] wArray = _3s.cfr_renamed_5();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4850935600095023111L, (long)l2), 4851201179636681512L, (long)l2);
                                                                        if (wArray != null) break block26;
                                                                        if (object != false) break block27;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _53.a(matchException);
                                                                    }
                                                                    object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4848775660344306345L, (long)l2), 4851201179636681512L, (long)l2);
                                                                    if (wArray != null) break block26;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _53.a(matchException);
                                                                }
                                                                if (object != false) break block27;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _53.a(matchException);
                                                            }
                                                            object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4852055026986350119L, (long)l2), 4851201179636681512L, (long)l2);
                                                            if (wArray != null) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _53.a(matchException);
                                                        }
                                                        if (object != false) break block27;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _53.a(matchException);
                                                    }
                                                    object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4851034811149332587L, (long)l2), 4851201179636681512L, (long)l2);
                                                    if (wArray != null) break block26;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _53.a(matchException);
                                                }
                                                if (object != false) break block27;
                                            }
                                            catch (MatchException matchException) {
                                                throw _53.a(matchException);
                                            }
                                            object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4851757578310327476L, (long)l2), 4851201179636681512L, (long)l2);
                                            if (wArray != null) break block26;
                                        }
                                        catch (MatchException matchException) {
                                            throw _53.a(matchException);
                                        }
                                        if (object != false) break block27;
                                    }
                                    catch (MatchException matchException) {
                                        throw _53.a(matchException);
                                    }
                                    object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4852397388449198600L, (long)l2), 4851201179636681512L, (long)l2);
                                    if (wArray != null) break block26;
                                }
                                catch (MatchException matchException) {
                                    throw _53.a(matchException);
                                }
                                if (object != false) break block27;
                            }
                            catch (MatchException matchException) {
                                throw _53.a(matchException);
                            }
                            object = _53.c("\u00fd", (Object)class_17992, (Object)_53.c("x", 4852470051859715576L, (long)l2), 4851201179636681512L, (long)l2);
                            if (wArray != null) break block26;
                        }
                        catch (MatchException matchException) {
                            throw _53.a(matchException);
                        }
                        if (object == false) break block28;
                    }
                    catch (MatchException matchException) {
                        throw _53.a(matchException);
                    }
                }
                object = true;
                break block26;
            }
            object = false;
        }
        return (boolean)object;
    }

    private boolean cfr_renamed_8(long l2, class_5321 class_53212, class_1799 class_17992) {
        Object object;
        block8: {
            block7: {
                _4w[] wArray;
                block6: {
                    long l3 = l2 = b ^ l2;
                    long l4 = l3 ^ 0x25A8BCB1CF4DL;
                    long l5 = l3 ^ 0x328C6E84F966L;
                    wArray = _3s.cfr_renamed_5();
                    try {
                        try {
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l4;
                            objectArray[0] = class_17992;
                            object = _53.c("\u00fd", (Object)this, (Object)objectArray, -4950225748772252608L, (long)l2);
                            if (wArray != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _53.a(matchException);
                        }
                        Object[] objectArray = new Object[3];
                        objectArray[2] = l5;
                        objectArray[1] = class_53212;
                        objectArray[0] = class_17992;
                        object = _53.c("\u00d5", (Object)objectArray, -4947518974895078790L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _53.a(matchException);
                    }
                }
                try {
                    if (wArray != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw _53.a(matchException);
                }
                object = true;
                break block8;
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_53.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_53.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

