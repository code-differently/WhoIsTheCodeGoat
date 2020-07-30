import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {

    @Test
    public void productArrayPuzzleTest() {
        // Given
        Problem04 p4 = new Problem04();
        int[] input = {10, 3, 5, 6, 2};
        String expected = "Input: int[] input = {10, 3, 5, 6, 2}\n" +
                "Output: {180, 600, 360, 300, 900}";

        // When
        String actual = p4.productArrayPuzzle(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void productArrayPuzzleTest2() {
        // Given
        Problem04 p4 = new Problem04();
        int[] input = {12, 20};
        String expected = "Input: int[] input = {12, 20}\n" +
                "Output: {20, 12}";

        // When
        String actual = p4.productArrayPuzzle(input);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
