package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;
import java.util.List;
@Service
@Component
public interface CarService {

    List<Car> carsList(Integer count);
}
