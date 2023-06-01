package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carAction (ModelMap modelMap, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("KAMAZ","КамАЗ-740", 1969));
        cars.add(new Car("Hyundai Solaris","G4LC", 2020));
        cars.add(new Car("Mercedes-Benz CLA AMG C118","M 282 DE 14 AL", 2019));
        cars.add(new Car("BMW 8 G14","B58B30M0", 2018));
        cars.add(new Car("Bugatti Chiron","quad-Turbocompresor W16", 2016));

        CarService cs = new CarServiceImpl();

        modelMap.addAttribute("car", cs.count(cars, count));
        return "cars";

    }

}
