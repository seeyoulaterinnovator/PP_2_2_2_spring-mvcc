package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    List<Car> cars = new ArrayList<>();
    public CarServiceImp() {
        cars.add(new Car("Dodge", "Challenger", 1998));
        cars.add(new Car("Ford", "Mustang", 1967));
        cars.add(new Car("Nissan", "GT-R", 2008));
        cars.add(new Car("Ford", "Taurus", 2016));
        cars.add(new Car("Chevrolet", "Camaro", 2008));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
