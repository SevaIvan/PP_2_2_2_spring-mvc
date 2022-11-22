package web.service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Mazda", "6", 2015));
            carList.add(new Car("Mazda", "CX-5", 2019));
            carList.add(new Car("Toyota", "Fortuner", 2019));
            carList.add(new Car("Renault", "Sandero", 2018));
            carList.add(new Car("Kia", "Rio", 2014));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}