package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Restaurant;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestaurantRunner {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Restaurant restaurant = applicationContext.getBean(Restaurant.class);



        restaurant.setId(1);
        restaurant.setName("taj");
        restaurant.setType("non veg");
        restaurant.setLocation("bangalore");
        System.out.println(restaurant);
    }
}
