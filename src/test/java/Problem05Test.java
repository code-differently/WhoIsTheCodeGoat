import org.junit.Assert;
import org.junit.Test;

public class Problem05Test
{

    @Test
    public void problem5TestOne()
    {
        String[] expected = {"ba", "no answer", "hegf", "dhkc", "hcdk"};

        String[] real = new Problem05().biggerGreater(new String[]{"ab", "bb","hefg", "dhck", "dkhc"});

        boolean flag = false;

        for(int i = 0; i < expected.length; i++)
        {
//            System.out.println(expected[i]);
//            System.out.println(real[i]);
            if(expected[i].equalsIgnoreCase(real[i]))
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        }

        Assert.assertEquals(true, flag);
    }

    @Test
    public void problem5TestTwo()
    {
        String[] expected = {"lmon", "no answer", "no answer", "acbd", "abdc","fedcbabdc"};

        String[] real = new Problem05().biggerGreater(new String[]{"lmno", "dcba","dcbb", "abdc", "abcd","fedcbabcd"});

        boolean flag = false;

        for(int i = 0; i < expected.length; i++)
        {
            if(expected[i].equalsIgnoreCase(real[i]))
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        }

        Assert.assertEquals(true, flag);
    }
}
