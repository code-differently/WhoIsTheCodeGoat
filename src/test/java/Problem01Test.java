

import org.junit.Assert;
import org.junit.Test;

public class Problem01Test {

    Problem01 problem01;

    @Test
    public void isPrime01(){
        //Given
        Problem01 problem01 = new Problem01();

        //When
        boolean actual = false; 
        boolean expected = problem01.isPrime(10);

        //Then
        Assert.assertEquals(expected, actual);;
    }

    @Test
    public void isPrime02(){
        //Given
        Problem01 problem01 = new Problem01();

        //When 
        boolean actual = true;
        boolean expected = problem01.isPrime(23);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sieveOfEratosthenesTest(){
        //Given
        Problem01 problem01 = new Problem01();

        //When
        
        

        //Then

    }
}
