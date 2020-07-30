import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem04Test {
    Problem04 p4;
    @Before
    public void initialize(){
        p4 = new Problem04();
    }
    @Test
    public void productArrayTest(){
        int [] exp = {180, 600, 360, 300, 900};
        int [] act = {10, 3, 5, 6, 2};

        Assert.assertArrayEquals(exp, p4.productArray(act));
    }
    @Test
    public void productArrayTest2(){
        int [] exp ={20, 12};

        int [] act = {12, 20};

        Assert.assertArrayEquals(exp, p4.productArray(act));
    }

    @Test
    public void productTest(){
        int  exp = 180;
        int [] act = {10, 3, 5, 6, 2};

        Assert.assertEquals(exp, p4.product(act, 0));
    }
    @Test
    public void productTest2(){
        int exp = 20;

        int [] act = {12, 20};

        Assert.assertEquals(exp, p4.product(act, 0));
    }
}
