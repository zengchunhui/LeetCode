package easy;

/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int lo = 0;
        int hi = len - 1;
        int mid = (hi + lo) / 2;
        if (target <= nums[lo]) {
            return lo;
        }
        if (target >nums[hi]) {
            return len;
        }
        if(target==nums[hi]){
            return hi;
        }
        while (lo < hi) {
            if (nums[mid] > target) {
                if (nums[mid - 1] < target) {
                    return mid;
                } else {
                    hi = mid;
                    mid = (hi + lo) / 2;
                }
            } else if (nums[mid] < target) {
                if (nums[mid + 1] > target) {
                    return mid + 1;
                }else {
                    lo = mid;
                    mid = (hi+lo)/2;
                }
            } else {
                return mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        SearchInsertPosition position = new SearchInsertPosition();
        int[] nums = {1, 3};
        int target = 2;
        System.out.print(position.searchInsert(nums, target));

    }
}
