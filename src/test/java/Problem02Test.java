import org.junit.Assert;
import org.junit.Test;

public class Problem02Test {
    @Test
    public void magicSquareGenTest(){
        //Given
        Problem02 prac = new Problem02();
        //When
        prac.magicSquareGen(3);
        String expected = "8   1   6   " +
                          "3   5   7   " +
                          "4   9   2";
        String actual = prac.magicSquareGen(3);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void magicSquareGenTest2(){
        //Given
        Problem02 prac = new Problem02();
        //When
        prac.magicSquareGen(5);
        String expected = "17   24   1   8   15   " +
                          "23   5   7   14   16   " +
                          "4   6   13   20   22   " +
                          "10   12   19   21   3   " +
                          "11   18   25   2   9";
        String actual = prac.magicSquareGen(5);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
