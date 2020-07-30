import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem03
{
    public static int countSubstring(String s, int K)
    {
        int answer = 0;

        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++)
        {
            int unique = 0;

            for(int j = i+1; j < s.length(); j++)
            {
                if(unique == K)
                {
                    if(charSet.contains(s.charAt(j)))
                    {
                        answer++;
                    }
                    else
                    {
                        charSet.clear();
                        break;
                    }
                }
                else
                {
                    if (!charSet.contains(s.charAt(j))
                    ) {
                        charSet.add(s.charAt(j));
                        unique++;

                        if(unique == K)
                        {
                            answer++;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        System.out.println(countSubstring("abcc", 2));
    }
}
