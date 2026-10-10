/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 */
package dev.krypton;

import dev.krypton._3T;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_639;
import net.minecraft.class_642;

public class _41
extends Record
implements _3T {
    private final class_639 cfr_renamed_5;
    private final class_642 cfr_renamed_4;

    public _41(class_639 class_6392, class_642 class_6422) {
        this.cfr_renamed_5 = class_6392;
        this.cfr_renamed_4 = class_6422;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_41.class, "1;0", "1", "0"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_41.class, "1;0", "1", "0"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_41.class, "1;0", "1", "0"}, this, object);
    }

    public class_639 cfr_renamed_9() {
        return this.cfr_renamed_5;
    }

    public class_642 cfr_renamed_1() {
        return this.cfr_renamed_4;
    }
}

