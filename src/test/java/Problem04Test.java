import org.junit.Assert;
import org.junit.Test;

public class Problem04Test {

    @Test
    public void productsTest(){
        // Given
        int[] test={12,20};
        int[] expected={20,12};

        // When
        int[] actual=Problem04.productsArray(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void productsTest2(){
        // Given
        int[] test={1};
        int[] expected={1};

        // When
        int[] actual=Problem04.productsArray(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void productsTest3(){
        // Given
        int[] test={};
        int[] expected={};

        // When
        int[] actual=Problem04.productsArray(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void productsTest4(){
        // Given
        int[] test={10, 3, 5, 6, 2};
        int[] expected={180, 600, 360, 300, 900};

        // When
        int[] actual=Problem04.productsArray(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void productsTest5(){
        // Given
        int[] test={12,44,33,10,0,10};
        int[] expected={0,0,0,0,1742400,0};

        // When
        int[] actual=Problem04.productsArray(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void productsTest6(){
        // Given
        int[] test={-3,4,1,-4};
        int[] expected={-16,12,48,-12};

        // When
        int[] actual=Problem04.productsArray(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }
}
