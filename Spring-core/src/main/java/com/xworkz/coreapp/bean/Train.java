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
@ToString
@Component
//@AllArgsConstructor
public class Train {
    public Train (){


    }


    private String name;
    private Integer id;

    @Autowired
public Train(@Value("express") String name, @Value("1") Integer id){


    this.name = name;
    this.id = id;
}
}
