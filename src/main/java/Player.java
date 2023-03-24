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
        //TODO
        return false;
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
        //TODO
        return false;
    }

    private boolean iWonDiagonally(){
        //TODO
        return false;
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
