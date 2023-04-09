package edabit;

public class BalancedWords {
    public static boolean balanced(String word) {
        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        int sumL = 0;
        int sumR = 0;
        String left = word.substring(0, word.length()/2);
        String right;
        if (word.length() % 2 != 0){
            right = word.substring((word.length()/2)+1);
        } else {
            right = word.substring((word.length()/2));
        }
        for (int i = 0; i < left.length(); i++){
            for (int j = 0; j < alphabet.length(); j++){
                if (left.charAt(i) == alphabet.charAt(j)){
                    sumL += j;
                }
            }
        }
        for (int i = 0; i < right.length(); i++){
            for (int j = 0; j < alphabet.length(); j++){
                if (right.charAt(i) == alphabet.charAt(j)){
                    sumR += j;
                }
            }
        }
        return sumL == sumR;
    }
}
