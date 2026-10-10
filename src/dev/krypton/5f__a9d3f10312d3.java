/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_5250
 */
package dev.krypton;

import dev.krypton._0k_0;
import dev.krypton._3l;
import dev.krypton._4r;
import dev.krypton._6X;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._8F;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton.l;
import java.lang.invoke.CallSite;
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
import java.util.Optional;
import java.util.regex.PatternSyntaxException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;

/*
 * Renamed from dev.krypton.5f
 */
public class _5f_0
extends _6x_0 {
    private static final String cfr_renamed_0;
    private static final String cfr_renamed_2;
    private static final String cfr_renamed_1;
    private static final String cfr_renamed_261;
    private static final String cfr_renamed_5;
    private final _9E cfr_renamed_9;
    private final _6e_0 cfr_renamed_6;
    private final _6e_0 cfr_renamed_7;
    private final _6e_0 cfr_renamed_4;
    private final _6e_0 cfr_renamed_3;
    private final _6e_0 cfr_renamed_8;
    private final _6X cfr_renamed_376;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    private class_5250 net_minecraft_class_5250_1(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        ArrayList arrayList;
        long l2;
        String string;
        int n;
        long l3;
        block6: {
            block5: {
                Object object;
                block4: {
                    l3 = (Long)objectArray[0];
                    class_2561 class_25612 = (class_2561)objectArray[1];
                    int n2 = (Integer)objectArray[2];
                    n = (Integer)objectArray[3];
                    string = (String)objectArray[4];
                    long l4 = l3 = b ^ l3;
                    l2 = l4 ^ 0x226F29B44A17L;
                    long l5 = l4 ^ 0x647542FC1C5L;
                    long l6 = l5 >>> 16;
                    int n3 = (int)(l5 << 48 >>> 48);
                    arrayList = new ArrayList();
                    int n4 = _8F.cfr_renamed_7();
                    _5f_0.d("o", (Object)class_25612, (arg_0, arg_1) -> _5f_0.cfr_renamed_7(l6, arrayList, (short)n3, arg_0, arg_1), (Object)_5f_0.d("A", -8047781607378985159L, (long)l3), -8046678752262499843L, (long)l3);
                    int n5 = n4;
                    callSite2 = _5f_0.d("o", (Object)_5f_0.d("\u00ed", -8049695168626610071L, (long)l3), (Object)_5f_0.d("o", (Object)class_25612, -8047154000046030328L, (long)l3), -8049807528396132053L, (long)l3);
                    try {
                        try {
                            object = this;
                            if (n5 == 0) break block4;
                            Object[] objectArray2 = new Object[5];
                            objectArray2[4] = (int)_5f_0.d("\u00ed", (int)n2, (int)_5f_0.d("o", arrayList, -8048517076200971809L, (long)l3), -8046580715008605505L, (long)l3);
                            objectArray2[3] = 0;
                            objectArray2[2] = arrayList;
                            objectArray2[1] = l2;
                            objectArray2[0] = callSite2;
                            _5f_0.d("o", (Object)object, (Object)objectArray2, -8049362296610536514L, (long)l3);
                            if (n2 >= _5f_0.d("o", arrayList, -8048517076200971809L, (long)l3)) break block5;
                        }
                        catch (PatternSyntaxException patternSyntaxException) {
                            throw _5f_0.a(patternSyntaxException);
                        }
                        object = _5f_0.d("o", arrayList, (int)n2, -8046327096991662142L, (long)l3);
                    }
                    catch (PatternSyntaxException patternSyntaxException) {
                        throw _5f_0.a(patternSyntaxException);
                    }
                }
                callSite = _5f_0.d("o", (Object)((_0k_0)object), -8049874934937814119L, (long)l3);
                break block6;
            }
            callSite = _5f_0.d("A", -8047781607378985159L, (long)l3);
        }
        CallSite callSite3 = callSite;
        _5f_0.d("o", (Object)callSite2, (Object)_5f_0.d("o", (Object)_5f_0.d("\u00ed", string, -8049160558431535093L, (long)l3), (Object)callSite3, -8049807528396132053L, (long)l3), -8048138106537809729L, (long)l3);
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = (int)_5f_0.d("o", arrayList, -8048517076200971809L, (long)l3);
        objectArray3[3] = (int)_5f_0.d("\u00ed", (int)n, (int)_5f_0.d("o", arrayList, -8048517076200971809L, (long)l3), -8046580715008605505L, (long)l3);
        objectArray3[2] = arrayList;
        objectArray3[1] = l2;
        objectArray3[0] = callSite2;
        _5f_0.d("o", (Object)this, (Object)objectArray3, -8049362296610536514L, (long)l3);
        return callSite2;
    }

    public void cfr_renamed_185(Object[] objectArray) {
        _5f_0 f_0;
        int n;
        long l2;
        long l3;
        long l4;
        String string;
        block11: {
            block12: {
                string = (String)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4 = b ^ l4;
                long l6 = l5 ^ 0x746128A96CBFL;
                l3 = l5 ^ 0x674B29C66098L;
                long l7 = l5 ^ 0x3E8AD65E68ABL;
                l2 = l5 ^ 0x3DDD4D730CF0L;
                n = _8F.cfr_renamed_7();
                try {
                    try {
                        f_0 = this;
                        if (n == 0) break block11;
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l6;
                        objectArray2[0] = _5f_0.d("A", 4277549727019401276L, (long)l4);
                        if (_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)f_0, 4270771836712979280L, (long)l4), (Object)objectArray2, 4270553187286665433L, (long)l4) == false) break block12;
                    }
                    catch (PatternSyntaxException patternSyntaxException) {
                        throw _5f_0.a(patternSyntaxException);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = string;
                    objectArray3[0] = l7;
                    _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 4271362684518077759L, (long)l4), (Object)objectArray3, 4276321037527881816L, (long)l4);
                    return;
                }
                catch (PatternSyntaxException patternSyntaxException) {
                    throw _5f_0.a(patternSyntaxException);
                }
            }
            f_0 = this;
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l2;
        CallSite callSite = _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)f_0, 4270419408538503423L, (long)l4), (Object)objectArray4, 4271496166366935226L, (long)l4);
        int n2 = 0;
        while (n2 < _5f_0.d("o", (Object)callSite, 4271026799381351127L, (long)l4)) {
            Object object;
            block15: {
                block16: {
                    CallSite callSite2;
                    block13: {
                        block14: {
                            callSite2 = _5f_0.d("o", (String)((Object)_5f_0.d("o", (Object)callSite, (int)n2, 4277826186850768074L, (long)l4)), (int)_5f_0.c("v", 6185, (long)(0x3C39A602F19B81A8L ^ l4)), 4271233652256275948L, (long)l4);
                            try {
                                object = callSite2;
                                if (l4 <= 0L || n == 0) break block13;
                                if (object > 0) break block14;
                            }
                            catch (PatternSyntaxException patternSyntaxException) {
                                throw _5f_0.a(patternSyntaxException);
                            }
                            if (l4 > 0L) break block16;
                        }
                        object = _5f_0.d("o", (Object)_5f_0.d("o", (String)((Object)_5f_0.d("o", (Object)callSite, (int)n2, 4277826186850768074L, (long)l4)), 0, (int)callSite2, 4276998150081144420L, (long)l4), (Object)"$", 4271141278677939116L, (long)l4);
                    }
                    try {
                        if (l4 < 0L) break block15;
                        if (object != false) {
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = l3;
                            objectArray5[1] = (String)((Object)_5f_0.d("o", (String)((Object)_5f_0.d("o", (Object)callSite, (int)n2, 4277826186850768074L, (long)l4)), 0, (int)(callSite2 + true), 4276998150081144420L, (long)l4)) + string;
                            objectArray5[0] = n2;
                            _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 4270419408538503423L, (long)l4), (Object)objectArray5, 4276724331416761539L, (long)l4);
                            return;
                        }
                    }
                    catch (PatternSyntaxException patternSyntaxException) {
                        throw _5f_0.a(patternSyntaxException);
                    }
                }
                ++n2;
                object = n;
            }
            if (object != false) continue;
        }
    }

    private void cfr_renamed_296(Object[] objectArray) {
        class_5250 class_52502 = (class_5250)objectArray[0];
        long l2 = (Long)objectArray[1];
        List list = (List)objectArray[2];
        int n = (Integer)objectArray[3];
        int n2 = (Integer)objectArray[4];
        l2 = b ^ l2;
        int n3 = _8F.cfr_renamed_7();
        try {
            if (n >= n2) {
                return;
            }
        }
        catch (PatternSyntaxException patternSyntaxException) {
            throw _5f_0.a(patternSyntaxException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        CallSite callSite = _5f_0.d("o", (Object)((_0k_0)((Object)_5f_0.d("o", (Object)list, (int)n, -5242287692939716440L, (long)l2))), -5250341361631175437L, (long)l2);
        int n4 = n;
        block6: while (n4 < n2) {
            CallSite callSite2 = _5f_0.d("o", (Object)list, (int)n4, -5242287692939716440L, (long)l2);
            do {
                int n5;
                block10: {
                    block11: {
                        _0k_0 k_0;
                        block12: {
                            k_0 = (_0k_0)((Object)callSite2);
                            try {
                                try {
                                    n5 = n3;
                                    if (l2 >= 0L) {
                                        if (n5 == 0) break block6;
                                        n5 = n3;
                                    }
                                    if (l2 <= 0L) break block10;
                                    if (n5 == 0) break block11;
                                }
                                catch (PatternSyntaxException patternSyntaxException) {
                                    throw _5f_0.a(patternSyntaxException);
                                }
                                if (_5f_0.d("o", (Object)_5f_0.d("o", (Object)k_0, -5250341361631175437L, (long)l2), (Object)callSite, -5249554503418793422L, (long)l2) != false) break block12;
                            }
                            catch (PatternSyntaxException patternSyntaxException) {
                                throw _5f_0.a(patternSyntaxException);
                            }
                            _5f_0.d("o", (Object)class_52502, (Object)_5f_0.d("o", (Object)_5f_0.d("\u00ed", (Object)_5f_0.d("o", (Object)stringBuilder, -5249021570139002107L, (long)l2), -5250722028310124703L, (long)l2), (Object)callSite, -5250276259808291263L, (long)l2), -5249695006098436139L, (long)l2);
                            stringBuilder = new StringBuilder();
                            callSite = _5f_0.d("o", (Object)k_0, -5250341361631175437L, (long)l2);
                        }
                        _5f_0.d("o", (Object)stringBuilder, (char)_5f_0.d("o", (Object)k_0, -5243117598063239415L, (long)l2), -5243765777656457306L, (long)l2);
                        ++n4;
                    }
                    n5 = n3;
                }
                if (n5 != 0) continue block6;
                callSite2 = _5f_0.d("o", (Object)class_52502, (Object)_5f_0.d("o", (Object)_5f_0.d("\u00ed", (Object)_5f_0.d("o", (Object)stringBuilder, -5249021570139002107L, (long)l2), -5250722028310124703L, (long)l2), (Object)callSite, -5250276259808291263L, (long)l2), -5249695006098436139L, (long)l2);
            } while (l2 <= 0L);
        }
    }

    public _5f_0(int n, byte by, int n2) {
        long l2;
        long l3 = l2 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        long l4 = l3 ^ 0x5EC8A7FBAC5FL;
        long l5 = l3 ^ 0x3CC71C6368A8L;
        long l6 = l5 >>> 8;
        int n3 = (int)(l5 << 56 >>> 56);
        long l7 = l3 ^ 0x4EA328905D7L;
        long l8 = l3 ^ 0x408262F19990L;
        long l9 = l3 ^ 0x52EDD3C06302L;
        long l10 = l3 ^ 0x5F42F1D576E2L;
        long l11 = l3 ^ 0xD6901744A6L;
        long l12 = l3 ^ 0x53C75B07EA2BL;
        super((int)_5f_0.c("v", 15746, (long)(0x40539C0FD67DAFEAL ^ l2)), -1, (_4r)((Object)_5f_0.d("A", 3509856089169110820L, (long)l2)), l8);
        this.cfr_renamed_9 = new _9E((int)_5f_0.c("v", 27633, (long)(0x1A2897F60D55F99AL ^ l2)), l4, (Enum)((Object)_5f_0.d("A", 3508571060617251792L, (long)l2)), _3l.class);
        this.cfr_renamed_6 = new _6e_0((int)_5f_0.c("v", 5199, (long)(0x72E6D0087DD38628L ^ l2)), l11, (String)((Object)_5f_0.a("a", 20198, (long)(0x53100E368E7456L ^ l2))));
        this.cfr_renamed_7 = new _6e_0((int)_5f_0.c("v", 4933, (long)(0x412030D99F8C0120L ^ l2)), l11, (String)((Object)_5f_0.a("a", 10267, (long)(0x54A20009464A12A4L ^ l2))));
        this.cfr_renamed_4 = new _6e_0((int)_5f_0.c("v", 15987, (long)(0x19DE7F0887992C15L ^ l2)), l11, (String)((Object)_5f_0.a("a", 23949, (long)(0x332F859F35CE730L ^ l2))));
        this.cfr_renamed_3 = new _6e_0((int)_5f_0.c("v", 14322, (long)(0x71528AE1F9D9A59BL ^ l2)), l11, (String)((Object)_5f_0.a("a", 6016, (long)(0xD07B47C78442D35L ^ l2))));
        this.cfr_renamed_8 = new _6e_0((int)_5f_0.c("v", 18031, (long)(0x1165C6D1EF5400L ^ l2)), l11, (String)((Object)_5f_0.a("a", 29630, (long)(0x6AB830B2A6C4C91BL ^ l2))));
        this.cfr_renamed_376 = new _6X(l9, (int)_5f_0.c("v", 1372, (long)(0x702D385BBA769736L ^ l2)), new String[]{_5f_0.a("a", 24510, (long)(0x202C9FFC1336E504L ^ l2)), _5f_0.a("a", 23097, (long)(0x7D296F56AE8F6088L ^ l2)), _5f_0.a("a", 13864, (long)(0x247AE3BFB69D8C9CL ^ l2)), _5f_0.a("a", 643, (long)(0x17AB4798E147B834L ^ l2)), _5f_0.a("a", 904, (long)(0x722A029F0C44393AL ^ l2))});
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> this.cfr_renamed_6(l12);
        objectArray[1] = (int)((byte)n3);
        objectArray[0] = l6;
        _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 3506887532615704275L, (long)l2), (Object)objectArray, 3508036861472740721L, (long)l2);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = () -> this.cfr_renamed_6(l12);
        objectArray2[1] = (int)((byte)n3);
        objectArray2[0] = l6;
        _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 3508436671276678204L, (long)l2), (Object)objectArray2, 3508036861472740721L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = () -> this.cfr_renamed_6(l12);
        objectArray3[1] = (int)((byte)n3);
        objectArray3[0] = l6;
        _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 3510279994630275145L, (long)l2), (Object)objectArray3, 3508036861472740721L, (long)l2);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = () -> this.cfr_renamed_6(l12);
        objectArray4[1] = (int)((byte)n3);
        objectArray4[0] = l6;
        _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 3506378255824861109L, (long)l2), (Object)objectArray4, 3508036861472740721L, (long)l2);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = () -> this.cfr_renamed_6(l12);
        objectArray5[1] = (int)((byte)n3);
        objectArray5[0] = l6;
        _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 3510030092724562651L, (long)l2), (Object)objectArray5, 3508036861472740721L, (long)l2);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = () -> this.cfr_renamed_9(l7);
        objectArray6[1] = (int)((byte)n3);
        objectArray6[0] = l6;
        _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 3508174134928343827L, (long)l2), (Object)objectArray6, 3508036861472740721L, (long)l2);
        _95[] nullArray = new _95[_5f_0.c("v", 16628, (long)(0x2CC8152F4ECD5298L ^ l2))];
        nullArray[0] = _5f_0.d("\u00fd", (Object)this, 3506279091852804284L, (long)l2);
        nullArray[1] = _5f_0.d("\u00fd", (Object)this, 3506887532615704275L, (long)l2);
        nullArray[2] = _5f_0.d("\u00fd", (Object)this, 3508436671276678204L, (long)l2);
        nullArray[3] = _5f_0.d("\u00fd", (Object)this, 3510279994630275145L, (long)l2);
        nullArray[4] = _5f_0.d("\u00fd", (Object)this, 3506378255824861109L, (long)l2);
        nullArray[5] = _5f_0.d("\u00fd", (Object)this, 3510030092724562651L, (long)l2);
        nullArray[_5f_0.c("v", 12605, (long)(0x707DEB75EC5A2353L ^ l2))] = _5f_0.d("\u00fd", (Object)this, 3508174134928343827L, (long)l2);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = nullArray;
        objectArray7[0] = l10;
        _5f_0.d("o", (Object)this, (Object)objectArray7, 3510504800975503198L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _5f_0.b = dev.krypton.l.a(-5010460232027990948L, 3234110971725797858L, MethodHandles.lookup().lookupClass()).a(175546159340710L);
                        _5f_0.m = new Object[91];
                        _5f_0.n = new String[91];
                        _5f_0.b();
                        _5f_0.f = new HashMap<K, V>(13);
                        var11 = _5f_0.b ^ 81751531134293L;
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
                        var20_3 = new String[20];
                        var18_4 = 0;
                        var17_5 = "&\u00d8\u00e6\u00ac\u0089\u00cau\u0093\u008f\n\u009f\u00cf\u00c3\u00b5\u00a1\u00b0v\u0017o\u00a4\u001a\u00ee_\u00dc\u00f7\u00ddVul!v\u009a\u0018\u0018y\u00a0r\u00d3|yE\u00a47\u001d\u00c7\u0017F\u0007U'\u00d9x8\u00a2\u00eea\u008f\u0010~3Q\r\u00e8\u0094\u00175^\u00faV\u00e0\\\u0082p\u001a\u0018n\u0005\u008dv\u00ba\u000b\u00b37\u00e9&=\u00c8\u008d\u00a0\u00aa\u0000\u00eb\u001d\u0007\u00b5(\u00a2\u00e8\u00ac\u0010\u00b3n!2\u0095\u00ae\u0013\u009a\u0016\u0005QU\u00d0\u0000\u00ec\u00be(6\u008c\u00bf\u00f4\u009fa\u00cdff\u00eb\u0011\u000e|hU\u00fd\u0016tS\u008a\u0014>W3\u00f9\"aw\u00f9\u00ea1yH\u009d\u00cf&.\u00de\n\u0084\u0018\u00b1e$\u00cba\u00c3R\u008e\u00f3Da\u00f9Q@\u00fa\u0082\u00c2\n\u00bb0<e\u00f3A\u0010\u0006\u0095r\u0088\u008e\u0002F\u00fdt\u00ecn\u00b7\u001e\u00ec\u00ca\u00c1\u0010KvC\u0010i\u00f3\u0092\u00b5&\u00a8>\u00beR\u00f16\u00a4 \u0016l\u0013\u00de\u00f7\u00d3\u00ef_&\u00ca\u00e9\u00da\u008f1q\b5\u00e2q\u0001\u00e6n5\u0012\u00da/#\u001f\u0087\u0012\u00a9\u001c\u0010\u00ab\u008c\u00e0\u001d\u00ed\u0002G\u00d4\u0085?\u00d84\u00cax\u00ea/ \u0096\u00b4s-\u0090XJ\u0006\u00c8\u00fdP\u001c&\u00f0\u00b26\u00b8\u009c3\u00cc\u00a9\u0019V\u00d7\u008c\u0010\u00ee\u008d2[\u00f5t\u0018oE\u0007H\u00c3\u0091\u00feC6A\u0018\u00b1\u001791\u00c1\u0084\u00a1o\u0089I\"\u0004\u00c8 (\u009enf[\u00a5\u001e\u008a\u00fdJS\u00ee\u0095`\u001c\u00f2\u00b91</\n\u0083%Q\u0012\u001c\u00cbp\u00e50\u00c9\u00d5 \u009e\u00ab\u00e4\u0098\u0095\u000b\n\u008e\u00f3\u00b3D\u00e7pyNF\u00840\u00f8\u0001\u008a\u001f\u008e\u00bfc\u0006\u001e\u0087\u00fe\u0096\u00a5\u00dd\u0018\u00f2\u0091\u00b7p%\u001e:\u001e\u00e4\u000b\u00bb$\u00eec\u00c2\u001af\u00c5\u008b\u00d1\u0080\u00f1F\u0093 \u0084\u0090{\u0094\u00a9\u00ee\u00b9\u00b8\u00c0\u008cIP\u00f3\u00f4\u00be\u00a1v\u00ba\u00d0\u0099b\u009b\u0097\u00b3\u0014\u00ac\u00dfj\"t@\r\u0010\u001a\u007f\u00f5Za/\u0081\u00e31\u00c3\u00e4?<<F]";
                        var19_6 = "&\u00d8\u00e6\u00ac\u0089\u00cau\u0093\u008f\n\u009f\u00cf\u00c3\u00b5\u00a1\u00b0v\u0017o\u00a4\u001a\u00ee_\u00dc\u00f7\u00ddVul!v\u009a\u0018\u0018y\u00a0r\u00d3|yE\u00a47\u001d\u00c7\u0017F\u0007U'\u00d9x8\u00a2\u00eea\u008f\u0010~3Q\r\u00e8\u0094\u00175^\u00faV\u00e0\\\u0082p\u001a\u0018n\u0005\u008dv\u00ba\u000b\u00b37\u00e9&=\u00c8\u008d\u00a0\u00aa\u0000\u00eb\u001d\u0007\u00b5(\u00a2\u00e8\u00ac\u0010\u00b3n!2\u0095\u00ae\u0013\u009a\u0016\u0005QU\u00d0\u0000\u00ec\u00be(6\u008c\u00bf\u00f4\u009fa\u00cdff\u00eb\u0011\u000e|hU\u00fd\u0016tS\u008a\u0014>W3\u00f9\"aw\u00f9\u00ea1yH\u009d\u00cf&.\u00de\n\u0084\u0018\u00b1e$\u00cba\u00c3R\u008e\u00f3Da\u00f9Q@\u00fa\u0082\u00c2\n\u00bb0<e\u00f3A\u0010\u0006\u0095r\u0088\u008e\u0002F\u00fdt\u00ecn\u00b7\u001e\u00ec\u00ca\u00c1\u0010KvC\u0010i\u00f3\u0092\u00b5&\u00a8>\u00beR\u00f16\u00a4 \u0016l\u0013\u00de\u00f7\u00d3\u00ef_&\u00ca\u00e9\u00da\u008f1q\b5\u00e2q\u0001\u00e6n5\u0012\u00da/#\u001f\u0087\u0012\u00a9\u001c\u0010\u00ab\u008c\u00e0\u001d\u00ed\u0002G\u00d4\u0085?\u00d84\u00cax\u00ea/ \u0096\u00b4s-\u0090XJ\u0006\u00c8\u00fdP\u001c&\u00f0\u00b26\u00b8\u009c3\u00cc\u00a9\u0019V\u00d7\u008c\u0010\u00ee\u008d2[\u00f5t\u0018oE\u0007H\u00c3\u0091\u00feC6A\u0018\u00b1\u001791\u00c1\u0084\u00a1o\u0089I\"\u0004\u00c8 (\u009enf[\u00a5\u001e\u008a\u00fdJS\u00ee\u0095`\u001c\u00f2\u00b91</\n\u0083%Q\u0012\u001c\u00cbp\u00e50\u00c9\u00d5 \u009e\u00ab\u00e4\u0098\u0095\u000b\n\u008e\u00f3\u00b3D\u00e7pyNF\u00840\u00f8\u0001\u008a\u001f\u008e\u00bfc\u0006\u001e\u0087\u00fe\u0096\u00a5\u00dd\u0018\u00f2\u0091\u00b7p%\u001e:\u001e\u00e4\u000b\u00bb$\u00eec\u00c2\u001af\u00c5\u008b\u00d1\u0080\u00f1F\u0093 \u0084\u0090{\u0094\u00a9\u00ee\u00b9\u00b8\u00c0\u008cIP\u00f3\u00f4\u00be\u00a1v\u00ba\u00d0\u0099b\u009b\u0097\u00b3\u0014\u00ac\u00dfj\"t@\r\u0010\u001a\u007f\u00f5Za/\u0081\u00e31\u00c3\u00e4?<<F]".length();
                        var16_7 = 32;
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
                            var20_3[var18_4++] = _5f_0.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "[\u0095H\u0084\u001e\u0016\u00b96Bl\u00e5\u00d3\u0092b\u00d6\u00a5 \u00b6\u0087\u009f\u00d5J\u00b6\u00ca\u00db\u0095x\f\u00aaEy\u00f70\u008d\u00c9/:\u00dd\b\u00fehW\u00cf[\u0080\u00c6}@\u00ae";
                            var19_6 = "[\u0095H\u0084\u001e\u0016\u00b96Bl\u00e5\u00d3\u0092b\u00d6\u00a5 \u00b6\u0087\u009f\u00d5J\u00b6\u00ca\u00db\u0095x\f\u00aaEy\u00f70\u008d\u00c9/:\u00dd\b\u00fehW\u00cf[\u0080\u00c6}@\u00ae".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = _5f_0.b(var21_9).intern();
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
                _5f_0.d = var20_3;
                _5f_0.e = new String[20];
                _5f_0.cfr_renamed_5 = _5f_0.a("a", (int)31762, (long)(504614879660082744L ^ var11));
                _5f_0.cfr_renamed_2 = _5f_0.a("a", (int)29219, (long)(5813458299367393300L ^ var11));
                _5f_0.cfr_renamed_1 = _5f_0.a("a", (int)25091, (long)(1322433674062075959L ^ var11));
                _5f_0.cfr_renamed_261 = _5f_0.a("a", (int)24402, (long)(4619170747488970109L ^ var11));
                _5f_0.cfr_renamed_0 = _5f_0.a("a", (int)1750, (long)(7355340390129859811L ^ var11));
                _5f_0.l = new HashMap<K, V>(13);
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
                var6_12 = new long[12];
                var3_13 = 0;
                var4_14 = "\u00ad\u00f6K\u00fc#\u00da\u00c9\u00e1e\u00f2s\u0087\u000b\r\u000e\u00bc\u009a!z8\u0000\u0010\u00a3\u00e5\u0002$\u00a3\u00d0\u0011\u001fnH\u00a5V\u00ab\u00ba\u008e\u0089h\u00a6\u00d1\u0097\u0003:\u00a0B~\u00b5wB\u00eb\u00f49\u008d\u0084\u00b4\b\u00e9\u001a\u00bf\u00c9\u00c8#\u00fa\u00b4cVN\u00bb\u00d1\u009a\u0019\u008c\u0095\u00feN\u00e18x\n";
                var5_15 = "\u00ad\u00f6K\u00fc#\u00da\u00c9\u00e1e\u00f2s\u0087\u000b\r\u000e\u00bc\u009a!z8\u0000\u0010\u00a3\u00e5\u0002$\u00a3\u00d0\u0011\u001fnH\u00a5V\u00ab\u00ba\u008e\u0089h\u00a6\u00d1\u0097\u0003:\u00a0B~\u00b5wB\u00eb\u00f49\u008d\u0084\u00b4\b\u00e9\u001a\u00bf\u00c9\u00c8#\u00fa\u00b4cVN\u00bb\u00d1\u009a\u0019\u008c\u0095\u00feN\u00e18x\n".length();
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
lbl86:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u0091\u00f4\u001a\u0084B=\u00f8\u00efu\u00de\u00afji\u009f\u0098\u0080";
                    var5_15 = "\u0091\u00f4\u001a\u0084B=\u00f8\u00efu\u00de\u00afji\u009f\u0098\u0080".length();
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
lbl99:
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
lbl112:
                // 1 sources

                ** continue;
            }
        }
        _5f_0.j = var6_12;
        _5f_0.k = new Integer[12];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5f_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 42;
            case 1 -> 17;
            case 2 -> 23;
            case 3 -> 7;
            case 4 -> 29;
            case 5 -> 19;
            case 6 -> 49;
            case 7 -> 44;
            case 8 -> 45;
            case 9 -> 34;
            case 10 -> 63;
            case 11 -> 62;
            case 12 -> 37;
            case 13 -> 18;
            case 14 -> 21;
            case 15 -> 35;
            case 16 -> 2;
            case 17 -> 31;
            case 18 -> 43;
            case 19 -> 51;
            case 20 -> 52;
            case 21 -> 3;
            case 22 -> 61;
            case 23 -> 53;
            case 24 -> 14;
            case 25 -> 55;
            case 26 -> 25;
            case 27 -> 58;
            case 28 -> 59;
            case 29 -> 50;
            case 30 -> 56;
            case 31 -> 16;
            case 32 -> 10;
            case 33 -> 0;
            case 34 -> 41;
            case 35 -> 24;
            case 36 -> 20;
            case 37 -> 28;
            case 38 -> 40;
            case 39 -> 54;
            case 40 -> 9;
            case 41 -> 12;
            case 42 -> 48;
            case 43 -> 47;
            case 44 -> 36;
            case 45 -> 27;
            case 46 -> 57;
            case 47 -> 11;
            case 48 -> 4;
            case 49 -> 5;
            case 50 -> 46;
            case 51 -> 1;
            case 52 -> 30;
            case 53 -> 22;
            case 54 -> 32;
            case 55 -> 60;
            case 56 -> 6;
            case 57 -> 38;
            case 58 -> 39;
            case 59 -> 13;
            case 60 -> 15;
            case 61 -> 26;
            case 62 -> 8;
            default -> 33;
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
        _5f_0.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == '\u00fb' || c == 'A' || c == '\u00ea') {
                field = _5f_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5f_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "NyE\u007f}\u001bSlG>xG\u001aW";
        objectArray[1] = Character.TYPE;
        _5f_0.n[1] = "java/lang/Character";
        objectArray[2] = "2t)5\u001c\u00162t>i\u0010\u0019(?>w\u0010\f/Nh)DO";
        objectArray[3] = "<\u0006%mnd<\u000621bk&M2/b~!<cv5<";
        objectArray[4] = "d(U\u0011)\u000eo'D^T\u0016| M\u0017";
        objectArray[5] = "KJ;[/\"KJ,\u0007#-Q\u0001,\u0019#8Vp}@zx";
        objectArray[6] = "YuNMU`Rz_\u00024nYq[X";
        objectArray[7] = Boolean.TYPE;
        _5f_0.n[7] = "java/lang/Boolean";
        objectArray[8] = "WIwooXIAm \rDN\\";
        objectArray[9] = Integer.TYPE;
        _5f_0.n[9] = "java/lang/Integer";
        objectArray[10] = "cx 5d\u0002hw1z\u0019\u001a{p83\b\u001b`u218";
        objectArray[11] = "N*:z\u000bAS?8;\u000e\u001d\u001c*";
        objectArray[12] = "\u0017\b\u0012\u007f\u00018b(\u0019p\u0010w\u0003&\u0012{\u0014-w";
        objectArray[13] = Void.TYPE;
        _5f_0.n[13] = "java/lang/Void";
        objectArray[14] = "\n\"]\u0011\n,\u00177_P\u000fpX\u001f";
        objectArray[15] = "x\u0007\u00192Pl\r'\u0012=A#l)\u00196Ey\u0018";
        objectArray[16] = "\u000b\u0003t_N\u0016\u0016\u0016v\u001eKJV#";
        objectArray[17] = "\u00191\u001f1RXl\u0011\u0014>C\u0017\r\u001f\u001f5GMy";
        objectArray[18] = "\u007fyuA8\u0001blw\u0000=].z";
        objectArray[19] = "}\u0005v]^C\b%}RO\fi+vYKV\u001d";
        objectArray[20] = "\u0015.$mW\r\u001e!5\":\t\u001e=\u0001i\b\u0014\u001a!1i";
        objectArray[21] = "UI@*\u0005pH\\Bk\u0000,\u0002@";
        objectArray[22] = "M\u0016Cc[\u0001S\u001eY,<\u0000B\u0005Tv\u001a\u0006";
        objectArray[23] = "$\u0007L.\u0014mQ'G!\u0005\"0)L*\u0001xD";
        objectArray[24] = "\u0018NhO|(\u0013Ay\u0000\u0010+\u001dC{O<";
        objectArray[25] = "S@S6\u0003+S@Dj\u000f$I\u000bDt\u000f1Nz\u0012+Zz\u0019FKy\u001d1b\u0010\u0015,X";
        objectArray[26] = ":\u0018F\t!0$\u0010\\F@5$\u0010_\u0006n)";
        objectArray[27] = "]z9\u0019]8(Z2\u0016LwIT9\u001dH-=";
        objectArray[28] = "\u0013)o$n=\u0018&~k\r0\r ";
        objectArray[29] = "Dlr;;j1Ly4*%PBr?.\u007f$";
        objectArray[30] = "\u0003*gEkR\u001d\"}\n7B\u000e.i\n\bF\u001d(yA7";
        objectArray[31] = "G\rf#v`Y\u0005|l*pJ\thl\btY\u0018u06";
        objectArray[32] = "#6";
        objectArray[33] = "qAYZ:clT[\u001b??,\u0011";
        objectArray[34] = "\u001bh@|~znHKso5\u000fF@xko{";
        objectArray[35] = "c)=\t\u007f2~<?Hzn3>";
        objectArray[36] = "~K){Lnc^+:I2,V";
        objectArray[37] = "~v/'Uu\u000bV$(D:jX/#@`\u001e";
        objectArray[38] = "9H,4\"\u0001+\fp\u000et;o\u0007*0,\u00058H:`O";
        objectArray[39] = "U\u0012\u0015GH&D\nD\u0002$\u007fV\u0004\u0004:\u0018tUD\u0007\u0003Mc\\\u0013x";
        objectArray[40] = "h7+\u001f8\u0012:sh\u0013\u0000S\u0004w=\u001f1\f?s/_\u007fj=nn\r}\u0018|b(R\u0000";
        objectArray[41] = "\u0006x\u0010:\u0010\u0007\u0005|C1a\u0004\u0018!S.*\f\u001f RV_\u000e\u001b,\u0016+\u0007R\u001b7.";
        objectArray[42] = "_\u001f\u00151\u0002H\u0019\u0010Ru3\u001e\u000f\u0012ltV\b\bV\u0011,\n\b\u0013nP']A\u001dW\u00050T\u0016b";
        objectArray[43] = "T'\u001e\u0000l6\u0004!\u0005\bU\u001fFx\u0001\u000bU6\u0005j\u001dH;f\u0003q\u0015";
        objectArray[44] = "!!(\u00067\u0005sek\n\u000fAM(g\u000bj\u00185w6\u000b0";
        objectArray[45] = "z5;\u001e8\u0002z=!O@\n-y9A,8z:g\u001bpo b+L\"\u0005y}9]@T#y9C9^zd4&!\u0001'}=E?\u001e+<Y";
        objectArray[46] = "wAw^Z\u0006'GlVc$~\u0018xSc\u0006&\ft\u0016\rV \u0017|";
        objectArray[47] = "\u001d\n\u0004\u001a\u001fF\u001e\u000fE\u001b\u007f_\u001e\u00134C\u001aC\u0015MI\u001bFC\u000eu\n\u0018\u0006PG\bRD\u0006K\u007fKQ\u0004\u0015\u0002\u0002\u0013\r\u0004\u000e:";
        objectArray[48] = "KMY@eL\u0016^UX\u0018\u0017HZ\u001dH|\u0011/\u0004\u000bS|B\u0010M\u0018N%|KMY@eL\u0016^UX\u0018";
        objectArray[49] = "]\u0010\u00008\u00067\u000fTC4>w1\u0019O5[*IF\u001e5\u0001";
        objectArray[50] = "O@\u001fe\u0019CJS\u0012|a\u001e7Z\u001auPA\f^\b5\u001e'\u0006C\u0017c\u000fH\f\u001fM|a";
        objectArray[51] = "\u0012!a\u000eSmO2m\u0016.8\u001f/6\u0007C'v>a\u001b\u00111\u001c\"l\u001cO]\u0012mc\u000b_1\u0011i0\u0000.";
        objectArray[52] = "8\u0004\\8JKq\u0017Aat\bd!F5\u000e=y\u0010O-t\u0011<\u0014\u001b#K\u0013<\u0016\u001f\\";
        objectArray[53] = "'t%\"JVu0f.r\u0013K}j/\u0017K3\";/M";
        objectArray[54] = "d\u0013B'\u0018\u0010-\u0000_~&T\"\u0017C?\\N9\u00128}CV5EE%\u001fV.}\u0006&_Eg\u0000^z_^_FV9B\u0011`\u000fE$\u001b/";
        objectArray[55] = "60d\u0018P668~I(>a|fGD\f586\u001e\u0016[7cz@M\"=:gM(";
        objectArray[56] = "\u0007W\u000fK^=\u0004S\\@/<\u0005\u00051\u0019J(\tQLA\u0016(\u0012i\u000fBV;[\u0014W\u001eV c";
        objectArray[57] = "MhXQ7\"\u0004{E\b\tf\u000blYIs|\u0010i\"\u000bld\u001c>_S0d\u0007\u0006\u0019[syH9PHn v";
        objectArray[58] = "/4r3E\u0014{!`}x]bHz*\t\\xs~8I\u0012\u001eyc'\u001f\u0003qs?}\u0000m";
        objectArray[59] = "[\u0001_OM/RUVI&Z{.{u&qU\u0011@B\u001fx\u0001\u0018F";
        objectArray[60] = "=Pr\u000bh{>T!\u0000\u0019l%\u00076\u001b\u0019)<\u0017&_dq`\u0017=g'r \u0004t\u001a\u007f. \u001fL";
        objectArray[61] = "N{HBqo\u0011\u007f\u0018K\u000e9\t9D\\bPHpK\u0004mn\u001f?[T\u000eoK QE10OpX:";
        objectArray[62] = "9#OMk?3zR@\u000e(c-WAY|>{\r\u0015\u000e}a<SHww8!^";
        objectArray[63] = "\bD\u0013!g#W\u0015\u0013{\u0002f8\r\u000653=\u0003\t\u0014u}[\t\u0014\u000b#l4\u0003HQ<\u0002";
        objectArray[64] = "\u0004\r\u0019(W9P\u0018\u000bfj\u007f5\b\u0001)[&\u000e\f\u0013i\u0015@\b\u0000\u0011#[yN\u000fVgj";
        objectArray[65] = "\u0018H\u0011J\u001a$YDW\u0015g3LTKN\u000b\u0001\u0018\u0010\u001b\u0014]V\u001b\u0018I\u0011\u001f;\u001b\u0010S@goA\u0012HT\u0015.MT\u0017)";
        objectArray[66] = "\u0017OY;:(Q@\u001e\u007f\u000bxFR |f\u007f\u001aA\u0019)qvM>\u001d{asEBB|k.*";
        objectArray[67] = "}oJ\u0010krw6W\u001d\u000ef?q_\u0014u\u000bzaX@q2/vQ\u0017\u000e6}fT\u001frizl\tp";
        objectArray[68] = "\u007f!\u0017\u0011yJ62\nHG\u0014\"#\u0000\u0005\u0000\u001bDq\b\f-M9)T\f6uz*\u0014\u001f\u007f\b\"v\u0014\u0004G";
        objectArray[69] = "aqgI`w(bz\u0010^#=yaD?.!\u001fp\u0011\"w6ul\u001c%)Z\"&G<'&}!MaH";
        objectArray[70] = "\u001cKl\u000e\u0013_N\u000f/\u0002+\u001cpB#\u0003NB\b\u001dr\u0003\u0014";
        objectArray[71] = "\u0017Oh'+\u0000\tPdfO\u000e\u0013Ys.O\u0002\u0018Fw;,\u001c\u0007J6_";
        objectArray[72] = "P/}BZY\u0019<`\u001bd\u0002\u0006'hZ\u0004fU$~L\\\u001b\rx~Wd";
        objectArray[73] = "paxHg'\"%;D_e\u001ch7E::d7fE`";
        objectArray[74] = ";|%T~6dxu]\u0001uc\u001d8V`okF\u007fB{m:y6Qf4\u0004";
        objectArray[75] = "o>\nd\u0005h)1M 4*3=\u001e\u001f\n4+%KbRh+>s";
        objectArray[76] = "U~\u0004l`\u0006Uv\u001e=\u0018\u0004\u00022=(b\n\t!fov\u0011\u000bpY&e\fRN";
        objectArray[77] = "\u000e_S)X>\u0019\u000bC/\"hdKQ1\u0013?_OCq]YY\tR\"M%\u0006\u000eX\u007f\"";
        objectArray[78] = "g\u001fywf\r5[:{^J\u000bLkm7\u000fl[?}1";
        objectArray[79] = "mb\u0013\u000eKJ+mTJz\u0012,~\u0010\u001c\u0006\u0014*\u0013\u0004\u0013\u0017\u000e<,\u0015\u000bFKP";
        objectArray[80] = "eZ&*0=qYxoO-cA5?\b=\n\u0018s8-<vGt2pSeZ&*0=qYxoO";
        objectArray[81] = "4Xk\u0005{1?\u0019cUA|QQiKp&jU{\u000b>@4Xk\u0005{1?\u0019cUA";
        objectArray[82] = "o\r#xd-o\u00059)\u001c%8A!'p\u0017i\u0006}\u007f$@nS;$\"\u007f'@&}\u001cy5\u0007\"=n89A}@";
        objectArray[83] = "\u0013\u00046\u0012RSA@u\u001ej\u00105=x\u001f\u001b[BD,\n\t\u0015";
        objectArray[84] = "\n\u001e\u0006e\u0006)UO\u0006?cm:W\u0013qR7\u0001S\u00011\u001cQ\u0001@\u0000d]nHS\u001d=c";
        objectArray[85] = "0v\u0014ij\u001b!nE,\u0006D7k?yvX^-B~dK\"rEt9$";
        objectArray[86] = "C]Vl]-@Y\u0005g,/F\u0005\u0004\u0000\u0011zM\u0001\u0007|N}G\\h";
        objectArray[87] = "\u00154\u0013?*$GpP3\u0012b$\r\u0015'cm\u001f6\u00115##y<\f*u2\u00166Ppj\\";
        objectArray[88] = "\u001d&\u0014\u000fN(\u000fbH5\u001c\u0012I;\fUFkCb\u0011X#";
        objectArray[89] = "\u0019\f\u001a:{:X\u0000\\e\u0006-M\u0010@>j\u001f\u0019T\u0010g<H\u001b\u000f\\9c1\u0011VA4\u0006q@VC$t0L\u0010\u001cY";
        Object[] objectArray2 = objectArray;
        objectArray[90] = "o\u000e,\u0001w\u0018o\u00066P\u000f\u00108B.^c\"i\u0005r\u00064ul^tZr\u0007-R2\u0005\u000f";
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _5f_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5f_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x22D7;
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
                throw new RuntimeException("dev/krypton/5f", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5f_0.k[n2] = n3;
        }
        return k[n2];
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
        int n = _5f_0.e(l2, l3);
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
                String string2 = _5f_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5f_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5f_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5f_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5f_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5f_0.f(446930179197864L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5f_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5f_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5f_0.f(446930179197864L, 0L);
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
            int n = _5f_0.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5f_0.m[n] = clazz = Class.forName(_5f_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5f_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5f_0.d(classArray2[j], string, clazz2, n, classArray);
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
            throw new RuntimeException("dev/krypton/5f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5f_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5f_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5f_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xA0C;
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
                throw new RuntimeException("dev/krypton/5f", exception);
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
            _5f_0.e[n2] = _5f_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5f" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static PatternSyntaxException a(PatternSyntaxException patternSyntaxException) {
        return patternSyntaxException;
    }

    private static Field g(long l2, long l3) {
        int n = _5f_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5f_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5f_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5f_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5f_0.c(clazz3, string2, clazz2)) != null) {
                    _5f_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5f_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5f_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5f_0.f(446930179197864L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String java_lang_String_3(Object[] objectArray) {
        String string;
        block15: {
            _5f_0 f_0;
            int n;
            long l2;
            long l3;
            block13: {
                block14: {
                    l3 = (Long)objectArray[0];
                    long l4 = l3 = b ^ l3;
                    long l5 = l4 ^ 0x4A496E432B16L;
                    long l6 = l4 ^ 0x21CEEE365CA3L;
                    l2 = l4 ^ 0x68728BEC3CECL;
                    n = _8F.cfr_renamed_8();
                    try {
                        try {
                            f_0 = this;
                            if (n != 0) break block13;
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l6;
                            objectArray2[0] = _5f_0.d("A", 810856290154754080L, (long)l3);
                            if (_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)f_0, 817546218994023244L, (long)l3), (Object)objectArray2, 817500985365461189L, (long)l3) == false) break block14;
                        }
                        catch (PatternSyntaxException patternSyntaxException) {
                            throw _5f_0.a(patternSyntaxException);
                        }
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l5;
                        return _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 818168682035291427L, (long)l3), (Object)objectArray3, 819157759155718949L, (long)l3);
                    }
                    catch (PatternSyntaxException patternSyntaxException) {
                        throw _5f_0.a(patternSyntaxException);
                    }
                }
                f_0 = this;
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l2;
            CallSite callSite = _5f_0.d("o", (Object)_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)f_0, 819591894311909603L, (long)l3), (Object)objectArray4, 818303342783580326L, (long)l3), 817618278793637940L, (long)l3);
            block10: while (true) {
                Object object = _5f_0.d("o", (Object)callSite, 819216507908779948L, (long)l3);
                while (object != false) {
                    block19: {
                        block20: {
                            CallSite callSite2;
                            block18: {
                                CallSite callSite3;
                                String string2;
                                block16: {
                                    block17: {
                                        string = string2 = (String)((Object)_5f_0.d("o", (Object)callSite, 811455955392249606L, (long)l3));
                                        if (l3 < 0L) break block15;
                                        Object object2 = n;
                                        if (l3 >= 0L) {
                                            if (object2 != 0) break block15;
                                            object2 = _5f_0.c("v", 13360, (long)(0x28B77EAD0D3F9DA4L ^ l3));
                                        }
                                        callSite3 = _5f_0.d("o", string, (int)object2, 818016652455235056L, (long)l3);
                                        try {
                                            object = callSite3;
                                            if (l3 <= 0L || n != 0) break block16;
                                            if (object > 0) break block17;
                                        }
                                        catch (PatternSyntaxException patternSyntaxException) {
                                            throw _5f_0.a(patternSyntaxException);
                                        }
                                        if (l3 > 0L) continue block10;
                                    }
                                    try {
                                        callSite2 = _5f_0.d("o", string2, 0, (int)callSite3, 812519885665588856L, (long)l3);
                                        if (n != 0) break block18;
                                        object = _5f_0.d("o", (Object)callSite2, (Object)"$", 818091569931617200L, (long)l3);
                                    }
                                    catch (PatternSyntaxException patternSyntaxException) {
                                        throw _5f_0.a(patternSyntaxException);
                                    }
                                }
                                try {
                                    if (l3 <= 0L) break block19;
                                    if (object == false) break block20;
                                    callSite2 = _5f_0.d("o", string2, (int)(callSite3 + true), 812135385246604555L, (long)l3);
                                }
                                catch (PatternSyntaxException patternSyntaxException) {
                                    throw _5f_0.a(patternSyntaxException);
                                }
                            }
                            return callSite2;
                        }
                        object = n;
                    }
                    if (l3 < 0L) continue;
                    if (object != false) break block10;
                    continue block10;
                }
                break;
            }
            string = "0";
        }
        return string;
    }

    private Boolean cfr_renamed_6(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0xCEFF980E005L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _5f_0.d("A", -5195306382879486842L, (long)l2);
        return _5f_0.d("\u00ed", (boolean)_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, -5188519687890368534L, (long)l2), (Object)objectArray, -5188580040395471773L, (long)l2), -5190109741614041865L, (long)l2);
    }

    private static Optional cfr_renamed_7(long l2, List list, short s, class_2583 class_25832, String string) {
        long l3 = (l2 << 16 | (long)s << 48 >>> 48) ^ b;
        CallSite callSite = _5f_0.d("o", string, 4389358175020871806L, (long)l3);
        int n = ((CallSite)callSite).length;
        int n2 = _8F.cfr_renamed_7();
        for (int j = 0; j < n; ++j) {
            CallSite callSite2 = callSite[j];
            _5f_0.d("o", (Object)list, (Object)new _0k_0((char)callSite2, class_25832), 4393131247909429941L, (long)l3);
            if (n2 != 0) continue;
        }
        return _5f_0.d("\u00ed", 4392930913379965462L, (long)l3);
    }

    private Boolean cfr_renamed_9(long l2) {
        long l3 = (l2 = b ^ l2) ^ 0x5BC2900E0FF9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = _5f_0.d("A", 6348837780763421127L, (long)l2);
        return _5f_0.d("\u00ed", (boolean)_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, 6341908268341946390L, (long)l2), (Object)objectArray, 6341669557371218847L, (long)l2), 6342565386319436555L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2561 net_minecraft_class_2561_8(Object[] var1_1) {
        block24: {
            block25: {
                var4_2 = (class_2561)var1_1[0];
                var2_3 = (Long)var1_1[1];
                v0 = var2_3 = _5f_0.b ^ var2_3;
                var5_4 = v0 ^ 48811611744635L;
                var7_5 = v0 ^ 79041737662158L;
                var9_6 = v0 ^ 15802047168129L;
                var11_7 = v0 ^ 90932684305412L;
                var13_8 = _8F.cfr_renamed_8();
                var14_9 = _5f_0.d("o", (Object)var4_2, (long)5275241593042148060L, (long)var2_3);
                try {
                    v1 = this;
                    if (var13_8 != 0) break block24;
                    v2 = new Object[2];
                    v2[1] = var7_5;
                    v2[0] = _5f_0.d("A", (long)5273111885197406797L, (long)var2_3);
                    if (_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)v1, (long)5275377461387753761L, (long)var2_3), (Object)v2, (long)5275191795498171048L, (long)var2_3) == false) break block25;
                }
                catch (PatternSyntaxException v3) {
                    throw _5f_0.a(v3);
                }
                v4 = new String[5][];
                v5 = new String[2];
                v5[0] = _5f_0.a("a", (int)30454, (long)(5055756002353919448L ^ var2_3));
                v6 = new Object[1];
                v6[0] = var5_4;
                v5[1] = _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, (long)5275929826552997710L, (long)var2_3), (Object)v6, (long)5274662435498690888L, (long)var2_3);
                v4[0] = v5;
                v7 = new String[2];
                v7[0] = _5f_0.a("a", (int)20086, (long)(4704203682011549013L ^ var2_3));
                v8 = new Object[1];
                v8[0] = var5_4;
                v7[1] = _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, (long)5272959835522729377L, (long)var2_3), (Object)v8, (long)5274662435498690888L, (long)var2_3);
                v4[1] = v7;
                v9 = new String[2];
                v9[0] = _5f_0.a("a", (int)4126, (long)(6472106767546929973L ^ var2_3));
                v10 = new Object[1];
                v10[0] = var5_4;
                v9[1] = _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, (long)5272075339185748436L, (long)var2_3), (Object)v10, (long)5274662435498690888L, (long)var2_3);
                v4[2] = v9;
                v11 = new String[2];
                v11[0] = _5f_0.a("a", (int)24906, (long)(1888711919350719087L ^ var2_3));
                v12 = new Object[1];
                v12[0] = var5_4;
                v11[1] = _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, (long)5274843168658050600L, (long)var2_3), (Object)v12, (long)5274662435498690888L, (long)var2_3);
                v4[3] = v11;
                v13 = new String[2];
                v13[0] = _5f_0.a("a", (int)7359, (long)(6672048172433727385L ^ var2_3));
                v14 = new Object[1];
                v14[0] = var5_4;
                v13[1] = _5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)this, (long)5272316987121144646L, (long)var2_3), (Object)v14, (long)5274662435498690888L, (long)var2_3);
                v4[4] = v13;
                var16_12 = var15_10 = v4;
                var17_14 = var16_12.length;
                var18_16 = 0;
                while (var18_16 < var17_14) {
                    block26: {
                        block32: {
                            block27: {
                                block33: {
                                    var19_18 = var16_12[var18_16];
                                    var20_20 = _5f_0.d("o", (Object)_5f_0.d("\u00ed", var19_18[0], (long)5272110448919998101L, (long)var2_3), (Object)var14_9, (long)5272201704730107515L, (long)var2_3);
                                    v15 = var13_8;
                                    if (var2_3 < 0L) break block26;
                                    if (v15 != 0) break block32;
                                    if (_5f_0.d("o", (Object)var20_20, (long)5274793967791336779L, (long)var2_3) == false) break block27;
                                    break block33;
                                    catch (PatternSyntaxException v16) {
                                        throw _5f_0.a(v16);
                                    }
                                }
                                try {
                                    block34: {
                                        if (_5f_0.d("o", (Object)var20_20, (long)5272641068619924264L, (long)var2_3) < true) break block27;
                                        break block34;
                                        catch (PatternSyntaxException v17) {
                                            throw _5f_0.a(v17);
                                        }
                                    }
                                    v18 = new Object[5];
                                    v18[4] = var19_18[1];
                                    v18[3] = (int)_5f_0.d("o", (Object)var20_20, (int)1, (long)5271564252930174042L, (long)var2_3);
                                    v18[2] = (int)_5f_0.d("o", (Object)var20_20, (int)1, (long)5271851101199030294L, (long)var2_3);
                                    v18[1] = var4_2;
                                    v18[0] = var11_7;
                                    return _5f_0.d("o", (Object)this, (Object)v18, (long)5272710946734147295L, (long)var2_3);
                                }
                                catch (PatternSyntaxException v19) {
                                    throw _5f_0.a(v19);
                                }
                            }
                            ++var18_16;
                        }
                        v15 = var13_8;
                    }
                    if (v15 == 0) continue;
                }
                return var4_2;
            }
            v1 = this;
        }
        v20 = new Object[1];
        v20[0] = var9_6;
        var15_11 = _5f_0.d("o", (Object)_5f_0.d("o", (Object)_5f_0.d("\u00fd", (Object)v1, (long)5274454387413252750L, (long)var2_3), (Object)v20, (long)5275497075682118347L, (long)var2_3), (long)5275304317217682009L, (long)var2_3);
        block20: while (true) {
            v21 /* !! */  = _5f_0.d("o", (Object)var15_11, (long)5274585149752585665L, (long)var2_3);
            while (v21 /* !! */  != false) {
                block31: {
                    block30: {
                        block29: {
                            block35: {
                                block28: {
                                    var16_13 = (String)_5f_0.d("o", (Object)var15_11, (long)5273636865801715051L, (long)var2_3);
                                    var17_15 = _5f_0.d("o", var16_13, (int)_5f_0.c("v", (int)13360, (long)(2933840623339036617L ^ var2_3)), (long)5275768922748391325L, (long)var2_3);
                                    try {
                                        v22 = var17_15;
                                        v23 /* !! */  = var13_8;
                                        if (var2_3 > 0L) {
                                            if (v23 /* !! */  != 0) break block28;
                                            if (v22 <= 0) continue block20;
                                        }
                                        ** GOTO lbl124
                                    }
                                    catch (PatternSyntaxException v24) {
                                        throw _5f_0.a(v24);
                                    }
                                    v22 = var17_15;
                                }
                                try {
                                    v23 /* !! */  = (int)(_5f_0.d("o", var16_13, (long)5274923226829642762L, (long)var2_3) - true);
lbl124:
                                    // 2 sources

                                    if (v22 >= v23 /* !! */ ) {
                                        continue block20;
                                    }
                                }
                                catch (PatternSyntaxException v25) {
                                    throw _5f_0.a(v25);
                                }
                                var18_17 = _5f_0.d("o", var16_13, (int)0, (int)var17_15, (long)5272519626462172181L, (long)var2_3);
                                var19_19 = _5f_0.d("o", var16_13, (int)(var17_15 + true), (long)5271515014101098342L, (long)var2_3);
                                var20_21 = _5f_0.d("o", (Object)_5f_0.d("\u00ed", (Object)var18_17, (long)5272110448919998101L, (long)var2_3), (Object)var14_9, (long)5272201704730107515L, (long)var2_3);
                                v26 = _5f_0.d("o", (Object)var20_21, (long)5274793967791336779L, (long)var2_3);
                                v27 = var13_8;
                                if (var2_3 < 0L) break block29;
                                if (v27 != 0) break block35;
                                try {
                                    block36: {
                                        if (v26 == false) break block30;
                                        break block36;
                                        catch (PatternSyntaxException v28) {
                                            throw _5f_0.a(v28);
                                        }
                                    }
                                    v26 = _5f_0.d("o", (Object)var20_21, (long)5272641068619924264L, (long)var2_3);
                                }
                                catch (PatternSyntaxException v29) {
                                    throw _5f_0.a(v29);
                                }
                            }
                            v27 = 1;
                        }
                        if (v26 >= v27) break block31;
                    }
                    v21 /* !! */  = (CallSite)var13_8;
                    if (var2_3 <= 0L) continue;
                    if (v21 /* !! */  == false) continue block20;
                }
                try {
                    v30 = new Object[5];
                    v30[4] = var19_19;
                    v30[3] = (int)_5f_0.d("o", (Object)var20_21, (int)1, (long)5271564252930174042L, (long)var2_3);
                    v30[2] = (int)_5f_0.d("o", (Object)var20_21, (int)1, (long)5271851101199030294L, (long)var2_3);
                    v30[1] = var4_2;
                    v30[0] = var11_7;
                    return _5f_0.d("o", (Object)this, (Object)v30, (long)5272710946734147295L, (long)var2_3);
                }
                catch (PatternSyntaxException var20_22) {
                    v21 /* !! */  = (CallSite)var13_8;
                    if (var2_3 <= 0L) continue;
                    if (v21 /* !! */  != false) break block20;
                    continue block20;
                }
            }
            break;
        }
        return var4_2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5f_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5f_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5f_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

