/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package dev.krypton;

import a.b3478b03966d6fbad.a;
import dev.krypton._3i_0;
import dev.krypton._4r;
import dev.krypton._6P;
import dev.krypton._6u_0;
import dev.krypton._6x_0;
import dev.krypton.l;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class _02 {
    private final List cfr_renamed_4 = new ArrayList();
    private static boolean cfr_renamed_3;
    private static final long a;
    private static final Object[] b;
    private static final String[] c;

    public native void cfr_renamed_5(Object[] var1);

    private static native boolean cfr_renamed_5(long var0, short var2, _6x_0 var3);

    private static native boolean cfr_renamed_5(_4r var0, long var1, _6x_0 var3);

    static {
        a.b3478b03966d6fbad.a.init(_02.class, 10);
        a = l.a(5915720022230274042L, -2689394442674430346L, MethodHandles.lookup().lookupClass()).a(169505786893976L);
        b = new Object[54];
        c = new String[54];
        _02.a();
        if (_02.cfr_renamed_2()) {
            _02.cfr_renamed_1(true);
        }
    }

    public static native void cfr_renamed_1(boolean var0);

    private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native Class b(long var0, long var2);

    private static native Field b(Class var0, String var1, Class var2);

    private static native Field c(long var0, long var2);

    private static native Method d(long var0, long var2);

    private static native int a(long var0, long var2);

    private static native MatchException a(MatchException var0);

    private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

    private static native void a();

    private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

    private static native Field a(Class var0, String var1, Class var2);

    private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

    private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

    public native List cfr_renamed_4(Object[] var1);

    private static native void cfr_renamed_4(long var0, _6P var2, _6x_0 var3);

    public static native boolean cfr_renamed_2();

    public static native boolean cfr_renamed_3();

    private native void cfr_renamed_6(long var1);

    private static native boolean cfr_renamed_6(long var0, String var2, _6x_0 var3);

    public native List cfr_renamed_6(Object[] var1);

    public native void void_4(Object[] var1);

    @_3i_0
    public native void cfr_renamed_7(_6P var1);

    public native List java_util_List_4(Object[] var1);

    public native _6x_0 cfr_renamed_8(Object[] var1);

    private static native void cfr_renamed_9(long var0, _6u_0 var2, _6x_0 var3);

    @_3i_0
    public native void cfr_renamed_9(_6u_0 var1);

    public native _6x_0 cfr_renamed_0(Object[] var1);
}

