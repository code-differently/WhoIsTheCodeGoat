import org.junit.Assert;
import org.junit.Test;

public class Problem02Test
{
    @Test
    public void magicSquareTestOne()
    {
        int[][] expected = {
                {2,7,6},
                {9,5,1},
                {4,3,8}
        };

        int sumExpected = 0;
        for(int i = 0; i < expected.length; i++)
        {
            for(int j = 0; j < expected[i].length; j++)
            {
                sumExpected += expected[i][j];
            }
        }

        int sumActual = 0;
        int[][] realValue = new Problem02().magicSquare(3);

        for(int i = 0; i < realValue.length; i++)
        {
            for(int j = 0; j < realValue[i].length; j++)
            {
                sumActual += realValue[i][j];
            }
        }

        Assert.assertEquals(sumExpected, sumActual);
    }

    @Test
    public void magicSquareSumTwo()
    {
        int[][] expected = {
                {9,3,22,16,15},
                {2,21,20,14,8},
                {25,19,13,7,1},
                {18,12,6,5,24},
                {11,10,4,23,17}
        };

        int sumExpected = 0;
        for(int i = 0; i < expected.length; i++)
        {
            for(int j = 0; j < expected[i].length; j++)
            {
                sumExpected += expected[i][j];
            }
        }

        int sumActual = 0;
        int[][] realValue = new Problem02().magicSquare(5);

        for(int i = 0; i < realValue.length; i++)
        {
            for(int j = 0; j < realValue[i].length; j++)
            {
                sumActual += realValue[i][j];
            }
        }

        Assert.assertEquals(sumExpected, sumActual);
    }

    @Test
    public void magicSquareTest3()
    {
        int[][] expected = {
                {20,12,4,45,37,29,28},
                {11,3,44,36,35,27,19},
                {2,43,42,34,26,18,10},
                {49,41,33,25,17,9,1},
                {40,32,24,16,8,7,48},
                {31,23,15,14,6,47,39},
                {22,21,13,5,46,38,30}
        };

        int sumExpected = 0;
        for(int i = 0; i < expected.length; i++)
        {
            for(int j = 0; j < expected[i].length; j++)
            {
                sumExpected += expected[i][j];
            }
        }

        int sumActual = 0;
        int[][] realValue = new Problem02().magicSquare(7);

        for(int i = 0; i < realValue.length; i++)
        {
            for(int j = 0; j < realValue[i].length; j++)
            {
                sumActual += realValue[i][j];
            }
        }

        Assert.assertEquals(sumExpected, sumActual);
    }
}
