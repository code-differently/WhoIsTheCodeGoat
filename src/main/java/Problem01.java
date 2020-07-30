public class Problem01 {

    public Boolean isPrime(Integer n)
    {
        Boolean isPrime = true;
        if (n == 1) 
        {
            isPrime = false; 
            return isPrime;    
        }
        for (int i = 2; i < n; i++) 
        {
            if(n % i == 0)
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
