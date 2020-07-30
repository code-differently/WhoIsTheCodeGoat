import java.util.Arrays;

public class Problem05 {
    public String biggerIsGreater(String toBeChanged) {
        String original = toBeChanged;
        String str[] = toBeChanged.split("");
        String[] initialValue = new String[str.length];
        ;
        String temp;
        String neededComparison = "";
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
                if ((Arrays.toString(str).compareTo(original) > 0)) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }}}
        return Arrays.toString(str);
    }
/*
                    if (i != 1 && j == 0) {
                        if (((Arrays.toString(initialValue).compareTo(Arrays.toString(str))) < 1)) {
                            neededComparison = Arrays.toString(str);
                        }
                    }
                        initialValue = str;
                    }
                }
            }
        return neededComparison;
        }
 */

}
