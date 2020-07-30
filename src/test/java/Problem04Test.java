import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem04Test {
    Problem04 prob4;

    @Before
    public void initial() {
        prob4 = new Problem04();
    }

    @Test
    public void productArrayTest1() {
        //Given
        int[] arr = {10, 3, 5, 6, 2};
        int[] expected = {180, 600, 360, 300, 900};
    
        //When
        int[] actual = prob4.productArray(arr);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void productArrayTest2() {
        //Given
        int[] array = {12, 20};
        int[] expected = {20, 12};
    
        //When
        int[] actual = prob4.productArray(array);

        //Then
        Assert.assertArrayEquals(expected, actual);   
    }

}