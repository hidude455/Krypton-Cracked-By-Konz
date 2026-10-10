/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package dev.krypton.mixin;

import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.gen.Invoker;

public interface _8U {
    @Invoker(value="method_71094")
    public Matrix4f krypton$callGetMatrix(float var1, float var2);
}

