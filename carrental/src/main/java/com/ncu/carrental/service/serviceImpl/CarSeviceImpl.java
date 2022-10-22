package com.ncu.carrental.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ncu.carrental.dao.daoImpl.CarDaoImpl;
import com.ncu.carrental.models.Car;
import com.ncu.carrental.service.CarSevice;

@Service
@Transactional
public class CarSeviceImpl implements CarSevice {

    @Autowired
    CarDaoImpl carDaoImpl;

    @Override
    public List<Car> findAllCars() {
        return carDaoImpl.getAllCars();
    }

    @Override
    public int saveCar(Car car) {
        return carDaoImpl.saveCar(car);
    }

    @Override
    public int updateCar(Car car) {
        return carDaoImpl.updateCarById(car);
    }

    @Override
    public int deleteCar(Integer id) {
        return carDaoImpl.deleteCarById(id);
    }

}
