/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import dev.krypton._39;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6e_0;
import dev.krypton._6o_0;
import dev.krypton._6x_0;
import dev.krypton._7C;
import dev.krypton._8B;
import dev.krypton._95;
import dev.krypton._9j_0;
import dev.krypton._9o;
import dev.krypton.l;
import java.io.IOException;
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
 * Renamed from dev.krypton.5c
 */
public class _5c_0
extends _6x_0 {
    private final _9j_0 cfr_renamed_2;
    private final _6e_0 cfr_renamed_8;
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

    public _5c_0(short s, long l2) {
        long l3;
        long l4 = l3 = ((long)s << 48 | l2 << 16 >>> 16) ^ b;
        long l5 = l4 ^ 0x1B1BD1DA3FC4L;
        long l6 = l4 ^ 0x5CDAD0D08DDDL;
        long l7 = l4 ^ 0x431A43F462AFL;
        long l8 = l4 ^ 0x6C2A96E5F280L;
        int n = (int)(l8 >>> 32);
        int n2 = (int)(l8 << 32 >>> 56);
        int n3 = (int)(l8 << 40 >>> 40);
        long l9 = l4 ^ 0x1C8E223650EBL;
        super((int)_5c_0.c("s", 13294, (long)(0xA1B27A13DA185C2L ^ l3)), -1, (_4r)((Object)_5c_0.d("\u00cd", 2665578127372009737L, (long)l3)), l6);
        this.cfr_renamed_2 = new _9j_0((int)_5c_0.c("s", 18573, (long)(0x41B149A9EEC7FEA7L ^ l3)), n, (byte)n2, -1, n3, false);
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        this.cfr_renamed_8 = _5c_0.d("e", (Object)new _6e_0((int)_5c_0.c("s", 5897, (long)(0x3134EC6CD2262124L ^ l3)), l9, ""), (Object)objectArray, 2664666681415865143L, (long)l3);
        _5c_0.d("\u00e9", (Object)this, (int)_5c_0.c("s", 19753, (long)(0x787197EFCDF87B00L ^ l3)), 2666002018219608102L, (long)l3);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5c_0.d("R", (Object)this, 2665532605705135506L, (long)l3), _5c_0.d("R", (Object)this, 2665020619627172668L, (long)l3)};
        objectArray2[0] = l7;
        _5c_0.d("e", (Object)this, (Object)objectArray2, 2665153441529056727L, (long)l3);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        _5c_0.b = dev.krypton.l.a(-380372914853539053L, 4033774622590351614L, MethodHandles.lookup().lookupClass()).a(153896537785502L);
                        _5c_0.m = new Object[51];
                        _5c_0.n = new String[51];
                        _5c_0.b();
                        _5c_0.f = new HashMap<K, V>(13);
                        var11 = _5c_0.b ^ 72309299330138L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "\u00ef\u00da?\u008f\u0018\u00f6\u00fb\u0001\u00d4\u0012\u00b2\u00e5\u0007\tn\u00d3mL\u0007\u0083\u00a6\u00cc\u00cd>:T\u00b9K\u008eq\u0099\u008f\t\u00da\u00d17\u00e1\u00fe\u001d\u0006\u0010X\u0087\u00f3\u00ba!\u0090\u00c8u \u00b1d\u000bg\u0018\u00c9D \u008c\u0097\u00f2\u00f8 @\u00a6\u001d\u000b\u00db4p\u000e}.Q6\u00d5\u00e0N\u007fy\u008c\u009d\u00b1\u0015)\u00a1\u00bb\u00c0\u0090\u0081";
                        var19_6 = "\u00ef\u00da?\u008f\u0018\u00f6\u00fb\u0001\u00d4\u0012\u00b2\u00e5\u0007\tn\u00d3mL\u0007\u0083\u00a6\u00cc\u00cd>:T\u00b9K\u008eq\u0099\u008f\t\u00da\u00d17\u00e1\u00fe\u001d\u0006\u0010X\u0087\u00f3\u00ba!\u0090\u00c8u \u00b1d\u000bg\u0018\u00c9D \u008c\u0097\u00f2\u00f8 @\u00a6\u001d\u000b\u00db4p\u000e}.Q6\u00d5\u00e0N\u007fy\u008c\u009d\u00b1\u0015)\u00a1\u00bb\u00c0\u0090\u0081".length();
                        var16_7 = 40;
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
                            var20_3[var18_4++] = _5c_0.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00b97\t,\u008b\u0004\u00b6\t\u0010\u0098o\u00aa\u00b1\u0015\u00e1MhW&3\u00a5l\u009a0\u00ae\u007f\u007f\u00d1\u0089W_A\u00b6J>\u00c8%\u00ef\u00c8F\u00e2\u00f4\u00bd^\u008f/I\t\u0010\u001e\n\u00d9\u00a9\u009d;e\u00f1zs)\u001d\u00f9\f\u008e\u0016";
                            var19_6 = "\u00b97\t,\u008b\u0004\u00b6\t\u0010\u0098o\u00aa\u00b1\u0015\u00e1MhW&3\u00a5l\u009a0\u00ae\u007f\u007f\u00d1\u0089W_A\u00b6J>\u00c8%\u00ef\u00c8F\u00e2\u00f4\u00bd^\u008f/I\t\u0010\u001e\n\u00d9\u00a9\u009d;e\u00f1zs)\u001d\u00f9\f\u008e\u0016".length();
                            var16_7 = 48;
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
                            var20_3[var18_4++] = _5c_0.b(var21_9).intern();
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
                _5c_0.d = var20_3;
                _5c_0.e = new String[5];
                _5c_0.l = new HashMap<K, V>(13);
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
                var6_12 = new long[8];
                var3_13 = 0;
                var4_14 = "\u00ca\u0094TQ)e\u0010\u00b8Js\u00d1\u0094\u00db\u00de\u001b\u00d9>\r)r(\u009eT<\u001a\u0013/\u00e9\u00a6\u00aa4|\u00f3\u000e\u00b2ej0S\u00ffA\u0012\nC#X\u00bb\u00b0";
                var5_15 = "\u00ca\u0094TQ)e\u0010\u00b8Js\u00d1\u0094\u00db\u00de\u001b\u00d9>\r)r(\u009eT<\u001a\u0013/\u00e9\u00a6\u00aa4|\u00f3\u000e\u00b2ej0S\u00ffA\u0012\nC#X\u00bb\u00b0".length();
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
                    var4_14 = "\u0093\u00c3\u008eu\u00e6\u00a3\u00de\u008cx/.G\u0090r\u0010\u0097";
                    var5_15 = "\u0093\u00c3\u008eu\u00e6\u00a3\u00de\u008cx/.G\u0090r\u0010\u0097".length();
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
        _5c_0.j = var6_12;
        _5c_0.k = new Integer[8];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (_5c_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 3;
            case 1 -> 6;
            case 2 -> 63;
            case 3 -> 47;
            case 4 -> 12;
            case 5 -> 32;
            case 6 -> 30;
            case 7 -> 36;
            case 8 -> 8;
            case 9 -> 51;
            case 10 -> 35;
            case 11 -> 1;
            case 12 -> 44;
            case 13 -> 21;
            case 14 -> 13;
            case 15 -> 27;
            case 16 -> 46;
            case 17 -> 45;
            case 18 -> 18;
            case 19 -> 9;
            case 20 -> 38;
            case 21 -> 2;
            case 22 -> 23;
            case 23 -> 49;
            case 24 -> 56;
            case 25 -> 52;
            case 26 -> 53;
            case 27 -> 0;
            case 28 -> 15;
            case 29 -> 26;
            case 30 -> 17;
            case 31 -> 41;
            case 32 -> 5;
            case 33 -> 40;
            case 34 -> 60;
            case 35 -> 58;
            case 36 -> 20;
            case 37 -> 16;
            case 38 -> 42;
            case 39 -> 57;
            case 40 -> 37;
            case 41 -> 43;
            case 42 -> 34;
            case 43 -> 59;
            case 44 -> 61;
            case 45 -> 54;
            case 46 -> 28;
            case 47 -> 10;
            case 48 -> 39;
            case 49 -> 14;
            case 50 -> 62;
            case 51 -> 31;
            case 52 -> 55;
            case 53 -> 11;
            case 54 -> 29;
            case 55 -> 48;
            case 56 -> 24;
            case 57 -> 33;
            case 58 -> 22;
            case 59 -> 50;
            case 60 -> 7;
            case 61 -> 19;
            case 62 -> 4;
            default -> 25;
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
        _5c_0.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00e9' || c == '\u00cd' || c == 'W') {
                field = _5c_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5c_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'b' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
        MethodHandle methodHandle = _5c_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "s\u0002m\u001elQn\u0017o_i\r$^";
        objectArray[1] = "6sA$[\u0012CSJ+J]\"]A N\u0007V";
        objectArray[2] = "Hif@4\u0005=ImO%J\\GfD!\u0010(";
        objectArray[3] = ">te\n0\u0002>trV<\r$?rH<\u0018#N\"\u0015m";
        objectArray[4] = "@#3\u0004\u0016u@#$X\u001azZh$F\u001ao]\u0019p\u001eM";
        objectArray[5] = "\u0012\n\u000bL4B\f\u0002\u0011\u0003yX\u0016\b\b_hR\u0016\u001fSnuZ\b\u0007\u0018Y{U\u0014\u000e;XnB\n\u000e";
        objectArray[6] = " 44\u000e\u0003a+;%A\u007fx$;#\rAh";
        objectArray[7] = "T\u001dN<\n\u001f!=E3\u001bP@3N8\u001f\n4";
        objectArray[8] = "\u00124Uo?L\u000f!W.:\u0010@)";
        objectArray[9] = "\u0015bb\u001f&J\bw`^#\u0016Hm";
        objectArray[10] = "\u001c6\\\u001d(vi\u0016W\u001299\b\u0018\\\u0019=c|";
        objectArray[11] = Integer.TYPE;
        _5c_0.n[11] = "java/lang/Integer";
        objectArray[12] = ";wW ?\u001eNW\\/.Q/YW$*\u000b[";
        objectArray[13] = "Uj\u000f7A\u0016 J\u00048PYAD\u000f3T\u00035";
        objectArray[14] = "_\u000f\u001c\u0018\f~B\u001a\u001eY\t\"\u000e\t";
        objectArray[15] = "\u001c\u0013kB5\\\u0001\u0006i\u00030\u0000N\u0013";
        objectArray[16] = "v\u0002\u0014\r1b}\r\u0005BLzn\n\f\u000b";
        objectArray[17] = "U/18u{H:3yp'\b\u0001";
        objectArray[18] = "\u001cEv}\u000eYie}r\u001f\u0016\bkvy\u001bL|";
        objectArray[19] = Boolean.TYPE;
        _5c_0.n[19] = "java/lang/Boolean";
        objectArray[20] = Double.TYPE;
        _5c_0.n[20] = "java/lang/Double";
        objectArray[21] = "\u001e\u00048,yW\u0003\u0011:m|\u000bL.";
        objectArray[22] = "T\u0012\u0002YEH!2\tVT\u0007@<\u0002]P]4";
        objectArray[23] = Void.TYPE;
        _5c_0.n[23] = "java/lang/Void";
        objectArray[24] = "#m\u000e>^V>x\f\u007f[\nsz";
        objectArray[25] = "?3G]\u0011\u0011J\u0013LR\u0000^+\u001dGY\u0004\u0004_";
        objectArray[26] = "$=\u00005\u0000MQ\u001d\u000b:\u0011\u00020\u0013\u00001\u0015XD";
        objectArray[27] = "\u0015|76\u000e\u001a`\\<9\u001fU\u0001R72\u001b\u000fu";
        objectArray[28] = "*\u0017Q\nrP!\u0018@E\u0013^*\u0013D\u001f";
        objectArray[29] = "\u000f*0.h{X38ToB\u0007s4e))[+w3V(\u000050jo\u007f\u0019=J";
        objectArray[30] = "u\u0000\u0003<~\u0013\"\u0019\u000bFx*}Y\u0007w?A!\u0001D!@@z\u001f\u0003xy\u0017c\u0017y";
        objectArray[31] = "b~\u0015#ivb(\r~Px9|\u0012)\u0007/g+JEk- +\u001a mp5v";
        objectArray[32] = "acR9u\u0002%t\u0001\"K\u001b'cq!:\u00071\u0005\u00047(Pcw_!1\u0001Z>^0(_9zIc3a";
        objectArray[33] = "3?<}\\\tg/oc<%\u001d\u0014G\u0012S\u0010l l{\u0007\u0000?>";
        objectArray[34] = "I\u0004\u001fg%U\u001e\u001d\u0017\u001d&lA]\u001b,d\u0007\u001d\u0005Xz\u001b\u0006F\u001b\u001f#\"Q_\u0013e";
        objectArray[35] = "fC:*:\u000ffY,{\u0003G[\u001e2%eG;\u001ed=8";
        objectArray[36] = "MjRk;\u007f\u001evU)\u0007;sh\ti6z\u00184Q*`\u0005Lm\rq`4Ig\u0005|\u0007";
        objectArray[37] = "rf^V\u0005;%\u007fV,\n\u0002z?Z\u001dDi&g\u0019K;h}y^\u0012\u0002?dq$";
        objectArray[38] = " 'LP.\u0010w>D*+)(~H\u001boBt&\u000bM\u0010C/8L\u0014)\u0014606";
        objectArray[39] = "B&IvLD\u00129Ax4\u0000sc\\pR\\BfVx_";
        objectArray[40] = "X\u0014\u001a<4Q\b\bW$W\b1\u001d\u0013.2_\u0000\b\u0012)5";
        objectArray[41] = "`)1\rNn069\u00036,Q: BJr0j<\u000fR";
        objectArray[42] = "0M*u\u0010k7\u00112w\u007f [\u0012miNo0N5*\u0018\u00107\u0012a,Fr8\nmo\u007f";
        objectArray[43] = "=>h\fvo=$~]O'\u0000;3\u001e~akgk](\u001eo8o[#xyetXO";
        objectArray[44] = "C\u0007q\u0001^QEZd\\2Q\u0015@i\\^cB\u00072\u0002\r4\u0015\u0007q\u0002\u000eM\u0013ZsI2";
        objectArray[45] = "\u0006M$$'sR@e,Z'kPg6kh\u0000\f?u=\u0017\u0004S;s6q\u0012\u000e pZ";
        objectArray[46] = "D\u0003]j8]\u0014\u001cUd@\u001cuGO3<\u001e\u000f\u0014S4~";
        objectArray[47] = "CT{5\u0005)\u0017Y:=xv.I8'I2E\u0015`d\u001fMAJdb\u0014+W\u0017\u007fax";
        objectArray[48] = "\tFn\u00028X\u000f\u001b{_TX_\u0001v_8j\bF-\u0002m=_Fn\u0001hDY\u001blJT";
        objectArray[49] = " \u001bs{^!&Ff&2!v\\k&^\u0013!\u001b0x\u0002Dv\u001bsx\u000e=pFq32";
        Object[] objectArray2 = objectArray;
        objectArray[50] = "q%\u00071]a!9J)>9\u0018$J3\u000f\u007fsx\u0012pY\u0000q%\u00071]a!9J)>";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5c_0.c(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
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

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x12DD;
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
                throw new RuntimeException("dev/krypton/5c", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5c_0.k[n2] = n3;
        }
        return k[n2];
    }

    private static Method h(long l2, long l3) {
        int n = _5c_0.e(l2, l3);
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
                String string2 = _5c_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = _5c_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5c_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5c_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5c_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5c_0.f(2017713782505439L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5c_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5c_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5c_0.f(2017713782505439L, 0L);
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
            int n = _5c_0.e(l2, l3);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                _5c_0.m[n] = clazz = Class.forName(_5c_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5c_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5c_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5c_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5c_0.d(classArray[j], string, clazz2);
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
            throw new RuntimeException("dev/krypton/5c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _5c_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x69A6;
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
                throw new RuntimeException("dev/krypton/5c", exception);
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
            _5c_0.e[n2] = _5c_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _5c_0.e(l2, l3);
        Object object = m[n];
        if (object instanceof String) {
            String string = _5c_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = _5c_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5c_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5c_0.c(clazz3, string2, clazz2)) != null) {
                    _5c_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5c_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5c_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5c_0.f(2017713782505439L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @_3i_0
    public void cfr_renamed_7(_9o o) {
        CallSite callSite;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        block11: {
            long l11;
            long l12;
            block12: {
                _5c_0 c_0;
                int n;
                block9: {
                    block10: {
                        long l13 = l10 = b ^ 0x23CCF7849292L;
                        l12 = l13 ^ 0x521AA95285B0L;
                        l9 = l13 ^ 0x73A6A7D0299AL;
                        l8 = l13 ^ 0x4DE0F2C5148EL;
                        l7 = l13 ^ 0x3BCFED657406L;
                        l11 = l13 ^ 0x15EE6BE8E631L;
                        l6 = l13 ^ 0x6DC76D80E82BL;
                        l5 = l13 ^ 0x73685E15E5C2L;
                        l4 = l13 ^ 0x1FF79DCE113AL;
                        l3 = l13 ^ 0x59C57F7E6E83L;
                        l2 = l13 ^ 0x589ADEAF5062L;
                        n = _7C.cfr_renamed_9();
                        try {
                            try {
                                c_0 = this;
                                if (n == 0) break block9;
                                if (_5c_0.d("R", (Object)_5c_0.d("R", (Object)c_0, -6826081228046305445L, (long)l10), -6824097081539078536L, (long)l10) != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw _5c_0.a(matchException);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw _5c_0.a(matchException);
                        }
                    }
                    c_0 = this;
                }
                try {
                    try {
                        callSite = _5c_0.d("R", (Object)c_0, -6825807588092097124L, (long)l10);
                        if (n == 0) break block11;
                        if (callSite <= 0) break block12;
                    }
                    catch (MatchException matchException) {
                        throw _5c_0.a(matchException);
                    }
                    _5c_0 c_02 = this;
                    _5c_0.d("\u00e9", (Object)c_02, (int)(_5c_0.d("R", (Object)c_02, -6825807588092097124L, (long)l10) - true), -6825807588092097124L, (long)l10);
                    return;
                }
                catch (MatchException matchException) {
                    throw _5c_0.a(matchException);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l12;
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l11;
            objectArray2[0] = (int)_5c_0.d("e", (Object)_5c_0.d("R", (Object)this, -6825335714630590424L, (long)l10), (Object)objectArray, -6826002317267588798L, (long)l10);
            callSite = _5c_0.d("b", (Object)objectArray2, -6825618076277671522L, (long)l10);
        }
        if (callSite != false) {
            _6o_0 o_0 = new _6o_0((String)((Object)_5c_0.d("R", (Object)_5c_0.d("R", (Object)this, -6825670611711912314L, (long)l10), -6825729092603385817L, (long)l10)));
            int n = (int)_5c_0.d("e", (Object)_5c_0.d("R", (Object)_5c_0.d("R", (Object)this, -6826081228046305445L, (long)l10), -6824097081539078536L, (long)l10), -6825461374963793404L, (long)l10);
            int n2 = (int)_5c_0.d("e", (Object)_5c_0.d("R", (Object)_5c_0.d("R", (Object)this, -6826081228046305445L, (long)l10), -6824097081539078536L, (long)l10), -6827335354315303219L, (long)l10);
            int n3 = (int)_5c_0.d("e", (Object)_5c_0.d("R", (Object)_5c_0.d("R", (Object)this, -6826081228046305445L, (long)l10), -6824097081539078536L, (long)l10), -6827453833732419465L, (long)l10);
            Object[] objectArray = new Object[2];
            objectArray[1] = _5c_0.a("c", 13709, (long)(0x4A6639FF1E017D64L ^ l10));
            objectArray[0] = l2;
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = _5c_0.a("c", 20369, (long)(0x146EC67913690779L ^ l10));
            objectArray3[0] = l9;
            Object[] objectArray4 = new Object[4];
            objectArray4[3] = true;
            objectArray4[2] = (String)((Object)_5c_0.a("c", 26608, (long)(0x1CB0EAEB9690AF1EL ^ l10))) + n + (String)((Object)_5c_0.a("c", 32527, (long)(0x61388B22CB69B7E4L ^ l10)));
            objectArray4[1] = l8;
            objectArray4[0] = "X";
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = true;
            objectArray5[2] = (String)((Object)_5c_0.a("c", 32527, (long)(0x61388B22CB69B7E4L ^ l10))) + n2 + (String)((Object)_5c_0.a("c", 32527, (long)(0x61388B22CB69B7E4L ^ l10)));
            objectArray5[1] = l8;
            objectArray5[0] = "Y";
            Object[] objectArray6 = new Object[4];
            objectArray6[3] = true;
            objectArray6[2] = (String)((Object)_5c_0.a("c", 32527, (long)(0x61388B22CB69B7E4L ^ l10))) + n3 + (String)((Object)_5c_0.a("c", 32527, (long)(0x61388B22CB69B7E4L ^ l10)));
            objectArray6[1] = l8;
            objectArray6[0] = "Z";
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = new _8B((int)_5c_0.c("s", 18098, (long)(0x687946C3DDCA7526L ^ l10)), l3, (int)_5c_0.c("s", 233, (long)(0x3548127D47BCB37BL ^ l10)), (int)_5c_0.c("s", 1869, (long)(0x3D2E8375412BB4DCL ^ l10)));
            objectArray7[0] = l7;
            Object[] objectArray8 = new Object[3];
            objectArray8[2] = null;
            objectArray8[1] = l6;
            objectArray8[0] = _5c_0.a("c", 16760, (long)(0x677DAF9243458992L ^ l10));
            CallSite callSite2 = _5c_0.d("e", (Object)_5c_0.d("e", (Object)_5c_0.d("e", (Object)_5c_0.d("e", (Object)_5c_0.d("e", (Object)_5c_0.d("e", (Object)_5c_0.d("e", (Object)new _39(), (Object)objectArray, -6826157103541747774L, (long)l10), (Object)objectArray3, -6824229918021822571L, (long)l10), (Object)objectArray4, -6825978168873463429L, (long)l10), (Object)objectArray5, -6825978168873463429L, (long)l10), (Object)objectArray6, -6825978168873463429L, (long)l10), (Object)objectArray7, -6825901422955696150L, (long)l10), (Object)objectArray8, -6824156431445686176L, (long)l10);
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = l5;
            objectArray9[0] = callSite2;
            _5c_0.d("e", (Object)o_0, (Object)objectArray9, -6825258248903428529L, (long)l10);
            _5c_0.d("b", () -> _5c_0.cfr_renamed_7(l4, o_0), -6826274145329459918L, (long)l10);
            _5c_0.d("\u00e9", (Object)this, (int)_5c_0.c("s", 14804, (long)(0x3892E57177CF0A41L ^ l10)), -6825807588092097124L, (long)l10);
        }
    }

    private static void cfr_renamed_7(long l2, _6o_0 o_0) {
        long l3 = (l2 = b ^ l2) ^ 0x1EF386B70DCAL;
        try {
            Object[] objectArray = new Object[1];
            objectArray[0] = l3;
            _5c_0.d("e", (Object)o_0, (Object)objectArray, -8961187340311711335L, (long)l2);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5c_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_5c_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5c_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

