package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.University;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniversityRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        University university = applicationContext.getBean(University.class);

        university.setId(1);
        university.setName("rvce");

        System.out.println(university);
    }
}
