public class Problem01 {


    public String printPrimeNumbersUntil (Integer x) {

        String primes = "";
        for (int i = 2; i <= x; i++){

            if (!isMultiple(i)){

                primes += " " + i;
            }

        }


        return primes;
    }

    private boolean isMultiple(Integer x) {

        if( x != 2 && (x % 2) == 0) {

            return true;
        } else if (x != 3 && (x % 3) == 0) {

            return true;
        } else if (x != 5 && (x % 5) == 0) {

            return true;
        } else if (x != 7 && (x % 7) == 0) {

            return true;
        } else if (x != 11 && (x % 11) == 0) {

            return true;
        }

        return false;
    }





}
