package com.ncu.carrental.dao;

import java.util.List;

import com.ncu.carrental.models.Car;

public interface CarDao {
    List<Car> getAllCars();

    int saveCar(Car car);

    int updateCarById(Car car);

    int deleteCarById(Integer id);
}
