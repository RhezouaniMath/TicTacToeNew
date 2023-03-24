public class Player {
    public char character;
    protected Game game;
    protected Player opponent;

    public Player(Game game){
        this.character = 'X';
        this.game = game;
        this.opponent = new Player(this,game,'O');
    }

    protected Player(Player player, Game game, char kar){
        this.character = kar;
        this.game = game;
        this.opponent = player;
    }

    public boolean iWon(){
        return this.iWonDiagonally() || this.iWonHorizontally() || this.iWonVertically();
    }

    private boolean iWonHorizontally(){
        for(int row = 1; row<=3; row++){
            boolean bool1 = this.game.board.accessCell(row, 1).playerPlayed(this);
            boolean bool2 = this.game.board.accessCell(row, 2).playerPlayed(this);
            boolean bool3 = this.game.board.accessCell(row, 3).playerPlayed(this);
            if (bool1 && bool2 && bool3){
                return true;
            }
        }
        return false;
    }

    private boolean iWonVertically(){
        for(int column = 1; column<=3; column++){
            boolean bool1 = this.game.board.accessCell(1, column).playerPlayed(this);
            boolean bool2 = this.game.board.accessCell(2, column).playerPlayed(this);
            boolean bool3 = this.game.board.accessCell(3, column).playerPlayed(this);
            if (bool1 && bool2 && bool3){
                return true;
            }
        }
        return false;
    }

    private boolean iWonDiagonally(){
        boolean bool11 = this.game.board.accessCell(1, 1).playerPlayed(this);
        boolean bool22 = this.game.board.accessCell(2, 2).playerPlayed(this);
        boolean bool33 = this.game.board.accessCell(3, 3).playerPlayed(this);
        boolean bool31 = this.game.board.accessCell(3, 1).playerPlayed(this);
        boolean bool13 = this.game.board.accessCell(1, 3).playerPlayed(this);
        return (bool11 && bool22 && bool33)||(bool31 && bool22 && bool13);
    }

    public void move(int row, int column){
        Cell cell = this.game.board.accessCell(row,column);
        if (this.game.turn == this){
            if(cell.isNotPlayed()){
                cell.play(this.character);
                this.game.switchTurn();
            }
        }
    }

}
