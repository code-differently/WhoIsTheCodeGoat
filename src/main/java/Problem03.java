import java.util.HashSet;


public class Problem03 {

    public int countSubstrings(String str, int k){
        int count = 0;
        for(int i = 0; i < str.length()-k; i++){
            if(isDistinct(str.substring(i, i+k))){
                count++;
            }
        }
        return count;
    }

    public boolean isDistinct(String str){
        HashSet<Character> letters = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            if(!letters.contains(str.charAt(i))){
                letters.add(str.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
}
