public class CoinTester{
  public static void main(String[] args){
    //Calling coin method

    Coin coin1 = new Coin();

    final int NUM_OF_FLIPS = 10;
    final int HEADS = 0;
    int numOfHeads = 0;

    //System.out.println("Coin 1 = " + coin1.toString());
    for(int i = 0; i < NUM_OF_FLIPS; i++){
      coin1 = new Coin();
      if(coin1.isHeads()){
        numOfHeads++;
      }
      System.out.println(coin1.toString());
    }
    //System.out.println(numOfHeads);
    System.out.println("Percentage of heads: " + 100 * (numOfHeads/(double) NUM_OF_FLIPS) + "%");
  }
}
