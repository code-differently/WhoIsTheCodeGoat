import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem03 { 
    //Generate all possible substrings and check whether the substring has exactly k distinct characters or not.

    //check if all the string in the string are lowercase

    //find all the possible substring of that specific length 

    //if the possible substrings are not equal to the length K add 

    //if any of the valid substrings do not equal return 0



    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        System.out.println(getSubstrings("FOV", 2));

    }

    public static HashMap<Integer, ArrayList<String>> findAllStrings(String input) {

        HashMap<Integer, ArrayList<String>> dict = new HashMap<>();
        
        String cleaned_input = removeDuplicateChars(parseString(input));
        
        for (int i = 0; i < cleaned_input.length(); i++){
            getPossibleSubstrings(i, cleaned_input, dict);
        }
        return dict;
    }

    public static void getPossibleSubstrings(int start, String word, HashMap<Integer, ArrayList<String>> dict){
        for (int j = start + 1; j <= word.length(); j++){
            String new_word = word.substring(start, j);
            addToWordDict(dict, new_word);
        }
    }

    public static void addToWordDict(HashMap<Integer, ArrayList<String>> dict, String word){
        if (!dict.containsKey(word.length())){
            ArrayList<String> wordsWithSameLength = new ArrayList<>();
            wordsWithSameLength.add(word);
            dict.put(word.length(), wordsWithSameLength);
        } 
        else {
            //dict.put(word.length(), dict.get(word.length()).add(word));

            ArrayList<String> wordsWithSameLength = dict.get(word.length());
            wordsWithSameLength.add(word);
            dict.put(word.length(), wordsWithSameLength);
        }
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
    public static int getSubstrings(String lowercaseAlpha, int stringLength){

        String formated_string = removeDuplicateChars(parseString(lowercaseAlpha));

        HashMap<Integer, ArrayList<String>> word_variations = findAllStrings(formated_string);

        System.out.println(word_variations.get(stringLength));
        return word_variations.get(stringLength).size();
    }

}

