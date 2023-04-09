package edabit;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountTheNumOfDupChar {
    public static int duplicateCount(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++){
            for (int j = 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j) && j != i){
                    set.add(str.charAt(i));
                }
            }
        }
        return set.size();
    }
}
