import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class Problem04Test {

    @Test
    public void productArrayPuzzleTest() {
        int[] input = {10, 3, 5, 6, 2};

        int[] expected = {180, 600, 360, 300, 900};

        assertTrue(Arrays.equals(expected, Problem04.productArray(input)));
    }

    @Test
    public void productArrayPuzzleTest2() {
        int[] input = {12, 20};


        int[] expected = {20, 12};

        assertTrue(Arrays.equals(expected, Problem04.productArray(input)));
    }
}
