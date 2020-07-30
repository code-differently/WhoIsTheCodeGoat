import org.junit.Test;
import org.junit.Assert;

public class Problem05Test {

    @Test
    public void input01Test(){
        //Given
        Problem05 prob5 = new Problem05();
        String[] words = {"ab", "bb", "hefg", "dhck", "dkhc"};
        String[] expected = {"ba", "no answer" ,"hegf", "dhkc", "hcdk"};

        //When
        String[] actual = prob5.biggerIsGreater(words);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void input02Test(){
        //Given
        Problem05 prob5 = new Problem05();
        String[] input = {"lmno", "dcba", "dcbb", "abdc", "abcd", "fedcbabcd"};
        String[] expected = {"lmon", "no answer", "no answer", "acbd", "abdc", "fedcbabdc"};

        //When
        String[] actual = prob5.biggerIsGreater(input);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
