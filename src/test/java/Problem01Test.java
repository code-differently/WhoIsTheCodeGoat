import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test {

    Problem01 p1;
    @Before
    public void initialize(){
        p1 = new Problem01();
    }
    @Test
    public void getPrimesTest(){
        String exp = "2 3 5 7";
        Assert.assertEquals(exp, p1.getPrimes(10));
    }
    @Test
    public void getPrimesTest2(){
        String exp = "2 3 5 7 11 13 17 19";
        Assert.assertEquals(exp, p1.getPrimes(20));
    }

    @Test
    public void isPrimeTest(){
        boolean exp = false;
        Assert.assertEquals(exp, p1.isPrime(20));
    }

    @Test
    public void isPrimeTest2(){
        boolean exp = true;
        Assert.assertEquals(exp, p1.isPrime(3));
    }
}
