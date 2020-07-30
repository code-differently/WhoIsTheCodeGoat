import java.lang.Object;

public class Problem02 {
    public static String makeSquare(int n){
        Integer[][] magicSquare = new Integer[n][n];

        int i = n/2;
        int j = n-1;

        for(int num=1; num <= n*n;){
            if(i==-1 && j==n){
                i = 0;
                j = n-2;
            }
            else{
                if(j == n)
                    j = 0;
                if (i < 0)
                    i=n-1;
            }
            if(magicSquare[i][j] != 0){
                j -= 2;
                i++;
                continue;
            }
            else
                magicSquare[i][j] = num++;
            j++; i--;
        }
        return Integer.toString(magicSquare[i][j])+" ";
        }
}
