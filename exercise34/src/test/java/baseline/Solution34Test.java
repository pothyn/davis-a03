package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    Solution34 app;

    @Test
    void testRemove() {
        app.removeEmployee("John Smith");
        assertEquals("", app.listEmployees());
    }

    @Test
    void testAdd() {
        app.addEmployee("Jackie Jackson");
        assertEquals("John Smith\nJackie Jackson", app.listEmployees());
    }

    @BeforeEach
    void init() {
        app = new Solution34();

        app.addEmployee("John Smith");

    }

}