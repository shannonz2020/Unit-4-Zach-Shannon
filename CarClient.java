public class CarClient{
  public static void main(String[] args){
    Car car1 = new Car("Toyota","Corolla", 32, 13.2, 13.2);

    car1.driveInMiles(100);
    //201.5999999999999
    //car1.fillTank();
    //car1.checkTank();
    //car1.toString();
    car1.driveInMiles(700);

    System.out.println(car1);

  }
}
