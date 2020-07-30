import java.util.*;

public class Problem05
{
    public static String[] biggerGreater(String[] arr)
    {

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = analyzeString(arr[i]);
        }
        return arr;
    }

    public static String analyzeString(String s)
    {
        char cArr[] = s.toCharArray();
        int endIndex = 0;

        for(endIndex = s.length() - 1; endIndex > 0; endIndex--)
        {
            //start from the right, find the first character
            //that is smaller than the previous character
            if(cArr[endIndex] > cArr[endIndex - 1])
            {
                break;
            }
        }

        //if that character wasn't found, then all the chars
        //are in decreasing order
        if(endIndex == 0)
        {
            return "no answer";
        }
        else
        {
            int firstSmall = cArr[endIndex - 1];
            int nextSmallChar = endIndex;

            for(int i = endIndex + 1; i < s.length(); i++)
            {
                if(cArr[i] > firstSmall && cArr[i] < cArr[nextSmallChar])
                {
                    nextSmallChar = i;
                }
            }

            //have to access it with the array elements
//            char temp = cArr[endIndex - 1];
//            cArr[endIndex - 1] = cArr[nextSmallChar];
//            cArr[nextSmallChar] = temp;
            swap(cArr, endIndex - 1, nextSmallChar);

            //sort the array after the last index
//            Arrays.sort(cArr, endIndex - 1, s.length());
            Arrays.sort(cArr, endIndex, s.length());
        }
        return new String(cArr);
    }

    public static void swap(char cArr[], int i, int j)
    {
        char temp = cArr[i];
        cArr[i] = cArr[j];
        cArr[j] = temp;
    }


//    public static void main(String[] args)
//    {
//        String[] s = {"ab", "bb", "hefg", "dhck", "dkhc"};
//
//        s = biggerGreater(s);
//
//        for(int i = 0; i < s.length; i++)
//        {
//            System.out.println(s[i]);
//        }
//    }
}
