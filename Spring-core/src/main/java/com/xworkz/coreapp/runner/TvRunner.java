package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Tv;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TvRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Tv tv =  applicationContext.getBean(Tv.class);

        tv.setBrand("lg");
        tv.setPrice(10000);
        tv.setColour("black");
        System.out.println(tv);
    }
}
