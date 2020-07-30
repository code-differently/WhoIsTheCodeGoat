public class Problem01 {

    public static boolean isPrimeNumber(int n){
        if(n <= 1)
        return false;
        if(n <= 3)
        return true;

        for(int i = 2; i < n; i++)
            if(n % 1 == 0)
            return false;

        return true;


       
    }
}
