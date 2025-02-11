package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.User;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        User user = applicationContext.getBean(User.class);


        user.setId(1);
        user.setName("Bhumika");
        System.out.println(user);
    }
}
