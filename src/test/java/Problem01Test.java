import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {
    @Test
    public void isPrimeTest(){
        //Given
        Problem01 prac = new Problem01();
        //When
        boolean actual = prac.isPrime(3);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isPrimeTest2(){
        //Given
        Problem01 prac = new Problem01();
        //When
        boolean actual = prac.isPrime(2);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isPrimeTest3(){
        //Given
        Problem01 prac = new Problem01();
        //When
        boolean actual = prac.isPrime(127);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void primeGenTest(){
        //Given
        Problem01 prac = new Problem01();
        Integer[] actual = prac.primeGen(20);
        //When
        Integer[] expected = {2,3,5,7,11,13,17,19};
        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void primeGenTest2(){
        //Given
        Problem01 prac = new Problem01();
        Integer[] actual = prac.primeGen(4);
        //When
        Integer[] expected = {2,3};
        //Then
        Assert.assertArrayEquals(expected, actual);
    }

}
