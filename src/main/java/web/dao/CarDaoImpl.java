package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl {

    private static final ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(10L, "Mazda", 1));
        cars.add(new Car(20L, "BMW", 2));
        cars.add(new Car(30L, "Mitsubishi", 3));
        cars.add(new Car(40L, "Mercedes-Benz", 4));
        cars.add(new Car(50L, "Kia", 5));
    }

    public static List<Car> getAllCars() {
        List<Car> carList = cars;
        return carList;
    }

}