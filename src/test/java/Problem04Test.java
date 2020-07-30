import org.junit.*;

public class Problem04Test {
  Problem04 p = new Problem04();

  @Test 
  public void productArray(){
    int[] i = {10, 3, 5, 6, 2};
    Object[] expected = {180, 600, 360, 300, 900};

    Object[] actual = p.productArray(i); 

    Assert.assertArrayEquals(expected, actual);
  }

  @Test 
  public void productArray2(){
    int[] i = {12, 20};
    Object[] expected = {20, 12};

    Object[] actual = p.productArray(i); 

    Assert.assertArrayEquals(expected, actual);
  }


}
