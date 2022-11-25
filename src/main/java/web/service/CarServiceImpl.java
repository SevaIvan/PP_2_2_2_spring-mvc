package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
@Component
public class CarServiceImpl implements CarService {
    List<Car> carList; {
        carList = new ArrayList<>();
        carList.add(new Car("Mazda", "6", 2015));
        carList.add(new Car("Mazda", "CX-5", 2019));
        carList.add(new Car("Toyota", "Fortuner", 2019));
        carList.add(new Car("Renault", "Sandero", 2018));
        carList.add(new Car("Kia", "Rio", 2014));
    }
    @Override
    public List<Car> carsList(Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}