package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    Solution28 app;

    @BeforeEach
    void init() {
        app = new Solution28();
    }

    @Test
    void testAddValues() {
        int[] array = {1,2,3,4,5};
        assertEquals(15,app.addValues(array));
    }

}