/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10789
 *  net.minecraft.class_2960
 */
package dev.krypton;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat;
import dev.krypton._6L;
import dev.krypton.l;
import dev.krypton.mixin._9u;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_10789;
import net.minecraft.class_2960;

public class _3b {
    private final RenderPipeline.Builder cfr_renamed_6;
    private boolean cfr_renamed_5;
    private static final long a = l.a(-5739743631929465937L, -2033810642840840694L, MethodHandles.lookup().lookupClass()).a(72298501643804L);
    private static final long b;
    private static final Object[] c;
    private static final String[] d;

    public _3b cfr_renamed_5(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        class_2960 class_29602 = (class_2960)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, -7676721155209361547L, (long)l2), (Object)class_29602, -7678443888263892552L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_199(Object[] objectArray) {
        class_2960 class_29602 = (class_2960)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, -3340938486467705951L, (long)l2), (Object)class_29602, -3340095688368635987L, (long)l2);
        return this;
    }

    public _3b(int n, short s, char c, RenderPipeline.Snippet[] snippetArray) {
        long l2 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ a;
        this.cfr_renamed_6 = _3b.a("\u00fa", (Object)new RenderPipeline.Snippet[0], 2017195473518312316L, (long)l2);
        for (RenderPipeline.Snippet snippet : snippetArray) {
            ((_9u)((Object)_3b.a("g", (Object)this, 2015885299302894074L, (long)l2))).invokeWithSnippet(snippet);
            if (n >= 0) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = new Object[30];
        d = new String[30];
        _3b.a();
        long l2 = a ^ 0x71E86B19915DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l2 >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l3 = 9145505670434357156L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l2 << n * 8 >>> 56);
            ++n;
        }
    }

    public _3b dev_krypton_3b_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 2210019827191811240L, (long)l2), (Object)string, 2210201150055341662L, (long)l2);
        return this;
    }

    public RenderPipeline com_mojang_blaze3d_pipeline_RenderPipeline_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        CallSite callSite = _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 2181922255285881924L, (long)l2), 2180100907497248673L, (long)l2);
        _3b.a("\u00c1", (Object)((_6L)((Object)callSite)), (boolean)_3b.a("g", (Object)this, 2180487880544692298L, (long)l2), 2180167490554080294L, (long)l2);
        return callSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = _3b.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int j = 0; j < classArray2.length; ++j) {
                method = _3b.b(classArray2[j], string, clazz2, n, classArray);
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
            int n = _3b.a(l2, l3);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                _3b.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = _3b.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int j = 0; j < classArray.length; ++j) {
                field = _3b.b(classArray[j], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2, long l3) {
        int n = _3b.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = _3b.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = _3b.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = _3b.a(clazz3, string2, clazz2)) != null) {
                    _3b.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        field = _3b.b(classArray[j], string2, clazz2);
                        if (field == null) continue;
                        _3b.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = _3b.b(1049875492639310L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l2, long l3) {
        int n = _3b.a(l2, l3);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = _3b.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = _3b.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (j < n2) {
                        classArray2[j] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = _3b.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        _3b.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = _3b.b(1049875492639310L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int j = 0; j < classArray.length; ++j) {
                        Method method = _3b.b(classArray[j], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        _3b.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = _3b.b(1049875492639310L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/krypton/3b" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l2 = (Long)objectArray[n];
        long l3 = (Long)objectArray[++n];
        MethodHandle methodHandle = _3b.a(lookup, mutableCallSite, string, methodType, l2, l3);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2, long l3) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == '\u00c8' || c == '\u00cd' || c == '\u00e9') {
                field = _3b.c(l2, l3);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = _3b.d(l2, l3);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, Long.TYPE, Long.TYPE);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l2, long l3) {
        int n;
        int n2;
        int n3 = (int)((l2 ^= l3 << 48 | l3) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0 -> 33;
            case 1 -> 30;
            case 2 -> 44;
            case 3 -> 16;
            case 4 -> 45;
            case 5 -> 34;
            case 6 -> 50;
            case 7 -> 23;
            case 8 -> 27;
            case 9 -> 10;
            case 10 -> 54;
            case 11 -> 2;
            case 12 -> 28;
            case 13 -> 40;
            case 14 -> 41;
            case 15 -> 21;
            case 16 -> 13;
            case 17 -> 36;
            case 18 -> 56;
            case 19 -> 49;
            case 20 -> 60;
            case 21 -> 55;
            case 22 -> 62;
            case 23 -> 3;
            case 24 -> 59;
            case 25 -> 9;
            case 26 -> 38;
            case 27 -> 14;
            case 28 -> 52;
            case 29 -> 42;
            case 30 -> 22;
            case 31 -> 1;
            case 32 -> 53;
            case 33 -> 12;
            case 34 -> 20;
            case 35 -> 24;
            case 36 -> 15;
            case 37 -> 37;
            case 38 -> 47;
            case 39 -> 32;
            case 40 -> 5;
            case 41 -> 57;
            case 42 -> 26;
            case 43 -> 58;
            case 44 -> 43;
            case 45 -> 0;
            case 46 -> 35;
            case 47 -> 4;
            case 48 -> 48;
            case 49 -> 31;
            case 50 -> 8;
            case 51 -> 39;
            case 52 -> 51;
            case 53 -> 19;
            case 54 -> 18;
            case 55 -> 17;
            case 56 -> 25;
            case 57 -> 61;
            case 58 -> 29;
            case 59 -> 63;
            case 60 -> 46;
            case 61 -> 6;
            case 62 -> 7;
            default -> 11;
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
        _3b.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "WVJa\n)JCH \u000fu\u0000Q";
        objectArray[1] = "+\u001e\\m?L\"\u0010_$|A$\u0010K&aGf\u0001X37O!\u001fTm\u0000F&\u0015T1\u0002J8\u0014]*<Fl3D*>G-\u0003";
        objectArray[2] = "%:\fWMJ%:\u001b\u000bAE?q\u001b\u0015AP8\u0000J@\u0016\u0013";
        objectArray[3] = Boolean.TYPE;
        _3b.d[3] = "java/lang/Boolean";
        objectArray[4] = "*>\u001b]1z!1\n\u0012Lb26\u0003[";
        objectArray[5] = "&{\u0014pL\u000b&{\u0003,@\u0004<0\u00032@\u0011;AQn\u0016Zq";
        objectArray[6] = "N!B\r@hG/AD\u0003eA/UF\u001ec\u0003>FSHkD J\r\u007fbC*JQ}n]+CJCb";
        objectArray[7] = "g\"I\tGdz7KHB85\u000b";
        objectArray[8] = Void.TYPE;
        _3b.d[8] = "java/lang/Void";
        objectArray[9] = "pyz\u0018b}ywyQ!p\u007fwmS<v=`rD{wk8AS}fvnQY}\u007frb";
        objectArray[10] = "\u0006u7Lv1\u000f{4\u00055<\t{ \u0007(:Kl?\u0010o;\u001d4\f\u0007i*\u0000b\u001c\ri3\u0004n~\u0001w?\u0016i\u0005W.gS";
        objectArray[11] = "U\u0010nVrx\\\u001em\u001f1uZ\u001ey\u001d,s\u0018\u000fo\u0019kqY\rnV[rF\u000bk,zdB9v\u0016|c_\u0010m";
        objectArray[12] = "\u001b7=RDg\u00129>\u001b\u0007j\u00149*\u0019\u001alV(9\fLd\u001165Rkd\u001d64:\\f\u001b,9\u0013G";
        objectArray[13] = "\u0003'\t\u0006=\u000e5\u0004\u0000\b>Gv\t\u0006\b*Ek\u000fD\u00199P=\u0007\u0003\u00075\u000e\n\u000e\u0004\r5R\b\u0002\u001a\f<I6\u000eN:>I(\u001b\u000f\u001dk";
        objectArray[14] = "Rn-l/GYa<#NIRj8y";
        objectArray[15] = "X^\tz*\r\u0007\u0003\u001aC*}\u0003\bY2-\u0019AH\u0001=";
        objectArray[16] = "vU>rQS4\u0015f}mH.\u0018cG\n\\&\u0018bd\u000b7v\b|;\u0003\f1Y>`m\u000e~Yr?\tL>\u0001}\u0003";
        objectArray[17] = "#/+bwTaosmKO{bvH\"Ubz{iK\u000b\"dv+:\ff}q\u0013r\u0001'o*w0A\u007f`\u0016";
        objectArray[18] = "LlU>|'\u0011k\u0016z\u0000/\rg\u000f)m?p7\r+c5\u0014mP}>EI7V4<!\u000bw\u000e;\u0000";
        objectArray[19] = "P|\u0017uem\u0012<OzYv\b1JJ#`\u0006(Gb%R\t$Fi#\tP!U<72\u0017p\u0017gY0Xp[8=r\u0018(T\u0004";
        objectArray[20] = ">NM\u001eA+|\u000e\u0015\u0011}%z\u001e\u0014\u0003}smA\u000b\u0013\u001f.j\u0002Oo";
        objectArray[21] = "V`!JG\u0012\u0014 yE{\t\u000e-|p\u0006\u0012\u000bQ&\n@N\t)z_\u0015\u001doh-\u0006\nJ\u000b*m^\u0005v";
        objectArray[22] = "K\u0012\u0000P\u001dA\tRX_!Z\u0013_]\u007fL_\u000eNMzAL\u001eNG!\u0018I\r\u001bS\u001a_\u0018O@=\u0018\u0010\u0018\u0003\u001fYZP@\f#";
        objectArray[23] = "6m*FM\u00077)'N<Yq%3V[\\'/&Vx[m9\u0010O[]w4K\u0010\r\u0001323LXT`Tu\u0017_G7$/SXY\u000b";
        objectArray[24] = "RmL\u0002Fi\u0010-\u0014\rzr\n \u0011?\u0017u\u0017<-\u001e\u0001q%!\u0017\u0018\u0006l\f:qCJ|Uc@\u0003\u0014w\u001a\\HBG|W8\n\u0002\u001fsk";
        objectArray[25] = "=7\u0011PA/\u007fwI_}4ezLk\u0019&bj,\u0011\u001arh:H^\u0011-b\u0006\u0015\u0010@:8bWP\u00185\u0004";
        objectArray[26] = "\bF7%d\u0013J\u0006o*X\bP\u000bj\t>\u0016_\u0010p1XL\t\rjl)KM\u0014mTdM]\u0010p;#J\u0001\f\nmiJ@Kn/)\u0012Ow";
        objectArray[27] = "\u0018f\u0004V\u001c)G;\u0017o\u001eY@0RWA!\u001ce\u0007\u0004";
        objectArray[28] = "Fjz-:\u001e\u0004*\"\"\u0006\u0005\u001e''\u0010k\u0002\u0003;\u0018&g\u0006\u0012[}m=B\u0019#!8h\u0011\u007fbvawF\u001b 69xz";
        Object[] objectArray2 = objectArray;
        objectArray[29] = "DIR\u000f\u0005I\u0006\t\n\u00009R\u001c\u0004\u000f TW\u0001\u0015\u001f0^W\u0018\u0011\u0013~\u0007TD\u001f\u0016\u0004ZI\u0000\u001foA\u0004\u0016B\u0017\b\u0003\\L@xVO\u0004\\A\u001c\u0014\u000f\\S}";
    }

    public _3b cfr_renamed_4(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        DepthTestFunction depthTestFunction = (DepthTestFunction)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 3053055113515415645L, (long)l2), (Object)depthTestFunction, 3052116842378765807L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_2(Object[] objectArray) {
        String string = (String)objectArray[0];
        class_10789 class_107892 = (class_10789)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 8125334093050995393L, (long)l2), (Object)string, (Object)class_107892, 8126621473701119190L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_3(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, -8761507403948092309L, (long)l2), (boolean)bl, -8759957424779196832L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_6(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 1671109227034543411L, (long)l2), (boolean)bl, 1671974593445759533L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_7(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        VertexFormat vertexFormat = (VertexFormat)objectArray[1];
        VertexFormat.class_5596 class_55962 = (VertexFormat.class_5596)objectArray[2];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 7122659262421528795L, (long)l2), (Object)vertexFormat, (Object)class_55962, 7123701891232611817L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_8(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        class_2960 class_29602 = (class_2960)objectArray[2];
        int n3 = (Integer)objectArray[3];
        long l2 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ a;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, -5332300611208402948L, (long)l2), (Object)class_29602, -5334475878851299684L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_9(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        l2 = a ^ l2;
        _3b.a("\u00c8", (Object)this, (boolean)b, 6921134830210405892L, (long)l2);
        return this;
    }

    public _3b cfr_renamed_0(Object[] objectArray) {
        long l2 = (Long)objectArray[0];
        BlendFunction blendFunction = (BlendFunction)objectArray[1];
        l2 = a ^ l2;
        _3b.a("\u00c1", (Object)_3b.a("g", (Object)this, 740711058250897476L, (long)l2), (Object)blendFunction, 739153908175127977L, (long)l2);
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_3b.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

