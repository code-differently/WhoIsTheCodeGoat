public class Problem02 
{
    /**
     * step 1: assign the number in ascending order starting from 1
     * 
     * step 2: stary from the bottom, middle cell. Increment value and move to the bottom right diagonal
     * 
     * step 3: repeat if the spot is taken, move up a row and continue
     * 
     * step 4: deal with the borders
     * 
     * 
     */
    public String magicSquare(int n)
    {
        int magicSum = (int) (n *(Math.pow(n, 2)+1)/2);
        int [][] square1 = new int[n][n];
        int currentValue = 1;
        int row= n-1; 
        int column = n/2;
        String magicSquare = "";
        while(currentValue <= n*n)
        {
            if(square1[row][column] == 0) // if empty then value needs to be set
            {
                square1[row][column]= currentValue;
                currentValue++;
                row= (row+ 1) % n;
                column = (column +1) % n ;
            }
            else
            {
                row =(row -1) % n ; //move up a row
            }
        }
        magicSquare +="Magic Square of size " + n + "\n"; 
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                magicSquare+= String.format("%3d", square1[i-1][j-1]);
            }
            magicSquare+= "\n";
        }
         magicSquare+= "Sum in each row & each column = " + n + "*(" + n + "^2+1)/2 = " +magicSum;

        return magicSquare.trim();
    }
}
