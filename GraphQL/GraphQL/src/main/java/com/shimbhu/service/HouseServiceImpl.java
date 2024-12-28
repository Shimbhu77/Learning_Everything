package com.shimbhu.service;

import com.shimbhu.model.House;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Override
    public House addHouse(House house, Integer userId) {
        return null;
    }

    @Override
    public House getHouse(Integer houseId) {
        return null;
    }

    @Override
    public List<House> getAllHouse(Integer userId) {
        return List.of();
    }
}
