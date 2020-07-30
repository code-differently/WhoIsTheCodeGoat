public class Problem01 {
    public static boolean checkPrimes(int n) {
        //String nums = "";

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        } return true;
    }


    public static String printPrimes(int n){
        String nums = "";

        for(int i = 2; i <= n; i++){
            if(checkPrimes(i)){
                nums += i + " ";
            }
        }
        return nums;
    }
}
