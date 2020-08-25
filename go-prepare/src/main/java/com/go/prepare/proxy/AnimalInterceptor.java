package com.go.prepare.proxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/25 11:29
 */
@Component
public class AnimalInterceptor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(1);
    }
}
