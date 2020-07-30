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
}