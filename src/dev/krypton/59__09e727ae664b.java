/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1923
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2818
 *  net.minecraft.class_2874
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._4k;
import dev.krypton._4r;
import dev.krypton._6Q;
import dev.krypton._6c_0;
import dev.krypton._6l_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._9o;
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
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2818;
import net.minecraft.class_2874;

public class _59
extends _6x_0 {
    private final _92 cfr_renamed_7;
    private final _9r cfr_renamed_8;
    private final _9t_0 cfr_renamed_3;
    private final Map cfr_renamed_0;
    private final Set cfr_renamed_1;
    private final Map cfr_renamed_6;
    private ExecutorService cfr_renamed_4;
    private class_2874 cfr_renamed_2;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    @_3i_0
    public void cfr_renamed_5(_9o o) {
        _59 v2;
        CallSite callSite;
        long l2;
        block8: {
            block9: {
                CallSite callSite2;
                int n;
                block6: {
                    block7: {
                        l2 = b ^ 0x5874A35EA779L;
                        n = _3C.cfr_renamed_4();
                        try {
                            callSite2 = _59.c("\u00fe", (Object)_59.c("\u00fe", (Object)this, -2700917549268529504L, (long)l2), -2688440240149554507L, (long)l2);
                            if (n != 0) break block6;
                            if (callSite2 != null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _59.a(matchException);
                        }
                        return;
                    }
                    callSite2 = _59.c("\u00fe", (Object)_59.c("\u00fe", (Object)this, -2700917549268529504L, (long)l2), -2688440240149554507L, (long)l2);
                }
                callSite = _59.c("t", (Object)callSite2, -2687776152810371626L, (long)l2);
                try {
                    try {
                        v2 = this;
                        if (n != 0) break block8;
                        if (_59.c("\u00fe", (Object)v2, -2700174402582330956L, (long)l2) == callSite) break block9;
                    }
                    catch (MatchException matchException) {
                        throw _59.a(matchException);
                    }
                    _59.c("t", (Object)this, -2689902080940929201L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _59.a(matchException);
                }
            }
            v2 = this;
        }
        _59.c("E", (Object)v2, (class_2874)callSite, -2700174402582330956L, (long)l2);
    }

    @Override
    public native void cfr_renamed_5();

    @_3i_0
    public void cfr_renamed_267(_6c_0 c_0) {
        long l2 = b ^ 0xA0359F73CFCL;
        long l3 = l2 ^ 0x6690A8606C8FL;
        Object[] objectArray = new Object[2];
        objectArray[1] = c_0;
        objectArray[0] = l3;
        _59.c("t", (Object)this, (Object)objectArray, 4700112502696934229L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void cfr_renamed_134(Object[] objectArray) {
        CallSite callSite;
        int n;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        _6c_0 c_0;
        long l7;
        block22: {
            _59 v3;
            block21: {
                CallSite callSite2;
                block20: {
                    l7 = (Long)objectArray[0];
                    c_0 = (_6c_0)objectArray[1];
                    long l8 = l7 = b ^ l7;
                    l6 = l8 ^ 0x1CEF63075D63L;
                    l5 = l8 ^ 0x56D8B4667663L;
                    l4 = l8 ^ 0x68CD8491DDCCL;
                    l3 = l8 ^ 0x41CD541FE0B7L;
                    l2 = l8 ^ 0x374F88D29DFCL;
                    n = _3C.cfr_renamed_7();
                    try {
                        try {
                            try {
                                callSite2 = _59.c("\u00fe", (Object)this, 5788021367472948343L, (long)l7);
                                if (n == 0) break block20;
                                if (_59.c("\u00fe", (Object)callSite2, 5793875219087528034L, (long)l7) == null) return;
                            }
                            catch (MatchException matchException) {
                                throw _59.a(matchException);
                            }
                            v3 = this;
                            if (l7 < 0L || n == 0) break block21;
                        }
                        catch (MatchException matchException) {
                            throw _59.a(matchException);
                        }
                        callSite2 = _59.c("\u00fe", (Object)v3, 5788021367472948343L, (long)l7);
                    }
                    catch (MatchException matchException) {
                        throw _59.a(matchException);
                    }
                }
                try {
                    if (_59.c("\u00fe", (Object)callSite2, 5791902339389793226L, (long)l7) == null) return;
                    v3 = this;
                }
                catch (MatchException matchException) {
                    throw _59.a(matchException);
                }
            }
            try {
                callSite = _59.c("t", (Object)_59.c("\u00fe", (Object)v3, 5794383605590346939L, (long)l7), 5791977860434881714L, (long)l7);
                if (n == 0) break block22;
                if (callSite != false) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _59.a(matchException);
            }
            callSite = _59.c("t", (Object)_59.c("\u00fe", (Object)_59.c("\u00fe", (Object)this, 5788021367472948343L, (long)l7), 5794098486887739353L, (long)l7), 5793421063979754730L, (long)l7);
        }
        CallSite callSite3 = callSite;
        reference var17_11 = _59.c("t", (Object)_59.c("\u00fe", (Object)_59.c("\u00fe", (Object)this, 5788021367472948343L, (long)l7), 5791902339389793226L, (long)l7), 5800050057377434535L, (long)l7) >> 4;
        reference var18_12 = _59.c("t", (Object)_59.c("\u00fe", (Object)_59.c("\u00fe", (Object)this, 5788021367472948343L, (long)l7), 5791902339389793226L, (long)l7), 5793491938278860162L, (long)l7) >> 4;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        CallSite callSite4 = _59.c("t", (Object)_59.c("\u00fe", (Object)this, 5793700941971162334L, (long)l7), (Object)objectArray2, 5787879761228432469L, (long)l7);
        CallSite callSite5 = _59.c("t", (Object)_59.c("\u00fe", (Object)this, 5794886301766846959L, (long)l7), (long)l2, 5792360368312044870L, (long)l7);
        CallSite callSite6 = _59.c("t", (Object)_59.c("t", (Object)_59.c("\u00fe", (Object)this, 5794383605590346939L, (long)l7), 5787707435772172079L, (long)l7), 5792601367431181099L, (long)l7);
        block16: while (true) {
            Object object = _59.c("t", (Object)callSite6, 5795054138537381344L, (long)l7);
            do {
                block25: {
                    CallSite callSite7;
                    double d;
                    double d2;
                    double d3;
                    Object object2;
                    Object object3;
                    Object object4;
                    _4k k;
                    block24: {
                        CallSite callSite8;
                        CallSite callSite9;
                        class_2338 class_23382;
                        Map.Entry entry;
                        block23: {
                            if (object == false) return;
                            entry = (Map.Entry)((Object)_59.c("t", (Object)callSite6, 5799540310625596940L, (long)l7));
                            class_23382 = (class_2338)_59.c("t", (Object)entry, 5788130129762270473L, (long)l7);
                            reference var24_18 = _59.c("t", (Object)class_23382, 5795676881928006656L, (long)l7) >> 4;
                            reference var25_19 = _59.c("t", (Object)class_23382, 5787945518811165977L, (long)l7) >> 4;
                            try {
                                CallSite callSite8 = _59.c("A", (int)(var24_18 - var17_11), 5788243896919420622L, (long)l7);
                                callSite8 = callSite3;
                                if (n == 0) break block23;
                                if (callSite9 > callSite8) continue block16;
                            }
                            catch (MatchException matchException) {
                                throw _59.a(matchException);
                            }
                            CallSite callSite8 = _59.c("A", (int)(var25_19 - var18_12), 5788243896919420622L, (long)l7);
                            callSite8 = callSite3;
                        }
                        if (callSite9 > callSite8) continue block16;
                        class_2248 class_22482 = (class_2248)_59.c("t", (Object)entry, 5793356177499733603L, (long)l7);
                        Object[] objectArray3 = new Object[3];
                        objectArray3[2] = (int)callSite4;
                        objectArray3[1] = class_22482;
                        objectArray3[0] = l6;
                        CallSite callSite10 = _59.c("t", (Object)this, (Object)objectArray3, 5795444201058155447L, (long)l7);
                        try {
                            try {
                                if (l7 > 0L) {
                                    k = c_0.cfr_renamed_7;
                                    Object object2 = (double)_59.c("t", (Object)class_23382, 5795676881928006656L, (long)l7);
                                    object2 = (double)_59.c("t", (Object)class_23382, 5787531448666324330L, (long)l7);
                                    object2 = (double)_59.c("t", (Object)class_23382, 5787945518811165977L, (long)l7);
                                    double d = (double)(_59.c("t", (Object)class_23382, 5795676881928006656L, (long)l7) + true);
                                    d = (double)(_59.c("t", (Object)class_23382, 5787531448666324330L, (long)l7) + true);
                                    d = (double)(_59.c("t", (Object)class_23382, 5787945518811165977L, (long)l7) + true);
                                    callSite7 = callSite10;
                                    if (n == 0) break block24;
                                    Object[] objectArray4 = new Object[11];
                                    objectArray4[10] = l3;
                                    objectArray4[9] = 0;
                                    objectArray4[8] = _59.c("F", 5794792706625456683L, (long)l7);
                                    objectArray4[7] = callSite10;
                                    objectArray4[6] = callSite7;
                                    objectArray4[5] = d;
                                    objectArray4[4] = d2;
                                    objectArray4[3] = d3;
                                    objectArray4[2] = object2;
                                    objectArray4[1] = object3;
                                    objectArray4[0] = object4;
                                    _59.c("t", (Object)k, (Object)objectArray4, 5792673071309000144L, (long)l7);
                                }
                                object = callSite5;
                                if (l7 < 0L) continue;
                                if (object == false) break block25;
                            }
                            catch (MatchException matchException) {
                                throw _59.a(matchException);
                            }
                            k = c_0.cfr_renamed_7;
                            Object object2 = _59.c("\u00fe", (Object)_59.c("F", 5794249007445866812L, (long)l7), 5794069889138786964L, (long)l7);
                            object2 = _59.c("\u00fe", (Object)_59.c("F", 5794249007445866812L, (long)l7), 5788107494209495306L, (long)l7);
                            object2 = _59.c("\u00fe", (Object)_59.c("F", 5794249007445866812L, (long)l7), 5795784884840402608L, (long)l7);
                            double d = (double)_59.c("t", (Object)class_23382, 5795676881928006656L, (long)l7) + 0.5;
                            d = (double)_59.c("t", (Object)class_23382, 5787531448666324330L, (long)l7) + 0.5;
                            d = (double)_59.c("t", (Object)class_23382, 5787945518811165977L, (long)l7) + 0.5;
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = (int)_59.a("t", 30878, (long)(0x57A772A643757EEFL ^ l7));
                            objectArray5[1] = class_22482;
                            objectArray5[0] = l6;
                            callSite7 = _59.c("t", (Object)this, (Object)objectArray5, 5795444201058155447L, (long)l7);
                        }
                        catch (MatchException matchException) {
                            throw _59.a(matchException);
                        }
                    }
                    Object[] objectArray6 = new Object[8];
                    objectArray6[7] = callSite7;
                    objectArray6[6] = l5;
                    objectArray6[5] = d;
                    objectArray6[4] = d2;
                    objectArray6[3] = d3;
                    objectArray6[2] = object2;
                    objectArray6[1] = object3;
                    objectArray6[0] = object4;
                    _59.c("t", (Object)k, (Object)objectArray6, 5795318445866428036L, (long)l7);
                }
                object = n;
            } while (l7 <= 0L);
            if (object == false) break;
        }
    }

    private void cfr_renamed_163(Object[] objectArray) {
        CallSite callSite;
        int n;
        int n2;
        int n3;
        long l2;
        block14: {
            block15: {
                l2 = (Long)objectArray[0];
                n3 = (Integer)objectArray[1];
                n2 = (Integer)objectArray[2];
                l2 = b ^ l2;
                n = _3C.cfr_renamed_4();
                class_1923 class_19232 = new class_1923(n3, n2);
                try {
                    try {
                        callSite = _59.c("\u00fe", (Object)this, 1088466960391979522L, (long)l2);
                        if (n != 0) break block14;
                        if (_59.c("t", (Object)callSite, (Object)class_19232, 1087089079825018590L, (long)l2) != false) break block15;
                    }
                    catch (MatchException matchException) {
                        throw _59.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _59.a(matchException);
                }
            }
            callSite = _59.c("t", (Object)_59.c("\u00fe", (Object)this, 1087839641156129738L, (long)l2), 1090733591554033758L, (long)l2);
        }
        CallSite callSite2 = _59.c("t", (Object)callSite, 1086059186477935706L, (long)l2);
        while (_59.c("t", (Object)callSite2, 1089073253975184017L, (long)l2) != false) {
            block17: {
                Object object;
                int n4;
                reference v3;
                class_2338 class_23382;
                Map.Entry entry;
                block16: {
                    entry = (Map.Entry)((Object)_59.c("t", (Object)callSite2, 1084552208556091773L, (long)l2));
                    class_23382 = (class_2338)_59.c("t", (Object)entry, 1090593471951757944L, (long)l2);
                    try {
                        try {
                            try {
                                v3 = _59.c("t", (Object)class_23382, 1089695434730861425L, (long)l2) >> 4;
                                n4 = n3;
                                if (l2 <= 0L || n != 0) break block16;
                                if (v3 != n4) break block17;
                            }
                            catch (MatchException matchException) {
                                throw _59.a(matchException);
                            }
                            object = class_23382;
                            if (n != 0) break block17;
                        }
                        catch (MatchException matchException) {
                            throw _59.a(matchException);
                        }
                        v3 = _59.c("t", (Object)object, 1090971288047053416L, (long)l2) >> 4;
                        n4 = n2;
                    }
                    catch (MatchException matchException) {
                        throw _59.a(matchException);
                    }
                }
                try {
                    if (v3 == n4) {
                        object = _59.c("t", (Object)_59.c("\u00fe", (Object)this, 1087839641156129738L, (long)l2), (Object)class_23382, (Object)((class_2248)_59.c("t", (Object)entry, 1087377331973251346L, (long)l2)), 1085806951890016983L, (long)l2);
                    }
                }
                catch (MatchException matchException) {
                    throw _59.a(matchException);
                }
            }
            if (n == 0) continue;
        }
    }

    private void cfr_renamed_232(Object[] objectArray) {
        class_2818 class_28182 = (class_2818)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (l2 = b ^ l2) ^ 0x50756A5EC7A2L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 48);
        int n3 = (int)(l3 << 48 >>> 48);
        _59.c("t", (Object)_59.c("\u00fe", (Object)this, -4438619112741167053L, (long)l2), () -> this.cfr_renamed_9(class_28182, n, (char)n2, (char)n3), -4437992204364810896L, (long)l2);
    }

    public _59(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0xF18088AC201L;
        long l5 = l3 ^ 0x19F7F83EA394L;
        long l6 = l3 ^ 0x997CAF7DA07L;
        long l7 = l3 ^ 0x4FCF6F7D2BFDL;
        long l8 = l3 ^ 0x500FFC59C48FL;
        long l9 = l3 ^ 0x386EFB49C411L;
        int n = (int)(l9 >>> 32);
        int n2 = (int)(l9 << 32 >>> 48);
        int n3 = (int)(l9 << 48 >>> 48);
        super((int)_59.a("t", 14025, (long)(0x152D122B7946621EL ^ l2)), -1, (_4r)((Object)_59.c("F", -9021796850804628485L, (long)l2)), l7);
        this.cfr_renamed_7 = new _92((int)_59.a("t", 3261, (long)(0x6CED7482292E5860L ^ l2)), 1.0, l6, 255.0, 125.0, 1.0);
        this.cfr_renamed_8 = new _9r((int)_59.a("t", 1399, (long)(0x64064306651651ABL ^ l2)), false, l5);
        this.cfr_renamed_3 = new _9t_0(l4, (int)_59.a("t", 26838, (long)(0x18117B30DE313C0EL ^ l2)));
        this.cfr_renamed_0 = new ConcurrentHashMap();
        this.cfr_renamed_1 = _59.c("A", -9022296326899966368L, (long)l2);
        this.cfr_renamed_6 = new HashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_59.c("\u00fe", (Object)this, -9024525652047407493L, (long)l2), _59.c("\u00fe", (Object)this, -9021062347295368374L, (long)l2), _59.c("\u00fe", (Object)this, -9023667168563016017L, (long)l2)};
        objectArray[0] = l8;
        _59.c("t", (Object)this, (Object)objectArray, -9023192666876493832L, (long)l2);
        _59.c("t", (Object)_59.c("\u00fe", (Object)this, -9023667168563016017L, (long)l2), () -> this.cfr_renamed_3(n, (short)n2, (short)n3), -9022748986660873414L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_59.class, 12);
                _59.b = l.a(8123552520960189818L, 4506038872366099347L, MethodHandles.lookup().lookupClass()).a(269624185451088L);
                _59.j = new Object[141];
                _59.k = new String[141];
                _59.b();
                _59.f = new HashMap<K, V>(13);
                var0 = _59.b ^ 130050851649726L;
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
                var6_5 = "\u00d5\u00e2\u0098R\u00a7J\u00fb\u00ef<\u00ba*\u00f8\u00e98\u00d9\u00a1\u00bea\u008f\"\u00ce[9s\u0099\u00f3\u0019\u009f\f\u00a6\u00bd\u00d4\u00d7\u0098\u00f7O\u00bc\u0019\u0010\u00fc\u00f2n\u00d33\r\u00f8\u0090*\u0010m\u00fc\u001a\u00c3^\u00f2\"\u009eL\u001e\u007f\u008b\u00db\u00ed\u0089\u00a5\u00cb\u00b2\u00ea\u0006\u00e8\u00a4]";
                var7_6 = "\u00d5\u00e2\u0098R\u00a7J\u00fb\u00ef<\u00ba*\u00f8\u00e98\u00d9\u00a1\u00bea\u008f\"\u00ce[9s\u0099\u00f3\u0019\u009f\f\u00a6\u00bd\u00d4\u00d7\u0098\u00f7O\u00bc\u0019\u0010\u00fc\u00f2n\u00d33\r\u00f8\u0090*\u0010m\u00fc\u001a\u00c3^\u00f2\"\u009eL\u001e\u007f\u008b\u00db\u00ed\u0089\u00a5\u00cb\u00b2\u00ea\u0006\u00e8\u00a4]".length();
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
                    var6_5 = "`rb\u00a7h\u008eW\u0097);\u00fc\u0015\u00a92i\u0007";
                    var7_6 = "`rb\u00a7h\u008eW\u0097);\u00fc\u0015\u00a92i\u0007".length();
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
        _59.d = var8_3;
        _59.e = new Integer[11];
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
            case 0 -> 31;
            case 1 -> 40;
            case 2 -> 20;
            case 3 -> 6;
            case 4 -> 42;
            case 5 -> 28;
            case 6 -> 23;
            case 7 -> 51;
            case 8 -> 32;
            case 9 -> 61;
            case 10 -> 54;
            case 11 -> 26;
            case 12 -> 50;
            case 13 -> 12;
            case 14 -> 9;
            case 15 -> 37;
            case 16 -> 39;
            case 17 -> 60;
            case 18 -> 53;
            case 19 -> 34;
            case 20 -> 62;
            case 21 -> 10;
            case 22 -> 27;
            case 23 -> 4;
            case 24 -> 55;
            case 25 -> 44;
            case 26 -> 45;
            case 27 -> 3;
            case 28 -> 33;
            case 29 -> 5;
            case 30 -> 48;
            case 31 -> 57;
            case 32 -> 11;
            case 33 -> 49;
            case 34 -> 15;
            case 35 -> 19;
            case 36 -> 58;
            case 37 -> 52;
            case 38 -> 56;
            case 39 -> 47;
            case 40 -> 63;
            case 41 -> 16;
            case 42 -> 2;
            case 43 -> 21;
            case 44 -> 7;
            case 45 -> 0;
            case 46 -> 36;
            case 47 -> 43;
            case 48 -> 22;
            case 49 -> 18;
            case 50 -> 8;
            case 51 -> 29;
            case 52 -> 59;
            case 53 -> 1;
            case 54 -> 14;
            case 55 -> 46;
            case 56 -> 17;
            case 57 -> 38;
            case 58 -> 41;
            case 59 -> 24;
            case 60 -> 35;
            case 61 -> 13;
            case 62 -> 25;
            default -> 30;
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
        _59.k[n3] = new String(cArray);
        return n3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _59.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "?vRY~<?vE\u0005r3%=E\u001br&\"L\u0014D m";
        objectArray[1] = Integer.TYPE;
        _59.k[1] = "java/lang/Integer";
        objectArray[2] = "\u0012\u0000(AGJ\f\b2\u000e$^\b";
        objectArray[3] = ";C:\u000e!P0L+A@^;G/\u001b";
        objectArray[4] = "8iZ\u0007=G&a@H@W&";
        objectArray[5] = Boolean.TYPE;
        _59.k[5] = "java/lang/Boolean";
        objectArray[6] = "LOd!riRG~n\u0015hC\\s43n";
        objectArray[7] = "OQW{:*RDU:?v\u001e\r";
        objectArray[8] = ")tWwP37|M83'31dx\n4:";
        objectArray[9] = "v^%\u001b=\u001fkK'Z8C+O";
        objectArray[10] = "\u001c2\u001d%Tt\u0001'\u001fdQ(@\u0015";
        objectArray[11] = "/\fqs\u000b\u001dZ,z|\u001aR;\"qw\u001e\bO";
        objectArray[12] = "\\?\u0005y1|\\?\u0012%=sFt\u0012;=fA\u0005Cnj%";
        objectArray[13] = "Kj96;!Kj.j7.Q!.t7;VPz!dz";
        objectArray[14] = "-\n]\u0011AX3\u0002G^=L)\u000fD\u001d";
        objectArray[15] = "j{<\t]\u000fj{+UQ\u0000p0+KQ\u0015wA\u007f\u001e\u0002U";
        objectArray[16] = ",T\u0013\f-\u00041A\u0011M(Xq\u0004";
        objectArray[17] = "TQ\u000f%a8_^\u001ej\u001d!P^\u0018&#1";
        objectArray[18] = "Jv C\u001c_Wc\"\u0002\u0019\u0003\u0017!";
        objectArray[19] = "\u0005\\__S.\u0018I]\u001eVrXK";
        objectArray[20] = "HI\u000eC.OU\\\f\u0002+\u0013\u0018^";
        objectArray[21] = "k/\u001aKGfv:\u0018\nB:92";
        objectArray[22] = "^)\u0016\u0005t.+\t\u001d\neaJ\u0007\u0016\u0001a;>";
        objectArray[23] = Void.TYPE;
        _59.k[23] = "java/lang/Void";
        objectArray[24] = ".k\b>\u000300c\u0012qN**i\u000b-_ *~P\u001cB+'\u007f\f-H+0B\u001f,E\b%z";
        objectArray[25] = "?\u000f)\b[5!\u00073G\u0016/;\r*\u001b\u0007%;\u001aq*\u001a.6\u001b-\u001b\u0010.!&>\u001a\u001d\r4\u001e{\"\u00109\u0006\u000b+?\u001c%\"";
        objectArray[26] = "Gb\u000e\u0013\u0012oYj\u0014\\_uC`\r\u0000N\u007fCwV7D\u007fNv\f\u001dNIHq\u000e\u001b_\u007f";
        objectArray[27] = "@`A\u0004\u001a7^h[Kx+Yu";
        objectArray[28] = "\u00143\u000bU`|\n;\u0011\u001a-f\u00101\bF<l\u0010&Sr;}\u000b \u0018";
        objectArray[29] = "/%wCW\\/%`\u001f[S5n`\u0001[F2\u001f1[\r\u0007";
        objectArray[30] = "#B]Wp\u0001#BJ\u000b|\u000e9\tJ\u0015|\u001b>x\u001aH-";
        objectArray[31] = "\u007ftN]hj\u007ftY\u0001dee?Y\u001fdpbN\f@=";
        objectArray[32] = "\u001f\u0001^b~y\u001f\u0001I>rv\u0005JI rc\u0002;\u001bu!#";
        objectArray[33] = "JRZ\u0002{u?rQ\rj:^|Z\u0006n`*";
        objectArray[34] = "\u00163,\u001aX\n\u00163;FT\u0005\fx;XT\u0010\u000b\tj\f\u0004[";
        objectArray[35] = "\u007f\u0002SkP\u007f\u007f\u0002D7\\peID)\\eb8\u0010q\u000b";
        objectArray[36] = "|\b\rN\u0013ya\u001d\u000f\u000f\u0016%,+";
        objectArray[37] = "\tX$d\u0017\u001b|x/k\u0006T\u001dv$`\u0002\u000ei";
        objectArray[38] = "Z\u000f\u007f\u0000z/Z\u000fh\\v @DhBv5G59\u0016 r";
        objectArray[39] = "|`w7Azbhmx\f`xbt$\u001djxu/\u0013\u0017jutu9\u001d|";
        objectArray[40] = "pD#TS:pD4\b_5j\u000f4\u0016_ m~eL\u0006c";
        objectArray[41] = "Z\u0000\u007f!N0Z\u0000h}B?@KhcB*G:9=\u0017a";
        objectArray[42] = ":k\u007f\u00142 :khH>/  hV>:'Q9\u0002m\u007f";
        objectArray[43] = "\u0018EW)\u00022me\\&\u0013}\fkW-\u0017'x";
        objectArray[44] = "\u0000\"J\u007f\fhu\u0002Ap\u001d'\u0014\fJ{\u0019}`";
        objectArray[45] = "(\u007fDG3\u001e\u001eZDG$B\u0012U^\f$\\\u0012@Y}u\bA\u0005\u0011";
        objectArray[46] = "vbk\to\u0005\u0003B`\u0006~JbLk\rz\u0010\u0016";
        objectArray[47] = "\n6\f\\\u0005\u0015\u0017#\u000e\u001d\u0000IW+";
        objectArray[48] = "cV7Rc\"~C5\u0013f~3X";
        objectArray[49] = "|Qsf*L|Qd:&Cf\u001ad$&Vak5|t";
        objectArray[50] = "J{''U5?[,(Dz^U'#@ *";
        objectArray[51] = "7&a<V'7&v`Z(-mv~Z=*\u001c&#\u000e";
        objectArray[52] = Long.TYPE;
        _59.k[52] = "java/lang/Long";
        objectArray[53] = Double.TYPE;
        _59.k[53] = "java/lang/Double";
        objectArray[54] = "A\u0012:\u0011\u001fk421\u001e\u000e$U<:\u0015\n~!";
        objectArray[55] = "p\u0016\u0007Q\u0010y\u00056\f^\u00016d8\u0007U\u0005l\u0010";
        objectArray[56] = "\f*aytw\u0007%p6\u0017z\u0012#";
        objectArray[57] = "NT\u0004b\u001dl;t\u000fm\f#Zz\u0004f\by.";
        objectArray[58] = "u<\u0019=5Amx\u0011:\u000eN\u007f9\u001e b|)|Bx1++y\u0015;|\u0015.y\u001a&\u000e";
        objectArray[59] = "J\u001dL+`D\u0012\u001cLr\u0003AuN\u0013'\u007f\fKK\u0013(b";
        objectArray[60] = "\u0000n?FKy\u0012<2H0\u007f\u000e#n\u0010\\MZf3M\u000b\u001aZce\u000bB$_cj\u00160";
        objectArray[61] = "F `4(\u0002\u001dsd#O\u0014\u0017<&Nu\u001e\u0011,b73\u0019\u00181Z";
        objectArray[62] = "^K}4+9\u001e]sa\u0013mbU.2s/\rPx(hS";
        objectArray[63] = "\u0018\u0011=\u0012(\u001c\u001b\u001e>O\u0010\u0012`M=\bu\u0012\u0019\u0004t\n(T`\u0016<\u0010,QQ\u0004>\u000f~,";
        objectArray[64] = "1kj(\u0017*bj+$'(wy,0[.q\u0014j5\u001d3ld1f\u0019$\u000b";
        objectArray[65] = "eDN@W\u000b?QN\u001b0\u00151MY[]ofDUE\b\u0016 C\\X0U0C^\u001dI\u00137JC%";
        objectArray[66] = "T:\u0013\\\rUQ&Q[sP_%O]\u001fb\u000bc\u0017\u0002M5L7]GCI\b`MTs";
        objectArray[67] = "VC;]\u0015qMG:\u001f%-f?y\u001cZx\u0018F0UX%^?/\u001fF}ZP*I\\f&";
        objectArray[68] = "D[M/'uN\u0006\u000fsYs\u0018GR+5AL\u0003\bv`\u0016OWY,ao\tPP1Y&\u0013TO (,\fQIL";
        objectArray[69] = "\u000e=)zEZ_1$g\u007f\u001acxuz\u001a\u001d\u001a1<xG[c.vf\u001f_\f+ |\u0004#";
        objectArray[70] = "\t+9H.2S>9\u0013I=T* WI9\b$)Q&<^>2-";
        objectArray[71] = "GWK\u000e^LDA\u0011\u0017%\u001a+\u0014\u0011U\u001fD\u001aT\u0015\u0015[E+\u0016N\u000bOQN@\u0014T\u001a ";
        objectArray[72] = ":B>\u0012X\u0013`W>I?\u0018nRNMS\u001cc\u00167\u000bT\u0015~.t\u001bT\u0017;W2\u001c]\n\u0003";
        objectArray[73] = "HI\u0007aTo\u0012\\\u0007:3j\nh\u0012|Ozq\u001e\u0010`Yz\u0014HJ?\f\u000b";
        objectArray[74] = "g\u0003k=\u001b\u001d6\u000ff !U\nDk&K\u0015o\u00121y\u001ed";
        objectArray[75] = "]K8\f-t\u0005J8UNr'!bW%2\u0010\u001fgW*/";
        objectArray[76] = "c\u0006\u000b#C6#\u0010\u0005v{f_I\u0006/\u0017.`\u0013P)\u0003";
        objectArray[77] = "znCgG.tz\u0013p~:k}Hl\u0012\b?;\u00126B_?=Cw\fa:=Lj~f:jTy@c:eI\u000bGcm}Z5Bcb`(pB 8=\u0019;\fn}\u0001";
        objectArray[78] = "\u0005\tf`\u0001t\u0003Ee,;c\u0000T|1l4^\u0003$]\\t\u0006C#7D0\u000eD";
        objectArray[79] = "\rE\u0014gu(WP\u0014<\u00124IUd8~'T\u0011\u001d~y.I)^ny,\fP\u0018ip14\u0013\birtMU\u000f`oL";
        objectArray[80] = "]o\u0011$G\u0019\u001dy\u001fq\u007fOau\u00023\u0015K\u0018~\u001f.F";
        objectArray[81] = "mq\u000f\u000e\u001aP>pN\u0002*X0hO\u0016KU,\u000e\t\u0013ASowO\u0014HNW5T\u001b@B2c\u000eD\u00153";
        objectArray[82] = "x;\u0013&~,~w\u0010jD;}f\tw\u0013l\";R\u001b ,ni\u0003+z0 {";
        objectArray[83] = "Do37LwLke~.c@<:`y<\u0018ag\f\u00171J-,2\u00121E0";
        objectArray[84] = "\u0002#{dZ\u0006\u0001n+l?\n\u001d-paS8Ka-<\u0006oIm{zMQLmtg?";
        objectArray[85] = "\u0015\u001a\u0014$@\rNQJ;2\tFVu V\u001bF*\u0011%Y\u0006\u0013SW\"P\u001b+";
        objectArray[86] = "WxyeZo\u0004y8ijg\tj,njcUd%h\u0005f\u0003~>\u0014";
        objectArray[87] = "]|5\u001f{,E8=\u0018@#Wy2\u0002,\u0011\u0001<nZqF\u000399\u00192x\u000696\u0004@";
        objectArray[88] = "e\u001dQjU\u00048\u0019\u00132.T\u007f)I,RYc\rOQ\u0015R`\u0018X4C\b?M)";
        objectArray[89] = ")7'O:i!3q\u0006X}-d.\u0018\u000f\"u9rta/'u8Jd/(h";
        objectArray[90] = "E*a\f\\\\\u0005<oYd\rybf\u0019\u0001Q\u001d8s\u0019Z";
        objectArray[91] = "2\\\u0015H>ArJ\u001b\u001d\u0006\u0014P-G\u0016yN0T\u000e_{\u0013v-\u0011\u0015eKrB\u0014C\u007fP\u000e";
        objectArray[92] = "{2\u001e\u0014jx!.P\u0006\u0004-r7\f\u0011h\u001f/v]I\u00041n1]H\u007f4v&\rv";
        objectArray[93] = "m\u0002=\u0016[w}N2C!wiN+fGm\u0004\u0007kL]c:\u0002kC@\u0011=\u0002<[S/8\u00023F!";
        objectArray[94] = "`*F\\e-=.\u0004\u0004\u001ega8B\u000bycg\u0003Y\u0018\u001e~;\"\u0002\u001a/l9=Pg";
        objectArray[95] = "\rGp\u0016\u0002RMQ~C:\u00001Wt\u000b\u0001C\u0000\npIY";
        objectArray[96] = "h\u0013H\u001b)T5\u0017\nCR\u001et\u0016UA.eb\u0010\fGn]c\u0005]\u0019R\u0007q\fR^ Zo\u0016\b ";
        objectArray[97] = "\u000b01\u0010\u0007c\b*pV~I\u0015\"lQ~m\n~;S\u000fn\u0010?}";
        objectArray[98] = "-\u0000\u001c\f%\u007f(\u001c^\u000b[z&\u001f@\r7HrY\u0018Rg\u001f.]MQ9e&Y\u001b\u0018[";
        objectArray[99] = "t\u0010Y\u000e%\u001c4\u0006W[\u001dKH\rH\t|\r$\u000e^Se";
        objectArray[100] = "b\u0018{\u001cAx1\u0019:\u0010qr4\u000bGW\u001dp8_>\u0011\u001ay%g|\n\u0015q)\u0002*PJ$X";
        objectArray[101] = "V\u001e,e'\u001f\u0016\b\"0\u001fDjU8<nE\t\u00069}b";
        objectArray[102] = "3\u000e#F*ds\u0018-\u0013\u0012?j\u007fq\u0018mk1\u00068Qo6w\u007f'\u001bqns\u0010\"Mku\u000f";
        objectArray[103] = "\\k_-\")\u0006=Y9P*b4\r>5(\u001b}D<hnb7I}!&\u0001dH<-\u0016";
        objectArray[104] = "R5xn\nKI1y,:\u001d\"89$PKNy~sC";
        objectArray[105] = "CB`6\u007f\u0001C\to0\u0003$btC\u001dY~CB`6\u007f\u0001C\to0";
        objectArray[106] = "\u0010QC=\u0019ZPGMh!\u0000,\u0019D(DWHCQ(\u001f";
        objectArray[107] = "8\u000fGlE2}\u0006Cf\u007f-/\u001e\u007fc\u0019$&\fxb\u0005&+\rir\u0012 ?\u001dCx\u007f*-\u0019\u001fyNw)[G\u0002";
        objectArray[108] = "3\u0006?>O\u00029\u0019:8#\u0013j\u001b0\bD\u001fn`i\u007fH\u000fq^l\u007fG\u0012\u0003";
        objectArray[109] = "x\u0001\u001fi@\u00128\u0017\u0011<xH\bpM7\u0007\u001dz\t\u0004~\u0005@<p\u001b4\u001b\u00188\u001f\u001eb\u0001\u0003D";
        objectArray[110] = "@\u00040'OYFH3kuNEY*v\"\u0019\u001a\u0005v\u001a\u0007ROV+s\u0004\u001f\u001f^";
        objectArray[111] = ".a\tSw1o&^@\u001b3>6]ULddf\u00039\"d24UX!464Z";
        objectArray[112] = "5[}p?g!\u001dv \u000em7_\u000e#\u007fP7\\M.pr8A3pu;c ";
        objectArray[113] = "KQ*\u0019ia\u0011Md\u000b\u00074BT8\u001ck\u0006\u001f\u0014iD\u0007h\u0013C$\t9m\u0013L9{>mDT*E;mKIX\u001ddmIV8\u0018x/N(";
        objectArray[114] = "(Q^C%!.[\u001bKF~ ZCD\u0011,x\u000e\u0018\u0015F!!HDV%+|\n\u0018";
        objectArray[115] = "\u00184#\u0000^\"\u00100uI<=\u0010v.\\P\u000fM1t\u000b<aAa2I\u0002dAn/;";
        objectArray[116] = "\roF1\u0014[]nLC\u001f\bMdG/-\\\t>\u001exz\\\ro\\1DY\r`AC";
        objectArray[117] = "8h\u0010[I\u001c=tR\\7\u00193wLZ[+e1\u001c\f\u000e|g7GAEBb7H\\7";
        objectArray[118] = "(e\u001atLJi\"Mg H82Nrw\u001fbb\u0012\u001e\u0019\u001f40F\u007f\u001aO00I";
        objectArray[119] = "i\u0011q;\f=\"_?~0i\u007fQnb\\[(\u00134=\f\fiO5;W3\"Q7|0";
        objectArray[120] = ":F<M6;(D#\u001fKk$\u0011!\u00187m\"|g\u001dqp?\f<NugX";
        objectArray[121] = "\u0002\b\u000b>P\u0016\u0019\f\n|`B=tI\u007f\u001f\u001fL\r\u00006\u001dB\nt\u001f|\u0003\u001a\u000e\u001b\u001a*\u0019\u0001r";
        objectArray[122] = "vi^]C\u0017`5\u0005] S\u001c<\u000b[GU$=\u001e\n\u0019ivi^]C\u0017`5\u0005] ";
        objectArray[123] = ".\fC\rvQn\u001aMXN\u000b\u0012D\u0013\u0017+\u0005k\rZ\u0015vC\u0012BB\u000b)X(\u001aC\u000bp;";
        objectArray[124] = "ME_\u0012U2\u0017\u0013Y\u0006'=s\u001a\r\u0001B3\nSD\u0003\u001fus\u001c\\\u001d@nID]\u001d\u0019\r";
        objectArray[125] = "\u0003\u0016W]\u0010/XESJw?V\u0001+J\u0007#?A\nC\u001d.Z\u0017P\u001cH_";
        objectArray[126] = "2.^`2!:*\b)P>:lS<<\fg+\tePbk{O)ngktR[";
        objectArray[127] = "\u001bWkz\u001e\u0003HV*v.\u0001Ze2sR\u0011!\u00130oD\u0011DEj0\u0011`";
        objectArray[128] = "~M\u000bI\\+?\n\\Z0)n\u001a_Og~4J\u0002#\t~b\u0018WB\n.f\u0018X";
        objectArray[129] = "F%No3,\u0017)Cr\tl+=\u0019n4oR;Umx";
        objectArray[130] = "2:\u0013-=91kG`-\u0001bk\u0002Px=`}\u000bn}=o`yi}jwsGl}ej\u0001";
        objectArray[131] = "?\u001f\b\u0006F?dTV\u00194;lSt\u0006ET;C\\\u000b\f-}DU\u00164";
        objectArray[132] = "W\u000e\u001aH\u0012/E\\\u0017Fi)YCK\u001e\u0005\u001b\r\u0006\u0016CUL\r\u0003@\u0005\u001br\b\u0003O\u0018i";
        objectArray[133] = "MjS&:O\u0017\u007fS}]F\u0012zY2\u0006F\b\u0006\u0019<aZDeJ= Vt";
        objectArray[134] = "Nf\u0015@\u007f\u000f\u001eg\u001f2t\\\u000em\u0014^F\bJ7M\n\u0011\bNf\u000f@/\rNi\u00122";
        objectArray[135] = "tvyg\"a\u007fkd4\u001a%\u001f70r\u007f&f~yp\"`\u001f77ffj!27i{\u0018";
        objectArray[136] = "5dT3APee^AJ\u0003uoU-xW15\f}/W5dN3\u0011R5kSA";
        objectArray[137] = "\u0004Tv\u0018U8\\UvA62;\u0007)\u0014Jp\u0005\u0002)\u001bW";
        objectArray[138] = "N7\u0011\bs3@#A\u001fJ'_$\u001a\u0003&\u0015\th@UpB\t?\u001e\u000e;'_eA[J";
        objectArray[139] = "wq\u0003z;o-d\u0003!\\`){\u000fv=m5^\u001en\\1\"v\u0013'%w%\u007f\u000e\u001fgl*w\u0002z16u\"s";
        Object[] objectArray2 = objectArray;
        objectArray[140] = "=i~\u0010I1}\u007fpEqe\u0001ad\u000f@ezd|\u0018\u0010";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == 'E' || c == 'F' || c == 'u') {
                field = _59.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _59.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/59" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _59.e(l2, l3);
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
                clazz3 = _59.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _59.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _59.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _59.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _59.f(240771762441930L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _59.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _59.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _59.f(240771762441930L, 0L);
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
            int n = _59.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _59.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _59.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _59.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _59.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _59.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _59.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5608;
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
                throw new RuntimeException("dev/krypton/59", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _59.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/59" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _59.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _59.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _59.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _59.c(clazz3, string2, clazz2)) != null) {
                    _59.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _59.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _59.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _59.f(240771762441930L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_4(_6Q q) {
        long l2 = b ^ 0x2EC13ABCF8E5L;
        long l3 = l2 ^ 0x33F335D23A94L;
        class_1923 class_19232 = new class_1923((int)_59.c("t", (Object)q.cfr_renamed_5, -8847517702695357436L, (long)l2), (int)_59.c("t", (Object)q.cfr_renamed_5, -8855941690862434981L, (long)l2));
        CallSite callSite = _59.c("t", (Object)_59.c("\u00fe", (Object)_59.c("\u00fe", (Object)this, -8856294062306012868L, (long)l2), -8850475494653082327L, (long)l2), (int)_59.c("\u00fe", (Object)class_19232, -8850549104917883202L, (long)l2), (int)_59.c("\u00fe", (Object)class_19232, -8850080044590469978L, (long)l2), -8852907452558058831L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = callSite;
        _59.c("t", (Object)this, (Object)objectArray, -8849962713181825279L, (long)l2);
    }

    @Override
    public native void cfr_renamed_2();

    private void cfr_renamed_3(int n, short s, short s2) {
        block5: {
            _59 v0;
            long l2;
            block4: {
                l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ b;
                int n2 = _3C.cfr_renamed_7();
                try {
                    try {
                        v0 = this;
                        if (n2 == 0) break block4;
                        if (_59.c("t", (Object)v0, 4253816340253726465L, (long)l2) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _59.a(matchException);
                    }
                    v0 = this;
                }
                catch (MatchException matchException) {
                    throw _59.a(matchException);
                }
            }
            _59.c("t", (Object)v0, 4257499454069239537L, (long)l2);
        }
    }

    /*
     * Exception decompiling
     */
    private void cfr_renamed_7(int var1_1, int var2_2, int var3_3, long var4_4, boolean var6_5, class_2248 var7_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[WHILELOOP]], but top level block is 19[WHILELOOP]
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
     * Exception decompiling
     */
    private void cfr_renamed_9(class_2818 var1_1, int var2_2, char var3_3, char var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[WHILELOOP], 20[DOLOOP]], but top level block is 22[WHILELOOP]
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_9(_6l_0 var1_1) {
        block34: {
            block33: {
                block32: {
                    block30: {
                        block31: {
                            block29: {
                                block28: {
                                    block27: {
                                        block26: {
                                            block24: {
                                                block25: {
                                                    v0 = var2_2 = _59.b ^ 9431772036799L;
                                                    var4_3 = v0 ^ 28037198047936L;
                                                    var6_4 = v0 ^ 135797619611900L;
                                                    var8_5 = _3C.cfr_renamed_7();
                                                    v1 = new Object[1];
                                                    v1[0] = var6_4;
                                                    var9_6 = _59.c("t", (Object)_59.c("\u00fe", (Object)this, (long)-8975317154580836581L, (long)var2_2), (Object)v1, (long)-8972415236753783899L, (long)var2_2);
                                                    try {
                                                        v2 = _59.c("t", (Object)var9_6, (long)-8971857886657013097L, (long)var2_2);
                                                        if (var8_5 == 0) break block24;
                                                        if (v2 == false) break block25;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw _59.a(v3);
                                                    }
                                                    return;
                                                }
                                                v2 = _59.c("t", (Object)var1_1.cfr_renamed_8, (long)-8971321629785850095L, (long)var2_2);
                                            }
                                            var10_7 = v2;
                                            var11_8 = _59.c("t", (Object)var1_1.cfr_renamed_8, (long)-8989071778152272261L, (long)var2_2);
                                            var12_9 = _59.c("t", (Object)var1_1.cfr_renamed_8, (long)-8988061014644005368L, (long)var2_2);
                                            var13_10 = _59.c("t", (Object)var1_1.cfr_renamed_3, (long)-8971270244550086576L, (long)var2_2);
                                            var14_11 = _59.c("t", (Object)var1_1.cfr_renamed_2, (long)-8971270244550086576L, (long)var2_2);
                                            try {
                                                try {
                                                    v4 /* !! */  = _59.c("t", (Object)var9_6, (Object)var14_11, (long)-8973972589470309698L, (long)var2_2);
                                                    if (var8_5 == 0) break block26;
                                                    if (v4 /* !! */  == false) break block27;
                                                }
                                                catch (MatchException v5) {
                                                    throw _59.a(v5);
                                                }
                                                v4 /* !! */  = _59.c("t", (Object)var9_6, (Object)var13_10, (long)-8973972589470309698L, (long)var2_2);
                                            }
                                            catch (MatchException v6) {
                                                throw _59.a(v6);
                                            }
                                        }
                                        try {
                                            if (var8_5 == 0) break block28;
                                            if (v4 /* !! */  != false) break block27;
                                        }
                                        catch (MatchException v7) {
                                            throw _59.a(v7);
                                        }
                                        v4 /* !! */  = (CallSite)true;
                                        break block28;
                                    }
                                    v4 /* !! */  = (CallSite)false;
                                }
                                var15_12 /* !! */  = v4 /* !! */ ;
                                try {
                                    try {
                                        v8 /* !! */  = var15_12 /* !! */ ;
                                        if (var8_5 == 0) break block29;
                                        if (v8 /* !! */  != false) break block30;
                                    }
                                    catch (MatchException v9) {
                                        throw _59.a(v9);
                                    }
                                    v8 /* !! */  = _59.c("t", (Object)var9_6, (Object)var14_11, (long)-8973972589470309698L, (long)var2_2);
                                }
                                catch (MatchException v10) {
                                    throw _59.a(v10);
                                }
                            }
                            try {
                                try {
                                    if (var8_5 == 0) break block31;
                                    if (v8 /* !! */  != false) break block30;
                                }
                                catch (MatchException v11) {
                                    throw _59.a(v11);
                                }
                                v8 /* !! */  = _59.c("t", (Object)var9_6, (Object)var13_10, (long)-8973972589470309698L, (long)var2_2);
                            }
                            catch (MatchException v12) {
                                throw _59.a(v12);
                            }
                        }
                        try {
                            if (var8_5 == 0) break block32;
                            if (v8 /* !! */  == false) break block30;
                        }
                        catch (MatchException v13) {
                            throw _59.a(v13);
                        }
                        v8 /* !! */  = (CallSite)true;
                        break block32;
                    }
                    v8 /* !! */  = (CallSite)false;
                }
                var16_13 /* !! */  = v8 /* !! */ ;
                try {
                    v14 /* !! */  = var15_12 /* !! */ ;
                    if (var8_5 == 0) break block33;
                    if (v14 /* !! */  == false) {
                    }
                    ** GOTO lbl100
                }
                catch (MatchException v15) {
                    throw _59.a(v15);
                }
                v14 /* !! */  = var16_13 /* !! */ ;
            }
            try {
                if (v14 /* !! */  == false) break block34;
lbl100:
                // 2 sources

                _59.c("t", (Object)_59.c("\u00fe", (Object)this, (long)-8974058708814077664L, (long)var2_2), (Object)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, 4(int int int long boolean net.minecraft.class_2248 ), ()V)((_59)this, (int)var10_7, (int)var11_8, (int)var12_9, (long)var4_3, (boolean)var15_12 /* !! */ , (class_2248)var14_11), (long)-8972731956725894045L, (long)var2_2);
            }
            catch (MatchException v16) {
                throw _59.a(v16);
            }
        }
    }

    private _8B dev_krypton_8B_8(Object[] objectArray) {
        int[] nArray;
        CallSite callSite;
        long l2;
        int n;
        class_2248 class_22482;
        long l3;
        block6: {
            block7: {
                l3 = (Long)objectArray[0];
                class_22482 = (class_2248)objectArray[1];
                n = (Integer)objectArray[2];
                long l4 = l3 = b ^ l3;
                l2 = l4 ^ 0x38C5E4CB3293L;
                long l5 = l4 ^ 0x1C80CA4FA205L;
                int n2 = _3C.cfr_renamed_4();
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l5;
                objectArray2[0] = class_22482;
                CallSite callSite2 = _59.c("t", (Object)_59.c("\u00fe", (Object)this, 8133004435074235572L, (long)l3), (Object)objectArray2, 8129577423611456070L, (long)l3);
                try {
                    try {
                        callSite = callSite2;
                        if (n2 != 0) break block6;
                        if (callSite != null) {
                        }
                        break block7;
                    }
                    catch (MatchException matchException) {
                        throw _59.a(matchException);
                    }
                    return new _8B((int)_59.c("\u00fe", (Object)callSite2, 8133466054453582618L, (long)l3), (int)_59.c("\u00fe", (Object)callSite2, 8125618849962976345L, (long)l3), l2, (int)_59.c("\u00fe", (Object)callSite2, 8137821896663030888L, (long)l3), n);
                }
                catch (MatchException matchException) {
                    throw _59.a(matchException);
                }
            }
            callSite = _59.c("t", (Object)_59.c("\u00fe", (Object)this, 8132277845010812547L, (long)l3), (Object)class_22482, 8133280097508036934L, (long)l3);
        }
        if ((nArray = (int[])callSite) == null) {
            Random random = new Random((long)_59.c("t", (Object)_59.c("t", (Object)_59.c("F", 8129441034733941919L, (long)l3), (Object)class_22482, 8132400727371957879L, (long)l3), 8130711103012574042L, (long)l3));
            nArray = new int[]{(int)(_59.a("t", 19631, (long)(0x7E7E42CD62B66A6AL ^ l3)) + _59.c("t", (Object)random, (int)_59.a("t", 11634, (long)(0x7A2E3DBAA2900BB6L ^ l3)), 8131901981427041050L, (long)l3)), (int)(_59.a("t", 17560, (long)(0x53EF4380EC3CE25AL ^ l3)) + _59.c("t", (Object)random, (int)_59.a("t", 31784, (long)(0x5509CF1B3D115AE5L ^ l3)), 8131901981427041050L, (long)l3)), (int)(_59.a("t", 17560, (long)(0x53EF4380EC3CE25AL ^ l3)) + _59.c("t", (Object)random, (int)_59.a("t", 31784, (long)(0x5509CF1B3D115AE5L ^ l3)), 8131901981427041050L, (long)l3))};
            _59.c("t", (Object)_59.c("\u00fe", (Object)this, 8132277845010812547L, (long)l3), (Object)class_22482, (Object)nArray, 8133186432804889880L, (long)l3);
        }
        return new _8B(nArray[0], nArray[1], l2, nArray[2], n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_59.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_59.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

