import java.util.ArrayList;

public class Problem01 {
    public boolean isPrime(int primeCandid){
        for(int i = 2; i<primeCandid;i++){
            if(primeCandid%(i) == 0){
                return false;
            }
        }
        return true;
    }

    public Integer[] primeGen(int upperLimit){
        ArrayList<Integer> primes = new ArrayList();
        Integer[] conversion = {1};
        for(int i = 2; i<upperLimit; i++){
            if(isPrime(i) == true){
                primes.add(i);
            }
        }
        return primes.toArray(conversion);
    }
}
