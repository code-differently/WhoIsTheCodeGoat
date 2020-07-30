public class Problem01 {

    public String findAllPrimesSmaller(int n) {
        StringBuilder ret = new StringBuilder("Input: n = " + n + "\n");
        ret.append("Output: ");
        for(int i = 2; i < n; i++) {
            if(isPrime(i))
                ret.append(i).append(" ");
        }
        return ret.toString().trim();
    }

    public boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
