import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Problem05Test {

    @Test
    public void biggerIsGreaterForArrayTest() {
        // Given
        Problem05 p5 = new Problem05();
        String[] input = {"ab","bb","hefg","dhck","dkhc"};
        String expected = "Input : [ab, bb, hefg, dhck, dkhc]\n" +
                "Output : [ba, no answer, hegf, dhkc, hcdk]";

        // When
        String actual = p5.biggerIsGreaterForArray(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterForArrayTest2() {
        // Given
        Problem05 p5 = new Problem05();
        String[] input = {
                "lmno",
                "dcba",
                "dcbb",
                "abdc",
                "abcd",
                "fedcbabcd"};
        String expected = "Input : [" +
                "lmno," +
                " dcba," +
                " dcbb," +
                " abdc," +
                " abcd," +
                " fedcbabcd]" +
                "\nOutput : [" +
                "lmon," +
                " no answer," +
                " no answer," +
                " acbd," +
                " abdc," +
                " fedcbabdc]";

        // When
        String actual = p5.biggerIsGreaterForArray(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterForStringTest() {
        // Given
        Problem05 p5 = new Problem05();
        String input = "dkhc";
        String expected = "hcdk";

        // When
        String actual = p5.biggerIsGreaterForString(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterForStringTest2() {
        // Given
        Problem05 p5 = new Problem05();
        String input = "hefg";
        String expected = "hegf";

        // When
        String actual = p5.biggerIsGreaterForString(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findLastSmallerThanNextIndexTest() {
        // Given
        Problem05 p5 = new Problem05();
        char[] input = "dhck".toCharArray();
        int expected = 2;

        // When
        int actual = p5.findLastSmallerThanNextIndex(input);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findLastLetterGreaterThanLSTNITest() {
        // Given
        Problem05 p5 = new Problem05();
        char[] input = "dhck".toCharArray();
        int expected = 3;

        // When
        int actual = p5.findLastLetterGreaterThanLSTNI(input, 2);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapTest() {
        // Given
        Problem05 p5 = new Problem05();
        char[] input = {'a', 'b', 'c'};
        String expected = "[c, b, a]";

        // When
        char[] output = p5.swap(input, 0, 2);
        String actual = Arrays.toString(output);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
