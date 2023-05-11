public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castling = false;

    public Move(Player player, Spot start, Spot end){
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

    public boolean isCastling() {
        return this.castling;
    }

    public void setCastling(boolean castling) {
        this.castling = castling;
    }
}
