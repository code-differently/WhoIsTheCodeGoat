import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test {

    Problem01 test;
    String expected;
    String actual;
    int givenNumber;


    @Before
    public void setUp(){
    test = new Problem01();
    expected = "";
    actual = "";
    givenNumber = 0;

    }

    @Test
    public void printPrimeNumbersUntilTest01() {
        givenNumber = 10;
        expected = " 2 3 5 7";

        actual = test.printPrimeNumbersUntil(givenNumber);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printPrimeNumbersUntilTest02() {
        givenNumber = 20;
        expected = " 2 3 5 7 11 13 17 19";

        actual = test.printPrimeNumbersUntil(givenNumber);

        Assert.assertEquals(expected, actual);

    }




}
