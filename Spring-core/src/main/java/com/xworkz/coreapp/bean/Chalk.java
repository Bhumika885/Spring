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


public class Chalk {

    public Chalk() {

        System.out.println("chocolate object is created");
    }

@Value("zara")
    private String brand;
    @Value("10000")
    private long price;
    @Value("orange")
    private String flavour;
}
