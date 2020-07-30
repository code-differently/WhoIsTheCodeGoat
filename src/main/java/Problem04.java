import java.beans.Transient;
import java.util.ArrayList;

public class Problem04 {
    public Integer[] productArrayGen(Integer[] arr){
        ArrayList<Integer> resultList = new ArrayList();
        int multiple = 1;
        Integer[] conversion = {1};
        for(int i=0; i<arr.length;i++){
            multiple = 1;
            for(int d = 0; d<arr.length; d++){
                if(d != i){
                    multiple *= arr[d];
                }
            }
            resultList.add(multiple);
        }
        return resultList.toArray(conversion);
    }
}
