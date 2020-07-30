import org.junit.Assert;
import org.junit.Test;

public class Problem03Test
{
    @Test
    public void testCountOne()
    {
        int expectedReturn = 2;

        Assert.assertEquals(expectedReturn, new Problem03().countSubstring("abcc", 2));
    }

    @Test
    public void testCountTwo()
    {
        int expectedReturn = 0;

        Assert.assertEquals(expectedReturn, new Problem03().countSubstring("aabab", 3));
    }
}
