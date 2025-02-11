package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Product;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Product product = applicationContext.getBean(Product.class);
        product.setBrand("pop");
        product.setPrice(9876);
        product.setId(2);
        System.out.println(product);

    }
}






