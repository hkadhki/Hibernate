package com.example.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @EmbeddedId
    private Information information;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;




    @Override
    public String toString(){
        return "Person{"+
                "name=" + information.getName() +
                "surname=" + information.getSurname() +
                "age=" + information.getAge() +
                "phone_number=" + phoneNumber +
                "city_of_living" + cityOfLiving + "}";
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getCityOfLiving(){
        return cityOfLiving;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setCityOfLiving(String cityOfLiving){
        this.cityOfLiving = cityOfLiving;
    }

    public Information getInformation(){
        return information;
    }

    public void setInformation(Information information){
        this.information = information;
    }
}
