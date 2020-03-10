package bg.mobile.cars.service.impl;

import bg.mobile.cars.entities.Car;
import bg.mobile.cars.entities.CarRepository;
import bg.mobile.cars.model.CarModel;
import bg.mobile.cars.service.CarService;
import bg.mobile.cars.service.converters.CarConverter;
import bg.mobile.users.entities.User;
import bg.mobile.users.model.UserModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarConverter carConverter;

    public CarServiceImpl(CarRepository carRepository, CarConverter carConverter) {
        this.carRepository = carRepository;
        this.carConverter = carConverter;
    }

    @Override
    public CarModel createCar(CarModel model) {
        log.info("Creating user BEGIN: {} ", model);

        final Car car = carConverter.convertToEntity(model);
        final Car created = carRepository.save(car);


        log.info("Creating user END: {} ", model);
        return carConverter.convertToModel(created);
    }

    @Override
    public List<CarModel> getCars(UserModel user) {
        return null;
    }

    @Override
    public void deleteCar(CarModel model) {

    }

    @Override
    public CarModel updateCar(CarModel model) {
        return null;
    }

    @Override
    public CarModel getById(String id) {
        return null;
    }
}
