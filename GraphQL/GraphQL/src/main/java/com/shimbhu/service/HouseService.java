package com.shimbhu.service;

import com.shimbhu.model.House;

import java.util.List;

public interface HouseService {

    public House addHouse(House house, Integer userId);

    public House getHouse(Integer houseId);

    public List<House> getAllHouse(Integer userId);

}
