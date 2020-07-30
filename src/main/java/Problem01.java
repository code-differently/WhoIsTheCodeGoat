public class Problem01 {

    public String primeNumbers(int n) {
        String empString = "";
        for (int num = 2; num < n; num++) {
            boolean isPrime = true;
            int i = 2;
            while (i <= num/2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime){
                empString += num;
                empString += " ";
            }
        }
        return "Output: " + empString.trim();
    }
}
