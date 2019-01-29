package easy;


public class PalindromeInteger {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int y = x;
        long result = 0;
        int div = 10;
        while (y > 0) {
            result = result * 10 + (y % div);
            y = y / div;
        }

        if (result == x) {
            return true;
        } else {
            return false;
        }
    }
}
