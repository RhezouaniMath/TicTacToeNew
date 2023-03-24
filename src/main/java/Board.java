public class Board {

    protected Cell[][] boardValue;

    public Board() {
        this.boardValue = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.boardValue[i][j] = new Cell();
            }
        }
    }

    protected Board(char[][] karArray){
        this.boardValue = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.boardValue[i][j] = new Cell(karArray[i][j]);
            }
        }
    }

    public Cell accessCell(int row, int column) {
        return this.boardValue[row-1][column-1];
    }

    public boolean allPositionsArePlayed(){
        for (int row = 1; row <= 3; row++){
            for (int column = 1; column <= 3; column++){
                if(accessCell(row,column).isNotPlayed()){
                    return false;
                }
            }
        }
        return true;
    }
}