package com.example.javainuahibername;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "custom_table")
@Getter
@Setter
public class CustomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",length = (30))
    private String name ;


    @Embedded
    @Column(name = "my_type")
    private CustomType customType;
}
