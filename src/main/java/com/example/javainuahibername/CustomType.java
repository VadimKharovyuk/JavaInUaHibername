package com.example.javainuahibername;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Struct;

@Embeddable
@Struct(name = "custom_type")
@Getter
@Setter
public class CustomType {
    @Column(name = "num_value",length = (10))
    private int numValue ;

    @Column(name = "var_value")
    private String varValue;



}
