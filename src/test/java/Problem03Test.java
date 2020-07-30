import org.junit.*;

public class Problem03Test {
  Problem03 p = new Problem03();
  
  @Test
  public void countOfSubstrings(){
    String s = "abcc";
    int K = 2;
    int expected = 2; 

    int actual = p.countOfSubstrings(s, K);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void countOfSubstrings2(){
    String s = "aabab";
    int K = 3;
    int expected = 0; 

    int actual = p.countOfSubstrings(s, K);

    Assert.assertEquals(expected, actual);
  }

}