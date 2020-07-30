import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem04Test {

    Problem04 problem04;

    @Before
    public void setup(){
        this.problem04  = new Problem04();
    }

    @Test
    public void ArrayPuzzleTest1(){
        int[] input = {10, 3, 5, 6, 2};

        int[] expected = {180, 600, 360, 300, 900};
        int[] actual = Problem04.produceArrayPuzzle(input);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ArrayPuzzleTest2(){
        int[] input = {12, 20};

        int[] expected = {20, 12};
        int[] actual = Problem04.produceArrayPuzzle(input);

        Assert.assertArrayEquals(expected, actual);
    }

}
