package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new SpecialDriveStrategy());
    }

    public void passengerSpecificMethod(){
        System.out.println("Hello passenger");
    }
}
