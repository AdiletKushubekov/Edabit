package edabit_test;
import static org.testng.Assert.assertEquals;
import edabit.HarshadNumber;
import org.testng.annotations.Test;

public class Test11HarshadNumber {
    private int[] numVector = new int[] {75, 171, 481, 89, 516, 200, 209, 12345, 53, 27};
    private boolean[] resVector = new boolean[] {false, true, true, false, true, true, true, true, false, true};

    @Test
    public void test01() {
        assertEquals(HarshadNumber.isHarshad(numVector[0]), resVector[0]);
        assertEquals(HarshadNumber.isHarshad(numVector[1]), resVector[1]);
        assertEquals(HarshadNumber.isHarshad(numVector[2]), resVector[2]);
        assertEquals(HarshadNumber.isHarshad(numVector[3]), resVector[3]);
        assertEquals(HarshadNumber.isHarshad(numVector[4]), resVector[4]);
        assertEquals(HarshadNumber.isHarshad(numVector[5]), resVector[5]);
        assertEquals(HarshadNumber.isHarshad(numVector[6]), resVector[6]);
        assertEquals(HarshadNumber.isHarshad(numVector[7]), resVector[7]);
        assertEquals(HarshadNumber.isHarshad(numVector[8]), resVector[8]);
        assertEquals(HarshadNumber.isHarshad(numVector[9]), resVector[9]);
    }
}