package bg.mobile.cars.service.converters;

import bg.mobile.cars.entities.Car;
import bg.mobile.cars.model.CarModel;
import bg.mobile.users.service.converters.UserConverter;
import org.springframework.stereotype.Component;

@Component
public class CarConverter {

    private final UserConverter userConverter;

    public CarConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public CarModel convertToModel(final Car car){
        if(car == null){
            return null;
        }

        final CarModel model = new CarModel();
        model.setId(car.getId());
        model.setMake(car.getMake());
        model.setModel(car.getModel());
        model.setYear(car.getYear());
        model.setEngineType(car.getEngineType());
        model.setGearBox(car.getGearBox());
        model.setCondition(car.getCondition());
        model.setHorsePower(car.getHorsePower());
        model.setColor(car.getColor());
        model.setPrice(car.getPrice());
        model.setCity(car.getCity());
        model.setMileage(car.getMileage());
        model.setUser(car.getUser());
        model.setExtras(car.getExtras());

        return model;
    }

    public Car convertToEntity(final CarModel model){
        if(model == null){
            return null;
        }

        final Car car = new Car();


        car.setId(model.getId());
        car.setMake(model.getMake());
        car.setModel(model.getModel());
        car.setYear(model.getYear());
        car.setEngineType(model.getEngineType());
        car.setGearBox(model.getGearBox());
        car.setCondition(model.getCondition());
        car.setHorsePower(model.getHorsePower());
        car.setColor(model.getColor());
        car.setPrice(model.getPrice());
        car.setCity(model.getCity());
        car.setMileage(model.getMileage());
        car.setUser(model.getUser());
        car.setExtras(model.getExtras());

        return car;
    }
}
