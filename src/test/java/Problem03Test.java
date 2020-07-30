
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {

    Problem03 test;
    Integer expected;
    Integer actual;
    Integer SubstringToCountLength;
    String givenString;
    Integer substringToCountLength;

    @Before
    public void setUp(){

        test = new Problem03();
        expected = 0;
        actual = 0;
    }

    @Test
    public void countOfSubstringsTest(){

        givenString = "abcc";
        substringToCountLength = 2;
        expected = 2;

        actual = test.countOfSubstrings(givenString, substringToCountLength);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countOfSubstringsTest2(){

        givenString = "aabab";
        substringToCountLength = 3;
        expected = 0;

        actual = test.countOfSubstrings(givenString, substringToCountLength);

        Assert.assertEquals(expected,actual);
    }



}





