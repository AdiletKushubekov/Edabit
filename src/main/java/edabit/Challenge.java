package edabit;

public class Challenge {
    public static String reverseOdd(String str) {
        String result = "";
        String cut = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++){
            arr[i].trim();
            if (arr[i].length() % 2 != 0){
                for (int j = 0; j < arr[i].length(); j++){
                    cut = arr[i].charAt(j) + cut;
                }
                arr[i] = cut;
                cut = "";
                result += arr[i] + " ";
            } else {
                result += arr[i] + " ";
            }
        }
        return result.trim();
    }
}
