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
@ToString
@Component
public class Computer {

    public Computer(){

    }


@Value("10000")
    private long price;
    @Value("mi")
    private String brand;
    @Value("black")
    private String colour;

}
