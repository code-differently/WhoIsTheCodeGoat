import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class Problem01Test {

    @Test
    public void problem01Test(){
        //Given
        Problem01 problem01 = new Problem01();
        //When
        String expected = "2 3 5 7 ";
        String actual = problem01.printPrimes(10);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void problem01Test2() {
        //Given
        Problem01 problem01 = new Problem01();
        //When
        String expected = "2 3 5 7 11 13 17 19 ";
        String actual = problem01.printPrimes(20);
        //Then
        Assert.assertEquals(expected, actual);


    }
}