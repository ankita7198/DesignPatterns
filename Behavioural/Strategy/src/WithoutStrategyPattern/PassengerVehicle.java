package WithoutStrategyPattern;

public class PassengerVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive with special capability");
    }
}
