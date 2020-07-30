import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    @Test
    public void primeNumberTest(){
        //Given 
        String expected = "2, 3, 5, 7";
        //When
        boolean actual = Problem01.isPrimeNumber(10);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
