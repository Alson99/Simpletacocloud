package com.example.tacocloud.Model;


import lombok.Data;

@Data
public class Order {

    private String name;
    private String Street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

}
