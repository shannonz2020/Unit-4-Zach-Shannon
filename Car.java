/*
A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a
toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the
methods from the Car class and print out relevant information to prove the proper functionality of your Car class.
*/
public class Car{
  private String company = "";
  private String model = "";
  private double milesPerGallon;
  private double fuelRemaining; //in gallons
  private double tankSize; //in gallons
  private double totalMilesRemaining;

//CONSTRUCTORS
  public Car(String newCompany, String newModel, double newMilesPerGallon, double newFuelRemaining, double newTankSize){
    company = newCompany;
    model = newModel;
    milesPerGallon = newMilesPerGallon;
    fuelRemaining = newFuelRemaining;
    tankSize = newTankSize;
    totalMilesRemaining = (fuelRemaining * milesPerGallon);
  }

//METHODS
  //Make getter
  public String getMake(){
    return company;
  }
  //Model getter
  public String getModel(){
    return model;
  }
  //Tank getter
  public double checkTank(){
    return fuelRemaining;
  }
  //Tank setter
  public void fillTank(){
    fuelRemaining = tankSize;
    totalMilesRemaining = (tankSize * milesPerGallon);
  }
  //driveInMiles setter
  public void driveInMiles(double miles){
    double tempTotalMiles = totalMilesRemaining;
    totalMilesRemaining-= miles;
    fuelRemaining = (totalMilesRemaining/milesPerGallon);
    if (fuelRemaining < 0){
      fuelRemaining = 0;
      System.out.println("You ran out of gas " + tempTotalMiles + " miles into your drive!");
      System.out.println("------------------------------");
    }else{
      System.out.println("You drove " + miles + " miles!");
      System.out.println("------------------------------");
    }
  }
  public String toString(){
    String noGas = "I'm disappointed in you";
    String result = "";
    result+= "Company: " + company + "\n Model: " + model;
    result+= "\n MPG: " + milesPerGallon + "\n Fuel remaining: " + fuelRemaining;
    result+= "\n Tank Size: " + tankSize + "\n Total miles remaining: " + totalMilesRemaining;
    if(totalMilesRemaining >= 0){
      return result;
    }else{
      return noGas;
    }
  }
}
