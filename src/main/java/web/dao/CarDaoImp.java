package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car(1989, "2106", "Vitaly"));
        cars.add(new Car (1976, "2101", "Igor"));
        cars.add(new Car(2007, "Priora", "Alexey"));
        cars.add(new Car(2018, "Vesta", "Inna"));
        cars.add(new Car(1998   , "Niva", "Anton"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
