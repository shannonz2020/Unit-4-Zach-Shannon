public class CarClient{
  public static void main(String[] args){
    //(company, model, milesPerGallon, fuelRemaining, tankSize)
    Car car1 = new Car("Toyota", "Corolla", 32, 13.2, 13.2);
    Car car2 = new Car("Ford", "F150", 30, 27, 27);
    Car car3 = new Car("Toyota", "Supra", 25, 0, 12.2);
    car1.driveInMiles(100);
    //201.5999999999999
    car2.getMake();
    car1.checkTank();
    car1.toString();
    car3.driveInMiles(130);
    car3.fillTank();
    //car3.driveInMiles(130);
  }
}
