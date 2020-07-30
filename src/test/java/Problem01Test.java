import static org.junit.Assert.*;
import org.junit.Test;



public class Problem01Test {

    @Test
    public void primesSmallerThanNTest() {
        int n = 10;

        int expected = 4;

        assertEquals(expected, Problem01.primesSmallerThanN(n));
    }

    @Test
    public void primesSmallerThanNTest2() {
        int n = 20;

        int expected = 8;

        assertEquals(expected, Problem01.primesSmallerThanN(n));
    }
}
