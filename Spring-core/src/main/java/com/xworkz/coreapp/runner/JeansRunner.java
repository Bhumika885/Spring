package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Jeans;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.Applet;

public class JeansRunner {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Jeans jeans = applicationContext.getBean(Jeans.class);
        jeans.setBrand("h&m");
        jeans.setColour("Blue");
        System.out.println(jeans);

    }

}
