import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

    public class Problem03 {

        public static void main(String[] args) {
    
            findAllStrings("aaba");
        }
    

        public static Set<String> findAllStrings(String input) {

            Set<String> subStrings = new HashSet<String>();
            String cleaned_input = removeDuplicateChars(parseString(input));
    
            for (int i = 0; i < cleaned_input.length(); i++) {
                for (int j = i + 1; j <= cleaned_input.length(); j++) {
    
                    String word = cleaned_input.substring(i, j);
                  
                        subStrings.add(word);
                }
            }
            return subStrings;
        }

    /**
     * @param inputStr - A given string
     * @return newFormatedStr - A string without any digits, spaces, or special characters
     */
    public static String parseString(String inputStr){
        String lowercase = inputStr.toLowerCase();
        String newFormatedStr = lowercase.replaceAll("[^a-zA-Z]", "");
        return newFormatedStr;
    }

    /**
     * @param lowercaseAlpha - A given string of lowercase alphabets
     * @param K - given length the substrings are allowed to be
     */
    public static String removeDuplicateChars(String inputStr){
        
        Set<String> uniqueChars = new HashSet<>();
        String removed_duplicates = "";

        for (int index = 0; index < inputStr.length(); index++)
        {
            uniqueChars.add(inputStr.charAt(index) + "");
        }

        for (String ch: uniqueChars) 
        {
            removed_duplicates = removed_duplicates + ch;
        }

        return removed_duplicates;
    }


    /**
     * @param lowercaseAlpha - A given string of lowercase alphabets
     * @param K - given length the substrings are allowed to be
     */
    public static String countSubstrings(String lowercaseAlpha, int K){

        Hashtable<String,Integer> subs = new Hashtable<>();

        String formattedStr = parseString(lowercaseAlpha);

        String possibleSubstring = "";

        //Generate all possible substrings and check whether the substring has exactly k distinct characters or not.

        //check if all the string in the string are lowercase

        //find all the possible substring of that specific length 

        //if the possible substrings are not equal to the length K add 

        //if any of the valid substrings do not equal return 0

        return "";
    }

}

