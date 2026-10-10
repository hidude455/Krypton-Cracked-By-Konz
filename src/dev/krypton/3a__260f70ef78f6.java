/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._3T;
import dev.krypton._6U;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public class _3a
extends Record {
    private final Object cfr_renamed_8;
    private final Consumer cfr_renamed_1;
    private final _6U cfr_renamed_6;

    private _3a(Object object, Consumer consumer, _6U u) {
        this.cfr_renamed_8 = object;
        this.cfr_renamed_1 = consumer;
        this.cfr_renamed_6 = u;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{_3a.class, "5;9;3", "5", "9", "3"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{_3a.class, "5;9;3", "5", "9", "3"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{_3a.class, "5;9;3", "5", "9", "3"}, this);
    }

    public Object cfr_renamed_4() {
        return this.cfr_renamed_8;
    }

    public Consumer java_util_function_Consumer_4() {
        return this.cfr_renamed_1;
    }

    public _6U dev_krypton_6U_4() {
        return this.cfr_renamed_6;
    }

    public void cfr_renamed_9(_3T t) {
        this.cfr_renamed_1.accept(t);
    }
}

