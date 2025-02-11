package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Stand;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
           Stand stand = applicationContext.getBean(Stand.class);
           stand.setId(1);
           stand.setBrandName("majama");
           stand.setPrice(100000);
        System.out.println(stand);

    }

}
