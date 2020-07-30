import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
   Brute Force: Check if number is prime or not. 
   Make a boolean arraylist that checks if it is prime. 
   We can identify all primes and if the number we check is on that list
   then we add it to the answer array. This will save some time complexity

*/

public class Problem01 {

  public List<Integer> sieveOfEratosthenes(int n){
    // creating array to store primes  (true or false)
    List<Boolean> primeNumber = new ArrayList<>(Collections.nCopies(n+1, true));

    //creating the answer array to print out
    List<Integer> answer = new ArrayList<>(); 

    //make sure we tell the program that index 0 and 1 is false (noting that 0 and 1 aren't prime)
    primeNumber.set(0, false);
    primeNumber.set(1, false); 

    for(int i = 2; i <= n; i++){
      if(primeNumber.get(i)){
        answer.add(i);

        //check for all of the multiples of that number and set it equal to false in primeNumber
        for(int j = i*2; j <= n; j = j + i ){ //i*2 gives us the multiples of that number
          primeNumber.set(j, false);
        } 
      }
    }
    return answer;
  }

}
