/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _7u {
    private static final ConcurrentHashMap cfr_renamed_0;
    private static final ConcurrentHashMap cfr_renamed_6;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a.b3478b03966d6fbad.a.init(_7u.class, 29);
        a = l.a(-1281979977245706825L, -4514785802507893770L, MethodHandles.lookup().lookupClass()).a(11950834505557L);
        f = new Object[47];
        g = new String[47];
        _7u.a();
        d = new HashMap(13);
        long l2 = a ^ 0x20B5273DC272L;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "K\u00e7\u0095\u00b9\u0080\u0016C\u00116\u00dd\u0087\\\u0095&\u0016\u000eD\u000f\u00c3\u00f3\u00eb\u0007\u00aa\u00e4";
        int n2 = "K\u00e7\u0095\u00b9\u0080\u0016C\u00116\u00dd\u0087\\\u0095&\u0016\u000eD\u000f\u00c3\u00f3\u00eb\u0007\u00aa\u00e4".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray5 = new byte[8];
        byte[] byArray6 = byArray5;
        byArray5[0] = (byte)(l2 >>> 56);
        int n5 = 1;
        while (true) {
            if (n5 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray6)), new IvParameterSpec(new byte[8]));
                long l4 = 835472617945832296L;
                byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l4 >>> 56), (byte)(l4 >>> 48), (byte)(l4 >>> 40), (byte)(l4 >>> 32), (byte)(l4 >>> 24), (byte)(l4 >>> 16), (byte)(l4 >>> 8), (byte)l4});
                e = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
                cfr_renamed_0 = new ConcurrentHashMap();
                cfr_renamed_6 = new ConcurrentHashMap();
                return;
            }
            byArray6 = byArray6;
            byArray6[n5] = (byte)(l2 << n5 * 8 >>> 56);
            ++n5;
        }
    }

    private static native byte[][] cfr_renamed_1(Object[] var0);

    private static native Class b(long var0, long var2);

    private static native CallSite b(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Field b(Class var0, String var1, Class var2);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native void a();

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native int a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, Object[] var3);

    private static native int a(int var0, long var1);

    private static native Throwable a(Throwable var0);

    private static native Field a(Class var0, String var1, Class var2);

    private static native int a(long var0, long var2);

    private static native CompletableFuture cfr_renamed_2(long var0, Integer var2);

    public static native void void_3(Object[] var0);

    public static native String java_lang_String_3(Object[] var0);

    public static native CompletableFuture cfr_renamed_7(Object[] var0);

    private static native CompletableFuture cfr_renamed_8(Integer var0);

    public static native String cfr_renamed_0(Object[] var0);
}

