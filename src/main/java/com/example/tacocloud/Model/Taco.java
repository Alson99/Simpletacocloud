package com.example.tacocloud.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.BatchSize;
import org.springframework.boot.convert.DataSizeUnit;


import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private Date createdAt;

    @ManyToMany(targetEntity = Ingredient.class)
    private List<String> ingredients;

    @PrePersist
    void  createdAt(){
        this.createdAt = new Date();
    }
}
