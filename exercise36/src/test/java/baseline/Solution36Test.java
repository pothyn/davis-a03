package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    Solution36 app;

    @BeforeEach
    void init() {
        app = new Solution36();
        app.addNumber("100");
        app.addNumber("200");
        app.addNumber("1000");
        app.addNumber("300");
        app.addNumber("done");
    }

    @Test
    void testListNumbers() {
        assertEquals("100, 200, 1000, 300", app.getListNumbers());
    }

    @Test
    void testMax() {
        assertEquals(1000, app.getMax());
    }

    @Test
    void testMin() {
        assertEquals(100, app.getMin());
    }

    @Test
    void testStd() {
        assertEquals(353.55, app.getStd());
    }

    @Test
    void testAvg() {
        assertEquals(400.0, app.getAvg());
    }

    @Test
    void testAddNumber() {
        app.addNumber("300");
        assertEquals("100, 200, 1000, 300, 300", app.getListNumbers());
    }

}