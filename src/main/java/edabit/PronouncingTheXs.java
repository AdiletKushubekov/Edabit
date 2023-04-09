package edabit;

public class PronouncingTheXs {
    public static String xPronounce(String sentence) {
        sentence = sentence.replaceAll("\\bx\\b", "ecks");
        sentence = sentence.replaceAll("\\bx", "z");
        sentence = sentence.replaceAll("x", "cks");
        return sentence;
    }
}
