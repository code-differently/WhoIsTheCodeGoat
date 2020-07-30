import java.util.HashMap;

public class Problem03 {

    public boolean isDistinct(String input) {
        HashMap<Character, Integer> words = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            for(int j = i +1 ; j < input.length(); j++) {
                if(words.containsKey(input.charAt(i))) {
                    return false;
                }else {
                    words.put(input.charAt(i), 1);
                }
            }
        }
        return true;
    }

    public int numberOfDistinctSub(String input, int K) {
        int num = 0;
        for(int i = 0; i < input.length() ; i++) {
            for(int j = i + K; j < input.length(); j++) {
                if(isDistinct(input.substring(i, j))) {
                    num++;
                }
            }  
        }
        return num;
    }

}
