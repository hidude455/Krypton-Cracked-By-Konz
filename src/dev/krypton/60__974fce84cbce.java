/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1819
 *  net.minecraft.class_3965
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
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
import net.minecraft.class_1819;
import net.minecraft.class_3965;

public class _60
extends _6x_0 {
    private final _92 cfr_renamed_9;
    private final _92 cfr_renamed_0;
    private final _92 cfr_renamed_1;
    private final _92 cfr_renamed_7;
    private int cfr_renamed_3;
    private int cfr_renamed_6;
    private int cfr_renamed_2;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_359(Object[] objectArray) {
        block21: {
            long l2;
            class_3965 class_39652;
            long l3;
            block22: {
                _60 v11;
                block23: {
                    CallSite callSite;
                    long l4;
                    block20: {
                        _4w[] wArray;
                        block17: {
                            block18: {
                                CallSite callSite2;
                                long l5;
                                block19: {
                                    l3 = (Long)objectArray[0];
                                    class_39652 = (class_3965)objectArray[1];
                                    long l6 = l3 = b ^ l3;
                                    l2 = l6 ^ 0x31543F0E61F0L;
                                    l4 = l6 ^ 0x3337A31B31DBL;
                                    l5 = l6 ^ 0x16F87A0395DEL;
                                    wArray = _3s.cfr_renamed_5();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    callSite = _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, -4866459628313777600L, (long)l3), -4867033884521831920L, (long)l3), -4870316365877568831L, (long)l3), (Object)_60.c("\u00d4", -4867846091580917974L, (long)l3), -4870518416806092739L, (long)l3);
                                                    if (wArray != null) break block17;
                                                    if (callSite != false) break block18;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _60.a(matchException);
                                                }
                                                callSite2 = _60.c("z", (Object)this, -4868239222201960639L, (long)l3);
                                                if (wArray != null) break block18;
                                            }
                                            catch (MatchException matchException) {
                                                throw _60.a(matchException);
                                            }
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l4;
                                            if (callSite2 >= _60.c("e", (Object)_60.c("z", (Object)this, -4866744115824863623L, (long)l3), (Object)objectArray2, -4867906462359147844L, (long)l3)) break block19;
                                        }
                                        catch (MatchException matchException) {
                                            throw _60.a(matchException);
                                        }
                                        _60 v7 = this;
                                        _60.c("\u00d8", (Object)v7, (int)(_60.c("z", (Object)v7, -4868239222201960639L, (long)l3) + true), -4868239222201960639L, (long)l3);
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw _60.a(matchException);
                                    }
                                }
                                _60.c("\u00d8", (Object)this, (int)_60.a("r", 12562, (long)(0x30E4D1C8918D2497L ^ l3)), -4868239222201960639L, (long)l3);
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = _60.c("\u00d4", -4867846091580917974L, (long)l3);
                                objectArray3[0] = l5;
                                callSite2 = _60.c("L", (Object)objectArray3, -4866658651433713477L, (long)l3);
                            }
                            callSite = _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, -4866459628313777600L, (long)l3), -4867033884521831920L, (long)l3), -4870316365877568831L, (long)l3), (Object)_60.c("\u00d4", -4867846091580917974L, (long)l3), -4870518416806092739L, (long)l3);
                        }
                        try {
                            try {
                                try {
                                    if (l3 <= 0L || wArray != null) break block20;
                                    if (callSite == false) break block21;
                                }
                                catch (MatchException matchException) {
                                    throw _60.a(matchException);
                                }
                                if (l3 <= 0L) break block22;
                                v11 = this;
                                if (wArray != null) break block23;
                            }
                            catch (MatchException matchException) {
                                throw _60.a(matchException);
                            }
                            callSite = _60.c("z", (Object)v11, -4868452595931077851L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _60.a(matchException);
                        }
                    }
                    try {
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l4;
                        if (callSite < _60.c("e", (Object)_60.c("z", (Object)this, -4869670097520314553L, (long)l3), (Object)objectArray4, -4867906462359147844L, (long)l3)) {
                            _60 v15 = this;
                            _60.c("\u00d8", (Object)v15, (int)(_60.c("z", (Object)v15, -4868452595931077851L, (long)l3) + true), -4868452595931077851L, (long)l3);
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _60.a(matchException);
                    }
                    v11 = this;
                }
                _60.c("\u00d8", (Object)v11, (int)_60.a("r", 6225, (long)(0x15CE7F2154A48DD7L ^ l3)), -4868452595931077851L, (long)l3);
            }
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = true;
            objectArray5[1] = class_39652;
            objectArray5[0] = l2;
            _60.c("L", (Object)objectArray5, -4867139273481751675L, (long)l3);
        }
    }

    private void cfr_renamed_360(Object[] objectArray) {
        block23: {
            long l2;
            class_3965 class_39652;
            long l3;
            block24: {
                _60 v13;
                block25: {
                    CallSite callSite;
                    CallSite callSite2;
                    block22: {
                        _4w[] wArray;
                        long l4;
                        block17: {
                            CallSite callSite3;
                            block18: {
                                _60 v5;
                                block19: {
                                    _60 v11;
                                    block20: {
                                        block21: {
                                            l3 = (Long)objectArray[0];
                                            class_39652 = (class_3965)objectArray[1];
                                            long l5 = l3 = b ^ l3;
                                            l2 = l5 ^ 0x64AD1AF741B9L;
                                            l4 = l5 ^ 0x66CE86E21192L;
                                            wArray = _3s.cfr_renamed_5();
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l4;
                                            callSite3 = _60.c("e", (Object)_60.c("z", (Object)this, -7196303396239652424L, (long)l3), (Object)objectArray2, -7189736065237251339L, (long)l3) - true;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            callSite2 = _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, -7187875601122145783L, (long)l3), -7188440382522244519L, (long)l3), -7189664773542289442L, (long)l3), -7196213121894078025L, (long)l3);
                                                            callSite = callSite3;
                                                            if (wArray != null) break block17;
                                                            if (callSite2 == callSite) break block18;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _60.a(matchException);
                                                        }
                                                        v5 = this;
                                                        if (wArray != null) break block19;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _60.a(matchException);
                                                    }
                                                    if (l3 <= 0L) break block20;
                                                    Object[] objectArray3 = new Object[1];
                                                    objectArray3[0] = l4;
                                                    if (_60.c("z", (Object)v5, -7189469308840438008L, (long)l3) >= _60.c("e", (Object)_60.c("z", (Object)this, -7188712600640653776L, (long)l3), (Object)objectArray3, -7189736065237251339L, (long)l3)) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _60.a(matchException);
                                                }
                                                _60 v9 = this;
                                                _60.c("\u00d8", (Object)v9, (int)(_60.c("z", (Object)v9, -7189469308840438008L, (long)l3) + true), -7189469308840438008L, (long)l3);
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw _60.a(matchException);
                                            }
                                        }
                                        v11 = this;
                                    }
                                    _60.c("\u00d8", (Object)v11, (int)_60.a("r", 6225, (long)(0x15CE2AD8715DAD9EL ^ l3)), -7189469308840438008L, (long)l3);
                                    v5 = this;
                                }
                                _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)v5, -7187875601122145783L, (long)l3), -7188440382522244519L, (long)l3), -7189664773542289442L, (long)l3), (int)callSite3, -7196608947705286650L, (long)l3);
                            }
                            callSite2 = _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, -7187875601122145783L, (long)l3), -7188440382522244519L, (long)l3), -7189664773542289442L, (long)l3), -7196213121894078025L, (long)l3);
                            callSite = callSite3;
                        }
                        try {
                            try {
                                try {
                                    if (l3 <= 0L || wArray != null) break block22;
                                    if (callSite2 != callSite) break block23;
                                }
                                catch (MatchException matchException) {
                                    throw _60.a(matchException);
                                }
                                if (l3 < 0L) break block24;
                                v13 = this;
                                if (wArray != null) break block25;
                            }
                            catch (MatchException matchException) {
                                throw _60.a(matchException);
                            }
                            callSite2 = _60.c("z", (Object)v13, -7196370852904486576L, (long)l3);
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l4;
                            callSite = _60.c("e", (Object)_60.c("z", (Object)this, -7188083650231581160L, (long)l3), (Object)objectArray4, -7189736065237251339L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _60.a(matchException);
                        }
                    }
                    try {
                        if (callSite2 < callSite) {
                            _60 v17 = this;
                            _60.c("\u00d8", (Object)v17, (int)(_60.c("z", (Object)v17, -7196370852904486576L, (long)l3) + true), -7196370852904486576L, (long)l3);
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw _60.a(matchException);
                    }
                    v13 = this;
                }
                _60.c("\u00d8", (Object)v13, (int)_60.a("r", 6225, (long)(0x15CE2AD8715DAD9EL ^ l3)), -7196370852904486576L, (long)l3);
            }
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = true;
            objectArray5[1] = class_39652;
            objectArray5[0] = l2;
            _60.c("L", (Object)objectArray5, -7188546106505210932L, (long)l3);
        }
    }

    private void cfr_renamed_125(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        _60.c("\u00d8", (Object)this, (int)_60.a("r", 6225, (long)(0x15CE26220902D966L ^ l2)), -1674825335199144976L, (long)l2);
        _60.c("\u00d8", (Object)this, (int)_60.a("r", 6225, (long)(0x15CE26220902D966L ^ l2)), -1666735197672605804L, (long)l2);
        _60.c("\u00d8", (Object)this, (int)_60.a("r", 6225, (long)(0x15CE26220902D966L ^ l2)), -1668207439432364632L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_74(Object[] var1_1) {
        block28: {
            block27: {
                block25: {
                    block26: {
                        block24: {
                            block23: {
                                var2_2 = (Long)var1_1[0];
                                v0 = var2_2 = _60.b ^ var2_2;
                                var4_3 = v0 ^ 15353140519573L;
                                var6_4 = v0 ^ 17534849461521L;
                                var8_5 = v0 ^ 30014251655528L;
                                var10_6 = v0 ^ 103576270150985L;
                                var12_7 = v0 ^ 12964882234624L;
                                var14_8 = _3s.cfr_renamed_5();
                                var16_9 = _60.c("z", (Object)_60.c("z", (Object)this, (long)3471709306605430299L, (long)var2_2), (long)3471149739018897151L, (long)var2_2);
                                try {
                                    try {
                                        v1 = var16_9;
                                        if (var14_8 != null) break block23;
                                        if (v1 instanceof class_3965) {
                                        }
                                        ** GOTO lbl32
                                    }
                                    catch (MatchException v2) {
                                        throw _60.a(v2);
                                    }
                                    v1 = var16_9;
                                }
                                catch (MatchException v3) {
                                    throw _60.a(v3);
                                }
                            }
                            var15_10 = (class_3965)v1;
                            try {
                                v4 = var14_8;
                                if (var2_2 >= 0L) {
                                    if (v4 == null) break block24;
                                }
                                ** GOTO lbl44
lbl32:
                                // 2 sources

                                return;
                            }
                            catch (MatchException v5) {
                                throw _60.a(v5);
                            }
                        }
                        try {
                            v6 = new Object[3];
                            v6[2] = _60.c("\u00d4", (long)3472172289605522198L, (long)var2_2);
                            v6[1] = _60.c("e", (Object)var15_10, (long)3472997747126573310L, (long)var2_2);
                            v4 = v6;
                            v6[0] = var8_5;
lbl44:
                            // 2 sources

                            v7 = _60.c("L", (Object)v4, (long)3472523240744178243L, (long)var2_2);
                            v8 = var14_8;
                            if (var2_2 >= 0L) {
                                if (v8 != null) break block25;
                                if (v7 != false) break block26;
                            }
                            ** GOTO lbl67
                        }
                        catch (MatchException v9) {
                            throw _60.a(v9);
                        }
                        return;
                    }
                    _60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)_60.c("z", (Object)this, (long)3471709306605430299L, (long)var2_2), (long)3472284809227780933L, (long)var2_2), (long)3471088924740681226L, (long)var2_2), (boolean)false, (long)3472588226814543220L, (long)var2_2);
                    v10 = new Object[2];
                    v10[1] = var4_3;
                    v10[0] = _60.c("e", (Object)var15_10, (long)3472997747126573310L, (long)var2_2);
                    v7 = _60.c("L", (Object)v10, (long)3471579821997352486L, (long)var2_2);
                }
                try {
                    try {
                        try {
                            if (var2_2 <= 0L) break block27;
                            v8 = var14_8;
lbl67:
                            // 2 sources

                            if (v8 != null) break block27;
                            if (v7 == false) ** GOTO lbl82
                        }
                        catch (MatchException v11) {
                            throw _60.a(v11);
                        }
                        v12 = new Object[2];
                        v12[1] = var15_10;
                        v12[0] = var12_7;
                        _60.c("e", (Object)this, (Object)v12, (long)3472486085350990844L, (long)var2_2);
                        if (var14_8 != null) {
                        }
                        break block28;
                    }
                    catch (MatchException v13) {
                        throw _60.a(v13);
                    }
lbl82:
                    // 2 sources

                    v14 = new Object[2];
                    v14[1] = _60.c("e", (Object)var15_10, (long)3472997747126573310L, (long)var2_2);
                    v14[0] = var6_4;
                    v7 = _60.c("L", (Object)v14, (long)3472019243303335931L, (long)var2_2);
                }
                catch (MatchException v15) {
                    throw _60.a(v15);
                }
            }
            try {
                if (v7 != false) {
                    v16 = new Object[2];
                    v16[1] = var15_10;
                    v16[0] = var10_6;
                    _60.c("e", (Object)this, (Object)v16, (long)3471550427105713527L, (long)var2_2);
                }
            }
            catch (MatchException v17) {
                throw _60.a(v17);
            }
        }
    }

    public _60(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x1A74F4D1549EL;
        long l5 = l3 ^ 0x5C2C515BA564L;
        long l6 = l3 ^ 0x43ECC27F4A16L;
        super((int)_60.a("r", 18258, (long)(0x281DB02956F762FDL ^ l2)), -1, (_4r)((Object)_60.c("\u00d4", 890794857802392660L, (long)l2)), l5);
        this.cfr_renamed_9 = new _92((int)_60.a("r", 5184, (long)(0x5614010678B8B1EAL ^ l2)), 0.0, l4, 20.0, 0.0, 1.0);
        this.cfr_renamed_0 = new _92((int)_60.a("r", 20952, (long)(0x7D3BA2304E3DF473L ^ l2)), 0.0, l4, 20.0, 0.0, 1.0);
        this.cfr_renamed_1 = new _92((int)_60.a("r", 1487, (long)(0x6E45BFFEF50A063L ^ l2)), 0.0, l4, 20.0, 0.0, 1.0);
        this.cfr_renamed_7 = new _92((int)_60.a("r", 31849, (long)(0x673BE93C84BD9C1L ^ l2)), 1.0, l4, 9.0, 1.0, 1.0);
        _60.c("\u00d8", (Object)this, (int)_60.a("r", 6225, (long)(0x15CE1ACCFB513DFCL ^ l2)), 890569052679997290L, (long)l2);
        _60.c("\u00d8", (Object)this, (int)_60.a("r", 6225, (long)(0x15CE1ACCFB513DFCL ^ l2)), 884022492019462926L, (long)l2);
        _60.c("\u00d8", (Object)this, (int)_60.a("r", 6225, (long)(0x15CE1ACCFB513DFCL ^ l2)), 883667336885414194L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_60.c("z", (Object)this, 891360808082925138L, (long)l2), _60.c("z", (Object)this, 882724447906170732L, (long)l2), _60.c("z", (Object)this, 890863996090701434L, (long)l2), _60.c("z", (Object)this, 883734828111780314L, (long)l2)};
        objectArray[0] = l6;
        _60.c("e", (Object)this, (Object)objectArray, 883254201836720466L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_60.class, 17);
                _60.b = l.a(-5925758720719828361L, 4307213895739218484L, MethodHandles.lookup().lookupClass()).a(117676399139578L);
                _60.j = new Object[88];
                _60.k = new String[88];
                _60.b();
                _60.f = new HashMap<K, V>(13);
                var0 = _60.b ^ 120021116415959L;
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
                var6_5 = "\u00be\u007fb\u0094\u0001\u00cf\u00db|N\"VX\u00f0\u00db\\\u00de\u0010\u00dc0\u00efN\u00ea\u00b0\u0015R\u00e0\u009c\u00fc\u0090\u0093iO:\u00ceD1\u00b9\u0085\u00ce(";
                var7_6 = "\u00be\u007fb\u0094\u0001\u00cf\u00db|N\"VX\u00f0\u00db\\\u00de\u0010\u00dc0\u00efN\u00ea\u00b0\u0015R\u00e0\u009c\u00fc\u0090\u0093iO:\u00ceD1\u00b9\u0085\u00ce(".length();
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
                    var6_5 = "\u009f\u00e6\u0086\u00c0\u00b4\u001en\u009cu\u00dd\u00e9_\u00d1`\u00fev";
                    var7_6 = "\u009f\u00e6\u0086\u00c0\u00b4\u001en\u009cu\u00dd\u00e9_\u00d1`\u00fev".length();
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
        _60.d = var8_3;
        _60.e = new Integer[7];
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
            case 0 -> 20;
            case 1 -> 57;
            case 2 -> 61;
            case 3 -> 15;
            case 4 -> 25;
            case 5 -> 30;
            case 6 -> 34;
            case 7 -> 28;
            case 8 -> 45;
            case 9 -> 38;
            case 10 -> 1;
            case 11 -> 2;
            case 12 -> 3;
            case 13 -> 27;
            case 14 -> 36;
            case 15 -> 49;
            case 16 -> 33;
            case 17 -> 42;
            case 18 -> 41;
            case 19 -> 13;
            case 20 -> 19;
            case 21 -> 11;
            case 22 -> 47;
            case 23 -> 44;
            case 24 -> 53;
            case 25 -> 18;
            case 26 -> 35;
            case 27 -> 50;
            case 28 -> 5;
            case 29 -> 54;
            case 30 -> 17;
            case 31 -> 40;
            case 32 -> 52;
            case 33 -> 0;
            case 34 -> 10;
            case 35 -> 23;
            case 36 -> 55;
            case 37 -> 60;
            case 38 -> 24;
            case 39 -> 29;
            case 40 -> 21;
            case 41 -> 51;
            case 42 -> 22;
            case 43 -> 6;
            case 44 -> 39;
            case 45 -> 4;
            case 46 -> 43;
            case 47 -> 63;
            case 48 -> 37;
            case 49 -> 12;
            case 50 -> 26;
            case 51 -> 9;
            case 52 -> 8;
            case 53 -> 32;
            case 54 -> 46;
            case 55 -> 7;
            case 56 -> 62;
            case 57 -> 48;
            case 58 -> 31;
            case 59 -> 59;
            case 60 -> 58;
            case 61 -> 56;
            case 62 -> 14;
            default -> 16;
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
        _60.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = ")\"!h6\u000f47#)3S{w";
        objectArray[1] = Integer.TYPE;
        _60.k[1] = "java/lang/Integer";
        objectArray[2] = "p2;Lq\u0016m'9\rtJ-e";
        objectArray[3] = "2{x~Cw/nz?F+bl";
        objectArray[4] = "Z!\u000exi6G4\f9lj\b<";
        objectArray[5] = "9W7\u0010\u000e.Lw<\u001f\u001fa-y7\u0014\u001b;Y";
        objectArray[6] = Void.TYPE;
        _60.k[6] = "java/lang/Void";
        objectArray[7] = "5\rb]\u001d[0\u0018i]\u0016@<\b+4=j\r";
        objectArray[8] = Long.TYPE;
        _60.k[8] = "java/lang/Long";
        objectArray[9] = "&!\u001ee\u000e;&!\t9\u00024<j\t'\u0002!;\u001bSxQa";
        objectArray[10] = "\u0002\fqV\u0014\u0012\u0002\ff\n\u0018\u001d\u0018Gf\u0014\u0018\b\u001f6<KJJ";
        objectArray[11] = Boolean.TYPE;
        _60.k[11] = "java/lang/Boolean";
        objectArray[12] = "1\u0017[,K\u00061\u0017LpG\t+\\LnG\u001c,-\u00186\u0010";
        objectArray[13] = "b`&BdYb`1\u001ehVx+1\u0000hC\u007fZc[0\t";
        objectArray[14] = "s8WWU>s8@\u000bY1is@\u0015Y$n\u0002\u0010H\b";
        objectArray[15] = "LxrjGILxe6KFV3e(KSQB7t\u001e\u0011";
        objectArray[16] = "X`p\u0018j*X`gDf%B+gZf0EZ5\u0001>q";
        objectArray[17] = "\u0005\u0003zMpQ\u0005\u0003m\u0011|^\u001fHm\u000f|K\u001897P.\f";
        objectArray[18] = "\u000b\u0005\u001bE>e~%\u0010J/*\u001f+\u001bA+pk";
        objectArray[19] = "\u007f\nlP\u0003M\n*g_\u0012\u0002k$lT\u0016X\u001f";
        objectArray[20] = "#J/L\u0000$#J8\u0010\f+9\u00018\u000e\f>>poQZ";
        objectArray[21] = "\\%G;S5)\u0005L4BzH\u000bG?F <";
        objectArray[22] = "0\u0005\u0005f|=-\u0010\u0007'yam+";
        objectArray[23] = "9JTQ3\u0019Lj_^\"V-dTU&\fY";
        objectArray[24] = "o\u0012\u0000\\~gr\u0007\u0002\u001d{;3\r";
        objectArray[25] = "UZz9w\u0004 zq6fKAtz=b\u00115";
        objectArray[26] = ":{2w\u001d\u0014O[9x\f[.U2s\b\u0001Z";
        objectArray[27] = "\u0000\u0004.eW_\u001d\u0011,$R\u0003P'";
        objectArray[28] = "imW&<)\u001cM\\)-f}CW\")<\t";
        objectArray[29] = "[ s4@\u0017[ dhL\u0018AkdvL\rF\u001a6\"\u001dL";
        objectArray[30] = "z)\u001bRudz)\f\u000eyk`b\f\u0010y~g\u0013]N,;";
        objectArray[31] = "Yu\u0017MzxYu\u0000\u0011vwC>\u0000\u000fvbDOQQ#)";
        objectArray[32] = "rDkYJ\u0013\u0007d`V[\\fjk]_\u0006\u0012";
        objectArray[33] = "|?v`k=\t\u001f}ozrh\u0011vd~(\u001c";
        objectArray[34] = ")\u0018e\u000b\u0010N)\u0018rW\u001cA3SrI\u001cT4\"#\u0016D";
        objectArray[35] = "\u0006_ET3\u0010\u0006_R\b?\u001f\u001c\u0014R\u0016?\n\u001be\u0002ChL";
        objectArray[36] = "ead:Q\reasf]\u0002\u007f*sx]\u0017x[\"'\u000f\\";
        objectArray[37] = "F%\u001fyS\nF%\b%_\u0005\\n\b;_\u0010[\u001fXg\n";
        objectArray[38] = "/={NzO/=l\u0012v@5vl\fvU2\u0007<Q\"";
        objectArray[39] = "\u00030\ni;1v\u0010\u0001f*~\u0017\u001e\nm.$c";
        objectArray[40] = "Dz\u0019`R)1Z\u0012oCfPT\u0019dG<$";
        objectArray[41] = "@NMz\u001385nFu\u0002wT`M~\u0006- ";
        objectArray[42] = "*\fJm]\u0015*\f]1Q\u001a0G]/Q\u000f76\u000fu\u0006M";
        objectArray[43] = "iI6.y\u001cbF'a\u0018\u0012iM#;";
        objectArray[44] = "qv\u00179r\ru}\u0013}\n\r(r\u000fHg\u001e\t{\r|g(1`\f`lbq\u007f\b~a\u0004(#\u001e>\n['`\u001d{e\f2,\t\u00073\t0q\fhd\u001c|ep";
        objectArray[45] = "\u007f?\u0005wA`<7\n,+{,3T*GI|p\u0004v\u0011\u001e~~D.Gp$/Ku+!&)S|\u0015p:7EM";
        objectArray[46] = "4&u4;`x{{zV:i9r,:\b:}-zVnf{v\"g'y(nK";
        objectArray[47] = "<s;CFE6b \"\u001d9ii9OZV>|u[";
        objectArray[48] = "\u0000?@\u0003N-\n.[b\u0010QU%B\u000fR>\u00020\u000e\u001b";
        objectArray[49] = "#8n)o\u0016j'=1\u0006B\u007f&0*jp)cmr:'xfhwi\u001cs=m?\u0006\u0018u<7|8Ii\"!M";
        objectArray[50] = "ezE\u001b\u0011(y\"\u0019\u000fi}tbB\r\u0005O'!\u001fQS\u0018 u^\u0007\u0015ww`\u0012\u0013i";
        objectArray[51] = "\"\u0005\u000e\"us(\u0014\u0015C)\u000fw\u000f\u000b|om\u007f\u001a\u0017|";
        objectArray[52] = "\u000b\u0001[\u000fT>G\\UA9dV\u001e\\\u0017UV\u0005Z\u0000O90Y\\X\u0019\byF\u000f@p";
        objectArray[53] = "o|7m\u000e6em,\fPJxt&}\b*mvq1nudk.=P$xu8\f";
        objectArray[54] = "\u001c<*Y<yCe)\u001eY,\u0016$8\u00075\u001eBgg_fI\u0003b)\u001b6yB(d\u0002Y";
        objectArray[55] = ")\u0004\u0013*jU5\\O>\u0012\u00008\u001c\u0014<~2kYHj,el\u000b\b6n\n;\u001eD\"\u0012Y,[\t&yY>\u000b\u0013[";
        objectArray[56] = "r\u0016{g\\{5Bnn%cfQulIQ1\u0016);\u001c\u00064Jsl\u00148eVmz%:r\u0016hvN:`Fr\u000b";
        objectArray[57] = "F)Ld:k\u000f6\u001f|S?\u001a7\u0012g?\rHzJ1S0KsHoh;\u0010v\u0000\u0000";
        objectArray[58] = "(_&\u0002F~}\n<\u0002-9\u0013\u001e5W\\fs\u000b7\u0000\u0010\u0000/\u001cwEPk/\u000e'_-";
        objectArray[59] = "\t\u001d?tYM\u0002F:<6\u0013\u000e]g)Z!^\u001e<r\tv]Q6t\\\b\u001eY9/6";
        objectArray[60] = "K&\u0016v?'Da\u0000.B8Cu\t\u007f\u0015o\u001c)U\u0013;.Ni\u0015h,&K#";
        objectArray[61] = "1\tX\u0016\u001dv;\u0018CwM\nd\u0003]H\u0007hl\u0016AH";
        objectArray[62] = "j[\u000f'yY`J\u0014F&E\u0006Q\b)hCfD\n~$%:SJ;dN:A\u001a!\u0019";
        objectArray[63] = "/$C.\u007fu/lQo\u0004wMeV~u*-pT)9LryIv5r#eW`\u0004";
        objectArray[64] = "w(B2\b\u0001w`Pss\u0002\u0015iWb\u0002^u|U5N8*uHjB\u0006{iV|s";
        objectArray[65] = "~f`\n\u0006\u0006~.rK}\u0002\u001c'uZ\fY|2w\r@? %7H\u0000T 7gR}";
        objectArray[66] = "{pL)sDp,DsJC~-Fy\u001d\u0017$y\u001f/JIm;Z.4Nz,E";
        objectArray[67] = "\u0012\u0004INy=\u001dC_\u0016\u0004\"\u001aWVGSuD\u0000\u000e+4/\u001cE_\u0014xr\u0012\u000b";
        objectArray[68] = "^:\u0011\u000fBbT+\nn\u0018}20\u0016\u0001SxR%\u0014V\u001f\u001e\u000e2T\u0013_u\u000e \u0004\t\"";
        objectArray[69] = "SW}G~\u0013JO8\\ENWJ%J)|\u0006\nt\u0015E\u0016YN<F#O\u0005X|-";
        objectArray[70] = "\u0012UUuC.\u001d\u0012C->1\u001a\u0006J|ifDV\u0013\u0010Sb\u001fPQh@1K\u0015";
        objectArray[71] = "\u0016\u000b\u0007qq\u0016\u001c\u001a\u001c\u0010.jC\u0001\u0002/k\bK\u0014\u001e/";
        objectArray[72] = "i\u001c\u0011l\u0016+4ANphs\t^Yq\u0019(iK[&UN6BFyYpg^Xoh";
        objectArray[73] = "Ps\u0017_!CZb\f>~f<y\u0010Q0Y\\l\u0012\u0006|?\u0000{RC<T\u0000i\u0002YA";
        objectArray[74] = "o\u0011\u001a\u000b\u0006SoY\bJ}S\rP\u000f[\f\fmE\r\f@j2L\u0010SLTcP\u000eE}";
        objectArray[75] = "eNW(ns0\u001bM(\u00054^\u001d\u0003i`p/\u0012D\u007f8";
        objectArray[76] = "\\2\u001f\u001a:[Su\tBGDTa\u0000\u0013\u0010\u0013\n2Y\u007f!NQ0_Fy\u0013\u00043";
        objectArray[77] = "\u0002\r7^\u001aD\rJ!\u0006gP\u0006O,\\\u000bbQ\tr\u000b\\5\u0002RtQ\\\r\u001bJ1Jg";
        objectArray[78] = "(aN`F[\"pU\u0001\u0017'}kK>\\Eu~W>";
        objectArray[79] = "\t-6$r\u0002^=.i\u001d#t\u0006\u001e\u001fAh\t-6$r\u0002^=.i";
        objectArray[80] = "'<~l:\u001083xk\u000b\u001bI);yzM)<9.6+v5$q:\u0015'):g\u000b";
        objectArray[81] = "XZ3\u0015\u001fQ\u0014\u0007=[r\u000b\u0005E4\r\u001e9S\u0000iVBn\u0014]3\u001b\n^\b\u0005o\u000fr";
        objectArray[82] = "\u000f%\u007fB?\u0012\u00054d#enZ?}N#\u0001\r*1Z";
        objectArray[83] = "7>s\u0019e] 6vS\u001dH/+{\u0004J\u001f\u007f~#hd\u001d *f\u0015#I5#";
        objectArray[84] = "T*\ty<X@6\t1VY^)\u0000-\u0001\n\u0007|[|V\b\u000e4\u0007-8R_;\\";
        objectArray[85] = "+\u000b\u0017\u001a9X!\u001a\f{cyG\u0001\u0010\u0014(B'\u0014\u0012Cd${\u0003R\u0006$O{\u0011\u0002\u001cY";
        objectArray[86] = "nF@ld+fS\\l\u001etWFB<o/7S@k#InVG>b&9C\u000b*\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[87] = "\fr\u000bZZBVp\u0005A`F\u000e~^N7\u0018_+\u0003\"\n\u0014W)U\u0019\u0001ORa";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _60.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == '\u00d8' || c == '\u00d4' || c == '\u00d6') {
                field = _60.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _60.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/60" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _60.e(l2, l3);
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
                clazz3 = _60.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _60.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _60.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _60.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _60.f(3035666432293002L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _60.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _60.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _60.f(3035666432293002L, 0L);
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
            int n = _60.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _60.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _60.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _60.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _60.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _60.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/60" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x29E1;
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
                throw new RuntimeException("dev/krypton/60", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _60.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _60.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _60.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _60.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _60.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _60.c(clazz3, string2, clazz2)) != null) {
                    _60.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _60.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _60.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _60.f(3035666432293002L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_2(_9o o) {
        CallSite callSite;
        long l2;
        long l3;
        block11: {
            long l4;
            block12: {
                _60 v1;
                _4w[] wArray;
                long l5;
                block9: {
                    block10: {
                        long l6 = l3 = b ^ 0x14C99CE34E5DL;
                        l2 = l6 ^ 0x25849CF7E62L;
                        l5 = l6 ^ 0x75A918CC28B4L;
                        l4 = l6 ^ 0x2FFBBF84B87BL;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                v1 = this;
                                if (wArray != null) break block9;
                                if (_60.c("z", (Object)_60.c("z", (Object)v1, -66193543211800286L, (long)l3), -65409137008534806L, (long)l3) == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _60.a(matchException);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _60.a(matchException);
                        }
                    }
                    v1 = this;
                }
                try {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l5;
                    callSite = _60.c("e", (Object)v1, (Object)objectArray, -68865121016333341L, (long)l3);
                    if (wArray != null) break block11;
                    if (callSite == false) break block12;
                }
                catch (MatchException matchException) {
                    throw _60.a(matchException);
                }
                return;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l4;
            objectArray[0] = 1;
            callSite = _60.c("L", (Object)objectArray, -66932725510627482L, (long)l3);
        }
        try {
            if (callSite != false) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                _60.c("e", (Object)this, (Object)objectArray, -65562644133975778L, (long)l3);
            }
        }
        catch (MatchException matchException) {
            throw _60.a(matchException);
        }
    }

    @Override
    public native void cfr_renamed_2();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean boolean_6(Object[] objectArray) {
        Object object;
        block34: {
            _4w[] wArray;
            block33: {
                _4w[] wArray2;
                block31: {
                    CallSite callSite;
                    block32: {
                        Object object2;
                        boolean bl;
                        Object object3;
                        long l2;
                        block29: {
                            block30: {
                                boolean bl2;
                                block26: {
                                    block28: {
                                        block27: {
                                            Object object4;
                                            block23: {
                                                block25: {
                                                    block24: {
                                                        l2 = (Long)objectArray[0];
                                                        l2 = b ^ l2;
                                                        wArray2 = _3s.cfr_renamed_5();
                                                        try {
                                                            try {
                                                                try {
                                                                    object4 = _60.c("e", (Object)_60.c("e", (Object)_60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, 7420677407966834893L, (long)l2), 7420107540613806237L, (long)l2), 7414190631610368076L, (long)l2), 7414956985625519080L, (long)l2), 7415105264639804524L, (long)l2), (Object)_60.c("\u00d4", 7420919401757535505L, (long)l2), 7413530815829934121L, (long)l2);
                                                                    if (wArray2 != null) break block23;
                                                                    if (object4 != false) break block24;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _60.a(matchException);
                                                                }
                                                                object4 = _60.c("e", (Object)_60.c("e", (Object)_60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, 7420677407966834893L, (long)l2), 7420107540613806237L, (long)l2), 7413739743415863742L, (long)l2), 7414956985625519080L, (long)l2), 7415105264639804524L, (long)l2), (Object)_60.c("\u00d4", 7420919401757535505L, (long)l2), 7413530815829934121L, (long)l2);
                                                                if (wArray2 != null) break block23;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _60.a(matchException);
                                                            }
                                                            if (object4 == false) break block25;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _60.a(matchException);
                                                        }
                                                    }
                                                    object4 = true;
                                                    break block23;
                                                }
                                                object4 = false;
                                            }
                                            object3 = object4;
                                            try {
                                                try {
                                                    try {
                                                        bl2 = _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, 7420677407966834893L, (long)l2), 7420107540613806237L, (long)l2), 7414190631610368076L, (long)l2), 7414956985625519080L, (long)l2) instanceof class_1819;
                                                        if (wArray2 != null) break block26;
                                                        if (bl2) break block27;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _60.a(matchException);
                                                    }
                                                    bl2 = _60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)_60.c("z", (Object)this, 7420677407966834893L, (long)l2), 7420107540613806237L, (long)l2), 7413739743415863742L, (long)l2), 7414956985625519080L, (long)l2) instanceof class_1819;
                                                    if (wArray2 != null) break block26;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _60.a(matchException);
                                                }
                                                if (!bl2) break block28;
                                            }
                                            catch (MatchException matchException) {
                                                throw _60.a(matchException);
                                            }
                                        }
                                        bl2 = true;
                                        break block26;
                                    }
                                    bl2 = false;
                                }
                                bl = bl2;
                                try {
                                    try {
                                        object2 = _60.c("L", (long)_60.c("e", (Object)_60.c("e", (Object)_60.c("z", (Object)this, 7420677407966834893L, (long)l2), 7420299224020871097L, (long)l2), 7419736794450712287L, (long)l2), 1, 7413622437388170469L, (long)l2);
                                        if (wArray2 != null) break block29;
                                        if (object2 != true) break block30;
                                    }
                                    catch (MatchException matchException) {
                                        throw _60.a(matchException);
                                    }
                                    object2 = true;
                                    break block29;
                                }
                                catch (MatchException matchException) {
                                    throw _60.a(matchException);
                                }
                            }
                            object2 = false;
                        }
                        callSite = object2;
                        try {
                            try {
                                object = object3;
                                if (wArray2 != null) break block31;
                                if (object != false) break block32;
                                object = bl;
                                wArray = wArray2;
                                if (l2 <= 0L) break block33;
                                if (wArray != null) break block31;
                            }
                            catch (MatchException matchException) {
                                throw _60.a(matchException);
                            }
                            if (object == false) break block34;
                        }
                        catch (MatchException matchException) {
                            throw _60.a(matchException);
                        }
                    }
                    object = callSite;
                }
                wArray = wArray2;
            }
            if (wArray != null) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_60.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_60.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

