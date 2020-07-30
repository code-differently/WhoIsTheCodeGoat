import org.junit.*;


public class Problem02Test {

  Problem02 p = new Problem02();
  int[][] ro = {{8, 1 , 6}, {3, 5, 7}, {4, 9, 2}}; 

  @Test
  public void magicSquareTest(){
    int n = 3;
    String s =  "2 7 6 \n9 5 1 \n4 3 8 \n"; 

    String actual = p.magicSquareGenerator(n);

    Assert.assertEquals(s, actual);

  }

  @Test
  public void magicSquareTest2(){
    int n = 5;
    String s =  "9 3 22 16 15 \n2 21 20 14 8 \n25 19 13 7 1 \n18 12 6 5 24 \n11 10 4 23 17 \n"; 

    String actual = p.magicSquareGenerator(n);

    Assert.assertEquals(s, actual);

  }

  @Test
  public void magicSquareTest3(){
    int n = 7;
    String s =  "20 12 4 45 37 29 28 \n11 3 44 36 35 27 19 \n2 43 42 34 26 18 10 \n49 41 33 25 17 9 1 \n40 32 24 16 8 7 48 \n31 23 15 14 6 47 39 \n22 21 13 5 46 38 30 \n"; 

    String actual = p.magicSquareGenerator(n);

    Assert.assertEquals(s, actual);

  }

  @Test 
  public void rotateBy90Clockwise(){

    int[][] expected = {{4,3,8},{9, 5, 1}, {2, 7, 6}};
    int[][] actual = p.rotateBy90Clockwise(ro);

    Assert.assertArrayEquals(expected, actual);

  }

  @Test
  public void flipArray(){

    int[][] a = {{4,3,8},{9, 5, 1}, {2, 7, 6}};
    int[][] expected = {{2, 7, 6,}, {9, 5, 1}, {4, 3, 8}}; 

    int[][] actual = p.flipArray(a);

    Assert.assertArrayEquals(expected, actual);


  }

}
