public class Queen extends Piece{

    public Queen(boolean b){
        super();
    }
    @Override
    public boolean moveValid(Board board, Spot start, Spot end) {
        return false;
    }
}
