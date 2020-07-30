import java.util.ArrayList;

public class Problem03 {

    public static int countOfSubstrings(String str, int k) {
        int count = 0;
        ArrayList<String> uniqueStrings = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (sub.length() == k) {
                    ArrayList<Character> distinctCharacters = new ArrayList<Character>();
                    for (int l = 0; l < sub.length(); l++) {
                        if (!distinctCharacters.contains(sub.charAt(l))) {
                            distinctCharacters.add(sub.charAt(l));
                        } else {
                            sub = null;
                            break;
                        }
                    }
                    if (!uniqueStrings.contains(sub) && sub != null) {
                        count++;
                        uniqueStrings.add(sub);
                    }
                }
            }
        }
        return count;
    }
}
