public class DieTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the die simulator");

        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println("Die 1 = " + die1);
        System.out.println("Die 2 = " + die2);

        die1.roll();
        die2.roll();

        die1.setFace(4);
        die1.getFace();
    }
}
