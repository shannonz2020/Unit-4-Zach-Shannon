public class BankAccountClient {
    public static void main(String[] args) {


        /* *****Mr. George!!!!*****
        Ian B has our full project, this is what I made before we collaborated
         */
        BankAccount myAccount = new BankAccount("shannonz", "password", 1111, 1);
        //BankAccount yourAccount = new BankAccount();

        //myAccount.deposit(100);
        //myAccount.withdraw(30);
        myAccount.getAccountType();
        System.out.println(myAccount.toString());
    }
}
