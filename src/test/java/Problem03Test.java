import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem03Test {
    private Problem03 problem03;

    @Before
    public void setup() {
        problem03 = new Problem03();
    }

    @Test
    public void countSubstringsWithTwoDistinctLettersTest() {
        String expected = "2";
        String input = "abcc";

        String actual =  problem03.countKLengthStringsWithKDistinctLetters(input, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void countSubstringsWithThreeDistinctLettersTest() {
        String expected = "0";
        String input = "aabab";

        String actual =  problem03.countKLengthStringsWithKDistinctLetters(input, 3);

        assertEquals(expected, actual);
    }
}
