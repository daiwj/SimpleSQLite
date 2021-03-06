package com.yuntianhe.simplesqlite.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * desc:
 * author: daiwj on 2020-04-08 21:24
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Database {

    String name() default "";

    int version();

}
