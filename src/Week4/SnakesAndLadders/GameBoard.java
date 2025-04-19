package Week4.SnakesAndLadders;


import static Week4.SnakesAndLadders.DieRoll.getRoll;

public class GameBoard {
    private BoardSquare[] board = new BoardSquare[100];

    public GameBoard() {
        int[] snakeFroms = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
        int[] snakeTos = {6, 26, 11, 53, 19, 60, 24, 73, 75, 78};
        int[] ladderFroms = {1, 4, 9, 21, 28, 36, 51, 71, 80};
        int[] ladderTos= {38, 4, 9, 21, 28, 36, 51, 71, 80};

        for(int i = 0; i < 100; i++) {
            board[i] = new BoardSquare();

            for(int j = 0; j < snakeFroms.length; j++) {
                if (i == snakeFroms[j]) {
                    board[i].setSnake(snakeTos[j], snakeFroms[j]);
                    break;
                }
            }
            for(int j = 0; j < ladderFroms.length; j++) {
                if (i == ladderFroms[j]) {
                    board[i].setLadder(ladderTos[j], ladderFroms[j]);
                    break;
                }
            }
        }
    }

    public boolean getStartSquare(int roll) {
        if (roll != 6) {
            return false;
        }
        return true;
    }

    public boolean movePlayer(PlayerPiece player) {
        int roll;

        // Player is waiting to roll a 6 to start
        if (!player.isStarted()) {
            roll = getRoll();
            System.out.println(player.getColour() + " has rolled a " + roll);

            if (!getStartSquare(roll)) {
                System.out.println(player.getColour() + " cannot start yet");
                return false;
            }
            else {
                System.out.println(player.getColour() + " can start now");
                player.started();
            }
        }

        roll = getRoll();
        System.out.println(player.getColour() + " has rolled a " + roll);



        //Move board square
        player.setPosition(player.getPosition() + roll);

        //Check if they win
        if (player.getPosition() >= 100) {
            System.out.println(player.getColour() + " wins!");
            return true; }

        System.out.println(player.getColour() + " has moved to square " + player.getPosition());

        //Check for snakes or ladders
        board[player.getPosition()].movePlayerPiece(player);

        return false;
    }
}
