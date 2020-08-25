package com.go.prepare;

import com.go.prepare.javabean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/24 20:53
 */
public class ApplicationDemo {

    @Autowired
    private User user;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationDemo.class);
        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);
        System.out.println(user);

    }

    @Bean
    public User user() {
        return new User();
    }

}
