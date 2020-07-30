import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {
    @Test
    public void allPrimeNumbersTest01(){
        //Given
        Problem01 problem01 = new Problem01();
        int userInput = 10;
        String expected = "2 3 5 7";

        //When
        String actual = problem01.SieveOfEratosthenes(userInput);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void allPrimeNumbersTest02(){
        //Given
        Problem01 problem01 = new Problem01();
        int userInput = 20;
        String expected = "2 3 5 7 11 13 17 19";


        //When
        String actual = problem01.SieveOfEratosthenes(userInput);

        //Then
        Assert.assertEquals(expected, actual);

    }

}
