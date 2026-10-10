/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  org.joml.Vector3d
 */
package dev.krypton;

import dev.krypton._4w;
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
import net.minecraft.class_243;
import org.joml.Vector3d;

public class _4Q {
    private static _4w[] cfr_renamed_6;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    public static Vector3d org_joml_Vector3d_1(Object[] objectArray) {
        Vector3d vector3d = (Vector3d)objectArray[0];
        long l2 = (Long)objectArray[1];
        class_243 class_2432 = (class_243)objectArray[2];
        l2 = a ^ l2;
        _4Q.b("b", (Object)vector3d, (double)_4Q.b("\u00ef", (Object)class_2432, -244678399800103687L, (long)l2), -246002899759442998L, (long)l2);
        _4Q.b("b", (Object)vector3d, (double)_4Q.b("\u00ef", (Object)class_2432, -246395341547400776L, (long)l2), -245829375907437113L, (long)l2);
        _4Q.b("b", (Object)vector3d, (double)_4Q.b("\u00ef", (Object)class_2432, -246096683292960657L, (long)l2), -246537819095214804L, (long)l2);
        return vector3d;
    }

    public static double double_1(Object[] objectArray) {
        double d;
        double d2;
        long l2;
        block4: {
            int n;
            double d3;
            double d4;
            block5: {
                l2 = (Long)objectArray[0];
                float f = ((Float)objectArray[1]).floatValue();
                d4 = (Double)objectArray[2];
                d3 = (Double)objectArray[3];
                l2 = a ^ l2;
                _4w[] wArray = _4Q.cfr_renamed_9();
                n = (int)_4Q.b("\u00f9", (double)(_4Q.b("\u00f9", (double)(d3 - d4), -7784543714375220639L, (long)l2) * (double)f), -7785488863362350340L, (long)l2);
                try {
                    try {
                        d2 = d4;
                        d = d3;
                        if (wArray == null) break block4;
                        if (!(d2 < d)) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw _4Q.a(numberFormatException);
                    }
                    return (double)_4Q.b("\u00f9", (double)(d4 + (double)n), (double)d3, -7785258365832687567L, (long)l2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw _4Q.a(numberFormatException);
                }
            }
            d2 = d4 - (double)n;
            d = d3;
        }
        return (double)_4Q.b("\u00f9", (double)d2, (double)d, -7783806269824383603L, (long)l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4Q.a = l.a(-7032582938114361789L, 7157731092170624593L, MethodHandles.lookup().lookupClass()).a(12091766609896L);
                _4Q.e = new Object[48];
                _4Q.f = new String[48];
                _4Q.a();
                _4Q.d = new HashMap<K, V>(13);
                _4Q.cfr_renamed_4(new _4w[5]);
                var0 = _4Q.a ^ 114077247754659L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u008f\u009c\u00bc\u0010S\u0083\u00dabq\u00f1c\t>+\u0001\u0085\u0010\u00b7\u0089e\u00a3Z\u0012\u001e*s~F\u0094\u000b\u00aa2\u001b\u0010\u00bf\u0090\u00af\u00bfZ;\u00f6o\u00a6~\u00fe\u00e9\u00a3\u0082\u00d6\u00e7";
                var8_6 = "\u008f\u009c\u00bc\u0010S\u0083\u00dabq\u00f1c\t>+\u0001\u0085\u0010\u00b7\u0089e\u00a3Z\u0012\u001e*s~F\u0094\u000b\u00aa2\u001b\u0010\u00bf\u0090\u00af\u00bfZ;\u00f6o\u00a6~\u00fe\u00e9\u00a3\u0082\u00d6\u00e7".length();
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
                    var9_3[var7_4++] = _4Q.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "2]\u00e5\u001a\u00d6\u0094x\u0010a!\u00dd\u00fc\u0006I\u00d2\u0093\u0010r\u00fc\t\u00b7YRk:27\u00e4q-uZ.";
                    var8_6 = "2]\u00e5\u001a\u00d6\u0094x\u0010a!\u00dd\u00fc\u0006I\u00d2\u0093\u0010r\u00fc\t\u00b7YRk:27\u00e4q-uZ.".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = _4Q.a(var10_9).intern();
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
        _4Q.b = var9_3;
        _4Q.c = new String[5];
    }

    public static double double_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        l2 = a ^ l2;
        return (double)_4Q.b("\u00f9", (double)d2, (double)_4Q.b("\u00f9", (double)d, (double)d3, -5360635633487333793L, (long)l2), -5362560132446100509L, (long)l2);
    }

    public static int int_9(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        int n3 = (Integer)objectArray[2];
        long l2 = (Long)objectArray[3];
        l2 = a ^ l2;
        return (int)_4Q.b("\u00f9", (int)n2, (int)_4Q.b("\u00f9", (int)n, (int)n3, -5656828101352353160L, (long)l2), -5657449172157062238L, (long)l2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _4Q.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _4Q.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _4Q.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _4Q.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _4Q.a(l2, l3);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                _4Q.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l2, long l3) {
        int n = _4Q.a(l2, l3);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = _4Q.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _4Q.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _4Q.a(clazz3, string2, clazz2)) != null) {
                    _4Q.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _4Q.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _4Q.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _4Q.b(1206559729500865L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _4Q.a(l2, l3);
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
                clazz3 = _4Q.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _4Q.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _4Q.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _4Q.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _4Q.b(1206559729500865L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _4Q.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _4Q.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _4Q.b(1206559729500865L, 0L);
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "fH\u0011(I\u0011mG\u0000g*\u001cxA";
        objectArray[1] = Double.TYPE;
        _4Q.f[1] = "java/lang/Double";
        objectArray[2] = Long.TYPE;
        _4Q.f[2] = "java/lang/Long";
        objectArray[3] = "\u001f9My~\u001a\u001f9Z%r\u0015\u0005rZ;r\u0000\u0002\u0003\nf#";
        objectArray[4] = Integer.TYPE;
        _4Q.f[4] = "java/lang/Integer";
        objectArray[5] = "/upazX2`r \u007f\u0004y";
        objectArray[6] = "LX\r%}\u0000QM\u000fdx\\\u001cl";
        objectArray[7] = "\u00008x;8*u\u0018s4)e\u0014\u0016x?-?`";
        objectArray[8] = "7+\u000e#\u0015FB\u000b\u0005,\u0004\t#\u0005\u000e'\u0000SW";
        objectArray[9] = "dN*X\u00160oA;\u0017k(|F2^";
        objectArray[10] = "\"+o\u0000\u00194)$~Os7=(u\u0004";
        objectArray[11] = "'\u0001^\u001dg\u0017,\u000eOR\n\u0013,\u0012{\u00198\u000e(\u000eK\u0019";
        objectArray[12] = Boolean.TYPE;
        _4Q.f[12] = "java/lang/Boolean";
        objectArray[13] = "G\u000fD\u007f)q2/Op8>S!D{<d'";
        objectArray[14] = "/7\u0006_\u0019%/7\u0011\u0003\u0015*5|\u0011\u001d\u0015?2\r@EG";
        objectArray[15] = "v\u0016\n\u0010a\u0003t\bChn\u000fm\u000b\u001f\ro";
        objectArray[16] = "!Umv@\u001eTufyQQ5{mrU\u000bA";
        objectArray[17] = "\u001fj\u001cxag\u0014e\r7\u0000i\u001fn\tm";
        objectArray[18] = "DI'fM<K\u001c{WO6\u0005,\u007fnI-KQ|f\u0012=u\u0017}4Xa\b\u0014uoH_N\u0015'%\u0014\"M\u001d|5*";
        objectArray[19] = "FDyM)M\u0012MxW\u0019L\u0010\u0007`ZUS\u0004\u0017\u007fZ\u0019\n\u001b\u0002v\u000bk\b\u0007Fb7 \f\u0007\u001cv^&]\u001a\u0016\u001b";
        objectArray[20] = "\rT\rc\n\u0010Y]\fy:\u0017[\t\u0012t}\u00072TWg[\u0004[R\u0006zQi\rT\rc\n\u0010Y]\fy:";
        objectArray[21] = "QFK\u0004[n^\u0013\u00175Fj\u001dED5\u00055\u001eBE\\\u0003d\u0003H(\fRi\u0005\\\u0018X_|\u0019#";
        objectArray[22] = "MLRLcZ\u000bO\u0007B\u0002X\u001a\u000bYFnjKH\u0004\u00103=LNZS<@OF\u0001C\u0002";
        objectArray[23] = "\r8r[\u00051\u0002m.j\u000b8G](R\u001c3Q4.\u0003\u00019<d)\u0014\u0003?Ubx\t\tR";
        objectArray[24] = "\u0001s*1\u0013\u0003\u000e&v\u0000\u001f\rQrI9L\u001eQ{ ?\u001d\u0003[\u0016p8\n\u0001]\u007fvi\u0017\u000b0";
        objectArray[25] = "q\u00022\u001af\u0002s\u001ev\u000eZ\u0014\"\u0006\"\u000b:ptY.\u0005d\rwQu\u0015Z";
        objectArray[26] = "\u007fW\u0016CE||MO\u0016?xCE\u0012PMx*SAU^Cz\u0017PIR*|FMC?";
        objectArray[27] = "Y{U\u001f-\u0017V.\t./\u0015\u000e\u001e\r\u0017)\u0006Vc\u000e\u001fr\u0016h%\u000fM8J\u0015&\u0007\u0016(tS'U\\t\tP/\u000eLJ";
        objectArray[28] = "~Y`^=\u0010|E$J\u0001\u000f&Wdl`\u001e ;!Q~\u000f|I#M:\u001b@\u000b~JyYy\u0000'Q8b";
        objectArray[29] = "UQ-O>fZ\u0004q~<d\u00024wF'd\t]q\u0017:nd\rv\u00008h\r\u000b'\u001d2\u0005]\f0\u001f4l[]-\u0015Y";
        objectArray[30] = "+l\u001f@\u0000\u001c#/N\u0001aK{xCP6\u001c!(\u001d<X\u001ddtJU^Ly~";
        objectArray[31] = "8M\u0012Y\u000b\u001b;WK\fq\u001e\u0004_\u0016J\u0003\u001fmIEO\u0010$=\rTS\u001cM;\\IYq";
        objectArray[32] = ">Q\"=p\u00191\u0004~\fr\u0013\u007f4x4i\u001bb]~et\u0011\u000f\ryrv\u0017f\u000b(o|z6\f?mz\u00130]\"g\u0017";
        objectArray[33] = "VS\u0014S+kTOPG\u0017b\u0015[\u0010Bmx\u000e^k\u0005.z\u001a\u000f\u0016\u0006&!\n1P\u0007tkVLS\u000f/{h\u000f\tAz%\u001a\r\u0015\u0005n\u0019";
        objectArray[34] = "J\n\\\bXkBI\rI9<\u001a\u001e\u0000\u0018nk@N\\t\u0000j\u0005\u0012\t\u001d\u0006;\u0018\u0018";
        objectArray[35] = "EHi*#nGT->\u001fb\u0012Nk*Xr{\u0013.9~q\u0012\u0015\u007f$t\u001cEHi*#nGT->\u001f";
        objectArray[36] = " %>/\u001ai/(x`'wI}>lFh {oqL";
        objectArray[37] = "3\u0010\u00043\u0002\u000e1\f@'>\u0012j\b\u001e7B|3\u0010\u00043\u0002\u000e1\f@'>\u00161\n\teW\u0000b\u000f\u001a^\u0000\u001er\u001fG,\u0002\u00026\u000b{";
        objectArray[38] = "7dd@8-?'5\u0001Yzgp8P\u000e-= e<`,x|1Uf}ev";
        objectArray[39] = "':U`U\u001c$ \f5/\u0012\u001b(Qs]\u0018r>\u0002vN#\"z\u0013jBJ$+\u000e`/";
        objectArray[40] = "\u000bS^T!D\tO\u001a@\u001dJRlYApL~XZT\u001d\bWNL\u0005o\nK\nX9";
        objectArray[41] = "<#Zx^\">?\u001elb*o9A|\t=\u0002q\u001ad\u0007(y+Dl\u0002P2~Tp\u001a+h \\ubn`>H)\u0010l|z\\\u0015";
        objectArray[42] = "qNJ\u001cI7sR\u000e\bu$4aP\t\t4O\u001cT\b\r~v\u0017\r\u0013LE";
        objectArray[43] = "\u000egr\u001b&@\u00012.*9D@\u0002(\u0012?BRk.C\"H?;)T NV=xI*#\u0006:oK,J\u0000krAA";
        objectArray[44] = "t_[\u0013\u000bS{R\u001d\\6O\u001d\u0007[PWRt\u0001\nM]";
        objectArray[45] = "\bqO\u0010\u0007TZ:E\u00117\u0004oJ\u0013O\\PU-UL\t^";
        objectArray[46] = "\u0007Z]L\u001c5\bW\u001b\u0003!(n\u0002]\u000f@4\u0007\u0004\f\u0012J";
        Object[] objectArray2 = objectArray;
        objectArray[47] = "sskx0!qo/l\f/7pq\u0015212|(g0-vh\u0014";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/4Q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l2 = (Long)objectArray[1];
        String string2 = _4Q.a(n, l2);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _4Q.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == 'b' || c == '\u00d5' || c == '\u00c2') {
                field = _4Q.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _4Q.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            case 0 -> 42;
            case 1 -> 11;
            case 2 -> 63;
            case 3 -> 60;
            case 4 -> 29;
            case 5 -> 34;
            case 6 -> 10;
            case 7 -> 38;
            case 8 -> 13;
            case 9 -> 22;
            case 10 -> 43;
            case 11 -> 32;
            case 12 -> 45;
            case 13 -> 36;
            case 14 -> 33;
            case 15 -> 49;
            case 16 -> 18;
            case 17 -> 47;
            case 18 -> 54;
            case 19 -> 62;
            case 20 -> 20;
            case 21 -> 59;
            case 22 -> 41;
            case 23 -> 26;
            case 24 -> 61;
            case 25 -> 53;
            case 26 -> 15;
            case 27 -> 52;
            case 28 -> 51;
            case 29 -> 5;
            case 30 -> 16;
            case 31 -> 2;
            case 32 -> 1;
            case 33 -> 21;
            case 34 -> 9;
            case 35 -> 31;
            case 36 -> 55;
            case 37 -> 19;
            case 38 -> 24;
            case 39 -> 39;
            case 40 -> 0;
            case 41 -> 44;
            case 42 -> 3;
            case 43 -> 6;
            case 44 -> 12;
            case 45 -> 46;
            case 46 -> 37;
            case 47 -> 48;
            case 48 -> 57;
            case 49 -> 14;
            case 50 -> 35;
            case 51 -> 40;
            case 52 -> 8;
            case 53 -> 25;
            case 54 -> 7;
            case 55 -> 23;
            case 56 -> 58;
            case 57 -> 56;
            case 58 -> 50;
            case 59 -> 17;
            case 60 -> 4;
            case 61 -> 30;
            case 62 -> 28;
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
        _4Q.f[n3] = new String(cArray);
        return n3;
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

    private static String a(int n, long l2) {
        int n2 = n ^ (int)(l2 & 0x7FFFL) ^ 0x77DF;
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
                throw new RuntimeException("dev/krypton/4Q", exception);
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
            _4Q.c[n2] = _4Q.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     */
    public static String java_lang_String_0(Object[] var0) {
        block32: {
            block33: {
                block30: {
                    block31: {
                        block28: {
                            block29: {
                                block26: {
                                    block27: {
                                        block24: {
                                            block25: {
                                                var1_1 = (Long)var0[0];
                                                var3_2 = (Double)var0[1];
                                                var5_3 = (Double)var0[2];
                                                var1_1 = _4Q.a ^ var1_1;
                                                var7_4 = _4Q.cfr_renamed_9();
                                                try {
                                                    try {
                                                        cfr_temp_0 = var5_3 - 1.0;
                                                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                        if (var7_4 == null) break block24;
                                                        if (v0 < 0) break block25;
                                                    }
                                                    catch (NumberFormatException v1) {
                                                        throw _4Q.a(v1);
                                                    }
                                                    return _4Q.b("\u00f9", (Object)_4Q.a("o", (int)17429, (long)(8419666781843903128L ^ var1_1)), (Object)new Object[]{_4Q.b("\u00f9", (double)var3_2, (long)7013517444265837863L, (long)var1_1)}, (long)7014757092480539490L, (long)var1_1);
                                                }
                                                catch (NumberFormatException v2) {
                                                    throw _4Q.a(v2);
                                                }
                                            }
                                            cfr_temp_1 = var5_3 - 0.1;
                                            v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                        }
                                        try {
                                            try {
                                                v3 = var7_4;
                                                if (var1_1 > 0L) {
                                                    if (v3 == null) break block26;
                                                    if (v0 < 0) break block27;
                                                }
                                                ** GOTO lbl43
                                            }
                                            catch (NumberFormatException v4) {
                                                throw _4Q.a(v4);
                                            }
                                            return _4Q.b("\u00f9", (Object)_4Q.a("o", (int)30891, (long)(2136910146451500581L ^ var1_1)), (Object)new Object[]{_4Q.b("\u00f9", (double)var3_2, (long)7013517444265837863L, (long)var1_1)}, (long)7014757092480539490L, (long)var1_1);
                                        }
                                        catch (NumberFormatException v5) {
                                            throw _4Q.a(v5);
                                        }
                                    }
                                    cfr_temp_2 = var5_3 - 0.01;
                                    v0 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                }
                                try {
                                    try {
                                        v3 = var7_4;
lbl43:
                                        // 2 sources

                                        if (var1_1 >= 0L) {
                                            if (v3 == null) break block28;
                                            if (v0 < 0) break block29;
                                        }
                                        ** GOTO lbl61
                                    }
                                    catch (NumberFormatException v6) {
                                        throw _4Q.a(v6);
                                    }
                                    return _4Q.b("\u00f9", (Object)_4Q.a("o", (int)19339, (long)(6901125875117907200L ^ var1_1)), (Object)new Object[]{_4Q.b("\u00f9", (double)var3_2, (long)7013517444265837863L, (long)var1_1)}, (long)7014757092480539490L, (long)var1_1);
                                }
                                catch (NumberFormatException v7) {
                                    throw _4Q.a(v7);
                                }
                            }
                            cfr_temp_3 = var5_3 - 0.001;
                            v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                        }
                        try {
                            try {
                                if (var1_1 <= 0L) break block30;
                                v3 = var7_4;
lbl61:
                                // 2 sources

                                if (v3 == null) break block30;
                                if (v0 < 0) break block31;
                            }
                            catch (NumberFormatException v8) {
                                throw _4Q.a(v8);
                            }
                            return _4Q.b("\u00f9", (Object)_4Q.a("o", (int)7220, (long)(6002624694032665272L ^ var1_1)), (Object)new Object[]{_4Q.b("\u00f9", (double)var3_2, (long)7013517444265837863L, (long)var1_1)}, (long)7014757092480539490L, (long)var1_1);
                        }
                        catch (NumberFormatException v9) {
                            throw _4Q.a(v9);
                        }
                    }
                    try {
                        v10 = var5_3;
                        if (var7_4 == null) break block32;
                        cfr_temp_4 = v10 - 1.0E-4;
                        v0 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                    }
                    catch (NumberFormatException v11) {
                        throw _4Q.a(v11);
                    }
                }
                try {
                    if (var1_1 >= 0L) {
                        if (v0 < 0) break block33;
                        v0 = 7116;
                    }
                    return _4Q.b("\u00f9", (Object)_4Q.a("o", (int)v0, (long)(6062239027509235011L ^ var1_1)), (Object)new Object[]{_4Q.b("\u00f9", (double)var3_2, (long)7013517444265837863L, (long)var1_1)}, (long)7014757092480539490L, (long)var1_1);
                }
                catch (NumberFormatException v12) {
                    throw _4Q.a(v12);
                }
            }
            v10 = var3_2;
        }
        return _4Q.b("\u00f9", (double)v10, (long)7014592812134579170L, (long)var1_1);
    }

    public static void cfr_renamed_4(_4w[] wArray) {
        cfr_renamed_6 = wArray;
    }

    public static double double_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        double d = (Double)objectArray[1];
        double d2 = (Double)objectArray[2];
        l2 = a ^ l2;
        return d2 * (double)_4Q.b("\u00f9", (double)(d / d2), 9066622571314383085L, (long)l2);
    }

    public static double cfr_renamed_3(Object[] objectArray) {
        double d;
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        try {
            d = _4Q.b("\u00f8", (Object)_4Q.b("\u00d5", 1525122015446379720L, (long)l2), 1523516417545687060L, (long)l2) > 0 ? 1.0 / (double)_4Q.b("\u00f8", (Object)_4Q.b("\u00d5", 1525122015446379720L, (long)l2), 1523516417545687060L, (long)l2) : 1.0;
        }
        catch (NumberFormatException numberFormatException) {
            throw _4Q.a(numberFormatException);
        }
        return d;
    }

    public static float float_3(Object[] objectArray) {
        float f;
        long l2 = (Long)objectArray[0];
        float f2 = ((Float)objectArray[1]).floatValue();
        float f3 = ((Float)objectArray[2]).floatValue();
        float f4 = ((Float)objectArray[3]).floatValue();
        long l3 = l2 = a ^ l2;
        long l4 = l3 ^ 0x7B32096CB10L;
        long l5 = l3 ^ 0x410CEBD16BADL;
        _4w[] wArray = _4Q.cfr_renamed_9();
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            Object[] objectArray3 = new Object[4];
            objectArray3[3] = l5;
            objectArray3[2] = 1.0;
            objectArray3[1] = 0.0;
            objectArray3[0] = (double)((float)(_4Q.b("\u00f9", (Object)objectArray2, 5832597382712150288L, (long)l2) * (double)f4));
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l4;
            Object[] objectArray5 = new Object[4];
            objectArray5[3] = l5;
            objectArray5[2] = 1.0;
            objectArray5[1] = 0.0;
            objectArray5[0] = (double)((float)(_4Q.b("\u00f9", (Object)objectArray4, 5832597382712150288L, (long)l2) * (double)f4));
            f = (float)((1.0 - _4Q.b("\u00f9", (Object)objectArray3, 5836584340220397508L, (long)l2)) * (double)f2 + _4Q.b("\u00f9", (Object)objectArray5, 5836584340220397508L, (long)l2) * (double)f3);
            if (wArray == null) {
                _4w.cfr_renamed_8(new String[3]);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw _4Q.a(numberFormatException);
        }
        return f;
    }

    public static double double_3(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        return d2 + (d3 - d2) * d;
    }

    /*
     * Unable to fully structure code
     */
    public static double cfr_renamed_8(Object[] var0) {
        block32: {
            block34: {
                block33: {
                    block31: {
                        block28: {
                            block29: {
                                block30: {
                                    block27: {
                                        var3_1 = (String)var0[0];
                                        var1_2 = (Long)var0[1];
                                        var1_2 = _4Q.a ^ var1_2;
                                        var4_3 = _4Q.cfr_renamed_9();
                                        try {
                                            v0 = var3_1;
                                            if (var4_3 == null) break block27;
                                            if (v0 != null) {
                                            }
                                            ** GOTO lbl26
                                        }
                                        catch (NumberFormatException v1) {
                                            throw _4Q.a(v1);
                                        }
                                        v0 = var3_1;
                                    }
                                    if (var4_3 == null) break block28;
                                    try {
                                        block35: {
                                            v2 = 7519861163024886146L;
                                            v3 = var1_2;
                                            if (var1_2 <= 0L) break block29;
                                            if (_4Q.b("\u00f8", (Object)v0, (long)v2, (long)v3) == false) break block30;
                                            break block35;
                                            catch (NumberFormatException v4) {
                                                throw _4Q.a(v4);
                                            }
                                        }
                                        return -1.0;
                                    }
                                    catch (NumberFormatException v5) {
                                        throw _4Q.a(v5);
                                    }
                                }
                                v6 = _4Q.b("\u00f8", (Object)_4Q.b("\u00f8", var3_1, (Object)",", (Object)"", (long)7519641899510130652L, (long)var1_2), (long)7519511870810010460L, (long)var1_2);
                                v2 = 7519693569390654385L;
                                v3 = var1_2;
                            }
                            v0 = _4Q.b("\u00f8", (Object)v6, (long)v2, (long)v3);
                        }
                        var5_4 = v0;
                        var6_5 = 1.0;
                        try {
                            v7 = _4Q.b("\u00f8", (Object)var5_4, (Object)"T", (long)7518333814183198042L, (long)var1_2);
                            v8 = var4_3;
                            if (var1_2 <= 0L) ** GOTO lbl63
                            if (v8 == null) break block31;
                            if (v7 != false) {
                            }
                            ** GOTO lbl55
                        }
                        catch (NumberFormatException v9) {
                            throw _4Q.a(v9);
                        }
                        var6_5 = 1.0E12;
                        v10 = _4Q.b("\u00f8", (Object)var5_4, (int)0, (int)(_4Q.b("\u00f8", (Object)var5_4, (long)7518545413184854361L, (long)var1_2) - true), (long)7519063235049812468L, (long)var1_2);
                        if (var1_2 < 0L) ** GOTO lbl56
                        var5_4 = v10;
                        try {
                            if (var4_3 != null) break block32;
lbl55:
                            // 2 sources

                            v10 = var5_4;
lbl56:
                            // 2 sources

                            v7 = _4Q.b("\u00f8", (Object)v10, (Object)"B", (long)7518333814183198042L, (long)var1_2);
                        }
                        catch (NumberFormatException v11) {
                            throw _4Q.a(v11);
                        }
                    }
                    try {
                        v8 = var4_3;
lbl63:
                        // 2 sources

                        if (var1_2 <= 0L) ** GOTO lbl84
                        if (v8 == null) break block33;
                        if (v7 != false) {
                        }
                        ** GOTO lbl76
                    }
                    catch (NumberFormatException v12) {
                        throw _4Q.a(v12);
                    }
                    var6_5 = 1.0E9;
                    v13 = _4Q.b("\u00f8", (Object)var5_4, (int)0, (int)(_4Q.b("\u00f8", (Object)var5_4, (long)7518545413184854361L, (long)var1_2) - true), (long)7519063235049812468L, (long)var1_2);
                    if (var1_2 <= 0L) ** GOTO lbl77
                    var5_4 = v13;
                    try {
                        if (var4_3 != null) break block32;
lbl76:
                        // 2 sources

                        v13 = var5_4;
lbl77:
                        // 2 sources

                        v7 = _4Q.b("\u00f8", (Object)v13, (Object)"M", (long)7518333814183198042L, (long)var1_2);
                    }
                    catch (NumberFormatException v14) {
                        throw _4Q.a(v14);
                    }
                }
                try {
                    v8 = var4_3;
lbl84:
                    // 2 sources

                    if (v8 == null) break block34;
                    if (v7 != false) {
                    }
                    ** GOTO lbl94
                }
                catch (NumberFormatException v15) {
                    throw _4Q.a(v15);
                }
                var6_5 = 1000000.0;
                var5_4 = _4Q.b("\u00f8", (Object)var5_4, (int)0, (int)(_4Q.b("\u00f8", (Object)var5_4, (long)7518545413184854361L, (long)var1_2) - true), (long)7519063235049812468L, (long)var1_2);
                if (var1_2 > 0L && var4_3 != null) break block32;
lbl94:
                // 2 sources

                try {
                    block36: {
                        v16 = var5_4;
                        if (var4_3 == null) ** GOTO lbl112
                        break block36;
                        catch (NumberFormatException v17) {
                            throw _4Q.a(v17);
                        }
                    }
                    v7 = _4Q.b("\u00f8", v16, (Object)"K", (long)7518333814183198042L, (long)var1_2);
                }
                catch (NumberFormatException v18) {
                    throw _4Q.a(v18);
                }
            }
            if (v7 != false) {
                var6_5 = 1000.0;
                var5_4 = _4Q.b("\u00f8", (Object)var5_4, (int)0, (int)(_4Q.b("\u00f8", (Object)var5_4, (long)7518545413184854361L, (long)var1_2) - true), (long)7519063235049812468L, (long)var1_2);
            }
        }
        try {
            v16 = var5_4;
lbl112:
            // 2 sources

            return (double)(_4Q.b("\u00f9", v16, (long)7518063426103102756L, (long)var1_2) * var6_5);
        }
        catch (NumberFormatException var8_6) {
            return -1.0;
        }
    }

    public static _4w[] cfr_renamed_9() {
        return cfr_renamed_6;
    }

    public static double cfr_renamed_9(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        double d3 = (Double)objectArray[2];
        long l2 = (Long)objectArray[3];
        double d4 = (Double)objectArray[4];
        l2 = a ^ l2;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = d2;
        objectArray2[1] = d;
        objectArray2[0] = (double)(1.0f - (float)_4Q.b("\u00f9", (double)d3, (double)d4, 8356068896126520111L, (long)l2));
        return (double)_4Q.b("\u00f9", (Object)objectArray2, 8357204633431490821L, (long)l2);
    }

    public static double cfr_renamed_0(Object[] objectArray) {
        double d = (Double)objectArray[0];
        double d2 = (Double)objectArray[1];
        long l2 = (Long)objectArray[2];
        double d3 = (Double)objectArray[3];
        long l3 = (l2 = a ^ l2) ^ 0x1F0D1F428E48L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l3;
        objectArray2[2] = 1.0;
        objectArray2[1] = 0.0;
        objectArray2[0] = d;
        reference var11_6 = _4Q.b("\u00f9", (Object)objectArray2, -5396745526850739679L, (long)l2);
        var11_6 = var11_6 * var11_6 * (3.0 - 2.0 * var11_6);
        return d2 + (d3 - d2) * var11_6;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_4Q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(_4Q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

