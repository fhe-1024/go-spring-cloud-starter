package com.go.prepare;

import com.go.prepare.javabean.User;
import com.go.prepare.proxy.Animal;
import com.go.prepare.proxy.Cat;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;


/**
 * @Author: fhe
 * 努力吧
 * @Date: 2020/8/24 20:53
 */
@ComponentScan("com.go.prepare")
public class ApplicationDemo {

    @Autowired
    @Lazy
    private User user;

//    @Autowired
//    private Animal animal;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationDemo.class);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);

        ProxyFactoryBean proxyFactoryBean = applicationContext.getBean(ProxyFactoryBean.class);
        Animal animal = (Animal) proxyFactoryBean.getObject();
        animal.sayHello();
    }


    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public ProxyFactoryBean proxyFactoryBean() throws ClassNotFoundException {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setProxyInterfaces(new Class[]{Animal.class});
        proxyFactoryBean.setTargetClass(Cat.class);
        proxyFactoryBean.setTarget(new Cat());
        proxyFactoryBean.setInterceptorNames("animalInterceptor");
        return proxyFactoryBean;

    }

}
