import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {
    Problem03 prob3;

    @Before
    public void initial() {
        prob3 = new Problem03();
    }

    @Test
    public void distinctTest1() {
        //Given
        int expected = 2;

        //When
        int actual = prob3.numberOfDistinctSub("abcc", 2);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void disctinctTest2() {
        // Given
        int expected = 0;

        // When
        int actual = prob3.numberOfDistinctSub("aabab", 3);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void disctinctTest3() {
        // Given
        int expected = 3;

        // When
        int actual = prob3.numberOfDistinctSub("abccd", 2);

        //Then
        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void trueFalseTest() {
        // Given
        boolean expected = false;

        // When
        boolean actual = prob3.isDistinct("ababab");

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trueFalseTest2() {
        // Given
        boolean expected = true;

        // When
        boolean actual = prob3.isDistinct("cd");

        //Then
        Assert.assertEquals(expected, actual);
    }
}