public class Problem02 {

   public String magicSquare(int n){
        String result = "Magic Square of size "+n+"\n-----------------------\n";

        result += fillSquare(n);

        result+= "Sum in each row & each column = " + (int) (n*(Math.pow(n,2)+1)/2);
        return result;
    }


   public String fillSquare(int n){//n=3
        String square;
        int index = 0;
        int r = n - 1;//sets row
        int c = n/2; //sets column
        int arr [] = new int[n*n];

        for(int i = 1; i<=arr.length; i++){//Set next number into array
            if (arr[((r +1) % n)*n + ((c +1) % n)] == 0) {//This checks to see if there is no element within the array
                r = (r +1) % n;
                c = (c +1) % n;
            }

            else {//if there is an element we want to where we input the number
                r = (r + n -1) % n;

            }
            arr[r*n+c]= i;//puts number into array
        }
        square = getSquare(arr, n);
        return square;
    }

    public String getSquare(int arr[], int n){
        String result = "";
        for(int i = 0; i < arr.length;i++){

            result += arr[i] + " ";
            if((i +1) % n == 0) {
                result = result.trim();
                result += "\n";
            }

        }
        return result;
    }

}
