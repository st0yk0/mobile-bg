package bg.mobile.cars.service;

import bg.mobile.cars.model.CarModel;
import bg.mobile.users.model.UserModel;

import java.util.List;

public interface CarService {

    CarModel createCar(CarModel model);

    List<CarModel> getCars(UserModel user);

    void deleteCar(CarModel model);

    CarModel updateCar(CarModel model);

    CarModel getById(String id);
}
