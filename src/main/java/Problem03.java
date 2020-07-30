import java.util.HashMap;
public class Problem03 {

        HashMap<Character, Integer> letterRepeatsMap;

        private boolean hasRepeats(String subString) {
            letterRepeatsMap = new HashMap<>();
            for(int i = 0; i < subString.length(); i++) {
                if(!letterRepeatsMap.containsKey(subString.charAt(i))){
                    letterRepeatsMap.put(subString.charAt(i), 1);
                } else {
                    return true;
                }
            }
            return false;
        }

        public Integer countOfSubstrings(String word, Integer k){
            Integer count = 0;
            for(int i = 0; i < word.length()-k; i++){
                if(!hasRepeats(word.substring(i, i + k))) {
                    count++;
                }
            }
            return count;
        }
}
