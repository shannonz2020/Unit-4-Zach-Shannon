public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("shannonz", "password", 1111, 1);
        //BankAccount yourAccount = new BankAccount();

        //myAccount.deposit(100);
        //myAccount.withdraw(30);
        //myAccount.transfer(20, yourAccount);
        myAccount.getAccountNumber();
        myAccount.toString();
    }
}
