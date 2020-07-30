import java.util.HashSet;

public class Problem03 {

    public String countAllSubstringsOfLengthK(String input, int k) {
        StringBuilder ret = new StringBuilder("Input: str = “" + input + "”, K = " + k);
        int countOfSubs = 0;
        for(int i = 0; i < input.length(); i++) {
            int end = i + k;
            if(i + k <= input.length()) {
                String sub = input.substring(i, end);
                if(hasKDistinct(sub, k))
                    countOfSubs++;
            }
        }
        ret.append("\nOutput: ").append(countOfSubs);
        return ret.toString().trim();
    }

    public boolean hasKDistinct(String input, int k) {
        HashSet<Character> distinctChars = new HashSet<>();
        for(int i = 0; i < input.length(); i++) {
            distinctChars.add(input.charAt(i));
        }
        return distinctChars.size() == k;
    }
}
