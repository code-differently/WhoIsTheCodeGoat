import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test {
    Problem01 prob1;

    @Before
    public void initial() {
        prob1 = new Problem01();
    }

    @Test
    public void primesTest1() {
        //Given
        Integer stop = 10;
        String expected = " 2 3 5 7";

        //When
        String actual = prob1.getPrimes(stop);

        //Then
        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void primesTest2() {
        //Given
        Integer stop = 20;
        String expected = " 2 3 5 7 11 13 17 19";

        //When
        String actual = prob1.getPrimes(stop);

        //Then
        Assert.assertEquals(expected, actual);
        
    }
}
