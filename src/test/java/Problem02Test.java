import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Problem02Test {

    @Test
    public void magicSquareTest() {
        int num = 3;

        int[][] expected = {{9, 1, 5}, {3, 4, 8}, {6, 7, 2}};

        assertArrayEquals(expected, Problem02.magicSquare(num));
    }

    @Test
    public void magicSquareTest2() {
        int num = 5;

        int[][] expected = {{19, 25, 1, 7, 13}, {24, 5, 6, 12, 18}, {4, 10, 11, 17, 23}, {9, 15, 16, 22, 3}, {14, 20, 21, 2, 8}};

        assertArrayEquals(expected, Problem02.magicSquare(num));
    }

    @Test
    public void magicSquareTest3() {
        int num = 7;

        int[][] expected = {{33, 41, 49, 1, 9, 17, 25}, {40, 48, 7, 8, 16, 24, 32},
                {47, 6, 14, 15, 23, 31, 39}, {5, 13, 21, 22, 30, 38, 46}, {12, 20, 28, 29, 37, 45, 4},
                {19, 27, 35, 36, 44, 3, 11}, {26, 34, 42, 43, 2, 10, 18}};

        assertArrayEquals(expected, Problem02.magicSquare(num));
    }
}
