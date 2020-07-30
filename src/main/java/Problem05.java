import java.util.ArrayList;
import java.util.Arrays;

public class Problem05 {
    public boolean reverseAlphabetChecker(String str){
        int incrementer = 0;
        char[] chrArray = str.toCharArray();
        char[] chrSorted = chrArray.clone();
        Arrays.sort(chrSorted);
        for(int i=chrSorted.length-1; i>0; i--){
            if(chrArray[incrementer] != chrSorted[i]){
                return false;
            }
            incrementer++;
        }
        return true;
    }

    public boolean isNotLongerThanOne(String str){
        if(str.length() <= 1){
            return true;
        }
        return false;
    }

    public boolean isAllSameCharacters(String str){
        char constant = str.charAt(0);
        char[] chrArray = str.toCharArray();
        boolean isNotUnique = true;
        for(char c: chrArray){
            if(c != constant){
                isNotUnique = false;
            }
        }
        if(isNotUnique == true){
            return true;
        }
        return false;
    }
    /*you can swap any or all of the characters so after making sure
    it isnt in reverse order, reverse order is the largest it can be
    lexigraphically speaking so I just reverse it wholesale*/
    public String[] biggerIsGreater(String[] strArray){
        ArrayList<String> resultList = new ArrayList();
        String[] conversion = {""};
        for(String str : strArray){
            if(isAllSameCharacters(str) || isNotLongerThanOne(str) || reverseAlphabetChecker(str)){
                resultList.add("no answer");
            }
            else{
                String charString = "";
                char[] chrArray = str.toCharArray();
                Arrays.sort(chrArray);
                for(int i=chrArray.length-1;i>=0; i--){
                    charString += chrArray[i];
                }
                resultList.add(charString);
            }
        }
        return resultList.toArray(conversion);
    }
}
