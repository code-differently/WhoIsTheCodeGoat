public class Problem04 {

    public static int[] productArrayPuzzle(int[] inputArray){
        int[] productArray = new int[inputArray.length];
        productArray[0] = 1;

        for(int i=0; i<inputArray.length; i++){
            productArray[0] *= inputArray[i];
        }
        for(int j=1; j<inputArray.length; j++){
            productArray[j] = productArray[0];
        }
        for(int k=0; k<inputArray.length; k++){
            productArray[k] /= inputArray[k];
        }
        return productArray;
    }
}
