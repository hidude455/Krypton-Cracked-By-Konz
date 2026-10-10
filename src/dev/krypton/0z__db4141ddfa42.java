/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8n;
import dev.krypton._95;
import dev.krypton._9i;
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
import net.minecraft.class_11909;

/*
 * Renamed from dev.krypton.0z
 */
public class _0z_0
extends _0v {
    private final _9i cfr_renamed_1;
    private final _8B cfr_renamed_4;
    private final _8B cfr_renamed_5;
    private final float cfr_renamed_9;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    public _0z_0(_4t t, char c, short s, _95 var4_4, int n, int n2) {
        long l2;
        long l3 = l2 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
        long l4 = l3 ^ 0x48F2B01E848FL;
        int n3 = (int)(l4 >>> 48);
        int n4 = (int)(l4 << 16 >>> 32);
        int n5 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x652A3CA7E3E2L;
        super((short)n3, t, var4_4, n, n4, (char)n5);
        this.cfr_renamed_4 = new _8B((int)_0z_0.c("v", 23043, (long)(0x44DF89EFE45FF83AL ^ l2)), l5, (int)_0z_0.c("v", 28342, (long)(0x2EE568D60A2DCC89L ^ l2)), (int)_0z_0.c("v", 26272, (long)(0x797EDA08FD1FC49BL ^ l2)));
        this.cfr_renamed_5 = new _8B((int)_0z_0.c("v", 19157, (long)(0x6D249CB87CB0E8EBL ^ l2)), l5, (int)_0z_0.c("v", 32028, (long)(0x66C4CB82CB665F24L ^ l2)), (int)_0z_0.c("v", 6994, (long)(0xAD6723BDCACB968L ^ l2)));
        this.cfr_renamed_9 = 4.0f;
        this.cfr_renamed_1 = (_9i)var4_4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _0z_0.a = l.a(411031519301247065L, 3036666265045523126L, MethodHandles.lookup().lookupClass()).a(22950028046976L);
                    _0z_0.n = new Object[46];
                    _0z_0.o = new String[46];
                    _0z_0.b();
                    _0z_0.e = new HashMap<K, V>(13);
                    var11 = _0z_0.a ^ 139455352467963L;
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
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u00b1\u0092\u00c6\u00a9y\u00b9+B\u00f9\u00e4f/7#t:\u0010]\u00c7\u00ca\u001cF\u0087\u0004\u00c9\u00a1\u00bcD`\u000fT\u00b5Z";
                    var19_6 = "\u00b1\u0092\u00c6\u00a9y\u00b9+B\u00f9\u00e4f/7#t:\u0010]\u00c7\u00ca\u001cF\u0087\u0004\u00c9\u00a1\u00bcD`\u000fT\u00b5Z".length();
                    var16_7 = 16;
                    var15_8 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = _0z_0.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                _0z_0.c = var20_3;
                _0z_0.d = new String[2];
                _0z_0.k = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "B\u00a3\u00a0k\u0001\u0093!PYi\u0014\u00a5l\u0007&\u00d6j\u00b2a.`\u0099:~\u00c9M\u00d2\u00c5\u001d\u00deoX\u00a2J\u00e0\u00a38\u00b0\u00e2b\u0005\u00d7\u00fd\u00de[\u00a9\u0090\u00e5";
                var5_15 = "B\u00a3\u00a0k\u0001\u0093!PYi\u0014\u00a5l\u0007&\u00d6j\u00b2a.`\u0099:~\u00c9M\u00d2\u00c5\u001d\u00deoX\u00a2J\u00e0\u00a38\u00b0\u00e2b\u0005\u00d7\u00fd\u00de[\u00a9\u0090\u00e5".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl61:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "Qc3\u00d7>q\u00f7\u00a8\u0004H\u00db\u00b54\u0080L\u0088";
                    var5_15 = "Qc3\u00d7>q\u00f7\u00a8\u0004H\u00db\u00b54\u0080L\u0088".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl87:
                // 1 sources

                ** continue;
            }
        }
        _0z_0.i = var6_12;
        _0z_0.j = new Integer[8];
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _0z_0.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 18;
            case 1 -> 54;
            case 2 -> 55;
            case 3 -> 23;
            case 4 -> 17;
            case 5 -> 62;
            case 6 -> 49;
            case 7 -> 9;
            case 8 -> 29;
            case 9 -> 19;
            case 10 -> 50;
            case 11 -> 52;
            case 12 -> 61;
            case 13 -> 44;
            case 14 -> 34;
            case 15 -> 51;
            case 16 -> 32;
            case 17 -> 13;
            case 18 -> 27;
            case 19 -> 2;
            case 20 -> 7;
            case 21 -> 39;
            case 22 -> 58;
            case 23 -> 3;
            case 24 -> 42;
            case 25 -> 16;
            case 26 -> 28;
            case 27 -> 46;
            case 28 -> 31;
            case 29 -> 45;
            case 30 -> 6;
            case 31 -> 22;
            case 32 -> 25;
            case 33 -> 35;
            case 34 -> 12;
            case 35 -> 5;
            case 36 -> 43;
            case 37 -> 11;
            case 38 -> 47;
            case 39 -> 60;
            case 40 -> 63;
            case 41 -> 57;
            case 42 -> 10;
            case 43 -> 1;
            case 44 -> 56;
            case 45 -> 4;
            case 46 -> 21;
            case 47 -> 0;
            case 48 -> 53;
            case 49 -> 36;
            case 50 -> 41;
            case 51 -> 24;
            case 52 -> 33;
            case 53 -> 48;
            case 54 -> 14;
            case 55 -> 26;
            case 56 -> 38;
            case 57 -> 37;
            case 58 -> 40;
            case 59 -> 15;
            case 60 -> 8;
            case 61 -> 30;
            case 62 -> 20;
            default -> 59;
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
        _0z_0.o[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == '\u00e9' || c == '\u00c0' || c == 'Y') {
                field = _0z_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0z_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0z_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "yr)G\u001b>dg+\u0006\u001eb-m";
        objectArray[1] = "c\u000esY&\u0019~\u001bq\u0018#E>\u0002";
        objectArray[2] = "8&[E{+8&L\u0019w$\"mL\u0007w1%\u001c\u001eZ/ro";
        objectArray[3] = Integer.TYPE;
        _0z_0.o[3] = "java/lang/Integer";
        objectArray[4] = "\u0007\n\u000bAj\u0019\u001a\u001f\t\u0000oES\u0019";
        objectArray[5] = "mA:-\u0013\u001d\u0018a1\"\u0002Ryo:)\u0006\b\r";
        objectArray[6] = Boolean.TYPE;
        _0z_0.o[6] = "java/lang/Boolean";
        objectArray[7] = Double.TYPE;
        _0z_0.o[7] = "java/lang/Double";
        objectArray[8] = "Y=\u001f3;FD(\u001dr>\u001a\u000f";
        objectArray[9] = "am9\u00118Dam.M4K{&.S4^|W~\u000ee";
        objectArray[10] = "PE\u000e$V4PE\u0019xZ;J\u000e\u0019fZ.M\u007fN9\f";
        objectArray[11] = Void.TYPE;
        _0z_0.o[11] = "java/lang/Void";
        objectArray[12] = "\u0005\fXI~?\u0018\u0019Z\b{cY^";
        objectArray[13] = "VdAe\u0010e#DJj\u0001*BJAa\u0005p6";
        objectArray[14] = ";bUy\u0016,&wW8\u0013pf2";
        objectArray[15] = "\u007fg1\\SC\nG:SB\fkI1XFV\u001f";
        objectArray[16] = "})\\\u00121%v&M]L=e!D\u0014";
        objectArray[17] = "vC^ 6\u0005\u0003cU/'Jbm^$#\u0010\u0016";
        objectArray[18] = ":[;z\fu'N9;\t)f|";
        objectArray[19] = "\u001alX?XgoLS0I(\u000eBX;Mrz";
        objectArray[20] = "#Mv\u0006g>Vm}\tvq7cv\u0002r+C";
        objectArray[21] = "b.8P\r'\u0017\u000e3_\u001chv\u00008T\u00182\u0002";
        objectArray[22] = "\u0006O\\|\u0018#soWs\tl\u0012a\\x\r6f";
        objectArray[23] = "\" \u0003%;!W\u0000\b**n6\u000e\u0003!.4B";
        objectArray[24] = "P5Fzl7%\u0015Mu}xD\u001bF~y\"0";
        objectArray[25] = "\\[)9=`WT8v\\n\\_<,";
        objectArray[26] = "TFCLGJ\rR\u0007\"\u0010)KDFS\u001c\u0011\u000e\u0013\u001b";
        objectArray[27] = "ql\u0015Xh,/~F\u001e\u0002l\"\u001cK\u001efn-uVAe2A,\u0010N}=,!BL?S";
        objectArray[28] = "o :S!_g=2\\M_;# F!micz\u001dp:l3/\u0019&Q0.<_M";
        objectArray[29] = "Yry@hsKna\r\u000270~<\u0018?fYcc\u001bc\nZ{\u007f\u0002>cT/f\u0001\u0002";
        objectArray[30] = "e&qt7  q,\u00050\u0018}w.8fq`(-d\n\"q'rna~l44\u0005";
        objectArray[31] = "s\t\nNOP*\u001dN \u00103\u007f\u0017]XBJs\tZ[";
        objectArray[32] = "dr[#\"\u000b:`\beHHTbZ>u\u0018=\u007f\u0005=)ths\u00015\"H8~\u0006gH";
        objectArray[33] = ";)\u0001<)(g:\u0007zS~\u00015\u0001fn(h(^e2D;9Q:8/g$B|S";
        objectArray[34] = "\u0016&i8\u001f\u001fJ5o~eN\u0017Z=t\f\u000bG#1j\u000b\b";
        objectArray[35] = "\u000f8`j7zS+f,M+5$`0pz\\9?3,\u0016\u000f(0l&}S5#*M";
        objectArray[36] = "\f0AFQ#P#G\u0000+r6,A\u001c\u0016#_1\u001e\u001fJO\n(\u001b\u0015\u00173Dr\u0011G+";
        objectArray[37] = "\u0006B\\-QNZQZk+\u001c<^\\w\u0016NUC\u0003tJ\"\u0006R\f+@IZO\u001fm+";
        objectArray[38] = "HFdN\u0001$@[lAm*\u0016\\fkQ~@\t\u001e\u0000\u001c%\u001eS\"P\u0011\"L9";
        objectArray[39] = "gP\u001a[\u0003-;C\u001c\u001dy}]\u0016I\nA*6JT\u0019\u0007";
        objectArray[40] = "\u0012i:y6]@t=(S\u0014t\u0018g|\"\u0012\u0016~6}4\u0011";
        objectArray[41] = "/\u001aje3u'\u0007bj_{q\u0000h@c/'T\u0010+.ty\u000f,{#s+e";
        objectArray[42] = "4\u001d&\nJwh\u000e L0$\u000e\u0001&P\rwg\u001cySQ\u001b4\rv\f[ph\u0010eJ0";
        objectArray[43] = "\u000ey\u0005]^hPkV\u001b4'>i\u0004@\t{Wt[CU\u0017\u0002x_K^+RuX\u00194";
        objectArray[44] = "\u000ek:\u0002v Rx<D\fv4|wUt'MpiRw";
        Object[] objectArray2 = objectArray;
        objectArray[45] = "^\u001e68\u000bx\u000f\u001f ;2{\r\r'`^IYL\u007f82!Q\f+\u007fKl^\u000f;\u0007\u0002%\u000f\u000e)j\u000fw\rLG";
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0z" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0z_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xE16;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])k.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0z", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0z_0.j[n2] = n3;
        }
        return j[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _0z_0.e(l2, l3);
        Object object = _0z_0.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0z_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0z_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0z_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0z_0.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0z_0.f(1770820911028007L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0z_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0z_0.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0z_0.f(1770820911028007L, 0L);
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
            int n = _0z_0.e(l2, l3);
            object = _0z_0.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _0z_0.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0z_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0z_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0z_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0z_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0z" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0z_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3EEA;
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
                throw new RuntimeException("dev/krypton/0z", exception);
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
            _0z_0.d[n2] = _0z_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _0z_0.e(l2, l3);
        Object object = _0z_0.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _0z_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0z_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0z_0.c(clazz3, string2, clazz2)) != null) {
                    _0z_0.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0z_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0z_0.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0z_0.f(1770820911028007L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0z_0 z_0;
        long l2;
        boolean bl;
        block7: {
            class_11909 class_119093;
            block8: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x16B548814B56L;
                int n = (int)(l5 >>> 48);
                long l6 = l5 << 16 >>> 16;
                long l7 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_3();
                try {
                    try {
                        try {
                            z_0 = this;
                            class_119092 = class_119093;
                            if (!bl2) break block7;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l7;
                            objectArray2[1] = (double)_0z_0.e("\u00c4", (Object)class_119093, 5514144898508251543L, (long)l3);
                            objectArray2[0] = (double)_0z_0.e("\u00c4", (Object)class_119092, 5514047550212932494L, (long)l3);
                            if (_0z_0.e("\u00c4", (Object)z_0, (Object)objectArray2, 5513903757820570856L, (long)l3) == false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _0z_0.a(matchException);
                        }
                        if (_0z_0.e("\u00c4", (Object)class_119093, 5515629979207119204L, (long)l3) == false) {
                        }
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw _0z_0.a(matchException);
                    }
                    _0z_0.e("\u00c4", (Object)_0z_0.e("\u00c0", 5514201845632760506L, (long)l3), (Object)new _8n((short)n, l6, (_9i)((Object)_0z_0.e("f", (Object)this, 5515491631947983560L, (long)l3))), 5514389364400991376L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0z_0.a(matchException);
                }
            }
            z_0 = this;
            class_119092 = class_119093;
        }
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = bl;
        objectArray3[0] = class_119092;
        super.void_6(objectArray3);
    }

    @Override
    protected void void_8(Object[] objectArray) {
        String string;
        CallSite callSite;
        _87 var7_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x538DF2D376DEL;
        long l6 = l3 ^ 0x764D0226F048L;
        long l7 = l3 ^ 0x570C24C53811L;
        long l8 = l3 ^ 0x16D0603ED0FFL;
        long l9 = l3 ^ 0x7F2CE5EAB728L;
        long l10 = l3 ^ 0x1975C4755298L;
        long l11 = l3 ^ 0x4A7C3F174665L;
        long l12 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        reference var26_16 = _0z_0.e("\u00c4", (Object)this, (Object)objectArray2, 7739845181231237802L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l11;
        reference var27_17 = _0z_0.e("\u00c4", (Object)this, (Object)objectArray3, 7740196559491925718L, (long)l2) + _0z_0.e("\u00c4", (Object)this, (Object)objectArray4, 7739576343738257415L, (long)l2) + _0z_0.e("f", (Object)this, 7739969490865349130L, (long)l2) + _0z_0.c("v", 14152, (long)(0x23FC8B658E16D239L ^ l2));
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l12;
        CallSite callSite2 = _0z_0.e("\u00c4", (Object)_0z_0.e("f", (Object)this, 7739067066534268196L, (long)l2), (Object)objectArray5, 7739234718784355192L, (long)l2);
        String string2 = (String)((Object)callSite2) + ":";
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = _0z_0.e("\u00c0", 7740286191294745569L, (long)l2);
        objectArray6[3] = (double)var27_17;
        objectArray6[2] = (double)var26_16;
        objectArray6[1] = string2;
        objectArray6[0] = l7;
        _0z_0.e("\u00c4", (Object)var7_2, (Object)objectArray6, 7739447993708909263L, (long)l2);
        String string3 = (String)((Object)callSite2) + (String)((Object)_0z_0.a("z", 8916, (long)(0x3366BF3BAB58F75EL ^ l2)));
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l6;
        objectArray7[0] = string3;
        double d = (double)var26_16 + _0z_0.e("\u00c4", (Object)var7_2, (Object)objectArray7, 7740210203870807645L, (long)l2) + 5.0;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l8;
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l5;
        int n3 = (int)((double)_0z_0.e("\u00c4", (Object)this, (Object)objectArray8, 7739674483035373901L, (long)l2) - d + (double)_0z_0.e("\u00c4", (Object)this, (Object)objectArray9, 7739845181231237802L, (long)l2) - 5.0);
        reference var34_23 = var27_17 - 2;
        CallSite callSite3 = _0z_0.c("v", 5895, (long)(0x4CF53902CDFA7277L ^ l2));
        try {
            Object[] objectArray10 = new Object[10];
            objectArray10[9] = 4.0;
            objectArray10[8] = 4.0;
            objectArray10[7] = 4.0;
            objectArray10[6] = 4.0;
            objectArray10[5] = l9;
            objectArray10[4] = (double)(var34_23 + callSite3);
            objectArray10[3] = d + (double)n3;
            objectArray10[2] = (double)var34_23;
            objectArray10[1] = d;
            objectArray10[0] = _0z_0.e("f", (Object)this, 7739401788594733963L, (long)l2);
            _0z_0.e("\u00c4", (Object)var7_2, (Object)objectArray10, 7739095861736065526L, (long)l2);
            Object[] objectArray11 = new Object[1];
            objectArray11[0] = l10;
            callSite = _0z_0.e("\u00c4", (Object)_0z_0.e("f", (Object)this, 7739067066534268196L, (long)l2), (Object)objectArray11, 7739344342825792479L, (long)l2);
            Object[] objectArray12 = new Object[1];
            objectArray12[0] = l10;
            string = _0z_0.e("\u00c4", (Object)_0z_0.e("f", (Object)this, 7739067066534268196L, (long)l2), (Object)objectArray12, 7739344342825792479L, (long)l2) != true ? "s" : "";
        }
        catch (MatchException matchException) {
            throw _0z_0.a(matchException);
        }
        String string4 = (int)callSite + (String)((Object)_0z_0.a("z", 21011, (long)(0x17CDE21634FD0798L ^ l2))) + string;
        Object[] objectArray13 = new Object[5];
        objectArray13[4] = _0z_0.e("f", (Object)this, 7739611881490764005L, (long)l2);
        objectArray13[3] = (double)(var34_23 + 3);
        objectArray13[2] = d + 4.0;
        objectArray13[1] = string4;
        objectArray13[0] = l7;
        _0z_0.e("\u00c4", (Object)var7_2, (Object)objectArray13, 7739447993708909263L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0z_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0z_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0z_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

