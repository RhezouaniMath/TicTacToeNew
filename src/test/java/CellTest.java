import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    public void standardValueCell(){
        Cell cell = new Cell();
        assertEquals(' ', cell.value);
    }

    @Test
    public void differentValueCell(){
        Cell cell = new Cell('v');
        assertEquals('v', cell.value);
    }

    @Test
    public void playKonEmptyCell(){
        Cell cell = new Cell();
        cell.play('K');
        assertEquals('K',cell.value);
    }

    @Test
    public void playKonNonEmptyCell(){
        Cell cell = new Cell();
        cell.value = 'P';
        cell.play('K');
        assertEquals('P',cell.value);
    }

    @Test
    public void playXonEmptyCell(){
        Cell cell = new Cell();
        cell.playX();
        assertEquals('X',cell.value);
    }

    @Test
    public void playXonNonEmptyCell(){
        Cell cell = new Cell();
        cell.value = 'P';
        cell.playX();
        assertEquals('P',cell.value);
    }

    @Test
    public void playOonEmptyCell(){
        Cell cell = new Cell();
        cell.playO();
        assertEquals('O',cell.value);
    }

    @Test
    public void playOonNonEmptyCell(){
        Cell cell = new Cell();
        cell.value = 'P';
        cell.playO();
        assertEquals('P',cell.value);
    }

    @Test
    public void isNotPlayed(){
        Cell cell = new Cell();
        assertTrue(cell.isNotPlayed());
    }

    @Test
    public void isNotNotPlayed(){
        Cell cell = new Cell('X');
        assertFalse(cell.isNotPlayed());
    }


}
