import java.util.HashSet;
import java.util.Set;

public class Problem03 {
    public String countKLengthStringsWithKDistinctLetters(String input, int k) {
        int numberOfCorrectStrings = 0, copyOfK = k;
        String subString = "";
        for(int index = 0; index < input.length(); index++) {
            subString = copyOfK > input.length() ? "" : input.substring(index, copyOfK);
            numberOfCorrectStrings = isSubstringUnique(subString) && !subString.equals("") ? numberOfCorrectStrings + 1 : numberOfCorrectStrings;
            copyOfK++;
        }

        return String.valueOf(numberOfCorrectStrings);
    }

    private boolean isSubstringUnique(String subString) {
        Set<Character> seenCharacterBefore = new HashSet<>();

        for(Character letter: subString.toCharArray()) {
            if(!seenCharacterBefore.contains(letter)) {
                seenCharacterBefore.add(letter);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
