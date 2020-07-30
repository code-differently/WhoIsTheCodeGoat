import org.junit.Assert;
import org.junit.Test;
public class Problem04Test {

    public void productArrayTest01(){
        //Given
        Problem04 problem04 = new Problem04();
        int [] input = {10, 3, 5, 6, 2};
        int[] expected = {180, 600, 360, 300, 900};

        //When
        int[] actual = problem04.productArray(input);

        //Then
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void productArrayTest02(){
        //Given
        Problem04 problem04 = new Problem04();
        int[] input = {12, 20};
        int[] expected = {20, 12};

        //When
        int[] actual = problem04.productArray(input);

        //Then
        Assert.assertArrayEquals(expected, actual);

    }

    }
