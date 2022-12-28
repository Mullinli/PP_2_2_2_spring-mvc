package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiceImp {
    public int countOfCars(List<Car> cars);
}