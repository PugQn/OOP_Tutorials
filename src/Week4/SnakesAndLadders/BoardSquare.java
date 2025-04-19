package Week4.SnakesAndLadders;

public class BoardSquare {
    private Snake snake;
    private Ladder ladder;

    public BoardSquare() {
        snake = null;
        ladder = null;
    }

    public void setSnake(int to, int from) {
        snake = new Snake(to, from);
    }
    public void setLadder(int to, int from) {
        ladder = new Ladder(to, from);
    }


    public void movePlayerPiece(PlayerPiece player){
        if (snake != null) {
            snake.movePlayerPiece(player);
        }
        if (ladder != null) {
            ladder.movePlayerPiece(player);
        }
    }
}
