package edabit;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedCharacters {
    public static String unrepeated(String str) {
        Set<String> set = new LinkedHashSet<>();
        String result = "";
        for (int i = 0; i < str.length(); i++){
            set.add(str.substring(i, i+1));
        }
        for (String str1 : set){
            result += str1;
        }
        return result;
    }
}
