
import org.junit.Test;
import org.junit.Assert;

public class Problem01Test {

    @Test
    public void isPrimetest1(){
    Problem01 problem01 = new Problem01();
        //given
        Integer n = 10;
        //when
        String expected = "2,3,5,7";
        String actual = problem01.getPrimeNumber(n);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPrimeTest2(){
        Problem01 problem01 = new Problem01();
        //given
        Integer n = 21;
        //when
        String expected = "2,3,5,7,11,13,17,19";
        
        String actual = problem01.getPrimeNumber(n);

        //Then
        Assert.assertEquals(expected, actual);

    }
}
