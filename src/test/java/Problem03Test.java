import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test 
    public void countSubstringDinstict2(){
        //Given
        String expected = "2";
        String input = "abcc";
        //When
        int actual = Problem03.countSubstring(input, 2);
        //Then
        Assert.assertEquals(expected, actual);
    }

}
