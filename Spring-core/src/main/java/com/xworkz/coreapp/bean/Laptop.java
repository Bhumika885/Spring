package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Laptop {

    public Laptop (){

        System.out.println("laptop object is created");
    }

@Value("mi")
    private String brand;
    @Value("100000")
    private double price;
    @Value("silver")
    private String colour;
}
