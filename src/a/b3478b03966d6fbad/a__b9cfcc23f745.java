/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.jumanji144.jvmtp.runtime.ResourceStore
 */
package a.b3478b03966d6fbad;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import me.jumanji144.jvmtp.runtime.ResourceStore;

public class a {
    private static String BUILD_ID = "3478b03966d6fbad";
    private static String RES_BLOB;
    private static volatile boolean loaded;

    private static String detectPlatform() {
        String archName;
        boolean isAarch64;
        String osName;
        String os = System.getProperty("os.name").toLowerCase();
        String arch = System.getProperty("os.arch").toLowerCase();
        if (os.contains("darwin") || os.contains("mac")) {
            osName = "macos";
        } else if (os.contains("win")) {
            osName = "windows";
        } else if (os.contains("linux")) {
            osName = "linux";
        } else {
            throw new UnsupportedOperationException("Unsupported OS: " + os);
        }
        boolean bl = isAarch64 = arch.contains("aarch64") || arch.contains("arm64");
        if (isAarch64) {
            archName = "aarch64";
        } else if (arch.contains("amd64") || arch.contains("x86_64") || arch.contains("x64")) {
            archName = "x86_64";
        } else {
            throw new UnsupportedOperationException("Unsupported architecture: " + arch);
        }
        return archName + "-" + osName;
    }

    private static String platformExtension(String platform) {
        if (platform.contains("windows")) {
            return ".dll";
        }
        if (platform.contains("macos")) {
            return ".dylib";
        }
        return ".so";
    }

    private static InputStream openNative(String entryName) throws IOException {
        if (RES_BLOB != null) {
            return ResourceStore.open(a.class, (String)RES_BLOB, (String)entryName);
        }
        return a.class.getResourceAsStream("/" + entryName);
    }

    static {
        loaded = false;
        a.load();
    }

    public static synchronized void load() {
        if (loaded) {
            return;
        }
        try {
            String platform = a.detectPlatform();
            String entryName = "native/" + BUILD_ID + "/" + platform;
            try (InputStream is = a.openNative(entryName);){
                if (is == null) {
                    throw new UnsatisfiedLinkError("Native library not found in jar: " + entryName);
                }
                String ext = a.platformExtension(platform);
                File tempFile = File.createTempFile("jvmtp-" + BUILD_ID + "-", ext);
                tempFile.deleteOnExit();
                Files.copy(is, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.load(tempFile.getAbsolutePath());
            }
            loaded = true;
        }
        catch (IOException e2) {
            throw new UnsatisfiedLinkError("Failed to extract native library: " + e2.getMessage());
        }
    }

    public static native void init(Class<?> var0, int var1);
}

