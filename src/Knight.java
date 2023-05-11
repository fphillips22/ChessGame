public class Knight extends Piece{
    public Knight(boolean b) {
        super();
    }

    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}
