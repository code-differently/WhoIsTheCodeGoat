public class Problem02 {

    public static String magicSquare(int n){
        String output="";
        int currentNum=1;
        int maxNum=n*n;
        int magicConstant=n*(n*n+1)/2;
        int[][] magicSquare=new int[n][n];

        int row=magicSquare.length/2;
        int col=magicSquare[row].length-1;

        while(currentNum<=maxNum){
            if(currentNum==1){
                magicSquare[row][col]=1;
            }
            else{
                row=row-1;
                col=col+1;
                if(row>=0){
                    if (col>=magicSquare[row].length){
                        col=0;
                        magicSquare[row][col]=currentNum;
                    }
                    else
                        magicSquare[row][col]=currentNum;
                }
                else{
                    row=magicSquare.length-1;
                    if (col>=magicSquare[row].length){
                        col=0;
                        magicSquare[row][col]=currentNum;
                    }
                    else
                        magicSquare[row][col]=currentNum;
                }

            }
            currentNum++;
        }


        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j]+" ");
            }
            System.out.println();
        }

        return output;
    }

    public static void main(String[] args){
        System.out.println(Problem02.magicSquare(5));
    }
}
