package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@AllArgsConstructor
public class Employee {


    public Employee(){


    }
@Value("1")
    private Integer id;
    @Value("Bhumika")
    private String name;

}
