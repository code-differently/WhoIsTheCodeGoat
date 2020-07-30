
public class Problem01 {

    /**
     *
     * @param n
     * @return
     *
     * Prime numbers are determined by how many factors they have.
     * If the only factors are 1 and itself, then it is prime.
     */
    public static String primes(int n){
        String result = "";
        for (int i = 1; i <= n; i++){ // iterate thru all the way to n
            int numOfFactors = 0;
            for (int j = 1; j <= i; j++ ){ // checking if each number all the way up to n is prime or not
                if (i % j == 0){ // if j goes into i evenly, then it is a factor
                    numOfFactors++;
                }
            }
            if (numOfFactors == 2){
                result += i + " ";
            }
        }
        return result.trim();
    }


}
