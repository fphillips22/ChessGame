public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white){
        this.setWhite(white);
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract boolean moveValid(Board board, Spot start, Spot end);
}
