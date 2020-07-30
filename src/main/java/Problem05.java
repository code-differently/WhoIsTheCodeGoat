public class Problem05 {
    public String biggerIsGreater(String input) {
        int previousIndex = 0;
        char previousValue, currentValue, potentialValue;
        StringBuilder answer = new StringBuilder();
        for(int currentIndex = 1; currentIndex < input.length(); currentIndex++) {
            currentValue = input.charAt(currentIndex);
            previousValue = input.charAt(previousIndex);
            if(previousValue < currentValue && currentIndex == input.length() - 1) {
                answer.append(swap(input, previousIndex, currentIndex));
            }
            else if(previousValue < currentValue && currentIndex < input.length() - 1) {
                potentialValue = previousValue;

            }
            previousIndex++;
        }
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
