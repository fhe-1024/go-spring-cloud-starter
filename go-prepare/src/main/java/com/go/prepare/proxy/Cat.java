package com.go.prepare.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/25 11:13
 */
//@Component
public class Cat implements Animal {
    private Logger logger = LoggerFactory.getLogger(Cat.class);

    @Override
    public void sayHello() {
        logger.info("mmm");
    }
}
