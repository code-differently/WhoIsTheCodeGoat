public class Problem04
{
    public static int[] productPuzzle(int[] input)
    {
        int product = 1;
        for(int i = 0; i < input.length; i++)
        {
            product *= input[i];
        }

        int[] productArr = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            double thisProd = product * Math.pow(input[i], -1);
            productArr[i] = (int) thisProd;
        }

        return productArr;
    }

}
