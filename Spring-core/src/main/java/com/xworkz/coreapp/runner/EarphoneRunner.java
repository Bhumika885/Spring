package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Earphone;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EarphoneRunner {


    public static void main(String[] args) {



        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        Earphone earphone = applicationContext.getBean(Earphone.class);


        earphone.setBrand("mi");
        earphone.setColour("white");
        System.out.println(earphone);

    }
}
