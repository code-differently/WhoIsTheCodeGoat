import org.junit.Assert;
import org.junit.Test;

public class Problem03Test 
{
    @Test
    public void dataParseTest()
    {
        //Given 
        Problem03 problem03 = new Problem03();
        String input = "Hello World 1234 !!!";
        //When 
        String expected = "helloworld";
        String actual = problem03.dataParse(input);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findAllSubstringsTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        String input = "abcd"; 
        //When 
        String expected = "a\nab\nabc\nabcd\nb\nbc\nbcd\nc\ncd\nd";
        String actual = problem03.findallStrings(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findStringsofalengthTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        String input = "abcc";
        Integer k = 2;
        //When 
        String expected = "ab bc cc";
        String actual = problem03.findStringsofalength(input, k);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void uniquedistinctCharactersTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        String input = "ca"; 
        //When
        Boolean actual = problem03.uniquedistinctCharacters(input);
        Boolean expected= true; 
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findDistinctCharacterInputTest()
    {
        //Given
        Problem03 problem03 = new Problem03();
        String input = "abcc";
        Integer k = 2;
        //When 
        Integer expected = 2; 
        Integer actual = problem03.findDistinctCharacterInput(input, k);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findDistinctCharacterInputTest2()
    {
        //Given
        Problem03 problem03 = new Problem03();
        String input = "aabab";
        Integer k = 3;
        //When
        Integer expected =0; 
        Integer actual = problem03.findDistinctCharacterInput(input, k);
        //Then 
        Assert.assertEquals(expected, actual);
    }

}
