import java.util.HashMap;
import java.util.Map;
public class Problem03 {
    public static int countOfSubstrings(String input, int k) {
        int number = input.length();
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < k; ++i) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1); //Gives every individual character a value in the hash unless
            }
            else {
                map.put(input.charAt(i), // it repeats more than once
                        map.get(input.charAt(i)) + 1);
            }
        }
        for(int i = k; i < number; i++) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1);
            }
            else {
                map.put(input.charAt(i),
                        map.get(input.charAt(i)) + 1);
            }
            map.put(input.charAt(i - k),
                    map.get(input.charAt(i - k)) - 1);
            if (map.get(input.charAt(i - k)) == 0)
            {
                map.remove(input.charAt(i - k));
            }
            if (map.size() == k)
            {
                counter += 2;
            }
        }
        return counter;
    }
}

