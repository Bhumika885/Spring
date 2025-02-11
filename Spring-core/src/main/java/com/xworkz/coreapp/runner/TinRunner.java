package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Tin;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TinRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Tin tin = applicationContext.getBean(Tin.class);
//        tin.setId(1);
//        tin.setBrand("majama");
        System.out.println(tin);
    }
}
