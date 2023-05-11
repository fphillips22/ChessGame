public class Board {
    Spot [][] boxes;
    public Board(){

    }

    public Spot getBox(int x, int y){
        return boxes[x][y];
    }

    public void reset() {

        //light pieces
        boxes[0][0] = new Spot(0,0, new Rook(true));
        boxes[1][0] = new Spot(1,0, new Knight(true));
        boxes[2][0] = new Spot(2,0, new Bishop(true));
        boxes[3][0] = new Spot(3,0, new Queen(true));
        boxes[4][0] = new Spot(4,0, new King(true));
        boxes[5][0] = new Spot(5,0, new Bishop(true));
        boxes[6][0] = new Spot(6,0, new Knight(true));
        boxes[7][0] = new Spot(7,0, new Rook(true));
        boxes[0][1] = new Spot(0,1 , new Pawn(true));
        boxes[1][1] = new Spot(1,1 , new Pawn(true));
        boxes[2][1] = new Spot(2,1 , new Pawn(true));
        boxes[3][1] = new Spot(3,1 , new Pawn(true));
        boxes[4][1] = new Spot(4,1 , new Pawn(true));
        boxes[5][1] = new Spot(5,1 , new Pawn(true));
        boxes[6][1] = new Spot(6,1 , new Pawn(true));
        boxes[7][1] = new Spot(7,1 , new Pawn(true));

        // dark pieces
        boxes[0][7] = new Spot(0,7, new Rook(true));
        boxes[1][7] = new Spot(1,7, new Knight(true));
        boxes[2][7] = new Spot(2,7, new Bishop(true));
        boxes[3][7] = new Spot(3,7, new Queen(true));
        boxes[4][7] = new Spot(4,7, new King(true));
        boxes[5][7] = new Spot(5,7, new Bishop(true));
        boxes[6][7] = new Spot(6,7, new Knight(true));
        boxes[7][7] = new Spot(7,7, new Rook(true));
        boxes[0][6] = new Spot(0,6, new Pawn(true));
        boxes[1][6] = new Spot(1,6, new Pawn(true));
        boxes[2][6] = new Spot(2,6, new Pawn(true));
        boxes[3][6] = new Spot(3,6, new Pawn(true));
        boxes[4][6] = new Spot(4,6, new Pawn(true));
        boxes[5][6] = new Spot(5,6, new Pawn(true));
        boxes[6][6] = new Spot(6,6, new Pawn(true));
        boxes[7][6] = new Spot(7,6, new Pawn(true));


        for(int i = 2; i < 6; i++){
            for (int j = 0; j < 8; j++){
                boxes[i][j] = new Spot(i, j, null);
            }
        }



    }
}
