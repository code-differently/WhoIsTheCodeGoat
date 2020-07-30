import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void primesTest1(){
        // Given
        String expected = "2 3 5 7";

        // When
        String actual = Problem01.primes(10);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void primesTest2(){
        // Given
        String expected = "";

        // When
        String actual = Problem01.primes(0);

        // Then
        Assert.assertEquals(expected, actual);
    }


}
