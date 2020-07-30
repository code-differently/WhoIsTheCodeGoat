import java.util.Arrays;

public class Problem04 {
    public int[] computeProductArray(int ...array) {
        String stringValues = Arrays.toString(array);
        //don't want to use the length of the array, have to use the converted string
        stringValues = stringValues.substring(1, stringValues.length() - 1);
        int [] productArray = new int[array.length];
        productArray[0] = computeFirstProduct(stringValues);
        productArray[array.length - 1] = computeLastProduct(stringValues);
        computeMiddleProduct(stringValues, productArray);

        return productArray;
    }

    private static int computeFirstProduct(String stringValues) {
        int indexOfComma = stringValues.indexOf(',', 0);
        return indexOfComma != -1 ? computeIndividualPart(stringValues.substring(indexOfComma + 2)) : 0;
    }

    private static void computeMiddleProduct(String stringValues, int ...productArray) {
        int indexOfPreviousElements = stringValues.indexOf(",") + 2;
        int indexOfFutureElements = stringValues.lastIndexOf(",") - 2;
        String firstHalfToCompute = "", secondHalfToCompute = "";
        for (int arrayIndex = 1; arrayIndex < productArray.length; arrayIndex++) {
            firstHalfToCompute = stringValues.substring(0, indexOfPreviousElements);
            secondHalfToCompute = stringValues.substring(indexOfFutureElements);
            productArray[arrayIndex] = computeIndividualPart(firstHalfToCompute + secondHalfToCompute);
        }
    }


    private static int computeLastProduct(String stringValues) {
        int indexOfComma = stringValues.lastIndexOf(',');
        int nextIntegerPosition = indexOfComma + 2;
        return indexOfComma != -1 ? computeIndividualPart(stringValues.substring(0, nextIntegerPosition)) : 0;
    }

    private static int computeIndividualPart(String subsetToCompute) {
        subsetToCompute = subsetToCompute.replaceAll(", ", "");
        int product = 1; //if 0 it would not calculate the right number correctly
        for(int index = 0; index < subsetToCompute.length(); index++) {
            product *= Integer.parseInt(subsetToCompute.substring(index, index + 1));
        }
        return product;
    }
}
