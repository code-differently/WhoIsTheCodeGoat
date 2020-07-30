import org.junit.Assert;
import org.junit.Test;

public class Problem02Test 
{

    @Test
    public void magicSquareTest()
    {
        //Given
        Problem02 problem02 = new Problem02();
        Integer n = 3; 
        //When 
        String expected = "Magic Square of size 3\n" +  
        "  6  7  2\n" + 
        "  3  4  8\n" + 
        "  9  1  5\n" +
        "Sum in each row & each column = 3*(3^2+1)/2 = 15";
        String actual = problem02.magicSquare(n);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void magicSquareTest1()
    {
        //Given
        Problem02 problem02 = new Problem02();
        Integer n = 5; 
        //When 
        String expected = "Magic Square of size 5\n"+
        " 14 20 21  2  8\n" +
        "  9 15 16 22  3\n" +
        "  4 10 11 17 23\n" +
        " 24  5  6 12 18\n" +
        " 19 25  1  7 13\n" +
        "Sum in each row & each column = 5*(5^2+1)/2 = 65";
        String actual = problem02.magicSquare(n);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void magicSquareTest2()
    {
        //Given
        Problem02 problem02 = new Problem02(); 
        Integer n = 7;
        //When 
        String expected = "Magic Square of size 7\n" +
        " 26 34 42 43  2 10 18\n" +
        " 19 27 35 36 44  3 11\n" +
        " 12 20 28 29 37 45  4\n" +
        "  5 13 21 22 30 38 46\n" +
        " 47  6 14 15 23 31 39\n" +
        " 40 48  7  8 16 24 32\n" +
        " 33 41 49  1  9 17 25\n" +
        "Sum in each row & each column = 7*(7^2+1)/2 = 175";
        String actual = problem02.magicSquare(n);
        //Then
        Assert.assertEquals(expected, actual);
    }
    
}
