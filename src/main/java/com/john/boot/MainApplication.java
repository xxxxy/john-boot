package com.john.boot;

import com.john.boot.bean.Book;
import com.john.boot.bean.User;
import com.john.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

//@SpringBootApplication(scanBasePackages = "com.john")
//@ComponentScan(basePackages = "")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class)})
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //查看容器中已定义的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        //
        /*Object bean = run.getBean("xiaoming");
        Object bean2 = run.getBean("xiaoming");
        System.out.println("组件：" + bean == bean2);*/

        /*
        com.john.boot.config.MyConfig$$EnhancerBySpringCGLIB$$2ca30928@127d7908
        MyConfig bean1 = run.getBean(MyConfig.class);
        System.out.println("bean1 class:" + bean1);

        User xiaoming = bean1.xiaoming();
        User xiaoming1 = bean1.xiaoming();
        System.out.println(xiaoming == xiaoming1);


        User xiaoming2 = bean1.xiaoming();
        Book java = bean1.java();
        System.out.println(xiaoming2.getBook() == java);*/

        /*System.out.println("-----------------------------------------");
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        DBHelper bean3 = run.getBean(DBHelper.class);
        System.out.println(bean3);*/

        /*boolean book = run.containsBean("book1");
        System.out.println("book 组件是否存在:" + book);

        boolean b = run.containsBean("xiaoming");
        System.out.println("xiaoming 组件是否存在:" + b);*/

       /* boolean ur = run.containsBean("ur");
        System.out.println(ur);
        boolean bk = run.containsBean("bk");
        System.out.println(bk);*/

    }
}
