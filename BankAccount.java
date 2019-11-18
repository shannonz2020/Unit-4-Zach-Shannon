public class BankAccount{

  //Initial variables
  private String username;
  private String password;
  private int pin;
  private double currentBalance;//0
  private int minimumBalance;//random
  private double interestRate;//random
  private String accountNumber;//random
  private int accountType;//[1] = checking, [2] = savings

  private final double MIN_CHECKING_RATE = 0.01;
  private final double MAX_CHECKING_RATE = 0.25;
  private final double MIN_SAVINGS_RATE = 0.26;
  private final double MAX_SAVINGS_RATE = 1.00;

  public BankAccount(String aUsername, String aPassword, int aPin, int accountType){
    username = aUsername;
    password = aPassword;
    pin = aPin;
    currentBalance = 0;
    minimumBalance = (int) (Math.random() * (0 - 20) + 30);
    accountNumber = "" + (int) (Math.random() * (1000000 - 8999999) + 1000000) *-1;
    //Checking
    if(accountType == 1){
      interestRate = (int) (Math.random() * ((MAX_CHECKING_RATE - MIN_CHECKING_RATE) + 1)) + MIN_CHECKING_RATE;
    }
    //Savings
    if(accountType == 2){
      interestRate = (int) (Math.random() * ((MAX_SAVINGS_RATE - MIN_SAVINGS_RATE) + 1)) + MIN_SAVINGS_RATE;
    }
  }

    public String getCurrentBalance() {
        return "Your current balance is $" + currentBalance;
    }

    public String getAccountType() {
        if(accountType == 1){
            return "You have a checking account";
        }else{
            return "You have a savings account";
        }
    }
    public void deposit(int amount, int pin){
      if(this.pin == pin) {
          currentBalance += amount;
      }else{
          System.out.println("You entered the wrong pin");
      }
    }
    public void withdraw(int amount){
        if(this.pin == pin) {
            currentBalance -= amount;
        }else{
            System.out.println("You entered the wrong pin");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String toString() {
      String result = "Username: " + username;
      result += "\nMinimum balance: " + minimumBalance;
      result += "\nCurrent balance: " + currentBalance;
      result += "\nAccount number: " + accountNumber;
     if(accountType == 1){
         result += "\nAccount type: " + "Checking";
        }else{
         result += "\nAccount type: " + "Savings";
        }
      return result;
    }
}
