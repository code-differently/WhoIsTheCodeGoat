public class Problem01 {

    public String countPrimes(int n) {
        String primeNumbers = "";
        for(int i=2;i<=n;i++)
        {
            if (isPrime(i) == 1) {
                primeNumbers += i + " ";
            }
        }
        return primeNumbers;
    }
    int isPrime(int val)
    {
        int count=(int)(Math.sqrt(val));
        for(int i=2;i<=count;i++)
        {
            if(val%i==0)
                return 0;
        }
        return 1;
    }
}
