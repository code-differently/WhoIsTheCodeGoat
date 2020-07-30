import java.util.HashSet;

public class Problem03 {

    public int distinctSubStrings(String str, int k){
        int distinctSubStrings = 0;

        for(int i = 0; k < str.length(); i ++){
            String subString = str.substring(i, k);

            if(isDistinct(subString))
                distinctSubStrings++;

            k++;
        }

        return distinctSubStrings;
    }

    public boolean isDistinct(String sub){
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < sub.length(); i++){
            char current = sub.charAt(i);

            if(set.contains(current))
                return false;
            set.add(current);
        }

        return true;
    }
}
