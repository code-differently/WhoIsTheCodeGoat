import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

public class Problem04Test {

    @Test
    public void arrayPuzzle01Test(){
        //Given
        Problem04 prob4 = new Problem04();
        int[] arr = {10, 3, 5, 6, 2};
        int[] expected = {180, 600, 360, 300, 900};
        String expectedString = Arrays.toString(expected);
        System.out.println(expected.toString());

        //When
        int[] actual = prob4.compute(arr);
        String actualString = Arrays.toString(actual);
        System.out.println(actual.toString());

        //Then
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void arrayPuzzle02Test(){
        //Given
        Problem04 prob4 = new Problem04();
        int[] arr = {12, 20};
        int[] expected = {20, 12};
        String expectedString = Arrays.toString(expected);
        System.out.println(expected.toString());

        //When
        int[] actual = prob4.compute(arr);
        String actualString = Arrays.toString(actual);
        System.out.println(actual.toString());

        //Then
        Assert.assertEquals(expectedString, actualString);
    }
}
