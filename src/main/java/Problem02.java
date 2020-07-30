public class Problem02 {

    public static void main(String[] args){

        //method that adds values into the magicSquare
        int num = 3;
        int i = 1;
        int[][] magicSquare = new int[num][num];
        int end = num^2;
        int count = 0;

        for(int row = 0; row < magicSquare.length; row++){
            for(int column = 0; column < magicSquare[row].length; column++){
                magicSquare[row][column] += i;
                i++;
                System.out.print(magicSquare[row][column] + "\t");
            }
            System.out.println();

        }

        //method to add the values in each row
        for(int row = 0; row < magicSquare.length; row++){
            int rowTotal = 0;
            for(int column = 0; column < magicSquare.length; column++){
                rowTotal = rowTotal + magicSquare[row][column];

            }
            System.out.println("Sum of each row "+ (row+1) + "is: " + rowTotal);
        }


    }
}
