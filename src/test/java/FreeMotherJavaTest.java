import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FreeMotherJavaTest {

    private FreeMotherJava freeMotherJava;

    @Before
    public void setUp() throws Exception {
        //Arrange
        freeMotherJava = new FreeMotherJava();
    }

    @Test
    public void biggestTwoDigitNumber() {
        //Act
        int result = freeMotherJava.biggestDifferentDigitNumber(2);
        //Assert
        assertThat(result, is(98));
    }

    @Test
    public void biggestThreeDigitNumber() {
        //Act
        int result = freeMotherJava.biggestDifferentDigitNumber(3);

        //Assert
        assertThat(result, is(987));

    }

    @Test
    public void biggestFourDigitNumber() throws Exception {
        int result = freeMotherJava.biggestDifferentDigitNumber(4);
        assertThat(result, is(9876));
    }

    @Test
    public void biggestSingleDigitNumber() throws Exception {
        int result = freeMotherJava.biggestDifferentDigitNumber(1);
        assertThat(result, is(9));
    }

    @Test
    public void biggestFiveDigitNumber() throws Exception {
        int result = freeMotherJava.biggestDifferentDigitNumber(5);
        assertThat(result, is(98765));
    }

    @Test
    public void rightToLeft12() throws Exception {
        int result = freeMotherJava.rightToLeft(12);
        assertThat(result, is(21));
    }

    @Test
    public void rightToLeft65() throws Exception {
        int result = freeMotherJava.rightToLeft(65);
        assertThat(result, is(56));
    }

    @Test
    public void rightToLeft987654() throws Exception {
        int result = freeMotherJava.rightToLeft(987654);
        assertThat(result, is(456789));
    }

    @Test
    public void isSquareNumber() throws Exception {
        boolean result = freeMotherJava.isSquareNumber(4);
        assertThat(result, is(true));
    }
}
