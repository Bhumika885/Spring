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
@AllArgsConstructor
@ToString
@Component

public class Restaurant {
    public Restaurant(){


    }
private int id;
    private String name;
    private String location;
    private String type;



    @Autowired
    public Restaurant (@Value("1") Integer id,@Value("taj hotel") String name, @Value(" mg road") String location, @Value("nonveg") String type){

    this.id = id;
    this.name = name;
    this.location = location;
    this.type = type;

    }
}
