import org.junit.Assert;
import org.junit.Test;

public class Problem05Test {

    @Test
    public void biggerIsGreaterTest() {
        String given = "ab";

        String expected = "ba";

        Assert.assertEquals(expected, Problem05.biggerIsGreater(given));
    }

    @Test
    public void biggerIsGreaterTest2() {
        String given = "bb";

        String expected = "No answer";

        Assert.assertEquals(expected, Problem05.biggerIsGreater(given));
    }

    @Test
    public void biggerIsGreaterTest3() {
        String given = "hefg";

        String expected = "hegf";

        Assert.assertEquals(expected, Problem05.biggerIsGreater(given));
    }

    @Test
    public void biggerIsGreaterTest4() {
        String given = "dhck";

        String expected = "dhkc";

        Assert.assertEquals(expected, Problem05.biggerIsGreater(given));
    }

    @Test
    public void biggerIsGreaterTest5() {
        String given = "dkhc";

        String expected = "hcdk";

        Assert.assertEquals(expected, Problem05.biggerIsGreater(given));
    }
}
