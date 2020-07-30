import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {

    @Test
    public void productArrayTest(){
        Problem04 p4 = new Problem04();

        int[] actual = p4.productArray(new int[] {10, 3, 5, 6, 2});
        int[] expected = {180, 600, 360, 300, 900};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getProductTest1(){
        Problem04 p4 = new Problem04();
        int[] arr = new int[] {10, 3, 5, 6, 2};

        int actual = p4.getProduct(arr, 1);
        int expected = 600;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getProductTest2(){
        Problem04 p4 = new Problem04();
        int[] arr = new int[] {10, 3, 5, 6, 2};

        int actual = p4.getProduct(arr, 3);
        int expected = 300;

        Assert.assertEquals(expected, actual);
    }
}
