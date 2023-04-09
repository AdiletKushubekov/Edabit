package edabit_test;

import edabit.PhoneNumberWordDecoder;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test17PhoneNumberWordDecoder {
    @Test
    public void test1() {
        assertEquals("123-647-3937", PhoneNumberWordDecoder.textToNum("123-647-EYES"));
        assertEquals("(325)444-8378", PhoneNumberWordDecoder.textToNum("(325)444-TEST"));
        assertEquals("653-879-8447", PhoneNumberWordDecoder.textToNum("653-TRY-THIS"));
        assertEquals("435-224-7613", PhoneNumberWordDecoder.textToNum("435-224-7613"));
        assertEquals("(333)668-3245", PhoneNumberWordDecoder.textToNum("(33D)ONT-FAIL"));
        assertEquals("(025)445-6741", PhoneNumberWordDecoder.textToNum("(025)445-6741"));
    }
}
