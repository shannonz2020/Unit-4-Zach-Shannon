public class DieTester {
    public static void main(String[] args) {
        int j = 1;
        System.out.println("Welcome to the die simulator!");

        Die die1 = new Die();
        Die die2 = new Die();
        die1.roll();
        die2.roll();

        while(die1.getFace() != die2.getFace()){
            die1.roll();
            die2.roll();

            System.out.println("The value of die 1 is: " + die1.getFace() + ".");
            System.out.println("The value of die 2 is: " + die2.getFace() + ".");
            int sum = die1.getFace() + die2.getFace();
            System.out.println("The sum is : " + sum + ".");
            System.out.println("----------------------------------------");
            j++;
        }
        System.out.println("It took " + j + " tries to roll doubles.");
        System.out.println("----------------------------------------");
        int q = 0;
        for(int i = 0; i <= 100; i++){
            die1.roll();
            die2.roll();
            if(die1.getFace() == die2.getFace()){
                q++;
            }
        }
        System.out.println("In 100 tries doubles were rolled " + q + " times.");
    }
    }
