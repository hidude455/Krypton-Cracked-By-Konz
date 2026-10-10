/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _9i
extends _95 {
    private final List cfr_renamed_6;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] i;
    private static final String[] j;

    public void void_1(Object[] objectArray) {
        List list = (List)objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l2 = ((long)n << 48 | (long)n2 << 32 >>> 16 | (long)n3 << 48 >>> 48) ^ a;
        long l3 = l2 ^ 0x54F0932BE343L;
        _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -924927828819058134L, (long)l2), -925460539993075215L, (long)l2);
        _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -924927828819058134L, (long)l2), (Object)list, -925102073733243887L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9i.c("\u00d2", (Object)this, (Object)objectArray2, -926279996229117968L, (long)l2);
    }

    public List java_util_List_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return new ArrayList(_9i.c("R", (Object)this, 1190022814196171136L, (long)l2));
    }

    public _9i(int n, long l2) {
        long l3 = (l2 = a ^ l2) ^ 0x7A38C3DB32E5L;
        int n2 = (int)(l3 >>> 48);
        int n3 = (int)(l3 << 16 >>> 32);
        int n4 = (int)(l3 << 48 >>> 48);
        super((short)n2, n, n3, n4);
        this.cfr_renamed_6 = new ArrayList();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _9i.a = l.a(-5376681637557717054L, -564056231157152305L, MethodHandles.lookup().lookupClass()).a(54838935019525L);
                _9i.i = new Object[48];
                _9i.j = new String[48];
                _9i.b();
                _9i.e = new HashMap<K, V>(13);
                var0 = _9i.a ^ 5941536472602L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u001c\u0015\u0015\u007f\u00ef$QJ\\z\u00f9f\u00b1\u0095\u00e19\u0010\u00f3_\u0003E\u00c1H\u00c1M'\u008b\u00f4\u00d0\u0098\u0080\u00a65";
                var8_6 = "\u001c\u0015\u0015\u007f\u00ef$QJ\\z\u00f9f\u00b1\u0095\u00e19\u0010\u00f3_\u0003E\u00c1H\u00c1M'\u008b\u00f4\u00d0\u0098\u0080\u00a65".length();
                var5_7 = 16;
                var4_8 = -1;
lbl23:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _9i.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a4\u000f\u00f1o\u00c5\u00f7+-\r\u00cd\u001e*\u00a5\u00ab\u00afM\u0010\u00ea\u00a4\u00b8\u00d1\u00b5\u00db\u00cc\"\u00c1\u00c6Q\u00be\u001c\u00c7\u00ec\u00d7";
                    var8_6 = "\u00a4\u000f\u00f1o\u00c5\u00f7+-\r\u00cd\u001e*\u00a5\u00ab\u00afM\u0010\u00ea\u00a4\u00b8\u00d1\u00b5\u00db\u00cc\"\u00c1\u00c6Q\u00be\u001c\u00c7\u00ec\u00d7".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl37:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _9i.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        _9i.c = var9_3;
        _9i.d = new String[4];
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
            case 1 -> 42;
            case 2 -> 50;
            case 3 -> 52;
            case 4 -> 53;
            case 5 -> 49;
            case 6 -> 16;
            case 7 -> 9;
            case 8 -> 45;
            case 9 -> 18;
            case 10 -> 56;
            case 11 -> 2;
            case 12 -> 10;
            case 13 -> 8;
            case 14 -> 26;
            case 15 -> 6;
            case 16 -> 51;
            case 17 -> 44;
            case 18 -> 46;
            case 19 -> 55;
            case 20 -> 15;
            case 21 -> 30;
            case 22 -> 4;
            case 23 -> 62;
            case 24 -> 48;
            case 25 -> 5;
            case 26 -> 21;
            case 27 -> 33;
            case 28 -> 32;
            case 29 -> 1;
            case 30 -> 58;
            case 31 -> 37;
            case 32 -> 25;
            case 33 -> 63;
            case 34 -> 24;
            case 35 -> 28;
            case 36 -> 23;
            case 37 -> 54;
            case 38 -> 43;
            case 39 -> 34;
            case 40 -> 31;
            case 41 -> 60;
            case 42 -> 47;
            case 43 -> 27;
            case 44 -> 12;
            case 45 -> 11;
            case 46 -> 19;
            case 47 -> 17;
            case 48 -> 14;
            case 49 -> 13;
            case 50 -> 0;
            case 51 -> 22;
            case 52 -> 38;
            case 53 -> 57;
            case 54 -> 7;
            case 55 -> 36;
            case 56 -> 61;
            case 57 -> 29;
            case 58 -> 39;
            case 59 -> 35;
            case 60 -> 59;
            case 61 -> 41;
            case 62 -> 40;
            default -> 20;
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
        _9i.j[n3] = new String(cArray);
        return n3;
    }

    public void void_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x40CE9983443L;
        _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, 2605807331361830186L, (long)l2), 2605414258164467441L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9i.c("\u00d2", (Object)this, (Object)objectArray2, 2604595420600811760L, (long)l2);
    }

    public _8j dev_krypton_8j_9(Object[] objectArray) {
        block6: {
            int n;
            long l2;
            int n2;
            block5: {
                n2 = (Integer)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                String string = _8j.cfr_renamed_3();
                try {
                    n = n2;
                    if (string != null) break block5;
                    if (n < 0) break block6;
                }
                catch (MatchException matchException) {
                    throw _9i.a(matchException);
                }
                n = n2;
            }
            try {
                if (n < _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -126400358221222083L, (long)l2), -129866545215428925L, (long)l2)) {
                    return (_8j)((Object)_9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -126400358221222083L, (long)l2), (int)n2, -130415660532607938L, (long)l2));
                }
            }
            catch (MatchException matchException) {
                throw _9i.a(matchException);
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00a5' || c == '\u00f5' || c == 't') {
                field = _9i.g(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _9i.h(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        i[0] = "\rtTM\u00197\u0013|N\u0002{+\u0014a";
        objectArray[1] = Integer.TYPE;
        _9i.j[1] = "java/lang/Integer";
        objectArray[2] = ")o\u0019\r?#4z\u001bL:\u007ftc";
        objectArray[3] = Boolean.TYPE;
        _9i.j[3] = "java/lang/Boolean";
        objectArray[4] = Void.TYPE;
        _9i.j[4] = "java/lang/Void";
        objectArray[5] = "C~<Q0p^k>\u00105,\u001e.";
        objectArray[6] = "A=\u000f\u0012o14\u001d\u0004\u001d~~U\u0013\u000f\u0016z$!";
        objectArray[7] = "\u0013\u0014*\u0000\u000f\u0013f4!\u000f\u001e\\\u0007:*\u0004\u001a\u0006s";
        objectArray[8] = "~ZC\u001feHrRBT,@nZ@\u001fHTr[aShB~A";
        objectArray[9] = "\\9\u0003u)\bW6\u0012:T\u0010D1\u001bs";
        objectArray[10] = "K'{D|\u0013G/z\u000f5\u001b['xDQ\u000fG&W\u0018i\u001dQ";
        objectArray[11] = "\u001dSNLX\u0006\u0003[T\u0003?\u0007\u0012@YY\u0019\u0001";
        objectArray[12] = "5\u00020o|U9\n1$5]%\u00023oQI9\u0003\u0018-~W3\u0003)";
        objectArray[13] = "\u0013q\u0000-a\u0004\u0018~\u0011b\u0000\n\u0013u\u00158";
        objectArray[14] = "w\\\u0013%\u001b\u0019\u0002|\u0018*\nVcr\u0013!\u000e\f\u0017";
        objectArray[15] = "W\\T\u0018\u0010\tITNW}\u0013QQG\u001aJ\u0015RS";
        objectArray[16] = "\u001d8k&,k\u0000-ig)7A7";
        objectArray[17] = "073\u001dQ!;8\"R1874 \u000e";
        objectArray[18] = "m\u0002\u0003HE#f\r\u0012\u0007\"!s\u0006\u0012L\u0019";
        objectArray[19] = "\u0017%`HA\u001aYjc\u0019,\u0014\\\u0016zNJ<].hX,O\u0017h{@W\u001aY/a)";
        objectArray[20] = "w&'\u0012>P)bpj*\f+\u001dz\n:\u0002!g*\u0001:\u0010G'{V9\t<r5\u0011#`";
        objectArray[21] = ",I(?U>w\u0016{b6$q\u0006mZ\u0007\"e\u0014w W)e\u0006\u0011";
        objectArray[22] = "Ai\u001a96B\u001f-MA$\u001f\rR\r\u007f+\u0003\n>\u0007>/r@2\u000f#-\b\u00109\u000f1K";
        objectArray[23] = "~ty\u0004%\r\u007fp8E\u0014TGsy\u001ew\u0001\u007f#>\u000f{k~ty\u0004%\r\u007fp8E\u0014";
        objectArray[24] = "z^\u0019\u0018[I$\u001fE\u001b8E(\u000b{\u001d_T)\u001d_\u00168\u0012?VH\\F@'\nHgRS4\u000bG\u0006U\u0016#[#\\UW$\u001b\u0019\t\u0000\u0017>g";
        objectArray[25] = "\r<\u000ej\u0012\u007fXf\u0000e\u007f:gvO;\u000e|\u000b|\u000e?";
        objectArray[26] = "FTA_T\u0017\u0018\u0010\u0016'SJ\u0013\bSJ)\\H\u000f\\\\EV\t\u000b-\u0016I^\u0014\tWFB^\u0006o";
        objectArray[27] = "I\u0002eymm\u0007Mf(\u0000m\u0014\u000fMcAd\u0005s\u007f&`s\u0002\u001fugd\u0002";
        objectArray[28] = "\n(&\t9.\u000f\u007f/_Iy6|#X*(\u000e,dI&B\rxdY5xX-$CI";
        objectArray[29] = "W|Y\u001d\u00184\u00193ZLu4\nqq\u00077 \u0000k\u007f\u0016\u00176\fq8BLa\u0018n]\u001c\r=\u001b\r";
        objectArray[30] = "<\u0016\u0014\u0003lfbRC{j7~@x\u0000/6}V\u0014\nn2\f";
        objectArray[31] = "^\u0002/\u0002jKX\u0006>\tQ\u0012\rPC@ \u001a\u0000Q,\u000eo\u0019Q<x\u001d*\u001b\u001d\u0006-Hj\u0001a";
        objectArray[32] = "\"2}`sr|v*\u0018o9_lid\u007fB(9-bg9}wjx\u000e";
        objectArray[33] = "t7/hRr*vsk1w#u\u0015)J&!5k{Rz!\u000e/'\rm#uziJwJ";
        objectArray[34] = "f\u001avWOr`\u001eg\\t#%I`L\b%#$*\u001aM':XqE\u001ezY";
        objectArray[35] = "|5\u001aY5#}1[\u0018\u0004tE2\u001aCg/}b]RkE~6]Bx\u007f+c\u001dX\u0004";
        objectArray[36] = "9@\u0014qf\u0006g\u0004C\tzJd\u0001\u0011u|L\tKG0~Uu\u0010\u0018c#6";
        objectArray[37] = "]2\u0007fH#\u0006mT;+?\u0004vxn[#m7\u000e?Q6\u0016b@xK_";
        objectArray[38] = "MMHM\u0018-\u0003\u0002K\u001cu-\u0010@`W.>\u0007]OCu|\u0006\rB\u0017\u000b.\u001eQB,";
        objectArray[39] = "\u007fl$U\u0010+1#'\u0004}+\"a\fO??({\fN\u0007->\u001dz\n\u00116t-|\u000e\u0000=O";
        objectArray[40] = "\u000e7!QIrPsv)_&Se7)\u000f/El1\u0013Zz\u0005vM";
        objectArray[41] = "T\u0001#\u007f\\\u0007\u001aN .1\t\u001f29yW/\u000e\u0012/uMh^@~dX\u0013\u000b\u000e9~1";
        objectArray[42] = "\u0013HRqP\u0017F\u0012\\~=TyGVqVT\u0007\u0015N-V";
        objectArray[43] = "\u001cF5\u001f\u0000\u001d\u0019\u000e>\u00128[\u001eP8\u0015\u007fKwO{\u0018I^\u001bE:\u001c8N\u0005D\"@\u0000KMO/x";
        objectArray[44] = "\\sSU\n{\u00022\u000fViw\u000e&1P\u000ef\u000f0\u0015[i \u0019{\u0002\u0011\u0017r\u0001'\u0002*WeS!RT\u0005}\u000f!i\u0011\u0004e\u00026SDQ%\u0018J";
        objectArray[45] = "O\u0016\u001e\n,\u0016\u0011RIr8J\u0013d\u0016\u0016QO\u0003D\u001dJ?\u001fFK\u001erk\u0016CW\u001b\t>X\u0004Mr";
        objectArray[46] = "\nZ9!3^T\u001be\"PTY\u001f\u0003`+\n_X}23V_c3/1ZY\f}`2\u000b4";
        Object[] objectArray2 = objectArray;
        objectArray[47] = "V;p\u001fC\u000eW?1^rSoew\b\n\u0015_;3_";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _9i.b(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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
            throw new RuntimeException("dev/krypton/9i" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Method h(long l2, long l3) {
        int n = _9i.e(l2, l3);
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
                clazz3 = _9i.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _9i.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _9i.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        _9i.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _9i.f(964078742501385L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _9i.d(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _9i.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _9i.f(964078742501385L, 0L);
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
            int n = _9i.e(l2, l3);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                _9i.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = _9i.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _9i.d(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _9i.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _9i.d(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _9i.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/9i" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x307B;
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
                throw new RuntimeException("dev/krypton/9i", exception);
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
            _9i.d[n2] = _9i.a(((Cipher)objectArray[0]).doFinal(byArray2));
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

    private static Field g(long l2, long l3) {
        int n = _9i.e(l2, l3);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = _9i.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _9i.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _9i.c(clazz3, string2, clazz2)) != null) {
                    _9i.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _9i.d(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _9i.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _9i.f(964078742501385L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void void_0(Object[] objectArray) {
        block6: {
            int n;
            long l2;
            long l3;
            int n2;
            block5: {
                n2 = (Integer)objectArray[0];
                l3 = (Long)objectArray[1];
                l2 = (l3 = a ^ l3) ^ 0x7B4D36A6C998L;
                String string = _8j.cfr_renamed_3();
                try {
                    n = n2;
                    if (string != null) break block5;
                    if (n < 0) break block6;
                }
                catch (MatchException matchException) {
                    throw _9i.a(matchException);
                }
                n = n2;
            }
            try {
                if (n < _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -2741899734727735055L, (long)l3), -2738575410922585841L, (long)l3)) {
                    _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -2741899734727735055L, (long)l3), (int)n2, -2738261766475828708L, (long)l3);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    _9i.c("\u00d2", (Object)this, (Object)objectArray2, -2738717447598392021L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw _9i.a(matchException);
            }
        }
    }

    @Override
    public _95 dev_krypton_95_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x56259C8BB8C6L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        return _9i.c("\u00d2", (Object)this, (Object)objectArray2, 2219664549152067362L, (long)l2);
    }

    public void cfr_renamed_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        int n = (Integer)objectArray[2];
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x3551C1AFED12L;
        long l5 = l3 ^ 0x42B244E35DA3L;
        _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, 5605267709363576010L, (long)l2), (Object)new _8j(l4, string, n), 5604473529647200080L, (long)l2);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        _9i.c("\u00d2", (Object)this, (Object)objectArray2, 5603928203325221136L, (long)l2);
    }

    public int int_2(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return (int)_9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -4598211547005529812L, (long)l2), -4601642605327607598L, (long)l2);
    }

    @Override
    public boolean boolean_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        return (boolean)_9i.c("\u00d2", (Object)_9i.c("R", (Object)this, 6339581530010896121L, (long)l2), 6339170359972547215L, (long)l2);
    }

    public _9i dev_krypton_9i_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = (l2 = a ^ l2) ^ 0x5F57ED79411AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        super.dev_krypton_95_0(objectArray2);
        return this;
    }

    @Override
    public void void_7(Object[] objectArray) {
        block21: {
            Object object;
            JsonElement jsonElement;
            String string;
            long l2;
            long l3;
            long l4;
            long l5;
            block20: {
                JsonElement jsonElement2 = (JsonElement)objectArray[0];
                l5 = (Long)objectArray[1];
                long l6 = l5;
                l4 = l6 ^ 0x7FDE2174B72L;
                l3 = l6 ^ 0x701E675BFBC3L;
                l2 = l6 ^ 0x7D60FF31365CL;
                string = _8j.cfr_renamed_3();
                try {
                    try {
                        jsonElement = jsonElement2;
                        if (string != null) break block20;
                        if (_9i.c("\u00d2", (Object)jsonElement, -1466245877208543865L, (long)l5) == false) break block21;
                    }
                    catch (MatchException matchException) {
                        throw _9i.a(matchException);
                    }
                    jsonElement = jsonElement2;
                }
                catch (MatchException matchException) {
                    throw _9i.a(matchException);
                }
            }
            CallSite callSite = _9i.c("\u00d2", (Object)jsonElement, -1464812308523882928L, (long)l5);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            _9i.c("\u00d2", (Object)this, (Object)objectArray2, -1465134310077252526L, (long)l5);
            CallSite callSite2 = _9i.c("\u00d2", (Object)callSite, -1465203729491107769L, (long)l5);
            block18: while (_9i.c("\u00d2", (Object)callSite2, -1465001609627107330L, (long)l5) != false) {
                object = _9i.c("\u00d2", (Object)callSite2, -1466082449071369949L, (long)l5);
                do {
                    block23: {
                        Object object2;
                        CallSite callSite3;
                        block27: {
                            block28: {
                                Object object3;
                                CallSite callSite4;
                                block29: {
                                    block26: {
                                        CallSite callSite5;
                                        block24: {
                                            CallSite callSite6;
                                            CallSite callSite7;
                                            block25: {
                                                JsonElement jsonElement3;
                                                block22: {
                                                    JsonElement jsonElement4 = (JsonElement)object;
                                                    try {
                                                        try {
                                                            try {
                                                                if (string != null) break block21;
                                                                jsonElement3 = jsonElement4;
                                                                if (string != null) break block22;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw _9i.a(matchException);
                                                            }
                                                            if (_9i.c("\u00d2", (Object)jsonElement3, -1465821967801331144L, (long)l5) == false) break block23;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw _9i.a(matchException);
                                                        }
                                                        jsonElement3 = jsonElement4;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _9i.a(matchException);
                                                    }
                                                }
                                                callSite4 = _9i.c("\u00d2", (Object)jsonElement3, -1466657735478004828L, (long)l5);
                                                try {
                                                    try {
                                                        callSite5 = callSite4;
                                                        if (l5 <= 0L) break block24;
                                                        callSite7 = _9i.a("o", 671, (long)(0xD9B4342E91B5946L ^ l5));
                                                        if (string != null) break block25;
                                                        if (_9i.c("\u00d2", (Object)callSite5, (Object)callSite7, -1465224947948309247L, (long)l5) == false) break block26;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw _9i.a(matchException);
                                                    }
                                                    callSite6 = callSite4;
                                                    callSite7 = _9i.a("o", 671, (long)(0xD9B4342E91B5946L ^ l5));
                                                }
                                                catch (MatchException matchException) {
                                                    throw _9i.a(matchException);
                                                }
                                            }
                                            callSite5 = _9i.c("\u00d2", (Object)callSite6, (Object)callSite7, -1465489822852732864L, (long)l5);
                                        }
                                        object3 = _9i.c("\u00d2", (Object)callSite5, -1464905899227929601L, (long)l5);
                                        break block29;
                                    }
                                    object3 = "";
                                }
                                callSite3 = object3;
                                try {
                                    try {
                                        object2 = _9i.c("\u00d2", (Object)callSite4, (Object)_9i.a("o", 471, (long)(0x7C2523D9F7C35A0CL ^ l5)), -1465224947948309247L, (long)l5);
                                        if (string != null) break block27;
                                        if (object2 == false) break block28;
                                    }
                                    catch (MatchException matchException) {
                                        throw _9i.a(matchException);
                                    }
                                    object2 = _9i.c("\u00d2", (Object)_9i.c("\u00d2", (Object)callSite4, (Object)_9i.a("o", 471, (long)(0x7C2523D9F7C35A0CL ^ l5)), -1465489822852732864L, (long)l5), -1466806412592614512L, (long)l5);
                                    break block27;
                                }
                                catch (MatchException matchException) {
                                    throw _9i.a(matchException);
                                }
                            }
                            object2 = -1;
                        }
                        Object object4 = object2;
                        _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -1465398428276229462L, (long)l5), (Object)new _8j(l4, (String)((Object)callSite3), (int)object4), -1466163197134515920L, (long)l5);
                    }
                    if (string == null) continue block18;
                    object = this;
                } while (l5 <= 0L);
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l3;
            _9i.c("\u00d2", (Object)object, (Object)objectArray3, -1466742263579766928L, (long)l5);
        }
    }

    @Override
    public void void_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        long l3 = l2 ^ 0x9C65A80F9EFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        _9i.c("\u00d2", (Object)this, (Object)objectArray2, 2601313382446035937L, (long)l2);
    }

    public List java_util_List_8(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        return _9i.c("R", (Object)this, 1964865009237494343L, (long)l2);
    }

    @Override
    public JsonElement com_google_gson_JsonElement_8(Object[] objectArray) {
        JsonArray jsonArray;
        block6: {
            long l2 = (Long)objectArray[0];
            JsonArray jsonArray2 = new JsonArray();
            CallSite callSite = _9i.c("\u00d2", (Object)_9i.c("R", (Object)this, -4040618644690577681L, (long)l2), -4040243567171856113L, (long)l2);
            String string = _8j.cfr_renamed_3();
            block2: while (_9i.c("\u00d2", (Object)callSite, -4040210551559367749L, (long)l2) != false) {
                _8j j = (_8j)((Object)_9i.c("\u00d2", (Object)callSite, -4043562986447389338L, (long)l2));
                JsonObject jsonObject = new JsonObject();
                try {
                    _9i.c("\u00d2", (Object)jsonObject, (Object)_9i.a("o", 14883, (long)(0x3DA346EBE35FCDBCL ^ l2)), (Object)_9i.c("R", (Object)j, -4040377434416452498L, (long)l2), -4040829899398710697L, (long)l2);
                    _9i.c("\u00d2", (Object)jsonObject, (Object)_9i.a("o", 7854, (long)(0x4E5A4C13B20AE933L ^ l2)), (Object)_9i.c("\u00c5", (int)_9i.c("R", (Object)j, -4043864939746552744L, (long)l2), -4040310693082212132L, (long)l2), -4043909988693264719L, (long)l2);
                    do {
                        if (l2 >= 0L) {
                            jsonArray = jsonArray2;
                            if (string != null) break block6;
                            _9i.c("\u00d2", (Object)jsonArray, (Object)jsonObject, -4043971862789524378L, (long)l2);
                        }
                        if (string == null) continue block2;
                    } while (l2 < 0L);
                    break;
                }
                catch (MatchException matchException) {
                    throw _9i.a(matchException);
                }
            }
            jsonArray = jsonArray2;
        }
        return jsonArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_9i.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_9i.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

