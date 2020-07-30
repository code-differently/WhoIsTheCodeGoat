public class Problem02 {
    public String magicSquare(int size) {
        int[][] magicSquare = computeMageSquare(size);
        int magicValue = computeMagicValue(size);

        return "";
    }

    private int[][] computeMageSquare(int size) {
        int [][] magicSquare = new int [size][size];
        int sizeSquared = size * size;
        int row = size / 2;
        int col = size - 1;

        for(int whichNum = 1; whichNum < sizeSquared; whichNum++) {
            if(row == col) {

            }
            row++;
            col--;
        }
    }

    private int computeMagicValue(int n) {
        return (int) (n * (Math.pow(n, 2) + 1)) / 2;
    }

    private String formattedOutput(int size, int [][] arr) {
        StringBuilder output = new StringBuilder("Magic Square of size " + size + "\n" +
                                                "-----------------------\n");
        for(int index = 0; index < arr.length; index++) {
            output.append(index % size == 0 && index > 0 ? "\n " + arr[index] + " " : " " + arr[index] + " ");
        }
        output.append("\nSum in each row & each column = " + size + "*(" + size + "^2+1)/2 = " +computeMagicValue(size));
        return output.toString();

    }
}
