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

public class College {

    public College(){

    }
@Value("rvce")
    private String name;
    @Value("vijaynagar")
    private String location;

}
