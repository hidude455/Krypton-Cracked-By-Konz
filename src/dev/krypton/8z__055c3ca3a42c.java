/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.krypton.4w
 *  dev.krypton.l
 *  dev.krypton.mixin.3e
 *  java.lang.MatchException
 *  net.minecraft.class_1707
 *  net.minecraft.class_1723
 *  net.minecraft.class_1792
 *  net.minecraft.class_490
 */
package dev.krypton;

import dev.krypton._4w;
import dev.krypton.l;
import dev.krypton.mixin._3e;
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
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1707;
import net.minecraft.class_1723;
import net.minecraft.class_1792;
import net.minecraft.class_490;

public class _8z {
    private static String cfr_renamed_17;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void void_0(Object[] objectArray) {
        int n;
        long l2;
        int n2;
        block5: {
            n2 = (Integer)objectArray[0];
            l2 = (Long)objectArray[1];
            l2 = a ^ l2;
            String string = _8z.cfr_renamed_9();
            try {
                n = n2;
                if (string != null) break block5;
                if (n < 0) return;
            }
            catch (MatchException matchException) {
                throw _8z.a(matchException);
            }
            n = n2;
        }
        try {
            if (n > _8z.a("m", 28561, (long)(0x5BBC6581494D2560L ^ l2))) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _8z.a(matchException);
        }
        _8z.b("\u00d8", (Object)_8z.b("\u00d8", (Object)_8z.b("\u00ee", (Object)_8z.b("g", 1578484361482737199L, (long)l2), 1577795505245164682L, (long)l2), 1578205954799895459L, (long)l2), (int)n2, 1579448148448706882L, (long)l2);
        ((_3e)_8z.b("\u00ee", (Object)_8z.b("g", 1578484361482737199L, (long)l2), 1577862752382814321L, (long)l2)).syncSlot();
    }

    public static boolean cfr_renamed_3(Object[] objectArray) {
        Object object;
        block6: {
            Predicate predicate = (Predicate)objectArray[0];
            long l2 = (Long)objectArray[1];
            l2 = a ^ l2;
            CallSite callSite = _8z.b("\u00d8", (Object)_8z.b("\u00ee", (Object)_8z.b("g", 2616531692817426311L, (long)l2), 2615846158459184418L, (long)l2), 2616247698241499659L, (long)l2);
            String string = _8z.cfr_renamed_9();
            for (int i = 0; i < _8z.a("m", 19617, (long)(0xF80BBEE67FB7FCL ^ l2)); ++i) {
                boolean bl;
                block7: {
                    block8: {
                        CallSite callSite2 = _8z.b("\u00d8", (Object)callSite, (int)i, 2613141754165438469L, (long)l2);
                        try {
                            try {
                                object = _8z.b("\u00d8", (Object)predicate, (Object)callSite2, 2614432526061260042L, (long)l2);
                                String string2 = string;
                                if (l2 >= 0L) {
                                    if (string2 != null) break block6;
                                    string2 = string;
                                }
                                if (string2 != null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _8z.a(matchException);
                            }
                            if (object) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _8z.a(matchException);
                        }
                        if (l2 > 0L) continue;
                    }
                    _8z.b("\u00d8", (Object)callSite, (int)i, 2613069814342627562L, (long)l2);
                    bl = true;
                }
                return bl;
            }
            object = false;
        }
        return object;
    }

    public static boolean cfr_renamed_15(Object[] objectArray) {
        Object object;
        block6: {
            Predicate predicate = (Predicate)objectArray[0];
            long l2 = (Long)objectArray[1];
            l2 = a ^ l2;
            CallSite callSite = _8z.b("\u00d8", (Object)_8z.b("\u00ee", (Object)_8z.b("g", -2643128871777740647L, (long)l2), -2642720429383132612L, (long)l2), -2643412225336095467L, (long)l2);
            String string = _8z.cfr_renamed_9();
            for (int i = 0; i < _8z.a("m", 26255, (long)(0x1CC9B576BA1D62CAL ^ l2)); ++i) {
                boolean bl;
                block7: {
                    block8: {
                        CallSite callSite2 = _8z.b("\u00d8", (Object)callSite, (int)i, -2639725755630528741L, (long)l2);
                        try {
                            try {
                                object = _8z.b("\u00d8", (Object)predicate, (Object)_8z.b("\u00d8", (Object)callSite2, -2639753213698362270L, (long)l2), -2641882923360374252L, (long)l2);
                                String string2 = string;
                                if (l2 >= 0L) {
                                    if (string2 != null) break block6;
                                    string2 = string;
                                }
                                if (string2 != null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw _8z.a(matchException);
                            }
                            if (object) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _8z.a(matchException);
                        }
                        if (l2 >= 0L) continue;
                    }
                    _8z.b("\u00d8", (Object)callSite, (int)i, -2639939670174806028L, (long)l2);
                    bl = true;
                }
                return bl;
            }
            object = false;
        }
        return object;
    }

    public static boolean cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_1792 class_17922 = (class_1792)objectArray[1];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x37D26EDEFF85L;
        int n = (int)(l4 >>> 48);
        int n2 = (int)(l4 << 16 >>> 48);
        int n3 = (int)(l4 << 32 >>> 32);
        long l5 = l3 ^ 0x37777473F2E0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = arg_0 -> _8z.cfr_renamed_6((char)n, (char)n2, class_17922, n3, arg_0);
        return (boolean)_8z.b("V", (Object)objectArray2, 165355064495182883L, (long)l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int int_0(Object[] var0) {
        block11: {
            block10: {
                block9: {
                    var3_1 = (class_1792)var0[0];
                    var1_2 = (Long)var0[1];
                    var1_2 = _8z.a ^ var1_2;
                    var4_3 = _8z.cfr_renamed_9();
                    var5_4 = _8z.b("\u00ee", (Object)_8z.b("\u00ee", (Object)_8z.b("g", (long)-6192853534385198650L, (long)var1_2), (long)-6193572040099091613L, (long)var1_2), (long)-6192669914783101427L, (long)var1_2);
                    try {
                        v0 = var5_4 instanceof class_1707;
                        if (var4_3 != null) break block9;
                        if (v0 != 0) {
                        }
                        ** GOTO lbl18
                    }
                    catch (MatchException v1) {
                        throw _8z.a(v1);
                    }
                    var6_5 = (class_1707)var5_4;
                    try {
                        if (var4_3 == null) break block10;
lbl18:
                        // 2 sources

                        v0 = 0;
                    }
                    catch (MatchException v2) {
                        throw _8z.a(v2);
                    }
                }
                return v0;
            }
            var7_6 = 0;
            var8_7 = _8z.b("\u00d8", (Object)var6_5, (long)-6192923873216046286L, (long)var1_2) * _8z.a("m", (int)26255, (long)(2074362520016262037L ^ var1_2));
            var9_8 = 0;
            while (var9_8 < var8_7) {
                block12: {
                    try {
                        v3 /* !! */  = (int)_8z.b("\u00d8", (Object)_8z.b("\u00d8", (Object)_8z.b("\u00d8", (Object)_8z.b("\u00d8", (Object)var5_4, (int)var9_8, (long)-6192792760593918943L, (long)var1_2), (long)-6195900023284577301L, (long)var1_2), (long)-6196215597819673283L, (long)var1_2), (Object)var3_1, (long)-6193281006928321000L, (long)var1_2);
                        if (var4_3 != null) break block11;
                        if (v3 /* !! */  == 0) break block12;
                    }
                    catch (MatchException v4) {
                        throw _8z.a(v4);
                    }
                    ++var7_6;
                }
                ++var9_8;
lbl39:
                // 2 sources

                ** while (var4_3 != null)
lbl40:
                // 1 sources

            }
lbl41:
            // 2 sources

            if (var1_2 <= 0L) ** GOTO lbl39
            v3 /* !! */  = var7_6;
        }
        return v3 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList cfr_renamed_2(Object[] objectArray) {
        int n;
        class_1792 class_17922 = (class_1792)objectArray[0];
        int n2 = ((Boolean)objectArray[1]).booleanValue();
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        String string = _8z.cfr_renamed_9();
        ArrayList arrayList = new ArrayList();
        Object object = n2;
        if (string == null) {
            object = n = (Object)(object != 0 ? 0 : _8z.a("m", 26255, (long)(0x1CC9ED1C7B27EB41L ^ l2)));
        }
        block3: while (n < _8z.a("m", 12960, (long)(0x55AD91486D033F6FL ^ l2))) {
            Object object2;
            try {
                if (_8z.b("\u00d8", (Object)_8z.b("\u00d8", (Object)_8z.b("\u00d8", (Object)_8z.b("\u00ee", (Object)_8z.b("g", 5970330689564922130L, (long)l2), 5969648504434971575L, (long)l2), 5970628500880639134L, (long)l2), (int)n, 5969124399529057936L, (long)l2), 5969220155520761321L, (long)l2) == class_17922) {
                    object2 = _8z.b("\u00d8", arrayList, (Object)_8z.b("V", (int)n, 5970385307334499166L, (long)l2), 5969553870817480365L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw _8z.a(matchException);
            }
            do {
                ++n;
                if (string == null) continue block3;
                object2 = 4;
            } while (l2 < 0L);
            _4w.cfr_renamed_1((String[])new String[object2]);
            return arrayList;
        }
        return arrayList;
    }

    public static void cfr_renamed_17(Object[] objectArray) {
        block11: {
            reference v9;
            CallSite callSite;
            CallSite callSite2;
            long l2;
            block15: {
                Integer n;
                block12: {
                    CallSite callSite3;
                    block13: {
                        CallSite callSite4;
                        block14: {
                            CallSite callSite5;
                            String string;
                            int n2;
                            class_490 class_4902;
                            block10: {
                                class_1792 class_17922 = (class_1792)objectArray[0];
                                l2 = (Long)objectArray[1];
                                class_4902 = (class_490)objectArray[2];
                                n2 = (Integer)objectArray[3];
                                long l3 = (l2 = a ^ l2) ^ 0x226B58D39DE7L;
                                string = _8z.cfr_renamed_9();
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l3;
                                objectArray2[1] = true;
                                objectArray2[0] = class_17922;
                                callSite4 = _8z.b("V", (Object)objectArray2, -1962281559793943928L, (long)l2);
                                try {
                                    try {
                                        callSite5 = _8z.b("\u00d8", (Object)callSite4, -1962193951177560960L, (long)l2);
                                        if (string != null) break block10;
                                        if (callSite5 != false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8z.a(matchException);
                                    }
                                    callSite5 = _8z.b("\u00d8", (Object)callSite4, -1962335278305340640L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw _8z.a(matchException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (callSite5 <= n2) break block11;
                                        CallSite callSite = _8z.b("\u00ee", (Object)_8z.b("g", -1961446741652478193L, (long)l2), -1961919699921012399L, (long)l2);
                                        callSite = _8z.b("\u00ee", (Object)((class_1723)_8z.b("\u00d8", (Object)class_4902, -1963491534781632804L, (long)l2)), -1960360529134826289L, (long)l2);
                                        n = (Integer)((Object)_8z.b("\u00d8", (Object)callSite4, 0, -1960482581720421165L, (long)l2));
                                        if (string != null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw _8z.a(matchException);
                                    }
                                    if (l2 < 0L) break block13;
                                    if (_8z.b("\u00d8", (Object)n, -1960654034126646996L, (long)l2) >= _8z.a("m", 26255, (long)(0x1CC987A999F25D5CL ^ l2))) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw _8z.a(matchException);
                                }
                                v9 = _8z.b("\u00d8", (Object)((Integer)((Object)_8z.b("\u00d8", (Object)callSite4, 0, -1960482581720421165L, (long)l2))), -1960654034126646996L, (long)l2) + _8z.a("m", 18633, (long)(0x2B1BD67F16C47319L ^ l2));
                                break block15;
                            }
                            catch (MatchException matchException) {
                                throw _8z.a(matchException);
                            }
                        }
                        callSite3 = _8z.b("\u00d8", (Object)callSite4, 0, -1960482581720421165L, (long)l2);
                    }
                    n = (Integer)((Object)callSite3);
                }
                v9 = _8z.b("\u00d8", (Object)n, -1960654034126646996L, (long)l2);
            }
            _8z.b("\u00d8", (Object)callSite2, (int)callSite, (int)v9, 1, (Object)_8z.b("g", -1962002175733823840L, (long)l2), (Object)_8z.b("\u00ee", (Object)_8z.b("g", -1961446741652478193L, (long)l2), -1962134461879654998L, (long)l2), -1961606015037382196L, (long)l2);
        }
    }

    private static boolean cfr_renamed_6(char c, char c2, class_1792 class_17922, int n, class_1792 class_17923) {
        boolean bl;
        long l2 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        try {
            bl = class_17923 == class_17922;
        }
        catch (MatchException matchException) {
            throw _8z.a(matchException);
        }
        return bl;
    }

    public static void cfr_renamed_17(String string) {
        cfr_renamed_17 = string;
    }

    public static String cfr_renamed_9() {
        return cfr_renamed_17;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _8z.a = l.a((long)-4878863747006114706L, (long)3067858331739103094L, MethodHandles.lookup().lookupClass()).a(173850737571299L);
                _8z.e = new Object[50];
                _8z.f = new String[50];
                _8z.a();
                _8z.d = new HashMap<K, V>(13);
                _8z.cfr_renamed_17(null);
                var0 = _8z.a ^ 119649842169020L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00d9#{\u00a8/\u0012\u00e9\u00f5_+\u008e\u001b=3\u00d1\b\u00f3\u00e8R\u00cf!\u0099\u00a5\u00e8";
                var7_6 = "\u00d9#{\u00a8/\u0012\u00e9\u00f5_+\u008e\u001b=3\u00d1\b\u00f3\u00e8R\u00cf!\u0099\u00a5\u00e8".length();
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
                    var6_5 = "\u00c4jr\u00a0?!R\u00fa\u000b\u00f5\u0098T\u00c1{)\u00a4";
                    var7_6 = "\u00c4jr\u00a0?!R\u00fa\u000b\u00f5\u0098T\u00c1{)\u00a4".length();
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
        _8z.b = var8_3;
        _8z.c = new Integer[5];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x5F1D;
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
                throw new RuntimeException("dev/krypton/8z", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _8z.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _8z.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 34;
            case 1 -> 24;
            case 2 -> 51;
            case 3 -> 38;
            case 4 -> 9;
            case 5 -> 27;
            case 6 -> 7;
            case 7 -> 62;
            case 8 -> 28;
            case 9 -> 31;
            case 10 -> 1;
            case 11 -> 11;
            case 12 -> 0;
            case 13 -> 17;
            case 14 -> 39;
            case 15 -> 60;
            case 16 -> 10;
            case 17 -> 35;
            case 18 -> 63;
            case 19 -> 22;
            case 20 -> 59;
            case 21 -> 18;
            case 22 -> 47;
            case 23 -> 6;
            case 24 -> 25;
            case 25 -> 26;
            case 26 -> 12;
            case 27 -> 54;
            case 28 -> 58;
            case 29 -> 13;
            case 30 -> 30;
            case 31 -> 48;
            case 32 -> 52;
            case 33 -> 29;
            case 34 -> 53;
            case 35 -> 16;
            case 36 -> 45;
            case 37 -> 14;
            case 38 -> 8;
            case 39 -> 36;
            case 40 -> 3;
            case 41 -> 15;
            case 42 -> 57;
            case 43 -> 42;
            case 44 -> 50;
            case 45 -> 56;
            case 46 -> 61;
            case 47 -> 19;
            case 48 -> 37;
            case 49 -> 32;
            case 50 -> 49;
            case 51 -> 41;
            case 52 -> 55;
            case 53 -> 4;
            case 54 -> 20;
            case 55 -> 43;
            case 56 -> 46;
            case 57 -> 23;
            case 58 -> 21;
            case 59 -> 33;
            case 60 -> 44;
            case 61 -> 2;
            case 62 -> 40;
            default -> 5;
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
        _8z.f[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "U`/}5tHu-<0(\t\u007f";
        objectArray[1] = "\rj>>JuxJ51[:\u0019D>:_`m";
        objectArray[2] = Boolean.TYPE;
        _8z.f[2] = "java/lang/Boolean";
        objectArray[3] = "1CL\u0005o51C[Yc:+\b[Gc/,y\u000b\u001a2";
        objectArray[4] = "\u0007\u001dd?\u000b<\u0007\u001dsc\u00073\u001dVs}\u0007&\u001a''%P";
        objectArray[5] = "^\u0017#yH\f^\u00174%D\u0003D\\4;D\u0016C-fa\u0013T";
        objectArray[6] = Integer.TYPE;
        _8z.f[6] = "java/lang/Integer";
        objectArray[7] = Void.TYPE;
        _8z.f[7] = "java/lang/Void";
        objectArray[8] = "\u001b,1\u0014hy\u001b,&Hdv\u0001g&Vdc\u0006\u0016t\r<)";
        objectArray[9] = "1xh\u007fZ61x\u007f#V9+3\u007f=V,,B-f\u000em";
        objectArray[10] = "aj\u000b\n\u0010w|\u007f\tK\u0015+7";
        objectArray[11] = "*\\%mM;4T?\"\u0005;.^'e\f nm!i\u0007'#\\'i";
        objectArray[12] = "2\r0\u001e=K9\u0002!Q\\E2\t%\u000b";
        objectArray[13] = "_n\u0019qY\u001cTa\b>>\u001eAj\bu\u0005";
        objectArray[14] = ",r#\\pz,r4\u0000|u694\u001e|`1HfE, ";
        objectArray[15] = "i0\\\\aqw8F\u0013\u0003mp%";
        objectArray[16] = "xk\u00158$\rxk\u0002d(\u0002b \u0002z(\u0017eQW%\u007f";
        objectArray[17] = "/mX[^7/mO\u0007R85&O\u0019R-2W\u001dB\u0001m";
        objectArray[18] = "*!\\~\u0000)*!K\"\f&0jK<\f37\u001b\u0019fXw";
        objectArray[19] = "t\f\u0010J8N\u0001,\u001bE)\u0001`\"\u0010N-[\u0014";
        objectArray[20] = "];Nkj#C3T$\u0005$E;AF-%C";
        objectArray[21] = "a=L/K\u0011a=[sG\u001e{v[mG\u000b|\u0007\f8\u0016";
        objectArray[22] = "x)5$wFx)\"x{Ibb\"f{\\e\u0013p=*\u001c";
        objectArray[23] = "R\u0015~\u0003T.R\u0015i_X!H^iAX4O/;\u001a\nr";
        objectArray[24] = ",=\u0000\u0006s\u0004,=\u0017Z\u007f\u000b6v\u0017D\u007f\u001e1\u0007E\u001f.Z";
        objectArray[25] = "\u007f\u0017L%]\u0007%L\u0018t3Y(\u000fy}WE#s\u001b*X\u00034\rM\u007fI]N";
        objectArray[26] = ".So3a\u0003$Piv\u0007W,\u0014jnke~V56\u0007\u000f;\u0002qgg]=\u000ef\t";
        objectArray[27] = "P\bT)1\u000bT\u0014\u0015#Q\u000fT\n..o\u000b\u0002\fPx:\u001a\\v\u001e\u007fa\u001fR\u000b\u0012v/\u00029";
        objectArray[28] = "s\" zA\u00105l4w*J% &rFxvez$\u0014/tb-.PQ\"7<p*\u0012r9}mK\u0013p\"'\u0015";
        objectArray[29] = "]1RkqKH&\u00181N\u001fW7\u0007:\u0019N\tdXVrO]a\u0019($\u001aL?";
        objectArray[30] = ":\u001ep\u0007=]h\u0018|\u0010SXj\u0018z\u001b?j8U\"MS\u0003\u007f\u001b~A!Cf\u0006+|";
        objectArray[31] = ".\u001cH9g\u001ahR\\4\f@x\u001eN1`r(^\u0015f\f\u0019+\t\u0015,rO~\u0018KV1_\u007f\u0019@6cYs\u000e.";
        objectArray[32] = "\u0019J!\"dy\u0015Co?\u000fiPZx9t\u0004\u0019J!\"dy\u0015Co?\u000f=YMz37\u007f\u0011\u001du]";
        objectArray[33] = "G->E$*C1\u007fOD:O!)~x\u007fEh>\u0000.*T6D";
        objectArray[34] = "SaOAi`\u00025Uq2\u0004Q ^\u000bltA=]\r\fhM4F\u0017me\u0006dLq";
        objectArray[35] = "Y<sH\u0018O] 2BxEK\u000fl\u000b\u0004U0{y\u0019\u0013J\b91I\u001c$";
        objectArray[36] = "Z\u0010\u0001Ds@\u001f\u001e\u001f\nNL\u0001\u001a\u001cZ\u0019\u001b_MD6t]\u0005\u0007\u001e\t7Y\u0005\u0005";
        objectArray[37] = "C\u001dir\u0013(NV9xu C\u0001\u0004!\u0018yP\u0006y-\u00117Mm=a\u001f\"AU\u007f)O-/";
        objectArray[38] = "\u0013L{em\u0005\u0018Gxl\u0004R\u001b\u001b~yS\u0003EG'\u0015m\u0006\u001b\u0006s,f\r\u0018\u000f";
        objectArray[39] = "PO\u0007.&\u001f\u0015A\u0019`\u001b\u0013\u000bE\u001a0LDU\u0016G\\q\u0017\nSD:uDVV";
        objectArray[40] = "0i|>{bsm|<\u001d3k{}\"Jb7/#Ns#nwvs&evq";
        objectArray[41] = "[t\fwk>\u0001/X&\u0005\u007f\u0003t\u001a+Boj,Y->{\u0014z\f<`\u0001[t\fwk>\u0001/X&\u0005";
        objectArray[42] = "9{$aG{z\u007f$c!!nx!vM\u00138=|-\u0011D8z'~J{~43s!";
        objectArray[43] = "g\u0004|`m;cW eW8`\u0012||;\n7_$%Wa3\u0005'a)7f\u0014y\u001bkcfUfe=6w\u000b\u001c'i66\u0014bq<'hnu!6-dW~*5$\r\u0005c\"f<b\u001f~q5]0Ty /<1VbzW";
        objectArray[44] = "<bX*\u0003Im6B\u001a\\->#I`\u0006].>Jff\u0014\"0Yt^Vj`V\u001a";
        objectArray[45] = "ydw>_ije-2$l{`}hH^/#&?\u0014\t*\"v4^w|wgj$";
        objectArray[46] = "\u001c\u001apC9)\u001fY \u001cU(x#{A,c\u001eA>O2-";
        objectArray[47] = "r{9B3I'=!D\\\u0011qy=D0##;d\u001a\\H\"nfY\"\u001ew\u007f8#3Oy?;\u00129L\u007fz]";
        objectArray[48] = "Kz\u00032:$\u0004?R;Z:\u00169@\u0003j+K=W~f\"\u0005 <:*,\u0010,\u0004xb|\u001fB";
        Object[] objectArray2 = objectArray;
        objectArray[49] = "%\u0015-y\u000fGs\u0016i-s\u001a&P1'\u001f(r\u0013l\u007fL\u007f%R5!\u001cBp\u0014-'s";
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _8z.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _8z.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _8z.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = _8z.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _8z.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _8z.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _8z.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _8z.a(clazz3, string2, clazz2)) != null) {
                    _8z.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = _8z.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        _8z.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _8z.b(852672538596799L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _8z.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = _8z.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2, long l3) {
        int n = _8z.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _8z.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = _8z.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _8z.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _8z.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _8z.b(852672538596799L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = _8z.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _8z.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _8z.b(852672538596799L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == '\u00f9' || c == 'g' || c == '\u00f8') {
                field = _8z.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _8z.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _8z.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/8z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_8z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_8z.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

