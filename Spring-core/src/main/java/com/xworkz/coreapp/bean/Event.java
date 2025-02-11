package com.xworkz.coreapp.bean;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Event {


    public Event() {

    }

    private Integer id;
    private String name;


  @Autowired
public Event (@Value("2") Integer id , @Value("holiday") String name){


  this.id = id;
  this.name = name;
  }
}


