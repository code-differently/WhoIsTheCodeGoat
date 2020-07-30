public class Problem04 {

    public int [] productArray(int [] a){
        int [] pa = new int [a.length];
        for(int i = 0; i < a.length; i++){
            pa[i]= product(a, i);
        }
        return pa;
    }

    public int product(int [] a, int dontMult){
        int product = 1;
        for(int i = 0; i < a.length; i++){
            if(i != dontMult) {
                product *= a[i];
            }
        }
        return product;
    }
}
