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
//@AllArgsConstructor
@Component
@ToString

public class User {

    public User(){


    }


    private Integer id;
    private String name;



@Autowired
public User(@Value("2") Integer id,@Value("Bhumika") String name){
this.id = id;
this.name  = name;



}
}
