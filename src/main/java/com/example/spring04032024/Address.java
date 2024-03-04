package com.example.spring04032024;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {
    private String city;

    public Address(){
        city = "Brampton";
    }
}
