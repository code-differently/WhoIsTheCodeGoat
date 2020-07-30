public class Problem01 {

    public String getPrimes(int n){
        String str = "2 ";

        for (int i = 3; i <= n; i+=2){

            if(isPrime(i)) {
                str += i + " ";
            }

        }

        return n>1?str.trim():"0";
    }

    public boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
}
