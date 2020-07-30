public class Problem04 {

    // create for loop
    //

    public int[] puzzleProduct(int[] arr){
        int product = 1, product2 = 1, leftStart = 1, rightStart = 1;
        int[] solution = new int[arr.length];
        int[] theSolution = solution;


        for (int i = 0; i < arr.length; ++i){ // skip first num
            solution[i] = leftStart;
            leftStart = leftStart * arr[i];

        }

        for (int j = arr.length - 1; j >= 0 ; --j) {
            theSolution[j] = rightStart * theSolution[j];
            rightStart = rightStart * arr[j];
        }
        return theSolution;
    }


    /* This is the same exact function, the only difference is
    * the second function turns the array into a string so we can test it, when we
    * return arrays we only return its place in memory
    * so if we return strings instead we can see what is on the inside of the array */

    public String puzzleProductString(int[] arr){
        int product = 1, product2 = 1, leftStart = 1, rightStart = 1;
        int[] solution = new int[arr.length];
        int[] theSolution = solution;


        for (int i = 0; i < arr.length; ++i){ // skip first num
            solution[i] = leftStart;
            leftStart = leftStart * arr[i];

        }

        for (int j = arr.length - 1; j >= 0 ; --j) {
            theSolution[j] = rightStart * theSolution[j];
            rightStart = rightStart * arr[j];
        }

        String empString = "";
        for (int element : theSolution) {
            empString += element;
            empString += " ";
        }
        return empString.trim();
    }

}
