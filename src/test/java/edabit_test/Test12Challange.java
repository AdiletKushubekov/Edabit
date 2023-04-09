package edabit_test;

import edabit.Challenge;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test12Challange {
        @Test
        public void test1() {
            assertEquals("enO owt eerht four", Challenge.reverseOdd("One two three four"));
            assertEquals("Make sure you only reverse words of odd length",
                    Challenge.reverseOdd("Make sure uoy only esrever sdrow of ddo length"));

            System.out.println("Should work with empty string.");
            assertEquals("", Challenge.reverseOdd(""));

            System.out.println("Should work with only one word.");
            assertEquals("sananaB", Challenge.reverseOdd("Bananas"));

            assertEquals("Even even even even", Challenge.reverseOdd("Even even even even"));
            assertEquals("ddO ddo ddo ddo ddo", Challenge.reverseOdd("Odd odd odd odd odd"));
        }
    }
