package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 字符串分割
 * @author: zengchunhui
 * @create: 2018-07-11 18:17
 * <p>
 * A string S of lowercase letters is given.
 * We want to partition this string into as many parts as possible so that each letter appears in at most one part,
 * and return a list of integers representing the size of these parts.
 * <p>
 * Input: S = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 * <p>
 * S will have length in range [1, 500].
 * S will consist of lowercase letters ('a' to 'z') only.
 **/
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        int length = S.length();
        while (index < length) {
            int maxIndex = index;
            int tempIndex = index;
            while (tempIndex <= maxIndex) {
                int lastIndex = S.lastIndexOf(S.charAt(tempIndex));
                // 改进：用数组记录每个字母最后的位置
                if(maxIndex<lastIndex){
                    maxIndex=lastIndex;
                }
                tempIndex++;
            }
            result.add(tempIndex-index);
            index = tempIndex;
        }
        return result;
    }
}
