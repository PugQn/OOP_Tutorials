package Week2;

public class GameStarter {
    public static void main(String[] args) {
        int dieValue = 0;

        do {
            double randomNumber = Math.random();
            randomNumber *= 6;
            randomNumber++;

            dieValue = (int) randomNumber;

            System.out.println("You have rolled a " + dieValue);
        }
        while (dieValue != 6);

        System.out.println("The game has ended!");
    }
}
