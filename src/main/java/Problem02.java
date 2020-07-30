public class Problem02 {

    public String magicSquare(int n) {
        StringBuilder ret = new StringBuilder("Magic Square of size " + n);
        ret.append("\n-----------------------\n");

        int[][] magicSquare = new int[n][n];
        int row = n/2, column = n-1;

        for(int i = 1; i <= n*n;) {
            if(row == -1 && column == n) {
                row = 0; column = n - 2;
            }
            else {
                if(column == n) {
                    column = 0;
                }
                if(row == - 1) {
                    row = n - 1;
                }
            }
            if(magicSquare[row][column] != 0) {
                row++; column -= 2; continue;
            } else {
                magicSquare[row][column] = i;
                i++;
            }
            row -= 1; column += 1;
        }

        for(int i  = 0; i < magicSquare.length; i++) {
            for(int j = 0; j < magicSquare[i].length; j++) {
                if(j == 0) {
                    ret.append(String.format(" %-4d", magicSquare[i][j]));
                } else {
                    String current = String.format("%-4d", magicSquare[i][j]);
                    ret.append(current);
                }
            }
            ret.append("\n");
        }


        ret.append(String.format("Sum in each row & each column = %d*(%d^2+1)/2 = %d", n, n, n*(n*n+1)/2));

        return ret.toString().trim();
    }
}
