import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem02Test {
    private Problem02 problem02;

    @Before
    public void setup() {
        problem02 = new Problem02();
    }

    @Test
    public void magicSquareTest() {
        String expected = "Magic Square of size 3\n" +
                        "-----------------------\n" +
                        " 2  7  6 \n" +
                        " 9  5  1 \n" +
                        " 4  3  8 \n" +
                        "Sum in each row & each column = 3*(3^2+1)/2 = 15";

        String actual = problem02.magicSquare(3);

        assertEquals(expected, actual);
    }
}
