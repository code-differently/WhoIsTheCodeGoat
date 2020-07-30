import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {


    @Test
    public void primeNumbersTest(){
        // Given
        Problem01 p = new Problem01();
        int n = 10;
        // When
        String expected = "Output: 2 3 5 7";
        String actual = p.primeNumbers(n);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void primeNumbersTest02(){
        // Given
        Problem01 p = new Problem01();
        int n = 20;
        // When
        String expected = "Output: 2 3 5 7 11 13 17 19";
        String actual = p.primeNumbers(n);
        // Then
        Assert.assertEquals(expected, actual);
    }
}
