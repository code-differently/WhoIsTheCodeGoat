import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void parseStringTest1() {
        String given = "ABC";
        String expected = "abc";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseStringTest2() {
        String given = "AbC";
        String expected = "abc";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeUnwanted_ASCII() {
        String given = "a0bce!-";
        String expected = "abce";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findSubstrings() {
        
    }

    @Test
    public void removeDuplicateChars() {

        String given = "aabc";
        String expected = "abc";
        String actual = Problem03.removeDuplicateChars(given);

        Assert.assertEquals(expected, actual);
    }
}
