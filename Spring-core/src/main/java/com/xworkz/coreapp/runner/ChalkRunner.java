package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Chalk;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ChalkRunner {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Chalk chalk = applicationContext.getBean(Chalk.class);

        chalk.setBrand("cadbury");
        chalk.setFlavour("strawberry");
        chalk.setPrice(100);
        System.out.println(chalk);

    }
}
