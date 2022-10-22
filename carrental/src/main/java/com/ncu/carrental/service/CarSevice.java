package com.ncu.carrental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ncu.carrental.models.Car;

@Service
public interface CarSevice {
    List<Car> findAllCars();

    int saveCar(Car car);

    int updateCar(Car car);

    int deleteCar(Integer id);
}
