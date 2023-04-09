package edabit_test;

import edabit.CountTheNumOfDupChar;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test18CountTheNumOfDupChar {
    @Test
    public void test1() {
        assertEquals(0, CountTheNumOfDupChar.duplicateCount("abcde"));
        System.out.println("Duplicate characters are case sensitive.");
        assertEquals(0, CountTheNumOfDupChar.duplicateCount("Aa"));
        assertEquals(2, CountTheNumOfDupChar.duplicateCount("aabbcde"));
        assertEquals(2, CountTheNumOfDupChar.duplicateCount("aabbcdeB"));
        assertEquals(1, CountTheNumOfDupChar.duplicateCount("indivisibility"));
        assertEquals(2, CountTheNumOfDupChar.duplicateCount("Indivisibilities"));
        assertEquals(2, CountTheNumOfDupChar.duplicateCount("aa1112"));
        assertEquals(1, CountTheNumOfDupChar.duplicateCount("bb2c"));
    }
}
