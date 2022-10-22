package com.ncu.carrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.carrental.models.Car;
import com.ncu.carrental.service.serviceImpl.CarSeviceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api")
public class CarController {

    @Autowired
    CarSeviceImpl carSeviceImpl;

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carSeviceImpl.findAllCars();
    }

    @PostMapping("/car")
    public int saveCar(@RequestBody Car car) {
        return carSeviceImpl.saveCar(car);
    }

    @PutMapping("/car")
    public int updateCar(@RequestBody Car car) {
        return carSeviceImpl.updateCar(car);
    }

    @DeleteMapping("/car/{carId}")
    public int deleteCar(@PathVariable Integer carId) {
        return carSeviceImpl.deleteCar(carId);
    }
}
