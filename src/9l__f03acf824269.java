/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  3y
 */
import a.b3478b03966d6fbad.a;
import dev.krypton.l;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _9l {
    private String cfr_renamed_3;
    private int cfr_renamed_4;
    private Selector cfr_renamed_2;
    private SocketChannel cfr_renamed_0;
    private _3y cfr_renamed_8;
    private Runnable cfr_renamed_6;
    private Consumer cfr_renamed_1;
    private static int cfr_renamed_9;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    private native void cfr_renamed_5(Object[] var1) throws IOException;

    public _9l(long l2) {
        l2 = a ^ l2;
        _9l.b("\u00ea", (Object)this, _9l::cfr_renamed_6, -7344666835242528537L, (long)l2);
        _9l.b("\u00ea", (Object)this, _9l::cfr_renamed_0, -7341807338252742176L, (long)l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a.b3478b03966d6fbad.a.init(_9l.class, 34);
        a = l.a(-5612610605835658545L, 7103338806825369370L, MethodHandles.lookup().lookupClass()).a(164711732763501L);
        e = new Object[67];
        f = new String[67];
        _9l.a();
        d = new HashMap(13);
        _9l.cfr_renamed_7(84);
        long l2 = a ^ 0x767628FB5F67L;
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
        String string = "\u00ae\u0015\u0001\u00ca\u00ef\u00ea\u0096\u00d3@\u0019\u00a3\u0083\u000b,\u00efX";
        int n2 = "\u00ae\u0015\u0001\u00ca\u00ef\u00ea\u0096\u00d3@\u0019\u00a3\u0083\u000b,\u00efX".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    public native void cfr_renamed_1(Object[] var1);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Class b(long var0, long var2);

    private static native Field b(Class var0, String var1, Class var2);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native int a(long var0, long var2);

    private static native void a();

    private static native int a(int var0, long var1);

    private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field a(Class var0, String var1, Class var2);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native IOException a(IOException var0);

    public static native int cfr_renamed_4();

    private native void cfr_renamed_4(Object[] var1);

    private static native byte[] cfr_renamed_2(byte[] var0);

    public native void cfr_renamed_2(Object[] var1) throws IOException;

    public native void cfr_renamed_3(Object[] var1);

    private static native void cfr_renamed_6();

    private native void cfr_renamed_7(Object[] var1) throws IOException;

    public static native int cfr_renamed_7();

    public static native void cfr_renamed_7(int var0);

    public native void cfr_renamed_8(Object[] var1);

    public native void cfr_renamed_9(Object[] var1) throws IOException;

    public native void cfr_renamed_0(Object[] var1) throws IOException;

    private static native void cfr_renamed_0(Throwable var0);
}

