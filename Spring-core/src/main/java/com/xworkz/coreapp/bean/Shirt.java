package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
//@AllArgsConstructor
public class Shirt {

    public Shirt(){

    }

    private String brand;
    private long price;

@Autowired
    public Shirt(@Value("h&m") String brand, @Value("10000") long price){
    this.brand = brand;
    this.price = price;


    }
}
