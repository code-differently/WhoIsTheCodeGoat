public class Problem02 
{
    public static int magicSquare(int size) 
    {   

        int[][] magicSquare = new int[size][size];

        int a = (size / 2);
        int b = (size - 1);

        for (int i = 1; i <= size * size;) 
        {
            if ((a == -1) && (b == size)) 
            {
                b = size - 2;
                a = 0;
            } else 
            {

                if (b == size) 
                {
                    b = 0;
                }

                if (a < 0) 
                {
                    a = size - 1;
                }
            }

            if (magicSquare[a][b] != 0) {
                b -= 2;
                a++;
                continue;
            } else
            {
                magicSquare[a][b] = i++;
            }
            b++;
            a--;
        }
        int sum = size * ( size * size + 1 ) / 2;

        return sum;

    }
}
