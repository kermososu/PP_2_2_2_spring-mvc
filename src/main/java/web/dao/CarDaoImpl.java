package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("KAMAZ", "КамАЗ-740", 1969));
        cars.add(new Car("Hyundai Solaris", "G4LC", 2020));
        cars.add(new Car("Mercedes-Benz CLA AMG C118", "M 282 DE 14 AL", 2019));
        cars.add(new Car("BMW 8 G14", "B58B30M0", 2018));
        cars.add(new Car("Bugatti Chiron", "quad-Turbocompresor W16", 2016));
    }

    @Override
    public List<Car> count(int count) {
        return cars.stream().limit(count).toList();
    }
}
