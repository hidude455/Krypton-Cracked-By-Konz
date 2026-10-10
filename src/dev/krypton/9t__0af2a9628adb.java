/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 *  net.minecraft.class_2248
 */
package dev.krypton;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.krypton._8B;
import dev.krypton._8j;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2248;

/*
 * Renamed from dev.krypton.9t
 */
public class _9t_0
extends _95 {
    private final Map cfr_renamed_1;
    private final List cfr_renamed_6;
    private Map cfr_renamed_3;
    private static final long a = l.a(-1529291206851447141L, 5241884643381257934L, MethodHandles.lookup().lookupClass()).a(178472057893487L);
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public boolean boolean_1(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        return (boolean)_9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -8390929983095216423L, (long)l2), (Object)class_22482, -8389774119982345722L, (long)l2);
    }

    public void void_1(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        _8B b = (_8B)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x547F8D54F841L;
        long l5 = l3 ^ 0x6C793B6C1A96L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 32);
        int n3 = (int)(l5 << 48 >>> 48);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((short)n3);
        objectArray2[1] = n2;
        objectArray2[0] = (int)((short)n);
        _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -1716900818794576520L, (long)l2), (Object)class_22482, (Object)_9t_0.c("u", (Object)b, (Object)objectArray2, -1716764099697761578L, (long)l2), -1716660232877946172L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        _9t_0.c("u", (Object)this, (Object)objectArray3, -1717656147381764284L, (long)l2);
    }

    public _9t_0(long l2, int n, Map map, List list) {
        long l3 = (l2 = a ^ l2) ^ 0x6249ACD7CB36L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        _9t_0.c("\u00ca", (Object)this, new HashMap(map), -8624850219822455526L, (long)l2);
        this.cfr_renamed_1 = new HashMap(map);
        this.cfr_renamed_6 = list;
    }

    public _9t_0(long l2, int n) {
        long l3 = (l2 = a ^ l2) ^ 0x7E24E747C895L;
        this(l3, n, new HashMap(), null);
    }

    public _9t_0(int n, Map map, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x7C5EF6C1F04FL;
        this(l3, n, map, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[67];
        j = new String[67];
        _9t_0.b();
        e = new HashMap(13);
        long l2 = a ^ 0x691429EDF08BL;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u0012\u0097\u0016\u0088\u0010\u00e4\u00cd\u00f1q\u008dO\u0083rq\u0084\u00c5";
        int n2 = "\u0012\u0097\u0016\u0088\u0010\u00e4\u00cd\u00f1q\u008dO\u0083rq\u0084\u00c5".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
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
            case 0 -> 49;
            case 1 -> 53;
            case 2 -> 45;
            case 3 -> 27;
            case 4 -> 23;
            case 5 -> 51;
            case 6 -> 12;
            case 7 -> 50;
            case 8 -> 16;
            case 9 -> 59;
            case 10 -> 61;
            case 11 -> 44;
            case 12 -> 19;
            case 13 -> 14;
            case 14 -> 32;
            case 15 -> 35;
            case 16 -> 43;
            case 17 -> 42;
            case 18 -> 18;
            case 19 -> 11;
            case 20 -> 17;
            case 21 -> 38;
            case 22 -> 58;
            case 23 -> 47;
            case 24 -> 57;
            case 25 -> 33;
            case 26 -> 15;
            case 27 -> 63;
            case 28 -> 6;
            case 29 -> 26;
            case 30 -> 34;
            case 31 -> 36;
            case 32 -> 20;
            case 33 -> 39;
            case 34 -> 54;
            case 35 -> 41;
            case 36 -> 31;
            case 37 -> 7;
            case 38 -> 40;
            case 39 -> 9;
            case 40 -> 21;
            case 41 -> 62;
            case 42 -> 4;
            case 43 -> 29;
            case 44 -> 0;
            case 45 -> 37;
            case 46 -> 13;
            case 47 -> 30;
            case 48 -> 25;
            case 49 -> 46;
            case 50 -> 24;
            case 51 -> 52;
            case 52 -> 60;
            case 53 -> 22;
            case 54 -> 48;
            case 55 -> 8;
            case 56 -> 10;
            case 57 -> 2;
            case 58 -> 3;
            case 59 -> 55;
            case 60 -> 56;
            case 61 -> 28;
            case 62 -> 1;
            default -> 5;
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
        _9t_0.j[n3] = new String(cArray);
        return n3;
    }

    public void void_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_2248 class_22482 = (class_2248)objectArray[1];
        _8B b = (_8B)objectArray[2];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x1C3A928B2CB5L;
        long l5 = l3 ^ 0x243C24B3CE62L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 32);
        int n3 = (int)(l5 << 48 >>> 48);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = (int)((short)n3);
        objectArray2[1] = n2;
        objectArray2[0] = (int)((short)n);
        _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, 4384288907747119500L, (long)l2), (Object)class_22482, (Object)_9t_0.c("u", (Object)b, (Object)objectArray2, 4384426176421099042L, (long)l2), 4384670780699090480L, (long)l2);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        _9t_0.c("u", (Object)this, (Object)objectArray3, 4385908524410268592L, (long)l2);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9t_0.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == '\u00ca' || c == '\u00e6' || c == 'P') {
                field = _9t_0.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9t_0.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Object[] objectArray = i;
        i[0] = "k2\u001a'\u00059k2\r{\t6qy\re\t#v\b\\0^`";
        objectArray[1] = "\u001d\u0012b\u0005]}\u0016\u001dsJ e\u0005\u001az\u0003";
        objectArray[2] = "YDv]\u0011YYDa\u0001\u001dVC\u000fa\u001f\u001dCD~5JN\u0002";
        objectArray[3] = "S\u0014VG}dX\u001bG\b\u001cjS\u0010CR";
        objectArray[4] = "[#\u0000\u0000\u001b\u0005[#\u0017\\\u0017\nAh\u0017B\u0017\u001fF\u0019C\u0017D_";
        objectArray[5] = "|?;2Q5a*9sTi!.";
        objectArray[6] = "3P\u000e\u0017_/-X\u0014X<;)";
        objectArray[7] = "@bEE\u001b(]wG\u0004\u001et\u001cE";
        objectArray[8] = "4\n\u001b4wEA*\u0010;f\n $\u001b0bPT";
        objectArray[9] = "5\nNH[u(\u001fL\t^)hZ";
        objectArray[10] = "XXvF\fR-x}I\u001d\u001dLvvB\u0019G8";
        objectArray[11] = Void.TYPE;
        _9t_0.j[11] = "java/lang/Void";
        objectArray[12] = "E\u001b\u0017l\u001cK[\u0013\r#a[[";
        objectArray[13] = "/\n\f\u0002>\u00041\u0002\u0016Mc\u00057\u000e\u001b\u000e>\"1\u0019\u001f\u0002}";
        objectArray[14] = "PT=i~CN\\'&6CTV?a?X\u0014v$f#CWP9";
        objectArray[15] = "3\\P'v%-TJh\u00151)\u0019c(,\" ";
        objectArray[16] = "u\u001dd2\u0005Sk\u0015~}hIr\fs!JRp\u000e";
        objectArray[17] = "Bt&kf-\\|<$.-Fv$c'6\u0006S%d+,Az>";
        objectArray[18] = "\u0015#nn!c\u0019+o%hk\u0005#mn\f\u007f\u0019\"L\",i\u00158";
        objectArray[19] = "%B\t\b>~)J\bCwv5B\n\b\u0013b)C!J<|#C\u0010";
        objectArray[20] = Integer.TYPE;
        _9t_0.j[20] = "java/lang/Integer";
        objectArray[21] = "ix\u0018\u0002tgbw\tM\u0014~n{\u000b\u0011";
        objectArray[22] = "m`V[]ufoG\u0014:wsdG_\u0001";
        objectArray[23] = Boolean.TYPE;
        _9t_0.j[23] = "java/lang/Boolean";
        objectArray[24] = "\\,1Oh\u0001B$+\u0000\u000f\u0000S?&Z)\u0006";
        objectArray[25] = "@\u000bM5ra^\u0003Wz\u0010}Y\u001e";
        objectArray[26] = "\u007f\u0014A2lY,\u001cBf\u000bHx\u0001+r:SuUOl6\\\u0014\u0001\u00147`Os\u000eRsb!+\u001cI7wBo\u0001Qm\u000b";
        objectArray[27] = "2\u0001aFN\u00028\u0013=_p\u0010~\u00167T\u0015k3\u0001kO@\u0010>Rk\u0003p";
        objectArray[28] = "\u000f\b\r\u000fKuIQKNs%2^T\u0007\t%MB\n\u0010K";
        objectArray[29] = "\u0010D\u000fQEZCL\f\u0005\"A\u0016L>\u0002^\"KP^\u0014\u001cKAB\u0002\r\"";
        objectArray[30] = "! \b-\u000b}$&\u0010:td,'\f-\u000en--t/Lt*0\u000b{\u000fbuB\u001e&\bf40\u001b \u0010qK";
        objectArray[31] = "2\u0001R)z*m[\b0D(?\u001b\u0012J~.6\u0002\u0015r8<.Un";
        objectArray[32] = "'>C1GL*mC}wLq)\u000e.\u001b7|1\u000e*\bEy7\u0016=w\u0006{b\u0000s\f\u000b(bLC";
        objectArray[33] = "\u001a},{Y1Iu//> \u001dh\u001e?Y1\u001c~:4>7@v'}Z)LyF+\u0000r\u0013k$z_4\u0015\u0004y4\\r\rg=)D(q";
        objectArray[34] = "[&mP\u0000LQ41I>D\u0017&,BBB\u0011K6A\u0002FU/i\u001bX_k";
        objectArray[35] = "3q=LeD<7yN\u000bL22O\\JE#NkErY`1w\u001be\u001b_";
        objectArray[36] = "OJO'ig\rJN\u007f\u0010\u007f\u001eH\u0019g}\u0005IM\u001apk=\u000f_\u0002'\u0010?\u0013I\u0017b(y\u0001Q@\u0019";
        objectArray[37] = "'\u001fJ\u0017/\u0003%\u0017\u001eqq\u000b4\u0012\u001d\u001dCXpLGM\u0014\u0018y\u0000\u001bIp\u0006u\u000fz\u001eyV.I\u001f\u001cq\u0002H";
        objectArray[38] = "~\u0018\nwtv*\u0019O~\u0019t@Z\\\"\"#$\u001aWn{O\u007f\u0014R%e,;\tJ\u007f\u0019";
        objectArray[39] = ">L(%\u000b\u000f1\nl'e\u0007?\u000fZ5'\u00135\u0015T$\u0007\u00059\u000f\u0013%\u001c\u0002l\u0014kv\u0014\u00018s";
        objectArray[40] = "\u001f8^\u000eG[L+\u000bW\u007fFK+Z\u000b\u0013t\u001fo\u0000VF#\u001c7^\u0005\u0004\u001bZ%FR\u007fLKg\\W\u001aNC3:";
        objectArray[41] = "e\u001b3}B>'\u001b2%;7=\u0011k9;c(\u001e9?X'5\u0006cC";
        objectArray[42] = ":Di5i\u0017xDhm\u0010\u001ak_X1p\u0011oX`wb\t8#bkt\u001c}\u001b$ylK\u0006";
        objectArray[43] = "A-\u001c>\u0017F\u0003-\u001dfnE\u0006\u0007Hx\u0012U}%G1\u0014YArNzR$";
        objectArray[44] = "_L\u0003\bm6\u0000@W\u0015\u0006(\u0005NW\u0003Qz]\u001a\fR\u0006\u007f\u000bGQW~,\u0018\u0012\b";
        objectArray[45] = "^x\u000e\u001a :\u0018!H[\u0018i&CX\ta/\\<DWvm";
        objectArray[46] = "!\u0012P\u0000~\br\u001aST\u0019\u0010#\u0010:@(\u0002+S^^$\rJ\u0004P\u000fc\rvSYD%p";
        objectArray[47] = "\u0011x0ApN\u001c+0\r@[GoLZ+U ${B#Y\u0010oq\u000b,5\u001fdc\b<V[y{R@";
        objectArray[48] = "+36\u0007o{a!-\u0004\u0015 \u0010p*T+hr2*Us";
        objectArray[49] = "F\u0004\u0010t;%\f\u0016\u000bwAu}G\f'\u007f6\u001f\u0005\f&'";
        objectArray[50] = "MUx;7\u0004E\u000f'{LU@\ng/6_A\u0000U7\u000fSVou$0WX\u001dp\"(@'\u0005}:%AU\u0000{\"2>";
        objectArray[51] = "\n}`^i]L$&\u001fQ\u000f7y7\u0013j^S9<_32\n}`^i]L$&\u001fQ";
        objectArray[52] = "*\u001d@JF<h\u001dA\u0012?&k\u0006qN_:\u007f\u0001I\bM\"(zK\u0014[7mB\r\u0006C`\u0016@\u0011\u0010V%.\u0006\u0003\b\u0001^";
        objectArray[53] = "[$<\u0005\u0018\u0011\u0004~f\u001c&\u0015R5F\u000bV\t;!jW\\\b\u0007vc\u001c\u001au";
        objectArray[54] = "\u0018\u0006\r\u0005g\u007f\u0010\\RE\u001c*\u001f@4\u0011x8\u001f<P\u0018x,\t\u0004\u0016\n`{r";
        objectArray[55] = "#\u0016r\u000f\u001e\u000bp\u0005'V&\u0016w\u0005v\nJ$$B+V\u001bsu\u0014&\u000b\u001d\u0016w\u001crm\u001c\u0013~\u0010mUZ\u0001fG\u0016";
        objectArray[56] = "it4J\u0001\u0007a.k\nzRn2\u0010Z\u000b=9.7^\u0001\u0005\u007f</\tz";
        objectArray[57] = "1\u0007\u0007#\b5>AC!f3&zG/\u0000\u00157ZQ#\u001aR2R\r2\u001bne[Ftf";
        objectArray[58] = "T4/)=\u001b\u001e&4*GJo+5(}LP.o/~";
        objectArray[59] = "SMmHGMQE9.\u0000Og\\'O\u001aG<^l\\\u001d\u0010X@`S|";
        objectArray[60] = "\u0017~V\u001fe@\u0007fU\u0010\u001b\u000f\u0010`I\r\\\u001fyiV\u0019aN\u0006u\b\u000e#q\u0017~V\u001fe@\u0007fU\u0010\u001b";
        objectArray[61] = "\u0018G\"\u0018~x^\u001edYF,%\u0011{\u0010<(Z\r%\u0007~";
        objectArray[62] = "OA<Fv@\rA=\u001e\u000fO\u0015Zw\tTO\u000f&=\u00154YMO7\u0007h@s";
        objectArray[63] = "*V\u001b\u0004\t-y^\u0018Pn:,SqD_' \u0017\u0015ZS(ACN\u0001\u0005;&L\bE\u0007U";
        objectArray[64] = "ZNa\u001d\u00021\u001c\u0017'\\:ng\u00188\u0015@a\u0018\u0004f\u0002\u0002";
        objectArray[65] = "<sb-Q\u0019~scu(\u0018me\b~T{0yhh\u0016\u0012:k4q(";
        Object[] objectArray2 = objectArray;
        objectArray[66] = "=\u0006$>\u007f\b\u007f\u0006%f\u0006\u0001f\u0007iig\fz\"xq\u0006Pa\u0005|{>\u0016s\u001d+\u0000i\u00000\u001bh<>\t{]\u0015";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9t" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l2, long l3) {
        int n = _9t_0.e(l2, l3);
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
                clazz3 = _9t_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9t_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9t_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9t_0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9t_0.f(252747891485322L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9t_0.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9t_0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9t_0.f(252747891485322L, 0L);
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
            int n = _9t_0.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _9t_0.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9t_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9t_0.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9t_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9t_0.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/krypton/9t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n2 = _9t_0.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0xB6B;
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
                throw new RuntimeException("dev/krypton/9t", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            _9t_0.d[n2] = n3;
        }
        return d[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l2, long l3) {
        int n = _9t_0.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _9t_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9t_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9t_0.c(clazz3, string2, clazz2)) != null) {
                    _9t_0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9t_0.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9t_0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9t_0.f(252747891485322L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void void_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        Map map = (Map)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x67EAC0F5960DL;
        _9t_0.c("\u00ca", (Object)this, new HashMap(map), -8763894545599599820L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9t_0.c("u", (Object)this, (Object)objectArray2, -8762426796828634872L, (long)l2);
    }

    public void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_2248 class_22482 = (class_2248)objectArray[1];
        long l3 = (l2 = a ^ l2) ^ 0x3954E624D87CL;
        _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -4030375431225203387L, (long)l2), (Object)class_22482, -4029464121181786846L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9t_0.c("u", (Object)this, (Object)objectArray2, -4029378068480319623L, (long)l2);
    }

    public List java_util_List_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9t_0.c("v", (Object)this, -1159817477712115696L, (long)l2);
    }

    public Map java_util_Map_3(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l2 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ a;
        return _9t_0.c("v", (Object)this, 2759387441284762399L, (long)l2);
    }

    public Set java_util_Set_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -8149148466282142788L, (long)l2), -8145774596511225530L, (long)l2);
    }

    private static String cfr_renamed_7(short s, short s2, int n, class_2248 class_22482) {
        long l2 = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        return _9t_0.c("u", (Object)_9t_0.c("u", (Object)_9t_0.c("\u00e6", 5109751059143054343L, (long)l2), (Object)class_22482, 5109445753508827044L, (long)l2), 5110637781484683482L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean boolean_5(Object[] objectArray) {
        Object object;
        block8: {
            String string;
            block6: {
                String string2;
                block7: {
                    long l2 = (Long)objectArray[0];
                    string2 = _8j.cfr_renamed_3();
                    try {
                        try {
                            object = _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, 6340258588973578921L, (long)l2), 6339858934042076252L, (long)l2);
                            string = string2;
                            if (l2 < 0L) break block6;
                            if (string != null) break block7;
                            if (object == false) break block8;
                        }
                        catch (MatchException matchException) {
                            throw _9t_0.a(matchException);
                        }
                        object = _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, 6340300298194449079L, (long)l2), 6339858934042076252L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _9t_0.a(matchException);
                    }
                }
                string = string2;
            }
            if (string != null) return (boolean)object;
            if (object != false) {
                object = true;
                return (boolean)object;
            }
        }
        object = false;
        return (boolean)object;
    }

    @Override
    public void void_7(Object[] objectArray) {
        block29: {
            Object object;
            JsonElement jsonElement;
            String string;
            long l2;
            long l3;
            long l4;
            block28: {
                JsonElement jsonElement2 = (JsonElement)objectArray[0];
                l4 = (Long)objectArray[1];
                long l5 = l4;
                l3 = l5 ^ 0x701E675BFBC3L;
                l2 = l5 ^ 0x18CA3199A9FCL;
                string = _8j.cfr_renamed_3();
                try {
                    try {
                        jsonElement = jsonElement2;
                        if (string != null) break block28;
                        if (_9t_0.c("u", (Object)jsonElement, -1464708667741356741L, (long)l4) == false) break block29;
                    }
                    catch (MatchException matchException) {
                        throw _9t_0.a(matchException);
                    }
                    jsonElement = jsonElement2;
                }
                catch (MatchException matchException) {
                    throw _9t_0.a(matchException);
                }
            }
            CallSite callSite = _9t_0.c("u", (Object)jsonElement, -1464813447889388746L, (long)l4);
            _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -1464105643338955014L, (long)l4), -1465832466806950024L, (long)l4);
            CallSite callSite2 = _9t_0.c("u", (Object)_9t_0.c("u", (Object)callSite, -1466692462039737791L, (long)l4), -1465191764555282832L, (long)l4);
            block26: while (_9t_0.c("u", (Object)callSite2, -1463870498103904978L, (long)l4) != false) {
                object = _9t_0.c("u", (Object)callSite2, -1466498728671613024L, (long)l4);
                do {
                    block31: {
                        CallSite callSite3;
                        CallSite callSite4;
                        CallSite callSite5;
                        CallSite callSite6;
                        class_2248 class_22482;
                        block38: {
                            block39: {
                                CallSite callSite7;
                                CallSite callSite8;
                                block36: {
                                    block37: {
                                        CallSite callSite9;
                                        block34: {
                                            block35: {
                                                CallSite callSite10;
                                                block32: {
                                                    block33: {
                                                        CallSite callSite11;
                                                        String string2;
                                                        block30: {
                                                            string2 = (String)object;
                                                            CallSite callSite12 = _9t_0.c("u", (Object)callSite, (Object)string2, -1464258568258956073L, (long)l4);
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (string != null) break block29;
                                                                        callSite11 = callSite12;
                                                                        if (string != null) break block30;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw _9t_0.a(matchException);
                                                                    }
                                                                    if (_9t_0.c("u", (Object)callSite11, -1464708667741356741L, (long)l4) == false) break block31;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw _9t_0.a(matchException);
                                                                }
                                                                callSite11 = callSite12;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _9t_0.a(matchException);
                                                            }
                                                        }
                                                        callSite8 = _9t_0.c("u", (Object)callSite11, -1464813447889388746L, (long)l4);
                                                        class_22482 = (class_2248)_9t_0.c("u", (Object)_9t_0.c("\u00e6", -1465583575461562041L, (long)l4), (Object)_9t_0.c("H", string2, -1464944970327392118L, (long)l4), -1463736419402696793L, (long)l4);
                                                        try {
                                                            try {
                                                                callSite10 = _9t_0.c("u", (Object)callSite8, (Object)"r", -1465491086767698924L, (long)l4);
                                                                if (string != null) break block32;
                                                                if (callSite10 == false) break block33;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _9t_0.a(matchException);
                                                            }
                                                            callSite10 = _9t_0.c("u", (Object)_9t_0.c("u", (Object)callSite8, (Object)"r", -1464258568258956073L, (long)l4), -1465146995950310121L, (long)l4);
                                                            break block32;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _9t_0.a(matchException);
                                                        }
                                                    }
                                                    callSite10 = _9t_0.a("k", 24558, (long)(0x52930A343A39BF27L ^ l4));
                                                }
                                                callSite6 = callSite10;
                                                try {
                                                    try {
                                                        callSite9 = _9t_0.c("u", (Object)callSite8, (Object)"g", -1465491086767698924L, (long)l4);
                                                        if (string != null) break block34;
                                                        if (callSite9 == false) break block35;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _9t_0.a(matchException);
                                                    }
                                                    callSite9 = _9t_0.c("u", (Object)_9t_0.c("u", (Object)callSite8, (Object)"g", -1464258568258956073L, (long)l4), -1465146995950310121L, (long)l4);
                                                    break block34;
                                                }
                                                catch (MatchException matchException) {
                                                    throw _9t_0.a(matchException);
                                                }
                                            }
                                            callSite9 = _9t_0.a("k", 6586, (long)(0x737C2E0FF36F972L ^ l4));
                                        }
                                        callSite5 = callSite9;
                                        try {
                                            try {
                                                callSite7 = _9t_0.c("u", (Object)callSite8, (Object)"b", -1465491086767698924L, (long)l4);
                                                if (string != null) break block36;
                                                if (callSite7 == false) break block37;
                                            }
                                            catch (MatchException matchException) {
                                                throw _9t_0.a(matchException);
                                            }
                                            callSite7 = _9t_0.c("u", (Object)_9t_0.c("u", (Object)callSite8, (Object)"b", -1464258568258956073L, (long)l4), -1465146995950310121L, (long)l4);
                                            break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw _9t_0.a(matchException);
                                        }
                                    }
                                    callSite7 = _9t_0.a("k", 6586, (long)(0x737C2E0FF36F972L ^ l4));
                                }
                                callSite4 = callSite7;
                                try {
                                    try {
                                        callSite3 = _9t_0.c("u", (Object)callSite8, (Object)"a", -1465491086767698924L, (long)l4);
                                        if (string != null) break block38;
                                        if (callSite3 == false) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw _9t_0.a(matchException);
                                    }
                                    callSite3 = _9t_0.c("u", (Object)_9t_0.c("u", (Object)callSite8, (Object)"a", -1464258568258956073L, (long)l4), -1465146995950310121L, (long)l4);
                                    break block38;
                                }
                                catch (MatchException matchException) {
                                    throw _9t_0.a(matchException);
                                }
                            }
                            callSite3 = _9t_0.a("k", 6586, (long)(0x737C2E0FF36F972L ^ l4));
                        }
                        CallSite callSite13 = callSite3;
                        _9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -1464105643338955014L, (long)l4), (Object)class_22482, (Object)new _8B((int)callSite6, (int)callSite5, l2, (int)callSite4, (int)callSite13), -1463926078504810170L, (long)l4);
                    }
                    if (string == null) continue block26;
                    object = this;
                } while (l4 <= 0L);
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l3;
            _9t_0.c("u", (Object)object, (Object)objectArray2, -1464922547798393658L, (long)l4);
        }
    }

    public _8B dev_krypton_8B_8(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        return (_8B)((Object)_9t_0.c("u", (Object)_9t_0.c("v", (Object)this, 558014575832853226L, (long)l2), (Object)class_22482, 556360641045777359L, (long)l2));
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2;
        long l4 = l3 ^ 0x2EAC3F0878CL;
        long l5 = l3 ^ 0x7D4F2B65547FL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        JsonObject jsonObject = new JsonObject();
        _9t_0.c("u", (Object)_9t_0.c("u", (Object)_9t_0.c("u", (Object)_9t_0.c("u", (Object)_9t_0.c("v", (Object)this, -4040997117493564737L, (long)l2), -4041771291355442002L, (long)l2), -4043696248867024996L, (long)l2), (Object)_9t_0.c("H", (Object)_9t_0.c("H", arg_0 -> _9t_0.cfr_renamed_7((short)n, (short)n2, n3, arg_0), -4044063146563037365L, (long)l2), -4040938325989822023L, (long)l2), -4039957320522817770L, (long)l2), arg_0 -> _9t_0.cfr_renamed_0(l4, jsonObject, arg_0), -4040643362402043885L, (long)l2);
        return jsonObject;
    }

    private static void cfr_renamed_0(long l2, JsonObject jsonObject, Map.Entry entry) {
        l2 = a ^ l2;
        JsonObject jsonObject2 = new JsonObject();
        _8B b = (_8B)((Object)_9t_0.c("u", (Object)entry, -7702112899702338585L, (long)l2));
        _9t_0.c("u", (Object)jsonObject2, (Object)"r", (Object)_9t_0.c("H", (int)_9t_0.c("v", (Object)b, -7702730203422400910L, (long)l2), -7701664051234377179L, (long)l2), -7703019414358688438L, (long)l2);
        _9t_0.c("u", (Object)jsonObject2, (Object)"g", (Object)_9t_0.c("H", (int)_9t_0.c("v", (Object)b, -7703905190962329937L, (long)l2), -7701664051234377179L, (long)l2), -7703019414358688438L, (long)l2);
        _9t_0.c("u", (Object)jsonObject2, (Object)"b", (Object)_9t_0.c("H", (int)_9t_0.c("v", (Object)b, -7709854233644731424L, (long)l2), -7701664051234377179L, (long)l2), -7703019414358688438L, (long)l2);
        _9t_0.c("u", (Object)jsonObject2, (Object)"a", (Object)_9t_0.c("H", (int)_9t_0.c("v", (Object)b, -7701615209310100192L, (long)l2), -7701664051234377179L, (long)l2), -7703019414358688438L, (long)l2);
        _9t_0.c("u", (Object)jsonObject, (Object)_9t_0.c("u", (Object)_9t_0.c("u", (Object)_9t_0.c("\u00e6", -7702839668950169612L, (long)l2), (Object)((class_2248)_9t_0.c("u", (Object)entry, -7701412808751872777L, (long)l2)), -7702533658987439017L, (long)l2), -7701192360499080407L, (long)l2), (Object)jsonObject2, -7703484171780897449L, (long)l2);
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x4B8C2EA3470L;
        _9t_0.c("\u00ca", (Object)this, new HashMap(_9t_0.c("v", (Object)this, 2602338505981919575L, (long)l2)), 2602243899398474057L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9t_0.c("u", (Object)this, (Object)objectArray2, 2601101545004462965L, (long)l2);
    }

    public Map java_util_Map_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9t_0.c("v", (Object)this, -5919375752826779504L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9t_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_9t_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

