public class Problem05 {

    public String[] getLexiographicalArray(String[] array){
        return null;
    }

    public String biggerIsGreater(String str){

        String newStr = "";
        char lastChar = str.charAt(str.length() - 1);
        char secondToLastChar = str.charAt(str.length() - 2);

        for(int i = 0; i < str.length() - 2; i++){
            newStr += str.charAt(i);
        }

        newStr += lastChar;
        newStr += secondToLastChar;

        if(newStr.compareTo(str) > 0)
            return newStr;

        return "no answer";
    }
}
