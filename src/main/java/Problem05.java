public class Problem05 {

    //change for the end and if it swaps once we good
    public String [] biggerIsGreater(String [] input){
        for(int i = 0; i < input.length; i++){
            input[i] = greaterWord(input[i]);
        }
        return input;
    }

    public String greaterWord(String str){
        char [] letters = str.toCharArray();
        String origin = str;
        for(char l: letters) {
            for (int i = 0; i < str.length() - 1; i++) {
                char temp = letters[i];
                letters[i] = letters[i + 1];
                letters[i + 1] = temp;
                if (origin.compareTo(new String(letters)) < 0) {
                    str = new String(letters);
                }
            }
        }
        if(str.equals(origin)){
            return "no answer";
        }

        return str;
    }

}
