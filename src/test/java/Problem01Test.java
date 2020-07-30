import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem01Test 
{
    Problem01 pb1;
   @Before
   public void initialize()
   {
    pb1 = new Problem01();
   }

   @Test
   public void primeTest1()
   {
       String expected = "2 3 5 7";
       String actual = pb1.sieveOfEra(10);
       assertEquals(expected,actual);
   }

   @Test
   public void primeTest2()
   {
    String expected = "2 3 5 7 11 13 17 19";
    String actual = pb1.sieveOfEra(20);
    assertEquals(expected,actual);
   }
}
