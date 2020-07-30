public class Problem02 {
    public String magicSquareGen(int magicNCount){
        String result = "";
        //MagicNCount is for readibility whilst the equation calls for and is shorter with n thus
        int magicSquare[][] = new int[magicNCount][magicNCount];
        int count = 1;
        int centerOfTopRow = (magicNCount/2);
        int row = 0;
        int column = centerOfTopRow;
        int remaingfills = magicNCount * magicNCount;
        int originalcol = 0;
        int originalrow = centerOfTopRow;
        
      

    

          for(int i = 0; i < magicSquare.length; i++){
            for(int d = 0; d< magicSquare[i].length; d++){
                magicSquare[i][d] = 0;
            }
        }

        magicSquare[0][centerOfTopRow] = count;
        
        for(int i = remaingfills-1; i > 0; i--) {
            count++;
            row -= 1;
            column += 1;
            if(row == -1){
                row = magicNCount-1;
            }
            if(column == magicNCount){
                column = 0;
            }
            int c = magicSquare[row][column];
            if(magicSquare[row][column] == 0){
                magicSquare[row][column] = count;
                originalrow = row;
                originalcol = column;
            }
            else{
                row = originalrow;
                column = originalcol;
                row += 1;
                if(row == -1){
                    row = magicNCount-1;
                }
                if(column == magicNCount){
                    column = 0;
                }
                magicSquare[row][column] = count;
            }
            
            

        }
        
        
        
        for(int i = 0; i < magicSquare.length; i++){
            for(int d = 0; d< magicSquare[i].length; d++){
                result += magicSquare[i][d];
                result += "   ";
            }
            //result += "n";
            result.trim();
        }
        
        
        
        
        
        
        
        
        System.out.println(result);
        return result.trim();

    }
    
}
