
public class Problem04 {

    public static int[] productsArray(int[] array){
        int[] products=new int[array.length];
        int index=0;
        if(array.length<3){
            for (int i = array.length-1; i>=0 ; i--,index++) {
                products[i]=array[index];
            }
        }
        else {
            int product=1;
            for (int i = 0; i<array.length ; i++,index++) {
                for (int j = 0; j < array.length; j++) {
                    if(i!=j)
                        product*=array[j];
                }
                products[i]=product;
                product=1;
            }
        }
        return products;
    }
}
