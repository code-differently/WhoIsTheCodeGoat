public class Problem01 {
    
    public String getPrimes(int stop) { 
        String  primeNums = "";
        for(Integer i = 1; i < stop; i++) {
            Integer list = 0;
            for(Integer j = i; j >= 1; j--) {
                if(i % j == 0) {
                    list = list + 1;
                }
            }
            if(list == 2) {
                primeNums =  primeNums + " " + i;
            }
        }
        return primeNums;
    }
}
