package com.zhongrun.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于查找的时候，放置缓存信息
 *
 * @author Administrator
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Cache {
    //key的前缀
    String prefix();

    //缓存有效期 1000*60*60*2=2小时
    long expiration() default 1000 * 60 * 60 * 2;
}