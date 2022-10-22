package com.ncu.carrental.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ncu.carrental.dao.CarDao;
import com.ncu.carrental.models.Car;

@Repository
public class CarDaoImpl implements CarDao {

    JdbcTemplate jdbcTemplate;

    @Autowired
    CarDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Car> getAllCars() {
        return jdbcTemplate.query("select * from car", (rs, rowNum) -> new Car(rs.getInt("id"), rs.getString("model"),
                rs.getInt("number"), rs.getString("color"), rs.getBoolean("isAvailable"), rs.getString("image")));
    }

    @Override
    public int saveCar(Car car) {
        return jdbcTemplate.update("insert into car (id, model, number, color,isAvailable, image) values(?,?,?,?,?,?)",
                car.getId(), car.getModel(), car.getColor(), car.isAvailable(), car.getImage());
    }

    @Override
    public int updateCarById(Car car) {
        return jdbcTemplate.update("insert into car (id, model, number, color,isAvailable, image) values(?,?,?,?,?,?)",
                car.getId(), car.getModel(), car.getColor(), car.isAvailable(), car.getImage());
    }

    @Override
    public int deleteCarById(Integer id) {
        return jdbcTemplate.update("delete books where id = ?",
                id);
    }

}
