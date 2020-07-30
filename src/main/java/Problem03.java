import java.util.ArrayList;

public class Problem03 {
    public String[] getAllSubStrings(int length, String stringy){
        String[] conversion = {""};
        ArrayList<String> resultList = new ArrayList();
        for(int i = 0; i<stringy.length(); i++){
            for(int d = i+1; d<=stringy.length(); d++){
                if(stringy.substring(i,d).length() == length){
                    resultList.add(stringy.substring(i, d));
                }
            }
        }
        
        return resultList.toArray(conversion);
    }

    public boolean isSubStringUnique(String stringy){
        char[] chr = stringy.toCharArray();
        for(int i = 0; i<stringy.length(); i++){

            for(int d = i+1; d<stringy.length(); d++){
                if(stringy.charAt(i) == stringy.charAt(d)){
                    return false;
                }
            }
        }
        
        return true;
    }

    public String[] countOfSubstrings(String stringy, int length){
        String[] substringArray = getAllSubStrings(length, stringy);
        ArrayList<String> resultList = new ArrayList();
        String[] conversion = {""};
        boolean isUnique = true;
        for(String str : substringArray){
            if(isSubStringUnique(str) == true){
                isUnique = true;
            }
            else{
                isUnique = false;
            }
            if(isUnique == true){
                resultList.add(str);
            }
        }

        return resultList.toArray(conversion);
    }
}
