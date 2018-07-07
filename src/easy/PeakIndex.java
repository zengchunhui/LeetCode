package easy;

/**
 * Let's call an array A a mountain if the following properties hold:
 * <p>
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 *
 * <p>
 * Input: [0,1,0]
 * Output: 1
 * </p>
 *
 * <p>
 * Input: [0,2,1,0]
 * Output: 1
 * </p>
 */
public class PeakIndex {

    public int peakIndexInMountainArray(int[] A) {
//        int index = 0;
//        while (A[index] < A[index+1] && index < A.length - 2) index++;
//        return index;
        int low = 0;
        int high = A.length-1;
        while (low<high){
            int mid = (low+high)/2;
            if (A[mid] < A[mid+1]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return low;
    }


}
