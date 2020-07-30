import java.util.Arrays;

public class Problem05 {

    public String biggerIsGreaterForArray(String[] input) {
        StringBuilder ret = new StringBuilder("Input : ");
        ret.append(Arrays.toString(input));
        String[] retArray = new String[input.length];

        for(int i = 0; i < input.length; i++) {
            String bigger = biggerIsGreaterForString(input[i]);
            if(bigger.compareTo(input[i]) <= 0)
                retArray[i] = "no answer";
            else {
                retArray[i] = bigger;
            }
        }

        ret.append("\nOutput : ").append(Arrays.toString(retArray));
        return ret.toString().trim();
    }

    public String biggerIsGreaterForString(String input) {
        char[] inputChars = input.toCharArray();
        int lastSmallerThanNextIndex = findLastSmallerThanNextIndex(inputChars);

        int lastLetterGreaterThanLSTNI = findLastLetterGreaterThanLSTNI(inputChars, lastSmallerThanNextIndex);

        char[] newWord = swap(inputChars, lastSmallerThanNextIndex, lastLetterGreaterThanLSTNI);

        Arrays.sort(newWord, lastSmallerThanNextIndex + 1, newWord.length);

        return new String(newWord);
    }

    public int findLastSmallerThanNextIndex(char[] inputChars) {
        int lastSmallerThanNextIndex = 0;
        for(int i = 0; i < inputChars.length-1; i++) {
            if(inputChars[i] < inputChars[i + 1]) {
                lastSmallerThanNextIndex = i;
            }
        }
        return lastSmallerThanNextIndex;
    }

    public int findLastLetterGreaterThanLSTNI(char[] inputChars, int lastSmallerThanNextIndex) {
        int lastLetterGreaterThanLSTNI = 0;
        for(int j = 0; j < inputChars.length; j++) {
            if(inputChars[lastSmallerThanNextIndex] < inputChars[j]) {
                lastLetterGreaterThanLSTNI = j;
            }
        }
        return lastLetterGreaterThanLSTNI;
    }

    public char[] swap(char[] input, int index1, int index2) {
        char temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
        return input;
    }
}
