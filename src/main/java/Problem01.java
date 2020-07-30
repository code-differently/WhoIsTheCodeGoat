public class Problem01 {

    public static String Problem01(int n) {
        String primes = "";
        if(n >= 2){
            primes += "2 ";
        }
        for(int i = 3; i < n; i += 2)
        {
            if(Problem01.Prime(i)) {
                primes += Integer.toString(i) + " ";
            }
        }
        return primes;
    }

    public static boolean Prime(int n){
        if(n ==  2)
            return true;
        for(int i = 2; i < n; i++)
            if(n % i == 0) {
                return false;
            }
        return true;
    }

}
