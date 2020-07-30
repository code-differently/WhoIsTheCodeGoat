import java.util.ArrayList;

public class Problem01 {

    public String getPrimes(int input){
        ArrayList<Integer> possiblePrimes = new ArrayList<>();
        String primes = "";

        for(int i = 2; i <= input; i++){
            if(!(i % 2 == 0) || i == 2)
                possiblePrimes.add(i);
        }

        for(int num: possiblePrimes){
            if(!(num % 3 == 0) || num == 3) {
                if(num % 1 == 0 && num % num == 0)
                    primes += (num + ", ");
            }
        }

        primes = primes.substring(0, primes.length()-2);
        return primes;
    }
}
