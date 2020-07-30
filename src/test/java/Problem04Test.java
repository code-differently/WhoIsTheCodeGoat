import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {

    @Test
    public void Problem04Test1(){
        //Given
        int[] input = {10,3,5,6,2};

        //Expected
        int[] expected = {180,600,360,300,900};
        int[] actual = Problem04.productArrayPuzzle(input);

        //
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void Problem04Test2(){
        //Given
        int[] input = {20,12};

        //Expected
        int[] expected = {12,20};
        int[] actual = Problem04.productArrayPuzzle(input);

        //
        Assert.assertArrayEquals(expected,actual);
    }
}
