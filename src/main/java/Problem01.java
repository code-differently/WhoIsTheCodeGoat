public class Problem01 
{
    //step one determine if a number is prime 
    //Step two go from one to n 
    //step three if the number is equal to a prime number then add the number to the string 
    //step four return the string with the primes in it 

    public Boolean isPrime(Integer n)
    {
        Boolean isPrime = true;
        if (n == 1) 
        {
            isPrime = false; 
            return isPrime;    
        }
        for (int i = 2; i <n; i++) 
        {
            if(n%i == 0)
            {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
    public String sieveOfEratosthenes(Integer number)
    {
        String output = "";
        for (int i = 1; i <number; i++) 
        {
            if(isPrime(i) == true)
            {
                output = output + i + " ";
            }
        }
        return output.trim();
    }

}
