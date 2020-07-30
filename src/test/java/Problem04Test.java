import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {


    @Test
    public void puzzleProductTest(){
        // Given
        Problem04 p = new Problem04();
        int[] input = {10, 3, 5, 6, 2};
        // When
        String expected = "180 600 360 300 900";
        String actual = p.puzzleProductString(input);
        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void puzzleProductTest02(){
        // Given
        Problem04 p = new Problem04();
        int[] input = {12, 20};
        // When
        String expected = "20 12";
        String actual = p.puzzleProductString(input);
        // Then
        Assert.assertEquals(expected, actual);
    }

}
