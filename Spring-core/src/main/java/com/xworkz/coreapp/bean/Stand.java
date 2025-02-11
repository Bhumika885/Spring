package com.xworkz.coreapp.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Stand {

public Stand () {
    System.out.println("Stand object is created");
}
    private Integer id;
    private String brandName;
    private double price;

@Autowired
   public Stand (@Value("1") Integer id, @Value("ikea") String brandName, @Value("1000") double price){

   this.id = id;
   this.brandName = brandName;
   this.price = price;
   }
}
