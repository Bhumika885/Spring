package com.xworkz.coreapp.bean;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
//@AllArgsConstructor
@Configuration
@ToString
public class University {
    public University(){

    }


    private Integer id;

    private String name;


    @Autowired
public University(@Value("1") Integer id,@Value("rvce") String name){

this.id = id;
this.name = name;

}
}
