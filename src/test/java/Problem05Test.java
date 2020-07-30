import org.junit.Assert;
import org.junit.Test;

public class Problem05Test {

    @Test
    public void biggerIsGreaterTest1(){
        Problem05 p5 = new Problem05();

        String actual = p5.biggerIsGreater("ab");
        String expected = "ba";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterTest2(){
        Problem05 p5 = new Problem05();

        String actual = p5.biggerIsGreater("bb");
        String expected = "no answer";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterTest3(){
        Problem05 p5 = new Problem05();

        String actual = p5.biggerIsGreater("dhck");
        String expected = "dhkc";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void biggerIsGreaterTest4(){
        Problem05 p5 = new Problem05();

        String actual = p5.biggerIsGreater("dkhc");
        String expected = "hcdk";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLexiographicalArrayTest(){
        Problem05 p5 = new Problem05();
        String[] lexiArray = {"ab","bb","hefg","dhck","dkhc"};

        String[] actual = p5.getLexiographicalArray(lexiArray);
        String[] expected = {"ba", "no answer" ,"hegf", "dhkc", "hcdk"};

        Assert.assertArrayEquals(expected, actual);
    }
}
