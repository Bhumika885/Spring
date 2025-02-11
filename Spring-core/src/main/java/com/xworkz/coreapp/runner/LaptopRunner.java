package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Laptop;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        Laptop laptop = applicationContext.getBean(Laptop.class);

        laptop.setPrice(98765);
        laptop.setBrand("mi");
        laptop.setColour("black");
        System.out.println(laptop);

    }
}
