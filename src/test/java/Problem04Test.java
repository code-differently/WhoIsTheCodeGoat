import org.junit.Assert;
import org.junit.Test;

public class Problem04Test 
{
    @Test
    public void initializeArray()
    {
        //Given
        Problem04 problem04 = new Problem04();
        Integer[] array = new Integer[5]; 
        //When 
        problem04.intializeArray(array);
        Integer[]expecteds = {1,1,1,1,1};
        Integer[] actuals = array;
        //Then
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void productArrayTest()
    {
        //Given
        Problem04 problem04 = new Problem04();
        Integer[] array = {8};
        //When 
        Integer[]expecteds = {0};
        Integer[]actuals = problem04.productArray(array);
        //Then
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void productArrayTest1()
    {
        //Given
        Problem04 problem04 = new Problem04();
        Integer[] array = {10,3,5,6,2};
        //When 
        Integer[] expecteds = {180,600,360,300,900};
        Integer[] actuals = problem04.productArray(array);
        //Then
        Assert.assertArrayEquals(expecteds, actuals);
    }
    @Test
    public void productArrayTest2()
    {
        //Given
        Problem04 problem04 = new Problem04();
        Integer[]array = {12,20};
        //When
        Integer[] expecteds = {20,12};
        Integer[] actuals = problem04.productArray(array);
        //Then
        Assert.assertArrayEquals(expecteds, actuals);
    }
}
