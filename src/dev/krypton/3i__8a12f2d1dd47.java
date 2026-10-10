/*
 * Decompiled with CFR 0.152.
 */
package dev.krypton;

import dev.krypton._6U;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Renamed from dev.krypton.3i
 */
@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface _3i_0 {
    public _6U cfr_renamed_5() default _6U.NORMAL;
}

