import java.util.Arrays;

public class Problem03 
{
    public static int countOfSubstrings( String str, int K )
    {   
        int [] alphabetcounter = new int[26];
        int length = str.length();
        int result = 0;
        int s;

        for (int i = 0; i < length; i++) 
        { 
            s = 0; 

            Arrays.fill( alphabetcounter, 0); 

            for (int j = i; j < length; j++) 
            { 
                if (alphabetcounter[str.charAt(j) - 'a'] == 0) 
                    {
                        s++; 
                    }
                alphabetcounter[str.charAt(j) - 'a']++; 
  
                if (s == K) 
                    {
                        result++; 
                    }
            } 
        } 
  
        return result; 

    }
}
