import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem05 {

    public static String biggerIsGreater(String str) {
        ArrayList<String> permutations = new ArrayList<String>();
        permutations = perms(permutations, "", str);
        Collections.sort(permutations);
        String lowestButGreaterLex = "No answer";
        int lexValue = Integer.MIN_VALUE;
        for (String s : permutations) {
            int val = str.compareTo(s);
            //System.out.println(str + " compared to " + s + " is " + val);
            if (val < 0) {
                lexValue = val;
                lowestButGreaterLex = s;
                break;
            }
        }
        return lowestButGreaterLex;
    }

    public static ArrayList<String> perms (ArrayList<String> list, String str1, String remain) {
        if (remain.length() == 0) {
            list.add(str1);
        }
        for (int i = 0; i < remain.length(); i++) {
            String newWord = str1 + remain.charAt(i);
            String newRemain = remain.substring(0, i) + remain.substring(i + 1);
            perms(list, newWord, newRemain);
        }
        return list;
    }
}
