package edabit_test;

import edabit.RemoveRepeatedCharacters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test14RemoveRepeatedCharacters {
    @Test
    public void test01() {
        assertEquals("helo", RemoveRepeatedCharacters.unrepeated("hello"));
        assertEquals("WE!", RemoveRepeatedCharacters.unrepeated("WWEE!!!"));
        assertEquals("cal 91", RemoveRepeatedCharacters.unrepeated("call 911"));
        assertEquals("a", RemoveRepeatedCharacters.unrepeated("aaaaaa"));
        assertEquals("alwf tes", RemoveRepeatedCharacters.unrepeated("alwaff test"));
        assertEquals("tesha", RemoveRepeatedCharacters.unrepeated("teshahset"));
        assertEquals("porcuine", RemoveRepeatedCharacters.unrepeated("porcupine"));
        assertEquals("alter go", RemoveRepeatedCharacters.unrepeated("alter ego"));
        assertEquals("rejuvnat", RemoveRepeatedCharacters.unrepeated("rejuvenate"));
        assertEquals("strau nimb", RemoveRepeatedCharacters.unrepeated("stratus nimbus"));
        assertEquals("strageiz", RemoveRepeatedCharacters.unrepeated("stragegize"));
    }
}
