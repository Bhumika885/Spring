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
public class Purse {

    public Purse(){

    }

    private Integer id;
    private String brand;



@Autowired
public Purse (@Value("2") Integer id , @Value("holiday") String name){


    this.id = id;
    this.brand = brand;
}
}











