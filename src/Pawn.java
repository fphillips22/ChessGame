public class Pawn extends Piece {

    public Pawn(boolean b){
        super();
    }
    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}
