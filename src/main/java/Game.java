public class Game {

    protected Board board;
    protected Player player;
    protected Player turn;

    public Game(){
        this.board = new Board();
        this.player = new Player(this);
        this.turn = this.player;
    }

    public void switchTurn(){
        this.turn = turn.opponent;
    }
}
