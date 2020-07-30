import java.util.HashMap;

public class Problem03 {

    public static int uniqueSubstring(String str,int k){
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if(i+k<str.length()){
                String sub=str.substring(i,i+k);
                if(isUniqueChars(sub))
                    count++;
            }
        }

        return count;
    }

    public static boolean isUniqueChars(String str){
        HashMap<Character,Integer> characters=new HashMap<Character, Integer>();

        for (int i = 0; i <str.length() ; i++) {
            Character chr=str.charAt(i);
            if(characters.containsKey(chr))
                return false;
            else
                characters.put(chr,1);
        }

        return true;
    }
}
