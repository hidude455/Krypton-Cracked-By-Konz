/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_9799
 *  org.joml.Matrix4f
 */
package dev.krypton;

import dev.krypton._0E;
import dev.krypton._0j;
import dev.krypton._4w;
import dev.krypton._8B;
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
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import org.joml.Matrix4f;

/*
 * Renamed from dev.krypton.3Q
 */
public class _3q_0
implements _0E {
    public static final _3q_0 cfr_renamed_3;
    private final class_9799 cfr_renamed_1;
    private final class_4597.class_4598 cfr_renamed_0;
    private final class_4587 cfr_renamed_8;
    private final Matrix4f cfr_renamed_2;
    public double cfr_renamed_5;
    public boolean cfr_renamed_7;
    private boolean cfr_renamed_4;
    private double cfr_renamed_6;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] k;
    private static final String[] l;

    private _3q_0(long l2) {
        l2 = a ^ l2;
        this.cfr_renamed_1 = new class_9799((int)_3q_0.b("d", 26063, (long)(0xF043A032FCC7394L ^ l2)));
        this.cfr_renamed_0 = _3q_0.d("\u00ca", (Object)_3q_0.d("\u00cc", (Object)this, 4415135905031912731L, (long)l2), 4415155853259469832L, (long)l2);
        this.cfr_renamed_8 = new class_4587();
        this.cfr_renamed_2 = new Matrix4f();
        _3q_0.d("\u00ea", (Object)this, 2.0, 4415590211460814340L, (long)l2);
        _3q_0.d("\u00ea", (Object)this, 1.0, 4414732793255567796L, (long)l2);
    }

    @Override
    public void cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        _3q_0.d("\u00ea", (Object)this, (double)d, 8050015642311750471L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public double double_8(Object[] objectArray) {
        _4w[] wArray;
        Object object;
        Object object2;
        long l2;
        block11: {
            _4w[] wArray2;
            block12: {
                boolean bl;
                Object object3;
                block13: {
                    int n;
                    block9: {
                        object3 = (String)objectArray[0];
                        l2 = (Long)objectArray[1];
                        n = (Integer)objectArray[2];
                        bl = (Boolean)objectArray[3];
                        wArray2 = _0j.cfr_renamed_1();
                        try {
                            try {
                                object2 = _3q_0.d("\u00e0", (Object)object3, -5155258010529118054L, (long)l2);
                                if (l2 < 0L || wArray2 == null) break block9;
                                if (object2 != false) {
                                    return 0.0;
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                throw _3q_0.a(runtimeException);
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw _3q_0.a(runtimeException);
                        }
                        object2 = n;
                    }
                    try {
                        object = _3q_0.d("\u00e0", (Object)object3, -5152155660469003523L, (long)l2);
                        wArray = wArray2;
                        if (l2 <= 0L) break block11;
                        if (wArray == null) break block12;
                        if (object2 == object) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _3q_0.a(runtimeException);
                    }
                    object3 = _3q_0.d("\u00e0", (Object)object3, 0, (int)n, -5156313749777508737L, (long)l2);
                }
                Object object = _3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)_3q_0.d("\u00cd", -5154926359447167115L, (long)l2), -5156084442819296701L, (long)l2), (Object)object3, -5156158849945969450L, (long)l2);
                object = bl;
            }
            wArray = wArray2;
        }
        if (wArray == null) return (double)(object2 + object) * _3q_0.d("\u00cc", (Object)this, -5156536478210927821L, (long)l2);
        if (object != false) {
            object = true;
            return (double)(object2 + object) * _3q_0.d("\u00cc", (Object)this, -5156536478210927821L, (long)l2);
        }
        object = false;
        return (double)(object2 + object) * _3q_0.d("\u00cc", (Object)this, -5156536478210927821L, (long)l2);
    }

    @Override
    public double double_9(Object[] objectArray) {
        boolean bl;
        CallSite callSite;
        long l2;
        block2: {
            block3: {
                l2 = (Long)objectArray[0];
                boolean bl2 = (Boolean)objectArray[1];
                _4w[] wArray = _0j.cfr_renamed_1();
                try {
                    _3q_0.d("\u00ca", (Object)_3q_0.d("\u00cc", (Object)_3q_0.d("\u00cd", -4356057939778870129L, (long)l2), -4356175803277772359L, (long)l2), -4356412534021978394L, (long)l2);
                    callSite = _3q_0.b("d", 19173, (long)(0x662F722241972272L ^ l2));
                    bl = bl2;
                    if (wArray == null) break block2;
                    if (!bl) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw _3q_0.a(runtimeException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return (double)(callSite + bl) * _3q_0.d("\u00cc", (Object)this, -4356558847506405175L, (long)l2);
    }

    @Override
    public void void_0(Object[] objectArray) {
        block4: {
            _3q_0 q_0;
            long l2;
            block5: {
                double d;
                block6: {
                    d = (Double)objectArray[0];
                    boolean bl = (Boolean)objectArray[1];
                    boolean bl2 = (Boolean)objectArray[2];
                    l2 = (Long)objectArray[3];
                    _4w[] wArray = _0j.cfr_renamed_1();
                    try {
                        try {
                            if (l2 <= 0L) break block4;
                            q_0 = this;
                            if (wArray == null) break block5;
                            if (_3q_0.d("\u00cc", (Object)q_0, 7058266612526375913L, (long)l2) == false) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _3q_0.a(runtimeException);
                        }
                        throw new RuntimeException((String)((Object)_3q_0.a("e", 24542, (long)(0x132ECD8270791E8EL ^ l2))));
                    }
                    catch (RuntimeException runtimeException) {
                        throw _3q_0.a(runtimeException);
                    }
                }
                _3q_0.d("\u00ea", (Object)this, (double)(d * 2.0), 7060243000690608824L, (long)l2);
                q_0 = this;
            }
            _3q_0.d("\u00ea", (Object)q_0, (boolean)_3q_0.b("d", 22145, (long)(0x2C2B587CDBCB1C65L ^ l2)), 7058266612526375913L, (long)l2);
        }
    }

    @Override
    public double cfr_renamed_2(Object[] objectArray) {
        double d;
        CallSite callSite;
        double d2;
        long l2;
        long l3;
        block20: {
            CallSite callSite2;
            CallSite callSite3;
            _8B b;
            block21: {
                _4w[] wArray;
                double d3;
                String string;
                block18: {
                    CallSite callSite4;
                    long l4;
                    boolean bl;
                    double d4;
                    block19: {
                        CallSite callSite5;
                        block16: {
                            block17: {
                                l3 = (Long)objectArray[0];
                                string = (String)objectArray[1];
                                d3 = (Double)objectArray[2];
                                d4 = (Double)objectArray[3];
                                b = (_8B)objectArray[4];
                                bl = (Boolean)objectArray[5];
                                long l5 = l3;
                                long l6 = l5 ^ 0x6CE89CD524A9L;
                                l2 = l5 ^ 0x7DC4796F589L;
                                l4 = l5 ^ 0x284523BB14A1L;
                                wArray = _0j.cfr_renamed_1();
                                callSite3 = _3q_0.d("\u00cc", (Object)this, -8966018544513875569L, (long)l3);
                                try {
                                    try {
                                        callSite5 = callSite3;
                                        if (wArray == null) break block16;
                                        if (callSite5 != false) break block17;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw _3q_0.a(runtimeException);
                                    }
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l6;
                                    _3q_0.d("\u00e0", (Object)this, (Object)objectArray2, -8965908615084580359L, (long)l3);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw _3q_0.a(runtimeException);
                                }
                            }
                            d3 += 0.5 * _3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3);
                            d4 += 0.5 * _3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3);
                            callSite5 = _3q_0.d("\u00cc", (Object)b, -8964412494323170916L, (long)l3);
                        }
                        callSite2 = callSite5;
                        _3q_0.d("\u00ea", (Object)b, (int)((int)((double)_3q_0.d("\u00cc", (Object)b, -8964412494323170916L, (long)l3) / 255.0 * _3q_0.d("\u00cc", (Object)this, -8962633996235989138L, (long)l3) * 255.0)), -8964412494323170916L, (long)l3);
                        callSite4 = _3q_0.d("\u00cc", (Object)this, -8962718191658079209L, (long)l3);
                        try {
                            if (wArray == null) break block18;
                            if (_3q_0.d("\u00cc", (Object)this, -8964125577110094527L, (long)l3) == false) break block19;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _3q_0.a(runtimeException);
                        }
                        _3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)this, -8963181617184418513L, (long)l3), -8964344595711712038L, (long)l3);
                        _3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)this, -8963181617184418513L, (long)l3), (float)((float)_3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3)), (float)((float)_3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3)), 1.0f, -8962480299432093703L, (long)l3);
                        callSite4 = _3q_0.d("\u00e0", (Object)_3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)this, -8963181617184418513L, (long)l3), -8964224650989557538L, (long)l3), -8964157924827116302L, (long)l3);
                    }
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l4;
                    _3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)_3q_0.d("\u00cd", -8963570073056205672L, (long)l3), -8963027681970636370L, (long)l3), (Object)string, (float)((float)(d3 / _3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3))), (float)((float)(d4 / _3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3))), (int)_3q_0.d("\u00e0", (Object)b, (Object)objectArray3, -8962323746596827051L, (long)l3), (boolean)bl, (Object)callSite4, (Object)_3q_0.d("\u00cc", (Object)this, -8962571147121463968L, (long)l3), (Object)_3q_0.d("\u00cd", -8965601911675973970L, (long)l3), 0, (int)_3q_0.b("d", 10030, (long)(0x240E625DBDBB8FADL ^ l3)), -8963444495699000789L, (long)l3);
                }
                d2 = d3 / _3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3) + (double)_3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)_3q_0.d("\u00cd", -8963570073056205672L, (long)l3), -8963027681970636370L, (long)l3), (Object)string, -8963111501774133445L, (long)l3);
                try {
                    try {
                        callSite = _3q_0.d("\u00cc", (Object)this, -8964125577110094527L, (long)l3);
                        if (l3 < 0L || wArray == null) break block20;
                        if (callSite == false) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _3q_0.a(runtimeException);
                    }
                    _3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)this, -8963181617184418513L, (long)l3), -8965647240008494074L, (long)l3);
                }
                catch (RuntimeException runtimeException) {
                    throw _3q_0.a(runtimeException);
                }
            }
            _3q_0.d("\u00ea", (Object)b, (int)callSite2, -8964412494323170916L, (long)l3);
            callSite = callSite3;
        }
        try {
            if (callSite == false) {
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l2;
                _3q_0.d("\u00e0", (Object)this, (Object)objectArray4, -8964062766298447054L, (long)l3);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _3q_0.a(runtimeException);
        }
        try {
            d = (d2 - 1.0) * _3q_0.d("\u00cc", (Object)this, -8962928316544194338L, (long)l3);
            if (l3 > 0L && _4w.cfr_renamed_8() == null) {
                _0j.cfr_renamed_5(new _4w[1]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _3q_0.a(runtimeException);
        }
        return d;
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (boolean)_3q_0.d("\u00cc", (Object)this, 9015496175546302208L, (long)l2);
    }

    @Override
    public void void_8(Object[] objectArray) {
        block7: {
            _3q_0 q_0;
            long l2;
            block8: {
                _3q_0 q_02;
                long l3;
                long l4;
                CallSite callSite;
                block9: {
                    block10: {
                        l2 = (Long)objectArray[0];
                        _4w[] wArray = _0j.cfr_renamed_1();
                        try {
                            if (_3q_0.d("\u00cc", (Object)this, 8510477830222083078L, (long)l2) == false) {
                                throw new RuntimeException((String)((Object)_3q_0.a("e", 21758, (long)(0x23EF6D5781E58240L ^ l2))));
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw _3q_0.a(runtimeException);
                        }
                        callSite = _3q_0.d("\u00ca", 8508633394609072308L, (long)l2);
                        try {
                            try {
                                _3q_0.d("\u00e0", (Object)callSite, 8508447451497394238L, (long)l2);
                                if (l2 <= 0L) break block7;
                                q_0 = this;
                                if (wArray == null) break block8;
                                l4 = 8507300333130418376L;
                                l3 = l2;
                                if (l2 <= 0L) break block9;
                                if (_3q_0.d("\u00cc", (Object)q_0, (long)l4, (long)l3) != false) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _3q_0.a(runtimeException);
                            }
                            _3q_0.d("\u00e0", (Object)callSite, (float)((float)_3q_0.d("\u00cc", (Object)this, 8508513502422441303L, (long)l2)), (float)((float)_3q_0.d("\u00cc", (Object)this, 8508513502422441303L, (long)l2)), 1.0f, 8508991343507375722L, (long)l2);
                        }
                        catch (RuntimeException runtimeException) {
                            throw _3q_0.a(runtimeException);
                        }
                    }
                    q_02 = this;
                    l4 = 8509422695253678313L;
                    l3 = l2;
                }
                _3q_0.d("\u00e0", (Object)_3q_0.d("\u00cc", (Object)q_02, (long)l4, (long)l3), 8510458936540283841L, (long)l2);
                _3q_0.d("\u00e0", (Object)callSite, 8507450063425583923L, (long)l2);
                _3q_0.d("\u00ea", (Object)this, 2.0, 8508513502422441303L, (long)l2);
                q_0 = this;
            }
            _3q_0.d("\u00ea", (Object)q_0, (boolean)_3q_0.b("d", 31180, (long)(0x28C6BF13568B24C2L ^ l2)), 8510477830222083078L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _3q_0.a = dev.krypton.l.a(-7913172747962670833L, 6673527932348227510L, MethodHandles.lookup().lookupClass()).a(56248291714108L);
                    var20 = _3q_0.a ^ 25975835313940L;
                    var22_1 = var20 ^ 15535277275739L;
                    _3q_0.k = new Object[58];
                    _3q_0.l = new String[58];
                    _3q_0.b();
                    _3q_0.e = new HashMap<K, V>(13);
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
                    var18_4 = new String[2];
                    var16_5 = 0;
                    var15_6 = "\u00978\u0094t\u008a\u00c5\u00e2B\u00a3)j\u0004\u00f5\u00d4\u0000%\u00a0\u00a6\u00c8\u008c\u0090\u0094,\u00eaycTmY\u00cbD\u00ccBQ\u0007\u00b79\u00e6\u00cc\u009a\u00aa\u00bd_>i\u0094\u00c9\u00e2\u0001\u00dcM\u00d0\u00c7^\u00c4\u001846l\u00a7Vd\u00f7.3%\u0017q\u00c6u\u0013\u0007Y\u00e5a\u00c6)=\u0011\u0011`\u00ff\u0018\u0003\u00a4\u00a9\u00ac/\u00de\u00b6~\u00e7\u0016\u0095\u00e4w\u00f1C\u008aZ\u00d6sg\u008a\u00a3\u000f\u00a9Y\"r\u001e\u00f5\u00abH\u00da[\u00c0\u0017)I\u00f4\u00c6j\u00ef\u00d3\u00fb{\u00d0\u00971\u0015\u00b8Kb\u00ac\u000f\u00b3\u008fG9\u00e8\u0080\n\u00a4P\u00ff\u00d4f\u00c8\u00f3\u00c6R\u00e6v\u009bW\u00d8R@\u00dfr]\u0014\u0010eY\u00e7\u00be\u0083\u0014\u0005\u0001\u00a0s\u00af\u00c4l";
                    var17_7 = "\u00978\u0094t\u008a\u00c5\u00e2B\u00a3)j\u0004\u00f5\u00d4\u0000%\u00a0\u00a6\u00c8\u008c\u0090\u0094,\u00eaycTmY\u00cbD\u00ccBQ\u0007\u00b79\u00e6\u00cc\u009a\u00aa\u00bd_>i\u0094\u00c9\u00e2\u0001\u00dcM\u00d0\u00c7^\u00c4\u001846l\u00a7Vd\u00f7.3%\u0017q\u00c6u\u0013\u0007Y\u00e5a\u00c6)=\u0011\u0011`\u00ff\u0018\u0003\u00a4\u00a9\u00ac/\u00de\u00b6~\u00e7\u0016\u0095\u00e4w\u00f1C\u008aZ\u00d6sg\u008a\u00a3\u000f\u00a9Y\"r\u001e\u00f5\u00abH\u00da[\u00c0\u0017)I\u00f4\u00c6j\u00ef\u00d3\u00fb{\u00d0\u00971\u0015\u00b8Kb\u00ac\u000f\u00b3\u008fG9\u00e8\u0080\n\u00a4P\u00ff\u00d4f\u00c8\u00f3\u00c6R\u00e6v\u009bW\u00d8R@\u00dfr]\u0014\u0010eY\u00e7\u00be\u0083\u0014\u0005\u0001\u00a0s\u00af\u00c4l".length();
                    var14_8 = 80;
                    var13_9 = -1;
lbl25:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var18_4[var16_5++] = _3q_0.a(var19_10).intern();
                        if ((var13_9 += var14_8) < var17_7) {
                            var14_8 = var15_6.charAt(var13_9);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var13_9;
                    var19_10 = var11_2.doFinal(var15_6.substring(v3, v3 + var14_8).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _3q_0.c = var18_4;
                _3q_0.d = new String[2];
                _3q_0.h = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var20 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v6 = v6;
                    v6[var1_12] = (byte)(var20 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[5];
                var3_14 = 0;
                var4_15 = "\u00b2CV\t\u0099\u00e8'\u00f6\u00e0\u00bf\u00e6\u009c4\u00a5\u0002\u009d#G\u0004\u009f\u00f3\u00b9j>";
                var5_16 = "\u00b2CV\t\u0099\u00e8'\u00f6\u00e0\u00bf\u00e6\u009c4\u00a5\u0002\u009d#G\u0004\u009f\u00f3\u00b9j>".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v7 = var6_13;
                    v8 = var3_14++;
                    v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl63:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "!\u00c2_\u000bi&\u00f3?\u00c5eR\u009c5\u0012$\u00ee";
                    var5_16 = "!\u00c2_\u000bi&\u00f3?\u00c5eR\u009c5\u0012$\u00ee".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v7 = var6_13;
                        v8 = var3_14++;
                        v9 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl76:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var8_19 = v9;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v11 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl89:
                // 1 sources

                ** continue;
            }
        }
        _3q_0.f = var6_13;
        _3q_0.g = new Integer[5];
        _3q_0.cfr_renamed_3 = new _3q_0(var22_1);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x20A3;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/3Q", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _3q_0.d[n2] = _3q_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _3q_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2B16;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/3Q", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _3q_0.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _3q_0.b(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 11;
            case 2 -> 58;
            case 3 -> 52;
            case 4 -> 34;
            case 5 -> 0;
            case 6 -> 63;
            case 7 -> 48;
            case 8 -> 14;
            case 9 -> 4;
            case 10 -> 20;
            case 11 -> 62;
            case 12 -> 6;
            case 13 -> 44;
            case 14 -> 29;
            case 15 -> 42;
            case 16 -> 54;
            case 17 -> 30;
            case 18 -> 46;
            case 19 -> 45;
            case 20 -> 28;
            case 21 -> 23;
            case 22 -> 8;
            case 23 -> 7;
            case 24 -> 59;
            case 25 -> 49;
            case 26 -> 27;
            case 27 -> 12;
            case 28 -> 37;
            case 29 -> 36;
            case 30 -> 32;
            case 31 -> 18;
            case 32 -> 5;
            case 33 -> 57;
            case 34 -> 22;
            case 35 -> 38;
            case 36 -> 2;
            case 37 -> 53;
            case 38 -> 21;
            case 39 -> 24;
            case 40 -> 40;
            case 41 -> 41;
            case 42 -> 33;
            case 43 -> 55;
            case 44 -> 1;
            case 45 -> 39;
            case 46 -> 31;
            case 47 -> 43;
            case 48 -> 25;
            case 49 -> 47;
            case 50 -> 3;
            case 51 -> 9;
            case 52 -> 50;
            case 53 -> 51;
            case 54 -> 35;
            case 55 -> 17;
            case 56 -> 10;
            case 57 -> 56;
            case 58 -> 60;
            case 59 -> 15;
            case 60 -> 61;
            case 61 -> 13;
            case 62 -> 19;
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
        _3q_0.l[n3] = new String(cArray);
        return n3;
    }

    private static void b() {
        Object[] objectArray = k;
        k[0] = "BEi\u0000)\f_PkA,P\u0015q";
        objectArray[1] = Boolean.TYPE;
        _3q_0.l[1] = "java/lang/Boolean";
        objectArray[2] = Double.TYPE;
        _3q_0.l[2] = "java/lang/Double";
        objectArray[3] = "6vm*t`6vzvxo,=zhxz+L 3 0";
        objectArray[4] = ".\fH\u0010w\u000e.\f_L{\u00014G_R{\u001436\b\u000b#P";
        objectArray[5] = "x\u007f\u0013\u000bRWx\u007f\u0004W^Xb4\u0004I^MeES\u0010\u0006\t2y\u000bDLMI.R\u001c\u0007";
        objectArray[6] = "[K\u001b{^\u0013[K\f'R\u001cA\u0000\f9R\tFq[`\u000bM";
        objectArray[7] = Void.TYPE;
        _3q_0.l[7] = "java/lang/Void";
        objectArray[8] = "e\u001e~\u0004\u001bje\u001eiX\u0017e\u007fUiF\u0017px$9\u0018A";
        objectArray[9] = "\u0001\u001f!Li\b\n\u00100\u0003\u0014\u0010\u0019\u00179J";
        objectArray[10] = Integer.TYPE;
        _3q_0.l[10] = "java/lang/Integer";
        objectArray[11] = "\u000f\u0006\u001f:\nA\u000f\u0006\bf\u0006N\u0015M\bx\u0006[\u0012<X%W";
        objectArray[12] = "\u000b`\u0002Y\u0012<\u000b`\u0015\u0005\u001e3\u0011+\u0015\u001b\u001e&\u0016ZEEHq\u0006i\u0017\u0004\f\nS1GB";
        objectArray[13] = "c7\u000brbv~\"\t3g*?\u0010";
        objectArray[14] = "r{Fi9H\u0007[Mf(\u0007fUFm,]\u0012";
        objectArray[15] = "L\u001b1w\u0007RN\u0005x\u0014\fIQ\u0000.m\u000b";
        objectArray[16] = "Wf\u0005u[]Js\u00074^\u0001\u0003F";
        objectArray[17] = "=u\u0004\f\u0012\u0001HU\u000f\u0003\u0003N)[\u0004\b\u0007\u0014]";
        objectArray[18] = Float.TYPE;
        _3q_0.l[18] = "java/lang/Float";
        objectArray[19] = "=\u0004\u007f,]CH$t#L\f)*\u007f(HV]";
        objectArray[20] = "r\u001a_P,kr\u001aH\f dhQH\u0012 qo \u001fKy58\u001cG\u001f2qCK\u001dHt";
        objectArray[21] = "x\u0013eq!\u0016e\u0006g0$J.";
        objectArray[22] = "{m\u0002<!\u0014ee\u0018s@\u0003{i\u0017)|";
        objectArray[23] = "vTiVUB}[x\u00194LvP|C";
        objectArray[24] = "`zh6\u001c\u001bbd!U\u0017\u0000}aw,\u0010'{ils";
        objectArray[25] = "\u001bJ\u0001/\n@\u0012D\u0002fIM\u0014D\u0016dTKVV\u0015r\u0013J\u0015VBS\u0002A\u001c@\u001eR\u001e\\\f@\u0001";
        objectArray[26] = "8\u0015N\u000exJ9\u0014\\L\u001f\u0016i\u0007^Ys$>A\u000f\u0006.s9\u001a\u0001N~\u0014;\nE\u0006\u001f";
        objectArray[27] = "a\u0004L\u001e}L3\u0011\u0011X\u001f^0\fH\rH\u000bjP\u001dZ\u001f\u00004\u0001S\u0003cR!\\\u0015";
        objectArray[28] = "A[ R'\u0006\u0017\u001ddFI^\u0017_zY%l@\u0019+\u000fr;GB%N(\\ERa\u0006I";
        objectArray[29] = "/Tm\u0010'\u0017#\u001a*\u007fge4Ap\u001b`\u000ft[m";
        objectArray[30] = "\u001e9,\u007ft\u0003\u0012\u007f$qK_th9:\"\u0002\u0017?.\u007f5cIe~p*\u0004Ku:8K";
        objectArray[31] = "\u001bWB*@\u0012ZLSp*\u000eHJ\\oJj\u001aC\u000bkM\u0000\u001aQAv*";
        objectArray[32] = ".U5yyZ8\u0016:(\u0004R<S0]mV;I \u0018kW$I-h}\u0014+\u0018P";
        objectArray[33] = "\u007f\t\u000fpXgsGH\u001f\u0019\u0015,\u001b\u0014t\u001c-w\u0012I$";
        objectArray[34] = "c1TWk>29\n\u001a\u0016nn!\u007f\u0001zlg\u0003[\u000biZ\u007f4Q\u0005\u0016n~8[\u001bfx=7\nf";
        objectArray[35] = "Yzf\u00143WFt8KSGZ2\"O)Pq,9h.YSK0\u0010<L\u000f;dRnA7$aA\"\u0005Gp#\u0013/=";
        objectArray[36] = "AodsX\u0015\u0000tu)2\u0016\u0002~n6H\f\u0019{\u0015u]U\u0007s\u007fuO\u001f\u001a\u0014*%\n\u0015\u0018~*7@\b\u007f*n;\u000b\u0007\u0007ku*Qm";
        objectArray[37] = "^<Mc\u0002\u0005Rr\n\fGw\b#@<\u001dN\t\"R~";
        objectArray[38] = "aFEv\u00186=\u0018]})k1\\D~EYe\u001f\u001e&)0'Q\u001dsQq<@G\u0019\u0016adXCs\u0016s.E$";
        objectArray[39] = "_uq\n\u0000]\u0019qqLmJ\u0001c~\u0019:\u001d_1 uPB\u0001a+M\f\u001c\u0019j";
        objectArray[40] = ">a\u0013U \u0013(\"\u001c\u0004]\u0018:u\u0012Y]\b0\u007f\u0019D?\u00010\u007f\u001f46\u00022s\u0006V?\u00022uv_<\u0000>l\u0014V<\u00008\u001c\u001fS1Z>u\u0016\u000f/_Q";
        objectArray[41] = ":_\u0005|k@pZUz\u0013\rLe\u0000o)Uj\u0006WxlB\u000bZ\u0003/k[aZ\u0011ev<";
        objectArray[42] = "H){#9gDg<Lp\u0015\u00188<%'r]<f ";
        objectArray[43] = "IMOZ\u0019vMN\u001b\u000fhx\u001f^@\f\u0004JH\u0018\u0011ZQ\u001dHB\u001a\u0002\u000ez\rF@\u0007h&\n\u0018L\u0005UpL\\Xk";
        objectArray[44] = "~B\u0002U$\rr\fE:b\u007f}T\u0013\u00033\u0016t\b\r\u0006";
        objectArray[45] = "{n-\u001fm%w jp.W(|6\u001b)osukK";
        objectArray[46] = "*\u0001RtG5&O\u0015\u001b\u000fG{\b\u0015wQz-NQc";
        objectArray[47] = "\u001dmF\u0014xj\u001clTV\u001f6L\u007fVCs\u0004\u001b9\u0007\u001c\"SJbUKo1CbUM\u001f8@`YT}1@`_$t2BlFF}2Bj6\u0019~lQbQ\u001bn(\u0019\u0003";
        objectArray[48] = "~\u001d2\r\u00023rSubFAe\b/\u0006E+%\u00122";
        objectArray[49] = "oL( ;\u000bc\u0002oOsyiEo&\"\u001a>R*1CDd\u0002%.$FtFmO";
        objectArray[50] = "`\u0010in\u0001qvSf?|yh\u0015If\u0000{n\u001d\f`\u0001dn\u0010|vBk?m";
        objectArray[51] = "dc\u000ee2!%x\u001f?X8!U\u001a$$(Zi\u001b<<f0)\u0001!X";
        objectArray[52] = "S5%~\u001a\u001b\u00190uxb\\b0#-\u001a\u0000\b01g\u0007";
        objectArray[53] = "\"\u001b\u00150w(#\u001a\u0007r\u0010ts\t\u0005g|F$OT8+\u0011#\u0014Zpqv!\u0004\u001e8\u0010";
        objectArray[54] = "\u0000\u000bX5p%\u0001\nJw\u0017yQ\u0019Hb{K\u0006^\u0017;/\u001cQ\t\u0014j+uA_\u0010z\u0017";
        objectArray[55] = "\\\u000eq\u0014VJLXu\u0004jF\\\u001e-\u001c\u0006t\u000bYrES#X\u0005!B\u0005JQY?Gj";
        objectArray[56] = "\"\u001bQ\u0017\u0002\u00160ZUQ<B\u0017'\u0010QW\u0004!^VUWB";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "A.C\u0019g)\u001dp[\u0012Vt\u00114B\u0011:FFw\u001fLo\u0011B3SO<i\u0003(B\u0015Vz\u001d+M\u00064s\u001d+Kv=p\u001f'R\u00144p\u001f!\"I9)\u0004/HI+c\u0019HS\u00126uC\"\u0013\b+\u0011\u0015/NO9x\u001csPJV*\u0013'\u0013\u0007=.\u0010sFvft\u001c7@\n4aAq\"I9)\u0004/HI+c\u0019H\u001d\u0019ni\u001b\"\u001d\u000b$t|uCI&p\u001bwS\rn\u0011";
    }

    private static Class f(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _3q_0.e(l2, l3);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                _3q_0.k[n] = clazz = Class.forName(l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _3q_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3q_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2, long l3) {
        int n = _3q_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            String string = l[n];
            int n2 = string.indexOf(8);
            Class clazz = _3q_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3q_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3q_0.c(clazz3, string2, clazz2)) != null) {
                    _3q_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3q_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3q_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3q_0.f(1643213858969441L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3q_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3q_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _3q_0.e(l2, l3);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n];
                int n3 = string2.indexOf(8);
                clazz3 = _3q_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3q_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3q_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3q_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3q_0.f(1643213858969441L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3q_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3q_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3q_0.f(1643213858969441L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == '\u00ea' || c == '\u00cd' || c == 'H') {
                field = _3q_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3q_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _3q_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3q_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_3q_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_3q_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

