package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicsImplTest {

    public static final int SIZE = 7;
    public static final int MINES_NUMBER = 10;
    Logics logics;
    @BeforeEach
    void setUp() {
        logics = new LogicsImpl(SIZE, MINES_NUMBER);
    }

    @Test
    void testIfMinesArePlaced() {
        assertEquals(MINES_NUMBER, logics.getMinesNumber());
    }
}