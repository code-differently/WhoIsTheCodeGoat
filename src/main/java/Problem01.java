public class Problem01 {

    public String findPrimes(Integer num){

        String  primeNumbers = "";
        for (int index = 0; index <= num; index++)
        {
            int count=0;
            for(int j =index; j>=1; j--)
            {
                if(index%j==0)
                {
                    count = count + 1;
                }
            }
            if (count == 2)
            {
                primeNumbers = primeNumbers + index + " ";
            }
        }
        return primeNumbers.trim();
    }
}
