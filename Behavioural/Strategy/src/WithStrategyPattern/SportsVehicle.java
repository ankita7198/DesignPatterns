package WithStrategyPattern;

import WithStrategyPattern.Strategy.BaseDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new BaseDriveStrategy());
    }
}
