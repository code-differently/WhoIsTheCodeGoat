import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem04Test {
    private Problem04 problem04;

    @Before
    public void setup() {
        problem04 = new Problem04();
    }

    @Test
    public void computeProductArray() {
        int[] expected = {180, 600, 360, 300, 900};

        int[] actual = problem04.computeProductArray(10, 3, 5, 6, 2);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void computeProductArray2() {
        int[] expected = {20, 12};

        int[] actual = problem04.computeProductArray(12, 20);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
