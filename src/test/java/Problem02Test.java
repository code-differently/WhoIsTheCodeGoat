import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {

    @Test
    public void magicSquareTest(){
        Problem02 p2 = new Problem02();

        String actual = p2.magicSquare(3);
        String expected = "Magic Square of size 3"+
                           "-----------------------"+
                             "2   7   6"+
                             "9   5   1"+
                             "4   3   8"+
                           "Sum in each row & each column = 3*(3^2+1)/2 = 15";

        Assert.assertEquals(expected, actual);
    }
}
