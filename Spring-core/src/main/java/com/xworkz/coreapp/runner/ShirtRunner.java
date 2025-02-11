package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Shirt;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShirtRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Shirt shirt  = applicationContext.getBean(Shirt.class);
        shirt.setBrand("zara");
        shirt.setPrice(100);
        System.out.println(shirt);
    }
}
