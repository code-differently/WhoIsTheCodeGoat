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

  @Test 
  public void stringTest(){
    String s = "lmno"; 

    String expected = "lmon"; 


    String actual = p.validate(s);
    System.out.println(actual);
    
    Assert.assertTrue(expected.equals(actual));;
  }

  @Test 
  public void stringTest2(){
    String s = "dcba"; 

    String expected = "no answer"; 


    String actual = p.validate(s);
    System.out.println(actual);
    
    Assert.assertTrue(expected.equals(actual));;
  }


}
