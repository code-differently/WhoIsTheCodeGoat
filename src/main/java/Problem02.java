public class Problem02 {
    public String magicSquare(int size) {
        int[][] magicSquare = computeMageSquare(size);
        int magicValue = computeMagicValue(size);
        return formatOutput(size, magicSquare);
    }

    private int[][] computeMageSquare(int size) {
        int [][] magicSquare = new int [size][size];
        int sizeSquared = size * size;
        int row = size / 2;
        int col = size - 1;
        int numToInsert = 1;
        while(numToInsert <= sizeSquared) {
            if(row == -1 && col == size) {
                row = 0;
                col = size - 2;
            }
            else {
                if(row == -1) {
                    row = size - 1;
                }
                else if(col == size) {
                    col = 0;
                }
            }
            if(magicSquare[row][col] == 0) {
                magicSquare[row][col] = numToInsert;
                numToInsert++;
            }
            else {
                row += 1;
                col -= 2;
                continue;
            }
            row--;
            col++;
        }

        return magicSquare;
    }

    private int computeMagicValue(int n) {
        return (int) (n * (Math.pow(n, 2) + 1)) / 2;
    }

    private String formatOutput(int size, int [][] arr) {
        StringBuilder output = new StringBuilder("Magic Square of size " + size + "\n");
        output.append(new String((new char[output.length() - 1])).replace("\0", "-"));
        output.append("\n");
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                output.append(" " + arr[row][col] + " ");
            }
            output.append("\n");
        }
        output.append("Sum in each row & each column = " + size + "*(" + size + "^2+1)/2 = " +computeMagicValue(size));
        return output.toString();

    }
}
