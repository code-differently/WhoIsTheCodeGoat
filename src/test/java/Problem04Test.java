import org.junit.Assert;
import org.junit.Test;

public class Problem04Test
{

    @Test
    public void testProductPuzzleOne()
    {
        int[] expectedOutput = {180,600,360,300,900};
        int[] realOutput = new Problem04().productPuzzle(new int[]{10,3,5,6,2});

        int sumExpected = 0;
        for(int i = 0; i < expectedOutput.length; i++)
        {
            sumExpected += expectedOutput[i];
        }
        int sumObtained = 0;
        for(int i = 0; i < realOutput.length; i++)
        {
            sumObtained += realOutput[i];
        }


        Assert.assertEquals(sumExpected, sumObtained);
    }

    @Test
    public void testProductPuzzleTwo()
    {
        int[] expectedOutput = {20,12};
        int[] realOutput = new Problem04().productPuzzle(new int[]{12,20});

        int sumExpected = 0;
        for(int i = 0; i < expectedOutput.length; i++)
        {
            sumExpected += expectedOutput[i];
        }
        int sumObtained = 0;
        for(int i = 0; i < realOutput.length; i++)
        {
            sumObtained += realOutput[i];
        }


        Assert.assertEquals(sumExpected, sumObtained);
    }
}
