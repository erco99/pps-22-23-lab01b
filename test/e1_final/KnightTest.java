package e1_final;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class KnightTest {

    Knight knight;
    @BeforeEach
    void setUp() {
        this.knight = new Knight(new Pair<>(0,0));
    }

    @Test
    void testCorrectMoves() {
        assertTrue(this.knight.canMove(2, 1));
        assertTrue(this.knight.canMove(1, 2));
    }

    @Test
    void testWrongMoves() {
        assertFalse(this.knight.canMove(0,0));
        assertFalse(this.knight.canMove(1,1));
    }
}