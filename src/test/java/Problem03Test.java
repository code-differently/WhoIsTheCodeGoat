import org.junit.Test;
import org.junit.Assert;

public class Problem03Test {

    @Test
    public void substringTest1(){
        //Given
        Problem03 prob3 = new Problem03();
        String str = "abcc";
        int k = 2;
        int expected = 2;

        //When
        int actual = prob3.countSubstrings(str, k);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void substringTest2(){
        //Given
        Problem03 prob3 = new Problem03();
        String str = "aabab";
        int k = 3;
        int expected = 0;

        //When
        int actual = prob3.countSubstrings(str, k);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
