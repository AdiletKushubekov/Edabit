package edabit;

public class PhoneNumberWordDecoder {
    public static String textToNum(String phone) {
        phone = phone.replaceAll("[ABC]","2");
        phone = phone.replaceAll("[DEF]","3");
        phone = phone.replaceAll("[GHI]","4");
        phone = phone.replaceAll("[JKL]","5");
        phone = phone.replaceAll("[MNO]","6");
        phone = phone.replaceAll("[PQRS]","7");
        phone = phone.replaceAll("[TUV]","8");
        phone = phone.replaceAll("[WXYZ]","9");
        return phone;
    }
}
