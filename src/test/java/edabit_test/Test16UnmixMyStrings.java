package edabit_test;

import edabit.UnmixMyStrings;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test16UnmixMyStrings {
    @Test
    public void test1() {
        assertEquals("214365", UnmixMyStrings.unmix("123456"));
        assertEquals("This is a mixed up string.", UnmixMyStrings.unmix("hTsii  s aimex dpus rtni.g"));
        assertEquals("abcde", UnmixMyStrings.unmix("badce"));
        assertEquals("I am feeling a little dizzy!", UnmixMyStrings.unmix(" Imaf eeilgna l tilt eidzz!y"));

        System.out.println("Should work with empty strings as well.");
        assertEquals("", UnmixMyStrings.unmix(""));
    }
}
