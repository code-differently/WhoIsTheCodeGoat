import org.junit.Test;
import org.junit.Assert;

public class Problem01Test {

    @Test
    public void Problem01Test(){
        //Given
        int n = 10;
        //Expected
        String expected = "2 3 5 7 ";
        String actual = Problem01.Problem01(n);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void Problem02Test(){
        //Given
        int n = 20;
        //Expected
        String expected = "2 3 5 7 11 13 17 19 ";
        String actual = Problem01.Problem01(n);

        Assert.assertEquals(expected,actual);

    }

}
