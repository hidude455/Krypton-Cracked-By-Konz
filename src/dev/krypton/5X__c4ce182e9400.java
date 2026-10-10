/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1792
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._42;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._92;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1792;

public class _5X
extends _6x_0 {
    private final _9j_0 cfr_renamed_41;
    private final _92 cfr_renamed_216;
    private final _9r cfr_renamed_6;
    private final _92 cfr_renamed_4;
    private final _9r cfr_renamed_345;
    private final _92 cfr_renamed_1;
    private boolean cfr_renamed_8;
    private boolean cfr_renamed_9;
    private boolean cfr_renamed_2;
    private int cfr_renamed_0;
    private int cfr_renamed_3;
    private int cfr_renamed_7;
    private int cfr_renamed_199;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    /*
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_5(_9o o) {
        block74: {
            _5X x;
            long l2;
            long l3;
            block88: {
                CallSite callSite;
                _4w[] wArray;
                long l4;
                block86: {
                    long l5;
                    block87: {
                        block78: {
                            block79: {
                                block81: {
                                    CallSite callSite2;
                                    CallSite callSite3;
                                    long l6;
                                    block84: {
                                        Object object;
                                        Predicate<class_1792> predicate;
                                        block82: {
                                            block83: {
                                                block80: {
                                                    Predicate<class_1792> predicate2;
                                                    _5X x2;
                                                    long l7;
                                                    long l8;
                                                    long l9;
                                                    block77: {
                                                        Object object2;
                                                        CallSite callSite4;
                                                        block75: {
                                                            block76: {
                                                                block73: {
                                                                    block72: {
                                                                        block71: {
                                                                            block69: {
                                                                                _5X x3;
                                                                                long l10;
                                                                                long l11;
                                                                                block68: {
                                                                                    CallSite callSite5;
                                                                                    block66: {
                                                                                        block67: {
                                                                                            long l12 = l3 = b ^ 0xBB4E03F3905L;
                                                                                            l11 = l12 ^ 0x453385313CC2L;
                                                                                            l9 = l12 ^ 0x1E6232706E00L;
                                                                                            l10 = l12 ^ 0x2C7478B5F43L;
                                                                                            l8 = l12 ^ 0xA54EDF85AB8L;
                                                                                            l2 = l12 ^ 0x1278044BED11L;
                                                                                            l6 = l12 ^ 0x17998DE89581L;
                                                                                            l4 = l12 ^ 0x5B8EC801CD13L;
                                                                                            l5 = l12 ^ 0x481B81ABD5B1L;
                                                                                            l7 = l12 ^ 0x4DFF9A85E89EL;
                                                                                            wArray = _3s.cfr_renamed_5();
                                                                                            try {
                                                                                                try {
                                                                                                    callSite5 = _5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3);
                                                                                                    if (wArray != null) break block66;
                                                                                                    if (_5X.c("\u00ef", (Object)callSite5, 1743378458349886204L, (long)l3) == null) break block67;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _5X.a(matchException);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5X.a(matchException);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            x3 = this;
                                                                                            if (wArray != null) break block68;
                                                                                            callSite5 = _5X.c("\u00ef", (Object)x3, 1742407646563128205L, (long)l3);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5X.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (_5X.c("\u00ef", (Object)callSite5, 1743286357580230469L, (long)l3) == null) {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5X.a(matchException);
                                                                                    }
                                                                                    x3 = this;
                                                                                }
                                                                                try {
                                                                                    block70: {
                                                                                        try {
                                                                                            try {
                                                                                                callSite4 = _5X.c("\u00ef", (Object)x3, 1742813935409798644L, (long)l3);
                                                                                                if (wArray != null) break block69;
                                                                                                if (callSite4 <= 0) break block70;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _5X.a(matchException);
                                                                                            }
                                                                                            _5X x4 = this;
                                                                                            _5X.c("O", (Object)x4, (int)(_5X.c("\u00ef", (Object)x4, 1742813935409798644L, (long)l3) - true), 1742813935409798644L, (long)l3);
                                                                                            if (wArray == null) break block71;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5X.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    Object[] objectArray = new Object[1];
                                                                                    objectArray[0] = l11;
                                                                                    Object[] objectArray2 = new Object[2];
                                                                                    objectArray2[1] = l10;
                                                                                    objectArray2[0] = (int)_5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)this, 1742096132144624938L, (long)l3), (Object)objectArray, 1743641502593968587L, (long)l3);
                                                                                    callSite4 = _5X.c("l", (Object)objectArray2, 1742235578000209574L, (long)l3);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5X.a(matchException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (wArray != null) break block72;
                                                                                    if (callSite4 == false) break block71;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5X.a(matchException);
                                                                                }
                                                                                _5X.c("O", (Object)this, (boolean)_5X.a("c", 5659, (long)(0x3D61488999A616D5L ^ l3)), 1743554149697554337L, (long)l3);
                                                                                _5X.c("O", (Object)this, (int)_5X.a("c", 2262, (long)(0x5253B9A0CB1A8816L ^ l3)), 1742813935409798644L, (long)l3);
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5X.a(matchException);
                                                                            }
                                                                        }
                                                                        callSite4 = _5X.c("\u00ef", (Object)this, 1743554149697554337L, (long)l3);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (wArray != null) break block73;
                                                                            if (callSite4 == false) break block74;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5X.a(matchException);
                                                                        }
                                                                        callSite4 = _5X.c("\u00ef", (Object)this, 1743155773713875634L, (long)l3);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5X.a(matchException);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        object2 = -1;
                                                                        if (wArray != null) break block75;
                                                                        if (callSite4 != object2) break block76;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5X.a(matchException);
                                                                    }
                                                                    _5X.c("O", (Object)this, (int)_5X.c("\u00d9", (Object)_5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), 1741991795681603773L, (long)l3), 1744388325329852348L, (long)l3), 1743155773713875634L, (long)l3);
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5X.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                x2 = this;
                                                                if (wArray != null) break block77;
                                                                callSite4 = _5X.c("\u00ef", (Object)x2, 1744115491548193416L, (long)l3);
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l6;
                                                                object2 = _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)this, 1742750345691805539L, (long)l3), (Object)objectArray, 1741246199210464474L, (long)l3);
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5X.a(matchException);
                                                            }
                                                        }
                                                        try {
                                                            if (callSite4 < object2) {
                                                                _5X x5 = this;
                                                                _5X.c("O", (Object)x5, (int)(_5X.c("\u00ef", (Object)x5, 1744115491548193416L, (long)l3) + true), 1744115491548193416L, (long)l3);
                                                                return;
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5X.a(matchException);
                                                        }
                                                        x2 = this;
                                                    }
                                                    CallSite callSite6 = _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)x2, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), (Object)_5X.c("S", 1743492057522711770L, (long)l3), 1741866130455970107L, (long)l3);
                                                    try {
                                                        predicate2 = _5X.c("\u00d9", (Object)callSite6, (Object)_5X.c("S", 1743393634265763629L, (long)l3), 1744477698153262266L, (long)l3) != false ? arg_0 -> _42.cfr_renamed_0(l8, arg_0) : arg_0 -> _5X.cfr_renamed_6(l9, arg_0);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5X.a(matchException);
                                                    }
                                                    predicate = predicate2;
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    callSite = _5X.c("\u00ef", (Object)this, 1745092600495443167L, (long)l3);
                                                                    if (wArray != null) break block78;
                                                                    if (callSite != false) break block79;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _5X.a(matchException);
                                                                }
                                                                Object[] objectArray = new Object[2];
                                                                objectArray[1] = l7;
                                                                objectArray[0] = predicate;
                                                                object = _5X.c("l", (Object)objectArray, 1742283060763892709L, (long)l3);
                                                                if (wArray != null) break block80;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _5X.a(matchException);
                                                            }
                                                            if (object != false) break block81;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5X.a(matchException);
                                                        }
                                                        object = _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)this, 1744171951938053933L, (long)l3), (long)l5, 1743878715891559663L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5X.a(matchException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (wArray != null) break block82;
                                                        if (object != false) break block83;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5X.a(matchException);
                                                    }
                                                    Object[] objectArray = new Object[1];
                                                    objectArray[0] = l2;
                                                    _5X.c("\u00d9", (Object)this, (Object)objectArray, 1742365975084794379L, (long)l3);
                                                    return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5X.a(matchException);
                                                }
                                            }
                                            object = -1;
                                        }
                                        callSite3 = object;
                                        for (reference var26_16 = _5X.a("c", 6726, (long)(0x2A97C6C70D719A8DL ^ l3)); var26_16 < _5X.a("c", 27786, (long)(0x14C81167AC54EC43L ^ l3)); ++var26_16) {
                                            reference v41;
                                            block85: {
                                                try {
                                                    try {
                                                        callSite2 = _5X.c("\u00d9", predicate, (Object)_5X.c("\u00d9", (Object)_5X.c("\u00d9", (Object)_5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), 1741991795681603773L, (long)l3), (int)var26_16, 1743992363385719147L, (long)l3), 1743754865534383473L, (long)l3), 1741275698840618062L, (long)l3);
                                                        if (wArray != null) break block84;
                                                        if (wArray != null) break block85;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5X.a(matchException);
                                                    }
                                                    if (callSite2 == false) continue;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5X.a(matchException);
                                                }
                                                v41 = var26_16;
                                            }
                                            callSite3 = v41;
                                            try {
                                                if (wArray == null) break;
                                                if (wArray == null) continue;
                                                break;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5X.a(matchException);
                                            }
                                        }
                                        callSite2 = callSite3;
                                    }
                                    try {
                                        if (callSite2 == -1) {
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l2;
                                            _5X.c("\u00d9", (Object)this, (Object)objectArray, 1742365975084794379L, (long)l3);
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw _5X.a(matchException);
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l6;
                                    _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1742550299940774345L, (long)l3), (int)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), 1742652928234890810L, (long)l3), 1741437967172939348L, (long)l3), (int)callSite3, (int)(_5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)this, 1743719546673057620L, (long)l3), (Object)objectArray, 1741246199210464474L, (long)l3) - true), (Object)_5X.c("S", 1744248548021277631L, (long)l3), (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), 1742155687370040340L, (long)l3);
                                    _5X.c("O", (Object)this, (int)_5X.a("c", 19325, (long)(0x6A6E584AFCA54BBBL ^ l3)), 1744115491548193416L, (long)l3);
                                    return;
                                }
                                _5X.c("O", (Object)this, (boolean)_5X.a("c", 10529, (long)(0x49FA7407DB89A9E4L ^ l3)), 1745092600495443167L, (long)l3);
                            }
                            callSite = _5X.c("\u00ef", (Object)this, 1744580842901336154L, (long)l3);
                        }
                        try {
                            try {
                                if (wArray != null) break block86;
                                if (callSite != false) break block87;
                            }
                            catch (MatchException matchException) {
                                throw _5X.a(matchException);
                            }
                            _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1742550299940774345L, (long)l3), (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), (Object)_5X.c("S", 1742507188410383405L, (long)l3), 1741497492323829362L, (long)l3);
                            _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)_5X.c("\u00ef", (Object)this, 1742407646563128205L, (long)l3), 1743286357580230469L, (long)l3), (Object)_5X.c("S", 1742507188410383405L, (long)l3), 1741949288425368928L, (long)l3);
                            _5X.c("O", (Object)this, (boolean)_5X.a("c", 10529, (long)(0x49FA7407DB89A9E4L ^ l3)), 1744580842901336154L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _5X.a(matchException);
                        }
                    }
                    try {
                        x = this;
                        if (wArray != null) break block88;
                        callSite = _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)x, 1743072337112016728L, (long)l3), (long)l5, 1743878715891559663L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _5X.a(matchException);
                    }
                }
                try {
                    block89: {
                        try {
                            if (callSite == false) break block89;
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            _5X.c("\u00d9", (Object)this, (Object)objectArray, 1744342456824406536L, (long)l3);
                            if (wArray == null) break block74;
                        }
                        catch (MatchException matchException) {
                            throw _5X.a(matchException);
                        }
                    }
                    x = this;
                }
                catch (MatchException matchException) {
                    throw _5X.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            _5X.c("\u00d9", (Object)x, (Object)objectArray, 1742365975084794379L, (long)l3);
        }
    }

    private void cfr_renamed_351(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5X.c("O", (Object)this, (int)_5X.a("c", 32739, (long)(0x72368C624CF2B303L ^ l2)), -3162964018013286760L, (long)l2);
        _5X.c("O", (Object)this, (int)_5X.a("c", 24279, (long)(0x4E48FB2E3979923FL ^ l2)), -3168874420451157295L, (long)l2);
        _5X.c("O", (Object)this, (int)_5X.a("c", 24279, (long)(0x4E48FB2E3979923FL ^ l2)), -3161986776463659358L, (long)l2);
        _5X.c("O", (Object)this, (boolean)_5X.a("c", 24279, (long)(0x4E48FB2E3979923FL ^ l2)), -3163687161069614197L, (long)l2);
        _5X.c("O", (Object)this, (boolean)_5X.a("c", 24279, (long)(0x4E48FB2E3979923FL ^ l2)), -3161539017681453968L, (long)l2);
        _5X.c("O", (Object)this, (boolean)_5X.a("c", 24279, (long)(0x4E48FB2E3979923FL ^ l2)), -3162131178234101515L, (long)l2);
    }

    private void cfr_renamed_352(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        block4: {
            block5: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = b ^ l4;
                l3 = l5 ^ 0x51602DFECA00L;
                l2 = l5 ^ 0x5185D49B0139L;
                long l6 = l5 ^ 0x54645D3879A9L;
                _4w[] wArray = _3s.cfr_renamed_5();
                try {
                    try {
                        callSite = _5X.c("\u00ef", (Object)this, -862531173104616749L, (long)l4);
                        if (wArray != null) break block4;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l6;
                        if (callSite >= _5X.c("\u00d9", (Object)_5X.c("\u00ef", (Object)this, -856700661457552420L, (long)l4), (Object)objectArray2, -864016249462408974L, (long)l4)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _5X.a(matchException);
                    }
                    _5X x = this;
                    _5X.c("O", (Object)x, (int)(_5X.c("\u00ef", (Object)x, -862531173104616749L, (long)l4) + true), -862531173104616749L, (long)l4);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5X.a(matchException);
                }
            }
            callSite = _5X.c("\u00ef", (Object)this, -857745457253454182L, (long)l4);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = (int)callSite;
        _5X.c("l", (Object)objectArray3, -863887479918359046L, (long)l4);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        _5X.c("\u00d9", (Object)this, (Object)objectArray4, -862893003260760541L, (long)l4);
    }

    public _5X(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x5F5398C3B1F0L;
        long l5 = l3 ^ 0x4F33AA0AC863L;
        long l6 = l3 ^ 0x752E7112C8A1L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x96B0F803999L;
        long l9 = l3 ^ 0x16AB9CA4D6EBL;
        long l10 = l3 ^ 0x399B49B546C4L;
        int n2 = (int)(l10 >>> 32);
        int n3 = (int)(l10 << 32 >>> 56);
        int n4 = (int)(l10 << 40 >>> 40);
        long l11 = l3 ^ 0x5C1F5E765D3DL;
        super((int)_5X.a("c", 5601, (long)(0x670DB5279D699DA2L ^ l2)), -1, (_4r)((Object)_5X.c("S", -8025359446653428535L, (long)l2)), l8);
        this.cfr_renamed_41 = new _9j_0((int)_5X.a("c", 11863, (long)(0x15AA55319222A617L ^ l2)), n2, (byte)n3, (int)_5X.a("c", 24793, (long)(0x7D1430E0D324E89DL ^ l2)), n4, false);
        this.cfr_renamed_216 = new _92((int)_5X.a("c", 19768, (long)(0x3B9F89ADA5EC579L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_6 = new _9r((int)_5X.a("c", 13312, (long)(0x661B9CC001F23C4FL ^ l2)), true, l4);
        this.cfr_renamed_4 = new _92((int)_5X.a("c", 7951, (long)(0x2FF81FC9E5AA1754L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_345 = new _9r((int)_5X.a("c", 21841, (long)(0x286F3FC45F715D1CL ^ l2)), true, l4);
        this.cfr_renamed_1 = new _92((int)_5X.a("c", 8200, (long)(0xE85E70C1ABF2840L ^ l2)), 1.0, l5, 9.0, 9.0, 1.0);
        CallSite callSite = _5X.c("\u00ef", (Object)this, -8018601203364028552L, (long)l2);
        CallSite callSite2 = _5X.c("\u00ef", (Object)this, -8017331979013673004L, (long)l2);
        _5X.c("l", (Object)callSite2, -8017411195221173915L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l11);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _5X.c("\u00d9", (Object)callSite, (Object)objectArray, -8017217993766697806L, (long)l2);
        CallSite callSite3 = _5X.c("\u00ef", (Object)this, -8016693533064312872L, (long)l2);
        CallSite callSite4 = _5X.c("\u00ef", (Object)this, -8018484164235219039L, (long)l2);
        _5X.c("l", (Object)callSite4, -8017411195221173915L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> ((_9r)((Object)callSite4)).cfr_renamed_3(l11);
        objectArray2[1] = (int)((byte)n);
        objectArray2[0] = l7;
        _5X.c("\u00d9", (Object)callSite3, (Object)objectArray2, -8017217993766697806L, (long)l2);
        _95[] nullArray = new _95[_5X.a("c", 18996, (long)(0x5FFA152629FCC27FL ^ l2))];
        nullArray[0] = _5X.c("\u00ef", (Object)this, -8025063555024650842L, (long)l2);
        nullArray[1] = _5X.c("\u00ef", (Object)this, -8024453354891788305L, (long)l2);
        nullArray[2] = _5X.c("\u00ef", (Object)this, -8017331979013673004L, (long)l2);
        nullArray[3] = _5X.c("\u00ef", (Object)this, -8018601203364028552L, (long)l2);
        nullArray[4] = _5X.c("\u00ef", (Object)this, -8018484164235219039L, (long)l2);
        nullArray[5] = _5X.c("\u00ef", (Object)this, -8016693533064312872L, (long)l2);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = nullArray;
        objectArray3[0] = l9;
        _5X.c("\u00d9", (Object)this, (Object)objectArray3, -8016601474227696100L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5X.class, 40);
                _5X.b = l.a(-1909766984374313944L, 2182845905143276844L, MethodHandles.lookup().lookupClass()).a(120508664520479L);
                _5X.j = new Object[85];
                _5X.k = new String[85];
                _5X.b();
                _5X.f = new HashMap<K, V>(13);
                var0 = _5X.b ^ 132712505067663L;
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "\u008dM\u001d7\u009a~^\u001dJ\u008d1\u00be\u00ef>fXefh,=rn\u00b9!\u00a8o\u00e6\u00c0\u00eb\u00cdK\u0016\\/\u00e0\u00c95c_K\u009e8\u00a0\u001c\u00f35{\u00eb\u0088R\u001ecC(\u007f\u00e7\u00db\u00df/'\u008a\u00f3\u00d2\u00de\u00e2\u00b7J\u0097Y\u0013\u0089H\u0018\u00a8u\u0083t/\u008d\u00c7\u00d9\u00d7i\u00c4\u00fa\u0017c\u00f3]\u0088\u00cc\u00d7]\u0005\u0019\u00f2\u0000\u00edqC\u00b9n\u0086O\u00c7\u001d1t\r\u00d7\u00abknq\u00ad\u0090\u00ac\u0019\u008f";
                var7_6 = "\u008dM\u001d7\u009a~^\u001dJ\u008d1\u00be\u00ef>fXefh,=rn\u00b9!\u00a8o\u00e6\u00c0\u00eb\u00cdK\u0016\\/\u00e0\u00c95c_K\u009e8\u00a0\u001c\u00f35{\u00eb\u0088R\u001ecC(\u007f\u00e7\u00db\u00df/'\u008a\u00f3\u00d2\u00de\u00e2\u00b7J\u0097Y\u0013\u0089H\u0018\u00a8u\u0083t/\u008d\u00c7\u00d9\u00d7i\u00c4\u00fa\u0017c\u00f3]\u0088\u00cc\u00d7]\u0005\u0019\u00f2\u0000\u00edqC\u00b9n\u0086O\u00c7\u001d1t\r\u00d7\u00abknq\u00ad\u0090\u00ac\u0019\u008f".length();
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
                    var6_5 = "\u00c75\u00e1A\u00de~\u00c9z\u00dd\u001e\b,\u00be*%\u008c";
                    var7_6 = "\u00c75\u00e1A\u00de~\u00c9z\u00dd\u001e\b,\u00be*%\u008c".length();
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
        _5X.d = var8_3;
        _5X.e = new Integer[17];
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
            case 0 -> 54;
            case 1 -> 16;
            case 2 -> 45;
            case 3 -> 31;
            case 4 -> 24;
            case 5 -> 29;
            case 6 -> 27;
            case 7 -> 55;
            case 8 -> 36;
            case 9 -> 33;
            case 10 -> 50;
            case 11 -> 0;
            case 12 -> 43;
            case 13 -> 23;
            case 14 -> 1;
            case 15 -> 20;
            case 16 -> 5;
            case 17 -> 2;
            case 18 -> 9;
            case 19 -> 11;
            case 20 -> 49;
            case 21 -> 12;
            case 22 -> 10;
            case 23 -> 56;
            case 24 -> 14;
            case 25 -> 30;
            case 26 -> 32;
            case 27 -> 48;
            case 28 -> 25;
            case 29 -> 37;
            case 30 -> 19;
            case 31 -> 38;
            case 32 -> 35;
            case 33 -> 6;
            case 34 -> 17;
            case 35 -> 28;
            case 36 -> 39;
            case 37 -> 57;
            case 38 -> 4;
            case 39 -> 13;
            case 40 -> 61;
            case 41 -> 44;
            case 42 -> 63;
            case 43 -> 60;
            case 44 -> 15;
            case 45 -> 3;
            case 46 -> 26;
            case 47 -> 41;
            case 48 -> 18;
            case 49 -> 40;
            case 50 -> 46;
            case 51 -> 58;
            case 52 -> 34;
            case 53 -> 53;
            case 54 -> 51;
            case 55 -> 62;
            case 56 -> 52;
            case 57 -> 59;
            case 58 -> 21;
            case 59 -> 42;
            case 60 -> 7;
            case 61 -> 8;
            case 62 -> 22;
            default -> 47;
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
        _5X.k[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "xXgO:\u000beMe\u000e?W)e";
        objectArray[1] = Boolean.TYPE;
        _5X.k[1] = "java/lang/Boolean";
        objectArray[2] = Integer.TYPE;
        _5X.k[2] = "java/lang/Integer";
        objectArray[3] = "}y\u0015s0!`l\u001725} n";
        objectArray[4] = "\u0011p\u001d%;h\u0011p\ny7g\u000b;\ng7r\fJX<g2";
        objectArray[5] = "-\u0017\u0006e\u0005cX7\rj\u0014,99\u0006a\u0010vM";
        objectArray[6] = Void.TYPE;
        _5X.k[6] = "java/lang/Void";
        objectArray[7] = "\u000fhz\u001fg+\u000fhmCk$\u0015#m]k1\u0012R?\u0007<s";
        objectArray[8] = "#\u0004d:aG#\u0004sfmH9Osxm]>>!#5\u0017";
        objectArray[9] = "$.,<G\u007f$.;`Kp>e;~Ke9\u0014i%\u0013$";
        objectArray[10] = "u!!\u001c)gu!6@%hoj6^%}h\u001bd\u0001t:";
        objectArray[11] = "\u0002,\u00121\u00117\u001f9\u0010p\u0014k_#";
        objectArray[12] = "ue6(\u000bM\u0000E='\u001a\u0002aK6,\u001eX\u0015";
        objectArray[13] = "A\u000f\t@07\\\u001a\u000b\u00015k\u001cX";
        objectArray[14] = Long.TYPE;
        _5X.k[14] = "java/lang/Long";
        objectArray[15] = "'\u001a\u0002dM8'\u001a\u00158A7=Q\u0015&A\": E{\u0010";
        objectArray[16] = "'X[3)5'XLo%:=\u0013Lq%/:b\u0018)r";
        objectArray[17] = "gpW\u0012\u0002hgp@N\u000eg};@P\u000erzJ\u0017\u000fX";
        objectArray[18] = "mq\\#K3mqK\u007fG<w:KaG)pK\u00195\u0016h";
        objectArray[19] = "^\u0010u(Un+0~'D!J>u,@{>";
        objectArray[20] = "h\u001b8\u0005\u0005.u\u000e:D\u0000r:\u0006";
        objectArray[21] = "\\\u001aR\t\u001f\u0002\\\u001aEU\u0013\rFQEK\u0013\u0018A \u0017\u0015DS";
        objectArray[22] = "\\N89Cv\\N/eOyF\u0005/{OlAtz$\u0018";
        objectArray[23] = "_\u0016j\u0019\u0005\u0016_\u0016}E\t\u0019E]}[\t\fB,/\u0000XL";
        objectArray[24] = "W\u0015G\u0007\u0001fW\u0015P[\riM^PE\r|J/\u0002\u001fY8";
        objectArray[25] = ")=w)Z]4(uh_\u0001t\u0013";
        objectArray[26] = "7$McK]B\u0004FlZ\u0012#\nMg^HW";
        objectArray[27] = "+\u0005\u000e!>H6\u0010\f`;\u0014w\u001a";
        objectArray[28] = "=R>J\\eHr5EM*)|>NIp]";
        objectArray[29] = ">R\rw\u0007\u0013Kr\u0006x\u0016\\*|\rs\u0012\u0006^";
        objectArray[30] = "\\g$7boBo>x*oXe&?#t\u0018V 3(sUg&3";
        objectArray[31] = "Y\u0019]\u0019<\u0017R\u0016LV]\u0019Y\u001dH\f";
        objectArray[32] = "2:qL~s2:f\u0010r|(qf\u000eri/\u00004P%#";
        objectArray[33] = "m)\u0017g\u001eI\u0018\t\u001ch\u000f\u0006y\u0007\u0017c\u000b\\\r";
        objectArray[34] = ":M_xGB'X]9B\u001eg\u001d";
        objectArray[35] = "A\u001a\nn\u000eS4:\u0001a\u001f\u001cU4\nj\u001bF!";
        objectArray[36] = "_\u0005(1\u0012GB\u0010*p\u0017\u001b\u000f\u0012";
        objectArray[37] = "\u007fM\u0017\u000bQ\u001e\nm\u001c\u0004@Qkc\u0017\u000fD\u000b\u001f";
        objectArray[38] = "X\u0018\u0015(c\u001eF\u0010\u000fg\u0002\tX\u001c\u0000=>";
        objectArray[39] = "]?\b]~'\rb\u0019d!G\u0013d\u0016\u000fv+\u0003!\u0004";
        objectArray[40] = "{xST\u001dw+%BmD\u0017zv\u001fQ\u0003m3j]\u000b";
        objectArray[41] = "G]Fv\u001a\\\u0017\u0000WOK<NLT5\u0016Q\u0005P]0";
        objectArray[42] = " p\bS\u0013gp-\u0019jOU\u0010*\u001e\u000bIv!p\u0011\u0011\u0018";
        objectArray[43] = "c\rJOcV%\u0001YA\r\t9\u000eC\u001cZXgR\u001ep6\t5\\IAp\u0005&R";
        objectArray[44] = "\u00101\u000b:4w@l\u001a\u0003nW (K93e\u001d;\u0000b.\u0017\u001c)\u0011=.'@a\u0003jU";
        objectArray[45] = "{W%yP9!N!\u007fo'+J{`\u0003\u0015x\t&<UB\u007fGy}\u0002/4[pxo";
        objectArray[46] = "e$E{=A62F/R\u00185(Hv>*cm\u0015.n}f5Vu5\u0007\"2DjR\u0003c:Cx>\u0013&((";
        objectArray[47] = "W%mtOR\u0007x|M\u00112\u0019~s&G^\t;a";
        objectArray[48] = "\u0001\u0001*@ZCRZ1\u001c6__P.Ma\u000f\u0007\u0002v!\t\r^\\&SZVE\u0000";
        objectArray[49] = "\u007f k\u0004_~/}z=\u0003\u001e1{uVWr!>g";
        objectArray[50] = "l&\u0016\r~+1$@VAm\\aH\u0007'!ar\u0003\\:Sei\u001aG,>.u\u0013BA";
        objectArray[51] = "g\"6\u0013\u0016S7\u007f'*F3f,z\u0016\bI/08L";
        objectArray[52] = "\u007f5!\u0007D,,#\"S+u/9,\nGG}tt\\+.#;(\nQj$)7m";
        objectArray[53] = "ie0RBCies\t<\u0014\u0004'>SZ_94u\bG-8&dWG\u001ddnv\u0000<";
        objectArray[54] = "}tIp;\u0013'{S!J\u0018G#V$#P*-S/*\"9)F #N)lTK";
        objectArray[55] = "O\u0019\u001d ->\u0015\u0000\u0019&\u0012 \u001f\u0004C9~\u0012OD\u0018n\u0012|\u0003\u001aY3\u007f7\u001f\u0013\\^/5\u001f\u0012Lb|#\u001cF#";
        objectArray[56] = "\u0003BT{.-\u001aC^6\u0015:\u001eOEnnW\u0003BT{.-\u001aC^6\u0015)\\\\Gcy9\u0019N,";
        objectArray[57] = "vJ>3\u0004Fw\u0004:s{EbL8o\u0001RIR#H\u0006[k5!~\u0003N4O8\u007f\t\u0003\u000fQ5v\n\u0004uH4|G?";
        objectArray[58] = "2fV\u0004\u0006?b;G=\\_8`G\u0006\u0016nbo]W";
        objectArray[59] = "O,-4o5\u001fq<\r3\t\u007fu,ot8\u0012>0fq";
        objectArray[60] = "|\u0001u\"z\u0017e\u0002v(\u0005Q\u001bG){c\u001f&Tb ~m|\u0001u\"z\u0017e\u0002v(\u0005";
        objectArray[61] = "Hx8E/4H6 \u001aA0@j$I\u0016g\u001e=|%+2FiqY?nQe";
        objectArray[62] = "y@0\u001e ay\u000e(ANeqR,\u0012\u00192/\u0002u~$taEw\u0001.7q\u0003";
        objectArray[63] = "8\u001aKBHnn\u0005I\u001eq82\u000fNI&fcY\u0011%O7-\u0006M_\u000b0?\u0019";
        objectArray[64] = "x5G\\`b(hVe:oH,\u0007_gpu?L\u0004z\u0002t-][z2(eO\f\u0001";
        objectArray[65] = "y%'@}Ay%d\u001b\u0003\u0016\u0014wf\u0003cA~w(\u001b<";
        objectArray[66] = "/z\u001aP\f40z\\\u001f1b#hFLf1r=\u0012 \\szu\u001f\u0018Cs<:";
        objectArray[67] = "\\y{N&&\\7c\u0011H\"TkgB\u001fu\n8:.&,K6c\u0017yu\\y";
        objectArray[68] = "V]PW\\\u0019B\u0001G[m\u000b]\\SU:Z\u0001\b\r9\u0002\u000bMVLV\u0012\u001d]Q";
        objectArray[69] = "6l6AGEf1'x\u001bt\u0006=(D\u001aZ|t4\u0006@";
        objectArray[70] = "\u0002s3\u0006%cR.\"?x\u0003\u000bb!E)n@~(@";
        objectArray[71] = "bG\u0013\f\u0007~2\u001a\u00025\\\u001ekV\u0001O\u000bs J\bJ";
        objectArray[72] = "TKsx4\u0000G\u0018}t\t'k3\t\u0000UlTKsx4\u0000G\u0018}t";
        objectArray[73] = "MUQ$\u0010\bY\tF(!\u0011JEV-M#\u0019\u0000\u000fz!K\u001bYW&S\u0018@B\u000bJ\u001c\u0004JSYvO\u0012I\u00076";
        objectArray[74] = "+xe9^/?$r5o6,hb0\u0003\u0004\u007f-:ko>>,rjW!>j=WS++*yg\u000fc9}\u0002";
        objectArray[75] = "Q5/`*1Ei8l\u001b(V%(iw\u001a\u0000`u2+M\u00068vp$6\\!rv\u001b";
        objectArray[76] = "%*670{uw'\u000elf\u0015zx`a$m'z6:";
        objectArray[77] = "\\n\u0000\u001f7 \u00037\u0017PW|_r\u001eH;N\b?F\u0011W Cl\u0004B:k_e\u0001/nhPt\u0013B%tYq~\u0016&{Hc\u0013]:rM\u000eEA:&\\?\u0003M)(2a\u000e\u0017(g\u000fuEQ*\u0019\u000ev\u0014\u0011,)R>\u0006FW";
        objectArray[78] = "v\u0016<G,\u0011*\u001d$JKF\u0016\u0004h\u001f-\u0004+\u0017#D0vhF6N\"\u001ax\u0003$%";
        objectArray[79] = "\\Io~>AL\t!9W\u0001>\u0001o>1I\u0003\u0012$e,;@C1o>WP\u0006#\u0004";
        objectArray[80] = "\u001e5\tVu?W)K\f\nx/\"\u0005Pl7\u00121N\u000bqE\u0016*W\u0010g(]6^\u0015\n";
        objectArray[81] = "L\u0006\u0017\fv\u000fNE\u001cP\u000fKB\u0000\u000fhkGW\nH\u0012rF]Gs\u00164YD\u0012\u001f\u0006qK/";
        objectArray[82] = "#H\u0004D\u0003)3\bJ\u0003jkA\u0000\u0004\u0004\f!|\u0013O_\u0011S}\u0001^\u0000\u0011c!ILWj";
        objectArray[83] = "$M+]7%4[;ZL$*N>V\u001but\u001da:u;)Y7W>' \\";
        Object[] objectArray2 = objectArray;
        objectArray[84] = "rlUmI\u0000-5B\")\\qpK:En&=\u0012l)Vl4T#\u0014B'rV]DF$|\u0016e[Fb3+8GY!~P6[Bz\f";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == 'O' || c == 'S' || c == '\u00c4') {
                field = _5X.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5X.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5X.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5X" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _5X.e(l2, l3);
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
                clazz3 = _5X.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5X.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5X.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5X.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5X.f(2227889059877776L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5X.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5X.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5X.f(2227889059877776L, 0L);
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
            int n = _5X.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5X.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5X.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5X.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5X.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5X.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x18F9;
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
                throw new RuntimeException("dev/krypton/5X", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5X.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5X" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5X.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5X.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5X.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5X.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5X.c(clazz3, string2, clazz2)) != null) {
                    _5X.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5X.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5X.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5X.f(2227889059877776L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    private static boolean cfr_renamed_6(long l2, class_1792 class_17922) {
        l2 = b ^ l2;
        return (boolean)_5X.c("\u00d9", (Object)class_17922, (Object)_5X.c("S", 6272038011156283414L, (long)l2), 6272147590316569359L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5X.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5X.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

