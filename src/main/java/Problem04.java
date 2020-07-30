public class Problem04 {

    //Problem 04 Logic
    //We are given array A and it has a size of N
    //We are to make an array FINISH THIS LOGIC
    //The input given equals the output, because for example (10*5*6*2 = 100)
    // following multiply each number, but exclude the next value to get the product from the output


    public static int[] arrayPuzzleBuilder(int [] inputArray){
        int [] productArray = new int[inputArray.length];
        productArray[0] = 1;

        //gets total product
        for(int i = 0; i < inputArray.length; i++){
            productArray[0] *= inputArray[i];
        }

        //total product into each element
        for(int j =1; j < inputArray.length; j++){
            productArray[j] = productArray[0];
        }

        //divide each element by element in inputArray
        for(int k = 0; k < inputArray.length; k++){
            productArray[k] /= inputArray[k];
        }

        return productArray;
    }

}
