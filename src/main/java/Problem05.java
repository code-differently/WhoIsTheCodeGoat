import java.util.HashSet;

public class Problem05 {

    public String[] biggerIsGreater(String[] input) {

        String[] newArray = new String[input.length];
        HashSet<Character> letter = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length() - 1; j++) {
                if (!letter.contains(input[i].charAt(j)))
                    letter.add(input[i].charAt(j));
            }
            if (letter.size() == 1)
                newArray[i] = "no answer";
            else
                newArray[i] = input[i];
        }

        return newArray;
    }

}
