import WithStrategyPattern.PassengerVehicle;
import WithStrategyPattern.Vehicle;
import WithoutStrategyPattern.OffRoadVehicle;
import WithoutStrategyPattern.SportsVehicle;

public class Main {
    public static void main(String[] args){

        //---------------------------WITHOUT STRATEGY PATTERN------------------------------------------
        //con - Let say you have 100 subclasses extending Vehicle class and 50
        // have special drive functionality and 50 have base functionality
        //So for 50 with special functionality you'll have to override drive() function 50
        //times and write the code 50 times.This leads to DUPLICACY
        //plus if more classes come in the future, you'll again have to override and
        // write again and again hence it is also not good in terms of SCALABILITY
        OffRoadVehicle offVehicle = new OffRoadVehicle();
        offVehicle.drive();
        SportsVehicle spVehicle = new SportsVehicle();
        spVehicle.drive();

        //----------------------------WITH STRATEGY PATTERN--------------------------------------------
        Vehicle vehicle = new WithStrategyPattern.SportsVehicle();
        vehicle.drive();
        Vehicle nVehicle = new PassengerVehicle();
        nVehicle.drive();
        //not possible ---- nVehicle.passengerSpecificMethod();
    }
}
