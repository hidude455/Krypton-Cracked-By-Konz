import a.bd01695f884325977.a;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.SecureClassLoader;
import java.util.Map;

public final class pedroisgayl extends SecureClassLoader {
   private static MethodHandle pedroisgayI;
   private static Object pedroisgayL;
   private static MethodHandle pedroisgayx;
   private final ClassLoader pedroisgayF;
   private Map pedroisgayw;
   private byte[] pedroisgaye;
   byte[] pedroisgayX;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final long[] e;
   private static final Long[] f;
   private static final Object[] g;
   private static final String[] h;

   public pedroisgayl(long a, ClassLoader parent, ClassLoader knot) {
      long var5 = a ^ 56259495872613L;
      super(parent);
      this.pedroisgayF = knot;
      this.Ó<invokedynamic>(this, new Object[]{var5}, 51479088885806487L, a);
   }

   public static native void pedroisgayG(Object[] var0);

   public native void pedroisgayx(Object[] var1);

   public native Class loadClass(String name, boolean resolve) throws ClassNotFoundException;

   public native URL getResource(String name);

   public native InputStream getResourceAsStream(String name);

   static {
      a.bd01695f884325977.a.init(pedroisgayl.class, 4);
      18fb69d45adbd60();
   }

   private static native String a(int var0, int var1, int var2);

   private static native int a(int var0, long var1);

   private static native long b(int var0, long var1);

   private static native int a(long var0, long var2);

   private static native void a();

   private static native Class b(long var0, long var2);

   private static native Field a(Class var0, String var1, Class var2);

   private static native Field b(Class var0, String var1, Class var2);

   private static native Field c(long var0, long var2);

   private static native Method a(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method b(Class var0, String var1, Class var2, int var3, Class[] var4);

   private static native Method d(long var0, long var2);

   private static native MethodHandle a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, long var4, long var6);

   private static native Object a(MethodHandles.Lookup var0, MutableCallSite var1, String var2, MethodType var3, Object[] var4);

   private static native CallSite a(MethodHandles.Lookup var0, String var1, MethodType var2);

   private static native Object[] b();

   private static native Object[] a(Object var0);

   // $FF: synthetic method
   private static native void _8fb69d45adbd60/* $FF was: 18fb69d45adbd60*/();
}
