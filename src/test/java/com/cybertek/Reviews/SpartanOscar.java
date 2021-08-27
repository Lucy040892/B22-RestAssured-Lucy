package com.cybertek.Reviews;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@JsonIgnoreProperties(value = "id",allowSetters = true)
public class SpartanOscar {
    //getter setter
    //toString
    private int id;
    private String name;
    private String gender;
    private long phone;

    public SpartanOscar(int id, String name, String gender, long phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
}