public class Problem04 {

    public int[] compute (int[] arr) {
        if (arr.length < 2)
            return arr;

        int[] prod = new int[arr.length];
        prod[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            prod[i] = prod[i-1] * arr[i-1];
        }

        int val = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            prod[i] = val * prod[i];
            val *= arr[i];
        }

        return prod;
    }

}
