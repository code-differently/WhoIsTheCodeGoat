import org.junit.Assert;
import org.junit.Test;



public class Problem04Test {
    @Test
    public void productArrayGenTest(){
        //Given
        Problem04 prac = new Problem04();
        Integer[] arr = {10,3,5,6,2};
        //When
        Integer[] actual = prac.productArrayGen(arr);
        Integer[] expected = {180,600,360,300,900};
        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void productArrayGenTest2(){
        //Given
        Problem04 prac = new Problem04();
        Integer[] arr = {12,20};
        //When
        Integer[] actual = prac.productArrayGen(arr);
        Integer[] expected = {20,12};
        //Then
        Assert.assertArrayEquals(expected, actual);
    }
}
