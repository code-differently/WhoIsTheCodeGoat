import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem03Test
{   
    @Test
    public void countOfSubstringsTest1()
    {
        //given
        String str = "abc";
        int K = 2;

        //when
        int actual = Problem03.countOfSubstrings(str, K);
        int expected = 2;

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void countOfSubstringsTest2()
    {
        //given
        String str = "aabab";
        int K = 3;

        //when
        int actual = Problem03.countOfSubstrings(str, K);
        int expected = 0;

        //then
        assertEquals(expected, actual);
    }
}
