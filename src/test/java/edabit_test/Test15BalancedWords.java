package edabit_test;

import edabit.BalancedWords;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test15BalancedWords {
    @Test
    public void test1() {
        assertEquals(false, BalancedWords.balanced("at"));
        assertEquals(false, BalancedWords.balanced("forgetful"));
        assertEquals(true, BalancedWords.balanced("vegetation"));
        assertEquals(false, BalancedWords.balanced("disillusioned"));
        assertEquals(true, BalancedWords.balanced("abstract"));
        assertEquals(false, BalancedWords.balanced("clever"));
        assertEquals(true, BalancedWords.balanced("seasoning"));
        assertEquals(false, BalancedWords.balanced("measure"));
        assertEquals(true, BalancedWords.balanced("conditionalities"));
        assertEquals(false, BalancedWords.balanced("uptight"));
    }
}
