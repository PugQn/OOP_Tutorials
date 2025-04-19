package Week4.SnakesAndLadders;

public class PlayerPiece {
    String colour;
    int position;
    boolean started;

    public PlayerPiece(String colour) {
        this.colour = colour;
        this.position = 0;
    }
    public String getColour() {
        return colour;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isStarted() {
        return started;
    }
    public void started() {
        this.started = true;
    }
}
