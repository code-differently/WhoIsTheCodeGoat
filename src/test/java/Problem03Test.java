import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void distinctSubStringsTest1(){
        Problem03 p3 = new Problem03();
        String str = "abcc";
        int distinctChars = 2;

        int actual = p3.distinctSubStrings(str, distinctChars);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void distinctSubStringsTest2(){
        Problem03 p3 = new Problem03();
        String str = "aabab";
        int distinctChars = 3;

        int actual = p3.distinctSubStrings(str, distinctChars);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isDistinctTestTrue(){
        Problem03 p3 = new Problem03();

        String sub = "abc";
        boolean actual = p3.isDistinct(sub);

        Assert.assertTrue(actual);
    }

    @Test
    public void isDistinctTestFalse(){
        Problem03 p3 = new Problem03();

        String sub = "abb";
        boolean actual = p3.isDistinct(sub);

        Assert.assertFalse(actual);
    }

}
