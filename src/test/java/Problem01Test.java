import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {
    @Test
    public void findPrimesTest(){
        //Given
        Problem01 aProblem01 = new Problem01();
        String expected = "2 3 5 7 11 13 17 19";

        // When
        String actual = aProblem01.findPrimes(20);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findPrimesTest2(){
        //Given
        Problem01 aProblem01 = new Problem01();
        String expected = "2 3 5 7";

        // When
        String actual = aProblem01.findPrimes(10);

        //Then
        Assert.assertEquals(expected, actual);

    }
}
