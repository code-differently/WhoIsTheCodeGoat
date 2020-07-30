import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem04Test {

    Problem04 test;
    String expected;
    String actual;
    Integer [] givenArr;

    @Before
    public void setUp () {

        test = new Problem04();
        expected = "";
        actual = "";

    }

    @Test
    public void createProductArryTest1() {

        givenArr = new Integer[] {10, 3, 5, 6, 2};
        expected = "[180, 600, 360, 300, 900]";

        actual = Arrays.toString(test.createProductArry(givenArr));

        Assert.assertEquals(expected, actual);

    }





}
