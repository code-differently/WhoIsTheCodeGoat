import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void countSubStringsForNTest(){
        // Given
        Problem03 p = new Problem03();
        String input = "abcc";
        Integer n = 2;
        // When
        Integer expected = 2;
        Integer actual = p.countSubStringsForN(input, n);
        // Then
        Assert.assertEquals(expected, actual);

    }
}
