public class Problem02 {

    public static int[][] magicSquare(int n) {
        int[][] magicS = new int[n][n];
        int nums = n * n;
        int row = 0;
        int column = n / 2 ;
        magicS[row][column] = 1;

        for (int i = 2; i <= nums; i++) {
            if(row == 0) {
                row = n - 1;
            } else {
                row--;
            }
            if(column == n - 1) {
                column = 0;
            } else {
                column++;
            }
            while (magicS[row][column] != 0) {
                row++;
            }
            magicS[row][column] = i;
        }
        return magicS;
    }
}
