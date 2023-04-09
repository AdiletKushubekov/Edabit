package edabit;

public class HarshadNumber {

    public static boolean isHarshad(int n) {
        int temp = n;
        int sum = 0;
        return check(temp, n, sum);
    }
    private static boolean check(int temp, int n, int sum) {
        if (temp == 0) {
            return n % sum == 0;
        }
        sum = sum + temp % 10;
        return check(temp / 10, n, sum);
    }
}
