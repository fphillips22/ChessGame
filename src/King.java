public class King extends Piece{
    public King(boolean b){
        super();
    }
    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}