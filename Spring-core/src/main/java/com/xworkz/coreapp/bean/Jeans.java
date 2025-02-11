package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
@ToString
public class Jeans {

    public Jeans (){

    }


    @Value("blue")
    private String colour;
    @Value("h&m")
    private String brand;
}
