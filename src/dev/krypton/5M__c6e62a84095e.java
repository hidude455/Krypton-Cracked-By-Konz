/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._3s;
import dev.krypton._4r;
import dev.krypton._4w;
import dev.krypton._6x_0;
import dev.krypton._92;
import dev.krypton._95;
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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2846;

public class _5M
extends _6x_0 {
    private final _92 cfr_renamed_1;
    private final _92 cfr_renamed_8;
    private final _9r cfr_renamed_4;
    private final _9r cfr_renamed_0;
    private final _92 cfr_renamed_9;
    private int cfr_renamed_3;
    private int cfr_renamed_6;
    private boolean cfr_renamed_7;
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_188;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private static final Map f;
    private static final Object[] j;
    private static final String[] k;

    private void cfr_renamed_23(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = b ^ l2;
        _5M.c("y", (Object)this, (int)_5M.a("h", 26158, (long)(0xC53F6EB84D6ABCBL ^ l2)), -5603633693622553263L, (long)l2);
        _5M.c("y", (Object)this, (int)_5M.a("h", 1596, (long)(0x42F281E788784BDBL ^ l2)), -5603703928031862409L, (long)l2);
        _5M.c("y", (Object)this, (boolean)_5M.a("h", 26158, (long)(0xC53F6EB84D6ABCBL ^ l2)), -5603284535202668860L, (long)l2);
        _5M.c("y", (Object)this, (boolean)_5M.a("h", 26158, (long)(0xC53F6EB84D6ABCBL ^ l2)), -5611027942213505608L, (long)l2);
        _5M.c("y", (Object)this, (boolean)_5M.a("h", 26158, (long)(0xC53F6EB84D6ABCBL ^ l2)), -5602540682099875430L, (long)l2);
    }

    public _5M(char c, short s, int n) {
        long l2;
        long l3 = l2 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        long l4 = l3 ^ 0x765529DFB20DL;
        long l5 = l3 ^ 0x66351B16CB9EL;
        long l6 = l3 ^ 0x5C28C00ECB5CL;
        long l7 = l6 >>> 8;
        int n2 = (int)(l6 << 56 >>> 56);
        long l8 = l3 ^ 0x206DBE9C3A64L;
        long l9 = l3 ^ 0x3FAD2DB8D516L;
        long l10 = l3 ^ 0x7519EF6A5EC0L;
        super((int)_5M.a("h", 15733, (long)(0x78FD3BCDF461D1E1L ^ l2)), -1, (_4r)((Object)_5M.c("\u00a3", -7827337161618504328L, (long)l2)), l8);
        this.cfr_renamed_1 = new _92((int)_5M.a("h", 4262, (long)(0x64DF63ABD272FC36L ^ l2)), 0.0, l5, 5.0, 0.0, 1.0);
        this.cfr_renamed_8 = new _92((int)_5M.a("h", 15767, (long)(0x4ADA23F0C243D106L ^ l2)), 1.0, l5, 5.0, 1.0, 1.0);
        this.cfr_renamed_4 = new _9r((int)_5M.a("h", 9964, (long)(0x60F25B6FCC0D4A7AL ^ l2)), false, l4);
        this.cfr_renamed_0 = new _9r((int)_5M.a("h", 1025, (long)(0x23B16CCE934FE898L ^ l2)), false, l4);
        this.cfr_renamed_9 = new _92((int)_5M.a("h", 1285, (long)(0x520853F647B86996L ^ l2)), 2.0, l5, 20.0, 1.0, 0.5);
        _5M.c("y", (Object)this, (int)_5M.a("h", 8083, (long)(0x7023833AB2D4F301L ^ l2)), -7834900518907309010L, (long)l2);
        _5M.c("y", (Object)this, (int)_5M.a("h", 1697, (long)(0x37365D91D50E6A36L ^ l2)), -7834971068996190200L, (long)l2);
        _5M.c("y", (Object)this, (boolean)_5M.a("h", 26158, (long)(0xC53C54EECE08AB4L ^ l2)), -7835993646805221147L, (long)l2);
        CallSite callSite = _5M.c("\u00f2", (Object)this, -7827440322752996854L, (long)l2);
        CallSite callSite2 = _5M.c("\u00f2", (Object)this, -7834461041287104900L, (long)l2);
        _5M.c("q", (Object)callSite2, -7835613695104546343L, (long)l2);
        Object[] objectArray = new Object[3];
        objectArray[2] = () -> ((_9r)((Object)callSite2)).cfr_renamed_3(l10);
        objectArray[1] = (int)((byte)n2);
        objectArray[0] = l7;
        _5M.c("\u00a4", (Object)callSite, (Object)objectArray, -7835923561090713428L, (long)l2);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = new _95[]{_5M.c("\u00f2", (Object)this, -7834840900557144588L, (long)l2), _5M.c("\u00f2", (Object)this, -7827297577645470874L, (long)l2), _5M.c("\u00f2", (Object)this, -7836076416456344941L, (long)l2), _5M.c("\u00f2", (Object)this, -7834461041287104900L, (long)l2), _5M.c("\u00f2", (Object)this, -7827440322752996854L, (long)l2)};
        objectArray2[0] = l9;
        _5M.c("\u00a4", (Object)this, (Object)objectArray2, -7835417695819219548L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.init(_5M.class, 21);
                _5M.b = l.a(2599008031154883667L, 8948120361946449074L, MethodHandles.lookup().lookupClass()).a(221901887375400L);
                _5M.j = new Object[72];
                _5M.k = new String[72];
                _5M.b();
                _5M.f = new HashMap<K, V>(13);
                var0 = _5M.b ^ 137859325489576L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u00f4R\u000et\u008cAO3\u0084\u00bc*\u00c8\u00a5\u00b45\"\u00f1\u00f7F\u00f1G\u009e)\u00c9`\u00df\u00caK\u00e3<\u0007\u00f1Q\u0088\u008bI\u00e6\u00dfT\u00e1\u0083\u00a4\u00da\u00d6\u0083D\u0016\u00cf$\u00ae\u00af\u0096\r\u00c7\u00e7-d\u00a4\u00aa\u000f\u00e9\u00ba\u00fb\u00c0\u0011\u00dd\u00d8\u00ab\u00e3\u00edJ\u0016\u00cb\u00fd\u00e7y\u00e5v\u00ef\u00b5";
                var7_6 = "\u00f4R\u000et\u008cAO3\u0084\u00bc*\u00c8\u00a5\u00b45\"\u00f1\u00f7F\u00f1G\u009e)\u00c9`\u00df\u00caK\u00e3<\u0007\u00f1Q\u0088\u008bI\u00e6\u00dfT\u00e1\u0083\u00a4\u00da\u00d6\u0083D\u0016\u00cf$\u00ae\u00af\u0096\r\u00c7\u00e7-d\u00a4\u00aa\u000f\u00e9\u00ba\u00fb\u00c0\u0011\u00dd\u00d8\u00ab\u00e3\u00edJ\u0016\u00cb\u00fd\u00e7y\u00e5v\u00ef\u00b5".length();
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
                    var6_5 = "\u0098A\u00aa\u0092\u00c7\u00fb\u00e5\u00f9\u008d\u0014\u00b3\u00c1\u00933I\u00d6";
                    var7_6 = "\u0098A\u00aa\u0092\u00c7\u00fb\u00e5\u00f9\u008d\u0014\u00b3\u00c1\u00933I\u00d6".length();
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
        _5M.d = var8_3;
        _5M.e = new Integer[12];
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
            case 0 -> 44;
            case 1 -> 61;
            case 2 -> 30;
            case 3 -> 22;
            case 4 -> 5;
            case 5 -> 54;
            case 6 -> 3;
            case 7 -> 48;
            case 8 -> 53;
            case 9 -> 32;
            case 10 -> 24;
            case 11 -> 6;
            case 12 -> 28;
            case 13 -> 45;
            case 14 -> 55;
            case 15 -> 9;
            case 16 -> 51;
            case 17 -> 7;
            case 18 -> 2;
            case 19 -> 49;
            case 20 -> 13;
            case 21 -> 12;
            case 22 -> 60;
            case 23 -> 0;
            case 24 -> 20;
            case 25 -> 17;
            case 26 -> 26;
            case 27 -> 50;
            case 28 -> 57;
            case 29 -> 38;
            case 30 -> 4;
            case 31 -> 34;
            case 32 -> 43;
            case 33 -> 23;
            case 34 -> 39;
            case 35 -> 37;
            case 36 -> 14;
            case 37 -> 63;
            case 38 -> 21;
            case 39 -> 33;
            case 40 -> 31;
            case 41 -> 56;
            case 42 -> 41;
            case 43 -> 1;
            case 44 -> 35;
            case 45 -> 10;
            case 46 -> 52;
            case 47 -> 29;
            case 48 -> 59;
            case 49 -> 46;
            case 50 -> 58;
            case 51 -> 36;
            case 52 -> 19;
            case 53 -> 62;
            case 54 -> 15;
            case 55 -> 16;
            case 56 -> 11;
            case 57 -> 27;
            case 58 -> 42;
            case 59 -> 40;
            case 60 -> 18;
            case 61 -> 25;
            case 62 -> 47;
            default -> 8;
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
        _5M.k[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f2' || c == 'y' || c == '\u00a3' || c == 'Q') {
                field = _5M.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _5M.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = _5M.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void b() {
        Object[] objectArray = j;
        j[0] = "\u0018Ee1zo\u0018Ermv`\u0002\u000ersvu\u0005\u007f&+!";
        objectArray[1] = Float.TYPE;
        _5M.k[1] = "java/lang/Float";
        objectArray[2] = "Q\u001f\tm1\u0010L\n\u000b,4L\u00007";
        objectArray[3] = "*q\u0018\u001bg]7d\u001aZb\u0001wf";
        objectArray[4] = "gf\"\u00047\"gf5X;-}-5F;8z\\g\u001dcr";
        objectArray[5] = "40NJVg40Y\u0016Zh.{Y\bZ})\n\tU\u000b";
        objectArray[6] = "\f/a \u001dI\f/v|\u0011F\u0016dvb\u0011S\u0011\u0015$6@\u0012";
        objectArray[7] = ",\u000f\b\u00186?,\u000f\u001fD:06D\u001fZ:%15M\u0001bd";
        objectArray[8] = "-\u0011n6Vv0\u0004lwS*\u007f\f";
        objectArray[9] = "sgr[\u0004mnrp\u001a\u00011.0";
        objectArray[10] = "@iB\u000b\u0012|5II\u0004\u00033TGB\u000f\u0007i ";
        objectArray[11] = Double.TYPE;
        _5M.k[11] = "java/lang/Double";
        objectArray[12] = Long.TYPE;
        _5M.k[12] = "java/lang/Long";
        objectArray[13] = Boolean.TYPE;
        _5M.k[13] = "java/lang/Boolean";
        objectArray[14] = "sP~(~anE|i{=.\u0000";
        objectArray[15] = "\u0017=X\"lrb\u001dS-}=\u0003\u0013X&ygw";
        objectArray[16] = "`)D,-j}<Fm(60>";
        objectArray[17] = Integer.TYPE;
        _5M.k[17] = "java/lang/Integer";
        objectArray[18] = "~\u001ed\u0005?\u0014\u000b>o\n.[j0d\u0001*\u0001\u001e";
        objectArray[19] = Void.TYPE;
        _5M.k[19] = "java/lang/Void";
        objectArray[20] = "[JY\u00162dEBCYSs[NL\u0003o";
        objectArray[21] = "Jp_F5XA\u007fN\tTVJtJS";
        objectArray[22] = "i(!>N;\u001c\b*1_t}\u0006!:[.\t";
        objectArray[23] = "\u000f\u0003/b&/\u000f\u00038>* \u0015H8 *5\u00129iyxs";
        objectArray[24] = "+IC+\u0002\u0007+ITw\u000e\b1\u0002Ti\u000e\u001d6s\u00050VX";
        objectArray[25] = "y\n\n\u0006\u0006hy\n\u001dZ\ngcA\u001dD\nrd0O\u001e]0";
        objectArray[26] = "M&d:=TM&sf1[Wmsx1NP\u001c&'d";
        objectArray[27] = "E)e^a\u0000E)r\u0002m\u000f_br\u001cm\u001aX\u0013#C9Y";
        objectArray[28] = "NW\u0012/l\u0000NW\u0005s`\u000fT\u001c\u0005m`\u001aSmT22Q";
        objectArray[29] = "\u007f~0T\u00048\n^;[\u0015wkP0P\u0011-\u001f";
        objectArray[30] = "(\teO\u001e\u000b(\tr\u0013\u0012\u00042Br\r\u0012\u001153#YGTb\u000f}\u0000\u0000\u0011\u0019^)UD";
        objectArray[31] = "Wu\r\u0004s}Wu\u001aX\u007frM>\u001aF\u007fgJOM\u0019)";
        objectArray[32] = "wQ7lH1jD5-Mm+N";
        objectArray[33] = "G\u000f\u0011\u0010 #2/\u001a\u001f1lS!\u0011\u001456'";
        objectArray[34] = "\u001e\u0006S#6gk&X,'(\n(S'#r~";
        objectArray[35] = "/o\\\u001d?\u0005ZOW\u0012.J;A\\\u0019*\u0010O";
        objectArray[36] = "\u000fr+}iR\t#e\u0007iT\u001f*pk[\u0007[q-\u00075\t\u0006*k9sI\u0006(\u0017";
        objectArray[37] = "\r?PA D\u0005>\u001f\u0000@\t4tB\u00012\u0000X.\u0018G8";
        objectArray[38] = "y3WHE\u001f\u007fb\u00192E\u0019ik\f^wJ-4Z2\u001a\u000f{bTY\u0011\u0006xek";
        objectArray[39] = "qLN\u001d7>cLN\u0000UbsUB\u001e9P'\u0011\u001dEn\u0007~\u0015Z\u0001/\u007f|WMEUkcMYFhkdG^y";
        objectArray[40] = "\b|\b\u0006@s\u0000}GG ?13\u0004Y\u00104Ni\u001d\u0001\u0019";
        objectArray[41] = "DxFW\u0012+\u001ae\u001dY\u007f IhGA\u0013\u0012\u001a+\u001a\u001dEEO{@T\u0015#VoGJ\u007f";
        objectArray[42] = "DJl>jXC\u0016g1\u0003OHRg$o}\u0019\u001e=r=*JKk'a\u0013XKk:\u0003";
        objectArray[43] = "\u0013nF\nm\u0011OxERU\u0019Ej\\\u000f9+\u0011+\u0002RU\u001dL}A\u0001'\u001a\u0010vNh";
        objectArray[44] = "3R$tL\u001a*Sveq\u00153D|c&Bk\u0011#4q\u001a)\u0015c2\u0010\u0003(Gr";
        objectArray[45] = "Id[\u0005xKBmX\u0002GE\u001ecU\u000b+wL.\r]G\u001dK~E\u0017}\u001d\u0017aXl";
        objectArray[46] = "O;m@\u001afG:\"\u0001z v!r\u0019\bq\u00108f\u001e\u0016";
        objectArray[47] = "9\":?7G1#u~W\u0000\u00008%f%Pf!1a;";
        objectArray[48] = "@F.A \bB\u0012tJ_T}E{^'\u001c\u001dK-\u001b&m\u0011_t]`P\u0011X~Z_";
        objectArray[49] = "ly:`\u001e{bcosxqom4c/&61`7x}wj?i\u001csm?,";
        objectArray[50] = "B^JvK\u001a\u0018G\u0012\u007fq_|E@>\t\u0014\u001cK\u0016{\beL\u0019P{K\u0000\u0003\u001aV{q";
        objectArray[51] = "\u0016 {ix0Lz=cAf,s=$\"lS{~*#\\\u001dry%!.\\%gzA";
        objectArray[52] = "f\f=c8\u001en\rr\"X__L}!f\u0003-\r*?9";
        objectArray[53] = "\u000b%=TWw\nd{\r)p\n#xUSg!=crTn\u0003ZhO\u0014g\u000b8dIW6g7~\tDf\u0005;xJ\u0015\n";
        objectArray[54] = "g^h\u001b=>o_'Z]x^Hs]%2>F%\u0018$Co\u001fd\u001b=1.HzD]";
        objectArray[55] = "G+_\u0000~DU8N\u0001\u0010RE9A\\G\u0005\u001ee\u001b\u0001\u0010_[.\u0015^hMH?\u0014";
        objectArray[56] = "O1N\u0004e\tB6\u000b\u001f\\T~/\u001d\u0002$\u0019\u001e!KG%hO1N\u0004e\tB6\u000b\u001f\\";
        objectArray[57] = "!7t+\u0002g)6;jb&XFc~\u001abi&m(_c\u0018*yq\u0019%%*~{\u001e\u001a";
        objectArray[58] = "i#\u0001;LJ55\u0002ctI36\u001f5#\u001emaGY\u0018\u001fn!\u001e2\u001eN ";
        objectArray[59] = "P\\m\u0015MA\u0014Z8\u000b|W\rXg\u001f+\tV\u00053sA\u0001\rExIA]\u0012X";
        objectArray[60] = "dd.vX\u00138r-.`\u0010>q0x7G`!i\u0014\u0005D>g2k\u0010\u0015/-";
        objectArray[61] = "\u007fU^l!Kj\u0017@>Q\u0016\u001a\fG,)Zz\u0002\u0011i(++[Pj1Yj\fN5Q";
        objectArray[62] = "0zDGT08{\u000b\u00064u\t1V\u0007Ftek\fAL";
        objectArray[63] = "S+'mpn[*h,\u0010,*Zfcl-\n('4rr";
        objectArray[64] = "^<\u000e?m2\\hT4\u0012nccH\"po\u000e?^!(";
        objectArray[65] = "\u0000qN\u0012\u0004j\bp\u0001Sd(9>BMT-Fd[\u0015]";
        objectArray[66] = "\u001f8Jq!\u0016\u0004!Kn\u001fa2\u0016b]C*\u001f8Jq!\u0016\u0004!Kn";
        objectArray[67] = "H'GM\u007fe@&\b\f\u001f%qhK\u0012/\"\u000e2RJ&";
        objectArray[68] = "G\u001f!\u00155;ANoo5=WGz\u0003\u0007k\u0012\u001a!_P0GFl\u0002>nZ\u001dbo";
        objectArray[69] = "\u001e[q\u0012!\u0015DB)\u001b\u001bW @{Zc\u001b@N-\u001fbjKHwPq\fR\\pN\u001b";
        objectArray[70] = "\u001a#Y7|(\u0012\"\u0016v\u001ck#c\u0019u\"5Q\"Nk}";
        Object[] objectArray2 = objectArray;
        objectArray[71] = "+\u0019\nWhC>[\u0014\u0005\u0018\u001bN@\u0013\u0017`R.NERa#\"Z\u001c\u0014'\u001e\"]\u0016\u0013\u0018";
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
            throw new RuntimeException("dev/krypton/5M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l2, long l3) {
        int n = _5M.e(l2, l3);
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
                clazz3 = _5M.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _5M.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _5M.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _5M.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _5M.f(1501253585392576L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _5M.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _5M.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _5M.f(1501253585392576L, 0L);
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
            int n = _5M.e(l2, l3);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                _5M.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _5M.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _5M.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _5M.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _5M.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x7FDD;
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
                throw new RuntimeException("dev/krypton/5M", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _5M.e[n2] = n3;
        }
        return e[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/5M" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _5M.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Field g(long l2, long l3) {
        int n = _5M.e(l2, l3);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = _5M.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _5M.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _5M.c(clazz3, string2, clazz2)) != null) {
                    _5M.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _5M.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _5M.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _5M.f(1501253585392576L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public native void cfr_renamed_2();

    @_3i_0
    public void cfr_renamed_3(_9o o) {
        _5M m;
        long l2;
        long l3;
        block59: {
            CallSite callSite;
            long l4;
            block55: {
                _4w[] wArray;
                block56: {
                    _5M m2;
                    block57: {
                        block58: {
                            long l5;
                            long l6;
                            block53: {
                                block54: {
                                    block51: {
                                        block52: {
                                            block49: {
                                                long l7;
                                                block50: {
                                                    block45: {
                                                        block46: {
                                                            _5M m3;
                                                            block47: {
                                                                block48: {
                                                                    long l8;
                                                                    block43: {
                                                                        block44: {
                                                                            _5M m4;
                                                                            block41: {
                                                                                block42: {
                                                                                    long l9 = l3 = b ^ 0x58407E96296CL;
                                                                                    l4 = l9 ^ 0x15E6211D7C60L;
                                                                                    l2 = l9 ^ 0x4520808F9B5CL;
                                                                                    l6 = l9 ^ 0x10E251DBCFC9L;
                                                                                    l5 = l9 ^ 0x4F605D988FF9L;
                                                                                    l8 = l9 ^ 0xAD185F19F3FL;
                                                                                    l7 = l9 ^ 0x352D88C36BCCL;
                                                                                    wArray = _3s.cfr_renamed_5();
                                                                                    try {
                                                                                        try {
                                                                                            m4 = this;
                                                                                            if (wArray != null) break block41;
                                                                                            if (_5M.c("\u00f2", (Object)_5M.c("\u00f2", (Object)m4, 4784551798889666829L, (long)l3), 4789875541597140879L, (long)l3) == null) break block42;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw _5M.a(matchException);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw _5M.a(matchException);
                                                                                    }
                                                                                }
                                                                                m4 = this;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    callSite = _5M.c("\u00f2", (Object)m4, 4791246182358926615L, (long)l3);
                                                                                    if (wArray != null) break block43;
                                                                                    if (callSite <= 0) break block44;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5M.a(matchException);
                                                                                }
                                                                                _5M m5 = this;
                                                                                _5M.c("y", (Object)m5, (int)(_5M.c("\u00f2", (Object)m5, 4791246182358926615L, (long)l3) - true), 4791246182358926615L, (long)l3);
                                                                                return;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5M.a(matchException);
                                                                            }
                                                                        }
                                                                        callSite = _5M.c("\u00f2", (Object)this, 4784958109491027454L, (long)l3);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (wArray != null) break block45;
                                                                                    if (callSite != false) break block46;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw _5M.a(matchException);
                                                                                }
                                                                                m3 = this;
                                                                                if (wArray != null) break block47;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw _5M.a(matchException);
                                                                            }
                                                                            Object[] objectArray = new Object[1];
                                                                            objectArray[0] = l8;
                                                                            if (_5M.c("\u00a4", (Object)m3, (Object)objectArray, 4790563444730775676L, (long)l3) != false) break block48;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw _5M.a(matchException);
                                                                        }
                                                                        return;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _5M.a(matchException);
                                                                    }
                                                                }
                                                                Object[] objectArray = new Object[1];
                                                                objectArray[0] = l2;
                                                                _5M.c("\u00a4", (Object)this, (Object)objectArray, 4789677932101423029L, (long)l3);
                                                                _5M.c("y", (Object)this, (boolean)_5M.a("h", 15010, (long)(0x9809BB673DF070EL ^ l3)), 4784958109491027454L, (long)l3);
                                                                m3 = this;
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l6;
                                                            _5M.c("y", (Object)m3, (int)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, 4790765467967171789L, (long)l3), (Object)objectArray, 4784922150212653440L, (long)l3), 4791246182358926615L, (long)l3);
                                                            return;
                                                        }
                                                        callSite = _5M.c("\u00f2", (Object)this, 4791175980095361329L, (long)l3);
                                                    }
                                                    try {
                                                        try {
                                                            if (wArray != null) break block49;
                                                            if (callSite != -1) break block50;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _5M.a(matchException);
                                                        }
                                                        _5M.c("y", (Object)this, (int)_5M.c("\u00a4", (Object)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)_5M.c("\u00f2", (Object)this, 4784551798889666829L, (long)l3), 4789783131266350278L, (long)l3), 4784856864131525928L, (long)l3), 4790776115783517103L, (long)l3), 4791175980095361329L, (long)l3);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _5M.a(matchException);
                                                    }
                                                }
                                                Object[] objectArray = new Object[2];
                                                objectArray[1] = _5M.c("\u00a3", 4789851820819581999L, (long)l3);
                                                objectArray[0] = l7;
                                                callSite = _5M.c("q", (Object)objectArray, 4789966867070320063L, (long)l3);
                                            }
                                            try {
                                                try {
                                                    if (wArray != null) break block51;
                                                    if (callSite != false) break block52;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _5M.a(matchException);
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l2;
                                                _5M.c("\u00a4", (Object)this, (Object)objectArray, 4789677932101423029L, (long)l3);
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw _5M.a(matchException);
                                            }
                                        }
                                        callSite = _5M.c("\u00f2", (Object)this, 4790087493297361372L, (long)l3);
                                    }
                                    try {
                                        try {
                                            if (wArray != null) break block53;
                                            if (callSite != false) break block54;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5M.a(matchException);
                                        }
                                        Object[] objectArray = new Object[1];
                                        objectArray[0] = l6;
                                        _5M.c("y", (Object)this, (int)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, 4784758131023960671L, (long)l3), (Object)objectArray, 4784922150212653440L, (long)l3), 4791246182358926615L, (long)l3);
                                        _5M.c("y", (Object)this, (boolean)_5M.a("h", 28200, (long)(0x6B4627F0C44FD38AL ^ l3)), 4790087493297361372L, (long)l3);
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5M.a(matchException);
                                    }
                                }
                                callSite = _5M.c("\u00f2", (Object)this, 4790470714237578882L, (long)l3);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (wArray != null) break block55;
                                            if (callSite != false) break block56;
                                        }
                                        catch (MatchException matchException) {
                                            throw _5M.a(matchException);
                                        }
                                        _5M.c("\u00a4", (Object)_5M.c("\u00a4", (Object)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, 4784551798889666829L, (long)l3), 4790930358141367413L, (long)l3), 4790892017314387529L, (long)l3), (Object)new class_2846((class_2846.class_2847)_5M.c("\u00a3", 4790653992346902804L, (long)l3), (class_2338)_5M.c("\u00a3", 4790235125763003324L, (long)l3), (class_2350)_5M.c("\u00a3", 4791028528018983161L, (long)l3)), 4791810835887768648L, (long)l3);
                                        _5M.c("y", (Object)this, (boolean)_5M.a("h", 28200, (long)(0x6B4627F0C44FD38AL ^ l3)), 4790470714237578882L, (long)l3);
                                        m2 = this;
                                        if (wArray != null) break block57;
                                    }
                                    catch (MatchException matchException) {
                                        throw _5M.a(matchException);
                                    }
                                    if (_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)m2, 4790018547625454506L, (long)l3), (long)l5, 4790398271987886762L, (long)l3) == false) break block58;
                                }
                                catch (MatchException matchException) {
                                    throw _5M.a(matchException);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l6;
                                _5M.c("y", (Object)this, (int)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, 4790765467967171789L, (long)l3), (Object)objectArray, 4784922150212653440L, (long)l3), 4791246182358926615L, (long)l3);
                                return;
                            }
                            catch (MatchException matchException) {
                                throw _5M.a(matchException);
                            }
                        }
                        m2 = this;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    _5M.c("\u00a4", (Object)m2, (Object)objectArray, 4789677932101423029L, (long)l3);
                    return;
                }
                try {
                    m = this;
                    if (wArray != null) break block59;
                    callSite = _5M.c("\u00f2", (Object)m, 4791175980095361329L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw _5M.a(matchException);
                }
            }
            try {
                if (callSite != -1) {
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l4;
                    objectArray[0] = (int)_5M.c("\u00f2", (Object)this, 4791175980095361329L, (long)l3);
                    _5M.c("q", (Object)objectArray, 4785041896395069106L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw _5M.a(matchException);
            }
            m = this;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        _5M.c("\u00a4", (Object)m, (Object)objectArray, 4789677932101423029L, (long)l3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean boolean_3(Object[] var1_1) {
        block29: {
            block32: {
                block30: {
                    block31: {
                        block28: {
                            block26: {
                                block27: {
                                    block25: {
                                        var2_2 = (Long)var1_1[0];
                                        v0 = var2_2 = _5M.b ^ var2_2;
                                        var4_3 = v0 ^ 38735987706760L;
                                        var6_4 = v0 ^ 10228500429788L;
                                        var8_5 = _3s.cfr_renamed_5();
                                        try {
                                            v1 = _5M.c("\u00a4", (Object)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)_5M.c("\u00f2", (Object)this, (long)-5313294630769611480L, (long)var2_2), (long)-5305807379572258589L, (long)var2_2), (long)-5306690946077830672L, (long)var2_2), (long)-5307436174861039633L, (long)var2_2) != _5M.c("\u00a3", (long)-5305874815002904566L, (long)var2_2);
                                        }
                                        catch (MatchException v2) {
                                            throw _5M.a(v2);
                                        }
                                        var9_6 = v1;
                                        try {
                                            try {
                                                v3 /* !! */  = var9_6;
                                                v4 = var8_5;
                                                if (var2_2 > 0L) {
                                                    if (v4 != null) break block25;
                                                    if (!v3 /* !! */ ) break block26;
                                                }
                                                ** GOTO lbl32
                                            }
                                            catch (MatchException v5) {
                                                throw _5M.a(v5);
                                            }
                                            v3 /* !! */  = (boolean)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, (long)-5306899088179342496L, (long)var2_2), (long)var6_4, (long)-5305328369858945393L, (long)var2_2);
                                        }
                                        catch (MatchException v6) {
                                            throw _5M.a(v6);
                                        }
                                    }
                                    try {
                                        try {
                                            v4 = var8_5;
lbl32:
                                            // 2 sources

                                            if (var2_2 > 0L) {
                                                if (v4 != null) break block27;
                                                if (!v3 /* !! */ ) break block26;
                                            }
                                            ** GOTO lbl50
                                        }
                                        catch (MatchException v7) {
                                            throw _5M.a(v7);
                                        }
                                        v8 = new Object[1];
                                        v8[0] = var4_3;
                                        cfr_temp_0 = (double)_5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)_5M.c("\u00f2", (Object)this, (long)-5313294630769611480L, (long)var2_2), (long)-5305807379572258589L, (long)var2_2), (long)-5306825184684082412L, (long)var2_2) - _5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, (long)-5313363367980351722L, (long)var2_2), (Object)v8, (long)-5305307970315176536L, (long)var2_2);
                                        v3 /* !! */  = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                    }
                                    catch (MatchException v9) {
                                        throw _5M.a(v9);
                                    }
                                }
                                try {
                                    v4 = var8_5;
lbl50:
                                    // 2 sources

                                    if (v4 != null) break block28;
                                    if (v3 /* !! */  > false) break block26;
                                }
                                catch (MatchException v10) {
                                    throw _5M.a(v10);
                                }
                                v3 /* !! */  = true;
                                break block28;
                            }
                            v3 /* !! */  = false;
                        }
                        var10_7 = v3 /* !! */ ;
                        try {
                            try {
                                try {
                                    try {
                                        v11 /* !! */  = var10_7;
                                        if (var8_5 != null) break block29;
                                        if (v11 /* !! */ ) break block30;
                                    }
                                    catch (MatchException v12) {
                                        throw _5M.a(v12);
                                    }
                                    v11 /* !! */  = var9_6;
                                    v13 = var8_5;
                                    if (var2_2 > 0L) {
                                        if (v13 != null) break block31;
                                    }
                                    ** GOTO lbl90
                                }
                                catch (MatchException v14) {
                                    throw _5M.a(v14);
                                }
                                if (!v11 /* !! */ ) break block32;
                            }
                            catch (MatchException v15) {
                                throw _5M.a(v15);
                            }
                            v11 /* !! */  = _5M.c("\u00a4", (Object)_5M.c("\u00f2", (Object)this, (long)-5306899088179342496L, (long)var2_2), (long)var6_4, (long)-5305328369858945393L, (long)var2_2);
                        }
                        catch (MatchException v16) {
                            throw _5M.a(v16);
                        }
                    }
                    try {
                        v13 = var8_5;
lbl90:
                        // 2 sources

                        if (v13 != null) break block29;
                        if (v11 /* !! */ ) break block32;
                    }
                    catch (MatchException v17) {
                        throw _5M.a(v17);
                    }
                }
                v11 /* !! */  = true;
                break block29;
            }
            v11 /* !! */  = false;
        }
        return v11 /* !! */ ;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_5M.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_5M.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

