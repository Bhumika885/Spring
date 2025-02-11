package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.College;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        College college = applicationContext.getBean(College.class);
        college.setLocation("bangalore");
        college.setName("josephs");
        System.out.println(college);
    }
}
