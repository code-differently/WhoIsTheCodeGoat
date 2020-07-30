
public class Problem02 {

    public String magicSquare(int num) {
        String output = "";
        int squares[][] = new int[num][num];
        int row = 0;
        int column = num / 2;
        int square = num * num;

        for(int i = 1; i <= square; i++) {
            squares[row][column] = i;
            if(i % num == 0) {
                row++;
            }else{
                if(row == 0) {
                    row = num - 1;
                }else {
                    row--;
                }
                if(column == num - 1) {
                    column = 0;
                }else {
                    column++;
                }
            }
        }

        output += "Magic Square of size " + num + "\n" + "----------\n";
        for(int j = 0; j < squares.length; j++) {
            for(int k = 0; k < squares.length; k++) {
                output += squares[k][j] + " ";
                output += " ";
            }
            output += "\n" ;
        }
        return output += "Sum in each row & each column="+ num + 
        "*(" + num + "^2+1)/2= " + (int) (num * (Math.pow(num, 2) + 1) / 2);

    }
}
