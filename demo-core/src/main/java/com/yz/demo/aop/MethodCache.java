package com.yz.demo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 方法级缓存
 * 标注了这个注解的方法返回值将会被缓存
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodCache {
    /**
     * 缓存过期时间，单位是秒
     */
    int expire();
}
