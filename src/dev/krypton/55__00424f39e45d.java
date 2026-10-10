/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 */
package dev.krypton;

import dev.krypton._3C;
import dev.krypton._3i_0;
import dev.krypton._4k;
import dev.krypton._4r;
import dev.krypton._6c_0;
import dev.krypton._6x_0;
import dev.krypton._8B;
import dev.krypton._92;
import dev.krypton._95;
import dev.krypton._97;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1299;

public class _55
extends _6x_0 {
    private final _92 cfr_renamed_9;
    private final _9r cfr_renamed_1;
    private final _97 cfr_renamed_2;
    private final Map cfr_renamed_7;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    public _55(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x14B96C685EDL;
        long l5 = l3 ^ 0x23C16D0C6B27L;
        long l6 = l3 ^ 0x112BA40FFC7EL;
        long l7 = l3 ^ 0x577301850D84L;
        long l8 = l3 ^ 0x48B392A1E2F6L;
        super((int)_55.a("k", 6636, (long)(0x615BA5496D4BBCE0L ^ l2)), -1, (_4r)((Object)_55.c("S", -6583588255594828655L, (long)l2)), l7);
        this.cfr_renamed_9 = new _92((int)_55.a("k", 22181, (long)(0x1893CCCA085BF3A0L ^ l2)), 1.0, l6, 255.0, 100.0, 1.0);
        this.cfr_renamed_1 = new _9r((int)_55.a("k", 28396, (long)(0x2C079725CD44BE2L ^ l2)), false, l4);
        this.cfr_renamed_2 = new _97((int)_55.a("k", 24922, (long)(0x3213B59858494451L ^ l2)), l5);
        this.cfr_renamed_7 = new HashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_55.c("\u00ff", (Object)this, -6575887480802257542L, (long)l2), _55.c("\u00ff", (Object)this, -6576577977169315810L, (long)l2), _55.c("\u00ff", (Object)this, -6582391776562322727L, (long)l2)};
        objectArray[0] = l8;
        _55.c("\u00e4", (Object)this, (Object)objectArray, -6583525627574604693L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _55.b = l.a(6685723970047203540L, 1779889151390363207L, MethodHandles.lookup().lookupClass()).a(42826352802432L);
                _55.j = new Object[85];
                _55.k = new String[85];
                _55.b();
                _55.f = new HashMap<K, V>(13);
                var0 = _55.b ^ 86409119638288L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00b4\u00aa\u00fe\u001c\u00af\u00e1\u00e1\u0092\u001f\\\u0092v\f;\u00c5\u00c5\u00830\u008f\u00f8<!\u008f\u00b6\u008b\u001d\u00ba[\u0017@\u009f:$\u0003\u001e\u00a7\u00dd\u00b2\u001a\u00c2,\u00c3\u001ayw\u00e8\u00c0\u00e1\u00cb\u008b\u00aa~b1nG";
                var7_6 = "\u00b4\u00aa\u00fe\u001c\u00af\u00e1\u00e1\u0092\u001f\\\u0092v\f;\u00c5\u00c5\u00830\u008f\u00f8<!\u008f\u00b6\u008b\u001d\u00ba[\u0017@\u009f:$\u0003\u001e\u00a7\u00dd\u00b2\u001a\u00c2,\u00c3\u001ayw\u00e8\u00c0\u00e1\u00cb\u008b\u00aa~b1nG".length();
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
                    var6_5 = "\u0097\u00ea\u00c5\u00fdV\u00c52\u00cf\u00f0\u0006vR\u00dcG\u00b6\u0004";
                    var7_6 = "\u0097\u00ea\u00c5\u00fdV\u00c52\u00cf\u00f0\u0006vR\u00dcG\u00b6\u0004".length();
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
        _55.d = var8_3;
        _55.e = new Integer[9];
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
            case 0 -> 10;
            case 1 -> 24;
            case 2 -> 31;
            case 3 -> 13;
            case 4 -> 36;
            case 5 -> 3;
            case 6 -> 23;
            case 7 -> 11;
            case 8 -> 7;
            case 9 -> 54;
            case 10 -> 42;
            case 11 -> 53;
            case 12 -> 0;
            case 13 -> 30;
            case 14 -> 16;
            case 15 -> 57;
            case 16 -> 15;
            case 17 -> 37;
            case 18 -> 22;
            case 19 -> 4;
            case 20 -> 56;
            case 21 -> 26;
            case 22 -> 39;
            case 23 -> 63;
            case 24 -> 46;
            case 25 -> 60;
            case 26 -> 28;
            case 27 -> 8;
            case 28 -> 59;
            case 29 -> 18;
            case 30 -> 17;
            case 31 -> 38;
            case 32 -> 14;
            case 33 -> 62;
            case 34 -> 20;
            case 35 -> 5;
            case 36 -> 1;
            case 37 -> 33;
            case 38 -> 61;
            case 39 -> 40;
            case 40 -> 32;
            case 41 -> 48;
            case 42 -> 49;
            case 43 -> 58;
            case 44 -> 47;
            case 45 -> 35;
            case 46 -> 6;
            case 47 -> 29;
            case 48 -> 50;
            case 49 -> 43;
            case 50 -> 27;
            case 51 -> 25;
            case 52 -> 12;
            case 53 -> 55;
            case 54 -> 44;
            case 55 -> 9;
            case 56 -> 52;
            case 57 -> 41;
            case 58 -> 34;
            case 59 -> 51;
            case 60 -> 45;
            case 61 -> 21;
            case 62 -> 2;
            default -> 19;
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
        _55.k[n3] = new String(cArray);
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @_3i_0
    public void cfr_renamed_1(_6c_0 c_0) {
        _55 v3;
        int n;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        block28: {
            CallSite callSite;
            block27: {
                long l10 = l9 = b ^ 0x7A63E2F19E1BL;
                l8 = l10 ^ 0x702F2E85A983L;
                l7 = l10 ^ 0x743DD591119CL;
                l6 = l10 ^ 0xC9ECF4C2763L;
                l5 = l10 ^ 0x49E96209F310L;
                l4 = l10 ^ 0x4A28E566BA33L;
                l3 = l10 ^ 0x632835E88748L;
                l2 = l10 ^ 0x15AAE925FA03L;
                n = _3C.cfr_renamed_7();
                try {
                    try {
                        try {
                            callSite = _55.c("\u00ff", (Object)this, 4007947180059843329L, (long)l9);
                            if (n == 0) break block27;
                            if (_55.c("\u00ff", (Object)callSite, 4007506025717346689L, (long)l9) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw _55.a(matchException);
                        }
                        v3 = this;
                        if (n == 0) break block28;
                    }
                    catch (MatchException matchException) {
                        throw _55.a(matchException);
                    }
                    callSite = _55.c("\u00ff", (Object)v3, 4007947180059843329L, (long)l9);
                }
                catch (MatchException matchException) {
                    throw _55.a(matchException);
                }
            }
            try {
                if (_55.c("\u00ff", (Object)callSite, 4007405690769535109L, (long)l9) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw _55.a(matchException);
            }
            v3 = this;
        }
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l5;
            if (_55.c("\u00e4", (Object)_55.c("\u00e4", (Object)_55.c("\u00ff", (Object)v3, 4000799695987962362L, (long)l9), (Object)objectArray, 4006009031997450627L, (long)l9), 4008003169474878565L, (long)l9) != false) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw _55.a(matchException);
        }
        float f = c_0.cfr_renamed_9;
        CallSite callSite = _55.c("\u00e4", (Object)_55.c("\u00e4", (Object)_55.c("\u00ff", (Object)_55.c("\u00ff", (Object)this, 4007947180059843329L, (long)l9), 4007506025717346689L, (long)l9), 3999960249080812884L, (long)l9), 4001086081015309118L, (long)l9);
        while (_55.c("\u00e4", (Object)callSite, 4007758824542778009L, (long)l9) != false) {
            block34: {
                CallSite callSite2;
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                _4k k;
                block33: {
                    _55 v12;
                    CallSite callSite3;
                    class_1297 class_12972;
                    block31: {
                        class_1297 class_12973;
                        block29: {
                            class_12972 = (class_1297)_55.c("\u00e4", (Object)callSite, 3999289940792626658L, (long)l9);
                            try {
                                try {
                                    class_12973 = class_12972;
                                    if (n == 0) break block29;
                                    if (class_12973 == _55.c("\u00ff", (Object)_55.c("\u00ff", (Object)this, 4007947180059843329L, (long)l9), 4007405690769535109L, (long)l9)) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _55.a(matchException);
                                }
                            }
                            catch (MatchException matchException) {
                                throw _55.a(matchException);
                            }
                            class_12973 = class_12972;
                        }
                        callSite3 = _55.c("\u00e4", (Object)class_12973, 4007432717555193715L, (long)l9);
                        try {
                            try {
                                v12 = this;
                                if (n == 0) break block31;
                                Object[] objectArray = new Object[2];
                                objectArray[1] = callSite3;
                                objectArray[0] = l8;
                                if (_55.c("\u00e4", (Object)_55.c("\u00ff", (Object)v12, 4000799695987962362L, (long)l9), (Object)objectArray, 4000997620157790551L, (long)l9) == false) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw _55.a(matchException);
                            }
                        }
                        catch (MatchException matchException) {
                            throw _55.a(matchException);
                        }
                        v12 = this;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l4;
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = (int)_55.c("\u00e4", (Object)_55.c("\u00ff", (Object)this, 4007876565907097177L, (long)l9), (Object)objectArray, 4006210208709580828L, (long)l9);
                    objectArray2[1] = l6;
                    objectArray2[0] = callSite3;
                    CallSite callSite4 = _55.c("\u00e4", (Object)v12, (Object)objectArray2, 4007091270766905105L, (long)l9);
                    CallSite callSite5 = _55.c("\u00d8", (double)f, (double)_55.c("\u00ff", (Object)class_12972, 4001336308554404891L, (long)l9), (double)_55.c("\u00e4", (Object)class_12972, 4007258558576879693L, (long)l9), 4007648413042389175L, (long)l9);
                    CallSite callSite6 = _55.c("\u00d8", (double)f, (double)_55.c("\u00ff", (Object)class_12972, 3999428379623249146L, (long)l9), (double)_55.c("\u00e4", (Object)class_12972, 4000934689466633945L, (long)l9), 4007648413042389175L, (long)l9);
                    CallSite callSite7 = _55.c("\u00d8", (double)f, (double)_55.c("\u00ff", (Object)class_12972, 3999204287026073697L, (long)l9), (double)_55.c("\u00e4", (Object)class_12972, 4000194283854018776L, (long)l9), 4007648413042389175L, (long)l9);
                    reference var30_19 = _55.c("\u00e4", (Object)class_12972, 4000049130582015484L, (long)l9) / 2.0f;
                    try {
                        try {
                            k = c_0.cfr_renamed_7;
                            Object object = (float)callSite5 - var30_19;
                            object = (float)callSite6;
                            object = (float)callSite7 - var30_19;
                            object = (float)callSite5 + var30_19;
                            object = (float)callSite6 + _55.c("\u00e4", (Object)class_12972, 4008141263014514014L, (long)l9);
                            object = (float)callSite7 + var30_19;
                            callSite2 = callSite4;
                            if (n == 0) break block33;
                            Object[] objectArray3 = new Object[11];
                            objectArray3[10] = l3;
                            objectArray3[9] = 0;
                            objectArray3[8] = _55.c("S", 4001235507636648271L, (long)l9);
                            objectArray3[7] = callSite4;
                            objectArray3[6] = callSite2;
                            objectArray3[5] = object;
                            objectArray3[4] = object2;
                            objectArray3[3] = object3;
                            objectArray3[2] = object4;
                            objectArray3[1] = object5;
                            objectArray3[0] = object6;
                            _55.c("\u00e4", (Object)k, (Object)objectArray3, 3999548026866572158L, (long)l9);
                            if (_55.c("\u00e4", (Object)_55.c("\u00ff", (Object)this, 4006051379456830269L, (long)l9), (long)l2, 3999820702418746647L, (long)l9) == false) break block34;
                        }
                        catch (MatchException matchException) {
                            throw _55.a(matchException);
                        }
                        k = c_0.cfr_renamed_7;
                        Object object = _55.c("\u00ff", (Object)_55.c("S", 3999360944249022015L, (long)l9), 3999999669683013898L, (long)l9);
                        object = _55.c("\u00ff", (Object)_55.c("S", 3999360944249022015L, (long)l9), 4007786832926114626L, (long)l9);
                        object = _55.c("\u00ff", (Object)_55.c("S", 3999360944249022015L, (long)l9), 4007194894596538890L, (long)l9);
                        object = callSite5;
                        object = callSite6 + (double)(_55.c("\u00e4", (Object)class_12972, 4008141263014514014L, (long)l9) / 2.0f);
                        object = callSite7;
                        Object[] objectArray4 = new Object[3];
                        objectArray4[2] = (int)_55.a("k", 10173, (long)(0x6B50EA066CA1194L ^ l9));
                        objectArray4[1] = l6;
                        objectArray4[0] = callSite3;
                        callSite2 = _55.c("\u00e4", (Object)this, (Object)objectArray4, 4007091270766905105L, (long)l9);
                    }
                    catch (MatchException matchException) {
                        throw _55.a(matchException);
                    }
                }
                Object[] objectArray = new Object[8];
                objectArray[7] = callSite2;
                objectArray[6] = l7;
                objectArray[5] = object;
                objectArray[4] = object2;
                objectArray[3] = object3;
                objectArray[2] = object4;
                objectArray[1] = object5;
                objectArray[0] = object6;
                _55.c("\u00e4", (Object)k, (Object)objectArray, 4007339962576867781L, (long)l9);
            }
            if (n == 0) return;
        }
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u0018='&\n\t\u0005(%g\u000fUIm";
        objectArray[1] = "\"j6}\u0012\f?\u007f4<\u0017P\u007f8";
        objectArray[2] = "G^\u000eTyXZK\f\u0015|\u0004\u001a\t";
        objectArray[3] = "?P\u0016A\u0001\r\"E\u0014\u0000\u0004QoG";
        objectArray[4] = "xVI{>\u0011eCK:;M%A";
        objectArray[5] = "T/\nV>\u001bI:\b\u0017;G\u00062";
        objectArray[6] = ";sX?\u000f\u0004NSS0\u001eK/]X;\u001a\u0011[";
        objectArray[7] = Void.TYPE;
        _55.k[7] = "java/lang/Void";
        objectArray[8] = "W\u0003}q\u001f\t\"#v~\u000eFC-}u\n\u001c7";
        objectArray[9] = Boolean.TYPE;
        _55.k[9] = "java/lang/Boolean";
        objectArray[10] = "TXp\r$\u0019TXgQ(\u0016N\u0013gO(\u0003Ib5\u0011pG";
        objectArray[11] = Double.TYPE;
        _55.k[11] = "java/lang/Double";
        objectArray[12] = "]\u0001M4\u000b4V\u000e\\{l,R\u0012Z7I=";
        objectArray[13] = "mj\u0000DRPsb\u001a\u000b5Qby\u0017Q\u0013W";
        objectArray[14] = "[\u001b)f\u0010zF\u000e+'\u0015&\u0006\u0006";
        objectArray[15] = ".\u0006!eTf%\t0*5h.\u00024p";
        objectArray[16] = "!}\bf\u0019\u0003<h\n'\u001c_qs";
        objectArray[17] = "\u0018[Mnz\n\u0018[Z2v\u0005\u0002\u0010Z,v\u0010\u0005a\u000bt$";
        objectArray[18] = "zABy`\u0019\u000faIvqVnoB}u\f\u001a";
        objectArray[19] = Long.TYPE;
        _55.k[19] = "java/lang/Long";
        objectArray[20] = "4\u001dK\u0000U\n4\u001d\\\\Y\u0005.V\\BY\u0010)'\t\u001d\u0000";
        objectArray[21] = Float.TYPE;
        _55.k[21] = "java/lang/Float";
        objectArray[22] = "s\u001fkA1H\u0006?`N \u0007g1kE$]\u0013";
        objectArray[23] = "+\u001f$\u0006SA6\n&GV\u001dw8";
        objectArray[24] = "_>\u0010kEE*\u001e\u001bdT\nK\u0010\u0010oPP?";
        objectArray[25] = "OM2vlrOM%*`}U\u0006%4`hRwwj8\"";
        objectArray[26] = "d\u0002`$\u0007Gd\u0002wx\u000bH~Iwf\u000b]y8';Z";
        objectArray[27] = ".]\u0018\u0013\"b.]\u000fO.m4\u0016\u000fQ.x3g[\ty";
        objectArray[28] = ">P\u0004A\u001a5>P\u0013\u001d\u0016:$\u001b\u0013\u0003\u0016/#jCZDn";
        objectArray[29] = ".\u000e0Zm50\u0006*\u0015\u0010%0";
        objectArray[30] = "0F\u0016]=qEf\u001dR,>$h\u0016Y(dP";
        objectArray[31] = ":(T\u0002\bIO\b_\r\u0019\u0006.\u0006T\u0006\u001d\\Z";
        objectArray[32] = Integer.TYPE;
        _55.k[32] = "java/lang/Integer";
        objectArray[33] = "(#\u0004;\u001b\u000f6+\u001etx\u001b2";
        objectArray[34] = "y]+I\"&\f} F3ims+M73\u0019";
        objectArray[35] = ":[r\u0018\u000f\u000e:[eD\u0003\u0001 \u0010eZ\u0003\u0014'a1\u000fPT";
        objectArray[36] = "y\u0017vIs(y\u0017a\u0015\u007f'c\\a\u000b\u007f2d-5^,s";
        objectArray[37] = "8#\u0001Wx;8#\u0016\u000bt4\"h\u0016\u0015t!%\u0019G@#b";
        objectArray[38] = "\u001eCeUW}\u0000K\u007f\u001a+i\u001aF|Y";
        objectArray[39] = "\u001ca\u00070\u0001W\u000f+D^Ok\r!S8\r\u001a\u0004n\u0003";
        objectArray[40] = "\u001aI}x\u0007H\u0013\u0006-\u001eJ9\u000f\t$xEV\u0011G}u{\u0007\r[\u007fd\nH\u0016Y)\u001e";
        objectArray[41] = "\u0013liz|D\u00179\u007fcLJA,dt x\u0016k?*|/\u001cj4y-SW?5hL";
        objectArray[42] = "M\b\"'\r_^BaIAcH\u0002a&G_K@~0";
        objectArray[43] = "\"c\u001a\u0003\u0017D{?\u001fE/Ynj\u0006RS_h\u0007MYTQ)i\u0012^V_\u0012";
        objectArray[44] = "S/g\u0017A_U!j\u0019#\u000b<'0Y\\L\\zxI\u0018";
        objectArray[45] = "'|\u0012]P1.=\u0017Pj[/,\u001bDjir$\u0014\u0005[`3!\u0019";
        objectArray[46] = "`\u000b~rfjiD.\u0014*\u001buK'r$tk\u0005~\u007f\u001at\u007f\u001c(vqrq\u0011&\u0014";
        objectArray[47] = "cG?0(\u0003g\u0012))\u0018\u0006=\u001665OVd@bY(Rl\u00113%c\u0007m\u0000";
        objectArray[48] = "n+\f=n11,\u000e3U929\u000bT<90v\u000f$8.g9w";
        objectArray[49] = " #\u000fm\u00014$v\u0019t11~r\u0006hfb./S\u0004\u0001e/u\u0003xJ0.d";
        objectArray[50] = "\\\u001b>t&-XN(m\u0016(\u0002J7qA{R\u0018j\u001d&|SM2am)R\\";
        objectArray[51] = "2(R\u0019G2dhG\u0012\u007f5X;\u0018\u001bFbc(Q\u001cA";
        objectArray[52] = "e\"L:=l&,\u0019/_W\u0012\rj\f\u0005\re\"L:=l&,\u0019/";
        objectArray[53] = "\u001ctd..\u0002J4q%\u0016\u000f6\fry&YHcl7\u007fTv1%#l\u000e\u0004}v(.?";
        objectArray[54] = "\r\\MU@;MZ\u0004D  \u001c__uG,\u0018$Z\u000eQ?\rD\u0007FA{u";
        objectArray[55] = "rCr\u001aU~'\u001ef\u001en(N\u001f)G\b/!\u0001g\u001e\u0005\u0011sHs\r_c?\u001bxOn";
        objectArray[56] = "}N\u0003U,ft]\u0012ZObwC\u000fO#P#\u0007U\u0012v\u0007sY\u0000\u00177wwNWXO\u007fbM\u0004H4?d\u0004\u0015(";
        objectArray[57] = "\u001bqa(69Qykk\f8 v~t6}Qscyr\u0002\u001e\u007fy|vsQd{*\f";
        objectArray[58] = "\u001ebd[9V\r+c\\T\u0003\u00144e\u000e\u0003TNd;bdWE3`\u001e/\u0002D\"";
        objectArray[59] = "}.d*+gqxqgK;}ix}'\t)%!#q^ q~\"s\"y-{dK";
        objectArray[60] = "\u007f\u001e5U\u0001U|\\*C;\u0006tXKS]\u0006&\\;WJQi$\"\\TVaT&K\u0003\u0019\u0019";
        objectArray[61] = "<(OVF98}YOv7nhBX\u001a\u0005:+\u001c\u000fORnq\u001dS\b.8}\u001fVv";
        objectArray[62] = "xCa<!\b~Ml2C_R.c32\u001coN>{\"X";
        objectArray[63] = "$}F\u001eKJ (P\u0007{Dv=K\u0010\u0017v!z\u0010MB!+{\u001b\u001d\u001a]`.\u001a\f{";
        objectArray[64] = "\u000bxQ9Pc\u00181V>=6\u0001.Plja[~\f\u0000\rbP)U|F7Q8";
        objectArray[65] = "\\>B\u0010*:Ot\u0001~f\u0006X>O\u0018diFp\u0016\u0015ZiRi@\u001c1o\\dN~";
        objectArray[66] = "\u0002\u0014\u00063\u001c\u001cTT\u00138$\u0019'l\u0010d\u0014GV\u0003\u000e*MJhQG>^\u0010\u001a\u001d\u00145\u001c!";
        objectArray[67] = "\u0016(\\6%|\u0012}J/\u0015rDhQ8y@\u0013/\nf*\u0017\u0019.\u00015tkR{\u0000$\u0015";
        objectArray[68] = "0xHs\f\u00114-^j<\u001fb8E}P-2t\u001b&<\u001a`=\u001dbWF2~\u001a\u001a";
        objectArray[69] = "$7[k:=?!XwZ+$5Bi\r|zb\u001a\u0005;<;;Lz6*% ";
        objectArray[70] = "qC\u001a+\u001d\u0012r\u0001\u0005='Vj\u0005d-AA(\u0001\u0014)V\u0016gy\r\"H\u0011o\t\t5\u001f^\u0017\u0010\u0002+\u0018Vg\u0014\u0015|W.";
        objectArray[71] = "/cM9\u0019\u00024uN%y\u0014/aT;.Cp<\u000fW\u0014A2<Pn\u0018\u0017'q";
        objectArray[72] = "Tfhgg9\u000baji\\7\f\u007fUc,+e:vl7-\u0014umnaW";
        objectArray[73] = "\u0011\u0016\u007fi\u0010L\u0016\b|opH\u001e\u000f%s\u001czJMy/N-CIu~\u0011Q\b\u001ctop\u001dIC/u\fV\u001cB>\u0014@\u0017C\u0019$h\u000bBB\bE$J\u001d\u0019\u00129o\u001f\u001c\bs";
        objectArray[74] = "\n\u001cO.^,\u0019V\f@\u0011\u0010PL\u0015#Ij\u0019KI!";
        objectArray[75] = "T\b\u0005&+\u0000GA\u0002!FU^^\u0004s\u0011\u0002\u0004\u000eY\u001fv\u0001\u000fY\u0001c=T\u000eH";
        objectArray[76] = "\tr\u001a\u0012^+V`SG78\u0011_OZK(j,O@\\#\u001bcTB\nY";
        objectArray[77] = "F\u007fF1\u0001\u0001\u0013\"R5:Wz%B!T\u000e\u0002>T\"H";
        objectArray[78] = "\"@\u000eNY]&\u0015\u0018WiSp\u0000\u0003@\u0005a$C]\u0017S6p\u0019\\K\u0017J&\u0015^Ni";
        objectArray[79] = "\u0018#=eeY\u0001i(7\u0003I\u001e4#8T\u001bF`xk\u0003@\u000e5:7bI\u001d$5";
        objectArray[80] = "pOH\u0016N\u001ac\u0005\u000bx\u000f&(\u0014\u000fG\u0004\u001db\u001c\u0005\u0004";
        objectArray[81] = "qau[b\u0010x.%=!ad!,[ \u000ezouV\u001e\u0002c!,Tl]qhy=";
        objectArray[82] = "Qi1m@\u0012\u0018nmo'Uhnf>AV\u0007p(gLh\r9'q_\bPq75'";
        objectArray[83] = "\r.N;\u0002}Nb\u001a{;e\u0019,\fK]\u007ft9@{D{\u0014d\bk\u0000\u0003\u0011l\u0001uCcL$\u00111;";
        Object[] objectArray2 = objectArray;
        objectArray[84] = "\t\u00184H\u001b;\u000f\u00169Fy`f\u0010c\u0006\u0006(\u0006M+\u0016B";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ff' || c == '\u00ba' || c == 'S' || c == 'p') {
                field = _55.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ff' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _55.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _55.b(lookup, mutableCallSite, string, methodType, l2, l3);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/55" + " : " + string + " : " + methodType.toString(), exception);
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
        int n = _55.e(l2, l3);
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
                clazz3 = _55.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _55.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _55.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _55.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _55.f(1081755726436545L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _55.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _55.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _55.f(1081755726436545L, 0L);
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
            int n = _55.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _55.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _55.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _55.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _55.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _55.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/55" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x1A2;
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
                throw new RuntimeException("dev/krypton/55", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _55.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _55.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _55.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _55.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _55.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _55.c(clazz3, string2, clazz2)) != null) {
                    _55.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _55.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _55.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _55.f(1081755726436545L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private _8B dev_krypton_8B_4(Object[] objectArray) {
        int[] nArray;
        CallSite callSite;
        long l2;
        int n;
        long l3;
        class_1299 class_12992;
        block6: {
            block7: {
                class_12992 = (class_1299)objectArray[0];
                l3 = (Long)objectArray[1];
                n = (Integer)objectArray[2];
                long l4 = l3 = b ^ l3;
                long l5 = l4 ^ 0x44934B9988A2L;
                l2 = l4 ^ 0x4DABFD8CFB26L;
                int n2 = _3C.cfr_renamed_7();
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = class_12992;
                objectArray2[0] = l5;
                CallSite callSite2 = _55.c("\u00e4", (Object)_55.c("\u00ff", (Object)this, -5084130033438032114L, (long)l3), (Object)objectArray2, -5083503264038692422L, (long)l3);
                try {
                    try {
                        callSite = callSite2;
                        if (n2 == 0) break block6;
                        if (callSite != null) {
                        }
                        break block7;
                    }
                    catch (MatchException matchException) {
                        throw _55.a(matchException);
                    }
                    return new _8B((int)_55.c("\u00ff", (Object)callSite2, -5082346292930769036L, (long)l3), (int)_55.c("\u00ff", (Object)callSite2, -5083609346446942568L, (long)l3), l2, (int)_55.c("\u00ff", (Object)callSite2, -5085282181788959352L, (long)l3), n);
                }
                catch (MatchException matchException) {
                    throw _55.a(matchException);
                }
            }
            callSite = _55.c("\u00e4", (Object)_55.c("\u00ff", (Object)this, -5083739465988300720L, (long)l3), (Object)class_12992, -5082519430961196665L, (long)l3);
        }
        if ((nArray = (int[])callSite) == null) {
            Random random = new Random((long)_55.c("\u00e4", (Object)_55.c("\u00e4", (Object)_55.c("S", -5085818885498309062L, (long)l3), (Object)class_12992, -5082777530903509188L, (long)l3), -5082885409360534994L, (long)l3));
            nArray = new int[]{(int)(_55.a("k", 9864, (long)(0x3AF84A8644231E50L ^ l3)) + _55.c("\u00e4", (Object)random, (int)_55.a("k", 13789, (long)(0x6F9EFA50B2038D07L ^ l3)), -5085523313259705657L, (long)l3)), (int)(_55.a("k", 9106, (long)(0x1649E9768B579B4DL ^ l3)) + _55.c("\u00e4", (Object)random, (int)_55.a("k", 489, (long)(0x1A6660158FE6B937L ^ l3)), -5085523313259705657L, (long)l3)), (int)(_55.a("k", 9106, (long)(0x1649E9768B579B4DL ^ l3)) + _55.c("\u00e4", (Object)random, (int)_55.a("k", 489, (long)(0x1A6660158FE6B937L ^ l3)), -5085523313259705657L, (long)l3))};
            _55.c("\u00e4", (Object)_55.c("\u00ff", (Object)this, -5083739465988300720L, (long)l3), (Object)class_12992, (Object)nArray, -5086296570828419688L, (long)l3);
        }
        return new _8B(nArray[0], nArray[1], l2, nArray[2], n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_55.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_55.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

