package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.School;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        School school = applicationContext.getBean(School.class);

        school.setLocation("bangalore");
        school.setName("camlin");
        System.out.println(school);
    }
}
