public class Problem04 {

    public int[] productArray(int[] intArrayInput){

        int [] newArray = new int[intArrayInput.length];
        int value = 0;
        int count = 1;

        for(int i = 0; i < intArrayInput.length; i++){
            if(value == i) {
                for (int j = 0; j < intArrayInput.length; j++) {
                    if (value != j) {
                        count *= intArrayInput[j];
                    }
                }
            }
            value++;
            newArray[i] = count;
            count = 1;



        }
        return newArray;
    }


}
