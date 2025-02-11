package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Purse;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PurseRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Purse purse = applicationContext.getBean(Purse.class);


        purse.setId(1);
        purse.setBrand("zara");
        System.out.println(purse);
    }
}

