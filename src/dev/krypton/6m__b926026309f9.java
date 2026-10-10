/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._40;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
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

/*
 * Renamed from dev.krypton.6m
 */
public class _6m_0
extends _6x_0 {
    private final _9r cfr_renamed_2;
    private final _9r cfr_renamed_6;
    private final _9r cfr_renamed_7;
    private final _9r cfr_renamed_9;
    private final _92 cfr_renamed_1;
    private boolean cfr_renamed_4;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_8;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _6m_0(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x76DE3F00AD16L;
        long l5 = l3 ^ 0x66BE0DC9D485L;
        long l6 = l3 ^ 0x5CA3D6D1D447L;
        long l7 = l6 >>> 8;
        int n = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x20E6A843257FL;
        long l9 = l3 ^ 0x3F263B67CA0DL;
        long l10 = l3 ^ 0x7592F9B541DBL;
        super((int)_6m_0.a("y", 5997, (long)(0x2F4E80F180372FCAL ^ l2)), -1, (_4r)((Object)_6m_0.c("\u00c8", -8332387852165851032L, (long)l2)), l8);
        this.cfr_renamed_2 = new _9r((int)_6m_0.a("y", 6470, (long)(0x7ACF009E092421ECL ^ l2)), false, l4);
        this.cfr_renamed_6 = new _9r((int)_6m_0.a("y", 5111, (long)(0x4AAAC34F885A2B5EL ^ l2)), false, l4);
        this.cfr_renamed_7 = new _9r((int)_6m_0.a("y", 3042, (long)(0x2293DC05E5EF334FL ^ l2)), false, l4);
        this.cfr_renamed_9 = new _9r((int)_6m_0.a("y", 22446, (long)(0x16B2A053BDA56F08L ^ l2)), false, l4);
        this.cfr_renamed_1 = new _92((int)_6m_0.a("y", 20959, (long)(0x6653CF955B76E970L ^ l2)), 1.0, l5, 20.0, 2.0, 1.0);
        CallSite callSite = _6m_0.c("\u00d9", (Object)this, -8335446550558160586L, (long)l2);
        CallSite callSite2 = _6m_0.c("\u00d9", (Object)this, -8332758856818324664L, (long)l2);
        _6m_0.c("\u00d1", (Object)callSite2, -8331782092655964525L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n);
        objectArray[0] = l7;
        _6m_0.c("\u00fa", (Object)callSite, (Object)objectArray, -8335183159739917805L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_6m_0.c("\u00d9", (Object)this, -8335475929300450094L, (long)l2), _6m_0.c("\u00d9", (Object)this, -8331918592781435441L, (long)l2), _6m_0.c("\u00d9", (Object)this, -8332758856818324664L, (long)l2), _6m_0.c("\u00d9", (Object)this, -8335446550558160586L, (long)l2), _6m_0.c("\u00d9", (Object)this, -8332212377947790919L, (long)l2)};
        objectArray2[0] = l9;
        _6m_0.c("\u00fa", (Object)this, (Object)objectArray2, -8332131388762240429L, (long)l2);
        _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 27544, (long)(0x747AEE3AC5A25336L ^ l2)), -8331716822887210101L, (long)l2);
        _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 17777, (long)(0x41CE9EAA56C37DDDL ^ l2)), -8332476371855250436L, (long)l2);
        _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 17777, (long)(0x41CE9EAA56C37DDDL ^ l2)), -8331830428066993253L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _6m_0.b = l.a(1734283371339877464L, 7562707667414843810L, MethodHandles.lookup().lookupClass()).a(154687160497802L);
                _6m_0.j = new Object[48];
                _6m_0.k = new String[48];
                _6m_0.b();
                _6m_0.f = new HashMap<K, V>(13);
                var0 = _6m_0.b ^ 138811244238604L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00fe\u001f\u00d2\u00ec\u00df\u00b0\u00c3\u001c\u00c6\u00a40\u001e\u00c3A\u00f1\u00b3+\u00f5=\u007fv\u00b22\u00e6\u00d0\u00afa\u0087$h \u00f9\u00eex\u0013\u00f2\u0091\u0082H=3\u00c8q\u00f1}\u00d17\u00f3X\u00e0\u0018q\u00b9\u0010)7@\u0017b\u0099\u0086\u00d0T\u0094";
                var7_6 = "\u00fe\u001f\u00d2\u00ec\u00df\u00b0\u00c3\u001c\u00c6\u00a40\u001e\u00c3A\u00f1\u00b3+\u00f5=\u007fv\u00b22\u00e6\u00d0\u00afa\u0087$h \u00f9\u00eex\u0013\u00f2\u0091\u0082H=3\u00c8q\u00f1}\u00d17\u00f3X\u00e0\u0018q\u00b9\u0010)7@\u0017b\u0099\u0086\u00d0T\u0094".length();
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
                    var6_5 = ";fy\u00bb\u001e\u0016\u0000T\u00e6!\u00cd\u00e2\u0013\u0016\u0019n";
                    var7_6 = ";fy\u00bb\u001e\u0016\u0000T\u00e6!\u00cd\u00e2\u0013\u0016\u0019n".length();
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
        _6m_0.d = var8_3;
        _6m_0.e = new Integer[10];
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
            case 0 -> 36;
            case 1 -> 52;
            case 2 -> 2;
            case 3 -> 19;
            case 4 -> 55;
            case 5 -> 29;
            case 6 -> 23;
            case 7 -> 4;
            case 8 -> 26;
            case 9 -> 31;
            case 10 -> 60;
            case 11 -> 62;
            case 12 -> 38;
            case 13 -> 53;
            case 14 -> 46;
            case 15 -> 35;
            case 16 -> 54;
            case 17 -> 8;
            case 18 -> 10;
            case 19 -> 63;
            case 20 -> 42;
            case 21 -> 15;
            case 22 -> 50;
            case 23 -> 28;
            case 24 -> 47;
            case 25 -> 39;
            case 26 -> 18;
            case 27 -> 40;
            case 28 -> 5;
            case 29 -> 6;
            case 30 -> 41;
            case 31 -> 43;
            case 32 -> 49;
            case 33 -> 13;
            case 34 -> 7;
            case 35 -> 11;
            case 36 -> 0;
            case 37 -> 34;
            case 38 -> 20;
            case 39 -> 45;
            case 40 -> 57;
            case 41 -> 33;
            case 42 -> 21;
            case 43 -> 25;
            case 44 -> 32;
            case 45 -> 9;
            case 46 -> 30;
            case 47 -> 48;
            case 48 -> 59;
            case 49 -> 44;
            case 50 -> 37;
            case 51 -> 1;
            case 52 -> 58;
            case 53 -> 51;
            case 54 -> 27;
            case 55 -> 22;
            case 56 -> 61;
            case 57 -> 16;
            case 58 -> 56;
            case 59 -> 24;
            case 60 -> 12;
            case 61 -> 17;
            case 62 -> 3;
            default -> 14;
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
        _6m_0.k[n3] = new String(cArray);
        return n3;
    }

    @_3i_0
    public void cfr_renamed_1(_40 var1_1) {
        block77: {
            _6m_0 m_0;
            long l2;
            block76: {
                Object object;
                block74: {
                    _4w[] wArray;
                    block75: {
                        long l3;
                        long l4;
                        block72: {
                            block73: {
                                block70: {
                                    long l5;
                                    block71: {
                                        CallSite callSite;
                                        block69: {
                                            CallSite callSite2;
                                            CallSite callSite3;
                                            block66: {
                                                _6m_0 m_02;
                                                block68: {
                                                    block67: {
                                                        CallSite callSite4;
                                                        block65: {
                                                            _6m_0 m_03;
                                                            block63: {
                                                                block64: {
                                                                    CallSite callSite5;
                                                                    block61: {
                                                                        block62: {
                                                                            long l6 = l2 = b ^ 0x32DDEA35450CL;
                                                                            l5 = l6 ^ 0x3F8F5FEC52E0L;
                                                                            l4 = l6 ^ 0x15F83107A2B4L;
                                                                            l3 = l6 ^ 0x6FB5E45C4681L;
                                                                            wArray = _3s.cfr_renamed_5();
                                                                            try {
                                                                                callSite5 = _6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)this, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2);
                                                                                if (wArray != null) break block61;
                                                                                if (callSite5 != null) break block62;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _6m_0.a(matchException);
                                                                            }
                                                                            return;
                                                                        }
                                                                        callSite5 = _6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)this, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2);
                                                                    }
                                                                    CallSite callSite6 = _6m_0.c("\u00fa", (Object)callSite5, 8012643409738562512L, (long)l2);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    m_03 = this;
                                                                                    if (wArray != null) break block63;
                                                                                    if (_6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)m_03, 8015581212385519549L, (long)l2), (long)l4, 8012389007932877294L, (long)l2) == false) break block64;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _6m_0.a(matchException);
                                                                                }
                                                                                callSite4 = _6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)this, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2);
                                                                                if (wArray != null) break block65;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _6m_0.a(matchException);
                                                                            }
                                                                            if (_6m_0.c("\u00fa", (Object)callSite4, 8013011548402970884L, (long)l2) == false) break block64;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _6m_0.a(matchException);
                                                                        }
                                                                        return;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _6m_0.a(matchException);
                                                                    }
                                                                }
                                                                m_03 = this;
                                                            }
                                                            callSite4 = _6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)m_03, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                callSite3 = _6m_0.c("\u00fa", (Object)_6m_0.c("\u00fa", (Object)callSite4, 8015420083683370644L, (long)l2), 8012727098395674482L, (long)l2);
                                                                                callSite2 = _6m_0.c("\u00c8", 8015478455774874533L, (long)l2);
                                                                                if (wArray != null) break block66;
                                                                                if (callSite3 == callSite2) break block67;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _6m_0.a(matchException);
                                                                            }
                                                                            m_02 = this;
                                                                            if (wArray != null) break block68;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _6m_0.a(matchException);
                                                                        }
                                                                        if (_6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)m_02, 8012031580610027168L, (long)l2), (long)l4, 8012389007932877294L, (long)l2) == false) break block67;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _6m_0.a(matchException);
                                                                    }
                                                                    m_02 = this;
                                                                    if (wArray != null) break block68;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _6m_0.a(matchException);
                                                                }
                                                                if (_6m_0.c("\u00d9", (Object)m_02, 8012599220417169555L, (long)l2) != false) break block67;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _6m_0.a(matchException);
                                                            }
                                                            _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 25296, (long)(0x63B1F04FEE793917L ^ l2)), 8012599220417169555L, (long)l2);
                                                            Object[] objectArray = new Object[2];
                                                            objectArray[1] = _6m_0.c("\u00c8", 8015478455774874533L, (long)l2);
                                                            objectArray[0] = l3;
                                                            _6m_0.c("\u00d1", (Object)objectArray, 8012813446277791500L, (long)l2);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6m_0.a(matchException);
                                                        }
                                                    }
                                                    m_02 = this;
                                                }
                                                try {
                                                    callSite = _6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)m_02, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2);
                                                    if (wArray != null) break block69;
                                                    callSite3 = _6m_0.c("\u00fa", (Object)_6m_0.c("\u00fa", (Object)callSite, 8015420083683370644L, (long)l2), 8012727098395674482L, (long)l2);
                                                    callSite2 = _6m_0.c("\u00c8", 8015478455774874533L, (long)l2);
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6m_0.a(matchException);
                                                }
                                            }
                                            try {
                                                if (callSite3 == callSite2) {
                                                    _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 17777, (long)(0x41CEFEC09E719EB2L ^ l2)), 8012599220417169555L, (long)l2);
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw _6m_0.a(matchException);
                                            }
                                            callSite = _6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)this, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l5;
                                                                double d = (double)_6m_0.c("\u00fa", (Object)callSite, 8015683205582017404L, (long)l2) - _6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)this, 8015822313671567961L, (long)l2), (Object)objectArray, 8012461934498205570L, (long)l2);
                                                                object = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                                                                if (wArray != null) break block70;
                                                                if (object > 0) break block71;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _6m_0.a(matchException);
                                                            }
                                                            object = _6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)this, 8012879679237679143L, (long)l2), (long)l4, 8012389007932877294L, (long)l2);
                                                            if (wArray != null) break block70;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _6m_0.a(matchException);
                                                        }
                                                        if (object == false) break block71;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _6m_0.a(matchException);
                                                    }
                                                    object = _6m_0.c("\u00d9", (Object)this, 8012092697032229092L, (long)l2);
                                                    if (wArray != null) break block70;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _6m_0.a(matchException);
                                                }
                                                if (object != false) break block71;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6m_0.a(matchException);
                                            }
                                            _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 25784, (long)(0x78C4581904DBBF7CL ^ l2)), 8012092697032229092L, (long)l2);
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = _6m_0.c("\u00c8", 8015478455774874533L, (long)l2);
                                            objectArray[0] = l3;
                                            _6m_0.c("\u00d1", (Object)objectArray, 8012813446277791500L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw _6m_0.a(matchException);
                                        }
                                    }
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l5;
                                    double d = (double)_6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)this, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2), 8015683205582017404L, (long)l2) - _6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)this, 8015822313671567961L, (long)l2), (Object)objectArray, 8012461934498205570L, (long)l2);
                                    object = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                }
                                try {
                                    try {
                                        if (wArray != null) break block72;
                                        if (object <= 0) break block73;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6m_0.a(matchException);
                                    }
                                    _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 17777, (long)(0x41CEFEC09E719EB2L ^ l2)), 8012092697032229092L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw _6m_0.a(matchException);
                                }
                            }
                            object = _6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)this, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2), 8015722077722312776L, (long)l2);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (wArray != null) break block74;
                                                if (object != false) break block75;
                                            }
                                            catch (MatchException matchException) {
                                                throw _6m_0.a(matchException);
                                            }
                                            object = _6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)this, 8012300206395474646L, (long)l2), (long)l4, 8012389007932877294L, (long)l2);
                                            if (wArray != null) break block74;
                                        }
                                        catch (MatchException matchException) {
                                            throw _6m_0.a(matchException);
                                        }
                                        if (object == false) break block75;
                                    }
                                    catch (MatchException matchException) {
                                        throw _6m_0.a(matchException);
                                    }
                                    object = _6m_0.c("\u00d9", (Object)this, 8011908359935772916L, (long)l2);
                                    if (wArray != null) break block74;
                                }
                                catch (MatchException matchException) {
                                    throw _6m_0.a(matchException);
                                }
                                if (object != false) break block75;
                            }
                            catch (MatchException matchException) {
                                throw _6m_0.a(matchException);
                            }
                            _6m_0.c("\u00da", (Object)this, (boolean)_6m_0.a("y", 25784, (long)(0x78C4581904DBBF7CL ^ l2)), 8011908359935772916L, (long)l2);
                            Object[] objectArray = new Object[2];
                            objectArray[1] = _6m_0.c("\u00c8", 8015478455774874533L, (long)l2);
                            objectArray[0] = l3;
                            _6m_0.c("\u00d1", (Object)objectArray, 8012813446277791500L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw _6m_0.a(matchException);
                        }
                    }
                    try {
                        m_0 = this;
                        if (wArray != null) break block76;
                        object = _6m_0.c("\u00fa", (Object)_6m_0.c("\u00d9", (Object)_6m_0.c("\u00d9", (Object)m_0, 8012914968737787806L, (long)l2), 8015526860804829535L, (long)l2), 8015722077722312776L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _6m_0.a(matchException);
                    }
                }
                if (object == false) break block77;
                m_0 = this;
            }
            _6m_0.c("\u00da", (Object)m_0, (boolean)_6m_0.a("y", 17777, (long)(0x41CEFEC09E719EB2L ^ l2)), 8011908359935772916L, (long)l2);
        }
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "yc\u001f\u0006*)yc\bZ&&c(\bD&3dY\\\u001cq";
        objectArray[1] = Float.TYPE;
        _6m_0.k[1] = "java/lang/Float";
        objectArray[2] = ")\u001eL1{w4\u000bNp~+{\u0016";
        objectArray[3] = "@v\"bG\u001e]c #BB\u001da";
        objectArray[4] = "S&m(WnN3oiR2\u000eq";
        objectArray[5] = Boolean.TYPE;
        _6m_0.k[5] = "java/lang/Boolean";
        objectArray[6] = "\u00136x\u001e\u0016\u000e\u00136oB\u001a\u0001\t}o\\\u001a\u0014\u000e\f=\u0007B^";
        objectArray[7] = "\u0004f\n\u0002;\u0007\u0004f\u001d^7\b\u001e-\u001d@7\u001d\u0019\\M\u001df";
        objectArray[8] = "\u0006BG\u000bxO\u0006BPWt@\u001c\tPItU\u001bx\u0002\u001d%\u0014";
        objectArray[9] = "e,'!\u007f+e,0}s$\u007fg0cs1x\u0016b8+p";
        objectArray[10] = "\u000bdR5eD\u0016qPt`\u0018W{";
        objectArray[11] = " \u007f\u0010B2nU_\u001bM#!4Q\u0010F'{@";
        objectArray[12] = "L\u001b\u0013vB\u0001Q\u000e\u00117G]\u001e\u0006";
        objectArray[13] = "xF{++oxFlw'`b\rli'ue|>3p7";
        objectArray[14] = "y\u0012\u0015K#t\f2\u001eD2;m<\u0015O6a\u0019";
        objectArray[15] = Double.TYPE;
        _6m_0.k[15] = "java/lang/Double";
        objectArray[16] = Long.TYPE;
        _6m_0.k[16] = "java/lang/Long";
        objectArray[17] = "O\fV\u0019\u0012\u0011R\u0019TX\u0017M\u0012\\";
        objectArray[18] = "^u#tG\u001e+U({VQJ[#pR\u000b>";
        objectArray[19] = "SNG\u0006.\u001cN[EG+@\u0003Y";
        objectArray[20] = "}O<P_+\bo7_Ndia<TJ>\u001d";
        objectArray[21] = Void.TYPE;
        _6m_0.k[21] = "java/lang/Void";
        objectArray[22] = "<\u001a>1\u000f\u0000\"\u0012$~n\u0017<\u001e+$R";
        objectArray[23] = "xnVoG|saG &rxjCz";
        objectArray[24] = "&\u001d?\u000b6\u0015,Ext3H;C%\u0018\u0001\u001b\u007f\u0018xto\u0019;\u0018z\u000e9\u001c>_B";
        objectArray[25] = "\u0005\u001eKi\u0005\u0007\r\u0003L9}\\<]Iv\u0013\u0005[\fG7B";
        objectArray[26] = ")\u001f(b\u0019,!\u0002/2ax\u0010\\3`Y;j]0wZ";
        objectArray[27] = "/o:p e%7}\u000f%821 c\u0017ora}?@n* {tqo.),\u000f";
        objectArray[28] = "\b\u0007vJ\u00051\u0002_15\u0000l\u0015YlY2?Q\u0006:5YbSYi\f\u0000lU^\u000b";
        objectArray[29] = "~<A\t%A~1\u0001P\u0015\f\u0014-\u001cUy\fx}\u001cE%0~<A\t%A~1\u0001P\u0015";
        objectArray[30] = "\u0017\u0010gDL\tUIa\r4\u0002KB`\u0013cU\u0015\u00158\u007fURWPdO_\n\u0010";
        objectArray[31] = "!FkJT)zCj\u001f3v}Sv\u0017d(&\u000e\"{\ra-C}B\u000ev,G";
        objectArray[32] = "8\u0018\u0016\u001c\u0010\u00030\u0005\u0011LhZ\u0001[\u0014\u0003\u0006\u0001f\n\u001aBW";
        objectArray[33] = "\u0015,)\u0010sZ[v-\u0003\u0012\u0004*%{\u001b~\u0005Fu{\u000b\"9\u0011,gFi\b\u0010(n\u0011\u0012";
        objectArray[34] = "\u0015\u007f\u0013\u0004k>\u001f'T{nc\b!\t\u0017\\0Lz_{0j\u0005}\u0015J1n\f*n";
        objectArray[35] = "/~2\u0010\u0011``1<\u0015n;\u001f1h\u0013Uzzs1\u0015\u001c";
        objectArray[36] = "\u0011UP\u001cj\u001e\u0019HWL\u0012K(\u0017]\u0003.\u0000\u0019\u0016Y\ny";
        objectArray[37] = "9R/W\u0015UkCuS(w\u0012~[tt<9R/W\u0015UkCuS";
        objectArray[38] = "\u0011mK\u000b}!HcM\f\u001f}@r\u0011\fsO\u0012?IZ\u001f&T?\f\u0004&%C>\bk";
        objectArray[39] = "R}%KykX%b4|6O#?XN`\n~d\u0004\u0019jV=h_d8Bx*4";
        objectArray[40] = "\u0006y_9L#\u000edXi4y?:]&Z!XkSg\u000b";
        objectArray[41] = "Jr(2\u00166\u0005=&7imzm 3\u0005h\u0016= #YT\u0014;?+R:\u00139ski";
        objectArray[42] = "\u001ap\riBB\u001bs\u001aj0\u0002 o\f0\\\u0004L?\f \u00008Iy\u0006 \n\u0004Zh\b`0";
        objectArray[43] = "l*h-\u0013+=$)|tvV+%=\u001b(:qu|\u001dLm%h\u007f\u000f}l!a(t";
        objectArray[44] = "/\u001dJZE\u0000'\u0000M\n=^\u0016^HES\u0002q\u000fF\u0004\u0002";
        objectArray[45] = "\t\u0006\n(5(\u0001\u001b\rxMp0D\u00077q6\u0001E\u0003>&";
        objectArray[46] = "u\u0016LW2z{\u001cDE]ev\u0000\bD'r]\u001e\u0013c {\u007fy\u001a\u001debvE\u0011O''\u001b\u0016M\u001d r'\u001d\u001f_e\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[47] = "\u001e\u001fc1?\"\u0016\u0002daG\u007f']n.{<\u0016\\j',";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d9' || c == '\u00da' || c == '\u00c8' || c == 'x') {
                field = _6m_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6m_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _6m_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6m" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _6m_0.e(l2, l3);
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
                clazz3 = _6m_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6m_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6m_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6m_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6m_0.f(1625025464404668L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6m_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6m_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6m_0.f(1625025464404668L, 0L);
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
            int n = _6m_0.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6m_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6m_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6m_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6m_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6m_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x34FB;
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
                throw new RuntimeException("dev/krypton/6m", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6m_0.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6m" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6m_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _6m_0.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6m_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6m_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6m_0.c(clazz3, string2, clazz2)) != null) {
                    _6m_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6m_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6m_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6m_0.f(1625025464404668L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6m_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6m_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

