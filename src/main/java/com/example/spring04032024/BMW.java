package com.example.spring04032024;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString

public class BMW {
    private Integer horsePower;
    private IEngine engineType;
    private String name;

    public BMW(Integer hp, IEngine engine){
        this.horsePower = hp;
        this.engineType = engine;

    }
}
