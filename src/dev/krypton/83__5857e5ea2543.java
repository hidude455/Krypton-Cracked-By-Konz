/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_1792
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._7V;
import dev.krypton._8e;
import dev.krypton._9m_0;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_1792;

public class _83
extends _8e {
    private final _9m_0 cfr_renamed_1;
    private final List cfr_renamed_8;
    private final int cfr_renamed_6;
    private final int cfr_renamed_389;
    private final int cfr_renamed_3;
    private final int cfr_renamed_137;
    private final _7V cfr_renamed_390;
    private List cfr_renamed_4;
    private int cfr_renamed_255;
    private int cfr_renamed_9;
    private boolean cfr_renamed_391;
    private int cfr_renamed_392;
    private int cfr_renamed_393;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] q;
    private static final String[] r;

    public boolean method_25404(class_11908 class_119082) {
        Object object;
        block82: {
            block83: {
                Object object2;
                block84: {
                    block85: {
                        CallSite callSite;
                        boolean bl;
                        long l2;
                        long l3;
                        block78: {
                            block79: {
                                Object object3;
                                block80: {
                                    block81: {
                                        long l4;
                                        block74: {
                                            block75: {
                                                Object object4;
                                                block76: {
                                                    block77: {
                                                        block70: {
                                                            block71: {
                                                                Object object5;
                                                                block72: {
                                                                    block73: {
                                                                        block66: {
                                                                            block67: {
                                                                                Object object6;
                                                                                block68: {
                                                                                    block69: {
                                                                                        block64: {
                                                                                            block65: {
                                                                                                block60: {
                                                                                                    long l5;
                                                                                                    block61: {
                                                                                                        Object object7;
                                                                                                        block62: {
                                                                                                            block63: {
                                                                                                                long l6 = l3 = b ^ 0xE1D9D1816CL;
                                                                                                                l4 = l6 ^ 0x389D6C4A69DFL;
                                                                                                                l5 = l6 ^ 0xA2C0C547A5FL;
                                                                                                                l2 = l6 ^ 0x55972AFDF102L;
                                                                                                                bl = _02.cfr_renamed_2();
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        object = _83.f("B", (Object)class_119082, -5342034964347017621L, (long)l3);
                                                                                                                                        if (bl) break block60;
                                                                                                                                        if (object != _83.d("h", 1383, (long)(0x77A2414F907E864FL ^ l3))) break block61;
                                                                                                                                    }
                                                                                                                                    catch (MatchException matchException) {
                                                                                                                                        throw _83.a(matchException);
                                                                                                                                    }
                                                                                                                                    object7 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                                                                                                                    if (bl) break block62;
                                                                                                                                }
                                                                                                                                catch (MatchException matchException) {
                                                                                                                                    throw _83.a(matchException);
                                                                                                                                }
                                                                                                                                if (object7 < 0) break block63;
                                                                                                                            }
                                                                                                                            catch (MatchException matchException) {
                                                                                                                                throw _83.a(matchException);
                                                                                                                            }
                                                                                                                            object7 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                                                                                                            if (bl) break block62;
                                                                                                                        }
                                                                                                                        catch (MatchException matchException) {
                                                                                                                            throw _83.a(matchException);
                                                                                                                        }
                                                                                                                        if (object7 >= _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5343295105948117838L, (long)l3), -5341849738539013083L, (long)l3)) break block63;
                                                                                                                    }
                                                                                                                    catch (MatchException matchException) {
                                                                                                                        throw _83.a(matchException);
                                                                                                                    }
                                                                                                                    Object[] objectArray = new Object[2];
                                                                                                                    objectArray[1] = l2;
                                                                                                                    objectArray[0] = (class_1792)_83.f("B", (Object)_83.f("\u00a3", (Object)this, -5343295105948117838L, (long)l3), (int)_83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3), -5346958606279666090L, (long)l3);
                                                                                                                    _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5345343483607599284L, (long)l3), (Object)objectArray, -5345043212775590524L, (long)l3);
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw _83.a(matchException);
                                                                                                                }
                                                                                                            }
                                                                                                            _83.f("B", (Object)_83.f("\u00df", -5343004209241292551L, (long)l3), (Object)_83.f("\u00a3", (Object)_83.f("\u00df", -5341354335885801507L, (long)l3), -5347444236965062331L, (long)l3), -5344157253947776729L, (long)l3);
                                                                                                            object7 = true;
                                                                                                        }
                                                                                                        return (boolean)object7;
                                                                                                    }
                                                                                                    Object[] objectArray = new Object[2];
                                                                                                    objectArray[1] = l5;
                                                                                                    objectArray[0] = class_119082;
                                                                                                    object = _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5345173044574136851L, (long)l3), (Object)objectArray, -5344134112098577882L, (long)l3);
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (bl) break block64;
                                                                                                        if (object == false) break block65;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _83.a(matchException);
                                                                                                    }
                                                                                                    return true;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _83.a(matchException);
                                                                                                }
                                                                                            }
                                                                                            object = _83.f("B", (Object)class_119082, -5342034964347017621L, (long)l3);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        callSite = _83.d("h", 24290, (long)(0x7C791F7EA607DDE0L ^ l3));
                                                                                                        if (bl) break block66;
                                                                                                        if (object != callSite) break block67;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _83.a(matchException);
                                                                                                    }
                                                                                                    object6 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                                                                                    if (bl) break block68;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _83.a(matchException);
                                                                                                }
                                                                                                if (object6 < _83.d("h", 19684, (long)(0x3DA76ED7FAA34FD1L ^ l3))) break block69;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _83.a(matchException);
                                                                                            }
                                                                                            _83 v18 = this;
                                                                                            _83.f("\u00ca", (Object)v18, (int)(_83.f("\u00a3", (Object)v18, -5343906536453185248L, (long)l3) - _83.d("h", 19684, (long)(0x3DA76ED7FAA34FD1L ^ l3))), -5343906536453185248L, (long)l3);
                                                                                            Object[] objectArray = new Object[1];
                                                                                            objectArray[0] = l4;
                                                                                            _83.f("B", (Object)this, (Object)objectArray, -5344322918885237523L, (long)l3);
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _83.a(matchException);
                                                                                        }
                                                                                    }
                                                                                    object6 = true;
                                                                                }
                                                                                return (boolean)object6;
                                                                            }
                                                                            object = _83.f("B", (Object)class_119082, -5342034964347017621L, (long)l3);
                                                                            callSite = _83.d("h", 32405, (long)(0x1E7D7E6590D67D9EL ^ l3));
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (bl) break block70;
                                                                                        if (object != callSite) break block71;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _83.a(matchException);
                                                                                    }
                                                                                    object5 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3) + _83.d("h", 19684, (long)(0x3DA76ED7FAA34FD1L ^ l3));
                                                                                    if (bl) break block72;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _83.a(matchException);
                                                                                }
                                                                                if (object5 >= _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5343295105948117838L, (long)l3), -5341849738539013083L, (long)l3)) break block73;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _83.a(matchException);
                                                                            }
                                                                            _83 v25 = this;
                                                                            _83.f("\u00ca", (Object)v25, (int)(_83.f("\u00a3", (Object)v25, -5343906536453185248L, (long)l3) + _83.d("h", 19684, (long)(0x3DA76ED7FAA34FD1L ^ l3))), -5343906536453185248L, (long)l3);
                                                                            Object[] objectArray = new Object[1];
                                                                            objectArray[0] = l4;
                                                                            _83.f("B", (Object)this, (Object)objectArray, -5344322918885237523L, (long)l3);
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _83.a(matchException);
                                                                        }
                                                                    }
                                                                    object5 = true;
                                                                }
                                                                return (boolean)object5;
                                                            }
                                                            object = _83.f("B", (Object)class_119082, -5342034964347017621L, (long)l3);
                                                            callSite = _83.d("h", 7584, (long)(0x7121505DAD099EBFL ^ l3));
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (bl) break block74;
                                                                        if (object != callSite) break block75;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _83.a(matchException);
                                                                    }
                                                                    object4 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                                                    if (bl) break block76;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _83.a(matchException);
                                                                }
                                                                if (object4 <= 0) break block77;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _83.a(matchException);
                                                            }
                                                            _83 v32 = this;
                                                            _83.f("\u00ca", (Object)v32, (int)(_83.f("\u00a3", (Object)v32, -5343906536453185248L, (long)l3) - true), -5343906536453185248L, (long)l3);
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l4;
                                                            _83.f("B", (Object)this, (Object)objectArray, -5344322918885237523L, (long)l3);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _83.a(matchException);
                                                        }
                                                    }
                                                    object4 = true;
                                                }
                                                return (boolean)object4;
                                            }
                                            object = _83.f("B", (Object)class_119082, -5342034964347017621L, (long)l3);
                                            callSite = _83.d("h", 16170, (long)(0x58B34A65F97F3C17L ^ l3));
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (bl) break block78;
                                                        if (object != callSite) break block79;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _83.a(matchException);
                                                    }
                                                    object3 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                                    if (bl) break block80;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _83.a(matchException);
                                                }
                                                if (object3 >= _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5343295105948117838L, (long)l3), -5341849738539013083L, (long)l3) - true) break block81;
                                            }
                                            catch (MatchException matchException) {
                                                throw _83.a(matchException);
                                            }
                                            _83 v39 = this;
                                            _83.f("\u00ca", (Object)v39, (int)(_83.f("\u00a3", (Object)v39, -5343906536453185248L, (long)l3) + true), -5343906536453185248L, (long)l3);
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l4;
                                            _83.f("B", (Object)this, (Object)objectArray, -5344322918885237523L, (long)l3);
                                        }
                                        catch (MatchException matchException) {
                                            throw _83.a(matchException);
                                        }
                                    }
                                    object3 = true;
                                }
                                return (boolean)object3;
                            }
                            try {
                                object = _83.f("B", (Object)class_119082, -5342034964347017621L, (long)l3);
                                if (bl) break block82;
                                callSite = _83.d("h", 2789, (long)(0x2B38FA622AFF89E5L ^ l3));
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (object != callSite) break block83;
                                            object2 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                            if (bl) break block84;
                                        }
                                        catch (MatchException matchException) {
                                            throw _83.a(matchException);
                                        }
                                        if (object2 < 0) break block85;
                                    }
                                    catch (MatchException matchException) {
                                        throw _83.a(matchException);
                                    }
                                    object2 = _83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3);
                                    if (bl) break block84;
                                }
                                catch (MatchException matchException) {
                                    throw _83.a(matchException);
                                }
                                if (object2 >= _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5343295105948117838L, (long)l3), -5341849738539013083L, (long)l3)) break block85;
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l2;
                            objectArray[0] = (class_1792)_83.f("B", (Object)_83.f("\u00a3", (Object)this, -5343295105948117838L, (long)l3), (int)_83.f("\u00a3", (Object)this, -5343906536453185248L, (long)l3), -5346958606279666090L, (long)l3);
                            _83.f("B", (Object)_83.f("\u00a3", (Object)this, -5345343483607599284L, (long)l3), (Object)objectArray, -5345043212775590524L, (long)l3);
                            _83.f("B", (Object)_83.f("\u00df", -5343004209241292551L, (long)l3), (Object)_83.f("\u00a3", (Object)_83.f("\u00df", -5341354335885801507L, (long)l3), -5347444236965062331L, (long)l3), -5344157253947776729L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                    }
                    object2 = true;
                }
                return (boolean)object2;
            }
            object = super.method_25404(class_119082);
        }
        return (boolean)object;
    }

    public boolean method_25400(class_11905 class_119052) {
        long l2 = b ^ 0x4E3637D77FF9L;
        long l3 = l2 ^ 0x2089ED9A88D2L;
        Object[] objectArray = new Object[2];
        objectArray[1] = class_119052;
        objectArray[0] = l3;
        return (boolean)_83.f("B", (Object)_83.f("\u00a3", (Object)this, 5424427114288687992L, (long)l2), (Object)objectArray, 5422736895467460389L, (long)l2);
    }

    public boolean method_25406(class_11909 class_119092) {
        long l2 = b ^ 0xEBA6183A7E3L;
        _83.f("\u00ca", (Object)this, (boolean)_83.d("h", 23522, (long)(0x39CAC29EB79F7E6EL ^ l2)), -7828550186351947008L, (long)l2);
        return false;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        Object object;
        block12: {
            block13: {
                double d5;
                block17: {
                    block16: {
                        CallSite callSite;
                        boolean bl;
                        long l2;
                        block14: {
                            long l3 = l2 = b ^ 0x3CA2EB81A506L;
                            long l4 = l3 ^ 0x2CC25A83734EL;
                            long l5 = l3 ^ 0x71C481EF6D92L;
                            long l6 = l3 ^ 0x7E8D33D0C7BL;
                            d *= (double)_83.f("B", (Object)_83.f("B", (Object)_83.f("\u00df", -7947751932967148397L, (long)l2), -7948229673071269347L, (long)l2), -7948714441913682248L, (long)l2);
                            d2 *= (double)_83.f("B", (Object)_83.f("B", (Object)_83.f("\u00df", -7947751932967148397L, (long)l2), -7948229673071269347L, (long)l2), -7948714441913682248L, (long)l2);
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l5;
                            CallSite callSite2 = _83.f("B", (Object)this, (Object)objectArray, -7947398067672867564L, (long)l2);
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l6;
                            CallSite callSite3 = _83.f("B", (Object)this, (Object)objectArray2, -7944981706399051510L, (long)l2);
                            reference var20_11 = _83.f("\u00a3", (Object)this, -7944497241226611505L, (long)l2) + _83.d("h", 30816, (long)(0x4A41E105C5195F28L ^ l2));
                            bl = _02.cfr_renamed_3();
                            reference var21_13 = _83.f("\u00a3", (Object)this, -7947144908928284208L, (long)l2) + _83.d("h", 3569, (long)(0x60A5B8151FEEAA88L ^ l2)) + _83.d("h", 10324, (long)(0x4E43A389B0C30F25L ^ l2)) + _83.d("h", 30258, (long)(0x7C0CEBAD6313516CL ^ l2));
                            reference var22_14 = callSite2 - _83.d("h", 11424, (long)(0x45B76FD76AF40BD0L ^ l2));
                            reference var23_15 = callSite3 - (var21_13 - _83.f("\u00a3", (Object)this, -7947144908928284208L, (long)l2)) - _83.d("h", 20058, (long)(0x3E9228AF75E693FL ^ l2));
                            try {
                                Object[] objectArray3 = new Object[7];
                                objectArray3[6] = (int)var23_15;
                                objectArray3[5] = (int)var22_14;
                                objectArray3[4] = (int)var21_13;
                                objectArray3[3] = (int)var20_11;
                                objectArray3[2] = d2;
                                objectArray3[1] = d;
                                objectArray3[0] = l4;
                                object = _83.f("B", (Object)this, (Object)objectArray3, -7946205180801484697L, (long)l2);
                                if (!bl) break block12;
                                if (object == false) break block13;
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                            int n = (int)_83.f("\u00c8", (double)((double)_83.f("B", (Object)_83.f("\u00a3", (Object)this, -7948025229434867496L, (long)l2), -7946650246878181297L, (long)l2) / 11.0), -7952869027060767321L, (long)l2);
                            callSite = _83.f("\u00c8", 0, (int)(n - _83.d("h", 26044, (long)(0x2270A67BBF9AC2DBL ^ l2))), -7953140296410715298L, (long)l2);
                            try {
                                double d6;
                                block15: {
                                    try {
                                        try {
                                            double d7 = d4 - 0.0;
                                            d5 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                            if (!bl) break block14;
                                            if (d5 <= 0) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw _83.a(matchException);
                                        }
                                        _83.f("\u00ca", (Object)this, (int)_83.f("\u00c8", 0, (int)(_83.f("\u00a3", (Object)this, -7946133518564165105L, (long)l2) - true), -7953140296410715298L, (long)l2), -7946133518564165105L, (long)l2);
                                        if (bl) break block16;
                                    }
                                    catch (MatchException matchException) {
                                        throw _83.a(matchException);
                                    }
                                }
                                d5 = (d6 = d4 - 0.0) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                        }
                        try {
                            try {
                                if (!bl) break block17;
                                if (d5 >= 0) break block16;
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                            _83.f("\u00ca", (Object)this, (int)_83.f("\u00c8", (int)callSite, (int)(_83.f("\u00a3", (Object)this, -7946133518564165105L, (long)l2) + true), -7944710341353334217L, (long)l2), -7946133518564165105L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                    }
                    d5 = 1.0;
                }
                return (boolean)d5;
            }
            object = super.method_25401(d, d2, d3, d4);
        }
        return (boolean)object;
    }

    public boolean method_25403(class_11909 class_119092, double d, double d2) {
        Object object;
        block6: {
            block7: {
                Object object2;
                block8: {
                    block9: {
                        long l2;
                        long l3 = l2 = b ^ 0x65E988D0544BL;
                        long l4 = l3 ^ 0x288FE2BE9CDFL;
                        long l5 = l3 ^ 0x5EA3B06CFD36L;
                        long l6 = l3 ^ 0x5CB584DDCF5DL;
                        boolean bl = _02.cfr_renamed_3();
                        try {
                            object = _83.f("\u00a3", (Object)this, 6985940945350910120L, (long)l2);
                            if (!bl) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        CallSite callSite = _83.f("B", (Object)this, (Object)objectArray, 6987461110629297241L, (long)l2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l5;
                        CallSite callSite2 = _83.f("B", (Object)this, (Object)objectArray2, 6985250629262925895L, (long)l2);
                        reference var17_11 = _83.f("\u00a3", (Object)this, 6985681786442089858L, (long)l2) + _83.d("h", 17640, (long)(0x42D1A7E36FFE92FEL ^ l2));
                        reference var18_12 = _83.f("\u00a3", (Object)this, 6988258981916932253L, (long)l2) + _83.d("h", 11219, (long)(0xAB3F8CC30EA7DDEL ^ l2)) + _83.d("h", 27391, (long)(0x4D7C99748C22BCC1L ^ l2)) + _83.d("h", 11731, (long)(0x773AE90C50C07BD9L ^ l2));
                        reference var19_13 = callSite - _83.d("h", 692, (long)(0x706A279E9560D4B6L ^ l2));
                        reference var20_14 = callSite2 - (var18_12 - _83.f("\u00a3", (Object)this, 6988258981916932253L, (long)l2)) - _83.d("h", 13472, (long)(0x42667BC282D1E28DL ^ l2));
                        int n = (int)_83.f("\u00c8", (double)((double)_83.f("B", (Object)_83.f("\u00a3", (Object)this, 6989490283127816597L, (long)l2), 6988050600778774786L, (long)l2) / 11.0), 6984206208429708522L, (long)l2);
                        CallSite callSite3 = _83.f("\u00c8", 0, (int)(n - _83.d("h", 13635, (long)(0x46AD907E857A635BL ^ l2))), 6984410407973280275L, (long)l2);
                        try {
                            object2 = callSite3;
                            if (!bl) break block8;
                            if (object2 <= 0) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                        reference var23_17 = var20_14 - _83.d("h", 21865, (long)(0x12DB60686C468369L ^ l2));
                        CallSite callSite4 = _83.f("\u00c8", 40.0f, (float)((float)var23_17 * (6.0f / (float)n)), 6985433418838701389L, (long)l2);
                        Object[] objectArray3 = new Object[2];
                        objectArray3[1] = l6;
                        objectArray3[0] = (double)_83.f("B", (Object)class_119092, 6989262885202917666L, (long)l2);
                        CallSite callSite5 = _83.f("B", (Object)this, (Object)objectArray3, 6985097461664477908L, (long)l2);
                        float f = (float)(callSite5 - _83.f("\u00a3", (Object)this, 6985553243405051269L, (long)l2));
                        float f2 = (float)var23_17 - callSite4;
                        try {
                            float f3 = f2 - 0.0f;
                            object2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                            if (!bl) break block8;
                            if (object2 <= 0) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                        float f4 = f / f2;
                        _83.f("\u00ca", (Object)this, (int)_83.f("\u00c8", 0, (int)_83.f("\u00c8", (int)callSite3, (int)(_83.f("\u00a3", (Object)this, 6988128802071034017L, (long)l2) + _83.f("\u00c8", (float)(f4 * (float)callSite3), 6986411424880889016L, (long)l2)), 6986175124711074682L, (long)l2), 6984410407973280275L, (long)l2), 6986473771980393282L, (long)l2);
                    }
                    object2 = true;
                }
                return (boolean)object2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean method_25402(class_11909 class_119092, boolean bl) {
        Object object;
        block77: {
            block78: {
                CallSite callSite;
                reference var29_23;
                CallSite callSite2;
                boolean bl2;
                CallSite callSite3;
                CallSite callSite4;
                long l2;
                block68: {
                    reference var31_25;
                    reference var30_24;
                    long l3;
                    block69: {
                        block76: {
                            Object object2;
                            CallSite callSite5;
                            reference var37_33;
                            CallSite callSite6;
                            block75: {
                                reference v36;
                                CallSite callSite7;
                                block73: {
                                    float f;
                                    reference var36_31;
                                    block72: {
                                        CallSite callSite8;
                                        block70: {
                                            block71: {
                                                CallSite callSite9;
                                                CallSite callSite10;
                                                CallSite callSite11;
                                                block65: {
                                                    block66: {
                                                        long l4;
                                                        long l5;
                                                        block63: {
                                                            reference var27_20;
                                                            CallSite callSite12;
                                                            CallSite callSite13;
                                                            reference var22_14;
                                                            block64: {
                                                                block59: {
                                                                    reference var26_19;
                                                                    block60: {
                                                                        Object object3;
                                                                        block61: {
                                                                            block62: {
                                                                                long l6 = l2 = b ^ 0x1FE6CE952B1FL;
                                                                                l5 = l6 ^ 0x2D7E2429BC8AL;
                                                                                l3 = l6 ^ 0xF867F97FD57L;
                                                                                long l7 = l6 ^ 0x5280A4FBE38BL;
                                                                                l4 = l6 ^ 0x4A903DB95B71L;
                                                                                long l8 = l6 ^ 0x24ACF6298262L;
                                                                                long l9 = l6 ^ 0x26BAC298B009L;
                                                                                Object[] objectArray = new Object[2];
                                                                                objectArray[1] = l9;
                                                                                objectArray[0] = (double)_83.f("B", (Object)class_119092, 2279436329720953006L, (long)l2);
                                                                                callSite4 = _83.f("B", (Object)this, (Object)objectArray, 2280078353991667072L, (long)l2);
                                                                                Object[] objectArray2 = new Object[2];
                                                                                objectArray2[1] = l9;
                                                                                objectArray2[0] = (double)_83.f("B", (Object)class_119092, 2281816066593261174L, (long)l2);
                                                                                callSite3 = _83.f("B", (Object)this, (Object)objectArray2, 2280078353991667072L, (long)l2);
                                                                                Object[] objectArray3 = new Object[1];
                                                                                objectArray3[0] = l7;
                                                                                callSite11 = _83.f("B", (Object)this, (Object)objectArray3, 2282208820525470477L, (long)l2);
                                                                                Object[] objectArray4 = new Object[1];
                                                                                objectArray4[0] = l8;
                                                                                callSite10 = _83.f("B", (Object)this, (Object)objectArray4, 2280196348023086867L, (long)l2);
                                                                                var22_14 = _83.f("\u00a3", (Object)this, 2283099110859999177L, (long)l2) + callSite10 - _83.d("h", 25492, (long)(0x4730BAA818F54AFAL ^ l2));
                                                                                callSite13 = _83.d("h", 7661, (long)(0x5FC0910D223334B0L ^ l2));
                                                                                callSite12 = _83.d("h", 10324, (long)(0x4E4380CD95D7813CL ^ l2));
                                                                                reference var25_17 = _83.f("\u00a3", (Object)this, 2280609895768750806L, (long)l2) + callSite11 - callSite13 - _83.d("h", 30816, (long)(0x4A41C241E00DD131L ^ l2));
                                                                                bl2 = _02.cfr_renamed_2();
                                                                                var26_19 = var25_17 - callSite13 - _83.d("h", 17361, (long)(0x7A0ADC7CCE1BEA92L ^ l2));
                                                                                var27_20 = var26_19 - callSite13 - _83.d("h", 17361, (long)(0x7A0ADC7CCE1BEA92L ^ l2));
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        Object[] objectArray5 = new Object[7];
                                                                                                        objectArray5[6] = (int)callSite12;
                                                                                                        objectArray5[5] = (int)callSite13;
                                                                                                        objectArray5[4] = (int)var22_14;
                                                                                                        objectArray5[3] = (int)var25_17;
                                                                                                        objectArray5[2] = (double)callSite3;
                                                                                                        objectArray5[1] = (double)callSite4;
                                                                                                        objectArray5[0] = l3;
                                                                                                        callSite9 = _83.f("B", (Object)this, (Object)objectArray5, 2278904119649498750L, (long)l2);
                                                                                                        if (bl2) break block59;
                                                                                                        if (callSite9 == false) break block60;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw _83.a(matchException);
                                                                                                    }
                                                                                                    object3 = _83.f("\u00a3", (Object)this, 2280438064697658195L, (long)l2);
                                                                                                    if (bl2) break block61;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw _83.a(matchException);
                                                                                                }
                                                                                                if (object3 < 0) break block62;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw _83.a(matchException);
                                                                                            }
                                                                                            object3 = _83.f("\u00a3", (Object)this, 2280438064697658195L, (long)l2);
                                                                                            if (bl2) break block61;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _83.a(matchException);
                                                                                        }
                                                                                        if (object3 >= _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2282149006763474625L, (long)l2), 2283026974800266838L, (long)l2)) break block62;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _83.a(matchException);
                                                                                    }
                                                                                    Object[] objectArray6 = new Object[2];
                                                                                    objectArray6[1] = l4;
                                                                                    objectArray6[0] = (class_1792)_83.f("B", (Object)_83.f("\u00a3", (Object)this, 2282149006763474625L, (long)l2), (int)_83.f("\u00a3", (Object)this, 2280438064697658195L, (long)l2), 2285812643463642149L, (long)l2);
                                                                                    _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2279553047289535807L, (long)l2), (Object)objectArray6, 2279252984764391415L, (long)l2);
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _83.a(matchException);
                                                                                }
                                                                            }
                                                                            _83.f("B", (Object)_83.f("\u00df", 2281859353445477002L, (long)l2), (Object)_83.f("\u00a3", (Object)_83.f("\u00df", 2282389880351518126L, (long)l2), 2285876751814390582L, (long)l2), 2280688716426578772L, (long)l2);
                                                                            object3 = true;
                                                                        }
                                                                        return (boolean)object3;
                                                                    }
                                                                    Object[] objectArray = new Object[7];
                                                                    objectArray[6] = (int)callSite12;
                                                                    objectArray[5] = (int)callSite13;
                                                                    objectArray[4] = (int)var22_14;
                                                                    objectArray[3] = (int)var26_19;
                                                                    objectArray[2] = (double)callSite3;
                                                                    objectArray[1] = (double)callSite4;
                                                                    objectArray[0] = l3;
                                                                    callSite9 = _83.f("B", (Object)this, (Object)objectArray, 2278904119649498750L, (long)l2);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (bl2) break block63;
                                                                        if (callSite9 == false) break block64;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _83.a(matchException);
                                                                    }
                                                                    _83.f("B", (Object)_83.f("\u00df", 2281859353445477002L, (long)l2), (Object)_83.f("\u00a3", (Object)_83.f("\u00df", 2282389880351518126L, (long)l2), 2285876751814390582L, (long)l2), 2280688716426578772L, (long)l2);
                                                                    return true;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _83.a(matchException);
                                                                }
                                                            }
                                                            Object[] objectArray = new Object[7];
                                                            objectArray[6] = (int)callSite12;
                                                            objectArray[5] = (int)callSite13;
                                                            objectArray[4] = (int)var22_14;
                                                            objectArray[3] = (int)var27_20;
                                                            objectArray[2] = (double)callSite3;
                                                            objectArray[1] = (double)callSite4;
                                                            objectArray[0] = l3;
                                                            callSite9 = _83.f("B", (Object)this, (Object)objectArray, 2278904119649498750L, (long)l2);
                                                        }
                                                        try {
                                                            if (bl2) break block65;
                                                            if (callSite9 == false) break block66;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _83.a(matchException);
                                                        }
                                                        Object[] objectArray = new Object[1];
                                                        objectArray[0] = l5;
                                                        Object[] objectArray7 = new Object[2];
                                                        objectArray7[1] = l4;
                                                        objectArray7[0] = _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2279553047289535807L, (long)l2), (Object)objectArray, 2283119910703038155L, (long)l2);
                                                        _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2279553047289535807L, (long)l2), (Object)objectArray7, 2279252984764391415L, (long)l2);
                                                        _83.f("\u00ca", (Object)this, (int)_83.d("h", 2475, (long)(0x5FA287C80BBC20E1L ^ l2)), 2280438064697658195L, (long)l2);
                                                        for (int j = 0; j < _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2282149006763474625L, (long)l2), 2283026974800266838L, (long)l2); ++j) {
                                                            _83 v22;
                                                            block67: {
                                                                try {
                                                                    try {
                                                                        v22 = this;
                                                                        if (bl2) break block67;
                                                                        Object[] objectArray8 = new Object[1];
                                                                        objectArray8[0] = l5;
                                                                        if (_83.f("B", (Object)_83.f("\u00a3", (Object)v22, 2282149006763474625L, (long)l2), (int)j, 2285812643463642149L, (long)l2) != _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2279553047289535807L, (long)l2), (Object)objectArray8, 2283119910703038155L, (long)l2)) continue;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _83.a(matchException);
                                                                    }
                                                                    v22 = this;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _83.a(matchException);
                                                                }
                                                            }
                                                            try {
                                                                _83.f("\u00ca", (Object)v22, (int)j, 2280438064697658195L, (long)l2);
                                                                if (!bl2) break;
                                                                if (!bl2) continue;
                                                                break;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _83.a(matchException);
                                                            }
                                                        }
                                                        return true;
                                                    }
                                                    callSite9 = _83.f("\u00a3", (Object)this, 2280609895768750806L, (long)l2) + _83.d("h", 30816, (long)(0x4A41C241E00DD131L ^ l2));
                                                }
                                                callSite2 = callSite9;
                                                var29_23 = _83.f("\u00a3", (Object)this, 2283099110859999177L, (long)l2) + _83.d("h", 3569, (long)(0x60A59B513AFA2491L ^ l2)) + _83.d("h", 10324, (long)(0x4E4380CD95D7813CL ^ l2)) + _83.d("h", 30258, (long)(0x7C0CC8E94607DF75L ^ l2));
                                                var30_24 = callSite11 - _83.d("h", 11424, (long)(0x45B74C934FE085C9L ^ l2));
                                                var31_25 = callSite10 - (var29_23 - _83.f("\u00a3", (Object)this, 2283099110859999177L, (long)l2)) - _83.d("h", 20058, (long)(0x3E901CED24AE726L ^ l2));
                                                int n = (int)_83.f("\u00c8", (double)((double)_83.f("B", (Object)_83.f("\u00a3", (Object)this, 2282149006763474625L, (long)l2), 2283026974800266838L, (long)l2) / 11.0), 2285744510803815358L, (long)l2);
                                                callSite6 = _83.f("\u00c8", 0, (int)(n - _83.d("h", 26044, (long)(0x2270853F9A8E4CC2L ^ l2))), 2286111506712798535L, (long)l2);
                                                try {
                                                    object = n;
                                                    if (bl2) break block68;
                                                    if (object <= _83.d("h", 26044, (long)(0x2270853F9A8E4CC2L ^ l2))) break block69;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _83.a(matchException);
                                                }
                                                callSite = _83.d("h", 26044, (long)(0x2270853F9A8E4CC2L ^ l2));
                                                reference var35_29 = callSite2 + var30_24 - callSite - 5;
                                                var36_31 = var29_23 + 5;
                                                var37_33 = var31_25 - _83.d("h", 17361, (long)(0x7A0ADC7CCE1BEA92L ^ l2));
                                                try {
                                                    Object[] objectArray = new Object[7];
                                                    objectArray[6] = (int)var37_33;
                                                    objectArray[5] = (int)(callSite + 4);
                                                    objectArray[4] = (int)var36_31;
                                                    objectArray[3] = (int)(var35_29 - 2);
                                                    objectArray[2] = (double)callSite3;
                                                    objectArray[1] = (double)callSite4;
                                                    objectArray[0] = l3;
                                                    object = _83.f("B", (Object)this, (Object)objectArray, 2278904119649498750L, (long)l2);
                                                    if (bl2) break block68;
                                                    if (object == 0) break block69;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _83.a(matchException);
                                                }
                                                callSite5 = _83.f("\u00c8", 40.0f, (float)((float)var37_33 * (6.0f / (float)n)), 2280304241832659481L, (long)l2);
                                                try {
                                                    try {
                                                        callSite8 = callSite6;
                                                        if (bl2) break block70;
                                                        if (callSite8 != false) break block71;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _83.a(matchException);
                                                    }
                                                    f = 0.0f;
                                                    break block72;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _83.a(matchException);
                                                }
                                            }
                                            callSite8 = _83.f("\u00a3", (Object)this, 2278974168223249430L, (long)l2);
                                        }
                                        f = (float)callSite8 / (float)callSite6;
                                    }
                                    float f2 = f;
                                    reference var40_39 = var36_31 + (int)(((float)var37_33 - callSite5) * f2);
                                    try {
                                        block74: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            callSite7 = callSite3;
                                                            v36 = var40_39;
                                                            if (bl2) break block73;
                                                            if (callSite7 < v36) break block74;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _83.a(matchException);
                                                        }
                                                        float f3 = (float)callSite3 - ((float)var40_39 + callSite5);
                                                        object2 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                                                        if (bl2) break block75;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _83.a(matchException);
                                                    }
                                                    if (object2 > 0) break block74;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _83.a(matchException);
                                                }
                                                _83.f("\u00ca", (Object)this, (boolean)_83.d("h", 2416, (long)(0x5764813EA61EA00AL ^ l2)), 2280921794661195772L, (long)l2);
                                                _83.f("\u00ca", (Object)this, (int)callSite3, 2280459300297579217L, (long)l2);
                                                _83.f("\u00ca", (Object)this, (int)_83.f("\u00a3", (Object)this, 2278974168223249430L, (long)l2), 2282946854949472245L, (long)l2);
                                                if (!bl2) break block76;
                                            }
                                            catch (MatchException matchException) {
                                                throw _83.a(matchException);
                                            }
                                        }
                                        callSite7 = callSite3;
                                        v36 = var36_31;
                                    }
                                    catch (MatchException matchException) {
                                        throw _83.a(matchException);
                                    }
                                }
                                object2 = callSite7 - v36;
                            }
                            Object object4 = ((float)object2 - callSite5 / 2.0f) / ((float)var37_33 - callSite5);
                            object4 = _83.f("\u00c8", 0.0f, (float)_83.f("\u00c8", 1.0f, (float)object4, 2279674432145312922L, (long)l2), 2280304241832659481L, (long)l2);
                            _83.f("\u00ca", (Object)this, (int)_83.f("\u00c8", (float)(object4 * (float)callSite6), 2279034869789291500L, (long)l2), 2278974168223249430L, (long)l2);
                            _83.f("\u00ca", (Object)this, (boolean)_83.d("h", 30431, (long)(0x1A7BEC07F05FDF87L ^ l2)), 2280921794661195772L, (long)l2);
                            _83.f("\u00ca", (Object)this, (int)callSite3, 2280459300297579217L, (long)l2);
                            _83.f("\u00ca", (Object)this, (int)_83.f("\u00a3", (Object)this, 2278974168223249430L, (long)l2), 2282946854949472245L, (long)l2);
                        }
                        return true;
                    }
                    Object[] objectArray = new Object[7];
                    objectArray[6] = (int)var31_25;
                    objectArray[5] = (int)var30_24;
                    objectArray[4] = (int)var29_23;
                    objectArray[3] = (int)callSite2;
                    objectArray[2] = (double)callSite3;
                    objectArray[1] = (double)callSite4;
                    objectArray[0] = l3;
                    object = _83.f("B", (Object)this, (Object)objectArray, 2278904119649498750L, (long)l2);
                }
                try {
                    if (bl2) break block77;
                    if (object == 0) break block78;
                }
                catch (MatchException matchException) {
                    throw _83.a(matchException);
                }
                callSite = _83.d("h", 18085, (long)(0x232B949B03D56FF5L ^ l2));
                reference var35_30 = _83.f("\u00a3", (Object)this, 2278974168223249430L, (long)l2) * _83.d("h", 19684, (long)(0x3DA771D0EDE7E5A2L ^ l2));
                reference var36_32 = callSite4 - callSite2 - 5;
                reference var37_34 = callSite3 - var29_23 - 5;
                reference var38_36 = var36_32 / callSite;
                reference var39_38 = var37_34 / callSite;
                try {
                    try {
                        try {
                            object = var38_36;
                            if (bl2) break block77;
                            if (object < 0) break block78;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                        object = var38_36;
                        if (bl2) break block77;
                    }
                    catch (MatchException matchException) {
                        throw _83.a(matchException);
                    }
                    if (object >= _83.d("h", 19684, (long)(0x3DA771D0EDE7E5A2L ^ l2))) break block78;
                }
                catch (MatchException matchException) {
                    throw _83.a(matchException);
                }
                reference var40_40 = var35_30 + var39_38 * _83.d("h", 19684, (long)(0x3DA771D0EDE7E5A2L ^ l2)) + var38_36;
                try {
                    try {
                        try {
                            try {
                                object = var40_40;
                                if (bl2) break block77;
                                if (object < 0) break block78;
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                            object = var40_40;
                            if (bl2) break block77;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                        if (object >= _83.f("B", (Object)_83.f("\u00a3", (Object)this, 2282149006763474625L, (long)l2), 2283026974800266838L, (long)l2)) break block78;
                    }
                    catch (MatchException matchException) {
                        throw _83.a(matchException);
                    }
                    _83.f("\u00ca", (Object)this, (int)var40_40, 2280438064697658195L, (long)l2);
                    return true;
                }
                catch (MatchException matchException) {
                    throw _83.a(matchException);
                }
            }
            object = super.method_25402(class_119092, bl);
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public _83(_9m_0 var1_1, long var2_2) {
        block15: {
            block14: {
                v0 = var2_2 = _83.b ^ var2_2;
                var4_3 = v0 ^ 72581096768509L;
                var6_4 = v0 ^ 96748202655105L;
                var8_5 = v0 ^ 60489248235287L;
                var10_6 = v0 ^ 123284360059613L;
                var12_7 = v0 ^ 66652591636577L;
                var14_8 = v0 ^ 58770772068806L;
                var16_9 = v0 ^ 92083951462214L;
                v1 = new Object[1];
                v1[0] = var12_7;
                super((String)_83.b("z", (int)8990, (long)(6459819600729076024L ^ var2_2)) + var1_1.java_lang_String_5(v1));
                this.cfr_renamed_6 = (int)_83.d("h", (int)12909, (long)(1288002511320276395L ^ var2_2));
                this.cfr_renamed_389 = (int)_83.d("h", (int)26044, (long)(2481699695536278093L ^ var2_2));
                this.cfr_renamed_3 = (int)_83.d("h", (int)11424, (long)(5023498295931847494L ^ var2_2));
                this.cfr_renamed_137 = (int)_83.d("h", (int)29447, (long)(5045691656790220030L ^ var2_2));
                var18_10 = _02.cfr_renamed_3();
                try {
                    try {
                        this.cfr_renamed_390 = new _7V(var8_5);
                        _83.f("\u00ca", (Object)this, (int)_83.d("h", (int)23522, (long)(4164301630334120989L ^ var2_2)), (long)-2796793193485552999L, (long)var2_2);
                        _83.f("\u00ca", (Object)this, (int)_83.d("h", (int)2475, (long)(6891288422008284782L ^ var2_2)), (long)-2798142947361976868L, (long)var2_2);
                        _83.f("\u00ca", (Object)this, (boolean)_83.d("h", (int)23522, (long)(4164301630334120989L ^ var2_2)), (long)-2798925804097578637L, (long)var2_2);
                        _83.f("\u00ca", (Object)this, (int)_83.d("h", (int)23522, (long)(4164301630334120989L ^ var2_2)), (long)-2798265749803246498L, (long)var2_2);
                        _83.f("\u00ca", (Object)this, (int)_83.d("h", (int)23522, (long)(4164301630334120989L ^ var2_2)), (long)-2800700657299422854L, (long)var2_2);
                        this.cfr_renamed_1 = var1_1;
                        this.cfr_renamed_8 = new ArrayList<E>();
                        _83.f("B", (Object)_83.f("\u00df", (long)-2800109111245185243L, (long)var2_2), (Consumer<class_1792>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 3(long net.minecraft.class_1792 ), (Lnet/minecraft/class_1792;)V)((_83)this, (long)var14_8), (long)-2799773373198289506L, (long)var2_2);
                        _83.f("\u00ca", (Object)this, new ArrayList<E>(_83.f("\u00a3", (Object)this, (long)-2794731497709736459L, (long)var2_2)), (long)-2799950440361789362L, (long)var2_2);
                        v2 = new Object[2];
                        v2[1] = _83.b("z", (int)32260, (long)(4034131465174920227L ^ var2_2));
                        v2[0] = var4_3;
                        _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-2797157656538498799L, (long)var2_2), (Object)v2, (long)-2797708949127948866L, (long)var2_2);
                        v3 = new Object[2];
                        v3[1] = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, 4(long ), ()V)((_83)this, (long)var6_4);
                        v3[0] = var10_6;
                        _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-2797157656538498799L, (long)var2_2), (Object)v3, (long)-2799881297379280421L, (long)var2_2);
                        v4 = new Object[1];
                        v4[0] = var16_9;
                        v5 = _83.f("B", (Object)var1_1, (Object)v4, (long)-2800186007429576953L, (long)var2_2);
                        if (var18_10 == 0) break block14;
                        if (v5 == null) break block15;
                    }
                    catch (MatchException v6) {
                        throw _83.a(v6);
                    }
                    v7 = new Object[1];
                    v7[0] = var16_9;
                    v5 = _83.f("B", (Object)var1_1, (Object)v7, (long)-2800186007429576953L, (long)var2_2);
                }
                catch (MatchException v8) {
                    throw _83.a(v8);
                }
            }
            if (v5 == _83.f("\u00df", (long)-2797929589082056307L, (long)var2_2)) break block15;
            var19_11 = 0;
            block10: while (var19_11 < _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-2799950440361789362L, (long)var2_2), (long)-2800762368979238695L, (long)var2_2)) {
                block16: {
                    try {
                        try {
                            v9 = this;
                            v10 = var18_10;
                            if (var2_2 < 0L) ** GOTO lbl83
                            if (v10 == 0) break block16;
                            v11 = new Object[1];
                            v11[0] = var16_9;
                            if (_83.f("B", (Object)_83.f("\u00a3", (Object)v9, (long)-2799950440361789362L, (long)var2_2), (int)var19_11, (long)-2794597935682946390L, (long)var2_2) == _83.f("B", (Object)var1_1, (Object)v11, (long)-2800186007429576953L, (long)var2_2)) {
                            }
                            ** GOTO lbl89
                        }
                        catch (MatchException v12) {
                            throw _83.a(v12);
                        }
                        v9 = this;
                    }
                    catch (MatchException v13) {
                        throw _83.a(v13);
                    }
                }
                try {
                    v10 = var19_11;
lbl83:
                    // 2 sources

                    _83.f("\u00ca", (Object)v9, (int)v10, (long)-2798142947361976868L, (long)var2_2);
                    do {
                        block17: {
                            v14 = var18_10;
                            if (var2_2 > 0L) {
                                if (v14 != 0) break block10;
                            }
                            break block17;
lbl89:
                            // 2 sources

                            ++var19_11;
                            v14 = var18_10;
                        }
                        if (v14 != 0) continue block10;
                    } while (var2_2 <= 0L);
                    break;
                }
                catch (MatchException v15) {
                    throw _83.a(v15);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _83.b = dev.krypton.l.a(8567304479693085087L, 351837068171869039L, MethodHandles.lookup().lookupClass()).a(193419700970237L);
                        _83.q = new Object[123];
                        _83.r = new String[123];
                        _83.b();
                        _83.h = new HashMap<K, V>(13);
                        var11 = _83.b ^ 18037007709222L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[7];
                        var18_4 = 0;
                        var17_5 = "\u00b7\u0002\u00b3G\u00ce=\u00f5\u00a4T\u00ac\u007f\u008b\u00e1\u00b3\u00b3\u00fb\u00e9st\u00dc\u00ddG\u0003\u009d\u0010\u0090oQ\u00d1sG\u0014V-\u00d6\u0083\u00d1n\u00c3\u008dM\u0018-\u00ee\u00caz\u00e8\u00aa\u00a8\u000b\u001c\u0080\u0018qPe8$]^)\u00f9\u00a7\u00e7\f. qX\u00e4{\u000f\u001f\u00e4&I\u0080\u0007\u0012\u00f3\u00c2!P6M6\u00e9Je\u00b3\u00f5\u00e9|\u00c1\u0016\u00f6\u009e\u00a6\u00d0\u0010\u008b\u00a4*;\u0017\u00bd\bq'\u009cP\u008du\u00e1\u0011\u0097";
                        var19_6 = "\u00b7\u0002\u00b3G\u00ce=\u00f5\u00a4T\u00ac\u007f\u008b\u00e1\u00b3\u00b3\u00fb\u00e9st\u00dc\u00ddG\u0003\u009d\u0010\u0090oQ\u00d1sG\u0014V-\u00d6\u0083\u00d1n\u00c3\u008dM\u0018-\u00ee\u00caz\u00e8\u00aa\u00a8\u000b\u001c\u0080\u0018qPe8$]^)\u00f9\u00a7\u00e7\f. qX\u00e4{\u000f\u001f\u00e4&I\u0080\u0007\u0012\u00f3\u00c2!P6M6\u00e9Je\u00b3\u00f5\u00e9|\u00c1\u0016\u00f6\u009e\u00a6\u00d0\u0010\u008b\u00a4*;\u0017\u00bd\bq'\u009cP\u008du\u00e1\u0011\u0097".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _83.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c05\u00dd\u0004)\u00e6\u00e9\u00a7Q\u00cbPC\u0091\u00b4\u0002\u008b\u00c5C\u0000\u00f2jb\u00c6\u00af'n\n!9<\u009d\u00c7\u0010\u00986\u00d0^\u00c5\u009e\u00ed\u00dew\u00d9\u00da\u0094\u00a0U\u00e2V";
                            var19_6 = "\u00c05\u00dd\u0004)\u00e6\u00e9\u00a7Q\u00cbPC\u0091\u00b4\u0002\u008b\u00c5C\u0000\u00f2jb\u00c6\u00af'n\n!9<\u009d\u00c7\u0010\u00986\u00d0^\u00c5\u009e\u00ed\u00dew\u00d9\u00da\u0094\u00a0U\u00e2V".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl37:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = _83.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                _83.f = var20_3;
                _83.g = new String[7];
                _83.n = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[57];
                var3_13 = 0;
                var4_14 = "\u000f\u00d4\u00df\u00a7\u00985\u0012\u0087%U\u00fa\u00b0\u0096\u0000dyHV\u00c66I\u0011\u008d1M\u00ba\u00f8R-\u00e3z\u00c0\u0017\u00e4\u008bD0\u00beKT\u008c\u00e8e\u00af|h\u00f9\u00b6\u00d6\u00b5\u00c38Vq\u00f5\u00ff\u00a5\u00d9\u00f2\b\u0019G-\u00aeO\u0085\u007f\u00f7\u009a\u00a8\u00e9\u0019\u00d5\u000e\u00a3>\u0097b\u001f\u0088\u00e8|\u0092\u0096(6\u00c2\u00beK\u0093\u00cd\u00d2\u0001\u0093\u00a0\u00dcX\u00ed\u00b3\u00e8\u00b0\u00b7 :\u00e5\u00cf\f\u0000\u00e9\u00d9\u00abi\u00e8\u0089;K#$\u00fa0\u0003\u008b\u00a5\u00b0HO\u00fe\u00cd\u00e1\u0081\u0003\u00f8\u0096D5\u00f7\u00d0\u00f1M$8%\u00de\u0005\u0093kE\u00a3\u00f95\u00ae[\u00f6\u00eew\u00db\u00da7\t|~z\u0005=;\u009d\u00f4\u0088E\u008a[>\u00df\u008e\u009d\u00d2`\u0080\u00c5\u001a\u00f9g\u0080m{\u0091\u00fc\u009a\u00e3z\u0010k|\u00b0+\u0016\u00a9\u0081\"\u00b0*VXt\u00da\u00ad\u00dc\u00bft\u00c5$\u00f1\u009fV`\u00cb\u00b4\u00fe\u00ea\u000fP\u00c3\u00d3\u00d7\u00be=\u00ae\u00e0\u00ad\u0018\u00fe2h\u00f1\u00c2>\f>\u00123\u0014\u00a3\u0097\u008eY\u0013\u0085\u0092\u0087\u00f6\\\u0091\u0091\u00c5\u00acs@\u0095\u0013\u00c6VK\"\u00a7v\u0083G\u00b3 \u00e0Y+U\u00fd\u0015x\u00d2\u0097J^\f\u00d3\n\u00f9\u0003\u00e0B\u0092\u00fd\u0002kE\u00a9e\u00df\u0087\\\u0011B\u00ec\u00916\u0005\u00ae\u0082\u00d6#\u0014.5\u00848o4=\u0087\u00e3\u0003\u00063\u00c2\u009a\u00f9\u00d6\"\u00b8\bd\u0010+o\u0004 \u001b\u00ee\u008d\u00b7\u00d1\u00e7\u00ec\u00ff-#\u00b6\u0080\u008d\u0018\u00bd\u001c\u0001,&\u00ff\u009c=0u\u00a8#\u00d4\u00be\u00d3}\u0080\u00fc-\u0096@\u00ae'\t\u008e}\u00a8\u00edP_\u000e\u00e0G\u00d3\u00e1cT\u00b3\u00a8\u00ca\u0089\u0005x\u00fb\u00b9x\u0007\u0010/Oq\u0092\u0083\u00da\u00e9\u0093~\u00d1#\u00b4\u00e8\u00ec\u00e6j<\u0013JNc\u0082\u001cC8q\u00e0\u0090\u00e1\u0098\u00bc\u00ae):\u00dcV\u009c.(S~Z\u0098\u00cd\u0086";
                var5_15 = "\u000f\u00d4\u00df\u00a7\u00985\u0012\u0087%U\u00fa\u00b0\u0096\u0000dyHV\u00c66I\u0011\u008d1M\u00ba\u00f8R-\u00e3z\u00c0\u0017\u00e4\u008bD0\u00beKT\u008c\u00e8e\u00af|h\u00f9\u00b6\u00d6\u00b5\u00c38Vq\u00f5\u00ff\u00a5\u00d9\u00f2\b\u0019G-\u00aeO\u0085\u007f\u00f7\u009a\u00a8\u00e9\u0019\u00d5\u000e\u00a3>\u0097b\u001f\u0088\u00e8|\u0092\u0096(6\u00c2\u00beK\u0093\u00cd\u00d2\u0001\u0093\u00a0\u00dcX\u00ed\u00b3\u00e8\u00b0\u00b7 :\u00e5\u00cf\f\u0000\u00e9\u00d9\u00abi\u00e8\u0089;K#$\u00fa0\u0003\u008b\u00a5\u00b0HO\u00fe\u00cd\u00e1\u0081\u0003\u00f8\u0096D5\u00f7\u00d0\u00f1M$8%\u00de\u0005\u0093kE\u00a3\u00f95\u00ae[\u00f6\u00eew\u00db\u00da7\t|~z\u0005=;\u009d\u00f4\u0088E\u008a[>\u00df\u008e\u009d\u00d2`\u0080\u00c5\u001a\u00f9g\u0080m{\u0091\u00fc\u009a\u00e3z\u0010k|\u00b0+\u0016\u00a9\u0081\"\u00b0*VXt\u00da\u00ad\u00dc\u00bft\u00c5$\u00f1\u009fV`\u00cb\u00b4\u00fe\u00ea\u000fP\u00c3\u00d3\u00d7\u00be=\u00ae\u00e0\u00ad\u0018\u00fe2h\u00f1\u00c2>\f>\u00123\u0014\u00a3\u0097\u008eY\u0013\u0085\u0092\u0087\u00f6\\\u0091\u0091\u00c5\u00acs@\u0095\u0013\u00c6VK\"\u00a7v\u0083G\u00b3 \u00e0Y+U\u00fd\u0015x\u00d2\u0097J^\f\u00d3\n\u00f9\u0003\u00e0B\u0092\u00fd\u0002kE\u00a9e\u00df\u0087\\\u0011B\u00ec\u00916\u0005\u00ae\u0082\u00d6#\u0014.5\u00848o4=\u0087\u00e3\u0003\u00063\u00c2\u009a\u00f9\u00d6\"\u00b8\bd\u0010+o\u0004 \u001b\u00ee\u008d\u00b7\u00d1\u00e7\u00ec\u00ff-#\u00b6\u0080\u008d\u0018\u00bd\u001c\u0001,&\u00ff\u009c=0u\u00a8#\u00d4\u00be\u00d3}\u0080\u00fc-\u0096@\u00ae'\t\u008e}\u00a8\u00edP_\u000e\u00e0G\u00d3\u00e1cT\u00b3\u00a8\u00ca\u0089\u0005x\u00fb\u00b9x\u0007\u0010/Oq\u0092\u0083\u00da\u00e9\u0093~\u00d1#\u00b4\u00e8\u00ec\u00e6j<\u0013JNc\u0082\u001cC8q\u00e0\u0090\u00e1\u0098\u00bc\u00ae):\u00dcV\u009c.(S~Z\u0098\u00cd\u0086".length();
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
                    var4_14 = "\u0085it\u00c3\u0092\u00b4dr\u0085F\u0091\u0083\u00d1vp$";
                    var5_15 = "\u0085it\u00c3\u0092\u00b4dr\u0085F\u0091\u0083\u00d1vp$".length();
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
        _83.l = var6_12;
        _83.m = new Integer[57];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (r[n3] != null) {
            return n3;
        }
        Object object = q[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 28;
            case 2 -> 37;
            case 3 -> 52;
            case 4 -> 59;
            case 5 -> 26;
            case 6 -> 17;
            case 7 -> 8;
            case 8 -> 48;
            case 9 -> 2;
            case 10 -> 60;
            case 11 -> 35;
            case 12 -> 11;
            case 13 -> 30;
            case 14 -> 50;
            case 15 -> 38;
            case 16 -> 58;
            case 17 -> 51;
            case 18 -> 63;
            case 19 -> 31;
            case 20 -> 15;
            case 21 -> 14;
            case 22 -> 13;
            case 23 -> 55;
            case 24 -> 4;
            case 25 -> 9;
            case 26 -> 32;
            case 27 -> 19;
            case 28 -> 21;
            case 29 -> 7;
            case 30 -> 22;
            case 31 -> 12;
            case 32 -> 54;
            case 33 -> 56;
            case 34 -> 36;
            case 35 -> 46;
            case 36 -> 5;
            case 37 -> 10;
            case 38 -> 25;
            case 39 -> 44;
            case 40 -> 34;
            case 41 -> 53;
            case 42 -> 47;
            case 43 -> 3;
            case 44 -> 23;
            case 45 -> 1;
            case 46 -> 18;
            case 47 -> 41;
            case 48 -> 45;
            case 49 -> 16;
            case 50 -> 43;
            case 51 -> 57;
            case 52 -> 29;
            case 53 -> 62;
            case 54 -> 39;
            case 55 -> 24;
            case 56 -> 0;
            case 57 -> 42;
            case 58 -> 49;
            case 59 -> 20;
            case 60 -> 40;
            case 61 -> 61;
            case 62 -> 33;
            default -> 6;
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
        _83.r[n3] = new String(cArray);
        return n3;
    }

    @Override
    protected int int_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_83.d("h", 29405, (long)(0x47C1F444E7A8D9C4L ^ l2));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _83.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    private static String b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xB1D;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])h.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/83", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            _83.g[n2] = _83.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == '\u00ca' || c == '\u00df' || c == 'M') {
                field = _83.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _83.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _83.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = q;
        q[0] = ";\u0005,\b\u0001\u000e&\u0010.I\u0004Rg\u0005";
        objectArray[1] = "Wp\u001c\u0013CTJe\u001eRF\b\u000bW";
        objectArray[2] = "\f\u0004_)9b\u0007\u000bNfZo\u0012\r";
        objectArray[3] = Integer.TYPE;
        _83.r[3] = "java/lang/Integer";
        objectArray[4] = "\nz6\u0019V\u0002\u007fZ=\u0016GM\u001eT6\u001dC\u0017j";
        objectArray[5] = Void.TYPE;
        _83.r[5] = "java/lang/Void";
        objectArray[6] = "A?c\u007f7f\\*a>2:\u001di";
        objectArray[7] = "\n #\u0019\u0012G\u00175!X\u0017\u001bY\u0013";
        objectArray[8] = "\u0016\u000f\u0007\"%L\u000b\u001a\u0005c \u0010J]";
        objectArray[9] = "wxCc=T\u0002XHl,\u001bcVCg(A\u0017";
        objectArray[10] = "\u000eK\r?\u00105\u0010C\u0017pr)\u0017^";
        objectArray[11] = "KB!BdE@M0\r\u0005KKF4W";
        objectArray[12] = Double.TYPE;
        _83.r[12] = "java/lang/Double";
        objectArray[13] = "`[W\u0004X)}NUE]u=w";
        objectArray[14] = "6S]\b#ECsV\u00072\n\"}]\f6PV";
        objectArray[15] = "\u0013(FBn@f\bMM\u007f\u000f\u0007\u0006FF{Us";
        objectArray[16] = Boolean.TYPE;
        _83.r[16] = "java/lang/Boolean";
        objectArray[17] = Float.TYPE;
        _83.r[17] = "java/lang/Float";
        objectArray[18] = "pP$\"~G\u0005p/-o\bd~$&kR\u0010";
        objectArray[19] = ">K\u0018f\"\u001bKk\u0013i3T*e\u0018b7\u000e^";
        objectArray[20] = "1\u0013m\u0011p\u0019D3f\u001eaV%=m\u0015e\fQ";
        objectArray[21] = "(!C;i]]\u0001H4x\u0012<\u000fC?|HH";
        objectArray[22] = "f1sT\u00102\u0013\u0011x[\u0001}r\u001fsP\u0005'\u0006";
        objectArray[23] = ":Q[\u001cAFOqP\u0013P\t.\u007f[\u0018TSZ";
        objectArray[24] = "e~\u0015^\u001f%\u0010^\u001eQ\u000ejqP\u0015Z\n0\u0005";
        objectArray[25] = "CC~MO:6cuB^uWm~IZ/#";
        objectArray[26] = "`^2&T8`^%zX7z\u0015%dX\"}du9\t";
        objectArray[27] = "<]oJ'\u0019<]x\u0016+\u0016&\u0016x\b+\u0003!g*T~A";
        objectArray[28] = "_Se\u0002giBFgCb5\t";
        objectArray[29] = "\u0012ip{.AgI{t?\u000e\u0006Gp\u007f;Tr";
        objectArray[30] = ",2pV'},2g\n+r6yg\u0014+g1\b5Is${";
        objectArray[31] = "\bm<eQ6\bm+9]9\u0012&+'],\u0015Wys\fm";
        objectArray[32] = "\r4\u007fM*d\r4h\u0011&k\u0017\u007fh\u000f&~\u0010\u000e:T~?";
        objectArray[33] = "\u0010\u0011\u0014\u0018iMe1\u001f\u0017x\u0002\u0004?\u0014\u001c|Xp";
        objectArray[34] = "N8\u0001E,%E7\u0010\nQ=V0\u0019C";
        objectArray[35] = "\u000b\u0005|+\u00072\u0000\nmdj6\u0000\u0016Y/X+\u0004\ni/";
        objectArray[36] = "\u000b\u0010uis\u0000\u000b\u0010b5\u007f\u000f\u0011[b+\u007f\u001a\u0016*3r(X";
        objectArray[37] = "_Y\u0018 ,EBL\u001aa)\u0019\u0002q";
        objectArray[38] = "2a\u001d\u0017{V/t\u001fV~\noi";
        objectArray[39] = "\b\u0004]N,@}$VA=\u000f\u001c*]J9Uh";
        objectArray[40] = "g~\u0006^{\u000b\u0012^\rQjDsP\u0006Zn\u001e\u0007";
        objectArray[41] = "C\u001es\u0010d\u0017C\u001edLh\u0018YUdRh\r^$3\r>";
        objectArray[42] = "?\u000e\u0017\u0017#cJ.\u001c\u00182,+ \u0017\u00136v_";
        objectArray[43] = "fJyV\u000b\nfJn\n\u0007\u0005|\u0001n\u0014\u0007\u0010{p:ATP";
        objectArray[44] = ")\u007fXJ:K)\u007fO\u00166D34O\b6Q4E\u001b]e\u0010";
        objectArray[45] = "\u0007\u0010\u0015\u0013k'r0\u001e\u001czh\u0013>\u0015\u0017~2g";
        objectArray[46] = "mL!gD%sD;(\f%iN#o\u0005>)n8h\u0019%jH%";
        objectArray[47] = ";=Qe\r@N\u001dZj\u001c\u000f/\u0013Qa\u0018U[";
        objectArray[48] = ".7-\t8D[\u0017&\u0006)\u000b:\u0019-\r-QN";
        objectArray[49] = "&\u000f)]J\u000b&\u000f>\u0001F\u0004<D>\u001fF\u0011;5lB\u001eRp";
        objectArray[50] = "rlrJ_,\u0007LyENcfBrNJ9\u0012";
        objectArray[51] = "^j)b\u0006\u0018@b3-[\u0019Fn>n\u0006>@y:bE";
        objectArray[52] = "'\b<D|+9\u0000&\u000b4+#\n>L=0c98@67.\b>@";
        objectArray[53] = "\u0002yBW/BwYIX>\r\u0016WBS:Wb";
        objectArray[54] = "\u0004\rU\t&G\u001a\u0005OF{F\u001c\tB\u0005&q\u0001\u0000O\rkF\u0001\u001e";
        objectArray[55] = "\u0005\u001dkN:\u0006\u001b\u0015q\u0001g\u0007\u001d\u0019|B:0\u0000\u0010qJw\u0007\u0000\u000en";
        objectArray[56] = "]Q\u001a0\u000f}G\nLM_\u0007OUUvXnP\tL";
        objectArray[57] = "\u0001q\u0006.,\u0002Sf_nBBct\u0004&8C\u0012tPp/";
        objectArray[58] = "D<\u0014/+\u000e\u000f4Q5HV\u0014=(s#^\u0019}HtpI\u0005M\u0012\"%WM-\u0015q2K}wC$,\u0003\u001dp\u0010303";
        objectArray[59] = "kj\r\u0012B[q1[o\u0015!2m\u0006\nE\u001dj/Y\tQ!0-\r\u0012ACtlF\u001e+";
        objectArray[60] = "Oe %\u0007\"\u0016<%1ipsj*.\u00103\u00186+.\u0005";
        objectArray[61] = "'E(B`\"=\u001e~?3\u0019G\t\"@2f.\u0016~Y";
        objectArray[62] = "\u0015\u0000b_KkI\u0001bJ5oG\u001d\u0012\u001c^mNQr\u001b\rzRa-AWoP\u001c`\u001aH9*";
        objectArray[63] = "}+<I*W6#ySI\u0001);d/y\b4ci\u0010u\u0001u3\u0000\u001f+\u001a}3?\u0013\"[-Z";
        objectArray[64] = "8$Y}\u0004Ja}\\ij\u001e?\u0014XmU\u0019>$Io\u0004\u0014";
        objectArray[65] = ">RSMV\n|\u001eP\u0011$Q\u0002\u001aS\u001aA\u000e>B\u0011EB\u001a\u0002I\u0001\u001e\u0018Z2X\u0003O\u0015`";
        objectArray[66] = "\u0010p{yhX\u001b~ny\nZ!++)o\b\u001dsivl\u001c!`(m1XH\u007ftt\n";
        objectArray[67] = "R(\u0010\u001d\u001bG\u0019 U\u0007x\u001f\n?,A\u0013\u0017\u000fiLF@\u0000\u0013Y\u0016\u0010\u0015\u001e[9\u0011C\u0002\u0002kcG\u0016\u001cJ\u000bd\u0014\u0001\u0000z";
        objectArray[68] = "w]l%X\"m\u0006:X\u000fX-\b1<\u00018*[& ";
        objectArray[69] = "\u000e\u001eTxZtWGQl4#2\u0017\u00068Qu\u000eODgRa2\u0015F3IqPQ\u0007xE\u001b";
        objectArray[70] = "/w:\u0000[Vm;9\\)\u0004\u0013?:WLR/gx\bOF\u0013lhS\u0015\u0006#}j\u0002\u0018<";
        objectArray[71] = "C\u0011#JQ\u0017B\u000f&I!\u000eO\n'OM<\u001bK\u007f\u0017!\u0010@J#Z\u0011T]\u0016?(\u001a\u0012\u0012\u000b-J^SY\u0007G";
        objectArray[72] = "jsCDd'!{\u0006^\u0007\u007f:r\u007fIkd)d\u001fAgpn\u0002\u0014Ny`5b\u001cBm'Si\u0013\\}|3a\u001fH:\u001a";
        objectArray[73] = "{Mfpgsv\ntm\u001e'%7?/%}(\u000bgmz~<7=o.e,Uy.eiF";
        objectArray[74] = "f{\u0012hc\u0006?\"\u0017|\rR\u0001KCx`\rj+D+w\u0011";
        objectArray[75] = "\u0017\u0007lxE9N^il+i+\rlnOfK\n?yS";
        objectArray[76] = "\u0000\u001c6\u007fgk\u001aG`\u00023\u0011Y\u001b=g`-\u0001Ybdt\u0011ZIkf>q]\u001a|z\u000e";
        objectArray[77] = "e\u001bf[byh\\tF\u001b.XX?\u0006~|d\u0000}Y}hXQdM\"{g]m\fr\u0012";
        objectArray[78] = ">\fl%9egUi1W;\u0002\u0005>e2d>]|:1p\u0002\u0006l33:b\u0001?$/\n";
        objectArray[79] = "Vg\u0005\u0015l<K/M\u001b\\nR3\u0010\u0010\u000b0\n`N|9|Ko\t\u00026=Y8";
        objectArray[80] = "elt+>0?j)\"O3y\u0019v53#\u0002>xrsh2/z#~R";
        objectArray[81] = "Wz^&\u0018O\u001cr\u001b<{\u0017\u000fmb+\u0017\f\u0014m\u0002#\u001b\u0018S\u000b\t,\u0005\b\bk\u0001 \u0011On`\u000e>\u0001\u0014\u000eh\u0002*Fr";
        objectArray[82] = "jY\u0007G\u000f\u0000(\u0015\u0004\u001b}ZV\u0011\u0007\u0010\u0018\u0004jIEO\u001b\u0010V\u0013G\u001b\u0000\u00004W\u0006P\fj";
        objectArray[83] = "/\u007f$=`zm3'a\u0012+\u00137$jw~/of5tj\u0013i%6taq3#k}\u0010";
        objectArray[84] = "\u0017y\u0005;\u0012\u000bM\u007fX2c\u0015\u0017\u0005\u0005\"\u000e\u0013;(\u00190c\u000eH&\u0004,\u0001TN{\r]";
        objectArray[85] = "\u0014jW\u0004T1K3@C3e\u0017fEj\u000f1A3=\rQ~Ij\u0002\u0001X?\u0019\u0003";
        objectArray[86] = "+\u000f\u000b\u0014yp#[\u001aG\t 8\u0006\u0016\u001bsN`Z\u0005\fr+:\u001d\u0005\u001bxN+\u000f\u000b\u0014yp#[\u001aG\t";
        objectArray[87] = "\u0013Qov8\u0006J\bjbVX/\u0018}4n\u0017P\u0000xuk";
        objectArray[88] = "cgi{:l?finDn0j\u0019=#e3|dpxze\u0006si{;f6bk*6\\";
        objectArray[89] = "\u0016'U\u0000RzO~P\u0014<.P\u0017\u0002\n\u0005yX}@F\u0006%";
        objectArray[90] = "P{\u0016\u001c,y]<\u0004\u0001U,]\u0001OCnw\u0003=\u0017\u00011t\u0017\u0001M\u0003eo\u0007c\tB.cm";
        objectArray[91] = "9\u00184&#b!\u001du#]#@X4%8s|\u0000vz;g@Zt. w\"\u001e5e,\u001d";
        objectArray[92] = "78\u0019kOV-cO\u0016\u001c,n?\u0012sH\u00106}Mp\\,=m\u0016*\u001c\u001c,oG'&";
        objectArray[93] = "coPjD\u00079i\rc5\u000ec1KeT\u0003\u007fWPfG\\y5\n7R\u0018\u0004=\\3\t_4,^b\u0004e";
        objectArray[94] = "@\u001a\u001bOI\u0010\u000b\u0012^U*W\u001e\u0016AE*F\u0015\u0015]OJN\u0019\u0001\u001a)\u0010F\u0014\u000f\u0017I\u0017\u0015\u0003\u0013'";
        objectArray[95] = "'!^\u007fJ\u0011~x[k$EV\u0011\u000foI\u001a+q\b<^\u0006";
        objectArray[96] = "@[\\]P\u0017X^\u001dX.X9\u001b\\^K\u0006\u0005C\u001e\u0001H\u00129G\u0019\u001d\u001f\u0015GHX\u000fHh";
        objectArray[97] = "u0\u0002\u0002z\u001bokT\u007f/a/e_\u001b#\u0001(6H\u0007";
        objectArray[98] = "/k\u0003UwP50U(.*=oL\u0013 C\"3U";
        objectArray[99] = "~9\u001bBk`\"8\u001bW\u0015p=\"\u0006Rp\u000b35\nYe5;a\u001b\n\u0015";
        objectArray[100] = "\u001a7~*bz\u0014{0\"\u001es\u0007:/.rAUzus.\u0016P-\"-.vW~51\u001e";
        objectArray[101] = "T1O\u001cwjNj\u0019a.\u0010\r6D\u0004p,Ut\u001b\u0007d\u0010\u000fvO\u001ctrK7\u0004\u0010\u001e";
        objectArray[102] = "Qe.ij)\rd.|\u00149\u000fv3\u0010.)\u0003`np)z\u0014|^";
        objectArray[103] = "\u00040\u0001\t\u0019v]i\u0004\u001dw\"\u0007\u0000P\u0019\u001a}\b`WJ\ra";
        objectArray[104] = "`\u0019_W\u0004\nd\t\u0013@\u007fYu\t5N\u0005W~\u001anUGQ~\u0004\f\u000fA\fwu";
        objectArray[105] = "RK+\u001e\u007fz\u000eJ+\u000b\u0001p\u0016g>\u001f}`m@0X=+]Q2\t0\u0011";
        objectArray[106] = "\u0017u\u0018I\u0000T\u00184\n\u001e}O\u001fu\u0000\u001f\u0011}L2^HE*\neQ\u001d\u0006\u0016\u000eu\u001d\n}";
        objectArray[107] = "k}.piu0,5<tE. \u0001!c9R~|.u.i}z)|&R";
        objectArray[108] = "PP^@yqJ\u000b\b=-\u000b\tWUX~7Q\u0015\n[j\u000bBT\u0011\u0006.b]\b\b=";
        objectArray[109] = "\u000e\u0012vJ<\u001cWKs^RM2\u001b$\n7\u001d\u000eCfU4\t2\u0018v\\6CR\u001f%K*s";
        objectArray[110] = "L]a\u000eeaTX \u000b\u001b\"5\u001da\r~p\tE#R}d5A$N*cKNe\\}\u001e";
        objectArray[111] = "Um@Y6u\u0007z\u0019\u0019X4t\u0011\u001d\u0015g=YiO\u0002>}";
        objectArray[112] = "pXk6FxqM)wydlXp#.64\f+\u007fyt4\u0005}q\u001fakWt";
        objectArray[113] = "7\bi\n\u0011Q6\u0016l\taH;\u0013m\u000f\rzlU3XZ-4Vj\u0014\u001eW5\u001f`Pa";
        objectArray[114] = "\u001d\u0004\u001c>[\u0016D]\u0019*5A!\u000b\u00165L\u0007JW\u00175Y";
        objectArray[115] = "Y'?D^$\u001bk<\u0018,reo?\u0013I Y7}LJ4em\u007f\u0018Q$\u0007)>S]N";
        objectArray[116] = "Yly\\\rfL3+U3n@/\u0004\\X`'*#SMrB1*UI\u0000\u001c,yHYbXm2D3";
        objectArray[117] = "\u0001)$DRH\t}5\u0017\"\u001d\u0014 !KI\ns}|HO\u001dH~zOF\u0015s{\"DM\f\u000e6y[\u001bv";
        objectArray[118] = "r,>\u0014 i ;gTN(KP`C*s`,a]/p";
        objectArray[119] = "|5C=\\v#lTz;\"\u007f9QS\u0007v)m)4Y9!5\u00168Pxq\\";
        objectArray[120] = "S,+41|Re!pNc\\i,/\"Q\r)}uN<Zx(x.;\to4H";
        objectArray[121] = "`W!>n.m\u00103#\u0017u]\u0014xcr+aL:<q?]\u001d#(.,b\u0011*i~E";
        Object[] objectArray2 = objectArray;
        objectArray[122] = "\u0012m\u0013\u0016.4P!\u0010J\\oo\u001c\u0013Cg;@ K\u000188T\u001c\u0011\u0003l#D~UB'/.";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/83" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _83.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = _83.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _83.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _83.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _83.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _83.f(780151766707513L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _83.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _83.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _83.f(780151766707513L, 0L);
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
            int n = _83.e(l2, l3);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                _83.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/83" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _83.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _83.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int d(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x36EF;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = l[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])_83.n.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    _83.n.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/83", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _83.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _83.d(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _83.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _83.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/83" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _83.e(l2, l3);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = _83.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _83.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _83.c(clazz3, string2, clazz2)) != null) {
                    _83.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _83.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _83.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _83.f(780151766707513L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void cfr_renamed_4(Object[] objectArray) {
        block15: {
            reference v3;
            reference v2;
            reference var5_4;
            long l2;
            block13: {
                reference v0;
                boolean bl;
                block11: {
                    block12: {
                        l2 = (Long)objectArray[0];
                        l2 = b ^ l2;
                        bl = _02.cfr_renamed_2();
                        try {
                            v0 = _83.f("\u00a3", (Object)this, -1683847971831038889L, (long)l2);
                            if (bl) break block11;
                            if (v0 >= 0) break block12;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                        return;
                    }
                    v0 = _83.f("\u00a3", (Object)this, -1683847971831038889L, (long)l2) / _83.d("h", 19684, (long)(0x3DA70AB6604D12A6L ^ l2));
                }
                var5_4 = v0;
                try {
                    block14: {
                        try {
                            try {
                                reference v3 = var5_4;
                                v3 = _83.f("\u00a3", (Object)this, -1682954790141295854L, (long)l2);
                                if (l2 <= 0L || bl) break block13;
                                if (v2 >= v3) break block14;
                            }
                            catch (MatchException matchException) {
                                throw _83.a(matchException);
                            }
                            _83.f("\u00ca", (Object)this, (int)var5_4, -1682954790141295854L, (long)l2);
                            if (!bl) break block15;
                        }
                        catch (MatchException matchException) {
                            throw _83.a(matchException);
                        }
                    }
                    reference v3 = var5_4;
                    v3 = _83.f("\u00a3", (Object)this, -1682954790141295854L, (long)l2) + _83.d("h", 26044, (long)(0x2270FE591724BBC6L ^ l2));
                }
                catch (MatchException matchException) {
                    throw _83.a(matchException);
                }
            }
            try {
                if (v2 >= v3) {
                    _83.f("\u00ca", (Object)this, (int)(var5_4 - _83.d("h", 26044, (long)(0x2270FE591724BBC6L ^ l2)) + true), -1682954790141295854L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw _83.a(matchException);
            }
        }
    }

    @Override
    protected int int_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (int)_83.d("h", 26326, (long)(0x6E13F3F9BDBFAC01L ^ l2));
    }

    private void cfr_renamed_6(long l2, class_1792 class_17922) {
        l2 = b ^ l2;
        try {
            if (class_17922 != _83.f("\u00df", -1998005782205979421L, (long)l2)) {
                _83.f("B", (Object)_83.f("\u00a3", (Object)this, -1992430458789408613L, (long)l2), (Object)class_17922, -1999515563253474711L, (long)l2);
            }
        }
        catch (MatchException matchException) {
            throw _83.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_7(long var1_1) {
        block22: {
            block19: {
                block20: {
                    block16: {
                        v0 = var1_1 = _83.b ^ var1_1;
                        var3_2 = v0 ^ 39929598623625L;
                        var5_3 = v0 ^ 86332431822151L;
                        var7_4 = v0 ^ 97577157733999L;
                        var9_5 = _02.cfr_renamed_3();
                        try {
                            block17: {
                                block18: {
                                    try {
                                        try {
                                            v1 = new Object[1];
                                            v1[0] = var3_2;
                                            v2 = _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-8068351635792433096L, (long)var1_1), (Object)v1, (long)-8068792474463947304L, (long)var1_1);
                                            if (var9_5 == 0) break block16;
                                            v3 = -8068985854015347055L;
                                            v4 = var1_1;
                                            if (var1_1 <= 0L) break block17;
                                            if (_83.f("B", (Object)v2, (long)v3, (long)v4) == false) break block18;
                                        }
                                        catch (MatchException v5) {
                                            throw _83.a(v5);
                                        }
                                        _83.f("\u00ca", (Object)this, new ArrayList<E>(_83.f("\u00a3", (Object)this, (long)-8061982628270693156L, (long)var1_1)), (long)-8066623227810729625L, (long)var1_1);
                                        if (var1_1 <= 0L) break block19;
                                        if (var9_5 != 0) break block20;
                                    }
                                    catch (MatchException v6) {
                                        throw _83.a(v6);
                                    }
                                }
                                v7 = new Object[1];
                                v7[0] = var3_2;
                                v8 = _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-8068351635792433096L, (long)var1_1), (Object)v7, (long)-8068792474463947304L, (long)var1_1);
                                v3 = -8069279714453693056L;
                                v4 = var1_1;
                            }
                            v2 = _83.f("B", (Object)v8, (long)v3, (long)v4);
                        }
                        catch (MatchException v9) {
                            throw _83.a(v9);
                        }
                    }
                    var10_6 = v2;
                    _83.f("\u00ca", (Object)this, (List)((List)_83.f("B", (Object)_83.f("B", (Object)_83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-8061982628270693156L, (long)var1_1), (long)-8067700046962705619L, (long)var1_1), (Predicate<class_1792>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, 5(java.lang.String long net.minecraft.class_1792 ), (Lnet/minecraft/class_1792;)Z)((String)var10_6, (long)var5_3), (long)-8069114576538021546L, (long)var1_1), (Object)_83.f("\u00c8", (long)-8067106067552145169L, (long)var1_1), (long)-8066982843119088742L, (long)var1_1)), (long)-8066623227810729625L, (long)var1_1);
                }
                _83.f("\u00ca", (Object)this, (int)_83.d("h", (int)8547, (long)(8459630267457079173L ^ var1_1)), (long)-8068550122550297680L, (long)var1_1);
                _83.f("\u00ca", (Object)this, (int)_83.d("h", (int)21980, (long)(6930951141621232447L ^ var1_1)), (long)-8069336926628494091L, (long)var1_1);
            }
            v10 = new Object[1];
            v10[0] = var7_4;
            var10_6 = _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-8069091618158636391L, (long)var1_1), (Object)v10, (long)-8067434947415093714L, (long)var1_1);
            if (var10_6 == null) break block22;
            var11_7 = 0;
            block12: while (var11_7 < _83.f("B", (Object)_83.f("\u00a3", (Object)this, (long)-8066623227810729625L, (long)var1_1), (long)-8067993708205553168L, (long)var1_1)) {
                block21: {
                    try {
                        try {
                            v11 = this;
                            v12 = var9_5;
                            if (var1_1 <= 0L) ** GOTO lbl72
                            if (v12 == 0) break block21;
                            if (_83.f("B", (Object)_83.f("\u00a3", (Object)v11, (long)-8066623227810729625L, (long)var1_1), (int)var11_7, (long)-8061833681541024893L, (long)var1_1) == var10_6) {
                            }
                            ** GOTO lbl78
                        }
                        catch (MatchException v13) {
                            throw _83.a(v13);
                        }
                        v11 = this;
                    }
                    catch (MatchException v14) {
                        throw _83.a(v14);
                    }
                }
                try {
                    v12 = var11_7;
lbl72:
                    // 2 sources

                    _83.f("\u00ca", (Object)v11, (int)v12, (long)-8069336926628494091L, (long)var1_1);
                    do {
                        block23: {
                            v15 = var9_5;
                            if (var1_1 > 0L) {
                                if (v15 != 0) break block12;
                            }
                            break block23;
lbl78:
                            // 2 sources

                            ++var11_7;
                            v15 = var9_5;
                        }
                        if (v15 != 0) continue block12;
                    } while (var1_1 < 0L);
                    break;
                }
                catch (MatchException v16) {
                    throw _83.a(v16);
                }
            }
        }
    }

    private static boolean cfr_renamed_8(String string, long l2, class_1792 class_17922) {
        l2 = b ^ l2;
        return (boolean)_83.f("B", (Object)_83.f("B", (Object)_83.f("B", (Object)_83.f("B", (Object)class_17922, -3898817146029220060L, (long)l2), -3898983518958291400L, (long)l2), -3896956583456635793L, (long)l2), (Object)string, -3897458099684186253L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void cfr_renamed_9(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [31[DOLOOP], 30[FORLOOP]], but top level block is 14[TRYBLOCK]
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_83.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_83.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_83.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

