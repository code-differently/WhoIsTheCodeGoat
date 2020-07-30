import java.util.ArrayList;


public class Problem01
{   
    public ArrayList <Integer>  sieveOfEratosthenes( int n )
    {   
        ArrayList <Integer> primesList = new ArrayList <Integer>();

        for (int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                primesList.add(i);
            }
        }
        return primesList;
        
        //primesArray = primesList.toArray();
        //return primesArray;

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
 }


}
