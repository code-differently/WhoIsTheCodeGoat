import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {
    Problem02 p2;
    @Before
    public void initialize(){
        p2 = new Problem02();
    }
    @Test
    public void magicSquareTest(){
        String exp = "Magic Square of size 3\n-----------------------\n6 8 1\n2 4 9\n7 3 5\nSum in each row & each column = 15";
        String act = p2.magicSquare(3);

        Assert.assertEquals(exp, act);
    }
    @Test
    public void magicSquareTest2(){
        String exp = "Magic Square of size 5\n-----------------------\n15 17 24 1 8\n9 11 18 25 2\n3 10 12 19 21\n22 4 6 13 20\n16 23 5 7 14\nSum in each row & each column = 65";
        String act = p2.magicSquare(5);

        Assert.assertEquals(exp, act);
    }
    @Test
    public void magicSquareTest3(){
        String exp = "Magic Square of size 7\n-----------------------\n28 30 39 48 1 10 19\n20 22 31 40 49 2 11\n12 21 23 32 41 43 3\n4 13 15 24 33 42 44\n45 5 14 16 25 34 36\n37 46 6 8 17 26 35\n29 38 47 7 9 18 27\nSum in each row & each column = 175";
        String act = p2.magicSquare(7);

        Assert.assertEquals(exp, act);
    }

    @Test
    public void getSquareTest(){
        int arr[] = {2,7,6,9,5,1,4,3,8};

        String exp = "2 7 6\n9 5 1\n4 3 8\n";
        String act = p2.getSquare(arr, 3);

        Assert.assertEquals(exp, act);
    }

    @Test
    public void fillSquareTest(){
        int arr[] = {2,7,6,9,5,1,4,3,8};

        String exp = "6 8 1\n2 4 9\n7 3 5\n";
        String act = p2.fillSquare(3);

        Assert.assertEquals(exp, act);
    }


}
