public class Rook extends Piece{
    public Rook(boolean b) {
        super(b);
    }

    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}
