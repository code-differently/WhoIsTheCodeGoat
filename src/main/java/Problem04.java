import java.util.Arrays;

public class Problem04 {

    public String productArrayPuzzle(int[] p) {
        StringBuilder ret = new StringBuilder("Input: int[] input = ");
        String arrayStart = Arrays.toString(p);
        ret.append("{").append(arrayStart.substring(1, arrayStart.length()-1)).append("}");
        int[] retArray = new int[p.length];

        for(int i = 0; i < p.length; i++) {
            retArray[i] = 1;
            for(int j = 0; j < p.length; j++) {
                if(j != i) {
                    retArray[i] *= p[j];
                }
            }
        }

        String arrayRet = Arrays.toString(retArray);
        ret.append("\nOutput: {").append(arrayRet.substring(1, arrayRet.length()-1)).append("}");
        return ret.toString().trim();
    }
}
