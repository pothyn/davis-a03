package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    Solution32 app;

    @Test
    void testValueChecker() {
        assertEquals(false, app.valueChecker("a"));
    }

    @Test
    void testGenerateRandom() {
        // Random numbers are a great idea for assertEquals methods!
    }

    @Test
    void testDigitCheckerDigits() {
        assertEquals(true, app.digitChecker("124"));
    }

    @Test
    void testDigitCheckerLetters() {
        assertEquals(false, app.digitChecker("abd"));
    }

    @Test
    void testYNCheckerY() {
        assertEquals(0, app.ynChecker("y"));
    }

    @Test
    void testYNCheckerY() {
        assertEquals(true, app.ynChecker("y"));
    }

    @BeforeEach
    void init() {
        app = new Solution32();
    }

}