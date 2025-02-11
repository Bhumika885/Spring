package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CameraRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);



    }
}
