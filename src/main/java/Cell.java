import org.jetbrains.annotations.NotNull;

public class Cell {
    protected char value;

    public Cell(){
        this.value = ' ';
    }

    public Cell(char kar){
        this.value = kar;
    }

 /*   public void print_value(){
        System.out.println(this.value);
    }*/

    public void play(char characterOfPlayer){
        if (this.value == ' '){
            this.value = characterOfPlayer;
        }
    }

    public void playX(){
        this.play('X');
    }

    public void playO(){
        this.play('O');
    }

    public boolean isNotPlayed(){
        return this.value == ' ';
    }

    public boolean playerPlayed(@NotNull Player player){
        return this.value == player.character;
    }
}