public class Problem05 {
    public String biggerIsGreater(String input) {
        int previousIndex = 0, potentialIndex = -1;
        char previousValue, currentValue;
        StringBuilder answer = new StringBuilder();
        boolean swapped = false;
        for(int currentIndex = 1; currentIndex < input.length(); currentIndex++) {
            currentValue = input.charAt(currentIndex);
            previousValue = input.charAt(previousIndex);
            if(previousValue < currentValue && currentIndex == input.length() - 1) {
                swapped = true;
                answer.append(swap(input, previousIndex, currentIndex));
            }
            else if(previousValue < currentValue && currentIndex < input.length() - 1) {
                potentialIndex = currentIndex;
            }
            previousIndex++;
        }
        answer.append(!swapped && potentialIndex != -1 ? swap(input, potentialIndex, potentialIndex + 1) : "");
        answer.append(answer.length() == 0 ? "no answer" : "");
        return answer.toString();
    }

    private static String swap(String input, int firstIndex, int secondIndex) {
        char[] inputArr = input.toCharArray();
        char temp = input.charAt(firstIndex);
        inputArr[firstIndex] = input.charAt(secondIndex);
        inputArr[secondIndex] = temp;
        return String.valueOf(inputArr);
    }

    private boolean isStringOneBigger(String stringOne, String stringTwo) {
        return stringOne.compareTo(stringTwo) >= 1;
    }
}
