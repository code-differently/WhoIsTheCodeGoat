import org.junit.Assert;
import org.junit.Test;

public class Problem05Test 
{
    @Test
    public void biggerIsGreater()
    {
        //Given
        Problem05 problem05 = new Problem05();
        String input = "abcd";
        //When 
        String actual = problem05.biggerIsGreater(input);
        String expected = "abdc";
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void biggerIsGreater2()
    {
        //Given
        Problem05 problem05 = new Problem05();
         String input = "ab";
        //When 
        String actual= problem05.biggerIsGreater(input);
        String expected = "ba";
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void biggerIsGreater3()
    {
        //Given
        Problem05 problem05 = new Problem05();
        String input = "bb";
        //When
        String expected = "no answer";
        String actual = problem05.biggerIsGreater(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void biggerIsGreater4()
    {
        //Given
        Problem05 problem05 = new Problem05();
        String input = "hefg";
        //When 
        String expected = "hegf";
        String actual = problem05.biggerIsGreater(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void biggerIsGreater5()
    {
        //Given
        Problem05 problem05 = new Problem05();
        String input = "dhck";
        //When 
        String expected = "dhkc";
        String actual = problem05.biggerIsGreater(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    
}

