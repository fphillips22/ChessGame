public class Bishop extends Piece{
    public Bishop(boolean b) {
        super();
    }

    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}
