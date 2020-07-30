import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {
    @Test
   public void getAllSubStringsTest(){
       //Given
        Problem03 prac = new Problem03();
        String[] actual = prac.getAllSubStrings(2, "abcc");
       //When
        String[] expected = {"ab","bc","cc"};
       //Then
       Assert.assertArrayEquals(expected, actual);
   }

   @Test
   public void getAllSubStringsTest2(){
       //Given
        Problem03 prac = new Problem03();
        String[] actual = prac.getAllSubStrings(3, "aabab");
       //When
        String[] expected = {"aab","aba","bab"};
       //Then
       Assert.assertArrayEquals(expected, actual);
   }
   @Test
   //Objective-C naming convention type beat
   public void isSubStringUniqueTest(){
    //Given
    Problem03 prac = new Problem03();
    String sub = "bcc";
    //When
    boolean actual = prac.isSubStringUnique(sub);
    //Then
    Assert.assertFalse(actual);
   }

   @Test
   //Objective-C naming convention type beat
   public void isSubStringUniqueTest2(){
    //Given
    Problem03 prac = new Problem03();
    String sub = "abc";
    //When
    boolean actual = prac.isSubStringUnique(sub);
    //Then
    Assert.assertTrue(actual);
   }

   @Test
   public void countOfSubStringsTest(){
       //Given
        Problem03 prac = new Problem03();
        String stringy = "abcc";
        int length = 2;
       //Then
        String[] actual = prac.countOfSubstrings(stringy, length);
        String[] expected = {"ab","bc"};
       //When
        Assert.assertArrayEquals(expected, actual);
   }

   @Test
   public void countOfSubStringsTest2(){
       //Given
        Problem03 prac = new Problem03();
        String stringy = "abcc";
        int length = 3;
       //Then
        String[] actual = prac.countOfSubstrings(stringy, length);
        String[] expected = {"abc"};
       //When
        Assert.assertArrayEquals(expected, actual);
   }



   
}
