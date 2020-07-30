import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class Problem05Test {

    @Test
    public void formWordTest(){
        // Given
        String[] test={"H","e","y"};
        String expected="Hey";

        // When
        String actual=Problem05.formWord(test);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void formWordTest2(){
        // Given
        String[] test={"H","e","y"," ","I","t"," ","W","o","r","k","e","d"};
        String expected="Hey It Worked";

        // When
        String actual=Problem05.formWord(test);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void orderedPermuationsTest(){
        // Given
        String expected="abc";
        TreeSet<String> ordered=new TreeSet<String>();
        ordered.add("abc");
        ordered.add("bac");
        ordered.add("bac");
        ordered.add("abc");
        ordered.add("acb");
        ordered.add("cba");
        ordered.add("cab");
        ordered.add("acb");
        ordered.add("abc");


        // When
        TreeSet<String> actual=Problem05.getOrderedPermutions(expected);

        // Then
        Assert.assertEquals(ordered,actual);
    }

    @Test
    public void formGreaterWordTest(){
        // Given
        String[] test={"dcba","dcbb"};
        String[] expected={"no answer","no answer"};

        // When
        String[] actual=Problem05.formGreaterWord(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void formGreaterWordTest2(){
        // Given
        String[] test={"dkhc","dcba","dcbb"};
        String[] expected={"hcdk","no answer","no answer"};

        // When
        String[] actual=Problem05.formGreaterWord(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void formGreaterWordTest3(){
        // Given
        String[] test={
            "lmno",
            "dcba",
            "dcbb",
            "abdc",
            "abcd",
            "fedcbabcd"};
        String[] expected={
            "lmon",
            "no answer",
            "no answer",
            "acbd",
            "abdc",
            "fedcbabdc"};

        // When
        String[] actual=Problem05.formGreaterWord(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void formGreaterWordTest4(){
        // Given
        String[] test={"ab","bb","hefg","dhck","dkhc"};

        String[] expected={"ba", "no answer" ,"hegf", "dhkc", "hcdk"};
            ;

        // When
        String[] actual=Problem05.formGreaterWord(test);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }
}
