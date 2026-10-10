/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3675$class_306
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.krypton.mixin;

import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.gen.Accessor;

public interface _9Y {
    @Accessor(value="field_1661")
    public int getTimesPressed();

    @Accessor(value="field_1655")
    public class_3675.class_306 getBoundKey();

    @Accessor(value="field_1661")
    public void setTimesPressed(int var1);
}

