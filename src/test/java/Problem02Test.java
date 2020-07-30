import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem02Test 
{

    @Test
    public void magicSquareTest1()
    {
        //given
        int size = 3;

        //when
        int expected = 15;
        int actual = Problem02.magicSquare(size);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void magicSquareTest2()
    {
        //given
        int size = 5;

        //when
        int expected = 65;
        int actual = Problem02.magicSquare(size);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void magicSquareTest3()
    {
        //given
        int size = 7;

        //when
        int expected = 175;
        int actual = Problem02.magicSquare(size);

        //then
        assertEquals(expected, actual);
    }
}