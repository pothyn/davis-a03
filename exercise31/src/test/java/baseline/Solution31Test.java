package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    Solution31 app;

    @Test
    void testGetTargetHeartRate55() {
        assertEquals(138,app.getTargetHeartRate(55));
    }

    @Test
    void testTabularFormat() {
        // Correct test results not given by instructor
    }

    @Test
    void testGetTargetHeartRate65() {
        int intensity = 65;
        assertEquals(151, app.getTargetHeartRate(intensity));
    }


    @BeforeEach
    void init() {
        app = new Solution31(65, 22);
    }
}