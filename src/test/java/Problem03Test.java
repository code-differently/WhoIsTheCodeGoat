import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    @Test
    public void findAllStringsTest01() {
        String given = "a0bc!-@de!1fg";

        String expected = "abcdefg";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAllStringsTest02(){
        //Given
        String given = "ABC123defg";

        //When
        String expected = "abcdefg";
        String actual = Problem03.parseString(given);

        //Then
        Assert.assertEquals(expected, actual);
    }

    public void getSubstringsTest(){

    }

    @Test
    public void addToWordDict(){
        //generating dictionary
        ArrayList<String> words = new ArrayList<>();
        words.add("Hams");
        words.add("Cans");
        words.add("Runs");
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        map.put(4, words);

    
        //when
        String str = "Look";
        Problem03.addToWordDict(map, str);

        ArrayList<String> elements = map.get(4); //get method needs the key, list of words with corresponding length
        int actual = elements.size();
        int expected = 4; //arrliay was three, adding "Look" should increase arraylist

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseStringTest01() {
        String given = "ABC";
        String expected = "abc";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseStringTest02() {
        String given = "AbC";
        String expected = "abc";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeUnwanted_ASCII() {
        String given = "a0bce!-";
        String expected = "abce";
        String actual = Problem03.parseString(given);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicateCharsTest() {

        String given = "aabc";
        String expected = "abc";
        String actual = Problem03.removeDuplicateChars(given);

        Assert.assertEquals(expected, actual);
    }

}
