public class Problem02
{

//    public static void main(String[] args)
//    {
//        int[][] sumN = magicSquare(3);
//
//        for(int i = 0; i < sumN.length; i++)
//        {
//            for(int j = 0; j < sumN[i].length; j++)
//            {
//                System.out.print(sumN[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public static int[][] magicSquare(int sizeOfSquare)
    {
        int[][] returnArr = new int[sizeOfSquare][sizeOfSquare];

        int row = 0;
        int col = sizeOfSquare / 2;

        int squared = sizeOfSquare  * sizeOfSquare;

        for(int i = 1; i <= squared; i++)
        {
            returnArr[row][col] = i;

            if(i % sizeOfSquare == 0)
            {
                row++;
            }
            else
            {
                if(row == 0)
                {
                    row = sizeOfSquare - 1;
                }
                else
                {
                    row--;
                }

                if(col == (sizeOfSquare - 1))
                {
                    col = 0;
                }
                else
                {
                    col++;
                }
            }
        }

        return returnArr;
    }
}
