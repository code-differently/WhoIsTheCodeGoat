import static org.junit.Assert.*;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void countOfSubstringsTest() {
        String testCase = "abcc";
        int num = 2;

        int expected = 2;

        assertEquals(expected, Problem03.countOfSubstrings(testCase, num));
    }

    @Test
    public void countOfSubstringsTest2() {
        String testCase = "aabab";
        int num = 3;

        int expected = 0;

        assertEquals(expected, Problem03.countOfSubstrings(testCase, num));
    }
}
