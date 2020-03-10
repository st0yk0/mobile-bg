package bg.mobile.cars.model;

import bg.mobile.cars.entities.Condition;
import bg.mobile.cars.entities.EngineType;
import bg.mobile.cars.entities.GearBox;
import bg.mobile.extras.entities.Extra;
import bg.mobile.users.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarModel {

    private String id;
    private String make;
    private String model;
    private int year;
    private EngineType engineType;
    private GearBox gearBox;
    private Condition condition;
    private int horsePower;
    private String color;
    private BigDecimal price;
    private String city;
    private int mileage;
    private User user;
    private Set<Extra> extras;
}
