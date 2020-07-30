import java.util.ArrayList;

public class Problem01 {

    public static int primesSmallerThanN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            // edge case
            if (i == 2) {
                count++;
                // edge case
            } else if (i == 3) {
                count++;
            }
            // everything else after 3 can't have a remainder divided by 2 nor be divisible by 3
            else if (i % 2 != 0) {
                if (i % 3 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
