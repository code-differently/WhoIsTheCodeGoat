import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {
    @Test
    public void countOfSubstringsTest(){
        // Given
        Problem03 aProblem03 = new Problem03();
        Integer expected = 2;

        // When
        Integer actual = aProblem03.countOfSubstrings("abcc", 2);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countOfSubstringsTest2(){
        // Given
        Problem03 aProblem03 = new Problem03();
        Integer expected = 0;

        // When
        Integer actual = aProblem03.countOfSubstrings("aabab", 3);

        // Then
        Assert.assertEquals(expected,actual);
    }
}
