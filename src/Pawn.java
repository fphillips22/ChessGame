public class Pawn extends Piece {

    public Pawn(boolean b){
        super(b);
    }
    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}
