public class Problem04 {

    public int[] productArray(int [] arr){
        int[] num = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            int multiple = 1;
            for(int j = 0; j < arr.length; j++) {
                if(i != j) {
                    multiple *= arr[j];
                }
                num[i] = multiple;
            } 
        }
        return num;
    } 
}
//num[i] = arr[i];