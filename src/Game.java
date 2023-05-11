import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentPlayer;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void init(Player player1, Player player2){
        players[0] = player1;
        players[1] = player2;

        board.reset();

        if (player1.isLightSide()){
            this.currentPlayer = player1;
        }
        else{
            this.currentPlayer = player2;
        }
        movesPlayed.clear();
    }

    public boolean isEnd(){
        return this.getStatus() != GameStatus.ACTIVE;
    }

    public GameStatus getStatus() {
        return this.status;
    }
    public void setStatus(GameStatus status){
        this.status = status;
    }

}
