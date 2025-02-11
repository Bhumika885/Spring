package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Event;
import com.xworkz.coreapp.bean.Tv;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Event event = applicationContext.getBean(Event.class);
        event.setId(1);
        event.setName("holiday");
        System.out.println(event);

    }
}
