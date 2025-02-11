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
//@AllArgsConstructor
@Component
@ToString
public class Tin {

    public Tin(){


    }

    private Integer id;
    private String brand;

    @Autowired
public Tin (@Value("2") Integer id,@Value("savana") String brand){

this.id = id;
this.brand= brand;
}
}
