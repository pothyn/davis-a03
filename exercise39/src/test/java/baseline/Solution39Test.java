package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    Solution39 app;

    @Test
    void testAddPreset() {
        app.addPreset();
        assertEquals("John", app.getValue(0,0));
    }

    @BeforeEach
    void init() {
        app = new Solution39();
    }

}