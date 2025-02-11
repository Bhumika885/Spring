package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Train;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Train  train = applicationContext.getBean(Train.class);
        train.setId(1);
        train.setName("express");
        System.out.println(train);



    }
}
