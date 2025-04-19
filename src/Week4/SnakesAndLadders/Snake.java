package Week4.SnakesAndLadders;

public class Snake {
    private final int from;
    private final int to;

    public Snake(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public boolean isSnake(int location) {
        if (location == from) {
                return true;
        }
        return false;
    }

    public int slideDownSnake() {
        return to;
    }

    public void movePlayerPiece(PlayerPiece player){
        player.setPosition(to);
        System.out.println(player.getColour() + " slide down a snake to " + to);
    }

}
