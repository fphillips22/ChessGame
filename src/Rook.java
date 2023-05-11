public class Rook extends Piece{
    public Rook(boolean b) {
        super(b);
    }

    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        boolean valid = false;
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == x || x + y == y){
            valid = true;
        }
        return valid;
    }
}
