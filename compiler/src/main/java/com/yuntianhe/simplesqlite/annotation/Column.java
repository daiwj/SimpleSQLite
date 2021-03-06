package com.yuntianhe.simplesqlite.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * desc:
 * author: daiwj on 2020-04-08 17:32
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface Column {

    String name() default "";

    String defaultValue() default "";
}
