package Week4.SnakesAndLadders;

/*
* This class rolls the die for the player.*/

public class DieRoll {
    public static int getRoll(){
        double randomNumber = Math.random();
        randomNumber *= 6;
        randomNumber ++;
        return (int) randomNumber;
    }
}
