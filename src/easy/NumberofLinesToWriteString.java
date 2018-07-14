package easy;

/**
 * We are to write the letters of a given string S, from left to right into lines.
 * Each line has maximum width 100 units,
 * and if writing a letter would cause the width of the line to exceed 100 units,
 * it is written on the next line. We are given an array widths,
 * an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.
 * <p>
 * Now answer two questions: how many lines have at least one character from S,
 * and what is the width used by the last such line? Return your answer as an integer list of length 2.
 * <p>
 * Example :
 * Input:
 * widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
 * S = "abcdefghijklmnopqrstuvwxyz"
 * Output: [3, 60]
 * Explanation:
 * All letters have the same length of 10. To write all 26 letters,
 * we need two full lines and one line with 60 units.
 * <p>
 * Note:
 * The length of S will be in the range [1, 1000].
 * S will only contain lowercase letters.
 * widths is an array of length 26.
 * widths[i] will be in the range of [2, 10].
 */
public class NumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        if (S.length() == 0) {
            result[0] = 1;
            result[1] = widths[S.charAt(0) - 'a'];
            return result;
        }

        int lines = 0;
        int lastnum = 0;
        for (int i = 0; i < S.length(); i++) {
            int width = widths[S.charAt(i) - 'a'];
            if (lastnum + width > 100) {
                lines++;
                lastnum = width;
            } else {
                lastnum += width;
            }
        }
        result[0] = lines;
        result[1] = lastnum;
        return result;
    }
}
