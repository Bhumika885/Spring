package com.xworkz.coreapp.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString


@Component
public class Chair {
    public Chair(){

        System.out.println("Car object is created");
    }



     @Value("zara")
    private String brand;
      @Value("red")
    private String colour;
       @Value("900")
    private double price;


}

