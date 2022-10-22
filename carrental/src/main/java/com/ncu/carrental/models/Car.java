package com.ncu.carrental.models;

public class Car {

    private Integer id;
    private String model;
    private Integer number;
    private String color;
    private boolean isAvailable;
    private String image;

    public Car() {
    }

    public Car(Integer id, String model, Integer number, String color, boolean isAvailable, String image) {
        this.id = id;
        this.model = model;
        this.number = number;
        this.color = color;
        this.isAvailable = isAvailable;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", model=" + model + ", number=" + number + ", color=" + color + ", isAvailable="
                + isAvailable + ", image=" + image + "]";
    }
}
