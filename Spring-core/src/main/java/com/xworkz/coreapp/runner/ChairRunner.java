package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Chair;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChairRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Chair chair = applicationContext.getBean(Chair.class);
        chair.setBrand("bmw");
        chair.setColour("blue");
        chair.setPrice(10000);
        System.out.println(chair);
    }

}
