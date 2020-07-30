import java.util.HashMap;

public class Problem02 {
    public String magicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int magicValue = computeMagicValue(size);

        int row = size - 1;
        int col = size / 2;
        magicSquare[row][col] = 1;

        HashMap<Integer, Boolean> hasNumberBeenUsed = new HashMap<Integer, Boolean>();
        int squareOfSize = size * size;
        int valueToBePopulated = (int) (Math.random() + 1) * squareOfSize;
        return "";
    }

    private int checkColumn(int column, int [][] arr, int magicNumber) {
        for(int index = 0; index < arr.length; index++) {
            magicNumber = arr[index][column];
        }
        return 0;
    }

//    private int[] populateArray(int size) {
//        int[] magicSquare = new int[size];
//        for(int index = 1; index <= size; index++) {
//            magicSquare[index - 1] = index;
//        }
//        return magicSquare;
//    }

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
