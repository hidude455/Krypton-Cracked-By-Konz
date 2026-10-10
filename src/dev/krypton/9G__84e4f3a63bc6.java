/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderPass
 */
package dev.krypton;

import com.mojang.blaze3d.systems.RenderPass;

public interface _9G {
    public void krypton$popScissor();

    public void krypton$pushScissor(int var1, int var2, int var3, int var4);

    @Deprecated
    public void krypton$onCreateRenderPass(RenderPass var1);
}

