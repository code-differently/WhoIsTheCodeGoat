import org.junit.Assert;
import org.junit.Test;

public class Problem05Test {

   @Test
    public void biggerIsGreaterTest01(){
        //Given
        Problem05 problem05 = new Problem05();
        String input = "ab";
        String expected = "ba";

        //When
        String actual = problem05.biggerIsGreater(input);

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void biggerIsGreaterTest02(){
        //Given
        Problem05 problem05 = new Problem05();
        String input = "bb";
        String expected = "no answer";

        //When
        String actual = problem05.biggerIsGreater(input);

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void biggerIsGreaterTest03(){
        //Given
        Problem05 problem05 = new Problem05();
        String input = "hefg";
        String expected = "hegf";

        //When
        String actual = problem05.biggerIsGreater(input);

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void biggerIsGreaterTest04(){
        //Given
        Problem05 problem05 = new Problem05();
        String input = "dhck";
        String expected = "dhkc";

        //When
        String actual = problem05.biggerIsGreater(input);

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void biggerIsGreaterTest05(){
        //Given
        Problem05 problem05 = new Problem05();
        String input = "dkhc";
        String expected = "hcdk";

        //When
        String actual = problem05.biggerIsGreater(input);

        //Then
        Assert.assertEquals(expected,actual);

    }


}
