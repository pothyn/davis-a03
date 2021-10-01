package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    Solution30 app;

    @BeforeEach
    void init() {
        app = new Solution30();
    }

    @Test
    void testSpacingWithValue1() {
        assertEquals("    1", app.spacing(1));
    }

    @Test
    void testPrintRow() {
        assertEquals("    1    2    3    4    5    6    7    8    9   10   11   12",app.getRow(1));
    }

    @Test
    void countDigits() {
        assertEquals(2,app.getDigitCount(20));
    }

}