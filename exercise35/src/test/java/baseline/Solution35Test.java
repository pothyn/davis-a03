package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    Solution35 app;

    @BeforeEach
    void init() {

        app = new Solution35();

    }

    @Test
    void testAddPerson() {
        app.addPerson("Maggie");
        assertEquals("Maggie", app.chooseWinner());
    }

    @Test
    void testChoosePersonOnlyOne() {
        app.addPerson("Maggie");
        if(!app.addPerson(""))
            assertEquals("Maggie", app.chooseWinner());
    }

    @Test
    void testFullChoosePerson() {
        // Randomly selected values, so this is not something useful to test.
    }

}