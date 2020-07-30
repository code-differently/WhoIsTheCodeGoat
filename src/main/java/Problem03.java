import java.util.HashSet;
public class Problem03 {

    public int countSubstrings(String str, int k) {
        int subStrings = 0;
        HashSet<Character> letter = new HashSet<>();
        for (int i = 0; i < str.length() - k + 1; i++) {
            for (int j = i; j < (i+k); j++) {
                if (!letter.contains(str.charAt(j)))
                    letter.add(str.charAt(j));
            }

            if (letter.size() == k)
                subStrings += 1;
            letter.clear();
        }
        return subStrings;
    }
}