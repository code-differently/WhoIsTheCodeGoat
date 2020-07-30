import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem04Test {

    @Test
    public void productPuzzleTest(){
        // Given
        int input []  = {10, 3, 5, 6, 2};

        //When
        int [] expected = {180, 600, 360, 300, 900};
        int[] actual = Problem04.arrayPuzzleBuilder(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void productPuzzleTest2(){
        // Given
        int input []  = {20, 12};

        //When
        int [] expected = {20, 12};
        int[] actual = Problem04.arrayPuzzleBuilder(input);

        //Then
        Assert.assertEquals(expected, actual);
    }





}
