package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Phone;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class PhoneRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Phone phone = applicationContext.getBean(Phone.class);

        phone.setId(1);
        phone.setColour("black");
        phone.setBrand("samsung");
        System.out.println(phone);
    }
}
