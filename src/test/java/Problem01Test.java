import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem01Test {
    private Problem01 problem01;

    @Before
    public void setup() {
        problem01 = new Problem01();
    }

    @Test
    public void primeNumbersBefore10() {
        String expected = "2 3 5 7";

        String actual = problem01.computeAllPrimesSmallerThanEqualToN(10);

        assertEquals(expected, actual);
    }

    @Test
    public void primeNumbersBefore20() {
        String expected = "2 3 5 7 11 13 17 19";

        String actual = problem01.computeAllPrimesSmallerThanEqualToN(20);

        assertEquals(expected, actual);
    }

    @Test
    public void primeNumbersBefore100() {
        String expected = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97";

        String actual = problem01.computeAllPrimesSmallerThanEqualToN(100);

        assertEquals(expected, actual);
    }
}
