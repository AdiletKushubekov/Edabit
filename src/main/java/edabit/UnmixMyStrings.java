package edabit;

public class UnmixMyStrings {
    public static String unmix(String str) {
        String result = "";
        for (int i = 0; i < str.length()-1; i++){
            result = result + str.charAt(i+1) + str.charAt(i);
            i++;
        }
        if (str.length() % 2 != 0){
            result += str.charAt((str.length()-1));
        }
        return result;
    }
}
