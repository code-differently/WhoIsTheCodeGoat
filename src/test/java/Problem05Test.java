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
        String input = "ba";
        String expected = "ab";

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
}
