import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Problem02Test {

    @Test
    public void problem02Test(){
        Problem02 problem02 = new Problem02();

        String expected = " 2   7   6\n" +
                "  9   5   1\n" +
                "  4   3   8\n";
        String actual = problem02.makeSquare(3);

        Assert.assertEquals(expected, actual);
    }

}
