package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    Solution38 app;

    @Test
    void testFilterEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] evenArray = {2,4,6,8};
        assertEquals(evenArray, app.filterEvenNumbers(array));
    }

    @Test
    void testConvertToInts() {
        String strArray = "1 2 3 4 5 6 7 8";
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(array, app.convertToInts(strArray));
    }

    @BeforeEach
    void init() {
        app = new Solution38();
    }

}