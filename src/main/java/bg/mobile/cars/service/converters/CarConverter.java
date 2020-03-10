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




        return model;
    }
}
