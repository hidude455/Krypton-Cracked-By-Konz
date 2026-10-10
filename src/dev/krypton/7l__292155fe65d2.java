/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  java.lang.MatchException
 */
package dev.krypton;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.krypton._3K;
import dev.krypton._4w;
import dev.krypton._6F;
import dev.krypton._7P;
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

public class _7l {
    private String cfr_renamed_5;
    private String cfr_renamed_1;
    private _7P cfr_renamed_0;
    private _3K cfr_renamed_2;
    private List cfr_renamed_3;
    private static _4w[] cfr_renamed_7;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public static _4w[] cfr_renamed_5() {
        return cfr_renamed_7;
    }

    public void cfr_renamed_5(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    try {
                        callSite = _7l.b("\u00e2", (Object)this, 7798106724385933003L, (long)l2);
                        if (wArray == null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                    _7l.b("\u00eb", (Object)this, (_3K)new _3K(), 7798106724385933003L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7l.a(matchException);
                }
            }
            callSite = _7l.b("\u00e2", (Object)this, 7798106724385933003L, (long)l2);
        }
        _7l.b("\u00eb", (Object)callSite, (Long)((Object)_7l.b("\u00f2", (long)l3, 7798267110157951698L, (long)l2)), 7798547464202153996L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _7l.a = l.a(-7860353306989014847L, -6457582280422375147L, MethodHandles.lookup().lookupClass()).a(277506796442965L);
                _7l.e = new Object[43];
                _7l.f = new String[43];
                _7l.a();
                _7l.d = new HashMap<K, V>(13);
                var0 = _7l.a ^ 10788742122546L;
                _7l.cfr_renamed_0(new _4w[1]);
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u0099o[\u00f1Ix1\u0083\u00ba\u008cj\u0011ghq%\u0018\u0011\u00b5)<\u001dU\fQY\u009a\u0007^\f\u0013G2{\u00b1\u00b7\u00e5 S7\u00a7\u0018|\u0097%B\u009eGHm\u00c5\u008d\u0097k\u00f3sYx\u008a\u001au\u0002\u00e7\u0007\u00ffV\u0010h\u0088\u00c8\u00e1\u0014@\u00af\u00c5\u00d6\u00aa\f\u00c9\u0095_\u00ad=\u0018\u00c2~|\tN\u00ff9 \u00fc\u00c1g\u00ecH\u00f4\u00b3\u008fV\u0018l\u00df\u0081\u00b3\u00dc\u00b3\u0010\u00f7\u0007\u000bX\u00ad\u0080\u00ae;\u00e8!\u001fo\u00bdH\u00f7\u00c0\u0010\u00c2 {B\u00ab\u00d7G\u008f\u00b7\\L\u0088\u0083kS\u00a9\u0010\u00ca\u00e7n\u00b9hQ\u00b79\u00b2\u00af\u00b5a\u00e8\u00ac\u00ee\u00e9\u0010\u00cb\u00e8+9\u00a9\u00e8l\u0097\u00b2\u00e1\u00db\u00a9c\u00a1\u008e\u009d\u0018\fx\u008f6\u00e6\u00fble\u0088H\u00ee\u00b8\u0016K\u00a9\u00a9\u0089\u00f7\u009b\u0003;\u001a\u0018\u00dd\u0018\\\u00195:\u0019\u000fu\u00b9\u00f2*\u00da\u00e6\u00ff|\u00b5c4\u009c\u00a1\u0018W\u0097\u00d5e";
                var8_6 = "\u0099o[\u00f1Ix1\u0083\u00ba\u008cj\u0011ghq%\u0018\u0011\u00b5)<\u001dU\fQY\u009a\u0007^\f\u0013G2{\u00b1\u00b7\u00e5 S7\u00a7\u0018|\u0097%B\u009eGHm\u00c5\u008d\u0097k\u00f3sYx\u008a\u001au\u0002\u00e7\u0007\u00ffV\u0010h\u0088\u00c8\u00e1\u0014@\u00af\u00c5\u00d6\u00aa\f\u00c9\u0095_\u00ad=\u0018\u00c2~|\tN\u00ff9 \u00fc\u00c1g\u00ecH\u00f4\u00b3\u008fV\u0018l\u00df\u0081\u00b3\u00dc\u00b3\u0010\u00f7\u0007\u000bX\u00ad\u0080\u00ae;\u00e8!\u001fo\u00bdH\u00f7\u00c0\u0010\u00c2 {B\u00ab\u00d7G\u008f\u00b7\\L\u0088\u0083kS\u00a9\u0010\u00ca\u00e7n\u00b9hQ\u00b79\u00b2\u00af\u00b5a\u00e8\u00ac\u00ee\u00e9\u0010\u00cb\u00e8+9\u00a9\u00e8l\u0097\u00b2\u00e1\u00db\u00a9c\u00a1\u008e\u009d\u0018\fx\u008f6\u00e6\u00fble\u0088H\u00ee\u00b8\u0016K\u00a9\u00a9\u0089\u00f7\u009b\u0003;\u001a\u0018\u00dd\u0018\\\u00195:\u0019\u000fu\u00b9\u00f2*\u00da\u00e6\u00ff|\u00b5c4\u009c\u00a1\u0018W\u0097\u00d5e".length();
                var5_7 = 16;
                var4_8 = -1;
lbl24:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _7l.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "ka\u00d2\u0018\u00b3m\u00c0\u0080\u0001q|fh$i\u0004\u00dd\u00f4nW\u0095\u00d0\u00a9[\u0010\u00ab;\u00f9T\u008a\u00c4\u00d5\u00d7\u0096*\u008bM\u00e5G\u00a8\u00ab";
                    var8_6 = "ka\u00d2\u0018\u00b3m\u00c0\u0080\u0001q|fh$i\u0004\u00dd\u00f4nW\u0095\u00d0\u00a9[\u0010\u00ab;\u00f9T\u008a\u00c4\u00d5\u00d7\u0096*\u008bM\u00e5G\u00a8\u00ab".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl38:
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
lbl43:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _7l.a(var10_9).intern();
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        _7l.b = var9_3;
        _7l.c = new String[13];
    }

    public void cfr_renamed_1(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l2 = a ^ l2;
        _7l.b("\u00eb", (Object)this, (String)string, -6752432283488325705L, (long)l2);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _7l.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _7l.b(classArray2[j], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l2, long l3) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = _7l.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _7l.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _7l.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _7l.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _7l.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _7l.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _7l.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _7l.a(clazz3, string2, clazz2)) != null) {
                    _7l.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _7l.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _7l.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _7l.b(834490751323590L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _7l.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = _7l.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _7l.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _7l.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _7l.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _7l.b(834490751323590L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _7l.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _7l.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _7l.b(834490751323590L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "8$@b52%1B#0nk-";
        objectArray[1] = "P?#V\u007fNN79\u0019\u001dRI*";
        objectArray[2] = Void.TYPE;
        _7l.f[2] = "java/lang/Void";
        objectArray[3] = "A5X\rt\nM=YF=\u0002Q5[\rY\u0016M4zAy\u0000A.";
        objectArray[4] = "-\u0012\u001a\u0010\tJ&\u001d\u000b_tR5\u001a\u0002\u0016";
        objectArray[5] = "\u0002\u0017G#\u0005b\u000e\u001fFhLj\u0012\u0017D#(~\u000e\u0016oa\u0007`\u0004\u0016^";
        objectArray[6] = "\fz1lK\u0003\u0012r+#,\u0002\u0003i&y\n\u0004";
        objectArray[7] = "+p\b{MM6e\n:H\u0011|^";
        objectArray[8] = "S/DH\u001b\tX U\u0007y\nW)";
        objectArray[9] = "c:!-H3~/#lMo0\u000f";
        objectArray[10] = "c\u000edAh(~\u001bf\u0000mt1-";
        objectArray[11] = ">\u0007jK?P5\b{\u0004^^>\u0003\u007f^";
        objectArray[12] = Boolean.TYPE;
        _7l.f[12] = "java/lang/Boolean";
        objectArray[13] = "\rxI\u001fb3\u0006wXP\u0002*\n{Z\f";
        objectArray[14] = "\\WGg>zP_F,wrLWDg\u0013fPVk;+tF";
        objectArray[15] = Integer.TYPE;
        _7l.f[15] = "java/lang/Integer";
        objectArray[16] = Long.TYPE;
        _7l.f[16] = "java/lang/Long";
        objectArray[17] = "G\u00008\u0003P\u0005M\u0002}V6\u0002\u0011\u000fC\u0007F\u0014\u000f\u001a3C\u000e\u0001\u0017cxMS\u0014C\u0013&OQZ}YyZG\n\u0006\n.E\u000ek";
        objectArray[18] = "<K6q\u001dFl\u0007%\u0017P4>K6)\u0018\u000f0K9/";
        objectArray[19] = "\t\u0017zKQ\u007fH\u00166]+l\\GK\u001f\u0014~NQ!AA4Q+{C\u00148@V;SF|0";
        objectArray[20] = "^\u0005\\\u0000\u00132\\\u000e\u001aAq{aV\u0011\u0001\u00033\u0011\u0012Y\u0014\u001b";
        objectArray[21] = "%+0\u001fl${-/\r\u0012$\u0018t(\u0016+cu'*\u0015o";
        objectArray[22] = "2AQL\u000fe1ILQ\u007f9c[K*O`uUM@\u00115?J7";
        objectArray[23] = "<.}V>\u00106,8\u0003X\u0017j!^\u0012?\u0006k7z\u0019XDv2t\u0011(\u0000>'lhi\u001dm'|\u0012h\u0012>*\u0006Rb\u0019w,}\u00015\u0006>M";
        objectArray[24] = "vbfac8xbig\u001b>H%y iz8a15q";
        objectArray[25] = "\u0005a$P\t*Vc'\u0014w9Q};\u00040)8s'\t\u0018$\u0002%/X\u0007G\u0005a$P\t*Vc'\u0014w";
        objectArray[26] = "\u0013\u0018,z\u001a&R\u0019`l`'KVp\u001e\t\"Q['u[=VO\u001d";
        objectArray[27] = "\b\n\u0014G\t\u0002C\n\u0015\u0006f\u000fU\u0017/\r\u0016\u0003FE_S\u0014\u0001\b{\u0015\f\u0001\u0017X\u0000F[\u001e^9";
        objectArray[28] = "hx\u0001^R<84\u00128\u0011Nig\u000eSQw7a\u0011A";
        objectArray[29] = "\u000f}\u0007.\u0002\u0017_1\u0014HFe\tp\u0017:\u0006\u0015M8\u0002\"";
        objectArray[30] = ">\b\u000e5\u0001\u0002<\u0003HtcF\u0001[C4\u0011\u0003q\u001f\u000b!\t";
        objectArray[31] = "jc\u001a0<^+bV&FE(\u0012N,:USoGk{T./W9?$";
        objectArray[32] = "9\u000e{?\rmx\u000f7)wv|_02\u000bpz2v1\u0011qp\bu9\fl\u0000";
        objectArray[33] = "\\,{G&u\u001d-7Q\\t\blJJ\"t\u001a*!\u0018=s\u000e\u0010z\u001c'q\u001fz$Imne uX\"u\u000f~ \u0012=\u000f";
        objectArray[34] = "6^B\u001a\u0018QhX]\bfV\u000b\u0001Z\u0013_\u0016fRX\u0010\u001b";
        objectArray[35] = "'Mz?$`)Mu9\\b\u0019\ne~.\"iN-k6";
        objectArray[36] = "Y\u001a,>lOZ\u00121#\u001c\u0015\f\u000b\f5l\te@&g!\u0005\u0018\u000065eu";
        objectArray[37] = "\f\u001ck\u001eZx\u0002\u001cd\u0018\"s2[t_P:B\u001f<JH";
        objectArray[38] = "\u00145\u0018\u001e\t\u0004Dy\u000bxNv\u0011tF\u001c\u000e\fPu\n\n";
        objectArray[39] = "\u0014\u0015b\u0012(\u0005U\u0014.\u0004R\u0014ID:\fRE\u0017N\"\u0017)\u0016@Qkv";
        objectArray[40] = "U(55\\:[(:3$0ko*tVx\u001b+baN";
        objectArray[41] = "k\u0000kW\u0005va\u0002.\u0002cq=\u000fH\u0013\u0004`<\u0019l\u0018c\"!\u001cb\u0010\u0013fi\tziYh.\u0011i\u0019\u001d ;\t\u0010SY\u007f \u0002k\u0000\u000e`ic";
        Object[] objectArray2 = objectArray;
        objectArray[42] = "\tzS\u0014w$Y6@r;V\u000fwC\u0000s&K?V\u0018";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/7l" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _7l.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _7l.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e2' || c == '\u00eb' || c == 'F' || c == 'D') {
                field = _7l.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _7l.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 16;
            case 2 -> 14;
            case 3 -> 49;
            case 4 -> 18;
            case 5 -> 35;
            case 6 -> 0;
            case 7 -> 55;
            case 8 -> 26;
            case 9 -> 45;
            case 10 -> 46;
            case 11 -> 47;
            case 12 -> 33;
            case 13 -> 4;
            case 14 -> 28;
            case 15 -> 20;
            case 16 -> 8;
            case 17 -> 50;
            case 18 -> 7;
            case 19 -> 41;
            case 20 -> 42;
            case 21 -> 23;
            case 22 -> 30;
            case 23 -> 21;
            case 24 -> 2;
            case 25 -> 48;
            case 26 -> 12;
            case 27 -> 62;
            case 28 -> 9;
            case 29 -> 56;
            case 30 -> 3;
            case 31 -> 17;
            case 32 -> 39;
            case 33 -> 52;
            case 34 -> 54;
            case 35 -> 6;
            case 36 -> 34;
            case 37 -> 27;
            case 38 -> 22;
            case 39 -> 19;
            case 40 -> 13;
            case 41 -> 58;
            case 42 -> 5;
            case 43 -> 25;
            case 44 -> 60;
            case 45 -> 40;
            case 46 -> 38;
            case 47 -> 44;
            case 48 -> 59;
            case 49 -> 11;
            case 50 -> 1;
            case 51 -> 57;
            case 52 -> 53;
            case 53 -> 32;
            case 54 -> 37;
            case 55 -> 36;
            case 56 -> 29;
            case 57 -> 15;
            case 58 -> 51;
            case 59 -> 31;
            case 60 -> 63;
            case 61 -> 10;
            case 62 -> 24;
            default -> 43;
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
        _7l.f[n3] = new String(cArray);
        return n3;
    }

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x3C51;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l3 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l3);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/krypton/7l", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l2 >>> 56);
            for (int j = 1; j < 8; ++j) {
                byArray[j] = (byte)(l2 << j * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _7l.c[n2] = _7l.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    public void cfr_renamed_4(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l2 = a ^ l2;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    try {
                        callSite = _7l.b("\u00e2", (Object)this, -4784824420362732395L, (long)l2);
                        if (wArray == null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                    callSite = _7l.b("\u00e2", (Object)this, -4784824420362732395L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7l.a(matchException);
                }
            }
            _7l.b("A", (Object)callSite, -4784916021811216589L, (long)l2);
        }
    }

    public void cfr_renamed_2(Object[] objectArray) {
        block12: {
            CallSite callSite;
            _4w[] wArray;
            long l2;
            long l3;
            String string;
            String string2;
            block10: {
                block11: {
                    string2 = (String)objectArray[0];
                    string = (String)objectArray[1];
                    l3 = (Long)objectArray[2];
                    l2 = (l3 = a ^ l3) ^ 0x36DEE06C737AL;
                    wArray = _7l.cfr_renamed_5();
                    try {
                        try {
                            callSite = _7l.b("\u00e2", (Object)this, 2822789170205599265L, (long)l3);
                            if (wArray == null) break block10;
                            if (callSite != null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw _7l.a(matchException);
                        }
                        _7l.b("\u00eb", (Object)this, new ArrayList(), 2822789170205599265L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                }
                callSite = _7l.b("\u00e2", (Object)this, 2822789170205599265L, (long)l3);
            }
            try {
                block13: {
                    try {
                        try {
                            if (wArray == null) break block12;
                            if (_7l.b("A", (Object)callSite, 2820068832361302430L, (long)l3) == false) break block13;
                        }
                        catch (MatchException matchException) {
                            throw _7l.a(matchException);
                        }
                        _7l.b("A", (Object)_7l.b("\u00e2", (Object)this, 2822789170205599265L, (long)l3), (Object)new _6F(string2, l2, string), 2819794614905505289L, (long)l3);
                        if (wArray != null) break block12;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                }
                callSite = _7l.b("A", (Object)_7l.b("\u00e2", (Object)this, 2822789170205599265L, (long)l3), 0, (Object)new _6F(string2, l2, string), 2822998625865701781L, (long)l3);
            }
            catch (MatchException matchException) {
                throw _7l.a(matchException);
            }
        }
    }

    public void void_2(Object[] objectArray) {
        long l2;
        block15: {
            CallSite callSite;
            _4w[] wArray;
            long l3;
            String string;
            String string2;
            block13: {
                block14: {
                    l2 = (Long)objectArray[0];
                    string2 = (String)objectArray[1];
                    string = (String)objectArray[2];
                    l3 = (l2 = a ^ l2) ^ 0x1A6229FB6038L;
                    wArray = _7l.cfr_renamed_5();
                    try {
                        try {
                            callSite = _7l.b("\u00e2", (Object)this, 3778136871800649059L, (long)l2);
                            if (wArray == null) break block13;
                            if (callSite != null) break block14;
                        }
                        catch (MatchException matchException) {
                            throw _7l.a(matchException);
                        }
                        _7l.b("\u00eb", (Object)this, new ArrayList(), 3778136871800649059L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                }
                callSite = _7l.b("\u00e2", (Object)this, 3778136871800649059L, (long)l2);
            }
            try {
                block16: {
                    try {
                        try {
                            if (wArray == null) break block15;
                            if (_7l.b("A", (Object)callSite, 3774477187128820541L, (long)l2) >= 2) break block16;
                        }
                        catch (MatchException matchException) {
                            throw _7l.a(matchException);
                        }
                        _7l.b("A", (Object)_7l.b("\u00e2", (Object)this, 3778136871800649059L, (long)l2), (Object)new _6F(string2, l3, string), 3775073117883831627L, (long)l2);
                        if (l2 <= 0L || wArray != null) break block15;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                }
                callSite = _7l.b("A", (Object)_7l.b("\u00e2", (Object)this, 3778136871800649059L, (long)l2), 1, (Object)new _6F(string2, l3, string), 3778347428901751511L, (long)l2);
            }
            catch (MatchException matchException) {
                throw _7l.a(matchException);
            }
        }
        try {
            if (l2 > 0L && _4w.cfr_renamed_8() == null) {
                _7l.cfr_renamed_0(new _4w[1]);
            }
        }
        catch (MatchException matchException) {
            throw _7l.a(matchException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public JsonObject com_google_gson_JsonObject_2(Object[] var1_1) {
        block65: {
            block64: {
                block63: {
                    block59: {
                        block60: {
                            block61: {
                                block62: {
                                    block51: {
                                        block52: {
                                            block57: {
                                                block58: {
                                                    block55: {
                                                        block56: {
                                                            block53: {
                                                                block54: {
                                                                    block50: {
                                                                        block48: {
                                                                            block49: {
                                                                                var2_2 = (Long)var1_1[0];
                                                                                var2_2 = _7l.a ^ var2_2;
                                                                                var4_3 = _7l.cfr_renamed_5();
                                                                                var5_4 = new JsonObject();
                                                                                try {
                                                                                    try {
                                                                                        v0 = _7l.b("\u00e2", (Object)this, (long)-37993893152572672L, (long)var2_2);
                                                                                        if (var4_3 == null) break block48;
                                                                                        if (v0 == null) break block49;
                                                                                    }
                                                                                    catch (MatchException v1) {
                                                                                        throw _7l.a(v1);
                                                                                    }
                                                                                    _7l.b("A", (Object)var5_4, (Object)_7l.a("v", (int)19410, (long)(8726450446807959793L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)this, (long)-37993893152572672L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                                                                }
                                                                                catch (MatchException v2) {
                                                                                    throw _7l.a(v2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v3 = this;
                                                                                v4 = var4_3;
                                                                                if (var2_2 > 0L) {
                                                                                    if (v4 == null) break block50;
                                                                                    v0 = _7l.b("\u00e2", (Object)v3, (long)-39173321076428151L, (long)var2_2);
                                                                                }
                                                                                ** GOTO lbl40
                                                                            }
                                                                            catch (MatchException v5) {
                                                                                throw _7l.a(v5);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v0 != null) {
                                                                                _7l.b("A", (Object)var5_4, (Object)_7l.a("v", (int)19601, (long)(1272774984592134077L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)this, (long)-39173321076428151L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        catch (MatchException v6) {
                                                                            throw _7l.a(v6);
                                                                        }
                                                                        v3 = this;
                                                                    }
                                                                    try {
                                                                        v4 = var4_3;
lbl40:
                                                                        // 2 sources

                                                                        if (var2_2 >= 0L) {
                                                                            if (v4 == null) break block51;
                                                                            if (_7l.b("\u00e2", (Object)v3, (long)-37497163248095994L, (long)var2_2) == null) break block52;
                                                                        }
                                                                        ** GOTO lbl112
                                                                    }
                                                                    catch (MatchException v7) {
                                                                        throw _7l.a(v7);
                                                                    }
                                                                    var6_5 = new JsonObject();
                                                                    try {
                                                                        try {
                                                                            v8 = _7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-38634344093265760L, (long)var2_2);
                                                                            v9 = var4_3;
                                                                            if (var2_2 >= 0L) {
                                                                                if (v9 == null) break block53;
                                                                                if (v8 == null) break block54;
                                                                            }
                                                                            ** GOTO lbl69
                                                                        }
                                                                        catch (MatchException v10) {
                                                                            throw _7l.a(v10);
                                                                        }
                                                                        _7l.b("A", (Object)var6_5, (Object)_7l.a("v", (int)20267, (long)(1947416294315822094L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-38634344093265760L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                                                    }
                                                                    catch (MatchException v11) {
                                                                        throw _7l.a(v11);
                                                                    }
                                                                }
                                                                v8 = _7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-38499709224360403L, (long)var2_2);
                                                            }
                                                            try {
                                                                try {
                                                                    v9 = var4_3;
lbl69:
                                                                    // 2 sources

                                                                    if (var2_2 >= 0L) {
                                                                        if (v9 == null) break block55;
                                                                        if (v8 == null) break block56;
                                                                    }
                                                                    ** GOTO lbl87
                                                                }
                                                                catch (MatchException v12) {
                                                                    throw _7l.a(v12);
                                                                }
                                                                _7l.b("A", (Object)var6_5, (Object)_7l.a("v", (int)7962, (long)(2876189644694805553L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-38499709224360403L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                                            }
                                                            catch (MatchException v13) {
                                                                throw _7l.a(v13);
                                                            }
                                                        }
                                                        v8 = _7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-38174349928155403L, (long)var2_2);
                                                    }
                                                    try {
                                                        try {
                                                            if (var2_2 <= 0L) break block57;
                                                            v9 = var4_3;
lbl87:
                                                            // 2 sources

                                                            if (v9 == null) break block57;
                                                            if (v8 == null) break block58;
                                                        }
                                                        catch (MatchException v14) {
                                                            throw _7l.a(v14);
                                                        }
                                                        _7l.b("A", (Object)var6_5, (Object)_7l.a("v", (int)6839, (long)(3162230249100532121L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-38174349928155403L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                                    }
                                                    catch (MatchException v15) {
                                                        throw _7l.a(v15);
                                                    }
                                                }
                                                v8 = _7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-39276753942163004L, (long)var2_2);
                                            }
                                            try {
                                                if (v8 != null) {
                                                    _7l.b("A", (Object)var6_5, (Object)_7l.a("v", (int)12910, (long)(4936824928341225800L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37497163248095994L, (long)var2_2), (long)-39276753942163004L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                                }
                                            }
                                            catch (MatchException v16) {
                                                throw _7l.a(v16);
                                            }
                                            _7l.b("A", (Object)var5_4, (Object)_7l.a("v", (int)22727, (long)(6050141498652826600L ^ var2_2)), (Object)var6_5, (long)-37710400419768182L, (long)var2_2);
                                        }
                                        v3 = this;
                                    }
                                    try {
                                        if (var2_2 <= 0L) break block59;
                                        v4 = var4_3;
lbl112:
                                        // 2 sources

                                        if (v4 == null) break block59;
                                        if (_7l.b("\u00e2", (Object)v3, (long)-37907916956478070L, (long)var2_2) == null) break block60;
                                    }
                                    catch (MatchException v17) {
                                        throw _7l.a(v17);
                                    }
                                    var6_5 = new JsonObject();
                                    try {
                                        try {
                                            v18 = _7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37907916956478070L, (long)var2_2), (long)-38603694608727405L, (long)var2_2);
                                            if (var2_2 < 0L || var4_3 == null) break block61;
                                            if (v18 == null) break block62;
                                        }
                                        catch (MatchException v19) {
                                            throw _7l.a(v19);
                                        }
                                        _7l.b("A", (Object)var6_5, (Object)_7l.a("v", (int)25328, (long)(7992014961895219668L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37907916956478070L, (long)var2_2), (long)-38603694608727405L, (long)var2_2), (long)-37242835342866584L, (long)var2_2);
                                    }
                                    catch (MatchException v20) {
                                        throw _7l.a(v20);
                                    }
                                }
                                v18 = _7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37907916956478070L, (long)var2_2), (long)-37396774034119859L, (long)var2_2);
                            }
                            try {
                                if (v18 != null) {
                                    _7l.b("A", (Object)var6_5, (Object)_7l.a("v", (int)4500, (long)(2622576233659880115L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)_7l.b("\u00e2", (Object)this, (long)-37907916956478070L, (long)var2_2), (long)-37396774034119859L, (long)var2_2), (long)-37242835342866584L, (long)var2_2);
                                }
                            }
                            catch (MatchException v21) {
                                throw _7l.a(v21);
                            }
                            _7l.b("A", (Object)var5_4, (Object)_7l.a("v", (int)9545, (long)(679951037869680228L ^ var2_2)), (Object)var6_5, (long)-37710400419768182L, (long)var2_2);
                        }
                        v3 = this;
                    }
                    try {
                        try {
                            v22 = _7l.b("\u00e2", (Object)v3, (long)-38289854206280070L, (long)var2_2);
                            if (var4_3 == null) break block63;
                            if (v22 == null) break block64;
                        }
                        catch (MatchException v23) {
                            throw _7l.a(v23);
                        }
                        v22 = _7l.b("\u00e2", (Object)this, (long)-38289854206280070L, (long)var2_2);
                    }
                    catch (MatchException v24) {
                        throw _7l.a(v24);
                    }
                }
                if (_7l.b("A", (Object)v22, (long)-37825439293566523L, (long)var2_2) == false) {
                    var6_5 = new JsonArray();
                    var7_6 = _7l.b("A", (Object)_7l.b("\u00e2", (Object)this, (long)-38289854206280070L, (long)var2_2), (long)-38726499470362673L, (long)var2_2);
                    block38: while (_7l.b("A", (Object)var7_6, (long)-38446243727446927L, (long)var2_2) != false) {
                        block66: {
                            var8_7 = (_6F)_7l.b("A", (Object)var7_6, (long)-37196220925592294L, (long)var2_2);
                            var9_8 = new JsonObject();
                            try {
                                _7l.b("A", (Object)var9_8, (Object)_7l.a("v", (int)11804, (long)(7149343334242544948L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)var8_7, (long)-37363015832472160L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                v25 = var9_8;
                                if (var2_2 < 0L) break block65;
                                _7l.b("A", (Object)v25, (Object)_7l.a("v", (int)12399, (long)(22084741196378950L ^ var2_2)), (Object)_7l.b("\u00e2", (Object)var8_7, (long)-37761967391048331L, (long)var2_2), (long)-39395811983932057L, (long)var2_2);
                                _7l.b("A", (Object)var6_5, (Object)var9_8, (long)-38104600067361043L, (long)var2_2);
                                while (var4_3 != null) {
                                    if (var4_3 != null) continue block38;
                                    if (var2_2 <= 0L) continue;
                                    break block66;
                                }
                                break block64;
                            }
                            catch (MatchException v26) {
                                throw _7l.a(v26);
                            }
                        }
                        _4w.cfr_renamed_8(new String[5]);
                        break;
                    }
                    _7l.b("A", (Object)var5_4, (Object)_7l.a("v", (int)19409, (long)(3405057047783508219L ^ var2_2)), (Object)var6_5, (long)-37710400419768182L, (long)var2_2);
                }
            }
            v25 = var5_4;
        }
        return v25;
    }

    public void cfr_renamed_6(Object[] objectArray) {
        CallSite callSite;
        long l2;
        String string;
        block4: {
            String string2;
            block5: {
                string2 = (String)objectArray[0];
                string = (String)objectArray[1];
                l2 = (Long)objectArray[2];
                l2 = a ^ l2;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    try {
                        callSite = _7l.b("\u00e2", (Object)this, -5536668134190063275L, (long)l2);
                        if (wArray == null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                    _7l.b("\u00eb", (Object)this, (_7P)new _7P(), -5536668134190063275L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7l.a(matchException);
                }
            }
            _7l.b("\u00eb", (Object)_7l.b("\u00e2", (Object)this, -5536668134190063275L, (long)l2), (String)string2, -5536219663611757914L, (long)l2);
            callSite = _7l.b("\u00e2", (Object)this, -5536668134190063275L, (long)l2);
        }
        _7l.b("\u00eb", (Object)callSite, (String)string, -5537330575964398185L, (long)l2);
    }

    public void cfr_renamed_7(Object[] objectArray) {
        block10: {
            CallSite callSite;
            _4w[] wArray;
            long l2;
            long l3;
            String string;
            String string2;
            block8: {
                block9: {
                    string2 = (String)objectArray[0];
                    string = (String)objectArray[1];
                    l3 = (Long)objectArray[2];
                    l2 = (l3 = a ^ l3) ^ 0x17EC3CE7DE37L;
                    wArray = _7l.cfr_renamed_5();
                    try {
                        try {
                            callSite = _7l.b("\u00e2", (Object)this, -8475300636153934996L, (long)l3);
                            if (wArray == null) break block8;
                            if (callSite != null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw _7l.a(matchException);
                        }
                        _7l.b("\u00eb", (Object)this, new ArrayList(), -8475300636153934996L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                }
                callSite = _7l.b("\u00e2", (Object)this, -8475300636153934996L, (long)l3);
            }
            try {
                CallSite callSite2;
                try {
                    callSite2 = _7l.b("A", (Object)callSite, -8471641919921996494L, (long)l3);
                    if (wArray == null || callSite2 >= 2) break block10;
                }
                catch (MatchException matchException) {
                    throw _7l.a(matchException);
                }
                callSite2 = _7l.b("A", (Object)_7l.b("\u00e2", (Object)this, -8475300636153934996L, (long)l3), (Object)new _6F(string2, l2, string), -8472170909656208572L, (long)l3);
            }
            catch (MatchException matchException) {
                throw _7l.a(matchException);
            }
        }
    }

    public void cfr_renamed_8(Object[] objectArray) {
        CallSite callSite;
        long l2;
        long l3;
        block4: {
            block5: {
                l3 = (Long)objectArray[0];
                l2 = (Long)objectArray[1];
                l2 = a ^ l2;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    try {
                        callSite = _7l.b("\u00e2", (Object)this, 4421794738140518318L, (long)l2);
                        if (wArray == null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                    _7l.b("\u00eb", (Object)this, (_3K)new _3K(), 4421794738140518318L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7l.a(matchException);
                }
            }
            callSite = _7l.b("\u00e2", (Object)this, 4421794738140518318L, (long)l2);
        }
        _7l.b("\u00eb", (Object)callSite, (Long)((Object)_7l.b("\u00f2", (long)l3, 4421458153213195191L, (long)l2)), 4418829709018169527L, (long)l2);
    }

    public void cfr_renamed_9(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _7l.b("\u00eb", (Object)this, (String)string, -8856188077514571423L, (long)l2);
    }

    public static void cfr_renamed_0(_4w[] wArray) {
        cfr_renamed_7 = wArray;
    }

    public void cfr_renamed_0(Object[] objectArray) {
        CallSite callSite;
        long l2;
        String string;
        block4: {
            String string2;
            block5: {
                string2 = (String)objectArray[0];
                string = (String)objectArray[1];
                l2 = (Long)objectArray[2];
                l2 = a ^ l2;
                _4w[] wArray = _7l.cfr_renamed_5();
                try {
                    try {
                        callSite = _7l.b("\u00e2", (Object)this, -2592505258514837895L, (long)l2);
                        if (wArray == null) break block4;
                        if (callSite != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _7l.a(matchException);
                    }
                    _7l.b("\u00eb", (Object)this, (_7P)new _7P(), -2592505258514837895L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw _7l.a(matchException);
                }
            }
            _7l.b("\u00eb", (Object)_7l.b("\u00e2", (Object)this, -2592505258514837895L, (long)l2), (String)string2, -2591288389263690785L, (long)l2);
            callSite = _7l.b("\u00e2", (Object)this, -2592505258514837895L, (long)l2);
        }
        _7l.b("\u00eb", (Object)callSite, (String)string, -2591713819304737454L, (long)l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_7l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_7l.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

