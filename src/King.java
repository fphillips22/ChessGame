public class King extends Piece{
    private boolean castled = false;
    public King(boolean b){
        super(b);
    }

    public boolean isCastled() {
        return this.castled;
    }

    public void setCastled(boolean castled) {
        this.castled = castled;
    }



    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()){
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        if (x + y == 1){
            return true;
        }
        return this.castleValid(board, start, end);
    }

    private boolean castleValid(Board board, Spot start, Spot end){
        if (this.isCastled()){
            return false;
        }
        return this.isCastleMove(board, start, end);
    }

    public boolean isCastleMove(Board board, Spot start, Spot end){
        boolean valid = false;
        if (start.getX() == 7 && start.getY() == 4 && (end.getY() == 7 || end.getY() == 0) && (end.getX() == 7)){
            valid = true;
        } else if (start.getX() == 0 && start.getY() == 4 && (end.getY() == 0 || end.getY() == 7) && end.getX() == 7) {
            valid = true;
        }
        return valid;
    }
}
