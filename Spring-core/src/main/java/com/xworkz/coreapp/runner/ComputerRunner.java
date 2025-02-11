package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Computer;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


       Computer computer = applicationContext.getBean(Computer.class);

       computer.setPrice(10000);
       computer.setBrand("hp");
       computer.setColour("silver");

        System.out.println(computer);
    }
}
