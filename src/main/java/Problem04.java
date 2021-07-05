import java.util.Arrays;

public class Problem04 {
    public int[] computeProductArray(int ...array) {
        int[] productArray = new int[array.length];

        for(int outerIndex = 0; outerIndex < array.length; outerIndex++) {
            productArray[outerIndex] = 1;
            for(int innerIndex = 0; innerIndex < array.length; innerIndex++) {
                productArray[outerIndex] *= array[innerIndex];
            }
            productArray[outerIndex] /= array[outerIndex];
        }
        return productArray;
    }
}
