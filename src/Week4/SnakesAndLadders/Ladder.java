package Week4.SnakesAndLadders;

public class Ladder {
    private final int from;
    private final int to;

    public Ladder(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public boolean isLadder(int location) {
        if (location == from) {
            return true;
        }
        return false;
    }

    public int climbUpLadder() {
        return to;
    }

    public void movePlayerPiece(PlayerPiece player){
        player.setPosition(to);
        System.out.println(player.getColour() + " climbed a ladder to " + to);
    }
}
