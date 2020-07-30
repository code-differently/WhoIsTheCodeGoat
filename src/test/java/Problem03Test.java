import org.junit.Assert;
import org.junit.Test;
    public class Problem03Test {
        @Test
        public void countingSubstringsTest(){
            String str = "abcc";
            int k = 2;
            Problem03 problem03 = new Problem03();
            int expected = 2;
            int actual = problem03.countOfSubstrings(str, k);
            Assert.assertEquals(expected,actual);
        }
        @Test
        public void countingSubstrings2Test(){
            String str = "aabab";
            int k = 3;
            Problem03 problem03 = new Problem03();
            int expected = 0;
            int actual = problem03.countOfSubstrings(str, k);
            Assert.assertEquals(expected,actual);
        }



}
