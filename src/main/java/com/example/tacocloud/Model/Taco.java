package com.example.tacocloud.Model;

import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;


import java.util.List;

@Data
public class Taco {

    private String name;
    private List<String> ingredients;
}
