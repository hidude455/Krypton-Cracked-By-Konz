/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_408
 */
package dev.krypton;

import dev.krypton._32;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6P;
import dev.krypton._6u_0;
import dev.krypton._6x_0;
import dev.krypton._8j;
import dev.krypton._95;
import dev.krypton._9M;
import dev.krypton._9Z;
import dev.krypton._9i;
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
import net.minecraft.class_408;

public class _6A
extends _6x_0 {
    public final _9i cfr_renamed_1;
    public final _9r cfr_renamed_9;
    private static final long b = l.a(-8294234706669960635L, -7738255689114950722L, MethodHandles.lookup().lookupClass()).a(13217244909875L);
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_370(Object[] objectArray) {
        block14: {
            Object object;
            int n;
            String string;
            long l2;
            block11: {
                block12: {
                    block10: {
                        String string2;
                        block9: {
                            l2 = (Long)objectArray[0];
                            string = (String)objectArray[1];
                            l2 = b ^ l2;
                            n = _32.cfr_renamed_2();
                            try {
                                string2 = string;
                                if (n == 0) break block9;
                                if (string2 == null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _6A.a(matchException);
                            }
                            string2 = string;
                        }
                        try {
                            object = _6A.c("K", string2, 6175025545249286720L, (long)l2);
                            if (l2 < 0L || n == 0) break block11;
                            if (object == false) break block12;
                        }
                        catch (MatchException matchException) {
                            throw _6A.a(matchException);
                        }
                    }
                    return;
                }
                object = _6A.c("K", string, (Object)"/", 6174797018457045386L, (long)l2);
            }
            try {
                block13: {
                    try {
                        if (l2 >= 0L) {
                            if (object == false) break block13;
                            _6A.c("K", (Object)_6A.c("K", (Object)_6A.c("E", (Object)this, 6174592000574446043L, (long)l2), 6175232737160115087L, (long)l2), (Object)_6A.c("K", string, 1, 6178566967168538543L, (long)l2), 6178658265530476054L, (long)l2);
                            object = n;
                        }
                        if (object != false) break block14;
                    }
                    catch (MatchException matchException) {
                        throw _6A.a(matchException);
                    }
                }
                _6A.c("K", (Object)_6A.c("K", (Object)_6A.c("E", (Object)this, 6174592000574446043L, (long)l2), 6175232737160115087L, (long)l2), (Object)string, 6175088225118453864L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _6A.a(matchException);
            }
        }
    }

    public _6A(long l2) {
        long l3 = l2 = b ^ l2;
        long l4 = l3 ^ 0x28A81BD5F092L;
        long l5 = l3 ^ 0x29890E8D77DEL;
        long l6 = l3 ^ 0x50410780DED1L;
        long l7 = l3 ^ 0x7FB199CEFFB7L;
        long l8 = l3 ^ 0x60710AEA10C5L;
        super((int)_6A.a("h", 1155, (long)(0x48DE300BAF337908L ^ l2)), -1, (_4r)((Object)_6A.c("B", 6238878946121539999L, (long)l2)), l7);
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        this.cfr_renamed_1 = _6A.c("K", (Object)new _9i((int)_6A.a("h", 25199, (long)(0x40ED330BE8369FE5L ^ l2)), l6), (Object)objectArray, 6238679836463513147L, (long)l2);
        this.cfr_renamed_9 = new _9r((int)_6A.a("h", 27366, (long)(0x21EA1E800A9176FL ^ l2)), false, l5);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_6A.c("E", (Object)this, 6239623251081275949L, (long)l2), _6A.c("E", (Object)this, 6239670897736885814L, (long)l2)};
        objectArray2[0] = l8;
        _6A.c("K", (Object)this, (Object)objectArray2, 6239376387736128177L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new Object[48];
        k = new String[48];
        _6A.b();
        f = new HashMap(13);
        long l2 = b ^ 0x1BA4E5B9A3ECL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l2 << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "x\u0000\u00ac\u00eer\u00cc\u00be\u0001\u00f1\u00c3E\u00a5u\u00a0[\u00b5\u0005t!8{\u00e0>\u0080";
        int n2 = "x\u0000\u00ac\u00eer\u00cc\u00be\u0001\u00f1\u00c3E\u00a5u\u00a0[\u00b5\u0005t!8{\u00e0>\u0080".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
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
            case 0 -> 41;
            case 1 -> 0;
            case 2 -> 38;
            case 3 -> 44;
            case 4 -> 4;
            case 5 -> 43;
            case 6 -> 51;
            case 7 -> 11;
            case 8 -> 39;
            case 9 -> 25;
            case 10 -> 50;
            case 11 -> 15;
            case 12 -> 18;
            case 13 -> 26;
            case 14 -> 34;
            case 15 -> 29;
            case 16 -> 5;
            case 17 -> 57;
            case 18 -> 33;
            case 19 -> 37;
            case 20 -> 35;
            case 21 -> 14;
            case 22 -> 60;
            case 23 -> 9;
            case 24 -> 21;
            case 25 -> 32;
            case 26 -> 27;
            case 27 -> 46;
            case 28 -> 22;
            case 29 -> 6;
            case 30 -> 13;
            case 31 -> 20;
            case 32 -> 58;
            case 33 -> 47;
            case 34 -> 30;
            case 35 -> 1;
            case 36 -> 52;
            case 37 -> 61;
            case 38 -> 48;
            case 39 -> 56;
            case 40 -> 28;
            case 41 -> 10;
            case 42 -> 3;
            case 43 -> 23;
            case 44 -> 45;
            case 45 -> 2;
            case 46 -> 24;
            case 47 -> 53;
            case 48 -> 31;
            case 49 -> 62;
            case 50 -> 17;
            case 51 -> 42;
            case 52 -> 55;
            case 53 -> 63;
            case 54 -> 7;
            case 55 -> 54;
            case 56 -> 59;
            case 57 -> 16;
            case 58 -> 36;
            case 59 -> 8;
            case 60 -> 19;
            case 61 -> 49;
            case 62 -> 12;
            default -> 40;
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
        _6A.k[n3] = new String(cArray);
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @_3i_0
    public void cfr_renamed_1(_6P var1_1) {
        block38: {
            block39: {
                block36: {
                    block37: {
                        block34: {
                            block35: {
                                block32: {
                                    block33: {
                                        block30: {
                                            block31: {
                                                v0 = var2_2 = _6A.b ^ 27310541907059L;
                                                var4_3 = v0 ^ 96924449328268L;
                                                var6_4 = v0 ^ 74028878361035L;
                                                var8_5 = v0 ^ 115038104806288L;
                                                var10_6 = _32.cfr_renamed_4();
                                                try {
                                                    try {
                                                        v1 = _6A.c("E", (Object)this, (long)-5901995575289142660L, (long)var2_2);
                                                        if (var10_6 != 0) break block30;
                                                        if (_6A.c("E", (Object)v1, (long)-5901530271399458950L, (long)var2_2) != null) break block31;
                                                    }
                                                    catch (MatchException v2) {
                                                        throw _6A.a(v2);
                                                    }
                                                    return;
                                                }
                                                catch (MatchException v3) {
                                                    throw _6A.a(v3);
                                                }
                                            }
                                            v1 = _6A.c("E", (Object)this, (long)-5901995575289142660L, (long)var2_2);
                                        }
                                        try {
                                            v4 /* !! */  = _6A.c("E", (Object)v1, (long)-5901958560893388909L, (long)var2_2) instanceof class_408;
                                            if (var10_6 != 0) break block32;
                                            if (v4 /* !! */  == 0) break block33;
                                        }
                                        catch (MatchException v5) {
                                            throw _6A.a(v5);
                                        }
                                        return;
                                    }
                                    v4 /* !! */  = _6A.c("E", (Object)_6A.c("E", (Object)this, (long)-5901995575289142660L, (long)var2_2), (long)-5901958560893388909L, (long)var2_2) instanceof _9Z;
                                }
                                try {
                                    if (var10_6 != 0) break block34;
                                    if (v4 /* !! */  == 0) break block35;
                                }
                                catch (MatchException v6) {
                                    throw _6A.a(v6);
                                }
                                return;
                            }
                            v4 /* !! */  = _6A.c("E", (Object)_6A.c("E", (Object)this, (long)-5901995575289142660L, (long)var2_2), (long)-5901958560893388909L, (long)var2_2) instanceof _9M;
                        }
                        try {
                            if (var10_6 != 0) break block36;
                            if (v4 /* !! */  == 0) break block37;
                        }
                        catch (MatchException v7) {
                            throw _6A.a(v7);
                        }
                        return;
                    }
                    v4 /* !! */  = (int)_6A.c("K", (Object)_6A.c("E", (Object)this, (long)-5902950297015886155L, (long)var2_2), (long)var8_5, (long)-5903050878456481211L, (long)var2_2);
                }
                try {
                    try {
                        try {
                            if (var10_6 != 0) break block38;
                            if (v4 /* !! */  != 0) break block39;
                        }
                        catch (MatchException v8) {
                            throw _6A.a(v8);
                        }
                        if (_6A.c("E", (Object)_6A.c("E", (Object)this, (long)-5901995575289142660L, (long)var2_2), (long)-5901958560893388909L, (long)var2_2) == null) break block39;
                    }
                    catch (MatchException v9) {
                        throw _6A.a(v9);
                    }
                    return;
                }
                catch (MatchException v10) {
                    throw _6A.a(v10);
                }
            }
            v4 /* !! */  = var1_1.cfr_renamed_4;
        }
        try {
            if (v4 /* !! */  != 1) {
                return;
            }
        }
        catch (MatchException v11) {
            throw _6A.a(v11);
        }
        v12 = new Object[1];
        v12[0] = var4_3;
        var11_7 = _6A.c("K", (Object)_6A.c("K", (Object)_6A.c("E", (Object)this, (long)-5902853328633572690L, (long)var2_2), (Object)v12, (long)-5902219693770271060L, (long)var2_2), (long)-5901557009863120760L, (long)var2_2);
        while (_6A.c("K", (Object)var11_7, (long)-5901750494735193443L, (long)var2_2) != false) {
            block40: {
                var12_8 = (_8j)_6A.c("K", (Object)var11_7, (long)-5901818998637285193L, (long)var2_2);
                try {
                    try {
                        v13 = _6A.c("E", (Object)var12_8, (long)-5902355822537810301L, (long)var2_2);
                        v14 /* !! */  = _6A.c("K", (Object)var1_1.cfr_renamed_7, (long)-5901685604270976500L, (long)var2_2);
                        if (var10_6 != 0) break block40;
                        if (v13 == v14 /* !! */ ) {
                        }
                        ** GOTO lbl111
                    }
                    catch (MatchException v15) {
                        throw _6A.a(v15);
                    }
                    v13 = _6A.c("E", (Object)var12_8, (long)-5902355822537810301L, (long)var2_2);
                    v14 /* !! */  = (CallSite)-1;
                }
                catch (MatchException v16) {
                    throw _6A.a(v16);
                }
            }
            try {
                try {
                    if (v13 != v14 /* !! */ ) {
                        v17 = new Object[2];
                        v17[1] = _6A.c("E", (Object)var12_8, (long)-5902427982138264021L, (long)var2_2);
                        v17[0] = var6_4;
                        _6A.c("K", (Object)this, (Object)v17, (long)-5902294744531125335L, (long)var2_2);
                        if (var10_6 == 0) break;
                    }
                }
                catch (MatchException v18) {
                    throw _6A.a(v18);
                }
lbl111:
                // 2 sources

                if (var10_6 == 0) continue;
                break;
            }
            catch (MatchException v19) {
                throw _6A.a(v19);
            }
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _6A.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "9M\u000e1hF2B\u001f~\u0015^!E\u00167";
        objectArray[1] = Integer.TYPE;
        _6A.k[1] = "java/lang/Integer";
        objectArray[2] = "u\u0016 k\\Xu\u001677PWo]7)PBh,bv\u0005";
        objectArray[3] = Void.TYPE;
        _6A.k[3] = "java/lang/Void";
        objectArray[4] = "\u001b\u0005IoH\u0013\u0006\u0010K.MOI\u0018";
        objectArray[5] = "\u0003!*\u0019qv\u0003!=E}y\u0019j=[}l\u001e\u001bm\u0006,";
        objectArray[6] = Boolean.TYPE;
        _6A.k[6] = "java/lang/Boolean";
        objectArray[7] = "+\u001d9\"XM+\u001d.~TB1V.`TW6'|=\f\u0014|";
        objectArray[8] = "Q\"/:_4O*5u=(H7";
        objectArray[9] = "\u001aiyjk{\u0004ac%\fz\u0015zn\u007f*|";
        objectArray[10] = "-\u0013\":\u00105-\u00135f\u001c:7X5x\u001c/0)a K";
        objectArray[11] = "^;C\u001ew\u0006^;TB{\tDpT\\{\u001cC\u0001\u0003\u0003-";
        objectArray[12] = "/;d\f\u001c\u0006$4uC}\b/?q\u0019";
        objectArray[13] = "Y\u0014dG\\\u001cD\u0001f\u0006Y@\u0004\u0018";
        objectArray[14] = "\u000f*/\u0017?\u0014z\n$\u0018.[\u001b\u0004/\u0013*\u0001o";
        objectArray[15] = "\u000f,+:q\t\u00129){tUS#";
        objectArray[16] = "p+\u001d[K\u0003m>\u001f\u001aN_\"\u000f";
        objectArray[17] = "nynP\u0003\u0006\u001bYe_\u0012IzWnT\u0016\u0013\u000e";
        objectArray[18] = ")|\u0001)\u0018\\4i\u0003h\u001d\u0000tk";
        objectArray[19] = Long.TYPE;
        _6A.k[19] = "java/lang/Long";
        objectArray[20] = "#\u007foR\rOV_d]\u001c\u00007QoV\u0018ZC";
        objectArray[21] = "E{`\u001f\u0011|Xnb^\u0014 \u0015l";
        objectArray[22] = ")\u0010MEN\u0000\\0FJ_O=>MA[\u0015I";
        objectArray[23] = "M!$xIOM!3$E@Wj3:EUP\u001bag\u001d\u0016\u001b";
        objectArray[24] = "b7\u0016^\u00026>9\b\u001anl2z\u0011\u0006\u0002^`:K]S\t\"=\u001c\u001f\u000bq<y\ba";
        objectArray[25] = "$Ep.62z\nx%\\7eV`# 1c;$#?lp\u0004d!70\u0019";
        objectArray[26] = "88>2%Qn76#\u0015Vb*7.B\u0001<}oB*\u00053&jx+\u0003cz";
        objectArray[27] = "z\ndo;\u0003}\\f\u0010 \u0013~\u0017aj:\b{l`+6\u0010q\u0014~o\"nz\ndo;\u0003}\\f\u0010";
        objectArray[28] = "D\u000b9\u0002!\u0013\u0012\u00041\u0013\u0011\u0014\u001e\u00190\u001eFC@Iir!\u0013\u0002H+\u0010z\u0018\u001c\u0012";
        objectArray[29] = "\u0003Oa#\u001d@\u0003\u001ext#\u001fW^q(O-\u0006\u001f.t\u001bzTDh0C\u0017S\u0012jO\u0019\u001b\u000bB/1\u001d\u001e\u0004\u001e\u0011";
        objectArray[30] = "\u0007\u001b\u0001,Z\u0011G\u0019\tp3HT\u0002\u001e\u0016\u0003OV\u0012Y)JHP\u0017b";
        objectArray[31] = ".KZ]9fnIR\u0001P9yY\u007f\n %\u0010\u001eZ\u0017(&(]A\u00150Y";
        objectArray[32] = "V\\H\u0005]3\r\u0006[^79g\u000eA\u0003\u000ek\u0007YG\tM\tZ\u001e@\\]m\u0004QHW7";
        objectArray[33] = "\u007fU:\u0017N0$\u000f)L$5N\u00073\u0011\u001dh.P5\u001b^\n\u007fU:\u0017N0$\u000f)L$";
        objectArray[34] = "heGyB%b,\u001at<\nB\u001f5\u0002`AheGyB%b,\u001at";
        objectArray[35] = "TS!\u0017-EP]|\u0004Q\u0015o\u0006?\u0014!\u001c\u0006P0\u001c0";
        objectArray[36] = "7\tA\u0019<K0_Cf'Z0\u0015D\u001d\u0003G%\u000f8\b:_&\u000fU\u000fl]YS[\u0016$Ya\u0010@\u0014<&";
        objectArray[37] = "@\u0018$\u001fd?B\u0019'\b\n5)\t:\u0003unD\u000el\u0001";
        objectArray[38] = "Ea\u0016/,<G`\u00158B0,cU'<hT}\u00113";
        objectArray[39] = "{\u000fumsU/]m.\u0013\u0017k`r}(\u0017s\u0000%{\"T\u0011Z}'s\u0010o^x(/.";
        objectArray[40] = ";F[#3\u0018;\u0017Bt\rGoWK(au>\u0016\u0014u<\"lMR0mOk\u001bPO7C3K\u001513F<\u0017+";
        objectArray[41] = "-\t,2\u0012\u0016*_.M\u0013\u0000\u000e\n-1\u0003{\u007f\f%5\rC<\u0017'-r";
        objectArray[42] = "n\u0012:6sW8\u001d2'C[8\u00117!/ilPi|C\u00078\u001d;xy\u0007i\u0004lF";
        objectArray[43] = ".Fw>\u000e\u000e*H*-r^\u0015F}kK\u0005u\u0011{a\bg/I'0L\u0019+L(lr";
        objectArray[44] = "ww,o\tK,j/|u\u001d\u001c\u007f#p\u0007\u0019ci?nI' p1k\n\u001fck3su";
        objectArray[45] = "z\u0011\u0011+djlD\u0011~\u001aqrE\u0011\u0019&%$\u001di3!wkE\u0011-ec\u0015";
        objectArray[46] = "A%.\u007f\\\u000e\u0015w6<<J+!#i@\tGz>jS";
        Object[] objectArray2 = objectArray;
        objectArray[47] = "d;it=~0iq7]4\u000ee<m`o4>f~;";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'E' || c == 'N' || c == 'B' || c == 'k') {
                field = _6A.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'E' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _6A.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'K' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/krypton/6A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _6A.e(l2, l3);
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
                clazz3 = _6A.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _6A.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _6A.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _6A.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _6A.f(864550658005870L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _6A.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _6A.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _6A.f(864550658005870L, 0L);
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
            int n = _6A.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _6A.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _6A.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _6A.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _6A.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _6A.d(classArray2[j], string, clazz2, n, classArray);
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
        int n2 = _6A.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x2B17;
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
                throw new RuntimeException("dev/krypton/6A", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _6A.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/6A" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _6A.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _6A.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _6A.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _6A.c(clazz3, string2, clazz2)) != null) {
                    _6A.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _6A.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _6A.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _6A.f(864550658005870L, 0L);
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
    public void cfr_renamed_7(_6u_0 var1_1) {
        block38: {
            block39: {
                block36: {
                    block37: {
                        block34: {
                            block35: {
                                block32: {
                                    block33: {
                                        block30: {
                                            block31: {
                                                v0 = var2_2 = _6A.b ^ 138988520819652L;
                                                var4_3 = v0 ^ 68824855487291L;
                                                var6_4 = v0 ^ 41688071413372L;
                                                var8_5 = v0 ^ 15522398735399L;
                                                var10_6 = _32.cfr_renamed_4();
                                                try {
                                                    try {
                                                        v1 = _6A.c("E", (Object)this, (long)-4494450637576483381L, (long)var2_2);
                                                        if (var10_6 != 0) break block30;
                                                        if (_6A.c("E", (Object)v1, (long)-4490392559242565427L, (long)var2_2) != null) break block31;
                                                    }
                                                    catch (MatchException v2) {
                                                        throw _6A.a(v2);
                                                    }
                                                    return;
                                                }
                                                catch (MatchException v3) {
                                                    throw _6A.a(v3);
                                                }
                                            }
                                            v1 = _6A.c("E", (Object)this, (long)-4494450637576483381L, (long)var2_2);
                                        }
                                        try {
                                            v4 /* !! */  = _6A.c("E", (Object)v1, (long)-4490263328705161180L, (long)var2_2) instanceof class_408;
                                            if (var10_6 != 0) break block32;
                                            if (v4 /* !! */  == 0) break block33;
                                        }
                                        catch (MatchException v5) {
                                            throw _6A.a(v5);
                                        }
                                        return;
                                    }
                                    v4 /* !! */  = _6A.c("E", (Object)_6A.c("E", (Object)this, (long)-4494450637576483381L, (long)var2_2), (long)-4490263328705161180L, (long)var2_2) instanceof _9Z;
                                }
                                try {
                                    if (var10_6 != 0) break block34;
                                    if (v4 /* !! */  == 0) break block35;
                                }
                                catch (MatchException v6) {
                                    throw _6A.a(v6);
                                }
                                return;
                            }
                            v4 /* !! */  = _6A.c("E", (Object)_6A.c("E", (Object)this, (long)-4494450637576483381L, (long)var2_2), (long)-4490263328705161180L, (long)var2_2) instanceof _9M;
                        }
                        try {
                            if (var10_6 != 0) break block36;
                            if (v4 /* !! */  == 0) break block37;
                        }
                        catch (MatchException v7) {
                            throw _6A.a(v7);
                        }
                        return;
                    }
                    v4 /* !! */  = (int)_6A.c("K", (Object)_6A.c("E", (Object)this, (long)-4493493721494736638L, (long)var2_2), (long)var8_5, (long)-4493677368140605966L, (long)var2_2);
                }
                try {
                    try {
                        try {
                            if (var10_6 != 0) break block38;
                            if (v4 /* !! */  != 0) break block39;
                        }
                        catch (MatchException v8) {
                            throw _6A.a(v8);
                        }
                        if (_6A.c("E", (Object)_6A.c("E", (Object)this, (long)-4494450637576483381L, (long)var2_2), (long)-4490263328705161180L, (long)var2_2) == null) break block39;
                    }
                    catch (MatchException v9) {
                        throw _6A.a(v9);
                    }
                    return;
                }
                catch (MatchException v10) {
                    throw _6A.a(v10);
                }
            }
            v4 /* !! */  = var1_1.cfr_renamed_5;
        }
        try {
            if (v4 /* !! */  != 1) {
                return;
            }
        }
        catch (MatchException v11) {
            throw _6A.a(v11);
        }
        v12 = new Object[1];
        v12[0] = var4_3;
        var11_7 = _6A.c("K", (Object)_6A.c("K", (Object)_6A.c("E", (Object)this, (long)-4493540666124583655L, (long)var2_2), (Object)v12, (long)-4494455213493749477L, (long)var2_2), (long)-4490630249261103297L, (long)var2_2);
        while (_6A.c("K", (Object)var11_7, (long)-4490190465364277974L, (long)var2_2) != false) {
            block40: {
                var12_8 = (_8j)_6A.c("K", (Object)var11_7, (long)-4490123610679288064L, (long)var2_2);
                try {
                    try {
                        v13 = _6A.c("E", (Object)var12_8, (long)-4494038168191651532L, (long)var2_2);
                        v14 /* !! */  = _6A.c("K", (Object)var1_1.cfr_renamed_1, (long)-4493690477727247857L, (long)var2_2);
                        if (var10_6 != 0) break block40;
                        if (v13 == v14 /* !! */ ) {
                        }
                        ** GOTO lbl111
                    }
                    catch (MatchException v15) {
                        throw _6A.a(v15);
                    }
                    v13 = _6A.c("E", (Object)var12_8, (long)-4494038168191651532L, (long)var2_2);
                    v14 /* !! */  = (CallSite)-1;
                }
                catch (MatchException v16) {
                    throw _6A.a(v16);
                }
            }
            try {
                try {
                    if (v13 != v14 /* !! */ ) {
                        v17 = new Object[2];
                        v17[1] = _6A.c("E", (Object)var12_8, (long)-4494245275604493924L, (long)var2_2);
                        v17[0] = var6_4;
                        _6A.c("K", (Object)this, (Object)v17, (long)-4494116829561727970L, (long)var2_2);
                        if (var10_6 == 0) break;
                    }
                }
                catch (MatchException v18) {
                    throw _6A.a(v18);
                }
lbl111:
                // 2 sources

                if (var10_6 == 0) continue;
                break;
            }
            catch (MatchException v19) {
                throw _6A.a(v19);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_6A.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_6A.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

