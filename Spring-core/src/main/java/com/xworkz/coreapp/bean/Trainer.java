package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ToString
//@AllArgsConstructor
public class Trainer {

    public Trainer(){

    }

    private Integer id;
    private String name;

    @Autowired
public Trainer(@Value("1") Integer id,@Value("devendra") String name){

this.id = id;
this.name = name;
}
}
