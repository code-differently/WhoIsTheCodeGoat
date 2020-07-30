import org.junit.*;
public class Problem05Test {

  Problem05 p = new Problem05();

  @Test
  public void biggerIsGreaterTest(){
    String[] input = {"ab","bb","hefg","dhck","dkhc"};

    String[] expected = {"ba", "no answer" ,"hegf", "dhkc", "hcdk"};

    String[] actual = p.biggerIsGreater(input);

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void biggerIsGreaterTest2(){
    String[] input = {"lmno","dcba","dcbb","abdc","abcd","fedcbabcd"};

    String[] expected = {"lmon","no answer","no answer","acbd","abdc","fedcbabdc"};

    String[] actual = p.biggerIsGreater(input);

    Assert.assertArrayEquals(expected, actual);
  }
}
