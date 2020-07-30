public class Problem04 {

    public int[] productArray(int[] arr){
        int[] productArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            productArray[i] = getProduct(arr, i);
        }

        return productArray;
    }

    public int getProduct(int[] arr, int excludedIndex){
        int product = 1;

        for(int i = 0; i < arr.length; i++){
            if(!(i == excludedIndex))
                product *= arr[i];
        }

        return product;
    }
}
