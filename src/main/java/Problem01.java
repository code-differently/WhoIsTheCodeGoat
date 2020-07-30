public class Problem01 {

    public static Boolean isPrime(int userInput){
        int n = userInput;
        Boolean verdict = true;
        if (n <= 1) {
            verdict = false;
        }
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                verdict = false;
            }
        return verdict;
    }
    static String allPrimeNumbers(int userInput) {
        String toBeReturned = "";
        for (int i = 2; i <= userInput; i++) {
            if (isPrime(i)) {
                toBeReturned += String.valueOf(i) + " ";

            }
        }
        return toBeReturned.substring(0,toBeReturned.length()-1);
    }


}
