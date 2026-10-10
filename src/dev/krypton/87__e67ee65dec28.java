/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_332
 */
package dev.krypton;

import dev.krypton._0E;
import dev.krypton._3f_0;
import dev.krypton._8B;
import dev.krypton._9G;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_332;

public class _87 {
    public static final _87 cfr_renamed_9;
    private final Deque cfr_renamed_2;
    private final List cfr_renamed_8;
    private final Deque cfr_renamed_0;
    private class_332 cfr_renamed_4;
    private double cfr_renamed_1;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_6;
    private _0E cfr_renamed_7;
    private static int cfr_renamed_5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    public static int cfr_renamed_5() {
        return cfr_renamed_5;
    }

    public void cfr_renamed_5(Object[] objectArray) {
        block14: {
            long l2;
            long l3;
            long l4;
            long l5;
            block15: {
                _87 v9;
                long l6;
                block12: {
                    Object object;
                    int n;
                    long l7;
                    block10: {
                        long l8;
                        long l9;
                        block11: {
                            l5 = (Long)objectArray[0];
                            long l10 = l5 = a ^ l5;
                            l6 = l10 ^ 0x3A569626C36L;
                            l7 = l10 ^ 0x2836E2787DE6L;
                            l4 = l10 ^ 0x189E0D8469A4L;
                            l9 = l10 ^ 0x73AAD6C7B884L;
                            l8 = l10 ^ 0x69C88EA83BC7L;
                            l3 = l10 ^ 0x623CE82FB6DDL;
                            l2 = l10 ^ 0x718B7FC4DBD2L;
                            n = _87.cfr_renamed_5();
                            try {
                                object = _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -3563179233356280715L, (long)l5), -3550457027031918308L, (long)l5);
                                if (n != 0) break block10;
                                if (object == false) break block11;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _87.a(illegalStateException);
                            }
                            return;
                        }
                        try {
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l8;
                            _87.c("\u00e8", (Object)_87.c("K", -3565627694366405807L, (long)l5), (Object)objectArray2, -3549812933647771618L, (long)l5);
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l2;
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l9;
                            _87.c("\u00e8", (Object)_87.c("D", (Object)objectArray3, -3566094012898117037L, (long)l5), (Object)objectArray4, -3550002689192797680L, (long)l5);
                            CallSite callSite = _87.c("\u00c4", (Object)this, -3563179233356280715L, (long)l5);
                            long l11 = -3566518195007800618L;
                            long l12 = l5;
                            if (l5 >= 0L) {
                                _87.c("\u00e8", (Object)callSite, (long)l11, (long)l12);
                                v9 = this;
                                if (n != 0) break block12;
                                callSite = _87.c("\u00c4", (Object)v9, -3563179233356280715L, (long)l5);
                                l11 = -3550457027031918308L;
                                l12 = l5;
                            }
                            object = _87.c("\u00e8", (Object)callSite, (long)l11, (long)l12);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _87.a(illegalStateException);
                        }
                    }
                    try {
                        block13: {
                            try {
                                if (l5 >= 0L) {
                                    if (object == false) break block13;
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l7;
                                    _87.c("\u00e8", (Object)this, (Object)objectArray5, -3551016676391031657L, (long)l5);
                                    if (l5 <= 0L) break block14;
                                    object = n;
                                }
                                if (object == false) break block15;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _87.a(illegalStateException);
                            }
                        }
                        v9 = this;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                }
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = (_3f_0)((Object)_87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -3563179233356280715L, (long)l5), -3549464254227869457L, (long)l5));
                objectArray6[0] = l6;
                _87.c("\u00e8", (Object)v9, (Object)objectArray6, -3566720875639111550L, (long)l5);
            }
            Object[] objectArray7 = new Object[1];
            objectArray7[0] = l2;
            Object[] objectArray8 = new Object[1];
            objectArray8[0] = l4;
            _87.c("\u00e8", (Object)_87.c("D", (Object)objectArray7, -3566094012898117037L, (long)l5), (Object)objectArray8, -3565244664595705356L, (long)l5);
            Object[] objectArray9 = new Object[1];
            objectArray9[0] = l3;
            _87.c("\u00e8", (Object)_87.c("K", -3565627694366405807L, (long)l5), (Object)objectArray9, -3565758326805069167L, (long)l5);
        }
    }

    public void cfr_renamed_371(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        _8B b = (_8B)objectArray[5];
        _8B b2 = (_8B)objectArray[6];
        _8B b3 = (_8B)objectArray[7];
        _8B b4 = (_8B)objectArray[8];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x323CAE9A81D9L;
        long l5 = l3 ^ 0xF20D2A84155L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = b2;
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = b3;
        objectArray4[0] = l5;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = b4;
        objectArray5[0] = l5;
        Object[] objectArray6 = new Object[9];
        objectArray6[8] = _87.c("\u00e8", (Object)this, (Object)objectArray5, -303570815172984608L, (long)l2);
        objectArray6[7] = _87.c("\u00e8", (Object)this, (Object)objectArray4, -303570815172984608L, (long)l2);
        objectArray6[6] = _87.c("\u00e8", (Object)this, (Object)objectArray3, -303570815172984608L, (long)l2);
        objectArray6[5] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -303570815172984608L, (long)l2);
        objectArray6[4] = d4;
        objectArray6[3] = l4;
        objectArray6[2] = d3;
        objectArray6[1] = d2;
        objectArray6[0] = d;
        _87.c("\u00e8", (Object)_87.c("K", -292365936358785500L, (long)l2), (Object)objectArray6, -291391781579371822L, (long)l2);
    }

    public void cfr_renamed_284(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        double d5 = (Double)objectArray[5];
        double d6 = (Double)objectArray[6];
        double d7 = (Double)objectArray[7];
        long l2 = (Long)objectArray[8];
        double d8 = (Double)objectArray[9];
        double d9 = (Double)objectArray[10];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x755C1BD2AC5FL;
        long l5 = l3 ^ 0x39B84CBD1578L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[11];
        objectArray3[10] = d9;
        objectArray3[9] = d8;
        objectArray3[8] = d7;
        objectArray3[7] = d6;
        objectArray3[6] = d5;
        objectArray3[5] = d4;
        objectArray3[4] = d3;
        objectArray3[3] = l4;
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -5772408097743760179L, (long)l2);
        _87.c("D", (Object)objectArray3, -5773185837246533920L, (long)l2);
    }

    public void cfr_renamed_270(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x61BBD1C927F3L;
        _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, 6217222211765505572L, (long)l2), (Object)_87.c("D", (double)_87.c("\u00c4", (Object)this, 6216491102618867279L, (long)l2), 6216426980278934664L, (long)l2), 6219139158585243708L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = (double)(_87.c("\u00c4", (Object)this, 6216491102618867279L, (long)l2) * d);
        _87.c("\u00e8", (Object)this, (Object)objectArray2, 6230382192588496952L, (long)l2);
    }

    public void cfr_renamed_226(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        double d3 = (Double)objectArray[4];
        double d4 = (Double)objectArray[5];
        double d5 = (Double)objectArray[6];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x174A4BF93FE8L;
        long l5 = l3 ^ 0x556C3A3F316L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 32);
        int n4 = (int)(l5 << 48 >>> 48);
        long l6 = l3 ^ 0x15A941160453L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _8B(n, (short)n2, n3, (short)n4);
        objectArray2[0] = l6;
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = d5;
        objectArray3[5] = d4;
        objectArray3[4] = d3;
        objectArray3[3] = d2;
        objectArray3[2] = l4;
        objectArray3[1] = d;
        objectArray3[0] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -4697424311012686362L, (long)l2);
        _87.c("D", (Object)objectArray3, -4687021433187211987L, (long)l2);
    }

    public void cfr_renamed_303(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        int n3 = (Integer)objectArray[4];
        float f = ((Float)objectArray[5]).floatValue();
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x2A58E7B0ABBCL;
        int n4 = (int)(l4 >>> 32);
        int n5 = (int)(l4 << 32 >>> 48);
        int n6 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x2585556EB12FL;
        CallSite callSite = _87.c("\u00c4", (Object)this, -149888705022283681L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = () -> _87.cfr_renamed_2(n4, (class_332)callSite, class_17992, n, (char)n5, n2, n3, f, (short)n6);
        _87.c("\u00e8", (Object)this, (Object)objectArray2, -155640497713556687L, (long)l2);
    }

    public static void cfr_renamed_327(Object[] objectArray) {
        int n;
        long l2;
        float f;
        int n2;
        long l3;
        int n3;
        int n4;
        class_1799 class_17992;
        class_332 class_3322;
        block6: {
            block7: {
                block5: {
                    class_1799 class_17993;
                    int n5;
                    block4: {
                        class_3322 = (class_332)objectArray[0];
                        class_17992 = (class_1799)objectArray[1];
                        n4 = (Integer)objectArray[2];
                        n3 = (Integer)objectArray[3];
                        l3 = (Long)objectArray[4];
                        n2 = (Integer)objectArray[5];
                        f = ((Float)objectArray[6]).floatValue();
                        l2 = (l3 = a ^ l3) ^ 0x75C3F5553CA0L;
                        n5 = _87.cfr_renamed_7();
                        try {
                            class_17993 = class_17992;
                            if (n5 == 0) break block4;
                            if (class_17993 == null) break block5;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _87.a(illegalStateException);
                        }
                        class_17993 = class_17992;
                    }
                    try {
                        n = _87.c("\u00e8", (Object)class_17993, 352627344600621009L, (long)l3);
                        if (n5 == 0) break block6;
                        if (n == false) break block7;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                }
                return;
            }
            n = (int)(16.0f * f);
        }
        CallSite callSite = n;
        int n6 = (n2 - callSite) / 2;
        int n7 = (n2 - callSite) / 2;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = true;
        objectArray2[4] = Float.valueOf(f);
        objectArray2[3] = n3 + n7;
        objectArray2[2] = n4 + n6;
        objectArray2[1] = class_17992;
        objectArray2[0] = class_3322;
        _87.c("D", (Object)objectArray2, 354763310196203242L, (long)l3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void cfr_renamed_118(Object[] objectArray) {
        int n;
        CallSite callSite;
        long l2;
        float f;
        int n2;
        class_1799 class_17992;
        class_332 class_3322;
        block10: {
            int n3;
            block11: {
                class_1799 class_17993;
                int n4;
                int n5;
                block9: {
                    class_3322 = (class_332)objectArray[0];
                    class_17992 = (class_1799)objectArray[1];
                    n3 = (Integer)objectArray[2];
                    n2 = (Integer)objectArray[3];
                    f = ((Float)objectArray[4]).floatValue();
                    n5 = ((Boolean)objectArray[5]).booleanValue();
                    l2 = (Long)objectArray[6];
                    l2 = a ^ l2;
                    n4 = _87.cfr_renamed_7();
                    try {
                        class_17993 = class_17992;
                        if (n4 == 0) break block9;
                        if (class_17993 == null) return;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    class_17993 = class_17992;
                }
                try {
                    if (_87.c("\u00e8", (Object)class_17993, -4757571957426034996L, (long)l2) != false) {
                        return;
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
                callSite = _87.c("\u00e8", (Object)class_3322, -4771395916719669840L, (long)l2);
                try {
                    try {
                        _87.c("\u00e8", (Object)callSite, -4758095110423504037L, (long)l2);
                        n = n5;
                        if (n4 == 0) break block10;
                        if (n == 0) break block11;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    _87.c("\u00e8", (Object)callSite, (float)(1.0f / (float)_87.c("\u00e8", (Object)_87.c("\u00e8", (Object)_87.c("K", -4771142116440990725L, (long)l2), -4769663302514566067L, (long)l2), -4770993040470350040L, (long)l2)), -4756550730400179497L, (long)l2);
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            _87.c("\u00e8", (Object)callSite, (float)f, (float)f, -4756196230326464088L, (long)l2);
            n = (int)((float)n3 / f);
        }
        int n6 = n;
        int n7 = (int)((float)n2 / f);
        _87.c("\u00e8", (Object)class_3322, (Object)class_17992, (int)n6, (int)n7, -4758560624144243260L, (long)l2);
        _87.c("\u00e8", (Object)callSite, -4757780633723048867L, (long)l2);
    }

    public void cfr_renamed_394(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        int n = (Integer)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x43E422B38661L;
        long l5 = l3 ^ 0x9F3091AB159L;
        long l6 = l3 ^ 0x49FDFBF5A489L;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 32);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l3 ^ 0x5902794053CCL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _8B(n, (short)n2, n3, (short)n4);
        objectArray2[0] = l7;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[6];
        objectArray4[5] = (int)_87.c("\u00e8", (Object)_87.c("\u00e8", (Object)this, (Object)objectArray2, -1634760686597287303L, (long)l2), (Object)objectArray3, -1633264111044091070L, (long)l2);
        objectArray4[4] = l4;
        objectArray4[3] = d4;
        objectArray4[2] = d3;
        objectArray4[1] = d2;
        objectArray4[0] = d;
        _87.c("D", (Object)objectArray4, -1628648648742646850L, (long)l2);
    }

    public static void cfr_renamed_140(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_332 class_3322 = (class_332)objectArray[1];
        class_1799 class_17992 = (class_1799)objectArray[2];
        int n = (Integer)objectArray[3];
        int n2 = (Integer)objectArray[4];
        long l3 = (l2 = a ^ l2) ^ 0x47363158990AL;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l3;
        objectArray2[5] = true;
        objectArray2[4] = Float.valueOf(1.0f);
        objectArray2[3] = n2;
        objectArray2[2] = n;
        objectArray2[1] = class_17992;
        objectArray2[0] = class_3322;
        _87.c("D", (Object)objectArray2, -6825647599201305792L, (long)l2);
    }

    public void cfr_renamed_160(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        double d = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d2 = (Double)objectArray[3];
        double d3 = (Double)objectArray[4];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x49F3AB5FD01DL;
        long l5 = l3 ^ 0x213631C4621AL;
        long l6 = l3 ^ 0x6138C32B77CAL;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 32);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l3 ^ 0x71C7419E808FL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _8B(n, (short)n2, n3, (short)n4);
        objectArray2[0] = l7;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = d3;
        objectArray4[3] = d2;
        objectArray4[2] = d;
        objectArray4[1] = (int)_87.c("\u00e8", (Object)_87.c("\u00e8", (Object)this, (Object)objectArray2, 4184689664810451258L, (long)l2), (Object)objectArray3, 4185623291207905281L, (long)l2);
        objectArray4[0] = l4;
        _87.c("D", (Object)objectArray4, 4185106490287635860L, (long)l2);
    }

    public void cfr_renamed_356(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        double d5 = (Double)objectArray[4];
        double d6 = (Double)objectArray[5];
        long l2 = (Long)objectArray[6];
        _8B b = (_8B)objectArray[7];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x3C0219BA5F3FL;
        long l5 = l3 ^ 0x3AF337D52F62L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[8];
        objectArray3[7] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -1899590155167965558L, (long)l2);
        objectArray3[6] = d6;
        objectArray3[5] = d5;
        objectArray3[4] = d4;
        objectArray3[3] = d3;
        objectArray3[2] = l5;
        objectArray3[1] = d2;
        objectArray3[0] = d;
        _87.c("\u00e8", (Object)_87.c("K", -1901788325543747506L, (long)l2), (Object)objectArray3, -1901574251066197110L, (long)l2);
    }

    public void cfr_renamed_107(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x5B37F59B1A9DL;
        long l5 = l3 ^ 0x171FB5233F16L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l4;
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = d3;
        objectArray3[3] = d2;
        objectArray3[2] = d;
        objectArray3[1] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -6917199291957961944L, (long)l2);
        objectArray3[0] = l5;
        _87.c("D", (Object)objectArray3, -6916564458036485521L, (long)l2);
    }

    public void cfr_renamed_97(Object[] objectArray) {
        _87 v1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        block4: {
            _87 v6;
            long l7;
            long l8;
            block5: {
                class_332 class_3322;
                block6: {
                    class_3322 = (class_332)objectArray[0];
                    l6 = (Long)objectArray[1];
                    long l9 = l6 = a ^ l6;
                    l5 = l9 ^ 0x7DF894BA0E27L;
                    l4 = l9 ^ 0x455BA0782FB9L;
                    l3 = l9 ^ 0x75A7111D15EL;
                    l2 = l9 ^ 0x14EDE6FABC51L;
                    int n = _87.cfr_renamed_5();
                    try {
                        try {
                            v1 = this;
                            if (n != 0) break block4;
                            l8 = -6265460563076654837L;
                            l7 = l6;
                            if (l6 < 0L) break block5;
                            if (_87.c("\u00c4", (Object)v1, (long)l8, (long)l7) == false) break block6;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _87.a(illegalStateException);
                        }
                        throw new IllegalStateException((String)((Object)_87.a("b", 22209, (long)(0x310FA19597EC4189L ^ l6))));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                }
                _87.c("l", (Object)this, (class_332)class_3322, -6252643977792658290L, (long)l6);
                _87.c("l", (Object)this, (boolean)_87.b("w", 22185, (long)(0x7ED9E7D1510F2B62L ^ l6)), -6265460563076654837L, (long)l6);
                _87.c("l", (Object)this, 1.0, -6266636826945869566L, (long)l6);
                _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -6267598822662704791L, (long)l6), -6268423002529461681L, (long)l6);
                v6 = this;
                l8 = -6264948830903571466L;
                l7 = l6;
            }
            _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)v6, (long)l8, (long)l7), -6268423002529461681L, (long)l6);
            _87.c("l", (Object)this, (boolean)_87.b("w", 19984, (long)(0x680C3BF708A2B3D9L ^ l6)), -6265161666772966468L, (long)l6);
            v1 = this;
        }
        _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)v1, -6267646875931475084L, (long)l6), -6253238371674993078L, (long)l6);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        _87.c("D", (Object)objectArray2, -6252787231228354379L, (long)l6);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l5;
        _87.c("\u00e8", (Object)_87.c("D", (Object)objectArray3, -6268494987853226544L, (long)l6), (Object)objectArray4, -6267091228532869513L, (long)l6);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l3;
        _87.c("\u00e8", (Object)_87.c("K", -6266972296351535918L, (long)l6), (Object)objectArray5, -6268864621292362478L, (long)l6);
    }

    public void cfr_renamed_62(Object[] objectArray) {
        block4: {
            CallSite callSite;
            long l2;
            double d;
            double d2;
            long l3;
            double d3;
            double d4;
            block5: {
                d4 = (Double)objectArray[0];
                d3 = (Double)objectArray[1];
                l3 = (Long)objectArray[2];
                d2 = (Double)objectArray[3];
                d = (Double)objectArray[4];
                _8B b = (_8B)objectArray[5];
                long l4 = l3 = a ^ l3;
                l2 = l4 ^ 0x5A9B9964BF96L;
                long l5 = l4 ^ 0x22B9FC05AA9FL;
                int n = _87.cfr_renamed_7();
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = b;
                objectArray2[0] = l5;
                callSite = _87.c("\u00e8", (Object)this, (Object)objectArray2, 1153856547371985706L, (long)l3);
                try {
                    try {
                        if (n == 0) break block4;
                        if (_87.c("\u00c4", (Object)callSite, 1153788736183407464L, (long)l3) != false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            Object[] objectArray3 = new Object[6];
            objectArray3[5] = callSite;
            objectArray3[4] = l2;
            objectArray3[3] = d;
            objectArray3[2] = d2;
            objectArray3[1] = d3;
            objectArray3[0] = d4;
            _87.c("\u00e8", (Object)_87.c("K", 1169637534305949166L, (long)l3), (Object)objectArray3, 1170545261681012438L, (long)l3);
        }
    }

    public void cfr_renamed_109(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x606F5652C6C9L;
        long l5 = l3 ^ 0x16C389D178DDL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -4449162733966231192L, (long)l2);
        objectArray3[4] = l4;
        objectArray3[3] = d4;
        objectArray3[2] = d3;
        objectArray3[1] = d2;
        objectArray3[0] = d;
        _87.c("D", (Object)objectArray3, -4435152512024030898L, (long)l2);
    }

    public void cfr_renamed_175(Object[] objectArray) {
        Runnable runnable = (Runnable)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -3942992448852270281L, (long)l2), (Object)runnable, -3943793069626183301L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    public void cfr_renamed_395(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    public void cfr_renamed_396(Object[] objectArray) {
        _87 v0;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                l2 = (l3 = a ^ l3) ^ 0x5C387486F1C4L;
                int n = _87.cfr_renamed_7();
                try {
                    try {
                        v0 = this;
                        if (n == 0) break block4;
                        if (_87.c("\u00e8", (Object)_87.c("\u00c4", (Object)v0, -9187555261286688749L, (long)l3), -9204407133553862683L, (long)l3) == false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = 1.0;
                    _87.c("\u00e8", (Object)this, (Object)objectArray2, -9204796768340412913L, (long)l3);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            v0 = this;
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = (double)_87.c("\u00e8", (Object)((Double)((Object)_87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -9187555261286688749L, (long)l3), -9189471041651608529L, (long)l3))), -9189877810061441037L, (long)l3);
        _87.c("\u00e8", (Object)v0, (Object)objectArray3, -9204796768340412913L, (long)l3);
    }

    public void cfr_renamed_397(Object[] objectArray) {
        _3f_0 f_0;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        block2: {
            long l7;
            long l8;
            block3: {
                double d = (Double)objectArray[0];
                double d2 = (Double)objectArray[1];
                double d3 = (Double)objectArray[2];
                double d4 = (Double)objectArray[3];
                l6 = (Long)objectArray[4];
                long l9 = l6 = a ^ l6;
                l5 = l9 ^ 0x5A8655BF7733L;
                l4 = l9 ^ 0x41BD315972A1L;
                l8 = l9 ^ 0x2A89EA1AA381L;
                l7 = l9 ^ 0x30EBB27520C2L;
                l3 = l9 ^ 0x3B1FD4F2ADD8L;
                l2 = l9 ^ 0x28A84319C0D7L;
                object4 = d;
                object3 = d2;
                object2 = d3;
                int n = _87.cfr_renamed_5();
                object = d4;
                try {
                    if (n != 0) break block2;
                    if (_87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -3060105243126851728L, (long)l6), -3044601547114413543L, (long)l6) != false) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
                f_0 = (_3f_0)((Object)_87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -3060105243126851728L, (long)l6), -3046513408497153046L, (long)l6));
                reference var34_19 = _87.c("\u00c4", (Object)f_0, -3060842767476042208L, (long)l6) + _87.c("\u00c4", (Object)f_0, -3046620805364667909L, (long)l6);
                reference var36_20 = _87.c("\u00c4", (Object)f_0, -3059899422287481636L, (long)l6) + _87.c("\u00c4", (Object)f_0, -3059835225290957035L, (long)l6);
                Object object5 = object4 + object2;
                Object object6 = object3 + object;
                object4 = _87.c("D", (double)object4, (double)_87.c("\u00c4", (Object)f_0, -3060842767476042208L, (long)l6), -3059965293255698126L, (long)l6);
                object3 = _87.c("D", (double)object3, (double)_87.c("\u00c4", (Object)f_0, -3059899422287481636L, (long)l6), -3059965293255698126L, (long)l6);
                object5 = _87.c("D", (double)object5, (double)var34_19, -3061811964781234616L, (long)l6);
                object6 = _87.c("D", (double)object6, (double)var36_20, -3061811964781234616L, (long)l6);
                object2 = _87.c("D", 0.0, (double)(object5 - object4), -3059965293255698126L, (long)l6);
                object = _87.c("D", 0.0, (double)(object6 - object3), -3059965293255698126L, (long)l6);
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l7;
            _87.c("\u00e8", (Object)_87.c("K", -3062164468300263340L, (long)l6), (Object)objectArray2, -3046158675354107109L, (long)l6);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l8;
            _87.c("\u00e8", (Object)_87.c("D", (Object)objectArray3, -3060220958115471018L, (long)l6), (Object)objectArray4, -3044852812423479019L, (long)l6);
        }
        f_0 = new _3f_0((double)object4, (double)object3, (double)object2, (double)object);
        _87.c("\u00e8", (Object)_87.c("\u00c4", (Object)this, -3060105243126851728L, (long)l6), (Object)f_0, -3060784312880628745L, (long)l6);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = f_0;
        objectArray5[0] = l5;
        _87.c("\u00e8", (Object)this, (Object)objectArray5, -3060988273937441913L, (long)l6);
        Object[] objectArray6 = new Object[1];
        objectArray6[0] = l2;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l4;
        _87.c("\u00e8", (Object)_87.c("D", (Object)objectArray6, -3060220958115471018L, (long)l6), (Object)objectArray7, -3062186068050212111L, (long)l6);
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l3;
        _87.c("\u00e8", (Object)_87.c("K", -3062164468300263340L, (long)l6), (Object)objectArray8, -3060555956942693996L, (long)l6);
    }

    public void cfr_renamed_398(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        long l2 = (Long)objectArray[5];
        double d5 = (Double)objectArray[6];
        double d6 = (Double)objectArray[7];
        double d7 = (Double)objectArray[8];
        double d8 = (Double)objectArray[9];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0xD06B75946D5L;
        long l5 = l3 ^ 0x2E4EC5B6E34DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[10];
        objectArray3[9] = d8;
        objectArray3[8] = d7;
        objectArray3[7] = d6;
        objectArray3[6] = d5;
        objectArray3[5] = l4;
        objectArray3[4] = d4;
        objectArray3[3] = d3;
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = _87.c("\u00e8", (Object)this, (Object)objectArray2, 6472058170636165880L, (long)l2);
        _87.c("D", (Object)objectArray3, 6479526754976212242L, (long)l2);
    }

    public _87(long l2) {
        l2 = a ^ l2;
        this.cfr_renamed_2 = new ArrayDeque();
        this.cfr_renamed_8 = new ArrayList();
        this.cfr_renamed_0 = new ArrayDeque();
        _87.c("l", (Object)this, 1.0, -8809317920021772875L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _87.a = l.a(5534874409950193995L, 8796606830281248017L, MethodHandles.lookup().lookupClass()).a(208829362126499L);
                        var20 = _87.a ^ 10826203209003L;
                        var22_1 = var20 ^ 125046924941447L;
                        _87.h = new Object[157];
                        _87.i = new String[157];
                        _87.a();
                        _87.d = new HashMap<K, V>(13);
                        _87.cfr_renamed_6(0);
                        var11_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_3 = 1; var12_3 < 8; ++var12_3) {
                            v2 = v2;
                            v2[var12_3] = (byte)(var20 << var12_3 * 8 >>> 56);
                        }
                        var11_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_4 = new String[4];
                        var16_5 = 0;
                        var15_6 = "\u0004\u00a1\u00a0\\\u00bc\u001d \u00de\u001a\u00b3\u0090W~H\u00ad>\u0010\u008f\u00a7\u0018\u00e1Q\u00a9\u0012M\u00dc0\u00d8_\u0092Q\u00ea\u0083";
                        var17_7 = "\u0004\u00a1\u00a0\\\u00bc\u001d \u00de\u001a\u00b3\u0090W~H\u00ad>\u0010\u008f\u00a7\u0018\u00e1Q\u00a9\u0012M\u00dc0\u00d8_\u0092Q\u00ea\u0083".length();
                        var14_8 = 16;
                        var13_9 = -1;
lbl26:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_9;
                            v4 = var15_6.substring(v3, v3 + var14_8);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _87.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            var15_6 = "z\u00f2\u0005\u0003,\u0089\u0016\u00ce\u00f6z\u00ad\u00a4\u00b4\u00bf\u008c\"\u00ccM\u00d60\u0011\u009eI1\u00cd~>\u0093]f\u00f3\u0011\u00a2\u00fe\u00ad\u00d1A\u0001z\"d\u007f\f\u009e\u00ee\u00a8\u00a4\r\u008c\u0090\u00fe\u00fc\u001a\u0002\u00b4\u00d4\u00f0\u00cb>1\u0013F\u00feH\f|\u00fa\u00f4\u0095\u00d2M\u008dH\u001d\u00eb\u00fa\u00f9\u0096\u008b\u00b0/\u00f0h9k\u00e05\u00829\u00e8\u00bd_\r\u00a2\u00b52\u0015\u008a\u00e6\u00f2v\u001a\u00d2\u00a9e.\u0019]\u0000#Ex\u00f8\u00a4\u0002\u0087Fo\u0019-\u0015M\u009bRbU\u0096W\u0094\u0090\u001d\u00d2>+v\u00a1 \u0084=\u00f7\u00be{)\u0090\u001d";
                            var17_7 = "z\u00f2\u0005\u0003,\u0089\u0016\u00ce\u00f6z\u00ad\u00a4\u00b4\u00bf\u008c\"\u00ccM\u00d60\u0011\u009eI1\u00cd~>\u0093]f\u00f3\u0011\u00a2\u00fe\u00ad\u00d1A\u0001z\"d\u007f\f\u009e\u00ee\u00a8\u00a4\r\u008c\u0090\u00fe\u00fc\u001a\u0002\u00b4\u00d4\u00f0\u00cb>1\u0013F\u00feH\f|\u00fa\u00f4\u0095\u00d2M\u008dH\u001d\u00eb\u00fa\u00f9\u0096\u008b\u00b0/\u00f0h9k\u00e05\u00829\u00e8\u00bd_\r\u00a2\u00b52\u0015\u008a\u00e6\u00f2v\u001a\u00d2\u00a9e.\u0019]\u0000#Ex\u00f8\u00a4\u0002\u0087Fo\u0019-\u0015M\u009bRbU\u0096W\u0094\u0090\u001d\u00d2>+v\u00a1 \u0084=\u00f7\u00be{)\u0090\u001d".length();
                            var14_8 = 72;
                            var13_9 = -1;
lbl40:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_9;
                                v4 = var15_6.substring(v6, v6 + var14_8);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            var18_4[var16_5++] = _87.a(var19_10).intern();
                            if ((var13_9 += var14_8) < var17_7) {
                                var14_8 = var15_6.charAt(var13_9);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_10 = var11_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl57:
                        // 1 sources

                        ** continue;
                    }
                }
                _87.b = var18_4;
                _87.c = new String[4];
                _87.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v9 = v9;
                    v9[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[4];
                var3_14 = 0;
                var4_15 = "\u0004\u00dc\u00c5\u00ef18%\u00ffE\u00f9\u00bd\u0099d\u00ac7?";
                var5_16 = "\u0004\u00dc\u00c5\u00ef18%\u00ffE\u00f9\u00bd\u0099d\u00ac7?".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v10 = var6_13;
                    v11 = var3_14++;
                    v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl84:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "\u00e6\u00f4\u0013\u0017\u00dd\u00c1\u00a5T~2\u00c7\u0006\u00d0!3\u00aa";
                    var5_16 = "\u00e6\u00f4\u0013\u0017\u00dd\u00c1\u00a5T~2\u00c7\u0006\u00d0!3\u00aa".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v10 = var6_13;
                        v11 = var3_14++;
                        v12 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl97:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_17 < var5_16) ** continue;
                    break block21;
                    break;
                }
            }
            var8_19 = v12;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v14 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl110:
                // 1 sources

                ** continue;
            }
        }
        _87.e = var6_13;
        _87.f = new Integer[4];
        _87.cfr_renamed_9 = new _87(var22_1);
    }

    private static void cfr_renamed_1(String string, double d, double d2, long l2, double d3, _8B b) {
        long l3 = (l2 = a ^ l2) ^ 0x464B0A28F913L;
        Object[] objectArray = new Object[6];
        objectArray[5] = b;
        objectArray[4] = d3;
        objectArray[3] = d2;
        objectArray[2] = d;
        objectArray[1] = string;
        objectArray[0] = l3;
        _87.c("D", (Object)objectArray, 9000387120569120577L, (long)l2);
    }

    public void void_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x411571F1EEF4L;
        long l5 = l3 ^ 0x4BAD5A1F9BA4L;
        long l6 = l3 ^ 0x7B1E0A5DE152L;
        _87.c("l", (Object)this, (double)_87.c("D", 0.0, (double)_87.c("D", 1.0, (double)d, -862701513990449203L, (long)l2), -860888529780311881L, (long)l2), -861593864779729919L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = (double)_87.c("\u00c4", (Object)this, -861593864779729919L, (long)l2);
        _87.c("\u00e8", (Object)_87.c("K", -863474975877107247L, (long)l2), (Object)objectArray2, -861786888455781608L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l6;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = (double)_87.c("\u00c4", (Object)this, -861593864779729919L, (long)l2);
        objectArray4[0] = l5;
        _87.c("\u00e8", (Object)_87.c("D", (Object)objectArray3, -863922609285873453L, (long)l2), (Object)objectArray4, -863840100704243427L, (long)l2);
    }

    public double double_9(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        block4: {
            long l4;
            block5: {
                l3 = (Long)objectArray[0];
                long l5 = l3 = a ^ l3;
                l2 = l5 ^ 0x28951ED8D80BL;
                l4 = l5 ^ 0x166715244B85L;
                int n = _87.cfr_renamed_7();
                try {
                    try {
                        callSite = _87.c("\u00c4", (Object)this, 6835225961101190302L, (long)l3);
                        if (n == 0) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    callSite = _87.c("\u00c4", (Object)this, 6835225961101190302L, (long)l3);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            callSite = _87.c("D", (Object)objectArray2, 6833605022265108996L, (long)l3);
        }
        CallSite callSite2 = callSite;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l2;
        return (double)_87.c("\u00e8", (Object)callSite2, (Object)objectArray3, 6834281490454482553L, (long)l3);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _87.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _87.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _87.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/87" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _87.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _87.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x54D3;
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
                throw new RuntimeException("dev/krypton/87", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _87.f[n2] = n3;
        }
        return f[n2];
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _87.a(l2, l3);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                _87.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/87" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l2, long l3) {
        int n = _87.a(l2, l3);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = _87.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _87.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _87.a(clazz3, string2, clazz2)) != null) {
                    _87.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _87.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _87.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _87.b(997844969575368L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _87.a(l2, l3);
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
                clazz3 = _87.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _87.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _87.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _87.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _87.b(997844969575368L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _87.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _87.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _87.b(997844969575368L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/87" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 41;
            case 1 -> 57;
            case 2 -> 60;
            case 3 -> 47;
            case 4 -> 44;
            case 5 -> 9;
            case 6 -> 63;
            case 7 -> 14;
            case 8 -> 49;
            case 9 -> 6;
            case 10 -> 56;
            case 11 -> 31;
            case 12 -> 2;
            case 13 -> 8;
            case 14 -> 40;
            case 15 -> 37;
            case 16 -> 17;
            case 17 -> 11;
            case 18 -> 53;
            case 19 -> 46;
            case 20 -> 51;
            case 21 -> 59;
            case 22 -> 61;
            case 23 -> 52;
            case 24 -> 4;
            case 25 -> 25;
            case 26 -> 22;
            case 27 -> 28;
            case 28 -> 39;
            case 29 -> 7;
            case 30 -> 45;
            case 31 -> 19;
            case 32 -> 55;
            case 33 -> 42;
            case 34 -> 62;
            case 35 -> 32;
            case 36 -> 15;
            case 37 -> 12;
            case 38 -> 54;
            case 39 -> 27;
            case 40 -> 48;
            case 41 -> 43;
            case 42 -> 0;
            case 43 -> 36;
            case 44 -> 33;
            case 45 -> 5;
            case 46 -> 10;
            case 47 -> 58;
            case 48 -> 26;
            case 49 -> 38;
            case 50 -> 21;
            case 51 -> 30;
            case 52 -> 24;
            case 53 -> 35;
            case 54 -> 34;
            case 55 -> 13;
            case 56 -> 20;
            case 57 -> 29;
            case 58 -> 1;
            case 59 -> 16;
            case 60 -> 50;
            case 61 -> 23;
            case 62 -> 3;
            default -> 18;
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
        _87.i[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "}?\u001b@'\b`*\u0019\u0001\"T!\u0018";
        objectArray[1] = "^6Ddg\u0013+\u0016Okv\\J\u0018D`r\u0006>";
        objectArray[2] = Integer.TYPE;
        _87.i[2] = "java/lang/Integer";
        objectArray[3] = "0[MB&y-NO\u0003#%l\t";
        objectArray[4] = "\n3q\u0006\u0007\b\u007f\u0013z\t\u0016G\u001e\u001dq\u0002\u0012\u001dj";
        objectArray[5] = "M\u001d\u0012i#?P\b\u0010(&c\u001a6";
        objectArray[6] = "\u0006-+fLFs\r i]\t\u0012\u0003+bYSf";
        objectArray[7] = Void.TYPE;
        _87.i[7] = "java/lang/Void";
        objectArray[8] = "kq\f:8B\u001eQ\u00075)\r\u007f_\f>-W\u000b";
        objectArray[9] = "K^P(9VUVJgSFPJC";
        objectArray[10] = Boolean.TYPE;
        _87.i[10] = "java/lang/Boolean";
        objectArray[11] = "\u0004$\u001f!I^\u00191\u001d`L\u0002P\u0004";
        objectArray[12] = "\u0007xM\u00172krXF\u0018#$\u0013VM\u0013'~g";
        objectArray[13] = "q\f\u0016'\rl\u0004,\u001d(\u001c#e\"\u0016#\u0018y\u0011";
        objectArray[14] = "Y1/pGfR>>?&hY5:e";
        objectArray[15] = "\u00070g_\u0002&r\u0010lP\u0013i\u0013\u001eg[\u00173g";
        objectArray[16] = "-Q;H\t8Xq0G\u0018w9\u007f;L\u001c-M";
        objectArray[17] = "$Hk\u0007:\nQh`\b+E0fk\u0003/\u001fD";
        objectArray[18] = "pf\u001d6H=\u0005F\u00169YrdH\u001d2](\u0010";
        objectArray[19] = "\u0017>\\GGQb\u001eWHV\u001e\u0003\u0010\\CRDw";
        objectArray[20] = Double.TYPE;
        _87.i[20] = "java/lang/Double";
        objectArray[21] = "MD\u0000u\u001cu8d\u000bz\r:Yj\u0000q\t`-";
        objectArray[22] = "xV'nO\u0003xV02C\fb\u001d0,C\u0019el`s\u0010";
        objectArray[23] = "KKw&[\u0013>k|)J\\_ew\"N\u0006+";
        objectArray[24] = "Y}@+/K,]K$>\u0004MS@/:^9";
        objectArray[25] = "QE;X$H$e0W5\u0007Ek;\\1]1";
        objectArray[26] = "e\u007f\u001c\u000eu4np\rA\u00169{v";
        objectArray[27] = "\fh{J4\u0011\u0011}y\u000b1MQJ";
        objectArray[28] = "[:XN<\u0004[:O\u00120\u000bAqO\f0\u001eF\u0000\u001dPe\\";
        objectArray[29] = "1\\9G|a,I;\u0006y=f_";
        objectArray[30] = "\u0018~g!A}\u0018~p}Mr\u00025pcMg\u0005D >\u001c";
        objectArray[31] = "9xh\n]\u00150vkC\u001e\u00186v\u007fA\u0003\u001etd|WD\u001f7d+vU\u0014>rwwI\t.rh";
        objectArray[32] = "d\u001a\u007f\n\u0015\u0000m\u0014|CV\rk\u0014hAK\u000b)\u0006kW\f\nj\u0006<c\b\u001aC\u0010dM\u001b\n";
        objectArray[33] = "=f\u0000O~U s\u0002\u000e{\tk";
        objectArray[34] = "w-\u000e\u0014?/\u0002\r\u0005\u001b.`c\u0003\u000e\u0010*:\u0017";
        objectArray[35] = "w\u0006e> Aj\u0013g\u007f%\u001d'\b";
        objectArray[36] = "\u0016t\u000f/r!cT\u0004 cn\u0002Z\u000f+g4v";
        objectArray[37] = "T/\\\u0012%vJ'F]GjM:";
        objectArray[38] = "'R;^\u0002}Rr0Q\u001323|;Z\u0017hG";
        objectArray[39] = "+Na\n(\u0003)P(i#\u00186U~\u0017:^\"orE!\u0007";
        objectArray[40] = Float.TYPE;
        _87.i[40] = "java/lang/Float";
        objectArray[41] = "%{5W\u001f1'e|4\u0014*8`*J\rl,";
        objectArray[42] = "R{\twC0R{\u001e+O?H0\u001e5O*OALn\u0017`";
        objectArray[43] = "\u001a@6X5Io`=W$\u0006\u000en6\\ \\z";
        objectArray[44] = "s&/x\u0013<\u0006\u0006$w\u0002sg\b/|\u0006)\u0013";
        objectArray[45] = "n|Q>\\m\u001b\\Z1M\"zRQ:Ix\u000e";
        objectArray[46] = "\u0014\u0012 9F\u0011a2+6W^\u0000< =S\u0004t";
        objectArray[47] = "5TFB\u001d\u0003(AD\u0003\u0018_e";
        objectArray[48] = "\u0013-$0,8f\r/?=w\u0007\u0003$49-s";
        objectArray[49] = "Q}nRN\u0000$]e]_OESnV[\u00151";
        objectArray[50] = "\u0003\u0000#->0v (\"/\u007f\u0017.#)+%c";
        objectArray[51] = "QdJ\u0019\u0013\u0002$DA\u0016\u0002MEJJ\u001d\u0006\u00171";
        objectArray[52] = "p\bgoB\u0001\u0005(l`SNd&gkW\u0014\u0010";
        objectArray[53] = "bF#eB)|N9*%(mU4p\u0003.";
        objectArray[54] = "aSK5zw\u0014s@:k8u}K1ob\u0001";
        objectArray[55] = ";\u001d\u001f?E\u0019N=\u00140TV/3\u001f;P\f[";
        objectArray[56] = "=$CQY\n6+R\u001e%\u00139+TR\u001b\u0003";
        objectArray[57] = "FIrfd*3iyiueRgrbq?&";
        objectArray[58] = "xFb\u0019N\u001bsIsV$\u0018gEx\u001d";
        objectArray[59] = "\u0012$7\\\u001b\u000fg\u0004<S\n@\u0006\n7X\u000e\u001ar";
        objectArray[60] = "VG55pX#g>:a\u0017Bi51eM6";
        objectArray[61] = "U:@\\\fG^5Q\u0013q_M2XZ";
        objectArray[62] = "\t(\u0000\u0013S?|\b\u000b\u001cBp\u001d\u0006\u0000\u0017F*i";
        objectArray[63] = "\u000f6Pw\u0013Yz\u0016[x\u0002\u0016\u001b\u0018Ps\u0006Lo";
        objectArray[64] = "x,\u00178lr\r\f\u001c7}=l\u0002\u0017<yg\u0018";
        objectArray[65] = "B|\u0017P'*7\\\u001c_6eVR\u0017T2?\"";
        objectArray[66] = "4}\u0015's.A]\u001e(ba S\u0015#f;T";
        objectArray[67] = "z\rIhKt\u000f-BgZ;n#Il^a\u001a";
        objectArray[68] = "jcb3.\n\u001fCi<?E~Mb7;\u001f\n";
        objectArray[69] = "\u0000hdwh\u001a\u00004=b\u0019\r\u0011<8w\u0019\rK<?ax\u0013\u001c78\u001ab\u0018\u0001.!|#\u0006Dj\\";
        objectArray[70] = "9hj^\u001e\u00116ex\u0005/\u00131v\u0003]\u0016\n>7o\tU\u001fi\u00069^S\u0010ijm\u001dFGX<:\u001bIG4hy\u000e\u001ev";
        objectArray[71] = "\u00008riGEJw6u*\u0016]HqyQKE\"5)LW@Hu/WU\u00062)\u007fO\u0011;";
        objectArray[72] = ",\n\u0019R*\u0003fE]NGV.z\u001aB<\ri\u0010^\u0012!\u0011lz\u001e\u0014:\u0013*\u0000BD\"W\u0017";
        objectArray[73] = "l7\"\u001d\u0001\u0010do{`Dp47;\u0006J\u001c`t.Q";
        objectArray[74] = "\u0017\u0003-85\\\u0017_t-DK\u0006Wq8DK\\Wv.%U\u000b\\qU?\u0001\u0004]n4!V\u000fZ\u0015.*K\u0016Cso4\u000eR>";
        objectArray[75] = "Gl?_XE\u000eirCF\"\u001893]\"\u0013\u0002,-GLK\u001e){!";
        objectArray[76] = "\u001e9a \nT]nw!\b>Yla<\byI\u0005i1\b]Jzo<]C'<9%\u0004QM\u007fn3\u0005S'";
        objectArray[77] = "KXo(\niOI9/e?q_$|\u0006c\u000eY))\u0018";
        objectArray[78] = "P=>\u000f\beT\"m\u001ad9/{9\u0004\u0000|E?i\u0019\u001cy/\u007fo\u0002\u001e?U#?\u001aZ\u0002";
        objectArray[79] = "\u001f>\u0012 QpF%\u00136-4/mE ItE)\u0015=Uq/8_6NgP>RcP\n";
        objectArray[80] = "K}4\u0018}`Nc4\u0016\u0019!(~4\u0019zuWx9Ld";
        objectArray[81] = "&\fu\u001e\u0010\u001f#\u0012u\u0010t\\E\u000fu\u001f\u0017\n:\txJ\t";
        objectArray[82] = "t \u001fyQ|p1I~>'N{N}Eg4\"U|S";
        objectArray[83] = "|_+\u0005YJ|\u0003r\u0010(^a\u001aV\u0001T\\g\u0012\u0013\u0012\u0015\u001ek\u0013\u007f\u0012IG~b";
        objectArray[84] = "\u0007uLSo:M:\bO\u0002o<<\u001cRf.VxLOz+<8JTxmFd\u001aL<P";
        objectArray[85] = "*)\n}\u00155.8\\zzl\u0010|Wt\u0019\"}9W&\u0005";
        objectArray[86] = "8\u0006\u0011_\u0015{ M\u0016W${)K\u001f@HI{\u0006A\u001f$!*JO\u001dJz%T\u0000'";
        objectArray[87] = "#SL\t>r,^^R\u000fp+M%\\\u007fx!PZZr-?=I@bv/BOM7hBQU]lx=WX\br\u0015";
        objectArray[88] = "\u000b\t\f8l\u0002\u0003QUE*'i\nP9pS\u0005^\u0013,'";
        objectArray[89] = "D,oU\u000e\u0012\u000ec+IcE \\lE\u0018\u001c\u00016(\u0015\u0005\u0000\u0004\\h\u0013\u001e\u0002B&4C\u0006F\u007f";
        objectArray[90] = "\rOV$<\u0002\t^\u0000#S_7\u001b\u0003`c_Y@\f~,";
        objectArray[91] = "\npMnDJ\u000brX~U*H3Ck[PR(F\u0010\u001d\u0013O(\u0018|IPZ\u007f)*\u001eVU\u007fE~]C\u0002N\u0010.CTP.\u0011,VDAN";
        objectArray[92] = "}gG\tve$|F\u001f\n\"M4\u0010\tna'p@\u0014rdMa\n\u001fir2g\u0007Jw\u001f";
        objectArray[93] = "a-\u0010~;Z}y\ffB_oh\u001ca.m>)D8B\u0000;h\u001a7.Tx}M\u0006";
        objectArray[94] = "d)\f\u0014'\u001f`8Z\u0013HC^}YPxB0&VN7";
        objectArray[95] = "\u001f\u0002C^\u000b\r\\UU_\tgJYZU\u0000\nxWCB\tgJNJ\\\t\u0018LC\u001fBd";
        objectArray[96] = "ma&\t\u0014\u001eipp\u000e{EW3wK\u001f\u0007=w'V\u0003\u0002W7!M\u0001D-kqUEy";
        objectArray[97] = "\u0001Y(oQ\u0010\u0005H~h>I;\u000by-Z\tQO)0F\f;^c;]\u001aDXnnCw";
        objectArray[98] = "\u0013q\u0003{\u0000R\u0016o\u0003ud\u0017pr\u0003z\u0007G\u000ft\u000e/\u0019";
        objectArray[99] = "d\u0005\u001b\u0003N!!\u0005I\u001f>4'\u0018K`\u000f0\"\rM\u000eW,'[+]\u00021 ^Q\u0001R)dc";
        objectArray[100] = "\\\u0015Pfu~\u0019\u0015\u0002z\u0005x\u0006\u001e\t\u007f\u0005.^\u000e\u001a8\u007fr\u000e\u0016^\u0005";
        objectArray[101] = "`4q/St%4#3#a9*A}_a04/%CdfR";
        objectArray[102] = "UHD!Rv\u001f\u0007\u0000=?,\u00078G1Dx\u0010R\u0003aYd\u00158CgBfSB\u001f7Z\"n";
        objectArray[103] = "9=mW\u0000;sr)Kmm\u0002t=V\t/h0mK\u0015*\u0002pkP\u0017lx,;HSQ";
        objectArray[104] = "aXhX<g3\n;@\u0003nbF1Do\\2\u0003m\u0019<\u000bs\u000b?[2nk@8S\u000316F7\u0012oeuS`#92s\\`Omqf\u000bQ\u001e?vu\u0007+Bon1:";
        objectArray[105] = ".P1U1\r'\u0018'R7im\u0017%ioUj\u0010~\u00133\u0005rTC";
        objectArray[106] = "h\u000eu\u001d.\\pO=HDZa\u0002H\u001a:Tg\u0013\u0004\u0012$Y1\u001e?\u0016%\u000b1~";
        objectArray[107] = "\u001eu\u0015O7WGn\u0014YK\u0016.&BO/SDb\u0012R3V./B\t0QTvY\b&-";
        objectArray[108] = "\rvEDu\u0003G9\u0001X\u0018XU\u0006FTc\rHl\u0002\u0004~\u0011M\u0006B\u0002e\u0013\u000b|\u001eR}W6";
        objectArray[109] = "\u001dzv\u0001)*Daw\u0017Uo-)!\u00011.Gmq\u001c-+--w\u0007/mWq'\u001fkP";
        objectArray[110] = "Yi{3i\u001f\u0013&?/\u0004Lb +2`\u000b\bd{/|\u000eb$}4~H\u0018x-,:u";
        objectArray[111] = "_2K\u000eSp_n\u0012\u001b\"dXt\u0013&K`_n\u0003cX!\u001db\u0002\u000fX}Dws";
        objectArray[112] = "\u0002\u0012dw\tHH] kd\u00129Y.7\u001eOS\u0013as\u0002";
        objectArray[113] = ";W52bs?Fc5\r-\u0001\u0005dpijkA4muo\u0001\u00012vw){]bn3\u0014";
        objectArray[114] = ":4;p>{/kf6Gc/`\u0004};r-jj%'w{\f;\"::yb`-$uC";
        objectArray[115] = "\\R&`>hXCpgQ?X9$3*k\u0018S`c7w\u001d9 e,u[C|541f";
        objectArray[116] = ">-%xr\u0013:<s\u007f\u001dN8F'+f\u0010z,c{{\f\u007fF#}`\u000e9<\u007f-xJ\u0004";
        objectArray[117] = "\u007f5Jv5\u001f{$\u001cqZI\u0001^H%!\u001c;4\fu<\u0000>^Ls'\u0002x$\u0010#?FE";
        objectArray[118] = "{V\u000f3igqP\u001b$\u0007?\u007f)H6|fbC\ffazg)L`zx!S\u00100b<\u001c";
        objectArray[119] = "y\\\u0012(P  G\u0013>,fI\u000fE(H$#K\u00155T!I\u000b\u0013.Vg3WC6\u0012Z";
        objectArray[120] = "W+MO@\u0006S:\u001bH/Qm~\u0010FL\u0011\u0000;\u0010\u0014P";
        objectArray[121] = "GW&R&5FU3B7U\u001a\u0004$C95~S{P#d\u0012\u00078EtU";
        objectArray[122] = "$Xp$+^n\u001748F\u000bR(s4=PaB7d Ld(wb;N\"R+2#\n\u001f";
        objectArray[123] = "\u0000\b?7oPJG{+\u0002\u0007\u000bx<'y^E\u0012xwdB@x8q\u007f@\u0006\u0002d!g\u0004;";
        objectArray[124] = "hZ_\u0012cw\"\u0015\u001b\u000e\u000e&\u000f*\\\u0002uy-@\u0018Rhe(*XTsgnP\u0004\u0004k#S";
        objectArray[125] = "n!\u0000O\u0012Va,\u0012\u0014#Tn)i\u001aS\\l\"\u0016\u001c^\trO\u0005\u0006NRb0\u0003\u000b\u001bL\u000f#\u0019\u001b@\\p%\u0014N^1";
        objectArray[126] = "\u0000).z\u000b'\u00046}og|\u007fo)q\u0003>\u0015+yl\u001f;\u007fi-wWz\u00112\"i\u0018@";
        objectArray[127] = "`\u001cq.X5d\r')7oZ\u000er(\u000b++\u001b-uM";
        objectArray[128] = "n50\u0003[hj$f\u000442TgaAPq>#1\\LtTc7GN2.?g_\n\u000f";
        objectArray[129] = "0b_?r\u0016z-\u001b#\u001fD\u000b+\u000f>{\u0002ao_#g\u0007\u000b/Y8eAqs\t !|";
        objectArray[130] = "(Nz=FXw\\q8$@3Oo=CEeFj:Dx\"_l:CYI\u0004.=B\u0012%Pm(\u0015#s\u0007k'\u0015O'D~p$\u0019pBqpHM3W&A\u001e\u001a5X&-JY \u000f\u0017|\u0018^3\u0003m HFw>";
        objectArray[131] = "\u0017BUw.$\u0013S\u0003pAr-\u0010\u00045%=GTT(98-\u0014R3;~WH\u0002+\u007fC";
        objectArray[132] = "\u000bd\r$tb\u000fu[#\u001b=1aT$`:]3\u0006wx";
        objectArray[133] = "\u0005U@J\u0014`\r\r\u00197U\u0000^\u0006^S\u0010j\u001aVCO\u0015\u0000]UYQ_l\t\u0016L\u0006n";
        objectArray[134] = "@h\"d\u0007zU7\u007f\"~jE=g1\u0002lCP$`\u0002uC7meOi]P";
        objectArray[135] = "MdlR\u000fj\u0007+(Nb1v-<S\u0006~\u001cilN\u001a{v)jU\u0018=\fu:M\\\u0000";
        objectArray[136] = "/n}$2\u0001fk08,fv?z\u001c%\u0016jV>45V,8e;+\u0019\u0016";
        objectArray[137] = "yN\u0014m\u0002*<NFqr&<eAv\u000e6G\u0017JsB})LEm\rG";
        objectArray[138] = "\b}`\u0006\u0014`\u0002{t\u0011z8>\u0002'\u0003\u0001a\u0011hcS\u001c}\u0014\u0002#U\u0007\u007fRx\u007f\u0005\u001f;o";
        objectArray[139] = " \u0002hxA:>\u0007.u-n.\u00012\u007fA\\yGl(\u0016\u000b D>`Tk<\u0010\"x-";
        objectArray[140] = "FOV<~kS\u0010\u000bz\u0007q[\u001a\u0000z\u0007'\u0003\n\u0013=}{S\u0012W\u0000";
        objectArray[141] = "i\u0007+0n}#Ho,\u0003(>w( xs,\u001dlpeo)w,v~mo\rp&f)R";
        objectArray[142] = "?G\f}q\u0016f\\\rk\r\\\u000f\u0014[}i\u0012eP\u000b`u\u0017\u000f\u0010\r{wQuL]c3l";
        objectArray[143] = "@6\u0002\u001d}R\u001f$\t\u0018\u001fJ[7\u0017\u001dxO\r>\b\u0019DB@=\u0014\u0006e)\u001cz\u0012\u001b\"S@*\n_\u001f";
        objectArray[144] = "YrH\t\u000f\u0010]c\u001e\u000e`Ic \u0019K\u0004\t\tdIV\u0018\fc{JU\u001d\r\u0003s\u0012\f`";
        objectArray[145] = "\f+G:;z\u0004s\u001eGz\u001aT+^!pv\u0000hKv";
        objectArray[146] = "\u0002\u0018\u000f\u0007C4PJ\\\u001f|=\u0001\u0006V\u001b\u0010\u000fQC\n@LX\u0016G\u000e\u0011\r4\u0016\u001bW\u0004|";
        objectArray[147] = "?\u0011X&\u001e6u^\u001c:sc\u007fa[6\b8z\u000b\u001ff\u0015$\u007fa_`\u000e&9\u001b\u00030\u0016b\u0004";
        objectArray[148] = "@\u0016*t\u0003-E\b*zgd#\u0015*u\u00048\\\u0013' \u001a";
        objectArray[149] = "\u00017\u000ed\u001cF]gXd-A<WTx\u0017\u0018\u000bfJ}Q\u0015";
        objectArray[150] = "w\u0018K!c32\u0018\u0019=\u0013&$\u0013\u0018B\"\"1\u0010\u001d,z>4F{";
        objectArray[151] = "G\u0001lc1bOY5\u001e{\u0002\u001f\u0001uxznKB`/";
        objectArray[152] = "\"\u0012l\u0003\b`>Fp\u001bqe,W`\u001c\u001dW}\u00171Fq:xWfJ\u001dn;B1{";
        objectArray[153] = "C>si\"o\tq7uO4*Npy4a\u0006$4))}\u0003Nt/2\u007fE4(\u007f*;x";
        objectArray[154] = "\u001dL\u000eg2=\u0019]X`]j'\u001e_%9$MZ\u000f8%!'KE3>7XMHf Z";
        objectArray[155] = "LhH#^GHy\u001e$1\u001e\u000f\u0003JpJD\bi\u000e WX\r\u0003N&LZKy\u0012vT\u001ev";
        Object[] objectArray2 = objectArray;
        objectArray[156] = "ft\u0016>$X?o\u0017(X\u001eV'A><\\<c\u0011# YVr[(;O)tV}%\"";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3E50;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/87", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _87.c[n2] = _87.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _87.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c4' || c == 'l' || c == 'K' || c == 'W') {
                field = _87.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _87.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _87.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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

    public void cfr_renamed_104(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        double d4 = (Double)objectArray[5];
        double d5 = (Double)objectArray[6];
        double d6 = (Double)objectArray[7];
        double d7 = (Double)objectArray[8];
        double d8 = (Double)objectArray[9];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x3E3C3EED2C3FL;
        long l5 = l3 ^ 0x51B283362BECL;
        long l6 = l3 ^ 0x7E32CC0239EFL;
        int n2 = (int)(l6 >>> 48);
        int n3 = (int)(l6 << 16 >>> 32);
        int n4 = (int)(l6 << 48 >>> 48);
        long l7 = l3 ^ 0x6ECD4EB7CEAAL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _8B(n, (short)n2, n3, (short)n4);
        objectArray2[0] = l7;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[10];
        objectArray4[9] = d8;
        objectArray4[8] = d7;
        objectArray4[7] = d6;
        objectArray4[6] = d5;
        objectArray4[5] = d4;
        objectArray4[4] = d3;
        objectArray4[3] = d2;
        objectArray4[2] = l5;
        objectArray4[1] = d;
        objectArray4[0] = (int)_87.c("\u00e8", (Object)_87.c("\u00e8", (Object)this, (Object)objectArray2, 8373913672035061535L, (long)l2), (Object)objectArray3, 8373121064974499364L, (long)l2);
        _87.c("D", (Object)objectArray4, 8360708642060909938L, (long)l2);
    }

    public void cfr_renamed_4(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        long l2 = (Long)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0xCCA00A6B5E2L;
        long l5 = l3 ^ 0xF6B07A7B758L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = _87.c("\u00e8", (Object)this, (Object)objectArray2, 992058247798044397L, (long)l2);
        objectArray3[4] = d4;
        objectArray3[3] = d3;
        objectArray3[2] = d2;
        objectArray3[1] = d;
        objectArray3[0] = l4;
        _87.c("\u00e8", (Object)_87.c("K", 1007767213885032489L, (long)l2), (Object)objectArray3, 1008444305134852917L, (long)l2);
    }

    public void void_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1799 class_17992 = (class_1799)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x37629990376FL;
        int n3 = (int)(l4 >>> 48);
        int n4 = (int)(l4 << 16 >>> 48);
        int n5 = (int)(l4 << 32 >>> 32);
        long l5 = l3 ^ 0x405AC6D62B73L;
        CallSite callSite = _87.c("\u00c4", (Object)this, 7473469438859487747L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = () -> _87.cfr_renamed_0((class_332)callSite, class_17992, (char)n3, (char)n4, n5, n, n2);
        _87.c("\u00e8", (Object)this, (Object)objectArray2, 7461171647855642989L, (long)l2);
    }

    private _8B dev_krypton_8B_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        _8B b = (_8B)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x5CBEC2CD7D5BL;
        try {
            if (_87.c("\u00c4", (Object)this, 4545851166266179356L, (long)l2) >= 1.0) {
                return b;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw _87.a(illegalStateException);
        }
        return new _8B((int)_87.c("\u00c4", (Object)b, 4545081615847611415L, (long)l2), (int)_87.c("\u00c4", (Object)b, 4546132179794721806L, (long)l2), l3, (int)_87.c("\u00c4", (Object)b, 4548809806621334536L, (long)l2), (int)((double)_87.c("\u00c4", (Object)b, 4548986322456362058L, (long)l2) * _87.c("\u00c4", (Object)this, 4545851166266179356L, (long)l2)));
    }

    private static void cfr_renamed_2(int n, class_332 class_3322, class_1799 class_17992, int n2, char c, int n3, int n4, float f, short s) {
        long l2 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x135347165287L;
        Object[] objectArray = new Object[7];
        objectArray[6] = Float.valueOf(f);
        objectArray[5] = n4;
        objectArray[4] = l3;
        objectArray[3] = n3;
        objectArray[2] = n2;
        objectArray[1] = class_17992;
        objectArray[0] = class_3322;
        _87.c("D", (Object)objectArray, -3175695912638547447L, (long)l2);
    }

    public double double_6(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        boolean bl;
        _8B b;
        double d;
        double d2;
        String string;
        block4: {
            long l5;
            block5: {
                string = (String)objectArray[0];
                d2 = (Double)objectArray[1];
                d = (Double)objectArray[2];
                b = (_8B)objectArray[3];
                bl = (Boolean)objectArray[4];
                l4 = (Long)objectArray[5];
                long l6 = l4 = a ^ l4;
                l3 = l6 ^ 0x4D31418B5A0L;
                l2 = l6 ^ 0x69BF6EF78C8DL;
                l5 = l6 ^ 0x12EFA8D237FL;
                int n = _87.cfr_renamed_7();
                try {
                    try {
                        callSite = _87.c("\u00c4", (Object)this, 3900555458009599076L, (long)l4);
                        if (n == 0) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    callSite = _87.c("\u00c4", (Object)this, 3900555458009599076L, (long)l4);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l5;
            callSite = _87.c("D", (Object)objectArray2, 3904551359139447550L, (long)l4);
        }
        CallSite callSite2 = callSite;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = b;
        objectArray3[0] = l2;
        Object[] objectArray4 = new Object[6];
        objectArray4[5] = bl;
        objectArray4[4] = _87.c("\u00e8", (Object)this, (Object)objectArray3, 3895923104453463352L, (long)l4);
        objectArray4[3] = d;
        objectArray4[2] = d2;
        objectArray4[1] = string;
        objectArray4[0] = l3;
        return (double)_87.c("\u00e8", (Object)callSite2, (Object)objectArray4, 3902064629415079079L, (long)l4);
    }

    public void cfr_renamed_399(Object[] objectArray) {
        block16: {
            Object object;
            long l2;
            long l3;
            long l4;
            block17: {
                Object object2;
                long l5;
                long l6;
                long l7;
                Runnable runnable;
                _0E e2;
                block18: {
                    Object object3;
                    int n;
                    block14: {
                        long l8;
                        block15: {
                            block12: {
                                block13: {
                                    l4 = (Long)objectArray[0];
                                    e2 = (_0E)objectArray[1];
                                    runnable = (Runnable)objectArray[2];
                                    long l9 = l4 = a ^ l4;
                                    l3 = l9 ^ 0x1A4F35A51A13L;
                                    l7 = l9 ^ 0x717BEEE6CB33L;
                                    l6 = l9 ^ 0x43E917A7D293L;
                                    l5 = l9 ^ 0x6B19B6894870L;
                                    l2 = l9 ^ 0x60EDD00EC56AL;
                                    l8 = l9 ^ 0x735A47E5A865L;
                                    n = _87.cfr_renamed_7();
                                    try {
                                        try {
                                            object3 = e2;
                                            if (n == 0) break block12;
                                            if (object3 != null) break block13;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw _87.a(illegalStateException);
                                        }
                                        _87.c("\u00e8", (Object)runnable, -4812903240868710477L, (long)l4);
                                        return;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw _87.a(illegalStateException);
                                    }
                                }
                                object3 = _87.c("\u00c4", (Object)this, -4810973663417923714L, (long)l4);
                            }
                            try {
                                try {
                                    if (n == 0) break block14;
                                    if (object3 == null) break block15;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw _87.a(illegalStateException);
                                }
                                object3 = _87.c("\u00c4", (Object)this, -4810973663417923714L, (long)l4);
                                break block14;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw _87.a(illegalStateException);
                            }
                        }
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l8;
                        object3 = _87.c("D", (Object)objectArray2, -4812744146556155420L, (long)l4);
                    }
                    object2 = object3;
                    try {
                        try {
                            if (l4 < 0L) break block16;
                            object = e2;
                            if (n == 0) break block17;
                            if (object != object2) break block18;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw _87.a(illegalStateException);
                        }
                        _87.c("\u00e8", (Object)runnable, -4812903240868710477L, (long)l4);
                        return;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l5;
                _87.c("\u00e8", (Object)_87.c("K", -4813404269101205274L, (long)l4), (Object)objectArray3, -4824616199168513111L, (long)l4);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l7;
                _87.c("\u00e8", (Object)object2, (Object)objectArray4, -4824241897468188249L, (long)l4);
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = (double)_87.c("\u00c4", (Object)this, -4810960725627519690L, (long)l4);
                objectArray5[0] = l6;
                _87.c("\u00e8", (Object)e2, (Object)objectArray5, -4813206411776264150L, (long)l4);
                Object[] objectArray6 = new Object[1];
                objectArray6[0] = l3;
                _87.c("\u00e8", (Object)e2, (Object)objectArray6, -4813584885605473725L, (long)l4);
                Object[] objectArray7 = new Object[1];
                objectArray7[0] = l2;
                _87.c("\u00e8", (Object)_87.c("K", -4813404269101205274L, (long)l4), (Object)objectArray7, -4812972097615302362L, (long)l4);
                _87.c("l", (Object)this, (_0E)e2, -4810973663417923714L, (long)l4);
                _87.c("\u00e8", (Object)runnable, -4812903240868710477L, (long)l4);
                Object[] objectArray8 = new Object[1];
                objectArray8[0] = l5;
                _87.c("\u00e8", (Object)_87.c("K", -4813404269101205274L, (long)l4), (Object)objectArray8, -4824616199168513111L, (long)l4);
                Object[] objectArray9 = new Object[1];
                objectArray9[0] = l7;
                _87.c("\u00e8", (Object)e2, (Object)objectArray9, -4824241897468188249L, (long)l4);
                _87.c("l", (Object)this, null, -4810973663417923714L, (long)l4);
                Object[] objectArray10 = new Object[2];
                objectArray10[1] = (double)_87.c("\u00c4", (Object)this, -4810960725627519690L, (long)l4);
                objectArray10[0] = l6;
                _87.c("\u00e8", (Object)object2, (Object)objectArray10, -4813206411776264150L, (long)l4);
                object = object2;
            }
            Object[] objectArray11 = new Object[1];
            objectArray11[0] = l3;
            _87.c("\u00e8", (Object)object, (Object)objectArray11, -4813584885605473725L, (long)l4);
            Object[] objectArray12 = new Object[1];
            objectArray12[0] = l2;
            _87.c("\u00e8", (Object)_87.c("K", -4813404269101205274L, (long)l4), (Object)objectArray12, -4812972097615302362L, (long)l4);
        }
    }

    public class_332 net_minecraft_class_332_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _87.c("\u00c4", (Object)this, -7521726227815998935L, (long)l2);
    }

    public void void_2(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        double d4 = (Double)objectArray[3];
        _8B b = (_8B)objectArray[4];
        long l2 = (Long)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x6ACD04952B23L;
        long l5 = l3 ^ 0x44CA4EF0D256L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = _87.c("\u00e8", (Object)this, (Object)objectArray2, 7550905007909426147L, (long)l2);
        objectArray3[4] = d4;
        objectArray3[3] = d3;
        objectArray3[2] = l4;
        objectArray3[1] = d2;
        objectArray3[0] = d;
        _87.c("\u00e8", (Object)_87.c("K", 7562112566649974055L, (long)l2), (Object)objectArray3, 7552051878262157694L, (long)l2);
    }

    private static void cfr_renamed_3(class_332 class_3322, class_1799 class_17992, long l2, int n, int n2, float f, boolean bl) {
        long l3 = (l2 = a ^ l2) ^ 0x52FFD1CF9E4FL;
        Object[] objectArray = new Object[7];
        objectArray[6] = l3;
        objectArray[5] = bl;
        objectArray[4] = Float.valueOf(f);
        objectArray[3] = n2;
        objectArray[2] = n;
        objectArray[1] = class_17992;
        objectArray[0] = class_3322;
        _87.c("D", (Object)objectArray, -6484206659017327611L, (long)l2);
    }

    public static void cfr_renamed_6(int n) {
        cfr_renamed_5 = n;
    }

    public void cfr_renamed_6(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        int n = (Integer)objectArray[1];
        long l2 = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        boolean bl = (Boolean)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x4127A599A443L;
        long l5 = l3 ^ 0x7267F0DECB05L;
        CallSite callSite = _87.c("\u00c4", (Object)this, -1691354931518593741L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = () -> _87.cfr_renamed_3((class_332)callSite, class_17992, l5, n, n2, f, bl);
        _87.c("\u00e8", (Object)this, (Object)objectArray2, -1676630539560728995L, (long)l2);
    }

    /*
     * WARNING - void declaration
     */
    public String java_lang_String_4(Object[] objectArray) {
        void var12_9;
        CallSite callSite;
        int n;
        long l2;
        double d;
        String string;
        long l3;
        block8: {
            block9: {
                l3 = (Long)objectArray[0];
                string = (String)objectArray[1];
                d = (Double)objectArray[2];
                l2 = (l3 = a ^ l3) ^ 0x4A6B92B4B622L;
                n = _87.cfr_renamed_5();
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l2;
                        objectArray2[0] = string;
                        callSite = _87.c("\u00e8", (Object)this, (Object)objectArray2, 3255176613969930886L, (long)l3);
                        if (n != 0) break block8;
                        if (!(callSite <= d)) break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    return string;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = _87.a("b", 5408, (long)(0x5CCB6871E2F067AL ^ l3));
            callSite = _87.c("\u00e8", (Object)this, (Object)objectArray3, 3255176613969930886L, (long)l3);
        }
        CallSite callSite2 = callSite;
        CallSite callSite3 = _87.c("\u00e8", string, 3248348449460342784L, (long)l3);
        while (var12_9 > 0) {
            try {
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l2;
                objectArray4[0] = _87.c("\u00e8", string, 0, (int)var12_9, 3250692944744581558L, (long)l3);
                reference cfr_temp_0 = _87.c("\u00e8", (Object)this, (Object)objectArray4, 3255176613969930886L, (long)l3) + callSite2 - d;
                Object object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                if (l3 >= 0L) {
                    if (object <= 0) break;
                    --var12_9;
                    object = n;
                }
                if (object == false) continue;
                if (l3 <= 0L) break;
                break;
            }
            catch (IllegalStateException illegalStateException) {
                throw _87.a(illegalStateException);
            }
        }
        return (String)((Object)_87.c("\u00e8", string, 0, (int)var12_9, 3250692944744581558L, (long)l3)) + (String)((Object)_87.a("b", 10314, (long)(0x588F5E296B0FBB11L ^ l3)));
    }

    private void void_4(Object[] objectArray) {
        _87 v0;
        long l2;
        block4: {
            _9G g;
            CallSite callSite;
            CallSite callSite2;
            reference var8_6;
            int n;
            block5: {
                l2 = (Long)objectArray[0];
                _3f_0 f_0 = (_3f_0)objectArray[1];
                l2 = a ^ l2;
                CallSite callSite3 = _87.c("\u00e8", (Object)_87.c("\u00e8", (Object)_87.c("K", 2825461106253594884L, (long)l2), 2824234286195639986L, (long)l2), 2811386204863160266L, (long)l2);
                n = (int)_87.c("\u00c4", (Object)f_0, 2813590660709262510L, (long)l2);
                var8_6 = callSite3 - (int)(_87.c("\u00c4", (Object)f_0, 2812321887316297298L, (long)l2) + _87.c("\u00c4", (Object)f_0, 2812245525571890587L, (long)l2));
                callSite2 = _87.c("D", 0, (int)((int)_87.c("\u00c4", (Object)f_0, 2825561197217471349L, (long)l2)), 2811028496084533147L, (long)l2);
                int n2 = _87.cfr_renamed_5();
                callSite = _87.c("D", 0, (int)((int)_87.c("\u00c4", (Object)f_0, 2812245525571890587L, (long)l2)), 2811028496084533147L, (long)l2);
                g = (_9G)((Object)_87.c("D", 2813008236086091634L, (long)l2));
                try {
                    try {
                        v0 = this;
                        if (n2 != 0) break block4;
                        if (_87.c("\u00c4", (Object)v0, 2811867508839280052L, (long)l2) == false) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    _87.c("\u00e8", (Object)g, 2823915959589172386L, (long)l2);
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            _87.c("\u00e8", (Object)g, (int)n, (int)var8_6, (int)callSite2, (int)callSite, 2824865084129819305L, (long)l2);
            v0 = this;
        }
        _87.c("l", (Object)v0, (boolean)_87.b("w", 7599, (long)(0x71B85FCEC0B0EE6DL ^ l2)), 2811867508839280052L, (long)l2);
    }

    public double double_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        double d = (Double)objectArray[2];
        double d2 = (Double)objectArray[3];
        _8B b = (_8B)objectArray[4];
        long l3 = (l2 = a ^ l2) ^ 0x6723EE7B6544L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l3;
        objectArray2[4] = false;
        objectArray2[3] = b;
        objectArray2[2] = d2;
        objectArray2[1] = d;
        objectArray2[0] = string;
        return (double)_87.c("\u00e8", (Object)this, (Object)objectArray2, -2966690231355035792L, (long)l2);
    }

    public static int cfr_renamed_7() {
        int n = _87.cfr_renamed_5();
        if (n == 0) {
            return 68;
        }
        return 0;
    }

    public double double_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (double)_87.c("\u00c4", (Object)this, -2729453298908210667L, (long)l2);
    }

    private void void_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        if (_87.c("\u00c4", (Object)this, 3951320479272926308L, (long)(l2 = a ^ l2)) != false) {
            _9G g = (_9G)((Object)_87.c("D", 3952466699817766562L, (long)l2));
            _87.c("\u00e8", (Object)g, 3954366124283684210L, (long)l2);
            _87.c("l", (Object)this, (boolean)_87.b("w", 24960, (long)(0x10A740B61E2C0390L ^ l2)), 3951320479272926308L, (long)l2);
        }
    }

    public void cfr_renamed_9(Object[] objectArray) {
        _8B b = (_8B)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        double d3 = (Double)objectArray[3];
        double d4 = (Double)objectArray[4];
        long l2 = (Long)objectArray[5];
        double d5 = (Double)objectArray[6];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x37E6470211A0L;
        long l5 = l3 ^ 0x35054DED2A1BL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l5;
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = d5;
        objectArray3[5] = d4;
        objectArray3[4] = d3;
        objectArray3[3] = d2;
        objectArray3[2] = l4;
        objectArray3[1] = d;
        objectArray3[0] = _87.c("\u00e8", (Object)this, (Object)objectArray2, -8032374624258544722L, (long)l2);
        _87.c("D", (Object)objectArray3, -8017398568316777627L, (long)l2);
    }

    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        double d = (Double)objectArray[2];
        double d2 = (Double)objectArray[3];
        double d3 = (Double)objectArray[4];
        _8B b = (_8B)objectArray[5];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x71EFE1B83320L;
        long l5 = l3 ^ 0x7D65A704868CL;
        long l6 = l3 ^ 0x227A9C4BF2F3L;
        long l7 = l3 ^ 0x7CF6C90970D1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = b;
        objectArray2[0] = l7;
        CallSite callSite = _87.c("\u00e8", (Object)this, (Object)objectArray2, -3869423148855103132L, (long)l2);
        try {
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = string;
            objectArray3[0] = l6;
            if (_87.c("D", (Object)objectArray3, -3857715666230366172L, (long)l2) != false) {
                Object[] objectArray4 = new Object[2];
                objectArray4[1] = l5;
                objectArray4[0] = () -> _87.cfr_renamed_1(string, d, d2, l4, d3, (_8B)((Object)callSite));
                _87.c("\u00e8", (Object)this, (Object)objectArray4, -3858365340539657070L, (long)l2);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw _87.a(illegalStateException);
        }
    }

    private static void cfr_renamed_0(class_332 class_3322, class_1799 class_17992, char c, char c2, int n, int n2, int n3) {
        long l2 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        long l3 = l2 ^ 0x59436E83F1A2L;
        Object[] objectArray = new Object[5];
        objectArray[4] = n3;
        objectArray[3] = n2;
        objectArray[2] = class_17992;
        objectArray[1] = class_3322;
        objectArray[0] = l3;
        _87.c("D", (Object)objectArray, -3073437228866965920L, (long)l2);
    }

    public double double_8(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        String string;
        block4: {
            long l4;
            block5: {
                string = (String)objectArray[0];
                l3 = (Long)objectArray[1];
                long l5 = l3 = a ^ l3;
                l2 = l5 ^ 0x5E8BB752E14AL;
                l4 = l5 ^ 0x4FBEB6000BDFL;
                int n = _87.cfr_renamed_5();
                try {
                    try {
                        callSite = _87.c("\u00c4", (Object)this, 2198249292409513156L, (long)l3);
                        if (n != 0) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw _87.a(illegalStateException);
                    }
                    callSite = _87.c("\u00c4", (Object)this, 2198249292409513156L, (long)l3);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw _87.a(illegalStateException);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            callSite = _87.c("D", (Object)objectArray2, 2202135244642691678L, (long)l3);
        }
        CallSite callSite2 = callSite;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = string;
        return (double)_87.c("\u00e8", (Object)callSite2, (Object)objectArray3, 2211945033191169614L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_87.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_87.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_87.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

