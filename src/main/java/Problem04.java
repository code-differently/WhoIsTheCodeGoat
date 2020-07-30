public class Problem04 {

    public static int[] produceArrayPuzzle(int[] input){

        int[] productArray = new int[input.length];
        productArray[0] = 1;

        for(int i = 0; i < input.length; i++) {
            productArray[0] *= input[i]; // loop: multiply each element in array
        }
        for(int j = 1; j < input.length; j++) { // loop: replaces elements with products total
            productArray[j] = productArray[0];
        }
        for(int k = 0; k < input.length; k++) { //loop: divides product total by original input
            productArray[k] /= input[k];
        }
        return productArray;
    }
}
