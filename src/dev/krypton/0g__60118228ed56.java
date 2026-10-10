/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 */
package dev.krypton;

import dev.krypton._02;
import dev.krypton._0v;
import dev.krypton._4t;
import dev.krypton._87;
import dev.krypton._8B;
import dev.krypton._95;
import dev.krypton._9j_0;
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
import net.minecraft.class_11908;
import net.minecraft.class_11909;

public class _0g
extends _0v {
    private static final _8B cfr_renamed_8;
    private static final _8B cfr_renamed_4;
    private static final _8B cfr_renamed_2;
    private static final _8B cfr_renamed_34;
    private static final _8B cfr_renamed_35;
    private static final float cfr_renamed_36 = 5.0f;
    private static final float cfr_renamed_5 = 10.0f;
    private static final float cfr_renamed_1 = 60.0f;
    private static final float cfr_renamed_37 = 0.35f;
    private final _9j_0 cfr_renamed_0;
    private float cfr_renamed_9;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final Object[] n;
    private static final String[] o;

    @Override
    public void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        super.cfr_renamed_5(objectArray2);
        _0g.e("\u00e3", (Object)this, 0.0f, -75355793045033555L, (long)l2);
    }

    public _0g(_4t t, long l2, _95 var4_3, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x15DFDF95C14EL;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, t, var4_3, n, n3, (char)n4);
        _0g.e("\u00e3", (Object)this, 0.0f, 7637960193230502566L, (long)l2);
        this.cfr_renamed_0 = (_9j_0)var4_3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    _0g.a = l.a(6845682746500718731L, 1997308335020877829L, MethodHandles.lookup().lookupClass()).a(181252412601633L);
                    var20 = _0g.a ^ 62142713149014L;
                    var22_1 = var20 ^ 82090230712459L;
                    _0g.n = new Object[109];
                    _0g.o = new String[109];
                    _0g.b();
                    _0g.e = new HashMap<K, V>(13);
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
                    var15_6 = "?\u00ec\u0015\u001bO\u00d2\u00f3CP*F\u00020\u001d\u0007w\u009c>\u00edl\u0082]\u0092\u0014<\u0089#\u00a7m\u0001\u0089\u0085\u0018\t\u0001\u00bb\u00f0\u00f0A~\u00b5\u00b2\u009dUbzU\u001d\u00e7F.`J\u00c3a\u0001m";
                    var17_7 = "?\u00ec\u0015\u001bO\u00d2\u00f3CP*F\u00020\u001d\u0007w\u009c>\u00edl\u0082]\u0092\u0014<\u0089#\u00a7m\u0001\u0089\u0085\u0018\t\u0001\u00bb\u00f0\u00f0A~\u00b5\u00b2\u009dUbzU\u001d\u00e7F.`J\u00c3a\u0001m".length();
                    var14_8 = 32;
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
                        var18_4[var16_5++] = _0g.a(var19_10).intern();
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
                _0g.c = var18_4;
                _0g.d = new String[2];
                _0g.k = new HashMap<K, V>(13);
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
                var6_13 = new long[17];
                var3_14 = 0;
                var4_15 = "\u00d1\b\u00b1\u0019\u0082\u00dd(\u0015\"\u00ceD\u00cf\u00f6\u00922tO\u00c0md\u00abh\u001c\u00ad\u00f5v1\u00df3z\u00aa\u00baN\u00a80\u0013\u00b4\u00f0\u0005Y\u00b8&qt\u00a5\u0098\u00b7\"\u008b\u00ec\u00cd\u008a\u00f0\u00f0y\u00da\u0081\"\u00dd\u00e0V\u0013^K\u001eu\t1\u0096\u0089F\u00f6\u00d5\u0018\u00c6\u00db@\u00ec\u0086\u00e3\u00d4d\u0018% \u00f9H\u00db\u001ak\u009fk\u0094\u00b1O+\u00ec\u00fb[\u00fd\u0087\t\u00a7\u001a\u00bf\u00e8K\u001aU+\u009c\u00e8ep\u0013z\u00db}\u00a4_";
                var5_16 = "\u00d1\b\u00b1\u0019\u0082\u00dd(\u0015\"\u00ceD\u00cf\u00f6\u00922tO\u00c0md\u00abh\u001c\u00ad\u00f5v1\u00df3z\u00aa\u00baN\u00a80\u0013\u00b4\u00f0\u0005Y\u00b8&qt\u00a5\u0098\u00b7\"\u008b\u00ec\u00cd\u008a\u00f0\u00f0y\u00da\u0081\"\u00dd\u00e0V\u0013^K\u001eu\t1\u0096\u0089F\u00f6\u00d5\u0018\u00c6\u00db@\u00ec\u0086\u00e3\u00d4d\u0018% \u00f9H\u00db\u001ak\u009fk\u0094\u00b1O+\u00ec\u00fb[\u00fd\u0087\t\u00a7\u001a\u00bf\u00e8K\u001aU+\u009c\u00e8ep\u0013z\u00db}\u00a4_".length();
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
                    var4_15 = "\u000b\u0012\u00c6\u00f1\u0080\u009cx\u000b/\u00fb\u0091\u00aa\u000e\u0012Ki";
                    var5_16 = "\u000b\u0012\u00c6\u00f1\u0080\u009cx\u000b/\u00fb\u0091\u00aa\u000e\u0012Ki".length();
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
        _0g.i = var6_13;
        _0g.j = new Integer[17];
        _0g.cfr_renamed_8 = new _8B((int)_0g.c("v", (int)26278, (long)(1121466691538942065L ^ var20)), (int)_0g.c("v", (int)21240, (long)(3884396319567531045L ^ var20)), var22_1, (int)_0g.c("v", (int)16778, (long)(8140779568166362962L ^ var20)), (int)_0g.c("v", (int)11010, (long)(2298784719066379730L ^ var20)));
        _0g.cfr_renamed_4 = new _8B((int)_0g.c("v", (int)30095, (long)(8163439832262536016L ^ var20)), (int)_0g.c("v", (int)11629, (long)(7697360287617954745L ^ var20)), var22_1, (int)_0g.c("v", (int)9960, (long)(856803775252084798L ^ var20)), (int)_0g.c("v", (int)17624, (long)(5554642185184565773L ^ var20)));
        _0g.cfr_renamed_2 = new _8B((int)_0g.c("v", (int)31686, (long)(5138356540645532951L ^ var20)), (int)_0g.c("v", (int)11629, (long)(7697360287617954745L ^ var20)), var22_1, (int)_0g.c("v", (int)7750, (long)(4674073697894629524L ^ var20)), (int)_0g.c("v", (int)27320, (long)(4094227304131753074L ^ var20)));
        _0g.cfr_renamed_34 = new _8B((int)_0g.c("v", (int)10612, (long)(2859893295480649647L ^ var20)), (int)_0g.c("v", (int)19272, (long)(2051217999104071058L ^ var20)), var22_1, (int)_0g.c("v", (int)19272, (long)(2051217999104071058L ^ var20)), (int)_0g.c("v", (int)21240, (long)(3884396319567531045L ^ var20)));
        _0g.cfr_renamed_35 = new _8B((int)_0g.c("v", (int)19272, (long)(2051217999104071058L ^ var20)), (int)_0g.c("v", (int)19272, (long)(2051217999104071058L ^ var20)), var22_1, (int)_0g.c("v", (int)19272, (long)(2051217999104071058L ^ var20)), (int)_0g.c("v", (int)24790, (long)(8261574768992648712L ^ var20)));
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = _0g.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 2;
            case 2 -> 47;
            case 3 -> 8;
            case 4 -> 11;
            case 5 -> 10;
            case 6 -> 44;
            case 7 -> 55;
            case 8 -> 15;
            case 9 -> 38;
            case 10 -> 3;
            case 11 -> 22;
            case 12 -> 33;
            case 13 -> 23;
            case 14 -> 39;
            case 15 -> 12;
            case 16 -> 1;
            case 17 -> 58;
            case 18 -> 50;
            case 19 -> 26;
            case 20 -> 25;
            case 21 -> 18;
            case 22 -> 35;
            case 23 -> 36;
            case 24 -> 53;
            case 25 -> 51;
            case 26 -> 13;
            case 27 -> 52;
            case 28 -> 31;
            case 29 -> 6;
            case 30 -> 7;
            case 31 -> 28;
            case 32 -> 42;
            case 33 -> 61;
            case 34 -> 60;
            case 35 -> 19;
            case 36 -> 9;
            case 37 -> 24;
            case 38 -> 27;
            case 39 -> 48;
            case 40 -> 57;
            case 41 -> 43;
            case 42 -> 4;
            case 43 -> 14;
            case 44 -> 20;
            case 45 -> 63;
            case 46 -> 62;
            case 47 -> 5;
            case 48 -> 37;
            case 49 -> 40;
            case 50 -> 34;
            case 51 -> 30;
            case 52 -> 59;
            case 53 -> 17;
            case 54 -> 21;
            case 55 -> 29;
            case 56 -> 0;
            case 57 -> 46;
            case 58 -> 56;
            case 59 -> 41;
            case 60 -> 16;
            case 61 -> 49;
            case 62 -> 32;
            default -> 45;
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
        _0g.o[n3] = new String(cArray);
        return n3;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == '\u00e3' || c == 'n' || c == 'f') {
                field = _0g.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0g.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0g.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = n;
        n[0] = "L#d8yUQ6fy|\t\u0018!";
        objectArray[1] = " w\u0007\u0007wZ=b\u0005Fr\u0006}x";
        objectArray[2] = "#cUTn,>vW\u0015kptH";
        objectArray[3] = "\u000b\u0012\u001c\b-\u001f\u0016\u0007\u001eI(C_\u0001";
        objectArray[4] = "\u0001\u0010`Y4\u0001t0kV%N\u0015>`]!\u0014a";
        objectArray[5] = Integer.TYPE;
        _0g.o[5] = "java/lang/Integer";
        objectArray[6] = "<d\u000e]\u0000/!q\f\u001c\u0005s`6";
        objectArray[7] = "6[[\u000fDLC{P\u0000U\u0003\"u[\u000bQYV";
        objectArray[8] = Double.TYPE;
        _0g.o[8] = "java/lang/Double";
        objectArray[9] = "J\u000bC\u001aJy?+H\u0015[6^%C\u001e_l*";
        objectArray[10] = "\u001c-\b|?h\u0017\"\u00193Bp\u0004%\u0010z";
        objectArray[11] = "5%+u\u0006!(0)4\u0003}i\u0002";
        objectArray[12] = "'VO%I\u001eRvD*XQ3xO!\\\u000bG";
        objectArray[13] = "L8\u0006!/\u0010G7\u0017nL\u001dR1";
        objectArray[14] = "W\u001fZ\u001fX@J\nX^]\u001c\u0003?";
        objectArray[15] = "^s\u001cf[X+S\u0017iJ\u0017J]\u001cbNM>";
        objectArray[16] = Void.TYPE;
        _0g.o[16] = "java/lang/Void";
        objectArray[17] = "\u0004=97q0q\u001d28`\u007f\u0010\u001393d%d";
        objectArray[18] = "7I%qW\u0013*\\'0ROjg";
        objectArray[19] = "hbY?\u0015#\u001dBR0\u0004l|LY;\u00006\b";
        objectArray[20] = "1_.W4m,J,\u001611ak";
        objectArray[21] = "D\u001cFV\u001cS1<MY\r\u001cP2FR\tF$";
        objectArray[22] = "iKZ0\u0010\u0012\u001ckQ?\u0001]}eZ4\u0005\u0007\t";
        objectArray[23] = "\u0001!Nx\\\u0000t\u0001EwMO\u0015\u000fN|I\u0015a";
        objectArray[24] = "\\+LY0_)\u000bGV!\u0010H\u0005L]%J<";
        objectArray[25] = "yRO\"\u0001\b\frD-\u0010Gm|O&\u0014\u001d\u0019";
        objectArray[26] = "BJn\u000f\\`7je\u0000M/Vdn\u000bIu\"";
        objectArray[27] = Boolean.TYPE;
        _0g.o[27] = "java/lang/Boolean";
        objectArray[28] = "\u0001-(}3~t\r#r\"1\u0015\u0003(y&ka";
        objectArray[29] = Float.TYPE;
        _0g.o[29] = "java/lang/Float";
        objectArray[30] = "c\u0005\u0015z#P\u0016%\u001eu2\u001fw+\u0015~6E\u0003";
        objectArray[31] = "\u001ceXt^4\u0017jI;#!\u0005pKx";
        objectArray[32] = Long.TYPE;
        _0g.o[32] = "java/lang/Long";
        objectArray[33] = "\fQ|\f)U\u0011D~M,\tQ\u0001";
        objectArray[34] = "St\u0016Y\u0004\u0001&T\u001dV\u0015NGZ\u0016]\u0011\u00143";
        objectArray[35] = "\u001a,\u0000D\u0001,\u00079\u0002\u0005\u0004pGq";
        objectArray[36] = "\u001aUU\u001b$\u007fou^\u001450\u000e{U\u001f1jz";
        objectArray[37] = "vj*<nO\u0003J!3\u007f\u0000bD*8{Z\u0016";
        objectArray[38] = " T@Ly=UtKChr4z@Hl(@";
        objectArray[39] = "A>}'ol4\u001ev(~#U\u0010}#zy!";
        objectArray[40] = "x\f&H\u0019\u0012\r,-G\b]l\"&L\f\u0007\u0018";
        objectArray[41] = "Z\u0019.SRT/9%\\C\u001bN7.WGA:";
        objectArray[42] = "Tsh!4\u0015!Sc.%Z@]h%!\u00004";
        objectArray[43] = "1+Y+\u0005\u000eD\u000bR$\u0014A%\u0005Y/\u0010\u001bQ";
        objectArray[44] = "(2\n\u0006WE]\u0012\u0001\tF\n<\u001c\n\u0002BPH";
        objectArray[45] = "\n3\u000b;\u0019\u0018\n3\u001cg\u0015\u0017\u0010x\u001cy\u0015\u0002\u0017\tN$MA]";
        objectArray[46] = "m\u0003N,,cp\u0016Lm)??\u001e";
        objectArray[47] = "yT\u001d!Eh\ft\u0016.T'mz\u001d%P}\u0019";
        objectArray[48] = "9@\tF^\u0004L`\u0002IOK-n\tBK\u0011Y";
        objectArray[49] = "Vb\u0004B0]#B\u000fM!\u0012BL\u0004F%H6";
        objectArray[50] = "L$x)!'9\u0004s&0hX\nx-42,";
        objectArray[51] = "\b/k\\\u000f \u0015:i\u001d\n|X>";
        objectArray[52] = "D_M\u0003$\u00051\u007fF\f5JPqM\u00071\u0010$";
        objectArray[53] = "Y\u001e90#fY\u001e.l/iCU.r/|D$|/w?\u000f";
        objectArray[54] = "ND\u0012\fo)EK\u0003C\u000e'N@\u0007\u0019";
        objectArray[55] = "\nHzl9|[La\u0005e\u0011\tK=`<*I\u001b85";
        objectArray[56] = ">\u000b5Wq\u0004yV=\u0014\u0000N\u0004\rjU9B`Ji\u0017?\u0016\u0004\u000f1\u000e|\u0015=MlT1\u007f";
        objectArray[57] = "2+E+\t\rivMzp@\u000es\u0016\u007fILj4\u0015=O\u0018\u000et\u00179\t\rv-\u0010(Hq";
        objectArray[58] = "\t\u0003)AL\u0014R^!\u00105T5[z\u0015\fUQ\u001cyW\n\u00015]'DO\u000bV\u0000sLYh";
        objectArray[59] = "|ErNz%1]iY\u0006uC\u00055\u0012?r'B6P9&C\u0007nIz%zE3\u00137O";
        objectArray[60] = "hr\u0007Kv#` \u0002\u001eI831}Lp, 6\u0005\u0015w=aJCK4(%2\u001aL%iY";
        objectArray[61] = "U&\u0002r2;\u0006,\\uV=8pU/o?\\7Vmik8wTi/~@.Sxn\u0002";
        objectArray[62] = "T\u0004U^\ftF_@[0u+\r\n\u001d\tvOJ\t_\u000f\"+^\r\u001aKrJFJ_\fK";
        objectArray[63] = "9X\u0002ncBy\b\u0007;\nG\u0000X\u000603Dd\u001f\u0005r5\u0010\u0000\u000b\u00017q@a\u0013Fr6y";
        objectArray[64] = "j~=\u001d1k-#5^@-Pxb\u001fy-4?a]\u007fyPz9D<zi8d\u001eq\u0010";
        objectArray[65] = "rm]x<\u00072=X-U\u0004KmY&l\u0001/*ZdjUK>^!.\u0005*&\u0019di<";
        objectArray[66] = "\u001efQC:YY;Y\u0000K\u001d$`\u000eAr\u001f@'\r\u0003tK$bU\u001a7H\u001d \b@z\"";
        objectArray[67] = "1y4^;\u0006|a/IG\\\u000e9s\u0002~Qj~p@x\u0005\u000e;(Y;\u00067yu\u0003vl";
        objectArray[68] = "\u0013\u0006:\u0012\b#\u001bT?G74KN@HY0XB>AZ<C>#EV+^@*FZ0\"].JM-\\T-FVQ";
        objectArray[69] = "r5-U=S)h%\u0004D\u0010-T\u007f\u0002\u007f\u0016s08\u0001=\u0010'T,\u0005xTw54B=\u0013N";
        objectArray[70] = "/*J\u0010\u001cb4v\u0016\n}'I/\u0017TD'-h\u0014\u0016BsI)J\u0005\u0007y*t\u001e\r\u0011\u001a";
        objectArray[71] = ";\u001d\u001f9'Sj\u0019\u0004Pw|\u0001\u0018\u001d/,BkU\u00054;";
        objectArray[72] = "\u0015F\u000e*>kDB\u0015Co\u0006\u0010\u0005\n$.l]\u001d\u00113";
        objectArray[73] = "]<=a@%\u0006a509eadn5\u0000d\u0005#mw\u00060acos@%\u0019:hb\u0001Y";
        objectArray[74] = ">k\u0003Ktmy6\u000b\b\u0005,\u0004m\\I<+`*_\u000b:\u007f\u0004o\u0007\u0012y|=-ZH4\u0016";
        objectArray[75] = ":W'\u001eua}\n/]\u0004';h\u007f^{}|\u00022F`j";
        objectArray[76] = "1vyg\u001e{`rb\u000eM\u0016h\"ct\u000eha!oo";
        objectArray[77] = "=~u3JTz#}p;\u0012kAt6^Pf9oj\u0002J";
        objectArray[78] = "\u0000?'#z\r\u0018~5$F\u001f\u0019k\"\u0011zKO>Zx\u007f\t\u0007r\"!x\u0018F\u000e";
        objectArray[79] = ";\u0002S\u0019\u00015|_[Zpr\u0001\u0006W@\f$8D\n\u001aA";
        objectArray[80] = "\u0019)\u0012E\u0014I\u0000wUJ.\u0002p QO\u0017\u0004\u0014gR\r\u0011PppY\u000f\u001f\u0003\u0000i\u0007H\u00109";
        objectArray[81] = "\\%thW.\u001e!w=({ecv6\u0011\u007f\u0001$ut\u0017+e0q1S{\u0004(6t\u0014B";
        objectArray[82] = "\u0007\t\u0011\t\u0000\nGY\u0014\\i\u0000>\t\u0015WP\fZN\u0016\u0015VX>Q]\u0017\u0019IQ\u0000S\r\u00101";
        objectArray[83] = "\u0006o\u0003\u0000z\u0019\u001e.\u0011\u0007F\u0005\u0015\"\u001e\u0002*7GbDY{`C=\u001e\u0019,Y\u0001`DTF";
        objectArray[84] = "\u0007P\u001a^!-ET\u0019\u000b^q>\u0016_\u0001;>RT[\u0002n";
        objectArray[85] = "10\u0003\u0001?Z(nD\u000e\u0005\u0016X9@\u000b<\u0017<~CI:CXjG\f~\u00139r\u0000I9*";
        objectArray[86] = "\u0000r(5\u0019v@\"-`ps9r,kIp]5/)O$9pw0\f'\u00002*jAM";
        objectArray[87] = "\u0001I2\u0017WVRUlP5\u000bj\fo\u0016\f\f\u000eKlT\nXj\n2GOR\tWfOY1";
        objectArray[88] = "4w!uD;yo:b8`\u000b7f)\u0001lopek\u00078\u000b5=rD;2w`(\tQ";
        objectArray[89] = "h'O\u0001w\u000f3zGP\u000eLTzE\u0005a\n(!\u0018\r0";
        objectArray[90] = "B\u001d3N5j\u0005@;\rD/x\u001blL},\u001c\\o\u000e{xx\u00197\u00178{A[jMu\u0011";
        objectArray[91] = "`!,\u001e\tM#w*\u001aIs<u=\u0013\u0015\u001f\u000e'}IHCY#\"\u0013\u000e\u0019`a\u007fICs";
        objectArray[92] = "nW{!d8.\u0007~t\r2WW\u007f\u007f4>3\u0010|=2jW\u0004xxv:6\u001c?=1\u0003";
        objectArray[93] = "\u000e\u0019J\bRfNIO];c7\u0019NV\u0002`S^M\u0014\u000447A\u0006\u0016K%X\u0010\b\fB]";
        objectArray[94] = "\r`\u0014J(*\\d\u000f#x\u007f7e\u0016\\#;](\u000eG4";
        objectArray[95] = "_R(o!@D\u00103(\u0019DFV+<\u007fSgM4<\\N_H0*\u0019J\u0004Mo3`\u0017F^=Q";
        objectArray[96] = "#H^dQnuW\u001cm</D\u001c_-\u0005- [\\o\u0003yDOX*G)%W\u001fo\u0000\u0010";
        objectArray[97] = "am\bV4=0i\u0013?fPd.\fX$:)6\u0017O";
        objectArray[98] = "Bpg%\u0019)J\"bp& \u0012.\u001d\"\u001f&\n4e{\u00187KH#%[\"\u000f0z\"Jcs";
        objectArray[99] = "j^g|\u0018C;Z|\u0015L.o\u001dcr\bD\"\u0005xe";
        objectArray[100] = "\u0010\u0012\f[3\u0017\tLKT\tWy\u001bOQ0Z\u001d\\L\u00136\u000eyHHVr^\u0018P\u000f\u00135g";
        objectArray[101] = "9#;~\u007fO~~3=\u000e\u000f\u0003n %n\u000bjg0~1";
        objectArray[102] = "o&$GV!f6\u007f\u0018itaZ9\u0017\u000e0!e+L\u001b5";
        objectArray[103] = "X\u000e/\u000eBP\u001a\n,[=\u0003\u001aq,S\u0006\u0005\\\u0015kPD\u0003\bq\u007fT\u0001GX\u0010g\u0013D\u0000a";
        objectArray[104] = "\u000fW\f\u0014;\u0013^S\u0017}i~\fULDj\u001aKV\u000eB>~T\u001d\f\r/\u0011\u0005\u0013\u0016\u0004W";
        objectArray[105] = "T\u0001V\u0000m\u0011L@D\u0007Q\u0003MUS2mW\u001b\u0001+[h\u0015SLS\u0002o\u0004\u00120";
        objectArray[106] = "f9s8TP=d{i-\u001cZa l\u0014\u0011>&#.\u0012EZf!*TP\"?&;\u0015,";
        objectArray[107] = "\u0014U\u001eIf\u001aS\b\u0016\n\u0017[.U\u0000\u000fp\u001dD\u0018\u0018\u0014g";
        Object[] objectArray2 = objectArray;
        objectArray[108] = "\u001f\u0016\u0002]y\u000bR\u000e\u0019J\u0005]ioBCz\u0006\\\u0005\u000f[a\u0011";
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0g.c(n, l2);
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
            throw new RuntimeException("dev/krypton/0g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x540F;
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
                throw new RuntimeException("dev/krypton/0g", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0g.j[n2] = n3;
        }
        return j[n2];
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
        int n = _0g.e(l2, l3);
        Object object = _0g.n[n];
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
                clazz3 = _0g.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0g.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0g.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0g.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0g.f(3845278266057417L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0g.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0g.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0g.f(3845278266057417L, 0L);
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
            int n = _0g.e(l2, l3);
            object = _0g.n[n];
            try {
                if (!(object instanceof String)) break block2;
                _0g.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0g.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0g.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0g.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0g.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x364A;
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
                throw new RuntimeException("dev/krypton/0g", exception);
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
            _0g.d[n2] = _0g.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _0g.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l2, long l3) {
        int n = _0g.e(l2, l3);
        Object object = _0g.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = _0g.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0g.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0g.c(clazz3, string2, clazz2)) != null) {
                    _0g.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0g.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0g.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0g.f(3845278266057417L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void void_6(Object[] objectArray) {
        boolean bl;
        class_11909 class_119092;
        _0g g;
        long l2;
        block24: {
            boolean bl2;
            block25: {
                class_11909 class_119093;
                block29: {
                    block26: {
                        boolean bl3;
                        CallSite callSite;
                        long l3;
                        long l4;
                        block30: {
                            block31: {
                                CallSite callSite2;
                                long l5;
                                long l6;
                                block27: {
                                    CallSite callSite3;
                                    boolean bl4;
                                    float f;
                                    reference var41_22;
                                    long l7;
                                    long l8;
                                    long l9;
                                    long l10;
                                    long l11;
                                    long l12;
                                    long l13;
                                    long l14;
                                    block23: {
                                        CallSite callSite4;
                                        long l15;
                                        block21: {
                                            long l16;
                                            block22: {
                                                class_119093 = (class_11909)objectArray[0];
                                                bl2 = (Boolean)objectArray[1];
                                                l4 = (Long)objectArray[2];
                                                long l17 = l4;
                                                l14 = l17 ^ 0x3059D873D7A4L;
                                                l13 = l17 ^ 0x342C0855248BL;
                                                l2 = l17 ^ 0L;
                                                l15 = l17 ^ 0x169F3D91BE80L;
                                                l16 = l17 ^ 0x266A952A6870L;
                                                long l18 = l17 ^ 0x6CE6015CE0E6L;
                                                l12 = l17 ^ 0x10198DA2A555L;
                                                l6 = l17 ^ 0x210B104BD2FCL;
                                                l5 = l17 ^ 0x553012711C9CL;
                                                l11 = l17 ^ 0x159928865132L;
                                                long l19 = l17 ^ 0x69807B5797FEL;
                                                l3 = l17 ^ 0x2FBA94571A84L;
                                                l10 = l17 ^ 0x50C4BA6BF713L;
                                                l9 = l17 ^ 0x55318ED568DFL;
                                                long l20 = l17 ^ 0xC68E5426189L;
                                                l8 = l17 ^ 0x2963FB1DA0D6L;
                                                l7 = l17 ^ 0x67E9AEC79E9DL;
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l18;
                                                Object[] objectArray3 = new Object[1];
                                                objectArray3[0] = l20;
                                                var41_22 = _0g.e("\u00eb", (Object)this, (Object)objectArray2, 5520534853483473599L, (long)l4) + _0g.e("\u00eb", (Object)this, (Object)objectArray3, 5521126030732486742L, (long)l4) + _0g.e("\u00d2", (Object)this, 5521340179507628008L, (long)l4);
                                                Object[] objectArray4 = new Object[1];
                                                objectArray4[0] = l19;
                                                f = (float)_0g.e("\u00eb", (Object)_0g.e("n", 5519779758995181424L, (long)l4), (Object)objectArray4, 5513036630336521631L, (long)l4);
                                                bl4 = _02.cfr_renamed_2();
                                                try {
                                                    try {
                                                        Object[] objectArray5 = new Object[1];
                                                        objectArray5[0] = l8;
                                                        callSite4 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4), (Object)objectArray5, 5520043542410095330L, (long)l4);
                                                        if (bl4) break block21;
                                                        if (callSite4 == false) break block22;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _0g.a(matchException);
                                                    }
                                                    callSite3 = _0g.a("x", 5963, (long)(0x7EF9C4BD6B02ED8DL ^ l4));
                                                    break block23;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _0g.a(matchException);
                                                }
                                            }
                                            Object[] objectArray6 = new Object[1];
                                            objectArray6[0] = l16;
                                            callSite4 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4), (Object)objectArray6, 5519722899798198612L, (long)l4);
                                        }
                                        Object[] objectArray7 = new Object[2];
                                        objectArray7[1] = l15;
                                        objectArray7[0] = (int)callSite4;
                                        callSite3 = _0g.e("a", (Object)objectArray7, 5519637022922767826L, (long)l4);
                                    }
                                    CallSite callSite5 = callSite3;
                                    Object[] objectArray8 = new Object[2];
                                    objectArray8[1] = l14;
                                    objectArray8[0] = callSite5;
                                    float f2 = (float)_0g.e("\u00eb", (Object)_0g.e("n", 5519779758995181424L, (long)l4), (Object)objectArray8, 5518835275324187843L, (long)l4);
                                    CallSite callSite6 = _0g.e("a", (float)(f2 + 20.0f), 60.0f, 5520675589672856040L, (long)l4);
                                    float f3 = f + 8.0f;
                                    Object[] objectArray9 = new Object[1];
                                    objectArray9[0] = l11;
                                    Object[] objectArray10 = new Object[1];
                                    objectArray10[0] = l10;
                                    float f4 = (float)(_0g.e("\u00eb", (Object)this, (Object)objectArray9, 5520001942347178784L, (long)l4) + _0g.e("\u00eb", (Object)this, (Object)objectArray10, 5520392706538726306L, (long)l4)) - callSite6 - 5.0f;
                                    Object[] objectArray11 = new Object[1];
                                    objectArray11[0] = l13;
                                    float f5 = (float)var41_22 + ((float)_0g.e("\u00eb", (Object)this, (Object)objectArray11, 5513102211146585898L, (long)l4) - f3) / 2.0f;
                                    try {
                                        try {
                                            block28: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    g = this;
                                                                    class_119092 = class_119093;
                                                                    bl = bl4;
                                                                    if (l4 <= 0L) break block24;
                                                                    if (bl) break block25;
                                                                    Object[] objectArray12 = new Object[7];
                                                                    objectArray12[6] = Float.valueOf(f3);
                                                                    objectArray12[5] = Float.valueOf((float)callSite6);
                                                                    objectArray12[4] = Float.valueOf(f5);
                                                                    objectArray12[3] = Float.valueOf(f4);
                                                                    objectArray12[2] = l12;
                                                                    objectArray12[1] = (double)_0g.e("\u00eb", (Object)class_119093, 5518613149539317360L, (long)l4);
                                                                    objectArray12[0] = (double)_0g.e("\u00eb", (Object)class_119092, 5521366508255260715L, (long)l4);
                                                                    if (_0g.e("\u00eb", (Object)g, (Object)objectArray12, 5518720710538577825L, (long)l4) == false) break block26;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _0g.a(matchException);
                                                                }
                                                                Object[] objectArray13 = new Object[1];
                                                                objectArray13[0] = l8;
                                                                callSite2 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4), (Object)objectArray13, 5520043542410095330L, (long)l4);
                                                                if (l4 <= 0L || bl4) break block27;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _0g.a(matchException);
                                                            }
                                                            if (callSite2 != false) break block28;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _0g.a(matchException);
                                                        }
                                                        if (_0g.e("\u00eb", (Object)class_119093, 5519359637875341212L, (long)l4) != false) break block26;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _0g.a(matchException);
                                                    }
                                                    Object[] objectArray14 = new Object[1];
                                                    objectArray14[0] = l9;
                                                    _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4), (Object)objectArray14, 5520129150474899789L, (long)l4);
                                                    g = this;
                                                    if (l4 < 0L) break block29;
                                                    Object[] objectArray15 = new Object[2];
                                                    objectArray15[1] = l3;
                                                    objectArray15[0] = true;
                                                    _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)g, 5512870858469866406L, (long)l4), (Object)objectArray15, 5520299100965338807L, (long)l4);
                                                    if (!bl4) break block26;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _0g.a(matchException);
                                                }
                                            }
                                            callSite = _0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4);
                                            bl3 = bl4;
                                            if (l4 <= 0L) break block30;
                                            if (bl3) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw _0g.a(matchException);
                                        }
                                        Object[] objectArray16 = new Object[1];
                                        objectArray16[0] = l7;
                                        callSite2 = _0g.e("\u00eb", (Object)callSite, (Object)objectArray16, 5519415244348878941L, (long)l4);
                                    }
                                    catch (MatchException matchException) {
                                        throw _0g.a(matchException);
                                    }
                                }
                                try {
                                    if (callSite2 != false) {
                                        Object[] objectArray17 = new Object[2];
                                        objectArray17[1] = (int)_0g.e("\u00eb", (Object)class_119093, 5519359637875341212L, (long)l4);
                                        objectArray17[0] = l5;
                                        _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)_0g.e("\u00d2", (Object)this, 5518367381726534124L, (long)l4), 5518548839533855221L, (long)l4), (Object)objectArray17, 5513507017056527698L, (long)l4);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw _0g.a(matchException);
                                }
                                Object[] objectArray18 = new Object[2];
                                objectArray18[1] = l6;
                                objectArray18[0] = (int)_0g.e("\u00eb", (Object)class_119093, 5519359637875341212L, (long)l4);
                                _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4), (Object)objectArray18, 5513391490454357389L, (long)l4);
                                callSite = _0g.e("\u00d2", (Object)this, 5512870858469866406L, (long)l4);
                            }
                            bl3 = false;
                        }
                        Object[] objectArray19 = new Object[2];
                        objectArray19[1] = l3;
                        objectArray19[0] = bl3;
                        _0g.e("\u00eb", (Object)callSite, (Object)objectArray19, 5520299100965338807L, (long)l4);
                    }
                    g = this;
                }
                class_119092 = class_119093;
            }
            bl = bl2;
        }
        Object[] objectArray20 = new Object[3];
        objectArray20[2] = l2;
        objectArray20[1] = bl;
        objectArray20[0] = class_119092;
        super.void_6(objectArray20);
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_6(Object[] var1_1) {
        block20: {
            block17: {
                block19: {
                    block18: {
                        block16: {
                            var3_2 = (Double)var1_1[0];
                            var5_3 = (Double)var1_1[1];
                            var7_4 = (Long)var1_1[2];
                            var9_5 = ((Float)var1_1[3]).floatValue();
                            var11_6 = ((Float)var1_1[4]).floatValue();
                            var10_7 = ((Float)var1_1[5]).floatValue();
                            var2_8 = ((Float)var1_1[6]).floatValue();
                            var7_4 = _0g.a ^ var7_4;
                            var12_9 = _02.cfr_renamed_2();
                            try {
                                try {
                                    cfr_temp_0 = var3_2 - (double)var9_5;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (var12_9) break block16;
                                    if (v0 < 0) break block17;
                                }
                                catch (MatchException v1) {
                                    throw _0g.a(v1);
                                }
                                cfr_temp_1 = var3_2 - (double)(var9_5 + var10_7);
                                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (MatchException v2) {
                                throw _0g.a(v2);
                            }
                        }
                        try {
                            try {
                                v3 = var12_9;
                                if (var7_4 >= 0L) {
                                    if (v3) break block18;
                                    if (v0 > 0) break block17;
                                }
                                ** GOTO lbl45
                            }
                            catch (MatchException v4) {
                                throw _0g.a(v4);
                            }
                            cfr_temp_2 = var5_3 - (double)var11_6;
                            v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (MatchException v5) {
                            throw _0g.a(v5);
                        }
                    }
                    try {
                        try {
                            v3 = var12_9;
lbl45:
                            // 2 sources

                            if (var7_4 > 0L) {
                                if (v3) break block19;
                                if (v0 < 0) break block17;
                            }
                            ** GOTO lbl60
                        }
                        catch (MatchException v6) {
                            throw _0g.a(v6);
                        }
                        cfr_temp_3 = var5_3 - (double)(var11_6 + var2_8);
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (MatchException v7) {
                        throw _0g.a(v7);
                    }
                }
                try {
                    v3 = var12_9;
lbl60:
                    // 2 sources

                    if (v3) break block20;
                    if (v0 > 0) break block17;
                }
                catch (MatchException v8) {
                    throw _0g.a(v8);
                }
                v0 = (double)true;
                break block20;
            }
            v0 = (double)false;
        }
        return (boolean)v0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void void_4(Object[] var1_1) {
        block26: {
            block27: {
                block35: {
                    block36: {
                        block31: {
                            block32: {
                                block33: {
                                    block34: {
                                        block28: {
                                            var4_2 = (class_11908)var1_1[0];
                                            var2_3 = (Long)var1_1[1];
                                            v0 = var2_3;
                                            var5_4 = v0 ^ 55777992623866L;
                                            var7_5 = v0 ^ 77523376736410L;
                                            var9_6 = v0 ^ 66019409464962L;
                                            var11_7 = v0 ^ 0L;
                                            var13_8 = v0 ^ 64674560849104L;
                                            var15_9 = v0 ^ 127923149572763L;
                                            var17_10 = _02.cfr_renamed_2();
                                            try {
                                                try {
                                                    block29: {
                                                        block30: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v1 = this;
                                                                            if (var17_10) break block26;
                                                                            v2 = new Object[1];
                                                                            v2[0] = var13_8;
                                                                            if (_0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)v1, (long)6379266853739884448L, (long)var2_3), (Object)v2, (long)6385314733027688164L, (long)var2_3) == false) break block27;
                                                                        }
                                                                        catch (MatchException v3) {
                                                                            throw _0g.a(v3);
                                                                        }
                                                                        v4 = _0g.e("\u00eb", (Object)var4_2, (long)6385167856118994067L, (long)var2_3);
                                                                        v5 = _0g.c("v", (int)25183, (long)(9129354498522509011L ^ var2_3));
                                                                        if (var2_3 < 0L || var17_10) break block28;
                                                                    }
                                                                    catch (MatchException v6) {
                                                                        throw _0g.a(v6);
                                                                    }
                                                                    if (var2_3 <= 0L) break block29;
                                                                    if (v4 != v5) break block30;
                                                                }
                                                                catch (MatchException v7) {
                                                                    throw _0g.a(v7);
                                                                }
                                                                v8 = new Object[2];
                                                                v8[1] = var9_6;
                                                                v8[0] = false;
                                                                _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3), (Object)v8, (long)6384443429599210161L, (long)var2_3);
                                                                if (!var17_10) break block27;
                                                            }
                                                            catch (MatchException v9) {
                                                                throw _0g.a(v9);
                                                            }
                                                        }
                                                        v4 = _0g.e("\u00eb", (Object)var4_2, (long)6385167856118994067L, (long)var2_3);
                                                        if (var2_3 < 0L) break block31;
                                                        v10 = var17_10;
                                                    }
                                                    if (v10) break block31;
                                                }
                                                catch (MatchException v11) {
                                                    throw _0g.a(v11);
                                                }
                                                v5 = _0g.c("v", (int)14683, (long)(1371446786155099613L ^ var2_3));
                                            }
                                            catch (MatchException v12) {
                                                throw _0g.a(v12);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (v4 != v5) ** GOTO lbl115
                                                    v13 = _0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3);
                                                    v14 = var17_10;
                                                    if (var2_3 >= 0L) {
                                                        if (v14) break block32;
                                                    }
                                                    ** GOTO lbl109
                                                }
                                                catch (MatchException v15) {
                                                    throw _0g.a(v15);
                                                }
                                                v16 = new Object[1];
                                                v17 = v16;
                                                v16[0] = var15_9;
                                                v18 = 6385811089299235931L;
                                                v19 = var2_3;
                                                if (var2_3 <= 0L) break block33;
                                                if (_0g.e("\u00eb", (Object)v13, (Object)v17, (long)v18, (long)v19) == false) break block34;
                                            }
                                            catch (MatchException v20) {
                                                throw _0g.a(v20);
                                            }
                                            v21 = new Object[2];
                                            v21[1] = -1;
                                            v21[0] = var7_5;
                                            _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)_0g.e("\u00d2", (Object)this, (long)6382513630177234410L, (long)var2_3), (long)6382657713283487219L, (long)var2_3), (Object)v21, (long)6378780262815445332L, (long)var2_3);
                                        }
                                        catch (MatchException v22) {
                                            throw _0g.a(v22);
                                        }
                                    }
                                    v23 = _0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3);
                                    v24 = new Object[2];
                                    v24[1] = var5_4;
                                    v17 = v24;
                                    v24[0] = -1;
                                    v18 = 6378667074886406539L;
                                    v19 = var2_3;
                                }
                                _0g.e("\u00eb", (Object)v23, (Object)v17, (long)v18, (long)v19);
                                v13 = _0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3);
                            }
                            try {
                                try {
                                    v14 = false;
lbl109:
                                    // 2 sources

                                    v25 = new Object[2];
                                    v25[1] = var9_6;
                                    v25[0] = v14;
                                    _0g.e("\u00eb", (Object)v13, (Object)v25, (long)6384443429599210161L, (long)var2_3);
                                    if (var2_3 > 0L && !var17_10) break block27;
lbl115:
                                    // 2 sources

                                    v26 = _0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3);
                                    v27 = var17_10;
                                    if (var2_3 <= 0L) break block35;
                                    if (v27) break block36;
                                }
                                catch (MatchException v28) {
                                    throw _0g.a(v28);
                                }
                                v29 = new Object[1];
                                v29[0] = var15_9;
                                v4 = _0g.e("\u00eb", (Object)v26, (Object)v29, (long)6385811089299235931L, (long)var2_3);
                            }
                            catch (MatchException v30) {
                                throw _0g.a(v30);
                            }
                        }
                        try {
                            if (v4 != false) {
                                v31 = new Object[2];
                                v31[1] = (int)_0g.e("\u00eb", (Object)var4_2, (long)6385167856118994067L, (long)var2_3);
                                v31[0] = var7_5;
                                _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)_0g.e("\u00d2", (Object)this, (long)6382513630177234410L, (long)var2_3), (long)6382657713283487219L, (long)var2_3), (Object)v31, (long)6378780262815445332L, (long)var2_3);
                            }
                        }
                        catch (MatchException v32) {
                            throw _0g.a(v32);
                        }
                        v33 = new Object[2];
                        v33[1] = var5_4;
                        v33[0] = (int)_0g.e("\u00eb", (Object)var4_2, (long)6385167856118994067L, (long)var2_3);
                        _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3), (Object)v33, (long)6378667074886406539L, (long)var2_3);
                        v26 = _0g.e("\u00d2", (Object)this, (long)6379266853739884448L, (long)var2_3);
                    }
                    v27 = false;
                }
                v34 = new Object[2];
                v34[1] = var9_6;
                v34[0] = v27;
                _0g.e("\u00eb", (Object)v26, (Object)v34, (long)6384443429599210161L, (long)var2_3);
            }
            v1 = this;
        }
        v35 = new Object[2];
        v35[1] = var11_7;
        v35[0] = var4_2;
        super.void_4(v35);
    }

    @Override
    protected void void_8(Object[] objectArray) {
        CallSite callSite;
        double d;
        double d2;
        CallSite callSite2;
        _87 v46;
        Object object;
        CallSite callSite3;
        CallSite callSite4;
        float f;
        CallSite callSite5;
        float f2;
        CallSite callSite6;
        long l2;
        long l3;
        _87 var2_2;
        block22: {
            float f3;
            float f4;
            block23: {
                float f5;
                float f6;
                float f7;
                block24: {
                    CallSite callSite7;
                    boolean bl;
                    long l4;
                    long l5;
                    long l6;
                    long l7;
                    long l8;
                    long l9;
                    long l10;
                    long l11;
                    long l12;
                    long l13;
                    long l14;
                    block21: {
                        CallSite callSite8;
                        block19: {
                            CallSite callSite9;
                            block20: {
                                CallSite callSite10;
                                reference var69_36;
                                long l15;
                                long l16;
                                long l17;
                                long l18;
                                long l19;
                                long l20;
                                long l21;
                                long l22;
                                int n;
                                int n2;
                                block18: {
                                    CallSite callSite11;
                                    long l23;
                                    block16: {
                                        long l24;
                                        block17: {
                                            float f8;
                                            var2_2 = (_87)objectArray[0];
                                            n2 = (Integer)objectArray[1];
                                            n = (Integer)objectArray[2];
                                            l3 = (Long)objectArray[3];
                                            float f9 = ((Float)objectArray[4]).floatValue();
                                            long l25 = l3;
                                            l22 = l25 ^ 0x764D0226F048L;
                                            l14 = l25 ^ 0x332099301D7CL;
                                            l2 = l25 ^ 0x570C24C53811L;
                                            l13 = l25 ^ 0xDDCE291293EL;
                                            long l26 = l25 ^ 0x141FE0DB965BL;
                                            l21 = l25 ^ 0x7238D2000367L;
                                            l12 = l25 ^ 0x310130337E2AL;
                                            l24 = l25 ^ 0x607E4F7F4F9CL;
                                            long l27 = l25 ^ 0x2AF2DB09C70AL;
                                            l20 = l25 ^ 0x560D57F782B9L;
                                            l19 = l25 ^ 0x538DF2D376DEL;
                                            l18 = l25 ^ 0x16D0603ED0FFL;
                                            l11 = l25 ^ 0x7F2CE5EAB728L;
                                            l10 = l25 ^ 0x2942C15F9E3FL;
                                            l9 = l25 ^ 0x22B6A7D81325L;
                                            l17 = l25 ^ 0x6F772148873AL;
                                            l8 = l25 ^ 0x58144273CC5CL;
                                            l7 = l25 ^ 0x58FD0C4EDE34L;
                                            l23 = l25 ^ 0x508BE7C4996CL;
                                            l6 = l25 ^ 0x7A6C12932174L;
                                            long l28 = l25 ^ 0x2F94A102B012L;
                                            l5 = l25 ^ 0x6C6533DC12C4L;
                                            long l29 = l25 ^ 0x4A7C3F174665L;
                                            l16 = l25 ^ 0x34D41487C3D7L;
                                            l15 = l25 ^ 0x88823B1F239L;
                                            l4 = l25 ^ 0x203A80591513L;
                                            bl = _02.cfr_renamed_3();
                                            float f10 = f9 * 0.05f;
                                            try {
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l17;
                                                f8 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7741090460527483978L, (long)l3), (Object)objectArray2, 7743768371000233230L, (long)l3) != false ? 1.0f : 0.0f;
                                            }
                                            catch (MatchException matchException) {
                                                throw _0g.a(matchException);
                                            }
                                            float f11 = f8;
                                            Object[] objectArray3 = new Object[5];
                                            objectArray3[4] = (double)f10;
                                            objectArray3[3] = l26;
                                            objectArray3[2] = (double)0.35f;
                                            objectArray3[1] = (double)f11;
                                            objectArray3[0] = (double)_0g.e("\u00d2", (Object)this, 7742584914573064234L, (long)l3);
                                            _0g.e("\u00e3", (Object)this, (float)((float)_0g.e("a", (Object)objectArray3, 7741486479608534598L, (long)l3)), 7742584914573064234L, (long)l3);
                                            Object[] objectArray4 = new Object[1];
                                            objectArray4[0] = l27;
                                            Object[] objectArray5 = new Object[1];
                                            objectArray5[0] = l29;
                                            var69_36 = _0g.e("\u00eb", (Object)this, (Object)objectArray4, 7741871547985333587L, (long)l3) + _0g.e("\u00eb", (Object)this, (Object)objectArray5, 7742458292549308346L, (long)l3) + _0g.e("\u00d2", (Object)this, 7742808947944448004L, (long)l3);
                                            Object[] objectArray6 = new Object[1];
                                            objectArray6[0] = l28;
                                            f7 = (float)_0g.e("\u00eb", (Object)var2_2, (Object)objectArray6, 7741260667813487219L, (long)l3);
                                            try {
                                                try {
                                                    Object[] objectArray7 = new Object[1];
                                                    objectArray7[0] = l17;
                                                    callSite11 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7741090460527483978L, (long)l3), (Object)objectArray7, 7743768371000233230L, (long)l3);
                                                    if (!bl) break block16;
                                                    if (callSite11 == false) break block17;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _0g.a(matchException);
                                                }
                                                callSite10 = _0g.a("x", 2203, (long)(0x4818266634F355B0L ^ l3));
                                                break block18;
                                            }
                                            catch (MatchException matchException) {
                                                throw _0g.a(matchException);
                                            }
                                        }
                                        Object[] objectArray8 = new Object[1];
                                        objectArray8[0] = l24;
                                        callSite11 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7741090460527483978L, (long)l3), (Object)objectArray8, 7743298197557784248L, (long)l3);
                                    }
                                    Object[] objectArray9 = new Object[2];
                                    objectArray9[1] = l23;
                                    objectArray9[0] = (int)callSite11;
                                    callSite10 = _0g.e("a", (Object)objectArray9, 7743366387593304638L, (long)l3);
                                }
                                callSite6 = callSite10;
                                Object[] objectArray10 = new Object[2];
                                objectArray10[1] = l22;
                                objectArray10[0] = callSite6;
                                f2 = (float)_0g.e("\u00eb", (Object)var2_2, (Object)objectArray10, 7744662374438847279L, (long)l3);
                                callSite5 = _0g.e("a", (float)(f2 + 20.0f), 60.0f, 7742012279273278980L, (long)l3);
                                f6 = f7 + 8.0f;
                                Object[] objectArray11 = new Object[1];
                                objectArray11[0] = l19;
                                Object[] objectArray12 = new Object[1];
                                objectArray12[0] = l18;
                                f = (float)(_0g.e("\u00eb", (Object)this, (Object)objectArray11, 7743581745257432268L, (long)l3) + _0g.e("\u00eb", (Object)this, (Object)objectArray12, 7741716345941705806L, (long)l3)) - callSite5 - 5.0f;
                                Object[] objectArray13 = new Object[1];
                                objectArray13[0] = l21;
                                f5 = (float)var69_36 + ((float)_0g.e("\u00eb", (Object)this, (Object)objectArray13, 7741194441712808134L, (long)l3) - f6) / 2.0f;
                                Object[] objectArray14 = new Object[1];
                                objectArray14[0] = l19;
                                float f12 = f - (float)_0g.e("\u00eb", (Object)this, (Object)objectArray14, 7743581745257432268L, (long)l3) - 10.0f;
                                Object[] objectArray15 = new Object[1];
                                objectArray15[0] = l15;
                                Object[] objectArray16 = new Object[3];
                                objectArray16[2] = (double)f12;
                                objectArray16[1] = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7742629585303230651L, (long)l3), (Object)objectArray15, 7742158804265001805L, (long)l3);
                                objectArray16[0] = l16;
                                CallSite callSite12 = _0g.e("\u00eb", (Object)var2_2, (Object)objectArray16, 7741311604569267696L, (long)l3);
                                Object[] objectArray17 = new Object[1];
                                objectArray17[0] = l19;
                                Object[] objectArray18 = new Object[5];
                                objectArray18[4] = _0g.e("n", 7744767468191107313L, (long)l3);
                                objectArray18[3] = (double)(var69_36 + _0g.c("v", 28388, (long)(0x2DFBED2E3581518DL ^ l3)));
                                objectArray18[2] = (double)(_0g.e("\u00eb", (Object)this, (Object)objectArray17, 7743581745257432268L, (long)l3) + 5);
                                objectArray18[1] = callSite12;
                                objectArray18[0] = l2;
                                _0g.e("\u00eb", (Object)var2_2, (Object)objectArray18, 7742341327585417572L, (long)l3);
                                Object[] objectArray19 = new Object[7];
                                objectArray19[6] = Float.valueOf(f6);
                                objectArray19[5] = Float.valueOf((float)callSite5);
                                objectArray19[4] = Float.valueOf(f5);
                                objectArray19[3] = Float.valueOf(f);
                                objectArray19[2] = l20;
                                objectArray19[1] = (double)n;
                                objectArray19[0] = (double)n2;
                                callSite9 = _0g.e("\u00eb", (Object)this, (Object)objectArray19, 7744547777977999437L, (long)l3);
                                Object[] objectArray20 = new Object[1];
                                objectArray20[0] = l17;
                                callSite4 = _0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7741090460527483978L, (long)l3), (Object)objectArray20, 7743768371000233230L, (long)l3);
                                try {
                                    try {
                                        callSite8 = callSite4;
                                        if (l3 < 0L || !bl) break block19;
                                        if (callSite8 == false) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw _0g.a(matchException);
                                    }
                                    callSite7 = _0g.e("n", 7744030522769861355L, (long)l3);
                                    break block21;
                                }
                                catch (MatchException matchException) {
                                    throw _0g.a(matchException);
                                }
                            }
                            callSite8 = callSite9;
                        }
                        try {
                            callSite7 = callSite8 != false ? _0g.e("n", 7744165281071572262L, (long)l3) : _0g.e("n", 7742293718194313721L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw _0g.a(matchException);
                        }
                    }
                    CallSite callSite13 = callSite7;
                    try {
                        Object[] objectArray21 = new Object[1];
                        objectArray21[0] = l10;
                        _0g.e("\u00eb", (Object)_0g.e("n", 7743104587626682933L, (long)l3), (Object)objectArray21, 7744501218667462838L, (long)l3);
                        Object[] objectArray22 = new Object[1];
                        objectArray22[0] = l12;
                        Object[] objectArray23 = new Object[1];
                        objectArray23[0] = l14;
                        _0g.e("\u00eb", (Object)_0g.e("a", (Object)objectArray22, 7742816892353820072L, (long)l3), (Object)objectArray23, 7744250404033945829L, (long)l3);
                        Object[] objectArray24 = new Object[14];
                        objectArray24[13] = false;
                        objectArray24[12] = 1.0;
                        objectArray24[11] = l5;
                        objectArray24[10] = _0g.e("n", 7742231461282645803L, (long)l3);
                        objectArray24[9] = _0g.e("n", 7743818466434863258L, (long)l3);
                        objectArray24[8] = callSite13;
                        objectArray24[7] = 5.0;
                        objectArray24[6] = 5.0;
                        objectArray24[5] = 5.0;
                        objectArray24[4] = 5.0;
                        objectArray24[3] = (double)(f5 + f6);
                        objectArray24[2] = (double)(f + callSite5);
                        objectArray24[1] = (double)f5;
                        objectArray24[0] = (double)f;
                        _0g.e("a", (Object)objectArray24, 7743941304940039887L, (long)l3);
                        Object[] objectArray25 = new Object[1];
                        objectArray25[0] = l12;
                        Object[] objectArray26 = new Object[1];
                        objectArray26[0] = l8;
                        _0g.e("\u00eb", (Object)_0g.e("a", (Object)objectArray25, 7742816892353820072L, (long)l3), (Object)objectArray26, 7743172032557595937L, (long)l3);
                        Object[] objectArray27 = new Object[1];
                        objectArray27[0] = l9;
                        _0g.e("\u00eb", (Object)_0g.e("n", 7743104587626682933L, (long)l3), (Object)objectArray27, 7742934663341689485L, (long)l3);
                        callSite3 = _0g.e("\u00d2", (Object)this, 7742584914573064234L, (long)l3);
                        if (l3 < 0L) break block22;
                        f4 = 0.01f;
                        if (!bl) break block23;
                        if (!(callSite3 > f4)) break block24;
                    }
                    catch (MatchException matchException) {
                        throw _0g.a(matchException);
                    }
                    object = (float)_0g.e("a", (double)_0g.e("a", (double)((double)_0g.e("a", 7743918435263576156L, (long)l3) / 500.0), 7744087956684163591L, (long)l3), 7741429988970332936L, (long)l3) * 0.2f * _0g.e("\u00d2", (Object)this, 7742584914573064234L, (long)l3);
                    Object[] objectArray28 = new Object[1];
                    objectArray28[0] = l4;
                    Object[] objectArray29 = new Object[1];
                    objectArray29[0] = l6;
                    Object[] objectArray30 = new Object[1];
                    objectArray30[0] = l7;
                    _8B b = new _8B((int)_0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7742468744385897794L, (long)l3), (Object)objectArray28, 7741946765014981985L, (long)l3), (int)_0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7742468744385897794L, (long)l3), (Object)objectArray29, 7743410396367106748L, (long)l3), l13, (int)_0g.e("\u00eb", (Object)_0g.e("\u00d2", (Object)this, 7742468744385897794L, (long)l3), (Object)objectArray30, 7741363609266221200L, (long)l3), (int)(255.0f * object));
                    Object[] objectArray31 = new Object[10];
                    objectArray31[9] = 5.0;
                    objectArray31[8] = 5.0;
                    objectArray31[7] = 5.0;
                    objectArray31[6] = 5.0;
                    objectArray31[5] = l11;
                    objectArray31[4] = (double)(f5 + f6);
                    objectArray31[3] = (double)(f + callSite5);
                    objectArray31[2] = (double)f5;
                    objectArray31[1] = (double)f;
                    objectArray31[0] = b;
                    _0g.e("\u00eb", (Object)var2_2, (Object)objectArray31, 7742095177157404673L, (long)l3);
                }
                f3 = f5 + f6 / 2.0f - f7 / 2.0f;
                f4 = 1.0f;
            }
            callSite3 = f3 + f4;
        }
        object = callSite3;
        float f13 = f + (callSite5 - f2) / 2.0f;
        try {
            v46 = var2_2;
            callSite2 = callSite6;
            d2 = f13;
            d = (double)object;
            callSite = callSite4 != false ? _0g.e("n", 7744841007070276747L, (long)l3) : _0g.e("\u00d2", (Object)this, 7742468744385897794L, (long)l3);
        }
        catch (MatchException matchException) {
            throw _0g.a(matchException);
        }
        CallSite callSite14 = callSite;
        double d3 = d;
        double d4 = d2;
        CallSite callSite15 = callSite2;
        Object[] objectArray32 = new Object[5];
        objectArray32[4] = callSite14;
        objectArray32[3] = d3;
        objectArray32[2] = d4;
        objectArray32[1] = callSite15;
        objectArray32[0] = l2;
        _0g.e("\u00eb", (Object)v46, (Object)objectArray32, 7742341327585417572L, (long)l3);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0g.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0g.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(_0g.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

