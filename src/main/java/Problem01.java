public class Problem01 {
    public String computeAllPrimesSmallerThanEqualToN(int value) {
        StringBuilder primes = new StringBuilder();

        for(int index = 2; index <= value; index++) {
            checkNumbersUnder10(primes, index);
            primes.append(index > 10 && checkIfPrimeOver10(index) ? index + " " : "");
        }
        return primes.toString().substring(0, primes.length() - 1); //takes out the last space
    }

    private void checkNumbersUnder10(StringBuilder primes, int index) {
        primes.append(index == 2 || index == 3 || index == 5 || index == 7 ? index + " " : "");
    }

    private boolean checkIfPrimeOver10(int index) {
        return index % 2 != 0 && index % 3 != 0 && index % 5 != 0 && index % 7 != 0; //not divisible by 2,3,5,7 then return true
    }
}
