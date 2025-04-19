package Week4.SnakesAndLadders;

import static Week4.SnakesAndLadders.DieRoll.getRoll;

public class Play {
    public static void main(String[] args) {

        //Set up gameboard
        GameBoard gameBoard = new GameBoard();

        //Setup players
        //Built for 2 players. For more players, add new player lines to array
        PlayerPiece[] players = {
                new PlayerPiece("red"),
                new PlayerPiece("blue")
        };

        boolean gameOver = false;

        while (!gameOver) {
            for (PlayerPiece playerPiece : players) {
                gameOver = gameBoard.movePlayer(playerPiece);

                System.out.println();
            }
        }
    }
}
