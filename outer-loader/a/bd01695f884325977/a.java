package a.bd01695f884325977;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class a {
   private static String BUILD_ID = "d01695f884325977";
   private static volatile boolean loaded = false;

   public static native void init(Class<?> var0, int var1);

   public static synchronized void load() {
      if (!loaded) {
         try {
            String platform = detectPlatform();
            String resourcePath = "/native/" + BUILD_ID + "/" + platform;
            InputStream is = a.class.getResourceAsStream(resourcePath);

            try {
               if (is == null) {
                  throw new UnsatisfiedLinkError("Native library not found in jar: " + resourcePath);
               }

               String ext = platformExtension(platform);
               File tempFile = File.createTempFile("jvmtp-" + BUILD_ID + "-", ext);
               tempFile.deleteOnExit();
               Files.copy(is, tempFile.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
               System.load(tempFile.getAbsolutePath());
            } catch (Throwable var6) {
               if (is != null) {
                  try {
                     is.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if (is != null) {
               is.close();
            }

            loaded = true;
         } catch (IOException e) {
            throw new UnsatisfiedLinkError("Failed to extract native library: " + e.getMessage());
         }
      }
   }

   private static String detectPlatform() {
      String os = System.getProperty("os.name").toLowerCase();
      String arch = System.getProperty("os.arch").toLowerCase();
      String osName;
      if (!os.contains("darwin") && !os.contains("mac")) {
         if (os.contains("win")) {
            osName = "windows";
         } else {
            if (!os.contains("linux")) {
               throw new UnsupportedOperationException("Unsupported OS: " + os);
            }

            osName = "linux";
         }
      } else {
         osName = "macos";
      }

      boolean isAarch64 = arch.contains("aarch64") || arch.contains("arm64");
      String archName;
      if (isAarch64) {
         archName = "aarch64";
      } else {
         if (!arch.contains("amd64") && !arch.contains("x86_64") && !arch.contains("x64")) {
            throw new UnsupportedOperationException("Unsupported architecture: " + arch);
         }

         archName = "x86_64";
      }

      return archName + "-" + osName;
   }

   private static String platformExtension(String platform) {
      if (platform.contains("windows")) {
         return ".dll";
      } else {
         return platform.contains("macos") ? ".dylib" : ".so";
      }
   }

   static {
      load();
   }
}
