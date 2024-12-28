package com.shimbhu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class UserInput {

    private String userName;
    private String city;
    private String phone;

    private List<House> houses = new ArrayList<>();

    public UserInput(String userName, String city, String phone) {
        this.userName = userName;
        this.city = city;
        this.phone = phone;
    }

    public UserInput() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}
