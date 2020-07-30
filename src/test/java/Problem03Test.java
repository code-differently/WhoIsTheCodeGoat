import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem03Test {

    Problem03 p3;
    @Before
    public void initialize(){
        p3 = new Problem03();
    }
    @Test
    public void countSubstringsTest(){
        int exp = 2;
        int act = p3.countSubstrings("abcc", 2);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void countSubstringsTest2(){
        int exp = 0;
        int act = p3.countSubstrings("aabab", 3);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void isDistinctTest(){
        boolean exp = true;
        boolean act =  p3.isDistinct("ab");
        Assert.assertEquals(exp, act);
    }
    @Test
    public void isDistinctTest2(){
        boolean exp = false;
        boolean act = p3.isDistinct("aab");
        Assert.assertEquals(exp, act);
    }
}
