public class Problem05 {

    public static void main(String[] args){


    }

    public static String BiggerIsGreater(char[] word){

        //steps ONE
        // get every string variation of a string (you want permuatations)
        // every single possible combination using the characters of the given you inputted 


        //Step TWO
        // store all strings and put into a data structure other than a set to keep all of scambled words that you have


        //Step THREE
        //compare ORIGINAL GIVEN STRING and compare the strings from STEP TWO using the .compareTO() METHOD
        //the scrambled string that lexigraphically GREATER than your ORGINAL string are added to new data structure "GREATER THAN WORD"


        //Step four 
        //find the smallest lecigraphic word in "GREATER THAN WORD" data structure 
        return null;
    }

    public static String printAllPermutations(String str, String strAns){

        if(str.length() == 0){
            return "Empty string";
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str + strAns.charAt(i);
            String newAns = strAns.substring(0, i) + strAns.substring(i + 1);
            printAllPermutations(newStr, newAns);
        }
    }
}
