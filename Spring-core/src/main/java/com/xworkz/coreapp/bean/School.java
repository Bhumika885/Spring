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
public class School {
    public School(){

    }


    private String location;
    private String name;


@Autowired
    public School(@Value("hampinagar") String location,@Value("camlin") String name){
    this.location = location;
    this.name = name;


    }
}
