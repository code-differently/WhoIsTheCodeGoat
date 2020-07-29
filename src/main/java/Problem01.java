public class Problem01 {
    static String smallerPrimes(int n){
        String output="";
        for (int i = 2; i < n ; i++) {
            int count=0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0)
                    count++;
            }
            if(count<=2)
                output+=i+ " ";

        }
        return output.trim();
    }

}
