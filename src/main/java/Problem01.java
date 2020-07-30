public class Problem01 
{
    public String sieveOfEra(int n)
    {
        String result = "";
        boolean prime[] = new boolean[n+1];
        for (int i = 0; i < n;i++)
        {
            prime[i] = true;
        }
        for (int p = 2; p*p <= n; p++)
        {
            if (prime[p] == true)
            {
                for (int i = p*p; i <= n; i += p)
                {
                    prime[i] = false;
                }
            }
        }

        //To print out and return a string for testing
        for (int i = 2; i <= n;i++)
        {
            if (prime[i] == true)
            {
                System.out.print(i+" ");
                result += i+" ";
            }
        }
        return result.trim();
    }
}
