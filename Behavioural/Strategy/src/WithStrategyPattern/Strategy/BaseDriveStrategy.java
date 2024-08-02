package WithStrategyPattern.Strategy;

public class BaseDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Base drive capability");
    }
}
