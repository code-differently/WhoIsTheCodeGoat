import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class Problem01Test {
  Problem01 p = new Problem01();

  @Test
  public void sieveOfEratosthenesTest(){
    int n = 10; 
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(3);
    expected.add(5);
    expected.add(7);

    List<Integer> actual = p.sieveOfEratosthenes(n);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void sieveOfEratosthenesTest2(){
    int n = 20; 
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(3);
    expected.add(5);
    expected.add(7);
    expected.add(11);
    expected.add(13);
    expected.add(17);
    expected.add(19);

    List<Integer> actual = p.sieveOfEratosthenes(n);

    Assert.assertEquals(expected, actual);
  }

}
