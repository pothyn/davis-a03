package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void toneNoteIsAnagram() {
        Solution24 app = new Solution24();

        assertEquals(true, app.isAnagram("tone","note"));
    }

    @Test
    void listenSilentCapsIsAnagram() {
        Solution24 app = new Solution24();

        assertEquals(false, app.isAnagram("listen","Silent"));
    }

    @Test
    void fallFallingIsAnagram() {
        Solution24 app = new Solution24();

        assertEquals(false, app.isAnagram("falling","fall"));
    }

    @Test
    void survivingThrivingIsAnagram() {
        Solution24 app = new Solution24();

        assertEquals(false, app.isAnagram("surviving","thriving"));
    }


}