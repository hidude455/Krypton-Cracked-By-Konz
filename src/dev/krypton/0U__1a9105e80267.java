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
import dev.krypton._6X;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._8j_0;
import dev.krypton._95;
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

public class _0U
extends _0v {
    private final _6X cfr_renamed_4;
    private final _8B cfr_renamed_1;
    private final float cfr_renamed_9;
    private final int cfr_renamed_8;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    public _0U(long l2, _4t t, _95 var4_3, int n) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x4E279AE89FD0L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x63FF1651F8BDL;
        super((short)n2, t, var4_3, n, n3, (char)n4);
        this.cfr_renamed_1 = new _8B((int)_0U.c("h", 12712, (long)(0xF4AF175EDB037AAL ^ l2)), l5, (int)_0U.c("h", 24964, (long)(0x61CA9BD05DF7E780L ^ l2)), (int)_0U.c("h", 19062, (long)(0x5C1832CE825B4C78L ^ l2)));
        this.cfr_renamed_9 = 4.0f;
        this.cfr_renamed_8 = (int)_0U.c("h", 10779, (long)(0x70BBF4EAA3F62C1EL ^ l2));
        this.cfr_renamed_4 = (_6X)var4_3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _0U.a = l.a(2332733933927710932L, 874053760748412155L, MethodHandles.lookup().lookupClass()).a(236534964823796L);
                        _0U.n = new Object[57];
                        _0U.o = new String[57];
                        _0U.b();
                        _0U.e = new HashMap<K, V>(13);
                        var11 = _0U.a ^ 85195390322828L;
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u00b3\u00d4\u0011\u00fd\u001b\b\u00c9#y\u00dbUL\u008c\u00b8\u008d[\u0010U\u007f\u0093\u00ee<\u008a\u00c1\u00b72\u00c5q\u0004\u008b\u00b1b\t";
                        var19_6 = "\u00b3\u00d4\u0011\u00fd\u001b\b\u00c9#y\u00dbUL\u008c\u00b8\u008d[\u0010U\u007f\u0093\u00ee<\u008a\u00c1\u00b72\u00c5q\u0004\u008b\u00b1b\t".length();
                        var16_7 = 16;
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
                            var20_3[var18_4++] = _0U.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00a9\u0086\u0011\u00e4\u00e2\u00c8\u00cc\u0087\u001f\u00ca\u00897r\u00db\u008c\u00a6\u0010/\u0015\u00edE\u00b4\u0006\u00001\u0083\u00a3-q\u00ea\u00b3\u0083s";
                            var19_6 = "\u00a9\u0086\u0011\u00e4\u00e2\u00c8\u00cc\u0087\u001f\u00ca\u00897r\u00db\u008c\u00a6\u0010/\u0015\u00edE\u00b4\u0006\u00001\u0083\u00a3-q\u00ea\u00b3\u0083s".length();
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
                            var20_3[var18_4++] = _0U.a(var21_9).intern();
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
                _0U.c = var20_3;
                _0U.d = new String[4];
                _0U.k = new HashMap<K, V>(13);
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
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u0006\u0091\u008f\u00e4\u00bf\u00ca0\u00e6\u00b9@\u0090\u00d0\u00bf4y\u00b7\u00e7\u00bd\u0097\u00bc\u00fd\u00ed\u00ce\u00bd\u00d6/\u0004\u00b6[6\u00ea?\u008c\u00e9\u000eo\u0087b\u00eb\u00fe\u0019\u00a5Yn\u008aw\u00e7-\u00b8\u00f1\u00dd\u00fd]&\u009aK";
                var5_15 = "\u0006\u0091\u008f\u00e4\u00bf\u00ca0\u00e6\u00b9@\u0090\u00d0\u00bf4y\u00b7\u00e7\u00bd\u0097\u00bc\u00fd\u00ed\u00ce\u00bd\u00d6/\u0004\u00b6[6\u00ea?\u008c\u00e9\u000eo\u0087b\u00eb\u00fe\u0019\u00a5Yn\u008aw\u00e7-\u00b8\u00f1\u00dd\u00fd]&\u009aK".length();
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
lbl81:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00e3\u00c6\u00cc\u00fe\u00e7e\u0019a\u0017\u00e7\u0012,\u00e1\u00f3\u00cc-";
                    var5_15 = "\u00e3\u00c6\u00cc\u00fe\u00e7e\u0019a\u0017\u00e7\u0012,\u00e1\u00f3\u00cc-".length();
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
lbl94:
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
lbl107:
                // 1 sources

                ** continue;
            }
        }
        _0U.i = var6_12;
        _0U.j = new Integer[9];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _0U.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 26;
            case 1 -> 1;
            case 2 -> 12;
            case 3 -> 51;
            case 4 -> 10;
            case 5 -> 61;
            case 6 -> 40;
            case 7 -> 29;
            case 8 -> 27;
            case 9 -> 16;
            case 10 -> 32;
            case 11 -> 63;
            case 12 -> 45;
            case 13 -> 23;
            case 14 -> 38;
            case 15 -> 13;
            case 16 -> 37;
            case 17 -> 6;
            case 18 -> 48;
            case 19 -> 0;
            case 20 -> 34;
            case 21 -> 39;
            case 22 -> 15;
            case 23 -> 18;
            case 24 -> 9;
            case 25 -> 17;
            case 26 -> 44;
            case 27 -> 58;
            case 28 -> 28;
            case 29 -> 47;
            case 30 -> 24;
            case 31 -> 20;
            case 32 -> 57;
            case 33 -> 21;
            case 34 -> 43;
            case 35 -> 30;
            case 36 -> 19;
            case 37 -> 3;
            case 38 -> 7;
            case 39 -> 4;
            case 40 -> 31;
            case 41 -> 55;
            case 42 -> 36;
            case 43 -> 8;
            case 44 -> 50;
            case 45 -> 14;
            case 46 -> 52;
            case 47 -> 11;
            case 48 -> 41;
            case 49 -> 56;
            case 50 -> 33;
            case 51 -> 42;
            case 52 -> 35;
            case 53 -> 5;
            case 54 -> 46;
            case 55 -> 2;
            case 56 -> 62;
            case 57 -> 60;
            case 58 -> 53;
            case 59 -> 59;
            case 60 -> 25;
            case 61 -> 49;
            case 62 -> 22;
            default -> 54;
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
        _0U.o[n3] = new String(cArray);
        return n3;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d9' || c == '\u00c1' || c == 'C' || c == '\u00ca') {
                field = _0U.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0U.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0U.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "7\u0012y\u007f\u0004a*\u0007{>\u0001=k@";
        objectArray[1] = "}\u00104`b[\b0?os\u0014i>4dwN\u001d";
        objectArray[2] = Void.TYPE;
        _0U.o[2] = "java/lang/Void";
        objectArray[3] = "\u0000J$\u0002Q\u0001\u001d_&CT]]\u001a";
        objectArray[4] = "\u001d\u000e\u001ac#~h.\u0011l21\t \u001ag6k}";
        objectArray[5] = "\u0005\u001cPsuL\u000e\u0013A<\bT\u001d\u0014Hu";
        objectArray[6] = "shdYhJn}f\u0018m\u0016'X";
        objectArray[7] = "=OWr\tE ZU3\f\u0019or";
        objectArray[8] = "Sw\u0012ng'&W\u0019avhGY\u0012jr23";
        objectArray[9] = "E\u001cen]OX\tg/X\u0013\u0019;";
        objectArray[10] = "qp\u001azTy\u0004P\u0011uE6e^\u001a~Al\u0011";
        objectArray[11] = Double.TYPE;
        _0U.o[11] = "java/lang/Double";
        objectArray[12] = "(US1<V5@Qp9\n|F";
        objectArray[13] = "/f,\u001e^\u0003ZF'\u0011OL;H,\u001aK\u0016O";
        objectArray[14] = Integer.TYPE;
        _0U.o[14] = "java/lang/Integer";
        objectArray[15] = "9n5:r\u0005LN>5cJ-@5>g\u0010Y";
        objectArray[16] = "\u0002@^\u000byTw`U\u0004h\u001b\u0016n^\u000flAb";
        objectArray[17] = "}FxNQt\bfsA@;ihxJDa\u001d";
        objectArray[18] = "qA\u0019izU\u0004a\u0012fk\u001aeo\u0019mo@\u0011";
        objectArray[19] = "h*?ZwQh*(\u0006{^ra(\u0018{Ku\u0010zE#\b?";
        objectArray[20] = "\u001f/U|\u0013\u0000j\u000f^s\u0002O\u000b\u0001Ux\u0006\u0015\u007f";
        objectArray[21] = Boolean.TYPE;
        _0U.o[21] = "java/lang/Boolean";
        objectArray[22] = "M@kv\u0004}PUi7\u0001!\u001b";
        objectArray[23] = "0%8UX\u00110%/\tT\u001e*n/\u0017T\u000b-\u001f\u007fJ\u0005";
        objectArray[24] = "?\"[WD\u0001?\"L\u000bH\u000e%iL\u0015H\u001b\"\u0018\u001bJ\u001e";
        objectArray[25] = "#+\u0006\u0000BwV\u000b\r\u000fS87\u0005\u0006\u0004WbC";
        objectArray[26] = ":l`Ov\u0016$dz\u0000\u0014\n#y";
        objectArray[27] = "]\u0014n6Q!V\u001b\u007fy<%V\u0007K2\u000e8R\u001b{2";
        objectArray[28] = "i\b\u0019HY)b\u0007\b\u0007>1f\u001b\u000eK\u001b ";
        objectArray[29] = "\u0011p\u0007w\u0001\u0006\u001a\u007f\u00168`\b\u0011t\u0012b";
        objectArray[30] = "\u000bq{v)\u000f\u0004&pqH\u0018\n<y/$*X|#tu}V1sx&\r^+a3H";
        objectArray[31] = "[D#9!P\u0002\n`~E\u0004gVy'5@\u0018[q3};\u0006[z$\"F^\bn/E";
        objectArray[32] = "n8 a\u001a|?g0`v}Rh0c\u0015t=7#sJ";
        objectArray[33] = "\u0005\r\u0002A\u001eY]^\u0016JyK\t\u001cd\u0016\bNT\u000e\u0014\u001e\u0012\\\u001f`\u0007L\u0004I_P\u001cL\u0019@d";
        objectArray[34] = "\n(;\u0002=G_;;\u000bYE\\?8\u00129!\u0000(=^7Q\b2/\u0015Y";
        objectArray[35] = ",]8\u0004\u0019\u007fpE']\u007f&\u001cF8^\u000f`cK0JG\u001b-W7\u000b\u0011k%M%@\u007f";
        objectArray[36] = "gn\u000blZ{;v\u00145<!Wu\u000b6Ld(x\u0003\"\u0004\u001ffd\u0004cRon~\u0016(<";
        objectArray[37] = "*!\\a%jv9C8C1\u001a:\\;3ue7T/{\u000e++Sn-~#1A%C";
        objectArray[38] = "[j\u0005U\u001fR\u00039\u0011^xT[u\u000e3I^P7\rCADB|c";
        objectArray[39] = "?|\u00002mGoz\u0002`\u000eG=kZdbui*\u0002<\u000eBkrT{bB yA\u00037]k-Qft\\ln:";
        objectArray[40] = "JvFwR}\u0012%R|5aPVEiIq+vR \u000bqZk\u001czT\u0000";
        objectArray[41] = "!\\7\u0010u7&\u0018kh2,@D6\r}4?I>\u00195Oy[hRf*:Zo\u0011\r";
        objectArray[42] = "\u00106\u001d\u0003\u000bSE%\u001d\noNV-\n\u0013\u0015TM(q^\u001e_\u001b)\u0001V\u0004MPG@\u001e\u0005\u0005E7H\u0004\u0017N+|\u0000\u0003\u0003QM)\u0013\u0003\n5";
        objectArray[43] = "\u001d\\%A\u0005/XCvHx+'Z,\u001d\bmXW$\t@\u0016\u001cK%\u0014\u001cpIX%\u001dx";
        objectArray[44] = "[Ej5Q?\n\u001az4=7g\u0017tqFk\fN:2\u0001";
        objectArray[45] = ";8D+5bjgT*Yj\u00076M5))x;E!aR<'D<=4i4D5Y";
        objectArray[46] = "@z:ud2\u0015i:|\u00006\u001cj0\u0019a/\u00166&aa5\u0018oV{}:\u0000llt1%\u0017\u000bmhl8\u001fm8{l1{";
        objectArray[47] = "RH)\u00104ZU\fuhp\"SU(\u00187]^]<PL\u0012\u000bJv\u0001tYV[?h";
        objectArray[48] = "0\u001bQl:7l\u0003N5\\i\u0000\u0000Q6,(\u007f\rY\"dS1\u0011^c2#9\u000bL(\\";
        objectArray[49] = "b\b\u0019\r\u001f]>\u0010\u0006Ty\u0004isBN\u0000Zj\u001c\u001d]\u0010\u0005";
        objectArray[50] = ">:~.\u0000.b\"awfw\u000e!~t\u00161q,v`^Jc3*/\u0017;~}ppf";
        objectArray[51] = "\b*Ie\u0018I\u0007}BbyP\u0003~S\fE\u0004U++kAA_r\u0013 \u001cP\u0016\u001b";
        objectArray[52] = "lo]r<E0wB+Z\u001d\\%I'jO,-S5!";
        objectArray[53] = "u}\\\"O#yc\\b!$@\u0018\u000ft\u001b,x}_r\u0019~";
        objectArray[54] = "x^X\u001an5w\tS\u001d\u000f,s\nBs3x%^:\u00147=/\u0006\u0002_j,fo";
        objectArray[55] = "\u0012hGy\u0005\u0010\u0015,\u001b\u0001Mh\u0013uFq\u0006\u0017\u001e}R9}XKj\u0018hE\u0013\u0016{Q\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[56] = "\u001f\u001b\u001eGm\u001bC\u0003\u0001\u001e\u000bE/^\u0007\u0001hG@\u0001\u0014\u00117";
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0U.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0U" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3174;
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
                throw new RuntimeException("dev/krypton/0U", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0U.j[n2] = n3;
        }
        return j[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _0U.e(l2, l3);
        Object object = _0U.n[n];
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
                clazz3 = _0U.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0U.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0U.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0U.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0U.f(2067434048151417L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0U.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0U.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0U.f(2067434048151417L, 0L);
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
            int n = _0U.e(l2, l3);
            object = _0U.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _0U.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0U.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0U.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0U.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0U.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0U.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x67BA;
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
                throw new RuntimeException("dev/krypton/0U", exception);
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
            _0U.d[n2] = _0U.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0U" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _0U.e(l2, l3);
        Object object = _0U.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _0U.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0U.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0U.c(clazz3, string2, clazz2)) != null) {
                    _0U.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0U.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0U.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0U.f(2067434048151417L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private String java_lang_String_0(Object[] objectArray) {
        CallSite callSite;
        block23: {
            CallSite callSite2;
            long l2;
            block24: {
                Object object;
                CallSite callSite3;
                boolean bl;
                block19: {
                    block20: {
                        Object object2;
                        block21: {
                            String string;
                            block22: {
                                CallSite callSite4;
                                block18: {
                                    block16: {
                                        block17: {
                                            l2 = (Long)objectArray[0];
                                            long l3 = (l2 = a ^ l2) ^ 0x7CF61C53C75BL;
                                            bl = _02.cfr_renamed_2();
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l3;
                                            callSite3 = _0U.e("m", (Object)_0U.e("\u00d9", (Object)this, -1083386742358468136L, (long)l2), (Object)objectArray2, -1082042431884266985L, (long)l2);
                                            try {
                                                try {
                                                    object = _0U.e("m", (Object)callSite3, -1083676330407080519L, (long)l2);
                                                    if (bl) break block16;
                                                    if (object == false) break block17;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _0U.a(matchException);
                                                }
                                                return _0U.a("g", 22447, (long)(0x608CF62F502D40EAL ^ l2));
                                            }
                                            catch (MatchException matchException) {
                                                throw _0U.a(matchException);
                                            }
                                        }
                                        try {
                                            callSite4 = callSite3;
                                            if (bl) break block18;
                                            object = _0U.e("m", (Object)callSite4, -1083774374337426098L, (long)l2);
                                        }
                                        catch (MatchException matchException) {
                                            throw _0U.a(matchException);
                                        }
                                    }
                                    try {
                                        if (l2 < 0L) break block19;
                                        if (object != true) break block20;
                                        callSite4 = _0U.e("m", (Object)callSite3, 0, -1084126038252637636L, (long)l2);
                                    }
                                    catch (MatchException matchException) {
                                        throw _0U.a(matchException);
                                    }
                                }
                                string = (String)((Object)callSite4);
                                try {
                                    try {
                                        object2 = string;
                                        if (bl) break block21;
                                        if (_0U.e("m", (Object)object2, -1084070475010488517L, (long)l2) > _0U.c("h", 9603, (long)(0x53F8F8C07BD7640DL ^ l2))) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0U.a(matchException);
                                    }
                                    return string;
                                }
                                catch (MatchException matchException) {
                                    throw _0U.a(matchException);
                                }
                            }
                            object2 = (String)((Object)_0U.e("m", string, 0, (int)_0U.c("h", 2123, (long)(0x6E8F3A679DB7C9C2L ^ l2)), -1083528962311125699L, (long)l2)) + (String)((Object)_0U.a("g", 1097, (long)(0xCB81955526C130FL ^ l2)));
                        }
                        return object2;
                    }
                    object = 20419;
                }
                callSite2 = _0U.e("u", (Object)_0U.a("g", (int)object, (long)(0x57184A405A54D887L ^ l2)), (Object)callSite3, -1083203358508847249L, (long)l2);
                try {
                    try {
                        callSite = callSite2;
                        if (bl) break block23;
                        if (_0U.e("m", (Object)callSite, -1084070475010488517L, (long)l2) > _0U.c("h", 9603, (long)(0x53F8F8C07BD7640DL ^ l2))) break block24;
                    }
                    catch (MatchException matchException) {
                        throw _0U.a(matchException);
                    }
                    return callSite2;
                }
                catch (MatchException matchException) {
                    throw _0U.a(matchException);
                }
            }
            callSite = (String)((Object)_0U.e("m", (Object)callSite2, 0, (int)_0U.c("h", 1831, (long)(0x500C729AB50646AAL ^ l2)), -1083528962311125699L, (long)l2)) + (String)((Object)_0U.a("g", 1097, (long)(0xCB81955526C130FL ^ l2)));
        }
        return callSite;
    }

    @Override
    public void void_6(Object[] objectArray) {
        class_11909 class_119092;
        _0U u;
        long l2;
        boolean bl;
        block6: {
            class_11909 class_119093;
            block7: {
                class_119093 = (class_11909)objectArray[0];
                bl = (Boolean)objectArray[1];
                long l3 = (Long)objectArray[2];
                long l4 = l3;
                long l5 = l4 ^ 0x2B8170B1B701L;
                long l6 = l4 ^ 0xA239397A5E5L;
                l2 = l4 ^ 0L;
                boolean bl2 = _02.cfr_renamed_2();
                try {
                    try {
                        try {
                            u = this;
                            class_119092 = class_119093;
                            if (bl2) break block6;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l6;
                            objectArray2[1] = (double)_0U.e("m", (Object)class_119093, 5512963017320470006L, (long)l3);
                            objectArray2[0] = (double)_0U.e("m", (Object)class_119092, 5512582851459598042L, (long)l3);
                            if (_0U.e("m", (Object)u, (Object)objectArray2, 5512657535203701833L, (long)l3) == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _0U.a(matchException);
                        }
                        if (_0U.e("m", (Object)class_119093, 5515764961223405301L, (long)l3) != false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw _0U.a(matchException);
                    }
                    _0U.e("m", (Object)_0U.e("C", 5512723933779667259L, (long)l3), (Object)new _8j_0(this, (_6X)((Object)_0U.e("\u00d9", (Object)this, 5514496093721568680L, (long)l3)), l5), 5513992825909205057L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _0U.a(matchException);
                }
            }
            u = this;
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
        _87 var5_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x2AF2DB09C70AL;
        long l5 = l3 ^ 0x26AD22712F0L;
        long l6 = l3 ^ 0x538DF2D376DEL;
        long l7 = l3 ^ 0x764D0226F048L;
        long l8 = l3 ^ 0x570C24C53811L;
        long l9 = l3 ^ 0x16D0603ED0FFL;
        long l10 = l3 ^ 0x7F2CE5EAB728L;
        long l11 = l3 ^ 0x4A7C3F174665L;
        long l12 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l6;
        reference var26_16 = _0U.e("m", (Object)this, (Object)objectArray2, 7739762968025252820L, (long)l2) + 5;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l11;
        reference var27_17 = _0U.e("m", (Object)this, (Object)objectArray3, 7739805243534990078L, (long)l2) + _0U.e("m", (Object)this, (Object)objectArray4, 7740603765983085573L, (long)l2) + _0U.e("\u00d9", (Object)this, 7740902679625833763L, (long)l2) + _0U.c("h", 16742, (long)(0x3231E12712611B75L ^ l2));
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l12;
        CallSite callSite = _0U.e("m", (Object)_0U.e("\u00d9", (Object)this, 7740327587193848388L, (long)l2), (Object)objectArray5, 7740248676072493507L, (long)l2);
        String string = (String)((Object)callSite) + ":";
        Object[] objectArray6 = new Object[5];
        objectArray6[4] = _0U.e("C", 7741138977813823485L, (long)l2);
        objectArray6[3] = (double)var27_17;
        objectArray6[2] = (double)var26_16;
        objectArray6[1] = string;
        objectArray6[0] = l8;
        _0U.e("m", (Object)var5_2, (Object)objectArray6, 7740504714363389472L, (long)l2);
        String string2 = (String)((Object)callSite) + (String)((Object)_0U.a("g", 2739, (long)(0x59064FBCA4428668L ^ l2)));
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l7;
        objectArray7[0] = string2;
        double d = (double)var26_16 + _0U.e("m", (Object)var5_2, (Object)objectArray7, 7741058764327811185L, (long)l2) + 5.0;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l9;
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l6;
        int n3 = (int)((double)_0U.e("m", (Object)this, (Object)objectArray8, 7739664514170367433L, (long)l2) - d + (double)_0U.e("m", (Object)this, (Object)objectArray9, 7739762968025252820L, (long)l2) - 5.0);
        reference var34_23 = var27_17 - 2;
        CallSite callSite2 = _0U.c("h", 19212, (long)(0x49976E63E7A61118L ^ l2));
        Object[] objectArray10 = new Object[10];
        objectArray10[9] = 4.0;
        objectArray10[8] = 4.0;
        objectArray10[7] = 4.0;
        objectArray10[6] = 4.0;
        objectArray10[5] = l10;
        objectArray10[4] = (double)(var34_23 + callSite2);
        objectArray10[3] = d + (double)n3;
        objectArray10[2] = (double)var34_23;
        objectArray10[1] = d;
        objectArray10[0] = _0U.e("\u00d9", (Object)this, 7739489113245783205L, (long)l2);
        _0U.e("m", (Object)var5_2, (Object)objectArray10, 7740123124852190893L, (long)l2);
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l5;
        CallSite callSite3 = _0U.e("m", (Object)this, (Object)objectArray11, 7740385192960939494L, (long)l2);
        Object[] objectArray12 = new Object[5];
        objectArray12[4] = _0U.e("\u00d9", (Object)this, 7740686697833189591L, (long)l2);
        objectArray12[3] = (double)(var34_23 + 3);
        objectArray12[2] = d + 4.0;
        objectArray12[1] = callSite3;
        objectArray12[0] = l8;
        _0U.e("m", (Object)var5_2, (Object)objectArray12, 7740504714363389472L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0U.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0U.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0U.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

