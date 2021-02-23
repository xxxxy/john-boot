package com.john.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.john.boot.bean.Book;
import com.john.boot.bean.Car;
import com.john.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * @Configuration 告诉spring boot这是一个配置类
 * @Bean 注册一个bean到容器。默认以方法作为组件的id,返回类型就是组件的类型,返回值就是组件的实例。
 *
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
@ImportResource("classpath:beans.xml")
//@ConditionalOnBean(name = "book")
@ConditionalOnMissingBean(name = "book")
@EnableConfigurationProperties(Car.class)
public class MyConfig {
    @Bean
    public User xiaoming() {
        User xiaoming = new User("小明", 10);
        xiaoming.setBook(java());
        return xiaoming;
    }

    @Bean("book1")
    public Book java() {
        return new Book("123", "java精通", 33.00);
    }
}
