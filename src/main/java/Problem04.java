import java.util.ArrayList;
import java.util.List;

public class Problem04 {

  public Object[] productArray(int[] arr){

    List<Integer> answer = new ArrayList<Integer>(); 
    int product = 1;


    for(int i = 0; i < arr.length; i++){
      product *= arr[i];
    }

    for(int i = 0; i < arr.length; i++){
      answer.add((int) (product * Math.pow(arr[i], -1))); 
    }

    return answer.toArray();

  }
}
