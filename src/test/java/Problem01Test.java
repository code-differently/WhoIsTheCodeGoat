import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Problem01Test {

    @Test
    public void getPrimes1(){
        Problem01 p1 = new Problem01();

        String actual = p1.getPrimes(20);
        String expected = "2, 3, 5, 7, 11, 13, 17, 19";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPrimes2(){
        Problem01 p1 = new Problem01();

        String actual = p1.getPrimes(10);
        String expected = "2, 3, 5, 7";

        Assert.assertEquals(expected, actual);
    }
}
