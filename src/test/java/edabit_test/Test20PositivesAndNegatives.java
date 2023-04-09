package edabit_test;

import edabit.PositivesAndNegatives;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test20PositivesAndNegatives {
    @Test
    public void test1() {
        assertEquals(true, PositivesAndNegatives.alternateSign(new int[]{3, -2, 5, -5, 2, -8}));
        assertEquals(true, PositivesAndNegatives.alternateSign(new int[]{-6, 1, -1, 4, -3}));
        assertEquals(false, PositivesAndNegatives.alternateSign(new int[]{4, 4, -2, 3, -6, 10}));
        assertEquals(false, PositivesAndNegatives.alternateSign(new int[]{34, 49, 33, 17, -47}));
        assertEquals(true, PositivesAndNegatives.alternateSign(new int[]{22}));
        assertEquals(false, PositivesAndNegatives.alternateSign(new int[]{3, -7, 15, 18}));
        assertEquals(true, PositivesAndNegatives.alternateSign(new int[]{40}));
        assertEquals(false, PositivesAndNegatives.alternateSign(new int[]{40, 27, -44, -13, -31}));
        assertEquals(false, PositivesAndNegatives.alternateSign(new int[]{40, 50, -7, 45, -7}));
    }
}
