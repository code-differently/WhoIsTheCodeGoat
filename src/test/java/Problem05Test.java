import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Problem05Test {
    @Test
    public void isInReverseOrderTest(){
        //Given
        Problem05 prac = new Problem05();
        String str = "cba";
        //When
        boolean actual = prac.reverseAlphabetChecker(str);
        //Then
        Assert.assertTrue(actual);
    }
    
    @Test
    public void isInReverseOrderTest2(){
        //Given
        Problem05 prac = new Problem05();
        String str = "cab";
        //When
        boolean actual = prac.reverseAlphabetChecker(str);
        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void isLongerThanOne(){
        //Given
        Problem05 prac = new Problem05();
        String str = "aaa";
        //When
        boolean actual = prac.isNotLongerThanOne(str);
        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void isLongerThanOne2(){
        //Given
        Problem05 prac = new Problem05();
        String str = "a";
        //When
        boolean actual = prac.isNotLongerThanOne(str);
        //Then
        Assert.assertTrue(actual);
    }


    @Test
    public void isAllSameCharactersTest(){
        //Given
        Problem05 prac = new Problem05();
        String str = "aaa";
        //When
        boolean actual = prac.isAllSameCharacters(str);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isAllSameCharactersTest2(){
        //Given
        Problem05 prac = new Problem05();
        String str = "aba";
        //When
        boolean actual = prac.isAllSameCharacters(str);
        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void biggerIsGreaterTest(){
        //Given
        Problem05 prac = new Problem05();
        String[] strArray = {"ab","bb","cab"};
        //When
        String[] actual = prac.biggerIsGreater(strArray);
        String[] expected = {"ba","no answer","cba"};
        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterTest2(){
        //Given
        Problem05 prac = new Problem05();
        String[] strArray = {"ab","bb","hefg","dhck","dkhc"};
        //When
        String[] actual = prac.biggerIsGreater(strArray);
        String[] expected = {"ba", "no answer" ,"hgfe", "khdc", "khdc"};
        //Then
        Assert.assertArrayEquals(expected, actual);
    }
}
