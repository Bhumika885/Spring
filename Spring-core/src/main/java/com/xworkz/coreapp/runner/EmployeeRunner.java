package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Employee;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeRunner {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Employee employee = applicationContext.getBean(Employee.class);

        employee.setId(1);
        employee.setName("bhumika");
        System.out.println(employee);
    }
}
