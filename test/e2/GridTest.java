package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    public static final int MINES_NUMBER = 10;
    private Grid grid;
    private Set<Pair<Integer,Integer>> mines;


    @BeforeEach
    void setUp() {
        this.grid = new Grid(7);
        this.grid.setGrid(MINES_NUMBER);
        this.mines = new HashSet<>(MINES_NUMBER);
    }

    @Test
    void testIfMinesArePlaced() {
        assertEquals(this.MINES_NUMBER,this.grid.getMines().size());
    }


}