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
@AllArgsConstructor
@Component
public class Earphone {

    public Earphone(){

    }


@Value("white")
    private String colour;
@Value("samsung")
    private String brand;
}
