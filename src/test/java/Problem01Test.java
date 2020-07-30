import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Problem01Test
{    
    Problem01 problem01 = new Problem01();

    @Test
    public  void sieveOfEratosthenesTest()
    {
        //given 
        int n = 10;

        //when
        ArrayList < Integer > expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        ArrayList < Integer >  actual = problem01.sieveOfEratosthenes(n);
        //then
        assertEquals(expected, actual);
        
    }

    @Test
    public  void sieveOfEratosthenesTes2()
    {
        //given 
        int n = 20;

        //when
        ArrayList < Integer > expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        ArrayList < Integer >  actual = problem01.sieveOfEratosthenes(n);

        //then
        assertEquals(expected, actual);        
    }
}
