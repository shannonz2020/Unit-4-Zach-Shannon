public class CarClient{
  public static void main(String[] args){
    //(company, model, milesPerGallon, fuelRemaining, tankSize)
    Car car1 = new Car("Toyota", "Corolla", 32, 13.2, 13.2);
    Car car2 = new Car("Ford", "F150", 30, 27, 27);
    Car car3 = new Car("Toyota", "Supra", 25, 0, 12.2);
    car1.driveInMiles(201.5999999999999);
    System.out.println(car2.getMake());
    System.out.println("------------------------------");
    System.out.println(car2.getModel());
    System.out.println("------------------------------");
    car1.checkTank();
    System.out.println(car1.toString());
    System.out.println("------------------------------");
    car3.driveInMiles(130);
    System.out.println("There are " + car3.checkTank() + " gallons of gas remaining.");
    car3.fillTank();
    System.out.println("There are " + car3.checkTank() + " gallons of gas remaining.");
  }
}
