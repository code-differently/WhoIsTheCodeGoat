import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem04 {

    private Integer [] input;
    ArrayList<Integer> productList;

    public static void main(String[] args) {

        Problem04 test = new Problem04();
        Integer [] testInput = new Integer[] {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(test.createProductArry(testInput)));
    }

    public Problem04() {

        productList = new ArrayList<>();
    }

    private Integer calculateProduct(Integer currentPos){
        Integer createdProduct = 1;
        for (int i = 0; i < input.length; i++) {

            if(i != currentPos){

                createdProduct *= input[i];
            }

        }

        return createdProduct;
    }

    public Integer[] createProductArry(Integer [] given) {

        input = given;
        for(int i = 0; i < input.length; i++) {


            productList.add(calculateProduct(i));
        }
        input = productList.toArray(new Integer[productList.size()]);
        return input;
    }











}
