import org.junit.Test;
import org.junit.Assert;

public class Problem01Test {

    @Test
    public void sample01Test(){
        //Given
        Problem01 prob1 = new Problem01();
        int input = 10;
        String expected = "2 3 5 7 ";
        //When
        String actual = prob1.countPrimes(input);
        System.out.println(actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sample02Test(){
        //Given
        Problem01 prob1 = new Problem01();
        int input = 20;
        String expected = "2 3 5 7 11 13 17 19 ";
        //When
        String actual = prob1.countPrimes(input);
        System.out.println(actual);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
