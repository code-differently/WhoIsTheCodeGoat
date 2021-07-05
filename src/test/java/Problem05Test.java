import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem05Test {
    private Problem05 problem05;

    @Before
    public void setup() {
        problem05 = new Problem05();
    }

    @Test
    public void biggerIsGreaterNoAnswerTest() {
        String input = "bb";
        String expected = "no answer";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion1Test() {
        String input = "ab";
        String expected = "ba";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion2Test() {
        String input = "hefg";
        String expected = "hegf";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion3Test() {
        String input = "dhck";
        String expected = "dhkc";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion4Test() {
        String input = "dkhc";
        String expected = "hcdk";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion5Test() {
        String input = "lmno";
        String expected = "lmon";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion6Test() {
        String input = "dcba";
        String expected = "no answer";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion7Test() {
        String input = "dcbb";
        String expected = "no answer";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion8Test() {
        String input = "abdc";
        String expected = "acbd";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion9Test() {
        String input = "abcd";
        String expected = "acdc";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterSuggestion10Test() {
        String input = "fedcbabcd";
        String expected = "fedcbabdc";

        String actual = problem05.biggerIsGreater(input);

        Assert.assertEquals(expected, actual);
    }

}
