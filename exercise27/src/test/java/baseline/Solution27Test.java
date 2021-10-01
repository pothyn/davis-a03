package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    Solution27 app;

    @Test
    void testNameTwoLettersTrue() {
        assertEquals(true, app.checkNameTwoLetters("test"));
    }

    @Test
    void testNameTwoLettersFalse() {
        assertEquals(false, app.checkNameTwoLetters("h"));
    }

    @Test
    void testNameFilledInFalse() {
        assertEquals(false, app.checkNameFilledIn(""));
    }
    @Test
    void testNameFilledInTrue() {
        assertEquals(true, app.checkNameFilledIn("John"));
    }

    @Test
    void testZipFalse() {
        assertEquals(false, app.checkZip("12345"));
    }
    @Test
    void testZipTrueLetters() {
        assertEquals(true, app.checkZip("abcde"));
    }
    @Test
    void testZipTrueLength() {
        assertEquals(true, app.checkZip("123456"));
    }

    @Test
    void testEmployeeID() {
        assertEquals(false, app.checkEmployeeID("AB-1234"));
    }
    @Test
    void testEmployeeIDLetters() {
        assertEquals(true, app.checkEmployeeID("A1-1234"));
    }
    @Test
    void testEmployeeIDDash() {
        assertEquals(true, app.checkEmployeeID("ABm1234"));
    }
    @Test
    void testEmployeeIDDigits() {
        assertEquals(true, app.checkEmployeeID("AB-a234"));
    }
    @Test
    void testEmployeeIDLength() {
        assertEquals(true, app.checkEmployeeID("AB"));
    }

    @BeforeEach
    void init() {
        app = new Solution27();
    }

}