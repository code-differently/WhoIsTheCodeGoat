import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class Problem01Test
{
    @Test
    public void testSieve()
    {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);

        Assert.assertEquals(expected.size(), new Problem01().sieve(20).size());
    }

    @Test
    public void testSieve2()
    {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);

        Assert.assertEquals(expected.size(), new Problem01().sieve(10).size());
    }

}
