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
    public void magicSquareSizeOf3Test() {
        String expected =   "Magic Square of size 3\n" +
                            "----------------------\n" +
                            " 2  7  6 \n" +
                            " 9  5  1 \n" +
                            " 4  3  8 \n" +
                            "Sum in each row & each column = 3*(3^2+1)/2 = 15";

        String actual = problem02.magicSquare(3);

        assertEquals(expected, actual);
    }

    @Test
    public void magicSquareSizeOf5Test() {
        String expected =   "Magic Square of size 5\n" +
                            "----------------------\n" +
                            "  9   3  22  16  15\n" +
                            "  2  21  20  14   8\n" +
                            " 25  19  13   7   1\n" +
                            " 18  12   6   5  24\n" +
                            " 11  10   4  23  17\n" +
                            "Sum in each row & each column = 5*(5^2+1)/2 = 65";

        String actual = problem02.magicSquare(5);

        assertEquals(expected, actual);
    }

    @Test
    public void magicSquareSizeOf7Test() {
        String expected =   "Magic Square of size 7\n" +
                            "----------------------\n" +
                            " 20  12   4  45  37  29  28\n" +
                            " 11   3  44  36  35  27  19\n" +
                            "  2  43  42  34  26  18  10\n" +
                            " 49  41  33  25  17   9   1\n" +
                            " 40  32  24  16   8   7  48\n" +
                            " 31  23  15  14   6  47  39\n" +
                            " 22  21  13   5  46  38  30\n" +
                            "Sum in each row & each column = 7*(7^2+1)/2 = 175";

        String actual = problem02.magicSquare(7);

        assertEquals(expected, actual);
    }
}
