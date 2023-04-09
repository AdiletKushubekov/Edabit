package edabit_test;

import edabit.PronouncingTheXs;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test19PronouncingTheXs {
    @Test
    public void test1() {
        assertEquals("Inside the bocks was a zylophone",
                PronouncingTheXs.xPronounce("Inside the box was a xylophone"));
        assertEquals("The ecks ray is eckscellent",
                PronouncingTheXs.xPronounce("The x ray is excellent"));
        assertEquals("OMG ecks bocks unbocksing video ecks D",
                PronouncingTheXs.xPronounce("OMG x box unboxing video x D"));
        assertEquals("I gotta make bucks but the clocks are ticking!",
                PronouncingTheXs.xPronounce("I gotta make bux but the clox are ticking!"));
        assertEquals("this test does not have an ecks in it",
                PronouncingTheXs.xPronounce("this test does not have an x in it"));
        assertEquals("Macks backs packs", PronouncingTheXs.xPronounce("Max bax pax"));
        assertEquals("Anti vacks", PronouncingTheXs.xPronounce("Anti vax"));
        assertEquals("Who is zavier and why does he have my car",
                PronouncingTheXs.xPronounce("Who is xavier and why does he have my car"));
        assertEquals("OMG zylem unbocksing video ecks D",
                PronouncingTheXs.xPronounce("OMG xylem unboxing video x D"));
    }
}
