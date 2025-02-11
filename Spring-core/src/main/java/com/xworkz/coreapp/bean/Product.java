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
public class Product {

    public Product () {

    }


    @Value("1")
    private int id;
    @Value("hp")
    private String brand;
    @Value("10000")
    private double price;


}
