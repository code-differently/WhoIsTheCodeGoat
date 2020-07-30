import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {
    @Test
    public void productArrayPuzzleTest(){
        // Given
        Problem04 aProblem04 = new Problem04();
        Integer[] expected = {180,600,360,300,900};

        // When
        Integer[] intArr = {10,3,5,6,2};
        Integer[] actual = aProblem04.productArrayPuzzle(intArr);

        // Then
        //Assert.assertEquals(expected,actual);

    }
}
