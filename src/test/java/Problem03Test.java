import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void uniqueCharsTest(){
        // Given
        String test="abcde";

        // When
        boolean actual=Problem03.isUniqueChars(test);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void uniqueCharsTest2(){
        // Given
        String test="abcdea";

        // When
        boolean actual=Problem03.isUniqueChars(test);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void uniqueCharsTest3(){
        // Given
        String test="abcdez3910";

        // When
        boolean actual=Problem03.isUniqueChars(test);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void uniqueSubTest(){
        // Given
        String test="abcc";
        int expected=2;

        // When
        int actual=Problem03.uniqueSubstring(test,2);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void uniqueSubTest2(){
        // Given
        String test="aabab";
        int expected=0;

        // When
        int actual=Problem03.uniqueSubstring(test,3);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void uniqueSubTest3(){
        // Given
        String test="abcdefg";
        int expected=5;

        // When
        int actual=Problem03.uniqueSubstring(test,2);

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void uniqueSubTest4(){
        // Given
        String test="-1a2bc2defg";
        int expected=9;

        // When
        int actual=Problem03.uniqueSubstring(test,2);

        // Then
        Assert.assertEquals(expected,actual);

    }

}
