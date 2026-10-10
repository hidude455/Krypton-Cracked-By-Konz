/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package dev.krypton.mixin;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import org.spongepowered.asm.mixin.gen.Invoker;

public interface _9u {
    @Invoker(value="withSnippet")
    public void invokeWithSnippet(RenderPipeline.Snippet var1);
}

