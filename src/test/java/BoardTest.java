import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void initialBordHasEmptyCells(){
        Board board = new Board();
        for(int row = 1; row<=3; row++){
            for(int column = 1; column <=3; column++){
                assertEquals(' ', board.accessCell(row, column).value);
            }
        }
    }

    @Test
    public void allPositionsArePlayed(){
        char[][] charArray = {{'X','X','X'},{'X','X','Y'},{'Y','Y','Y'}};
        Board board = new Board(charArray);
        assertTrue(board.allPositionsArePlayed());
    }

    @Test
    public void notAllPositionsArePlayed(){
        char[][] charArray = {{' ',' ',' '},{'X','X','Y'},{' ',' ',' '}};
        Board board = new Board(charArray);
        assertFalse(board.allPositionsArePlayed());
    }

}
