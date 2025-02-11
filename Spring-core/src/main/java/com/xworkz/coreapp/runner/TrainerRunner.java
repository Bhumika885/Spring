package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Trainer;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainerRunner {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Trainer trainer = applicationContext.getBean(Trainer.class);
        trainer.setId(1);
        trainer.setName("devendra");
        System.out.println(trainer);
    }
}
