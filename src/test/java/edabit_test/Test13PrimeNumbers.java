package edabit_test;
import edabit.PrimeNumbers;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Test13PrimeNumbers {
    @Test
    public void test1() {
        assertEquals(8, PrimeNumbers.primeNumbers(20));
        assertEquals(10, PrimeNumbers.primeNumbers(30));
        assertEquals(25, PrimeNumbers.primeNumbers(100));
        assertEquals(46, PrimeNumbers.primeNumbers(200));
        assertEquals(168, PrimeNumbers.primeNumbers(1000));
        assertEquals(0, PrimeNumbers.primeNumbers(-5));
        assertEquals(18, PrimeNumbers.primeNumbers(66));
        assertEquals(32, PrimeNumbers.primeNumbers(133));
        assertEquals(25, PrimeNumbers.primeNumbers(99));
    }
}
