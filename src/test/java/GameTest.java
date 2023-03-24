import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    @Test
    public void newGameShouldHaveEmptyBoard(){
        Game game = new Game();
        for(int row = 1; row<=3; row++){
            for(int column = 1; column<=3; column++){
                assertTrue(game.board.accessCell(row, column).isNotPlayed());
            }
        }
    }

    @Test
    public void playerOfNewGameHasLetterX(){
        Game game = new Game();
        assertEquals('X', game.player.character);
    }

    @Test
    public void opponentHasLetterO(){
        Game game = new Game();
        assertEquals('O', game.player.opponent.character);
    }

    @Test
    public void playerOfNewGameHasFirstTurn(){
        Game game = new Game();
        Player expected = game.player;
        Player result = game.turn;
        assertEquals(expected, result);
    }

    @Test
    public void opponentHasTurnAfterSwitch(){
        Game game = new Game();
        game.switchTurn();
        Player expected = game.player.opponent;
        Player result = game.turn;
        assertEquals(expected, result);
    }

    @Test
    public void playHasTurnAfterTwoSwitches(){
        Game game = new Game();
        game.switchTurn();
        game.switchTurn();
        Player expected = game.player;
        Player result = game.turn;
        assertEquals(expected, result);
    }
}
