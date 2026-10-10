/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._3i_0;
import dev.krypton._4o_0;
import dev.krypton._4r;
import dev.krypton._6e_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._95;
import dev.krypton._9E;
import dev.krypton._9k_0;
import dev.krypton._9o;
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
 * Renamed from dev.krypton.5g
 */
public class _5g_0
extends _6x_0 {
    private final _9k_0 cfr_renamed_9;
    private final _9E cfr_renamed_1;
    private final _6e_0 cfr_renamed_7;
    private int cfr_renamed_6;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    public _5g_0(char c, int n, int n2) {
        long l2;
        long l3 = l2 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        long l4 = l3 ^ 0x5AF387FD6141L;
        long l5 = l3 ^ 0x44B942F7548EL;
        long l6 = l3 ^ 0x1F92879CB122L;
        long l7 = l3 ^ 0x5B79D1D3BBFCL;
        long l8 = l3 ^ 0x4EDB01189B8L;
        super((int)_5g_0.c("f", 28173, (long)(0x75290056D48AE933L ^ l2)), -1, (_4r)((Object)_5g_0.d("\u00fe", -170232963784049775L, (long)l2)), l5);
        this.cfr_renamed_9 = new _9k_0((int)_5g_0.c("f", 28800, (long)(0x4DFF856911CFF7BFL ^ l2)), 1.0, 80.0, 1.0, 10.0, l6, 30.0);
        this.cfr_renamed_1 = new _9E((int)_5g_0.c("f", 20266, (long)(0x3AF585A65412C816L ^ l2)), l4, (Enum)((Object)_5g_0.d("\u00fe", -170094377312336975L, (long)l2)), _4o_0.class);
        this.cfr_renamed_7 = new _6e_0((int)_5g_0.c("f", 16102, (long)(0x4F5F50F1030CB9DBL ^ l2)), l8, (String)((Object)_5g_0.a("r", 6665, (long)(0x5DDB299B016B5E82L ^ l2))));
        Object[] objectArray = new Object[2];
        objectArray[1] = new _95[]{_5g_0.d("\u00ca", (Object)this, -170368299932873007L, (long)l2), _5g_0.d("\u00ca", (Object)this, -167410663797680465L, (long)l2), _5g_0.d("\u00ca", (Object)this, -170904264448538317L, (long)l2)};
        objectArray[0] = l7;
        _5g_0.d("\u00e5", (Object)this, (Object)objectArray, -167391484948057390L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _5g_0.b = dev.krypton.l.a(7610326212003309143L, 6574322437534651795L, MethodHandles.lookup().lookupClass()).a(265511228357006L);
                    _5g_0.m = new Object[34];
                    _5g_0.n = new String[34];
                    _5g_0.b();
                    _5g_0.f = new HashMap<K, V>(13);
                    var11 = _5g_0.b ^ 50788553265162L;
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
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "2\u00b2p\u0084dx1\u00a4\u001c,\u00d6\u0092pfP< \u00d4r-\u00ba\u00fb\u000f\u0007r\f\u0090\u00c2\u00d8\u0015\u00a93\u00d6\u0010\u009a~o\u00ce\u009d\u00d32\u0085\r$w\u00dctB\u00f6 U\u00ed\u00da\u00ff\u000bN\u00ca\u00e5\u00c8\u008f\u0016\u00b5\u0013\u001a\u00d4$pI\u00ba\u00b9n\u008b\u00dd\u000f\u0092\u001e\u00ec]e2\u0082v";
                    var19_6 = "2\u00b2p\u0084dx1\u00a4\u001c,\u00d6\u0092pfP< \u00d4r-\u00ba\u00fb\u000f\u0007r\f\u0090\u00c2\u00d8\u0015\u00a93\u00d6\u0010\u009a~o\u00ce\u009d\u00d32\u0085\r$w\u00dctB\u00f6 U\u00ed\u00da\u00ff\u000bN\u00ca\u00e5\u00c8\u008f\u0016\u00b5\u0013\u001a\u00d4$pI\u00ba\u00b9n\u008b\u00dd\u000f\u0092\u001e\u00ec]e2\u0082v".length();
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
                        var20_3[var18_4++] = _5g_0.b(var21_9).intern();
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
                _5g_0.d = var20_3;
                _5g_0.e = new String[3];
                _5g_0.l = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u0080:}\u00bf#\u0012\u0001\u00ddP\n\n`$zd\u00ce";
                var5_15 = "\u0080:}\u00bf#\u0012\u0001\u00ddP\n\n`$zd\u00ce".length();
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
                    var4_14 = "\u00e1)\u00d4&\u0016\u00c3\u00fe\u001b\u00c7c@K\u0091\u009c\u00c7\u00bb";
                    var5_15 = "\u00e1)\u00d4&\u0016\u00c3\u00fe\u001b\u00c7c@K\u0091\u009c\u00c7\u00bb".length();
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
        _5g_0.j = var6_12;
        _5g_0.k = new Integer[4];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5g_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 0;
            case 2 -> 52;
            case 3 -> 22;
            case 4 -> 37;
            case 5 -> 32;
            case 6 -> 14;
            case 7 -> 39;
            case 8 -> 13;
            case 9 -> 63;
            case 10 -> 48;
            case 11 -> 44;
            case 12 -> 36;
            case 13 -> 59;
            case 14 -> 42;
            case 15 -> 18;
            case 16 -> 24;
            case 17 -> 11;
            case 18 -> 28;
            case 19 -> 46;
            case 20 -> 60;
            case 21 -> 30;
            case 22 -> 49;
            case 23 -> 29;
            case 24 -> 15;
            case 25 -> 19;
            case 26 -> 35;
            case 27 -> 12;
            case 28 -> 55;
            case 29 -> 1;
            case 30 -> 4;
            case 31 -> 21;
            case 32 -> 10;
            case 33 -> 3;
            case 34 -> 9;
            case 35 -> 61;
            case 36 -> 17;
            case 37 -> 58;
            case 38 -> 6;
            case 39 -> 53;
            case 40 -> 20;
            case 41 -> 7;
            case 42 -> 16;
            case 43 -> 34;
            case 44 -> 31;
            case 45 -> 5;
            case 46 -> 62;
            case 47 -> 56;
            case 48 -> 40;
            case 49 -> 26;
            case 50 -> 2;
            case 51 -> 57;
            case 52 -> 43;
            case 53 -> 54;
            case 54 -> 8;
            case 55 -> 27;
            case 56 -> 45;
            case 57 -> 25;
            case 58 -> 50;
            case 59 -> 38;
            case 60 -> 47;
            case 61 -> 51;
            case 62 -> 33;
            default -> 41;
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
        _5g_0.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 'X' || c == '\u00fe' || c == '\u00c6') {
                field = _5g_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5g_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5g_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static void b() {
        Object[] objectArray = m;
        m[0] = "G\u0013D{-\u001cZ\u0006F:(@\u0017\u0019";
        objectArray[1] = "`Y\u000eCLskV\u001f\f-}`]\u001bV";
        objectArray[2] = Boolean.TYPE;
        _5g_0.n[2] = "java/lang/Boolean";
        objectArray[3] = "\u0007 !\u0003yA\u001a5#B|\u001dZ\u0000";
        objectArray[4] = "\u0017@\u0014Fdtb`\u001fIu;\u0003n\u0014Bqaw";
        objectArray[5] = "H#Qk \u0007C,@$K\u0005W/";
        objectArray[6] = "Q\t$\u0010lbL\u001c&Qi>\u0000\u000b";
        objectArray[7] = "\u0010\fn(^(\r\u0019li[tB\f";
        objectArray[8] = "C/4\u0003\u0002\u000e6\u000f?\f\u0013AW\u00014\u0007\u0017\u001b#";
        objectArray[9] = "\u007fMQ6\u007f]tB@y\u0002EgEI0";
        objectArray[10] = "MNZ\"\b\u001fMNM~\u0004\u0010W\u0005M`\u0004\u0005Pt\u0018?Q";
        objectArray[11] = Void.TYPE;
        _5g_0.n[11] = "java/lang/Void";
        objectArray[12] = "Z]:\u001a\u0013/GH8[\u0016s\b@";
        objectArray[13] = ";Ds<{k;Dd`wd!\u000fd~wq&~4#&";
        objectArray[14] = "\u001cg&\u001b3D\u0001r$Z6\u0018Ai";
        objectArray[15] = "N4\u0002b(~;\u0014\tm91Z\u001a\u0002f=k.";
        objectArray[16] = Integer.TYPE;
        _5g_0.n[16] = "java/lang/Integer";
        objectArray[17] = "~\u0007]o\n%c\u0012_.\u000fy.\u0010";
        objectArray[18] = "T\u0016R\u0000:y!6Y\u000f+6@8R\u0004/l4";
        objectArray[19] = "WXu\u000fY9FTK6\u001d0/@+T\u0000eOQ'";
        objectArray[20] = "t\u001c?SS\u001be\u0010\u0001[\u0016\u0006e\u0018z6VE`CmDREmG\u0001\u000f\t\u0004h\u0010k\u0007_\tk|";
        objectArray[21] = "\u0014b\u0016\u0004@q\u001f:\u001c\u0002,..h\u0014\u001a\u001d%K<\f\u001bP\u001f\u0012;\u0010\u0004Q$OnH\u0003,";
        objectArray[22] = "\u0013\b\u0015;\u0011w\u001fC\u001edk$/\u0004\u001e;\u0010(_\\Gf\u0014";
        objectArray[23] = "W\u001bpCV+\u000fB-Gfgj\u0019s\\Wa\u000fMk]\u001a[T\u001co\u0003\u001agVMv@f";
        objectArray[24] = "`\u0005F5YDo\u0001D5b\\2BO0\u000enc\u0003\u0010lZ9aPVl\u001e\u0005c\u0001O/b\tc\u000eT0\rP:^VW";
        objectArray[25] = "\u000e\u001ec\u0004C|U^f\\\u007fR$\u007fB;\u0014-\u000f\u001b5POm\nC";
        objectArray[26] = ".\u001e\u0010:s\u0017aDL!\u001d\u0017\u001eK\u0014!eEu\u001fK2q";
        objectArray[27] = "g\u001b\u000f\u0006g\u0003v\u00171?#\n\u007f\u0016K\u000e[\u001b\u007fET_;\ns";
        objectArray[28] = "6:\fMeDd=\u0001\u0018\\\u0017\u0007,\u000bGm\u0010bx\u0013F *m!^R6GwwT\u0012\\";
        objectArray[29] = "aAS'l0m\nXx\u0016d]\u001aWqg50\u0000\u0001{'";
        objectArray[30] = "Cwd\u0013(]\u0017(w\u0007CS\u001fkn\f/aK*0QC\tI~lP>\u0006M|lk";
        objectArray[31] = "D\u0001E\u0000E\"HJN_?|x\nF\u0001E!\u0016\u0001\u001e\u000bC";
        objectArray[32] = "077\u0011xF\u007fmk\n\u0016F\u000086\u0004'Eel.\u0005j\u007f0oc\u001bq\u0010i63\u0019\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[33] = "i&\u001c\u0014'nem\u0017K]>U&\u0003\u001038;t\u0004\u001df";
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5g_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7A9B;
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
                throw new RuntimeException("dev/krypton/5g", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5g_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _5g_0.e(l2, l3);
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
                String string2 = _5g_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5g_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5g_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5g_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5g_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5g_0.f(119521432811307L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5g_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5g_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5g_0.f(119521432811307L, 0L);
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
            int n = _5g_0.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5g_0.m[n] = clazz = Class.forName(_5g_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5g_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5g_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5g_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5g_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("dev/krypton/5g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5g_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x392C;
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
                throw new RuntimeException("dev/krypton/5g", exception);
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
            _5g_0.e[n2] = _5g_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _5g_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5g_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5g_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5g_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5g_0.c(clazz3, string2, clazz2)) != null) {
                    _5g_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5g_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5g_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5g_0.f(119521432811307L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_4(_9o o) {
        CallSite callSite;
        CallSite callSite2;
        _5g_0 g_0;
        long l2;
        long l3;
        long l4;
        long l5;
        block6: {
            block7: {
                long l6 = l5 = b ^ 0x78390AAA6793L;
                l4 = l6 ^ 0x753352027599L;
                l3 = l6 ^ 0x777C14AC5180L;
                l2 = l6 ^ 0x2A5B4B1EC6EEL;
                int n = _7C.cfr_renamed_3();
                try {
                    try {
                        g_0 = this;
                        if (n != 0) break block6;
                        if (_5g_0.d("\u00ca", (Object)g_0, 6179862631957912092L, (long)l5) <= 0) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _5g_0.a(matchException);
                    }
                    _5g_0 g_02 = this;
                    _5g_0.d("X", (Object)g_02, (int)(_5g_0.d("\u00ca", (Object)g_02, 6179862631957912092L, (long)l5) - true), 6179862631957912092L, (long)l5);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5g_0.a(matchException);
                }
            }
            g_0 = this;
        }
        try {
            callSite2 = _5g_0.d("\u00e5", (Object)_5g_0.d("\u00ca", (Object)g_0, 6179684167795546216L, (long)l5), 6179957484766149142L, (long)l5);
            Object[] objectArray = new Object[1];
            objectArray[0] = l2;
            callSite = _5g_0.d("\u00e5", (Object)((Object)((_4o_0)((Object)_5g_0.d("\u00e5", (Object)_5g_0.d("\u00ca", (Object)this, 6180009731828623024L, (long)l5), (Object)objectArray, 6179355870692704870L, (long)l5)))), (Object)_5g_0.d("\u00fe", 6179198656145398200L, (long)l5), 6179284771260261943L, (long)l5) != false ? _5g_0.a("r", 15429, (long)(0x6DFBAC55EE11D0ADL ^ l5)) : _5g_0.a("r", 5142, (long)(0x24D00246B21A78FFL ^ l5));
        }
        catch (MatchException matchException) {
            throw _5g_0.a(matchException);
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        _5g_0.d("\u00e5", (Object)callSite2, (Object)((String)((Object)callSite) + (String)((Object)_5g_0.d("\u00e5", (Object)_5g_0.d("\u00ca", (Object)this, 6179404394965737810L, (long)l5), (Object)objectArray, 6179434293168381496L, (long)l5))), 6179563618190401781L, (long)l5);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _5g_0.d("X", (Object)this, (int)_5g_0.d("\u00e5", (Object)_5g_0.d("\u00ca", (Object)this, 6182395655636631246L, (long)l5), (Object)objectArray2, 6179810142874754085L, (long)l5), 6179862631957912092L, (long)l5);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5g_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5g_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5g_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

