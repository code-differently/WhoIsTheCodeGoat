import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem05Test {

    Problem05 p5;
    @Before
    public void initialize(){
        p5 = new Problem05();
    }
    @Test
    public void biggerIsGreaterTest(){
        String [] exp = {"ba", "no answer" ,"hegf", "dhkc", "hcdk"};
        String [] act = {"ab","bb","hefg","dhck","dkhc"};

        Assert.assertArrayEquals(exp, p5.biggerIsGreater(act));
    }
    @Test
    public void biggerIsGreaterTest2(){
        String [] exp = {"lmon", "no answer", "no answer", "acbd", "abdc", "fedcbabdc"};
        String [] act = {"lmno", "dcba", "dcbb", "abdc", "abcd", "fedcbabcd"};

        Assert.assertArrayEquals(exp, p5.biggerIsGreater(act));
    }
   @Test
    public void greaterWordTest(){


        Assert.assertEquals("fedcbabdc", p5.greaterWord("fedcbabcd"));
    }
    @Test
    public void greaterWordTest2(){


        Assert.assertEquals("ba", p5.greaterWord("ab"));
    }

    @Test
    public void greaterWordTest3(){


        Assert.assertEquals("no answer", p5.greaterWord("bb"));
    }

}
