public class Problem04 {

    public static int[] productArrayPuzzle(int[] inputArray){
        int[] productArray = new int[inputArray.length];
        productArray[0] = 1;
        //gets total product
        for(int i=0; i<inputArray.length; i++){
            productArray[0] *= inputArray[i];
        }
        //total product into each element
        for(int j=1; j<inputArray.length; j++){
            productArray[j] = productArray[0];
        }
        //divided each element by element in inputArray
        for(int k=0; k<inputArray.length; k++){
            productArray[k] /= inputArray[k];
        }
        return productArray;
    }
}
