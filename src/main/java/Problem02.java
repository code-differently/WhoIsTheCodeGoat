

public class Problem02 {
  /* Bonus: If magic square number is less than 9 print a space before it..only if i time
  */
  public String magicSquareGenerator(int n){
    String answer = ""; 

    int[][] square = new int[n][n];
    int iRow = 0;
    int iCol = n/2; 
    //sum of each row == n(n^2 + 1)/2

    //calculating the values in the 2D array by changing iRow and iCol
    for(int i = 1; i <= n*n; i++){
      square[iRow][iCol] = i;
      if(i % n == 0){ //
        iRow++;
      } else {
        //testing rows
         if(iRow == 0){
           iRow = n - 1; 
         } else {
           iRow--;
         }
         //testing columns
         if(iCol == n-1){
           iCol = 0; 
         } else {
           iCol++;
         }
      }
    }

    square = rotateBy90Clockwise(square);
    square = flipArray(square);


   //adding the magic square to the string:
   for(int row = 0; row < n; row++){
     for(int col = 0; col < n; col++){
       answer += square[row][col] + " ";
     }
     answer += "\n"; //once we finish with the column, we go to a new row
   }
    return answer;
  }

  public int[][] rotateBy90Clockwise(int[][] ro){
    int n  = ro.length;
    for(int i = 0; i < ro.length/2; i++){
      for(int j = i; j < ro.length-i-1; j++){
        int temp = ro[i][j];
        ro[i][j] = ro[n - 1 - j][i];
        ro[n- 1 - j][i] = ro[n-1-i][n-1-j]; 
        ro[n- 1 - i][n- 1 - j] = ro[j][n-1-i]; 
        ro[j][n-1-i] = temp; 
      }
    }
    return ro;
  }

  public int[][] flipArray(int[][] ro){
    int n  = ro.length;
    for(int i = 0; i < n/2; i++){
      int[] temp = ro[i]; 
      ro[i] = ro[ro.length - i - 1]; 
      ro[ro.length - i - 1] = temp; 
    }
    return ro;
  }

}
