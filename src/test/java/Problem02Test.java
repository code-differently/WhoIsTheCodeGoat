import org.junit.Test;

public class Problem02Test {

    @Test
    public void magicSquareTest(){
        //Given 
        String expected = "Magic Square of size 3\n" +
        "-----------------------\n" + 
          "2   7   6 \n" +
          "9   5   1 \n" +
          "4   3   8 \n" +
        "Sum in each row & each column = 3*(3^2+1)/2 = 15";
        //When 
        String actual = Problem02.magicSquare(3);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
