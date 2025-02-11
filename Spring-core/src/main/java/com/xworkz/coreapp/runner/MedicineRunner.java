package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Medicine;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MedicineRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Medicine medicine = applicationContext.getBean(Medicine.class);


        medicine.setName("dolo");
        medicine.setPrice(100);
        System.out.println(medicine);
    }
}
