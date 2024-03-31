package web.Servise;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServise {
    private List<Car> cars = Arrays.asList(
            new Car("Lada", "Vesta", 2018),
            new Car("Toyota", "Corolla", 2020),
            new Car("Hyundai", "Solaris", 2024),
            new Car("Chevrolet", "Niva", 2009),
            new Car("Renault", "Sandero", 2010)
    );

    public List<Car> find() {
        return cars;
    }

    public List<Car> findByCount(int count) {
        if (count >= 0 && count <= cars.size()) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }

}
