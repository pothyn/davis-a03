package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    Solution25 app;

    @Test
    void testPasswordValidator0() {
        String password = "12345";
        assertEquals(0,app.passwordValidator(password));
    }

    @Test
    void testPasswordValidator1() {
        String password = "abcdef";
        assertEquals(1,app.passwordValidator(password));
    }

    @Test
    void testPasswordValidator2() {
        String password = "abc123xyz";
        assertEquals(2,app.passwordValidator(password));
    }

    @Test
    void testPasswordValidator3() {
        String password = "1337h@xor!";
        assertEquals(3,app.passwordValidator(password));
    }

    @BeforeEach
    void init() {
        app = new Solution25();
    }
}