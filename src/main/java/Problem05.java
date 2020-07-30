import java.util.Arrays;

public class Problem05 {
    /**
     * Step 1 go through the string starting from the right most character
     * Step 2  compare the right most character with the rest of the charaters until you find a character that's greater that the right most character
     * Step 3 swap the greater character with the right most index
     * Step 4 sort the array after the right most index in ascending order 
     * 
     * 
     */
    public void swap (char charArray[], int index, int otherIndex)
    {
        char temp = charArray[index];
        charArray[index] = charArray[otherIndex];
        charArray[otherIndex] = temp;
    }


     public String biggerIsGreater(String input)
     {
         char[] charArray = input.toCharArray();
         String greater = "";
         int last = 0; 

         for(last = charArray.length - 1; last > 0; last--) //going through the string backwards 
         {
            if (charArray[last] > charArray[last-1]) 
            {
                break;    
            }
         }

         if (last == 0) 
         {
            greater = "no answer";
            return greater;   
         }
         else
         {
             int smallestCharacter= charArray[last - 1];
             int nextsmallestCharacter = last;
             for(int i = last +1; i< charArray.length; i++) //loop going to the right of the last index 
             {
                if (charArray[i] > smallestCharacter && charArray[i] < charArray[nextsmallestCharacter]) 
                {
                    nextsmallestCharacter = i;    
                }
             }
             
             swap(charArray, last-1,nextsmallestCharacter);
             Arrays.sort(charArray, last, charArray.length);
         }
            greater = new String(charArray);

         return greater;
     }


    public static void main(String[] args)
    {
        Problem05 problem05 = new Problem05();
        String input = "abcd";

        String actual = problem05.biggerIsGreater(input);
        System.out.println(actual);


    }

}