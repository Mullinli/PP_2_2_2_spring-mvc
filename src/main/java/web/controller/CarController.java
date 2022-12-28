package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.LinkedList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        CarService carService = new CarService();
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Model1", 1, "black"));
        cars.add(new Car("Model2", 2, "blue"));
        cars.add(new Car("Model3", 3, "gray"));
        cars.add(new Car("Model4", 4, "red"));
        cars.add(new Car("Model5", 5, "yellow"));
        if (count > 5 || count < 0) {
            count = carService.countOfCars(cars);
        }
        model.addAttribute("cars", cars.subList(0, count));
        return "cars";
    }

}