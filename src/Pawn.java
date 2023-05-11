public class Pawn extends Piece {

    public Pawn(boolean b){
        super(b);
    }
    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        return y == 1 && x == 0;
    }
}
