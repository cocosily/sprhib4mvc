package com.zhongrun.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���ڲ��ҵ�ʱ�򣬷��û�����Ϣ
 *
 * @author Administrator
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Cache {
    //key��ǰ׺
    String prefix();

    //������Ч�� 1000*60*60*2=2Сʱ
    long expiration() default 1000 * 60 * 60 * 2;
}