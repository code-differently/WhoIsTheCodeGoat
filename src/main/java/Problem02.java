public class Problem02 {
    public String generateSquare(int n) {
        String toBeReturned = "";
        // print magic square
        toBeReturned += "Magic Square of size " + n + "\n";
        toBeReturned += "-----------------------\n";
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                toBeReturned += String.format("%3d", magicSquare[i][j]);
            }
            toBeReturned += "\n";
        }
        toBeReturned += "Sum in each row & each column = " + n + "*(" + n +"^2+1)/2 = " + ((int) (n * (Math.pow((double) (n), (double) (2) ) + 1) / 2));
        return toBeReturned;
    }
}