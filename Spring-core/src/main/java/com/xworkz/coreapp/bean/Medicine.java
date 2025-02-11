package com.xworkz.coreapp.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component

public class Medicine {

    public Medicine(){



    }

@Value("dolo")
    private String name;
    @Value("100")
    private long price;


}
