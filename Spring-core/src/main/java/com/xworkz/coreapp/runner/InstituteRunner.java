package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Institute;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstituteRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        Institute institute = applicationContext.getBean(Institute.class);

        institute.setId(1);
        institute.setName("xworkz");
        System.out.println(institute);
    }
}
