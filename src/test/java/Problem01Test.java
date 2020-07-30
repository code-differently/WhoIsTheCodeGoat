import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test {

    @Before
    public void setUp(){

    }

    @Test
    public void primeTest(){
        //Given
        int n = 10;
        //Problem01 problem01 = new Problem01();

        //When
        String expected = "2 3 5 7";
        String actual = Problem01.problem01(n);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void primeTest2(){
        //Given
        int n = 20;
        Problem01 problem01 = new Problem01();

        //When
        String expected = "2 3 5 7 11 13 17 19";
        String actual = Problem01.problem01(n);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
