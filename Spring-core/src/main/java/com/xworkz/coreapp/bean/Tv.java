package com.xworkz.coreapp.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@AllArgsConstructor
@ToString
@Component

public class Tv {
    public Tv(){

    }


    private String brand;
    private long price;
    private String colour;

    @Autowired
public Tv(@Value("lg") String brand , @Value("10000") long price, @Value("black") String colour){

this.brand = brand;
this.price = price;
this.colour = colour;
}
}
