import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void findAllPrimesSmallerTest() {
        // Given
        Problem01 p1 = new Problem01();
        String expected = "Input: n = 10\n" +
                "Output: 2 3 5 7";

        // When
        String actual = p1.findAllPrimesSmaller(10);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAllPrimesSmallerTest2() {
        // Given
        Problem01 p1 = new Problem01();
        String expected = "Input: n = 20\n" +
                "Output: 2 3 5 7 11 13 17 19";

        // When
        String actual = p1.findAllPrimesSmaller(20);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPrimeTestTrue() {
        // Given
        Problem01 p1 = new Problem01();

        // When
        boolean actual = p1.isPrime(2);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isPrimeTestTrue2() {
        // Given
        Problem01 p1 = new Problem01();

        // When
        boolean actual = p1.isPrime(7);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isPrimeTestFalse() {
        // Given
        Problem01 p1 = new Problem01();

        // When
        boolean actual = p1.isPrime(8);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void isPrimeTestFalse2() {
        // Given
        Problem01 p1 = new Problem01();

        // When
        boolean actual = p1.isPrime(12);

        // Then
        Assert.assertFalse(actual);
    }
}
