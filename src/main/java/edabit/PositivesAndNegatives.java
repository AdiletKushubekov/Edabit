package edabit;

public class PositivesAndNegatives {
    public static boolean alternateSign(int[] arr) {
        if (arr[0] == 0){
            return false;
        }
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] >= 0 && arr[i+1] >= 0){
                return false;
            }
            if (arr[i] <= 0 && arr[i+1] <= 0){
                return false;
            }
        }
        return true;
    }
}
