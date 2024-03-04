package com.example.spring04032024;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@ToString
public class Student {
    private String name;
    private int age;
    @Autowired
    private Address address;




}
