package hw_02_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinOpsTest {
    BinOps bins;

    @BeforeEach
    void setUp() {
        bins = new BinOps();
    }

    @Test
    void sum() {
        String actual = bins.sum("25", "15");
        String expected = String.valueOf(25 + 15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void mult() {
        String actual = bins.mult("25", "2");
        String expected = String.valueOf(25 * 2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void mult2() {
        String actual = bins.mult("0", "2");
        String expected = String.valueOf(0 * 2);
        Assertions.assertEquals(expected, actual);
    }
}