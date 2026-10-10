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
import dev.krypton._9E;
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

public class _0y
extends _0v {
    private final _9E cfr_renamed_48;
    private final _8B cfr_renamed_4;
    private final _8B cfr_renamed_49;
    private final _8B cfr_renamed_5;
    private final _8B cfr_renamed_50;
    private final _8B cfr_renamed_2;
    private final _8B cfr_renamed_1;
    private final float cfr_renamed_51;
    private final float cfr_renamed_8;
    private final float cfr_renamed_9;
    private final float cfr_renamed_52;
    private static final long a;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    @Override
    public void cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        super.cfr_renamed_5(objectArray2);
    }

    public _0y(_4t t, _95 var2_2, long l2, int n) {
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x3E782A5D6D66L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x75DDDD26879AL;
        long l6 = l3 ^ 0x13A0A6E40A0BL;
        super((short)n2, t, var2_2, n, n3, (char)n4);
        this.cfr_renamed_4 = new _8B((int)_0y.a("z", 19623, (long)(0xF6E5B1AD5D4635BL ^ l2)), (int)_0y.a("z", 24493, (long)(0x5B2546E88FB2704EL ^ l2)), l5, (int)_0y.a("z", 12933, (long)(0x739658802D431D64L ^ l2)), (int)_0y.a("z", 23377, (long)(0x2F1B83E098DFF4BDL ^ l2)));
        this.cfr_renamed_49 = new _8B((int)_0y.a("z", 13175, (long)(0x238EEA9E921B1C9EL ^ l2)), (int)_0y.a("z", 32163, (long)(0x730BB97D4E4CD248L ^ l2)), l5, (int)_0y.a("z", 15085, (long)(0x40CC0215A1A21505L ^ l2)), (int)_0y.a("z", 21811, (long)(0x4079359F22687AD6L ^ l2)));
        this.cfr_renamed_5 = new _8B((int)_0y.a("z", 3161, (long)(0x444833614AA423A0L ^ l2)), (int)_0y.a("z", 28739, (long)(0x16D8AA1B0C6E5FBCL ^ l2)), l5, (int)_0y.a("z", 28739, (long)(0x16D8AA1B0C6E5FBCL ^ l2)), (int)_0y.a("z", 24493, (long)(0x5B2546E88FB2704EL ^ l2)));
        this.cfr_renamed_50 = new _8B((int)_0y.a("z", 28739, (long)(0x16D8AA1B0C6E5FBCL ^ l2)), (int)_0y.a("z", 28739, (long)(0x16D8AA1B0C6E5FBCL ^ l2)), l5, (int)_0y.a("z", 28739, (long)(0x16D8AA1B0C6E5FBCL ^ l2)), (int)_0y.a("z", 23943, (long)(0x3BB608C7A259726DL ^ l2)));
        this.cfr_renamed_2 = new _8B((int)_0y.a("z", 28537, (long)(0x29552D1347EF4099L ^ l2)), l6, (int)_0y.a("z", 4653, (long)(0x7397E6CD4B98BDCAL ^ l2)), (int)_0y.a("z", 31014, (long)(0x25CD4DF437F556D8L ^ l2)));
        this.cfr_renamed_1 = new _8B((int)_0y.a("z", 5534, (long)(0x79C08EAA2433BA7CL ^ l2)), l6, (int)_0y.a("z", 230, (long)(0x66A21B735836AF09L ^ l2)), (int)_0y.a("z", 1435, (long)(0x35980982D7C2A7DL ^ l2)));
        this.cfr_renamed_51 = 5.0f;
        this.cfr_renamed_8 = 8.0f;
        this.cfr_renamed_9 = 3.5f;
        this.cfr_renamed_52 = 5.0f;
        this.cfr_renamed_48 = (_9E)var2_2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                _0y.a = l.a(2164441392902281754L, -454288306858878405L, MethodHandles.lookup().lookupClass()).a(271490966540586L);
                _0y.i = new Object[84];
                _0y.j = new String[84];
                _0y.b();
                _0y.e = new HashMap<K, V>(13);
                var0 = _0y.a ^ 115217650766110L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "\u00c8aWk\u0019\u0089\u00ad\u00da\u00bd\u00bf\u0088',\u00a4OT\u0089\u0094F\"\u00c1\u00ab\u0097\u00d0bC{\u00b6\u00e9\u00e3\u00f4\u00cb}\u00a1A\u001e\u00b9\u001d\u00c6\u00ac\u00e5]\u000f\u0018\u00b8\u00ea\u00c1\u0087\u00c8\u00c78\u00eb\u00e9\u0095\u00f85L\u008c\u00e5a\u0014\u00d6\u00a7b\u0018\u001cp\u00a6\u000e#en\u0010\u00de\u0093\nW\u00f4b0t\u00f8yl\u00c9\u0090\u00d2/\u0087\u00c1B\u00e9\u00f4G\u00e7{\u00a4\u0001\u00a8nE1\u00c6\u00f4X\u00acj\u001c\u00867\fw\u00d5\\\u00ad\u00ca\u00e7\u00993\u001d*O\u00f1\\\u0010\u0090\u00d3\u00b0{\u00cb\u00c7T\"u\u00f9\u00a1\u0014\u00ef\u000b?\u00f7\u00d4\u00e2\u00c4c\u008f\u00e0M\u0088NW\u00be";
                var7_6 = "\u00c8aWk\u0019\u0089\u00ad\u00da\u00bd\u00bf\u0088',\u00a4OT\u0089\u0094F\"\u00c1\u00ab\u0097\u00d0bC{\u00b6\u00e9\u00e3\u00f4\u00cb}\u00a1A\u001e\u00b9\u001d\u00c6\u00ac\u00e5]\u000f\u0018\u00b8\u00ea\u00c1\u0087\u00c8\u00c78\u00eb\u00e9\u0095\u00f85L\u008c\u00e5a\u0014\u00d6\u00a7b\u0018\u001cp\u00a6\u000e#en\u0010\u00de\u0093\nW\u00f4b0t\u00f8yl\u00c9\u0090\u00d2/\u0087\u00c1B\u00e9\u00f4G\u00e7{\u00a4\u0001\u00a8nE1\u00c6\u00f4X\u00acj\u001c\u00867\fw\u00d5\\\u00ad\u00ca\u00e7\u00993\u001d*O\u00f1\\\u0010\u0090\u00d3\u00b0{\u00cb\u00c7T\"u\u00f9\u00a1\u0014\u00ef\u000b?\u00f7\u00d4\u00e2\u00c4c\u008f\u00e0M\u0088NW\u00be".length();
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
                    var6_5 = "\u00c0,\u000e\u000b@'\"\u00e3\u00d0\u00bd\u00d7\u009f\u001d\u00c2\u00bfX";
                    var7_6 = "\u00c0,\u000e\u000b@'\"\u00e3\u00d0\u00bd\u00d7\u009f\u001d\u00c2\u00bfX".length();
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
        _0y.c = var8_3;
        _0y.d = new Integer[21];
    }

    private static int e(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 3;
            case 1 -> 15;
            case 2 -> 40;
            case 3 -> 28;
            case 4 -> 36;
            case 5 -> 13;
            case 6 -> 60;
            case 7 -> 25;
            case 8 -> 18;
            case 9 -> 49;
            case 10 -> 54;
            case 11 -> 21;
            case 12 -> 44;
            case 13 -> 38;
            case 14 -> 59;
            case 15 -> 17;
            case 16 -> 32;
            case 17 -> 24;
            case 18 -> 26;
            case 19 -> 8;
            case 20 -> 43;
            case 21 -> 39;
            case 22 -> 10;
            case 23 -> 34;
            case 24 -> 12;
            case 25 -> 53;
            case 26 -> 58;
            case 27 -> 6;
            case 28 -> 9;
            case 29 -> 61;
            case 30 -> 4;
            case 31 -> 46;
            case 32 -> 51;
            case 33 -> 22;
            case 34 -> 7;
            case 35 -> 45;
            case 36 -> 62;
            case 37 -> 20;
            case 38 -> 0;
            case 39 -> 5;
            case 40 -> 16;
            case 41 -> 52;
            case 42 -> 37;
            case 43 -> 63;
            case 44 -> 50;
            case 45 -> 30;
            case 46 -> 1;
            case 47 -> 48;
            case 48 -> 35;
            case 49 -> 57;
            case 50 -> 56;
            case 51 -> 19;
            case 52 -> 23;
            case 53 -> 14;
            case 54 -> 47;
            case 55 -> 55;
            case 56 -> 33;
            case 57 -> 29;
            case 58 -> 42;
            case 59 -> 31;
            case 60 -> 2;
            case 61 -> 41;
            case 62 -> 11;
            default -> 27;
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
        _0y.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Q' || c == '\u00f8' || c == '\u00e7' || c == '\u00a5') {
                field = _0y.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Q' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _0y.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _0y.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = i;
        i[0] = ";M3x\u0001\u0019;M$$\r\u0016!\u0006$:\r\u0003&wvgU@l";
        objectArray[1] = Integer.TYPE;
        _0y.j[1] = "java/lang/Integer";
        objectArray[2] = "(^}y\u000015K\u007f8\u0005m|B";
        objectArray[3] = "\bB\u001f5Gb\u0015W\u001dtB>Ub";
        objectArray[4] = "M'v\u0002b\u00068\u0007}\rsIY\tv\u0006w\u0013-";
        objectArray[5] = Void.TYPE;
        _0y.j[5] = "java/lang/Void";
        objectArray[6] = "\u0015>rv5N`\u001eyy$\u0001\u0001\u0010rr [u";
        objectArray[7] = "c{H6[.~nJw^r7h";
        objectArray[8] = "J\u0007\u000fHX=?'\u0004GIr^)\u000fLM(*";
        objectArray[9] = Boolean.TYPE;
        _0y.j[9] = "java/lang/Boolean";
        objectArray[10] = Double.TYPE;
        _0y.j[10] = "java/lang/Double";
        objectArray[11] = "jj \u0001h\u0005\u001fJ+\u000eyJ~D \u0005}\u0010\n";
        objectArray[12] = "D?B%C%1\u001fI*RjP\u0011B!V0$";
        objectArray[13] = "\br1W\u0005D\u0015g3\u0016\u0000\u0018Xc";
        objectArray[14] = "h\tC(f4h\tTtj;rBTjj.u3\u000672m>";
        objectArray[15] = "\u0012`9gJ\u0012\u000fu;&ONEK";
        objectArray[16] = "-\u001c30 (X<8?1g92345=M";
        objectArray[17] = "9LhN;N$Yj\u000f>\u0012e\u001e";
        objectArray[18] = "@Zf5x=5zm:irTtf1m( ";
        objectArray[19] = "!s\u001c^\n5TS\u0017Q\u001bz5]\u001cZ\u001f A";
        objectArray[20] = "\f\u0016)_\u0004G\u0007\u00198\u0010y_\u0014\u001e1Y";
        objectArray[21] = "\u0019\u0000iWsD\u0004\u0015k\u0016v\u0018M ";
        objectArray[22] = "##T~X]V\u0003_qI\u00127\rTzMHC";
        objectArray[23] = "\u001c\r\u0017.\b\\\u0017\u0002\u0006ac^\u0003\u0001";
        objectArray[24] = "WQH#3\u007fJDJb6#\u000bv";
        objectArray[25] = "e1Y\u000e_4\u0010\u0011R\u0001N{q\u001fY\nJ!\u0005";
        objectArray[26] = "3[t}PxF{\u007frA7'utyEmS";
        objectArray[27] = "d42\u0001}o\u0011\u00149\u000el p\u001a2\u0005hz\u0004";
        objectArray[28] = "(\u0004N\\>|5\u0011L\u001d; uT";
        objectArray[29] = "\rNB\u000eZ(xnI\u0001Kg\u0019`B\nO=m";
        objectArray[30] = "X+Z_]kE>X\u001eX7\u0005v";
        objectArray[31] = "b\u0001Cs\u001b=\u0017!H|\nrv/Cw\u000e(\u0002";
        objectArray[32] = "\u001d\u0014yW\r*h4rX\u001ce\t:yS\u0018?}";
        objectArray[33] = "\u007fT~7F\f\ntu8WCkz~3S\u0019\u001f";
        objectArray[34] = "F\n\u0004.(\u00143*\u000f!9[R$\u0004*=\u0001&";
        objectArray[35] = "OS2ziC:s9ux\f[}2~|V/";
        objectArray[36] = "\u0002\"q# 8w\u0002z,1w\u0016\fq'5-b";
        objectArray[37] = " \u0012;`\u0019hU20o\b'4<;d\f}@";
        objectArray[38] = "RD`(Sy'dk'B6Fj`,Fl2";
        objectArray[39] = "9B\u0011\f\b$Lb\u001a\u0003\u0019k-l\u0011\b\u001d1Y";
        objectArray[40] = "J+\u0004#V2?\u000b\u000f,G}^\u0005\u0004'C'*";
        objectArray[41] = "JxT\u0019h\"AwEV\t,J|A\f";
        objectArray[42] = "\u0015zwU\u0014\u000b\u0016?l;A\u001aP iWsH\u0010z2\u0006$N@*w_Z\r\u0011\u007f5;";
        objectArray[43] = "5l\bBM\u001f`y]\u000e#R\\~\u001d\u0010\u001f\f!+\bES";
        objectArray[44] = "\u0005RrS^C]KrF`\u001d9WsJXFEVbC\u0007,\u0000AiC\u0004RC\u0010<\u0001`";
        objectArray[45] = "Q\r@T \u001cQ\n\u0002\u0010G\u001c:JK\\\u007fGFKZU -\u0005URQ%G\u000b\u0001_@G";
        objectArray[46] = "aw|H>\u000eap>\fY\u0003\n0w@aUv1fI>?g&fI+Ufu|OY";
        objectArray[47] = "[rB\"-uS2ZdTv57Kol I6Zf3J\u000e6X`:.[sZ\"T";
        objectArray[48] = "!1}o|k*4ut\u0007kTW,fl+/*o\u007fln";
        objectArray[49] = "\u007f,mD3a,pc\u000fM:E0vFui91gO*\u0003~1eI#g+tg\u000bM";
        objectArray[50] = "^xl<k0Qb& S9Xwp@>3Pko*?`Jm\u001d";
        objectArray[51] = "|F-\u001b6/=^c\u0012V\u007fEJnZ-~<Kf[<";
        objectArray[52] = "\u001c\u0015\u001a0/\u001cD\f\u001a%\u0011N \u0010\u001b))\u0019\\\u0011\n vs\u0019\u0006\u0001 u\rZWTb\u0011";
        objectArray[53] = "\u0012b\u0014n\u0011IJ{\u0014{/\u0018.g\u0015w\u0017LRf\u0004~H&\u0017q\u000f~KXT Z</";
        objectArray[54] = "V\u007f<t})_40k\u001a\"\nx<cv\u0010X8f>*G^h6}~9\u001d9c?\u001a";
        objectArray[55] = "\n>W\r\\\u0011YbYF\"M0\"L\u000f\u001a\u0019L#]\u0006Es\u000b#_\u0000L\u0017^f]B\"";
        objectArray[56] = ";l/U\u001f<zta\\\u007fd\u0002`l\u0014\u0004m{ad\u0015\u0015";
        objectArray[57] = "\u001ee0BX!F|0Wfq\"`1[^$^a R\u0001N\u001bv+R\u00020X'~\u0010f";
        objectArray[58] = "T\n_'u@\f\u0013_2K\u001fhKE%7\u0010\u0015\b\\%r";
        objectArray[59] = " G:J|]:W,DMZBB0Zu\r>C!S*g/T!S?\r.\u0007;UM";
        objectArray[60] = "q9\u0016\u0013e*0!X\u001a\u0005t$ZHQt0x#IYu!";
        objectArray[61] = "\u0007N2~E\u000eFV|w%PC-9(N\u001d@Ojt@V";
        objectArray[62] = "\u0014r6$OG\u001ep.g>\u0014wt /\u0006A\u000bu1&Y+Lu3 PO\u001901b>";
        objectArray[63] = "y\u0005N$\u0007o*Y@oy<C\u0019U&Ag?\u0018D/\u001e\r,\tT*Ab#\u0013\u001e6y";
        objectArray[64] = "E\u0000eGfL\u0016\\k\f\u0018\u001f\u007f\u001c~E D\u0003\u001doL\u007f.D\u001dmJvJ\u0011Xo\b\u0018";
        objectArray[65] = "bFp7\u0003\u000f#^>>cP[J3v\u0018^\"K;w\t";
        objectArray[66] = "\u0015,B9Gy\u0015+\u0000} t~kI1\u0018\"\u0002jX8GHAtP<B\"O ]- ";
        objectArray[67] = "e\rg\u0000%w$\u0015)\tE.\\\u0001$A>&%\u0000,@/";
        objectArray[68] = "@\u0015v{\u0002m\u0018\fvn<8|\u0010wb\u0004h\u0000\u0011fk[\u0002E\u0006mkX|\u0006W8)<";
        objectArray[69] = "w1! fO/(!5X\u001dpN?;)[{7>3(J";
        objectArray[70] = "~\u001aWWj9vZO\u0011\u00136\u0010_^\u001a+ll^O\u0013t\u0006+^M\u0015}b~\u001bOW\u0013";
        objectArray[71] = "\u0013\u000fG\\0{K\u0016GI\u000e)/\nFE6~S\u000bWLi\u0014\u0011\u001b]I1iR\u0002]\f\u000e";
        objectArray[72] = "zV\u0000\u007f?\n\"O\u0000j\u0001^F\u0018\u0017yc\u001ez\u0013\u0012qx";
        objectArray[73] = "\u0003XLr\u0016>\u0000\u001dW\u001cM%_\u001ab \u0019s\nb\nyO?X\b\u0004-B.:";
        objectArray[74] = "[KaEk\u0007\u000e^4\t\u0005EI0u\tuBXLt\u0018|\u001d2\u000bt\u001az\u0014V^1\u00188z";
        objectArray[75] = "h#\u001ev\u0013=);P\u007fsch@@4\u0002'a9A<\u00036";
        objectArray[76] = "CcIs\u0006\u000e\u001bzIf8]\u007f%TpA\u0005\u0001f\u0005%\u0003";
        objectArray[77] = ".7iI\u001fu-rr'DnruG\u001b\u00108&\r/BFtug!\u0016Ke\u0017";
        objectArray[78] = "$[b\u0019\u001b|,\u001bz_bxJ\u001ekTZ)6\u001fz]\u0005C$[b\u0019\u001b|,\u001bz_b";
        objectArray[79] = "d\u000fx~\u0011ed\b::vmj2yv\u0006leNxg\u000f3\u000f\txe\t:k\\=gKT";
        objectArray[80] = "\r3t\u000bLg^oz@247/o\t\noK.~\u0000U\u0005\u000e9u\u0000V{Mh B2";
        objectArray[81] = "r\nmq9\u001ar\r/5^\u001b\u0019MfyfAeLwp9+&R\u007ft<A(\u0006re^";
        objectArray[82] = "T!!3\u000f?\f8!&1jh1\"+J`\u00110**[";
        Object[] objectArray2 = objectArray;
        objectArray[83] = ",V\u001a3*ByCO\u007fD\u0006EW\u0004\u007f|U9V\u0015v#?~V\u0017p*[+\u0013\u00152D";
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _0y.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = _0y.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _0y.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _0y.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _0y.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _0y.f(2918188560331888L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _0y.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _0y.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _0y.f(2918188560331888L, 0L);
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
            int n = _0y.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _0y.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _0y.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _0y.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _0y.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _0y.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x6A29;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            long l3 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l4);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/0y", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _0y.d[n2] = n3;
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/0y" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _0y.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _0y.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _0y.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _0y.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _0y.c(clazz3, string2, clazz2)) != null) {
                    _0y.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _0y.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _0y.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _0y.f(2918188560331888L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void void_6(Object[] var1_1) {
        block20: {
            block24: {
                block21: {
                    block25: {
                        block22: {
                            var4_2 = (class_11909)var1_1[0];
                            var5_3 = (Boolean)var1_1[1];
                            var2_4 = (Long)var1_1[2];
                            v0 = var2_4;
                            var6_5 = v0 ^ 3262441043524L;
                            var8_6 = v0 ^ 11147916322277L;
                            var10_7 = v0 ^ 65135379347419L;
                            var12_8 = v0 ^ 45900142555803L;
                            var14_9 = v0 ^ 0L;
                            var16_10 = v0 ^ 77456974132941L;
                            var18_11 = _02.cfr_renamed_2();
                            try {
                                block23: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v1 = this;
                                                    v2 = var4_2;
                                                    if (var18_11 != 0) break block20;
                                                    v3 = new Object[3];
                                                    v3[2] = var8_6;
                                                    v3[1] = (double)_0y.c("\u00ee", (Object)var4_2, (long)5521177667761280007L, (long)var2_4);
                                                    v3[0] = (double)_0y.c("\u00ee", (Object)v2, (long)5520905230043605990L, (long)var2_4);
                                                    if (_0y.c("\u00ee", (Object)v1, (Object)v3, (long)5520743195153161783L, (long)var2_4) == false) break block21;
                                                }
                                                catch (MatchException v4) {
                                                    throw _0y.a(v4);
                                                }
                                                v5 = _0y.c("\u00ee", (Object)var4_2, (long)5514340562801129778L, (long)var2_4);
                                                v6 = var18_11;
                                                if (var2_4 >= 0L) {
                                                    if (v6 != 0) break block22;
                                                }
                                                ** GOTO lbl66
                                            }
                                            catch (MatchException v7) {
                                                throw _0y.a(v7);
                                            }
                                            if (var2_4 <= 0L) break block22;
                                            if (v5 != false) break block23;
                                        }
                                        catch (MatchException v8) {
                                            throw _0y.a(v8);
                                        }
                                        v1 = this;
                                        if (var2_4 < 0L) break block24;
                                        v9 = new Object[1];
                                        v9[0] = var10_7;
                                        _0y.c("\u00ee", (Object)_0y.c("Q", (Object)v1, (long)5513267668419371289L, (long)var2_4), (Object)v9, (long)5512843550889471514L, (long)var2_4);
                                        if (var18_11 == 0) break block21;
                                    }
                                    catch (MatchException v10) {
                                        throw _0y.a(v10);
                                    }
                                }
                                v5 = _0y.c("\u00ee", (Object)var4_2, (long)5514340562801129778L, (long)var2_4);
                            }
                            catch (MatchException v11) {
                                throw _0y.a(v11);
                            }
                        }
                        try {
                            block26: {
                                try {
                                    try {
                                        v6 = 1;
lbl66:
                                        // 2 sources

                                        if (var2_4 <= 0L || var18_11 != 0) break block25;
                                        if (v5 != v6) break block26;
                                    }
                                    catch (MatchException v12) {
                                        throw _0y.a(v12);
                                    }
                                    v1 = this;
                                    if (var2_4 < 0L) break block24;
                                    v13 = new Object[1];
                                    v13[0] = var6_5;
                                    _0y.c("\u00ee", (Object)_0y.c("Q", (Object)v1, (long)5513267668419371289L, (long)var2_4), (Object)v13, (long)5512458585955467041L, (long)var2_4);
                                    if (var18_11 == 0) break block21;
                                }
                                catch (MatchException v14) {
                                    throw _0y.a(v14);
                                }
                            }
                            v5 = _0y.c("\u00ee", (Object)var4_2, (long)5514340562801129778L, (long)var2_4);
                            v6 = 2;
                        }
                        catch (MatchException v15) {
                            throw _0y.a(v15);
                        }
                    }
                    try {
                        if (v5 == v6) {
                            v16 = new Object[1];
                            v16[0] = var12_8;
                            v17 = new Object[2];
                            v17[1] = (int)_0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, (long)5513267668419371289L, (long)var2_4), (Object)v16, (long)5519274559962541846L, (long)var2_4);
                            v17[0] = var16_10;
                            _0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, (long)5513267668419371289L, (long)var2_4), (Object)v17, (long)5520393104759002822L, (long)var2_4);
                        }
                    }
                    catch (MatchException v18) {
                        throw _0y.a(v18);
                    }
                }
                v1 = this;
            }
            v2 = var4_2;
        }
        v19 = new Object[3];
        v19[2] = var14_9;
        v19[1] = var5_3;
        v19[0] = v2;
        super.void_6(v19);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void void_4(Object[] var1_1) {
        block26: {
            block24: {
                block25: {
                    block29: {
                        block27: {
                            var4_2 = (class_11908)var1_1[0];
                            var2_3 = (Long)var1_1[1];
                            v0 = var2_3;
                            var5_4 = v0 ^ 18993880998466L;
                            var7_5 = v0 ^ 0L;
                            var9_6 = v0 ^ 44582834398173L;
                            var11_7 = v0 ^ 63837014664861L;
                            var13_8 = v0 ^ 94298561946315L;
                            var15_9 = _02.cfr_renamed_2();
                            try {
                                block28: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v1 = this;
                                                            if (var15_9) break block24;
                                                            if (_0y.c("Q", (Object)v1, (long)6378474339993809975L, (long)var2_3) == false) break block25;
                                                        }
                                                        catch (MatchException v2) {
                                                            throw _0y.a(v2);
                                                        }
                                                        if (var2_3 < 0L) break block26;
                                                        v1 = this;
                                                        if (var15_9) break block24;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw _0y.a(v3);
                                                    }
                                                    if (_0y.c("Q", (Object)_0y.c("Q", (Object)v1, (long)6383923029969032565L, (long)var2_3), (long)6378871960850909950L, (long)var2_3) == false) break block25;
                                                }
                                                catch (MatchException v4) {
                                                    throw _0y.a(v4);
                                                }
                                                v5 = _0y.c("\u00ee", (Object)var4_2, (long)6379316148197833224L, (long)var2_3);
                                                v6 = _0y.a("z", (int)16973, (long)(1436772324992086254L ^ var2_3));
                                                v7 = var15_9;
                                                if (var2_3 > 0L) {
                                                    if (v7) break block27;
                                                }
                                                ** GOTO lbl74
                                            }
                                            catch (MatchException v8) {
                                                throw _0y.a(v8);
                                            }
                                            if (var2_3 <= 0L) break block27;
                                            if (v5 != v6) break block28;
                                        }
                                        catch (MatchException v9) {
                                            throw _0y.a(v9);
                                        }
                                        v10 = new Object[1];
                                        v10[0] = var11_7;
                                        v11 = new Object[2];
                                        v11[1] = (int)_0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, (long)6378535277000684831L, (long)var2_3), (Object)v10, (long)6385670280455322384L, (long)var2_3);
                                        v11[0] = var13_8;
                                        _0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, (long)6378535277000684831L, (long)var2_3), (Object)v11, (long)6384542922394108608L, (long)var2_3);
                                        if (!var15_9) break block25;
                                    }
                                    catch (MatchException v12) {
                                        throw _0y.a(v12);
                                    }
                                }
                                v5 = _0y.c("\u00ee", (Object)var4_2, (long)6379316148197833224L, (long)var2_3);
                                v6 = _0y.a("z", (int)30634, (long)(4702653648684434698L ^ var2_3));
                            }
                            catch (MatchException v13) {
                                throw _0y.a(v13);
                            }
                        }
                        try {
                            block30: {
                                try {
                                    try {
                                        if (var2_3 <= 0L) break block29;
                                        v7 = var15_9;
lbl74:
                                        // 2 sources

                                        if (v7) break block29;
                                        if (v5 != v6) break block30;
                                    }
                                    catch (MatchException v14) {
                                        throw _0y.a(v14);
                                    }
                                    v15 = new Object[1];
                                    v15[0] = var9_6;
                                    _0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, (long)6378535277000684831L, (long)var2_3), (Object)v15, (long)6379240783181380124L, (long)var2_3);
                                    if (!var15_9) break block25;
                                }
                                catch (MatchException v16) {
                                    throw _0y.a(v16);
                                }
                            }
                            v5 = _0y.c("\u00ee", (Object)var4_2, (long)6379316148197833224L, (long)var2_3);
                            v6 = _0y.a("z", (int)4078, (long)(8533176822960962884L ^ var2_3));
                        }
                        catch (MatchException v17) {
                            throw _0y.a(v17);
                        }
                    }
                    try {
                        if (v5 == v6) {
                            v18 = new Object[1];
                            v18[0] = var5_4;
                            _0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, (long)6378535277000684831L, (long)var2_3), (Object)v18, (long)6378852242648820519L, (long)var2_3);
                        }
                    }
                    catch (MatchException v19) {
                        throw _0y.a(v19);
                    }
                }
                v1 = this;
            }
            v20 = new Object[2];
            v20[1] = var7_5;
            v20[0] = var4_2;
            super.void_4(v20);
        }
    }

    @Override
    protected void void_8(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        _87 var6_2 = (_87)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        long l3 = l2;
        long l4 = l3 ^ 0x6D6039E60B5AL;
        long l5 = l3 ^ 0x58144273CC5CL;
        long l6 = l3 ^ 0x2234A463F84AL;
        long l7 = l3 ^ 0x764D0226F048L;
        long l8 = l3 ^ 0x332099301D7CL;
        long l9 = l3 ^ 0x570C24C53811L;
        long l10 = l3 ^ 0x7238D2000367L;
        long l11 = l3 ^ 0x310130337E2AL;
        long l12 = l3 ^ 0x2AF2DB09C70AL;
        long l13 = l3 ^ 0x538DF2D376DEL;
        long l14 = l3 ^ 0x2F94A102B012L;
        long l15 = l3 ^ 0x4C3749C28209L;
        long l16 = l3 ^ 0x16D0603ED0FFL;
        long l17 = l3 ^ 0x2942C15F9E3FL;
        long l18 = l3 ^ 0x6C6533DC12C4L;
        long l19 = l3 ^ 0x22B6A7D81325L;
        long l20 = l3 ^ 0x4A7C3F174665L;
        long l21 = l3 ^ 0x34D41487C3D7L;
        long l22 = l3 ^ 0x88823B1F239L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l12;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l20;
        reference var46_26 = _0y.c("\u00ee", (Object)this, (Object)objectArray2, 7741230369805099405L, (long)l2) + _0y.c("\u00ee", (Object)this, (Object)objectArray3, 7741994237420062844L, (long)l2) + _0y.c("Q", (Object)this, 7742548809390169796L, (long)l2);
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l14;
        float f2 = (float)_0y.c("\u00ee", (Object)var6_2, (Object)objectArray4, 7740380757239710155L, (long)l2);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l6;
        CallSite callSite3 = _0y.c("\u00ee", (Object)_0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, 7741487300535469813L, (long)l2), (Object)objectArray5, 7741636953140800578L, (long)l2), 7740725414415720071L, (long)l2);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l7;
        objectArray6[0] = callSite3;
        float f3 = (float)_0y.c("\u00ee", (Object)var6_2, (Object)objectArray6, 7742896624890521905L, (long)l2);
        float f4 = 8.5f + f3 + 5.0f + 3.5f;
        float f5 = f4 + 16.0f;
        float f6 = f2 + 8.0f;
        Object[] objectArray7 = new Object[1];
        objectArray7[0] = l13;
        Object[] objectArray8 = new Object[1];
        objectArray8[0] = l16;
        float f7 = (float)(_0y.c("\u00ee", (Object)this, (Object)objectArray7, 7740922447220077399L, (long)l2) + _0y.c("\u00ee", (Object)this, (Object)objectArray8, 7740858263312482646L, (long)l2)) - f5 - 5.0f;
        Object[] objectArray9 = new Object[1];
        objectArray9[0] = l10;
        float f8 = (float)var46_26 + ((float)_0y.c("\u00ee", (Object)this, (Object)objectArray9, 7740280618719013930L, (long)l2) - f6) / 2.0f;
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l13;
        float f9 = f7 - (float)_0y.c("\u00ee", (Object)this, (Object)objectArray10, 7740922447220077399L, (long)l2) - 10.0f;
        Object[] objectArray11 = new Object[1];
        objectArray11[0] = l22;
        Object[] objectArray12 = new Object[3];
        objectArray12[2] = (double)f9;
        objectArray12[1] = _0y.c("\u00ee", (Object)_0y.c("Q", (Object)this, 7741487300535469813L, (long)l2), (Object)objectArray11, 7741359929689151600L, (long)l2);
        objectArray12[0] = l21;
        CallSite callSite4 = _0y.c("\u00ee", (Object)var6_2, (Object)objectArray12, 7740472378518291415L, (long)l2);
        Object[] objectArray13 = new Object[1];
        objectArray13[0] = l13;
        Object[] objectArray14 = new Object[5];
        objectArray14[4] = _0y.c("\u00e7", 7743004490553685944L, (long)l2);
        objectArray14[3] = (double)(var46_26 + _0y.a("z", 22846, (long)(0x410178B5C43B5867L ^ l2)));
        objectArray14[2] = (double)(_0y.c("\u00ee", (Object)this, (Object)objectArray13, 7740922447220077399L, (long)l2) + 5);
        objectArray14[1] = callSite4;
        objectArray14[0] = l9;
        _0y.c("\u00ee", (Object)var6_2, (Object)objectArray14, 7741895980365413543L, (long)l2);
        Object[] objectArray15 = new Object[3];
        objectArray15[2] = l15;
        objectArray15[1] = (double)n2;
        objectArray15[0] = (double)n;
        CallSite callSite5 = _0y.c("\u00ee", (Object)this, (Object)objectArray15, 7742207533323352539L, (long)l2);
        try {
            Object[] objectArray16 = new Object[1];
            objectArray16[0] = l17;
            _0y.c("\u00ee", (Object)_0y.c("\u00e7", 7740223693640445973L, (long)l2), (Object)objectArray16, 7742414393563948514L, (long)l2);
            Object[] objectArray17 = new Object[1];
            objectArray17[0] = l11;
            Object[] objectArray18 = new Object[1];
            objectArray18[0] = l8;
            _0y.c("\u00ee", (Object)_0y.c("\u00e3", (Object)objectArray17, 7742678607769101597L, (long)l2), (Object)objectArray18, 7742115331122220448L, (long)l2);
            d8 = f7;
            d7 = f8;
            d6 = f7 + f5;
            d5 = f8 + f6;
            d4 = 5.0;
            d3 = 5.0;
            d2 = 5.0;
            d = 5.0;
            callSite2 = callSite5 != false ? _0y.c("Q", (Object)this, 7741450559339722812L, (long)l2) : _0y.c("Q", (Object)this, 7741903524626091200L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _0y.a(matchException);
        }
        Object[] objectArray19 = new Object[14];
        objectArray19[13] = false;
        objectArray19[12] = 1.0;
        objectArray19[11] = l18;
        objectArray19[10] = _0y.c("Q", (Object)this, 7742471900403212303L, (long)l2);
        objectArray19[9] = _0y.c("Q", (Object)this, 7741132751073852129L, (long)l2);
        objectArray19[8] = callSite2;
        objectArray19[7] = d;
        objectArray19[6] = d2;
        objectArray19[5] = d3;
        objectArray19[4] = d4;
        objectArray19[3] = d5;
        objectArray19[2] = d6;
        objectArray19[1] = d7;
        objectArray19[0] = d8;
        _0y.c("\u00e3", (Object)objectArray19, 7741554725855829813L, (long)l2);
        Object[] objectArray20 = new Object[1];
        objectArray20[0] = l11;
        Object[] objectArray21 = new Object[1];
        objectArray21[0] = l5;
        _0y.c("\u00ee", (Object)_0y.c("\u00e3", (Object)objectArray20, 7742678607769101597L, (long)l2), (Object)objectArray21, 7740527598765678128L, (long)l2);
        Object[] objectArray22 = new Object[1];
        objectArray22[0] = l19;
        _0y.c("\u00ee", (Object)_0y.c("\u00e7", 7740223693640445973L, (long)l2), (Object)objectArray22, 7743030195726191705L, (long)l2);
        float f10 = f7 + f5 / 2.0f;
        float f11 = f8 + f6 / 2.0f;
        try {
            callSite = callSite5 != false ? _0y.c("Q", (Object)this, 7740822924748451221L, (long)l2) : _0y.c("Q", (Object)this, 7741771533508713610L, (long)l2);
        }
        catch (MatchException matchException) {
            throw _0y.a(matchException);
        }
        CallSite callSite6 = callSite;
        float f12 = f10 - f4 / 2.0f;
        Object[] objectArray23 = new Object[8];
        objectArray23[7] = callSite6;
        objectArray23[6] = l4;
        objectArray23[5] = (double)(f11 + 3.5f);
        objectArray23[4] = (double)(f12 + 3.5f);
        objectArray23[3] = (double)(f11 - 3.5f);
        objectArray23[2] = (double)(f12 + 3.5f);
        objectArray23[1] = (double)f11;
        objectArray23[0] = (double)f12;
        _0y.c("\u00ee", (Object)var6_2, (Object)objectArray23, 7742746640757143781L, (long)l2);
        float f13 = f11 - f2 / 2.0f + 1.0f;
        Object[] objectArray24 = new Object[5];
        objectArray24[4] = _0y.c("Q", (Object)this, 7742053581564477772L, (long)l2);
        objectArray24[3] = (double)f13;
        objectArray24[2] = (double)(f10 - f3 / 2.0f - 4.0f);
        objectArray24[1] = callSite3;
        objectArray24[0] = l9;
        _0y.c("\u00ee", (Object)var6_2, (Object)objectArray24, 7741895980365413543L, (long)l2);
        float f14 = f10 + f4 / 2.0f;
        Object[] objectArray25 = new Object[8];
        objectArray25[7] = callSite6;
        objectArray25[6] = l4;
        objectArray25[5] = (double)(f11 + 3.5f);
        objectArray25[4] = (double)(f14 - 3.5f);
        objectArray25[3] = (double)(f11 - 3.5f);
        objectArray25[2] = (double)(f14 - 3.5f);
        objectArray25[1] = (double)f11;
        objectArray25[0] = (double)f14;
        _0y.c("\u00ee", (Object)var6_2, (Object)objectArray25, 7742746640757143781L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0y.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_0y.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

