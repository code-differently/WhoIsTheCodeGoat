public class Problem01 {

    //Problem 01 Logic
    //You are to print all primes smaller than or equal to n
    //Remember prime numbers only have two factors (1 and itself)
    //You will need a loop to loop through the list of numbers
    //if else statements will be needed as well.

    public static String problem01(int n) {
        String primeNumbers = " ";
        if (n >= 2)
            primeNumbers += "2";
        for (int i = 3; i < n; i += 2) {
            if (Problem01.primeNumbers(i)) {
                primeNumbers += Integer.toString(i) + " ";
            }
        }
        return primeNumbers;
    }

    public static boolean primeNumbers (int n){
        int remove = 0;
        if(n == 2)
            return true;
        for(int i = 2; i < n; i++)
            if(n % i == 0){
                return false;
            }
        return true;
    }
}
