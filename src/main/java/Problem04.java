import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem04 {

    public static int[] productArray(int[] arr) {
        int[] product = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int answer = 1;
            for (int num : arr) {
                answer *= num;
            }
            answer /= arr[i];
            product[i] = answer;
        }
        return product;
    }
}
