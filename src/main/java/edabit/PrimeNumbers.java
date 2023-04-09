package edabit;

public class PrimeNumbers {
    public static int primeNumbers(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++){
            if (primeNum(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean primeNum(int num){
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                if (i != 1 && i != num){
                    return false;
                }
            }
        }
        return true;
    }
}
