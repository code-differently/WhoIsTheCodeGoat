import java.util.ArrayList;

public class Problem01
{
    public static ArrayList<Integer> sieve(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        //+1 so we won't use the 0th index
        boolean[] composite = new boolean[n + 1];

        //O(n^2) solution, super bad :(
        for(int i = 2 ; i <= n; i++)
        {
            if(!composite[i])
            {
                //i is now prime
                list.add(i);

                int multiple = 2;
                while(i * multiple <= n)
                {
                    composite[i * multiple] = true;
                    multiple++;
                }
            }
        }

        return list;
    }
}
