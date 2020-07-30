import org.junit.Assert;
import org.junit.Test;


public class Problem01Test 
{

    @Test
    public void isPrimeTest()
    {
        //Given
        Problem01 problem01 = new Problem01();
        Integer n = 10;
        //When
        Boolean expected = false; 
        Boolean actual = problem01.isPrime(n);
        //Then 
        Assert.assertEquals(expected, actual);
        
    }
    @Test
    public void isPrimeTest2()
    {
        //Given
        Problem01 problem01 = new Problem01();
        Integer n = 2;
        //When
        Boolean expected = true; 
        Boolean actual = problem01.isPrime(n);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isPrimeTest3()
    {
        //Given
        Problem01 problem01 = new Problem01();
        Integer n = 1;
        //When
        Boolean expected = false; 
        Boolean actual = problem01.isPrime(n);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Problem01Test1()
    {
        //Given 
        Problem01 problem01 = new Problem01();
        Integer number  = 10; 
        //When 
        String actual = "2 3 5 7";
        String expected = problem01.sieveOfEratosthenes(number);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sieveOfEratosthenesTest()
    {
        //Given
        Problem01 problem01 = new Problem01();
        Integer number= 20;   
        //When 
        String expected = problem01.sieveOfEratosthenes(number);
        String actual = "2 3 5 7 11 13 17 19";
        //Then
        Assert.assertEquals(expected, actual);
    }
}
