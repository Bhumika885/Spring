package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@Component
@ToString
public class Camera {


    public Camera(){

    }

@Value("hp")
    private String brand;
    @Value("1")
    private Integer id;


}
