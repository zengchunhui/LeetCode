package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean check(int num) {
        boolean isDiving = true;
        String container = String.valueOf(num);
        if (container.contains("0")) {
            return false;
        }
        for (int i = 0; i < container.length(); i++) {
            if(num%(container.charAt(i)-'0') != 0){
                isDiving=false;
                break;
            }
        }
        return isDiving;
    }
}
