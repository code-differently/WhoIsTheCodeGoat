import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void smallPrimeTest(){
        // Given
        String expected="2 3 5 7 11 13 17 19";

        // When
        String actual=Problem01.smallerPrimes(20);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void smallPrimeTest2(){
        // Given
        String expected="2 3 5 7";

        // When
        String actual=Problem01.smallerPrimes(10);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void smallPrimeTest3(){
        // Given
        String expected="2 3 5 7 11 13 17 19 23 29 31 37 41 43 47";

        // When
        String actual=Problem01.smallerPrimes(50);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void smallPrimeTest4(){
        // Given
        String expected="2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97";

        // When
        String actual=Problem01.smallerPrimes(100);

        // Then
        Assert.assertEquals(expected,actual);
    }
}
