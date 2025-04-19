package Week2;

public class CoinExample {
    public static void main(String[] args) {

        //Gives heads or tails

        double randomNumber = Math.random();
        if (randomNumber < 0.5) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
