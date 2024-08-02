package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
   DriveStrategy driveObj;

   //constructor injection
   public Vehicle(DriveStrategy driveObj){
       this.driveObj = driveObj;
   }

   public void drive(){
       driveObj.drive();
   }
}
