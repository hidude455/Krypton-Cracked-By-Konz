/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_3965
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6C;
import dev.krypton._6H;
import dev.krypton._6j_0;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_3965;

public class _6j
extends _6x_0 {
    private final _9j_0 cfr_renamed_6;
    private final _9r cfr_renamed_7;
    private final _92 cfr_renamed_9;
    private final _92 cfr_renamed_1;
    private final _9r cfr_renamed_3;
    private final _9r cfr_renamed_4;
    private final _9r cfr_renamed_0;
    private int cfr_renamed_2;
    private int cfr_renamed_103;
    private boolean cfr_renamed_112;
    private boolean cfr_renamed_8;
    private boolean cfr_renamed_87;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public void cfr_renamed_237(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = b ^ l2) ^ 0x4B0793C1A010L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _6j.c("K", (Object)this, (int)_6j.c("M", (Object)_6j.c("j", (Object)this, 3295141234220177496L, (long)l2), (Object)objectArray2, 3294161536450168817L, (long)l2), 3296187371390080253L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        _6j.c("K", (Object)this, (int)_6j.c("M", (Object)_6j.c("j", (Object)this, 3288678266701103794L, (long)l2), (Object)objectArray3, 3294161536450168817L, (long)l2), 3294595821459728338L, (long)l2);
        _6j.c("K", (Object)this, (boolean)_6j.a("o", 7458, (long)(0x57B679E061A9AE59L ^ l2)), 3295855242947167407L, (long)l2);
        _6j.c("K", (Object)this, (boolean)_6j.a("o", 23622, (long)(0x4387F7FE6F026F32L ^ l2)), 3294827149029127343L, (long)l2);
        _6j.c("K", (Object)this, (boolean)_6j.a("o", 23622, (long)(0x4387F7FE6F026F32L ^ l2)), 3294438083143845909L, (long)l2);
    }

    public _6j(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x161BDA24DF44L;
        long l5 = l3 ^ 0x67BE8EDA6D7L;
        long l6 = l3 ^ 0x40234D67572DL;
        long l7 = l3 ^ 0x5FE3DE43B85FL;
        long l8 = l3 ^ 0x70D30B522870L;
        int n = (int)(l8 >>> 32);
        int n2 = (int)(l8 << 32 >>> 56);
        int n3 = (int)(l8 << 40 >>> 40);
        super((int)_6j.a("o", 23328, (long)(0x38FF0DB153383BF3L ^ l2)), -1, (_4r)((Object)_6j.c("l", -139235560950136889L, (long)l2)), l6);
        this.cfr_renamed_6 = new _9j_0((int)_6j.a("o", 18983, (long)(0x1DC396E7A1BCAAF7L ^ l2)), n, (byte)n2, 1, n3, false);
        this.cfr_renamed_7 = new _9r((int)_6j.a("o", 11290, (long)(0x4F57ABF7BB5FCCC4L ^ l2)), false, l4);
        this.cfr_renamed_9 = new _92((int)_6j.a("o", 27183, (long)(0x2EB6B6C0E0AA8AF9L ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_1 = new _92((int)_6j.a("o", 11584, (long)(0x35961432A9A44D9AL ^ l2)), 0.0, l5, 20.0, 0.0, 1.0);
        this.cfr_renamed_3 = new _9r((int)_6j.a("o", 9317, (long)(0x402DBAF4ABBE44BAL ^ l2)), false, l4);
        this.cfr_renamed_4 = new _9r((int)_6j.a("o", 2776, (long)(0x5697DFB0DD946A09L ^ l2)), false, l4);
        this.cfr_renamed_0 = new _9r((int)_6j.a("o", 13657, (long)(0x7F4022FC7C6FD581L ^ l2)), true, l4);
        _6j.c("K", (Object)this, (int)_6j.a("o", 23622, (long)(0x4387F62CEC11BC9BL ^ l2)), -137525669737904300L, (long)l2);
        _6j.c("K", (Object)this, (int)_6j.a("o", 23622, (long)(0x4387F62CEC11BC9BL ^ l2)), -139118306295270277L, (long)l2);
        _95[] nullArray = new _95[_6j.a("o", 27649, (long)(0x55BA5C2029058CD8L ^ l2))];
        nullArray[0] = _6j.c("j", (Object)this, -141440511056511180L, (long)l2);
        nullArray[1] = _6j.c("j", (Object)this, -135559073406978949L, (long)l2);
        nullArray[2] = _6j.c("j", (Object)this, -141095211478052581L, (long)l2);
        nullArray[3] = _6j.c("j", (Object)this, -138572906484708367L, (long)l2);
        nullArray[4] = _6j.c("j", (Object)this, -141505227138744980L, (long)l2);
        nullArray[5] = _6j.c("j", (Object)this, -140224461935790903L, (long)l2);
        nullArray[_6j.a("o", 11960, (long)(0x5BF1F2F61B95CE63L ^ l2))] = _6j.c("j", (Object)this, -141051658791774380L, (long)l2);
        Object[] objectArray = new Object[2];
        objectArray[1] = nullArray;
        objectArray[0] = l7;
        _6j.c("M", (Object)this, (Object)objectArray, -140936238870467037L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _6j.b = l.a(6736929766701726952L, -5890273332184308752L, MethodHandles.lookup().lookupClass()).a(24647137973625L);
                _6j.j = new Object[98];
                _6j.k = new String[98];
                _6j.b();
                _6j.f = new HashMap<K, V>(13);
                var0 = _6j.b ^ 18719165821464L;
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "~\u00a7|\u00dd\u009a\u0083\u00a0\u00d4\u00a4c\u00fd-\u0093\u00be\u00c2|\u0001\u0096\u0094\u0087\u00a0\u0095\u00d1\u00a7\u001e\\}C\u00c2h@\u00a5n>t\u00d4e\u0096\u00c1A;\u00dbH_\u00b4-\u00ea\u0093\n\u00d6\u00b6+\u00e7\u00176\u008e\u00e5|\u00cd\u00f3O\u00a8VFn\u0087\u00f6\u0092_\u00fa\u007f\u00abi\u00b9\u00db\u00da\u00d4\u00b7\u00f5~u+G\u00f3p\u0096\u00e2\u00bcdo\u0012\u0094\u00fc+sb";
                var7_6 = "~\u00a7|\u00dd\u009a\u0083\u00a0\u00d4\u00a4c\u00fd-\u0093\u00be\u00c2|\u0001\u0096\u0094\u0087\u00a0\u0095\u00d1\u00a7\u001e\\}C\u00c2h@\u00a5n>t\u00d4e\u0096\u00c1A;\u00dbH_\u00b4-\u00ea\u0093\n\u00d6\u00b6+\u00e7\u00176\u008e\u00e5|\u00cd\u00f3O\u00a8VFn\u0087\u00f6\u0092_\u00fa\u007f\u00abi\u00b9\u00db\u00da\u00d4\u00b7\u00f5~u+G\u00f3p\u0096\u00e2\u00bcdo\u0012\u0094\u00fc+sb".length();
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
                    var6_5 = "[\u0086AM\u0091%\u00e9y2\u00ff\u00d6\u00a8\u00c8\u00c7t\u0004";
                    var7_6 = "[\u0086AM\u0091%\u00e9y2\u00ff\u00d6\u00a8\u00c8\u00c7t\u0004".length();
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
        _6j.d = var8_3;
        _6j.e = new Integer[14];
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
            case 0 -> 39;
            case 1 -> 10;
            case 2 -> 14;
            case 3 -> 58;
            case 4 -> 38;
            case 5 -> 18;
            case 6 -> 37;
            case 7 -> 29;
            case 8 -> 51;
            case 9 -> 41;
            case 10 -> 43;
            case 11 -> 12;
            case 12 -> 49;
            case 13 -> 30;
            case 14 -> 34;
            case 15 -> 13;
            case 16 -> 31;
            case 17 -> 45;
            case 18 -> 0;
            case 19 -> 11;
            case 20 -> 5;
            case 21 -> 8;
            case 22 -> 25;
            case 23 -> 36;
            case 24 -> 63;
            case 25 -> 60;
            case 26 -> 26;
            case 27 -> 22;
            case 28 -> 15;
            case 29 -> 24;
            case 30 -> 4;
            case 31 -> 61;
            case 32 -> 44;
            case 33 -> 27;
            case 34 -> 9;
            case 35 -> 35;
            case 36 -> 33;
            case 37 -> 28;
            case 38 -> 46;
            case 39 -> 16;
            case 40 -> 20;
            case 41 -> 62;
            case 42 -> 48;
            case 43 -> 17;
            case 44 -> 50;
            case 45 -> 52;
            case 46 -> 23;
            case 47 -> 3;
            case 48 -> 7;
            case 49 -> 53;
            case 50 -> 59;
            case 51 -> 32;
            case 52 -> 6;
            case 53 -> 54;
            case 54 -> 55;
            case 55 -> 56;
            case 56 -> 2;
            case 57 -> 47;
            case 58 -> 40;
            case 59 -> 42;
            case 60 -> 1;
            case 61 -> 57;
            case 62 -> 19;
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
        _6j.k[n3] = new String(cArray);
        return n3;
    }

    @_3i_0
    public void cfr_renamed_1(_6j_0 j_0) {
        block19: {
            CallSite callSite;
            block17: {
                _6j j;
                _4w[] wArray;
                long l2;
                long l3;
                long l4;
                block15: {
                    block16: {
                        long l5 = l4 = b ^ 0x7CCFAFAA690DL;
                        l3 = l5 ^ 0x594CC4CE5F60L;
                        l2 = l5 ^ 0x1EB806743CE1L;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            try {
                                j = this;
                                if (wArray != null) break block15;
                                if (_6j.c("j", (Object)j, 8903187657084883612L, (long)l4) != false) break block16;
                            }
                            catch (MatchException matchException) {
                                throw _6j.a(matchException);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _6j.a(matchException);
                        }
                    }
                    j = this;
                }
                CallSite callSite2 = _6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)j, 8902048295789556343L, (long)l4), 8904395520222122926L, (long)l4), 8903668146388029140L, (long)l4);
                try {
                    block18: {
                        try {
                            try {
                                try {
                                    callSite = _6j.c("M", (Object)callSite2, (Object)_6j.c("l", 8901459569193814096L, (long)l4), 8902947212447801114L, (long)l4);
                                    if (wArray != null) break block17;
                                    if (callSite != false) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw _6j.a(matchException);
                                }
                                callSite = _6j.c("M", (Object)callSite2, (Object)_6j.c("l", 8903483358371133410L, (long)l4), 8902947212447801114L, (long)l4);
                                if (wArray != null) break block17;
                            }
                            catch (MatchException matchException) {
                                throw _6j.a(matchException);
                            }
                            if (callSite == false) break block19;
                        }
                        catch (MatchException matchException) {
                            throw _6j.a(matchException);
                        }
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = (int)_6j.c("M", (Object)_6j.c("j", (Object)this, 8904673820261350062L, (long)l4), (Object)objectArray, 8903000229134418624L, (long)l4);
                    callSite = _6j.c("\u00cb", (Object)objectArray2, 8902447759510398869L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _6j.a(matchException);
                }
            }
            try {
                if (callSite == false) {
                    j_0.void_8();
                }
            }
            catch (MatchException matchException) {
                throw _6j.a(matchException);
            }
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'j' || c == 'K' || c == 'l' || c == '\u00e7') {
                field = _6j.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'j' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6j.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = j;
        j[0] = ">&\u0007\u0004ou#3\u0005Ej)l)";
        objectArray[1] = Integer.TYPE;
        _6j.k[1] = "java/lang/Integer";
        objectArray[2] = "K\"\u0010=n1V7\u0012|km\u00165";
        objectArray[3] = "\u0017D7\u000e)\u0011\nQ5O,MJK";
        objectArray[4] = ";0]/\u0002C&%_n\u0007\u001ffg";
        objectArray[5] = "3`OZl\u0016.uM\u001biJcw";
        objectArray[6] = "\ru1m@U\u0010`3,E\t_h";
        objectArray[7] = "n2\u0002\"io\u001b\u0012\t-x z\u001c\u0002&|z\u000e";
        objectArray[8] = Void.TYPE;
        _6j.k[8] = "java/lang/Void";
        objectArray[9] = "D5\nwA\u0002D5\u001d+M\r^~\u001d5M\u0018Y\u000fMm\u0014R";
        objectArray[10] = "@c8e=\u0005@c/91\nZ(/'1\u001f]Yzsf^";
        objectArray[11] = "a\u0016w\u0004)-a\u0016`X%\"{]`F%7|,4\u001er";
        objectArray[12] = "JH*\u0019MWJH=EAXP\u0003=[AMWro\u0000\u0019\u0007";
        objectArray[13] = "6\u000bKf[\\C+@iJ\u0013\"%KbNIV";
        objectArray[14] = Long.TYPE;
        _6j.k[14] = "java/lang/Long";
        objectArray[15] = Boolean.TYPE;
        _6j.k[15] = "java/lang/Boolean";
        objectArray[16] = "?0bJ@'\"%`\u000bE{o\u0013";
        objectArray[17] = "-7G(e=X\u0017L'tr9\u0019G,p(M";
        objectArray[18] = ":S\u0007j\u0005\u000e:S\u00106\t\u0001 \u0018\u0010(\t\u0014'iEwP";
        objectArray[19] = "su\u0015#q_su\u0002\u007f}Pi>\u0002a}EnOS>/\u000e";
        objectArray[20] = "s,\u0010z&Ss,\u0007&*\\ig\u00078*In\u0016Vbs\n";
        objectArray[21] = "_dfGpY*DmHa\u0016KJfCeL?";
        objectArray[22] = "#\u000e!ETJV.*JE\u00057 !AA_C";
        objectArray[23] = "E7i|J\u007fE7~ Fp_|~>FeX\r.c\u0017";
        objectArray[24] = "^\u0006xOx\u000b^\u0006o\u0013t\u0004DMo\rt\u0011C<>R,";
        objectArray[25] = "dQX[\u000fGdQO\u0007\u0003H~\u001aO\u0019\u0003]yk\u001eF[\niXM\u0006\u0011q8\u0000\u001c";
        objectArray[26] = "GoJnW7Go]2[8]$],[-ZU\ry\fk";
        objectArray[27] = "MxEQ\r;MxR\r\u00014W3R\u0013\u0001!PB\u0003MTd";
        objectArray[28] = ">(a3\u0016 >(vo\u001a/$cvq\u001a:#\u0012'/Oq";
        objectArray[29] = "=tfK\u000e/ ad\n\u000bsk";
        objectArray[30] = "\u0004T(\u001e)Hqt#\u00118\u0007\u0010z(\u001a<]d";
        objectArray[31] = "$\u0016?#w$9\u0003=brxpA";
        objectArray[32] = "M\rct\u0004x8-h{\u00157Y#cp\u0011m-";
        objectArray[33] = "J\"\u0007d\u0019yJ\"\u00108\u0015vPi\u0010&\u0015cW\u0018B}M\"";
        objectArray[34] = "\u0019\u0001qn|Jl!zam\u0005\r/qji_y";
        objectArray[35] = "o\u0018dn\u000eh\u001a8oa\u001f'{6dj\u001b}\u000f";
        objectArray[36] = "+2P\n8\u00016'RK=]y\u001f";
        objectArray[37] = "\u0015|\u0018+Lj\bi\u001ajI6Hv";
        objectArray[38] = "dz\u001d\u0003f5dz\n_j:~1\nAj/y@X\u0015;n";
        objectArray[39] = "l\u0018\u0012\u0007\u0015Ml\u0018\u0005[\u0019BvS\u0005E\u0019Wq\"R\u001aO";
        objectArray[40] = "GYs^b>ZLq\u001fgb\u001bF";
        objectArray[41] = "w]ec\u000f}\u0002}nl\u001e2cseg\u001ah\u0017";
        objectArray[42] = "oaj,]\trthmXU2O";
        objectArray[43] = "\f[\u0006[kwy{\rTz8\u0018u\u0006_~bl";
        objectArray[44] = "\u001dEK\b\ryhe@\u0007\u001c6\tkK\f\u0018l}";
        objectArray[45] = "c9?\u007fDGh6.0%Ic=*j";
        objectArray[46] = "K\u0016Lzc\u000fA[\r\u001757CPCrdNE\u001b\u0014i";
        objectArray[47] = "\fB3\u007f,R\f\\r<HVS_kh\u001f\u0004\b\f6=H\u0007[Jv8pW\u000fBd";
        objectArray[48] = "S\u00196FYq\u0015\b%L?x\u0001\u001e(ZSJRZt\u0002?-\u0002XpMCy\u0014\u001c7=";
        objectArray[49] = "\u001eQ`rTW\u0014\u001c!\u001f\u0006,/\u00104 P\t^R>'[o\u0012\u0010# \u0001\b@\u0006n{:";
        objectArray[50] = "1Dsu'q;\t2\u0018yI9\u0002|} 0?I+f";
        objectArray[51] = "u:\n1CT\u007fwK\\\u0012l\u007f:T'M\u001c|vT?";
        objectArray[52] = "\u0018\u0016\u0014J#.\u0015\u0012\u0007L\u001e*$\u0005\u0018\u000btuUG\u0012\f\u007f\u0013\u0019\u0005\u000f\u000b%tK\u0013BP\u001e";
        objectArray[53] = "\u001d(\u0003)MG\u001bcT2$\u0004$;\u0003=U\u000fK9O}D>M G#B\u0002\\\"^&$";
        objectArray[54] = "7\u0016.\u007f\u0019`g\u0014;tx=]\u00111*\u0012`,S;-\u0019\u00064\u001e.z\u001e:%\u001c7\u007fx";
        objectArray[55] = "\u000fY!tX\u0006\u001b\u0002!ndX\u000e\u0018/t\bjS_u+dQ\u001b\\r(YS\u001bU=\u0013\tV\u0001]*a\nAZ\u0005O";
        objectArray[56] = ";P\u001dq\f%kR\bzmyQW\u0002$\u0007% \u0015\b#\fC8X\u001dt\u000b\u007f)Z\u0004qm";
        objectArray[57] = "\u0015G}_w.EEhT\u0016x\u007f@b\n|.\u000e\u0002h\rwH\u0016O}Zpt\u0007Md_\u0016";
        objectArray[58] = "k\"Izk\u001bf&Z|V\u0017W%R~9@k4Pg<&";
        objectArray[59] = "LvBI\u007f\u001a\u0019kFD\u001d\u0011BvLIJF\u001c!\u0014%\"\u0004]`NId\u0015Nj";
        objectArray[60] = "a~\u0015\u0006\u001elk3TkJTi8\u001a\u000e\u0019-osM\u0015";
        objectArray[61] = "[\u0013RupD\u000e\u000eVx\u0012OU\u0013\\uE\u0018\nN\u0007\u0019~\u001cZ\u0019\u0004\"jGZ\u0003";
        objectArray[62] = "eC(\u0017wAoPfE\u001dVgAyAqd3\u0002&\u0016&3jZh@bO:O$\u0017\u001d";
        objectArray[63] = "\u001bNZW\u0004\"\u0011\u0003\u001b:Q\u001a\u0010\u001fZJ\u0013\u007f\u001bK\u0000@";
        objectArray[64] = "quIv\u0004c*~Wg|f}`X{\u0010T)#\u0007,G\u0003p{Iz\u0003\u007f n\u0005-|";
        objectArray[65] = "H8Y-}ZHuE%\u0001PKj^\"V\u000f\u001b7\u0005NcBZ}\u0005qcT\u00159";
        objectArray[66] = "b*T#F$oxM>6%\u0001>Hl\\xp|BkW\u001ed\u007f\u0016cSlc*Un6";
        objectArray[67] = "[NuT_\u0000\\\u001b6Y:O>\u000f+[P\u0014OM!\\[r\u0002\u001c'\u001a\u0007O\u000f\u00184\u001c:";
        objectArray[68] = "u5~D/\u0019\u007fx?)\u007f!}4~[<\u0011*42Q";
        objectArray[69] = "v\u001el_S5\"\b(\u0018#,+\f6\u0000O\u001e}IkX\u0018Iy\u0019.\u001e\u001fq)M&\f# 4\n9\u0001\u001f16\u0013<g";
        objectArray[70] = "D\u0012u/P\u0011\u0010\u00041h \b\u0019\u0000/pL:OEr(\u001cm\u0012D\"~P\u0004\u001b\u0006>e \u0004\u0006\u0006 q\u001c\u0015\u0004\u001f%\u0017";
        objectArray[71] = "Mu\u001e)\u001a8F!D#ccweJf\t;\u0006'@a\u0002]N%\u001e+\u001em\u0019%R!c";
        objectArray[72] = "I5OD\b;\u0012>QUp>E ^I\u001c\f\u0011c\u0001\u0011O[D$\u0006\u0013KfF$\u000f\\p";
        objectArray[73] = "&[p\u0007\\X,\u00161j\b:\u0017\u000e3\u0010]\u0006+\u001f1\tX";
        objectArray[74] = "{\u0000GLp\u0005{M[D\f\u000fxR@C[X!\u0002\u0018\u0017\f\u0003eO^\u00103\u0003s\u0000\u001a";
        objectArray[75] = "\u000bfw\u001fXj[s;H'x\nlb\u0015p/P:<yGq\u001agy\u0005\u0017dV0";
        objectArray[76] = "\u007f\u0002I\u0014\u0013A/\u0000\\\u001fr\u001a\u0015\u0005VA\u0018AdG\\F\u0013'(\u0005AAI@z\u0013\f\u001ar";
        objectArray[77] = "z:\u0007p\u0000 {+V-|t\u0002-JvM&{>In\u0004I?(E-G.m>\bv|";
        objectArray[78] = "Q\u007fZ\u001eb\u000fT$\u001fL\u0007\u0013It\u0005\u0018PM\u0012)XtaEEp\u0011\u001dh\u0007Yk";
        objectArray[79] = "OSsc\nPO\u001eokvZL\u0001tl!\u000e\u0016U-:vVQ\u001cj?IVGS.";
        objectArray[80] = "\u007f~e\\/\u0011|i>\u0004J\u0006\u007fig\u0002&4(+=]vcpiw\u001fu\\p\u007f8[J";
        objectArray[81] = "U\u0005b<#IP^'nFUM\u000e=:\u0011\u000b\u0017[`V \u0003A\n)?)A]\u0011";
        objectArray[82] = "]K\u001b~0AX\u0010^,U]E@Dx\u0002\u0003\u001e\u001d\u0010\u00143\u000bIDP}:IU_";
        objectArray[83] = "_\u0007%,}X\n\u001a!!\u001fSQ\u0007+,H\u0004\u000fWr@e\u0006\t\u0003w8fZ\\W";
        objectArray[84] = ":u\u00065\u0001\u000e1)\u000b2aWA6\no\u000b\f0t\u0000h\u0000j(9\u0015?\u0007V9;\f:a";
        objectArray[85] = "%M\rq!^c\\\u001e{GWwJ\u0013m+e \nN3w2|\u000e\u001ec7[uL\u0002xG[hL\u001cl{JjU\u0019\n";
        objectArray[86] = "q\u0011*]9x|C3@I{Qx0D02bB=\u0016)/";
        objectArray[87] = "\u0016P\th0R\u001c\u001dH\u0005oj\u001cPW~>\u001a\u001f\u001cWf";
        objectArray[88] = " P|~.\u0011uMxsL\u001a.Pr~\u001bMp\u0003+\u0012#\n~\f|`)\u00190^";
        objectArray[89] = "$\u00029Sa\u0019)\u0006*U\\\u001d\u0018\u0003=G0F}V C=";
        objectArray[90] = "&\t\u001f\t89v\u001cS^G+'\u0003\n\u0003\u0010|}UUo'\"7\b\u0011\u0013w7{_";
        objectArray[91] = "`?vG\u001cxjr7*O@8q=E\u0014|)s$@";
        objectArray[92] = "zBwP6v?B:\u0016V_\u0006u\u0002\"\n\u0014zBwP6v?B:\u0016";
        objectArray[93] = "._N\u000fhM$\u0012\u000fb<K\u001f\n\r\u0018i\u0013#\u001b\u000f\u0001l";
        objectArray[94] = "\u001bV6E\u0017j\u0011\u001bw(C?*S:\u0019\u000b/\u001a\u0004:U\u0001";
        objectArray[95] = "kkd\u0007:ky9nZ\nk\u0017+g_`=fimXk[~$x\u000flgo&a\n\n";
        objectArray[96] = "\u0002u\u0013\u0018\u000fb\b8Ru]Z\n3\u001c\u0010\b#\fxK\u000b";
        Object[] objectArray2 = objectArray;
        objectArray[97] = "\u0012[k\u00138\"\u0011\u0017k\u000bXo)\u001aaW24XXkP9R\u0010Z5\u001a%bGZy\u0010X";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6j.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _6j.e(l2, l3);
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
                clazz3 = _6j.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6j.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6j.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6j.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6j.f(3204257953567978L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6j.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6j.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6j.f(3204257953567978L, 0L);
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
            int n = _6j.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6j.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6j.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6j.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6j.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6j.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _6j.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1EDD;
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
                throw new RuntimeException("dev/krypton/6j", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6j.e[n2] = n3;
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _6j.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6j.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6j.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6j.c(clazz3, string2, clazz2)) != null) {
                    _6j.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6j.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6j.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6j.f(3204257953567978L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_3(_9o var1_1) {
        block175: {
            block135: {
                block168: {
                    block174: {
                        block173: {
                            block169: {
                                block170: {
                                    block171: {
                                        block172: {
                                            block167: {
                                                block154: {
                                                    block155: {
                                                        block165: {
                                                            block166: {
                                                                block161: {
                                                                    block162: {
                                                                        block163: {
                                                                            block164: {
                                                                                block159: {
                                                                                    block160: {
                                                                                        block158: {
                                                                                            block156: {
                                                                                                block157: {
                                                                                                    block148: {
                                                                                                        block150: {
                                                                                                            block149: {
                                                                                                                block153: {
                                                                                                                    block152: {
                                                                                                                        block151: {
                                                                                                                            block147: {
                                                                                                                                block142: {
                                                                                                                                    block145: {
                                                                                                                                        block143: {
                                                                                                                                            block141: {
                                                                                                                                                block138: {
                                                                                                                                                    block139: {
                                                                                                                                                        block137: {
                                                                                                                                                            block140: {
                                                                                                                                                                block136: {
                                                                                                                                                                    block133: {
                                                                                                                                                                        block134: {
                                                                                                                                                                            v0 = var2_2 = _6j.b ^ 16200462034844L;
                                                                                                                                                                            var4_3 = v0 ^ 47522163511793L;
                                                                                                                                                                            var6_4 = v0 ^ 119625024451184L;
                                                                                                                                                                            var8_5 = v0 ^ 89255922586802L;
                                                                                                                                                                            var10_6 = v0 ^ 72439187884595L;
                                                                                                                                                                            var12_7 = v0 ^ 136275174631577L;
                                                                                                                                                                            var14_8 = v0 ^ 78907809532588L;
                                                                                                                                                                            var16_9 = v0 ^ 110705250854947L;
                                                                                                                                                                            var18_10 = v0 ^ 133670479689906L;
                                                                                                                                                                            var20_11 = v0 ^ 123218477261914L;
                                                                                                                                                                            var22_12 = v0 ^ 112460790176270L;
                                                                                                                                                                            var24_13 = v0 ^ 41852731799682L;
                                                                                                                                                                            var26_14 = v0 ^ 101555783982263L;
                                                                                                                                                                            var28_15 = _3s.cfr_renamed_5();
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    v1 = this;
                                                                                                                                                                                    if (var28_15 != null) break block133;
                                                                                                                                                                                    if (_6j.c("j", (Object)_6j.c("j", (Object)v1, (long)-784998839969186586L, (long)var2_2), (long)-785391439483989145L, (long)var2_2) == null) break block134;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v2) {
                                                                                                                                                                                    throw _6j.a(v2);
                                                                                                                                                                                }
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v3) {
                                                                                                                                                                                throw _6j.a(v3);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v1 = this;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (var28_15 != null) break block135;
                                                                                                                                                                        v4 = new Object[1];
                                                                                                                                                                        v4[0] = var4_3;
                                                                                                                                                                        v5 = new Object[2];
                                                                                                                                                                        v5[1] = var6_4;
                                                                                                                                                                        v5[0] = (int)_6j.c("M", (Object)_6j.c("j", (Object)v1, (long)-791872821620411329L, (long)var2_2), (Object)v4, (long)-784543338234262447L, (long)var2_2);
                                                                                                                                                                        if (_6j.c("\u00cb", (Object)v5, (long)-785126731916482300L, (long)var2_2) != false) {
                                                                                                                                                                        }
                                                                                                                                                                        ** GOTO lbl520
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v6) {
                                                                                                                                                                        throw _6j.a(v6);
                                                                                                                                                                    }
                                                                                                                                                                    var30_16 = _6j.c("j", (Object)_6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2), (long)-784898164812754421L, (long)var2_2);
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            v7 = var30_16;
                                                                                                                                                                            if (var28_15 != null) break block136;
                                                                                                                                                                            if (!(v7 instanceof class_3965)) break block137;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v8) {
                                                                                                                                                                            throw _6j.a(v8);
                                                                                                                                                                        }
                                                                                                                                                                        v7 = var30_16;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v9) {
                                                                                                                                                                        throw _6j.a(v9);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var29_17 /* !! */  = (class_3965)v7;
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            v10 = _6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2);
                                                                                                                                                                                            if (var28_15 != null) break block138;
                                                                                                                                                                                            if (_6j.c("M", (Object)_6j.c("j", (Object)v10, (long)-784898164812754421L, (long)var2_2), (long)-791828915889316620L, (long)var2_2) != _6j.c("l", (long)-783750664775832302L, (long)var2_2)) break block137;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (MatchException v11) {
                                                                                                                                                                                            throw _6j.a(v11);
                                                                                                                                                                                        }
                                                                                                                                                                                        v12 = this;
                                                                                                                                                                                        if (var28_15 != null) break block139;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (MatchException v13) {
                                                                                                                                                                                        throw _6j.a(v13);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (_6j.c("j", (Object)v12, (long)-783898513207632883L, (long)var2_2) != false) break block137;
                                                                                                                                                                                }
                                                                                                                                                                                catch (MatchException v14) {
                                                                                                                                                                                    throw _6j.a(v14);
                                                                                                                                                                                }
                                                                                                                                                                                v15 = new Object[2];
                                                                                                                                                                                v15[1] = var14_8;
                                                                                                                                                                                v15[0] = _6j.c("M", (Object)var29_17 /* !! */ , (long)-783811520792910605L, (long)var2_2);
                                                                                                                                                                                v16 = _6j.c("\u00cb", (Object)v15, (long)-791765744508065449L, (long)var2_2);
                                                                                                                                                                                if (var28_15 != null) break block140;
                                                                                                                                                                            }
                                                                                                                                                                            catch (MatchException v17) {
                                                                                                                                                                                throw _6j.a(v17);
                                                                                                                                                                            }
                                                                                                                                                                            if (v16 != false) break block137;
                                                                                                                                                                        }
                                                                                                                                                                        catch (MatchException v18) {
                                                                                                                                                                            throw _6j.a(v18);
                                                                                                                                                                        }
                                                                                                                                                                        v12 = this;
                                                                                                                                                                        if (var28_15 != null) break block139;
                                                                                                                                                                    }
                                                                                                                                                                    catch (MatchException v19) {
                                                                                                                                                                        throw _6j.a(v19);
                                                                                                                                                                    }
                                                                                                                                                                    v16 = _6j.c("M", (Object)_6j.c("j", (Object)v12, (long)-786626927445541008L, (long)var2_2), (long)var24_13, (long)-792630761509125634L, (long)var2_2);
                                                                                                                                                                }
                                                                                                                                                                catch (MatchException v20) {
                                                                                                                                                                    throw _6j.a(v20);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            if (v16 != false) {
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v12 = this;
                                                                                                                                                    }
                                                                                                                                                    v10 = _6j.c("j", (Object)v12, (long)-784998839969186586L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                                var29_17 /* !! */  = _6j.c("M", (Object)_6j.c("j", (Object)v10, (long)-791587933033734849L, (long)var2_2), (long)-792249301307113403L, (long)var2_2);
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v21 = _6j.c("M", (Object)var29_17 /* !! */ , (Object)_6j.c("l", (long)-790757441569337749L, (long)var2_2), (long)-784683353997553555L, (long)var2_2);
                                                                                                                                                        if (var28_15 != null) break block141;
                                                                                                                                                        if (v21 != false) break block142;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v22) {
                                                                                                                                                        throw _6j.a(v22);
                                                                                                                                                    }
                                                                                                                                                    v21 = _6j.c("M", (Object)_6j.c("j", (Object)this, (long)-791939770913671577L, (long)var2_2), (long)var24_13, (long)-792630761509125634L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                                catch (MatchException v23) {
                                                                                                                                                    throw _6j.a(v23);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                block144: {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (var28_15 != null) break block143;
                                                                                                                                                                if (v21 == false) break block144;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v24) {
                                                                                                                                                                throw _6j.a(v24);
                                                                                                                                                            }
                                                                                                                                                            v21 = _6j.c("M", (Object)var29_17 /* !! */ , (Object)_6j.c("l", (long)-785342561771228956L, (long)var2_2), (long)-784491488722300533L, (long)var2_2);
                                                                                                                                                            if (var28_15 != null) break block143;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v25) {
                                                                                                                                                            throw _6j.a(v25);
                                                                                                                                                        }
                                                                                                                                                        if (v21 != false) break block142;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v26) {
                                                                                                                                                        throw _6j.a(v26);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v21 = _6j.c("M", (Object)_6j.c("j", (Object)this, (long)-790696333427589182L, (long)var2_2), (long)var24_13, (long)-792630761509125634L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            catch (MatchException v27) {
                                                                                                                                                throw _6j.a(v27);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                block146: {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (var28_15 != null) break block145;
                                                                                                                                                                if (v21 == false) break block146;
                                                                                                                                                            }
                                                                                                                                                            catch (MatchException v28) {
                                                                                                                                                                throw _6j.a(v28);
                                                                                                                                                            }
                                                                                                                                                            v21 = _6j.c("M", (Object)var29_17 /* !! */ , (Object)_6j.c("l", (long)-785556920056543551L, (long)var2_2), (long)-784491488722300533L, (long)var2_2);
                                                                                                                                                            if (var28_15 != null) break block145;
                                                                                                                                                        }
                                                                                                                                                        catch (MatchException v29) {
                                                                                                                                                            throw _6j.a(v29);
                                                                                                                                                        }
                                                                                                                                                        if (v21 != false) break block142;
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v30) {
                                                                                                                                                        throw _6j.a(v30);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v31 = this;
                                                                                                                                                if (var28_15 != null) break block147;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v32) {
                                                                                                                                                throw _6j.a(v32);
                                                                                                                                            }
                                                                                                                                            v21 = _6j.c("j", (Object)v31, (long)-783898513207632883L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        catch (MatchException v33) {
                                                                                                                                            throw _6j.a(v33);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (v21 == false) {
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v31 = this;
                                                                                                                            }
                                                                                                                            var31_18 = _6j.c("j", (Object)_6j.c("j", (Object)v31, (long)-784998839969186586L, (long)var2_2), (long)-784898164812754421L, (long)var2_2);
                                                                                                                            try {
                                                                                                                                v34 /* !! */  = var31_18 instanceof class_3965;
                                                                                                                                if (var28_15 != null) break block148;
                                                                                                                                if (!v34 /* !! */ ) break block149;
                                                                                                                            }
                                                                                                                            catch (MatchException v35) {
                                                                                                                                throw _6j.a(v35);
                                                                                                                            }
                                                                                                                            var30_16 = (class_3965)var31_18;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v34 /* !! */  = _6j.c("j", (Object)this, (long)-783898513207632883L, (long)var2_2);
                                                                                                                                                if (var28_15 != null) break block148;
                                                                                                                                                if (v34 /* !! */ ) break block149;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v36) {
                                                                                                                                                throw _6j.a(v36);
                                                                                                                                            }
                                                                                                                                            v34 /* !! */  = _6j.c("M", (Object)_6j.c("j", (Object)this, (long)-792122240117531553L, (long)var2_2), (long)var24_13, (long)-792630761509125634L, (long)var2_2);
                                                                                                                                            if (var28_15 != null) break block148;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v37) {
                                                                                                                                            throw _6j.a(v37);
                                                                                                                                        }
                                                                                                                                        if (!v34 /* !! */ ) break block149;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v38) {
                                                                                                                                        throw _6j.a(v38);
                                                                                                                                    }
                                                                                                                                    v39 = this;
                                                                                                                                    if (var28_15 != null) break block150;
                                                                                                                                }
                                                                                                                                catch (MatchException v40) {
                                                                                                                                    throw _6j.a(v40);
                                                                                                                                }
                                                                                                                                if (_6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)v39, (long)-784998839969186586L, (long)var2_2), (long)-784898164812754421L, (long)var2_2), (long)-791828915889316620L, (long)var2_2) != _6j.c("l", (long)-783750664775832302L, (long)var2_2)) break block149;
                                                                                                                            }
                                                                                                                            catch (MatchException v41) {
                                                                                                                                throw _6j.a(v41);
                                                                                                                            }
                                                                                                                            var31_18 = _6j.c("M", (Object)_6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2), (long)-792041929282904472L, (long)var2_2), (Object)_6j.c("M", (Object)var30_16, (long)-783811520792910605L, (long)var2_2), (long)-792482975674079261L, (long)var2_2), (long)-785517429297969916L, (long)var2_2);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v42 = this;
                                                                                                                                    v43 = var31_18;
                                                                                                                                    v44 = _6j.c("l", (long)-783691721608497011L, (long)var2_2);
                                                                                                                                    if (var28_15 != null) break block151;
                                                                                                                                    if (v43 != v44) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl242
                                                                                                                                }
                                                                                                                                catch (MatchException v45) {
                                                                                                                                    throw _6j.a(v45);
                                                                                                                                }
                                                                                                                                v43 = var31_18;
                                                                                                                                v44 = _6j.c("l", (long)-784421326520503754L, (long)var2_2);
                                                                                                                            }
                                                                                                                            catch (MatchException v46) {
                                                                                                                                throw _6j.a(v46);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (v43 != v44) break block152;
lbl242:
                                                                                                                            // 2 sources

                                                                                                                            v47 = true;
                                                                                                                            break block153;
                                                                                                                        }
                                                                                                                        catch (MatchException v48) {
                                                                                                                            throw _6j.a(v48);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v47 = false;
                                                                                                                }
                                                                                                                _6j.c("K", (Object)v42, (boolean)v47, (long)-784856410297635827L, (long)var2_2);
                                                                                                            }
                                                                                                            _6j.c("K", (Object)this, (boolean)_6j.a("o", (int)31323, (long)(1536128140068524423L ^ var2_2)), (long)-783898513207632883L, (long)var2_2);
                                                                                                            v39 = this;
                                                                                                        }
                                                                                                        v34 /* !! */  = _6j.c("j", (Object)v39, (long)-784856410297635827L, (long)var2_2);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var28_15 != null) break block154;
                                                                                                        if (v34 /* !! */ ) break block155;
                                                                                                    }
                                                                                                    catch (MatchException v49) {
                                                                                                        throw _6j.a(v49);
                                                                                                    }
                                                                                                    var31_18 = _6j.c("j", (Object)_6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2), (long)-784898164812754421L, (long)var2_2);
                                                                                                    try {
                                                                                                        v34 /* !! */  = var31_18 instanceof class_3965;
                                                                                                        if (var28_15 != null) break block154;
                                                                                                        if (!v34 /* !! */ ) break block155;
                                                                                                    }
                                                                                                    catch (MatchException v50) {
                                                                                                        throw _6j.a(v50);
                                                                                                    }
                                                                                                    var30_16 = (class_3965)var31_18;
                                                                                                    try {
                                                                                                        try {
                                                                                                            v51 = var30_16;
                                                                                                            if (var28_15 != null) break block156;
                                                                                                            if (_6j.c("M", (Object)v51, (long)-784395857838572000L, (long)var2_2) != _6j.c("l", (long)-784780626364036106L, (long)var2_2)) break block157;
                                                                                                        }
                                                                                                        catch (MatchException v52) {
                                                                                                            throw _6j.a(v52);
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (MatchException v53) {
                                                                                                        throw _6j.a(v53);
                                                                                                    }
                                                                                                }
                                                                                                v51 = var30_16;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v54 = new Object[3];
                                                                                                    v54[2] = _6j.c("l", (long)-783691721608497011L, (long)var2_2);
                                                                                                    v54[1] = _6j.c("M", (Object)v51, (long)-783811520792910605L, (long)var2_2);
                                                                                                    v54[0] = var20_11;
                                                                                                    v34 /* !! */  = _6j.c("\u00cb", (Object)v54, (long)-792411959698413745L, (long)var2_2);
                                                                                                    if (var28_15 != null) break block158;
                                                                                                    if (!v34 /* !! */ ) {
                                                                                                    }
                                                                                                    ** GOTO lbl413
                                                                                                }
                                                                                                catch (MatchException v55) {
                                                                                                    throw _6j.a(v55);
                                                                                                }
                                                                                                v56 = new Object[3];
                                                                                                v56[2] = _6j.c("l", (long)-783991490472183215L, (long)var2_2);
                                                                                                v56[1] = _6j.c("M", (Object)var30_16, (long)-783811520792910605L, (long)var2_2);
                                                                                                v56[0] = var20_11;
                                                                                                v34 /* !! */  = _6j.c("\u00cb", (Object)v56, (long)-792411959698413745L, (long)var2_2);
                                                                                            }
                                                                                            catch (MatchException v57) {
                                                                                                throw _6j.a(v57);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var28_15 != null) break block159;
                                                                                                    if (v34 /* !! */ ) {
                                                                                                    }
                                                                                                    break block160;
                                                                                                }
                                                                                                catch (MatchException v58) {
                                                                                                    throw _6j.a(v58);
                                                                                                }
                                                                                                v59 = new Object[2];
                                                                                                v59[1] = _6j.c("M", (Object)var30_16, (long)-783811520792910605L, (long)var2_2);
                                                                                                v59[0] = var16_9;
                                                                                                v34 /* !! */  = _6j.c("\u00cb", (Object)v59, (long)-791712072229538080L, (long)var2_2);
                                                                                                if (var28_15 != null) break block159;
                                                                                            }
                                                                                            catch (MatchException v60) {
                                                                                                throw _6j.a(v60);
                                                                                            }
                                                                                            if (!v34 /* !! */ ) break block160;
                                                                                        }
                                                                                        catch (MatchException v61) {
                                                                                            throw _6j.a(v61);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    v34 /* !! */  = _6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2), (long)-791587933033734849L, (long)var2_2), (Object)_6j.c("l", (long)-783920431736112781L, (long)var2_2), (long)-785828172419424462L, (long)var2_2);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var28_15 != null) break block161;
                                                                                                if (v34 /* !! */ ) break block162;
                                                                                            }
                                                                                            catch (MatchException v62) {
                                                                                                throw _6j.a(v62);
                                                                                            }
                                                                                            v63 = _6j.c("j", (Object)this, (long)-785047021388873872L, (long)var2_2);
                                                                                            if (var28_15 != null) break block163;
                                                                                        }
                                                                                        catch (MatchException v64) {
                                                                                            throw _6j.a(v64);
                                                                                        }
                                                                                        if (v63 <= 0) break block164;
                                                                                    }
                                                                                    catch (MatchException v65) {
                                                                                        throw _6j.a(v65);
                                                                                    }
                                                                                    v66 = this;
                                                                                    _6j.c("K", (Object)v66, (int)(_6j.c("j", (Object)v66, (long)-785047021388873872L, (long)var2_2) - true), (long)-785047021388873872L, (long)var2_2);
                                                                                    return;
                                                                                }
                                                                                catch (MatchException v67) {
                                                                                    throw _6j.a(v67);
                                                                                }
                                                                            }
                                                                            v68 = new Object[1];
                                                                            v68[0] = var18_10;
                                                                            _6j.c("K", (Object)this, (int)_6j.c("M", (Object)_6j.c("j", (Object)this, (long)-792200461625026032L, (long)var2_2), (Object)v68, (long)-786717183371976877L, (long)var2_2), (long)-785047021388873872L, (long)var2_2);
                                                                            v69 = new Object[2];
                                                                            v69[1] = _6j.c("l", (long)-783920431736112781L, (long)var2_2);
                                                                            v69[0] = var26_14;
                                                                            v63 = _6j.c("\u00cb", (Object)v69, (long)-785795727693547891L, (long)var2_2);
                                                                        }
                                                                        return;
                                                                    }
                                                                    v34 /* !! */  = _6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2), (long)-791587933033734849L, (long)var2_2), (Object)_6j.c("l", (long)-783920431736112781L, (long)var2_2), (long)-785828172419424462L, (long)var2_2);
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var28_15 != null) break block154;
                                                                                if (!v34 /* !! */ ) break block155;
                                                                            }
                                                                            catch (MatchException v70) {
                                                                                throw _6j.a(v70);
                                                                            }
                                                                            v71 = this;
                                                                            if (var28_15 != null) break block165;
                                                                        }
                                                                        catch (MatchException v72) {
                                                                            throw _6j.a(v72);
                                                                        }
                                                                        if (_6j.c("j", (Object)v71, (long)-784652839621145505L, (long)var2_2) <= 0) break block166;
                                                                    }
                                                                    catch (MatchException v73) {
                                                                        throw _6j.a(v73);
                                                                    }
                                                                    v74 = this;
                                                                    _6j.c("K", (Object)v74, (int)(_6j.c("j", (Object)v74, (long)-784652839621145505L, (long)var2_2) - true), (long)-784652839621145505L, (long)var2_2);
                                                                    return;
                                                                }
                                                                catch (MatchException v75) {
                                                                    throw _6j.a(v75);
                                                                }
                                                            }
                                                            v76 = new Object[3];
                                                            v76[2] = true;
                                                            v76[1] = var30_16;
                                                            v76[0] = var12_7;
                                                            _6j.c("\u00cb", (Object)v76, (long)-784062333149253788L, (long)var2_2);
                                                            v77 = new Object[1];
                                                            v77[0] = var18_10;
                                                            _6j.c("K", (Object)this, (int)_6j.c("M", (Object)_6j.c("j", (Object)this, (long)-785733087607963398L, (long)var2_2), (Object)v77, (long)-786717183371976877L, (long)var2_2), (long)-784652839621145505L, (long)var2_2);
                                                            v71 = this;
                                                        }
                                                        try {
                                                            _6j.c("K", (Object)v71, (boolean)_6j.a("o", (int)44, (long)(313420907151485947L ^ var2_2)), (long)-784856410297635827L, (long)var2_2);
                                                            if (var28_15 == null) break block155;
lbl413:
                                                            // 2 sources

                                                            _6j.c("K", (Object)this, (boolean)_6j.a("o", (int)44, (long)(313420907151485947L ^ var2_2)), (long)-784856410297635827L, (long)var2_2);
                                                        }
                                                        catch (MatchException v78) {
                                                            throw _6j.a(v78);
                                                        }
                                                    }
                                                    v34 /* !! */  = _6j.c("j", (Object)this, (long)-784856410297635827L, (long)var2_2);
                                                }
                                                try {
                                                    try {
                                                        if (var28_15 != null) break block167;
                                                        if (!v34 /* !! */ ) break block168;
                                                    }
                                                    catch (MatchException v79) {
                                                        throw _6j.a(v79);
                                                    }
                                                    v34 /* !! */  = _6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)this, (long)-784998839969186586L, (long)var2_2), (long)-791587933033734849L, (long)var2_2), (Object)_6j.c("l", (long)-785556920056543551L, (long)var2_2), (long)-785828172419424462L, (long)var2_2);
                                                }
                                                catch (MatchException v80) {
                                                    throw _6j.a(v80);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var28_15 != null) break block169;
                                                                    if (v34 /* !! */ ) break block170;
                                                                }
                                                                catch (MatchException v81) {
                                                                    throw _6j.a(v81);
                                                                }
                                                                v34 /* !! */  = _6j.c("j", (Object)this, (long)-785311412313780041L, (long)var2_2);
                                                                if (var28_15 != null) break block169;
                                                            }
                                                            catch (MatchException v82) {
                                                                throw _6j.a(v82);
                                                            }
                                                            if (v34 /* !! */ ) break block170;
                                                        }
                                                        catch (MatchException v83) {
                                                            throw _6j.a(v83);
                                                        }
                                                        v84 = this;
                                                        if (var28_15 != null) break block171;
                                                    }
                                                    catch (MatchException v85) {
                                                        throw _6j.a(v85);
                                                    }
                                                    if (_6j.c("j", (Object)v84, (long)-785047021388873872L, (long)var2_2) <= 0) break block172;
                                                }
                                                catch (MatchException v86) {
                                                    throw _6j.a(v86);
                                                }
                                                v87 = this;
                                                _6j.c("K", (Object)v87, (int)(_6j.c("j", (Object)v87, (long)-785047021388873872L, (long)var2_2) - true), (long)-785047021388873872L, (long)var2_2);
                                                return;
                                            }
                                            catch (MatchException v88) {
                                                throw _6j.a(v88);
                                            }
                                        }
                                        v89 = new Object[2];
                                        v89[1] = _6j.c("l", (long)-785556920056543551L, (long)var2_2);
                                        v89[0] = var26_14;
                                        _6j.c("K", (Object)this, (boolean)_6j.c("\u00cb", (Object)v89, (long)-785795727693547891L, (long)var2_2), (long)-785311412313780041L, (long)var2_2);
                                        v84 = this;
                                    }
                                    v90 = new Object[1];
                                    v90[0] = var18_10;
                                    _6j.c("K", (Object)v84, (int)_6j.c("M", (Object)_6j.c("j", (Object)this, (long)-792200461625026032L, (long)var2_2), (Object)v90, (long)-786717183371976877L, (long)var2_2), (long)-785047021388873872L, (long)var2_2);
                                    return;
                                }
                                try {
                                    v91 = this;
                                    if (var28_15 != null) break block173;
                                    v34 /* !! */  = _6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)v91, (long)-784998839969186586L, (long)var2_2), (long)-791587933033734849L, (long)var2_2), (Object)_6j.c("l", (long)-785556920056543551L, (long)var2_2), (long)-785828172419424462L, (long)var2_2);
                                }
                                catch (MatchException v92) {
                                    throw _6j.a(v92);
                                }
                            }
                            try {
                                if (!v34 /* !! */ ) break block168;
                                v93 = new Object[1];
                                v93[0] = var8_5;
                                v94 = new Object[2];
                                v94[1] = _6H.class;
                                v94[0] = var22_12;
                                v91 = _6j.c("M", (Object)_6j.c("M", (Object)_6j.c("l", (long)-785618555744664474L, (long)var2_2), (Object)v93, (long)-784237649218960821L, (long)var2_2), (Object)v94, (long)-784316333058118410L, (long)var2_2);
                            }
                            catch (MatchException v95) {
                                throw _6j.a(v95);
                            }
                        }
                        var30_16 = (_6H)v91;
                        try {
                            try {
                                v96 = var30_16;
                                if (var28_15 != null) break block174;
                                if (_6j.c("M", (Object)v96, (long)-791563419504575123L, (long)var2_2) != false) break block168;
                            }
                            catch (MatchException v97) {
                                throw _6j.a(v97);
                            }
                            v96 = var30_16;
                        }
                        catch (MatchException v98) {
                            throw _6j.a(v98);
                        }
                    }
                    _6j.c("M", (Object)v96, null, (long)-784154628225389427L, (long)var2_2);
                }
                try {
                    if (var28_15 == null) break block175;
lbl520:
                    // 2 sources

                    v1 = this;
                }
                catch (MatchException v99) {
                    throw _6j.a(v99);
                }
            }
            v100 = new Object[1];
            v100[0] = var10_6;
            _6j.c("M", (Object)v1, (Object)v100, (long)-792322548942044626L, (long)var2_2);
        }
    }

    @_3i_0
    public void cfr_renamed_7(_6C c) {
        block12: {
            CallSite callSite;
            block11: {
                _4w[] wArray;
                long l2;
                long l3;
                long l4;
                block9: {
                    block10: {
                        long l5 = l4 = b ^ 0x702DF6E29EBCL;
                        l3 = l5 ^ 0x55AE9D86A8D1L;
                        l2 = l5 ^ 0x125A5F3CCB50L;
                        wArray = _3s.cfr_renamed_5();
                        try {
                            callSite = _6j.c("j", (Object)this, -8340817269208177363L, (long)l4);
                            if (wArray != null) break block9;
                            if (callSite != false) break block10;
                        }
                        catch (MatchException matchException) {
                            throw _6j.a(matchException);
                        }
                        return;
                    }
                    callSite = _6j.c("M", (Object)_6j.c("M", (Object)_6j.c("j", (Object)_6j.c("j", (Object)this, -8341967091173128762L, (long)l4), -8348608909255924705L, (long)l4), -8349352775261111963L, (long)l4), (Object)_6j.c("l", -8342537111273701407L, (long)l4), -8341630009612851029L, (long)l4);
                }
                try {
                    try {
                        if (wArray != null) break block11;
                        if (callSite == false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw _6j.a(matchException);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l3;
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l2;
                    objectArray2[0] = (int)_6j.c("M", (Object)_6j.c("j", (Object)this, -8348885036108542689L, (long)l4), (Object)objectArray, -8341577542958860943L, (long)l4);
                    callSite = _6j.c("\u00cb", (Object)objectArray2, -8342120117271916508L, (long)l4);
                }
                catch (MatchException matchException) {
                    throw _6j.a(matchException);
                }
            }
            try {
                if (callSite == false) {
                    c.void_8();
                }
            }
            catch (MatchException matchException) {
                throw _6j.a(matchException);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6j.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

