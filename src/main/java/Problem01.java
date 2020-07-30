public class Problem01 {


    /*
     * if it is divisible by only one and itself it is prime
     * Check that n is greater than one
     * use a for loop to check whether the number is prime
     * check whether the number is prime or not
     * @param number
     * @return
  */

     static String getPrimeNumber(int number)
     {

        String result="";

        for (int i = 2; i <= number ; i++) 
        {
            int count = 0;

            for (int j = 1; j <=i ; j++) 
            {
                if(i % j == 0)

                    count++;
            }

            if(count<=2)
                result+=i+ " ";
        }

        return result;
    }

}