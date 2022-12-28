package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService implements CarServiceImp {

    @Override
    public int countOfCars(List<Car> cars) {
        return cars.size();
    }
}