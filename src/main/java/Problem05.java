import java.util.Iterator;
import java.util.TreeSet;

public class Problem05 {

    /**
     *
     * @param str An array to check for greater words
     * @return An array of strings with possible greater words
     */
    public static String[] formGreaterWord(String[] str){
        String[] results=new String[str.length];

        for (int i = 0; i <str.length ; i++) {
            String currentWord=str[i];
            TreeSet<String> words=getOrderedPermutions(currentWord);
            if(words.last().equals(currentWord))
                results[i]="no answer";
            else{
                results[i]=wordAfter(words,currentWord);
            }
        }
        return results;
    }

    /**
     *
     * @param words A tree set to look through words
     * @param word The word to look for
     * @return The word after the desired word
     */
    public static String wordAfter(TreeSet<String> words,String word){
        boolean found=false;
        String wordAfter="";

        Iterator<String> iter=words.iterator();
        while(iter.hasNext() && !found){
            String next=iter.next();
            if(next.equals(word)){
                wordAfter=iter.next();
                found=true;
            }
        }

        return wordAfter;

    }

    // Creates a TreeSet of permutations from a string
    public static TreeSet<String> getOrderedPermutions(String str){
        TreeSet<String> lex=new TreeSet<String>() ;
        String[] original=str.split("");
        String output="";

        for (int i = 0; i <original.length ; i++) {
            String[] clone=original;
            for (int j = 0; j < original.length; j++) {
                if(i!=j){
                    String temp=clone[j];
                    clone[j]=clone[i];
                    clone[i]=temp;
                }
                String word=formWord(clone);
                lex.add(word);
            }
        }
        return lex;
    }

    // Forms a word from an array of strings
    public static String formWord(String[] array){
        String str="";
        for (String chr :
            array) {
            str+=chr;
        }
        return str;
    }


}


