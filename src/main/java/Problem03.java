import java.util.HashMap;
import java.util.Map;

public class Problem03 {

    public static int countSubstring(String str, int K){
        int num = str.length();
        int answer = 0;


        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < K; i++){
            if(map.get(str.charAt(i)) == null){
                map.put(str.charAt(i), 1);
            }
            else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        return ;
    }
}
