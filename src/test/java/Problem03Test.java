import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void countAllSubstringsOfLengthKTest() {
        // Given
        Problem03 p3 = new Problem03();
        String input = "abcc";
        int k = 2;
        String expected = "Input: str = “abcc”, K = 2\n" +
                "Output: 2";

        // When
        String actual = p3.countAllSubstringsOfLengthK(input, k);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countAllSubstringsOfLengthKTest2() {
        // Given
        Problem03 p3 = new Problem03();
        String input = "aabab";
        int k = 3;
        String expected = "Input: str = “aabab”, K = 3\n" +
                "Output: 0";

        // When
        String actual = p3.countAllSubstringsOfLengthK(input, k);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasKDistinctTestTrue() {
        // Given
        Problem03 p3 = new Problem03();
        String input = "ab";
        int k = 2;

        // When
        boolean actual = p3.hasKDistinct(input, 2);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void hasKDistinctTestFalse() {
        // Given
        Problem03 p3 = new Problem03();
        String input = "aa";
        int k = 2;

        // When
        boolean actual = p3.hasKDistinct(input, 2);

        // Then
        Assert.assertFalse(actual);
    }
}
