package com.example.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @EmbeddedId
    private Information information;
    @Column
    private String phone_number;
    @Column
    private String city_of_living;


    @Override
    public String toString(){
        return "Person{"+
                "name=" + information.getName() +
                "surname=" + information.getSurname() +
                "age=" + information.getAge() +
                "phone_number=" + phone_number +
                "city_of_living" + city_of_living + "}";
    }
}
