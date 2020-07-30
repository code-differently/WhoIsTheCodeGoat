import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem02Test {

    Problem02 prob2;

    @Before
    public void initialize() {
        prob2 = new Problem02();
    }

    @Test
    public void threeTest() {
        //Given
        String expected = "Magic Square of size 3\n" + "----------\n" + "8  3  4  \n" + "1  5  9  \n"
                + "6  7  2  \n" + "Sum in each row & each column=3*(3^2+1)/2= 15";

        //When
        String actual = prob2.magicSquare(3);

        //Then
        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void fiveTest() {
        //Given
        String expected = "Magic Square of size 5\n" + "----------\n" + "17  23  4  10  11  \n" + "24  5  6  12  18  \n"
                + "1  7  13  19  25  \n" + "8  14  20  21  2  \n" + "15  16  22  3  9  \n" + 
                "Sum in each row & each column=5*(5^2+1)/2= 65";

        //When
        String actual = prob2.magicSquare(5);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sevenTest() {
        //Given
        String expected = "Magic Square of size 7\n" + "----------\n" + 
        "30  38  46  5  13  21  22  \n" + "39  47  6  14  15  23  31  \n"
                + "48  7  8  16  24  32  40  \n" + "1  9  17  25  33  41  49  \n" + 
                "10  18  26  34  42  43  2  \n" + "19  27  35  36  44  3  11  \n" + 
                "28  29  37  45  4  12  20  \n" + "Sum in each row & each column=7*(7^2+1)/2= 175";

        //When
        String actual = prob2.magicSquare(7);

        //Then
        Assert.assertEquals(expected, actual);  

    }

}
