package powerpackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class powertest {
    @Test
    public void testOneRaisedToOneIsOne() {
        assertEquals(1, powerfinder.calculatePower(1, 1));
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {
        assertEquals(2, powerfinder.calculatePower(2, 1));
    }

    @Test
    public void testTwoPowerTwoIsFour() {
        assertEquals(4, powerfinder.calculatePower(2, 2));
    }

    @Test
    public void testThreeSquaredIsNine() {
        assertEquals(9, powerfinder.calculatePower(3, 2));
    }
}